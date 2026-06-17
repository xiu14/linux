package com.ttnet.org.chromium.net;

import com.ttnet.org.chromium.base.annotations.CalledByNative;

/* loaded from: classes2.dex */
public abstract class TTAppInfoProvider {

    public static class AppInfo {
        private String A;
        private String B;
        private String C;
        private String D;
        private String E;
        private String F;
        private String G;
        private String H;
        private String I;

        /* renamed from: J, reason: collision with root package name */
        private String f8632J;
        private String K;
        private String a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private String f8633c;

        /* renamed from: d, reason: collision with root package name */
        private String f8634d;

        /* renamed from: e, reason: collision with root package name */
        private String f8635e;

        /* renamed from: f, reason: collision with root package name */
        private String f8636f;

        /* renamed from: g, reason: collision with root package name */
        private String f8637g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private String m;
        private String n;
        private String o;
        private String p;
        private String q;
        private String r;
        private String s;
        private String t;
        private String u;
        private String v;
        private String w;
        private String x;
        private String y;
        private String z;

        public void A(String str) {
            this.x = str;
        }

        public void B(String str) {
            this.y = str;
        }

        public void C(String str) {
            this.G = str;
        }

        public void D(String str) {
            this.n = str;
        }

        public void E(String str) {
            this.f8632J = str;
        }

        public void F(String str) {
            this.H = str;
        }

        public void G(String str) {
            this.I = str;
        }

        public void H(String str) {
            this.f8634d = str;
        }

        public void I(String str) {
            this.r = str;
        }

        public void J(String str) {
            this.f8633c = str;
        }

        public void K(String str) {
            this.C = str;
        }

        public void a(String str) {
            this.f8636f = str;
        }

        public void b(String str) {
            this.E = str;
        }

        public void c(String str) {
            this.a = str;
        }

        public void d(String str) {
            this.w = str;
        }

        public void e(String str) {
            this.o = str;
        }

        public void f(String str) {
            this.f8635e = str;
        }

        public void g(String str) {
            this.A = str;
        }

        @CalledByNative
        public String getAbSdkVersion() {
            return this.f8636f;
        }

        @CalledByNative
        public String getAbi() {
            return this.E;
        }

        @CalledByNative
        public String getAppId() {
            return this.a;
        }

        @CalledByNative
        public String getAppName() {
            return this.w;
        }

        @CalledByNative
        public String getCarrierRegion() {
            return this.o;
        }

        @CalledByNative
        public String getChannel() {
            return this.f8635e;
        }

        @CalledByNative
        public String getDeviceBrand() {
            return this.A;
        }

        @CalledByNative
        public String getDeviceId() {
            return this.t;
        }

        @CalledByNative
        public String getDeviceModel() {
            return this.B;
        }

        @CalledByNative
        public String getDevicePlatform() {
            return this.b;
        }

        @CalledByNative
        public String getDeviceType() {
            return this.v;
        }

        @CalledByNative
        public String getDomainBoe() {
            return this.k;
        }

        @CalledByNative
        public String getDomainBoeHttps() {
            return this.l;
        }

        @CalledByNative
        public String getDomainHttpDns() {
            return this.j;
        }

        @CalledByNative
        public String getHostFirst() {
            return this.f8637g;
        }

        @CalledByNative
        public String getHostSecond() {
            return this.h;
        }

        @CalledByNative
        public String getHostThird() {
            return this.i;
        }

        @CalledByNative
        public String getHttpDnsRequestFlags() {
            return this.q;
        }

        @CalledByNative
        public String getInitRegion() {
            return this.p;
        }

        @CalledByNative
        public String getIsDomestic() {
            return this.K;
        }

        @CalledByNative
        public String getIsDropFirstTnc() {
            return this.F;
        }

        @CalledByNative
        public String getManifestVersionCode() {
            return this.D;
        }

        @CalledByNative
        public String getNetAccessType() {
            return this.u;
        }

        @CalledByNative
        public String getOSApi() {
            return this.s;
        }

        @CalledByNative
        public String getOSVersion() {
            return this.z;
        }

        @CalledByNative
        public String getRegion() {
            return this.m;
        }

        @CalledByNative
        public String getSdkAppID() {
            return this.x;
        }

        @CalledByNative
        public String getSdkVersion() {
            return this.y;
        }

        @CalledByNative
        public String getStoreIdc() {
            return this.G;
        }

        @CalledByNative
        public String getSysRegion() {
            return this.n;
        }

        @CalledByNative
        public String getTNCRequestFlags() {
            return this.f8632J;
        }

        @CalledByNative
        public String getTNCRequestHeader() {
            return this.H;
        }

        @CalledByNative
        public String getTNCRequestQuery() {
            return this.I;
        }

        @CalledByNative
        public String getUpdateVersionCode() {
            return this.f8634d;
        }

        @CalledByNative
        public String getUserId() {
            return this.r;
        }

        @CalledByNative
        public String getVersionCode() {
            return this.f8633c;
        }

        @CalledByNative
        public String getVersionName() {
            return this.C;
        }

        public void h(String str) {
            this.t = str;
        }

        public void i(String str) {
            this.B = str;
        }

        public void j(String str) {
            this.b = str;
        }

        public void k(String str) {
            this.v = str;
        }

        public void l(String str) {
            this.k = str;
        }

        public void m(String str) {
            this.l = str;
        }

        public void n(String str) {
            this.j = str;
        }

        public void o(String str) {
            this.f8637g = str;
        }

        public void p(String str) {
            this.h = str;
        }

        public void q(String str) {
            this.i = str;
        }

        public void r(String str) {
            this.q = str;
        }

        public void s(String str) {
            this.p = str;
        }

        public void t(String str) {
            this.K = str;
        }

        public void u(String str) {
            this.F = str;
        }

        public void v(String str) {
            this.D = str;
        }

        public void w(String str) {
            this.u = str;
        }

        public void x(String str) {
            this.s = str;
        }

        public void y(String str) {
            this.z = str;
        }

        public void z(String str) {
            this.m = str;
        }
    }

    public abstract AppInfo a();
}
