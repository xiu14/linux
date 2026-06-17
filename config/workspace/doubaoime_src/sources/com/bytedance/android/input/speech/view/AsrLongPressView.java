package com.bytedance.android.input.speech.view;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.long_press.AsrEllipseView;
import com.bytedance.android.input.speech.long_press.AsrNotchedEllipseView;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AsrLongPressView extends FrameLayout {
    private final String a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private int f3152c;

    /* renamed from: d, reason: collision with root package name */
    private AsrNotchedEllipseView f3153d;

    /* renamed from: e, reason: collision with root package name */
    private AsrEllipseView f3154e;

    /* renamed from: f, reason: collision with root package name */
    private AsrWaveView f3155f;

    /* renamed from: g, reason: collision with root package name */
    private long f3156g;

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
    public AsrLongPressView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void a(AsrLongPressView asrLongPressView) {
        Objects.requireNonNull(asrLongPressView);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - asrLongPressView.f3156g > com.heytap.mcssdk.constant.a.r) {
            asrLongPressView.f3156g = currentTimeMillis;
            AsrManager.a.x();
        }
    }

    public final AsrWaveView d() {
        return this.f3155f;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        Typeface typeface;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i2);
        TextView textView = (TextView) findViewById(C0838R.id.asr_long_press_text);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            layoutParams2.setMargins(0, (int) com.bytedance.android.input.keyboard.areacontrol.k.L(20), 0, 0);
        }
        com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
        textView.setTextSize(1, com.bytedance.android.input.keyboard.areacontrol.k.c(11.0f));
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(Typeface.DEFAULT, 500, false);
        } else {
            try {
                typeface = Typeface.create("sans-serif-medium", 0);
            } catch (Exception e2) {
                com.bytedance.android.input.r.j.k(this.a, "Failed to create typeface 'sans-serif-medium'", e2);
                typeface = Typeface.DEFAULT;
            }
        }
        textView.setTypeface(typeface);
        AsrWaveView asrWaveView = this.f3155f;
        ViewGroup.LayoutParams layoutParams3 = asrWaveView != null ? asrWaveView.getLayoutParams() : null;
        ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
        com.bytedance.android.input.keyboard.areacontrol.k kVar3 = com.bytedance.android.input.keyboard.areacontrol.k.a;
        int L = size - ((int) com.bytedance.android.input.keyboard.areacontrol.k.L(getResources().getInteger(C0838R.integer.asr_long_press_notched_ellipse_no_tip_height_draw)));
        Integer valueOf = layoutParams4 != null ? Integer.valueOf(((ViewGroup.MarginLayoutParams) layoutParams4).height) : null;
        kotlin.s.c.l.c(valueOf);
        int intValue = (L - valueOf.intValue()) / 2;
        if (intValue != ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin) {
            ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = intValue;
            AsrWaveView asrWaveView2 = this.f3155f;
            if (asrWaveView2 != null) {
                asrWaveView2.requestLayout();
            }
        }
        AsrEllipseView asrEllipseView = this.f3154e;
        Object layoutParams5 = asrEllipseView != null ? asrEllipseView.getLayoutParams() : null;
        ConstraintLayout.LayoutParams layoutParams6 = layoutParams5 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams6).height = (int) com.bytedance.android.input.keyboard.areacontrol.k.L(88);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AsrEllipseView asrEllipseView = this.f3154e;
        if (asrEllipseView != null && asrEllipseView.c(motionEvent)) {
            com.bytedance.android.input.r.j.i(this.a, "[asr_view]: bottom");
            AsrNotchedEllipseView asrNotchedEllipseView = this.f3153d;
            if (asrNotchedEllipseView != null) {
                asrNotchedEllipseView.setLeaveAll();
            }
        } else {
            AsrNotchedEllipseView asrNotchedEllipseView2 = this.f3153d;
            if (asrNotchedEllipseView2 != null && asrNotchedEllipseView2.g(motionEvent)) {
                com.bytedance.android.input.r.j.i(this.a, "[asr_view]: left & right");
                return true;
            }
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.bytedance.android.input.r.j.i(this.a, "onTouchEvent: ACTION_DOWN");
            return false;
        }
        if (valueOf == null || valueOf.intValue() != 1) {
            if (valueOf != null && valueOf.intValue() == 2) {
                return true;
            }
            if (valueOf != null && valueOf.intValue() == 3) {
                com.bytedance.android.input.r.j.i(this.a, "onTouchEvent: ACTION_CANCEL showView(false)");
                return true;
            }
            com.bytedance.android.input.r.j.i(this.a, "onTouchEvent: else");
            return false;
        }
        com.bytedance.android.input.r.j.m(this.a, "onTouchEvent action up");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.Q(false);
        }
        AsrManager.a.q0();
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("actiontype", "loosen");
        if (o.f3179f == null) {
            e.a.a.a.a.b0();
        }
        o oVar = o.f3179f;
        kotlin.s.c.l.d(oVar, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
        jSONObject.put("pagename", oVar.c());
        if (o.f3179f == null) {
            e.a.a.a.a.b0();
        }
        o oVar2 = o.f3179f;
        kotlin.s.c.l.d(oVar2, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
        if (oVar2.f().length() > 0) {
            if (o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            o oVar3 = o.f3179f;
            kotlin.s.c.l.d(oVar3, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("third_package_name", oVar3.h());
            if (o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            o oVar4 = o.f3179f;
            kotlin.s.c.l.d(oVar4, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("third_scene", oVar4.f());
            if (o.f3179f == null) {
                e.a.a.a.a.b0();
            }
            o oVar5 = o.f3179f;
            kotlin.s.c.l.d(oVar5, "null cannot be cast to non-null type com.bytedance.android.input.speech.view.EditorViewInfo");
            jSONObject.put("third_extra", oVar5.g());
        }
        aVar.t("voiceinput_space_action", jSONObject);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (this.b) {
            com.bytedance.android.input.r.j.i(this.a, "initView, already initialized");
            return;
        }
        AsrNotchedEllipseView asrNotchedEllipseView = (AsrNotchedEllipseView) findViewById(C0838R.id.asr_action_btn);
        this.f3153d = asrNotchedEllipseView;
        if (asrNotchedEllipseView != null) {
            asrNotchedEllipseView.setActionInLeft(new g(this));
            asrNotchedEllipseView.setActionClickLeft(new h(this));
            asrNotchedEllipseView.setActionInRight(new i(this));
            asrNotchedEllipseView.setActionClickRight(new j(this));
        }
        AsrWaveView asrWaveView = (AsrWaveView) findViewById(C0838R.id.asr_wave_view);
        this.f3155f = asrWaveView;
        if (asrWaveView != null) {
            asrWaveView.setHaveStartTip(false);
        }
        this.f3154e = (AsrEllipseView) findViewById(C0838R.id.asr_ellipse_view);
        l.a.r().observeForever(new a(new k(this)));
        this.b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r5 == 4) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onVisibilityChanged(android.view.View r4, int r5) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.speech.view.AsrLongPressView.onVisibilityChanged(android.view.View, int):void");
    }

    public final void setMAsrWaveView(AsrWaveView asrWaveView) {
        this.f3155f = asrWaveView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsrLongPressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "Asr-LongPressView";
        FrameLayout.inflate(context, C0838R.layout.layout_asr_long_press, this);
    }
}
