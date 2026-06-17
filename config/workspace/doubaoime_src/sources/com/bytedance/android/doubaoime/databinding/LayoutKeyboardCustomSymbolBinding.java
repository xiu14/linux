package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Objects;

/* loaded from: classes.dex */
public final class LayoutKeyboardCustomSymbolBinding implements ViewBinding {

    @NonNull
    private final RecyclerView a;

    private LayoutKeyboardCustomSymbolBinding(@NonNull RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    @NonNull
    public static LayoutKeyboardCustomSymbolBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.layout_keyboard_custom_symbol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        Objects.requireNonNull(inflate, "rootView");
        return new LayoutKeyboardCustomSymbolBinding((RecyclerView) inflate);
    }

    @NonNull
    public RecyclerView a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
