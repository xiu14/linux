package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public class TTSamplingSettingProvider$TTSlaSamplingRule {
    public boolean a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public String[] f8638c;

    /* renamed from: d, reason: collision with root package name */
    public String[] f8639d;

    /* renamed from: e, reason: collision with root package name */
    public String[] f8640e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f8641f;

    /* renamed from: g, reason: collision with root package name */
    public String[] f8642g;
    public String[] h;
    public String[] i;

    @CalledByNative
    public String[] getHostPatternWhiteList() {
        return this.i;
    }

    @CalledByNative
    public String[] getPathContainWhiteList() {
        return this.f8640e;
    }

    @CalledByNative
    public String[] getPathEqualWhiteList() {
        return this.f8639d;
    }

    @CalledByNative
    public String[] getPathPrefixWhiteList() {
        return this.f8641f;
    }

    @CalledByNative
    public String[] getPathRegexWhiteList() {
        return this.f8642g;
    }

    @CalledByNative
    public String[] getUrlRegexBlackList() {
        return this.f8638c;
    }

    @CalledByNative
    public String[] getUrlRegexWhiteList() {
        return this.h;
    }

    @CalledByNative
    public boolean isEnableApiAllUpload() {
        return this.b;
    }

    @CalledByNative
    public boolean isEnableBaseApiAll() {
        return this.a;
    }
}
