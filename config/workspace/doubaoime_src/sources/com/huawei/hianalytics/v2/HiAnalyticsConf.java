package com.huawei.hianalytics.v2;

import android.content.Context;
import com.huawei.hianalytics.g.b;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.process.HiAnalyticsLogConfig;
import com.huawei.hianalytics.process.HiAnalyticsManager;
import com.huawei.hianalytics.process.a;
import com.huawei.hianalytics.process.d;

/* loaded from: classes2.dex */
public class HiAnalyticsConf {

    public static class Builder {
        HiAnalyticsConfig.Builder a;
        HiAnalyticsConfig.Builder b;

        /* renamed from: c, reason: collision with root package name */
        HiAnalyticsConfig.Builder f7173c;

        /* renamed from: d, reason: collision with root package name */
        HiAnalyticsConfig.Builder f7174d;

        /* renamed from: e, reason: collision with root package name */
        HiAnalyticsLogConfig f7175e;

        /* renamed from: f, reason: collision with root package name */
        Context f7176f;

        /* renamed from: g, reason: collision with root package name */
        String f7177g;

        public Builder(Context context) {
            if (context != null) {
                this.f7176f = context.getApplicationContext();
            }
            this.a = new HiAnalyticsConfig.Builder();
            this.b = new HiAnalyticsConfig.Builder();
            this.f7173c = new HiAnalyticsConfig.Builder();
            this.f7174d = new HiAnalyticsConfig.Builder();
        }

        public void create() {
            if (this.f7176f == null) {
                b.d("HianalyticsSDK", "analyticsConf create(): context is null,create failed!");
                return;
            }
            b.b("HianalyticsSDK", "Builder.create() is execute.");
            HiAnalyticsConfig build = this.a.build();
            HiAnalyticsConfig build2 = this.b.build();
            HiAnalyticsConfig build3 = this.f7173c.build();
            HiAnalyticsConfig build4 = this.f7174d.build();
            d dVar = new d("_default_config_tag");
            dVar.c(build2);
            dVar.a(build);
            dVar.b(build3);
            dVar.d(build4);
            a.b().a(this.f7176f);
            com.huawei.hianalytics.process.b.a().a(this.f7176f);
            a.b().a("_default_config_tag", dVar);
            HiAnalyticsManager.setAppid(this.f7177g);
            a.b().a(this.f7176f, this.f7175e);
        }

        public void refresh(boolean z) {
            b.b("HianalyticsSDK", "Builder.refresh() is execute.");
            HiAnalyticsConfig build = this.a.build();
            HiAnalyticsConfig build2 = this.b.build();
            HiAnalyticsConfig build3 = this.f7173c.build();
            HiAnalyticsConfig build4 = this.f7174d.build();
            d a = a.b().a("_default_config_tag");
            if (a == null) {
                b.c("HianalyticsSDK", "HiAnalyticsInstance.Builder.Refresh(): calling refresh before create. TAG: _default_config_tag has no instance. ");
                return;
            }
            a.refresh(1, build);
            a.refresh(0, build2);
            a.refresh(3, build3);
            a.refresh(2, build4);
            if (z) {
                a.b().d("_default_config_tag");
            }
            a.b().a(this.f7175e, z);
            HiAnalyticsManager.setAppid(this.f7177g);
        }

        public Builder setAndroidId(String str) {
            b.b("HianalyticsSDK", "setAndroidId(String androidId) is execute.");
            this.b.setAndroidId(str);
            this.a.setAndroidId(str);
            this.f7173c.setAndroidId(str);
            this.f7174d.setAndroidId(str);
            return this;
        }

        public Builder setAppID(String str) {
            b.b("HianalyticsSDK", "Builder.setAppID is execute");
            this.f7177g = str;
            return this;
        }

        public Builder setAutoReportThreshold(int i) {
            b.b("HianalyticsSDK", "Builder.setAutoReportThreshold is execute");
            this.b.setAutoReportThreshold(i);
            this.a.setAutoReportThreshold(i);
            this.f7173c.setAutoReportThreshold(i);
            this.f7174d.setAutoReportThreshold(i);
            return this;
        }

        public Builder setCacheExpireTime(int i) {
            b.b("HianalyticsSDK", "Builder.setCacheExpireTime is execute");
            this.b.setCacheExpireTime(i);
            this.a.setCacheExpireTime(i);
            this.f7173c.setCacheExpireTime(i);
            this.f7174d.setCacheExpireTime(i);
            return this;
        }

