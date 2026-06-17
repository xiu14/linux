package com.obric.oui.dialog.alert;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class ButtonStyleController implements g {
    private OButton a;
    private OButton b;

    /* renamed from: c, reason: collision with root package name */
    private OButton f7705c;

    /* renamed from: d, reason: collision with root package name */
    private com.obric.oui.dialog.alert.b f7706d;

    /* renamed from: e, reason: collision with root package name */
    private View f7707e;

    /* renamed from: f, reason: collision with root package name */
    private FrameLayout f7708f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f7709g;
    private final int h;

    public enum TextColorType {
        TextReverse,
        TextReverse2,
        Negative
    }

    static final class a implements View.OnClickListener {
        final /* synthetic */ DialogInterface.OnClickListener b;

        a(CharSequence charSequence, TextColorType textColorType, DialogInterface.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(ButtonStyleController.this.f7706d, -2);
            }
            ButtonStyleController.d(ButtonStyleController.this);
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ DialogInterface.OnClickListener b;

        b(CharSequence charSequence, TextColorType textColorType, DialogInterface.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(ButtonStyleController.this.f7706d, -3);
            }
            ButtonStyleController.d(ButtonStyleController.this);
        }
    }

    static final class c implements View.OnClickListener {
        final /* synthetic */ DialogInterface.OnClickListener b;

        c(CharSequence charSequence, boolean z, TextColorType textColorType, DialogInterface.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            DialogInterface.OnClickListener onClickListener = this.b;
            if (onClickListener != null) {
                onClickListener.onClick(ButtonStyleController.this.f7706d, -1);
            }
            ButtonStyleController.d(ButtonStyleController.this);
        }
    }

    public ButtonStyleController(Context context, int i) {
        l.f(context, "context");
        this.f7709g = context;
        this.h = i;
    }

    public static final void d(ButtonStyleController buttonStyleController) {
        com.obric.oui.dialog.alert.b bVar;
        com.obric.oui.dialog.alert.b bVar2 = buttonStyleController.f7706d;
        if ((bVar2 == null || bVar2.s()) && (bVar = buttonStyleController.f7706d) != null) {
            bVar.dismiss();
        }
    }

    private final void i(OButton oButton, TextColorType textColorType) {
        int i;
        if (textColorType != null) {
            int ordinal = textColorType.ordinal();
            if (ordinal == 0) {
                i = C0838R.color.TextReverse;
            } else if (ordinal == 1) {
                i = C0838R.color.TextReverse2;
            } else {
                if (ordinal != 2) {
                    throw new kotlin.f();
                }
                i = C0838R.color.Negative;
            }
            oButton.setTextColor(ContextCompat.getColor(oButton.getContext(), i));
        }
    }

    @Override // com.obric.oui.dialog.alert.g
    public void a(Context context, FrameLayout frameLayout) {
        l.f(context, "context");
        l.f(frameLayout, "parent");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int i = this.h;
        View inflate = LayoutInflater.from(context).inflate(i != 0 ? i != 1 ? C0838R.layout.o_dialog_button_primary : C0838R.layout.o_dialog_button_vertical : C0838R.layout.o_dialog_button_horizontal, (ViewGroup) frameLayout, false);
        frameLayout.addView(inflate, layoutParams);
        this.f7707e = inflate;
        if (inflate != null) {
            inflate.setVisibility(8);
        }
        this.a = (OButton) inflate.findViewById(C0838R.id.actionPositive);
        this.b = (OButton) inflate.findViewById(C0838R.id.actionNegative);
        this.f7705c = (OButton) inflate.findViewById(C0838R.id.actionNeutral);
        this.f7708f = (FrameLayout) inflate.findViewById(C0838R.id.custom_container);
    }

    @Override // com.obric.oui.dialog.alert.g
    public void b(com.obric.oui.dialog.alert.b bVar) {
        l.f(bVar, "dialog");
        this.f7706d = bVar;
    }

    public final OButton e() {
        return this.a;
    }

    public final void f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, TextColorType textColorType) {
        OButton oButton = this.b;
        if (oButton != null) {
            if (TextUtils.isEmpty(charSequence)) {
                oButton.setVisibility(8);
                return;
            }
            View view = this.f7707e;
            if (view != null) {
                view.setVisibility(0);
            }
            oButton.setText(charSequence);
            i(oButton, null);
            oButton.setVisibility(0);
            oButton.setOnClickListener(new a(charSequence, null, onClickListener));
        }
    }

    public final void g(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, TextColorType textColorType) {
        OButton oButton = this.f7705c;
        if (oButton != null) {
            if (TextUtils.isEmpty(null)) {
                oButton.setVisibility(8);
                return;
            }
            View view = this.f7707e;
            if (view != null) {
                view.setVisibility(0);
            }
            oButton.setText((CharSequence) null);
            i(oButton, null);
            oButton.setVisibility(0);
            oButton.setOnClickListener(new b(null, null, null));
        }
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener, TextColorType textColorType, boolean z) {
        OButton oButton = this.a;
        if (oButton != null) {
            if (TextUtils.isEmpty(charSequence)) {
                oButton.setVisibility(8);
                return;
            }
            View view = this.f7707e;
            if (view != null) {
                view.setVisibility(0);
            }
            if (z) {
                oButton.setBackgroundTintList(ContextCompat.getColorStateList(this.f7709g, C0838R.color.oui_red_6));
                oButton.setTextColor(ContextCompat.getColor(this.f7709g, C0838R.color.white));
            }
            oButton.setText(charSequence);
            i(oButton, null);
            oButton.setVisibility(0);
            oButton.setOnClickListener(new c(charSequence, z, null, onClickListener));
        }
    }
}
