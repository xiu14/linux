package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.common.utility.NetworkUtils;
import com.ss.android.message.log.PushLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c extends a {
    public long A;
    public long B;
    public String w;
    public String x;
    public String y;
    public String z;

    public c(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        u(0L);
        this.w = str2;
        this.x = str3;
        this.y = str4;
        this.A = j;
        this.B = j2;
        this.z = str5;
        this.m = str;
    }

    @Override // com.bytedance.applog.B.a
    protected void A(@NonNull JSONObject jSONObject) throws JSONException {
        super.A(jSONObject);
        jSONObject.put("tea_event_index", this.f3731c);
        jSONObject.put(PushLog.KEY_CATEGORY, this.w);
        jSONObject.put("tag", this.x);
        jSONObject.put(PushLog.KEY_VALUE, this.A);
        jSONObject.put(PushLog.KEY_EXT_VALUE, this.B);
        jSONObject.put(com.heytap.mcssdk.constant.b.D, this.z);
        jSONObject.put(PushLog.KEY_LABEL, this.y);
    }

    @Override // com.bytedance.applog.B.a
    protected JSONObject B() throws JSONException {
        JSONObject jSONObject = !TextUtils.isEmpty(this.z) ? new JSONObject(this.z) : null;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("local_time_ms", this.b);
        jSONObject.put("tea_event_index", this.f3731c);
        jSONObject.put("session_id", this.f3732d);
        c(jSONObject);
        if (this.i != NetworkUtils.NetworkType.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.i);
        }
        if (!TextUtils.isEmpty(this.f3735g)) {
            jSONObject.put("user_unique_id", this.f3735g);
        }
        jSONObject.put(PushLog.KEY_CATEGORY, this.w);
        jSONObject.put("tag", this.x);
        jSONObject.put(PushLog.KEY_VALUE, this.A);
        jSONObject.put(PushLog.KEY_EXT_VALUE, this.B);
        jSONObject.put(PushLog.KEY_LABEL, this.y);
        jSONObject.put("datetime", this.n);
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("ab_sdk_version", this.h);
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
        arrayList.addAll(Arrays.asList(PushLog.KEY_CATEGORY, "varchar", "tag", "varchar", PushLog.KEY_VALUE, TypedValues.Custom.S_INT, PushLog.KEY_EXT_VALUE, TypedValues.Custom.S_INT, com.heytap.mcssdk.constant.b.D, "varchar", PushLog.KEY_LABEL, "varchar"));
        return arrayList;
    }

    @Override // com.bytedance.applog.B.a
    protected String j() {
        return this.z;
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        StringBuilder M = e.a.a.a.a.M("");
        M.append(this.x);
        M.append(", ");
        M.append(this.y);
        return M.toString();
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return NotificationCompat.CATEGORY_EVENT;
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        super.p(cursor);
        this.w = cursor.getString(18);
        this.x = cursor.getString(19);
        this.A = cursor.getLong(20);
        this.B = cursor.getLong(21);
        this.z = cursor.getString(22);
        this.y = cursor.getString(23);
        return 24;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        super.q(jSONObject);
        this.f3731c = jSONObject.optLong("tea_event_index", 0L);
        this.w = jSONObject.optString(PushLog.KEY_CATEGORY, null);
        this.x = jSONObject.optString("tag", null);
        this.A = jSONObject.optLong(PushLog.KEY_VALUE, 0L);
        this.B = jSONObject.optLong(PushLog.KEY_EXT_VALUE, 0L);
        this.z = jSONObject.optString(com.heytap.mcssdk.constant.b.D, null);
        this.y = jSONObject.optString(PushLog.KEY_LABEL, null);
        return this;
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        super.z(contentValues);
        contentValues.put(PushLog.KEY_CATEGORY, this.w);
        contentValues.put("tag", this.x);
        contentValues.put(PushLog.KEY_VALUE, Long.valueOf(this.A));
        contentValues.put(PushLog.KEY_EXT_VALUE, Long.valueOf(this.B));
        contentValues.put(com.heytap.mcssdk.constant.b.D, this.z);
        contentValues.put(PushLog.KEY_LABEL, this.y);
    }

    c() {
    }
}
