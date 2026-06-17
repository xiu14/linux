package com.xiaomi.push;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class co {
    private int a;

    /* renamed from: a, reason: collision with other field name */
    private long f188a;

    /* renamed from: a, reason: collision with other field name */
    private String f189a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f9013c;

    public co() {
        this(0, 0L, 0L, null);
    }

    public int a() {
        return this.a;
    }

    public co(int i, long j, long j2, Exception exc) {
        this.a = i;
        this.f188a = j;
        this.f9013c = j2;
        this.b = System.currentTimeMillis();
        if (exc != null) {
            this.f189a = exc.getClass().getSimpleName();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public JSONObject m166a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cost", this.f188a);
        jSONObject.put(MonitorConstants.SIZE, this.f9013c);
        jSONObject.put("ts", this.b);
        jSONObject.put("wt", this.a);
        jSONObject.put("expt", this.f189a);
        return jSONObject;
    }

    public co a(JSONObject jSONObject) {
        this.f188a = jSONObject.getLong("cost");
        this.f9013c = jSONObject.getLong(MonitorConstants.SIZE);
        this.b = jSONObject.getLong("ts");
        this.a = jSONObject.getInt("wt");
        this.f189a = jSONObject.optString("expt");
        return this;
    }
}
