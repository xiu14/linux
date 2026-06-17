package com.bytedance.ttnet.config;

import android.webkit.CookieManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.o;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import e.b.f.a.a.a;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class j implements f.g, a.InterfaceC0430a, c.InterfaceC0317c, k.b, k.a {
    private static volatile j a;

    private j() {
        h();
    }

    private boolean i(String str, List<String> list) {
        if (com.bytedance.android.input.k.b.a.Y(str) || com.bytedance.android.input.k.b.a.g0(list)) {
            return false;
        }
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            if (str.endsWith(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static j j() {
        if (a == null) {
            synchronized (j.class) {
                if (a == null) {
                    a = new j();
                }
            }
        }
        return a;
    }

    @Override // e.b.f.a.a.a.InterfaceC0430a
    public boolean a() {
        return false;
    }

    @Override // e.b.f.a.a.a.InterfaceC0430a
    public boolean b() {
        return false;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.f.g
    public List<String> c(CookieManager cookieManager, com.bytedance.frameworks.baselib.network.http.impl.c cVar, URI uri) {
        String str;
        Throwable th;
        List<String> list;
        if (cookieManager != null || cVar != null) {
            Objects.requireNonNull(TTNetInit.getTTNetDepend());
            if (com.bytedance.android.input.k.b.a.Y(null)) {
                return null;
            }
            try {
                str = uri.getHost();
            } catch (Exception unused) {
                str = null;
            }
            ArrayList arrayList = new ArrayList();
            if (!com.bytedance.android.input.k.b.a.Y(null)) {
                try {
                    throw null;
                } catch (Throwable unused2) {
                }
            }
            if (!com.bytedance.android.input.k.b.a.Y(str) && i(str, arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                if (cookieManager != null) {
                    Objects.requireNonNull(TTNetInit.getTTNetDepend());
                    String cookie = cookieManager.getCookie(null);
                    if (!com.bytedance.android.input.k.b.a.Y(cookie)) {
                        arrayList2.add(cookie);
                    }
                }
                if (!com.bytedance.android.input.k.b.a.g0(arrayList2) || cVar == null) {
                    return arrayList2;
                }
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(uri.getScheme());
                    sb.append("://");
                    Objects.requireNonNull(TTNetInit.getTTNetDepend());
                    sb.append((String) null);
                    Map<String, List<String>> map = cVar.get(URI.create(sb.toString()), new LinkedHashMap());
                    if (map == null || map.isEmpty()) {
                        return arrayList2;
                    }
                    List<String> list2 = map.get("Cookie");
                    if (list2 != null) {
                        try {
                            list2.add("x-tt-cookie-backup-source=1");
                        } catch (Throwable th2) {
                            th = th2;
                            list = list2;
                            th.printStackTrace();
                            return list;
                        }
                    }
                    return list2;
                } catch (Throwable th3) {
                    th = th3;
                    list = arrayList2;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.f.g
    public List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        if (!com.bytedance.android.input.k.b.a.Y(null)) {
            try {
                throw null;
            } catch (Throwable unused) {
            }
        }
        Objects.requireNonNull(TTNetInit.getTTNetDepend());
        if (!com.bytedance.android.input.k.b.a.Y(null) && !i(null, arrayList)) {
            arrayList.add(null);
        }
        if (i(str, arrayList)) {
            return arrayList;
        }
        return null;
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.k.b
    public boolean e() {
        int i = b.M;
        return false;
    }

    @Override // com.bytedance.ttnet.c.InterfaceC0317c
    public boolean f() {
        int i = b.M;
        if (b.L) {
            o.q(8);
            return false;
        }
        if (b.v()) {
            return false;
        }
        Objects.requireNonNull(TTNetInit.getTTNetDepend());
        return true;
    }

    @Override // e.b.f.a.a.a.InterfaceC0430a
    public boolean g() {
        return false;
    }

    public void h() {
        try {
            TTNetInit.getTTNetDepend();
            Logger.w("SyncMainProcessConfig", "Sync main process config in current process.");
            com.bytedance.ttnet.d tTNetDepend = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend);
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).f(null);
            com.bytedance.ttnet.d tTNetDepend2 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend2);
            com.bytedance.ttnet.d tTNetDepend3 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend3);
            com.bytedance.ttnet.d tTNetDepend4 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend4);
            com.bytedance.ttnet.d tTNetDepend5 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend5);
            com.bytedance.ttnet.d tTNetDepend6 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend6);
            com.bytedance.ttnet.d tTNetDepend7 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend7);
            com.bytedance.ttnet.d tTNetDepend8 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend8);
            com.bytedance.ttnet.d tTNetDepend9 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend9);
            com.bytedance.frameworks.baselib.network.e.d.e().i(null);
            com.bytedance.frameworks.baselib.network.e.d.e().c(false);
            com.bytedance.frameworks.baselib.network.e.d.e().f(null);
            com.bytedance.ttnet.d tTNetDepend10 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend10);
            com.bytedance.frameworks.baselib.network.http.f.K(false);
            com.bytedance.ttnet.d tTNetDepend11 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend11);
            com.bytedance.frameworks.baselib.network.http.f.E(false);
            com.bytedance.ttnet.d tTNetDepend12 = TTNetInit.getTTNetDepend();
            ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
            Objects.requireNonNull(tTNetDepend12);
            com.bytedance.frameworks.baselib.network.http.f.G(false);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.impl.k.a
    public boolean isCronetBootFailureExpected() {
        int i = b.M;
        com.bytedance.ttnet.d tTNetDepend = TTNetInit.getTTNetDepend();
        ((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c();
        Objects.requireNonNull(tTNetDepend);
        return true;
    }
}
