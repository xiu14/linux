package com.bytedance.android.input.fragment.settings;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationManagerCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common_biz.ui.widget.ImeListItemView;

/* loaded from: classes.dex */
public final class SystemPermissionFragment extends BaseSettingsFragment {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2410f = 0;
    private ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    private ImeListItemView f2411c;

    /* renamed from: d, reason: collision with root package name */
    private ImeListItemView f2412d;

    /* renamed from: e, reason: collision with root package name */
    private ImeListItemView f2413e;

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_system_permission, viewGroup, false);
        this.b = (ImeListItemView) inflate.findViewById(C0838R.id.read_sms_permission);
        this.f2411c = (ImeListItemView) inflate.findViewById(C0838R.id.contacts_permission);
        this.f2412d = (ImeListItemView) inflate.findViewById(C0838R.id.microphone_permission);
        this.f2413e = (ImeListItemView) inflate.findViewById(C0838R.id.notification_permission);
        return inflate;
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        r();
    }

    @Override // com.bytedance.android.input.fragment.settings.BaseSettingsFragment
    public void r() {
        boolean areNotificationsEnabled;
        l();
        boolean a = com.bytedance.android.input.common_biz.permission.i.a(getContext(), "android.permission.READ_SMS");
        boolean a2 = com.bytedance.android.input.common_biz.permission.i.a(getContext(), "android.permission.READ_CONTACTS");
        boolean a3 = com.bytedance.android.input.common_biz.permission.i.a(getContext(), "android.permission.RECORD_AUDIO");
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    areNotificationsEnabled = com.bytedance.android.input.common_biz.permission.i.a(context, "android.permission.POST_NOTIFICATIONS");
                    com.bytedance.android.input.r.j.i("MessageCenter-Permission", "hasNotificationPermission: ---granted=" + areNotificationsEnabled);
                } else {
                    areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
                    com.bytedance.android.input.r.j.i("MessageCenter-Permission", "hasNotificationPermission: ---areNotificationsEnabled=" + areNotificationsEnabled);
                }
                z = areNotificationsEnabled;
            } catch (Throwable th) {
                Throwable b = kotlin.h.b(com.prolificinteractive.materialcalendarview.r.J(th));
                if (b != null) {
                    e.a.a.a.a.P0(b, e.a.a.a.a.M("hasNotificationPermission: "), "MessageCenter-Permission");
                }
            }
        }
        ImeListItemView imeListItemView = this.b;
        int i = C0838R.color.ime_color_4f84ff;
        if (imeListItemView != null) {
            imeListItemView.setTrailingTextColor(imeListItemView.getResources().getColor(a ? C0838R.color.ime_color_4f84ff : C0838R.color.ime_color_common_text_73_color, null));
            imeListItemView.setTrailingText(a ? "已开启" : "去设置");
        }
        ImeListItemView imeListItemView2 = this.f2411c;
        if (imeListItemView2 != null) {
            imeListItemView2.setTrailingTextColor(imeListItemView2.getResources().getColor(a2 ? C0838R.color.ime_color_4f84ff : C0838R.color.ime_color_common_text_73_color, null));
            imeListItemView2.setTrailingText(a2 ? "已开启" : "去设置");
        }
        ImeListItemView imeListItemView3 = this.f2412d;
        if (imeListItemView3 != null) {
            imeListItemView3.setTrailingTextColor(imeListItemView3.getResources().getColor(a3 ? C0838R.color.ime_color_4f84ff : C0838R.color.ime_color_common_text_73_color, null));
            imeListItemView3.setTrailingText(a3 ? "已开启" : "去设置");
        }
        ImeListItemView imeListItemView4 = this.f2413e;
        if (imeListItemView4 != null) {
            Resources resources = imeListItemView4.getResources();
            if (!z) {
                i = C0838R.color.ime_color_common_text_73_color;
            }
            imeListItemView4.setTrailingTextColor(resources.getColor(i, null));
            imeListItemView4.setTrailingText(z ? "已开启" : "去设置");
        }
        ImeListItemView imeListItemView5 = this.b;
        if (imeListItemView5 != null) {
            imeListItemView5.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SystemPermissionFragment systemPermissionFragment = SystemPermissionFragment.this;
                    int i2 = SystemPermissionFragment.f2410f;
                    kotlin.s.c.l.f(systemPermissionFragment, "this$0");
                    Context requireContext = systemPermissionFragment.requireContext();
                    kotlin.s.c.l.e(requireContext, "requireContext()");
                    com.bytedance.android.input.common_biz.permission.i.b(requireContext);
                }
            });
        }
        ImeListItemView imeListItemView6 = this.f2411c;
        if (imeListItemView6 != null) {
            imeListItemView6.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SystemPermissionFragment systemPermissionFragment = SystemPermissionFragment.this;
                    int i2 = SystemPermissionFragment.f2410f;
                    kotlin.s.c.l.f(systemPermissionFragment, "this$0");
                    Context requireContext = systemPermissionFragment.requireContext();
                    kotlin.s.c.l.e(requireContext, "requireContext()");
                    com.bytedance.android.input.common_biz.permission.i.b(requireContext);
                }
            });
        }
        ImeListItemView imeListItemView7 = this.f2412d;
        if (imeListItemView7 != null) {
            imeListItemView7.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SystemPermissionFragment systemPermissionFragment = SystemPermissionFragment.this;
                    int i2 = SystemPermissionFragment.f2410f;
                    kotlin.s.c.l.f(systemPermissionFragment, "this$0");
                    Context requireContext = systemPermissionFragment.requireContext();
                    kotlin.s.c.l.e(requireContext, "requireContext()");
                    com.bytedance.android.input.common_biz.permission.i.b(requireContext);
                }
            });
        }
        ImeListItemView imeListItemView8 = this.f2413e;
        if (imeListItemView8 != null) {
            imeListItemView8.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SystemPermissionFragment systemPermissionFragment = SystemPermissionFragment.this;
                    int i2 = SystemPermissionFragment.f2410f;
                    kotlin.s.c.l.f(systemPermissionFragment, "this$0");
                    Context requireContext = systemPermissionFragment.requireContext();
                    kotlin.s.c.l.e(requireContext, "requireContext()");
                    com.bytedance.android.input.common_biz.permission.i.b(requireContext);
                }
            });
        }
    }
}
