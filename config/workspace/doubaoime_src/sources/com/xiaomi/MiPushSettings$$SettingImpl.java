package com.xiaomi;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.push.settings.a;
import com.bytedance.push.settings.storage.k;

/* loaded from: classes2.dex */
public class MiPushSettings$$SettingImpl implements MiPushSettings {
    private k a;

    public MiPushSettings$$SettingImpl(Context context, k kVar) {
        this.a = kVar;
    }

    @Override // com.xiaomi.MiPushSettings
    public boolean N() {
        k kVar = this.a;
        if (kVar == null || !kVar.contains("mipush_upgrade_3616")) {
            return false;
        }
        return this.a.b("mipush_upgrade_3616");
    }

    @Override // com.xiaomi.MiPushSettings
    public void r0(boolean z) {
        k kVar = this.a;
        if (kVar != null) {
            SharedPreferences.Editor edit = kVar.edit();
            edit.putBoolean("mipush_upgrade_3616", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, a aVar) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.registerValChanged(context, str, str2, aVar);
        }
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(a aVar) {
        k kVar = this.a;
        if (kVar != null) {
            kVar.unregisterValChanged(aVar);
        }
    }
}
