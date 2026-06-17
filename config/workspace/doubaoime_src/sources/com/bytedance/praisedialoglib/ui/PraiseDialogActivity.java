package com.bytedance.praisedialoglib.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;

/* loaded from: classes.dex */
public class PraiseDialogActivity extends Activity {
    private ImageView a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f5535c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f5536d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f5537e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f5538f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f5539g;
    private String h = "";
    private boolean i = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0838R.layout.praise_dialog);
        this.f5539g = (RelativeLayout) findViewById(C0838R.id.dialog_container);
        this.f5536d = (TextView) findViewById(C0838R.id.market_feedback_dialog_title);
        this.f5537e = (TextView) findViewById(C0838R.id.market_feedback_dialog_tips);
        this.b = (TextView) findViewById(C0838R.id.tv_market_feedback_dialog_complaint);
        this.f5535c = (TextView) findViewById(C0838R.id.tv_market_feedback_dialog_praise);
        this.a = (ImageView) findViewById(C0838R.id.market_feedback_dialog_close);
        this.f5538f = (ImageView) findViewById(C0838R.id.market_feedback_dialog_center);
        this.a.setOnClickListener(new a(this));
        this.f5535c.setOnClickListener(new b(this));
        this.b.setOnClickListener(new c(this));
        Intent intent = getIntent();
        this.h = intent.getStringExtra("from");
        if (intent.getIntExtra("back_ground_res", -1) != -1) {
            this.f5539g.setBackgroundResource(intent.getIntExtra("back_ground_res", -1));
        }
        if (intent.getIntExtra("middle_image_res", -1) != -1) {
            this.f5538f.setBackgroundResource(intent.getIntExtra("middle_image_res", -1));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("main_title_text"))) {
            this.f5536d.setText(intent.getStringExtra("main_title_text"));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("main_title_text_color"))) {
            this.f5536d.setTextColor(Color.parseColor(intent.getStringExtra("main_title_text_color")));
        }
        if (intent.getIntExtra("main_title_text_size", -1) != -1) {
            this.f5536d.setTextSize(intent.getIntExtra("main_title_text_size", -1));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("second_title_text"))) {
            this.f5537e.setText(intent.getStringExtra("second_title_text"));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("second_title_text_color"))) {
            this.f5537e.setTextColor(Color.parseColor(intent.getStringExtra("second_title_text_color")));
        }
        if (intent.getIntExtra("second_tile_text_size", -1) != -1) {
            this.f5537e.setTextSize(intent.getIntExtra("second_tile_text_size", -1));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("negative_btn_text"))) {
            this.b.setText(intent.getStringExtra("negative_btn_text"));
        }
        if (intent.getIntExtra("negative_btn_text_size", -1) != -1) {
            this.b.setTextSize(intent.getIntExtra("negative_btn_text_size", -1));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("negative_btn_text_color"))) {
            this.b.setTextColor(Color.parseColor(intent.getStringExtra("negative_btn_text_color")));
        }
        if (intent.getIntExtra("negative_btn_text_bg", -1) != -1) {
            this.b.setBackgroundResource(intent.getIntExtra("negative_btn_text_bg", -1));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("positive_btn_text"))) {
            this.f5535c.setText(intent.getStringExtra("positive_btn_text"));
        }
        if (intent.getIntExtra("positive_btn_text_size", -1) != -1) {
            this.f5535c.setTextSize(intent.getIntExtra("positive_btn_text_size", -1));
        }
        if (!TextUtils.isEmpty(intent.getStringExtra("positive_btn_text_color"))) {
            this.f5535c.setTextColor(Color.parseColor(intent.getStringExtra("positive_btn_text_color")));
        }
        if (intent.getIntExtra("positive_btn_text_bg", -1) != -1) {
            this.f5535c.setBackgroundResource(intent.getIntExtra("positive_btn_text_bg", -1));
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.i) {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_force_close", this.h);
        } else {
            com.bytedance.feedbackerlib.a.q0("evaluate_pop_close", this.h);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        com.bytedance.feedbackerlib.a.q0("evaluate_pop_show", this.h);
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
