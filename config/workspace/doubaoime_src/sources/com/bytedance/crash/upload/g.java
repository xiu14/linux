package com.bytedance.crash.upload;

import com.bytedance.common.wschannel.WsConstants;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f4691c;

    /* renamed from: d, reason: collision with root package name */
    private long f4692d;

    /* renamed from: e, reason: collision with root package name */
    private int f4693e;

    /* renamed from: f, reason: collision with root package name */
    private int f4694f;

    /* renamed from: g, reason: collision with root package name */
    private int f4695g;
    private long h;
    private String i;
    private JSONObject j;

    public g(String str, String str2) {
        this.b = str;
        this.f4691c = str2;
        this.f4693e = 0;
        this.f4694f = 0;
        this.f4692d = 0L;
        this.f4695g = 0;
        this.h = 0L;
        this.i = "";
        this.j = new JSONObject();
        this.a = h.j(this.b, this.f4691c);
        try {
            this.j.put(WsConstants.KEY_APP_ID, this.b);
            this.j.put(DownloadConstants.PATH_KEY, this.f4691c);
        } catch (Throwable unused) {
        }
    }

    public String a() {
        return this.b;
    }

    public long b() {
        return this.h;
    }

    public String c() {
        return this.f4691c;
    }

    public int d() {
        int i = this.f4693e;
        if (i == 1 || i == 0) {
            return 0;
        }
        return this.f4695g;
    }

    public int e() {
        return this.f4693e;
    }

    public long f() {
        return this.f4692d;
    }

    public void g(int i) {
        this.f4694f = i;
    }

    public void h(long j) {
        this.h = j;
    }

    public void i(int i) {
        if (i == 1 || i == 0) {
            this.f4695g = 0;
        } else if (i != this.f4693e) {
            this.f4695g = 1;
        } else {
            this.f4695g++;
        }
        this.f4693e = i;
    }

    public void j(long j) {
        this.f4692d = j;
        try {
            com.bytedance.crash.util.a.h().format(new Date(this.f4692d));
        } catch (Throwable unused) {
        }
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            this.j.put(WsConstants.KEY_APP_ID, this.b);
            this.j.put(DownloadConstants.PATH_KEY, this.f4691c);
            this.j.put("update_time", this.f4692d);
            try {
                this.j.put("update_time_format", com.bytedance.crash.util.a.h().format(new Date(this.f4692d)));
            } catch (Throwable unused) {
                this.j.put("update_time_format", "");
            }
            this.j.put("strategy", this.f4693e);
            this.j.put("alog_strategy", this.f4694f);
            this.j.put("retreatCount", this.f4695g);
            this.j.put("redirect", this.i);
            jSONObject.put(this.a, this.j);
        } catch (Throwable unused2) {
        }
        return jSONObject;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("[");
        M.append(this.a);
        M.append(" ");
        M.append(this.f4693e);
        M.append(" ");
        M.append(this.f4694f);
        M.append(" ");
        M.append(this.f4695g);
        M.append(" ");
        return e.a.a.a.a.F(M, this.h, "]");
    }

    public g(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            this.b = jSONObject.optString(WsConstants.KEY_APP_ID);
            this.f4691c = jSONObject.optString(DownloadConstants.PATH_KEY);
            this.f4693e = jSONObject.optInt("strategy");
            this.f4694f = jSONObject.optInt("alog_strategy");
            this.f4692d = jSONObject.optLong("update_time");
            jSONObject.optString("update_time_format");
            this.f4695g = jSONObject.optInt("retreatCount");
            this.i = jSONObject.optString("redirect");
            this.j = new JSONObject(jSONObject.toString());
            this.a = h.j(this.b, this.f4691c);
            return;
        }
        throw new IllegalArgumentException("json can't be null");
    }
}
