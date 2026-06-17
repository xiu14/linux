package com.obric.oui.forms;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.b.r;

/* loaded from: classes2.dex */
public final class OEditText extends AppCompatEditText {
    private final b a;
    private final c b;

    /* renamed from: c, reason: collision with root package name */
    private final d f7759c;

    /* renamed from: d, reason: collision with root package name */
    private a f7760d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7761e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7762f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7763g;
    private boolean h;
    private boolean i;

    public interface a {
        void a(CompletionInfo completionInfo);
    }

    private static final class b implements View.OnFocusChangeListener {
        private l<? super Boolean, o> a;
        private View.OnFocusChangeListener b;

        public final View.OnFocusChangeListener a() {
            return this.b;
        }

        public final void b(l<? super Boolean, o> lVar) {
            this.a = lVar;
        }

        public final void c(View.OnFocusChangeListener onFocusChangeListener) {
            this.b = onFocusChangeListener;
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            l<? super Boolean, o> lVar = this.a;
            if (lVar != null) {
                lVar.invoke(Boolean.valueOf(z));
            }
            View.OnFocusChangeListener onFocusChangeListener = this.b;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(view, z);
            }
        }
    }

    private static final class c implements View.OnTouchListener {
        private l<? super MotionEvent, o> a;
        private View.OnTouchListener b;

        public final void a(l<? super MotionEvent, o> lVar) {
            this.a = lVar;
        }

        public final void b(View.OnTouchListener onTouchListener) {
            this.b = onTouchListener;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            l<? super MotionEvent, o> lVar = this.a;
            if (lVar != null) {
                lVar.invoke(motionEvent);
            }
            View.OnTouchListener onTouchListener = this.b;
            if (onTouchListener != null) {
                return onTouchListener.onTouch(view, motionEvent);
            }
            return false;
        }
    }

    private static final class d implements TextWatcher {
        private r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> a;
        private l<? super Editable, o> b;

        public final void a(l<? super Editable, o> lVar) {
            this.b = lVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            l<? super Editable, o> lVar = this.b;
            if (lVar != null) {
                lVar.invoke(editable);
            }
        }

        public final void b(r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar) {
            this.a = rVar;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar = this.a;
            if (rVar != null) {
                rVar.invoke(charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
            }
        }
    }

    public OEditText(Context context) {
        this(context, null, 0);
    }

    public final void a(l<? super Editable, o> lVar) {
        kotlin.s.c.l.f(lVar, "action");
        this.f7759c.a(lVar);
    }

    public final void b(l<? super Boolean, o> lVar) {
        kotlin.s.c.l.f(lVar, "action");
        this.a.b(lVar);
    }

    public final void c(l<? super MotionEvent, o> lVar) {
        kotlin.s.c.l.f(lVar, "action");
        this.b.a(lVar);
    }

    public final void d(r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, o> rVar) {
        kotlin.s.c.l.f(rVar, "action");
        this.f7759c.b(rVar);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (this.h) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    protected float getLeftFadingEdgeStrength() {
        if (this.f7761e) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public View.OnFocusChangeListener getOnFocusChangeListener() {
        View.OnFocusChangeListener onFocusChangeListener = super.getOnFocusChangeListener();
        return onFocusChangeListener instanceof b ? ((b) onFocusChangeListener).a() : onFocusChangeListener;
    }

    @Override // android.widget.TextView, android.view.View
    protected float getRightFadingEdgeStrength() {
        if (this.f7762f) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (this.f7763g) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.TextView
    public void onCommitCompletion(CompletionInfo completionInfo) {
        super.onCommitCompletion(completionInfo);
        a aVar = this.f7760d;
        if (aVar != null) {
            aVar.a(completionInfo);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        boolean z = i != i2;
        if (this.i || !z) {
            return;
        }
        e.i.b.d.a.a(getContext(), 3);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean performLongClick() {
        this.i = true;
        boolean performLongClick = super.performLongClick();
        this.i = false;
        return performLongClick;
    }

    public final void setCommitCompletionListener(a aVar) {
        this.f7760d = aVar;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        if (onFocusChangeListener instanceof b) {
            super.setOnFocusChangeListener(onFocusChangeListener);
        } else {
            this.a.c(onFocusChangeListener);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.b.b(onTouchListener);
    }

    public final void setTextFading(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        setFadingEdgeLength(i);
        this.f7761e = z;
        this.f7763g = z2;
        this.f7762f = z3;
        this.h = z4;
        setHorizontalFadingEdgeEnabled(z || z3);
        setVerticalFadingEdgeEnabled(this.f7763g || this.h);
    }

    public OEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        b bVar = new b();
        this.a = bVar;
        c cVar = new c();
        this.b = cVar;
        d dVar = new d();
        this.f7759c = dVar;
        setOnFocusChangeListener(bVar);
        super.setOnTouchListener(cVar);
        addTextChangedListener(dVar);
        setHighlightColor(context.getColor(C0838R.color.oui_text_highlight_color));
    }
}
