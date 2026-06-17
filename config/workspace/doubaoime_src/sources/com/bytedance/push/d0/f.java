package com.bytedance.push.d0;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.service.manager.PushServiceManager;
import com.bytedance.android.service.manager.push.settings.ISettingsUpdateListener;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.StatisticsSettings;
import com.bytedance.push.settings.h;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class f implements Runnable {
    private final JSONObject a;
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5655c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5656d;

    class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ JSONObject b;

        a(Context context, JSONObject jSONObject) {
            this.a = context;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            ((AliveOnlineSettings) h.b(this.a, AliveOnlineSettings.class)).updateSettings(this.a, this.b);
            PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) h.b(this.a, PushOnlineSettings.class);
            if (this.b.has("pull_api_strategy")) {
                ((LocalSettings) h.b(this.a, LocalSettings.class)).x0(this.b.optInt("pull_api_strategy"));
                this.b.remove("pull_api_strategy");
            }
            pushOnlineSettings.updateSettings(this.a, this.b);
            ((StatisticsSettings) h.b(this.a, StatisticsSettings.class)).updateSettings(this.a, this.b);
            f fVar = f.this;
            Context context = this.a;
            JSONObject jSONObject = this.b;
            Objects.requireNonNull(fVar);
            com.bytedance.push.third.h.h().b(context, jSONObject);
        }
    }

    private f(Context context, JSONObject jSONObject, boolean z, String str, boolean z2) {
        this.b = context;
        this.a = jSONObject;
        this.f5655c = z;
        this.f5656d = str;
    }

    private void a(Context context, JSONObject jSONObject) {
        a aVar = new a(context, jSONObject);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            com.bytedance.common.push.d.b(aVar);
        } else {
            aVar.run();
        }
    }

    public static void b(Context context, JSONObject jSONObject, boolean z, String str) {
        new f(context, jSONObject, z, str, false).run();
    }

    public static void c(Context context, JSONObject jSONObject, boolean z, String str) {
        new f(context, jSONObject, z, str, true).run();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a == null) {
            return;
        }
        String str = this.f5656d;
        com.bytedance.push.g0.f.c("UpdateSettingsTask", "[updatePushSettings]updateSource:" + str);
        JSONObject jSONObject = this.a;
        if (jSONObject.has("sdk_key_PushSDK")) {
            jSONObject = this.a.optJSONObject("sdk_key_PushSDK");
        }
        if (jSONObject == null) {
            com.bytedance.push.g0.f.e("UpdateSettingsTask", "can't find settings");
            if (com.bytedance.push.g0.f.d()) {
                throw new IllegalArgumentException("settings missing sdk_key_PushSDK");
            }
        } else {
            if (!TextUtils.equals(str, "settings_source_sdk")) {
                for (String str2 : PushOnlineSettings.a) {
                    com.bytedance.push.g0.f.c("UpdateSettingsTask", "cur settings source is not UPDATE_SOURCE_SDK,remove " + str2);
                    jSONObject.remove(str2);
                }
            }
            if (this.f5655c) {
                Context context = this.b;
                try {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                    jSONObject2.remove("ttpush_is_notify_service_stick");
                    jSONObject2.remove("ttpush_allow_push_daemon_monitor");
                    jSONObject2.remove("ttpush_is_close_alarm_wakeup");
                    jSONObject2.remove("ttpush_allow_push_job_service");
                    a(context, jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            } else {
                a(this.b, jSONObject);
            }
        }
        JSONObject jSONObject3 = this.a;
        if (jSONObject3.has("sdk_key_alliance_sdk")) {
            jSONObject3 = this.a.optJSONObject("sdk_key_alliance_sdk");
        }
        if (jSONObject3 == null) {
            com.bytedance.push.g0.f.e("UpdateSettingsTask", "can't find settings");
            if (com.bytedance.push.g0.f.d()) {
                throw new IllegalArgumentException("settings missing sdk_key_alliance_sdk");
            }
        } else if (this.f5655c) {
            Context context2 = this.b;
            try {
                jSONObject3.put("alliance_sdk_enable_wakeup", false);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
            PushServiceManager.get().getIAllianceService().updateSettings(context2, jSONObject3);
        } else {
            PushServiceManager.get().getIAllianceService().updateSettings(this.b, jSONObject3);
        }
        for (Object obj : com.ss.android.pushmanager.setting.c.c().h()) {
            ((ISettingsUpdateListener) obj).onSettingsUpdate();
        }
    }
}
