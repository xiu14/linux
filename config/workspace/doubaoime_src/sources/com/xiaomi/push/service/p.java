package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.eq;
import com.xiaomi.push.er;
import com.xiaomi.push.gp;
import com.xiaomi.push.hz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class p {
    private static volatile p a;

    /* renamed from: a, reason: collision with other field name */
    private final Context f1137a;

    /* renamed from: a, reason: collision with other field name */
    private gp f1139a;

    /* renamed from: a, reason: collision with other field name */
    private volatile r f1140a;

    /* renamed from: a, reason: collision with other field name */
    private final List<Integer> f1141a = new CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with other field name */
    private eq f1138a = null;

    private p(Context context) {
        this.f1137a = context.getApplicationContext();
    }

    public static p a(Context context) {
        if (a == null) {
            synchronized (p.class) {
                if (a == null) {
                    a = new p(context);
                }
            }
        }
        return a;
    }

    public long b() {
        return a().mo801b();
    }

    public void c() {
        a().mo812f();
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m818b() {
        a().mo811e();
    }

    private r b(int i) {
        r mVar;
        if (i == 1) {
            if (m.a(this.f1137a)) {
                mVar = new m(this.f1137a, this.f1139a);
            }
            mVar = new o(this.f1137a);
        } else {
            if (i == 2) {
                mVar = new eq();
            }
            mVar = new o(this.f1137a);
        }
        mVar.mo356a();
        mVar.mo357b();
        return mVar;
    }

    public void a(gp gpVar) {
        this.f1139a = gpVar;
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m814a() {
        return a().a();
    }

    public void a(com.xiaomi.push.ay ayVar) {
        a().a(ayVar);
    }

    public void a(String str) {
        a().mo800a(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m816a() {
        a().mo803d();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m817a(int i) {
        a().a(i);
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized int m813a() {
        if (this.f1140a == null) {
            return -1;
        }
        return this.f1140a.a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public List<Integer> m815a() {
        if (this.f1141a.isEmpty()) {
            this.f1141a.add(-1);
            this.f1141a.add(0);
            this.f1141a.add(1);
            this.f1141a.add(2);
        }
        return new ArrayList(this.f1141a);
    }

    private synchronized r a() {
        int i = 0;
        int a2 = aq.a(this.f1137a).a(hz.IntelligentHeartbeatStrategy.a(), 0);
        if (a2 != 1 || m.a(this.f1137a)) {
            i = a2;
        }
        if (er.a().m359a()) {
            i = 2;
        }
        if (this.f1140a != null && i == this.f1140a.a()) {
            return this.f1140a;
        }
        return a(i);
    }

    private r a(int i) {
        if (this.f1140a != null) {
            this.f1140a.mo802c();
        }
        this.f1140a = b(i);
        return this.f1140a;
    }
}
