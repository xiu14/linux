package com.bytedance.android.input.keyboard.component;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class SegmentedBar extends FrameLayout {
    private final List<String> a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private a f2687c;

    /* renamed from: d, reason: collision with root package name */
    private final List<TextView> f2688d;

    /* renamed from: e, reason: collision with root package name */
    private final View f2689e;

    /* renamed from: f, reason: collision with root package name */
    private LinearLayout f2690f;

    public interface a {
        boolean a(int i);

        void b(int i, String str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedBar(Context context) {
        this(context, null, 0);
        l.f(context, "context");
    }

    public static void b(final SegmentedBar segmentedBar, int i, boolean z) {
        l.f(segmentedBar, "this$0");
        if (!(!segmentedBar.f2688d.isEmpty()) || i >= segmentedBar.f2688d.size()) {
            return;
        }
        TextView textView = segmentedBar.f2688d.get(i);
        int width = textView.getWidth();
        int left = textView.getLeft();
        LinearLayout linearLayout = segmentedBar.f2690f;
        if (linearLayout == null) {
            l.l("itemContainer");
            throw null;
        }
        int left2 = (linearLayout.getLeft() + left) - segmentedBar.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = segmentedBar.f2689e.getLayoutParams();
        l.d(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        final FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int width2 = segmentedBar.f2689e.getWidth();
        int left3 = segmentedBar.f2689e.getLeft();
        if (!z) {
            layoutParams2.width = width;
            layoutParams2.leftMargin = left2;
            segmentedBar.f2689e.setLayoutParams(layoutParams2);
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(width2, width);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.component.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SegmentedBar.d(layoutParams2, segmentedBar, valueAnimator);
            }
        });
        layoutParams2.leftMargin = left2;
        segmentedBar.f2689e.setLayoutParams(layoutParams2);
        float f2 = -(left2 - left3);
        segmentedBar.f2689e.setTranslationX(f2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, 0.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.android.input.keyboard.component.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SegmentedBar.e(SegmentedBar.this, valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.setDuration(200L);
        animatorSet.start();
    }

    public static void c(SegmentedBar segmentedBar, int i, String str, View view) {
        l.f(segmentedBar, "this$0");
        l.f(str, "$label");
        a aVar = segmentedBar.f2687c;
        if ((aVar != null && aVar.a(i)) || i == segmentedBar.b) {
            return;
        }
        setSelectedIndex$default(segmentedBar, i, false, 2, null);
        a aVar2 = segmentedBar.f2687c;
        if (aVar2 != null) {
            aVar2.b(i, str);
        }
    }

    public static void d(FrameLayout.LayoutParams layoutParams, SegmentedBar segmentedBar, ValueAnimator valueAnimator) {
        l.f(layoutParams, "$params");
        l.f(segmentedBar, "this$0");
        l.f(valueAnimator, "anim");
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        layoutParams.width = ((Integer) animatedValue).intValue();
        segmentedBar.f2689e.setLayoutParams(layoutParams);
    }

    public static void e(SegmentedBar segmentedBar, ValueAnimator valueAnimator) {
        l.f(segmentedBar, "this$0");
        l.f(valueAnimator, "anim");
        View view = segmentedBar.f2689e;
        Object animatedValue = valueAnimator.getAnimatedValue();
        l.d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        view.setTranslationX(((Float) animatedValue).floatValue());
    }

    private final void f(final int i, final boolean z) {
        int i2 = 0;
        for (Object obj : this.f2688d) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                g.b0();
                throw null;
            }
            ((TextView) obj).setSelected(i2 == i);
            i2 = i3;
        }
        post(new Runnable() { // from class: com.bytedance.android.input.keyboard.component.a
            @Override // java.lang.Runnable
            public final void run() {
                SegmentedBar.b(SegmentedBar.this, i, z);
            }
        });
    }

    public static /* synthetic */ void setSelectedIndex$default(SegmentedBar segmentedBar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        segmentedBar.setSelectedIndex(i, z);
    }

    public final int a() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if ((!this.f2688d.isEmpty()) && this.b < this.f2688d.size() && z) {
            f(this.b, false);
        }
    }

    public final void setItems(List<String> list) {
        l.f(list, "newItems");
        this.a.clear();
        this.a.addAll(list);
        for (TextView textView : this.f2688d) {
            LinearLayout linearLayout = this.f2690f;
            if (linearLayout == null) {
                l.l("itemContainer");
                throw null;
            }
            linearLayout.removeView(textView);
        }
        this.f2688d.clear();
        final int i = 0;
        for (Object obj : this.a) {
            int i2 = i + 1;
            if (i < 0) {
                g.b0();
                throw null;
            }
            final String str = (String) obj;
            View inflate = LayoutInflater.from(getContext()).inflate(C0838R.layout.item_segmented_bar, (ViewGroup) this, false);
            l.d(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) inflate;
            textView2.setText(str);
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.component.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SegmentedBar.c(SegmentedBar.this, i, str, view);
                }
            });
            this.f2688d.add(textView2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LinearLayout linearLayout2 = this.f2690f;
            if (linearLayout2 == null) {
                l.l("itemContainer");
                throw null;
            }
            linearLayout2.addView(textView2, layoutParams);
            i = i2;
        }
        if (this.b >= this.a.size()) {
            this.b = 0;
        }
        f(this.b, false);
    }

    public final void setOnItemSelectedListener(a aVar) {
        this.f2687c = aVar;
    }

    public final void setSelectedIndex(int i, boolean z) {
        boolean z2 = false;
        if (i >= 0 && i < this.a.size()) {
            z2 = true;
        }
        if (z2) {
            this.b = i;
            f(i, z);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SegmentedBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.a = new ArrayList();
        this.f2688d = new ArrayList();
        View view = new View(context);
        this.f2689e = view;
        IAppGlobals.a aVar = IAppGlobals.a;
        if (aVar.K() && !KeyboardJni.isFloatingMode()) {
            setBackgroundResource(C0838R.drawable.bg_segmented_bar_transparent);
        } else {
            setBackgroundResource(C0838R.drawable.bg_segmented_bar);
        }
        int i2 = (int) (getResources().getDisplayMetrics().density * 2.5d);
        setPadding(i2, i2, i2, i2);
        view.setBackgroundResource((!aVar.K() || KeyboardJni.isFloatingMode()) ? C0838R.drawable.bg_segmented_bar_item_selected : C0838R.drawable.bg_segmented_bar_item_selected_transparent);
        addView(view, new FrameLayout.LayoutParams(0, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.f2690f = linearLayout;
        linearLayout.setOrientation(0);
        LinearLayout linearLayout2 = this.f2690f;
        if (linearLayout2 != null) {
            linearLayout2.setGravity(17);
            LinearLayout linearLayout3 = this.f2690f;
            if (linearLayout3 != null) {
                linearLayout3.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                LinearLayout linearLayout4 = this.f2690f;
                if (linearLayout4 != null) {
                    addView(linearLayout4);
                    return;
                } else {
                    l.l("itemContainer");
                    throw null;
                }
            }
            l.l("itemContainer");
            throw null;
        }
        l.l("itemContainer");
        throw null;
    }
}
