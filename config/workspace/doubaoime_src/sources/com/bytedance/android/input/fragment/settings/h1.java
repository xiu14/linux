package com.bytedance.android.input.fragment.settings;

import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.popup.WindowId;
import java.util.Objects;

/* loaded from: classes.dex */
final class h1 extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
    public static final h1 a = new h1();

    h1() {
        super(0);
    }

    @Override // kotlin.s.b.a
    public kotlin.o invoke() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (!d.a.b.a.b(aVar.getContext(), "android.permission.READ_CONTACTS")) {
            if (aVar.u().getBoolean("read_contacts_system_pop_have_shown", false)) {
                com.bytedance.android.input.popup.q f2 = com.bytedance.android.input.popup.q.f();
                final com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(aVar.getContext(), WindowId.CONFIRM_READ_CONTACTS_PERMISSION, 0);
                iVar.s(C0838R.string.contacts_permission_tip);
                iVar.B(C0838R.string.contacts_permission_tip_title);
                iVar.w(C0838R.string.recorder_tip_left_btn);
                iVar.z(C0838R.string.recorder_tip_right_btn);
                iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.l
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_READ_CONTACTS_PERMISSION);
                    }
                });
                iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.input.fragment.settings.k
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        com.bytedance.android.input.popup.i iVar2 = com.bytedance.android.input.popup.i.this;
                        kotlin.s.c.l.f(iVar2, "$this_apply");
                        String string = iVar2.c().getString(C0838R.string.enable_update_contacts);
                        kotlin.s.c.l.e(string, "context.getString(R.string.enable_update_contacts)");
                        SettingsConfigNext.l(string, Boolean.TRUE);
                        com.bytedance.android.input.popup.q.f().d(WindowId.CONFIRM_READ_CONTACTS_PERMISSION);
                        IAppGlobals.a aVar2 = IAppGlobals.a;
                        Objects.requireNonNull(aVar2);
                        com.bytedance.android.input.common_biz.permission.i.b(aVar2.getContext());
                    }
                });
                f2.m(iVar, 0);
            } else {
                d.a.b.a.m(aVar.getContext(), "android.permission.READ_CONTACTS", 101, "该功能需开启你的通讯录权限", "用于在键盘输入与语音转文字输入时提升人名输入效率与准确率");
            }
        }
        return kotlin.o.a;
    }
}
