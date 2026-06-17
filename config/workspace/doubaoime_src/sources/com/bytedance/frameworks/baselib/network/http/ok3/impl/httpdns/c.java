package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsRecord;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult;
import com.bytedance.frameworks.baselib.network.http.p.i;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements WeakHandler.IHandler {
    private static String r = "c";
    private static ExecutorService s = Executors.newFixedThreadPool(6);
    private static volatile c t;
    private static String u;
    private static HandlerThread v;
    private static WeakHandler w;

    /* renamed from: c, reason: collision with root package name */
    private volatile String f5168c;
    private final b m;
    private volatile e o;
    private AtomicBoolean a = new AtomicBoolean(true);
    private AtomicBoolean b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    private ConcurrentSkipListSet<String> f5169d = new ConcurrentSkipListSet<>();

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentMap<String, CopyOnWriteArrayList<String>> f5170e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private ConcurrentSkipListSet<String> f5171f = new ConcurrentSkipListSet<>();

    /* renamed from: g, reason: collision with root package name */
    private AtomicInteger f5172g = new AtomicInteger(30);
    private AtomicInteger h = new AtomicInteger(2000);
    private AtomicInteger i = new AtomicInteger(60);
    private AtomicInteger j = new AtomicInteger(0);
    private AtomicInteger k = new AtomicInteger(5);
    private AtomicInteger l = new AtomicInteger(5);
    private final com.bytedance.frameworks.baselib.network.http.ok3.impl.e n = new com.bytedance.frameworks.baselib.network.http.ok3.impl.e();
    private boolean p = false;
    private Handler q = new a(this, Looper.getMainLooper());

    class a extends Handler {
        a(c cVar, Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null || !(message.obj instanceof c)) {
                return;
            }
            Bundle data = message.getData();
            if (((com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a) data.getSerializable("callback_dnsresult_job_key")) == null) {
                if (Logger.debug()) {
                    Logger.d(c.r, "callback job is null");
                }
            } else {
                if (message.what != 1) {
                    return;
                }
                if (!Logger.debug()) {
                    throw null;
                }
                String str = c.r;
                StringBuilder U = e.a.a.a.a.U("callback dns result for host ", null, " in thread ");
                U.append(Thread.currentThread().getName());
                Logger.d(str, U.toString());
                throw null;
            }
        }
    }

    private c() {
        if (Logger.debug()) {
            Logger.d(r, "HttpDns constructor");
        }
        HandlerThread handlerThread = new HandlerThread("TTOK-HTTPDNS");
        v = handlerThread;
        handlerThread.start();
        w = new WeakHandler(v.getLooper(), this);
        u = "4.2.243.8-doubao";
        this.m = new b(w);
    }

    private void c(com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a aVar, DnsResult dnsResult) {
        if (Logger.debug()) {
            String str = r;
            Objects.requireNonNull(aVar);
            Logger.d(str, "doDnsResultCallback for host null");
        }
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 1;
        Bundle bundle = new Bundle();
        bundle.putSerializable("callback_dnsresult_job_key", aVar);
        bundle.putSerializable("callback_dnsresult_key", dnsResult);
        obtain.setData(bundle);
        this.q.sendMessage(obtain);
    }

    private DnsResult e(String str) {
        if (Logger.debug()) {
            Logger.d(r, "try to look up hardcode ips");
        }
        if (!this.f5170e.containsKey(str)) {
            return null;
        }
        DnsResult dnsResult = new DnsResult();
        Iterator<String> it2 = this.f5170e.get(str).iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.c.b(next)) {
                dnsResult.b.add(next);
            } else if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.c.a(next)) {
                dnsResult.a.add(next);
            } else if (Logger.debug()) {
                e.a.a.a.a.s0("find a invalid hardcode ip: ", next, r);
            }
        }
        dnsResult.f5162c = DnsResult.Source.HARDCODE_IPS;
        return dnsResult;
    }

    private DnsResult l(String str, boolean z) {
        Future<Void> w2;
        if (z) {
            return null;
        }
        if (this.m.p(str)) {
            w2 = this.m.l(str);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            w2 = w(arrayList, DnsRecord.CacheStaleReason.CACHE_UNSET, true);
        }
        if (w2 == null) {
            return null;
        }
        if (w2.isDone()) {
            return p(str, true);
        }
        try {
            w2.get(this.k.get() * 1000, TimeUnit.MILLISECONDS);
            return p(str, true);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            return null;
        }
    }

    public static c n() {
        if (t == null) {
            synchronized (c.class) {
                if (t == null) {
                    t = new c();
                }
            }
        }
        return t;
    }

    private DnsResult p(String str, boolean z) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("look up httpdns cache for host ", str, r);
        }
        DnsRecord i = this.m.i(str);
        if (i == null) {
            return null;
        }
        DnsResult dnsResult = new DnsResult();
        dnsResult.a = i.e();
        dnsResult.b = i.f();
        if (z) {
            if (i.d() + (i.g() * 1000) <= System.currentTimeMillis()) {
                return null;
            }
            dnsResult.f5162c = DnsResult.Source.HTTPDNS_REQUEST;
            return dnsResult;
        }
        if (i.d() + (i.g() * 1000) > System.currentTimeMillis()) {
            dnsResult.f5162c = DnsResult.Source.HTTPDNS_CACHE;
        } else {
            dnsResult.f5162c = DnsResult.Source.HTTPDNS_STALE_CACHE;
        }
        return dnsResult;
    }

    private DnsResult q(String str, boolean z) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("lookup localdns cache for host ", str, r);
        }
        DnsResult dnsResult = new DnsResult();
        DnsRecord m = this.m.m(str);
        if (m == null) {
            return null;
        }
        dnsResult.a = m.e();
        dnsResult.b = m.f();
        if (z) {
            dnsResult.f5162c = DnsResult.Source.LOCALDNS_REQUEST;
        } else {
            dnsResult.f5162c = DnsResult.Source.LOCALDNS_CACHE;
        }
        return dnsResult;
    }

    private void x(com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a aVar) {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(aVar);
        arrayList.add(null);
        w(arrayList, DnsRecord.CacheStaleReason.CACHE_UNSET, false);
        Message obtain = Message.obtain();
        obtain.what = 4;
        obtain.obj = this;
        Bundle bundle = new Bundle();
        bundle.putSerializable("dns_timeout_job_key", aVar);
        obtain.setData(bundle);
        w.sendMessageDelayed(obtain, this.k.get() * 1000);
    }

    private synchronized Future<Void> z(String str) {
        if (this.m.q(str)) {
            if (Logger.debug()) {
                Logger.d(r, "localdns is resolving for host : " + str);
            }
            return this.m.o(str);
        }
        if (Logger.debug()) {
            Logger.d(r, "submit localdns resolve host : " + str);
        }
        Future<Void> future = null;
        try {
            future = s.submit(new g(str, this.m, w));
            this.m.g(str, future);
        } catch (RejectedExecutionException e2) {
            e2.printStackTrace();
        }
        return future;
    }

    void b(List<String> list) {
        if (Logger.debug()) {
            Logger.d(r, "batchRefreshHttpDnsStaleCache for host " + list);
        }
        w(list, DnsRecord.CacheStaleReason.REFRESH_BATCH, false);
    }

    synchronized void d(DnsRecord.CacheStaleReason cacheStaleReason) {
        ConcurrentSkipListSet<String> concurrentSkipListSet;
        if (this.o != null && i.c(this.o.getContext()) && (concurrentSkipListSet = this.f5171f) != null && concurrentSkipListSet.size() != 0 && this.f5171f.size() <= 10) {
            if (Logger.debug()) {
                Logger.d(r, "do httpdns preload");
            }
            Iterator<String> it2 = this.f5171f.iterator();
            ArrayList arrayList = new ArrayList();
            while (it2.hasNext()) {
                String next = it2.next();
                if (!this.m.p(next)) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            if (Logger.debug()) {
                Logger.d(r, "httpdns batch preload for : " + arrayList);
            }
            w(arrayList, cacheStaleReason, false);
        }
    }

    public e f() {
        return this.o;
    }

    String g() {
        return this.f5168c;
    }

    ConcurrentSkipListSet<String> h() {
        return this.f5169d;
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (Logger.debug()) {
            String str = r;
            StringBuilder M = e.a.a.a.a.M("httpdns handler handle msg in ");
            M.append(Thread.currentThread().getName());
            Logger.d(str, M.toString());
        }
        if (message != null) {
            Object obj = message.obj;
            if ((obj instanceof c) || (obj instanceof d) || (obj instanceof g) || (obj instanceof DnsRecord) || (obj instanceof b)) {
                try {
                    if ((obj instanceof c) && message.what == 2) {
                        if (Logger.debug()) {
                            Logger.d(r, "MSG_HTTPDNS_PREFER_TIMEOUT");
                        }
                        com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a aVar = (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a) message.getData().getSerializable("httpdns_timeout_job_key");
                        if (aVar == null) {
                            if (Logger.debug()) {
                                Logger.d(r, "MSG_HTTPDNS_PREFER_TIMEOUT job is null");
                            }
                            return;
                        } else {
                            if (this.m.C(aVar)) {
                                if (Logger.debug()) {
                                    Logger.d(r, "httpdns request not return in httpdns prefer time for host : " + ((String) null));
                                }
                                c(aVar, q(null, false));
                                this.m.t(aVar);
                                return;
                            }
                            return;
                        }
                    }
                    if ((obj instanceof d) && message.what == 3) {
                        if (Logger.debug()) {
                            Logger.d(r, "MSG_HTTPDNS_COMPLETED");
                        }
                        ArrayList<String> stringArrayList = message.getData().getStringArrayList("httpdns_completed_hosts");
                        if (stringArrayList == null) {
                            if (Logger.debug()) {
                                Logger.d(r, "MSG_HTTPDNS_COMPLETED hostlist is null");
                                return;
                            }
                            return;
                        }
                        for (String str2 : stringArrayList) {
                            if (this.m.B(str2)) {
                                if (Logger.debug()) {
                                    Logger.d(r, "httpdns returned in httpdns prefer time for host : " + stringArrayList);
                                }
                                Iterator<com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a> it2 = this.m.k(str2).iterator();
                                while (it2.hasNext()) {
                                    com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a next = it2.next();
                                    DnsResult p = p(str2, true);
                                    if (n().b.get() && p == null) {
                                        Objects.requireNonNull(next);
                                        p = q(str2, false);
                                    }
                                    if (Logger.debug()) {
                                        Logger.d(r, "httpdns request is returned in prefer time for " + str2);
                                    }
                                    c(next, p);
                                    this.m.t(next);
                                }
                            }
                        }
                        return;
                    }
                    if ((obj instanceof g) && message.what == 1) {
                        if (Logger.debug()) {
                            Logger.d(r, "MSG_LOCALDNS_COMPLETED");
                        }
                        String string = message.getData().getString("localdns_completed_host");
                        if (string == null) {
                            if (Logger.debug()) {
                                Logger.d(r, "MSG_HTTPDNS_COMPLETED host is null");
                                return;
                            }
                            return;
                        }
                        if (this.m.D(string)) {
                            if (Logger.debug()) {
                                Logger.d(r, "localdns returned in localdns timeout for host : " + string);
                            }
                            Iterator<com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a> it3 = this.m.n(string).iterator();
                            while (it3.hasNext()) {
                                com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a next2 = it3.next();
                                DnsResult q = q(string, true);
                                if (q == null) {
                                    DnsResult p2 = p(string, false);
                                    if (p2 == null) {
                                        x(next2);
                                        this.m.c(null, next2);
                                    } else {
                                        c(next2, p2);
                                    }
                                } else {
                                    if (Logger.debug()) {
                                        Logger.d(r, "localdns request is returned in timeout for " + string);
                                    }
                                    c(next2, q);
                                }
                                this.m.x(next2);
                            }
                            return;
                        }
                        return;
                    }
                    if ((obj instanceof c) && message.what == 3) {
                        if (Logger.debug()) {
                            Logger.d(r, "MSG_LOCALDNS_REQUEST_TIMEOUT");
                        }
                        com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a aVar2 = (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a) message.getData().getSerializable("dns_timeout_job_key");
                        if (aVar2 == null) {
                            if (Logger.debug()) {
                                Logger.d(r, "MSG_HTTPDNS_PREFER_TIMEOUT job is null");
                                return;
                            }
                            return;
                        }
                        if (this.m.E(aVar2)) {
                            if (Logger.debug()) {
                                Logger.d(r, "local request not return in localdns timeout for host : " + ((String) null));
                            }
                            DnsResult p3 = p(null, false);
                            if (p3 != null) {
                                c(aVar2, p3);
                            } else {
                                if (!this.m.p(null)) {
                                    x(aVar2);
                                }
                                this.m.c(null, aVar2);
                            }
                            this.m.x(aVar2);
                            return;
                        }
                        return;
                    }
                    if ((obj instanceof c) && message.what == 4) {
                        if (Logger.debug()) {
                            Logger.d(r, "MSG_HTTPDNS_REQUEST_TIMEOUT");
                        }
                        com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a aVar3 = (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a) message.getData().getSerializable("dns_timeout_job_key");
                        if (aVar3 == null) {
                            if (Logger.debug()) {
                                Logger.d(r, "MSG_HTTPDNS_PREFER_TIMEOUT job is null");
                                return;
                            }
                            return;
                        } else {
                            if (this.m.C(aVar3)) {
                                c(aVar3, null);
                                this.m.t(aVar3);
                                return;
                            }
                            return;
                        }
                    }
                    if ((obj instanceof c) && message.what == 5) {
                        if (Logger.debug()) {
                            Logger.d(r, "MSG_LOAD_LOCAL_HARDCODEIPS");
                        }
                        String string2 = this.o.getContext().getSharedPreferences("dispatchersdk_httpdns_hardcodeips", 0).getString("httpdns_hardcodeips", "");
                        if (TextUtils.isEmpty(string2)) {
                            this.o.a();
                            return;
                        }
                        this.f5169d.clear();
                        try {
                            JSONArray jSONArray = new JSONArray(string2);
                            for (int i = 0; i < jSONArray.length(); i++) {
                                String optString = jSONArray.optString(i);
                                if (!TextUtils.isEmpty(optString)) {
                                    this.f5169d.add(optString);
                                }
                            }
                            return;
                        } catch (JSONException unused) {
                            if (Logger.debug()) {
                                Logger.d(r, "local httpdns hardcode ips not exists, use default");
                                return;
                            }
                            return;
                        }
                    }
                    if ((obj instanceof c) && message.what == 6) {
                        if (Logger.debug()) {
                            Logger.d(r, "network changed");
                        }
                        this.m.r(n().o.getContext());
                        return;
                    }
                    if ((obj instanceof c) && message.what == 7) {
                        if (Logger.debug()) {
                            Logger.d(r, "activity resume, detect ipv6 reachable");
                        }
                        y();
                        return;
                    }
                    if (!(obj instanceof DnsRecord)) {
                        if ((obj instanceof b) && message.what == 20) {
                            if (Logger.debug()) {
                                Logger.d(r, "reset httpdns domain failed count");
                            }
                            this.m.z();
                            return;
                        } else {
                            if (Logger.debug()) {
                                Logger.d(r, "HTTPDNS-CollectResult handler thread receive a unknown message : " + message);
                                return;
                            }
                            return;
                        }
                    }
                    String string3 = message.getData().getString("dnsrecord_host");
                    if (TextUtils.isEmpty(string3)) {
                        if (Logger.debug()) {
                            Logger.d(r, "DnsRecord refresh host is null");
                            return;
                        }
                        return;
                    }
                    switch (message.what) {
                        case 10:
                            if (Logger.debug()) {
                                Logger.d(r, "refresh httpdns cache for host : " + string3);
                            }
                            c n = n();
                            Objects.requireNonNull(n);
                            if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.a.a(string3) && !n.m.p(string3) && n.b.get()) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(string3);
                                n.w(arrayList, DnsRecord.CacheStaleReason.CACHE_STALE_EXPIRED, false);
                                break;
                            }
                            break;
                        case 11:
                            if (Logger.debug()) {
                                Logger.d(r, "remove localdns cache for host : " + string3);
                            }
                            c n2 = n();
                            Objects.requireNonNull(n2);
                            if (Logger.debug()) {
                                Logger.d(r, "removeLocalDnsStaleCache");
                            }
                            if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.a.a(string3)) {
                                n2.m.w(string3);
                                break;
                            }
                            break;
                        case 12:
                            if (Logger.debug()) {
                                Logger.d(r, "add host : " + string3 + " to stale cache host list");
                            }
                            n().m.e(string3);
                            break;
                        case 13:
                            if (Logger.debug()) {
                                Logger.d(r, "remove httpdns cache for host : " + string3);
                            }
                            c n3 = n();
                            Objects.requireNonNull(n3);
                            if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.a.a(string3) && !n3.m.p(string3)) {
                                n3.m.s(string3);
                                break;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public HandlerThread i() {
        return v;
    }

    AtomicInteger j() {
        return this.i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00af, code lost:
    
        if (((r3.g() * 1000) + r3.d()) <= (java.lang.System.currentTimeMillis() + r10.h.get())) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult k(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.k(java.lang.String):com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult");
    }

    AtomicInteger m() {
        return this.f5172g;
    }

    public AtomicBoolean o() {
        return this.b;
    }

    public void r() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 6;
        w.sendMessage(obtain);
    }

    public void s() {
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 7;
        w.sendMessage(obtain);
    }

    public void t(JSONObject jSONObject) {
        if (Logger.debug()) {
            Logger.d(r, "onServerConfigChanged");
        }
        if (this.o == null || jSONObject == null) {
            return;
        }
        int optInt = jSONObject.optInt("ttnet_http_dns_enabled", -1);
        if (optInt >= 0) {
            this.a.set(optInt == 1);
        }
        String optString = jSONObject.optString("ttnet_tt_http_dns_domain");
        if (!TextUtils.isEmpty(optString)) {
            this.f5168c = optString;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("ttnet_tt_http_dns_preload_batch_host");
        if (optJSONArray != null) {
            this.f5171f.clear();
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString2 = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString2)) {
                    this.f5171f.add(optString2);
                }
            }
        }
        int optInt2 = jSONObject.optInt("localdns_cache_ttl", -1);
        if (optInt2 >= 0) {
            this.f5172g.set(optInt2);
        }
        int optInt3 = jSONObject.optInt("httpdns_prefer_time_ms", -1);
        if (optInt3 >= 0) {
            this.h.set(optInt3);
        }
        int optInt4 = jSONObject.optInt("httpdns_stale_cache_interval", -1);
        if (optInt4 >= 0) {
            this.i.set(optInt4);
        }
        int optInt5 = jSONObject.optInt("enable_compare_localdns_httpdns", -1);
        if (optInt5 >= 0) {
            this.j.set(optInt5);
        }
        int optInt6 = jSONObject.optInt("ttnet_http_dns_prefer", -1);
        if (optInt6 >= 0) {
            this.b.set(optInt6 == 1);
        }
        int optInt7 = jSONObject.optInt("ttnet_http_dns_timeout", -1);
        if (optInt7 >= 0) {
            this.k.set(optInt7);
        }
        int optInt8 = jSONObject.optInt("ttnet_local_dns_time_out", -1);
        if (optInt8 >= 0) {
            this.l.set(optInt8);
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("ttnet_http_dns_addr");
        if (optJSONObject != null) {
            this.f5170e.clear();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String optString3 = optJSONObject.optString(next);
                if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(optString3)) {
                    String[] split = optString3.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    if (next.equals(this.f5168c)) {
                        this.f5169d.clear();
                        this.f5169d.addAll(Arrays.asList(split));
                    } else {
                        this.f5170e.put(next, new CopyOnWriteArrayList<>(Arrays.asList(split)));
                    }
                }
            }
        }
    }

    public void u(e eVar) {
        if (this.p) {
            if (Logger.debug()) {
                Logger.d(r, "you have set httpdns depend before.");
                return;
            }
            return;
        }
        if (eVar.getContext() == null || TextUtils.isEmpty(eVar.c()) || eVar.getAppId() == null) {
            this.o = null;
            throw new IllegalArgumentException("you must set correct httpdns depend");
        }
        this.o = eVar;
        if (TextUtils.isEmpty(this.f5168c)) {
            this.f5168c = eVar.c();
        }
        this.p = true;
        y();
        this.n.a(eVar.getContext());
        if (this.f5171f.size() < 1) {
            this.o.b();
            if (Logger.debug()) {
                Logger.d(r, "httpdns preload domains's number must less than 10, httpdns preload is skipped.");
            }
        } else {
            d(DnsRecord.CacheStaleReason.PRELOAD_BATCH);
        }
        Message obtain = Message.obtain();
        obtain.what = 5;
        obtain.obj = this;
        w.sendMessage(obtain);
    }

    void v(JSONArray jSONArray) {
        if (jSONArray.length() > 0) {
            this.f5169d.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    this.f5169d.add(optString);
                }
            }
            SharedPreferences.Editor edit = this.o.getContext().getSharedPreferences("dispatchersdk_httpdns_hardcodeips", 0).edit();
            edit.putString("httpdns_hardcodeips", String.valueOf(jSONArray));
            edit.apply();
        }
    }

    synchronized Future<Void> w(List<String> list, DnsRecord.CacheStaleReason cacheStaleReason, boolean z) {
        Future<Void> future = null;
        if (list != null) {
            if (list.size() != 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (this.m.p(list.get(i))) {
                        if (z && list.size() == 1 && i == 0) {
                            future = this.m.l(list.get(i));
                            if (Logger.debug()) {
                                Logger.d(r, "sync block request for " + list.get(i) + " is resolving");
                            }
                        }
                        list.remove(list.get(i));
                    }
                }
                if (list.size() == 0) {
                    return future;
                }
                if (Logger.debug()) {
                    Logger.d(r, "submit httpdns resolve for host : " + list);
                }
                try {
                    future = s.submit(new d(com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.a.b(list), u, this.m, cacheStaleReason, w));
                    for (String str : list) {
                        this.m.d(str, future);
                        if (this.b.get()) {
                            this.m.v(str);
                        }
                    }
                } catch (RejectedExecutionException e2) {
                    e2.printStackTrace();
                    if (Logger.debug()) {
                        Logger.d(r, "submit httpdns resolve for host : " + list + " was rejected");
                    }
                }
                return future;
            }
        }
        if (Logger.debug()) {
            Logger.d(r, "httpdns resolve hostlist is null.");
        }
        return null;
    }

    void y() {
        try {
            s.submit(new f());
        } catch (RejectedExecutionException e2) {
            e2.printStackTrace();
        }
    }
}
