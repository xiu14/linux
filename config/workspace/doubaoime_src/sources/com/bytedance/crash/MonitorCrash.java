package com.bytedance.crash;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MonitorCrash {

    @Deprecated
    private final Config mConfig = new Config(this);
    private final com.bytedance.crash.monitor.f mCrashListener;

    @Deprecated
    public class Config {
        private final MonitorCrash mMonitorCrash;

        Config(MonitorCrash monitorCrash) {
            this.mMonitorCrash = monitorCrash;
        }

        public Config setChannel(String str) {
            this.mMonitorCrash.setChannel(str);
            return this;
        }

        public Config setDeviceId(String str) {
            this.mMonitorCrash.setDeviceId(str);
            return this;
        }

        public Config setPackageName(String str) {
            this.mMonitorCrash.setPackageName(str);
            return this;
        }

        public Config setSoList(String[] strArr) {
            this.mMonitorCrash.setSoList(strArr);
            return this;
        }

        public Config setUID(long j) {
            this.mMonitorCrash.setUserId(j);
            return this;
        }
    }

    private MonitorCrash(@NonNull com.bytedance.crash.monitor.f fVar) {
        this.mCrashListener = fVar;
    }

    @Deprecated
    public static MonitorCrash init(@NonNull Context context, @NonNull String str, long j, @NonNull String str2) {
        return initApp(context, str, j, str2);
    }

    public static MonitorCrash initApp(@NonNull Context context, @NonNull String str, long j, @NonNull String str2) {
        return new MonitorCrash(com.bytedance.crash.monitor.l.a(context, str, str2, j));
    }

    @NonNull
    public static MonitorCrash initSDK(Context context, String str, long j, String str2, String str3) {
        return initSDK(context, str, j, str2, str3, null);
    }

    @NonNull
    @Deprecated
    public Config config() {
        return this.mConfig;
    }

    @NonNull
    public J getUserDataCenter() {
        return this.mCrashListener.j();
    }

    public void reportCustomErr(String str, Throwable th) {
        this.mCrashListener.g().o(th, str);
    }

    public void reportEvent(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.mCrashListener.h().e(str, i, jSONObject, jSONObject2);
    }

    public void setChannel(@NonNull String str) {
        this.mCrashListener.q(str);
    }

    public void setDeviceId(@NonNull String str) {
        this.mCrashListener.r(str);
    }

    public void setPackageName(String str) {
        com.bytedance.crash.monitor.f fVar = this.mCrashListener;
        if (fVar instanceof com.bytedance.crash.monitor.m) {
            Objects.requireNonNull((com.bytedance.crash.monitor.m) fVar);
        }
    }

    public void setSoList(String[] strArr) {
        com.bytedance.crash.monitor.f fVar = this.mCrashListener;
        if (fVar instanceof com.bytedance.crash.monitor.m) {
            Objects.requireNonNull((com.bytedance.crash.monitor.m) fVar);
        }
    }

    public void setUserId(@NonNull long j) {
        this.mCrashListener.z(j);
    }

    @NonNull
    public static MonitorCrash initSDK(@NonNull Context context, @NonNull String str, long j, @NonNull String str2, String str3, String[] strArr) {
        C0652g.r(context);
        com.bytedance.crash.monitor.m mVar = new com.bytedance.crash.monitor.m(str, str2, j, new String[]{str3}, strArr);
        C0651f.f(context, mVar);
        return new MonitorCrash(mVar);
    }

    @Deprecated
    public void reportCustomErr(String str, String str2, Throwable th) {
        this.mCrashListener.g().o(th, str);
    }
}
