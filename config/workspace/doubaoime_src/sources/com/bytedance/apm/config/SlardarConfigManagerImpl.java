package com.bytedance.apm.config;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.services.slardar.config.IConfigManager;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SlardarConfigManagerImpl implements IConfigManager {
    private i mSlardarConfigFetcher = new i();

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void fetchConfig() {
        this.mSlardarConfigFetcher.n();
    }

    @WorkerThread
    public void forceUpdateFromRemote(@Nullable com.bytedance.apm.core.d dVar, @Nullable List<String> list) {
        this.mSlardarConfigFetcher.e(dVar, list);
    }

    @Nullable
    public JSONObject getConfig() {
        return this.mSlardarConfigFetcher.f();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public int getConfigInt(String str, int i) {
        return this.mSlardarConfigFetcher.g(str, i);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    @Nullable
    public JSONObject getConfigJSON(String str) {
        return this.mSlardarConfigFetcher.h(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getLogTypeSwitch(String str) {
        return this.mSlardarConfigFetcher.i(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getMetricTypeSwitch(String str) {
        return this.mSlardarConfigFetcher.j(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getServiceSwitch(String str) {
        return this.mSlardarConfigFetcher.k(str);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean getSwitch(String str) {
        return this.mSlardarConfigFetcher.l(str);
    }

    public void initParams(boolean z, com.bytedance.apm.core.d dVar, List<String> list) {
        this.mSlardarConfigFetcher.o(z, dVar, list);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean isConfigReady() {
        return this.mSlardarConfigFetcher.s();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public String queryConfig() {
        return this.mSlardarConfigFetcher.v();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerConfigListener(com.bytedance.services.slardar.config.a aVar) {
        this.mSlardarConfigFetcher.c(aVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void registerResponseConfigListener(com.bytedance.services.slardar.config.b bVar) {
        e.b.b.a.c(bVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public JSONObject retrieveSettingsParams() {
        return this.mSlardarConfigFetcher.y();
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterConfigListener(com.bytedance.services.slardar.config.a aVar) {
        this.mSlardarConfigFetcher.x(aVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public void unregisterResponseConfigListener(com.bytedance.services.slardar.config.b bVar) {
        e.b.b.a.d(bVar);
    }

    @Override // com.bytedance.services.slardar.config.IConfigManager
    public boolean updateWithSpecificAidResult(JSONObject jSONObject) {
        return this.mSlardarConfigFetcher.B(jSONObject);
    }
}
