package com.huawei.hianalytics.process;

import android.content.Context;
import com.huawei.hianalytics.global.AutoCollectEventType;
import java.util.List;

/* loaded from: classes2.dex */
public interface HiAnalyticsInstanceEx extends HiAnalyticsInstance {

    public static final class Builder {
        private HiAnalyticsConfig a = null;
        private HiAnalyticsConfig b = null;

        /* renamed from: c, reason: collision with root package name */
        private HiAnalyticsConfig f7156c = null;

        /* renamed from: d, reason: collision with root package name */
        private List<AutoCollectEventType> f7157d = null;

        /* renamed from: e, reason: collision with root package name */
        private Context f7158e;

        public Builder(Context context) {
            if (context != null) {
                this.f7158e = context.getApplicationContext();
            }
        }

        public final Builder autoCollect(List<AutoCollectEventType> list) {
            this.f7157d = list;
            return this;
        }

        public final HiAnalyticsInstanceEx create() {
            String str;
            if (this.f7158e == null) {
                str = "create(): instanceEx context is null,create failed!";
            } else {
                if (!HiAnalyticsManager.getInitFlag("_instance_ex_tag")) {
                    c cVar = new c(this.f7158e);
                    HiAnalyticsConfig hiAnalyticsConfig = this.b;
                    cVar.c(hiAnalyticsConfig == null ? null : new HiAnalyticsConfig(hiAnalyticsConfig));
                    HiAnalyticsConfig hiAnalyticsConfig2 = this.a;
                    cVar.a(hiAnalyticsConfig2 == null ? null : new HiAnalyticsConfig(hiAnalyticsConfig2));
                    HiAnalyticsConfig hiAnalyticsConfig3 = this.f7156c;
                    cVar.b(hiAnalyticsConfig3 != null ? new HiAnalyticsConfig(hiAnalyticsConfig3) : null);
                    a.b().a(this.f7158e);
                    b.a().a(this.f7158e);
                    a.b().a(cVar);
                    cVar.a(this.f7157d);
                    return cVar;
                }
                str = "create(): DEFAULT or existed tag is not allowed here.";
            }
            com.huawei.hianalytics.g.b.d("HianalyticsSDK", str);
            return null;
        }

        public final HiAnalyticsInstanceEx refresh() {
            c d2 = a.b().d();
            if (d2 == null) {
                com.huawei.hianalytics.g.b.c("HianalyticsSDK", "HiAnalyticsInstanceEx.Builder.Refresh(): calling refresh before create. Instance not exist.");
                return create();
            }
            d2.refresh(1, this.a);
            d2.refresh(0, this.b);
            d2.refresh(3, this.f7156c);
            d2.a(this.f7157d);
            return d2;
        }

        public final Builder setDiffConf(HiAnalyticsConfig hiAnalyticsConfig) {
            this.f7156c = hiAnalyticsConfig;
            return this;
        }

        public final Builder setMaintConf(HiAnalyticsConfig hiAnalyticsConfig) {
            this.a = hiAnalyticsConfig;
            return this;
        }

        public final Builder setOperConf(HiAnalyticsConfig hiAnalyticsConfig) {
            this.b = hiAnalyticsConfig;
            return this;
        }
    }

    void enableLogCollection(Context context, HiAnalyticsLogConfig hiAnalyticsLogConfig);

    @Deprecated
    void handleV1Cache();

    void onStartApp(String str, String str2);

    void refreshLogCollection(HiAnalyticsLogConfig hiAnalyticsLogConfig, boolean z);
}
