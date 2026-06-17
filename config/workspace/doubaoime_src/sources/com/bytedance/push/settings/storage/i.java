package com.bytedance.push.settings.storage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.service.manager.pull.PullConfiguration;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class i implements com.bytedance.push.settings.i {
    private static final ConcurrentHashMap<String, k> a = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, k> b = new ConcurrentHashMap<>();

    public k a(Context context, boolean z, String str, String str2) {
        k cVar;
        if (!z) {
            ConcurrentHashMap<String, k> concurrentHashMap = a;
            k kVar = concurrentHashMap.get(str);
            if (kVar != null) {
                return kVar;
            }
            h hVar = new h(context, str);
            concurrentHashMap.put(str, hVar);
            return hVar;
        }
        ConcurrentHashMap<String, k> concurrentHashMap2 = b;
        k kVar2 = concurrentHashMap2.get(str);
        if (kVar2 != null) {
            if (TextUtils.isEmpty(str2) || !(kVar2 instanceof e)) {
                return kVar2;
            }
            com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "SharedPreferenceStorageFactory#create : originProcess is not empty but  storageResult instanceof MultiProcessSpStorage, not use it");
        }
        com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "SharedPreferenceStorageFactory#create : storageKey is " + str);
        boolean d2 = com.bytedance.push.settings.r.b.b().d(context);
        com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "SharedPreferenceStorageFactory#create allowStartOthersProcessFromSp is " + d2);
        if (d2) {
            com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "SharedPreferenceStorageFactory#buildStorageWithAllowStartOthersProcess storageKey is " + str);
            if (TextUtils.equals(str2, PullConfiguration.PROCESS_NAME_SMP) || TextUtils.equals(str2, PullConfiguration.PROCESS_NAME_MAIN)) {
                com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "originProcess is  ：" + str2 + " ， use MPProviderProcessStorage!");
                cVar = new c(context, str);
            } else {
                cVar = MainProcessSettingsProvider.d(context) ? new c(context, str) : new e(context, str);
            }
        } else if (TextUtils.equals(str2, PullConfiguration.PROCESS_NAME_SMP) || TextUtils.equals(str2, PullConfiguration.PROCESS_NAME_MAIN)) {
            com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "originProcess is  ：" + str2 + " ， use MPProviderProcessStorage!");
            cVar = new c(context, str);
        } else {
            com.bytedance.push.settings.r.b.b().c(context);
            String a2 = com.bytedance.push.settings.r.b.b().a(context);
            com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "firstProcess is  ：" + a2);
            if (TextUtils.equals(com.bytedance.push.settings.D.a.a(context), a2)) {
                com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "curIsFirstProcess ，write sp with MPProviderProcessStorage");
                cVar = new c(context, str);
            } else if (TextUtils.isEmpty(a2) || !a2.endsWith(":smp")) {
                if (TextUtils.isEmpty(a2)) {
                    Log.e("SettingsManager-->SPStorageFactory", "firstProcess is empty, write on main process");
                } else {
                    com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "firstProcess is not smp, write on main process");
                }
                cVar = MainProcessSettingsProvider.d(context) ? new c(context, str) : new e(context, str);
            } else {
                com.bytedance.push.settings.s.a.b().a("SPStorageFactory", "firstProcess is smp, write sp with MultiProcessSpStorage");
                cVar = new e(context, str, true);
            }
        }
        concurrentHashMap2.put(str, cVar);
        return cVar;
    }
}
