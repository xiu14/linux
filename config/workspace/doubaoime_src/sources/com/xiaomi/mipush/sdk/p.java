package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class p {
    private static volatile p a;

    /* renamed from: a, reason: collision with other field name */
    private Context f67a;

    /* renamed from: a, reason: collision with other field name */
    private List<n> f68a = new ArrayList();

    private p(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f67a = applicationContext;
        if (applicationContext == null) {
            this.f67a = context;
        }
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

    public void b(String str) {
        synchronized (this.f68a) {
            n nVar = new n();
            nVar.f65a = str;
            if (this.f68a.contains(nVar)) {
                Iterator<n> it2 = this.f68a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    n next = it2.next();
                    if (nVar.equals(next)) {
                        nVar = next;
                        break;
                    }
                }
            }
            nVar.a++;
            this.f68a.remove(nVar);
            this.f68a.add(nVar);
        }
    }

    public void c(String str) {
        synchronized (this.f68a) {
            n nVar = new n();
            nVar.f65a = str;
            if (this.f68a.contains(nVar)) {
                this.f68a.remove(nVar);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m70a(String str) {
        synchronized (this.f68a) {
            n nVar = new n();
            nVar.a = 0;
            nVar.f65a = str;
            if (this.f68a.contains(nVar)) {
                this.f68a.remove(nVar);
            }
            this.f68a.add(nVar);
        }
    }

    public int a(String str) {
        synchronized (this.f68a) {
            n nVar = new n();
            nVar.f65a = str;
            if (this.f68a.contains(nVar)) {
                for (n nVar2 : this.f68a) {
                    if (nVar2.equals(nVar)) {
                        return nVar2.a;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m71a(String str) {
        synchronized (this.f68a) {
            n nVar = new n();
            nVar.f65a = str;
            return this.f68a.contains(nVar);
        }
    }

    public synchronized String a(v vVar) {
        return this.f67a.getSharedPreferences("mipush_extra", 0).getString(vVar.name(), "");
    }

    public synchronized void a(v vVar, String str) {
        SharedPreferences sharedPreferences = this.f67a.getSharedPreferences("mipush_extra", 0);
        sharedPreferences.edit().putString(vVar.name(), str).apply();
    }
}
