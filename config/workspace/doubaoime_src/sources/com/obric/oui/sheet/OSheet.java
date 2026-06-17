package com.obric.oui.sheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OSheet extends BottomSheetDialogFragment {
    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        OBottomSheetDialog oBottomSheetDialog = new OBottomSheetDialog(requireContext(), C0838R.style.AppBottomSheetDialogTheme);
        BottomSheetBehavior<FrameLayout> behavior = oBottomSheetDialog.getBehavior();
        l.e(behavior, "behavior");
        behavior.setSkipCollapsed(true);
        BottomSheetBehavior<FrameLayout> behavior2 = oBottomSheetDialog.getBehavior();
        l.e(behavior2, "behavior");
        Context context = oBottomSheetDialog.getContext();
        l.e(context, "context");
        behavior2.setPeekHeight(e.i.a.b.a.e(context));
        return oBottomSheetDialog;
    }
}
