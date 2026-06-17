package com.bytedance.rpc.transport.ttnet;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0704h;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.retrofit2.mime.j;
import com.bytedance.retrofit2.q;
import com.bytedance.rpc.transport.c;
import com.bytedance.rpc.transport.g;
import com.bytedance.rpc.transport.i;
import com.bytedance.ttnet.i.d;
import com.bytedance.ttnet.utils.RetrofitUtils;
import e.b.l.e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class a implements c {
    private Map<String, WeakReference<RetrofitApi>> a = new ConcurrentHashMap(4);
    private Map<Integer, WeakReference<InterfaceC0701e<h>>> b = new ConcurrentHashMap(4);

    /* renamed from: com.bytedance.rpc.transport.ttnet.a$a, reason: collision with other inner class name */
    class C0315a implements InterfaceC0704h<h> {
        final /* synthetic */ com.bytedance.rpc.transport.b a;
        final /* synthetic */ int b;

        C0315a(com.bytedance.rpc.transport.b bVar, int i) {
            this.a = bVar;
            this.b = i;
        }

        @Override // com.bytedance.retrofit2.InterfaceC0704h
        public void a(InterfaceC0701e<h> interfaceC0701e, N<h> n) {
            try {
                try {
                    this.a.b(a.this.f(interfaceC0701e, n));
                } catch (Exception e2) {
                    this.a.a(e2);
                    a.b(a.this, interfaceC0701e, e2);
                }
            } finally {
                a.this.b.remove(Integer.valueOf(this.b));
            }
        }

        @Override // com.bytedance.retrofit2.InterfaceC0704h
        public void b(InterfaceC0701e<h> interfaceC0701e, Throwable th) {
            try {
                this.a.a(th);
            } finally {
                a.b(a.this, interfaceC0701e, th);
                a.this.b.remove(Integer.valueOf(this.b));
            }
        }
    }

    class b implements com.bytedance.rpc.transport.a {
        final /* synthetic */ InterfaceC0701e a;
        final /* synthetic */ com.bytedance.retrofit2.client.c b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f6081c;

        b(InterfaceC0701e interfaceC0701e, com.bytedance.retrofit2.client.c cVar, long j) {
            this.a = interfaceC0701e;
            this.b = cVar;
            this.f6081c = j;
        }
    }

    static void b(a aVar, InterfaceC0701e interfaceC0701e, Throwable th) {
        Objects.requireNonNull(aVar);
        aVar.g(interfaceC0701e, null, System.currentTimeMillis(), false, th);
    }

    static void d(a aVar, InterfaceC0701e interfaceC0701e, com.bytedance.retrofit2.client.c cVar, long j) {
        aVar.g(interfaceC0701e, cVar, j, true, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i f(InterfaceC0701e<h> interfaceC0701e, N<h> n) {
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.retrofit2.client.c h = n.h();
        h a = n.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b bVar = new b(interfaceC0701e, h, currentTimeMillis);
        com.bytedance.rpc.transport.ttnet.b bVar2 = a == null ? null : new com.bytedance.rpc.transport.ttnet.b(a, bVar);
        if (h.d() != null) {
            for (com.bytedance.retrofit2.client.b bVar3 : h.d()) {
                linkedHashMap.put(bVar3.a(), bVar3.b());
            }
        }
        String e2 = n.h().e();
        if (TextUtils.isEmpty(e2) && !n.f()) {
            e2 = (String) linkedHashMap.get("Reason-Phrase");
        }
        int b2 = n.b();
        if (bVar2 == null) {
            d(a.this, bVar.a, bVar.b, bVar.f6081c);
        }
        i.b h2 = i.h(b2);
        h2.h(e2);
        h2.g(linkedHashMap);
        h2.f(bVar2);
        return h2.e();
    }

    private void g(InterfaceC0701e<h> interfaceC0701e, com.bytedance.retrofit2.client.c cVar, long j, boolean z, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        if (interfaceC0701e instanceof q) {
            ((q) interfaceC0701e).doCollect();
        }
        com.bytedance.ttnet.i.b bVar = null;
        Object b2 = cVar != null ? cVar.b() : null;
        if (b2 instanceof com.bytedance.ttnet.i.b) {
            bVar = (com.bytedance.ttnet.i.b) b2;
            com.bytedance.rpc.log.b.a(bVar.A);
        }
        com.bytedance.ttnet.i.b bVar2 = bVar;
        if (bVar2 != null) {
            bVar2.i = j;
            bVar2.j = currentTimeMillis;
            long j2 = bVar2.f5086g;
            long j3 = currentTimeMillis - j2;
            String h = cVar.h();
            String g2 = RetrofitUtils.g(cVar.d(), "X-TT-LOGID");
            if (z) {
                f.t(j3, j2, h, g2, bVar2);
            } else {
                f.n(j3, j2, h, g2, bVar2, th);
            }
        }
        if (interfaceC0701e == null || interfaceC0701e.isCanceled()) {
            return;
        }
        interfaceC0701e.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private InterfaceC0701e<h> j(g gVar) throws Exception {
        int i;
        InterfaceC0701e<h> interfaceC0701e;
        com.bytedance.retrofit2.mime.f fVar;
        com.bytedance.retrofit2.mime.f fVar2;
        int d2 = gVar.d();
        String e2 = gVar.e();
        boolean g2 = gVar.g();
        e.b c2 = gVar.c();
        LinkedList linkedList = new LinkedList();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2.j());
        d dVar = new d();
        dVar.b = gVar.a();
        dVar.f5087c = gVar.b();
        dVar.f5088d = gVar.f();
        for (Map.Entry<String, String> entry : c2.i().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                linkedList.add(new com.bytedance.retrofit2.client.b(key, value));
            }
        }
        Pair<String, String> c3 = l.c(e2, linkedHashMap);
        String str = (String) c3.first;
        String str2 = (String) c3.second;
        WeakReference<RetrofitApi> weakReference = this.a.get(str);
        RetrofitApi retrofitApi = weakReference == null ? null : weakReference.get();
        if (retrofitApi == null) {
            retrofitApi = (RetrofitApi) RetrofitUtils.c(str, null, null).e(RetrofitApi.class);
            this.a.put(str, new WeakReference<>(retrofitApi));
        }
        if (!gVar.h()) {
            i = d2;
            interfaceC0701e = retrofitApi.get(g2, str2, linkedHashMap, linkedList, dVar);
        } else if (c2.k()) {
            interfaceC0701e = retrofitApi.form(g2, str2, linkedHashMap, new LinkedHashMap(c2.g()), linkedList, dVar);
            i = d2;
        } else {
            if (c2.l()) {
                com.bytedance.retrofit2.mime.e eVar = new com.bytedance.retrofit2.mime.e();
                for (Map.Entry<String, String> entry2 : c2.g().entrySet()) {
                    String key2 = entry2.getKey();
                    String value2 = entry2.getValue();
                    if (e.b.l.q.c.c(key2) && e.b.l.q.c.c(value2)) {
                        eVar.f(key2, "binary", new j(value2));
                    }
                }
                for (Map.Entry<String, File> entry3 : c2.h().entrySet()) {
                    String key3 = entry3.getKey();
                    File value3 = entry3.getValue();
                    if (value3 != null) {
                        if (e.b.l.q.c.a(key3)) {
                            key3 = value3.getName();
                        }
                        eVar.f(key3, "binary", new com.bytedance.retrofit2.mime.g(null, value3));
                    }
                }
                Iterator<com.bytedance.rpc.serialize.c> it2 = c2.f().iterator();
                while (it2.hasNext()) {
                    com.bytedance.rpc.serialize.c next = it2.next();
                    eVar.f(next.e(), "binary", new com.bytedance.retrofit2.mime.f(next.b(), next.c(), next.d()));
                    it2 = it2;
                    d2 = d2;
                }
                i = d2;
                fVar2 = eVar;
            } else {
                i = d2;
                List<com.bytedance.rpc.serialize.c> f2 = c2.f();
                if (f2.size() == 0) {
                    fVar = new com.bytedance.retrofit2.mime.f(null, e.b.l.q.c.f9649c, new String[0]);
                    interfaceC0701e = retrofitApi.post(g2, str2, linkedHashMap, fVar, linkedList, dVar);
                } else {
                    fVar2 = new com.bytedance.retrofit2.mime.f(f2.get(0).b(), f2.get(0).c(), new String[0]);
                }
            }
            fVar = fVar2;
            interfaceC0701e = retrofitApi.post(g2, str2, linkedHashMap, fVar, linkedList, dVar);
        }
        this.b.put(Integer.valueOf(i), new WeakReference<>(interfaceC0701e));
        return interfaceC0701e;
    }

    public void e(int i) {
        WeakReference<InterfaceC0701e<h>> weakReference = this.b.get(Integer.valueOf(i));
        if (weakReference != null && weakReference.get() != null && !weakReference.get().isCanceled()) {
            weakReference.get().cancel();
        }
        this.b.remove(Integer.valueOf(i));
    }

    public i h(g gVar) throws Exception {
        InterfaceC0701e<h> interfaceC0701e;
        try {
            interfaceC0701e = j(gVar);
            try {
                return f(interfaceC0701e, interfaceC0701e.execute());
            } catch (Throwable th) {
                th = th;
                try {
                    g(interfaceC0701e, null, System.currentTimeMillis(), false, th);
                    throw th;
                } finally {
                    this.b.remove(Integer.valueOf(gVar.d()));
                }
            }
        } catch (Throwable th2) {
            th = th2;
            interfaceC0701e = null;
        }
    }

    public void i(g gVar, com.bytedance.rpc.transport.b bVar) throws Exception {
        j(gVar).enqueue(new C0315a(bVar, gVar.d()));
    }
}
