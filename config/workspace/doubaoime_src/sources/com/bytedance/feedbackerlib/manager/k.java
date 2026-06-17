package com.bytedance.feedbackerlib.manager;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.feedbackerlib.Feedbacker;
import com.bytedance.feedbackerlib.activity.DialogActivity;
import com.bytedance.feedbackerlib.activity.FeedbackActivity;
import com.bytedance.feedbackerlib.activity.RequestOverlayWindowPermissionActivity;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import com.bytedance.feedbackerlib.manager.F;
import com.bytedance.feedbackerlib.manager.ScreenRecordManagerExt;
import com.bytedance.feedbackerlib.util.SharedPreferencesUtils;
import com.bytedance.feedbackerlib.util.l;
import com.bytedance.feedbackerlib.view.CustomScrollView;
import com.bytedance.feedbackerlib.view.SupportCustomInterceptLinearLayout;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.ScaleType;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.util.Calendar;
import java.util.Objects;

/* loaded from: classes.dex */
public class k {
    private static volatile k B0;
    private static volatile boolean C0;
    private static volatile boolean D0;
    private TextView A;
    private LinearLayout B;
    private TextView C;
    private View D;
    private View E;
    private ImageView F;
    private SupportCustomInterceptLinearLayout G;
    private TextView H;
    private ProgressBar I;

    /* renamed from: J, reason: collision with root package name */
    private SupportCustomInterceptLinearLayout f4817J;
    private TextView K;
    private ProgressBar L;
    private View M;
    private SupportCustomInterceptLinearLayout N;
    private TextView O;
    private ImageView P;
    private TextView Q;
    private Uri R;
    private int V;
    private int W;
    private int Y;
    private int Z;
    private View a;
    private int a0;
    private WindowManager.LayoutParams b;
    private int b0;

    /* renamed from: c, reason: collision with root package name */
    private WindowManager f4818c;
    private int c0;

    /* renamed from: d, reason: collision with root package name */
    private C f4819d;
    private int d0;

    /* renamed from: e, reason: collision with root package name */
    private ScreenRecordManagerExt f4820e;
    private int e0;

    /* renamed from: f, reason: collision with root package name */
    private F f4821f;
    private int f0;

    /* renamed from: g, reason: collision with root package name */
    private FrameLayout f4822g;
    private int g0;
    private WindowManager.LayoutParams h;
    private int h0;
    private CustomScrollView i;
    private int i0;
    private LinearLayout j;
    private int j0;
    private m k;
    private int k0;
    private LinearLayout l;
    private int l0;
    private TextView m;
    private int m0;
    private LinearLayout n;
    private int n0;
    private TextView o;
    private int o0;
    private LinearLayout p;
    private int p0;
    private TextView q;
    private int q0;
    private LinearLayout r;
    private int r0;
    private TextView s;
    private int s0;
    private LinearLayout t;
    private int t0;
    private TextView u;
    private int u0;
    private LinearLayout v;
    private int v0;
    private TextView w;
    private int w0;
    private LinearLayout x;
    private final Context x0;
    private TextView y;
    private LinearLayout z;
    private boolean S = false;
    private boolean T = true;
    private int U = -1;
    private int X = -1;
    private final l.c y0 = new a();
    private final ContentObserver z0 = new c(new Handler(Looper.getMainLooper()));
    private final Handler A0 = new h(Looper.getMainLooper());

    class a implements l.c {
        a() {
        }

        @Override // com.bytedance.feedbackerlib.util.l.c
        public void a(l.b bVar) {
            k.a(k.this, bVar);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4823c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f4824d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f4825e;

        b(int i, int i2, int i3, boolean z, int i4) {
            this.a = i;
            this.b = i2;
            this.f4823c = i3;
            this.f4824d = z;
            this.f4825e = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.a != 0 && k.this.k.a()) {
                k.this.i.setX((this.a * floatValue) + this.b);
                k kVar = k.this;
                kVar.i.getX();
                Objects.requireNonNull(kVar);
            }
            if (this.f4823c != 0) {
                if (k.this.k.a() || this.f4824d) {
                    k.this.i.setY((this.f4823c * floatValue) + this.f4825e);
                    k kVar2 = k.this;
                    kVar2.i.getY();
                    Objects.requireNonNull(kVar2);
                }
            }
        }
    }

    class c extends ContentObserver {
        c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        @RequiresApi(api = 16)
        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            if (Feedbacker.isFeedbackFunctionEnabled()) {
                k.this.E0(false);
                k.b(k.this, z, uri);
            }
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4827c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4828d;

