package com.obric.oui.sheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.ss.android.message.log.PushLog;
import kotlin.f;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public class OInsetSheetTitleBar extends FrameLayout {
    public LinearLayout a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f8014c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f8015d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f8016e;

    /* renamed from: f, reason: collision with root package name */
    private FrameLayout f8017f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f8018g;
    public OButton h;
    private String i;
    private TitlePosition j;

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

    public OInsetSheetTitleBar(Context context) {
        this(context, null, 0);
    }

    public final TextView a() {
        TextView textView;
        int ordinal = this.j.ordinal();
        if (ordinal == 0) {
            textView = this.f8015d;
            if (textView == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
        } else if (ordinal == 1) {
            textView = this.b;
            if (textView == null) {
                l.l("mCenterTitleView");
                throw null;
            }
        } else {
            if (ordinal != 2) {
                throw new f();
            }
            textView = this.f8014c;
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
        super.onMeasure(i, i2);
    }

    public final void setCenterText(int i) {
        String string = getResources().getString(i);
        l.e(string, "resources.getString(resId)");
        setTitleText(string);
    }

    public final void setDesText(String str) {
        if (str == null || str.length() == 0) {
            FrameLayout frameLayout = this.f8017f;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                l.l("mDesContainerView");
                throw null;
            }
        }
        FrameLayout frameLayout2 = this.f8017f;
        if (frameLayout2 == null) {
            l.l("mDesContainerView");
            throw null;
        }
        frameLayout2.setVisibility(0);
        TextView textView = this.f8018g;
        if (textView != null) {
            textView.setText(str);
        } else {
            l.l("mDesTextView");
            throw null;
        }
    }

    public final void setMCenterContainer(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
    }

    public final void setMFixedCenterContainer(FrameLayout frameLayout) {
        l.f(frameLayout, "<set-?>");
    }

    public final void setMLeftActionBack(OButton oButton) {
        l.f(oButton, "<set-?>");
        this.h = oButton;
    }

    public final void setMLeftContainer(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
    }

    public final void setMRightContainer(LinearLayout linearLayout) {
        l.f(linearLayout, "<set-?>");
        this.a = linearLayout;
    }

    public final void setMTitlePosition(TitlePosition titlePosition) {
        l.f(titlePosition, PushLog.KEY_VALUE);
        this.j = titlePosition;
        int ordinal = titlePosition.ordinal();
        if (ordinal == 0) {
            TextView textView = this.f8015d;
            if (textView == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView.setVisibility(0);
            TextView textView2 = this.b;
            if (textView2 == null) {
                l.l("mCenterTitleView");
                throw null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.f8014c;
            if (textView3 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            textView3.setVisibility(8);
        } else if (ordinal == 1) {
            TextView textView4 = this.f8015d;
            if (textView4 == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView4.setVisibility(8);
            TextView textView5 = this.b;
            if (textView5 == null) {
                l.l("mCenterTitleView");
                throw null;
            }
            textView5.setVisibility(0);
            TextView textView6 = this.f8014c;
            if (textView6 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            textView6.setVisibility(8);
        } else if (ordinal == 2) {
            TextView textView7 = this.f8015d;
            if (textView7 == null) {
                l.l("mFixedCenterTitleView");
                throw null;
            }
            textView7.setVisibility(8);
            TextView textView8 = this.b;
            if (textView8 == null) {
                l.l("mCenterTitleView");
                throw null;
            }
            textView8.setVisibility(8);
            TextView textView9 = this.f8014c;
            if (textView9 == null) {
                l.l("mLeftTitleView");
                throw null;
            }
            textView9.setVisibility(0);
            setShowLeftBack(false);
        }
        a().setText(this.i);
    }

    public final void setShowLeftBack(boolean z) {
        OButton oButton = this.h;
        if (oButton == null) {
            l.l("mLeftActionBack");
            throw null;
        }
        oButton.setVisibility(z ? 0 : 8);
        if (this.j == TitlePosition.LEFT_IN_ACTION) {
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
            TextView textView = this.f8016e;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            } else {
                l.l("mFixedCenterSubTitleView");
                throw null;
            }
        }
        TextView textView2 = this.f8016e;
        if (textView2 == null) {
            l.l("mFixedCenterSubTitleView");
            throw null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.f8016e;
        if (textView3 != null) {
            textView3.setText(str);
        } else {
            l.l("mFixedCenterSubTitleView");
            throw null;
        }
    }

    public final void setTitleText(String str) {
        this.i = str;
        if (str == null) {
            a().setVisibility(4);
        } else {
            a().setVisibility(0);
            a().setText(str);
        }
    }

    public OInsetSheetTitleBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInsetSheetTitleBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        TitlePosition titlePosition = TitlePosition.FIXED_CENTER;
        this.j = titlePosition;
        FrameLayout.inflate(context, C0838R.layout.o_sheet_title_bar_container, this);
        View findViewById = findViewById(C0838R.id.center_title);
        l.e(findViewById, "findViewById(R.id.center_title)");
        this.b = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.left_title);
        l.e(findViewById2, "findViewById(R.id.left_title)");
        this.f8014c = (TextView) findViewById2;
        View findViewById3 = findViewById(C0838R.id.ll_left_action_container);
        l.e(findViewById3, "findViewById(R.id.ll_left_action_container)");
        View findViewById4 = findViewById(C0838R.id.ll_right_action_container);
        l.e(findViewById4, "findViewById(R.id.ll_right_action_container)");
        this.a = (LinearLayout) findViewById4;
        View findViewById5 = findViewById(C0838R.id.fl_center_action_container);
        l.e(findViewById5, "findViewById(R.id.fl_center_action_container)");
        View findViewById6 = findViewById(C0838R.id.fl_fixed_center_action_container);
        l.e(findViewById6, "findViewById(R.id.fl_fix…_center_action_container)");
        View findViewById7 = findViewById(C0838R.id.fixed_center_title);
        l.e(findViewById7, "findViewById(R.id.fixed_center_title)");
        this.f8015d = (TextView) findViewById7;
        View findViewById8 = findViewById(C0838R.id.left_action_back);
        l.e(findViewById8, "findViewById(R.id.left_action_back)");
        this.h = (OButton) findViewById8;
        View findViewById9 = findViewById(C0838R.id.fixed_center_sub_title);
        l.e(findViewById9, "findViewById(R.id.fixed_center_sub_title)");
        this.f8016e = (TextView) findViewById9;
        View findViewById10 = findViewById(C0838R.id.sheet_title_bar_des);
        l.e(findViewById10, "findViewById(R.id.sheet_title_bar_des)");
        this.f8017f = (FrameLayout) findViewById10;
        View findViewById11 = findViewById(C0838R.id.sheet_title_bar_des_text);
        l.e(findViewById11, "findViewById(R.id.sheet_title_bar_des_text)");
        this.f8018g = (TextView) findViewById11;
        if (attributeSet != null) {
            Context context2 = getContext();
            l.e(context2, "context");
            TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, e.i.a.b.b.h, 0, 0);
            try {
                setMTitlePosition(TitlePosition.values()[obtainStyledAttributes.getInt(3, titlePosition.getValue())]);
                setTitleText(obtainStyledAttributes.getString(4));
                setDesText(obtainStyledAttributes.getString(2));
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
