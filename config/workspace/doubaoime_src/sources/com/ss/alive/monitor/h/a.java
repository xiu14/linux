package com.ss.alive.monitor.h;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.push.g0.f;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.vivo.push.PushClient;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static a f8253c;
    private SQLiteDatabase a;
    static final String[] b = {DBDefinition.ID, "data_json", "end_time"};

    /* renamed from: d, reason: collision with root package name */
    private static final Object f8254d = new Object();

    /* renamed from: com.ss.alive.monitor.h.a$a, reason: collision with other inner class name */
    private static class C0366a extends SQLiteOpenHelper {
        public C0366a(Context context) {
            super(context, "alive_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE process_start_info ( _id INTEGER PRIMARY KEY AUTOINCREMENT, data_json TEXT, end_time INTEGER )");
            } catch (Throwable th) {
                f.e("MonitorLiveDBHelper", "create db exception " + th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private a(Context context) {
        try {
            this.a = new C0366a(context).getWritableDatabase();
        } catch (Throwable th) {
            f.f("MonitorLiveDBHelper", "error when init com.bytedance.alliance.helper.DatabaseHelper.DatabaseHelper ", th);
            com.bytedance.push.helper.b.a(th, "error when init com.bytedance.alliance.helper.DatabaseHelper.DatabaseHelper");
        }
    }

    public static a a(Context context) {
        synchronized (f8254d) {
            if (f8253c == null) {
                f8253c = new a(context);
            }
        }
        return f8253c;
    }

    protected static void d(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }

    public synchronized b b() {
        Cursor cursor;
        try {
            cursor = this.a.query("process_start_info", b, null, null, null, null, "_id DESC", PushClient.DEFAULT_REQUEST_ID);
            try {
                if (cursor.moveToNext()) {
                    b bVar = new b();
                    bVar.a = cursor.getLong(0);
                    bVar.b = cursor.getString(1);
                    bVar.f8255c = cursor.getLong(2);
                    return bVar;
                }
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    d(cursor);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        return null;
    }

    public synchronized long c(b bVar) {
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            f.c("MonitorLiveDBHelper", "insert = " + bVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("data_json", bVar.b);
            contentValues.put("end_time", Long.valueOf(bVar.f8255c));
            return this.a.insert("process_start_info", null, contentValues);
        }
        f.c("MonitorLiveDBHelper", "db not establish and open");
        return -1L;
    }

    public synchronized boolean e(b bVar) {
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            f.c("MonitorLiveDBHelper", "db not establish and open");
            return false;
        }
        try {
            if (f.d()) {
                f.c("MonitorLiveDBHelper", "updateProcessStartDbInfo processStartDbInfo = " + bVar);
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("data_json", bVar.b);
            contentValues.put("end_time", Long.valueOf(bVar.f8255c));
            return this.a.update("process_start_info", contentValues, "_id = ?", new String[]{String.valueOf(bVar.a)}) > 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
