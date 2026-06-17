package com.huawei.hms.hatool;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class d1 implements g {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7342c;

    /* renamed from: d, reason: collision with root package name */
    private List<b1> f7343d;

    public d1(List<b1> list, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.f7342c = str3;
        this.f7343d = list;
    }

    private void a() {
        d.a(q0.i(), "backup_event", n1.a(this.a, this.f7342c, this.b));
    }

    @Override // java.lang.Runnable
    public void run() {
        List<b1> list = this.f7343d;
        if (list == null || list.size() == 0) {
            v.d("hmsSdk", "failed events is empty");
            return;
        }
        if (c0.a(q0.i(), "cached_v2_1", q0.k() * 1048576)) {
            StringBuilder M = e.a.a.a.a.M("The cacheFile is full,Can not writing data, delete it! reqID:");
            M.append(this.b);
            v.e("hmsSdk", M.toString());
            d.a(q0.i(), "cached_v2_1", new String[0]);
            return;
        }
        String a = n1.a(this.a, this.f7342c);
        List<b1> list2 = c1.b(q0.i(), "cached_v2_1", a).get(a);
        if (list2 != null && list2.size() != 0) {
            this.f7343d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<b1> it2 = this.f7343d.iterator();
        while (it2.hasNext()) {
            try {
                jSONArray.put(it2.next().d());
            } catch (JSONException unused) {
                v.e("hmsSdk", "event to json error");
            }
        }
        String jSONArray2 = jSONArray.toString();
        if (jSONArray2.length() > q0.h() * 1048576) {
            v.e("hmsSdk", "this failed data is too long,can not writing it");
            this.f7343d = null;
            return;
        }
        StringBuilder M2 = e.a.a.a.a.M("data send failed, write to cache file...reqID:");
        M2.append(this.b);
        v.d("hmsSdk", M2.toString());
        d.b(q0.i(), "cached_v2_1", a, jSONArray2);
        a();
    }
}
