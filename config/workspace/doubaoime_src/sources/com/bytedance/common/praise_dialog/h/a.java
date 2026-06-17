package com.bytedance.common.praise_dialog.h;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a implements e.b.k.c.a {
    @Override // e.b.k.c.a
    public void a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            return;
        }
        IAppGlobals.a.j("PraiseDialogAppConfigImpl", "onEvent: " + str + ", " + jSONObject);
        int hashCode = str.hashCode();
        if (hashCode == 319288017) {
            if (str.equals("evaluate_pop_good")) {
                IAppLog.a.t("feedback_praise_click", jSONObject);
            }
        } else if (hashCode == 319638801) {
            if (str.equals("evaluate_pop_show")) {
                IAppLog.a.t("feedback_show", jSONObject);
            }
        } else if (hashCode == 841578353 && str.equals("evaluate_pop_bad")) {
            IAppLog.a.t("feedback_later_click", jSONObject);
        }
    }

    @Override // e.b.k.c.a
    public Activity b() {
        IAppGlobals.a aVar = IAppGlobals.a;
        StringBuilder M = e.a.a.a.a.M("getTopActivity: ");
        com.bytedance.common.praise_dialog.e eVar = com.bytedance.common.praise_dialog.e.a;
        M.append(com.bytedance.common.praise_dialog.e.b());
        aVar.j("PraiseDialogAppConfigImpl", M.toString());
        return com.bytedance.common.praise_dialog.e.b();
    }

    @Override // e.b.k.c.a
    public void c(Context context, String str) {
        IAppGlobals.a.j("PraiseDialogAppConfigImpl", "goToFeedback: " + str);
    }

    @Override // e.b.k.c.a
    public boolean d() {
        IAppGlobals.a.j("PraiseDialogAppConfigImpl", "handleNoAppMarket: true");
        return true;
    }

    @Override // e.b.k.c.a
    public String e() {
        IAppGlobals.a.j("PraiseDialogAppConfigImpl", "getHuaWeiAppId");
        return "C115792193";
    }

    @Override // e.b.k.c.a
    public String f() {
        return "https://praisewindow.ugsdk.cn";
    }

    @Override // e.b.k.c.a
    public boolean g() {
        IAppGlobals.a.j("PraiseDialogAppConfigImpl", "needShowDefaultDialog: true");
        return false;
    }

    @Override // e.b.k.c.a
    public String getAppId() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.j("PraiseDialogAppConfigImpl", "getAppId: 401734");
        Objects.requireNonNull(aVar);
        return "401734";
    }

    @Override // e.b.k.c.a
    public String getPackageName() {
        IAppGlobals.a aVar = IAppGlobals.a;
        StringBuilder M = e.a.a.a.a.M("getPackageName: ");
        M.append(aVar.getContext().getPackageName());
        aVar.j("PraiseDialogAppConfigImpl", M.toString());
        String packageName = aVar.getContext().getPackageName();
        l.e(packageName, "IAppGlobals.context.packageName");
        return packageName;
    }
}
