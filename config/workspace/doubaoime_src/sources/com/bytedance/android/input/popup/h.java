package com.bytedance.android.input.popup;

import android.app.AlertDialog;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class h extends AlertDialog {
    private Context a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f2900c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f2901d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f2902e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f2903f;

    public static class b {
        private h a;
        private Context b;

        /* renamed from: c, reason: collision with root package name */
        private String f2904c;

        /* renamed from: d, reason: collision with root package name */
        private String f2905d;

        /* renamed from: e, reason: collision with root package name */
        private String f2906e;

        /* renamed from: f, reason: collision with root package name */
        private String f2907f;

        public b(Context context) {
            this.b = context;
        }

        public h a() {
            h hVar = new h(this.b, null);
            this.a = hVar;
            hVar.g(this.f2904c);
            this.a.b(this.f2905d);
            String str = this.f2906e;
            if (str != null) {
                this.a.c(str);
            }
            String str2 = this.f2907f;
            if (str2 != null) {
                this.a.e(str2);
            }
            return this.a;
        }

        public b b(String str) {
            this.f2905d = str;
            return this;
        }

        public b c(String str) {
            this.f2906e = str;
            return this;
        }

        public b d(String str) {
            this.f2907f = str;
            return this;
        }

        public b e(String str) {
            this.f2904c = str;
            return this;
        }
    }

    h(Context context, a aVar) {
        super(context, C0838R.style.act_dialog_style);
        this.a = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = displayMetrics.widthPixels;
        attributes.height = displayMetrics.heightPixels;
        getWindow().setAttributes(attributes);
        getWindow().setBackgroundDrawable(null);
        getWindow().setDimAmount(0.0f);
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        View E = aVar2.E(context, C0838R.layout.ime_permission_setting_alter_layout);
        this.b = E;
        this.f2900c = (TextView) this.b.findViewById(C0838R.id.tv_alert_title);
        this.f2901d = (TextView) this.b.findViewById(C0838R.id.tv_alert_left);
        this.f2902e = (TextView) this.b.findViewById(C0838R.id.tv_alert_right);
        this.f2903f = (TextView) this.b.findViewById(C0838R.id.tv_alert_content);
    }

    public void a() {
        this.f2901d.setVisibility(8);
    }

    public void b(String str) {
        this.f2903f.setText(str);
    }

    public void c(String str) {
        this.f2901d.setText(str);
    }

    public void d(View.OnClickListener onClickListener) {
        this.f2901d.setOnClickListener(onClickListener);
    }

    public void e(String str) {
        this.f2902e.setText(str);
    }

    public void f(View.OnClickListener onClickListener) {
        this.f2902e.setOnClickListener(onClickListener);
    }

    public void g(String str) {
        this.f2900c.setText(str);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        setContentView(this.b);
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        layoutParams.width = displayMetrics.widthPixels;
        layoutParams.height = displayMetrics.heightPixels;
    }
}
