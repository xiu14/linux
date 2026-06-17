package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EmoticonsEmptyItemBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    private EmoticonsEmptyItemBinding(@NonNull ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @NonNull
    public static EmoticonsEmptyItemBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.emoticons_empty_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        Objects.requireNonNull(inflate, "rootView");
        return new EmoticonsEmptyItemBinding((ConstraintLayout) inflate);
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
