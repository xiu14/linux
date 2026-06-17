package com.obric.oui.toast;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.popover.SingleChildFrameLayout;
import e.i.b.c.b.i;
import e.i.b.c.b.o;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    private static final int m;
    private static final int n;
    private static WeakReference<a> o;
    public static final C0363a p = new C0363a(null);
    private final c a;
    private Toast b;

    /* renamed from: c, reason: collision with root package name */
    private int f8162c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8163d;

    /* renamed from: e, reason: collision with root package name */
    private int f8164e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f8165f;

    /* renamed from: g, reason: collision with root package name */
    private View f8166g;
    private OButton h;
    private final Activity i;
    private final String j;
    private int k;
    private final boolean l;

    /* renamed from: com.obric.oui.toast.a$a, reason: collision with other inner class name */
    public static final class C0363a {
        public C0363a(g gVar) {
        }

        public final void a(Activity activity, String str, int i) {
            l.f(activity, "context");
            l.f(str, "msg");
            a aVar = (a) a.o.get();
            if (aVar != null) {
                aVar.d();
            }
            a aVar2 = new a(activity, str, i, false, 8);
            a.o = new WeakReference(aVar2);
            aVar2.f();
        }

        public final void b(Activity activity, String str, int i) {
            l.f(activity, "context");
            l.f(str, "msg");
            a aVar = (a) a.o.get();
            if (aVar != null) {
                aVar.d();
            }
            a aVar2 = new a(activity, str, 48, false, 8);
            a.o = new WeakReference(aVar2);
            aVar2.e(i);
            aVar2.f();
        }
    }

    public final class b extends ViewOutlineProvider {
        private final Rect a = new Rect();
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private float f8167c;

        /* renamed from: d, reason: collision with root package name */
        private float f8168d;

        public b(int i, float f2, float f3) {
            this.b = i;
            this.f8167c = f2;
            this.f8168d = f3;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Drawable background;
            if (view != null && (background = view.getBackground()) != null) {
                background.copyBounds(this.a);
            }
            Rect rect = this.a;
            float f2 = this.f8167c;
            if (f2 != 1.0f) {
                rect.left = (int) ((rect.left * f2) + 0.5f);
                rect.right = (int) ((rect.right * f2) + 0.5f);
            }
            float f3 = this.f8168d;
            if (f3 != 1.0f) {
                rect.top = (int) ((rect.top * f3) + 0.5f);
                rect.bottom = (int) ((rect.bottom * f3) + 0.5f);
            }
            rect.offset(0, this.b);
            if (outline != null) {
                outline.setRoundRect(this.a, a.this.i.getResources().getDimension(C0838R.dimen.oui_r_l1));
            }
        }
    }

    private static final class c {
        private final WindowManager.LayoutParams a;
        private final Handler b;

        /* renamed from: c, reason: collision with root package name */
        private int f8170c;

        /* renamed from: d, reason: collision with root package name */
        private int f8171d;

        /* renamed from: e, reason: collision with root package name */
        private int f8172e;

        /* renamed from: f, reason: collision with root package name */
        private View f8173f;

        /* renamed from: g, reason: collision with root package name */
        private View f8174g;
        private Activity h;
        private WindowManager i;

        /* renamed from: com.obric.oui.toast.a$c$a, reason: collision with other inner class name */
        public static final class HandlerC0364a extends Handler {
            HandlerC0364a() {
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                l.f(message, "msg");
                int i = message.what;
                if (i == 1) {
                    c.b(c.this);
                } else if (i == 2) {
                    c.this.c();
                    c.this.g(null);
                    c.this.e(null);
                }
            }
        }

        public c() {
            int i;
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.a = layoutParams;
            this.b = new HandlerC0364a();
            this.f8172e = 2000;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            l.f("style", "type");
            try {
                i = Class.forName("com.android.internal.R$style").getField("Animation_Toast").getInt(null);
            } catch (Exception e2) {
                e2.printStackTrace();
                i = 0;
            }
            layoutParams.windowAnimations = i;
            layoutParams.type = 2;
            layoutParams.flags = 168;
            layoutParams.setTitle("CustomToast");
        }

        public static final void b(c cVar) {
            Objects.requireNonNull(cVar);
            C0363a c0363a = a.p;
            C0363a c0363a2 = a.p;
            Log.v("OToast", "HANDLE SHOW: " + cVar + " mView=" + cVar.f8173f + " mNextView=" + cVar.f8174g);
            cVar.c();
            Activity activity = cVar.h;
            View view = cVar.f8174g;
            l.c(view);
            int i = cVar.f8171d;
            View view2 = view;
            if (activity != null) {
                ToastBackgroundView toastBackgroundView = (ToastBackgroundView) (view instanceof ToastBackgroundView ? view : null);
                int a = toastBackgroundView != null ? toastBackgroundView.a() : (int) 24.0f;
                View inflate = LayoutInflater.from(activity).inflate(C0838R.layout.o_layout_popover_shadow_frame, (ViewGroup) null);
                Objects.requireNonNull(inflate, "null cannot be cast to non-null type com.obric.oui.popover.SingleChildFrameLayout");
                SingleChildFrameLayout singleChildFrameLayout = (SingleChildFrameLayout) inflate;
                singleChildFrameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2));
                singleChildFrameLayout.setShadowCornerRadius(a);
                List<o> x = i.x(activity, C0838R.style.OUIShadow_3_2_low_elevation);
                l.e(x, "shadows");
                Iterator it2 = ((ArrayList) x).iterator();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (it2.hasNext()) {
                    o oVar = (o) it2.next();
                    if (oVar.f() - oVar.c() > i3) {
                        i3 = kotlin.t.a.a(oVar.f() - oVar.c());
                    }
                    if (oVar.c() + oVar.f() > i4) {
                        i4 = kotlin.t.a.a(oVar.c() + oVar.f());
                    }
                    if (oVar.f() - oVar.d() > i2) {
                        i2 = kotlin.t.a.a(oVar.f() - oVar.d());
                    }
                    if (oVar.d() + oVar.f() > i5) {
                        i5 = kotlin.t.a.a(oVar.d() + oVar.f());
                    }
                }
                SingleChildFrameLayout singleChildFrameLayout2 = new SingleChildFrameLayout(activity, null);
                singleChildFrameLayout2.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 1;
                singleChildFrameLayout2.addView(singleChildFrameLayout, layoutParams);
                singleChildFrameLayout2.setClipChildren(false);
                singleChildFrameLayout2.setClipToPadding(false);
                singleChildFrameLayout2.setPadding(0, i2, 0, i);
                view2 = singleChildFrameLayout2;
            }
            cVar.f8173f = view2;
            l.c(view2);
            Context context = view2.getContext();
            l.e(context, "mView!!.context");
            Context applicationContext = context.getApplicationContext();
            View view3 = cVar.f8173f;
            l.c(view3);
            Context context2 = view3.getContext();
            l.e(context2, "mView!!.context");
            String packageName = context2.getPackageName();
            if (applicationContext == null) {
                View view4 = cVar.f8173f;
                l.c(view4);
                applicationContext = view4.getContext();
            }
            l.c(applicationContext);
            Object systemService = applicationContext.getSystemService("window");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            cVar.i = (WindowManager) systemService;
            View view5 = cVar.f8173f;
            l.c(view5);
            Context context3 = view5.getContext();
            l.e(context3, "mView!!.context");
            Resources resources = context3.getResources();
            l.e(resources, "mView!!.context.resources");
            Configuration configuration = resources.getConfiguration();
            int i6 = cVar.f8170c;
            l.e(configuration, "config");
            int absoluteGravity = Gravity.getAbsoluteGravity(i6, configuration.getLayoutDirection());
            WindowManager.LayoutParams layoutParams2 = cVar.a;
            layoutParams2.gravity = absoluteGravity;
            if ((absoluteGravity & 7) == 7) {
                layoutParams2.horizontalWeight = 1.0f;
            }
            if ((absoluteGravity & 112) == 112) {
                layoutParams2.verticalWeight = 1.0f;
            }
            layoutParams2.x = 0;
            layoutParams2.y = cVar.f8171d;
            layoutParams2.verticalMargin = 0.0f;
            layoutParams2.horizontalMargin = 0.0f;
            layoutParams2.y = 0;
            layoutParams2.width = -1;
            Activity activity2 = cVar.h;
            l.c(activity2);
            Window window = activity2.getWindow();
            l.e(window, "mActivity!!.window");
            layoutParams2.token = window.getAttributes().token;
            cVar.a.packageName = packageName;
            View view6 = cVar.f8173f;
            l.c(view6);
            if (view6.getParent() != null) {
                C0363a c0363a3 = a.p;
                C0363a c0363a4 = a.p;
                StringBuilder M = e.a.a.a.a.M("REMOVE! ");
                M.append(cVar.f8173f);
                M.append(" in ");
                M.append(cVar);
                Log.v("OToast", M.toString());
                WindowManager windowManager = cVar.i;
                l.c(windowManager);
                windowManager.removeView(cVar.f8173f);
            }
            C0363a c0363a5 = a.p;
            C0363a c0363a6 = a.p;
            StringBuilder M2 = e.a.a.a.a.M("ADD! ");
            M2.append(cVar.f8173f);
            M2.append(" in ");
            M2.append(cVar);
            Log.v("OToast", M2.toString());
            try {
                WindowManager windowManager2 = cVar.i;
                l.c(windowManager2);
                windowManager2.addView(cVar.f8173f, cVar.a);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c() {
            View view = this.f8173f;
            if (view != null) {
                l.c(view);
                if (view.getParent() != null) {
                    C0363a c0363a = a.p;
                    C0363a c0363a2 = a.p;
                    StringBuilder M = e.a.a.a.a.M("REMOVE! ");
                    M.append(this.f8173f);
                    M.append(" in ");
                    M.append(this);
                    Log.v("OToast", M.toString());
                    WindowManager windowManager = this.i;
                    l.c(windowManager);
                    windowManager.removeView(this.f8173f);
                }
                this.f8173f = null;
            }
        }

        public final void d() {
            C0363a c0363a = a.p;
            C0363a c0363a2 = a.p;
            Log.v("OToast", "HIDE: " + this);
            this.b.sendEmptyMessage(2);
        }

        public final void e(Activity activity) {
            this.h = activity;
        }

        public final void f(int i) {
            this.f8170c = i;
        }

        public final void g(View view) {
            this.f8174g = view;
        }

        public final void h(int i) {
            this.f8171d = i;
        }

        public final void i() {
            C0363a c0363a = a.p;
            C0363a c0363a2 = a.p;
            Log.v("OToast", "SHOW: " + this);
            this.b.sendEmptyMessage(1);
            this.b.removeMessages(2);
            this.b.sendEmptyMessageDelayed(2, (long) this.f8172e);
        }
    }

    static {
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        TypedValue.applyDimension(1, 8, system.getDisplayMetrics());
        m = e.a.a.a.a.e0("Resources.getSystem()", 1, 20);
        n = e.a.a.a.a.e0("Resources.getSystem()", 1, 96);
        o = new WeakReference<>(null);
    }

    public a(Activity activity, String str, int i, boolean z, int i2) {
        i = (i2 & 4) != 0 ? 80 : i;
        boolean z2 = false;
        z = (i2 & 8) != 0 ? false : z;
        l.f(activity, "mContext");
        l.f(str, "msg");
        this.i = activity;
        this.j = str;
        this.k = i;
        this.l = z;
        c cVar = new c();
        this.a = cVar;
        this.f8162c = e.a.a.a.a.e0("Resources.getSystem()", 1, 288);
        int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 73);
        this.f8163d = e0;
        View view = null;
        View inflate = LayoutInflater.from(activity).inflate(C0838R.layout.o_toast, (ViewGroup) null);
        l.e(inflate, "LayoutInflater\n        .…e(R.layout.o_toast, null)");
        this.f8166g = inflate;
        cVar.h(n);
        cVar.f(this.k);
        l.f(activity, "context");
        try {
            Resources resources = activity.getResources();
            l.e(resources, "context.resources");
            if (resources.getConfiguration().orientation == 2) {
                z2 = true;
            }
        } catch (Exception e2) {
            e.i.b.f.e.b.c("ResourceUtils", "isLandscape error", e2);
        }
        if (!z2) {
            this.f8162c = e.i.a.b.a.f(activity) - e0;
        }
        TextView textView = (TextView) this.f8166g.findViewById(C0838R.id.tv_msg);
        this.f8165f = textView;
        if (textView != null) {
            textView.setText(str);
        }
        View view2 = this.f8166g;
        if (view2 != null && (view2 instanceof ToastBackgroundView)) {
            view = view2;
        }
        View findViewById = view2.findViewById(C0838R.id.right_button);
        l.e(findViewById, "contentView.findViewById(R.id.right_button)");
        this.h = (OButton) findViewById;
        this.f8166g.setOutlineProvider(new b(-4, 1.0f, 0.9f));
    }

    public final void d() {
        this.a.d();
        Toast toast = this.b;
        if (toast != null) {
            toast.cancel();
        }
    }

    public final void e(int i) {
        this.f8164e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: DeadObjectException -> 0x00bc, RuntimeException -> 0x00d7, TryCatch #2 {DeadObjectException -> 0x00bc, RuntimeException -> 0x00d7, blocks: (B:3:0x0004, B:10:0x0014, B:11:0x0020, B:14:0x0045, B:16:0x0049, B:17:0x0050, B:19:0x0068, B:23:0x007d, B:25:0x0085, B:29:0x00b8, B:31:0x0040, B:34:0x0017, B:37:0x001c), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068 A[Catch: DeadObjectException -> 0x00bc, RuntimeException -> 0x00d7, TryCatch #2 {DeadObjectException -> 0x00bc, RuntimeException -> 0x00d7, blocks: (B:3:0x0004, B:10:0x0014, B:11:0x0020, B:14:0x0045, B:16:0x0049, B:17:0x0050, B:19:0x0068, B:23:0x007d, B:25:0x0085, B:29:0x00b8, B:31:0x0040, B:34:0x0017, B:37:0x001c), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.toast.a.f():void");
    }
}
