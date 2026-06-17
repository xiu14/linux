package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g implements Callable<Void> {
    private final String a = g.class.getSimpleName();
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final b f5178c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHandler f5179d;

    public g(String str, b bVar, WeakHandler weakHandler) {
        this.b = str;
        this.f5178c = bVar;
        this.f5179d = weakHandler;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            for (InetAddress inetAddress : InetAddress.getAllByName(this.b)) {
                if (inetAddress instanceof Inet4Address) {
                    arrayList.add(inetAddress.getHostAddress());
                } else if (inetAddress instanceof Inet6Address) {
                    arrayList2.add(inetAddress.getHostAddress());
                } else if (Logger.debug()) {
                    Logger.d(this.a, "local dns server returned a invalid address: " + inetAddress.getHostAddress());
                }
            }
            if (Logger.debug()) {
                Logger.d(this.a, "local dns resolved success for host: " + this.b);
            }
            if (arrayList.size() > 0 || arrayList2.size() > 0) {
                this.f5178c.f(this.b, new DnsRecord(this.b, System.currentTimeMillis(), arrayList, arrayList2, c.n().m().get()));
            }
        } catch (UnknownHostException e2) {
            e2.printStackTrace();
        }
        if (!c.n().o().get()) {
            Message obtain = Message.obtain();
            obtain.obj = this;
            obtain.what = 1;
            Bundle bundle = new Bundle();
            bundle.putString("localdns_completed_host", this.b);
            obtain.setData(bundle);
            this.f5179d.sendMessage(obtain);
            if (Logger.debug()) {
                e.a.a.a.a.I0(e.a.a.a.a.M("send message to collect result handler for host : "), this.b, this.a);
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("host", this.b);
                if (arrayList.size() == 0 && arrayList2.size() == 0) {
                    jSONObject.put("status", "failed");
                    jSONObject.put("result", "");
                } else {
                    jSONObject.put("status", "succeed");
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayList2);
                    arrayList3.addAll(arrayList);
                    jSONObject.put("result", arrayList3);
                }
                jSONObject.put("rtt", currentTimeMillis2);
                if (Logger.debug()) {
                    Logger.d(this.a, jSONObject.toString());
                }
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        this.f5178c.y(this.b);
        return null;
    }
}
