package com.bytedance.android.input.fragment.settings;

import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.common.SettingsConfigNext;

/* loaded from: classes.dex */
final class B0 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ ClipboardFragment a;
    final /* synthetic */ SwitchCompat b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B0(ClipboardFragment clipboardFragment, SwitchCompat switchCompat) {
        super(0);
        this.a = clipboardFragment;
        this.b = switchCompat;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        Object J2;
        ClipboardFragment clipboardFragment = this.a;
        SwitchCompat switchCompat = this.b;
        try {
            FragmentActivity activity = clipboardFragment.getActivity();
            if (activity != null) {
                com.bytedance.android.input.r.j.m("ClipboardFragment", "剪切板历史：点击了取消, targetState: true");
                switchCompat.setChecked(true);
                String string = activity.getString(C0838R.string.enable_clipboard_history);
                kotlin.s.c.l.e(string, "act.getString(R.string.enable_clipboard_history)");
                SettingsConfigNext.l(string, Boolean.TRUE);
                J2 = kotlin.o.a;
            } else {
                J2 = null;
            }
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.v0("leftClickListener error --", b, "ClipboardFragment");
        }
        return kotlin.o.a;
    }
}
