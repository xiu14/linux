package com.bytedance.apm.w;

import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private long a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    public long f3610c;

    /* renamed from: d, reason: collision with root package name */
    public String f3611d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3612e;

    /* renamed from: f, reason: collision with root package name */
    private String f3613f;

    /* renamed from: g, reason: collision with root package name */
    private long f3614g;
    private String h;
    private long i;
    private String j;
    private boolean k;
    private String l;

    public a(boolean z, long j, String str, boolean z2, long j2, String str2) {
        this.b = z;
        this.f3610c = j;
        this.f3611d = str;
        this.f3612e = z2;
        this.f3614g = j2;
        this.f3613f = str2;
    }

    public long a() {
        return this.f3614g;
    }

    public long b() {
        return this.a;
    }

    public String c() {
        return this.j;
    }

    public String d() {
        return this.f3613f;
    }

    public String e() {
        return this.h;
    }

    public String f() {
        return this.l;
    }

    public long g() {
        return this.i;
    }

    public boolean h() {
        return !this.b;
    }

    public boolean i() {
        return this.b;
    }

    public boolean j() {
        return this.k;
    }

    public boolean k() {
        return this.f3612e;
    }

    public boolean l() {
        return this.f3612e;
    }

    public void m(long j) {
        this.a = j;
    }

    public void n(boolean z) {
        this.k = z;
    }

    public void o(String str) {
        this.j = str;
    }

    public void p(String str) {
        this.f3613f = str;
    }

    public void q(String str) {
        this.l = str;
    }

    public void r(boolean z) {
        this.f3612e = z;
    }

    public void s(long j) {
        this.i = j;
    }

    public JSONObject t() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("front", this.b);
        jSONObject.put(CrashHianalyticsData.TIME, this.f3610c);
        jSONObject.put("type", this.f3611d);
        jSONObject.put("scene", this.f3613f);
        jSONObject.put("processName", this.j);
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("BatteryLogEntity{id=");
        M.append(this.a);
        M.append(", front=");
        M.append(this.b);
        M.append(", time=");
        M.append(this.f3610c);
        M.append(", type='");
        e.a.a.a.a.G0(M, this.f3611d, '\'', ", status=");
        M.append(this.f3612e);
        M.append(", scene='");
        e.a.a.a.a.G0(M, this.f3613f, '\'', ", accumulation=");
        M.append(this.f3614g);
        M.append(", source='");
        e.a.a.a.a.G0(M, this.h, '\'', ", versionId=");
        M.append(this.i);
        M.append(", processName='");
        e.a.a.a.a.G0(M, this.j, '\'', ", mainProcess=");
        M.append(this.k);
        M.append(", startUuid='");
        M.append(this.l);
        M.append('\'');
        M.append(", deleteFlag=");
        M.append(false);
        M.append('}');
        return M.toString();
    }

    public a(boolean z, long j, String str, boolean z2, long j2, String str2, String str3) {
        this.b = z;
        this.f3610c = j;
        this.f3611d = str;
        this.f3612e = z2;
        this.f3614g = j2;
        this.f3613f = str2;
        this.h = str3;
    }
}
