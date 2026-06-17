package com.huawei.hianalytics.process;

import android.content.Context;
import com.huawei.hianalytics.util.g;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public interface HiAnalyticsInstance {

    public static final class Builder {
        private HiAnalyticsConfig a = null;
        private HiAnalyticsConfig b = null;

        /* renamed from: c, reason: collision with root package name */
        private HiAnalyticsConfig f7154c = null;

        /* renamed from: d, reason: collision with root package name */
        private Context f7155d;

        public Builder(Context context) {
            if (context != null) {
                this.f7155d = context.getApplicationContext();
            }
        }

        public final HiAnalyticsInstance create(String str) {
            String str2;
            if (this.f7155d == null) {
                str2 = "create(): instance context is null,create failed!";
            } else if (str == null || !g.a("tag", str, "[a-zA-Z0-9][a-zA-Z0-9_]{0,255}")) {
                str2 = "create(): check tag failed! TAG: " + str;
            } else if (HiAnalyticsManager.getInitFlag(str)) {
                str2 = "This tag already exists";
            } else if (a.b().c(str)) {
                str2 = "create(): black tag is not allowed here.";
            } else {
                if (a.b().a() - a.b().e() <= 50) {
                    d dVar = new d(str);
                    HiAnalyticsConfig hiAnalyticsConfig = this.b;
                    if (hiAnalyticsConfig == null) {
                        dVar.c((HiAnalyticsConfig) null);
                    } else {
                        dVar.c(new HiAnalyticsConfig(hiAnalyticsConfig));
                    }
                    HiAnalyticsConfig hiAnalyticsConfig2 = this.a;
                    if (hiAnalyticsConfig2 == null) {
                        dVar.a((HiAnalyticsConfig) null);
                    } else {
                        dVar.a(new HiAnalyticsConfig(hiAnalyticsConfig2));
                    }
                    HiAnalyticsConfig hiAnalyticsConfig3 = this.f7154c;
                    dVar.b(hiAnalyticsConfig3 != null ? new HiAnalyticsConfig(hiAnalyticsConfig3) : null);
                    a.b().a(this.f7155d);
                    b.a().a(this.f7155d);
                    d a = a.b().a(str, dVar);
                    return a == null ? dVar : a;
                }
                str2 = "The number of TAGs exceeds the limit!";
            }
            com.huawei.hianalytics.g.b.d("HianalyticsSDK", str2);
            return null;
        }

        public final HiAnalyticsInstance refresh(String str) {
            d a = a.b().a(str);
            if (a != null) {
                a.refresh(1, this.a);
                a.refresh(0, this.b);
                a.refresh(3, this.f7154c);
                return a;
            }
            com.huawei.hianalytics.g.b.c("HianalyticsSDK", "HiAnalyticsInstance.Builder.Refresh(): calling refresh before create. TAG: " + str + " has no instance. ");
            return create(str);
        }

        public final Builder setDiffConf(HiAnalyticsConfig hiAnalyticsConfig) {
            this.f7154c = hiAnalyticsConfig;
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

    void clearData();

    void newInstanceUUID();

    void onBackground(long j);

    void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap);

    @Deprecated
    void onEvent(Context context, String str, String str2);

    void onEvent(String str, LinkedHashMap<String, String> linkedHashMap);

    void onForeground(long j);

    void onPause(Context context);

    void onPause(Context context, LinkedHashMap<String, String> linkedHashMap);

    void onPause(String str, LinkedHashMap<String, String> linkedHashMap);

    void onReport(int i);

    @Deprecated
    void onReport(Context context, int i);

    void onResume(Context context);

    void onResume(Context context, LinkedHashMap<String, String> linkedHashMap);

    void onResume(String str, LinkedHashMap<String, String> linkedHashMap);

    void onStreamEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap);

    void refresh(int i, HiAnalyticsConfig hiAnalyticsConfig);

    void setCommonProp(int i, Map<String, String> map);

    void setOAID(int i, String str);

    void setOAIDTrackingFlag(int i, boolean z);

    void setUpid(int i, String str);
}
