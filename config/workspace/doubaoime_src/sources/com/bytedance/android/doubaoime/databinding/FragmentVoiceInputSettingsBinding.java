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
public final class FragmentVoiceInputSettingsBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1996c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1997d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImeCheckBoxList f1998e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImeCheckBoxList f1999f;

    private FragmentVoiceInputSettingsBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull ImeListItemView imeListItemView2, @NonNull ImeListItemView imeListItemView3, @NonNull ImeListItemView imeListItemView4, @NonNull ImeTitleBar imeTitleBar, @NonNull ImeCheckBoxList imeCheckBoxList, @NonNull ImeCheckBoxList imeCheckBoxList2) {
        this.a = linearLayout;
        this.b = imeListItemView;
        this.f1996c = imeListItemView3;
        this.f1997d = imeListItemView4;
        this.f1998e = imeCheckBoxList;
        this.f1999f = imeCheckBoxList2;
    }

    @NonNull
    public static FragmentVoiceInputSettingsBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_voice_input_settings, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.enable_bluetooth_input_item;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.enable_bluetooth_input_item);
        if (imeListItemView != null) {
            i = C0838R.id.enable_offline_asr_item;
            ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_offline_asr_item);
            if (imeListItemView2 != null) {
                i = C0838R.id.enable_switch_cell_item;
                ImeListItemView imeListItemView3 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_switch_cell_item);
                if (imeListItemView3 != null) {
                    i = C0838R.id.offline_download_item;
                    ImeListItemView imeListItemView4 = (ImeListItemView) inflate.findViewById(C0838R.id.offline_download_item);
                    if (imeListItemView4 != null) {
                        i = C0838R.id.settings_title_bar;
                        ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                        if (imeTitleBar != null) {
                            i = C0838R.id.voice_input_punctuation_list;
                            ImeCheckBoxList imeCheckBoxList = (ImeCheckBoxList) inflate.findViewById(C0838R.id.voice_input_punctuation_list);
                            if (imeCheckBoxList != null) {
                                i = C0838R.id.voice_words_model_box_list;
                                ImeCheckBoxList imeCheckBoxList2 = (ImeCheckBoxList) inflate.findViewById(C0838R.id.voice_words_model_box_list);
                                if (imeCheckBoxList2 != null) {
                                    return new FragmentVoiceInputSettingsBinding((LinearLayout) inflate, imeListItemView, imeListItemView2, imeListItemView3, imeListItemView4, imeTitleBar, imeCheckBoxList, imeCheckBoxList2);
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
