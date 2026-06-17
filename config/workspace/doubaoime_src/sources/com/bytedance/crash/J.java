package com.bytedance.crash;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.jni.NativeBridge;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class J {
    private static boolean t;
    private static boolean u;
    private ICrashFilter p;
    private InterfaceC0649d q;
    private boolean r;
    private volatile boolean s = true;
    private final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, String> b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentHashMap<String, String> f4387c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.crash.util.b<CrashType, AttachUserData> f4388d = new com.bytedance.crash.util.b<>();

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.crash.util.b<CrashType, ICrashCallback> f4389e = new com.bytedance.crash.util.b<>();

    /* renamed from: f, reason: collision with root package name */
    private final com.bytedance.crash.util.b<CrashType, C0648c> f4390f = new com.bytedance.crash.util.b<>();

    /* renamed from: g, reason: collision with root package name */
    private final List<IOOMCallback> f4391g = new CopyOnWriteArrayList();
    private final List<IOOMCallback> h = new CopyOnWriteArrayList();
    private final List<InterfaceC0654i> i = new CopyOnWriteArrayList();
    private final List<q> l = new CopyOnWriteArrayList();
    private final List<InterfaceC0655j> m = new CopyOnWriteArrayList();
    private final Map<String, LinkedList<String>> n = new ConcurrentHashMap();
    private final Map<String, Integer> o = new ConcurrentHashMap();
    private final com.bytedance.crash.util.b<CrashType, r> j = new com.bytedance.crash.util.b<>();
    private final com.bytedance.crash.util.b<CrashType, v> k = new com.bytedance.crash.util.b<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Map.Entry entry : J.this.a.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!TextUtils.isEmpty(str)) {
                    NativeBridge.M(str, str2);
                }
            }
            J.this.s = true;
        }
    }

    public static boolean E() {
        return t;
    }

    private boolean F(CrashType crashType, JSONObject jSONObject) {
        ICrashFilter iCrashFilter = this.p;
        if (iCrashFilter == null) {
            return false;
        }
        if (crashType == CrashType.NATIVE) {
            return !this.p.onNativeCrashFilter(jSONObject.optString(RemoteMessageConst.DATA), jSONObject.optString("crash_thread_name"));
        }
        if (crashType == CrashType.ANR && (iCrashFilter instanceof k)) {
            return !((k) this.p).a(jSONObject.optString(RemoteMessageConst.DATA), jSONObject.optString("anr_info"));
        }
        return false;
    }

    public static void V(boolean z) {
        t = z;
    }

    static void X(boolean z) {
        u = z;
    }

    @NonNull
    public List<q> A() {
        return this.l;
    }

    @NonNull
    public List<r> B(CrashType crashType) {
        List<r> b;
        synchronized (this.j) {
            b = this.j.b(crashType);
        }
        return b;
    }

    public ConcurrentHashMap<Integer, String> C() {
        return this.b;
    }

    public List<v> D(CrashType crashType) {
        List<v> b;
        synchronized (this.k) {
            b = this.k.b(crashType);
        }
        return b;
    }

    public boolean G(Thread thread, Throwable th) {
        try {
            ICrashFilter iCrashFilter = this.p;
            if (iCrashFilter != null) {
                return !iCrashFilter.onJavaCrashFilter(th, thread);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean H() {
        return this.r;
    }

    public void I(String str, String str2) {
        this.f4387c.put(str, str2);
    }

    public void J(int i, String str) {
        this.b.put(Integer.valueOf(i), str);
    }

    public void K(CrashType crashType, AttachUserData attachUserData) {
        if (attachUserData != null) {
            synchronized (this.f4388d) {
                if (crashType == CrashType.ALL) {
                    this.f4388d.c(attachUserData);
                } else {
                    this.f4388d.b(crashType).remove(attachUserData);
                }
            }
        }
    }

    public void L(ICrashCallback iCrashCallback, CrashType crashType) {
        synchronized (this.f4389e) {
            if (crashType == CrashType.ALL) {
                this.f4389e.c(iCrashCallback);
            } else {
                this.f4389e.b(crashType).remove(iCrashCallback);
            }
        }
    }

    void M(String str) {
        this.n.remove(str);
    }

    public void N(String str) {
        if (!NativeBridge.F() || !this.r) {
            this.a.remove(str);
        } else if (this.s) {
            NativeBridge.N(str);
        } else {
            this.a.remove(str);
        }
    }

    public void O(IOOMCallback iOOMCallback) {
        this.h.remove(iOOMCallback);
    }

    public void P(IOOMCallback iOOMCallback) {
        this.f4391g.remove(iOOMCallback);
    }

    public void Q(q qVar) {
        this.l.remove(qVar);
    }

    public void R(r rVar, CrashType crashType) {
        synchronized (this.j) {
            if (crashType == CrashType.ALL) {
                this.j.c(rVar);
            } else {
                this.j.b(crashType).remove(rVar);
            }
        }
    }

    public void S(v vVar, CrashType crashType) {
        synchronized (this.k) {
            if (crashType == CrashType.ALL) {
                this.k.c(vVar);
            } else {
                this.k.b(crashType).remove(vVar);
            }
        }
    }

    public void T(ICrashFilter iCrashFilter) {
        this.p = iCrashFilter;
    }

    public void U(String str, int i) {
        this.o.put(str, Integer.valueOf(i));
    }

    public void W(boolean z) {
        if (!this.r && z) {
            this.r = true;
            if (!this.a.isEmpty() && NativeBridge.F()) {
                this.s = false;
                com.bytedance.crash.runtime.b.d(new a());
            }
        }
        this.r = z;
    }

    public void Y(InterfaceC0649d interfaceC0649d) {
        this.q = interfaceC0649d;
    }

    public void c(InterfaceC0654i interfaceC0654i) {
        this.i.add(interfaceC0654i);
    }

    public void d(InterfaceC0655j interfaceC0655j) {
        this.m.add(interfaceC0655j);
    }

    public void e(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            synchronized (this.f4388d) {
                if (crashType == CrashType.ALL) {
                    this.f4388d.a(attachUserData, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE);
                } else {
                    this.f4388d.b(crashType).add(attachUserData);
                }
            }
        }
    }

    public void f(ICrashCallback iCrashCallback, CrashType crashType) {
        synchronized (this.f4389e) {
            if (crashType == CrashType.ALL) {
                this.f4389e.a(iCrashCallback, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            } else {
                this.f4389e.b(crashType).add(iCrashCallback);
            }
        }
    }

    public void g(C0648c c0648c, CrashType crashType) {
        synchronized (this.f4390f) {
            if (crashType == CrashType.ALL) {
                this.f4390f.a(c0648c, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            } else {
                this.f4390f.b(crashType).add(c0648c);
            }
        }
    }

    void h(@NonNull String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (!this.n.containsKey(str)) {
            synchronized (this.n) {
                if (!this.n.containsKey(str)) {
                    this.n.put(str, new LinkedList<>());
                }
            }
        }
        LinkedList<String> linkedList = this.n.get(str);
        if (linkedList == null) {
            return;
        }
        synchronized (linkedList) {
            if (linkedList.contains(str2)) {
                return;
            }
            if (this.o.containsKey(str)) {
                if (linkedList.size() > this.o.get(str).intValue()) {
                    linkedList.removeFirst();
                }
                linkedList.add(str2);
            } else {
                linkedList.add(str2);
            }
        }
    }

    public void i(String str, String str2) {
        if (NativeBridge.F() && this.r) {
            if (str2 == null) {
                NativeBridge.N(str);
                return;
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                NativeBridge.M(str, str2);
                return;
            }
        }
        if (str2 == null) {
            this.a.remove(str);
        } else if (str != null) {
            this.a.put(str, str2);
        }
    }

    public void j(Map<? extends String, ? extends String> map) {
        try {
            if (map.isEmpty()) {
                return;
            }
            for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (NativeBridge.F() && this.r) {
                    if (value == null) {
                        NativeBridge.N(key);
                    } else if (!TextUtils.isEmpty(key)) {
                        NativeBridge.M(key, value);
                    }
                } else if (value == null) {
                    this.a.remove(key);
                } else if (key != null) {
                    this.a.put(key, value);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void k(IOOMCallback iOOMCallback) {
        this.h.add(iOOMCallback);
    }

    public void l(IOOMCallback iOOMCallback) {
        this.f4391g.add(iOOMCallback);
    }

    public void m(q qVar) {
        this.l.add(qVar);
    }

    public void n(r rVar, CrashType crashType) {
        synchronized (this.j) {
            if (crashType == CrashType.ALL) {
                this.j.a(rVar, CrashType.NATIVE, CrashType.ANR, CrashType.JAVA, CrashType.LAUNCH);
            } else {
                this.j.b(crashType).add(rVar);
            }
        }
    }

    public void o(v vVar, CrashType crashType) {
        synchronized (this.k) {
            if (crashType == CrashType.ALL) {
                this.k.a(vVar, CrashType.ANR, CrashType.LAUNCH, CrashType.JAVA, CrashType.DART, CrashType.GAME, CrashType.NATIVE);
            } else {
                this.k.b(crashType).add(vVar);
            }
        }
    }

    public boolean p(CrashType crashType, JSONObject jSONObject) {
        try {
            if (F(crashType, jSONObject)) {
                return true;
            }
            InterfaceC0649d interfaceC0649d = this.q;
            if (interfaceC0649d != null) {
                interfaceC0649d.a(crashType, jSONObject);
            }
            if (crashType != CrashType.ANR) {
                return false;
            }
            long optLong = jSONObject.optLong("app_start_time");
            long optLong2 = jSONObject.optLong("crash_time");
            String optString = jSONObject.optString("process_name");
            Iterator<InterfaceC0655j> it2 = this.m.iterator();
            while (it2.hasNext()) {
                it2.next().a(optLong, optLong2, optString, jSONObject);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    @NonNull
    public void q() {
        this.a.clear();
    }

    @Nullable
    public List<AttachUserData> r(CrashType crashType) {
        List<AttachUserData> b;
        synchronized (this.f4388d) {
            b = this.f4388d.b(crashType);
        }
        return b;
    }

    public Map<String, String> s(CrashType crashType) {
        List<AttachUserData> b;
        synchronized (this.f4388d) {
            b = this.f4388d.b(crashType);
        }
        HashMap hashMap = new HashMap();
        Iterator<AttachUserData> it2 = b.iterator();
        while (it2.hasNext()) {
            Map<? extends String, ? extends String> userData = it2.next().getUserData(crashType);
            if (userData != null) {
                hashMap.putAll(userData);
            }
        }
        return hashMap;
    }

    @NonNull
    public Map<String, String> t() {
        return (NativeBridge.F() && this.r) ? NativeBridge.x() : this.a;
    }

    @NonNull
    public List<ICrashCallback> u(CrashType crashType) {
        List<ICrashCallback> b;
        synchronized (this.f4389e) {
            b = this.f4389e.b(crashType);
        }
        return b;
    }

    @NonNull
    public List<C0648c> v(CrashType crashType) {
        List<C0648c> b;
        synchronized (this.f4390f) {
            b = this.f4390f.b(crashType);
        }
        return b;
    }

    public Map<String, JSONArray> w() {
        HashMap hashMap = new HashMap();
        for (String str : this.n.keySet()) {
            JSONArray jSONArray = new JSONArray();
            LinkedList<String> linkedList = this.n.get(str);
            if (linkedList != null) {
                synchronized (linkedList) {
                    Iterator<String> it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put(it2.next());
                    }
                }
            }
            hashMap.put(str, jSONArray);
        }
        return hashMap;
    }

    @NonNull
    public Map<String, String> x() {
        return I.l() != null ? I.m() : (NativeBridge.F() && this.r) ? NativeBridge.x() : this.a;
    }

    @NonNull
    public JSONObject y() {
        return new JSONObject(this.f4387c);
    }

    @NonNull
    public List<IOOMCallback> z() {
        return this.f4391g;
    }
}
