package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class TTSamplingSettingProvider$TTEventLogSamplingRule {
    public String[] a;

    @CalledByNative
    public String[] getEventLogTypeWhiteList() {
        return this.a;
    }
}
