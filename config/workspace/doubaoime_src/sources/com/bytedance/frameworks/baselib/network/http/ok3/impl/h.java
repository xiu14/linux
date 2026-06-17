package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.DnsResult;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h implements okhttp3.G.b {
    private static volatile h b;
    private final String a = h.class.getSimpleName();

    public static h a() {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = new h();
                }
            }
        }
        return b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    public okhttp3.G.c b(String str, int i) throws UnknownHostException {
        TTNetDnsSource tTNetDnsSource;
        TTNetDnsCacheSource tTNetDnsCacheSource;
        boolean z;
        if (Logger.debug()) {
            Logger.d(this.a, "lookup address list for " + str + " " + i);
        }
        DnsResult k = com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.n().k(str);
        DnsResult.Source source = DnsResult.Source.UNKNOWN;
        ?? arrayList = new ArrayList();
        if (k == null || (k.a.isEmpty() && k.b.isEmpty())) {
            try {
                arrayList = okhttp3.n.a.lookup(str);
                source = DnsResult.Source.LOCALDNS_REQUEST;
            } catch (UnknownHostException unused) {
            }
        } else {
            Iterator<String> it2 = k.b.iterator();
            Iterator<String> it3 = k.a.iterator();
            while (true) {
                if (!it2.hasNext() && !it3.hasNext()) {
                    break;
                }
                if (it2.hasNext()) {
                    arrayList.add(InetAddress.getByName(it2.next()));
                }
                if (it3.hasNext()) {
                    arrayList.add(InetAddress.getByName(it3.next()));
                }
            }
            source = k.f5162c;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (InetAddress inetAddress : arrayList) {
                if (inetAddress != null && !TextUtils.isEmpty(inetAddress.getHostAddress())) {
                    jSONArray.put(inetAddress.getHostAddress());
                }
            }
            jSONObject.put("address_list", jSONArray);
            int i2 = 1;
            jSONObject.put("httpdns_prefer", com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.c.n().o().get() ? 1 : 0);
            TTNetDnsSource tTNetDnsSource2 = TTNetDnsSource.NOT_SET;
            TTNetDnsCacheSource tTNetDnsCacheSource2 = TTNetDnsCacheSource.UNKNOWN;
            switch (source.ordinal()) {
                case 1:
                    tTNetDnsSource2 = TTNetDnsSource.SERVE_FROM_CACHE;
                    tTNetDnsCacheSource2 = TTNetDnsCacheSource.SOURCE_HTTPDNS;
                    tTNetDnsSource = tTNetDnsSource2;
                    tTNetDnsCacheSource = tTNetDnsCacheSource2;
                    z = false;
                    break;
                case 2:
                    tTNetDnsSource = TTNetDnsSource.SERVE_FROM_CACHE;
                    tTNetDnsCacheSource = TTNetDnsCacheSource.SOURCE_HTTPDNS;
                    z = true;
                    break;
                case 3:
                    tTNetDnsSource2 = TTNetDnsSource.SERVE_FROM_HTTP_DNS_JOB;
                    tTNetDnsSource = tTNetDnsSource2;
                    tTNetDnsCacheSource = tTNetDnsCacheSource2;
                    z = false;
                    break;
                case 4:
                    tTNetDnsSource2 = TTNetDnsSource.SERVE_FROM_PROC_DNS_JOB;
                    tTNetDnsSource = tTNetDnsSource2;
                    tTNetDnsCacheSource = tTNetDnsCacheSource2;
                    z = false;
                    break;
                case 5:
                    tTNetDnsSource2 = TTNetDnsSource.SERVE_FROM_CACHE;
                    tTNetDnsCacheSource2 = TTNetDnsCacheSource.SOURCE_PROC;
                    tTNetDnsSource = tTNetDnsSource2;
                    tTNetDnsCacheSource = tTNetDnsCacheSource2;
                    z = false;
                    break;
                case 6:
                    tTNetDnsSource2 = TTNetDnsSource.SERVE_FROM_HARDCODE_HOSTS;
                    tTNetDnsSource = tTNetDnsSource2;
                    tTNetDnsCacheSource = tTNetDnsCacheSource2;
                    z = false;
                    break;
                default:
                    tTNetDnsSource = tTNetDnsSource2;
                    tTNetDnsCacheSource = tTNetDnsCacheSource2;
                    z = false;
                    break;
            }
            jSONObject.put("source", tTNetDnsSource.mValue);
            jSONObject.put("cache_source", tTNetDnsCacheSource.mValue);
            if (!z) {
                i2 = 0;
            }
            jSONObject.put("from_stale_cache", i2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return new okhttp3.G.c(arrayList, jSONObject.toString());
    }
}
