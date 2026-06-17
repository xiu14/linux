package com.huawei.hianalytics.process;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.e.e;
import com.huawei.hianalytics.f.g.g;
import com.huawei.hianalytics.util.i;
import com.ss.android.message.log.PushLog;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class d implements HiAnalyticsInstance {
    public e a;
    private String b;

    public d(String str) {
        this.b = str;
        this.a = new e(str);
    }

    private com.huawei.hianalytics.e.c a(int i) {
        if (i == 0) {
            return this.a.b();
        }
        if (i == 1) {
            return this.a.a();
        }
        if (i == 2) {
            return this.a.c();
        }
        if (i != 3) {
            return null;
        }
        return this.a.d();
    }

    private boolean c(int i) {
        String str;
        if (i != 2) {
            com.huawei.hianalytics.e.c a = a(i);
            if (a != null && !TextUtils.isEmpty(a.g())) {
                return true;
            }
            str = "verifyURL(): URL check failed. type: " + i;
        } else {
            if ("_default_config_tag".equals(this.b)) {
                return true;
            }
            str = "verifyURL(): type: preins. Only default config can report Pre-install data.";
        }
        com.huawei.hianalytics.g.b.c("HiAnalytics/event", str);
        return false;
    }

    public void a(HiAnalyticsConfig hiAnalyticsConfig) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setMaintConf() is executed.TAG : " + this.b);
        if (hiAnalyticsConfig != null) {
            this.a.a(hiAnalyticsConfig.a);
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "HiAnalyticsInstanceImpl.setMaintConf(): config for maint is null!");
            this.a.a((com.huawei.hianalytics.e.c) null);
        }
    }

    public void b(HiAnalyticsConfig hiAnalyticsConfig) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setDiffConf() is executed.TAG : " + this.b);
        if (hiAnalyticsConfig != null) {
            this.a.d(hiAnalyticsConfig.a);
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "HiAnalyticsInstanceImpl.setDiffConf(): config for diffPrivacy is null!");
            this.a.d(null);
        }
    }

    public void c(HiAnalyticsConfig hiAnalyticsConfig) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setOperConf() is executed.TAG: " + this.b);
        if (hiAnalyticsConfig != null) {
            this.a.b(hiAnalyticsConfig.a);
        } else {
            this.a.b(null);
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "HiAnalyticsInstanceImpl.setOperConf(): config for oper is null!");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void clearData() {
        if (i.a().b()) {
            a.b().d(this.b);
        }
    }

    public void d(HiAnalyticsConfig hiAnalyticsConfig) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setPreInstallConf() is executed.TAG: " + this.b);
        if (hiAnalyticsConfig != null) {
            this.a.c(hiAnalyticsConfig.a);
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "HiAnalyticsInstanceImpl.setPreInstallConf(): config for PRE-INSTALL is null!");
            this.a.c(null);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void newInstanceUUID() {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "newInstanceUUID is executed.TAG: " + this.b);
        SharedPreferences d2 = g.d(com.huawei.hianalytics.a.b.n(), "global_v2");
        String str = (String) g.b(d2, this.b, "");
        if (TextUtils.isEmpty(str)) {
            str = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            g.a(d2, this.b, str);
        }
        if (this.a.b() != null) {
            this.a.b().g(str);
        }
        if (this.a.a() != null) {
            this.a.a().g(str);
        }
        if (this.a.d() != null) {
            this.a.d().g(str);
        }
        if (this.a.c() != null) {
            this.a.c().g(str);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onBackground(long j) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "onBackground() is executed.TAG : %s", this.b);
        com.huawei.hianalytics.e.c b = this.a.b();
        if (b == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "No operConf");
        } else if (b.d()) {
            com.huawei.hianalytics.f.e.a.a().b(this.b, j);
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "No Session switch is set.");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onEvent(int type, String eventId, Map<String, String> mapValue) is execute.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (com.huawei.hianalytics.util.g.a(str) || !c(i)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEvent() parameters check fail. Nothing will be recorded.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
            return;
        }
        if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEvent() parameter mapValue will be cleared.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
            linkedHashMap = null;
        }
        b.a().a(this.b, i, str, linkedHashMap);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    @Deprecated
    public void onEvent(Context context, String str, String str2) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onEvent(eventId, mapValue) is execute.TAG : " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "context is null in onevent ");
            return;
        }
        if (com.huawei.hianalytics.util.g.a(str) || !c(0)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.b);
        } else {
            if (!com.huawei.hianalytics.util.g.a(PushLog.KEY_VALUE, str2, 65536)) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEvent() parameter VALUE is overlong, content will be cleared.TAG: " + this.b);
                str2 = "";
            }
            b.a().a(this.b, context, str, str2);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onEvent(String str, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onEvent(String eventId, Map<String, String> mapValue) is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (com.huawei.hianalytics.util.g.a(str) || !c(0)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEvent() parameters check fail. Nothing will be recorded.TAG: " + this.b);
        } else {
            if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEvent() parameter mapValue will be cleared.TAG: " + this.b);
                linkedHashMap = null;
            }
            b.a().a(this.b, 0, str, linkedHashMap);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onForeground(long j) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "onForeground() is executed。TAG : %s", this.b);
        com.huawei.hianalytics.e.c b = this.a.b();
        if (b == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "No operConf");
        } else if (b.d()) {
            com.huawei.hianalytics.f.e.a.a().c(this.b, j);
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "No Session switch is set.");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onPause(Context context) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onPause() is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "context is null in onPause! Nothing will be recorded.TAG: " + this.b);
        } else {
            if (c(0)) {
                b.a().a(this.b, context);
                return;
            }
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.b);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onPause(Context context, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onPause(context,map) is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "context is null in onPause! Nothing will be recorded.");
            return;
        }
        if (!c(0)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onPause() URL check fail. Nothing will be recorded.TAG: " + this.b);
        } else {
            if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onPause() parameter mapValue will be cleared.TAG: " + this.b);
                linkedHashMap = null;
            }
            b.a().a(this.b, context, linkedHashMap);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onPause(String str, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onPause(viewName,map) is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (!c(0)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onPause() URL check fail. Nothing will be recorded.TAG: " + this.b);
        } else if (TextUtils.isEmpty(str) || !com.huawei.hianalytics.util.g.a("viewName", str, "[a-zA-Z_][a-zA-Z0-9. _-]{0,255}")) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onPause() parameter viewName verify failed. Nothing will be recorded.TAG: " + this.b);
        } else {
            if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onPause() parameter mapValue will be cleared.TAG: " + this.b);
                linkedHashMap = null;
            }
            b.a().a(this.b, str, linkedHashMap);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onReport(int i) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onReport() is execute.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
        if (i.a().b()) {
            b.a().a(this.b, i);
        } else {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    @Deprecated
    public void onReport(Context context, int i) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onReport(Context context) is execute.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
        } else if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "context is null in onreport!");
        } else {
            b.a().a(this.b, context, i);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onResume(Context context) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onResume() is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "context is null in onResume! Nothing will be recorded.");
        } else {
            if (c(0)) {
                b.a().b(this.b, context);
                return;
            }
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.b);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onResume(Context context, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onResume(context,map) is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (context == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "context is null in onResume! Nothing will be recorded.");
            return;
        }
        if (!c(0)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.b);
        } else {
            if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() parameter mapValue will be cleared.TAG: " + this.b);
                linkedHashMap = null;
            }
            b.a().b(this.b, context, linkedHashMap);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onResume(String str, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onResume(viewname,map) is execute.TAG: " + this.b);
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (!c(0)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() URL check fail. Nothing will be recorded.TAG: " + this.b);
        } else if (TextUtils.isEmpty(str) || !com.huawei.hianalytics.util.g.a("viewName", str, "[a-zA-Z_][a-zA-Z0-9. _-]{0,255}")) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() parameter viewName verify failed. Nothing will be recorded.TAG: " + this.b);
        } else {
            if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onResume() parameter mapValue will be cleared.TAG: " + this.b);
                linkedHashMap = null;
            }
            b.a().b(this.b, str, linkedHashMap);
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void onStreamEvent(int i, String str, LinkedHashMap<String, String> linkedHashMap) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstance.onStreamEvent() is execute.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
        if (!i.a().b()) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "userManager.isUserUnlocked() == false");
            return;
        }
        if (com.huawei.hianalytics.util.g.a(str) || !c(i)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEventIM() parameters check fail. Nothing will be recorded.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
            return;
        }
        if (!com.huawei.hianalytics.util.g.a(linkedHashMap)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "onEventIM() parameter mapValue will be cleared.TAG: %s,TYPE: %d", this.b, Integer.valueOf(i));
            linkedHashMap = null;
        }
        b.a().b(this.b, i, str, linkedHashMap);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void refresh(int i, HiAnalyticsConfig hiAnalyticsConfig) {
        HiAnalyticsConfig hiAnalyticsConfig2;
        if (hiAnalyticsConfig == null) {
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.refresh(). Parameter config is null.TAG : %s , TYPE : %d", this.b, Integer.valueOf(i));
            hiAnalyticsConfig2 = null;
        } else {
            hiAnalyticsConfig2 = new HiAnalyticsConfig(hiAnalyticsConfig);
        }
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.refresh() is executed.TAG : %s , TYPE : %d", this.b, Integer.valueOf(i));
        if (i == 0) {
            c(hiAnalyticsConfig2);
            com.huawei.hianalytics.f.e.a.a().a(this.b);
        } else {
            if (i == 1) {
                a(hiAnalyticsConfig2);
                return;
            }
            if (i == 2) {
                d(hiAnalyticsConfig2);
            } else if (i != 3) {
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", "refresh(): HiAnalyticsType can only be OPERATION ,MAINTAIN or DIFF_PRIVACY.");
            } else {
                b(hiAnalyticsConfig2);
            }
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void setCommonProp(int i, Map<String, String> map) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setCommonProp() is executed.TAG : %s , TYPE : %d", this.b, Integer.valueOf(i));
        if (!com.huawei.hianalytics.util.g.a(map)) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "setCommonProp() parameter mapValue will be cleared.");
            return;
        }
        JSONObject jSONObject = new JSONObject(map);
        com.huawei.hianalytics.e.c a = a(i);
        if (a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "setCommonProp(): No related config found.");
        } else {
            a.e(String.valueOf(jSONObject));
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void setOAID(int i, String str) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setStrOAID() is executed.TAG : " + this.b);
        com.huawei.hianalytics.e.c a = a(i);
        if (a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "setOAID(): No related config found.type : %d", Integer.valueOf(i));
            return;
        }
        if (!com.huawei.hianalytics.util.g.a("oaid", str, 4096)) {
            str = "";
        }
        a.c(str);
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void setOAIDTrackingFlag(int i, boolean z) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setOAIDTrackingFlag() is executed.TAG : %s , TYPE : %d", this.b, Integer.valueOf(i));
        com.huawei.hianalytics.e.c a = a(i);
        if (a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "setOAIDTrackingFlag(): No related config found.type : %d", Integer.valueOf(i));
        } else {
            a.d(z ? "true" : "false");
        }
    }

    @Override // com.huawei.hianalytics.process.HiAnalyticsInstance
    public void setUpid(int i, String str) {
        com.huawei.hianalytics.g.b.b("HiAnalytics/event", "HiAnalyticsInstanceImpl.setUpid() is executed.TAG : " + this.b);
        com.huawei.hianalytics.e.c a = a(i);
        if (a == null) {
            com.huawei.hianalytics.g.b.c("HiAnalytics/event", "setUpid(): No related config found.type : %d ", Integer.valueOf(i));
            return;
        }
        if (!com.huawei.hianalytics.util.g.a("upid", str, 4096)) {
            str = "";
        }
        a.f(str);
    }
}
