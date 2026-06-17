package com.bytedance.bdinstall.m0;

import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class n {
    public final String a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f4071c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f4072d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f4073e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f4074f;

    /* renamed from: g, reason: collision with root package name */
    public final Long f4075g;

    n(String str, String str2, Boolean bool, Long l, Long l2, Integer num, Long l3) {
        this.a = str;
        this.b = str2;
        this.f4071c = bool;
        this.f4072d = l;
        this.f4073e = l2;
        this.f4074f = num;
        this.f4075g = l3;
    }

    @Nullable
    @AnyThread
    public static n a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new n(jSONObject.optString("id", null), jSONObject.optString("req_id", null), jSONObject.has("is_track_limited") ? Boolean.valueOf(jSONObject.optBoolean("is_track_limited")) : null, jSONObject.has("take_ms") ? Long.valueOf(jSONObject.optLong("take_ms", -1L)) : null, jSONObject.has(CrashHianalyticsData.TIME) ? Long.valueOf(jSONObject.optLong(CrashHianalyticsData.TIME, -1L)) : null, jSONObject.has("query_times") ? Integer.valueOf(jSONObject.optInt("query_times", -1)) : null, jSONObject.has("hw_id_version_code") ? Long.valueOf(jSONObject.optLong("hw_id_version_code", -1L)) : null);
        } catch (JSONException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @NonNull
    JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        k.p(jSONObject, "id", this.a);
        k.p(jSONObject, "req_id", this.b);
        k.p(jSONObject, "is_track_limited", this.f4071c);
        k.p(jSONObject, "take_ms", this.f4072d);
        k.p(jSONObject, CrashHianalyticsData.TIME, this.f4073e);
        k.p(jSONObject, "query_times", this.f4074f);
        k.p(jSONObject, "hw_id_version_code", this.f4075g);
        return jSONObject;
    }

    public String toString() {
        return b().toString();
    }
}
