package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsRecord;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements Callable<Void> {
    private static final String i = "d";
    private final String a;
    private final b b;

    /* renamed from: c, reason: collision with root package name */
    private String f5173c;

    /* renamed from: f, reason: collision with root package name */
    private DnsRecord.CacheStaleReason f5176f;
    private final WeakHandler h;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f5174d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private List<String> f5175e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private int f5177g = 0;

    d(String str, String str2, b bVar, DnsRecord.CacheStaleReason cacheStaleReason, WeakHandler weakHandler) {
        this.f5173c = str;
        this.a = str2;
        this.b = bVar;
        this.f5176f = cacheStaleReason;
        this.h = weakHandler;
    }

    private String a(String str) {
        StringBuilder sb = new StringBuilder();
        if (!com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.d.b().get()) {
            this.f5177g = 1;
        }
        e.a.a.a.a.K0(sb, "https://", str, "/q?host=");
        sb.append(this.f5173c);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("aid=");
        sb.append(c.n().f().getAppId());
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("okhttp_version=");
        e.a.a.a.a.M0(sb, this.a, ContainerUtils.FIELD_DELIMITER, "p=", "android");
        e.a.a.a.a.M0(sb, ContainerUtils.FIELD_DELIMITER, "source=", "tt-ok", ContainerUtils.FIELD_DELIMITER);
        sb.append("f=");
        sb.append(this.f5177g);
        sb.append(ContainerUtils.FIELD_DELIMITER);
        sb.append("reason=");
        sb.append(this.f5176f.ordinal() - 1);
        if (this.b.h().get() < 3) {
            e.a.a.a.a.K0(sb, ContainerUtils.FIELD_DELIMITER, "refresh_bkup_ip=", PushClient.DEFAULT_REQUEST_ID);
            this.b.A();
        }
        return com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.b.a(sb.toString(), str);
    }

    private void b(String str) {
        if (Logger.debug()) {
            Logger.d(i, "parseHttpDnsResponse");
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (this.f5174d.size() > 1) {
                JSONArray optJSONArray = jSONObject.optJSONArray("dns");
                if (optJSONArray == null) {
                    return;
                }
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    c(optJSONArray.optJSONObject(i2));
                }
            } else {
                c(jSONObject);
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("httpdns_backup_ip");
            if (optJSONArray2 != null) {
                c.n().v(optJSONArray2);
            }
        } catch (JSONException unused) {
            if (Logger.debug()) {
                Logger.d(i, "httpdns server returned a invalid json response.");
            }
        }
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("host");
        if (Logger.debug()) {
            e.a.a.a.a.s0("parseSingleHostHttpDnsResponse for host ", optString, i);
        }
        int optInt = jSONObject.optInt(RemoteMessageConst.TTL);
        JSONArray optJSONArray = jSONObject.optJSONArray("ips");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                String optString2 = optJSONArray.optString(i2);
                if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.c.b(optString2)) {
                    arrayList2.add(optString2);
                } else if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.c.a(optString2)) {
                    arrayList.add(optString2);
                } else if (Logger.debug()) {
                    e.a.a.a.a.s0("httpdns server returned a invalid address: ", optString2, i);
                }
            }
        }
        if (this.f5174d.contains(optString)) {
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                this.b.a(optString, new DnsRecord(optString, System.currentTimeMillis(), arrayList, arrayList2, optInt));
                this.b.u(optString);
                this.f5174d.remove(optString);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        String str;
        for (String str2 : this.f5173c.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            this.f5174d.add(str2);
            this.f5175e.add(str2);
        }
        if (Logger.debug()) {
            String str3 = i;
            StringBuilder M = e.a.a.a.a.M("Start httpdns resolve for host : ");
            M.append(this.f5174d);
            Logger.d(str3, M.toString());
        }
        String g2 = c.n().g();
        if (c.n().h().size() == 0) {
            this.b.z();
        }
        if (!com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.a.a(g2) || this.b.j().get() >= 2) {
            str = null;
        } else {
            str = a(g2);
            if (str == null) {
                this.b.b();
            }
        }
        if (str == null) {
            Iterator<String> it2 = c.n().h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                String next = it2.next();
                if (com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.c.a(next) || com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.h.c.b(next)) {
                    String a = a(next);
                    if (a != null) {
                        b(a);
                        break;
                    }
                    if (Logger.debug()) {
                        Logger.d(i, "httpdns request failed use hardcode ip: " + next + " try next hardcode ip");
                    }
                } else if (Logger.debug()) {
                    Logger.d(i, "httpdns backup domian hardcode ip: " + next + " is invalid");
                }
            }
        } else {
            b(str);
            this.b.z();
        }
        for (String str4 : this.f5174d) {
            this.b.u(str4);
            this.b.s(str4);
        }
        Message obtain = Message.obtain();
        obtain.obj = this;
        obtain.what = 3;
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("httpdns_completed_hosts", (ArrayList) this.f5175e);
        obtain.setData(bundle);
        this.h.sendMessage(obtain);
        if (Logger.debug()) {
            String str5 = i;
            StringBuilder M2 = e.a.a.a.a.M("send message to collect result handler for host : ");
            M2.append(this.f5175e);
            Logger.d(str5, M2.toString());
        }
        return null;
    }
}
