package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeCheckBox;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;
import com.bytedance.common_biz.ui.widget.ImeTitleImageItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleProgressView;

/* loaded from: classes.dex */
public final class FragmentKeyFeedbackBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeTitleImageItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1977c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeCheckBox f1978d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1979e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImeCheckBox f1980f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final LinearLayout f1981g;

    @NonNull
    public final LinearLayout h;

    @NonNull
    public final TextView i;

    @NonNull
    public final TextView j;

    @NonNull
    public final ImeTitleProgressView k;

    @NonNull
    public final ImeTitleProgressView l;

    @NonNull
    public final ImeTitleProgressView m;

    private FragmentKeyFeedbackBinding(@NonNull LinearLayout linearLayout, @NonNull ImeTitleImageItemView imeTitleImageItemView, @NonNull LinearLayout linearLayout2, @NonNull ImeCheckBox imeCheckBox, @NonNull LinearLayout linearLayout3, @NonNull ImeCheckBox imeCheckBox2, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImeTitleProgressView imeTitleProgressView, @NonNull ImeTitleProgressView imeTitleProgressView2, @NonNull ImeTitleProgressView imeTitleProgressView3, @NonNull ImeTitleBar imeTitleBar) {
        this.a = linearLayout;
        this.b = imeTitleImageItemView;
        this.f1977c = linearLayout2;
        this.f1978d = imeCheckBox;
        this.f1979e = linearLayout3;
        this.f1980f = imeCheckBox2;
        this.f1981g = linearLayout4;
        this.h = linearLayout5;
        this.i = textView;
        this.j = textView2;
        this.k = imeTitleProgressView;
        this.l = imeTitleProgressView2;
        this.m = imeTitleProgressView3;
    }

    @NonNull
    public static FragmentKeyFeedbackBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_key_feedback, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.key_enable_26key_bubble;
        ImeTitleImageItemView imeTitleImageItemView = (ImeTitleImageItemView) inflate.findViewById(C0838R.id.key_enable_26key_bubble);
        if (imeTitleImageItemView != null) {
            i = C0838R.id.key_feedback_container;
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.key_feedback_container);
            if (linearLayout != null) {
                i = C0838R.id.key_feedback_repose_input_checkbox;
                ImeCheckBox imeCheckBox = (ImeCheckBox) inflate.findViewById(C0838R.id.key_feedback_repose_input_checkbox);
                if (imeCheckBox != null) {
                    i = C0838R.id.key_feedback_repose_input_container;
                    LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.key_feedback_repose_input_container);
                    if (linearLayout2 != null) {
                        i = C0838R.id.key_feedback_repose_quality_checkbox;
                        ImeCheckBox imeCheckBox2 = (ImeCheckBox) inflate.findViewById(C0838R.id.key_feedback_repose_quality_checkbox);
                        if (imeCheckBox2 != null) {
                            i = C0838R.id.key_feedback_repose_quality_container;
                            LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0838R.id.key_feedback_repose_quality_container);
                            if (linearLayout3 != null) {
                                i = C0838R.id.key_feedback_response_repose_container;
                                LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(C0838R.id.key_feedback_response_repose_container);
                                if (linearLayout4 != null) {
                                    i = C0838R.id.key_feedback_response_repose_title;
                                    TextView textView = (TextView) inflate.findViewById(C0838R.id.key_feedback_response_repose_title);
                                    if (textView != null) {
                                        i = C0838R.id.key_feedback_response_sound_title;
                                        TextView textView2 = (TextView) inflate.findViewById(C0838R.id.key_feedback_response_sound_title);
                                        if (textView2 != null) {
                                            i = C0838R.id.key_feedback_response_speed;
                                            ImeTitleProgressView imeTitleProgressView = (ImeTitleProgressView) inflate.findViewById(C0838R.id.key_feedback_response_speed);
                                            if (imeTitleProgressView != null) {
                                                i = C0838R.id.key_feedback_sound;
                                                ImeTitleProgressView imeTitleProgressView2 = (ImeTitleProgressView) inflate.findViewById(C0838R.id.key_feedback_sound);
                                                if (imeTitleProgressView2 != null) {
                                                    i = C0838R.id.key_feedback_vibration;
                                                    ImeTitleProgressView imeTitleProgressView3 = (ImeTitleProgressView) inflate.findViewById(C0838R.id.key_feedback_vibration);
                                                    if (imeTitleProgressView3 != null) {
                                                        i = C0838R.id.settings_title_bar;
                                                        ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                                                        if (imeTitleBar != null) {
                                                            return new FragmentKeyFeedbackBinding((LinearLayout) inflate, imeTitleImageItemView, linearLayout, imeCheckBox, linearLayout2, imeCheckBox2, linearLayout3, linearLayout4, textView, textView2, imeTitleProgressView, imeTitleProgressView2, imeTitleProgressView3, imeTitleBar);
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
