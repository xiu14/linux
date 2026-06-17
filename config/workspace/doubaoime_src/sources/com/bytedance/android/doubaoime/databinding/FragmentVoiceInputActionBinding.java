package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeCheckBoxList;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class FragmentVoiceInputActionBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeCheckBoxList b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1994c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1995d;

    private FragmentVoiceInputActionBinding(@NonNull LinearLayout linearLayout, @NonNull ImeCheckBoxList imeCheckBoxList, @NonNull LinearLayout linearLayout2, @NonNull ImeListItemView imeListItemView, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeCheckBoxList;
        this.f1994c = linearLayout2;
        this.f1995d = imeListItemView;
    }

    @NonNull
    public static FragmentVoiceInputActionBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_voice_input_action, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.action_list_layout;
        ImeCheckBoxList imeCheckBoxList = (ImeCheckBoxList) inflate.findViewById(C0838R.id.action_list_layout);
        if (imeCheckBoxList != null) {
            i = C0838R.id.action_send_layout;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.action_send_layout);
            if (linearLayout != null) {
                i = C0838R.id.enable_voice_action_list_item;
                ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.enable_voice_action_list_item);
                if (imeListItemView != null) {
                    i = C0838R.id.settings_title_bar;
                    ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                    if (imeTitleBar != null) {
                        return new FragmentVoiceInputActionBinding((LinearLayout) inflate, imeCheckBoxList, linearLayout, imeListItemView, imeTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @NonNull
    public LinearLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
