package com.bytedance.apm.battery.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<T> {
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f3340c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, Integer> f3341d = new HashMap<>();

    public interface b<T> {
    }

    public static class c {
        Cursor a;
        private final HashMap<String, Integer> b;

        c(Cursor cursor, HashMap hashMap, C0112a c0112a) {
            this.a = cursor;
            this.b = hashMap;
        }

        private int a(String str) {
            Integer num = this.b.get(str);
            if (num == null) {
                try {
                    num = Integer.valueOf(this.a.getColumnIndex(str));
                } catch (Throwable unused) {
                    num = -1;
                }
                this.b.put(str, num);
            }
            return num.intValue();
        }

        public int b(String str) {
            try {
                return this.a.getInt(a(str));
            } catch (Throwable unused) {
                return -1;
            }
        }

        public long c(String str) {
            try {
                return this.a.getLong(a(str));
            } catch (Throwable unused) {
                return -1L;
            }
        }

        public String d(String str) {
            try {
                return this.a.getString(a(str));
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    protected a() {
        Context h = g.h();
        this.a = h;
        this.b = e.a.a.a.a.c(h, new StringBuilder(), ".apm");
    }

    private static void e(Cursor cursor) {
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

    public abstract String[] a();

    public Uri b() {
        if (this.f3340c == null) {
            StringBuilder M = e.a.a.a.a.M("content://");
            e.a.a.a.a.M0(M, this.b, "/", "apm_monitor_t1.db", "/");
            M.append("t_battery");
            this.f3340c = Uri.parse(M.toString());
        }
        return this.f3340c;
    }

    public synchronized <I extends T> long c(ContentValues contentValues) {
        try {
            Uri insert = g.h().getContentResolver().insert(b(), contentValues);
            if (insert == null) {
                return -1L;
            }
            try {
                return Long.parseLong(insert.getLastPathSegment());
            } catch (Exception unused) {
                return 1L;
            }
        } catch (Exception unused2) {
            return -1L;
        }
    }

    public List<T> d(String str, String[] strArr, String str2, b<T> bVar) {
        int indexOf;
        Cursor cursor = null;
        try {
            Cursor query = this.a.getContentResolver().query(b(), a(), str, strArr, str2);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        int i = Integer.MAX_VALUE;
                        if (!TextUtils.isEmpty(str2) && (indexOf = str2.indexOf("LIMIT")) > 0) {
                            int indexOf2 = str2.indexOf("OFF");
                            i = indexOf2 > 0 ? Integer.valueOf(str2.substring(indexOf + 5, indexOf2).trim()).intValue() : Integer.valueOf(str2.substring(indexOf + 5).trim()).intValue();
                        }
                        LinkedList linkedList = new LinkedList();
                        for (int i2 = 0; query.moveToNext() && i2 < i; i2++) {
                            linkedList.add(((com.bytedance.apm.battery.dao.c.a) bVar).f(new c(query, this.f3341d, null)));
                        }
                        e(query);
                        return linkedList;
                    }
                } catch (Throwable unused) {
                    cursor = query;
                    e(cursor);
                    return Collections.emptyList();
                }
            }
            List<T> emptyList = Collections.emptyList();
            e(query);
            return emptyList;
        } catch (Throwable unused2) {
        }
    }
}
