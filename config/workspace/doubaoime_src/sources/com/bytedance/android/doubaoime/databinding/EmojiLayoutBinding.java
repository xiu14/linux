package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.keyboard.component.SegmentedBar;
import com.bytedance.android.input.keyboard.gif.list_layout.ImeEmoticonsLayout;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public final class EmojiLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f1957c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f1958d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f1959e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f1960f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TabLayout f1961g;

    @NonNull
    public final ViewPager2 h;

    @NonNull
    public final ImeEmoticonsLayout i;

    @NonNull
    public final TabLayout j;

    @NonNull
    public final ViewPager2 k;

    @NonNull
    public final SegmentedBar l;

    private EmojiLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull TextView textView3, @NonNull ConstraintLayout constraintLayout2, @NonNull TabLayout tabLayout, @NonNull ViewPager2 viewPager2, @NonNull ImeEmoticonsLayout imeEmoticonsLayout, @NonNull TabLayout tabLayout2, @NonNull ViewPager2 viewPager22, @NonNull SegmentedBar segmentedBar) {
        this.a = constraintLayout;
        this.b = textView;
        this.f1957c = textView2;
        this.f1958d = imageView;
        this.f1959e = textView3;
        this.f1960f = constraintLayout2;
        this.f1961g = tabLayout;
        this.h = viewPager2;
        this.i = imeEmoticonsLayout;
        this.j = tabLayout2;
        this.k = viewPager22;
        this.l = segmentedBar;
    }

    @NonNull
    public static EmojiLayoutBinding a(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.emoji_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.btn_backspace;
        TextView textView = (TextView) inflate.findViewById(C0838R.id.btn_backspace);
        if (textView != null) {
            i = C0838R.id.btn_close;
            TextView textView2 = (TextView) inflate.findViewById(C0838R.id.btn_close);
            if (textView2 != null) {
                i = C0838R.id.btn_history;
                ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.btn_history);
                if (imageView != null) {
                    i = C0838R.id.btn_send;
                    TextView textView3 = (TextView) inflate.findViewById(C0838R.id.btn_send);
                    if (textView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                        i = C0838R.id.emoji_tab;
                        TabLayout tabLayout = (TabLayout) inflate.findViewById(C0838R.id.emoji_tab);
                        if (tabLayout != null) {
                            i = C0838R.id.emoji_view_pager;
                            ViewPager2 viewPager2 = (ViewPager2) inflate.findViewById(C0838R.id.emoji_view_pager);
                            if (viewPager2 != null) {
                                i = C0838R.id.emoticons_layout;
                                ImeEmoticonsLayout imeEmoticonsLayout = (ImeEmoticonsLayout) inflate.findViewById(C0838R.id.emoticons_layout);
                                if (imeEmoticonsLayout != null) {
                                    i = C0838R.id.kaomoji_tab;
                                    TabLayout tabLayout2 = (TabLayout) inflate.findViewById(C0838R.id.kaomoji_tab);
                                    if (tabLayout2 != null) {
                                        i = C0838R.id.kaomoji_view_pager;
                                        ViewPager2 viewPager22 = (ViewPager2) inflate.findViewById(C0838R.id.kaomoji_view_pager);
                                        if (viewPager22 != null) {
                                            i = C0838R.id.segmented_bar;
                                            SegmentedBar segmentedBar = (SegmentedBar) inflate.findViewById(C0838R.id.segmented_bar);
                                            if (segmentedBar != null) {
                                                return new EmojiLayoutBinding(constraintLayout, textView, textView2, imageView, textView3, constraintLayout, tabLayout, viewPager2, imeEmoticonsLayout, tabLayout2, viewPager22, segmentedBar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
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
