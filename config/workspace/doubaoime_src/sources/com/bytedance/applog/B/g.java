package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g extends a {
    public long w;
    public String x;
    public boolean y;
    public String z;

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
        c(jSONObject);
        if (!TextUtils.isEmpty(this.f3735g)) {
            jSONObject.put("user_unique_id", this.f3735g);
        }
        if (this.y) {
            jSONObject.put("is_background", true);
        }
        jSONObject.put("datetime", this.n);
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("ab_sdk_version", this.h);
        }
        if (!TextUtils.isEmpty(this.z)) {
            jSONObject.put("uuid_changed", true);
            jSONObject.put("original_session_id", this.z);
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
        List<String> i = super.i();
        ArrayList arrayList = new ArrayList(i.size());
        arrayList.addAll(i);
        arrayList.addAll(Arrays.asList("ver_name", "varchar", "ver_code", TypedValues.Custom.S_INT, "last_session", "varchar", "is_background", TypedValues.Custom.S_INT));
        return arrayList;
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        return this.y ? "bg" : "fg";
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "launch";
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        super.p(cursor);
        this.x = cursor.getString(18);
        this.w = cursor.getLong(19);
        this.z = cursor.getString(20);
        this.y = cursor.getInt(21) == 1;
        return 22;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        l().a(4, this.t, "read ipc not implemented", new Object[0]);
        return null;
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        super.z(contentValues);
        contentValues.put("ver_name", this.x);
        contentValues.put("ver_code", Long.valueOf(this.w));
        contentValues.put("last_session", this.z);
        contentValues.put("is_background", Integer.valueOf(this.y ? 1 : 0));
    }
}
