package com.bytedance.apm.battery.dao.c;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import com.bytedance.apm.battery.dao.a;
import com.bytedance.apm.g;
import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.DBDefinition;

/* loaded from: classes.dex */
public class a extends com.bytedance.apm.battery.dao.a<com.bytedance.apm.w.a> implements a.b<com.bytedance.apm.w.a> {

    /* renamed from: e, reason: collision with root package name */
    private static volatile a f3342e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f3343f = {DBDefinition.ID, "front", "type", "timestamp", "accumulation", "version_id", "source", "status", "scene", "process", "main_process", WsConstants.KEY_SESSION_ID};

    private a() {
    }

    public static a g() {
        if (f3342e == null) {
            synchronized (a.class) {
                if (f3342e == null) {
                    f3342e = new a();
                }
            }
        }
        return f3342e;
    }

    @Override // com.bytedance.apm.battery.dao.a
    public String[] a() {
        return f3343f;
    }

    @NonNull
    public Object f(a.c cVar) {
        long c2 = cVar.c(DBDefinition.ID);
        long c3 = cVar.c("front");
        String d2 = cVar.d("type");
        long c4 = cVar.c("timestamp");
        long c5 = cVar.c("accumulation");
        long c6 = cVar.c("version_id");
        String d3 = cVar.d("source");
        long c7 = cVar.c("status");
        String d4 = cVar.d("scene");
        int b = cVar.b("main_process");
        String d5 = cVar.d("process");
        com.bytedance.apm.w.a aVar = new com.bytedance.apm.w.a(c3 != 0, c4, d2, c7 != 0, c5, d4, d3);
        aVar.o(d5);
        aVar.m(c2);
        aVar.s(c6);
        aVar.n(b == 1);
        aVar.q(cVar.d(WsConstants.KEY_SESSION_ID));
        return aVar;
    }

    public synchronized long h(com.bytedance.apm.w.a aVar) {
        ContentValues contentValues;
        try {
            contentValues = new ContentValues();
            int i = 1;
            contentValues.put("front", Integer.valueOf(aVar.i() ? 1 : 0));
            contentValues.put("source", aVar.e());
            contentValues.put("type", aVar.f3611d);
            contentValues.put("timestamp", Long.valueOf(aVar.f3610c));
            contentValues.put("accumulation", Long.valueOf(aVar.a()));
            contentValues.put("version_id", Long.valueOf(aVar.g()));
            contentValues.put("status", Integer.valueOf(aVar.l() ? 1 : 0));
            contentValues.put("scene", aVar.d());
            if (!aVar.j()) {
                i = 0;
            }
            contentValues.put("main_process", Integer.valueOf(i));
            contentValues.put("process", aVar.c());
            contentValues.put(WsConstants.KEY_SESSION_ID, aVar.f());
        } catch (Exception unused) {
            return -1L;
        }
        return c(contentValues);
    }

    public synchronized void i(long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("delete_flag", (Integer) 1);
        try {
            g.h().getContentResolver().update(b(), contentValues, "_id <= ? ", new String[]{String.valueOf(j)});
        } catch (Exception unused) {
        }
    }
}
