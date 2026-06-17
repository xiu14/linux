package com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction;
import com.bytedance.frameworks.baselib.network.http.p.l;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    private static final String m = "j";
    private static volatile j n;
    private static AtomicBoolean o = new AtomicBoolean(false);
    private Context a = null;
    private AtomicBoolean b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    private AtomicLong f5218c = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private List<i> f5219d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantReadWriteLock f5220e = new ReentrantReadWriteLock();

    /* renamed from: f, reason: collision with root package name */
    private List<b> f5221f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final ReentrantReadWriteLock f5222g = new ReentrantReadWriteLock();
    private AtomicInteger h = new AtomicInteger(0);
    private AtomicLong i = new AtomicLong(0);
    private ConcurrentMap<String, String> j = new ConcurrentHashMap();
    private String k;
    private String l;

    static class a implements Comparator<BaseDispatchAction> {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(BaseDispatchAction baseDispatchAction, BaseDispatchAction baseDispatchAction2) {
            return baseDispatchAction.b() - baseDispatchAction2.b();
        }
    }

    public static j k() {
        if (n == null) {
            synchronized (j.class) {
                if (n == null) {
                    n = new j();
                }
            }
        }
        return n;
    }

    private void o(JSONObject jSONObject) {
        int optInt;
        JSONObject optJSONObject;
        String optString = jSONObject.optString("action");
        if (TextUtils.isEmpty(optString) || (optInt = jSONObject.optInt("act_priority", -1)) < 0 || (optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.MessageBody.PARAM)) == null) {
            return;
        }
        String optString2 = jSONObject.optString("lifecycle");
        long j = 0;
        long j2 = -1;
        if ("".equals(optString2)) {
            j2 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            if (com.bytedance.frameworks.baselib.network.http.p.h.e(optString2, arrayList) && arrayList.size() == 2) {
                j = ((Long) arrayList.get(0)).longValue();
                j2 = ((Long) arrayList.get(1)).longValue();
            } else {
                j = -1;
            }
        }
        long optInt2 = jSONObject.optInt("rule_id");
        String optString3 = jSONObject.optString("sign");
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("request_method");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                String optString4 = optJSONArray.optString(i);
                if (!TextUtils.isEmpty(optString4)) {
                    arrayList2.add(optString4);
                }
            }
        }
        BaseDispatchAction a2 = BaseDispatchAction.a(optString, optJSONObject, optInt, j, j2, optInt2, optString3, this.f5218c.get(), arrayList2, jSONObject.optInt("set_req_priority", optInt));
        if (a2 instanceof i) {
            this.f5219d.add((i) a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p(org.json.JSONObject r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "act_priority"
            r3 = -1
            int r6 = r1.optInt(r2, r3)
            if (r6 >= 0) goto Le
            return
        Le:
            java.lang.String r2 = "param"
            org.json.JSONObject r5 = r1.optJSONObject(r2)
            if (r5 != 0) goto L17
            return
        L17:
            java.lang.String r2 = "lifecycle"
            java.lang.String r1 = r1.optString(r2)
            java.lang.String r2 = ""
            boolean r2 = r2.equals(r1)
            r3 = 0
            r7 = -1
            if (r2 == 0) goto L2a
            goto L55
        L2a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r1 = com.bytedance.frameworks.baselib.network.http.p.h.e(r1, r2)
            r3 = 1
            if (r1 != r3) goto L54
            int r1 = r2.size()
            r4 = 2
            if (r1 != r4) goto L54
            r1 = 0
            java.lang.Object r1 = r2.get(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r7 = r1.longValue()
            java.lang.Object r1 = r2.get(r3)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r9 = r1
            goto L57
        L54:
            r3 = r7
        L55:
            r7 = r3
            r9 = r7
        L57:
            r11 = 0
            java.util.concurrent.atomic.AtomicLong r1 = r0.f5218c
            long r14 = r1.get()
            r16 = 0
            r17 = 0
            java.lang.String r4 = "delay"
            java.lang.String r13 = ""
            com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction r1 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.BaseDispatchAction.a(r4, r5, r6, r7, r9, r11, r13, r14, r16, r17)
            boolean r2 = r1 instanceof com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.b
            if (r2 == 0) goto L76
            java.util.List<com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.b> r2 = r0.f5221f
            com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.b r1 = (com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.b) r1
            r2.add(r1)
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.p(org.json.JSONObject):void");
    }

    public Context a() {
        return this.a;
    }

    public int b(String str, String str2) {
        if (Logger.debug()) {
            e.a.a.a.a.s0("getDelayResultForUrl: ", str, m);
        }
        if (!l.a(str)) {
            if (Logger.debug()) {
                Logger.d(m, "illegal url");
            }
            return 0;
        }
        this.f5222g.readLock().lock();
        ArrayList arrayList = new ArrayList();
        arrayList.add(0, 0);
        Iterator<b> it2 = this.f5221f.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b next = it2.next();
            if (Logger.debug()) {
                String str3 = m;
                StringBuilder M = e.a.a.a.a.M("current action priority is ");
                M.append(next.b());
                Logger.d(str3, M.toString());
            }
            if (next.l(str, str2, arrayList) == BaseDispatchAction.DispatchResultEnum.DISPATCH_DELAY) {
                if (Logger.debug()) {
                    Logger.d(m, "the url has been delayed by delay action, skip follow-up actions");
                }
            }
        }
        this.f5222g.readLock().unlock();
        return ((Integer) arrayList.get(0)).intValue();
    }

    public d c(k kVar) {
        if (Logger.debug()) {
            String str = m;
            StringBuilder M = e.a.a.a.a.M("getDispatchResultForUrl: ");
            M.append(kVar.d());
            Logger.d(str, M.toString());
        }
        if (!l.a(kVar.d())) {
            if (Logger.debug()) {
                Logger.d(m, "illegal url");
            }
            return null;
        }
        if (!this.b.get()) {
            if (Logger.debug()) {
                Logger.d(m, "dispatch is unabled by tnc");
            }
            return null;
        }
        String d2 = kVar.d();
        d dVar = new d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, d2);
        this.f5220e.readLock().lock();
        Iterator<i> it2 = this.f5219d.iterator();
        String str2 = d2;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            i next = it2.next();
            if (Logger.debug()) {
                String str3 = m;
                Logger.d(str3, "action url = " + arrayList2);
                Logger.d(str3, "current action priority is " + next.b());
            }
            BaseDispatchAction.DispatchResultEnum o2 = next.o(kVar, str2, arrayList2, arrayList);
            String str4 = (String) arrayList2.get(0);
            if (o2 == BaseDispatchAction.DispatchResultEnum.DISPATCH_DROP) {
                if (Logger.debug()) {
                    Logger.d(m, "the url has been dropped by urldispatcher, skip follow-up actions");
                }
                dVar.f5214d = next.m();
            } else {
                str2 = str4;
            }
        }
        String str5 = (String) arrayList2.get(0);
        this.f5220e.readLock().unlock();
        ArrayList arrayList3 = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("origin_url", d2);
            jSONObject.put("dispatched_url", str5);
            JSONArray jSONArray = new JSONArray();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c cVar = (c) it3.next();
                if (cVar.f5209d) {
                    JSONObject jSONObject2 = new JSONObject();
                    arrayList3.add(Long.valueOf(cVar.b));
                    jSONObject2.put("rule_id", cVar.b);
                    jSONObject2.put("service_name", cVar.a);
                    jSONObject2.put(RemoteMessageConst.Notification.PRIORITY, cVar.f5208c);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("action_info_list", jSONArray);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("dispatch", jSONObject);
            new JSONObject().put("dispatchersdk", jSONObject3);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        dVar.b = arrayList3;
        dVar.a = str5;
        dVar.f5213c = arrayList;
        return dVar;
    }

    public long d() {
        return this.f5218c.get();
    }

    public ConcurrentMap<String, String> e() {
        return this.j;
    }

    public String f() {
        return this.l;
    }

    public String g() {
        return this.k;
    }

    public int h() {
        return this.h.get();
    }

    public long i() {
        return this.i.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String j(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto La9
            java.lang.String r0 = "/network/get_network"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "/get_domains/v5"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = "/ies/speed"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L20
            goto La9
        L20:
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L31
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r1.getProtocol()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r1.getHost()     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r1 = move-exception
            goto L33
        L31:
            r1 = move-exception
            r2 = r0
        L33:
            r1.printStackTrace()
        L36:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto La9
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L4c
            java.lang.String r1 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto La9
        L4c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L53
            goto La9
        L53:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r1 = r5.j
            if (r1 == 0) goto L9c
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L5e
            goto L9c
        L5e:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.String> r1 = r5.j
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L6d
            return r6
        L6d:
            boolean r3 = com.bytedance.common.utility.Logger.debug()
            if (r3 == 0) goto L7a
            java.lang.String r3 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.m
            java.lang.String r4 = "handleHostMapping, match, origin: "
            e.a.a.a.a.s0(r4, r6, r3)
        L7a:
            java.lang.String r3 = "://"
            java.lang.String r0 = e.a.a.a.a.t(r2, r3, r0)
            java.lang.String r1 = e.a.a.a.a.t(r2, r3, r1)
            boolean r2 = r6.startsWith(r0)
            if (r2 == 0) goto L8e
            java.lang.String r6 = r6.replaceFirst(r0, r1)
        L8e:
            boolean r0 = com.bytedance.common.utility.Logger.debug()
            if (r0 == 0) goto L9b
            java.lang.String r0 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.m
            java.lang.String r1 = "handleHostMapping, target: "
            e.a.a.a.a.s0(r1, r6, r0)
        L9b:
            return r6
        L9c:
            boolean r1 = com.bytedance.common.utility.Logger.debug()
            if (r1 == 0) goto La9
            java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.m
            java.lang.String r2 = "handleHostMapping, nomatch: "
            e.a.a.a.a.s0(r2, r0, r1)
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.urldispatcher.j.j(java.lang.String):java.lang.String");
    }

    public boolean l() {
        return this.f5219d.isEmpty();
    }

    public void m(Context context) {
        JSONObject optJSONObject;
        if (!com.bytedance.frameworks.baselib.network.http.p.i.c(context) || o.get()) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("ttnet_tnc_config", 0);
        boolean z = sharedPreferences.getBoolean("is_full_config", false);
        String string = sharedPreferences.getString("tnc_config_str", null);
        String string2 = sharedPreferences.getString("ttnet_tnc_etag", null);
        String string3 = sharedPreferences.getString("ttnet_tnc_abtest", null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                if (z && (optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA)) != null) {
                    jSONObject = optJSONObject;
                }
                k().n(jSONObject, 0, string2, string3, System.currentTimeMillis());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        o.set(true);
    }

    public void n(JSONObject jSONObject, int i, String str, String str2, long j) {
        if (Logger.debug()) {
            Logger.d(m, "URLDispatcher::onServerConfigChanged, tnc source is " + i + "etag is " + str);
        }
        this.h.set(i);
        this.k = str;
        this.l = str2;
        this.i.set(j);
        int optInt = jSONObject.optInt("ignore_retrofit_slash_enabled_v2", -1);
        if (optInt >= -1) {
            okhttp3.G.a.o(optInt == 1);
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("request_delay_actions");
        try {
            this.f5222g.writeLock().lock();
            this.f5221f.clear();
            if (optJSONArray != null) {
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                    if (optJSONObject != null) {
                        p(optJSONObject);
                    }
                }
            }
            if (!this.f5221f.isEmpty()) {
                Collections.sort(this.f5221f, new a());
            }
            int optInt2 = jSONObject.optInt("ttnet_url_dispatcher_enabled", -1);
            if (optInt2 >= 0) {
                this.b.set(optInt2 == 1);
            }
            long optInt3 = jSONObject.optInt("ttnet_dispatch_actions_epoch", -1);
            if (optInt3 == this.f5218c.get()) {
                if (Logger.debug()) {
                    Logger.d(m, "dispatch action epoch not changed");
                    return;
                }
                return;
            }
            this.f5218c.set(optInt3);
            JSONArray optJSONArray2 = jSONObject.optJSONArray("ttnet_dispatch_actions");
            if (optJSONArray2 == null) {
                return;
            }
            try {
                this.f5220e.writeLock().lock();
                this.f5219d.clear();
                for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i3);
                    if (optJSONObject2 != null) {
                        o(optJSONObject2);
                    }
                }
                if (!this.f5219d.isEmpty()) {
                    Collections.sort(this.f5219d, new a());
                }
            } finally {
                this.f5220e.writeLock().unlock();
                if (Logger.debug()) {
                    String str3 = m;
                    StringBuilder M = e.a.a.a.a.M("parse dispatch actions completed, actions size is ");
                    M.append(this.f5219d.size());
                    Logger.d(str3, M.toString());
                }
            }
        } finally {
            this.f5222g.writeLock().unlock();
            if (Logger.debug()) {
                String str4 = m;
                StringBuilder M2 = e.a.a.a.a.M("parse delay actions completed, actions size is ");
                M2.append(this.f5221f.size());
                Logger.d(str4, M2.toString());
            }
        }
    }

    public void q(Context context) {
        this.a = context;
    }

    public void r(String str) {
        this.l = str;
    }
}
