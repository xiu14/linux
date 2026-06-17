package com.bytedance.crash.runtime;

import com.bytedance.crash.N.g;
import com.bytedance.crash.N.h;
import com.bytedance.crash.m;
import com.bytedance.crash.monitor.l;

@Deprecated
/* loaded from: classes.dex */
public class ConfigManager {
    private boolean mEnsureEnable = true;

    public String getAlogUploadUrl() {
        g.a();
        return g.b();
    }

    public long getDefaultAnrCheckInterval() {
        return h.a();
    }

    public String getNativeCrashUploadUrl() {
        return g.l();
    }

    public boolean isDebugMode() {
        return h.d();
    }

    public boolean isEnsureEnable() {
        com.bytedance.crash.monitor.a e2;
        if (h.e() && (e2 = l.e()) != null) {
            return e2.g().h();
        }
        return false;
    }

    public boolean isReportErrorEnable() {
        return h.h();
    }

    public void setAlogUploadUrl(String str) {
        g.a().n(str);
    }

    public void setConfigGetUrl(String str) {
        g.a().o(str);
    }

    public void setCurrentProcessName(String str) {
        com.bytedance.crash.util.a.v(str);
    }

    public void setDebugMode(boolean z) {
        h.j(z);
    }

    public void setDefaultAnrCheckInterval(long j) {
        h.i(j);
    }

    public void setEncryptImpl(m mVar) {
        if (mVar != null) {
            h.k(mVar);
        }
    }

    public void setEnsureEnable(boolean z) {
        h.l(z);
    }

    public void setJavaCrashUploadUrl(String str) {
        g.a().p(str);
    }

    public void setLaunchCrashInterval(long j) {
        h.m(j);
    }

    public void setLaunchCrashUrl(String str) {
        g.a().q(str);
    }

    public void setNativeCrashUrl(String str) {
        g.a().r(str);
    }

    public void setReportErrorEnable(boolean z) {
        h.n(z);
    }
}
