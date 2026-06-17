package com.obric.oui.searchbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.forms.OInputView;
import java.util.Objects;
import kotlin.o;
import kotlin.s.b.l;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
public class OSearchBar extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7969d = 0;
    private final OInputView a;
    private final FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    private final OButton f7970c;

    static final class a extends m implements l<FrameLayout, o> {
        final /* synthetic */ int a;
        final /* synthetic */ OSearchBar b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i, OSearchBar oSearchBar) {
            super(1);
            this.a = i;
            this.b = oSearchBar;
        }

        @Override // kotlin.s.b.l
        public o invoke(FrameLayout frameLayout) {
            FrameLayout frameLayout2 = frameLayout;
            kotlin.s.c.l.f(frameLayout2, "it");
            OSearchBar oSearchBar = this.b;
            int i = OSearchBar.f7969d;
            Objects.requireNonNull(oSearchBar);
            LayoutInflater.from(this.b.getContext()).inflate(this.a, frameLayout2);
            return o.a;
        }
    }

    static final class b implements View.OnClickListener {
        final /* synthetic */ View.OnClickListener b;

        b(View.OnClickListener onClickListener) {
            this.b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            e.i.b.d.a.a(OSearchBar.this.getContext(), 1);
            this.b.onClick(view);
        }
    }

    public OSearchBar(Context context) {
        this(context, null);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        this.a.setEnabled(z);
        super.setEnabled(z);
    }

    public final void setOnInputFocusChange(View.OnFocusChangeListener onFocusChangeListener) {
        kotlin.s.c.l.f(onFocusChangeListener, "onFocusChangeListener");
        this.a.setOnFocusChangeListener(onFocusChangeListener);
    }

    public final void setSearchAction(View.OnClickListener onClickListener) {
        kotlin.s.c.l.f(onClickListener, "click");
        this.f7970c.setOnClickListener(new b(onClickListener));
    }

    public final void setSearchActionText(String str) {
        kotlin.s.c.l.f(str, "searchActionText");
        if (str.length() == 0) {
            com.obric.oui.common.util.b.f(this.f7970c);
        } else {
            this.f7970c.setText(str);
            com.obric.oui.common.util.b.g(this.f7970c);
        }
    }

    public final void setText(String str) {
        kotlin.s.c.l.f(str, "text");
        this.a.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSearchBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        kotlin.s.c.l.f(context, "originContext");
        ViewGroup.inflate(getContext(), C0838R.layout.o_widget_search_bar, this);
        View findViewById = findViewById(C0838R.id.input_view);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.input_view)");
        OInputView oInputView = (OInputView) findViewById;
        this.a = oInputView;
        View findViewById2 = findViewById(C0838R.id.o_input_left_view_container);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.o_input_left_view_container)");
        FrameLayout frameLayout = (FrameLayout) findViewById2;
        this.b = frameLayout;
        View findViewById3 = findViewById(C0838R.id.search_action);
        kotlin.s.c.l.e(findViewById3, "findViewById(R.id.search_action)");
        this.f7970c = (OButton) findViewById3;
        Context context2 = getContext();
        kotlin.s.c.l.e(context2, "context");
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.D, 0, 0);
        oInputView.setHint(obtainStyledAttributes.getString(1));
        oInputView.setText(obtainStyledAttributes.getString(0));
        int resourceId2 = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId2 != 0) {
            oInputView.setActionView(new a(resourceId2, this));
        }
        if (resourceId2 == 0 && (resourceId = obtainStyledAttributes.getResourceId(4, C0838R.layout.o_widget_search_bar_prefix)) != 0) {
            ViewGroup.inflate(getContext(), resourceId, frameLayout);
            com.obric.oui.common.util.b.g(frameLayout);
        }
        String string = obtainStyledAttributes.getString(2);
        string = string == null ? "" : string;
        kotlin.s.c.l.e(string, "getString(R.styleable.OS…_search_actionText) ?: \"\"");
        setSearchActionText(string);
    }
}
