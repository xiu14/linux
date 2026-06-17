package com.bytedance.android.input.fragment.settings;

import android.content.ContentResolver;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.obric.oui.toast.a;
import java.util.Objects;

/* loaded from: classes.dex */
final class C0 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    final /* synthetic */ ClipboardFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0(ClipboardFragment clipboardFragment) {
        super(0);
        this.a = clipboardFragment;
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        Object J2;
        try {
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                try {
                    IAppGlobals.a aVar = IAppGlobals.a;
                    Objects.requireNonNull(aVar);
                    ContentResolver contentResolver = aVar.getContext().getContentResolver();
                    Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
                    kotlin.s.c.l.e(parse, "parse(this)");
                    contentResolver.call(parse, "clearClipboardHistory", "", new Bundle());
                } catch (Exception e2) {
                    com.bytedance.android.input.r.j.i("KeyboardImeComms", "clearClipboardHistory failed:" + e2);
                }
                a.C0363a c0363a = com.obric.oui.toast.a.p;
                kotlin.s.c.l.e(activity, "act");
                String string = activity.getString(C0838R.string.clipboard_history_settings_clear_toast);
                kotlin.s.c.l.e(string, "act.getString(R.string.c…ory_settings_clear_toast)");
                Resources system = Resources.getSystem();
                kotlin.s.c.l.e(system, "Resources.getSystem()");
                c0363a.b(activity, string, kotlin.t.a.a(TypedValue.applyDimension(1, 60, system.getDisplayMetrics())));
                J2 = kotlin.o.a;
            } else {
                J2 = null;
            }
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.v0("rightClickListener error --", b, "ClipboardFragment");
        }
        return kotlin.o.a;
    }
}
