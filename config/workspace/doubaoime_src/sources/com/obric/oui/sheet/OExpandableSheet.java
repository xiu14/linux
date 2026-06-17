package com.obric.oui.sheet;

import android.app.Dialog;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OExpandableSheet extends OSheet {
    @Override // com.obric.oui.sheet.OSheet, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        OBottomSheetDialog oBottomSheetDialog = new OBottomSheetDialog(requireContext(), C0838R.style.AppBottomSheetDialogTheme);
        oBottomSheetDialog.f8005d = false;
        BottomSheetBehavior<FrameLayout> behavior = oBottomSheetDialog.getBehavior();
        l.e(behavior, "behavior");
        behavior.setSkipCollapsed(true);
        BottomSheetBehavior<FrameLayout> behavior2 = oBottomSheetDialog.getBehavior();
        l.e(behavior2, "behavior");
        behavior2.setFitToContents(true);
        oBottomSheetDialog.b(true);
        return oBottomSheetDialog;
    }
}
