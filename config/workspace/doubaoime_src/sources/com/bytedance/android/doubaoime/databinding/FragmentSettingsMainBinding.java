package com.bytedance.android.doubaoime.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeImageTextComponent;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;
import com.obric.oui.badge.OBadgeView;

/* loaded from: classes.dex */
public final class FragmentSettingsMainBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f1988c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f1989d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1990e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1991f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final ImeListItemView f1992g;

    @NonNull
    public final ImeListItemView h;

    @NonNull
    public final ScrollView i;

    @NonNull
    public final ImeTitleBar j;

    @NonNull
    public final View k;

    @NonNull
    public final ImeListItemView l;

    @NonNull
    public final ImeListItemView m;

    @NonNull
    public final ImeImageTextComponent n;

    private FragmentSettingsMainBinding(@NonNull LinearLayout linearLayout, @NonNull ImeListItemView imeListItemView, @NonNull ImeListItemView imeListItemView2, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull ImeListItemView imeListItemView3, @NonNull ImeListItemView imeListItemView4, @NonNull ImeListItemView imeListItemView5, @NonNull ImeListItemView imeListItemView6, @NonNull ImeListItemView imeListItemView7, @NonNull ImeListItemView imeListItemView8, @NonNull ImeListItemView imeListItemView9, @NonNull ImeListItemView imeListItemView10, @NonNull ImeListItemView imeListItemView11, @NonNull ImeListItemView imeListItemView12, @NonNull ImeListItemView imeListItemView13, @NonNull ImeListItemView imeListItemView14, @NonNull ImeListItemView imeListItemView15, @NonNull ImeListItemView imeListItemView16, @NonNull ImeListItemView imeListItemView17, @NonNull ImeListItemView imeListItemView18, @NonNull ImeListItemView imeListItemView19, @NonNull OBadgeView oBadgeView, @NonNull ScrollView scrollView, @NonNull ImeTitleBar imeTitleBar, @NonNull View view4, @NonNull ImeListItemView imeListItemView20, @NonNull ImeListItemView imeListItemView21, @NonNull ImeListItemView imeListItemView22, @NonNull ImeListItemView imeListItemView23, @NonNull ImeImageTextComponent imeImageTextComponent) {
        this.a = linearLayout;
        this.b = imeListItemView2;
        this.f1988c = view;
        this.f1989d = view3;
        this.f1990e = imeListItemView8;
        this.f1991f = imeListItemView9;
        this.f1992g = imeListItemView10;
        this.h = imeListItemView12;
        this.i = scrollView;
        this.j = imeTitleBar;
        this.k = view4;
        this.l = imeListItemView21;
        this.m = imeListItemView22;
        this.n = imeImageTextComponent;
    }

    @NonNull
    public static FragmentSettingsMainBinding b(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_settings_main, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        int i = C0838R.id.about;
        ImeListItemView imeListItemView = (ImeListItemView) inflate.findViewById(C0838R.id.about);
        if (imeListItemView != null) {
            i = C0838R.id.ai_chat_assistant_list_item;
            ImeListItemView imeListItemView2 = (ImeListItemView) inflate.findViewById(C0838R.id.ai_chat_assistant_list_item);
            if (imeListItemView2 != null) {
                i = C0838R.id.clickable_view_enable_ai_assistant;
                View findViewById = inflate.findViewById(C0838R.id.clickable_view_enable_ai_assistant);
                if (findViewById != null) {
                    i = C0838R.id.clickable_view_enable_cloud;
                    View findViewById2 = inflate.findViewById(C0838R.id.clickable_view_enable_cloud);
                    if (findViewById2 != null) {
                        i = C0838R.id.clickable_view_enable_report_inputdata;
                        View findViewById3 = inflate.findViewById(C0838R.id.clickable_view_enable_report_inputdata);
                        if (findViewById3 != null) {
                            i = C0838R.id.clipboard_list_item;
                            ImeListItemView imeListItemView3 = (ImeListItemView) inflate.findViewById(C0838R.id.clipboard_list_item);
                            if (imeListItemView3 != null) {
                                i = C0838R.id.debug_settings;
                                ImeListItemView imeListItemView4 = (ImeListItemView) inflate.findViewById(C0838R.id.debug_settings);
                                if (imeListItemView4 != null) {
                                    i = C0838R.id.desktop_list_item;
                                    ImeListItemView imeListItemView5 = (ImeListItemView) inflate.findViewById(C0838R.id.desktop_list_item);
                                    if (imeListItemView5 != null) {
                                        i = C0838R.id.enable_cloud_list_item;
                                        ImeListItemView imeListItemView6 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_cloud_list_item);
                                        if (imeListItemView6 != null) {
                                            i = C0838R.id.enable_offline_asr_list_item;
                                            ImeListItemView imeListItemView7 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_offline_asr_list_item);
                                            if (imeListItemView7 != null) {
                                                i = C0838R.id.enable_report_inputdata;
                                                ImeListItemView imeListItemView8 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_report_inputdata);
                                                if (imeListItemView8 != null) {
                                                    i = C0838R.id.enable_sms_permission_list_item;
                                                    ImeListItemView imeListItemView9 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_sms_permission_list_item);
                                                    if (imeListItemView9 != null) {
                                                        i = C0838R.id.enable_update_contacts_list_item;
                                                        ImeListItemView imeListItemView10 = (ImeListItemView) inflate.findViewById(C0838R.id.enable_update_contacts_list_item);
                                                        if (imeListItemView10 != null) {
                                                            i = C0838R.id.fuzzy_title_list_item;
                                                            ImeListItemView imeListItemView11 = (ImeListItemView) inflate.findViewById(C0838R.id.fuzzy_title_list_item);
                                                            if (imeListItemView11 != null) {
                                                                i = C0838R.id.help_and_tips_view;
                                                                ImeListItemView imeListItemView12 = (ImeListItemView) inflate.findViewById(C0838R.id.help_and_tips_view);
                                                                if (imeListItemView12 != null) {
                                                                    i = C0838R.id.input_mode_title_list_item;
                                                                    ImeListItemView imeListItemView13 = (ImeListItemView) inflate.findViewById(C0838R.id.input_mode_title_list_item);
                                                                    if (imeListItemView13 != null) {
                                                                        i = C0838R.id.input_recommend_list_item;
                                                                        ImeListItemView imeListItemView14 = (ImeListItemView) inflate.findViewById(C0838R.id.input_recommend_list_item);
                                                                        if (imeListItemView14 != null) {
                                                                            i = C0838R.id.kbd_layout_list_item;
                                                                            ImeListItemView imeListItemView15 = (ImeListItemView) inflate.findViewById(C0838R.id.kbd_layout_list_item);
                                                                            if (imeListItemView15 != null) {
                                                                                i = C0838R.id.kbd_layout_list_item_multiple_input_type;
                                                                                ImeListItemView imeListItemView16 = (ImeListItemView) inflate.findViewById(C0838R.id.kbd_layout_list_item_multiple_input_type);
                                                                                if (imeListItemView16 != null) {
                                                                                    i = C0838R.id.key_auxiliary_input_title_list_item;
                                                                                    ImeListItemView imeListItemView17 = (ImeListItemView) inflate.findViewById(C0838R.id.key_auxiliary_input_title_list_item);
                                                                                    if (imeListItemView17 != null) {
                                                                                        i = C0838R.id.key_feedback_title_list_item;
                                                                                        ImeListItemView imeListItemView18 = (ImeListItemView) inflate.findViewById(C0838R.id.key_feedback_title_list_item);
                                                                                        if (imeListItemView18 != null) {
                                                                                            i = C0838R.id.lexicon_management_list_item;
                                                                                            ImeListItemView imeListItemView19 = (ImeListItemView) inflate.findViewById(C0838R.id.lexicon_management_list_item);
                                                                                            if (imeListItemView19 != null) {
                                                                                                i = C0838R.id.new_version_badge;
                                                                                                OBadgeView oBadgeView = (OBadgeView) inflate.findViewById(C0838R.id.new_version_badge);
                                                                                                if (oBadgeView != null) {
                                                                                                    i = C0838R.id.settings_scrollview;
                                                                                                    ScrollView scrollView = (ScrollView) inflate.findViewById(C0838R.id.settings_scrollview);
                                                                                                    if (scrollView != null) {
                                                                                                        i = C0838R.id.settings_title_bar;
                                                                                                        ImeTitleBar imeTitleBar = (ImeTitleBar) inflate.findViewById(C0838R.id.settings_title_bar);
                                                                                                        if (imeTitleBar != null) {
                                                                                                            i = C0838R.id.settings_title_line;
                                                                                                            View findViewById4 = inflate.findViewById(C0838R.id.settings_title_line);
                                                                                                            if (findViewById4 != null) {
                                                                                                                i = C0838R.id.system_permission_list_item;
                                                                                                                ImeListItemView imeListItemView20 = (ImeListItemView) inflate.findViewById(C0838R.id.system_permission_list_item);
                                                                                                                if (imeListItemView20 != null) {
                                                                                                                    i = C0838R.id.user_feedback_list_item;
                                                                                                                    ImeListItemView imeListItemView21 = (ImeListItemView) inflate.findViewById(C0838R.id.user_feedback_list_item);
                                                                                                                    if (imeListItemView21 != null) {
                                                                                                                        i = C0838R.id.voice_input_action_item;
                                                                                                                        ImeListItemView imeListItemView22 = (ImeListItemView) inflate.findViewById(C0838R.id.voice_input_action_item);
                                                                                                                        if (imeListItemView22 != null) {
                                                                                                                            i = C0838R.id.voice_input_list_item;
                                                                                                                            ImeListItemView imeListItemView23 = (ImeListItemView) inflate.findViewById(C0838R.id.voice_input_list_item);
                                                                                                                            if (imeListItemView23 != null) {
                                                                                                                                i = C0838R.id.voice_input_title;
                                                                                                                                ImeImageTextComponent imeImageTextComponent = (ImeImageTextComponent) inflate.findViewById(C0838R.id.voice_input_title);
                                                                                                                                if (imeImageTextComponent != null) {
                                                                                                                                    return new FragmentSettingsMainBinding((LinearLayout) inflate, imeListItemView, imeListItemView2, findViewById, findViewById2, findViewById3, imeListItemView3, imeListItemView4, imeListItemView5, imeListItemView6, imeListItemView7, imeListItemView8, imeListItemView9, imeListItemView10, imeListItemView11, imeListItemView12, imeListItemView13, imeListItemView14, imeListItemView15, imeListItemView16, imeListItemView17, imeListItemView18, imeListItemView19, oBadgeView, scrollView, imeTitleBar, findViewById4, imeListItemView20, imeListItemView21, imeListItemView22, imeListItemView23, imeImageTextComponent);
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
