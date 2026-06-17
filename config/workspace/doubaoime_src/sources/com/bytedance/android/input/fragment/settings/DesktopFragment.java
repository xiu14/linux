package com.bytedance.android.input.fragment.settings;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.obric.oui.toast.a;

/* loaded from: classes.dex */
public final class DesktopFragment extends BaseSettingsFragment {
    public static final /* synthetic */ int b = 0;

    @Override // com.bytedance.android.input.framework.fragment.BaseImeFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.s.c.l.f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0838R.layout.fragment_desktop, viewGroup, false);
        View findViewById = inflate.findViewById(C0838R.id.desktop_copy_button);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DesktopFragment desktopFragment = DesktopFragment.this;
                    int i = DesktopFragment.b;
                    kotlin.s.c.l.f(desktopFragment, "this$0");
                    IAppLog.a.i("setting_copyurl_click");
                    String string = desktopFragment.getString(C0838R.string.desktop_official_site);
                    kotlin.s.c.l.e(string, "getString(R.string.desktop_official_site)");
                    Context context = desktopFragment.getContext();
                    Object systemService = context != null ? context.getSystemService("clipboard") : null;
                    ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                    if (clipboardManager != null) {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(string, string));
                    }
                    FragmentActivity activity = desktopFragment.getActivity();
                    if (activity != null) {
                        a.C0363a c0363a = com.obric.oui.toast.a.p;
                        String string2 = desktopFragment.getString(C0838R.string.tip_copy);
                        kotlin.s.c.l.e(string2, "getString(R.string.tip_copy)");
                        c0363a.a(activity, string2, 48);
                    }
                }
            });
        }
        IAppLog.a.i("setting_pc_pageview");
        return inflate;
    }
}
