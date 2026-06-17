package com.bytedance.common.praise_dialog;

import android.app.Application;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g {
    public static final g a = null;
    private static final e b = new e();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f4160c;

    public static final void a(Application application) {
        f fVar;
        l.f(application, "application");
        if (f4160c) {
            return;
        }
        f4160c = true;
        IAppGlobals.a.j("PraiseDialogAbTestManager", "init");
        com.bytedance.praisedialoglib.manager.e.b().c(new com.bytedance.common.praise_dialog.h.c(), application);
        com.bytedance.praisedialoglib.manager.a.j().I(new JSONObject("{\n\t\"app_market_order\": \"com.hihonor.appmarket|com.oppo.market|com.tencent.android.qqdownloader|com.qihoo.appstore|com.wandoujia.phoenix2|com.baidu.appsearch|com.sogou.androidtool|com.huawei.appmarket|com.bbk.appstore|com.heytap.market|com.xiaomi.market|com.meizu.mstore|com.sec.android.app.samsungapps|com.yingyonghui.market|com.hiapk.marketpho\",\n\t\"market_feedback_url\": \"sslocal:\\/\\/webview?url=https%3A%2F%2Fi.snssdk.com%2Ffeedback%2Farticle_news%2Fsend%3Fsource%3Dmarket_feedback_dialog%26skip%3D0&hide_more=1&hide_bar=1&bounce_disable=1&should_append_common_param=1&use_bd=1&hide_back_close=1&hide_close_btn=1\",\n\t\"guide_style_1_market_list\": \"com.tencent.android.qqdownloader|com.qihoo.appstore|com.wandoujia.phoenix2|com.baidu.appsearch|com.sogou.androidtool|com.huawei.appmarket|com.oppo.market|com.meizu.mstore\",\n\t\"guide_style_2_market_list\": \"com.oppo.market\",\n\t\"guide_style_3_market_list\": \"\",\n\t\"market_feedback_dialog_enable\": 1\n}"));
        Objects.requireNonNull(b);
        l.f(application, "application");
        application.registerActivityLifecycleCallbacks(new d());
        com.bytedance.praisedialoglib.manager.a j = com.bytedance.praisedialoglib.manager.a.j();
        fVar = f.f4159c;
        j.J(fVar);
    }
}
