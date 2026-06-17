package com.bytedance.feedbackerlib.matisse.internal.ui.widget;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.manager.F;

/* loaded from: classes.dex */
public class IncapableDialog extends DialogFragment {
    public static final F a = F.d();

    class a implements View.OnClickListener {
        final /* synthetic */ AlertDialog a;

        a(IncapableDialog incapableDialog, AlertDialog alertDialog) {
            this.a = alertDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.a.dismiss();
        }
    }

    public static IncapableDialog l(String str, String str2) {
        IncapableDialog incapableDialog = new IncapableDialog();
        Bundle bundle = new Bundle();
        bundle.putString("extra_title", str);
        bundle.putString("extra_message", str2);
        incapableDialog.setArguments(bundle);
        return incapableDialog;
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        String string = getArguments().getString("extra_title");
        View inflate = LayoutInflater.from(getContext()).inflate(C0838R.layout.dialog_max_select_photo, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_title);
        TextView textView2 = (TextView) inflate.findViewById(C0838R.id.tv_i_know);
        textView.setText(string);
        String f2 = a.f("key_i_know");
        if (com.bytedance.android.input.k.b.a.G(f2, "no translation")) {
            f2 = "我知道了";
        }
        textView2.setText(f2);
        AlertDialog create = new AlertDialog.Builder(getActivity(), C0838R.style.TranslucentDialog).setCancelable(true).setView(inflate).create();
        textView2.setOnClickListener(new a(this, create));
        return create;
    }
}
