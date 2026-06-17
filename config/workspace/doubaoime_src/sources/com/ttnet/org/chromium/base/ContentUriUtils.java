package com.ttnet.org.chromium.base;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ContentUriUtils {
    private static final Object a = new Object();

    private ContentUriUtils() {
    }

    private static AssetFileDescriptor a(String str) {
        ContentResolver contentResolver = c.b().getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (d(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException unused) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, DownloadFileUtils.MODE_READ);
                if (openFileDescriptor != null) {
                    return new AssetFileDescriptor(openFileDescriptor, 0L, -1L);
                }
            }
        } catch (Exception e2) {
            d.f("ContentUriUtils", "Cannot open content uri: %s", str, e2);
        }
        return null;
    }

    public static String b(Uri uri, Context context, String str) {
        String[] streamTypes;
        String extensionFromMimeType;
        if (uri == null) {
            return "";
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Cursor query = contentResolver.query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        int columnIndex = query.getColumnIndex(str);
                        if (columnIndex == -1) {
                            query.close();
                            return "";
                        }
                        String string = query.getString(columnIndex);
                        if (c(query) && (streamTypes = contentResolver.getStreamTypes(uri, "*/*")) != null && streamTypes.length > 0 && (extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(streamTypes[0])) != null) {
                            string = string + "." + extensionFromMimeType;
                        }
                        query.close();
                        return string;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (NullPointerException unused) {
        }
        return "";
    }

    private static boolean c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("flags");
        return columnIndex > -1 && (cursor.getLong(columnIndex) & 512) != 0;
    }

    @CalledByNative
    public static boolean contentUriExists(String str) {
        AssetFileDescriptor a2 = a(str);
        boolean z = a2 != null;
        if (a2 != null) {
            try {
                a2.close();
            } catch (IOException unused) {
            }
        }
        return z;
    }

    private static boolean d(Uri uri) {
        if (uri == null || !DocumentsContract.isDocumentUri(c.b(), uri)) {
            return false;
        }
        try {
            Cursor query = c.b().getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() >= 1) {
                        query.moveToFirst();
                        boolean c2 = c(query);
                        query.close();
                        return c2;
                    }
                } finally {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    @CalledByNative
    public static boolean delete(String str) {
        return c.b().getContentResolver().delete(Uri.parse(str), null, null) > 0;
    }

    @CalledByNative
    public static String getContentUriFromFilePath(String str) {
        try {
            new File(str);
            synchronized (a) {
            }
            return null;
        } catch (IllegalArgumentException e2) {
            d.a("ContentUriUtils", "Cannot retrieve content uri from file: %s", str, e2);
            return null;
        }
    }

    @CalledByNative
    public static String getMimeType(String str) {
        ContentResolver contentResolver = c.b().getContentResolver();
        Uri parse = Uri.parse(str);
        if (!d(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        if (streamTypes == null || streamTypes.length <= 0) {
            return null;
        }
        return streamTypes[0];
    }

    @Nullable
    @CalledByNative
    public static String maybeGetDisplayName(String str) {
        try {
            String b = b(Uri.parse(str), c.b(), "_display_name");
            if (TextUtils.isEmpty(b)) {
                return null;
            }
            return b;
        } catch (Exception e2) {
            d.f("ContentUriUtils", "Cannot open content uri: %s", str, e2);
            return null;
        }
    }

    @CalledByNative
    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a2 = a(str);
        if (a2 != null) {
            return a2.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }
}
