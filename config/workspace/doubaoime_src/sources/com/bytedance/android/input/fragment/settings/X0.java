package com.bytedance.android.input.fragment.settings;

import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.ss.android.message.log.PushLog;

/* loaded from: classes.dex */
final class X0 extends kotlin.s.c.m implements kotlin.s.b.q<Integer, String, Boolean, kotlin.o> {
    final /* synthetic */ KeyFeedbackFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X0(KeyFeedbackFragment keyFeedbackFragment) {
        super(3);
        this.a = keyFeedbackFragment;
    }

    @Override // kotlin.s.b.q
    public kotlin.o d(Integer num, String str, Boolean bool) {
        int intValue = num.intValue();
        String str2 = str;
        bool.booleanValue();
        kotlin.s.c.l.f(str2, PushLog.KEY_LABEL);
        int i = intValue != 0 ? intValue != 1 ? 0 : 50 : 100;
        e.a.a.a.a.B0(e.a.a.a.a.P("keyFeedbackResponseSpeed click=index=", intValue, " label=", str2, " refreshTime="), i, "KeyFeedbackFragment");
        String string = this.a.getString(C0838R.string.candidate_delay_refresh);
        kotlin.s.c.l.e(string, "getString(R.string.candidate_delay_refresh)");
        SettingsConfigNext.l(string, Integer.valueOf(i));
        return kotlin.o.a;
    }
}
