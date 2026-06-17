package com.bytedance.applog.D;

import android.text.TextUtils;
import com.bytedance.applog.q.g;
import com.bytedance.applog.util.k;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private long a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3752c;

    /* renamed from: d, reason: collision with root package name */
    private String f3753d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3754e;

    /* renamed from: f, reason: collision with root package name */
    private String f3755f;

    /* renamed from: g, reason: collision with root package name */
    private long f3756g;
    private long h;
    private long i;

    private e() {
        this.f3752c = false;
        this.f3753d = null;
        this.f3754e = false;
        this.f3755f = null;
        this.h = 0L;
        this.i = 0L;
    }

    public static e b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("session_id", "");
            e eVar = new e();
            eVar.b = optString;
            eVar.a = k.h(jSONObject, "start_time");
            eVar.f3752c = jSONObject.optBoolean("is_front_continuous", false);
            eVar.f3753d = jSONObject.optString("front_session_id", "");
            eVar.f3754e = jSONObject.optBoolean("is_end_continuous", false);
            eVar.f3755f = jSONObject.optString("end_session_id", "");
            eVar.f3756g = k.h(jSONObject, "latest_end_time");
            eVar.h = k.h(jSONObject, "non_task_time");
            eVar.i = k.h(jSONObject, "tea_event_index");
            return eVar;
        } catch (Throwable th) {
            com.bytedance.applog.w.k.z().i("[Task] get session from string failed", th, new Object[0]);
            return null;
        }
    }

    public void a(long j) {
        this.h += j;
    }

    public long c() {
        return Math.max(0L, (this.f3756g - this.a) - this.h);
    }

    public String d() {
        return this.f3755f;
    }

    public String e() {
        return this.f3753d;
    }

    public long f() {
        return this.f3756g;
    }

    public String g() {
        return this.b;
    }

    public int h() {
        boolean z = this.f3752c;
        boolean z2 = this.f3754e;
        if (!z && !z2) {
            return 1;
        }
        if (!z || z2) {
            return !z ? 3 : 4;
        }
        return 2;
    }

    public long i() {
        return this.a;
    }

    public boolean j() {
        return !TextUtils.isEmpty(this.f3755f);
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.f3753d);
    }

    public void l(String str) {
        this.f3754e = true;
        this.f3755f = str;
    }

    public void m(String str) {
        this.f3752c = true;
        this.f3753d = str;
    }

    public void n(long j) {
        this.f3756g = j;
    }

    public String o() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.a);
            jSONObject.put("session_id", this.b);
            jSONObject.put("is_front_continuous", this.f3752c);
            jSONObject.put("front_session_id", this.f3753d);
            jSONObject.put("is_end_continuous", this.f3754e);
            jSONObject.put("end_session_id", this.f3755f);
            jSONObject.put("latest_end_time", this.f3756g);
            jSONObject.put("non_task_time", this.h);
            jSONObject.put("tea_event_index", this.i);
            return jSONObject.toString();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    public String toString() {
        return o();
    }

    public e(long j, long j2) {
        this.f3752c = false;
        this.f3753d = null;
        this.f3754e = false;
        this.f3755f = null;
        this.h = 0L;
        this.i = 0L;
        this.a = j;
        int i = g.u;
        this.b = UUID.randomUUID().toString();
        this.i = j2;
    }
}
