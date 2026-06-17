package com.bytedance.android.input.fragment.settings;

import androidx.appcompat.widget.SwitchCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentClipboardSettingsBinding;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.popup.AlertPopupWindowType;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.common_biz.ui.widget.ImeListItemView;

/* loaded from: classes.dex */
public final class ClipboardFragment extends BaseSettingsFragment {
    private FragmentClipboardSettingsBinding b;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.q<SwitchCompat, Boolean, String, kotlin.o> {
        public static final a a = new a();

        a() {
            super(3);
        }

        @Override // kotlin.s.b.q
        public kotlin.o d(SwitchCompat switchCompat, Boolean bool, String str) {
            bool.booleanValue();
            kotlin.s.c.l.f(switchCompat, "view");
            kotlin.s.c.l.f(str, "from");
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.q<SwitchCompat, Boolean, String, kotlin.o> {
        b() {
            super(3);
        }

        @Override // kotlin.s.b.q
        public kotlin.o d(SwitchCompat switchCompat, Boolean bool, String str) {
            SwitchCompat switchCompat2 = switchCompat;
            boolean booleanValue = bool.booleanValue();
            kotlin.s.c.l.f(switchCompat2, "view");
            kotlin.s.c.l.f(str, "from");
            if (!booleanValue) {
                com.bytedance.android.input.n.d.a(com.bytedance.android.input.n.d.a, WindowId.CLIPBOARD_HISTORY, C0838R.string.clipboard_history_clear_title, C0838R.string.clipboard_history_clear_confirm, C0838R.string.clipboard_history_cancel, C0838R.string.clipboard_history_confirm, 0, AlertPopupWindowType.TIP_CONFIRM, new B0(ClipboardFragment.this, switchCompat2), new C0(ClipboardFragment.this), null, 544);
            }
            return kotlin.o.a;
        }
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        Object J2;
        ImeListItemView imeListItemView;
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.CLIPBOARD_HISTORY;
        if (!f2.j(windowId)) {
            return false;
        }
        com.bytedance.android.input.popup.q.f().d(windowId);
        try {
            J2 = null;
            r2 = null;
            SwitchCompat switchCompat = null;
            if (getActivity() != null) {
                FragmentClipboardSettingsBinding fragmentClipboardSettingsBinding = this.b;
                if (fragmentClipboardSettingsBinding != null && (imeListItemView = fragmentClipboardSettingsBinding.f1962c) != null) {
                    switchCompat = imeListItemView.a();
                }
                if (switchCompat != null) {
                    switchCompat.setChecked(true);
                }
                String string = getString(C0838R.string.enable_clipboard_history);
                kotlin.s.c.l.e(string, "getString(R.string.enable_clipboard_history)");
                SettingsConfigNext.l(string, Boolean.TRUE);
                J2 = kotlin.o.a;
            }
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("onBackPressed, e: ", b2, "ClipboardFragment");
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.LayoutInflater r7, android.view.ViewGroup r8, android.os.Bundle r9) {
        /*
            r6 = this;
            java.lang.String r9 = "inflater"
            kotlin.s.c.l.f(r7, r9)
            r9 = 0
            com.bytedance.android.doubaoime.databinding.FragmentClipboardSettingsBinding r7 = com.bytedance.android.doubaoime.databinding.FragmentClipboardSettingsBinding.b(r7, r8, r9)
            r6.b = r7
            java.lang.String r7 = "getString(R.string.is_set_clipboard_history)"
            java.lang.String r8 = "ClipboardFragment"
            r0 = 2131821023(0x7f1101df, float:1.9274777E38)
            java.lang.String r1 = r6.getString(r0)     // Catch: java.lang.Exception -> Lbc
            kotlin.s.c.l.e(r1, r7)     // Catch: java.lang.Exception -> Lbc
            java.lang.Object r1 = com.bytedance.android.input.common.SettingsConfigNext.f(r1)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Boolean"
            kotlin.s.c.l.d(r1, r2)     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> Lbc
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> Lbc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r2.<init>()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "initData, isSetClipboardHistory: "
            r2.append(r3)     // Catch: java.lang.Exception -> Lbc
            r2.append(r1)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lbc
            com.bytedance.android.input.r.j.m(r8, r2)     // Catch: java.lang.Exception -> Lbc
            if (r1 != 0) goto Lc2
            android.os.Bundle r1 = new android.os.Bundle     // Catch: java.lang.Exception -> L6d
            r1.<init>()     // Catch: java.lang.Exception -> L6d
            com.bytedance.android.input.basic.IAppGlobals$a r2 = com.bytedance.android.input.basic.IAppGlobals.a     // Catch: java.lang.Exception -> L6d
            java.util.Objects.requireNonNull(r2)     // Catch: java.lang.Exception -> L6d
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Exception -> L6d
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L6d
            java.lang.String r3 = "content://com.bytedance.android.doubaoime.provider"
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L6d
            java.lang.String r4 = "parse(this)"
            kotlin.s.c.l.e(r3, r4)     // Catch: java.lang.Exception -> L6d
            java.lang.String r4 = "getClipboardHistoryCount"
            java.lang.String r5 = ""
            android.os.Bundle r1 = r2.call(r3, r4, r5, r1)     // Catch: java.lang.Exception -> L6d
            if (r1 == 0) goto L84
            java.lang.String r2 = "result"
            int r1 = r1.getInt(r2)     // Catch: java.lang.Exception -> L6d
            goto L85
        L6d:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r2.<init>()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "getClipboardHistoryCount failed:"
            r2.append(r3)     // Catch: java.lang.Exception -> Lbc
            r2.append(r1)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = "KeyboardImeComms"
            com.bytedance.android.input.r.j.i(r2, r1)     // Catch: java.lang.Exception -> Lbc
        L84:
            r1 = r9
        L85:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbc
            r2.<init>()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "initData, count: "
            r2.append(r3)     // Catch: java.lang.Exception -> Lbc
            r2.append(r1)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Lbc
            com.bytedance.android.input.r.j.m(r8, r2)     // Catch: java.lang.Exception -> Lbc
            r2 = 2131820851(0x7f110133, float:1.9274429E38)
            java.lang.String r2 = r6.getString(r2)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r3 = "getString(R.string.enable_clipboard_history)"
            kotlin.s.c.l.e(r2, r3)     // Catch: java.lang.Exception -> Lbc
            if (r1 <= 0) goto La8
            r9 = 1
        La8:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Exception -> Lbc
            com.bytedance.android.input.common.SettingsConfigNext.l(r2, r9)     // Catch: java.lang.Exception -> Lbc
            java.lang.String r9 = r6.getString(r0)     // Catch: java.lang.Exception -> Lbc
            kotlin.s.c.l.e(r9, r7)     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lbc
            com.bytedance.android.input.common.SettingsConfigNext.l(r9, r7)     // Catch: java.lang.Exception -> Lbc
            goto Lc2
        Lbc:
            r7 = move-exception
            java.lang.String r9 = "initData, e: "
            e.a.a.a.a.o0(r9, r7, r8)
        Lc2:
            com.bytedance.android.doubaoime.databinding.FragmentClipboardSettingsBinding r7 = r6.b
            if (r7 == 0) goto Lcb
            android.widget.LinearLayout r7 = r7.a()
            goto Lcc
        Lcb:
            r7 = 0
        Lcc:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.fragment.settings.ClipboardFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        l();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        Object J2;
        l();
        try {
            FragmentClipboardSettingsBinding fragmentClipboardSettingsBinding = this.b;
            if (fragmentClipboardSettingsBinding != null) {
                ImeListItemView imeListItemView = fragmentClipboardSettingsBinding.b;
                kotlin.s.c.l.e(imeListItemView, "it.clipboardCandidateBarShow");
                n(imeListItemView, C0838R.string.enable_clipboard_candidate_bar_show, a.a);
                ImeListItemView imeListItemView2 = fragmentClipboardSettingsBinding.f1962c;
                kotlin.s.c.l.e(imeListItemView2, "it.clipboardHistory");
                n(imeListItemView2, C0838R.string.enable_clipboard_history, new b());
                J2 = kotlin.o.a;
            } else {
                J2 = null;
            }
        } catch (Throwable th) {
            J2 = com.prolificinteractive.materialcalendarview.r.J(th);
        }
        Throwable b2 = kotlin.h.b(J2);
        if (b2 != null) {
            e.a.a.a.a.v0("updateUI, e: ", b2, "ClipboardFragment");
        }
    }
}
