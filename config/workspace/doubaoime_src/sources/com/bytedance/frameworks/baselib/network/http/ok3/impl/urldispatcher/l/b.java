package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.l;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.k;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.d;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j;
import com.bytedance.frameworks.baselib.network.http.p.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.t;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {
    private static volatile b a;
    private static a b;

    /* renamed from: c, reason: collision with root package name */
    private static final ReentrantReadWriteLock f5225c = new ReentrantReadWriteLock();

    private b() {
    }

    public static b a() {
        if (a == null) {
            synchronized (b.class) {
                if (a == null) {
                    a = new b();
                }
            }
        }
        return a;
    }

    public static void c(JSONObject jSONObject) {
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = f5225c;
            reentrantReadWriteLock.writeLock().lock();
            a aVar = new a();
            b = aVar;
            if (!aVar.g(jSONObject)) {
                b.h(false);
            }
            List<Pair<com.bytedance.frameworks.baselib.network.c.c.a, c>> c2 = b.c();
            if (c2 == null || c2.isEmpty()) {
                b.h(false);
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f5225c.writeLock().unlock();
            throw th;
        }
    }

    public t b(t tVar, t tVar2, String str, k kVar) {
        ReentrantReadWriteLock.ReadLock readLock;
        String str2;
        ReentrantReadWriteLock reentrantReadWriteLock;
        a aVar;
        c b2;
        if (tVar == null || TextUtils.isEmpty(tVar.k()) || tVar2 == null || TextUtils.isEmpty(tVar2.k())) {
            return tVar2;
        }
        String tVar3 = tVar.toString();
        try {
            reentrantReadWriteLock = f5225c;
            reentrantReadWriteLock.readLock().lock();
            aVar = b;
        } catch (Throwable th) {
            try {
                th.printStackTrace();
                readLock = f5225c.readLock();
            } catch (Throwable th2) {
                f5225c.readLock().unlock();
                throw th2;
            }
        }
        if (aVar != null && aVar.d() && (b2 = b.b(tVar3)) != null) {
            if (b2.a) {
                readLock = reentrantReadWriteLock.readLock();
                readLock.unlock();
                t tVar4 = null;
                try {
                    d c2 = j.k().c(new com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.k(tVar2.toString(), str, new ArrayList()));
                    str2 = (c2 == null || !l.a(c2.a)) ? null : c2.a;
                } catch (Throwable th3) {
                    th3.printStackTrace();
                }
                if (TextUtils.isEmpty(str2) || (tVar4 = t.o(str2)) == null) {
                    return tVar2;
                }
                if (kVar != null) {
                    com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c cVar = new com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.c();
                    boolean z = true;
                    cVar.f5209d = true;
                    cVar.b = 0L;
                    cVar.f5208c = 0;
                    cVar.f5210e = 0;
                    cVar.f5211f = false;
                    cVar.f5212g = tVar4.toString();
                    cVar.a = "redirect_dispatch_" + tVar2.k();
                    if (str2.equals(tVar2.toString())) {
                        z = false;
                    }
                    kVar.s(str, cVar, z);
                }
                return tVar4;
            }
        }
        reentrantReadWriteLock.readLock().unlock();
        return tVar2;
    }
}
