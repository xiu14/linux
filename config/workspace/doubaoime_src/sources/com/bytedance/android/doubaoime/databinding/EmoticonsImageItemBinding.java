package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import java.util.Objects;

/* loaded from: classes.dex */
public final class EmoticonsImageItemBinding implements ViewBinding {

    @NonNull
    private final ImageView a;

    @NonNull
    public final ImageView b;

    private EmoticonsImageItemBinding(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.a = imageView;
        this.b = imageView2;
    }

    @NonNull
    public static EmoticonsImageItemBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.emoticons_image_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        Objects.requireNonNull(inflate, "rootView");
        ImageView imageView = (ImageView) inflate;
        return new EmoticonsImageItemBinding(imageView, imageView);
    }

    @NonNull
    public ImageView a() {
        return this.a;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
