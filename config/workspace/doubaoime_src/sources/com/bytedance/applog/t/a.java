package com.bytedance.applog.t;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    private String f3892d;

    /* renamed from: e, reason: collision with root package name */
    private String f3893e;

    /* renamed from: g, reason: collision with root package name */
    private String f3895g;
    private int a = 0;
    private long b = com.heytap.mcssdk.constant.a.f6886d;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f3891c = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private int f3894f = 0;

    public static a k(JSONObject jSONObject) {
        a aVar = new a();
        aVar.a = jSONObject.optInt("version", 0);
        int optInt = jSONObject.optInt("interval", -1);
        aVar.b = optInt >= 0 ? optInt * 1000 : com.heytap.mcssdk.constant.a.f6886d;
        aVar.f3893e = jSONObject.optString("forward_report_path");
        aVar.f3892d = jSONObject.optString("forward_report_host");
        aVar.f3894f = jSONObject.optInt("forward_open", 0);
        JSONArray optJSONArray = jSONObject.optJSONArray("events");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                aVar.f3891c.add(optJSONArray.optString(i));
            }
        }
        return aVar;
    }

    public void a(Set<String> set) {
        this.f3891c.addAll(set);
    }

    public Set<String> b() {
        return this.f3891c;
    }

    public String c() {
        return this.f3892d;
    }

    public long d() {
        return this.b;
    }

    public int e() {
        return this.f3894f;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof a)) {
            return super.equals(obj);
        }
        a aVar = (a) obj;
        return aVar.a == this.a && aVar.b == this.b && TextUtils.equals(aVar.f3892d, this.f3892d) && TextUtils.equals(aVar.f3893e, this.f3893e) && aVar.f3894f == this.f3894f && aVar.f3891c.containsAll(this.f3891c) && this.f3891c.containsAll(aVar.f3891c);
    }

    public String f() {
        return this.f3893e;
    }

    public String g() {
        if (this.f3894f == 0 || TextUtils.isEmpty(this.f3892d)) {
            return null;
        }
        if (TextUtils.isEmpty(this.f3895g)) {
            String str = (!this.f3892d.startsWith("https://") || this.f3892d.endsWith("/")) ? null : this.f3892d;
            if (TextUtils.isEmpty(str)) {
                this.f3895g = null;
                return null;
            }
            this.f3895g = e.a.a.a.a.s(str, (!TextUtils.isEmpty(this.f3893e) && this.f3893e.startsWith("/") && this.f3893e.endsWith("/")) ? this.f3893e : "/service/2/app_log/");
        }
        return this.f3895g;
    }

    public int h() {
        return this.a;
    }

    public boolean i(String str) {
        return this.f3891c.contains(str);
    }

    public boolean j() {
        return (this.f3894f != 1 || TextUtils.isEmpty(this.f3892d) || TextUtils.isEmpty(this.f3893e) || this.f3891c.isEmpty() || this.b <= 0) ? false : true;
    }

    public void l(String str) {
        this.f3892d = str;
    }

    public void m(long j) {
        this.b = j;
    }

    public void n(int i) {
        this.f3894f = i;
    }

    public void o(String str) {
        this.f3893e = str;
    }

    public void p(int i) {
        this.a = i;
    }
}
