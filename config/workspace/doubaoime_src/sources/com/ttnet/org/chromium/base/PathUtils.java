package com.ttnet.org.chromium.base;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class PathUtils {
    static {
        new AtomicBoolean();
    }

    private PathUtils() {
    }

    @NonNull
    private static String[] a(@NonNull List<File> list) {
        ArrayList arrayList = new ArrayList();
        for (File file : list) {
            if (file != null && !TextUtils.isEmpty(file.getAbsolutePath())) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @NonNull
    @CalledByNative
    public static String[] getAllPrivateDownloadsDirectories() {
        List arrayList = new ArrayList();
        h h = h.h();
        try {
            File[] externalFilesDirs = c.b().getExternalFilesDirs(Environment.DIRECTORY_DOWNLOADS);
            if (externalFilesDirs != null) {
                arrayList = Arrays.asList(externalFilesDirs);
            }
            h.close();
            return a(arrayList);
        } catch (Throwable th) {
            try {
                h.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @CalledByNative
    public static String getAppExternalCacheDirectory() {
        File externalCacheDir = c.b().getExternalCacheDir();
        return externalCacheDir == null ? "" : externalCacheDir.getAbsolutePath();
    }

    @CalledByNative
    public static String getCacheDirectory() {
        throw null;
    }

    @CalledByNative
    public static String getDataDirectory() {
        throw null;
    }

    @NonNull
    @CalledByNative
    public static String getDownloadsDirectory() {
        h d2 = h.d();
        try {
            if (Build.VERSION.SDK_INT < 29) {
                String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
                d2.close();
                return path;
            }
            String[] allPrivateDownloadsDirectories = getAllPrivateDownloadsDirectories();
            String str = allPrivateDownloadsDirectories.length == 0 ? "" : allPrivateDownloadsDirectories[0];
            d2.close();
            return str;
        } catch (Throwable th) {
            try {
                d2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @NonNull
    @RequiresApi(30)
    @CalledByNative
    public static String[] getExternalDownloadVolumesNames() {
        ArrayList arrayList = new ArrayList();
        for (String str : MediaStore.getExternalVolumeNames(c.b())) {
            if (!TextUtils.isEmpty(str) && !str.contains("external_primary")) {
                File directory = ((StorageManager) c.b().getSystemService(StorageManager.class)).getStorageVolume(MediaStore.Files.getContentUri(str)).getDirectory();
                File file = new File(directory, Environment.DIRECTORY_DOWNLOADS);
                if (!file.isDirectory()) {
                    d.f("PathUtils", "Download dir missing: %s, parent dir:%s, isDirectory:%s", file.getAbsolutePath(), directory.getAbsolutePath(), Boolean.valueOf(directory.isDirectory()));
                }
                arrayList.add(file);
            }
        }
        return a(arrayList);
    }

    @CalledByNative
    public static String getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    @CalledByNative
    private static String getNativeLibraryDirectory() {
        ApplicationInfo applicationInfo = c.b().getApplicationInfo();
        int i = applicationInfo.flags;
        return ((i & 128) != 0 || (i & 1) == 0) ? applicationInfo.nativeLibraryDir : "/system/lib/";
    }

    @CalledByNative
    public static String getThumbnailCacheDirectory() {
        throw null;
    }
}
