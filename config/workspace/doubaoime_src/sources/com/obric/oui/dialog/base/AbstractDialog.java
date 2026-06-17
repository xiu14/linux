package com.obric.oui.dialog.base;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.dialog.alert.view.RadiusLayout;
import kotlin.f;
import kotlin.s.c.l;

@RequiresApi(30)
/* loaded from: classes2.dex */
public abstract class AbstractDialog extends Dialog {
    private final String a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f7720c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7721d;

    /* renamed from: e, reason: collision with root package name */
    public View f7722e;

    /* renamed from: f, reason: collision with root package name */
    private CloseIconStyle f7723f;

    /* renamed from: g, reason: collision with root package name */
    private View.OnClickListener f7724g;
    private boolean h;
    private boolean i;
    private final a j;
    private final boolean k;
    private final boolean l;

    public enum CloseIconStyle {
        LIGHT,
        DARK,
        CUSTOM
    }

    public static final class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            l.f(message, "msg");
            super.handleMessage(message);
            if (message.what == 101) {
                AbstractDialog.d(AbstractDialog.this);
            }
        }
    }

    static final class b implements View.OnClickListener {
        b(boolean z) {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AbstractDialog.this.dismiss();
            View.OnClickListener onClickListener = AbstractDialog.this.f7724g;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialog(Context context, boolean z, boolean z2) {
        super(context);
        l.f(context, "context");
        this.k = z;
        this.l = z2;
        this.a = "AbstractDialog";
        this.f7723f = CloseIconStyle.DARK;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        if (z2) {
            setContentView(C0838R.layout.o_base_dialog_with_match_parent_height);
        } else {
            setContentView(C0838R.layout.o_base_dialog);
        }
        View findViewById = findViewById(C0838R.id.root_view);
        l.e(findViewById, "findViewById(R.id.root_view)");
        this.f7722e = findViewById;
        this.f7720c = (ImageView) findViewById(C0838R.id.btn_close);
        this.b = findViewById(C0838R.id.close_container);
        if (z2) {
            View view = this.f7722e;
            if (view == null) {
                l.l("rootView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = -1;
            view.setLayoutParams(layoutParams);
        }
        View view2 = this.f7722e;
        if (view2 == null) {
            l.l("rootView");
            throw null;
        }
        view2.setOnApplyWindowInsetsListener(new com.obric.oui.dialog.base.a(this));
        j(this.f7721d, null);
        ViewStub viewStub = (ViewStub) findViewById(C0838R.id.contentView);
        l.e(viewStub, "viewStub");
        viewStub.setLayoutResource(C0838R.layout.o_alert_dialog);
        viewStub.inflate();
        this.j = new a(Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[Catch: Exception -> 0x007d, TryCatch #0 {Exception -> 0x007d, blocks: (B:3:0x0003, B:6:0x000a, B:8:0x0010, B:10:0x0014, B:12:0x0018, B:16:0x0025, B:18:0x0029, B:20:0x0031, B:22:0x0037, B:24:0x003b, B:26:0x005a, B:29:0x0069, B:31:0x006d, B:34:0x0071, B:37:0x001f, B:40:0x0075, B:44:0x0079), top: B:2:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.obric.oui.dialog.base.AbstractDialog r6) {
        /*
            java.util.Objects.requireNonNull(r6)
            android.view.View r0 = r6.f7722e     // Catch: java.lang.Exception -> L7d
            java.lang.String r1 = "rootView"
            r2 = 0
            if (r0 == 0) goto L79
            int r0 = e.i.b.g.a.a(r0)     // Catch: java.lang.Exception -> L7d
            if (r0 > 0) goto L85
            boolean r0 = r6.k     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L85
            android.view.View r0 = r6.f7722e     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L75
            android.view.ViewParent r0 = r0.getParent()     // Catch: java.lang.Exception -> L7d
            if (r0 != 0) goto L1f
            goto L24
        L1f:
            boolean r3 = r0 instanceof android.view.View     // Catch: java.lang.Exception -> L7d
            if (r3 == 0) goto L24
            goto L25
        L24:
            r0 = r2
        L25:
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L85
            int r3 = r0.getHeight()     // Catch: java.lang.Exception -> L7d
            android.view.View r4 = r6.f7722e     // Catch: java.lang.Exception -> L7d
            if (r4 == 0) goto L71
            int r4 = r4.getHeight()     // Catch: java.lang.Exception -> L7d
            if (r3 <= r4) goto L85
            android.view.View r3 = r6.f7722e     // Catch: java.lang.Exception -> L7d
            if (r3 == 0) goto L6d
            r3.requestLayout()     // Catch: java.lang.Exception -> L7d
            java.lang.String r3 = r6.a     // Catch: java.lang.Exception -> L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7d
            r4.<init>()     // Catch: java.lang.Exception -> L7d
            java.lang.String r5 = "recheckInset, requestLayout, parentView.height: "
            r4.append(r5)     // Catch: java.lang.Exception -> L7d
            int r0 = r0.getHeight()     // Catch: java.lang.Exception -> L7d
            r4.append(r0)     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = ", rootView.height: "
            r4.append(r0)     // Catch: java.lang.Exception -> L7d
            android.view.View r0 = r6.f7722e     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L69
            int r0 = r0.getHeight()     // Catch: java.lang.Exception -> L7d
            r4.append(r0)     // Catch: java.lang.Exception -> L7d
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L7d
            e.i.b.f.e.b.e(r3, r0)     // Catch: java.lang.Exception -> L7d
            goto L85
        L69:
            kotlin.s.c.l.l(r1)     // Catch: java.lang.Exception -> L7d
            throw r2
        L6d:
            kotlin.s.c.l.l(r1)     // Catch: java.lang.Exception -> L7d
            throw r2
        L71:
            kotlin.s.c.l.l(r1)     // Catch: java.lang.Exception -> L7d
            throw r2
        L75:
            kotlin.s.c.l.l(r1)     // Catch: java.lang.Exception -> L7d
            throw r2
        L79:
            kotlin.s.c.l.l(r1)     // Catch: java.lang.Exception -> L7d
            throw r2
        L7d:
            r0 = move-exception
            java.lang.String r6 = r6.a
            java.lang.String r1 = "recheckInset failed"
            e.i.b.f.e.b.c(r6, r1, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.dialog.base.AbstractDialog.d(com.obric.oui.dialog.base.AbstractDialog):void");
    }

    public final void e(CloseIconStyle closeIconStyle, Integer num, Integer num2) {
        l.f(closeIconStyle, "style");
        if (this.f7721d) {
            int ordinal = closeIconStyle.ordinal();
            int i = C0838R.color.ConstTextInverse;
            if (ordinal == 0) {
                i = C0838R.color.TextReverse;
                num2 = Integer.valueOf(C0838R.color.ConstTextInverse5);
            } else if (ordinal == 1) {
                num2 = Integer.valueOf(C0838R.color.ConstBGContainer7);
            } else {
                if (ordinal != 2) {
                    throw new f();
                }
                if (num != null) {
                    i = num.intValue();
                }
            }
            ImageView imageView = this.f7720c;
            if (imageView != null) {
                imageView.setImageTintList(ContextCompat.getColorStateList(getContext(), i));
            }
            if (num2 == null) {
                View view = this.b;
                if (view != null) {
                    view.setBackground(null);
                    return;
                }
                return;
            }
            View view2 = this.b;
            Drawable background = view2 != null ? view2.getBackground() : null;
            GradientDrawable gradientDrawable = (GradientDrawable) (background instanceof GradientDrawable ? background : null);
            if (gradientDrawable != null) {
                gradientDrawable.setColor(ContextCompat.getColorStateList(getContext(), num2.intValue()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.l;
    }

    public final View h() {
        View view = this.f7722e;
        if (view != null) {
            return view;
        }
        l.l("rootView");
        throw null;
    }

    public final boolean i() {
        return this.k;
    }

    public void j(boolean z, View.OnClickListener onClickListener) {
        this.f7721d = z;
        this.f7724g = onClickListener;
        ImageView imageView = this.f7720c;
        if (imageView != null) {
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            com.obric.oui.common.util.b.a(imageView, kotlin.t.a.a(TypedValue.applyDimension(1, 44, system.getDisplayMetrics())));
            if (!z) {
                View view = this.b;
                if (view != null) {
                    com.obric.oui.common.util.b.f(view);
                    return;
                }
                return;
            }
            View view2 = this.b;
            if (view2 != null) {
                com.obric.oui.common.util.b.g(view2);
            }
            e(this.f7723f, null, null);
            View view3 = this.b;
            if (view3 != null) {
                view3.setOnClickListener(new b(z));
            }
        }
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        this.j.removeCallbacksAndMessages(null);
    }

    @Override // android.app.Dialog
    @RequiresApi(30)
    public void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
            if (this.i) {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setWindowAnimations(-1);
                }
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.clearFlags(2);
                }
            } else {
                window.addFlags(2);
            }
            int i = Build.VERSION.SDK_INT;
            boolean z = false;
            if (i >= 29) {
                window.setNavigationBarContrastEnforced(false);
            }
            if (i >= 30) {
                window.setDecorFitsSystemWindows(false);
            }
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(0);
            window.setNavigationBarDividerColor(0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 81;
            if (i >= 30) {
                attributes.setFitInsetsSides(WindowInsets.Side.all() ^ 8);
            }
            if (this.l) {
                attributes.height = -1;
            } else {
                attributes.height = -2;
            }
            if (this.k) {
                View view = this.f7722e;
                if (view == null) {
                    l.l("rootView");
                    throw null;
                }
                if (view == null) {
                    l.l("rootView");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = -1;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (!(layoutParams instanceof ViewGroup.MarginLayoutParams) ? null : layoutParams);
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = 0;
                }
                view.setLayoutParams(layoutParams);
                View view2 = this.f7722e;
                if (view2 == null) {
                    l.l("rootView");
                    throw null;
                }
                if (!(view2 instanceof RadiusLayout)) {
                    view2 = null;
                }
                RadiusLayout radiusLayout = (RadiusLayout) view2;
                if (radiusLayout != null) {
                    Context context = radiusLayout.getContext();
                    l.e(context, "context");
                    float dimension = context.getResources().getDimension(C0838R.dimen.oui_r_l3);
                    radiusLayout.setRadius(dimension, dimension, 0.0f, 0.0f);
                }
            } else {
                View view3 = this.f7722e;
                if (view3 == null) {
                    l.l("rootView");
                    throw null;
                }
                if (view3 == null) {
                    l.l("rootView");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                Context context2 = window.getContext();
                l.e(context2, "context");
                Resources resources = context2.getResources();
                l.e(resources, "context.resources");
                int i2 = resources.getDisplayMetrics().widthPixels;
                l.f(window, "$this$getLayoutMarginHorizontal");
                Context context3 = window.getContext();
                l.e(context3, "context");
                layoutParams2.width = i2 - (context3.getResources().getDimensionPixelSize(C0838R.dimen.oui_dialog_narrow_layout_margin) * 2);
                view3.setLayoutParams(layoutParams2);
            }
            Context context4 = window.getContext();
            l.e(context4, "context");
            l.f(context4, "context");
            try {
                Resources resources2 = context4.getResources();
                l.e(resources2, "context.resources");
                if (resources2.getConfiguration().orientation == 2) {
                    z = true;
                }
            } catch (Exception e2) {
                e.i.b.f.e.b.c("ResourceUtils", "isLandscape error", e2);
            }
            if (z) {
                View view4 = this.f7722e;
                if (view4 == null) {
                    l.l("rootView");
                    throw null;
                }
                if (view4 == null) {
                    l.l("rootView");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = view4.getLayoutParams();
                layoutParams3.width = e.a.a.a.a.e0("Resources.getSystem()", 1, 440);
                view4.setLayoutParams(layoutParams3);
            }
            window.setAttributes(attributes);
        }
    }
}
