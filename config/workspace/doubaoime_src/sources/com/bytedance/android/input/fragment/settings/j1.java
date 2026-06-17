package com.bytedance.android.input.fragment.settings;

import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.popup.WindowId;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j1 {
    public static final boolean a() {
        boolean b = b();
        com.bytedance.android.input.r.j.m("SmsPermissionManager", "permissionCheck: " + b);
        if (!b) {
            IAppGlobals.a aVar = IAppGlobals.a;
            if (aVar.u().getBoolean("read_sms_system_pop_have_shown", false)) {
                com.bytedance.android.input.r.j.m("SmsPermissionManager", "show pop window");
                com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
                Objects.requireNonNull(aVar);
                final com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(aVar.getContext(), WindowId.CONFIRM_SMS_READ_PERMISSION, 0);
                iVar.s(C0838R.string.sms_permission_tip);
                iVar.B(C0838R.string.sms_permission_tip_title);
                iVar.w(C0838R.string.recorder_tip_left_btn);
                iVar.z(C0838R.string.recorder_tip_right_btn);
                iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_SMS_READ_PERMISSION);
                    }
                });
                iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.g0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.bytedance.android.input.popup.i iVar2 = com.bytedance.android.input.popup.i.this;
                        kotlin.s.c.l.f(iVar2, "$this_apply");
                        String string = iVar2.c().getString(C0838R.string.sms_verification_enabled);
                        kotlin.s.c.l.e(string, "context.getString(R.stri…sms_verification_enabled)");
                        SettingsConfigNext.l(string, Boolean.TRUE);
                        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_SMS_READ_PERMISSION);
                        IAppGlobals.a aVar2 = IAppGlobals.a;
                        Objects.requireNonNull(aVar2);
                        com.bytedance.android.input.common_biz.permission.i.b(aVar2.getContext());
                    }
                });
                f2.m(iVar, 0);
            } else {
                com.bytedance.android.input.r.j.m("SmsPermissionManager", "requestPermission");
                Objects.requireNonNull(aVar);
                d.a.b.a.m(aVar.getContext(), "android.permission.READ_SMS", 100, "该功能需开启你的短信权限", "用于短信验证码填充");
            }
            com.bytedance.android.input.r.j.m("SmsPermissionManager", "注册sms监听器");
            com.bytedance.android.input.common.m.f();
            Objects.requireNonNull(aVar);
            com.bytedance.android.input.common.m.e(aVar.getContext());
        }
        return b;
    }

    public static final boolean b() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        return d.a.b.a.b(aVar.getContext(), "android.permission.READ_SMS");
    }
}
