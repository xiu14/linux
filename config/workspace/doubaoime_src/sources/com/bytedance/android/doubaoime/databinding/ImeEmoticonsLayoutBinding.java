package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeEmptyLayout;

/* loaded from: classes.dex */
public final class ImeEmoticonsLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImeEmptyLayout b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RecyclerView f2000c;

    private ImeEmoticonsLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImeEmptyLayout imeEmptyLayout, @NonNull RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = imeEmptyLayout;
        this.f2000c = recyclerView;
    }

    @NonNull
    public static ImeEmoticonsLayoutBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.ime_emoticons_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.emoticons_empty_layout;
        ImeEmptyLayout imeEmptyLayout = (ImeEmptyLayout) inflate.findViewById(C0838R.id.emoticons_empty_layout);
        if (imeEmptyLayout != null) {
            i = C0838R.id.emoticons_recycler_view;
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0838R.id.emoticons_recycler_view);
            if (recyclerView != null) {
                return new ImeEmoticonsLayoutBinding((ConstraintLayout) inflate, imeEmptyLayout, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
