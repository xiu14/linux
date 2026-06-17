package com.obric.oui.panel;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OBasicPanel extends OBasicPanelFragment {
    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.f(layoutInflater, "inflater");
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Dialog dialog;
        super.onStart();
        Dialog dialog2 = getDialog();
        if (dialog2 == null || !dialog2.isShowing() || (dialog = getDialog()) == null) {
            return;
        }
        dialog.cancel();
    }
}
