package com.ss.android.socialbase.downloader.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.service.DownloadServiceManager;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import java.io.File;

/* loaded from: classes2.dex */
public class DownloadDirUtils {
    public static String EXT_PUBLIC_DIR = "ByteDownload";
    private static final String TAG = "DownloadDirUtils";

    public static String getDefaultDataPath() {
        Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext != null) {
            return appContext.getFilesDir().getAbsolutePath();
        }
        return null;
    }

    public static String getDefaultExtPrivatePath() {
        try {
            Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
            if (appContext != null) {
                return appContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getDefaultExtPublicPath() {
        try {
            return Environment.getExternalStorageDirectory().getPath() + File.separator + DownloadSetting.obtainGlobal().optString(DownloadSettingKeys.DEFAULT_SAVE_DIR_NAME, EXT_PUBLIC_DIR);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getDownloadPath() {
        return getValidDownloadPath(Downloader.getInstance(((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveDir());
    }

    public static String getDownloadTempPath() {
        return getValidDownloadPath(Downloader.getInstance(((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveTempDir());
    }

    public static String getExtPublicDownloadPath() {
        try {
            return Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getGlobalSavePath() {
        try {
            File globalSaveDir = Downloader.getInstance(((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext()).getGlobalSaveDir();
            if (globalSaveDir != null) {
                return globalSaveDir.getAbsolutePath();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Uri getRootContentUri() {
        return MediaStore.Files.getContentUri("external");
    }

    public static String getValidDownloadPath(File file) {
        Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
        if (isValidDirectory(file)) {
            return file.getAbsolutePath();
        }
        if (appContext == null) {
            Logger.globalError(TAG, "getValidDownloadPath", "Context is null");
            return null;
        }
        File externalFilesDir = appContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        return isValidDirectory(externalFilesDir) ? externalFilesDir.getAbsolutePath() : getDefaultDataPath();
    }

    public static boolean isSavePathSecurity(String str) {
        Context appContext = ((IDownloadComponentManagerService) DownloadServiceManager.getService(IDownloadComponentManagerService.class)).getAppContext();
        if (appContext != null && !TextUtils.isEmpty(str)) {
            try {
                if (str.startsWith(Environment.getDataDirectory().getAbsolutePath())) {
                    return true;
                }
                File externalCacheDir = appContext.getExternalCacheDir();
                if (externalCacheDir != null) {
                    if (str.startsWith(externalCacheDir.getParent())) {
                        return true;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    public static boolean isValidDirectory(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.exists() || file.mkdirs()) {
                return file.isDirectory();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
