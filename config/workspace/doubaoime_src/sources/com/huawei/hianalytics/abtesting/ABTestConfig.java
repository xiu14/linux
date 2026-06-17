package com.huawei.hianalytics.abtesting;

import android.text.TextUtils;
import com.huawei.hianalytics.g.b;
import com.huawei.hianalytics.process.HiAnalyticsConfig;
import com.huawei.hianalytics.util.h;

/* loaded from: classes2.dex */
public class ABTestConfig {
    private HiAnalyticsConfig a;
    private com.huawei.hianalytics.abtesting.a.a b;

    public static final class Builder {
        private HiAnalyticsConfig a;
        private String b;

        /* renamed from: c, reason: collision with root package name */
        private int f7004c = 1440;

        /* renamed from: d, reason: collision with root package name */
        private String f7005d;

        /* renamed from: e, reason: collision with root package name */
        private String f7006e;

        public final ABTestConfig build() {
            return new ABTestConfig(this, null);
        }

        public final Builder setExpSyncInterval(int i) {
            b.b("ABTest/ABTestConfig", "setExpSyncInterval() is execute");
            if (i < 10) {
                b.b("ABTest/ABTestConfig", " setExpSyncInterval : expSyncInterval check failed");
                i = 10;
            }
            this.f7004c = i;
            return this;
        }

        public final Builder setHiAnalyticsConfig(HiAnalyticsConfig hiAnalyticsConfig) {
            b.b("ABTest/ABTestConfig", "setHiAnalyticsConfig() is execute");
            this.a = hiAnalyticsConfig;
            return this;
        }

        public final Builder setSecretKey(String str) {
            b.b("ABTest/ABTestConfig", "setSecretKey() is execute");
            if (TextUtils.isEmpty(str) || str.length() > 200) {
                b.b("ABTest/ABTestConfig", " setSecretKey : secretKey check failed");
                str = "";
            }
            this.b = str;
            return this;
        }

        public final Builder setUrl(String str) {
            b.b("ABTest/ABTestConfig", "setUrl() is execute");
            if (!h.a(str, "dt.hicloud.com")) {
                b.c("ABTest/ABTestConfig", "AB url check failed");
                str = "";
            }
            this.f7005d = str;
            return this;
        }

        public final Builder setUserId(String str) {
            b.b("ABTest/ABTestConfig", "setUserId() is execute");
            if (TextUtils.isEmpty(str) || str.length() > 128) {
                b.b("ABTest/ABTestConfig", " setUserId : userId check failed");
                str = "";
            }
            this.f7006e = str;
            return this;
        }
    }

    ABTestConfig(Builder builder, AnonymousClass1 anonymousClass1) {
        this.a = builder.a;
        com.huawei.hianalytics.abtesting.a.a aVar = new com.huawei.hianalytics.abtesting.a.a();
        this.b = aVar;
        aVar.b(builder.f7005d);
        this.b.a(builder.b);
        this.b.c(builder.f7006e);
        this.b.a(builder.f7004c);
    }

    public HiAnalyticsConfig a() {
        return this.a;
    }

    public com.huawei.hianalytics.abtesting.a.a b() {
        return this.b;
    }
}
