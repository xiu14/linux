package com.bytedance.apm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.F.b;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class h implements com.bytedance.services.apm.api.h, com.bytedance.services.slardar.config.a, com.bytedance.services.apm.api.d, b.e {
    private volatile JSONObject mAllowLogType;
    private volatile JSONObject mAllowService;
    private JSONObject mConfigData;
    private boolean mConfigReady;
    private boolean mIsFront;
    private volatile JSONObject mMetricType;

    private void ensureUnregisterForSafety() {
        unregisterAppLifeCycle();
        unregisterConfigService();
        unregisterTimerTask();
    }

    @WorkerThread
    public void destroy() {
        ensureUnregisterForSafety();
    }

    public boolean getConfigBool(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.mConfigData) == null) {
            return false;
        }
        return jSONObject.optBoolean(str);
    }

    public int getConfigInt(String str, int i) {
        JSONObject jSONObject;
        return (TextUtils.isEmpty(str) || (jSONObject = this.mConfigData) == null) ? i : jSONObject.optInt(str, i);
    }

    @Nullable
    public JSONObject getConfigJSON(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str) || (jSONObject = this.mConfigData) == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    public boolean getLogTypeSwitch(String str) {
        return (this.mAllowLogType == null || TextUtils.isEmpty(str) || this.mAllowLogType.optInt(str) != 1) ? false : true;
    }

    public boolean getMetricTypeSwitch(String str) {
        return (this.mMetricType == null || TextUtils.isEmpty(str) || this.mMetricType.optInt(str) != 1) ? false : true;
    }

    public boolean getServiceSwitch(String str) {
        return (this.mAllowService == null || TextUtils.isEmpty(str) || this.mAllowService.optInt(str) != 1) ? false : true;
    }

    public String getTag() {
        return "base";
    }

    @Override // com.bytedance.services.apm.api.h
    @WorkerThread
    public void init(Context context) {
    }

    public boolean isConfigReady() {
        return this.mConfigReady;
    }

    protected boolean isFront() {
        return this.mIsFront;
    }

    @Override // com.bytedance.services.apm.api.h
    public abstract boolean isOnlyMainProcess();

    @Override // com.bytedance.services.apm.api.d
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityPause(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
        this.mIsFront = false;
    }

    @Override // com.bytedance.services.apm.api.d
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
        this.mIsFront = true;
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
        this.mConfigReady = true;
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
        this.mConfigData = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("custom_event_settings");
        if (optJSONObject != null) {
            this.mAllowLogType = optJSONObject.optJSONObject("allow_log_type");
            this.mMetricType = optJSONObject.optJSONObject("allow_metric_type");
            this.mAllowService = optJSONObject.optJSONObject("allow_service_name");
        }
    }

    @Override // com.bytedance.apm.F.b.e
    public void onTimeEvent(long j) {
    }

    protected final boolean registerAppLifeCycle() {
        IActivityLifeManager iActivityLifeManager = (IActivityLifeManager) com.bytedance.news.common.service.manager.c.a(IActivityLifeManager.class);
        if (iActivityLifeManager == null) {
            return false;
        }
        iActivityLifeManager.register(this);
        return true;
    }

    protected final boolean registerConfigService() {
        IConfigManager iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class);
        if (iConfigManager == null) {
            return false;
        }
        iConfigManager.registerConfigListener(this);
        return true;
    }

    protected final void registerTimerTask() {
        com.bytedance.apm.F.b.e().b(this);
    }

    @Override // com.bytedance.services.apm.api.h
    @WorkerThread
    public void start() {
    }

    @WorkerThread
    public void stop() {
    }

    protected final boolean unregisterAppLifeCycle() {
        IActivityLifeManager iActivityLifeManager = (IActivityLifeManager) com.bytedance.news.common.service.manager.c.a(IActivityLifeManager.class);
        if (iActivityLifeManager == null) {
            return false;
        }
        iActivityLifeManager.unregister(this);
        return true;
    }

    protected final boolean unregisterConfigService() {
        IConfigManager iConfigManager = (IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class);
        if (iConfigManager == null) {
            return false;
        }
        iConfigManager.unregisterConfigListener(this);
        return true;
    }

    protected final void unregisterTimerTask() {
        com.bytedance.apm.F.b.e().l(this);
    }
}