        d(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.f4827c = i3;
            this.f4828d = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.a != 0) {
                k.this.G.setX((this.a * floatValue) + this.b);
            }
            if (this.f4827c != 0) {
                k.this.G.setY((this.f4827c * floatValue) + this.f4828d);
            }
        }
    }

    class e implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ int a;
        final /* synthetic */ int b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f4831d;

        e(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.f4830c = i3;
            this.f4831d = i4;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (this.a != 0) {
                k.this.N.setX((this.a * floatValue) + this.b);
            }
            if (this.f4830c != 0) {
                k.this.N.setY((this.f4830c * floatValue) + this.f4831d);
            }
        }
    }

    class f implements F.b {
        f() {
        }

        @Override // com.bytedance.feedbackerlib.manager.F.b
        public void a() {
            k.this.D0();
        }
    }

    class g implements View.OnTouchListener {
        private boolean a;
        private int b;

        /* renamed from: c, reason: collision with root package name */
        private int f4833c;

        /* renamed from: d, reason: collision with root package name */
        private int f4834d;

        /* renamed from: e, reason: collision with root package name */
        private int f4835e;

        /* renamed from: f, reason: collision with root package name */
        private int f4836f;

        /* renamed from: g, reason: collision with root package name */
        private int f4837g;

        g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0124  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
        @Override // android.view.View.OnTouchListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onTouch(android.view.View r5, android.view.MotionEvent r6) {
            /*
                Method dump skipped, instructions count: 485
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.manager.k.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    class h extends Handler {
        h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            k.n(k.this, message);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.A0();
        }
    }

    class j implements ViewTreeObserver.OnGlobalLayoutListener {
        j() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (k.this.T) {
                k.this.T = false;
                k kVar = k.this;
                k.e0(kVar, kVar.W);
                k.f0(k.this);
            }
        }
    }

    /* renamed from: com.bytedance.feedbackerlib.manager.k$k, reason: collision with other inner class name */
    class RunnableC0229k implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        /* renamed from: com.bytedance.feedbackerlib.manager.k$k$a */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.O0(true);
                RunnableC0229k runnableC0229k = RunnableC0229k.this;
                if (runnableC0229k.b) {
                    if (k.this.U == 0) {
                        k.this.K0();
                    } else {
                        k.this.L0();
                    }
                }
            }
        }

        RunnableC0229k(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.r0();
            k.this.I0(this.a);
            k.this.A0.postDelayed(new a(), 200L);
        }
    }

    class l implements Runnable {
        final /* synthetic */ int a;

        l(int i) {
            this.a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            k.this.i.setY(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class m extends GestureDetector {
        private a a;

        static class a extends GestureDetector.SimpleOnGestureListener {
            private boolean a = false;

            a() {
            }

            public boolean a() {
                return this.a;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onDown(MotionEvent motionEvent) {
                this.a = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                this.a = true;
                return true;
            }
        }

        m(Context context, a aVar) {
            super(context, aVar);
            this.a = aVar;
            setOnDoubleTapListener(null);
        }

        boolean a() {
            a aVar = this.a;
            if (aVar == null) {
                return false;
            }
            return aVar.a();
        }
    }

    private k(@NonNull Context context) {
        this.V = -1;
        this.W = -1;
        Context applicationContext = context.getApplicationContext();
        this.x0 = applicationContext;
        this.V = 0;
        this.W = 1;
        Resources resources = applicationContext.getResources();
        this.e0 = resources.getDimensionPixelSize(C0838R.dimen.float_window_initial_width);
        this.m0 = resources.getDimensionPixelSize(C0838R.dimen.float_window_large_margintop);
        this.n0 = resources.getDimensionPixelSize(C0838R.dimen.float_window_small_margintop);
        this.u0 = resources.getDimensionPixelSize(C0838R.dimen.horizen_float_window_large_margintop);
        this.v0 = resources.getDimensionPixelSize(C0838R.dimen.horizen_float_window_small_margintop);
        this.b0 = resources.getDimensionPixelSize(C0838R.dimen.top_safe_distance);
        this.c0 = resources.getDimensionPixelSize(C0838R.dimen.bottom_safe_distance);
        this.d0 = resources.getDimensionPixelSize(C0838R.dimen.left_and_right_safe_distance);
        this.w0 = resources.getDimensionPixelSize(C0838R.dimen.float_window_feedback_tv_available_width);
        F d2 = F.d();
        this.f4821f = d2;
        d2.j(new f());
        this.f4819d = C.q(applicationContext);
        try {
            this.f4820e = ScreenRecordManagerExt.K(applicationContext);
        } catch (ScreenRecordManagerExt.d unused) {
            Toast.makeText(context, this.f4821f.f("sdk33"), 0).show();
        }
        r0();
        Resources resources2 = this.x0.getResources();
        int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            this.a0 = resources2.getDimensionPixelSize(identifier);
        } else {
            this.a0 = 80;
        }
        this.f4822g = (FrameLayout) LayoutInflater.from(this.x0).inflate(C0838R.layout.feedbacker_float_window, (ViewGroup) null);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.type = 2038;
        int i2 = layoutParams.flags | 8;
        layoutParams.flags = i2;
        layoutParams.flags = i2 | 32;
        layoutParams.format = -3;
        layoutParams.gravity = 8388659;
        layoutParams.width = -1;
        layoutParams.height = -1;
        this.h = layoutParams;
        this.i = (CustomScrollView) this.f4822g.findViewById(C0838R.id.sv_float_window_feedbacker);
        LinearLayout linearLayout = (LinearLayout) this.f4822g.findViewById(C0838R.id.ll_float_window_feedbacker);
        this.j = linearLayout;
        this.l = (LinearLayout) linearLayout.findViewById(C0838R.id.ll_up_screen_shot);
        this.m = (TextView) this.j.findViewById(C0838R.id.tv_up_screen_shot);
        this.n = (LinearLayout) this.j.findViewById(C0838R.id.ll_up_screen_record);
        this.o = (TextView) this.j.findViewById(C0838R.id.tv_up_screen_record);
        this.p = (LinearLayout) this.j.findViewById(C0838R.id.ll_up_feedback);
        this.q = (TextView) this.j.findViewById(C0838R.id.tv_up_feedback);
        this.r = (LinearLayout) this.j.findViewById(C0838R.id.ll_up_hide_window);
        this.s = (TextView) this.j.findViewById(C0838R.id.tv_up_hide_window);
        this.t = (LinearLayout) this.j.findViewById(C0838R.id.ll_float_window_feedback);
        this.u = (TextView) this.j.findViewById(C0838R.id.tv_float_window_feedback);
        this.v = (LinearLayout) this.j.findViewById(C0838R.id.ll_down_screen_shot);
        this.w = (TextView) this.j.findViewById(C0838R.id.tv_down_screen_shot);
        this.x = (LinearLayout) this.j.findViewById(C0838R.id.ll_down_screen_record);
        this.y = (TextView) this.j.findViewById(C0838R.id.tv_down_screen_record);
        this.z = (LinearLayout) this.j.findViewById(C0838R.id.ll_down_feedback);
        this.A = (TextView) this.j.findViewById(C0838R.id.tv_down_feedback);
        this.B = (LinearLayout) this.j.findViewById(C0838R.id.ll_down_hide_window);
        this.C = (TextView) this.j.findViewById(C0838R.id.tv_down_hide_window);
        this.D = this.j.findViewById(C0838R.id.view_up_line);
        this.E = this.j.findViewById(C0838R.id.view_down_line);
        this.F = (ImageView) this.j.findViewById(C0838R.id.iv_floatwindow_feedback);
        this.l.setOnClickListener(new ViewOnClickListenerC0674d(this));
        this.v.setOnClickListener(new ViewOnClickListenerC0675e(this));
        this.n.setOnClickListener(new ViewOnClickListenerC0676f(this));
        this.x.setOnClickListener(new com.bytedance.feedbackerlib.manager.g(this));
        this.p.setOnClickListener(new com.bytedance.feedbackerlib.manager.h(this));
        this.z.setOnClickListener(new com.bytedance.feedbackerlib.manager.i(this));
        this.r.setOnClickListener(new com.bytedance.feedbackerlib.manager.j(this));
        this.B.setOnClickListener(new com.bytedance.feedbackerlib.manager.l(this));
        this.j.findViewById(C0838R.id.ll_float_window_feedback_content).setOnClickListener(new com.bytedance.feedbackerlib.manager.m(this));
        this.j.findViewById(C0838R.id.ll_float_window_feedback_shrink).setVisibility(8);
        this.k = new m(this.x0, new n(this));
        this.i.setOnInterceptTouchEventListener(new o(this));
        this.i.setOnTouchListener(new p(this));
        SupportCustomInterceptLinearLayout supportCustomInterceptLinearLayout = (SupportCustomInterceptLinearLayout) this.f4822g.findViewById(C0838R.id.ll_record_pregress);
        this.G = supportCustomInterceptLinearLayout;
        this.H = (TextView) supportCustomInterceptLinearLayout.findViewById(C0838R.id.tv_record_progress);
        this.I = (ProgressBar) this.G.findViewById(C0838R.id.progress_bar);
        m mVar = new m(this.x0, new q(this));
        this.G.setOnInterceptTouchEventListener(new r(this, mVar));
        this.G.setOnTouchListener(new s(this, mVar));
        SupportCustomInterceptLinearLayout supportCustomInterceptLinearLayout2 = (SupportCustomInterceptLinearLayout) this.f4822g.findViewById(C0838R.id.ll_float_pic_video);
        this.N = supportCustomInterceptLinearLayout2;
        this.O = (TextView) supportCustomInterceptLinearLayout2.findViewById(C0838R.id.text_view);
        this.P = (ImageView) this.N.findViewById(C0838R.id.image_view);
        this.Q = (TextView) this.N.findViewById(C0838R.id.tv_video_length);
        this.N.setOnClickListener(new t(this));
        D0();
        if (Feedbacker.isFeedbackFunctionEnabled()) {
            try {
                this.x0.getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.z0);
            } catch (SecurityException e2) {
                StringBuilder M = e.a.a.a.a.M("exception=");
                M.append(e2.toString());
                com.bytedance.feedbackerlib.a.j0("SecurityException", "registerSystemScreenShotListener fails", M.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        this.A0.removeMessages(1024);
        this.A0.sendEmptyMessageDelayed(1024, WsConstants.EXIT_DELAY_TIME);
        this.A0.removeMessages(DownloadErrorCode.ERROR_CUR_BYTES_ZERO);
        this.A0.sendEmptyMessageDelayed(DownloadErrorCode.ERROR_CUR_BYTES_ZERO, 2500L);
        O0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(Uri uri) {
        String B = e.a.a.a.a.B(e.a.a.a.a.M("ScreenShotSucceed->"));
        if (Feedbacker.getApplicationContext() == null) {
            I0(B);
            return;
        }
        this.R = uri;
        F0(this.P, uri);
        this.O.setText(this.f4821f.g().a.get("sdk_screenshot_feedback"));
        this.O.setTextSize(1, m0(r5.getText().toString(), this.N.getWidth()));
        this.Q.setVisibility(8);
        int i2 = this.V;
        if (i2 != 3) {
            this.X = i2;
        }
        M0(3);
        if (t0(B)) {
            I0(B);
            return;
        }
        if (com.bytedance.feedbackerlib.model.b.F().K() && Feedbacker.isApplicationForegroundLogic() && com.bytedance.feedbackerlib.model.b.F().M()) {
            ViewTreeObserver viewTreeObserver = this.f4822g.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                Toast.makeText(this.x0, "observer is not alive", 0).show();
                return;
            }
            com.bytedance.feedbackerlib.util.l.b(viewTreeObserver, this.y0);
            com.bytedance.feedbackerlib.util.l.a(viewTreeObserver, this.y0);
            this.N.setX((this.Y - this.d0) - r5.getWidth());
            this.N.setY(((this.Z - this.a0) - this.c0) - r5.getHeight());
            this.f4818c.addView(this.f4822g, this.h);
            this.A0.postDelayed(new v(this), 2900L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        this.T = true;
        this.u.setText(this.f4821f.f("sdk2"));
        this.o.setText(this.f4821f.f("sdk3"));
        this.m.setText(this.f4821f.f("sdk4"));
        this.q.setText(this.f4821f.f("sdk2"));
        this.s.setText(this.f4821f.f("hide_float_window"));
        this.C.setText(this.f4821f.f("hide_float_window"));
        this.w.setText(this.f4821f.f("sdk4"));
        this.y.setText(this.f4821f.f("sdk3"));
        this.A.setText(this.f4821f.f("sdk2"));
        float m0 = m0(this.u.getText().toString(), this.w0);
        this.u.setTextSize(1, m0);
        this.o.setTextSize(1, m0);
        this.m.setTextSize(1, m0);
        this.q.setTextSize(1, m0);
        this.s.setTextSize(1, m0);
        this.C.setTextSize(1, m0);
        this.w.setTextSize(1, m0);
        this.y.setTextSize(1, m0);
        this.A.setTextSize(1, m0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0(@NonNull ImageView imageView, @NonNull Uri uri) {
        com.bytedance.lighten.core.j e2 = com.bytedance.lighten.core.g.e(uri);
        e2.a(ScaleType.CENTER_CROP);
        CircleOptions.b bVar = new CircleOptions.b();
        bVar.d(5.0f);
        e2.d(bVar.c());
        e2.c("FeedbackActivity");
        e2.x(imageView);
        e2.e();
    }

    public static void G0(boolean z) {
        D0 = z;
    }

    private void H0(@NonNull View view, int i2) {
        if (view == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        view.setLayoutParams(layoutParams);
    }

    private void J0(String str) {
        if (x0() && !C0) {
            com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "showFloatWindowRootView() is Shown()");
            com.bytedance.feedbackerlib.a.g0(str, "showFloatWindowRootView() is Shown()", new String[0]);
            return;
        }
        N0();
        ViewTreeObserver viewTreeObserver = this.f4822g.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            Toast.makeText(this.x0, "observer is not alive", 0).show();
            return;
        }
        com.bytedance.feedbackerlib.util.l.b(viewTreeObserver, this.y0);
        com.bytedance.feedbackerlib.util.l.a(viewTreeObserver, this.y0);
        viewTreeObserver.addOnGlobalLayoutListener(new j());
        if (C0) {
            if (this.a == null) {
                k0();
            }
            if (!y0()) {
                this.f4818c.addView(this.a, this.b);
            }
        } else {
            this.f4818c.addView(this.f4822g, this.h);
        }
        com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "mWindowManager.addView");
        com.bytedance.feedbackerlib.a.g0(str, "showFloatWindowRootView() is Shown()", new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0(int i2) {
        int i3;
        int i4 = this.V;
        if (i2 == i4) {
            return;
        }
        if (!this.S || i2 == 2) {
            this.S = true;
            int i5 = 0;
            if (i4 == 0) {
                if (i2 != 1) {
                    if (i2 != 3) {
                        return;
                    }
                    int x = (int) this.i.getX();
                    int y = (int) this.i.getY();
                    this.N.setX(x > this.Y / 2 ? (r2 - this.d0) - this.N.getWidth() : this.d0);
                    this.N.setY(y);
                    this.i.setVisibility(4);
                    this.N.setVisibility(0);
                    this.V = 3;
                    this.S = false;
                    this.A0.removeMessages(1025);
                    this.A0.sendEmptyMessageDelayed(1025, WsConstants.EXIT_DELAY_TIME);
                    return;
                }
                int i0 = i0();
                if (i0 == -1) {
                    return;
                }
                int y2 = (int) this.i.getY();
                int height = this.i.getHeight();
                int translationY = (int) this.j.getTranslationY();
                if (i0 == 0) {
                    j0(8388693, y2);
                    int i6 = this.W;
                    i3 = (i6 & 1) > 0 ? (i6 & 4) > 0 ? this.o0 : this.g0 : (i6 & 4) > 0 ? this.p0 : this.h0;
                } else {
                    j0(8388661, y2);
                    int i7 = this.W;
                    if ((i7 & 1) > 0) {
                        if ((i7 & 4) > 0) {
                            i3 = this.o0;
                            i5 = this.s0;
                        } else {
                            i3 = this.g0;
                            i5 = this.k0;
                        }
                    } else if ((i7 & 4) > 0) {
                        i3 = this.p0;
                        i5 = this.t0;
                    } else {
                        i3 = this.h0;
                        i5 = this.l0;
                    }
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(256L);
                ofFloat.addUpdateListener(new y(this, height, i3 - height, translationY, i5 - translationY));
                ofFloat.addListener(new C0671a(this, i0));
                ofFloat.start();
                return;
            }
            if (i4 == 1) {
                int i02 = i0();
                if (i2 == 0) {
                    if (i0() == -1) {
                        return;
                    }
                    int height2 = this.i.getHeight();
                    int translationY2 = (int) this.j.getTranslationY();
                    int i8 = this.f0 - height2;
                    int i9 = this.W;
                    int i10 = (i9 & 1) > 0 ? (i9 & 4) > 0 ? this.q0 : this.i0 : (i9 & 4) > 0 ? this.r0 : this.j0;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat2.setDuration(256L);
                    ofFloat2.addUpdateListener(new C0672b(this, height2, i8, translationY2, i10 - translationY2));
                    ofFloat2.addListener(new C0673c(this));
                    ofFloat2.start();
                    return;
                }
                if (i2 == 2) {
                    int y3 = i02 == 0 ? ((int) this.l.getY()) + ((int) this.i.getY()) : (((int) this.v.getY()) + ((int) this.i.getY())) - this.h0;
                    this.G.setX(((int) this.i.getX()) > this.Y / 2 ? (r2 - this.d0) - this.N.getWidth() : this.d0);
                    this.G.setY(y3);
                    this.i.setVisibility(4);
                    this.G.setVisibility(0);
                    this.V = 2;
                    this.S = false;
                    N0();
                    return;
                }
                if (i2 != 3) {
                    return;
                }
                int y4 = i02 == 0 ? ((int) this.l.getY()) + ((int) this.i.getY()) : (((int) this.v.getY()) + ((int) this.i.getY())) - this.h0;
                this.N.setX(((int) this.i.getX()) > this.Y / 2 ? (r2 - this.d0) - this.N.getWidth() : this.d0);
                this.N.setY(y4);
                this.i.setVisibility(4);
                this.N.setVisibility(0);
                this.V = 3;
                this.S = false;
                N0();
                this.A0.removeMessages(1025);
                this.A0.sendEmptyMessageDelayed(1025, WsConstants.EXIT_DELAY_TIME);
                return;
            }
            if (i4 == 2) {
                if (i2 != 3) {
                    return;
                }
                int x2 = (int) this.G.getX();
                int y5 = (int) this.G.getY();
                int i11 = this.Y;
                int width = x2 > i11 / 2 ? (i11 - this.d0) - this.N.getWidth() : this.d0;
                int height3 = this.N.getHeight() + y5;
                int i12 = this.Z;
                int i13 = this.d0;
                if (height3 > i12 - i13) {
                    y5 = ((i12 - this.a0) - i13) - this.N.getHeight();
                }
                this.N.setX(width);
                this.N.setY(y5);
                this.G.setVisibility(4);
                this.N.setVisibility(0);
                this.V = 3;
                this.S = false;
                N0();
                this.A0.removeMessages(1025);
                this.A0.sendEmptyMessageDelayed(1025, WsConstants.EXIT_DELAY_TIME);
                return;
            }
            if (i4 != 3) {
                return;
            }
            if (i2 == 0) {
                this.N.setVisibility(4);
                this.i.setVisibility(0);
                this.V = 0;
                this.S = false;
                N0();
                A0();
                return;
            }
            if (i2 == 1 || i2 == 2) {
                this.N.setVisibility(4);
                this.i.setVisibility(0);
                this.V = 1;
                this.S = false;
                N0();
                A0();
                return;
            }
            if (i2 != 3) {
                return;
            }
            this.A0.removeMessages(1025);
            this.A0.sendEmptyMessageDelayed(1025, WsConstants.EXIT_DELAY_TIME);
            this.S = false;
            N0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N0() {
        int i2 = v0() ? 2 : s0() ? 1 : 0;
        int i3 = this.Y >= this.Z ? i2 | 4 : i2 | 8;
        int i4 = i3 & 2;
        if (i4 == 0 && (i3 & 1) == 0) {
            com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "(windowMode & WindowMode.MODE_LIMITED) == 0 && (windowMode & WindowMode.MODE_NORMAL) == 0");
            q0();
            return;
        }
        if (this.W == i3 || this.S) {
            return;
        }
        this.T = true;
        if (i4 > 0) {
            this.r.setVisibility(8);
            this.B.setVisibility(8);
        } else if ((i3 & 1) > 0) {
            this.r.setVisibility(0);
            this.B.setVisibility(0);
        }
        int i5 = i3 & 4;
        if (i5 > 0) {
            H0(this.l, this.v0);
            H0(this.n, this.u0);
            H0(this.p, this.u0);
            H0(this.D, this.v0);
            H0(this.r, this.v0);
            H0(this.B, this.u0);
            H0(this.E, this.v0);
            H0(this.v, this.v0);
            H0(this.x, this.u0);
            H0(this.z, this.u0);
            LinearLayout linearLayout = this.z;
            int i6 = this.v0;
            if (linearLayout != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
                layoutParams.bottomMargin = i6;
                linearLayout.setLayoutParams(layoutParams);
            }
        } else if ((i3 & 8) > 0) {
            H0(this.l, this.n0);
            H0(this.n, this.m0);
            H0(this.p, this.m0);
            H0(this.D, this.n0);
            H0(this.r, this.n0);
            H0(this.B, this.m0);
            H0(this.E, this.n0);
            H0(this.v, this.n0);
            H0(this.x, this.m0);
            H0(this.z, this.m0);
            LinearLayout linearLayout2 = this.z;
            int i7 = this.n0;
            if (linearLayout2 != null) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) linearLayout2.getLayoutParams();
                layoutParams2.bottomMargin = i7;
                linearLayout2.setLayoutParams(layoutParams2);
            }
        }
        if (i4 > 0) {
            if (i5 > 0) {
                H0(this.t, this.v0);
            } else if ((i3 & 8) > 0) {
                H0(this.t, this.n0);
            }
        } else if ((i3 & 1) > 0) {
            if (i5 > 0) {
                H0(this.t, this.u0);
            } else if ((i3 & 8) > 0) {
                H0(this.t, this.m0);
            }
        }
        this.W = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(boolean z) {
        int i2;
        int i3;
        int height;
        int i4 = this.V;
        try {
            if (i4 != 2 && i4 != 3) {
                int x = (int) this.i.getX();
                int y = (int) this.i.getY();
                float x2 = this.i.getX();
                int i5 = this.Y;
                int i6 = x2 < ((float) i5) / 2.0f ? this.d0 : (i5 - this.d0) - this.e0;
                if (this.V == 0) {
                    float y2 = this.i.getY();
                    i2 = this.b0;
                    if (y2 >= i2) {
                        float y3 = this.i.getY() + this.i.getHeight();
                        int i7 = this.Z;
                        int i8 = this.c0;
                        if (y3 > i7 - i8) {
                            i3 = i7 - i8;
                            height = this.i.getHeight();
                            i2 = i3 - height;
                        }
                        i2 = y;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(50L);
                    ofFloat.addUpdateListener(new b(i6 - x, x, i2 - y, z, y));
                    ofFloat.start();
                } else {
                    float y4 = this.i.getY();
                    i2 = this.d0;
                    if (y4 >= i2) {
                        float y5 = this.i.getY() + this.i.getHeight();
                        int i9 = this.Z;
                        int i10 = this.a0;
                        int i11 = this.d0;
                        if (y5 > (i9 - i10) - i11) {
                            i3 = (i9 - i11) - i10;
                            height = this.i.getHeight();
                            i2 = i3 - height;
                        }
                        i2 = y;
                    }
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat2.setDuration(50L);
                    ofFloat2.addUpdateListener(new b(i6 - x, x, i2 - y, z, y));
                    ofFloat2.start();
                }
            } else if (i4 == 2) {
                int x3 = (int) this.G.getX();
                int y6 = (int) this.G.getY();
                float x4 = this.G.getX() + (this.G.getWidth() / 2);
                int i12 = this.Y;
                int width = x4 < ((float) i12) / 2.0f ? this.d0 : (i12 - this.d0) - this.G.getWidth();
                float y7 = this.G.getY();
                int i13 = this.b0;
                if (y7 >= i13) {
                    float y8 = this.G.getY() + this.G.getHeight();
                    int i14 = this.Z;
                    int i15 = this.c0;
                    i13 = y8 > ((float) (i14 - i15)) ? (i14 - i15) - this.G.getHeight() : y6;
                }
                ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat3.setDuration(50L);
                ofFloat3.addUpdateListener(new d(width - x3, x3, i13 - y6, y6));
                ofFloat3.start();
            } else {
                int x5 = (int) this.N.getX();
                int y9 = (int) this.N.getY();
                float x6 = this.N.getX() + (this.N.getWidth() / 2);
                int i16 = this.Y;
                int width2 = x6 < ((float) i16) / 2.0f ? this.d0 : (i16 - this.d0) - this.N.getWidth();
                float y10 = this.N.getY();
                int i17 = this.b0;
                if (y10 >= i17) {
                    float y11 = this.N.getY() + this.N.getHeight();
                    int i18 = this.Z;
                    int i19 = this.c0;
                    i17 = y11 > ((float) (i18 - i19)) ? (i18 - i19) - this.N.getHeight() : y9;
                }
                ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat4.setDuration(50L);
                ofFloat4.addUpdateListener(new e(width2 - x5, x5, i17 - y9, y9));
                ofFloat4.start();
            }
        } catch (RuntimeException unused) {
        }
    }

    static void a(k kVar, l.b bVar) {
        int x;
        int y;
        int width;
        int height;
        int i2 = kVar.V;
        if (i2 == 0 || i2 == 1) {
            x = (int) kVar.i.getX();
            y = (int) kVar.i.getY();
            width = kVar.i.getWidth() + x;
            height = kVar.i.getHeight();
        } else if (i2 == 3) {
            x = (int) kVar.N.getX();
            y = (int) kVar.N.getY();
            width = kVar.N.getWidth() + x;
            height = kVar.N.getHeight();
        } else {
            x = (int) kVar.G.getX();
            y = (int) kVar.G.getY();
            width = kVar.G.getWidth() + x;
            height = kVar.G.getHeight();
        }
        Region region = new Region(x, y, width, height + y);
        Objects.requireNonNull(bVar);
        bVar.f4991c.set(region);
        bVar.c(3);
    }

    static void b(k kVar, boolean z, Uri uri) {
        PackageManager packageManager;
        if ((kVar.s0() || kVar.v0()) && uri != null && uri.toString().contains(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) && (packageManager = kVar.x0.getPackageManager()) != null) {
            if (packageManager.checkPermission("android.permission.READ_EXTERNAL_STORAGE", kVar.x0.getPackageName()) == 0) {
                kVar.z0(uri);
            } else {
                TranslucentOnePixelActivity.l(kVar.x0, new x(kVar, z, uri), new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
            }
        }
    }

    static void e0(k kVar, int i2) {
        Resources resources = kVar.x0.getResources();
        kVar.f0 = (resources.getDimensionPixelSize(C0838R.dimen.dp_7) * 2) + kVar.t.getHeight();
        if ((i2 & 4) > 0) {
            kVar.g0 = kVar.t.getHeight() + kVar.t.getTop() + kVar.v0;
            kVar.k0 = (-kVar.t.getTop()) + kVar.v0;
        } else {
            kVar.g0 = kVar.t.getHeight() + kVar.t.getTop() + kVar.n0;
            kVar.k0 = (-kVar.t.getTop()) + kVar.n0;
        }
        int i3 = kVar.g0;
        kVar.h0 = i3;
        kVar.o0 = i3;
        kVar.p0 = i3;
        int i4 = kVar.k0;
        kVar.l0 = i4;
        kVar.s0 = i4;
        kVar.t0 = i4;
        int dimensionPixelSize = resources.getDimensionPixelSize(C0838R.dimen.dp_8) + (-kVar.t.getTop());
        kVar.i0 = dimensionPixelSize;
        kVar.j0 = dimensionPixelSize;
        kVar.q0 = dimensionPixelSize;
        kVar.r0 = dimensionPixelSize;
    }

    static void f0(k kVar) {
        int i2;
        int i3 = kVar.V;
        if (i3 == 0 || (i2 = kVar.X) == 0) {
            com.bytedance.feedbackerlib.a.K0(kVar.i, kVar.f0);
            int i4 = kVar.W;
            if ((i4 & 1) > 0) {
                if ((i4 & 4) > 0) {
                    kVar.j.setTranslationY(kVar.q0);
                    return;
                } else {
                    if ((i4 & 8) > 0) {
                        kVar.j.setTranslationY(kVar.i0);
                        return;
                    }
                    return;
                }
            }
            if ((i4 & 2) > 0) {
                if ((i4 & 4) > 0) {
                    kVar.j.setTranslationY(kVar.r0);
                    return;
                } else {
                    if ((i4 & 8) > 0) {
                        kVar.j.setTranslationY(kVar.j0);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (i3 == 1 || i2 == 1) {
            int i0 = kVar.i0();
            int i5 = kVar.W;
            if ((i5 & 1) > 0) {
                if ((i5 & 4) > 0) {
                    com.bytedance.feedbackerlib.a.K0(kVar.i, kVar.o0);
                    if (i0 == 0) {
                        kVar.j.setTranslationY(0);
                        return;
                    } else {
                        kVar.j.setTranslationY(kVar.s0);
                        return;
                    }
                }
                if ((i5 & 8) > 0) {
                    com.bytedance.feedbackerlib.a.K0(kVar.i, kVar.g0);
                    if (i0 == 0) {
                        kVar.j.setTranslationY(0);
                        return;
                    } else {
                        kVar.j.setTranslationY(kVar.k0);
                        return;
                    }
                }
                return;
            }
            if ((i5 & 2) > 0) {
                if ((i5 & 4) > 0) {
                    com.bytedance.feedbackerlib.a.K0(kVar.i, kVar.p0);
                    if (i0 == 0) {
                        kVar.j.setTranslationY(0);
                        return;
                    } else {
                        kVar.j.setTranslationY(kVar.t0);
                        return;
                    }
                }
                if ((i5 & 8) > 0) {
                    com.bytedance.feedbackerlib.a.K0(kVar.i, kVar.h0);
                    if (i0 == 0) {
                        kVar.j.setTranslationY(0);
                    } else {
                        kVar.j.setTranslationY(kVar.l0);
                    }
                }
            }
        }
    }

    private int i0() {
        int i2;
        int i3 = this.V;
        if (i3 != 0 && i3 != 1 && (i2 = this.X) != 0 && i2 != 1) {
            return -1;
        }
        if (i3 == 0 || this.X == 0) {
            int y = this.f0 + ((int) this.i.getY());
            int i4 = this.W;
            return ((i4 & 1) > 0 ? (i4 & 4) > 0 ? this.o0 : this.g0 : (i4 & 4) > 0 ? this.p0 : this.h0) < y ? 0 : 1;
        }
        int translationY = (int) this.j.getTranslationY();
        if (translationY == 0) {
            return 0;
        }
        return (translationY == this.l0 || translationY == this.k0 || translationY == this.t0 || translationY == this.s0) ? 1 : -1;
    }

    private void j0(int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.i.getLayoutParams();
        layoutParams.gravity = i2;
        this.i.setLayoutParams(layoutParams);
        this.i.post(new l(i3));
    }

    private void k0() {
        if (this.b == null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.b = layoutParams;
            layoutParams.type = 2038;
            layoutParams.format = 1;
            layoutParams.flags = 40;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.gravity = 8388659;
        }
        if (this.U == 0) {
            this.b.x = (int) this.i.getX();
            this.b.y = (int) this.i.getY();
        } else {
            this.b.x = (int) this.G.getX();
            this.b.y = (int) this.G.getY();
        }
        if (this.a == null) {
            View inflate = LayoutInflater.from(this.x0).inflate(C0838R.layout.feedbacker_shrunk_float_window, (ViewGroup) null);
            this.a = inflate;
            this.M = inflate.findViewById(C0838R.id.ll_shrunk_float_window_initial);
            SupportCustomInterceptLinearLayout supportCustomInterceptLinearLayout = (SupportCustomInterceptLinearLayout) this.a.findViewById(C0838R.id.ll_shrunk_record_pregress);
            this.f4817J = supportCustomInterceptLinearLayout;
            this.K = (TextView) supportCustomInterceptLinearLayout.findViewById(C0838R.id.tv_shrunk_record_progress);
            this.L = (ProgressBar) this.f4817J.findViewById(C0838R.id.shrunk_progress_bar);
            this.a.setOnTouchListener(new g());
        }
    }

    private boolean l0() {
        if (this.f4818c != null) {
            return true;
        }
        WindowManager windowManager = (WindowManager) this.x0.getSystemService("window");
        this.f4818c = windowManager;
        return windowManager != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int m0(@NonNull String str, int i2) {
        TextView textView = new TextView(this.x0);
        for (int i3 = 12; i3 >= 7; i3--) {
            textView.setTextSize(1, i3);
            float textSize = textView.getTextSize();
            Paint paint = new Paint();
            Rect rect = new Rect();
            paint.setTextSize(textSize);
            paint.getTextBounds(str, 0, str.length(), rect);
            if (rect.width() < i2 - 1) {
                return i3;
            }
        }
        for (int i4 = 12; i4 >= 7; i4--) {
            textView.setTextSize(1, i4);
            String substring = str.substring(str.length() / 2);
            float textSize2 = textView.getTextSize();
            Paint paint2 = new Paint();
            Rect rect2 = new Rect();
            paint2.setTextSize(textSize2);
            paint2.getTextBounds(substring, 0, substring.length(), rect2);
            if (rect2.width() < i2 - 5) {
                return i4;
            }
        }
        return 7;
    }

    static void n(k kVar, Message message) {
        Objects.requireNonNull(kVar);
        switch (message.what) {
            case 1024:
                if (kVar.V == 0) {
                    kVar.i.setBackgroundResource(C0838R.drawable.background_feedback_container_init_high_translucent);
                }
                kVar.K0();
                break;
            case 1025:
                kVar.M0(kVar.X);
                break;
            case DownloadErrorCode.ERROR_CUR_BYTES_ZERO /* 1026 */:
                if (kVar.V == 1) {
                    kVar.M0(0);
                    break;
                }
                break;
        }
    }

    @RequiresApi(api = 21)
    public static k n0(@NonNull Context context) {
        if (B0 == null) {
            synchronized (k.class) {
                if (B0 == null) {
                    B0 = new k(context);
                }
            }
        }
        return B0;
    }

    static void p(k kVar) {
        Objects.requireNonNull(kVar);
        StringBuilder sb = new StringBuilder();
        sb.append("ScreenShotClick->");
        String B = e.a.a.a.a.B(sb);
        if (kVar.S) {
            return;
        }
        kVar.q0();
        kVar.A0.removeMessages(1025);
        kVar.A0.removeMessages(DownloadErrorCode.ERROR_CUR_BYTES_ZERO);
        com.bytedance.feedbackerlib.a.e0("screen_shot", null);
        kVar.f4819d.n(new u(kVar, B));
    }

    static void q(k kVar) {
        if (kVar.S) {
            return;
        }
        kVar.A0.removeMessages(1025);
        kVar.A0.removeMessages(DownloadErrorCode.ERROR_CUR_BYTES_ZERO);
        kVar.f4820e.M(new w(kVar));
        com.bytedance.feedbackerlib.a.e0("screen_record", null);
    }

    private void q0() {
        if (x0() || C0) {
            ViewTreeObserver viewTreeObserver = this.f4822g.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                com.bytedance.feedbackerlib.util.l.b(viewTreeObserver, this.y0);
            }
            if (!C0) {
                this.f4818c.removeView(this.f4822g);
            } else if (y0()) {
                this.f4818c.removeView(this.a);
            }
        }
    }

    static void r(k kVar) {
        if (kVar.S) {
            return;
        }
        if (kVar.V == 1) {
            kVar.M0(0);
        }
        FeedbackActivity.j0(kVar.x0, null);
        com.bytedance.feedbackerlib.a.e0("report_bug", null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        this.Y = -1;
        this.Z = -1;
        if (l0()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            this.f4818c.getDefaultDisplay().getMetrics(displayMetrics);
            this.Y = displayMetrics.widthPixels;
            this.Z = displayMetrics.heightPixels;
        }
    }

    static void s(k kVar) {
        Context context = kVar.x0;
        int i2 = DialogActivity.f4759f;
        if (context != null && context.getApplicationContext() != null) {
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) DialogActivity.class);
            intent.setAction("action_show_hide_hide_float_window_dialog");
            intent.addFlags(268435456);
            context.getApplicationContext().startActivity(intent);
        }
        if (kVar.V == 1) {
            kVar.M0(0);
        }
    }

    private boolean s0() {
        if (com.bytedance.feedbackerlib.model.b.F().A() != 1 || !Feedbacker.isFloatWindowEnable()) {
            return false;
        }
        if (Feedbacker.isFirstLaunchAfterUpgrade()) {
            return true;
        }
        return Calendar.getInstance().get(7) == 1 || !SharedPreferencesUtils.BOOLEAN_CACHE.HIDE_FLOAT_WINDOW.get(false);
    }

    static void t(k kVar) {
        int i2 = kVar.V;
        if (i2 == 0) {
            kVar.M0(1);
        } else if (i2 == 1) {
            kVar.M0(0);
        }
    }

    private boolean t0(String str) {
        com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "isFloatWindowCloudShow() is invoked");
        if (!Feedbacker.isFeedbackFunctionEnabled()) {
            com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "Feedback function is closed");
            com.bytedance.feedbackerlib.a.g0(str, "Feedback function is closed", new String[0]);
            return false;
        }
        if (!s0() && !v0()) {
            StringBuilder M = e.a.a.a.a.M("isDailyFeedbackEnabled() is ");
            M.append(s0());
            M.append(", isLimitedFeedbackEnabled() is ");
            M.append(v0());
            com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", M.toString());
            StringBuilder M2 = e.a.a.a.a.M("isDailyFeedbackEnabled() is ");
            M2.append(s0());
            M2.append(", isLimitedFeedbackEnabled() is ");
            M2.append(v0());
            com.bytedance.feedbackerlib.a.g0(str, "isFloatWindowCloudShow is invoked", M2.toString());
            return false;
        }
        if (!com.bytedance.feedbackerlib.model.b.F().M()) {
            com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "FeedbackModel.getInstance().isSSOVerified() is false");
            com.bytedance.feedbackerlib.a.g0(str, "FeedbackModel.getInstance().isSSOVerified() is false", new String[0]);
            return false;
        }
        StringBuilder M3 = e.a.a.a.a.M("isApplicationForegroundLogic() is ");
        M3.append(Feedbacker.isApplicationForegroundLogic());
        com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", M3.toString());
        com.bytedance.feedbackerlib.a.g0(str, "isApplicationForegroundLogic() is " + Feedbacker.isApplicationForegroundLogic(), new String[0]);
        return Feedbacker.isApplicationForegroundLogic();
    }

    static void v(k kVar, MotionEvent motionEvent) {
        Objects.requireNonNull(kVar);
        if (motionEvent.getAction() == 0) {
            kVar.A0.removeMessages(DownloadErrorCode.ERROR_CUR_BYTES_ZERO);
            kVar.A0.removeMessages(1024);
            kVar.i.setBackgroundResource(C0838R.drawable.background_feedback_container_init);
        }
        if (motionEvent.getAction() == 1) {
            kVar.A0();
        }
    }

    private boolean v0() {
        ContentResolver contentResolver = Feedbacker.getApplicationContext().getContentResolver();
        String string = contentResolver != null ? Settings.Global.getString(contentResolver, "feedbacker_force_float_window_token") : "";
        if (TextUtils.isEmpty(string) || !"default_force_float_window_token".equals(string)) {
            return com.bytedance.feedbackerlib.model.b.F().L();
        }
        return true;
    }

    public static boolean w0() {
        return Build.VERSION.SDK_INT >= 31;
    }

    static void z(k kVar) {
        kVar.f4820e.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c4, code lost:
    
        throw r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z0(android.net.Uri r12) {
        /*
            r11 = this;
            java.lang.String r12 = "date_added"
            int r0 = r11.V
            if (r0 == 0) goto Ld
            r1 = 3
            if (r0 == r1) goto Ld
            r1 = 1
            if (r0 == r1) goto Ld
            return
        Ld:
            android.content.Context r0 = r11.x0
            android.content.ContentResolver r0 = r0.getContentResolver()
            if (r0 != 0) goto L16
            return
        L16:
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> Lc5
            r7 = 0
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Lc5
            r4 = 0
            r5 = 0
            java.lang.String r6 = "date_added desc limit 1"
            r1 = r0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc5
            if (r8 != 0) goto L27
            return
        L27:
            boolean r1 = r8.moveToFirst()     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L31
            r8.close()
            return
        L31:
            java.lang.String r1 = "_display_name"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = r8.getString(r1)     // Catch: java.lang.Throwable -> Lc0
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto L45
            r8.close()
            return
        L45:
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "screen"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r2 == 0) goto Lbc
            java.lang.String r2 = "shot"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> Lc0
            if (r1 != 0) goto L5a
            goto Lbc
        L5a:
            java.lang.String r1 = "width"
            int r1 = r8.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lc0
            int r1 = r8.getInt(r1)     // Catch: java.lang.Throwable -> Lc0
            int r2 = r11.Y     // Catch: java.lang.Throwable -> Lc0
            if (r1 == r2) goto L6c
            r8.close()
            return
        L6c:
            int r1 = r8.getColumnIndex(r12)     // Catch: java.lang.Throwable -> Lc0
            long r9 = r8.getLong(r1)     // Catch: java.lang.Throwable -> Lc0
            android.net.Uri r2 = android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> Lc0
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> Lc0
            r4 = 0
            r5 = 0
            java.lang.String r6 = "date_added desc limit 1"
            r1 = r0
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto La5
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L9c
            int r12 = r0.getColumnIndex(r12)     // Catch: java.lang.Throwable -> La0
            long r1 = r0.getLong(r12)     // Catch: java.lang.Throwable -> La0
            int r12 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r12 <= 0) goto L9c
            r0.close()     // Catch: java.lang.Throwable -> Lc0
            r8.close()
            return
        L9c:
            r0.close()     // Catch: java.lang.Throwable -> Lc0
            goto La5
        La0:
            r12 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lc0
            throw r12     // Catch: java.lang.Throwable -> Lc0
        La5:
            java.lang.String r12 = "_id"
            int r12 = r8.getColumnIndex(r12)     // Catch: java.lang.Throwable -> Lc0
            android.net.Uri r0 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI     // Catch: java.lang.Throwable -> Lc0
            long r1 = r8.getLong(r12)     // Catch: java.lang.Throwable -> Lc0
            android.net.Uri r12 = android.content.ContentUris.withAppendedId(r0, r1)     // Catch: java.lang.Throwable -> Lc0
            r11.C0(r12)     // Catch: java.lang.Throwable -> Lc0
            r8.close()
            return
        Lbc:
            r8.close()
            return
        Lc0:
            r12 = move-exception
            r8.close()
            throw r12
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.feedbackerlib.manager.k.z0(android.net.Uri):void");
    }

    public void B0(String str) {
        boolean z = C0;
        if (z) {
            E0(false);
        }
        q0();
        this.A0.post(new RunnableC0229k(str, z));
    }

    public void E0(boolean z) {
        if (C0 && w0()) {
            if (!y0()) {
                C0 = false;
                return;
            }
            C0 = false;
            this.f4818c.removeView(this.a);
            if (this.U == 0) {
                this.i.setX(this.b.x);
                this.i.setY(this.b.y);
            } else {
                this.G.setX(this.b.x);
                this.G.setY(this.b.y);
            }
            this.i.setBackgroundResource(C0838R.drawable.background_feedback_container_init);
            J0("show original float window");
            if (z) {
                M0(0);
                int i2 = this.V;
                if (i2 == 0) {
                    M0(1);
                } else if (i2 == 1) {
                    M0(0);
                }
            }
        }
    }

    public void I0(String str) {
        boolean z;
        com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "FloatWindowService show() is invoked");
        com.bytedance.feedbackerlib.a.g0(str, "FloatWindowService show() is invoked", new String[0]);
        if (!t0(str)) {
            com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "isFloatWindowCloudShow() is false");
            com.bytedance.feedbackerlib.a.g0(str, "FloatWindowService show(): isFloatWindowCloudShow() is false", new String[0]);
            q0();
            return;
        }
        if (Settings.canDrawOverlays(this.x0)) {
            z = true;
        } else {
            Context context = this.x0;
            RequestOverlayWindowPermissionActivity.State state = RequestOverlayWindowPermissionActivity.State.ASK;
            int i2 = RequestOverlayWindowPermissionActivity.i;
            synchronized (RequestOverlayWindowPermissionActivity.class) {
                com.bytedance.feedbackerlib.a.g0(str, "RequestOverlayWindowPermissionActivity launchActivity invoked", new String[0]);
                com.bytedance.feedbackerlib.a.R("RequestOverlayWindowPermissionActivity show", "launchActivity invoked");
                if (SharedPreferencesUtils.BOOLEAN_CACHE.HAS_DENIED_OVERLAY_PERMISSION.get(false)) {
                    com.bytedance.feedbackerlib.a.R("RequestOverlayWindowPermissionActivity show", "HAS_DENIED_OVERLAY_PERMISSION is true");
                    com.bytedance.feedbackerlib.a.g0(str, "RequestOverlayWindowPermissionActivity HAS_DENIED_OVERLAY_PERMISSION is true", new String[0]);
                } else {
                    Intent intent = new Intent(context, (Class<?>) RequestOverlayWindowPermissionActivity.class);
                    intent.putExtra("extra_state", state);
                    intent.putExtra("extra_log_id", str);
                    intent.addFlags(268435456);
                    try {
                        context.startActivity(intent);
                    } catch (Throwable unused) {
                    }
                }
            }
            z = false;
        }
        com.bytedance.feedbackerlib.a.R("FloatWindowManagerExt show", "hasPermission is " + z);
        com.bytedance.feedbackerlib.a.g0(str, "FloatWindowService show(): hasPermission is " + z, new String[0]);
        if (z) {
            if (!l0()) {
                Toast.makeText(this.x0, this.f4821f.f("sdk29"), 0).show();
                return;
            }
            if (!(this.Y > 0 && this.Z > 0)) {
                Toast.makeText(this.x0, this.f4821f.f("sdk30"), 0).show();
            } else {
                J0(str);
                this.i.post(new i());
            }
        }
    }

    public void K0() {
        if (C0 || !w0() || D0 || !x0()) {
            return;
        }
        this.U = 0;
        int i2 = this.V;
        if (i2 == 2 || i2 == 3) {
            return;
        }
        q0();
        k0();
        this.M.setVisibility(0);
        this.f4817J.setVisibility(8);
        this.f4818c.addView(this.a, this.b);
        C0 = true;
    }

    public void L0() {
        if (this.W == 2 || !w0()) {
            return;
        }
        this.U = 2;
        q0();
        k0();
        this.M.setVisibility(8);
        this.f4817J.setVisibility(0);
        this.f4818c.addView(this.a, this.b);
        C0 = true;
    }

    public String o0() {
        return this.Y + "*" + (this.Z + this.a0);
    }

    public void p0() {
        q0();
    }

    public boolean u0() {
        int i2 = this.V;
        return i2 == 0 || i2 == 3 || i2 == 2;
    }

    public boolean x0() {
        return this.f4822g.getParent() != null;
    }

    public boolean y0() {
        View view = this.a;
        return (view == null || view.getParent() == null) ? false : true;
    }
}
