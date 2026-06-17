package com.bytedance.ttnet.utils;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.frameworks.baselib.network.http.f;
import com.bytedance.frameworks.baselib.network.http.p.e;
import com.bytedance.frameworks.baselib.network.http.p.g;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.bytedance.retrofit2.H;
import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.InterfaceC0702f;
import com.bytedance.retrofit2.InterfaceC0705i;
import com.bytedance.retrofit2.N;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.retrofit2.r;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.TTNetInit;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RetrofitUtils {
    private static volatile CopyOnWriteArrayList<com.bytedance.retrofit2.S.a> a = new CopyOnWriteArrayList<>();
    private static g<String, H> b;

    /* renamed from: c, reason: collision with root package name */
    private static g<String, H> f6263c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6264d = 0;

    public enum CompressType {
        NONE(0),
        GZIP(1),
        DEFLATER(2);

        final int nativeInt;

        CompressType(int i) {
            this.nativeInt = i;
        }
    }

    class a implements a.InterfaceC0309a {
        a() {
        }

        @Override // com.bytedance.retrofit2.client.a.InterfaceC0309a
        public com.bytedance.retrofit2.client.a get() {
            return new com.bytedance.ttnet.l.b();
        }
    }

    class b implements a.InterfaceC0309a {
        b() {
        }

        @Override // com.bytedance.retrofit2.client.a.InterfaceC0309a
        public com.bytedance.retrofit2.client.a get() {
            return new com.bytedance.ttnet.l.b();
        }
    }

    static {
        H.n(a);
        b = new g<>(10);
        f6263c = new g<>(10);
    }

    public static synchronized void a(com.bytedance.retrofit2.S.a aVar) {
        synchronized (RetrofitUtils.class) {
            if (!a.contains(aVar)) {
                a.add(aVar);
            }
            d.d(b, aVar);
            d.d(f6263c, aVar);
        }
    }

    public static synchronized H b(List<com.bytedance.retrofit2.S.a> list, List<InterfaceC0705i.a> list2, List<InterfaceC0702f.a> list3, a.InterfaceC0309a interfaceC0309a, String str) {
        boolean z;
        H d2;
        synchronized (RetrofitUtils.class) {
            if (interfaceC0309a == null) {
                interfaceC0309a = new b();
            }
            H.b bVar = new H.b();
            bVar.g(str);
            bVar.e(interfaceC0309a);
            bVar.f(new com.bytedance.frameworks.baselib.network.http.n.c());
            if (list2 == null) {
                list2 = new ArrayList<>();
            }
            if (list2.isEmpty()) {
                list2.add(com.bytedance.frameworks.baselib.network.http.n.d.a.a.f());
            }
            Iterator<InterfaceC0705i.a> it2 = list2.iterator();
            while (it2.hasNext()) {
                bVar.b(it2.next());
            }
            if (list3 != null && !list3.isEmpty()) {
                Iterator<InterfaceC0702f.a> it3 = list3.iterator();
                while (it3.hasNext()) {
                    bVar.a(it3.next());
                }
            }
            LinkedList linkedList = new LinkedList();
            if (list == null || list.size() <= 0) {
                z = false;
            } else {
                z = false;
                for (com.bytedance.retrofit2.S.a aVar : list) {
                    if (aVar instanceof com.bytedance.ttnet.l.a) {
                        if (!z) {
                            linkedList.add(aVar);
                            z = true;
                            linkedList.add(aVar);
                        }
                    } else if (!(aVar instanceof com.bytedance.frameworks.baselib.network.http.n.b)) {
                        linkedList.add(aVar);
                    }
                }
            }
            if (!z) {
                linkedList.add(0, new com.bytedance.ttnet.l.a());
            }
            if (a != null && a.size() > 0) {
                linkedList.addAll(a);
            }
            linkedList.add(new com.bytedance.frameworks.baselib.network.http.n.b());
            Iterator it4 = linkedList.iterator();
            while (it4.hasNext()) {
                bVar.c((com.bytedance.retrofit2.S.a) it4.next());
            }
            d2 = bVar.d();
        }
        return d2;
    }

    public static synchronized H c(String str, List<com.bytedance.retrofit2.S.a> list, InterfaceC0705i.a aVar) {
        H d2;
        synchronized (RetrofitUtils.class) {
            d2 = d(str, list, aVar, null);
        }
        return d2;
    }

    public static synchronized H d(String str, List<com.bytedance.retrofit2.S.a> list, InterfaceC0705i.a aVar, InterfaceC0702f.a aVar2) {
        ArrayList arrayList;
        H b2;
        synchronized (RetrofitUtils.class) {
            a aVar3 = new a();
            synchronized (RetrofitUtils.class) {
                if (aVar != null) {
                    try {
                        arrayList = new ArrayList();
                        arrayList.add(aVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    arrayList = null;
                }
                b2 = b(list, arrayList, null, aVar3, str);
            }
            return b2;
        }
        return b2;
    }

    public static synchronized <S> S e(String str, Class<S> cls) {
        S s;
        synchronized (RetrofitUtils.class) {
            H j = j(str);
            synchronized (RetrofitUtils.class) {
                s = j != null ? (S) j.e(cls) : null;
            }
            return s;
        }
        return s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.bytedance.ttnet.INetworkApi] */
    @Deprecated
    public static boolean f(int i, String str, String str2, String str3, String str4, e eVar, String str5, List list, String[] strArr, int[] iArr) throws Exception {
        InterfaceC0701e<h> interfaceC0701e;
        boolean z;
        List<com.bytedance.retrofit2.client.b> list2;
        JSONObject jSONObject;
        h a2;
        InputStream d2;
        boolean z2 = false;
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> c2 = l.c(str, linkedHashMap);
        String str6 = (String) c2.first;
        String str7 = (String) c2.second;
        ?? r3 = (INetworkApi) e(str6, INetworkApi.class);
        com.bytedance.ttnet.i.d dVar = new com.bytedance.ttnet.i.d();
        if (r3 == null) {
            return false;
        }
        ?? r10 = 0;
        r10 = 0;
        r10 = 0;
        try {
            interfaceC0701e = r3.downloadFile(false, i, str7, linkedHashMap, null, dVar);
            try {
                if (!NetworkUtils.h(((com.bytedance.android.input.ttnet.d) TTNetInit.getTTNetDepend()).c())) {
                    try {
                        com.bytedance.frameworks.baselib.network.http.parser.e.k(null);
                        if (interfaceC0701e != null) {
                            interfaceC0701e.cancel();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    return false;
                }
                com.bytedance.frameworks.baselib.network.http.b o = com.bytedance.frameworks.baselib.network.http.b.o();
                f.d e2 = f.e();
                if (e2 == null || !((com.bytedance.ttnet.config.b) e2).k(str)) {
                    z = false;
                } else {
                    com.bytedance.frameworks.baselib.network.connectionclass.b.e().c();
                    z = true;
                }
                try {
                    N<h> execute = interfaceC0701e.execute();
                    try {
                        if (execute == null) {
                            if (z) {
                                com.bytedance.frameworks.baselib.network.connectionclass.b.e().d();
                            }
                            try {
                                com.bytedance.frameworks.baselib.network.http.parser.e.k(null);
                                interfaceC0701e.cancel();
                            } catch (Throwable th2) {
                                th2.printStackTrace();
                            }
                            return false;
                        }
                        try {
                            Object b2 = execute.h().b();
                            if (b2 instanceof com.bytedance.frameworks.baselib.network.http.b) {
                                o = (com.bytedance.frameworks.baselib.network.http.b) b2;
                            }
                            a2 = execute.a();
                            d2 = a2 != null ? a2.d() : null;
                            try {
                                list2 = execute.e();
                            } catch (Exception e3) {
                                e = e3;
                                list2 = null;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            list2 = null;
                        }
                        try {
                            i(o, null, list2, dVar, null);
                            int b3 = execute.b();
                            if (b3 != 200 || a2 == null) {
                                if (b3 == 200 && a2 == null) {
                                    throw new IllegalArgumentException("HTTP TypedInput may not be null");
                                }
                                throw new com.bytedance.frameworks.baselib.network.http.l.c(b3, "get url = " + str + " exception");
                            }
                            a2.length();
                            boolean m = com.bytedance.frameworks.baselib.network.http.parser.e.m(d2, a2.length(), new c(str, interfaceC0701e), i, str2, null, str4, null, null);
                            if (z) {
                                com.bytedance.frameworks.baselib.network.connectionclass.b.e().d();
                            }
                            try {
                                com.bytedance.frameworks.baselib.network.http.parser.e.k(d2);
                                interfaceC0701e.cancel();
                            } catch (Throwable th3) {
                                th3.printStackTrace();
                            }
                            return m;
                        } catch (Exception e5) {
                            e = e5;
                            if (o == null && (interfaceC0701e instanceof r)) {
                                Object requestInfo = ((r) interfaceC0701e).getRequestInfo();
                                if (requestInfo instanceof com.bytedance.frameworks.baselib.network.http.b) {
                                    o = (com.bytedance.frameworks.baselib.network.http.b) requestInfo;
                                }
                            }
                            i(o, null, list2, dVar, e);
                            if (o != null && (jSONObject = o.B) != null) {
                                jSONObject.put("ex", e.getMessage());
                            }
                            throw e;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r10 = linkedHashMap;
                        z2 = z;
                        try {
                            if (th instanceof Exception) {
                                throw th;
                            }
                            throw new Exception(th.getMessage(), th.getCause());
                        } finally {
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            interfaceC0701e = null;
        }
    }

    public static String g(List<com.bytedance.retrofit2.client.b> list, String str) {
        if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        for (com.bytedance.retrofit2.client.b bVar : list) {
            if (str.equalsIgnoreCase(bVar.a())) {
                return bVar.b();
            }
        }
        return "";
    }

    public static String h(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                if (Logger.debug()) {
                    Logger.d("RetrofitUtils", "getHostAddress remoteIp = " + split[0]);
                }
                return split[0];
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return "";
    }

    private static void i(com.bytedance.frameworks.baselib.network.http.b bVar, String[] strArr, List<com.bytedance.retrofit2.client.b> list, com.bytedance.ttnet.i.d dVar, Exception exc) {
        String str = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (com.bytedance.retrofit2.client.b bVar2 : list) {
                        if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar2.a())) {
                            str = bVar2.b();
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
                return;
            }
        }
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            str = dVar.a;
        }
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            str = h(exc);
        }
        if (com.bytedance.android.input.k.b.a.Y(str)) {
            return;
        }
        if (strArr != null && strArr.length > 0) {
            strArr[0] = str;
        }
        if (bVar != null) {
            bVar.s = str;
            T t = bVar.f5082c;
            if (t != 0) {
                t.a = str;
            }
        }
    }

    public static synchronized H j(String str) {
        synchronized (RetrofitUtils.class) {
            if (com.bytedance.android.input.k.b.a.Y(str)) {
                return null;
            }
            H b2 = b.b(str);
            if (b2 != null) {
                return b2;
            }
            H d2 = d(str, null, null, null);
            b.d(str, d2);
            return d2;
        }
    }

    public static synchronized void k(com.bytedance.retrofit2.S.a aVar) {
        synchronized (RetrofitUtils.class) {
            if (aVar == null) {
                return;
            }
            if (a.contains(aVar)) {
                a.remove(aVar);
                d.e(b, aVar);
                d.e(f6263c, aVar);
            }
        }
    }
}
