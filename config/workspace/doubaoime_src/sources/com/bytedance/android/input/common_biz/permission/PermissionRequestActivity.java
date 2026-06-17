package com.bytedance.android.input.common_biz.permission;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common_biz.permission.spi.IPermissionConfig;
import com.bytedance.android.input.framework.activity.BaseImeActivity;
import java.util.ArrayList;
import java.util.Objects;

@TargetApi(23)
/* loaded from: classes.dex */
public class PermissionRequestActivity extends BaseImeActivity {
    public static final /* synthetic */ int b = 0;
    private View a;

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.android.input.framework.activity.BaseImeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("key_bundle");
        int i = bundleExtra.getInt("request_type", 0);
        boolean z = bundleExtra.getBoolean("is_need_delay", false);
        if (i == 3) {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            View E = aVar.E(this, C0838R.layout.ime_permission_setting_tip_confirm_layout);
            this.a = E;
            setContentView(E);
            if (z) {
                final LinearLayout linearLayout = (LinearLayout) this.a.findViewById(C0838R.id.ll_alert_content);
                linearLayout.setVisibility(4);
                linearLayout.postDelayed(new Runnable() { // from class: com.bytedance.android.input.common_biz.permission.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        LinearLayout linearLayout2 = linearLayout;
                        int i2 = PermissionRequestActivity.b;
                        linearLayout2.setVisibility(0);
                    }
                }, 500L);
            }
            TextView textView = (TextView) this.a.findViewById(C0838R.id.tv_alert_right);
            textView.setBackgroundResource(C0838R.drawable.bg_blue_corner_100);
            textView.setTextColor(ContextCompat.getColor(this, C0838R.color.ime_color_white));
        } else {
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            View E2 = aVar2.E(this, C0838R.layout.im_activity_permission_request);
            this.a = E2;
            setContentView(E2);
            View findViewById = this.a.findViewById(C0838R.id.ime_permission_top_view);
            if (findViewById != null) {
                com.bytedance.common_biz.ui.utils.a.a(findViewById, 0);
            }
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setDimAmount(0.0f);
        overridePendingTransition(0, 0);
        int i2 = bundleExtra.getInt("request_type", 0);
        String string = bundleExtra.getString("tip_title");
        String string2 = bundleExtra.getString("tip_desc");
        if (i2 == 3) {
            TextView textView2 = (TextView) this.a.findViewById(C0838R.id.tv_alert_title);
            TextView textView3 = (TextView) this.a.findViewById(C0838R.id.tv_alert_content);
            TextView textView4 = (TextView) this.a.findViewById(C0838R.id.tv_alert_left);
            TextView textView5 = (TextView) this.a.findViewById(C0838R.id.tv_alert_right);
            String string3 = bundleExtra.getString("left_btn_text");
            String string4 = bundleExtra.getString("right_btn_text");
            if (!TextUtils.isEmpty(string)) {
                textView2.setText(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                textView3.setText(string2);
            }
            if (!TextUtils.isEmpty(string3)) {
                textView4.setText(string3);
            }
            if (!TextUtils.isEmpty(string4)) {
                textView5.setText(string4);
            }
            textView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.common_biz.permission.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionRequestActivity.this.finish();
                }
            });
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.common_biz.permission.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PermissionRequestActivity permissionRequestActivity = PermissionRequestActivity.this;
                    Objects.requireNonNull(permissionRequestActivity);
                    IAppGlobals.a aVar3 = IAppGlobals.a;
                    Objects.requireNonNull(aVar3);
                    i.b(aVar3.getContext());
                    permissionRequestActivity.finish();
                }
            });
        } else {
            TextView textView6 = (TextView) this.a.findViewById(C0838R.id.ime_permission_title_tv);
            TextView textView7 = (TextView) this.a.findViewById(C0838R.id.ime_permission_desc_tv);
            if (!TextUtils.isEmpty(string)) {
                textView6.setText(string);
            }
            if (!TextUtils.isEmpty(string2)) {
                textView7.setText(string2);
            }
        }
        int i3 = bundleExtra.getInt("permission_code");
        if (i3 < 0) {
            finish();
            return;
        }
        if (i2 == 1) {
            String string5 = bundleExtra.getString("request_permission");
            if (TextUtils.isEmpty(string5)) {
                finish();
                return;
            } else {
                if (checkSelfPermission(string5) != 0) {
                    try {
                        requestPermissions(new String[]{string5}, i3);
                        return;
                    } catch (Exception unused) {
                        finish();
                        return;
                    }
                }
                return;
            }
        }
        if (i2 != 2) {
            if (i2 != 3) {
                finish();
                return;
            }
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("request_permissions");
        if (stringArrayList == null || stringArrayList.size() <= 0) {
            finish();
            return;
        }
        if (stringArrayList.size() == 0) {
            finish();
            return;
        }
        int size = stringArrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (checkSelfPermission(stringArrayList.get(size)) == 0) {
                stringArrayList.remove(size);
            }
        }
        if (stringArrayList.size() == 0) {
            finish();
            return;
        }
        try {
            requestPermissions((String[]) stringArrayList.toArray(new String[stringArrayList.size()]), i3);
        } catch (Exception unused2) {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        aVar.x("PermissionRequestActivity", "onRequestPermissionsResult: " + i);
        Objects.requireNonNull(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append("IAppGlobals process name : ");
        Objects.requireNonNull(aVar);
        sb.append(aVar.f());
        aVar.x("PermissionRequestActivity", sb.toString());
        int i2 = 0;
        if (i == 10) {
            while (true) {
                if (i2 >= iArr.length) {
                    break;
                }
                if (!TextUtils.equals(strArr[i2], "android.permission.RECORD_AUDIO")) {
                    i2++;
                } else if (iArr[i2] == -1) {
                    IAppGlobals.a aVar2 = IAppGlobals.a;
                    Objects.requireNonNull(aVar2);
                    aVar2.x("PermissionRequestActivity", "onRequestPermissionsResult: RECORD_AUDIO denied");
                    Objects.requireNonNull(aVar2);
                    aVar2.o().edit().putBoolean("record_audio_system_pop_have_show", true).apply();
                }
            }
        } else if (i == 100) {
            while (true) {
                if (i2 >= iArr.length) {
                    break;
                }
                if (TextUtils.equals(strArr[i2], "android.permission.READ_SMS")) {
                    IAppGlobals.a aVar3 = IAppGlobals.a;
                    Objects.requireNonNull(aVar3);
                    aVar3.x("PermissionRequestActivity", "read sms permission result: " + iArr[i2]);
                    if (iArr[i2] == -1) {
                        Objects.requireNonNull(aVar3);
                        aVar3.x("PermissionRequestActivity", "onRequestPermissionsResult: READ_SMS denied");
                        Objects.requireNonNull(aVar3);
                        aVar3.u().edit().putBoolean("read_sms_system_pop_have_shown", true).apply();
                        IPermissionConfig.a aVar4 = IPermissionConfig.a;
                        Objects.requireNonNull(aVar4);
                        aVar4.a("read_sms_system_pop_have_shown", true);
                    }
                    if (iArr[i2] == 0) {
                        IPermissionConfig.a aVar5 = IPermissionConfig.a;
                        Objects.requireNonNull(aVar5);
                        aVar5.a("sms_verification_enabled", true);
                    }
                } else {
                    i2++;
                }
            }
        } else if (i == 101) {
            while (true) {
                if (i2 >= iArr.length) {
                    break;
                }
                if (TextUtils.equals(strArr[i2], "android.permission.READ_CONTACTS")) {
                    IAppGlobals.a aVar6 = IAppGlobals.a;
                    Objects.requireNonNull(aVar6);
                    aVar6.x("PermissionRequestActivity", "read contacts permission result: " + iArr[i2]);
                    if (iArr[i2] == -1) {
                        Objects.requireNonNull(aVar6);
                        aVar6.x("PermissionRequestActivity", "onRequestPermissionsResult: READ_CONTACTS denied");
                        Objects.requireNonNull(aVar6);
                        aVar6.u().edit().putBoolean("read_contacts_system_pop_have_shown", true).apply();
                        IPermissionConfig.a aVar7 = IPermissionConfig.a;
                        Objects.requireNonNull(aVar7);
                        aVar7.a("read_contacts_system_pop_have_shown", true);
                    }
                    if (iArr[i2] == 0) {
                        IPermissionConfig.a aVar8 = IPermissionConfig.a;
                        Objects.requireNonNull(aVar8);
                        aVar8.a("enable_update_contacts", true);
                    }
                } else {
                    i2++;
                }
            }
        }
        finish();
    }
}
