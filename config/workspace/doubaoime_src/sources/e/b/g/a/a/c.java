package e.b.g.a.a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.Nullable;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: f, reason: collision with root package name */
    static boolean f9508f;

    /* renamed from: g, reason: collision with root package name */
    static boolean f9509g;
    static final String[] h = {DBDefinition.ID, RemoteMessageConst.DATA};
    private static c i;

    /* renamed from: c, reason: collision with root package name */
    private Context f9510c;

    /* renamed from: d, reason: collision with root package name */
    private SQLiteDatabase f9511d;
    private Map<String, Integer> a = new HashMap(2);
    private int b = 0;

    /* renamed from: e, reason: collision with root package name */
    String f9512e = "INSERT INTO monitor_log(aid,type,type2,time,data) VALUES ( ?, ?, ?, ?, ?)";

    private c(Context context) {
        this.f9510c = context;
        this.f9511d = a.a(context).getWritableDatabase();
    }

    private void a(String str, int i2) {
        if (!this.a.containsKey(str) && i2 > 0) {
            this.a.put(str, Integer.valueOf(i2));
        } else {
            this.a.put(str, Integer.valueOf(Math.max(0, this.a.get(str).intValue() + i2)));
        }
    }

    public static c c(Context context) {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new c(context);
                }
            }
        }
        return i;
    }

    private synchronized int e() {
        SQLiteDatabase sQLiteDatabase = this.f9511d;
        int i2 = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f9511d.rawQuery("SELECT count(*) FROM monitor_log", null);
            if (cursor.moveToNext()) {
                i2 = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            i(cursor);
            throw th;
        }
        i(cursor);
        return i2;
    }

    private synchronized int f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f9511d;
        int i2 = -1;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return -1;
        }
        Cursor cursor = null;
        try {
            cursor = this.f9511d.rawQuery("SELECT count(*) FROM monitor_log WHERE aid = ?", new String[]{str});
            if (cursor.moveToNext()) {
                i2 = cursor.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            i(cursor);
            throw th;
        }
        i(cursor);
        return i2;
    }

    protected static void i(Cursor cursor) {
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

    private synchronized void j() {
        if (!f9509g) {
            f9509g = true;
            if (e() >= com.heytap.mcssdk.constant.a.r) {
                k(500L);
            }
        }
        if (!f9508f) {
            f9508f = true;
            try {
                File databasePath = this.f9510c.getDatabasePath("psdkmon.db");
                if (databasePath.exists()) {
                    databasePath.delete();
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized int b(String str, long j) {
        if (this.f9511d != null && j >= 0) {
            int delete = this.f9511d.delete("monitor_log", "aid = ? AND _id<= ? ", new String[]{str, String.valueOf(j)});
            a(str, delete * (-1));
            return delete;
        }
        return -1;
    }

    public synchronized int d(String str) {
        int i2;
        if (this.b <= 10 && this.a.containsKey(str)) {
            i2 = this.a.get(str).intValue();
            this.b++;
        }
        int f2 = f(str);
        this.a.put(str, Integer.valueOf(f2));
        this.b = 0;
        i2 = f2;
        return i2;
    }

    @Nullable
    public List<e.b.g.a.a.f.a> g(int i2, int i3) {
        Cursor cursor = null;
        try {
            Cursor query = this.f9511d.query("monitor_log", h, "aid= ?", new String[]{String.valueOf(i2)}, null, null, "_id ASC ", i3 + "");
            try {
                if (query.getCount() == 0) {
                    i(query);
                    return null;
                }
                LinkedList linkedList = new LinkedList();
                while (query.moveToNext()) {
                    linkedList.add(new e.b.g.a.a.f.a(query.getLong(query.getColumnIndex(DBDefinition.ID)), query.getString(query.getColumnIndex(RemoteMessageConst.DATA))));
                }
                i(query);
                return linkedList;
            } catch (Throwable unused) {
                cursor = query;
                i(cursor);
                return Collections.emptyList();
            }
        } catch (Throwable unused2) {
        }
    }

    public synchronized void h(String str, List<e.b.g.a.a.f.a> list) {
        if (this.f9511d != null && !com.bytedance.feedbackerlib.a.U(list)) {
            j();
            this.f9511d.beginTransaction();
            try {
                try {
                    SQLiteStatement compileStatement = this.f9511d.compileStatement(this.f9512e);
                    for (e.b.g.a.a.f.a aVar : list) {
                        compileStatement.bindString(1, String.valueOf(aVar.b));
                        String str2 = aVar.f9516c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        compileStatement.bindString(2, str2);
                        String str3 = aVar.f9517d;
                        if (str3 == null) {
                            str3 = "";
                        }
                        compileStatement.bindString(3, str3);
                        compileStatement.bindLong(4, aVar.f9519f);
                        String str4 = aVar.f9518e;
                        if (str4 == null) {
                            str4 = "";
                        }
                        compileStatement.bindString(5, str4);
                        compileStatement.executeInsert();
                    }
                    this.f9511d.setTransactionSuccessful();
                    a(str, list.size());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                this.f9511d.endTransaction();
            } catch (Throwable th) {
                this.f9511d.endTransaction();
                throw th;
            }
        }
    }

    public synchronized void k(long j) {
        if (this.f9511d == null || j <= 0) {
            return;
        }
        try {
            this.f9511d.execSQL(" DELETE FROM monitor_log WHERE _id IN (SELECT _id FROM monitor_log ORDER BY _id ASC LIMIT " + j + ")");
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
