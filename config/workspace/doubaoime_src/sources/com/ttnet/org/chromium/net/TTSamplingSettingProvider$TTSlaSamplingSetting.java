package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class TTSamplingSettingProvider$TTSlaSamplingSetting {
    public int a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public TTSamplingSettingProvider$TTSlaSamplingRule f8643c;

    /* renamed from: d, reason: collision with root package name */
    public TTSamplingSettingProvider$TTEventLogSamplingRule f8644d;

    @CalledByNative
    public TTSamplingSettingProvider$TTEventLogSamplingRule getEventLogSamplingRule() {
        return this.f8644d;
    }

    @CalledByNative
    public int getHostAid() {
        return this.a;
    }

    @CalledByNative
    public int getSdkAid() {
        return this.b;
    }

    @CalledByNative
    public TTSamplingSettingProvider$TTSlaSamplingRule getSlaSamplingRule() {
        return this.f8643c;
    }
}
