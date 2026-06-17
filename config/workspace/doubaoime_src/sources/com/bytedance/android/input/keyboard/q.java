package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.doubaoime.activity.PrivacyStatementActivity;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.data_storage.api.ImeKv;
import com.bytedance.android.input.basic.data_storage.api.KvRepoStrategy;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common_biz.performance.api.PerformanceConfig;
import com.prolificinteractive.materialcalendarview.r;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.h;

/* loaded from: classes.dex */
public final class q {
    public static final q a = null;
    public static AtomicLong b = new AtomicLong(0);

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<String> f2778c = new AtomicReference<>("manual_trigger");

    public static final boolean a(Context context) {
        kotlin.s.c.l.f(context, "context");
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.getContext();
        e.a.a.a.a.r0("shouldShowPrivacyStatement processName: ", d.a.b.a.e(), "PrivacyStatementManager");
        AtomicReference<String> atomicReference = f2778c;
        atomicReference.set("manual_trigger");
        if (aVar.h()) {
            com.bytedance.android.input.r.j.i("PrivacyStatementManager", "shouldShowPrivacyStatement false isExternalPackage true, don't show privacy statement");
            return false;
        }
        if (!KeyboardJni.getKeyboardJni().isDeviceSetupComplete(aVar.getContext())) {
            com.bytedance.android.input.r.j.i("PrivacyStatementManager", "shouldShowPrivacyStatement false isDeviceSetupComplete false, don't show privacy statement");
            return false;
        }
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        String string = context.getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "context.getString(R.string.full_base_input_mode)");
        if (settingsConfigNext.h(string)) {
            atomicReference.set("input_mode_unknown");
            com.bytedance.android.input.r.j.i("PrivacyStatementManager", "shouldShowPrivacyStatement true。 mode is unknown, show privacy statement");
            return true;
        }
        String string2 = context.getString(C0838R.string.privacy_statement_pop_has_shown);
        kotlin.s.c.l.e(string2, "context.getString(R.stri…_statement_pop_has_shown)");
        Object f2 = SettingsConfigNext.f(string2);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean z = !((Boolean) f2).booleanValue();
        atomicReference.set(z ? "privacy_statement_not_shown" : "manual_trigger");
        com.bytedance.android.input.r.j.i("PrivacyStatementManager", "shouldShowPrivacyStatement " + z);
        return z;
    }

    public static final void b(Context context, int i, boolean z) {
        kotlin.s.c.l.f(context, "context");
        if (!KeyboardJni.getKeyboardJni().isDeviceSetupComplete(IAppGlobals.a.getContext())) {
            com.bytedance.android.input.r.j.m("PrivacyStatementManager", "DO NOT showPrivacyStatement isDeviceSetupComplete false");
            return;
        }
        if (z) {
            final String andSet = f2778c.getAndSet("manual_trigger");
            kotlin.s.c.l.e(andSet, "showReason");
            final SharedPreferences c2 = SettingsConfigNext.a.c();
            final String string = context.getString(C0838R.string.full_base_input_mode);
            kotlin.s.c.l.e(string, "context.getString(R.string.full_base_input_mode)");
            final String string2 = context.getString(C0838R.string.privacy_statement_pop_has_shown);
            kotlin.s.c.l.e(string2, "context.getString(R.stri…_statement_pop_has_shown)");
            kotlin.s.c.l.f(andSet, "showReason");
            kotlin.s.c.l.f(c2, "sharedPreferences");
            kotlin.s.c.l.f(string, "inputModeKey");
            kotlin.s.c.l.f(string2, "privacyShownKey");
            if (PerformanceConfig.INSTANCE.isSpMonitorEnabled() && !kotlin.s.c.l.a(andSet, "manual_trigger")) {
                com.bytedance.android.input.basic.d.a.a(new Runnable() { // from class: com.bytedance.android.input.common_biz.performance.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object J2;
                        String str = string;
                        String str2 = string2;
                        SharedPreferences sharedPreferences = c2;
                        String str3 = andSet;
                        kotlin.s.c.l.f(str, "$inputModeKey");
                        kotlin.s.c.l.f(str2, "$privacyShownKey");
                        kotlin.s.c.l.f(sharedPreferences, "$sharedPreferences");
                        kotlin.s.c.l.f(str3, "$showReason");
                        try {
                            long longValue = ((Number) ImeKv.a.c(KvRepoStrategy.DEFAULT_MULTI_PROCESS, "privacy_popup_first_show_time", -1L)).longValue();
                            try {
                                J2 = sharedPreferences.getAll();
                            } catch (Throwable th) {
                                J2 = r.J(th);
                            }
                            Object o = kotlin.collections.g.o();
                            if (J2 instanceof h.a) {
                                J2 = o;
                            }
                            Map map = (Map) J2;
                            boolean containsKey = map.containsKey(str);
                            boolean containsKey2 = map.containsKey(str2);
                            String str4 = containsKey ? map.get(str) : "missing";
                            Object obj = containsKey2 ? map.get(str2) : "missing";
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            linkedHashMap.put("show_reason", str3);
                            IAppGlobals.a aVar = IAppGlobals.a;
                            aVar.getContext();
                            String d2 = d.a.b.a.d();
                            kotlin.s.c.l.e(d2, "getProcessName(IAppGlobals.context)");
                            linkedHashMap.put("process_name", d2);
                            linkedHashMap.put("sp_size", Integer.valueOf(map.size()));
                            linkedHashMap.put("input_mode_contains", Boolean.valueOf(containsKey));
                            linkedHashMap.put("input_mode_value", String.valueOf(str4));
                            linkedHashMap.put("privacy_shown_contains", Boolean.valueOf(containsKey2));
                            linkedHashMap.put("privacy_shown_value", String.valueOf(obj));
                            linkedHashMap.put("kv_load_show_time", Long.valueOf(longValue));
                            String str5 = Build.MODEL;
                            kotlin.s.c.l.e(str5, "MODEL");
                            linkedHashMap.put("ime_device_type", str5);
                            String str6 = Build.BRAND;
                            kotlin.s.c.l.e(str6, "BRAND");
                            linkedHashMap.put("ime_device_brand", str6);
                            PerformanceConfig.INSTANCE.trace("ime_privacy_popup_state_monitor", linkedHashMap);
                            aVar.x("SPMonitorLog", "monitorPrivacyPopupShow:" + kotlin.collections.g.C(linkedHashMap.entrySet(), " ", null, null, 0, null, l.a, 30, null));
                        } catch (Throwable th2) {
                            IAppGlobals.a.J("SPMonitorLog", th2);
                        }
                    }
                });
            }
        }
        com.bytedance.android.input.r.j.m("PrivacyStatementManager", "showPrivacyStatement action: " + i);
        Intent intent = new Intent(context, (Class<?>) PrivacyStatementActivity.class);
        intent.addFlags(268566528);
        intent.putExtra("action", i);
        context.startActivity(intent);
    }

    public static /* synthetic */ void c(Context context, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        b(context, i, z);
    }
}
