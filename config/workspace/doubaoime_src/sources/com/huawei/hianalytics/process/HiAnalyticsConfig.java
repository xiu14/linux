package com.huawei.hianalytics.process;

import com.huawei.hianalytics.util.g;
import com.huawei.hianalytics.util.h;

/* loaded from: classes2.dex */
public class HiAnalyticsConfig {
    com.huawei.hianalytics.e.c a;

    public static final class Builder {
        private boolean a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f7149c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f7150d;

        /* renamed from: e, reason: collision with root package name */
        private String f7151e;

        /* renamed from: f, reason: collision with root package name */
        private String f7152f;

        /* renamed from: g, reason: collision with root package name */
        private String f7153g;
        private String h;
        private String i;
        private String j;
        private boolean m;
        private boolean n;
        private int k = 10;
        private int l = 7;
        private boolean o = true;

        public final HiAnalyticsConfig build() {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.build() is executed.");
            return new HiAnalyticsConfig(this, null);
        }

        public final Builder setAndroidId(String str) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setAndroidId() is executed.");
            if (!g.a("AndroidId_CustomSet", str, 4096)) {
                str = "";
            }
            this.i = str;
            return this;
        }

        public final Builder setAutoReportThreshold(int i) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setAutoReportThreshold() is executed.");
            this.k = g.a(i, 500, 10);
            return this;
        }

        public final Builder setCacheExpireTime(int i) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setCacheExpireTime() is executed.");
            this.l = g.a(i, 7, 2);
            return this;
        }

        public final Builder setChannel(String str) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setChannel() is executed.");
            if (!g.a("channel", str, 256)) {
                str = "";
            }
            this.f7151e = str;
            return this;
        }

        public final Builder setCollectURL(String str) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setCollectURL() is executed.");
            if (!h.a(str)) {
                com.huawei.hianalytics.g.b.b("HiAnalytics/event", "setCollectURL: url check failed");
                str = "";
            }
            if (str.endsWith("/") || str.endsWith("\\")) {
                str = str.substring(0, str.length() - 1);
            }
            this.f7152f = str;
            return this;
        }

        @Deprecated
        public final Builder setEnableAndroidID(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableAndroidID() is executed.");
            this.f7150d = z;
            return this;
        }

        @Deprecated
        public final Builder setEnableImei(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableImei() is executed.");
            this.a = z;
            return this;
        }

        public final Builder setEnableMccMnc(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableMccMnc() is executed.");
            this.m = z;
            return this;
        }

        @Deprecated
        public final Builder setEnableSN(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableSN() is executed.");
            this.b = z;
            return this;
        }

        public final Builder setEnableSession(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableSession() is executed.");
            this.n = z;
            return this;
        }

        @Deprecated
        public final Builder setEnableUDID(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableUDID() is executed.");
            this.f7149c = z;
            return this;
        }

        public final Builder setEnableUUID(boolean z) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setEnableUUID() is executed.");
            this.o = z;
            return this;
        }

        public final Builder setImei(String str) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setImei() is executed.");
            if (!g.a("IMEI_CustomSet", str, 4096)) {
                str = "";
            }
            this.f7153g = str;
            return this;
        }

        public final Builder setSN(String str) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setSN() is executed.");
            if (!g.a("SN_CustomSet", str, 4096)) {
                str = "";
            }
            this.j = str;
            return this;
        }

        public final Builder setUdid(String str) {
            com.huawei.hianalytics.g.b.a("HianalyticsSDK", "HiAnalyticsConf.Builder.setUdid() is executed.");
            if (!g.a("Udid_CustomSet", str, 4096)) {
                str = "";
            }
            this.h = str;
            return this;
        }
    }

    HiAnalyticsConfig(Builder builder, AnonymousClass1 anonymousClass1) {
        com.huawei.hianalytics.e.c cVar = new com.huawei.hianalytics.e.c();
        this.a = cVar;
        com.huawei.hianalytics.e.b a = cVar.a();
        a.a(builder.a);
        a.a(builder.f7153g);
        a.d(builder.f7150d);
        a.c(builder.i);
        a.b(builder.b);
        a.d(builder.j);
        a.c(builder.f7149c);
        a.b(builder.h);
        this.a.a(builder.f7151e);
        this.a.b(builder.f7152f);
        this.a.b(builder.m);
        this.a.a(builder.n);
        this.a.b(builder.k);
        this.a.a(builder.l);
        setUUIDEnabled(builder.o);
    }

    public HiAnalyticsConfig(HiAnalyticsConfig hiAnalyticsConfig) {
        this.a = new com.huawei.hianalytics.e.c(hiAnalyticsConfig.a);
    }

    public void setUUIDEnabled(boolean z) {
        this.a.c(z);
    }
}
