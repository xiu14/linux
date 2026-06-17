package com.obric.oui.panel;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.panel.BottomSheetBehavior;
import com.obric.oui.panel.anim.AnimController;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OBasicPanelFragment extends AppCompatDialogFragment {
    public static final /* synthetic */ int i = 0;
    private boolean a;
    private int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7891c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7892d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7893e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f7894f = C0838R.style.OBasicPanel;

    /* renamed from: g, reason: collision with root package name */
    private final AnimController f7895g = new AnimController();
    private final a h = new a();

    public static final class a extends BottomSheetBehavior.d {
        a() {
        }

        @Override // com.obric.oui.panel.BottomSheetBehavior.d
        public void a(View view, float f2) {
            l.f(view, "bottomSheet");
        }

        @Override // com.obric.oui.panel.BottomSheetBehavior.d
        public void b(View view, int i) {
            l.f(view, "bottomSheet");
            if (i == 5) {
                OBasicPanelFragment.l(OBasicPanelFragment.this);
            }
        }
    }

    static final class b implements DialogInterface.OnShowListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public final void onShow(DialogInterface dialogInterface) {
            Window window;
            OBasicPanelFragment oBasicPanelFragment = OBasicPanelFragment.this;
            int i = OBasicPanelFragment.i;
            Dialog dialog = oBasicPanelFragment.getDialog();
            if (dialog == null || (window = dialog.getWindow()) == null) {
                return;
            }
            window.getDecorView();
        }
    }

    public static final void l(OBasicPanelFragment oBasicPanelFragment) {
        if (oBasicPanelFragment.a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private final void m() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.getDecorView();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        try {
            m();
            Dialog dialog = getDialog();
            if (dialog instanceof BottomSheetDialog) {
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
                BottomSheetBehavior<FrameLayout> c2 = bottomSheetDialog.c();
                l.e(c2, "dialog.behavior");
                if (c2.l) {
                    Objects.requireNonNull(bottomSheetDialog);
                }
            }
            super.dismiss();
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Try exception occur ");
            M.append(e2.getMessage());
            e.i.a.b.a.g(M.toString());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        m();
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        l.f(dialogInterface, "dialog");
        m();
        super.onCancel(dialogInterface);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        l.e(requireContext, "requireContext()");
        OBasePanelDialog oBasePanelDialog = new OBasePanelDialog(requireContext, this.f7894f);
        oBasePanelDialog.t(this.b);
        oBasePanelDialog.z(false);
        oBasePanelDialog.o(false);
        oBasePanelDialog.s(false);
        oBasePanelDialog.j(this.f7891c);
        oBasePanelDialog.g(false);
        oBasePanelDialog.x(null);
        oBasePanelDialog.u(null);
        oBasePanelDialog.v(null);
        oBasePanelDialog.k(this.f7892d);
        oBasePanelDialog.i(false);
        oBasePanelDialog.n(null);
        oBasePanelDialog.y(false);
        oBasePanelDialog.r(false);
        oBasePanelDialog.w(null);
        oBasePanelDialog.l(null);
        oBasePanelDialog.p(null);
        oBasePanelDialog.q(this.f7893e);
        oBasePanelDialog.h(false);
        oBasePanelDialog.m(false);
        return oBasePanelDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        l.f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        l.f(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new b());
        }
    }
}
