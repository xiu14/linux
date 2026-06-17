package com.bytedance.bdinstall.p0;

import android.accounts.Account;
import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.Q;

/* loaded from: classes.dex */
public class e {
    @SuppressLint({"VisibleForTests"})
    public static void a(Context context, C0641v c0641v, Q q) {
        String sb;
        String c2;
        String c3;
        if (c0641v.e()) {
            c2 = com.bytedance.bdinstall.util.a.c("dp", c0641v);
        } else {
            if (q.R()) {
                sb = "device_parameters";
            } else {
                StringBuilder M = e.a.a.a.a.M("device_parameters_");
                M.append(q.h());
                sb = M.toString();
            }
            c2 = com.bytedance.bdinstall.util.a.c(sb, c0641v);
        }
        if (q.Q()) {
            c2 = e.a.a.a.a.s(c2, "_local");
        }
        String s = e.a.a.a.a.s(c2, ".dat");
        j jVar = new j();
        jVar.k(s);
        jVar.o(c0641v.b(q));
        jVar.j(q.K());
        jVar.l(q.Q());
        Account f2 = q.f();
        c3 = com.bytedance.bdinstall.util.a.c("", c0641v);
        jVar.i(f2, c3);
        jVar.m(false);
        jVar.n(q);
        com.bytedance.bdinstall.o0.a cVar = !c0641v.e() ? new c(context, jVar) : new f(context, jVar);
        com.bytedance.bdinstall.o0.c cVar2 = (com.bytedance.bdinstall.o0.c) com.bytedance.bdinstall.o0.d.a(com.bytedance.bdinstall.o0.c.class, q.i());
        if (cVar2 != null) {
            cVar = (com.bytedance.bdinstall.o0.a) cVar2.c(com.bytedance.bdinstall.o0.a.class, cVar);
        }
        com.bytedance.bdinstall.o0.d.b(com.bytedance.bdinstall.o0.a.class, cVar, q.i());
    }
}
