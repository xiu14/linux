package com.bytedance.push.monitor.l;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.core.app.NotificationCompat;
import com.bytedance.push.g0.f;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    static final String[] f5747d = {DBDefinition.ID, "service_name", PushLog.KEY_CATEGORY, "metric", "extra"};

    /* renamed from: e, reason: collision with root package name */
    private static final Object f5748e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static volatile c f5749f;
    private SQLiteDatabase a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private a f5750c;

    private static class a extends SQLiteOpenHelper {
        public a(Context context) {
            super(context, "ss_push_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, service_name VARCHAR, category VARCHAR, metric VARCHAR, extra VARCHAR )");
            } catch (Exception e2) {
                f.e("MultiProcessMonitorDBHelper", "create db exception " + e2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private c(Context context) {
        this.b = context;
        this.f5750c = new a(context);
    }

    public static c d(Context context) {
        if (f5749f == null) {
            synchronized (f5748e) {
                if (f5749f == null) {
                    f5749f = new c(context.getApplicationContext());
                }
            }
        }
        return f5749f;
    }

    private synchronized SQLiteDatabase f() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    f.c("MultiProcessMonitorDBHelper", "lock file for open db");
                    com.bytedance.push.helper.a.a("push_monitor_db.lock").b(this.b);
                    try {
                        this.a = this.f5750c.getWritableDatabase();
                        f.c("MultiProcessMonitorDBHelper", "success lock file and open db");
                    } catch (Throwable th) {
                        f.f("MultiProcessMonitorDBHelper", "error when open db", th);
                    }
                }
            }
        }
        return this.a;
    }

    protected static void g(Cursor cursor) {
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

    public synchronized void a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                f.c("MultiProcessMonitorDBHelper", "close db and  unlock file");
                this.a.close();
                this.a = null;
                com.bytedance.push.helper.a.a("push_monitor_db.lock").d();
                f.c("MultiProcessMonitorDBHelper", "success close db and unlock file");
            }
        } finally {
        }
    }

    public synchronized boolean b(long j) {
        try {
            SQLiteDatabase f2 = f();
            if (f2 != null && f2.isOpen()) {
                return f2.delete(NotificationCompat.CATEGORY_EVENT, "_id = ?", new String[]{String.valueOf(j)}) > 0;
            }
            f.m("MultiProcessMonitorDBHelper", "[deleteEvent] db not establish and open");
            return false;
        } catch (Throwable th) {
            try {
                f.f("MultiProcessMonitorDBHelper", "[deleteEvent] error when delete monitor event ", th);
                return false;
            } finally {
                a();
            }
        }
    }

    public synchronized List<b> c(int i) {
        SQLiteDatabase f2;
        ArrayList arrayList = new ArrayList();
        try {
            f2 = f();
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        if (f2 != null && f2.isOpen()) {
            Cursor cursor = null;
            try {
                cursor = f2.query(NotificationCompat.CATEGORY_EVENT, f5747d, null, null, null, null, "_id ASC", "" + i);
                while (cursor.moveToNext()) {
                    arrayList.add(new b(cursor));
                }
            } finally {
                try {
                } finally {
                }
            }
            return arrayList;
        }
        f.m("MultiProcessMonitorDBHelper", "[deleteEvent] db not establish and open");
        return arrayList;
    }

    public synchronized long e(b bVar) {
        try {
            SQLiteDatabase f2 = f();
            if (f2 == null || !f2.isOpen()) {
                f.m("MultiProcessMonitorDBHelper", "[insertEvent] db not establish and open");
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("service_name", bVar.b);
            contentValues.put(PushLog.KEY_CATEGORY, bVar.f5744c);
            contentValues.put("metric", bVar.f5745d);
            contentValues.put("extra", bVar.f5746e);
            return f2.insert(NotificationCompat.CATEGORY_EVENT, null, contentValues);
        } catch (Throwable th) {
            try {
                f.f("MultiProcessMonitorDBHelper", "[insertEvent] error when insert monitor event to db ", th);
                return -1L;
            } finally {
                a();
            }
        }
    }
}
