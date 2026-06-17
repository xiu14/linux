package com.bytedance.common_biz.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class ImeCheckBox extends AppCompatImageView {
    private boolean a;
    private b b;

    /* renamed from: c, reason: collision with root package name */
    private int f4341c;

    /* renamed from: d, reason: collision with root package name */
    private int f4342d;

    static final class a extends m implements l<View, o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            ImeCheckBox.this.toggle();
            return o.a;
        }
    }

    public interface b {
        void a(ImeCheckBox imeCheckBox, boolean z);
    }

    static final class c extends m implements l<View, o> {
        final /* synthetic */ View.OnClickListener a;
        final /* synthetic */ ImeCheckBox b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(View.OnClickListener onClickListener, ImeCheckBox imeCheckBox) {
            super(1);
            this.a = onClickListener;
            this.b = imeCheckBox;
        }

        @Override // kotlin.s.b.l
        public o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            this.a.onClick(this.b);
            return o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeCheckBox(Context context) {
        this(context, null, 0);
        kotlin.s.c.l.f(context, "context");
    }

    public final boolean isChecked() {
        return this.a;
    }

    public final void setChecked(boolean z) {
        if (this.a != z) {
            this.a = z;
            setImageResource(z ? this.f4342d : this.f4341c);
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(this, this.a);
            }
        }
    }

    public final void setHookOnClickListener(View.OnClickListener onClickListener) {
        kotlin.s.c.l.f(onClickListener, "listener");
        e.b.d.a.a.e.g(this, new c(onClickListener, this));
    }

    public final void setOnCheckedChangeListener(b bVar) {
        this.b = bVar;
    }

    public final void toggle() {
        setChecked(!this.a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImeCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImeCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        kotlin.s.c.l.f(context, "context");
        this.f4341c = C0838R.drawable.ic_checkbox_no_select;
        this.f4342d = C0838R.drawable.ic_checkbox_select;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bytedance.android.input.k.b.b.f2455c);
        kotlin.s.c.l.e(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.ImeCheckBox)");
        this.a = obtainStyledAttributes.getBoolean(0, false);
        this.f4342d = obtainStyledAttributes.getResourceId(2, C0838R.drawable.ic_checkbox_select);
        this.f4341c = obtainStyledAttributes.getResourceId(1, C0838R.drawable.ic_checkbox_no_select);
        obtainStyledAttributes.recycle();
        setImageResource(this.a ? this.f4342d : this.f4341c);
        e.b.d.a.a.e.g(this, new a());
    }
}
