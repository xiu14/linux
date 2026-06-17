package com.xiaomi.push;

import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class cp {

    /* renamed from: a, reason: collision with other field name */
    private long f190a;

    /* renamed from: a, reason: collision with other field name */
    public String f191a;

    /* renamed from: b, reason: collision with other field name */
    public String f193b;

    /* renamed from: c, reason: collision with root package name */
    public String f9014c;

    /* renamed from: d, reason: collision with root package name */
    public String f9015d;

    /* renamed from: e, reason: collision with root package name */
    public String f9016e;

    /* renamed from: f, reason: collision with root package name */
    public String f9017f;

    /* renamed from: g, reason: collision with root package name */
    public String f9018g;
    protected String h;
    private String i;

    /* renamed from: a, reason: collision with other field name */
    private ArrayList<cw> f192a = new ArrayList<>();
    private double a = 0.1d;
    private String j = "s.mi1.cc";
    private long b = com.heytap.mcssdk.constant.a.f6888f;

    public cp(String str) {
        this.f191a = "";
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.f190a = System.currentTimeMillis();
        this.f192a.add(new cw(str, -1));
        this.f191a = ct.m176a();
        this.f193b = str;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m170a() {
        return TextUtils.equals(this.f191a, ct.m176a());
    }

    public boolean b() {
        return System.currentTimeMillis() - this.f190a < this.b;
    }

    boolean c() {
        long j = this.b;
        if (864000000 >= j) {
            j = 864000000;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.f190a;
        return currentTimeMillis - j2 > j || (currentTimeMillis - j2 > this.b && this.f191a.startsWith("WIFI-"));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f191a);
        sb.append("\n");
        sb.append(a());
        Iterator<cw> it2 = this.f192a.iterator();
        while (it2.hasNext()) {
            cw next = it2.next();
            sb.append("\n");
            sb.append(next.toString());
        }
        sb.append("\n");
        return sb.toString();
    }

    public boolean a(cp cpVar) {
        return TextUtils.equals(this.f191a, cpVar.f191a);
    }

    public void b(String str, long j, long j2) {
        a(str, 0, j, j2, null);
    }

    public void a(long j) {
        if (j > 0) {
            this.b = j;
            return;
        }
        throw new IllegalArgumentException(e.a.a.a.a.n("the duration is invalid ", j));
    }

    public void b(String str, long j, long j2, Exception exc) {
        a(str, -1, j, j2, exc);
    }

    public void b(String str) {
        this.j = str;
    }

    private synchronized void c(String str) {
        Iterator<cw> it2 = this.f192a.iterator();
        while (it2.hasNext()) {
            if (TextUtils.equals(it2.next().f209a, str)) {
                it2.remove();
            }
        }
    }

    public ArrayList<String> a(String str) {
        if (!TextUtils.isEmpty(str)) {
            URL url = new URL(str);
            if (TextUtils.equals(url.getHost(), this.f193b)) {
                ArrayList<String> arrayList = new ArrayList<>();
                Iterator<String> it2 = a(true).iterator();
                while (it2.hasNext()) {
                    cr a = cr.a(it2.next(), url.getPort());
                    arrayList.add(new URL(url.getProtocol(), a.m175a(), a.a(), url.getFile()).toString());
                }
                return arrayList;
            }
            throw new IllegalArgumentException("the url is not supported by the fallback");
        }
        throw new IllegalArgumentException("the url is empty.");
    }

    public void a(String str, long j, long j2) {
        try {
            b(new URL(str).getHost(), j, j2);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, long j, long j2, Exception exc) {
        try {
            b(new URL(str).getHost(), j, j2, exc);
        } catch (MalformedURLException unused) {
        }
    }

    public void a(String str, int i, long j, long j2, Exception exc) {
        a(str, new co(i, j, j2, exc));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1.a(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(java.lang.String r4, com.xiaomi.push.co r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.ArrayList<com.xiaomi.push.cw> r0 = r3.f192a     // Catch: java.lang.Throwable -> L20
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L20
        L7:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L20
            com.xiaomi.push.cw r1 = (com.xiaomi.push.cw) r1     // Catch: java.lang.Throwable -> L20
            java.lang.String r2 = r1.f209a     // Catch: java.lang.Throwable -> L20
            boolean r2 = android.text.TextUtils.equals(r4, r2)     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L7
            r1.a(r5)     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r3)
            return
        L20:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.cp.a(java.lang.String, com.xiaomi.push.co):void");
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized ArrayList<String> m167a() {
        return a(false);
    }

    public synchronized ArrayList<String> a(boolean z) {
        ArrayList<String> arrayList;
        int size = this.f192a.size();
        cw[] cwVarArr = new cw[size];
        this.f192a.toArray(cwVarArr);
        Arrays.sort(cwVarArr);
        arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            cw cwVar = cwVarArr[i];
            if (z) {
                arrayList.add(cwVar.f209a);
            } else {
                int indexOf = cwVar.f209a.indexOf(Constants.COLON_SEPARATOR);
                if (indexOf != -1) {
                    arrayList.add(cwVar.f209a.substring(0, indexOf));
                } else {
                    arrayList.add(cwVar.f209a);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized void m169a(String str) {
        a(new cw(str));
    }

    synchronized void a(cw cwVar) {
        c(cwVar.f209a);
        this.f192a.add(cwVar);
    }

    public synchronized void a(String[] strArr) {
        int i;
        int size = this.f192a.size() - 1;
        while (true) {
            i = 0;
            if (size < 0) {
                break;
            }
            int length = strArr.length;
            while (true) {
                if (i < length) {
                    if (TextUtils.equals(this.f192a.get(size).f209a, strArr[i])) {
                        this.f192a.remove(size);
                        break;
                    }
                    i++;
                }
            }
            size--;
        }
        Iterator<cw> it2 = this.f192a.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            int i3 = it2.next().a;
            if (i3 > i2) {
                i2 = i3;
            }
        }
        while (i < strArr.length) {
            a(new cw(strArr[i], (strArr.length + i2) - i));
            i++;
        }
    }

    public synchronized String a() {
        if (!TextUtils.isEmpty(this.i)) {
            return this.i;
        }
        if (TextUtils.isEmpty(this.f9016e)) {
            return "hardcode_isp";
        }
        String a = bm.a(new String[]{this.f9016e, this.f9014c, this.f9015d, this.f9018g, this.f9017f}, BundleUtil.UNDERLINE_TAG);
        this.i = a;
        return a;
    }

    public void a(double d2) {
        this.a = d2;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m168a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("net", this.f191a);
        jSONObject.put(RemoteMessageConst.TTL, this.b);
        jSONObject.put("pct", this.a);
        jSONObject.put("ts", this.f190a);
        jSONObject.put("city", this.f9015d);
        jSONObject.put("prv", this.f9014c);
        jSONObject.put("cty", this.f9018g);
        jSONObject.put("isp", this.f9016e);
        jSONObject.put("ip", this.f9017f);
        jSONObject.put("host", this.f193b);
        jSONObject.put("xf", this.h);
        JSONArray jSONArray = new JSONArray();
        Iterator<cw> it2 = this.f192a.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized cp a(JSONObject jSONObject) {
        this.f191a = jSONObject.optString("net");
        this.b = jSONObject.getLong(RemoteMessageConst.TTL);
        this.a = jSONObject.getDouble("pct");
        this.f190a = jSONObject.getLong("ts");
        this.f9015d = jSONObject.optString("city");
        this.f9014c = jSONObject.optString("prv");
        this.f9018g = jSONObject.optString("cty");
        this.f9016e = jSONObject.optString("isp");
        this.f9017f = jSONObject.optString("ip");
        this.f193b = jSONObject.optString("host");
        this.h = jSONObject.optString("xf");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            a(new cw().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }
}
