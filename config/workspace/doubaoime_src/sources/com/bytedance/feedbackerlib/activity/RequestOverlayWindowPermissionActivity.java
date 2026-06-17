package com.bytedance.feedbackerlib.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public class RequestOverlayWindowPermissionActivity extends Activity {
    private static boolean h = false;
    public static final /* synthetic */ int i = 0;
    private State a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f4781c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f4782d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f4783e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bytedance.feedbackerlib.manager.F f4784f = com.bytedance.feedbackerlib.manager.F.d();

    /* renamed from: g, reason: collision with root package name */
    private F.b f4785g = new a();

    public enum State {
        ASK,
        CONFIRM
    }

    class a implements F.b {
        a() {
        }

        @Override // com.bytedance.feedbackerlib.manager.F.b
        public void a() {
            RequestOverlayWindowPermissionActivity.this.e();
        }
    }

    static void c(RequestOverlayWindowPermissionActivity requestOverlayWindowPermissionActivity) {
        Objects.requireNonNull(requestOverlayWindowPermissionActivity);
        requestOverlayWindowPermissionActivity.a = State.CONFIRM;
        requestOverlayWindowPermissionActivity.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        State state = this.a;
        if (state == State.ASK) {
            this.b.setText(this.f4784f.f("Floating-window-permission-application"));
            this.f4781c.setText(this.f4784f.f("Pop-ups1"));
            this.f4782d.setText(this.f4784f.f("cancel"));
        } else if (state == State.CONFIRM) {
            this.b.setText(this.f4784f.f("Permission-not-granted"));
            this.f4781c.setText(this.f4784f.f("Pop-ups2-1") + "\n" + this.f4784f.f("Pop-ups2-2"));
            this.f4782d.setText(this.f4784f.f("confirm-cancel"));
        }
        this.f4783e.setText(this.f4784f.f("Open"));
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.dialog_permission_request);
        String stringExtra = getIntent().getStringExtra("extra_log_id");
        com.bytedance.feedbackerlib.a.g0(stringExtra, "RequestOverlayWindowPermissionActivity onCreate invoked", new String[0]);
        com.bytedance.feedbackerlib.a.R("RequestOverlayWindowPermissionActivity show", "onCreate invoked");
        if (h || SharedPreferencesUtils.BOOLEAN_CACHE.HAS_DENIED_OVERLAY_PERMISSION.get(false)) {
            finish();
            return;
        }
        com.bytedance.feedbackerlib.a.R("RequestOverlayWindowPermissionActivity show", "not finish yet");
        com.bytedance.feedbackerlib.a.g0(stringExtra, "RequestOverlayWindowPermissionActivity not finish yet", new String[0]);
        h = true;
        State state = (State) getIntent().getSerializableExtra("extra_state");
        this.a = state;
        if (state == null) {
            this.a = State.ASK;
        }
        this.b = (TextView) findViewById(C0838R.id.tv_title);
        this.f4781c = (TextView) findViewById(C0838R.id.tv_content);
        this.f4782d = (TextView) findViewById(C0838R.id.tv_cancel);
        this.f4783e = (TextView) findViewById(C0838R.id.tv_open);
        this.f4782d.setOnClickListener(new M(this));
        this.f4783e.setOnClickListener(new N(this));
        this.f4784f.j(this.f4785g);
        e();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f4784f.k(this.f4785g);
        com.bytedance.feedbackerlib.a.R("RequestOverlayWindowPermissionActivity show", "onDestroy invoked");
    }
}
