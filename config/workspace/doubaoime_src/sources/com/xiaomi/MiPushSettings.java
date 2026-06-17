package com.xiaomi;

import com.bytedance.push.settings.ILocalSettings;
import com.bytedance.push.settings.k.a;
import com.xiaomi.clientreport.data.Config;

@a(storageKey = "push_multi_process_config", supportMultiProcess = Config.DEFAULT_EVENT_ENCRYPTED)
/* loaded from: classes2.dex */
public interface MiPushSettings extends ILocalSettings {
    boolean N();

    void r0(boolean z);
}
