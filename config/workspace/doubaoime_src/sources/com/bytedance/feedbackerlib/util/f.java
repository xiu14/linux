package com.bytedance.feedbackerlib.util;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.Feedbacker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class f {
    private static MediaPlayer a = new MediaPlayer();
    public static final /* synthetic */ int b = 0;

    private static ContentValues a(@NonNull File file, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("title", file.getName());
        contentValues.put("_display_name", file.getName());
        contentValues.put("date_modified", Long.valueOf(j));
        contentValues.put("date_added", Long.valueOf(j));
        contentValues.put("_size", Long.valueOf(file.length()));
        return contentValues;
    }

    public static String b(@NonNull Uri uri) {
        Cursor query;
        ContentResolver contentResolver = Feedbacker.getApplicationContext().getContentResolver();
        if (contentResolver == null || (query = contentResolver.query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        if (!query.moveToFirst()) {
            query.close();
            return null;
        }
        String string = query.getString(query.getColumnIndex("_data"));
        query.close();
        return string;
    }

    public static synchronized long c(Context context, Uri uri) {
        synchronized (f.class) {
            if (context != null) {
                if (g(uri)) {
                    try {
                        a.reset();
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            a.setDataSource(context, uri);
                            a.prepare();
                            return a.getDuration();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                            try {
                                a.reset();
                            } catch (Throwable unused2) {
                            }
                            return -1L;
                        }
                    } finally {
                        try {
                            a.reset();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
            return -1L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.BufferedOutputStream, java.io.Closeable] */
    @RequiresApi(api = 16)
    public static Uri d(@NonNull Context context, @NonNull File file, long j, int i, int i2) {
        ?? r8;
        IOException e2;
        BufferedInputStream bufferedInputStream;
        if (!file.exists()) {
            return null;
        }
        ContentValues a2 = a(file, j);
        a2.put("width", Integer.valueOf(i));
        a2.put("height", Integer.valueOf(i2));
        a2.put("mime_type", "image/jpeg");
        ?? r9 = Build.VERSION.SDK_INT;
        if (r9 >= 29) {
            a2.put("datetaken", Long.valueOf(j));
            a2.put("orientation", (Integer) 0);
            r8 = "Pictures/";
            a2.put("relative_path", "Pictures/");
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, a2);
        try {
            if (insert == null) {
                return null;
            }
            try {
                OutputStream openOutputStream = contentResolver.openOutputStream(insert);
                if (openOutputStream == null) {
                    contentResolver.delete(insert, null, null);
                    com.bytedance.feedbackerlib.a.s("MediaUtils", "insertImageToMediaStore failed: contentResolver.openOutputStream failed", null);
                    com.bytedance.feedbackerlib.a.D0(null);
                    com.bytedance.feedbackerlib.a.D0(null);
                    if (!file.delete()) {
                        com.bytedance.feedbackerlib.a.s("MediaUtils", "delete image file failed", null);
                    }
                    return null;
                }
                r9 = new BufferedOutputStream(openOutputStream);
                try {
                    bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = bufferedInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            r9.write(bArr, 0, read);
                        }
                        r9.flush();
                        com.bytedance.feedbackerlib.a.D0(bufferedInputStream);
                        com.bytedance.feedbackerlib.a.D0(r9);
                        if (!file.delete()) {
                            com.bytedance.feedbackerlib.a.s("MediaUtils", "delete image file failed", null);
                        }
                        return insert;
                    } catch (IOException e3) {
                        e2 = e3;
                        contentResolver.delete(insert, null, null);
                        com.bytedance.feedbackerlib.a.s("MediaUtils", "insertImageToMediaStore failed", e2);
                        com.bytedance.feedbackerlib.a.D0(bufferedInputStream);
                        com.bytedance.feedbackerlib.a.D0(r9);
                        if (!file.delete()) {
                            com.bytedance.feedbackerlib.a.s("MediaUtils", "delete image file failed", null);
                        }
                        return null;
                    }
                } catch (IOException e4) {
                    e2 = e4;
                    bufferedInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r8 = 0;
                    com.bytedance.feedbackerlib.a.D0(r8);
                    com.bytedance.feedbackerlib.a.D0(r9);
                    if (!file.delete()) {
                        com.bytedance.feedbackerlib.a.s("MediaUtils", "delete image file failed", null);
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e2 = e5;
                bufferedInputStream = null;
                r9 = 0;
            } catch (Throwable th2) {
                th = th2;
                r8 = 0;
                r9 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [long] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.io.BufferedOutputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.BufferedInputStream, java.io.Closeable] */
    @RequiresApi(api = 16)
    public static Uri e(@NonNull Context context, @NonNull File file, long j, int i, int i2, long j2) {
        Closeable closeable;
        Closeable closeable2 = null;
        r1 = null;
        Uri insert = null;
        if (!file.exists()) {
            return null;
        }
        ContentValues a2 = a(file, j);
        a2.put("mime_type", "video/mp4");
        if (i > 0) {
            a2.put("width", Integer.valueOf(i));
        }
        if (i2 > 0) {
            a2.put("height", Integer.valueOf(i2));
        }
        ?? r9 = "duration";
        a2.put("duration", Long.valueOf((long) j2));
        a2.put("datetaken", Long.valueOf(j));
        if (Build.VERSION.SDK_INT >= 29) {
            a2.put("datetaken", Long.valueOf(j));
            a2.put("duration", Long.valueOf((long) j2));
            a2.put("relative_path", (String) null);
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri insert2 = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, a2);
        try {
            if (insert2 == null) {
                com.bytedance.feedbackerlib.a.s("MediaUtils", "insert video failed: contentResolver.insert failed", null);
                return null;
            }
            try {
                OutputStream openOutputStream = contentResolver.openOutputStream(insert2);
                if (openOutputStream == null) {
                    contentResolver.delete(insert2, null, null);
                    com.bytedance.feedbackerlib.a.s("MediaUtils", "contentResolver.openOutputStream return null", null);
                    com.bytedance.feedbackerlib.a.D0(null);
                    com.bytedance.feedbackerlib.a.D0(null);
                    return null;
                }
                r9 = new BufferedInputStream(new FileInputStream(file));
                try {
                    j2 = new BufferedOutputStream(openOutputStream);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = r9.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            j2.write(bArr, 0, read);
                        }
                        j2.flush();
                        if (!file.delete()) {
                            com.bytedance.feedbackerlib.a.s("MediaUtils", "video file delete failed!", null);
                        }
                        com.bytedance.feedbackerlib.a.D0(r9);
                        com.bytedance.feedbackerlib.a.D0(j2);
                        return insert2;
                    } catch (IOException e2) {
                        e = e2;
                        contentResolver.delete(insert2, null, null);
                        com.bytedance.feedbackerlib.a.s("MediaUtils", "insertVideoToMediaStore failed.", e);
                        if (Build.VERSION.SDK_INT < 29) {
                            a2.put("_data", file.getPath());
                            try {
                                insert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, a2);
                            } catch (Throwable th) {
                                com.bytedance.feedbackerlib.a.s("MediaUtils", "insertVideoToMediaStoreCompat failed", th);
                            }
                        }
                        com.bytedance.feedbackerlib.a.D0(r9);
                        com.bytedance.feedbackerlib.a.D0(j2);
                        return insert;
                    }
                } catch (IOException e3) {
                    e = e3;
                    j2 = 0;
                } catch (Throwable th2) {
                    th = th2;
                    j2 = 0;
                    closeable2 = r9;
                    closeable = j2;
                    com.bytedance.feedbackerlib.a.D0(closeable2);
                    com.bytedance.feedbackerlib.a.D0(closeable);
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
                r9 = 0;
                j2 = 0;
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                com.bytedance.feedbackerlib.a.D0(closeable2);
                com.bytedance.feedbackerlib.a.D0(closeable);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean f(Uri uri) {
        if (uri == null) {
            return false;
        }
        return uri.toString().startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString());
    }

    public static boolean g(Uri uri) {
        if (uri == null) {
            return false;
        }
        return uri.toString().startsWith(MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString());
    }
}
