package com.bytedance.push.notification;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.bytedance.common.utility.e;
import com.bytedance.push.C;
import com.bytedance.push.interfaze.B;
import com.bytedance.push.interfaze.u;
import com.bytedance.push.notification.h;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.vivo.push.PushClient;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class t extends com.bytedance.common.push.c implements Runnable {
    private final Context a;

    @Nullable
    private final B b;

    /* renamed from: c, reason: collision with root package name */
    private final u f5791c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5792d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private String f5793e;

    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.this.b.a(this.a, this.b);
        }
    }

    t(Context context, u uVar, boolean z, @Nullable B b) {
        this.f5793e = "";
        this.a = context;
        this.f5791c = uVar;
        this.f5792d = z;
        this.b = null;
    }

    private void o(int i, String str) {
        if (this.b != null) {
            new Handler(Looper.getMainLooper()).post(new a(i, str));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) com.bytedance.push.settings.h.b(this.a, LocalFrequencySettings.class);
        int d2 = com.ss.android.message.f.a.d(this.a);
        Map<String, String> c2 = ((C) this.f5791c).c();
        HashMap hashMap = (HashMap) c2;
        hashMap.put("notice", this.f5792d ? "0" : PushClient.DEFAULT_REQUEST_ID);
        hashMap.put("system_notify_status", d2 + "");
        if (TextUtils.isEmpty(this.f5793e)) {
            com.bytedance.push.g0.f.c("Polling", "report switch status without timing,using original");
        } else {
            hashMap.put("reporting_timing", this.f5793e);
            StringBuilder sb = new StringBuilder();
            sb.append("report switch status with timing = ");
            e.a.a.a.a.J0(sb, this.f5793e, "Polling");
        }
        Set<Integer> set = com.ss.android.g.d.a;
        String c3 = com.ss.android.message.f.a.c(com.ss.android.g.a.a("/service/1/app_notice_status/"), c2);
        try {
            JSONArray d3 = ((h.d) h.a()).d(this.a);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair("out_app_channel_notify", d3.toString()));
            JSONObject jSONObject = new JSONObject();
            int D0 = TextUtils.isEmpty(this.f5793e) ? localFrequencySettings.D0() : localFrequencySettings.j0();
            add(jSONObject, "last_status", D0 < 0 ? -1L : D0);
            add(jSONObject, "current_status", d2);
            JSONObject jSONObject2 = new JSONObject();
            add(jSONObject2, "last_status", TextUtils.isEmpty(this.f5793e) ? localFrequencySettings.q() : localFrequencySettings.a0());
            add(jSONObject2, "current_status", this.f5792d ? 1L : 0L);
            arrayList.add(new Pair("out_app_status_change_info", jSONObject.toString()));
            arrayList.add(new Pair("in_app_status_change_info", jSONObject2.toString()));
            arrayList.add(new Pair("live_activity_notify_status", String.valueOf(com.ss.android.message.f.a.q(this.a))));
            e.a aVar = new e.a();
            aVar.a = false;
            String c4 = com.bytedance.common.g.b.c.f().c(c3, arrayList, com.ss.android.message.f.a.a(null), aVar);
            com.bytedance.push.g0.f.c("NoticeSync", "sendPushEnableToServer response = " + c4);
            if (TextUtils.isEmpty(c4)) {
                ((C) this.f5791c).i().e(304, c4);
                o(1001, "server return empty");
            } else {
                String optString = new JSONObject(c4).optString("message");
                if ("success".equals(optString)) {
                    com.bytedance.push.g0.f.e("NoticeSync", "sendPushEnableToServer  mReportingTiming :" + this.f5793e + " mInnerEnable :" + this.f5792d + " isSysNotifyEnable :" + d2);
                    int i = 1;
                    if (TextUtils.isEmpty(this.f5793e)) {
                        localFrequencySettings.c(true);
                        localFrequencySettings.s0(d2);
                        if (!this.f5792d) {
                            i = 0;
                        }
                        localFrequencySettings.F0(i);
                        localFrequencySettings.g(d3.toString());
                        localFrequencySettings.h(com.ss.android.message.f.a.f());
                    } else {
                        localFrequencySettings.e(true);
                        localFrequencySettings.s(d2);
                        if (!this.f5792d) {
                            i = 0;
                        }
                        localFrequencySettings.e0(i);
                        localFrequencySettings.F(d3.toString());
                        localFrequencySettings.Z(com.ss.android.message.f.a.f());
                    }
                    C.y().m();
                    if (this.b != null) {
                        new Handler(Looper.getMainLooper()).post(new s(this));
                        return;
                    }
                    return;
                }
                ((C) this.f5791c).i().e(302, c4);
                o(1001, optString);
            }
            if (TextUtils.isEmpty(this.f5793e)) {
                localFrequencySettings.c(false);
            } else {
                localFrequencySettings.e(false);
            }
        } catch (Exception e2) {
            if (TextUtils.isEmpty(this.f5793e)) {
                localFrequencySettings.c(false);
            } else {
                localFrequencySettings.e(false);
            }
            C.y().e(301, Log.getStackTraceString(e2));
            e2.printStackTrace();
            if (e2 instanceof IOException) {
                StringBuilder M = e.a.a.a.a.M("network error : ");
                M.append(e2.getMessage());
                o(1002, M.toString());
            } else {
                StringBuilder M2 = e.a.a.a.a.M("unknown error: ");
                M2.append(e2.getMessage());
                o(1003, M2.toString());
            }
        }
    }

    t(Context context, u uVar, boolean z, @Nullable B b, @Nullable String str) {
        this.f5793e = "";
        this.a = context;
        this.f5791c = uVar;
        this.f5792d = z;
        this.b = null;
        this.f5793e = str;
    }
}
