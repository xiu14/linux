package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j extends a {
    public String A;
    public String B;
    public Integer C;
    public long w;
    public long x;
    public String y;
    public Integer z;

    @Override // com.bytedance.applog.B.a
    protected void A(@NonNull JSONObject jSONObject) {
        l().a(4, this.t, "write ipc not implemented", new Object[0]);
    }

    @Override // com.bytedance.applog.B.a
    protected JSONObject B() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.b);
        jSONObject.put("tea_event_index", this.f3731c);
        jSONObject.put("session_id", this.f3732d);
        jSONObject.put("stop_timestamp", this.x / 1000);
        jSONObject.put("duration", this.w / 1000);
        jSONObject.put("datetime", this.n);
        c(jSONObject);
        if (!TextUtils.isEmpty(this.f3735g)) {
            jSONObject.put("user_unique_id", this.f3735g);
        }
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("ab_sdk_version", this.h);
        }
        if (!TextUtils.isEmpty(this.y)) {
            jSONObject.put("uuid_changed", true);
            if (!TextUtils.equals(this.y, this.f3732d)) {
                jSONObject.put("original_session_id", this.y);
            }
        }
        Integer num = this.z;
        if (num != null) {
            jSONObject.put("session_type", num);
        }
        if (!TextUtils.isEmpty(this.B)) {
            jSONObject.put("from_session", this.B);
        }
        if (!TextUtils.isEmpty(this.A)) {
            jSONObject.put("to_session", this.A);
        }
        Integer num2 = this.C;
        if (num2 != null) {
            jSONObject.put("bg_session", num2);
        }
        long j = this.q;
        if (j > 0) {
            jSONObject.put("event_id", j);
        }
        long j2 = this.r;
        if (j2 > 0) {
            jSONObject.put("monitor_id", String.valueOf(j2));
        }
        int i = this.s;
        if (i > 0) {
            jSONObject.put("event_stained", i);
        }
        return jSONObject;
    }

    @Override // com.bytedance.applog.B.a
    protected List<String> i() {
        return null;
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        return String.valueOf(this.w);
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "terminate";
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        l().a(4, this.t, "read db not implemented", new Object[0]);
        return 0;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        l().a(4, this.t, "read ipc not implemented", new Object[0]);
        return this;
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        l().a(4, this.t, "write db not implemented", new Object[0]);
    }
}
