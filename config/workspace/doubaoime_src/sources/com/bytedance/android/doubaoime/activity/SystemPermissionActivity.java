package com.bytedance.android.doubaoime.activity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.framework.activity.BaseImeActivity;
import com.bytedance.common_biz.ui.widget.ImeListItemView;
import com.bytedance.common_biz.ui.widget.ImeTitleBar;

/* loaded from: classes.dex */
public final class SystemPermissionActivity extends BaseImeActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1944d = 0;
    private ImeListItemView a;
    private ImeListItemView b;

    /* renamed from: c, reason: collision with root package name */
    private ImeListItemView f1945c;

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        getWindow().setBackgroundDrawableResource(C0838R.color.transparent);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(C0838R.layout.fragment_system_permission);
        ImeTitleBar imeTitleBar = (ImeTitleBar) findViewById(C0838R.id.settings_title_bar);
        if (imeTitleBar != null) {
            com.bytedance.common_biz.ui.utils.a.a(imeTitleBar, 0);
        }
        View findViewById = findViewById(C0838R.id.read_sms_permission);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.read_sms_permission)");
        this.a = (ImeListItemView) findViewById;
        View findViewById2 = findViewById(C0838R.id.contacts_permission);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.contacts_permission)");
        this.b = (ImeListItemView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.microphone_permission);
        kotlin.s.c.l.e(findViewById3, "findViewById(R.id.microphone_permission)");
        this.f1945c = (ImeListItemView) findViewById3;
        ImeListItemView imeListItemView = this.a;
        if (imeListItemView == null) {
            kotlin.s.c.l.l("readSmsPermission");
            throw null;
        }
        imeListItemView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.G
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SystemPermissionActivity systemPermissionActivity = SystemPermissionActivity.this;
                int i = SystemPermissionActivity.f1944d;
                kotlin.s.c.l.f(systemPermissionActivity, "this$0");
                com.bytedance.android.input.common_biz.permission.i.b(systemPermissionActivity);
            }
        });
        ImeListItemView imeListItemView2 = this.b;
        if (imeListItemView2 == null) {
            kotlin.s.c.l.l("contactsPermission");
            throw null;
        }
        imeListItemView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.F
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SystemPermissionActivity systemPermissionActivity = SystemPermissionActivity.this;
                int i = SystemPermissionActivity.f1944d;
                kotlin.s.c.l.f(systemPermissionActivity, "this$0");
                com.bytedance.android.input.common_biz.permission.i.b(systemPermissionActivity);
            }
        });
        ImeListItemView imeListItemView3 = this.f1945c;
        if (imeListItemView3 != null) {
            imeListItemView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.activity.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SystemPermissionActivity systemPermissionActivity = SystemPermissionActivity.this;
                    int i = SystemPermissionActivity.f1944d;
                    kotlin.s.c.l.f(systemPermissionActivity, "this$0");
                    com.bytedance.android.input.common_biz.permission.i.b(systemPermissionActivity);
                }
            });
        } else {
            kotlin.s.c.l.l("microphonePermission");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        boolean a = com.bytedance.android.input.common_biz.permission.i.a(this, "android.permission.READ_SMS");
        boolean a2 = com.bytedance.android.input.common_biz.permission.i.a(this, "android.permission.READ_CONTACTS");
        boolean a3 = com.bytedance.android.input.common_biz.permission.i.a(this, "android.permission.RECORD_AUDIO");
        ImeListItemView imeListItemView = this.a;
        if (imeListItemView == null) {
            kotlin.s.c.l.l("readSmsPermission");
            throw null;
        }
        Resources resources = imeListItemView.getResources();
        int i = C0838R.color.ime_color_4f84ff;
        imeListItemView.setTrailingTextColor(resources.getColor(a ? C0838R.color.ime_color_4f84ff : C0838R.color.ime_color_common_text_73_color, null));
        imeListItemView.setTrailingText(a ? "已开启" : "去设置");
        ImeListItemView imeListItemView2 = this.b;
        if (imeListItemView2 == null) {
            kotlin.s.c.l.l("contactsPermission");
            throw null;
        }
        imeListItemView2.setTrailingTextColor(imeListItemView2.getResources().getColor(a2 ? C0838R.color.ime_color_4f84ff : C0838R.color.ime_color_common_text_73_color, null));
        imeListItemView2.setTrailingText(a2 ? "已开启" : "去设置");
        ImeListItemView imeListItemView3 = this.f1945c;
        if (imeListItemView3 == null) {
            kotlin.s.c.l.l("microphonePermission");
            throw null;
        }
        Resources resources2 = imeListItemView3.getResources();
        if (!a3) {
            i = C0838R.color.ime_color_common_text_73_color;
        }
        imeListItemView3.setTrailingTextColor(resources2.getColor(i, null));
        imeListItemView3.setTrailingText(a3 ? "已开启" : "去设置");
    }
}
