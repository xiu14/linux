package com.ss.android.socialbase.downloader.file;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadDirUtils;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import e.a.a.a.a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class DownloadFileUtils {
    private static SparseArray<MediaItem> MEDIA_STORE_DATA = null;
    public static final String MODE_READ = "r";
    public static final String MODE_WRITE = "w";

    static class MediaItem {
        public String columnId;
        public Uri contentUri;
        public String contentUriString;

        MediaItem() {
        }

        static MediaItem build(Uri uri, String str) {
            MediaItem mediaItem = new MediaItem();
            mediaItem.contentUri = uri;
            mediaItem.contentUriString = uri.toString();
            mediaItem.columnId = str;
            return mediaItem;
        }
    }

    static {
        try {
            MEDIA_STORE_DATA = new SparseArray<>();
            if (isAtLeastAndroidQ()) {
                MEDIA_STORE_DATA.put(2, MediaItem.build(MediaStore.Images.Media.getContentUri("external_primary"), DBDefinition.ID));
                MEDIA_STORE_DATA.put(3, MediaItem.build(MediaStore.Video.Media.getContentUri("external_primary"), DBDefinition.ID));
                MEDIA_STORE_DATA.put(4, MediaItem.build(MediaStore.Audio.Media.getContentUri("external_primary"), DBDefinition.ID));
                MEDIA_STORE_DATA.put(5, MediaItem.build(MediaStore.Downloads.EXTERNAL_CONTENT_URI, DBDefinition.ID));
            } else {
                MEDIA_STORE_DATA.put(2, MediaItem.build(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, DBDefinition.ID));
                MEDIA_STORE_DATA.put(3, MediaItem.build(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, DBDefinition.ID));
                MEDIA_STORE_DATA.put(4, MediaItem.build(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, DBDefinition.ID));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void checkUri(Uri uri, int i) throws Throwable {
        MediaItem mediaItem = MEDIA_STORE_DATA.get(i);
        if (mediaItem == null) {
            throw new Throwable(a.j("Fail to check Uri, type error :", i));
        }
        String J2 = a.J(new StringBuilder(), mediaItem.columnId, " = ?");
        String[] strArr = {uri.getLastPathSegment()};
        Cursor cursor = null;
        try {
            Uri uri2 = mediaItem.contentUri;
            if (Build.VERSION.SDK_INT >= 29) {
                uri2 = MediaStore.setIncludePending(uri2);
            }
            cursor = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().query(uri2, null, J2, strArr, null);
            if (cursor == null || !cursor.moveToFirst()) {
                throw new Throwable("Fail to check Uri with cursor.");
            }
            DownloadUtils.safeClose(cursor);
        } catch (Throwable th) {
            DownloadUtils.safeClose(cursor);
            throw th;
        }
    }

    public static boolean checkUriInsert(String str) {
        try {
            checkUri(Uri.parse(str), getTypeByUri(str));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @RequiresApi(api = 29)
    public static ContentValues createContentValues(String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("relative_path", str);
        contentValues.put("_display_name", str2);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(str3)) {
            contentValues.put("mime_type", str3);
        }
        return contentValues;
    }

    @RequiresApi(api = 29)
    public static Uri createUriAtLeastQ(Uri uri, String str, String str2, String str3) {
        Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext == null) {
            return null;
        }
        return appContext.getContentResolver().insert(uri, createContentValues(str, str2, str3));
    }

    public static void deleteUri(Uri uri) throws Throwable {
        ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().delete(uri, null, null);
    }

    public static boolean emptyFile(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.write(new byte[0]);
            fileOutputStream.close();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static boolean exists(Uri uri) {
        return getLength(uri) > 0;
    }

    public static boolean existsAndNotEmpty(DownloadFile downloadFile) {
        return downloadFile.exists() && downloadFile.length() > 0;
    }

    public static String getContentUriString(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("content")) {
            return null;
        }
        for (int i = 0; i < MEDIA_STORE_DATA.size(); i++) {
            MediaItem mediaItem = MEDIA_STORE_DATA.get(MEDIA_STORE_DATA.keyAt(i));
            if (str.startsWith(mediaItem.contentUriString)) {
                return mediaItem.contentUriString;
            }
        }
        return null;
    }

    public static FileDescriptor getFileDescriptor(Uri uri, String str) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = getParcelFileDescriptor(uri, str);
        if (parcelFileDescriptor != null) {
            return parcelFileDescriptor.getFileDescriptor();
        }
        throw new IOException("Fail to get FileDescriptor, ParcelFileDescriptor is null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getFilePathFromUri(Uri uri) {
        String[] strArr = {"_data"};
        String str = null;
        try {
            Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
            if (appContext == null) {
                DownloadUtils.safeClose(null);
                return null;
            }
            Cursor query = appContext.getContentResolver().query(uri, strArr, null, null, null);
            if (query != 0) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex(strArr[0]));
                    }
                } catch (Throwable th) {
                    th = th;
                    str = query;
                    DownloadUtils.safeClose(str);
                    throw th;
                }
            }
            DownloadUtils.safeClose(query);
            return str;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long getLength(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            parcelFileDescriptor = getParcelFileDescriptor(uri, MODE_READ);
            long statSize = parcelFileDescriptor.getStatSize();
            DownloadUtils.safeClose(parcelFileDescriptor);
            return statSize;
        } catch (Throwable unused) {
            DownloadUtils.safeClose(parcelFileDescriptor);
            return -1L;
        }
    }

    public static ParcelFileDescriptor getParcelFileDescriptor(Uri uri, String str) throws IOException {
        if (uri == null) {
            throw new IOException("Fail to get ParcelFileDescriptor, uri is null");
        }
        try {
            ParcelFileDescriptor openFileDescriptor = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().openFileDescriptor(uri, str);
            if (openFileDescriptor != null) {
                return openFileDescriptor;
            }
            throw new IOException("Fail to get ParcelFileDescriptor, fileDescriptor is null");
        } catch (Exception e2) {
            e2.printStackTrace();
            throw new IOException("Fail to get ParcelFileDescriptor", e2);
        }
    }

    public static Pair<String, String> getParentAndNameFromRelativePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        return new Pair<>(file.getParent(), file.getName());
    }

    public static Pair<String, String> getParentAndNameFromUri(Uri uri) {
        return getParentAndNameFromRelativePath(getFilePathFromUri(uri));
    }

    public static int getTypeByUri(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (!str.startsWith("content")) {
            return 1;
        }
        for (int i = 0; i < MEDIA_STORE_DATA.size(); i++) {
            int keyAt = MEDIA_STORE_DATA.keyAt(i);
            if (str.startsWith(MEDIA_STORE_DATA.get(keyAt).contentUriString)) {
                return keyAt;
            }
        }
        return -1;
    }

    @RequiresApi(api = 29)
    public static Uri getUriAtLeastQ(Uri uri, String str, String str2, String str3) {
        Uri queryUriAtLeastQ = queryUriAtLeastQ(uri, str, str2, str3);
        return queryUriAtLeastQ == null ? createUriAtLeastQ(uri, str, str2, str3) : queryUriAtLeastQ;
    }

    public static Uri getUriFromFilePath(String str) {
        Uri rootContentUri = DownloadDirUtils.getRootContentUri();
        Cursor cursor = null;
        try {
            Cursor query = Build.VERSION.SDK_INT >= 29 ? ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().query(MediaStore.setIncludePending(rootContentUri), new String[]{DBDefinition.ID}, "_data=? ", new String[]{str}, null) : null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        Uri withAppendedId = ContentUris.withAppendedId(rootContentUri, query.getInt(query.getColumnIndex(DBDefinition.ID)));
                        DownloadUtils.safeClose(query);
                        return withAppendedId;
                    }
                } catch (Throwable th) {
                    cursor = query;
                    th = th;
                    DownloadUtils.safeClose(cursor);
                    throw th;
                }
            }
            DownloadUtils.safeClose(query);
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean isAtLeastAndroidQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isFilePathInExternalPublicDir(String str) {
        Context appContext;
        if (isMediaUri(str)) {
            return true;
        }
        if (!str.startsWith(Environment.getExternalStorageDirectory().getPath()) || (appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext()) == null) {
            return false;
        }
        String parent = appContext.getExternalCacheDir().getParent();
        return (parent == null || !str.startsWith(parent)) && !str.startsWith(appContext.getObbDir().getAbsolutePath()) && DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.UNCHECK_EXTERNAL_PUBLIC_DIR, 0) <= 0;
    }

    public static boolean isMediaUri(String str) {
        return getTypeByUri(str) > 1;
    }

    public static boolean isScopedStorage() {
        Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext == null) {
            return false;
        }
        int i = appContext.getApplicationInfo().targetSdkVersion;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        return (i == 29 && !Environment.isExternalStorageLegacy()) || i > 29;
    }

    @RequiresApi(api = 29)
    public static Uri queryUriAtLeastQ(Uri uri, String str, String str2, String str3) {
        Cursor cursor = null;
        if (uri == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.endsWith("/")) {
            str = a.s(str, "/");
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("relative_path = ? AND _display_name = ?");
            sb.append(TextUtils.isEmpty(str3) ? "" : " AND mime_type = ?");
            String sb2 = sb.toString();
            String[] strArr = TextUtils.isEmpty(str3) ? new String[]{str, str2} : new String[]{str, str2, str3};
            Bundle bundle = new Bundle();
            bundle.putString("android:query-arg-sql-selection", sb2);
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
            bundle.putString("android:query-arg-sql-sort-order", "_id DESC");
            if (Build.VERSION.SDK_INT > 30) {
                bundle.putInt("android:query-arg-match-pending", 1);
            }
            Cursor query = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().query(MediaStore.setIncludePending(uri), new String[]{DBDefinition.ID}, bundle, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        Uri withAppendedId = ContentUris.withAppendedId(uri, query.getLong(query.getColumnIndexOrThrow(DBDefinition.ID)));
                        DownloadUtils.safeClose(query);
                        return withAppendedId;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = query;
                    DownloadUtils.safeClose(cursor);
                    throw th;
                }
            }
            DownloadUtils.safeClose(query);
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
