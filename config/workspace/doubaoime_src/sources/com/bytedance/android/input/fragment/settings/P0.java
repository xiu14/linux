package com.bytedance.android.input.fragment.settings;

import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentInputRecommendBinding;
import com.bytedance.android.input.popup.AlertPopupWindowType;
import com.bytedance.android.input.popup.WindowId;

/* loaded from: classes.dex */
final class P0 extends kotlin.s.c.m implements kotlin.s.b.q<SwitchCompat, Boolean, String, kotlin.o> {
    final /* synthetic */ FragmentInputRecommendBinding a;
    final /* synthetic */ InputRecommendFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P0(FragmentInputRecommendBinding fragmentInputRecommendBinding, InputRecommendFragment inputRecommendFragment) {
        super(3);
        this.a = fragmentInputRecommendBinding;
        this.b = inputRecommendFragment;
    }

    @Override // kotlin.s.b.q
    public kotlin.o d(SwitchCompat switchCompat, Boolean bool, String str) {
        SwitchCompat switchCompat2 = switchCompat;
        boolean booleanValue = bool.booleanValue();
        kotlin.s.c.l.f(switchCompat2, "view");
        kotlin.s.c.l.f(str, "<anonymous parameter 2>");
        com.bytedance.android.input.r.j.m("InputRecommendFragment", "[ASSOCIATE] initAssociateSwitch: " + booleanValue);
        if (!booleanValue) {
            com.bytedance.android.input.n.d.a(com.bytedance.android.input.n.d.a, WindowId.ASSOCIATE_CLOSE, C0838R.string.associate_close_title, C0838R.string.associate_close_content, C0838R.string.associate_close_cancel, C0838R.string.associate_close_confirm, 0, AlertPopupWindowType.TIP_CONFIRM_WIDTH_FULL, new N0(this.a, this.b, switchCompat2), new O0(this.b), null, 544);
        }
        return kotlin.o.a;
    }
}
