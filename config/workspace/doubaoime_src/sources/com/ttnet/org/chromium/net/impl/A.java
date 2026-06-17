package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.ttnet.org.chromium.net.TTAppInfoProvider;
import com.ttnet.org.chromium.net.TTSamplingSettingProvider$TTSlaSamplingSetting;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public class A extends CronetEngineBuilderImpl {
    public A(Context context, boolean z) {
        super(context, z);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m A(boolean z, boolean z2) {
        Z0(z, z2);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m B(String str) {
        a1(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m C(String str) {
        b1(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m D(TTSamplingSettingProvider$TTSlaSamplingSetting tTSamplingSettingProvider$TTSlaSamplingSetting) {
        c1(tTSamplingSettingProvider$TTSlaSamplingSetting);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m E(boolean z, String str) {
        d1(z, str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m F(String str) {
        e1(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m G(String str) {
        f1(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m H(TTAppInfoProvider.AppInfo appInfo) {
        g1(appInfo);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m I(long j) {
        h1(j);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m J(com.ttnet.org.chromium.net.A a) {
        i1(a);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m K(ArrayList arrayList) {
        j1(arrayList);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m L(int i) {
        k1(i);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m M(String str) {
        l1(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m a(String str, int i, int i2) {
        P(str, i, i2);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.m
    public com.ttnet.org.chromium.net.k b() {
        if (r0() == null) {
            l1(k0());
        }
        return new CronetUrlRequestContext(this);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m c(boolean z) {
        T(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m d(boolean z) {
        U(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m e(boolean z) {
        V(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m f(int i, long j) {
        W(i, j);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m g(boolean z) {
        X(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m h(boolean z) {
        Y(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m i(boolean z) {
        Z(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m j(boolean z) {
        a0(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m k() {
        b0();
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m l(boolean z) {
        z0(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m m(long j) {
        M0(j);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m n(TTAppInfoProvider tTAppInfoProvider) {
        N0(tTAppInfoProvider);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m o(com.ttnet.org.chromium.net.x xVar) {
        O0(xVar);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m p(int i) {
        P0(i);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m q(String str) {
        Q0(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m r(Map map) {
        R0(map);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m t(com.ttnet.org.chromium.net.w wVar) {
        S0(wVar);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m u(String str) {
        T0(str);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m v(boolean z) {
        U0(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m w(boolean z) {
        V0(z);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m y(ArrayList arrayList) {
        X0(arrayList);
        return this;
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.m
    public /* bridge */ /* synthetic */ com.ttnet.org.chromium.net.m z(boolean z) {
        Y0(z);
        return this;
    }
}
