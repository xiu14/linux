package com.bytedance.android.input.keyboard.aiwrite;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.InputView;

/* renamed from: com.bytedance.android.input.keyboard.aiwrite.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603x {

    /* renamed from: e, reason: collision with root package name */
    public static final a f2629e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static FrameLayout f2630f;
    private final String a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f2631c;

    /* renamed from: d, reason: collision with root package name */
    private final Runnable f2632d;

    /* renamed from: com.bytedance.android.input.keyboard.aiwrite.x$a */
    public static final class a {

        /* renamed from: com.bytedance.android.input.keyboard.aiwrite.x$a$a, reason: collision with other inner class name */
        static final class C0079a extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
            public static final C0079a a = new C0079a();

            C0079a() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public kotlin.o invoke() {
                return kotlin.o.a;
            }
        }

        /* renamed from: com.bytedance.android.input.keyboard.aiwrite.x$a$b */
        static final class b extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public kotlin.o invoke() {
                return kotlin.o.a;
            }
        }

        /* renamed from: com.bytedance.android.input.keyboard.aiwrite.x$a$c */
        static final class c extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
            public static final c a = new c();

            c() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public kotlin.o invoke() {
                return kotlin.o.a;
            }
        }

        /* renamed from: com.bytedance.android.input.keyboard.aiwrite.x$a$d */
        static final class d extends kotlin.s.c.m implements kotlin.s.b.a<kotlin.o> {
            public static final d a = new d();

            d() {
                super(0);
            }

            @Override // kotlin.s.b.a
            public kotlin.o invoke() {
                return kotlin.o.a;
            }
        }

        public a(kotlin.s.c.g gVar) {
        }

        public static C0603x c(a aVar, int i, long j, int i2) {
            if ((i2 & 2) != 0) {
                j = 2000;
            }
            String string = IAppGlobals.a.getContext().getResources().getString(i);
            kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(resId)");
            C0603x c0603x = new C0603x(string, y.a);
            C0603x.d(c0603x, 0, 17, 0, 0, 0, j, 29);
            return c0603x;
        }

        public final void a(int i) {
            String string = IAppGlobals.a.getContext().getResources().getString(i);
            kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(resId)");
            C0603x.d(new C0603x(string, C0079a.a), 0, 0, 0, 0, 0, 0L, 63);
        }

        public final void b(String str) {
            kotlin.s.c.l.f(str, "msg");
            C0603x.d(new C0603x(str, b.a), 0, 17, 0, 0, 0, 0L, 61);
        }

        public final C0603x d(String str) {
            kotlin.s.c.l.f(str, "msg");
            C0603x c0603x = new C0603x(str, d.a);
            C0603x.d(c0603x, -1, 17, 0, 0, 0, 0L, 60);
            return c0603x;
        }

        public final void e(int i) {
            String string = IAppGlobals.a.getContext().getResources().getString(i);
            kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(resId)");
            C0603x.d(new C0603x(string, c.a), -1, 17, 0, 0, 0, 0L, 60);
        }
    }

    public C0603x(String str, final kotlin.s.b.a<kotlin.o> aVar) {
        kotlin.s.c.l.f(str, "msg");
        kotlin.s.c.l.f(aVar, "actionEnd");
        this.a = str;
        this.b = new Handler(Looper.getMainLooper());
        this.f2632d = new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.d
            @Override // java.lang.Runnable
            public final void run() {
                C0603x.b(C0603x.this, aVar);
            }
        };
    }

    public static void b(C0603x c0603x, kotlin.s.b.a aVar) {
        kotlin.s.c.l.f(c0603x, "this$0");
        kotlin.s.c.l.f(aVar, "$actionEnd");
        c0603x.c();
        aVar.invoke();
    }

    private final void c() {
        FrameLayout frameLayout = this.f2631c;
        if (frameLayout != null) {
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.removeView(frameLayout);
            }
            com.bytedance.android.input.r.j.i("AIWriting-Toast", "delete now");
        }
        this.f2631c = null;
    }

    public static void d(C0603x c0603x, int i, int i2, int i3, int i4, int i5, long j, int i6) {
        if ((i6 & 1) != 0) {
            i = C0838R.drawable.ai_writing_icon_toast;
        }
        if ((i6 & 2) != 0) {
            i2 = -1;
        }
        if ((i6 & 4) != 0) {
            i3 = 0;
        }
        if ((i6 & 8) != 0) {
            i4 = C0838R.color.toast_bg_color;
        }
        if ((i6 & 16) != 0) {
            i5 = C0838R.color.toast_text_color;
        }
        if ((i6 & 32) != 0) {
            j = 2000;
        }
        if (c0603x.f2631c != null) {
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        View inflate = LayoutInflater.from(aVar.getContext()).inflate(C0838R.layout.layout_aipanel_toast, (ViewGroup) null);
        kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        c0603x.f2631c = frameLayout;
        TextView textView = (TextView) inflate.findViewById(C0838R.id.tv_msg);
        textView.setText(c0603x.a);
        Context context = textView.getContext();
        kotlin.s.c.l.e(context, "context");
        textView.setTextColor(aVar.l(context, i5));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(frameLayout.getContext().getResources().getDimension(C0838R.dimen.oui_r_l1));
        Context context2 = frameLayout.getContext();
        kotlin.s.c.l.e(context2, "context");
        gradientDrawable.setColor(ColorStateList.valueOf(aVar.l(context2, i4)));
        gradientDrawable.setStroke(1, ContextCompat.getColor(frameLayout.getContext(), C0838R.color.LineTertiary));
        frameLayout.setBackground(gradientDrawable);
        if (i > 0) {
            ImageView imageView = (ImageView) inflate.findViewById(C0838R.id.iv_icon);
            Context context3 = frameLayout.getContext();
            kotlin.s.c.l.e(context3, "context");
            imageView.setImageDrawable(aVar.D(context3, i));
        } else {
            ((ImageView) inflate.findViewById(C0838R.id.iv_icon)).setVisibility(8);
        }
        frameLayout.setElevation(frameLayout.getResources().getDimension(C0838R.dimen.keyboard_toast_elevation));
        if (Build.VERSION.SDK_INT >= 28) {
            frameLayout.setOutlineAmbientShadowColor(0);
            frameLayout.setOutlineSpotShadowColor(0);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (i2 != -1) {
            layoutParams.gravity = i2;
        } else {
            layoutParams.gravity = 81;
            layoutParams.bottomMargin = i3;
        }
        FrameLayout frameLayout2 = f2630f;
        if (frameLayout2 != null) {
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.removeView(frameLayout2);
            }
            com.bytedance.android.input.r.j.i("AIWriting-Toast", "delete last");
        }
        InputView inputView2 = ImeService.x;
        if (inputView2 != null) {
            inputView2.addView(c0603x.f2631c, -1, layoutParams);
        }
        f2630f = c0603x.f2631c;
        if (j > 0) {
            c0603x.b.postDelayed(c0603x.f2632d, 2000L);
        }
    }

    public final void a() {
        this.b.removeCallbacks(this.f2632d);
        c();
    }
}
