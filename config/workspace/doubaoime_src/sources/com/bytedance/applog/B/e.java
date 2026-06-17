package com.bytedance.applog.B;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import com.bytedance.common.utility.NetworkUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends a {
    protected String w;
    protected boolean x;
    protected String y;
    public String z;

    public e(String str, String str2, boolean z, String str3) {
        this.m = str;
        this.y = str2;
        this.x = z;
        this.w = str3;
        com.bytedance.applog.c a = com.bytedance.applog.b.a(str);
        if (a != null) {
            Objects.requireNonNull(a);
        }
    }

    @Override // com.bytedance.applog.B.a
    protected void A(@NonNull JSONObject jSONObject) throws JSONException {
        super.A(jSONObject);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.y);
        boolean z = this.x;
        jSONObject.put(com.heytap.mcssdk.constant.b.D, this.w);
        jSONObject.put("is_bav", this.x);
        jSONObject.put("disable_personalization", this.z);
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
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.y);
        if (this.x) {
            jSONObject.put("is_bav", 1);
        }
        if (!TextUtils.isEmpty(this.w)) {
            jSONObject.put(com.heytap.mcssdk.constant.b.D, new JSONObject(this.w));
        }
        if (this.i != NetworkUtils.NetworkType.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.i);
        }
        jSONObject.put("datetime", this.n);
        if (!TextUtils.isEmpty(this.h)) {
            jSONObject.put("ab_sdk_version", this.h);
        }
        if (!TextUtils.isEmpty(this.z)) {
            jSONObject.put("disable_personalization", Integer.valueOf(this.z));
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
        return this.y;
    }

    public void D(String str) {
        this.w = str;
    }

    public void E(com.bytedance.applog.y.a aVar) {
        if (aVar != null) {
            this.o = aVar.c(this.y, this.w);
        }
    }

    @Override // com.bytedance.applog.B.a
    protected List<String> i() {
        List<String> i = super.i();
        ArrayList arrayList = new ArrayList(i.size());
        arrayList.addAll(i);
        arrayList.addAll(Arrays.asList(NotificationCompat.CATEGORY_EVENT, "varchar", com.heytap.mcssdk.constant.b.D, "varchar", "is_bav", TypedValues.Custom.S_INT, "disable_personalization", "varchar"));
        return arrayList;
    }

    @Override // com.bytedance.applog.B.a
    public String j() {
        return this.w;
    }

    @Override // com.bytedance.applog.B.a
    protected String k() {
        return this.y;
    }

    @Override // com.bytedance.applog.B.a
    @NonNull
    String n() {
        return "eventv3";
    }

    @Override // com.bytedance.applog.B.a
    public int p(@NonNull Cursor cursor) {
        super.p(cursor);
        this.y = cursor.getString(18);
        this.w = cursor.getString(19);
        this.x = cursor.getInt(20) == 1;
        this.z = cursor.getString(21);
        return 22;
    }

    @Override // com.bytedance.applog.B.a
    protected a q(@NonNull JSONObject jSONObject) {
        super.q(jSONObject);
        this.y = jSONObject.optString(NotificationCompat.CATEGORY_EVENT, null);
        this.w = jSONObject.optString(com.heytap.mcssdk.constant.b.D, null);
        this.x = jSONObject.optBoolean("is_bav", false);
        this.z = jSONObject.optString("disable_personalization", null);
        return this;
    }

    @Override // com.bytedance.applog.B.a
    protected void z(@NonNull ContentValues contentValues) {
        super.z(contentValues);
        contentValues.put(NotificationCompat.CATEGORY_EVENT, this.y);
        boolean z = this.x;
        contentValues.put(com.heytap.mcssdk.constant.b.D, this.w);
        contentValues.put("is_bav", Integer.valueOf(this.x ? 1 : 0));
        contentValues.put("disable_personalization", this.z);
    }

    public e(String str, String str2) {
        this.m = str;
        this.y = str2;
    }
}
