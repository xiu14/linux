package com.bytedance.android.input.popup;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends o {
    private View i;
    private TextView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private LinearLayout n;
    private LinearLayout o;
    private TextView p;
    private ImageButton q;
    private boolean r;
    private AlertPopupWindowType s;
    private boolean t;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Layout layout = i.this.m.getLayout();
                if ((layout != null ? layout.getLineCount() : i.m(i.this.m)) > 1) {
                    i.this.m.setGravity(8388627);
                } else {
                    i.this.m.setGravity(17);
                }
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public i(Context context, WindowId windowId, int i) {
        super(context, windowId, i);
        this.r = true;
        this.s = AlertPopupWindowType.NORMAL;
        this.t = false;
        k(context, C0838R.layout.ime_permission_setting_tip_confirm_layout);
    }

    private void D() {
        if (AlertPopupWindowType.TIP_CONFIRM_WIDTH_FULL != this.s) {
            r(Boolean.FALSE);
        } else {
            this.m.setVisibility(4);
            this.m.post(new a());
        }
    }

    private void k(Context context, int i) {
        if (context.getPackageName().equals(d.a.b.a.e())) {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            View E = aVar.E(context, i);
            this.i = E;
            setContentView(E);
        } else {
            View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
            this.i = inflate;
            setContentView(inflate);
        }
        this.o = (LinearLayout) this.i.findViewById(C0838R.id.ll_ver_buttons);
        this.n = (LinearLayout) this.i.findViewById(C0838R.id.ll_hor_buttons);
        this.j = (TextView) this.i.findViewById(C0838R.id.tv_alert_title);
        this.k = (TextView) this.i.findViewById(C0838R.id.tv_alert_left);
        this.l = (TextView) this.i.findViewById(C0838R.id.tv_alert_right);
        this.m = (TextView) this.i.findViewById(C0838R.id.tv_alert_content);
        this.p = (TextView) this.i.findViewById(C0838R.id.tv_alert_middle);
        ImageButton imageButton = (ImageButton) this.i.findViewById(C0838R.id.ll_alert_close);
        this.q = imageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.popup.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i iVar = i.this;
                    Objects.requireNonNull(iVar);
                    q.f().d(iVar.f());
                }
            });
        }
        if (!this.t) {
            AlertPopupWindowType alertPopupWindowType = AlertPopupWindowType.TIP_CONFIRM;
            AlertPopupWindowType alertPopupWindowType2 = this.s;
            if (alertPopupWindowType == alertPopupWindowType2 || AlertPopupWindowType.TIP_CONFIRM_WIDTH_FULL == alertPopupWindowType2) {
                this.j.setTypeface(null, 1);
            } else {
                this.j.setTypeface(null);
            }
        } else if (KeyboardJni.isSupportSystemFont()) {
            this.j.setTypeface(null);
            this.k.setTypeface(null);
            this.l.setTypeface(null);
        } else {
            AlertPopupWindowType alertPopupWindowType3 = AlertPopupWindowType.TIP_CONFIRM;
            AlertPopupWindowType alertPopupWindowType4 = this.s;
            if (alertPopupWindowType3 == alertPopupWindowType4 || AlertPopupWindowType.TIP_CONFIRM_WIDTH_FULL == alertPopupWindowType4) {
                this.j.setTypeface(null, 1);
            } else {
                this.j.setTypeface(null);
            }
        }
        if (this.s == AlertPopupWindowType.NORMAL) {
            this.l.setBackgroundResource(C0838R.drawable.bg_blue_corner_100);
            this.l.setTextColor(ContextCompat.getColor(context, C0838R.color.ime_color_white));
        }
        setBackgroundDrawable(null);
        setWidth(-1);
        setHeight(-2);
    }

    static int m(TextView textView) {
        int width;
        try {
            CharSequence text = textView.getText();
            if (text != null && (width = (textView.getWidth() - textView.getPaddingLeft()) - textView.getPaddingRight()) > 0) {
                return StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).build().getLineCount();
            }
            return -1;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public void A(String str) {
        this.l.setText(str);
    }

    public void B(int i) {
        this.j.setText(i);
    }

    public void C(String str) {
        this.j.setText(str);
    }

    public String n() {
        return this.m.getText().toString();
    }

    public void o(View.OnClickListener onClickListener) {
        this.p.setOnClickListener(onClickListener);
    }

    public void p(int i) {
        this.p.setText(i);
    }

    public void q(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void r(Boolean bool) {
        if (bool.booleanValue()) {
            this.m.setGravity(17);
        } else {
            this.m.setGravity(19);
        }
    }

    public void s(int i) {
        this.m.setText(i);
        D();
    }

    public void t(String str) {
        this.m.setText(str);
        D();
    }

    public void u(boolean z) {
        if (z) {
            this.k.setVisibility(8);
        } else {
            this.k.setVisibility(0);
        }
    }

    public void v(View.OnClickListener onClickListener) {
        this.k.setOnClickListener(onClickListener);
    }

    public void w(int i) {
        this.k.setText(i);
    }

    public void x(View.OnClickListener onClickListener) {
        this.p.setOnClickListener(onClickListener);
    }

    public void y(View.OnClickListener onClickListener) {
        this.l.setOnClickListener(onClickListener);
    }

    public void z(int i) {
        this.l.setText(i);
    }

    public i(Context context, WindowId windowId, int i, AlertPopupWindowType alertPopupWindowType) {
        super(context, windowId, i);
        this.r = true;
        this.s = AlertPopupWindowType.NORMAL;
        this.t = false;
        this.s = alertPopupWindowType;
        if (AlertPopupWindowType.GOT_IT_WIDTH_FULL == alertPopupWindowType) {
            k(context, C0838R.layout.ime_permission_setting_tip_get_it_width_full_layout);
        } else if (AlertPopupWindowType.TIP_CONFIRM_WIDTH_FULL == alertPopupWindowType) {
            k(context, C0838R.layout.ime_permission_setting_tip_confirm_width_full_layout);
        } else {
            k(context, C0838R.layout.ime_permission_setting_tip_confirm_layout);
        }
    }

    public i(Context context, WindowId windowId, int i, int i2) {
        super(context, windowId, i);
        this.r = true;
        this.s = AlertPopupWindowType.NORMAL;
        this.t = false;
        k(context, i2);
    }

    public i(Context context, WindowId windowId, int i, int i2, boolean z) {
        super(context, windowId, i);
        this.r = true;
        this.s = AlertPopupWindowType.NORMAL;
        this.t = false;
        this.t = z;
        k(context, i2);
    }
}
