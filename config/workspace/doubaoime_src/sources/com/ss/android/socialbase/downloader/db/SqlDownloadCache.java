package com.ss.android.socialbase.downloader.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.downloader.IDownloadLaunchHandler;
import com.ss.android.socialbase.downloader.downloader.ISqlDownloadCache;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.monitor.DownloadMonitorHelper;
import com.ss.android.socialbase.downloader.segment.Segment;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ss.android.socialbase.downloader.utils.DownloadUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class SqlDownloadCache extends ISqlDownloadCacheAidl.Stub implements ISqlDownloadCache {
    public static final int DOWNLOAD_CACHE_LRU_CAPACITY_DEFAULT = 300;
    public static final int DOWNLOAD_CACHE_LRU_CAPACITY_MIN = 100;
    private static final String TAG = "SqlDownloadCache";
    private static volatile SQLiteDatabase database;
    private volatile boolean cacheSynced;
    ISqlCacheLoadCompleteCallbackAidl callback;
    private TableStatements downloadTableStatements;
    private boolean isCheckCacheEnable;
    private TableStatements segmentTableStatements;
    private int singleLoadCountLimit;
    private long singleLoadSleepTimeMs;
    public static final int DOWNLOAD_CACHE_LRU_CAPACITY_MAX = getLRUCapacityMax();
    public static volatile HashMap<String, Integer> lruHotCacheKeysMap = null;
    private static final int mainThreadDbOPMaxTime = getMainThreadDbOPMaxTime();

    private interface Fallback<T> {
        T getDefaultValue();
    }

    public SqlDownloadCache() {
        this(false);
    }

    private void addDownloadInfo(final DownloadInfo downloadInfo) {
        DownloadComponentManager.submitDBTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.13
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCache.this.ensureDataBaseInit();
                if (SqlDownloadCache.database == null || SqlDownloadCache.this.downloadTableStatements == null) {
                    return;
                }
                try {
                    SqlDownloadCache sqlDownloadCache = SqlDownloadCache.this;
                    sqlDownloadCache.insertDownloadInfoInner(downloadInfo, sqlDownloadCache.downloadTableStatements.getInsertStatement());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    private void callbackDownloadInfo(boolean z, List<DownloadInfo> list, List<Integer> list2, SparseArray<DownloadInfo> sparseArray, SparseArray<DownloadInfo> sparseArray2, HashMap<Integer, Integer> hashMap, List<DownloadInfo> list3, SqlCacheLoadCompleteCallback sqlCacheLoadCompleteCallback, boolean z2) {
        clearAntiHijackDirIfNeeded(list);
        loadCacheFromDB(list, list2, sparseArray, sparseArray2, z2);
        if (sqlCacheLoadCompleteCallback != null) {
            sqlCacheLoadCompleteCallback.callback(z);
        }
        onInitFinish(sparseArray2, hashMap, list3, z);
        sparseArray.clear();
        list2.clear();
        list.clear();
        sparseArray2.clear();
        if (z) {
            return;
        }
        try {
            if (Logger.debug()) {
                Logger.globalDebug(TAG, "newInit", "Sleep:" + this.singleLoadSleepTimeMs);
            }
            Thread.sleep(this.singleLoadSleepTimeMs);
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.globalError(TAG, "newInit", "Sleep:" + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkAndReportToMonitor(DownloadInfo downloadInfo) {
        int statusAtDbInit;
        if (downloadInfo != null && (statusAtDbInit = downloadInfo.getStatusAtDbInit()) >= 1 && statusAtDbInit <= 11) {
            DownloadMonitorHelper.monitorSendWithGlobalSdkMonitor(DownloadComponentManager.getDownloadMonitorListener(), downloadInfo, null, -5);
        }
    }

    public static boolean checkCacheLifeTimeAndRemove(DownloadInfo downloadInfo) {
        if (downloadInfo == null || downloadInfo.getCacheLifeTimeMax() <= 0 || downloadInfo.getDownloadStartTimeStamp() <= 0) {
            return false;
        }
        if ((downloadInfo.getCacheLifeTimeMax() * 1000) + downloadInfo.getDownloadStartTimeStamp() >= System.currentTimeMillis()) {
            return false;
        }
        DownloadUtils.deleteAllDownloadFiles(downloadInfo, true);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAntiHijackDirIfNeeded(List<DownloadInfo> list) {
        if (list == null) {
            return;
        }
        try {
            for (DownloadInfo downloadInfo : list) {
                if (downloadInfo != null && downloadInfo.isSavePathRedirected()) {
                    DownloadUtils.clearAntiHijackDir(downloadInfo);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void clearDataInSubThread() {
        try {
            safeBeginTransaction();
            database.delete(DBDefinition.DOWNLOAD_TABLE_NAME, null, null);
            database.setTransactionSuccessful();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteChunkTable() {
        if (database == null) {
            return;
        }
        try {
            database.execSQL(DBDefinition.DROP_CHUNK_TABLE);
        } catch (Throwable th) {
            th.printStackTrace();
            Logger.globalError(TAG, "deleteChunkTable", "Error:" + th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteInner(int i, SQLiteStatement sQLiteStatement) {
        if (sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                sQLiteStatement.bindLong(1, i);
                sQLiteStatement.execute();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ensureDataBaseInit() {
        if (database == null) {
            synchronized (SqlDownloadCache.class) {
                if (database == null) {
                    try {
                        database = DownloadDBHelper.getInstance().getWritableDatabase();
                        this.downloadTableStatements = new TableStatements(database, DBDefinition.DOWNLOAD_TABLE_NAME, DBDefinition.DOWNLOAD_ALL_COLUMNS, DBDefinition.DOWNLOAD_PK_COLUMNS);
                        this.segmentTableStatements = new TableStatements(database, DBDefinition.SEGMENT_TABLE_NAME, DBDefinition.SEGMENT_ALL_COLUMNS, DBDefinition.SEGMENT_PK_COLUMNS);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DownloadInfo> getAllDownloadInfoImpl() {
        ensureDataBaseInit();
        ArrayList arrayList = new ArrayList();
        if (database != null) {
            Cursor cursor = null;
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s", DBDefinition.DOWNLOAD_TABLE_NAME), null);
                while (cursor.moveToNext()) {
                    arrayList.add(DownloadHelper.parseDownloadInfo(cursor));
                }
                DownloadUtils.safeClose(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th2) {
                    DownloadUtils.safeClose(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DownloadInfo getDownloadInfoImpl(int i) {
        Cursor cursor;
        ensureDataBaseInit();
        if (database != null) {
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", DBDefinition.DOWNLOAD_TABLE_NAME, DBDefinition.ID), new String[]{Integer.toString(i)});
                try {
                    if (cursor.moveToNext()) {
                        DownloadInfo parseDownloadInfo = DownloadHelper.parseDownloadInfo(cursor);
                        DownloadUtils.safeClose(cursor);
                        return parseDownloadInfo;
                    }
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        DownloadUtils.safeClose(cursor);
                        return null;
                    } catch (Throwable th2) {
                        DownloadUtils.safeClose(cursor);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DownloadInfo> getDownloadInfoListImpl(String str) {
        ensureDataBaseInit();
        ArrayList arrayList = new ArrayList();
        if (database != null) {
            Cursor cursor = null;
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", DBDefinition.DOWNLOAD_TABLE_NAME, "url"), new String[]{str});
                while (cursor.moveToNext()) {
                    arrayList.add(DownloadHelper.parseDownloadInfo(cursor));
                }
                DownloadUtils.safeClose(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th2) {
                    DownloadUtils.safeClose(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DownloadInfo> getDownloadInfosByFileExtensionImpl(String str) {
        ensureDataBaseInit();
        ArrayList arrayList = new ArrayList();
        if (database != null) {
            Cursor cursor = null;
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s LIKE ?", DBDefinition.DOWNLOAD_TABLE_NAME, "name"), new String[]{"%" + str});
                while (cursor.moveToNext()) {
                    arrayList.add(DownloadHelper.parseDownloadInfo(cursor));
                }
                DownloadUtils.safeClose(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th2) {
                    DownloadUtils.safeClose(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getHotCacheKeys() {
        if (lruHotCacheKeysMap != null) {
            return;
        }
        lruHotCacheKeysMap = DownloadHelper.jsonObjectToHashMap(DownloadSetting.getGlobalSettings().optJSONObject(DownloadSettingKeys.KEY_HOT_CACHE_KEYS));
    }

    private static int getLRUCapacityMax() {
        int optInt = DownloadSetting.getGlobalSettings().optInt(DownloadSettingKeys.KEY_LRU_CAPACITY_MAX, 300);
        if (optInt >= 100) {
            return optInt;
        }
        return 300;
    }

    private static int getMainThreadDbOPMaxTime() {
        return DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.MAIN_THREAD_DB_OP_MAX_TIME_MS);
    }

    private List<String> getMimeTypes() {
        IDownloadLaunchHandler downloadLaunchHandler = DownloadComponentManager.getDownloadLaunchHandler();
        if (downloadLaunchHandler != null) {
            return downloadLaunchHandler.getResumeMimeTypes();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeTypeImpl(String str) {
        ensureDataBaseInit();
        ArrayList arrayList = new ArrayList();
        if (database != null) {
            Cursor cursor = null;
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ? AND %s = ?", DBDefinition.DOWNLOAD_TABLE_NAME, DBDefinition.MIME_TYPE, "status"), new String[]{str, String.valueOf(-3)});
                while (cursor.moveToNext()) {
                    arrayList.add(DownloadHelper.parseDownloadInfo(cursor));
                }
                DownloadUtils.safeClose(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th2) {
                    DownloadUtils.safeClose(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeTypeImpl(String str) {
        ensureDataBaseInit();
        ArrayList arrayList = new ArrayList();
        if (database != null) {
            Cursor cursor = null;
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ? AND %s IN (?,?,?,?,?)", DBDefinition.DOWNLOAD_TABLE_NAME, DBDefinition.MIME_TYPE, "status"), new String[]{str, String.valueOf(-1), String.valueOf(-2), String.valueOf(-7), String.valueOf(-4), String.valueOf(-5)});
                while (cursor.moveToNext()) {
                    arrayList.add(DownloadHelper.parseDownloadInfo(cursor));
                }
                DownloadUtils.safeClose(cursor);
            } catch (Throwable th) {
                try {
                    th.printStackTrace();
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th2) {
                    DownloadUtils.safeClose(cursor);
                    throw th2;
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void insertDownloadInfoInner(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.executeInsert();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isHoldDownloadInfo(String str) {
        if (lruHotCacheKeysMap != null && !lruHotCacheKeysMap.isEmpty() && str != null) {
            Iterator<Map.Entry<String, Integer>> it2 = lruHotCacheKeysMap.entrySet().iterator();
            while (it2.hasNext()) {
                String key = it2.next().getKey();
                if (key != null && str.indexOf(key) != -1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadCacheFromDB(List<DownloadInfo> list, List<Integer> list2, SparseArray<DownloadInfo> sparseArray, SparseArray<DownloadInfo> sparseArray2, boolean z) {
        int size = sparseArray.size();
        if (size < 0 || database == null) {
            return;
        }
        synchronized (database) {
            try {
                try {
                    safeBeginTransaction();
                    if (!list.isEmpty()) {
                        String[] strArr = new String[list.size()];
                        for (int i = 0; i < list.size(); i++) {
                            strArr[i] = String.valueOf(list.get(i).getId());
                        }
                        database.delete(DBDefinition.DOWNLOAD_TABLE_NAME, "CAST(_id AS TEXT) IN (" + new String(new char[list.size() - 1]).replace("\u0000", "?,") + "?)", strArr);
                    }
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = sparseArray.keyAt(i2);
                        DownloadInfo downloadInfo = sparseArray.get(keyAt);
                        database.delete(DBDefinition.DOWNLOAD_TABLE_NAME, "_id = ?", new String[]{String.valueOf(keyAt)});
                        database.insert(DBDefinition.DOWNLOAD_TABLE_NAME, null, DownloadHelper.toContentValues(downloadInfo));
                    }
                    database.setTransactionSuccessful();
                } finally {
                    try {
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02d9, code lost:
    
        if (r0 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x032a, code lost:
    
        if (r0 != null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x032c, code lost:
    
        r0.onInitFinish(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x032f, code lost:
    
        r33.start();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0332, code lost:
    
        return;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116 A[Catch: all -> 0x02dc, TryCatch #5 {all -> 0x02dc, blocks: (B:13:0x004d, B:15:0x0058, B:17:0x0062, B:19:0x0068, B:20:0x0079, B:21:0x0081, B:26:0x008f, B:168:0x0095, B:32:0x00af, B:34:0x00b4, B:39:0x00c7, B:42:0x00da, B:45:0x00e6, B:47:0x00ee, B:50:0x0110, B:52:0x0116, B:53:0x011a, B:157:0x00f8, B:159:0x00ff, B:161:0x0105, B:163:0x010b), top: B:12:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[Catch: all -> 0x016e, TryCatch #7 {all -> 0x016e, blocks: (B:55:0x0122, B:57:0x012c, B:59:0x0132, B:62:0x0147, B:65:0x0153, B:95:0x017e, B:97:0x018a, B:98:0x01ac, B:100:0x01b4, B:103:0x01c0, B:105:0x01c5, B:107:0x01cb, B:109:0x01d5, B:113:0x01e9, B:116:0x01f0, B:118:0x01f5, B:120:0x01f9, B:122:0x0203, B:127:0x0216, B:149:0x0194, B:151:0x01a6), top: B:54:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0153 A[Catch: all -> 0x016e, TryCatch #7 {all -> 0x016e, blocks: (B:55:0x0122, B:57:0x012c, B:59:0x0132, B:62:0x0147, B:65:0x0153, B:95:0x017e, B:97:0x018a, B:98:0x01ac, B:100:0x01b4, B:103:0x01c0, B:105:0x01c5, B:107:0x01cb, B:109:0x01d5, B:113:0x01e9, B:116:0x01f0, B:118:0x01f5, B:120:0x01f9, B:122:0x0203, B:127:0x0216, B:149:0x0194, B:151:0x01a6), top: B:54:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r23v11 */
    /* JADX WARN: Type inference failed for: r23v13 */
    /* JADX WARN: Type inference failed for: r23v15 */
    /* JADX WARN: Type inference failed for: r23v16 */
    /* JADX WARN: Type inference failed for: r23v17 */
    /* JADX WARN: Type inference failed for: r23v18 */
    /* JADX WARN: Type inference failed for: r23v19 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void newBatchInit(com.ss.android.socialbase.downloader.model.DownloadDBInitInfo r27, android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r28, java.util.HashMap<java.lang.Integer, java.lang.Integer> r29, java.util.List<com.ss.android.socialbase.downloader.model.DownloadInfo> r30, java.util.List<java.lang.String> r31, com.ss.android.socialbase.downloader.db.SqlCacheLoadCompleteCallback r32, com.ss.android.socialbase.downloader.cleaner.Cleaner r33) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.db.SqlDownloadCache.newBatchInit(com.ss.android.socialbase.downloader.model.DownloadDBInitInfo, android.util.SparseArray, java.util.HashMap, java.util.List, java.util.List, com.ss.android.socialbase.downloader.db.SqlCacheLoadCompleteCallback, com.ss.android.socialbase.downloader.cleaner.Cleaner):void");
    }

    private <T> T runImpl(Callable<T> callable, Fallback<T> fallback) {
        int i = mainThreadDbOPMaxTime;
        if (i <= 0 || !DownloadUtils.isMainThread()) {
            try {
                return callable.call();
            } catch (Throwable th) {
                th.printStackTrace();
                Logger.globalError(TAG, "runImpl", "Call Error: " + th);
            }
        } else {
            try {
                return DownloadComponentManager.getDBThreadExecutorService().submit(callable).get(i, TimeUnit.MILLISECONDS);
            } catch (Throwable th2) {
                th2.printStackTrace();
                Logger.globalError(TAG, "runImpl", "Get Error: " + th2);
            }
        }
        if (fallback != null) {
            return fallback.getDefaultValue();
        }
        return null;
    }

    private void safeBeginTransaction() {
        database.beginTransaction();
    }

    private void safeEndTransaction() {
        try {
            if (database == null || !database.inTransaction()) {
                return;
            }
            database.endTransaction();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void update(final int i, final ContentValues contentValues) {
        DownloadComponentManager.submitDBTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.18
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCache.this.ensureDataBaseInit();
                if (SqlDownloadCache.database == null) {
                    return;
                }
                SqlDownloadCache.this.updateInner(i, contentValues);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateDownloadInfoForCurrentThread(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return;
        }
        try {
            if (cacheExist(downloadInfo.getId())) {
                TableStatements tableStatements = this.downloadTableStatements;
                if (tableStatements == null) {
                    return;
                }
                try {
                    updateDownloadInfoInner(downloadInfo, tableStatements.getUpdateStatement());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                addDownloadInfo(downloadInfo);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private void updateDownloadInfoInner(DownloadInfo downloadInfo, SQLiteStatement sQLiteStatement) {
        if (downloadInfo == null || sQLiteStatement == null) {
            return;
        }
        try {
            synchronized (sQLiteStatement) {
                downloadInfo.bindValue(sQLiteStatement);
                sQLiteStatement.bindLong(downloadInfo.getBindValueCount() + 1, downloadInfo.getId());
                sQLiteStatement.execute();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateInner(int i, ContentValues contentValues) {
        int i2 = 10;
        while (database.isDbLockedByCurrentThread() && i2 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5L);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
        try {
            database.update(DBDefinition.DOWNLOAD_TABLE_NAME, contentValues, "_id = ? ", new String[]{String.valueOf(i)});
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskCancel(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-4));
        contentValues.put(DBDefinition.CUR_BYTES, Long.valueOf(j));
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskCompleted(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-3));
        contentValues.put(DBDefinition.CUR_BYTES, Long.valueOf(j));
        contentValues.put(DBDefinition.FIRST_DOWNLOAD, (Integer) 0);
        contentValues.put(DBDefinition.FIRST_SUCCESS, (Integer) 0);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskConnected(int i, long j, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 3);
        contentValues.put(DBDefinition.TOTAL_BYTES, Long.valueOf(j));
        contentValues.put(DBDefinition.ETAG, str);
        if (!TextUtils.isEmpty(str2)) {
            contentValues.put("name", str2);
        }
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskError(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-1));
        contentValues.put(DBDefinition.CUR_BYTES, Long.valueOf(j));
        if (j > 0) {
            contentValues.put(DBDefinition.FIRST_DOWNLOAD, (Integer) 0);
        }
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskIntercept(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-7));
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskPause(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) (-2));
        contentValues.put(DBDefinition.CUR_BYTES, Long.valueOf(j));
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskPrepare(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 1);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskProgress(int i, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 4);
        contentValues.put(DBDefinition.CUR_BYTES, Long.valueOf(j));
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo OnDownloadTaskRetry(int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 5);
        contentValues.put(DBDefinition.FIRST_DOWNLOAD, (Integer) 0);
        update(i, contentValues);
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean cacheExist(int i) {
        try {
            return getDownloadInfo(i) != null;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void clearData() {
        DownloadComponentManager.submitDBTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.17
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCache.this.ensureDataBaseInit();
                if (SqlDownloadCache.database == null) {
                    return;
                }
                SqlDownloadCache.this.clearDataInSubThread();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadCache
    public void clearMemoryCacheData(double d2) {
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean ensureDownloadCacheSyncSuccess() {
        return false;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public List<DownloadInfo> getAllDownloadInfo() {
        return (List) runImpl(new Callable<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.11
            @Override // java.util.concurrent.Callable
            public List<DownloadInfo> call() throws Exception {
                return SqlDownloadCache.this.getAllDownloadInfoImpl();
            }
        }, new Fallback<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.12
            @Override // com.ss.android.socialbase.downloader.db.SqlDownloadCache.Fallback
            public List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo getDownloadInfo(final int i) {
        return (DownloadInfo) runImpl(new Callable<DownloadInfo>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public DownloadInfo call() throws Exception {
                return SqlDownloadCache.this.getDownloadInfoImpl(i);
            }
        }, null);
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public List<DownloadInfo> getDownloadInfoList(final String str) {
        return (List) runImpl(new Callable<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.3
            @Override // java.util.concurrent.Callable
            public List<DownloadInfo> call() throws Exception {
                return SqlDownloadCache.this.getDownloadInfoListImpl(str);
            }
        }, new Fallback<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.4
            @Override // com.ss.android.socialbase.downloader.db.SqlDownloadCache.Fallback
            public List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public List<DownloadInfo> getDownloadInfosByFileExtension(final String str) {
        return (List) runImpl(new Callable<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.9
            @Override // java.util.concurrent.Callable
            public List<DownloadInfo> call() throws Exception {
                return SqlDownloadCache.this.getDownloadInfosByFileExtensionImpl(str);
            }
        }, new Fallback<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.10
            @Override // com.ss.android.socialbase.downloader.db.SqlDownloadCache.Fallback
            public List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public List<DownloadInfo> getDownloadInfosByFilters(String str, String str2) {
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadCache
    public Map<Long, Segment> getSegmentMap(int i) {
        Cursor cursor;
        ensureDataBaseInit();
        if (database != null) {
            try {
                cursor = database.rawQuery(String.format("SELECT * FROM %s WHERE %s = ?", DBDefinition.SEGMENT_TABLE_NAME, DBDefinition.ID), new String[]{Integer.toString(i)});
                try {
                    if (cursor.moveToNext()) {
                        int columnIndex = cursor.getColumnIndex(DBDefinition.SEGMENT_INFO);
                        String string = columnIndex >= 0 ? cursor.getString(columnIndex) : null;
                        HashMap hashMap = new HashMap();
                        JSONArray jSONArray = new JSONArray(string);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            Segment segment = new Segment(jSONArray.getJSONObject(i2));
                            hashMap.put(Long.valueOf(segment.getStartOffset()), segment);
                        }
                        DownloadUtils.safeClose(cursor);
                        return hashMap;
                    }
                    DownloadUtils.safeClose(cursor);
                } catch (Throwable th) {
                    th = th;
                    try {
                        th.printStackTrace();
                        DownloadUtils.safeClose(cursor);
                        return null;
                    } catch (Throwable th2) {
                        DownloadUtils.safeClose(cursor);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        }
        return null;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(final String str) {
        return (List) runImpl(new Callable<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.5
            @Override // java.util.concurrent.Callable
            public List<DownloadInfo> call() throws Exception {
                return SqlDownloadCache.this.getSuccessedDownloadInfosWithMimeTypeImpl(str);
            }
        }, new Fallback<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.6
            @Override // com.ss.android.socialbase.downloader.db.SqlDownloadCache.Fallback
            public List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(final String str) {
        return (List) runImpl(new Callable<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.7
            @Override // java.util.concurrent.Callable
            public List<DownloadInfo> call() throws Exception {
                return SqlDownloadCache.this.getUnCompletedDownloadInfosWithMimeTypeImpl(str);
            }
        }, new Fallback<List<DownloadInfo>>() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.8
            @Override // com.ss.android.socialbase.downloader.db.SqlDownloadCache.Fallback
            public List<DownloadInfo> getDefaultValue() {
                return new ArrayList();
            }
        });
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void init(boolean z) {
        if (z) {
            init(new SparseArray<>(), new HashMap<>(), new ArrayList(), getMimeTypes(), null);
        } else {
            init(new SparseArray<>(), null, null, null, null);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadCache
    public void initImmediately() {
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean isDownloadCacheSyncSuccess() {
        return this.cacheSynced;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public DownloadInfo onDownloadTaskStart(int i) {
        return null;
    }

    public void onInitFinish(SparseArray<DownloadInfo> sparseArray, HashMap<Integer, Integer> hashMap, List<DownloadInfo> list, boolean z) {
        try {
            HashMap sparseArrayToHashMap = DownloadHelper.sparseArrayToHashMap(sparseArray);
            Map<Integer, DownloadInfo> listConvertToMap = DownloadHelper.listConvertToMap(list);
            ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl = this.callback;
            if (iSqlCacheLoadCompleteCallbackAidl != null) {
                iSqlCacheLoadCompleteCallbackAidl.callback(sparseArrayToHashMap, hashMap, listConvertToMap, z);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean removeDownloadInfo(final int i) {
        DownloadComponentManager.submitDBTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.15
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCache.this.ensureDataBaseInit();
                if (SqlDownloadCache.database == null || SqlDownloadCache.this.downloadTableStatements == null) {
                    return;
                }
                try {
                    SqlDownloadCache sqlDownloadCache = SqlDownloadCache.this;
                    sqlDownloadCache.deleteInner(i, sqlDownloadCache.downloadTableStatements.getDeleteStatement());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean removeDownloadTaskData(final int i) {
        DownloadComponentManager.submitDBTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.16
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCache.this.removeDownloadInfo(i);
                SqlDownloadCache.this.removeSegments(i);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadCache
    public void removeSegments(int i) {
        ensureDataBaseInit();
        if (database == null) {
            return;
        }
        try {
            deleteInner(i, this.segmentTableStatements.getDeleteStatement());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void resetNewBatchInit() {
        this.singleLoadCountLimit = Integer.MAX_VALUE;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void setInitCallback(ISqlCacheLoadCompleteCallbackAidl iSqlCacheLoadCompleteCallbackAidl) {
        this.callback = iSqlCacheLoadCompleteCallbackAidl;
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void syncDownloadInfo(DownloadInfo downloadInfo) {
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public void syncDownloadInfoFromOtherCache(int i) {
    }

    @Override // com.ss.android.socialbase.downloader.db.ISqlDownloadCacheAidl
    public boolean updateDownloadInfo(final DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        DownloadComponentManager.submitDBTask(new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.14
            @Override // java.lang.Runnable
            public void run() {
                SqlDownloadCache.this.ensureDataBaseInit();
                if (SqlDownloadCache.database == null) {
                    return;
                }
                SqlDownloadCache.this.updateDownloadInfoForCurrentThread(downloadInfo);
            }
        });
        return true;
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadCache
    public boolean updateSegments(int i, Map<Long, Segment> map) {
        ensureDataBaseInit();
        if (database == null) {
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (Map.Entry<Long, Segment> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    jSONArray.put(entry.getValue().toJson());
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        SQLiteStatement insertOrReplaceStatement = this.segmentTableStatements.getInsertOrReplaceStatement();
        if (insertOrReplaceStatement == null) {
            Logger.taskError(TAG, i, "updateSegments", "UpdateSegments statement is null");
            return false;
        }
        synchronized (insertOrReplaceStatement) {
            insertOrReplaceStatement.clearBindings();
            insertOrReplaceStatement.bindLong(1, i);
            insertOrReplaceStatement.bindString(2, jSONArray.toString());
            insertOrReplaceStatement.execute();
        }
        return false;
    }

    public SqlDownloadCache(boolean z) {
        this.isCheckCacheEnable = false;
        this.callback = null;
        if (z) {
            this.cacheSynced = false;
            init(false);
        }
    }

    @Override // com.ss.android.socialbase.downloader.downloader.IDownloadCache
    public ArrayList<Segment> getSegments(int i) {
        Map<Long, Segment> segmentMap = getSegmentMap(i);
        if (segmentMap == null || segmentMap.isEmpty()) {
            return null;
        }
        return new ArrayList<>(segmentMap.values());
    }

    @Override // com.ss.android.socialbase.downloader.downloader.ISqlDownloadCache
    public void init(final SparseArray<DownloadInfo> sparseArray, final HashMap<Integer, Integer> hashMap, final List<DownloadInfo> list, final List<String> list2, final SqlCacheLoadCompleteCallback sqlCacheLoadCompleteCallback) {
        try {
            Runnable runnable = new Runnable() { // from class: com.ss.android.socialbase.downloader.db.SqlDownloadCache.1
                /* JADX WARN: Code restructure failed: missing block: B:142:0x0395, code lost:
                
                    if (r0 == null) goto L166;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:143:0x0397, code lost:
                
                    r0.callback(r2);
                    r22.this$0.cacheSynced = r2;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:144:0x039f, code lost:
                
                    r22.this$0.onInitFinish(r2, r3, r4, r2);
                    r12.start();
                 */
                /* JADX WARN: Code restructure failed: missing block: B:145:0x03ad, code lost:
                
                    return;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:186:0x032e, code lost:
                
                    if (r0 == null) goto L166;
                 */
                /* JADX WARN: Removed duplicated region for block: B:137:0x036d  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x038f  */
                /* JADX WARN: Removed duplicated region for block: B:181:0x0304  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x0328  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00f3 A[Catch: all -> 0x0331, TRY_LEAVE, TryCatch #1 {all -> 0x0331, blocks: (B:24:0x00b8, B:26:0x00bc, B:28:0x00c0, B:30:0x00cb, B:32:0x00d4, B:34:0x00da, B:35:0x00e7, B:36:0x00ed, B:38:0x00f3), top: B:23:0x00b8 }] */
                /* JADX WARN: Removed duplicated region for block: B:78:0x01fb A[Catch: all -> 0x02be, TryCatch #5 {all -> 0x02be, blocks: (B:54:0x0141, B:55:0x014b, B:57:0x0155, B:60:0x0161, B:62:0x0168, B:65:0x018d, B:67:0x0195, B:68:0x0199, B:70:0x01ab, B:72:0x01b1, B:75:0x01ef, B:78:0x01fb, B:84:0x0211, B:86:0x021b, B:87:0x0238, B:89:0x0242, B:90:0x0245, B:92:0x0249, B:94:0x024d, B:96:0x0256, B:98:0x025c, B:100:0x0268, B:104:0x027c, B:107:0x0283, B:109:0x028a, B:111:0x028e, B:113:0x0298, B:114:0x02ad, B:116:0x0222, B:118:0x0232, B:121:0x0174, B:123:0x017b, B:125:0x0183, B:127:0x0189), top: B:53:0x0141 }] */
                /* JADX WARN: Removed duplicated region for block: B:82:0x020d  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        Method dump skipped, instructions count: 1054
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.db.SqlDownloadCache.AnonymousClass1.run():void");
                }
            };
            ExecutorService dBThreadExecutorService = DownloadComponentManager.getDBThreadExecutorService();
            if (dBThreadExecutorService != null) {
                dBThreadExecutorService.execute(runnable);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
