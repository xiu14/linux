package com.bytedance.feedbackerlib.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.receiver.DynamicReceiver;
import com.bytedance.feedbackerlib.service.FloatWindowService;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import com.bytedance.feedbackerlib.view.CancledUndlineSpan;
import com.ss.android.larksso.c;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class LarkSSOLaunchTransitionActivity extends AppCompatActivity {
    private static final Handler o = new Handler(Looper.getMainLooper());
    private com.bytedance.feedbackerlib.manager.F a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f4775c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f4776d;

    /* renamed from: e, reason: collision with root package name */
    private ImageView f4777e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f4778f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f4779g;
    private TextView h;
    private LinearLayout i;
    private TextView j;
    private RelativeLayout k;
    private TextView l;
    private final F.b m = new b();
    private final Feedbacker.m n = new c();

    private enum SSOVerifyErrorCode {
        ERROR_STATE_CODE_VERIFY_FAILED("-1", "状态码校验失败，非当前SDK请求的响应"),
        ERROR_NOT_GET_VALID_VERIFY_CODE("-2", "没有获得有效的授权码"),
        ERROR_USER_CANCEL_VERIFY("-3", "用户取消授权"),
        ERROR_JUMP_TO_LARK_FAILED("-4", "跳转到Lark失败"),
        ERROR_VERIFY_FAILED("-5", "授权失败"),
        ERROR_REQUEST_PARAMS_INCORRECT("-6", "请求参数错误");


        @NonNull
        private final String mErrorCode;

        @NonNull
        private final String mErrorDescription;

        SSOVerifyErrorCode(@NonNull String str, @NonNull String str2) {
            this.mErrorCode = str;
            this.mErrorDescription = str2;
        }

        public String getErrorCode() {
            return this.mErrorCode;
        }

        @NonNull
        public String getErrorDescription() {
            return this.mErrorDescription;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return getErrorDescription();
        }
    }

    class a implements Runnable {

        /* renamed from: com.bytedance.feedbackerlib.activity.LarkSSOLaunchTransitionActivity$a$a, reason: collision with other inner class name */
        class RunnableC0223a implements Runnable {
            RunnableC0223a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FloatWindowService.r(e.a.a.a.a.B(e.a.a.a.a.M("ShowFloatWindowAfterSSO->")), LarkSSOLaunchTransitionActivity.this.getApplicationContext());
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LarkSSOLaunchTransitionActivity.this.finish();
            LarkSSOLaunchTransitionActivity.o.removeMessages(0);
            LarkSSOLaunchTransitionActivity.o.postDelayed(new RunnableC0223a(), 1000L);
        }
    }

    class b implements F.b {
        b() {
        }

        @Override // com.bytedance.feedbackerlib.manager.F.b
        public void a() {
            LarkSSOLaunchTransitionActivity.this.D();
        }
    }

    class c implements Feedbacker.m {
        c() {
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void a() {
            if (LarkSSOLaunchTransitionActivity.this.isDestroyed() || LarkSSOLaunchTransitionActivity.this.isFinishing()) {
                return;
            }
            LarkSSOLaunchTransitionActivity.this.finish();
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void b(@NonNull String str) {
        }

        @Override // com.bytedance.feedbackerlib.Feedbacker.m
        public void c() {
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LarkSSOLaunchTransitionActivity.this.f4778f.getVisibility() != 0) {
                LarkSSOLaunchTransitionActivity.this.f4778f.setText(LarkSSOLaunchTransitionActivity.this.a.f("start_sso"));
                LarkSSOLaunchTransitionActivity.this.f4778f.setVisibility(0);
                LarkSSOLaunchTransitionActivity.this.f4778f.setEnabled(true);
                LarkSSOLaunchTransitionActivity.this.f4778f.setBackgroundDrawable(ContextCompat.getDrawable(LarkSSOLaunchTransitionActivity.this.getApplicationContext(), C0838R.drawable.background_sso_retry));
                LarkSSOLaunchTransitionActivity.this.E();
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        e(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            LarkSSOLaunchTransitionActivity.this.B(this.a, this.b);
        }
    }

    class f implements com.ss.android.larksso.b {
        final /* synthetic */ String a;

        f(String str) {
            this.a = str;
        }

        @Override // com.ss.android.larksso.b
        public void a(com.ss.android.larksso.a aVar) {
            com.bytedance.feedbackerlib.a.j0(this.a, "startSSOVerify.onSuccess invoked", new String[0]);
            LarkSSOLaunchTransitionActivity.o(LarkSSOLaunchTransitionActivity.this, aVar.a, this.a);
        }

        @Override // com.ss.android.larksso.b
        public void b(com.ss.android.larksso.a aVar) {
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("code: ");
            M.append(aVar.a);
            M.append(", codeVerifier: ");
            M.append(aVar.b);
            com.bytedance.feedbackerlib.a.j0(str, "startSSOVerify.onError invoked", M.toString());
            LarkSSOLaunchTransitionActivity.p(LarkSSOLaunchTransitionActivity.this, aVar.a, this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        Handler handler = o;
        handler.removeMessages(0);
        Message obtain = Message.obtain(handler, new a());
        obtain.what = 0;
        handler.sendMessageDelayed(obtain, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(boolean z, String str) {
        Signature[] signatureArr;
        String str2;
        String str3;
        String str4;
        com.bytedance.feedbackerlib.a.j0(str, "handleSSOVerify invoked", e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.s("logId=", str));
        Context applicationContext = getApplicationContext();
        PackageManager packageManager = applicationContext.getPackageManager();
        String str5 = null;
        if (packageManager != null) {
            try {
                int i = Build.VERSION.SDK_INT;
                PackageInfo packageInfo = i >= 28 ? packageManager.getPackageInfo(applicationContext.getPackageName(), 134217728) : packageManager.getPackageInfo(applicationContext.getPackageName(), 64);
                if (i >= 28) {
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo != null) {
                        signatureArr = signingInfo.getSigningCertificateHistory();
                    }
                } else {
                    signatureArr = packageInfo.signatures;
                }
                if (signatureArr != null && signatureArr.length > 0) {
                    str5 = com.bytedance.feedbackerlib.util.e.b(signatureArr[0]);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                com.bytedance.feedbackerlib.a.s("MD5Utils", "getPackageInfo failed!", e2);
            }
        }
        if (!TextUtils.isEmpty(str5)) {
            str5 = str5.toUpperCase();
        }
        String appId = Feedbacker.getAppId();
        String packageName = getPackageName();
        String str6 = Feedbacker.getDid() + "";
        String str7 = Feedbacker.getAid() + "";
        if (TextUtils.isEmpty(str5) || TextUtils.isEmpty(appId) || TextUtils.isEmpty(packageName) || TextUtils.isEmpty(str6) || TextUtils.isEmpty(str7)) {
            StringBuilder W = e.a.a.a.a.W("handleSSOVerify: appId: ", appId, ", signature: ", str5, ", packageName: ");
            e.a.a.a.a.M0(W, packageName, ", aid: ", str7, ", did: ");
            W.append(str6);
            com.bytedance.feedbackerlib.a.s("LarkSSOLaunchTransition", W.toString(), new RuntimeException());
            com.bytedance.feedbackerlib.a.j0(str, "sso args not complete", e.a.a.a.a.s("signatureMd5String=", str5), e.a.a.a.a.s("appId=", appId), e.a.a.a.a.s("packageName=", packageName), e.a.a.a.a.s("did=", str6), e.a.a.a.a.s("aid=", str7));
            o.postDelayed(new e(z, str), 2000L);
            com.bytedance.feedbackerlib.manager.z.a();
            return;
        }
        c.b bVar = new c.b();
        bVar.a = appId;
        bVar.b = "Feishu";
        bVar.f8330d = str6;
        bVar.f8331e = z;
        bVar.f8329c = this;
        if (TextUtils.isEmpty(str6)) {
            str2 = "appId=";
            SharedPreferences sharedPreferences = getSharedPreferences("ssoDeviceID", 0);
            str4 = sharedPreferences.getString("device_id", "");
            if (TextUtils.isEmpty(str4)) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                str4 = com.ss.android.larksso.c.f();
                StringBuilder sb = new StringBuilder();
                str3 = "signatureMd5String=";
                sb.append("build deviceID:");
                sb.append(str4);
                Log.i("LarkSSO", sb.toString());
                edit.putString("device_id", str4);
                edit.commit();
            } else {
                str3 = "signatureMd5String=";
            }
        } else {
            str2 = "appId=";
            str3 = "signatureMd5String=";
            str4 = str6;
        }
        bVar.f8330d = str4;
        StringBuilder W2 = e.a.a.a.a.W("start sso: appId: ", appId, ", server: ", "Feishu", ", packageId: ");
        e.a.a.a.a.M0(W2, packageName, ", signature: ", str5, ", did: ");
        W2.append(str6);
        W2.append(", aid: ");
        W2.append(str7);
        com.bytedance.feedbackerlib.a.R("LarkSSOLaunchTransition", W2.toString());
        com.bytedance.feedbackerlib.a.j0(str, "startSSOVerify", e.a.a.a.a.s(str3, str5), e.a.a.a.a.s(str2, appId), e.a.a.a.a.s("packageName=", packageName), e.a.a.a.a.s("did=", str6), e.a.a.a.a.s("aid=", str7));
        com.bytedance.feedbackerlib.manager.z.a();
        c.C0376c.a.n(bVar, new f(str));
        E();
    }

    public static void C(@Nullable Context context, boolean z, String str) {
        com.bytedance.feedbackerlib.a.j0(str, "launchForSSOVerify invoked", "context=" + context, e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.s("logId=", str));
        if (context == null || context.getApplicationContext() == null) {
            com.bytedance.feedbackerlib.a.j0(str, "args illegal", "context=" + context, e.a.a.a.a.A("forceH5=", z), e.a.a.a.a.s("logId=", str));
            return;
        }
        Intent intent = new Intent(context.getApplicationContext(), (Class<?>) LarkSSOLaunchTransitionActivity.class);
        intent.addFlags(268435456);
        intent.setAction("action_sso_verify");
        intent.putExtra("extra_force_h5", z);
        intent.putExtra("extra_log_id", str);
        try {
            context.getApplicationContext().startActivity(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f4775c.setText(this.a.f("guidepage_title_detail"));
        this.b.setText(this.a.f("guidepage_title"));
        this.h.setText(this.a.f("failed_message"));
        this.f4778f.setText(this.a.f("sso_retry"));
        this.f4779g.setText(this.a.f("sso_h5"));
        TextView textView = this.f4776d;
        String f2 = this.a.f("sdk_permission_check");
        String f3 = this.a.f("onCall_number");
        SpannableString spannableString = new SpannableString(f2);
        int indexOf = f2.indexOf(f3);
        int length = f3.length() + indexOf;
        if (indexOf >= 0 && length < f2.length()) {
            spannableString.setSpan(new L(this), indexOf, length, 33);
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#436ef6")), indexOf, length, 33);
            spannableString.setSpan(new CancledUndlineSpan(), indexOf, length, 33);
        }
        textView.setText(spannableString);
        this.f4776d.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (com.bytedance.feedbackerlib.util.b.a(getApplicationContext(), "com.ss.android.lark") || com.bytedance.feedbackerlib.util.b.a(getApplicationContext(), "com.ss.android.lark.debug") || com.bytedance.feedbackerlib.util.b.a(getApplicationContext(), "com.larksuite.suite.debug") || com.bytedance.feedbackerlib.util.b.a(getApplicationContext(), "com.larksuite.suite")) {
            com.bytedance.feedbackerlib.a.K0(this.f4779g, -2);
        }
    }

    private void handleIntent(@Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            c.C0376c.a.m(this, intent);
        } catch (Throwable unused) {
        }
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            return;
        }
        action.hashCode();
        if (!action.equals("action_clear_sso_state")) {
            if (action.equals("action_sso_verify")) {
                B(intent.getBooleanExtra("extra_force_h5", false), intent.getStringExtra("extra_log_id"));
            }
        } else {
            SharedPreferencesUtils.LONG_CACHE.LAST_SSO_TIMESTAMP.put(-1L);
            SharedPreferencesUtils.STRING_CACHE.SSO_EMAIL.put(null);
            com.bytedance.feedbackerlib.model.b.F().z();
            Toast.makeText(this, "认证已过期，重启应用可再次触发鉴权流程", 1).show();
            finish();
        }
    }

    static void l(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity) {
        Objects.requireNonNull(larkSSOLaunchTransitionActivity);
        if (Feedbacker.isFeedbackCommonInfoSetted()) {
            return;
        }
        String f2 = larkSSOLaunchTransitionActivity.a.f("sso_network_request_failed");
        if (!com.bytedance.android.input.k.b.a.G(f2, "no translation")) {
            f2 = "应用异常，请重新启动应用";
        }
        Toast.makeText(larkSSOLaunchTransitionActivity, f2, 1).show();
    }

    static void m(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity, String str) {
        Objects.requireNonNull(larkSSOLaunchTransitionActivity);
        if (TextUtils.isEmpty(str)) {
            com.bytedance.feedbackerlib.a.R("LarkSSOLaunchTransition", "want to show toast, but: content: " + str + ", duringTime: 2000, animTime: 150");
            return;
        }
        larkSSOLaunchTransitionActivity.k.clearAnimation();
        larkSSOLaunchTransitionActivity.l.setText(str);
        larkSSOLaunchTransitionActivity.k.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new H(larkSSOLaunchTransitionActivity, 150L, 2000L));
        larkSSOLaunchTransitionActivity.k.startAnimation(alphaAnimation);
    }

    static void o(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity, String str, String str2) {
        Objects.requireNonNull(larkSSOLaunchTransitionActivity);
        com.bytedance.feedbackerlib.a.j0(str2, "handleSSOSuccess invoked", e.a.a.a.a.s("code=", str));
        com.bytedance.feedbackerlib.a.R("LarkSSOLaunchTransition", "handleSSOSuccess, code: " + str);
        larkSSOLaunchTransitionActivity.f4778f.setVisibility(0);
        larkSSOLaunchTransitionActivity.i.setVisibility(8);
        larkSSOLaunchTransitionActivity.f4778f.setEnabled(false);
        larkSSOLaunchTransitionActivity.f4778f.setBackgroundDrawable(ContextCompat.getDrawable(larkSSOLaunchTransitionActivity.getApplicationContext(), C0838R.drawable.background_sso_retry_unavailable));
        String f2 = larkSSOLaunchTransitionActivity.a.f("key_authorizing");
        if (com.bytedance.android.input.k.b.a.G(f2, "no Translation")) {
            f2 = "授权中...";
        }
        larkSSOLaunchTransitionActivity.f4778f.setText(f2);
        com.bytedance.feedbackerlib.a.K0(larkSSOLaunchTransitionActivity.f4779g, 0);
        larkSSOLaunchTransitionActivity.h.setVisibility(4);
        com.bytedance.feedbackerlib.a.j0(str2, "start request access credentials from server", new String[0]);
        com.bytedance.feedbackerlib.model.b.F().N(str, str2, new G(larkSSOLaunchTransitionActivity, str2, str));
    }

    static void p(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity, String str, String str2) {
        Objects.requireNonNull(larkSSOLaunchTransitionActivity);
        com.bytedance.feedbackerlib.manager.z.a();
        com.bytedance.feedbackerlib.a.j0(str2, "handleSSOFailed invoked", e.a.a.a.a.s("code=", str), e.a.a.a.a.s("logId=", str2));
        com.bytedance.feedbackerlib.a.s("LarkSSOLaunchTransition", e.a.a.a.a.s("startSSOVerify failed, error code: ", str), new RuntimeException());
        Context applicationContext = larkSSOLaunchTransitionActivity.getApplicationContext();
        int i = DynamicReceiver.f4962c;
        if (applicationContext != null && applicationContext.getApplicationContext() != null) {
            Intent intent = new Intent("action_lark_sso_failed");
            intent.setPackage(applicationContext.getPackageName());
            applicationContext.sendBroadcast(intent);
        }
        larkSSOLaunchTransitionActivity.f4778f.setVisibility(0);
        larkSSOLaunchTransitionActivity.i.setVisibility(8);
        larkSSOLaunchTransitionActivity.f4778f.setBackgroundDrawable(larkSSOLaunchTransitionActivity.getResources().getDrawable(C0838R.drawable.background_sso_retry));
        larkSSOLaunchTransitionActivity.f4778f.setEnabled(true);
        larkSSOLaunchTransitionActivity.f4778f.setText(larkSSOLaunchTransitionActivity.a.f("sso_retry"));
        larkSSOLaunchTransitionActivity.E();
        if (SSOVerifyErrorCode.ERROR_USER_CANCEL_VERIFY.getErrorCode().equals(str)) {
            Toast.makeText(larkSSOLaunchTransitionActivity, larkSSOLaunchTransitionActivity.a.f("toast_cancel_sso_verify"), 0).show();
        } else {
            long j = FloatWindowService.j();
            long currentTimeMillis = j != 0 ? System.currentTimeMillis() - j : 0L;
            com.bytedance.framwork.core.sdkmonitor.f b2 = com.bytedance.feedbackerlib.manager.z.b();
            if (b2 != null) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("sso_log_id", str2);
                    jSONObject.put("code", str);
                    jSONObject2.put("duration", currentTimeMillis + "");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                b2.T("sso_failed", 0, new JSONObject(), jSONObject2, jSONObject);
                b2.y();
            }
        }
        if (com.bytedance.feedbackerlib.model.j.a.a() > 0) {
            larkSSOLaunchTransitionActivity.h.setText(com.bytedance.feedbackerlib.model.j.a.a() + " " + larkSSOLaunchTransitionActivity.a.f("failed_message"));
            com.bytedance.feedbackerlib.model.j.a.c(0);
        }
        larkSSOLaunchTransitionActivity.h.setVisibility(0);
        com.bytedance.feedbackerlib.manager.z.a();
    }

    static void s(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity, long j) {
        Objects.requireNonNull(larkSSOLaunchTransitionActivity);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j);
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new I(larkSSOLaunchTransitionActivity));
        larkSSOLaunchTransitionActivity.k.clearAnimation();
        larkSSOLaunchTransitionActivity.k.startAnimation(alphaAnimation);
    }

    static boolean y(LarkSSOLaunchTransitionActivity larkSSOLaunchTransitionActivity) {
        com.bytedance.feedbackerlib.model.j.e J2;
        Objects.requireNonNull(larkSSOLaunchTransitionActivity);
        if (TextUtils.isEmpty(Feedbacker.getUserAccessToken()) || (J2 = com.bytedance.feedbackerlib.model.b.F().J()) == null || TextUtils.isEmpty(J2.b)) {
            return false;
        }
        larkSSOLaunchTransitionActivity.f4778f.setText(larkSSOLaunchTransitionActivity.a.f("authority_success"));
        larkSSOLaunchTransitionActivity.f4778f.setEnabled(false);
        larkSSOLaunchTransitionActivity.f4778f.setVisibility(0);
        larkSSOLaunchTransitionActivity.f4778f.setBackgroundDrawable(ContextCompat.getDrawable(larkSSOLaunchTransitionActivity.getApplicationContext(), C0838R.drawable.background_sso_retry_unavailable));
        com.bytedance.feedbackerlib.a.K0(larkSSOLaunchTransitionActivity.f4779g, 0);
        Toast.makeText(larkSSOLaunchTransitionActivity, larkSSOLaunchTransitionActivity.a.f("sso_verify_success"), 1).show();
        larkSSOLaunchTransitionActivity.A();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        c.C0376c.a.m(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.activity_larksso_launch_transition);
        Feedbacker.init(getApplication(), false);
        this.b = (TextView) findViewById(C0838R.id.tv_internal_staff_check);
        this.f4775c = (TextView) findViewById(C0838R.id.tv_internal_check_description);
        this.f4776d = (TextView) findViewById(C0838R.id.tv_question_prompt);
        this.f4777e = (ImageView) findViewById(C0838R.id.iv_host_icon);
        this.f4778f = (TextView) findViewById(C0838R.id.tv_sso_retry);
        this.h = (TextView) findViewById(C0838R.id.tv_failed_message);
        this.f4779g = (TextView) findViewById(C0838R.id.tv_sso_h5);
        this.k = (RelativeLayout) findViewById(C0838R.id.no_lark_toast_container);
        this.l = (TextView) findViewById(C0838R.id.tv_no_lark_toast);
        this.i = (LinearLayout) findViewById(C0838R.id.retry_ll);
        this.j = (TextView) findViewById(C0838R.id.retrying_tx);
        this.f4778f.setOnClickListener(new J(this));
        this.f4779g.setOnClickListener(new K(this));
        com.bytedance.feedbackerlib.manager.F d2 = com.bytedance.feedbackerlib.manager.F.d();
        this.a = d2;
        d2.j(this.m);
        D();
        Drawable loadIcon = getApplicationInfo().loadIcon(getPackageManager());
        if (loadIcon != null) {
            this.f4777e.setImageDrawable(loadIcon);
        }
        if (bundle == null) {
            handleIntent(getIntent());
        }
        Feedbacker.registerLarkSSOCallback(this.n);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        FloatWindowService.t(false);
        this.a.k(this.m);
        Feedbacker.unregisterLarkSSOCallback(this.n);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f4778f.setVisibility(0);
        Handler handler = o;
        handler.removeMessages(1);
        handler.removeMessages(2);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        o.postDelayed(new d(), 2500L);
    }
}
