package com.ss.android.message.log;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.core.app.NotificationCompat;
import com.bytedance.push.g0.f;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes2.dex */
public class a {
    static final String[] b = {DBDefinition.ID, PushLog.KEY_CATEGORY, "tag", PushLog.KEY_LABEL, PushLog.KEY_VALUE, PushLog.KEY_EXT_VALUE, PushLog.KEY_EXT_JSON};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f8357c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static a f8358d;
    private SQLiteDatabase a;

    /* renamed from: com.ss.android.message.log.a$a, reason: collision with other inner class name */
    private static class C0380a extends SQLiteOpenHelper {
        public C0380a(Context context) {
            super(context, "ss_push_log.db", (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE event ( _id INTEGER PRIMARY KEY AUTOINCREMENT, category VARCHAR, tag VARCHAR, label VARCHAR, value INTEGER, ext_value INTEGER, ext_json TEXT )");
            } catch (Exception e2) {
                f.e("PushLog", "create db exception " + e2);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private a(Context context) {
        try {
            this.a = new C0380a(context).getWritableDatabase();
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error when init DatabaseHelper:");
            M.append(th.getLocalizedMessage());
            f.e("", M.toString());
            com.bytedance.push.helper.b.a(th, "error when init com.ss.android.message.log.DBHelper.DBHelper");
        }
    }

    public static a c(Context context) {
        synchronized (f8357c) {
            if (f8358d == null) {
                f8358d = new a(context.getApplicationContext());
            }
        }
        return f8358d;
    }

    protected static void e(Cursor cursor) {
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

    public synchronized boolean a(long j) {
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            return this.a.delete(NotificationCompat.CATEGORY_EVENT, "_id = ?", new String[]{String.valueOf(j)}) > 0;
        }
        f.c("PushLog", "db not establish and open");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized org.json.JSONArray b(long r21, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.log.a.b(long, int):org.json.JSONArray");
    }

    public synchronized long d(b bVar) {
        SQLiteDatabase sQLiteDatabase = this.a;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(PushLog.KEY_CATEGORY, bVar.a);
            contentValues.put("tag", bVar.b);
            if (!com.bytedance.android.input.k.b.a.Y(bVar.f8359c)) {
                contentValues.put(PushLog.KEY_LABEL, bVar.f8359c);
            }
            contentValues.put(PushLog.KEY_VALUE, Long.valueOf(bVar.f8360d));
            contentValues.put(PushLog.KEY_EXT_VALUE, Long.valueOf(bVar.f8361e));
            if (!com.bytedance.android.input.k.b.a.Y(bVar.f8362f)) {
                contentValues.put(PushLog.KEY_EXT_JSON, bVar.f8362f);
            }
            return this.a.insert(NotificationCompat.CATEGORY_EVENT, null, contentValues);
        }
        f.c("PushLog", "db not establish and open");
        return -1L;
    }
}
