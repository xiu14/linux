package com.obric.oui.dialog.alert.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.checkbox.OCheckBox;
import java.util.Objects;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class DialogConfirmView extends ConstraintLayout {
    private final OCheckBox a;
    private final TextView b;

    /* renamed from: c, reason: collision with root package name */
    private final RelativeLayout f7713c;

    /* renamed from: d, reason: collision with root package name */
    private final ViewGroup f7714d;

    /* compiled from: java-style lambda group */
    static final class a implements View.OnClickListener {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;

        public a(int i, Object obj) {
            this.a = i;
            this.b = obj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i = this.a;
            if (i == 0) {
                ((DialogConfirmView) this.b).b.performClick();
            } else {
                if (i != 1) {
                    throw null;
                }
                ((DialogConfirmView) this.b).h().performClick();
            }
        }
    }

    public DialogConfirmView(Context context) {
        this(context, null);
    }

    public final OCheckBox h() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() == null || !(getParent() instanceof ViewGroup)) {
            return;
        }
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f7713c.setPadding(0, viewGroup.getPaddingTop(), 0, viewGroup.getPaddingBottom());
        this.f7713c.setOnClickListener(new a(0, this));
        viewGroup.setPadding(viewGroup.getPaddingLeft(), 0, viewGroup.getPaddingRight(), 0);
        this.f7714d.setOnClickListener(new a(1, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogConfirmView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        ViewGroup.inflate(context, C0838R.layout.o_layout_dialog_options, this);
        Resources system = Resources.getSystem();
        l.e(system, "Resources.getSystem()");
        int a2 = kotlin.t.a.a(TypedValue.applyDimension(1, 5, system.getDisplayMetrics()));
        setPadding(a2, a2, a2, 0);
        View findViewById = findViewById(C0838R.id.radio);
        l.e(findViewById, "findViewById(R.id.radio)");
        this.a = (OCheckBox) findViewById;
        View findViewById2 = findViewById(C0838R.id.tv_normal);
        l.e(findViewById2, "findViewById(R.id.tv_normal)");
        View findViewById3 = findViewById(C0838R.id.tv_link);
        l.e(findViewById3, "findViewById(R.id.tv_link)");
        this.b = (TextView) findViewById3;
        View findViewById4 = findViewById(C0838R.id.link_text_container);
        l.e(findViewById4, "findViewById(R.id.link_text_container)");
        this.f7713c = (RelativeLayout) findViewById4;
        View findViewById5 = findViewById(C0838R.id.click_container);
        l.e(findViewById5, "findViewById(R.id.click_container)");
        this.f7714d = (ViewGroup) findViewById5;
    }
}
