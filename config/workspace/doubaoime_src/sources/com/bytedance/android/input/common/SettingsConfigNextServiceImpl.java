package com.bytedance.android.input.common;

import com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService;
import com.ss.android.message.log.PushLog;
import com.ss.android.ugc.aweme.framework.services.annotation.ServiceImpl;

@ServiceImpl
/* loaded from: classes.dex */
public final class SettingsConfigNextServiceImpl implements ISettingsConfigNextService {
    @Override // com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService
    public Object a(String str) {
        kotlin.s.c.l.f(str, "key");
        return SettingsConfigNext.f(str);
    }

    @Override // com.bytedance.android.input.basic.settings.api.ISettingsConfigNextService
    public void b(String str, Object obj) {
        kotlin.s.c.l.f(str, "key");
        kotlin.s.c.l.f(obj, PushLog.KEY_VALUE);
        SettingsConfigNext.l(str, obj);
    }
}
