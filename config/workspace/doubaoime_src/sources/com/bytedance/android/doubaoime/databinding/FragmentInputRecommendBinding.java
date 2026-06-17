package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class FragmentInputRecommendBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1963c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1964d;

    private FragmentInputRecommendBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull ImeListItemView imeListItemView2, @NonNull ImeTitleBar imeTitleBar, @NonNull ImeListItemView imeListItemView3) {
        this.a = linearLayout;
        this.b = imeListItemView;
        this.f1963c = imeListItemView2;
        this.f1964d = imeListItemView3;
    }

    @NonNull
    public static FragmentInputRecommendBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_input_recommend, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.emoji_recommend_item;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.emoji_recommend_item);
        if (imeListItemView != null) {
            i = C0838R.id.kaomoji_recommend_item;
            ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.kaomoji_recommend_item);
            if (imeListItemView2 != null) {
                i = C0838R.id.settings_title_bar;
                ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                if (imeTitleBar != null) {
                    i = C0838R.id.typing_associate_item;
                    ImeListItemView imeListItemView3 = (ImeListItemView) inflate.findViewById(C0838R.id.typing_associate_item);
                    if (imeListItemView3 != null) {
                        return new FragmentInputRecommendBinding((LinearLayout) inflate, imeListItemView, imeListItemView2, imeTitleBar, imeListItemView3);
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
