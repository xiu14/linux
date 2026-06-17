package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes2.dex */
public class dj {
    private static db a;

    /* renamed from: a, reason: collision with other field name */
    private static dc f257a;

    public static void a(Context context, gp gpVar) {
        if (m243b(context)) {
            if (a == null) {
                a = new db(context);
            }
            if (f257a == null) {
                f257a = new dc(context);
            }
            db dbVar = a;
            gpVar.a(dbVar, dbVar);
            dc dcVar = f257a;
            gpVar.b(dcVar, dcVar);
            a("startStats");
        }
    }

    public static void b(Context context, gp gpVar) {
        db dbVar = a;
        if (dbVar != null) {
            gpVar.a(dbVar);
            a = null;
        }
        dc dcVar = f257a;
        if (dcVar != null) {
            gpVar.b(dcVar);
            f257a = null;
        }
        a("stopStats");
    }

    public static void c(Context context) {
        a("onPing");
        if (m243b(context)) {
            dm.a(context, System.currentTimeMillis(), m242a(context), com.xiaomi.push.service.p.a(context).m813a());
        }
    }

    public static void d(Context context) {
        a("onPong");
        if (m243b(context)) {
            dm.c(context, System.currentTimeMillis(), m242a(context));
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    private static boolean m243b(Context context) {
        return cz.a(context);
    }

    public static void a(Context context) {
        a("onSendMsg");
        if (m243b(context)) {
            dm.a(context, System.currentTimeMillis(), m242a(context));
        }
    }

    public static void b(Context context) {
        a("onReceiveMsg");
        if (m243b(context)) {
            dm.b(context, System.currentTimeMillis(), m242a(context));
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m242a(Context context) {
        return j.m619b(context);
    }

    static void a(String str) {
        cz.a("Push-PowerStats", str);
    }
}
