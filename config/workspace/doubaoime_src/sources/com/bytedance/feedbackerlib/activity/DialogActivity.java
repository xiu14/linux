package com.bytedance.feedbackerlib.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public class DialogActivity extends Activity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f4759f = 0;
    private TextView a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f4760c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f4761d;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.feedbackerlib.manager.F f4762e;

    @Override // android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.feedbacker_activity_dialog);
        this.a = (TextView) findViewById(C0838R.id.tv_title);
        this.b = (TextView) findViewById(C0838R.id.tv_content);
        this.f4760c = (TextView) findViewById(C0838R.id.tv_negative);
        this.f4761d = (TextView) findViewById(C0838R.id.tv_positive);
        this.f4762e = com.bytedance.feedbackerlib.manager.F.d();
        Intent intent = getIntent();
        if (intent == null || intent.getAction() == null) {
            return;
        }
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("action_show_hide_hide_float_window_dialog")) {
            this.a.setText(this.f4762e.f("hide_float_window_title"));
            this.b.setText(this.f4762e.f("hide_float_window_content"));
            this.f4760c.setText(this.f4762e.f("cancel"));
            this.f4761d.setText(this.f4762e.f("hide_float_window"));
            this.f4760c.setOnClickListener(new ViewOnClickListenerC0656a(this));
            this.f4761d.setOnClickListener(new ViewOnClickListenerC0657b(this));
        }
    }
}
