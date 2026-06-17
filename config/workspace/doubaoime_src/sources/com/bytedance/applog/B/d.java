package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d extends a {

    @NonNull
    private String w;

    @NonNull
    private String x;

    public d(String str, @NonNull String str2, @NonNull JSONObject jSONObject) {
        this.x = str2;
        this.w = jSONObject.toString();
        this.m = null;
    }

    @Override // com.bytedance.applog.B.a
    protected void A(@NonNull JSONObject jSONObject) throws JSONException {
        super.A(jSONObject);
        jSONObject.put(com.heytap.mcssdk.constant.b.D, this.w);
        jSONObject.put("log_type", this.x);
    }

    @Override // com.bytedance.applog.B.a
    protected JSONObject B() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.b);
        jSONObject.put("tea_event_index", this.f3731c);
        jSONObject.put("session_id", this.f3732d);
        c(jSONObject);
        if (!TextUtils.isEmpty(this.f3735g)) {
            jSONObject.put("user_unique_id", this.f3735g);
        }
        jSONObject.put("log_type", this.x);
        try {
            JSONObject jSONObject2 = new JSONObject(this.w);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.opt(next) != null) {
                    l().k(4, this.t, "misc event exists key already!", new Object[0]);
                }
                jSONObject.put(next, obj);
            }
        } catch (Exception e2) {
            l().u(4, "parse misc event params failed", e2, new Object[0]);
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

    public String C() {
        return this.x;
    }

    @Override // com.bytedance.applog.B.a
    protected List<String> i() {
        List<String> i = super.i();
        ArrayList arrayList = new ArrayList(i.size());
        arrayList.addAll(i);
        arrayList.addAll(Arrays.asList(com.heytap.mcssdk.constant.b.D, "varchar", "log_type", "varchar"));
        return arrayList;
    }

    @Override // com.bytedance.applog.B.a
    public String j() {
        return this.w;
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        StringBuilder M = e.a.a.a.a.M("param:");
        M.append(this.w);
        M.append(" logType:");
        M.append(this.x);
        return M.toString();
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "event_misc";
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        super.p(cursor);
        this.w = cursor.getString(18);
        this.x = cursor.getString(19);
        return 20;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        super.q(jSONObject);
        this.w = jSONObject.optString(com.heytap.mcssdk.constant.b.D, null);
        this.x = jSONObject.optString("log_type", null);
        return this;
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        super.z(contentValues);
        contentValues.put(com.heytap.mcssdk.constant.b.D, this.w);
        contentValues.put("log_type", this.x);
    }
}
