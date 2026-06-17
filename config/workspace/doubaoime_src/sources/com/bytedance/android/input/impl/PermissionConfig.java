package com.bytedance.android.input.impl;

import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig;
import com.bytedance.android.input.r.j;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;
import kotlin.s.c.l;

@ServiceImpl
/* loaded from: classes.dex */
public final class PermissionConfig implements IPermissionConfig {
    @Override // com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig
    public void a(String str, boolean z) {
        l.f(str, "key");
        j.i("PermissionConfig", "updateSettingsBooleanValue");
        KeyboardJni.updateSettingsBooleanValue(str, z);
    }
}
