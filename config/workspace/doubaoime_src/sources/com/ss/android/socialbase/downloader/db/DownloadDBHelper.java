package com.ss.android.socialbase.downloader.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import e.a.a.a.a;
import java.io.File;

/* loaded from: classes2.dex */
public class DownloadDBHelper extends SQLiteOpenHelper {
    private static volatile DownloadDBHelper instance;
    private final String TAG;
    private boolean tempDirSetted;

    private DownloadDBHelper() {
        super(DownloadComponentManager.getAppContext(), DBDefinition.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 18);
        this.TAG = "DownloadDBHelper";
        this.tempDirSetted = false;
    }

    public static DownloadDBHelper getInstance() {
        if (instance == null) {
            synchronized (DownloadDBHelper.class) {
                if (instance == null) {
                    instance = new DownloadDBHelper();
                }
            }
        }
        return instance;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        Context appContext = DownloadComponentManager.getAppContext();
        if (this.tempDirSetted || appContext == null) {
            return super.getReadableDatabase();
        }
        try {
            File file = new File("/data/data/" + appContext.getPackageName() + "/database/main/");
            if (!file.exists()) {
                file.mkdir();
            }
            super.getReadableDatabase().execSQL("PRAGMA temp_store_directory = tempDir");
            this.tempDirSetted = true;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return super.getReadableDatabase();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        super.onConfigure(sQLiteDatabase);
        if (Build.VERSION.SDK_INT == 28) {
            sQLiteDatabase.disableWriteAheadLogging();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DBDefinition.CREATE_DOWNLOAD_TABLE);
        sQLiteDatabase.execSQL(DBDefinition.CREATE_SEGMENT_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (Logger.debug()) {
            Logger.globalDebug("DownloadDBHelper", "onDowngrade", a.l("OldVersion: ", i, " newVersion: ", i2));
        }
        if (DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.SUPPORT_SQLITE_DOWNGRADE) > 0) {
            try {
                sQLiteDatabase.execSQL(DBDefinition.DROP_DOWNLOAD_TABLE);
                sQLiteDatabase.execSQL(DBDefinition.DROP_SEGMENT_TABLE);
            } catch (Throwable th) {
                th.printStackTrace();
                Logger.globalError("DownloadDBHelper", "onDowngrade", "Error: " + th);
            }
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (Logger.debug()) {
            Logger.globalDebug("DownloadDBHelper", "onUpgrade", a.l("OldVersion: ", i, " newVersion: ", i2));
        }
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD mimeType TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD title TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationEnable INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD notificationVisibility INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstDownload INTEGER");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD isFirstSuccess INTEGER");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD needHttpsToHttpRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadTime INTEGER");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD packageName TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD md5 TEXT");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelay INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD curRetryTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayStatus INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD defaultHttpServiceBackUp INTEGER");
            case 7:
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkRunnableReuse INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryDelayTimeArray TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD chunkDowngradeRetry INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD backUpUrlRetryCount INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD realDownloadTime INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD retryScheduleMinutes INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD independentProcess INTEGER");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD auxiliaryJsonobjectString TEXT");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD iconUrl TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD appVersionCode INTEGER");
            case 13:
                sQLiteDatabase.execSQL(DBDefinition.CREATE_SEGMENT_TABLE);
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD taskId TEXT");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadStartTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD downloadFinishTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD installedTimeStamp INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD hasDoInstallation INTEGER");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD cacheLifeTimeMax INTEGER");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD pcdnUrlsStr TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE downloader ADD cdnUrlsStr TEXT");
                break;
        }
    }
}
