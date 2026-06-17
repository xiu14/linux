package com.bytedance.common.d.a;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.common.model.ProcessEnum;
import com.bytedance.common.utility.Logger;
import com.bytedance.push.g0.f;
import com.huawei.hms.framework.common.BundleUtil;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    static final String[] f4127c = {DBDefinition.ID, "origin_process_name", "target_process_name", "method_name", "args"};

    /* renamed from: d, reason: collision with root package name */
    private static final Object f4128d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private static a f4129e;
    private ProcessEnum a;
    private SQLiteDatabase b;

    /* renamed from: com.bytedance.common.d.a.a$a, reason: collision with other inner class name */
    private static class C0170a extends SQLiteOpenHelper {
        public C0170a(Context context, String str) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE method_call_record ( _id TEXT PRIMARY KEY, origin_process_name TEXT, target_process_name TEXT, method_name TEXT, args TEXT )");
            } catch (Throwable th) {
                Logger.e("DatabaseHelper", "create db exception " + th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        }
    }

    private a(Context context) {
        ProcessEnum g2 = com.ss.android.message.f.a.g(context);
        this.a = g2;
        if (g2 == ProcessEnum.UNKNOWN) {
            return;
        }
        try {
            this.b = new C0170a(context, g2.processSuffix.substring(1) + BundleUtil.UNDERLINE_TAG + "cross_process_event.db").getWritableDatabase();
        } catch (Throwable th) {
            StringBuilder M = e.a.a.a.a.M("error when open database:");
            M.append(th.getMessage());
            f.e("DatabaseHelper", M.toString());
            com.bytedance.push.helper.b.a(th, "error when init com.bytedance.common.process.cross.CrossProcessDatabaseHelper.CrossProcessDatabaseHelper");
        }
    }

    public static a b(Context context) {
        if (f4129e == null) {
            synchronized (f4128d) {
                if (f4129e == null) {
                    f4129e = new a(context.getApplicationContext());
                }
            }
        }
        return f4129e;
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

    public synchronized boolean a(String str) {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            try {
                return this.b.delete("method_call_record", "_id = ?", new String[]{str}) > 0;
            } catch (Throwable unused) {
                return true;
            }
        }
        Logger.w("DatabaseHelper", "db not establish and open");
        return false;
    }

    public synchronized List<com.bytedance.common.model.b> c(ProcessEnum processEnum, ProcessEnum processEnum2) {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = this.b;
        Cursor cursor = null;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            Logger.w("DatabaseHelper", "db not establish and open");
            return null;
        }
        try {
            cursor = this.b.query("method_call_record", f4127c, "origin_process_name=? AND target_process_name=?", new String[]{processEnum.processSuffix, processEnum2.processSuffix}, null, null, null, "10");
            while (cursor.moveToNext()) {
                arrayList.add(new com.bytedance.common.model.b(cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(0)));
            }
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        return arrayList;
    }

    public synchronized long d(com.bytedance.common.model.b bVar) {
        SQLiteDatabase sQLiteDatabase = this.b;
        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DBDefinition.ID, Long.valueOf(com.ss.android.message.f.a.f()));
            contentValues.put("origin_process_name", bVar.q());
            contentValues.put("target_process_name", bVar.r());
            contentValues.put("method_name", bVar.getMethodName());
            contentValues.put("args", bVar.n());
            return this.b.insert("method_call_record", null, contentValues);
        }
        Logger.w("DatabaseHelper", "db not establish and open");
        return -1L;
    }
}
