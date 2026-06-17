package com.huawei.hianalytics.process;

import com.huawei.hianalytics.e.f;
import com.huawei.hianalytics.util.g;
import com.huawei.hianalytics.util.h;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class HiAnalyticsLogConfig {
    private f a = new f();

    public static final class Builder {
        private int a;

        /* renamed from: d, reason: collision with root package name */
        private String f7160d;

        /* renamed from: e, reason: collision with root package name */
        private String f7161e;
        private boolean h;
        private boolean i;
        private boolean j;
        private int b = 3;

        /* renamed from: c, reason: collision with root package name */
        private int f7159c = 5;

        /* renamed from: f, reason: collision with root package name */
        private String[] f7162f = new String[0];

        /* renamed from: g, reason: collision with root package name */
        private int f7163g = 0;
        private String k = "";
        private String l = "";
        private String m = "";

        public Builder(int i, String str, String str2) {
            this.a = i;
            this.f7160d = str;
            this.f7161e = str2;
        }

        public final HiAnalyticsLogConfig build() {
            return new HiAnalyticsLogConfig(this, null);
        }

        public final Builder setFailedFileMaxSize(int i) {
            this.f7159c = i;
            return this;
        }

        public final Builder setFileMaxSize(int i) {
            this.b = i;
            return this;
        }

        @Deprecated
        public final Builder setLogEnableImei(boolean z) {
            this.h = z;
            return this;
        }

        @Deprecated
        public final Builder setLogEnableSN(boolean z) {
            this.j = z;
            return this;
        }

        @Deprecated
        public final Builder setLogEnableUdid(boolean z) {
            this.i = z;
            return this;
        }

        public final Builder setLogImei(String str) {
            if (!g.a("logimei", str, 4096)) {
                str = "";
            }
            this.k = str;
            return this;
        }

        public final Builder setLogSN(String str) {
            if (!g.a("logsn", str, 4096)) {
                str = "";
            }
            this.m = str;
            return this;
        }

        public final Builder setLogUdid(String str) {
            if (!g.a("logudid", str, 4096)) {
                str = "";
            }
            this.l = str;
            return this;
        }

        public final Builder setThrowableInfo(int i, String[] strArr) {
            this.f7163g = i;
            if (strArr != null) {
                this.f7162f = (String[]) strArr.clone();
            } else {
                this.f7162f = new String[0];
            }
            return this;
        }
    }

    HiAnalyticsLogConfig(Builder builder, AnonymousClass1 anonymousClass1) {
        int i;
        int i2 = builder.a;
        if (3 > i2 || i2 > 6) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "HiAnalyticsLogConfig.setMinLogLevel(): minLogLevel: " + i2 + " invalid. Replaced with default value");
            this.a.a(4);
        } else {
            this.a.a(i2);
        }
        this.a.b(g.a(builder.b, 10, 3));
        this.a.c(g.a(builder.f7159c, 10, 5));
        this.a.a(g.a(builder.f7160d, 999, 100));
        String str = builder.f7161e;
        if (!h.a(str)) {
            com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "log server url check failed");
            str = "";
        }
        this.a.b((str.endsWith("/") || str.endsWith("\\")) ? str.substring(0, str.length() - 1) : str);
        String[] strArr = builder.f7162f;
        if (strArr != null) {
            if (Arrays.toString(strArr).length() <= 204800) {
                this.a.a((String[]) strArr.clone());
                i = builder.f7163g;
                if (i != 0 || i == 1) {
                    this.a.d(i);
                } else {
                    com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "The throwableFlag is wrong. Set to default value.");
                    this.a.d(0);
                }
                this.a.a(builder.h);
                this.a.b(builder.i);
                this.a.c(builder.j);
                this.a.c(builder.k);
                this.a.d(builder.l);
                this.a.e(builder.m);
            }
            com.huawei.hianalytics.g.b.c("HiAnalytics/logServer", "The throwableInfo parameter is too long!");
        }
        this.a.a(new String[0]);
        i = builder.f7163g;
        if (i != 0) {
        }
        this.a.d(i);
        this.a.a(builder.h);
        this.a.b(builder.i);
        this.a.c(builder.j);
        this.a.c(builder.k);
        this.a.d(builder.l);
        this.a.e(builder.m);
    }

    f a() {
        return this.a;
    }
}
