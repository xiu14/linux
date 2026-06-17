package com.xiaomi.push.service.logupload;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.io.File;

/* loaded from: classes2.dex */
public class LogUploadFileProvider extends ContentProvider {
    public static Uri a(Context context, File file) {
        if (context == null || file == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", "Invalid context or file when upload log: " + file);
        }
        if (file == null || !file.exists()) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", "File does not exist: " + file);
            return null;
        }
        Uri build = new Uri.Builder().scheme("content").authority(e.a.a.a.a.s(context != null ? context.getPackageName() : null, ".push.fileprovider")).appendPath(file.getName()).build();
        com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", "Generated URI: " + build + " for file: " + file);
        return build;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return "application/zip";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        if (TextUtils.isEmpty(str) || uri == null) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", "Invalid URI or mode when upload log: " + uri + ", mode: " + str);
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (TextUtils.isEmpty(lastPathSegment)) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", "File name is empty in URI when upload log: " + uri);
            return null;
        }
        File file = new File(new File(getContext().getCacheDir(), "push_log_upload"), lastPathSegment);
        if (!file.exists()) {
            com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", "File not found when upload log: " + file);
            return null;
        }
        if (a(file)) {
            return ParcelFileDescriptor.open(file, a(str));
        }
        StringBuilder M = e.a.a.a.a.M("File is not under cache dir when upload log:");
        M.append(file.getPath());
        com.xiaomi.channel.commonutils.logger.c.m16a("LogUploadFileProvider", M.toString());
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private boolean a(File file) {
        try {
            File cacheDir = getContext().getCacheDir();
            if (cacheDir == null) {
                return false;
            }
            return file.getCanonicalFile().getPath().startsWith(cacheDir.getCanonicalFile().getPath());
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Failed to check file path: ");
            M.append(e2.getMessage());
            com.xiaomi.channel.commonutils.logger.c.c("LogUploadFileProvider", M.toString());
            return false;
        }
    }

    private static int a(String str) {
        if (DownloadFileUtils.MODE_READ.equals(str)) {
            return 268435456;
        }
        throw new IllegalArgumentException(e.a.a.a.a.s("Only read mode is supported, got: ", str));
    }
}
