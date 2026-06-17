package com.obric.oui.oswitch;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.android.doubaoime.C0838R;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class OSwitch extends SwitchCompat {
    private int V;
    private int W;

    public OSwitch(Context context) {
        this(context, null, 0, 6);
    }

    public OSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    public /* synthetic */ OSwitch(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? C0838R.attr.OUISwitchStyle : i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: Exception -> 0x00c3, TRY_ENTER, TryCatch #0 {Exception -> 0x00c3, blocks: (B:3:0x0008, B:9:0x0019, B:13:0x0054, B:16:0x005d, B:19:0x006c, B:20:0x0097, B:23:0x004e), top: B:2:0x0008 }] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r13 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = "Resources.getSystem()"
            java.lang.String r1 = "OSwitch"
            r2 = 0
            r13.measure(r2, r2)     // Catch: java.lang.Exception -> Lc3
            int r3 = r13.getMeasuredWidth()     // Catch: java.lang.Exception -> Lc3
            int r4 = r13.getMeasuredHeight()     // Catch: java.lang.Exception -> Lc3
            if (r3 <= 0) goto Lc9
            if (r4 > 0) goto L19
            goto Lc9
        L19:
            r5 = 20
            float r6 = (float) r5     // Catch: java.lang.Exception -> Lc3
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> Lc3
            kotlin.s.c.l.e(r7, r0)     // Catch: java.lang.Exception -> Lc3
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()     // Catch: java.lang.Exception -> Lc3
            r8 = 1
            float r6 = android.util.TypedValue.applyDimension(r8, r6, r7)     // Catch: java.lang.Exception -> Lc3
            int r6 = kotlin.t.a.a(r6)     // Catch: java.lang.Exception -> Lc3
            int r6 = r6 + r3
            float r5 = (float) r5     // Catch: java.lang.Exception -> Lc3
            android.content.res.Resources r7 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> Lc3
            kotlin.s.c.l.e(r7, r0)     // Catch: java.lang.Exception -> Lc3
            android.util.DisplayMetrics r0 = r7.getDisplayMetrics()     // Catch: java.lang.Exception -> Lc3
            float r0 = android.util.TypedValue.applyDimension(r8, r5, r0)     // Catch: java.lang.Exception -> Lc3
            int r0 = kotlin.t.a.a(r0)     // Catch: java.lang.Exception -> Lc3
            int r0 = r0 + r4
            android.view.ViewParent r5 = r13.getParent()     // Catch: java.lang.Exception -> Lc3
            r7 = 0
            if (r5 != 0) goto L4e
            goto L53
        L4e:
            boolean r8 = r5 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> Lc3
            if (r8 == 0) goto L53
            goto L54
        L53:
            r5 = r7
        L54:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch: java.lang.Exception -> Lc3
            java.lang.String r7 = ", expectedHeight="
            java.lang.String r8 = ", expectedWidth="
            r9 = 4
            if (r5 == 0) goto L97
            r5.measure(r2, r2)     // Catch: java.lang.Exception -> Lc3
            int r10 = r5.getMeasuredWidth()     // Catch: java.lang.Exception -> Lc3
            int r11 = r5.getMeasuredHeight()     // Catch: java.lang.Exception -> Lc3
            if (r0 > r11) goto L6c
            if (r6 <= r10) goto L97
        L6c:
            com.obric.oui.common.util.b.c(r5, r6, r0, r2, r9)     // Catch: java.lang.Exception -> Lc3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            r5.<init>()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r12 = "increaseTouchArea, parentWith="
            r5.append(r12)     // Catch: java.lang.Exception -> Lc3
            r5.append(r10)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r10 = ", parentHeight="
            r5.append(r10)     // Catch: java.lang.Exception -> Lc3
            r5.append(r11)     // Catch: java.lang.Exception -> Lc3
            r5.append(r8)     // Catch: java.lang.Exception -> Lc3
            r5.append(r6)     // Catch: java.lang.Exception -> Lc3
            r5.append(r7)     // Catch: java.lang.Exception -> Lc3
            r5.append(r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Lc3
            e.i.b.f.e.b.a(r1, r5)     // Catch: java.lang.Exception -> Lc3
        L97:
            com.obric.oui.common.util.b.c(r13, r6, r0, r2, r9)     // Catch: java.lang.Exception -> Lc3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc3
            r2.<init>()     // Catch: java.lang.Exception -> Lc3
            java.lang.String r5 = "increaseTouchArea, width="
            r2.append(r5)     // Catch: java.lang.Exception -> Lc3
            r2.append(r3)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r3 = ", height="
            r2.append(r3)     // Catch: java.lang.Exception -> Lc3
            r2.append(r4)     // Catch: java.lang.Exception -> Lc3
            r2.append(r8)     // Catch: java.lang.Exception -> Lc3
            r2.append(r6)     // Catch: java.lang.Exception -> Lc3
            r2.append(r7)     // Catch: java.lang.Exception -> Lc3
            r2.append(r0)     // Catch: java.lang.Exception -> Lc3
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lc3
            e.i.b.f.e.b.a(r1, r0)     // Catch: java.lang.Exception -> Lc3
            goto Lc9
        Lc3:
            r0 = move-exception
            java.lang.String r2 = "increaseTouchArea, error"
            e.i.b.f.e.b.c(r1, r2, r0)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.oswitch.OSwitch.onAttachedToWindow():void");
    }

    @Override // com.obric.oui.oswitch.SwitchCompat, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.obric.oui.oswitch.SwitchCompat, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // com.obric.oui.oswitch.SwitchCompat, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            java.lang.String r0 = "v"
            java.lang.String r1 = "q"
            java.lang.String r2 = "ev"
            kotlin.s.c.l.f(r8, r2)
            int r2 = r8.getAction()
            r3 = 3
            r4 = 1
            if (r2 == r3) goto L17
            int r2 = r8.getAction()
            if (r2 != r4) goto Lce
        L17:
            r2 = 0
            java.lang.Class<com.obric.oui.oswitch.SwitchCompat> r5 = com.obric.oui.oswitch.SwitchCompat.class
            java.lang.reflect.Field r5 = r5.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            kotlin.s.c.l.e(r5, r0)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            r5.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            if (r5 == 0) goto L31
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            int r5 = r5.intValue()     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            goto L43
        L31:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Int"
            r5.<init>(r6)     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
            throw r5     // Catch: java.lang.IllegalAccessException -> L39 java.lang.NoSuchFieldException -> L3e
        L39:
            r5 = move-exception
            r5.printStackTrace()
            goto L42
        L3e:
            r5 = move-exception
            r5.printStackTrace()
        L42:
            r5 = r2
        L43:
            r6 = 2
            if (r5 != r6) goto Lce
            java.lang.Class<com.obric.oui.oswitch.SwitchCompat> r5 = com.obric.oui.oswitch.SwitchCompat.class
            java.lang.reflect.Field r1 = r5.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L5a java.lang.NoSuchFieldException -> L5f
            kotlin.s.c.l.e(r1, r0)     // Catch: java.lang.IllegalAccessException -> L5a java.lang.NoSuchFieldException -> L5f
            r1.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L5a java.lang.NoSuchFieldException -> L5f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.IllegalAccessException -> L5a java.lang.NoSuchFieldException -> L5f
            r1.set(r7, r5)     // Catch: java.lang.IllegalAccessException -> L5a java.lang.NoSuchFieldException -> L5f
            goto L63
        L5a:
            r1 = move-exception
            r1.printStackTrace()
            goto L63
        L5f:
            r1 = move-exception
            r1.printStackTrace()
        L63:
            int r1 = r8.getAction()
            if (r1 != r4) goto L71
            boolean r1 = r7.isEnabled()
            if (r1 == 0) goto L71
            r1 = r4
            goto L72
        L71:
            r1 = r2
        L72:
            boolean r5 = r7.isChecked()
            if (r1 == 0) goto Laf
            java.lang.Class<com.obric.oui.oswitch.SwitchCompat> r1 = com.obric.oui.oswitch.SwitchCompat.class
            java.lang.String r6 = "w"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r6)     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            kotlin.s.c.l.e(r1, r0)     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            r1.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            java.lang.Object r0 = r1.get(r7)     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            if (r0 == 0) goto L93
            java.lang.Float r0 = (java.lang.Float) r0     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            float r0 = r0.floatValue()     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            goto La5
        L93:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            r0.<init>(r1)     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
            throw r0     // Catch: java.lang.IllegalAccessException -> L9b java.lang.NoSuchFieldException -> La0
        L9b:
            r0 = move-exception
            r0.printStackTrace()
            goto La4
        La0:
            r0 = move-exception
            r0.printStackTrace()
        La4:
            r0 = 0
        La5:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lad
            r0 = r4
            goto Lb0
        Lad:
            r0 = r2
            goto Lb0
        Laf:
            r0 = r5
        Lb0:
            if (r0 == r5) goto Lb5
            r7.playSoundEffect(r2)
        Lb5:
            r7.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r8)
            java.lang.String r1 = "cancel"
            kotlin.s.c.l.e(r0, r1)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r8)
            return r4
        Lce:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.oswitch.OSwitch.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.obric.oui.oswitch.SwitchCompat, android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        boolean isChecked = isChecked();
        super.setChecked(z);
        boolean isChecked2 = isChecked();
        if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
            if (isChecked != isChecked2) {
                Drawable g2 = g();
                if (g2 instanceof TransitionDrawable) {
                    if (isChecked2) {
                        ((TransitionDrawable) g2).startTransition(260);
                        return;
                    } else {
                        ((TransitionDrawable) g2).reverseTransition(260);
                        return;
                    }
                }
                if (g2 instanceof a) {
                    if (isChecked2) {
                        ((a) g2).e(260);
                        return;
                    } else {
                        ((a) g2).c(260);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (isChecked != isChecked2) {
            Drawable g3 = g();
            if (!(g3 instanceof TransitionDrawable)) {
                if (g3 instanceof a) {
                    if (isChecked2) {
                        ((a) g3).d();
                        return;
                    } else {
                        ((a) g3).b();
                        return;
                    }
                }
                return;
            }
            if (!isChecked2) {
                ((TransitionDrawable) g3).resetTransition();
                return;
            }
            TransitionDrawable transitionDrawable = (TransitionDrawable) g3;
            try {
                Method declaredMethod = TransitionDrawable.class.getDeclaredMethod("showSecondLayer", new Class[0]);
                l.e(declaredMethod, "showSecondLayerMethod");
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(transitionDrawable, new Object[0]);
            } catch (Exception e2) {
                e.i.b.f.e.b.c("OSwitch", "reflectShowSecondLayer, error", e2);
            }
        }
    }

    public final void setCheckedWithoutFeedback(boolean z) {
        if (z != isChecked() && (g() instanceof TransitionDrawable)) {
            if (z) {
                Drawable g2 = g();
                Objects.requireNonNull(g2, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                ((TransitionDrawable) g2).startTransition(180);
            } else {
                Drawable g3 = g();
                Objects.requireNonNull(g3, "null cannot be cast to non-null type android.graphics.drawable.TransitionDrawable");
                ((TransitionDrawable) g3).reverseTransition(180);
            }
        }
        super.setChecked(z);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Drawable g2 = g();
        if (g2 != null) {
            g2.setAlpha(z ? 255 : 76);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSwitch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable mutate;
        Drawable mutate2;
        l.f(context, "context");
        int[] iArr = e.i.a.b.b.K;
        l.e(iArr, "R.styleable.OSwitch");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.V = obtainStyledAttributes.getResourceId(3, 0);
        this.W = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        if (d() == null) {
            setThumbDrawable(ContextCompat.getDrawable(context, C0838R.drawable.o_switch_thumb));
        }
        if (g() == null) {
            boolean isChecked = isChecked();
            if (this.V == 0) {
                Drawable drawable = ContextCompat.getDrawable(getContext(), C0838R.drawable.o_switch_track_unchecked);
                l.c(drawable);
                mutate = drawable.mutate();
                l.e(mutate, "ContextCompat.getDrawabl…                .mutate()");
            } else {
                Drawable drawable2 = ContextCompat.getDrawable(getContext(), this.V);
                l.c(drawable2);
                mutate = drawable2.mutate();
                l.e(mutate, "ContextCompat.getDrawabl…rackUnchecked)!!.mutate()");
            }
            if (this.W == 0) {
                Drawable drawable3 = ContextCompat.getDrawable(getContext(), C0838R.drawable.o_switch_track_checked);
                l.c(drawable3);
                mutate2 = drawable3.mutate();
                l.e(mutate2, "ContextCompat.getDrawabl…                .mutate()");
            } else {
                Drawable drawable4 = ContextCompat.getDrawable(getContext(), this.W);
                l.c(drawable4);
                mutate2 = drawable4.mutate();
                l.e(mutate2, "ContextCompat.getDrawabl… trackChecked)!!.mutate()");
            }
            a aVar = new a(mutate, mutate2);
            if (isChecked) {
                aVar.e(0);
            } else {
                aVar.b();
            }
            setTrackDrawable(aVar);
        }
        setEnabled(isEnabled());
    }
}
