package com.bytedance.android.input.speech.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.wave.AudioVisualizerOpt;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;

/* loaded from: classes.dex */
public final class AsrWaveView extends FrameLayout implements View.OnClickListener {
    private final String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private AudioVisualizerOpt f3169c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f3170d;

    /* renamed from: e, reason: collision with root package name */
    private AudioVisualizerOpt f3171e;

    /* renamed from: f, reason: collision with root package name */
    private AudioVisualizerOpt f3172f;

    /* renamed from: g, reason: collision with root package name */
    private LinearLayout f3173g;
    private LinearLayout h;
    private LottieAnimationView i;
    private boolean j;
    private final Handler k;
    private final Runnable l;
    private boolean m;
    private boolean n;

    static final class a implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        a(kotlin.s.b.l lVar) {
            kotlin.s.c.l.f(lVar, "function");
            this.a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.s.c.h)) {
                return kotlin.s.c.l.a(this.a, ((kotlin.s.c.h) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.s.c.h
        public final kotlin.b<?> getFunctionDelegate() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AsrWaveView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    private final void a() {
        Object J2;
        try {
            TextView textView = this.f3170d;
            if (textView != null) {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                textView.setTextSize(1, com.bytedance.android.input.keyboard.areacontrol.k.c(15.0f));
            }
            com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
            Resources system = Resources.getSystem();
            kotlin.s.c.l.e(system, "Resources.getSystem()");
            int c2 = (int) com.bytedance.android.input.keyboard.areacontrol.k.c(TypedValue.applyDimension(1, 20, system.getDisplayMetrics()));
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, this.i, Integer.valueOf(c2), Integer.valueOf(c2), null, null, null, null, 120);
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("adjustUISize exception "), this.a);
        }
    }

    private final void b() {
        AudioVisualizerOpt audioVisualizerOpt = this.f3169c;
        if (audioVisualizerOpt != null) {
            audioVisualizerOpt.setUseGray(true);
        }
        AudioVisualizerOpt audioVisualizerOpt2 = this.f3171e;
        if (audioVisualizerOpt2 != null) {
            audioVisualizerOpt2.setUseGray(true);
        }
        AudioVisualizerOpt audioVisualizerOpt3 = this.f3172f;
        if (audioVisualizerOpt3 != null) {
            audioVisualizerOpt3.setUseGray(true);
        }
        this.n = false;
        com.bytedance.android.input.r.j.i(this.a, "defaultUI");
    }

    public static void c(AsrWaveView asrWaveView) {
        kotlin.s.c.l.f(asrWaveView, "this$0");
        e.a.a.a.a.N0(e.a.a.a.a.M("delayChange, asrAudioStop = "), asrWaveView.j, asrWaveView.a);
        if (asrWaveView.j) {
            return;
        }
        AudioVisualizerOpt audioVisualizerOpt = asrWaveView.f3169c;
        if (audioVisualizerOpt != null) {
            audioVisualizerOpt.setVisibility(0);
        }
        LinearLayout linearLayout = asrWaveView.f3173g;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        asrWaveView.e();
    }

    private final void e() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        LottieAnimationView lottieAnimationView2 = this.i;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.clearAnimation();
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("[AsrState] release lottie Animation---KeyboardView.getStretchScale() = ");
        M.append(KeyboardView.getStretchScale());
        com.bytedance.android.input.r.j.i(str, M.toString());
    }

    private final void f() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView2 = this.i;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setRepeatCount(-1);
        }
        LottieAnimationView lottieAnimationView3 = this.i;
        if (lottieAnimationView3 != null) {
            lottieAnimationView3.q();
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("[AsrState] play lottie Animation---KeyboardView.getStretchScale() = ");
        M.append(KeyboardView.getStretchScale());
        com.bytedance.android.input.r.j.i(str, M.toString());
    }

    private final void i() {
        if (this.m) {
            AudioVisualizerOpt audioVisualizerOpt = this.f3169c;
            if (audioVisualizerOpt != null) {
                audioVisualizerOpt.setVisibility(8);
            }
            LinearLayout linearLayout = this.f3173g;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        AudioVisualizerOpt audioVisualizerOpt2 = this.f3169c;
        if (audioVisualizerOpt2 != null) {
            audioVisualizerOpt2.setVisibility(0);
        }
        LinearLayout linearLayout2 = this.f3173g;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        e();
    }

    public final void d(boolean z) {
        Object J2;
        e.a.a.a.a.y0("[AsrState] prepareUIStateChange show = ", z, this.a);
        if (!z) {
            e();
            return;
        }
        try {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            Resources system = Resources.getSystem();
            kotlin.s.c.l.e(system, "Resources.getSystem()");
            com.bytedance.android.input.basic.d.c.a(com.bytedance.android.input.basic.d.c.a, this, -1, Integer.valueOf((int) com.bytedance.android.input.keyboard.areacontrol.k.c(TypedValue.applyDimension(1, 56, system.getDisplayMetrics()))), null, null, null, null, 120);
            J2 = kotlin.o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = kotlin.h.b(J2);
        if (b != null) {
            e.a.a.a.a.P0(b, e.a.a.a.a.M("adjustContainerUISize exception "), this.a);
        }
        a();
    }

    public final void g(String str, boolean z, boolean z2) {
        kotlin.s.c.l.f(str, "text");
        String str2 = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append("[AsrState] updateAsrStatus, text = ");
        sb.append(str);
        sb.append(", isStop = ");
        sb.append(z);
        sb.append("---isError = ");
        sb.append(z2);
        sb.append("---mHaveStartTip = ");
        e.a.a.a.a.N0(sb, this.m, str2);
        if (!this.m && !z) {
            i();
            return;
        }
        this.j = z;
        boolean z3 = true;
        if (str.length() == 0) {
            AudioVisualizerOpt audioVisualizerOpt = this.f3169c;
            if (audioVisualizerOpt != null) {
                audioVisualizerOpt.setVisibility(0);
            }
            LinearLayout linearLayout = this.f3173g;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } else {
            TextView textView = this.f3170d;
            if (textView != null) {
                textView.setText(str);
            }
            a();
            AudioVisualizerOpt audioVisualizerOpt2 = this.f3169c;
            if (audioVisualizerOpt2 != null) {
                audioVisualizerOpt2.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f3173g;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            if (this.j) {
                if (z2) {
                    AudioVisualizerOpt audioVisualizerOpt3 = this.f3171e;
                    if (audioVisualizerOpt3 != null) {
                        audioVisualizerOpt3.setUseGray(true);
                    }
                    AudioVisualizerOpt audioVisualizerOpt4 = this.f3172f;
                    if (audioVisualizerOpt4 != null) {
                        audioVisualizerOpt4.setUseGray(true);
                    }
                } else {
                    AudioVisualizerOpt audioVisualizerOpt5 = this.f3171e;
                    if (audioVisualizerOpt5 != null) {
                        audioVisualizerOpt5.setNotDraw(true);
                    }
                    AudioVisualizerOpt audioVisualizerOpt6 = this.f3172f;
                    if (audioVisualizerOpt6 != null) {
                        audioVisualizerOpt6.setNotDraw(true);
                    }
                }
                this.k.removeCallbacks(this.l);
            } else {
                AudioVisualizerOpt audioVisualizerOpt7 = this.f3171e;
                if (audioVisualizerOpt7 != null) {
                    audioVisualizerOpt7.setNotDraw(false);
                }
                AudioVisualizerOpt audioVisualizerOpt8 = this.f3172f;
                if (audioVisualizerOpt8 != null) {
                    audioVisualizerOpt8.setNotDraw(false);
                }
                this.k.removeCallbacks(this.l);
                this.k.postDelayed(this.l, WsConstants.EXIT_DELAY_TIME);
            }
        }
        try {
            if (str.length() != 0) {
                z3 = false;
            }
            if (z3 || !kotlin.s.c.l.a(str, getContext().getString(C0838R.string.asr_recognize))) {
                LinearLayout linearLayout3 = this.f3173g;
                if (linearLayout3 != null) {
                    linearLayout3.setBackgroundResource(C0838R.color.transparent);
                }
                e();
                return;
            }
            if (IAppGlobals.a.K()) {
                LinearLayout linearLayout4 = this.f3173g;
                if (linearLayout4 != null) {
                    linearLayout4.setBackgroundResource(C0838R.color.transparent);
                }
            } else {
                LinearLayout linearLayout5 = this.f3173g;
                if (linearLayout5 != null) {
                    linearLayout5.setBackgroundResource(C0838R.color.navigation_bar_normal);
                }
            }
            f();
        } catch (Throwable th) {
            r.J(th);
        }
    }

    public final void h(byte[] bArr) {
        kotlin.s.c.l.f(bArr, RemoteMessageConst.DATA);
        if (this.j) {
            return;
        }
        if (!this.n) {
            AudioVisualizerOpt audioVisualizerOpt = this.f3169c;
            if (audioVisualizerOpt != null) {
                audioVisualizerOpt.setUseGray(false);
            }
            AudioVisualizerOpt audioVisualizerOpt2 = this.f3171e;
            if (audioVisualizerOpt2 != null) {
                audioVisualizerOpt2.setUseGray(false);
            }
            AudioVisualizerOpt audioVisualizerOpt3 = this.f3172f;
            if (audioVisualizerOpt3 != null) {
                audioVisualizerOpt3.setUseGray(false);
            }
            this.n = true;
            com.bytedance.android.input.r.j.i(this.a, "waveStateUI");
        }
        LinearLayout linearLayout = this.f3173g;
        if (!(linearLayout != null && com.obric.oui.common.util.b.e(linearLayout))) {
            AudioVisualizerOpt audioVisualizerOpt4 = this.f3169c;
            if (audioVisualizerOpt4 != null) {
                audioVisualizerOpt4.setAudioData(bArr);
                return;
            }
            return;
        }
        AudioVisualizerOpt audioVisualizerOpt5 = this.f3171e;
        if (audioVisualizerOpt5 != null) {
            audioVisualizerOpt5.setAudioData(bArr);
        }
        AudioVisualizerOpt audioVisualizerOpt6 = this.f3172f;
        if (audioVisualizerOpt6 != null) {
            audioVisualizerOpt6.setAudioData(bArr);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        com.bytedance.android.input.r.j.i(this.a, "onClick");
        if (this.m) {
            AsrManager.a.p0(false, "tool");
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        com.bytedance.android.input.r.j.i(this.a, "onVisibilityChanged visibility = " + i + ", view = " + view);
        if (i == 0) {
            this.j = false;
            return;
        }
        this.j = true;
        b();
        i();
    }

    public final void setHaveStartTip(boolean z) {
        e.a.a.a.a.y0("setHaveStartTip, haveStartTip = ", z, this.a);
        this.m = z;
        i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrWaveView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        FrameLayout.inflate(context, C0838R.layout.layout_asr_wave_view, this);
        if (this.b) {
            com.bytedance.android.input.r.j.i(this.a, "initView, already initialized");
        } else {
            this.f3169c = (AudioVisualizerOpt) findViewById(C0838R.id.asr_visualizer_only);
            this.f3170d = (TextView) findViewById(C0838R.id.asr_visualizer_tip);
            this.i = (LottieAnimationView) findViewById(C0838R.id.asr_recognize_animation);
            this.f3171e = (AudioVisualizerOpt) findViewById(C0838R.id.asr_visualizer_left);
            this.f3172f = (AudioVisualizerOpt) findViewById(C0838R.id.asr_visualizer_right);
            this.f3173g = (LinearLayout) findViewById(C0838R.id.asr_visualizer_ll);
            this.h = (LinearLayout) findViewById(C0838R.id.asr_root_ll);
            b();
            i();
            LinearLayout linearLayout = this.h;
            if (linearLayout != null) {
                linearLayout.setOnClickListener(this);
            }
            a();
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("[AsrState] initView KeyboardView.getStretchScale() = ");
            M.append(KeyboardView.getStretchScale());
            com.bytedance.android.input.r.j.i(str, M.toString());
            this.b = true;
            l.a.r().observeForever(new a(new m(this)));
        }
        this.a = "Asr-WaveView";
        this.j = true;
        this.k = new Handler(Looper.getMainLooper());
        this.l = new Runnable() { // from class: com.bytedance.android.input.speech.view.f
            @Override // java.lang.Runnable
            public final void run() {
                AsrWaveView.c(AsrWaveView.this);
            }
        };
        this.m = true;
    }
}
