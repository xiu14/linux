package com.bytedance.push.d0;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.PushExternalService;
import com.bytedance.common.utility.e;
import com.bytedance.push.C;
import com.bytedance.push.settings.LocalFrequencySettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object f5647e = new Object();
    private boolean a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private List<String> f5648c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f5649d;

    public a(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    private boolean a() {
        Application a = com.ss.android.message.a.a();
        PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) h.b(a, PushOnlineSettings.class);
        LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) h.b(a, LocalFrequencySettings.class);
        long R = pushOnlineSettings.R();
        long z0 = localFrequencySettings.z0();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = currentTimeMillis - z0 > R;
        HashMap hashMap = (HashMap) ((C) C.a()).c();
        String str = (String) hashMap.get("version_code");
        String str2 = (String) hashMap.get("update_version_code");
        String str3 = (String) hashMap.get("channel");
        String S = localFrequencySettings.S();
        String b = localFrequencySettings.b();
        String i0 = localFrequencySettings.i0();
        StringBuilder sb = new StringBuilder();
        sb.append("frequency = ");
        sb.append(z);
        sb.append(" lastRequestSettingsTime =");
        sb.append(z0);
        sb.append(" currentTimeMillis = ");
        sb.append(currentTimeMillis);
        sb.append(" requestSettingsInterval = ");
        sb.append(R);
        sb.append(" versionCode：");
        sb.append(str);
        e.a.a.a.a.M0(sb, " lastVersionCode：", S, " updateVersionCode：", str2);
        e.a.a.a.a.M0(sb, " lastUpdateVersionCode：", b, " channel：", str3);
        sb.append(" lastChannel：");
        sb.append(i0);
        com.bytedance.push.g0.f.c("RequestSettingsTask", sb.toString());
        return (!z && TextUtils.equals(str, S) && TextUtils.equals(str2, b) && TextUtils.equals(str3, i0)) ? false : true;
    }

    private void b(Context context, String str, Map<String, String> map) throws Exception {
        map.put("caller_name", str);
        map.put("device_platform", "android");
        Set<Integer> set = com.ss.android.g.d.a;
        String c2 = com.ss.android.message.f.a.c(com.ss.android.g.a.a("/service/settings/v3/"), map);
        e.a aVar = new e.a();
        aVar.a = true;
        String a = com.bytedance.common.g.b.c.f().a(c2, com.ss.android.message.f.a.a(null), aVar);
        JSONObject jSONObject = new JSONObject(a);
        String optString = jSONObject.optString("message");
        JSONObject optJSONObject = jSONObject.optJSONObject(RemoteMessageConst.DATA);
        if (!TextUtils.equals(optString, "success") || optJSONObject == null) {
            return;
        }
        com.bytedance.push.g0.f.c("RequestSettingsTask", "auto updateSettings resp for " + str + Constants.COLON_SEPARATOR + a);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("settings");
        if (this.f5649d) {
            f.c(context, optJSONObject2, ((C) C.a()).d().u, "settings_source_sdk");
        } else {
            f.b(context, optJSONObject2, ((C) C.a()).d().u, "settings_source_sdk");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        Application a;
        Map<String, String> c2;
        HashMap hashMap;
        synchronized (f5647e) {
            try {
                a = com.ss.android.message.a.a();
                if (this.b) {
                    com.bytedance.push.g0.f.c("RequestSettingsTask", "request now because mForceRequestSettings is true");
                } else {
                    boolean z = this.a;
                    if (!z && PushServiceManager.get().getIPermissionBootExternalService().sdkNeedRequestSettings()) {
                        com.bytedance.push.g0.f.c("RequestSettingsTask", "set allow sdk request to true because PermissionBootExternalService");
                        z = true;
                        if (this.f5648c == null) {
                            ArrayList arrayList = new ArrayList();
                            this.f5648c = arrayList;
                            arrayList.add(PushExternalService.SETTINGS_REQUEST_TYPE_PUSH_SDK);
                        }
                    }
                    if (!z) {
                        com.bytedance.push.g0.f.c("RequestSettingsTask", "sdk not request because allowRequest is false");
                        return;
                    }
                    com.bytedance.push.g0.f.c("RequestSettingsTask", "allow request is true,mAutoRequestSettings:" + this.a);
                    if (!a()) {
                        com.bytedance.push.g0.f.c("RequestSettingsTask", "RequestSettingsTask checkFrequency false");
                        return;
                    }
                }
                c2 = ((C) C.a()).c();
                hashMap = (HashMap) c2;
            } catch (Exception e2) {
                com.bytedance.push.g0.f.e("RequestSettingsTask", "RequestSettingsTask parse failed：" + Log.getStackTraceString(e2));
            }
            if (TextUtils.isEmpty((CharSequence) hashMap.get("device_id"))) {
                com.bytedance.push.g0.f.c("RequestSettingsTask", "RequestSettingsTask device_id is empty");
                return;
            }
            hashMap.putAll(com.bytedance.push.g0.b.a(a));
            String str = (String) hashMap.get("version_code");
            String str2 = (String) hashMap.get("update_version_code");
            String str3 = (String) hashMap.get("channel");
            List<String> list = this.f5648c;
            if (list == null) {
                b(a, PushExternalService.SETTINGS_REQUEST_TYPE_PUSH_SDK, c2);
                b(a, PushExternalService.SETTINGS_REQUEST_TYPE_ALLIANCE_SDK, c2);
            } else {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    b(a, it2.next(), c2);
                }
            }
            LocalFrequencySettings localFrequencySettings = (LocalFrequencySettings) h.b(a, LocalFrequencySettings.class);
            localFrequencySettings.R(System.currentTimeMillis());
            localFrequencySettings.o(str);
            localFrequencySettings.y0(str2);
            localFrequencySettings.A0(str3);
        }
    }

    public a(boolean z, boolean z2, List<String> list, boolean z3) {
        this.a = z;
        this.b = z2;
        this.f5648c = list;
        this.f5649d = z3;
    }
}
