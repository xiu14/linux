package com.bytedance.apm.battery.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.apm.g;

/* loaded from: classes.dex */
public class b extends SQLiteOpenHelper {
    public b(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE t_battery ( _id INTEGER PRIMARY KEY AUTOINCREMENT, version_id Integer, front Integer, timestamp Integer, type TEXT, status Integer, scene TEXT, accumulation Integer, source TEXT, delete_flag Integer DEFAULT 0, process TEXT, main_process Integer, sid TEXT, extra1 TEXT, extra2 TEXT, extra3 TEXT, extra4 TEXT  )");
        } catch (Exception unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (g.B()) {
            e.b.b.n.g.b.a("DBHelper", "Updating table from " + i + " to " + i2);
        }
        if (i < 2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_monitor_log");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS t_apiall");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS local_monitor_version");
            } catch (Exception unused) {
            }
        }
    }
}
