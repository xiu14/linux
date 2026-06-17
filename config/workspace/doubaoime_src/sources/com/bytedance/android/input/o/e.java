package com.bytedance.android.input.o;

import com.bytedance.android.doubaoime.ImeApplication;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.r.j;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.Npth;
import com.bytedance.feedbackerlib.Feedbacker;
import java.util.Map;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class e {

    public static final class a implements Feedbacker.m {
        a() {
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void a() {
            j.i("FeedbackUtils", "onLarkSSO Bypassed");
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void b(final String str) {
            l.f(str, "larkSSOEmail");
            j.m("FeedbackUtils", "onLarkSSOSuccess: " + str);
            com.bytedance.android.input.common.u.c.j(true);
            Npth.addAttachUserData(new AttachUserData() { // from class: com.bytedance.android.input.o.c
                @Override // com.bytedance.crash.AttachUserData
                public final Map getUserData(CrashType crashType) {
                    String str2 = str;
                    l.f(str2, "$larkSSOEmail");
                    return g.I(new kotlin.g("larkSSOEmail", str2));
                }
            }, CrashType.ALL);
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void c() {
            j.i("FeedbackUtils", "onLarkSSP Failed");
        }
    }

    public static final void a() {
        if (com.bytedance.android.input.common.u.c.f()) {
            return;
        }
        j.i("FeedbackUtils", "FeedbackUtils LarkSSO init");
        IAppGlobals.a aVar = IAppGlobals.a;
        if (!l.a(d.a.b.a.c(aVar), "bd_alpha_test") && !l.a(d.a.b.a.c(aVar), "bd_alpha_test_debug") && !l.a(d.a.b.a.c(aVar), "bdtest")) {
            StringBuilder M = e.a.a.a.a.M("不是公司内测渠道包：");
            M.append(d.a.b.a.c(aVar));
            j.i("FeedbackUtils", M.toString());
        } else {
            Feedbacker.init(ImeApplication.f1883e, false);
            Feedbacker.setFloatWindowEnable(true);
            Feedbacker.registerLarkSSOCallback(new a());
            j.i("FeedbackUtils", "FeedbackUtils configFeedBack");
            Feedbacker.setIFeedbackCommonInfo(new d());
        }
    }
}
