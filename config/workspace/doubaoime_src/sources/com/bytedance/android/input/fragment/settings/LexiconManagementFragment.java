package com.bytedance.android.input.fragment.settings;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.databinding.FragmentLexiconManagementBinding;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.popup.AlertPopupWindowType;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.obric.oui.toast.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class LexiconManagementFragment extends BaseSettingsFragment {
    private FragmentLexiconManagementBinding b;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            LexiconManagementFragment.this.x();
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            LexiconManagementFragment.this.w();
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            com.bytedance.android.input.r.j.m("LexiconManagementFragment", "[ImeContacts] leftClickListener, targetState: true");
            return kotlin.o.a;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            com.bytedance.android.input.r.j.m("LexiconManagementFragment", "[ImeContacts] rightClickListener, targetState: true");
            try {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                ContentResolver contentResolver = aVar.getContext().getContentResolver();
                Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
                kotlin.s.c.l.e(parse, "parse(this)");
                contentResolver.call(parse, "clearContactsHistory", "", new Bundle());
            } catch (Exception e2) {
                e.a.a.a.a.n0("[ImeContacts] clearContactsHistory failed:", e2, "KeyboardImeComms");
            }
            FragmentActivity activity = LexiconManagementFragment.this.getActivity();
            if (activity != null) {
                LexiconManagementFragment lexiconManagementFragment = LexiconManagementFragment.this;
                a.C0363a c0363a = com.obric.oui.toast.a.p;
                String string = lexiconManagementFragment.getString(C0838R.string.contacts_history_settings_clear_toast);
                kotlin.s.c.l.e(string, "getString(R.string.conta…ory_settings_clear_toast)");
                c0363a.a(activity, string, 48);
            }
            return kotlin.o.a;
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        public static final e a = new e();

        e() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            com.bytedance.android.input.r.j.m("LexiconManagementFragment", "[ImeUserDict] leftClickListener.");
            return kotlin.o.a;
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
        f() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public kotlin.o invoke() {
            com.bytedance.android.input.r.j.m("LexiconManagementFragment", "[ImeUserDict] rightClickListener.");
            try {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                ContentResolver contentResolver = aVar.getContext().getContentResolver();
                Uri parse = Uri.parse("content://com.bytedance.android.doubaoime.provider");
                kotlin.s.c.l.e(parse, "parse(this)");
                contentResolver.call(parse, "clearUsrDict", "", new Bundle());
            } catch (Exception e2) {
                e.a.a.a.a.n0("[ImeUserDict] clearUsrDict failed:", e2, "KeyboardImeComms");
            }
            FragmentActivity activity = LexiconManagementFragment.this.getActivity();
            if (activity != null) {
                LexiconManagementFragment lexiconManagementFragment = LexiconManagementFragment.this;
                a.C0363a c0363a = com.obric.oui.toast.a.p;
                String string = lexiconManagementFragment.getString(C0838R.string.personal_lexicon_cleared_toast);
                kotlin.s.c.l.e(string, "getString(R.string.personal_lexicon_cleared_toast)");
                c0363a.a(activity, string, 48);
            }
            return kotlin.o.a;
        }
    }

    public static void u(LexiconManagementFragment lexiconManagementFragment, View view) {
        kotlin.s.c.l.f(lexiconManagementFragment, "this$0");
        lexiconManagementFragment.w();
    }

    public static void v(LexiconManagementFragment lexiconManagementFragment, View view) {
        kotlin.s.c.l.f(lexiconManagementFragment, "this$0");
        lexiconManagementFragment.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.LEXICON_MANAGEMENT;
        if (f2.j(windowId)) {
            com.bytedance.android.input.popup.q.f().d(windowId);
        }
        com.bytedance.android.input.n.d.a(com.bytedance.android.input.n.d.a, WindowId.CLEAR_CONTACTS_HISTORY, C0838R.string.contacts_history_clear_title, C0838R.string.contacts_history_clear_confirm, C0838R.string.clipboard_history_cancel, C0838R.string.contacts_history_confirm, 0, AlertPopupWindowType.TIP_CONFIRM, c.a, new d(), null, 544);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.CLEAR_CONTACTS_HISTORY;
        if (f2.j(windowId)) {
            com.bytedance.android.input.popup.q.f().d(windowId);
        }
        com.bytedance.android.input.n.d.a(com.bytedance.android.input.n.d.a, WindowId.LEXICON_MANAGEMENT, C0838R.string.personal_lexicon_clear_title, C0838R.string.personal_lexicon_clear_confirm, C0838R.string.personal_lexicon_btn_left, C0838R.string.personal_lexicon_btn_right, 0, AlertPopupWindowType.TIP_CONFIRM, e.a, new f(), null, 544);
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, com.bytedance.android.doubaoime.activity.Q
    public boolean j() {
        com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
        WindowId windowId = WindowId.LEXICON_MANAGEMENT;
        if (f2.j(windowId)) {
            com.bytedance.android.input.popup.q.f().d(windowId);
            return true;
        }
        com.bytedance.android.input.popup.q f3 = com.bytedance.android.input.popup.q.f();
        WindowId windowId2 = WindowId.CLEAR_CONTACTS_HISTORY;
        if (!f3.j(windowId2)) {
            return false;
        }
        com.bytedance.android.input.popup.q.f().d(windowId2);
        return true;
    }

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        FragmentLexiconManagementBinding b2 = FragmentLexiconManagementBinding.b(layoutInflater, viewGroup, false);
        this.b = b2;
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.b = null;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        l();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void p() {
        ImeListItemView imeListItemView;
        ImeListItemView imeListItemView2;
        l();
        FragmentLexiconManagementBinding fragmentLexiconManagementBinding = this.b;
        if (fragmentLexiconManagementBinding != null && (imeListItemView2 = fragmentLexiconManagementBinding.f1982c) != null) {
            imeListItemView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.Y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LexiconManagementFragment.v(LexiconManagementFragment.this, view);
                }
            });
            imeListItemView2.setHorizontalClearClickListener(new a());
        }
        FragmentLexiconManagementBinding fragmentLexiconManagementBinding2 = this.b;
        if (fragmentLexiconManagementBinding2 == null || (imeListItemView = fragmentLexiconManagementBinding2.b) == null) {
            return;
        }
        imeListItemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LexiconManagementFragment.u(LexiconManagementFragment.this, view);
            }
        });
        imeListItemView.setHorizontalClearClickListener(new b());
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        l();
    }
}
