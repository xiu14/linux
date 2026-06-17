package com.bytedance.android.input.popup;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.speech.AsrManager;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.s.c.v;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class HandwriteView extends View {
    private final float a;
    private final Paint b;

    /* renamed from: c, reason: collision with root package name */
    private int f2895c;

    /* renamed from: d, reason: collision with root package name */
    private Path f2896d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Path> f2897e;

    /* renamed from: f, reason: collision with root package name */
    private final List<List<PointF>> f2898f;

    /* renamed from: g, reason: collision with root package name */
    private List<PointF> f2899g;
    private ValueAnimator h;
    private boolean i;
    private final List<Rect> j;
    private a k;
    private final Runnable l;
    private long m;
    private float n;
    private float o;

    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HandwriteView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (!this.f2898f.isEmpty()) {
            IAppLog.a.i("stroke_disappears");
        }
        this.f2897e.clear();
        this.f2898f.clear();
        com.bytedance.android.input.p.a aVar = com.bytedance.android.input.p.a.a;
        com.bytedance.android.input.p.a.d();
        this.f2896d = null;
        this.f2899g = null;
    }

    public static void i(HandwriteView handwriteView, ValueAnimator valueAnimator) {
        kotlin.s.c.l.f(handwriteView, "this$0");
        kotlin.s.c.l.f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        kotlin.s.c.l.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        handwriteView.b.setAlpha(((Integer) animatedValue).intValue());
        handwriteView.invalidate();
    }

    public static void j(final HandwriteView handwriteView) {
        kotlin.s.c.l.f(handwriteView, "this$0");
        long uptimeMillis = SystemClock.uptimeMillis();
        StringBuilder M = e.a.a.a.a.M("[hand_write] clearRunnable start, elapsed=");
        M.append(uptimeMillis - handwriteView.m);
        M.append("ms (since ACTION_UP)");
        com.bytedance.android.input.r.j.i("HandwriteView", M.toString());
        handwriteView.i = true;
        ValueAnimator valueAnimator = handwriteView.h;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = handwriteView.b.getAlpha();
        v vVar = new v();
        ValueAnimator ofInt = ValueAnimator.ofInt(alpha, 0);
        ofInt.setDuration(300L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.popup.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                HandwriteView.i(HandwriteView.this, valueAnimator2);
            }
        });
        ofInt.addListener(new n(vVar, handwriteView, alpha));
        handwriteView.h = ofInt;
        ofInt.start();
        KeyboardJni.getKeyboardJni().clearHandWritingPoints();
    }

    public final void e() {
        removeCallbacks(this.l);
        f();
        this.b.setAlpha(255);
        invalidate();
    }

    public final float g() {
        return this.a;
    }

    public final List<List<PointF>> h() {
        return this.f2898f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        kotlin.s.c.l.f(canvas, "canvas");
        super.onDraw(canvas);
        Iterator<Path> it2 = this.f2897e.iterator();
        while (it2.hasNext()) {
            canvas.drawPath(it2.next(), this.b);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Path path;
        boolean z;
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent != null && motionEvent.getActionMasked() == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            List<Rect> list = this.j;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((Rect) it2.next()).contains((int) x, (int) y)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return false;
            }
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            AsrManager asrManager = AsrManager.a;
            asrManager.r();
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.c();
            if (asrManager.E()) {
                KeyboardJni.DoFunctionKey(7);
            }
            removeCallbacks(this.l);
            if (this.i) {
                if (KeyboardJni.hasPreedit() && KeyboardJni.getKeyboardJni().isTypingInput()) {
                    com.bytedance.android.input.r.j.i("HandwriteView", "reportHandwritingAutoCommit");
                    IAppLog.a aVar = IAppLog.a;
                    JSONObject a0 = e.a.a.a.a.a0("position", "0", "method", "next_write");
                    a0.put("wordcount", PushClient.DEFAULT_REQUEST_ID);
                    aVar.t("write_real_display", a0);
                    String preeditText = KeyboardJni.getPreeditText();
                    com.bytedance.android.input.p.a aVar2 = com.bytedance.android.input.p.a.a;
                    kotlin.s.c.l.e(preeditText, "preeditText");
                    com.bytedance.android.input.p.a.b(preeditText);
                }
                removeCallbacks(this.l);
                f();
                this.b.setAlpha(255);
                invalidate();
                KeyboardJni.getKeyboardJni().finishPreeditNative(true);
                this.i = false;
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            a aVar3 = this.k;
            if (aVar3 != null) {
                aVar3.b();
            }
            int actionIndex = motionEvent.getActionIndex();
            this.f2895c = actionIndex;
            this.n = motionEvent.getX(actionIndex);
            this.o = motionEvent.getY(this.f2895c);
            Path path2 = new Path();
            path2.moveTo(this.n, this.o);
            this.f2897e.add(path2);
            this.f2896d = path2;
            List<PointF> K = kotlin.collections.g.K(new PointF(this.n, this.o));
            this.f2899g = K;
            this.f2898f.add(K);
            com.bytedance.android.input.p.a aVar4 = com.bytedance.android.input.p.a.a;
            com.bytedance.android.input.p.a.c(new PointF(this.n, this.o));
        } else if (valueOf != null && valueOf.intValue() == 2) {
            Path path3 = this.f2896d;
            if (path3 != null) {
                int historySize = motionEvent.getHistorySize();
                while (i < historySize) {
                    float historicalX = motionEvent.getHistoricalX(this.f2895c, i);
                    float historicalY = motionEvent.getHistoricalY(this.f2895c, i);
                    float f2 = this.n;
                    float f3 = this.o;
                    path3.quadTo(f2, f3, (f2 + historicalX) / 2.0f, (f3 + historicalY) / 2.0f);
                    if (historicalX >= 0.0f && historicalY >= 0.0f) {
                        List<PointF> list2 = this.f2899g;
                        if (list2 != null) {
                            list2.add(new PointF(historicalX, historicalY));
                        }
                        com.bytedance.android.input.p.a aVar5 = com.bytedance.android.input.p.a.a;
                        com.bytedance.android.input.p.a.a(new PointF(historicalX, historicalY));
                    }
                    this.n = historicalX;
                    this.o = historicalY;
                    i++;
                }
                float x2 = motionEvent.getX(this.f2895c);
                float y2 = motionEvent.getY(this.f2895c);
                float f4 = this.n;
                float f5 = this.o;
                path3.quadTo(f4, f5, (f4 + x2) / 2.0f, (f5 + y2) / 2.0f);
                invalidate();
                if (x2 >= 0.0f && y2 >= 0.0f) {
                    List<PointF> list3 = this.f2899g;
                    if (list3 != null) {
                        list3.add(new PointF(x2, y2));
                    }
                    com.bytedance.android.input.p.a aVar6 = com.bytedance.android.input.p.a.a;
                    com.bytedance.android.input.p.a.a(new PointF(x2, y2));
                }
                this.n = x2;
                this.o = y2;
            }
        } else {
            if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
                i = 1;
            }
            if (i != 0 && (path = this.f2896d) != null) {
                float x3 = motionEvent.getX(this.f2895c);
                float y3 = motionEvent.getY(this.f2895c);
                path.quadTo(this.n, this.o, x3, y3);
                if (x3 >= 0.0f && y3 >= 0.0f) {
                    List<PointF> list4 = this.f2899g;
                    if (list4 != null) {
                        list4.add(new PointF(x3, y3));
                    }
                    com.bytedance.android.input.p.a aVar7 = com.bytedance.android.input.p.a.a;
                    com.bytedance.android.input.p.a.a(new PointF(x3, y3));
                }
                this.f2899g = null;
                invalidate();
                a aVar8 = this.k;
                if (aVar8 != null) {
                    aVar8.a();
                }
                this.m = SystemClock.uptimeMillis();
                IInputSettings.a aVar9 = IInputSettings.a;
                Objects.requireNonNull(aVar9);
                long j = aVar9.a().j();
                StringBuilder M = e.a.a.a.a.M("[hand_write] schedule clearRunnable: now=");
                M.append(this.m);
                M.append(", delay=");
                M.append(j);
                M.append("ms}");
                com.bytedance.android.input.r.j.i("HandwriteView", M.toString());
                postDelayed(this.l, j);
            }
        }
        return true;
    }

    public final void setDisableAreas(List<Rect> list) {
        kotlin.s.c.l.f(list, "areas");
        this.j.clear();
        this.j.addAll(list);
    }

    public final void setDrawListener(a aVar) {
        kotlin.s.c.l.f(aVar, "l");
        this.k = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandwriteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        float f2 = getResources().getDisplayMetrics().density;
        this.a = f2;
        Paint paint = new Paint();
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        paint.setColor(aVar.l(context, C0838R.color.handwrite_stroke));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5 * f2);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setPathEffect(new CornerPathEffect(f2 * 2.0f));
        this.b = paint;
        this.f2897e = new ArrayList();
        this.f2898f = new ArrayList();
        new ArrayList();
        this.j = new ArrayList();
        this.l = new Runnable() { // from class: com.bytedance.android.input.popup.g
            @Override // java.lang.Runnable
            public final void run() {
                HandwriteView.j(HandwriteView.this);
            }
        };
    }
}
