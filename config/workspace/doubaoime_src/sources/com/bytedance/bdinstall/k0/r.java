package com.bytedance.bdinstall.k0;

import android.content.Context;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.e0;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class r extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4037e;

    /* renamed from: f, reason: collision with root package name */
    private final Q f4038f;

    r(Context context, Q q) {
        super(true, true);
        this.f4037e = context;
        this.f4038f = q;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        e0.h(jSONObject, "language", this.f4037e.getResources().getConfiguration().locale.getLanguage());
        int rawOffset = TimeZone.getDefault().getRawOffset() / 3600000;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            rawOffset = 12;
        }
        jSONObject.put("timezone", rawOffset);
        Q q = this.f4038f;
        int i = com.bytedance.bdinstall.util.o.h;
        Objects.requireNonNull(q.z());
        e0.h(jSONObject, "region", Locale.getDefault().getCountry());
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        e0.h(jSONObject, "tz_name", timeZone.getID());
        jSONObject.put("tz_offset", timeZone.getOffset(System.currentTimeMillis()) / 1000);
        return true;
    }
}
