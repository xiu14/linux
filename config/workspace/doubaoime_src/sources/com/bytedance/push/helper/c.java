package com.bytedance.push.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.push.B;
import com.bytedance.push.g0.f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    static final String[] f5721d = {"message_id", "arrive_time", "client_intelligence_expire_time", "sender", "handle_by_sdk", "has_been_shown", "push_body"};

    /* renamed from: e, reason: collision with root package name */
    private static c f5722e;
    private SQLiteDatabase a;
    private a b;

    /* renamed from: c, reason: collision with root package name */
    private Context f5723c;

    private static class a extends SQLiteOpenHelper {
        public a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE message ( message_id BIGINT PRIMARY KEY, arrive_time BIGINT, client_intelligence_expire_time BIGINT, sender INT,handle_by_sdk INT,has_been_shown INT,push_body TEXT )");
            } catch (Throwable th) {
                f.e("MultiProcessPushMessageDatabaseHelper", "create db exception " + th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private c(Context context) {
        try {
            this.f5723c = context;
            this.b = new a(context, "push_message.db");
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error when init DatabaseHelper:");
            M.append(th.getLocalizedMessage());
            f.e("", M.toString());
            b.a(th, "error when init com.bytedance.push.helper.MultiProcessPushMessageDatabaseHelper.MultiProcessPushMessageDatabaseHelper");
        }
    }

    private void b() {
        try {
            SQLiteDatabase sQLiteDatabase = this.a;
            if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                return;
            }
            f.c("MultiProcessPushMessageDatabaseHelper", "close db and  unlock file");
            this.a.close();
            this.a = null;
            com.bytedance.push.helper.a.a("push_message_db.lock").d();
            f.c("MultiProcessPushMessageDatabaseHelper", "success close db and unlock file");
        } catch (Throwable th) {
            f.e("MultiProcessPushMessageDatabaseHelper", "error when close db: " + th);
        }
    }

    public static c f(Context context) {
        if (f5722e == null) {
            synchronized (c.class) {
                if (f5722e == null) {
                    f5722e = new c(context.getApplicationContext());
                }
            }
        }
        return f5722e;
    }

    private SQLiteDatabase i() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    f.c("MultiProcessPushMessageDatabaseHelper", "lock file for open db");
                    com.bytedance.push.helper.a.a("push_message_db.lock").b(this.f5723c);
                    try {
                        this.a = this.b.getWritableDatabase();
                        f.c("MultiProcessPushMessageDatabaseHelper", "success lock file and open db");
                    } catch (Throwable th) {
                        f.f("MultiProcessPushMessageDatabaseHelper", "error when open db", th);
                    }
                }
            }
        }
        return this.a;
    }

    public synchronized long a(B b) {
        f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb]");
        if (!com.ss.android.pushmanager.setting.c.c().a()) {
            f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] do nothing because allowCacheMessageToDb is false");
            return -1L;
        }
        SQLiteDatabase i = i();
        f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] success open db");
        if (i != null) {
            try {
                if (i.isOpen()) {
                    ContentValues q = b.q();
                    Cursor rawQuery = i.rawQuery("select count(*) from message", null);
                    rawQuery.moveToFirst();
                    long j = rawQuery.getLong(0);
                    j(rawQuery);
                    f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] curMessageCount is " + j);
                    if (j >= com.ss.android.pushmanager.setting.c.c().g().d0().b) {
                        f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] curMessageCount > maxCacheMessage, delete the earliest message");
                        i.execSQL("delete from message where message_id in(select message_id from message where has_been_shown=0 limit 1)");
                    }
                    f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] insert cur message to db");
                    return i.insert("message", null, q);
                }
            } finally {
                f.c("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] finish message insert, close db");
                b();
            }
        }
        f.m("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] db not establish and open");
        return -1L;
    }

    public synchronized boolean c(long j) {
        boolean z = false;
        if (!com.ss.android.pushmanager.setting.c.c().a()) {
            f.c("MultiProcessPushMessageDatabaseHelper", "[curMessageHasExists] do nothing because allowCacheMessageToDb is false");
            return false;
        }
        f.c("MultiProcessPushMessageDatabaseHelper", "[curMessageHasExists] messageId is " + j);
        SQLiteDatabase i = i();
        f.c("MultiProcessPushMessageDatabaseHelper", "[curMessageHasExists] success open db");
        if (i != null) {
            try {
                if (i.isOpen()) {
                    Cursor cursor = null;
                    try {
                        cursor = i.query("message", f5721d, "message_id = ?", new String[]{String.valueOf(j)}, null, null, null, null);
                        if (cursor.getCount() >= 1) {
                            z = true;
                        }
                    } finally {
                        try {
                            return z;
                        } finally {
                        }
                    }
                    return z;
                }
            } finally {
                f.c("MultiProcessPushMessageDatabaseHelper", "[curMessageHasExists] finish query, close db");
                b();
            }
        }
        f.m("MultiProcessPushMessageDatabaseHelper", "db not establish and open");
        return false;
    }

    public synchronized boolean d(long j) {
        if (!com.ss.android.pushmanager.setting.c.c().a()) {
            f.c("MultiProcessPushMessageDatabaseHelper", "[deleteExpiredMsg] do nothing because allowCacheMessageToDb is false");
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis() - (3600000 * j);
        f.c("MultiProcessPushMessageDatabaseHelper", "[deleteExpiredMsg] lastTimeStamp is " + currentTimeMillis + " maxCacheTimeInHour is " + j);
        SQLiteDatabase i = i();
        f.c("MultiProcessPushMessageDatabaseHelper", "[deleteExpiredMsg] success open db");
        if (i != null) {
            try {
                if (i.isOpen()) {
                    return i.delete("message", "arrive_time <= ? and has_been_shown=1", new String[]{String.valueOf(currentTimeMillis)}) > 0;
                }
            } catch (Throwable th) {
                try {
                    f.f("MultiProcessPushMessageDatabaseHelper", "[deleteExpiredMsg] error ", th);
                    return false;
                } finally {
                    f.c("MultiProcessPushMessageDatabaseHelper", "[deleteExpiredMsg] finish message delete, close db");
                    b();
                }
            }
        }
        f.m("MultiProcessPushMessageDatabaseHelper", "db not establish and open");
        return false;
    }

    public synchronized List<B> e() {
        f.c("MultiProcessPushMessageDatabaseHelper", "[getAllMessageNotShown]");
        if (!com.ss.android.pushmanager.setting.c.c().a()) {
            f.c("MultiProcessPushMessageDatabaseHelper", "[getAllMessageNotShown] do nothing because allowCacheMessageToDb is false");
            return new ArrayList();
        }
        SQLiteDatabase i = i();
        if (i != null) {
            try {
                if (i.isOpen()) {
                    Cursor cursor = null;
                    ArrayList arrayList = new ArrayList();
                    try {
                        cursor = i.query("message", f5721d, "has_been_shown = 0", null, null, null, "arrive_time ASC", null);
                        while (cursor.moveToNext()) {
                            B b = new B(cursor);
                            if (b.o() != null) {
                                arrayList.add(b);
                            }
                        }
                    } finally {
                        try {
                            f.c("MultiProcessPushMessageDatabaseHelper", "[getAllMessageNotShown] finish query,dbPushBodyArrayList size is " + arrayList.size());
                            return arrayList;
                        } finally {
                        }
                    }
                    f.c("MultiProcessPushMessageDatabaseHelper", "[getAllMessageNotShown] finish query,dbPushBodyArrayList size is " + arrayList.size());
                    return arrayList;
                }
            } finally {
                b();
                f.c("MultiProcessPushMessageDatabaseHelper", "[getAllMessageNotShown] finish query,close db");
            }
        }
        f.m("MultiProcessPushMessageDatabaseHelper", "[addMessageToDb] db not establish and open");
        return new ArrayList();
    }

    public B g(long j) {
        B b;
        f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage]");
        Cursor cursor = null;
        B b2 = null;
        if (!com.ss.android.pushmanager.setting.c.c().a()) {
            f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] do nothing because allowCacheMessageToDb is false");
            return null;
        }
        SQLiteDatabase i = i();
        if (i != null) {
            try {
                if (i.isOpen()) {
                    try {
                        try {
                            Cursor query = i.query("message", f5721d, "message_id = ?", new String[]{String.valueOf(j)}, null, null, null, null);
                            try {
                                if (query.moveToNext()) {
                                    b = new B(query);
                                    try {
                                        if (b.o() == null) {
                                            j(query);
                                            b();
                                            f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] finish query,close db");
                                            return null;
                                        }
                                        b2 = b;
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor = query;
                                        try {
                                            th.printStackTrace();
                                            j(cursor);
                                            b2 = b;
                                            b();
                                            f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] finish query,close db");
                                            return b2;
                                        } catch (Throwable th2) {
                                            j(cursor);
                                            throw th2;
                                        }
                                    }
                                }
                                j(query);
                            } catch (Throwable th3) {
                                th = th3;
                                b = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            b = null;
                        }
                        b();
                        f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] finish query,close db");
                        return b2;
                    } finally {
                        f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] finish query, close db");
                        b();
                    }
                }
            } catch (Throwable th5) {
                b();
                f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] finish query,close db");
                throw th5;
            }
        }
        f.m("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] db not establish and open");
        b();
        f.c("MultiProcessPushMessageDatabaseHelper", "[getPushNotificationMessage] finish query,close db");
        return null;
    }

    public synchronized long h(long j) {
        String str;
        String str2;
        if (!com.ss.android.pushmanager.setting.c.c().a()) {
            f.c("MultiProcessPushMessageDatabaseHelper", "[markMessageAsShown] do nothing because allowCacheMessageToDb is false");
            return 0L;
        }
        f.c("MultiProcessPushMessageDatabaseHelper", "[markMessageAsShown] messageId is " + j);
        SQLiteDatabase i = i();
        if (i != null) {
            try {
                if (i.isOpen()) {
                    new ContentValues().put("has_been_shown", (Integer) 1);
                    String[] strArr = {String.valueOf(j)};
                    try {
                        return i.update("message", r3, "message_id = ?", strArr);
                    } catch (IllegalStateException unused) {
                        SQLiteDatabase i2 = i();
                        if (i2 != null && i2.isOpen()) {
                            return i2.update("message", r3, "message_id = ?", strArr);
                        }
                        b();
                        str = "MultiProcessPushMessageDatabaseHelper";
                        str2 = "[markMessageAsShown] finish update,close db";
                        f.c(str, str2);
                        return -1L;
                    }
                }
            } catch (Throwable th) {
                try {
                    f.f("MultiProcessPushMessageDatabaseHelper", "[markMessageAsShown] error to update ", th);
                    b();
                    str = "MultiProcessPushMessageDatabaseHelper";
                    str2 = "[markMessageAsShown] finish update,close db";
                    f.c(str, str2);
                    return -1L;
                } finally {
                    b();
                    f.c("MultiProcessPushMessageDatabaseHelper", "[markMessageAsShown] finish update,close db");
                }
            }
        }
        f.m("MultiProcessPushMessageDatabaseHelper", "db not establish and open");
        return -1L;
    }

    protected void j(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
