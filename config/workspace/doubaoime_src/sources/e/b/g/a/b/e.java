package e.b.g.a.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.vivo.push.PushClient;

/* loaded from: classes.dex */
class e {
    static final String[] b = {DBDefinition.ID, PushLog.KEY_VALUE, "type", "timestamp", "retry_count", "retry_time"};

    /* renamed from: c, reason: collision with root package name */
    private static e f9540c;
    private SQLiteDatabase a;

    private e(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.a = e.b.g.a.a.a.a(context).getWritableDatabase();
        } catch (Throwable unused) {
        }
    }

    static e c(Context context) {
        if (f9540c == null) {
            synchronized (e.class) {
                if (f9540c == null) {
                    f9540c = new e(context);
                }
            }
        }
        return f9540c;
    }

    static void i(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    synchronized void a(String str, int i, long j) {
        String str2;
        String[] strArr;
        if (f()) {
            long currentTimeMillis = System.currentTimeMillis() - j;
            if (TextUtils.isEmpty(str)) {
                str2 = "timestamp <= ? ";
                strArr = new String[]{String.valueOf(currentTimeMillis)};
            } else {
                String str3 = "(timestamp <= ? OR retry_count > " + i + ") and type = ?";
                String[] strArr2 = {String.valueOf(currentTimeMillis), str};
                str2 = str3;
                strArr = strArr2;
            }
            try {
                this.a.delete("queue", str2, strArr);
            } catch (Exception e2) {
                String str4 = "delete expire log error:" + e2;
            }
        }
    }

    synchronized long b(String str) {
        long j = 0;
        if (!f()) {
            return 0L;
        }
        Cursor cursor = null;
        try {
            cursor = this.a.rawQuery(TextUtils.isEmpty(null) ? "select count(*) from queue" : "select count(*) from queue null", null);
            if (cursor.moveToNext()) {
                j = cursor.getLong(0);
            }
        } catch (Throwable unused) {
        }
        i(cursor);
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [e.b.g.a.b.b] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    synchronized b d(long j) {
        b bVar;
        ?? r1 = 0;
        b bVar2 = null;
        Cursor cursor = null;
        try {
            if (!f()) {
                return null;
            }
            try {
                Cursor query = this.a.query("queue", b, "_id > ?", new String[]{String.valueOf(j)}, null, null, "_id ASC", PushClient.DEFAULT_REQUEST_ID);
                try {
                    try {
                        if (query.moveToNext()) {
                            bVar = new b();
                            try {
                                bVar.a = query.getLong(0);
                                bVar.b = query.getBlob(1);
                                bVar.f9535e = query.getString(2);
                                query.getLong(3);
                                bVar.f9533c = query.getInt(4);
                                bVar.f9534d = query.getLong(5);
                                bVar2 = bVar;
                            } catch (Exception e2) {
                                e = e2;
                                cursor = query;
                                String str = "getLog exception " + e;
                                i(cursor);
                                r1 = bVar;
                                return r1;
                            }
                        }
                        i(query);
                        r1 = bVar2;
                    } catch (Throwable th) {
                        th = th;
                        r1 = query;
                        i(r1);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    bVar = null;
                }
            } catch (Exception e4) {
                e = e4;
                bVar = null;
            }
            return r1;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    synchronized long e(String str, byte[] bArr) {
        if (f() && bArr != null && bArr.length > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(PushLog.KEY_VALUE, bArr);
            contentValues.put("type", str);
            contentValues.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            contentValues.put("retry_time", (Long) 0L);
            return this.a.insert("queue", null, contentValues);
        }
        return -1L;
    }

    synchronized boolean f() {
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase != null) {
            if (sQLiteDatabase.isOpen()) {
                return true;
            }
        }
        return false;
    }

    synchronized boolean g(long j, boolean z, long j2, int i) {
        if (f() && j > 0) {
            boolean z2 = true;
            String[] strArr = {String.valueOf(j)};
            if (!z) {
                Cursor cursor = null;
                try {
                    try {
                        cursor = this.a.query("queue", new String[]{"timestamp", "retry_count"}, "_id = ?", strArr, null, null, null);
                        if (!cursor.moveToNext()) {
                            return false;
                        }
                        long j3 = cursor.getLong(0);
                        int i2 = cursor.getInt(1);
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - j3 < j2 && i2 < i) {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("retry_count", Integer.valueOf(i2 + 1));
                            contentValues.put("retry_time", Long.valueOf(currentTimeMillis));
                            this.a.update("queue", contentValues, "_id = ?", strArr);
                            return true;
                        }
                    } catch (Exception e2) {
                        String str = "onLogSent exception: " + e2;
                        i(cursor);
                        z2 = false;
                    }
                } finally {
                    i(cursor);
                }
            }
            if (!z2) {
                return false;
            }
            try {
                this.a.delete("queue", "_id = ?", strArr);
            } catch (Throwable unused) {
            }
            return false;
        }
        return false;
    }

    synchronized void h() {
        if (f()) {
            try {
                this.a.execSQL("DROP TABLE IF EXISTS queue");
                this.a.execSQL("CREATE TABLE queue ( _id INTEGER PRIMARY KEY AUTOINCREMENT, value BLOB, type TEXT, timestamp INTEGER, retry_count INTEGER, retry_time INTEGER )");
            } catch (Exception e2) {
                String str = "recreateTableQueue db exception " + e2;
            }
        }
    }
}
