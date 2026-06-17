package com.bytedance.android.input.perf;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig;
import com.bytedance.android.input.l.c;
import com.bytedance.android.input.r.j;
import e.a.a.a.a;
import java.util.Map;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PerformanceConfigImpl implements IPerformanceConfig {
    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public int getAssociationFirstRefresh() {
        return c.a();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public int getFirstRefreshLevel() {
        int intValue = ((Integer) a.L0(IAppGlobals.a, C0838R.string.candidate_delay_refresh, "IAppGlobals.context.getS….candidate_delay_refresh)", "null cannot be cast to non-null type kotlin.Int")).intValue();
        if (intValue != 50) {
            return intValue != 100 ? 2 : 0;
        }
        return 1;
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isEnablePrintLog() {
        return ((Boolean) a.L0(IAppGlobals.a, C0838R.string.enable_request_log, "IAppGlobals.context.getS…tring.enable_request_log)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isNoFreqRender() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().x();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isSpMonitorEnabled() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().z();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isSupportHighRefreshRate() {
        boolean booleanValue = ((Boolean) a.L0(IAppGlobals.a, C0838R.string.is_enable_high_refresh_rate, "IAppGlobals.context.getS…enable_high_refresh_rate)", "null cannot be cast to non-null type kotlin.Boolean")).booleanValue();
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().D() || booleanValue;
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isUploadDrawPathData() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().A();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isUploadFpsPerData() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().B();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public boolean isUploadRefreshRate() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().F();
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public void trace(String str, Map<String, ? extends Object> map) {
        l.f(str, "eventName");
        l.f(str, "eventName");
        j.i("ImeEventAppLog", "reportEvent " + str + ' ');
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        }
        IAppLog.a.t(str, jSONObject);
    }

    @Override // com.bytedance.android.input.common_biz.performance.api.IPerformanceConfig
    public int uploadHighRefreshRateMaxNum() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        return aVar.a().s();
    }
}
