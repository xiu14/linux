package com.obric.oui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.ss.android.message.log.PushLog;
import kotlin.f;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OCTitleBar extends FrameLayout {
    public LinearLayout a;
    public LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f8107c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f8108d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f8109e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f8110f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f8111g;
    public OButton h;
    private int i;
    private String j;
    private TitlePosition k;

    public enum TitlePosition {
        FIXED_CENTER(0),
        FLOW_WITH_ACTION(1),
        LEFT_IN_ACTION(2);

        private final int value;

        TitlePosition(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OCTitleBar.this.c();
        }
    }

    public OCTitleBar(Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        TitlePosition titlePosition = this.k;
        if (titlePosition == TitlePosition.LEFT_IN_ACTION) {
            TextView textView = this.f8109e;
            if (textView != null) {
                textView.requestLayout();
                return;
            } else {
                l.l("mLeftTitleView");
                throw null;
            }
        }
        if (titlePosition == TitlePosition.FIXED_CENTER) {
            TextView textView2 = this.f8110f;
            if (textView2 == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView2.requestLayout();
            TextView textView3 = this.f8111g;
            if (textView3 == null) {
                l.l("mFixedCenterSubTitleView");
                throw null;
            }
            textView3.requestLayout();
            FrameLayout frameLayout = this.f8107c;
            if (frameLayout != null) {
                frameLayout.requestLayout();
            } else {
                l.l("mFixedCenterContainer");
                throw null;
            }
        }
    }

    public final TextView b() {
        TextView textView;
        int ordinal = this.k.ordinal();
        if (ordinal == 0) {
            textView = this.f8110f;
            if (textView == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
        } else if (ordinal == 1) {
            textView = this.f8108d;
            if (textView == null) {
                l.l("mCenterTitleView");
                throw null;
            }
        } else {
            if (ordinal != 2) {
                throw new f();
            }
            textView = this.f8109e;
            if (textView == null) {
                l.l("mLeftTitleView");
                throw null;
            }
        }
        return textView;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        TitlePosition titlePosition = this.k;
        if (titlePosition == TitlePosition.LEFT_IN_ACTION) {
            TextView textView = this.f8109e;
            if (textView == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            int measuredWidth = getMeasuredWidth();
            LinearLayout linearLayout = this.b;
            if (linearLayout == null) {
                l.l("mRightContainer");
                throw null;
            }
            int measuredWidth2 = measuredWidth - linearLayout.getMeasuredWidth();
            LinearLayout linearLayout2 = this.a;
            if (linearLayout2 == null) {
                l.l("mLeftContainer");
                throw null;
            }
            int paddingLeft = measuredWidth2 - linearLayout2.getPaddingLeft();
            LinearLayout linearLayout3 = this.a;
            if (linearLayout3 == null) {
                l.l("mLeftContainer");
                throw null;
            }
            int paddingRight = paddingLeft - linearLayout3.getPaddingRight();
            TextView textView2 = this.f8109e;
            if (textView2 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i5 = paddingRight - (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
            TextView textView3 = this.f8109e;
            if (textView3 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams2 = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            int i6 = i5 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0);
            TextView textView4 = this.f8109e;
            if (textView4 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            int paddingLeft2 = i6 - textView4.getPaddingLeft();
            TextView textView5 = this.f8109e;
            if (textView5 != null) {
                textView.setMaxWidth(paddingLeft2 - textView5.getPaddingRight());
                return;
            } else {
                l.l("mLeftTitleView");
                throw null;
            }
        }
        if (titlePosition == TitlePosition.FIXED_CENTER) {
            LinearLayout linearLayout4 = this.a;
            if (linearLayout4 == null) {
                l.l("mLeftContainer");
                throw null;
            }
            if (linearLayout4.getVisibility() == 0) {
                LinearLayout linearLayout5 = this.a;
                if (linearLayout5 == null) {
                    l.l("mLeftContainer");
                    throw null;
                }
                int measuredWidth3 = linearLayout5.getMeasuredWidth();
                LinearLayout linearLayout6 = this.a;
                if (linearLayout6 == null) {
                    l.l("mLeftContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams3 = linearLayout6.getLayoutParams();
                if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams3 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                i3 = measuredWidth3 + (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
            } else {
                i3 = 0;
            }
            LinearLayout linearLayout7 = this.b;
            if (linearLayout7 == null) {
                l.l("mRightContainer");
                throw null;
            }
            if (linearLayout7.getVisibility() == 0) {
                LinearLayout linearLayout8 = this.b;
                if (linearLayout8 == null) {
                    l.l("mRightContainer");
                    throw null;
                }
                int measuredWidth4 = linearLayout8.getMeasuredWidth();
                LinearLayout linearLayout9 = this.b;
                if (linearLayout9 == null) {
                    l.l("mRightContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams4 = linearLayout9.getLayoutParams();
                if (!(layoutParams4 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams4 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                i4 = measuredWidth4 + (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
            } else {
                i4 = 0;
            }
            int max = Math.max(i3, i4);
            FrameLayout frameLayout = this.f8107c;
            if (frameLayout == null) {
                l.l("mFixedCenterContainer");
                throw null;
            }
            if (frameLayout.getVisibility() == 0) {
                FrameLayout frameLayout2 = this.f8107c;
                if (frameLayout2 == null) {
                    l.l("mFixedCenterContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams5 = frameLayout2.getLayoutParams();
                if (!(layoutParams5 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams5 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
                int i7 = marginLayoutParams5 != null ? marginLayoutParams5.leftMargin : 0;
                FrameLayout frameLayout3 = this.f8107c;
                if (frameLayout3 == null) {
                    l.l("mFixedCenterContainer");
                    throw null;
                }
                ViewGroup.LayoutParams layoutParams6 = frameLayout3.getLayoutParams();
                if (!(layoutParams6 instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams6 = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams6;
                int i8 = i7 + (marginLayoutParams6 != null ? marginLayoutParams6.rightMargin : 0);
                int measuredWidth5 = (getMeasuredWidth() - (max * 2)) - i8;
                int max2 = Math.max(measuredWidth5, this.i);
                TextView textView6 = this.f8110f;
                if (textView6 == null) {
                    l.l("mFixedCenterTitleView");
                    throw null;
                }
                if (textView6 == null) {
                    l.l("mFixedCenterTitleView");
                    throw null;
                }
                int paddingLeft3 = textView6.getPaddingLeft() + max2;
                TextView textView7 = this.f8110f;
                if (textView7 == null) {
                    l.l("mFixedCenterTitleView");
                    throw null;
                }
                textView6.setMaxWidth(textView7.getPaddingRight() + paddingLeft3);
                TextView textView8 = this.f8111g;
                if (textView8 == null) {
                    l.l("mFixedCenterSubTitleView");
                    throw null;
                }
                if (textView8 == null) {
                    l.l("mFixedCenterSubTitleView");
                    throw null;
                }
                int paddingLeft4 = textView8.getPaddingLeft() + max2;
                TextView textView9 = this.f8111g;
                if (textView9 == null) {
                    l.l("mFixedCenterSubTitleView");
                    throw null;
                }
                textView8.setMaxWidth(textView9.getPaddingRight() + paddingLeft4);
                StringBuilder sb = new StringBuilder();
                sb.append("expectedMaxWidth: ");
                sb.append(measuredWidth5);
                sb.append(", measuredWidth: ");
                sb.append(getMeasuredWidth());
                sb.append(", leftUsedSpace: ");
                sb.append(i3);
                sb.append(", rightUsedSpace: ");
                e.a.a.a.a.F0(sb, i4, ", centerMargin: ", i8, ", maxWidth: ");
                sb.append(max2);
                e.i.b.f.e.b.a("OCTitleBarLegacy", sb.toString());
            }
        }
    }

    public final void setCenterText(int i) {
        String string = getResources().getString(i);
        l.e(string, "resources.getString(resId)");
        setTitleText(string);
    }

    public final void setFixedCenterTitleContainer(ViewGroup viewGroup) {
        l.f(viewGroup, "<set-?>");
    }

    public final void setMCenterContainer(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
    }

    public final void setMFixedCenterContainer(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
        this.f8107c = frameLayout;
    }

    public final void setMLeftActionBack(OButton oButton) {
        l.f(oButton, "<set-?>");
        this.h = oButton;
    }

    public final void setMLeftContainer(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.a = linearLayout;
    }

    public final void setMRightContainer(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.b = linearLayout;
    }

    public final void setMTitlePosition(TitlePosition titlePosition) {
        l.f(titlePosition, PushLog.KEY_VALUE);
        this.k = titlePosition;
        int ordinal = titlePosition.ordinal();
        if (ordinal == 0) {
            TextView textView = this.f8110f;
            if (textView == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.f8108d;
            if (textView2 == null) {
                l.l("mCenterTitleView");
                throw null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.f8109e;
            if (textView3 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            textView3.setVisibility(8);
        } else if (ordinal == 1) {
            TextView textView4 = this.f8110f;
            if (textView4 == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView4.setVisibility(8);
            TextView textView5 = this.f8108d;
            if (textView5 == null) {
                l.l("mCenterTitleView");
                throw null;
            }
            textView5.setVisibility(0);
            TextView textView6 = this.f8109e;
            if (textView6 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            textView6.setVisibility(8);
        } else if (ordinal == 2) {
            TextView textView7 = this.f8110f;
            if (textView7 == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView7.setVisibility(8);
            TextView textView8 = this.f8108d;
            if (textView8 == null) {
                l.l("mCenterTitleView");
                throw null;
            }
            textView8.setVisibility(8);
            TextView textView9 = this.f8109e;
            if (textView9 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            textView9.setVisibility(0);
            setShowLeftBack(false);
        }
        b().setText(this.j);
    }

    public final void setMinCenterTitleWidth(int i) {
        this.i = e.a.a.a.a.e0("Resources.getSystem()", 1, i);
        post(new a());
    }

    public final void setShowLeftBack(boolean z) {
        OButton oButton = this.h;
        if (oButton == null) {
            l.l("mLeftActionBack");
            throw null;
        }
        oButton.setVisibility(z ? 0 : 8);
        if (this.k == TitlePosition.LEFT_IN_ACTION) {
            OButton oButton2 = this.h;
            if (oButton2 != null) {
                oButton2.setVisibility(8);
            } else {
                l.l("mLeftActionBack");
                throw null;
            }
        }
    }

    public final void setSubTitleText(String str) {
        if (str == null) {
            TextView textView = this.f8111g;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                l.l("mFixedCenterSubTitleView");
                throw null;
            }
        }
        TextView textView2 = this.f8111g;
        if (textView2 == null) {
            l.l("mFixedCenterSubTitleView");
            throw null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.f8111g;
        if (textView3 == null) {
            l.l("mFixedCenterSubTitleView");
            throw null;
        }
        textView3.setText(str);
        Resources resources = getResources();
        l.e(resources, "resources");
        if (resources.getConfiguration().fontScale > 1.0f) {
            TextView textView4 = this.f8110f;
            if (textView4 == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView4.setTextSize(1, 16.0f);
            TextView textView5 = this.f8111g;
            if (textView5 == null) {
                l.l("mFixedCenterSubTitleView");
                throw null;
            }
            textView5.setTextSize(1, 12.0f);
        }
        c();
    }

    public final void setTitleText(String str) {
        this.j = str;
        if (str == null) {
            b().setVisibility(4);
            return;
        }
        b().setVisibility(0);
        b().setText(str);
        c();
    }

    public OCTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        this.i = e.a.a.a.a.e0("Resources.getSystem()", 1, 70);
        TitlePosition titlePosition = TitlePosition.FIXED_CENTER;
        this.k = titlePosition;
        FrameLayout.inflate(context, C0838R.layout.o_title_bar_container, this);
        View findViewById = findViewById(C0838R.id.center_title);
        l.e(findViewById, "findViewById(R.id.center_title)");
        this.f8108d = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.left_title);
        l.e(findViewById2, "findViewById(R.id.left_title)");
        this.f8109e = (TextView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.ll_left_action_container);
        l.e(findViewById3, "findViewById(R.id.ll_left_action_container)");
        this.a = (LinearLayout) findViewById3;
        View findViewById4 = findViewById(C0838R.id.ll_right_action_container);
        l.e(findViewById4, "findViewById(R.id.ll_right_action_container)");
        this.b = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(C0838R.id.fl_center_action_container);
        l.e(findViewById5, "findViewById(R.id.fl_center_action_container)");
        View findViewById6 = findViewById(C0838R.id.fl_fixed_center_action_container);
        l.e(findViewById6, "findViewById(R.id.fl_fix…_center_action_container)");
        this.f8107c = (FrameLayout) findViewById6;
        View findViewById7 = findViewById(C0838R.id.fixed_center_title);
        l.e(findViewById7, "findViewById(R.id.fixed_center_title)");
        this.f8110f = (TextView) findViewById7;
        View findViewById8 = findViewById(C0838R.id.left_action_back);
        l.e(findViewById8, "findViewById(R.id.left_action_back)");
        this.h = (OButton) findViewById8;
        View findViewById9 = findViewById(C0838R.id.fixed_center_sub_title);
        l.e(findViewById9, "findViewById(R.id.fixed_center_sub_title)");
        this.f8111g = (TextView) findViewById9;
        View findViewById10 = findViewById(C0838R.id.fixed_center_title_container);
        l.e(findViewById10, "findViewById(R.id.fixed_center_title_container)");
        if (attributeSet != null) {
            Context context2 = getContext();
            l.e(context2, "context");
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.h, 0, 0);
            try {
                setMTitlePosition(TitlePosition.values()[obtainStyledAttributes.getInt(3, titlePosition.getValue())]);
                setTitleText(obtainStyledAttributes.getString(4));
                setShowLeftBack(obtainStyledAttributes.getBoolean(5, true));
                setSubTitleText(obtainStyledAttributes.getString(1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public final void setCenterText(String str) {
        l.f(str, "title");
        setTitleText(str);
    }
}