        public Builder setChannel(String str) {
            b.b("HianalyticsSDK", "Builder.setChannel(String channel) is execute.");
            this.b.setChannel(str);
            this.a.setChannel(str);
            this.f7173c.setChannel(str);
            this.f7174d.setChannel(str);
            return this;
        }

        public Builder setCollectURL(int i, String str) {
            HiAnalyticsConfig.Builder builder;
            b.b("HianalyticsSDK", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
            if (i == 0) {
                builder = this.b;
            } else if (i == 1) {
                builder = this.a;
            } else {
                if (i != 3) {
                    b.c("HianalyticsSDK", "Builder.setCollectURL(int type,String collectURL): invalid type!");
                    return this;
                }
                builder = this.f7173c;
            }
            builder.setCollectURL(str);
            return this;
        }

        @Deprecated
        public Builder setEnableAndroidID(boolean z) {
            b.b("HianalyticsSDK", "Builder.setEnableAndroidID(boolean reportAndroidID) is execute.");
            this.a.setEnableAndroidID(z);
            this.b.setEnableAndroidID(z);
            this.f7173c.setEnableAndroidID(z);
            this.f7174d.setEnableAndroidID(z);
            return this;
        }

        public Builder setEnableCollectLog(HiAnalyticsLogConfig hiAnalyticsLogConfig) {
            b.b("HianalyticsSDK", "Builder.setEnableCollectLog (LogConfig logConfig) is execute.");
            this.f7175e = hiAnalyticsLogConfig;
            return this;
        }

        @Deprecated
        public Builder setEnableImei(boolean z) {
            b.b("HianalyticsSDK", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
            this.b.setEnableImei(z);
            this.a.setEnableImei(z);
            this.f7173c.setEnableImei(z);
            this.f7174d.setEnableImei(z);
            return this;
        }

        public Builder setEnableMccMnc(boolean z) {
            b.b("HianalyticsSDK", "Builder.setEnableMccMnc(boolean enableMccMnc) is execute.");
            this.a.setEnableMccMnc(z);
            this.b.setEnableMccMnc(z);
            this.f7173c.setEnableMccMnc(z);
            this.f7174d.setEnableMccMnc(z);
            return this;
        }

        @Deprecated
        public Builder setEnableSN(boolean z) {
            b.b("HianalyticsSDK", "Builder.setEnableSN(boolean isReportSN) is execute.");
            this.a.setEnableSN(z);
            this.b.setEnableSN(z);
            this.f7173c.setEnableSN(z);
            this.f7174d.setEnableSN(z);
            return this;
        }

        public Builder setEnableSession(boolean z) {
            b.b("HianalyticsSDK", "setEnableSession(boolean enableSession) is execute.");
            this.b.setEnableSession(z);
            return this;
        }

        @Deprecated
        public Builder setEnableUDID(boolean z) {
            b.b("HianalyticsSDK", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
            this.a.setEnableUDID(z);
            this.b.setEnableUDID(z);
            this.f7173c.setEnableUDID(z);
            this.f7174d.setEnableUDID(z);
            return this;
        }

        public Builder setEnableUUID(boolean z) {
            b.a("HianalyticsSDK", "Builder.setEnableUUID() is executed.");
            this.b.setEnableUUID(z);
            this.a.setEnableUUID(z);
            this.f7173c.setEnableUUID(z);
            this.f7174d.setEnableUUID(z);
            return this;
        }

        public Builder setIMEI(String str) {
            b.b("HianalyticsSDK", "setIMEI(String imei) is execute.");
            this.b.setImei(str);
            this.a.setImei(str);
            this.f7173c.setImei(str);
            this.f7174d.setImei(str);
            return this;
        }

        public Builder setSN(String str) {
            b.b("HianalyticsSDK", "setSN(String sn) is execute.");
            this.b.setSN(str);
            this.a.setSN(str);
            this.f7173c.setSN(str);
            this.f7174d.setSN(str);
            return this;
        }

        public Builder setUDID(String str) {
            b.b("HianalyticsSDK", "setUDID(String udid) is execute.");
            this.b.setUdid(str);
            this.a.setUdid(str);
            this.f7173c.setUdid(str);
            this.f7174d.setUdid(str);
            return this;
        }
    }
}
