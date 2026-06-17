package com.bytedance.android.input.keyboard.aiwrite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.lisitem.OListItemGeneral;
import com.obric.oui.segmentedtab.OTabSegmentedLayout;
import com.obric.oui.text.OTextView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class MenuView extends FrameLayout {
    private final String a;
    private List<String> b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<Integer, LinearLayout> f2604c;

    /* renamed from: d, reason: collision with root package name */
    private OTabSegmentedLayout f2605d;

    /* renamed from: e, reason: collision with root package name */
    private OTextView f2606e;

    /* renamed from: f, reason: collision with root package name */
    private int f2607f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f2608g;
    private AiPanelView h;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            com.bytedance.android.input.r.j.i(MenuView.this.a, "[model] currentMenu = " + num2);
            MenuView.e(MenuView.this);
            MenuView menuView = MenuView.this;
            kotlin.s.c.l.e(num2, "index");
            MenuView.d(menuView, num2.intValue());
            return kotlin.o.a;
        }
    }

    static final class b implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        b(kotlin.s.b.l lVar) {
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
    public MenuView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void d(MenuView menuView, int i) {
        for (Map.Entry<Integer, LinearLayout> entry : menuView.f2604c.entrySet()) {
            int intValue = entry.getKey().intValue();
            LinearLayout value = entry.getValue();
            String str = menuView.a;
            StringBuilder M = e.a.a.a.a.M("showMenuPage, mMenuPages=");
            M.append(menuView.f2604c.size());
            M.append(" index");
            M.append(intValue);
            M.append(" = ");
            e.a.a.a.a.F0(M, intValue, ", show = ", i, ", ");
            M.append(value);
            com.bytedance.android.input.r.j.i(str, M.toString());
            value.setVisibility(intValue == i ? 0 : 4);
        }
    }

    public static final void e(MenuView menuView) {
        OTabSegmentedLayout oTabSegmentedLayout = menuView.f2605d;
        if (oTabSegmentedLayout != null) {
            X x = X.a;
            Integer value = X.a().getValue();
            if (value == null) {
                value = 0;
            }
            kotlin.s.c.l.e(value, "MenuViewModel.currentMenu.value ?: 0");
            int intValue = value.intValue();
            oTabSegmentedLayout.setCurrentTab(oTabSegmentedLayout.i().get(intValue).getVisibility() == 0 ? intValue : 0);
            String str = menuView.a;
            StringBuilder M = e.a.a.a.a.M("updateTabTitle currentTab = ");
            M.append(oTabSegmentedLayout.h());
            com.bytedance.android.input.r.j.i(str, M.toString());
            oTabSegmentedLayout.invalidate();
        }
    }

    public static void g(OTabSegmentedLayout oTabSegmentedLayout, MenuView menuView, View view) {
        kotlin.s.c.l.f(oTabSegmentedLayout, "$this_apply");
        kotlin.s.c.l.f(menuView, "this$0");
        Object tag = view.getTag();
        kotlin.s.c.l.d(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        if (oTabSegmentedLayout.h() != intValue) {
            com.bytedance.android.input.r.j.i(menuView.a, "setMenuTabName currentTab selected = " + intValue);
            oTabSegmentedLayout.setCurrentTab(intValue);
            X x = X.a;
            X.b(intValue);
        }
    }

    private final void h(int i) {
        if (this.f2604c.containsKey(1)) {
            return;
        }
        View inflate = FrameLayout.inflate(getContext(), i, null);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        RelativeLayout relativeLayout = this.f2608g;
        if (relativeLayout == null) {
            kotlin.s.c.l.l("mMenuContainner");
            throw null;
        }
        relativeLayout.addView(inflate, -1, layoutParams);
        Map<Integer, LinearLayout> map = this.f2604c;
        kotlin.s.c.l.d(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        map.put(1, (LinearLayout) inflate);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_popular);
        AiPanelView aiPanelView = this.h;
        if (aiPanelView == null) {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
        linearLayout.setOnClickListener(aiPanelView);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_circle);
        AiPanelView aiPanelView2 = this.h;
        if (aiPanelView2 == null) {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
        linearLayout2.setOnClickListener(aiPanelView2);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_mail);
        AiPanelView aiPanelView3 = this.h;
        if (aiPanelView3 == null) {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
        linearLayout3.setOnClickListener(aiPanelView3);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_dianping);
        AiPanelView aiPanelView4 = this.h;
        if (aiPanelView4 == null) {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
        linearLayout4.setOnClickListener(aiPanelView4);
        LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_blessing);
        AiPanelView aiPanelView5 = this.h;
        if (aiPanelView5 == null) {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
        linearLayout5.setOnClickListener(aiPanelView5);
        LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_invitation);
        AiPanelView aiPanelView6 = this.h;
        if (aiPanelView6 == null) {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
        linearLayout6.setOnClickListener(aiPanelView6);
        LinearLayout linearLayout7 = (LinearLayout) inflate.findViewById(C0838R.id.ai_btn_common_introduction);
        AiPanelView aiPanelView7 = this.h;
        if (aiPanelView7 != null) {
            linearLayout7.setOnClickListener(aiPanelView7);
        } else {
            kotlin.s.c.l.l("mAiPanel");
            throw null;
        }
    }

    @SuppressLint({"ResourceAsColor"})
    public final void f(AiPanelView aiPanelView) {
        kotlin.s.c.l.f(aiPanelView, "aiPanel");
        this.h = aiPanelView;
        com.bytedance.android.input.r.j.i(this.a, "initPage view inflate " + this + ", child = " + getChildCount());
        View findViewById = findViewById(C0838R.id.ai_menu_containner);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.ai_menu_containner)");
        this.f2608g = (RelativeLayout) findViewById;
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.ai_menu_write);
        int i = 0;
        if (linearLayout != null) {
            this.f2604c.put(0, linearLayout);
            aiPanelView.l(linearLayout, C0838R.string.ai_btn_check, C0838R.id.ai_btn_check, C0838R.drawable.ai_writing_icon_check);
            aiPanelView.l(linearLayout, C0838R.string.ai_btn_rewrite, C0838R.id.ai_btn_rewrite, C0838R.drawable.ai_writing_icon_rewrite);
            aiPanelView.l(linearLayout, C0838R.string.ai_btn_summary, C0838R.id.ai_btn_summary, C0838R.drawable.ai_writing_icon_summary);
            OListItemGeneral oListItemGeneral = (OListItemGeneral) linearLayout.findViewById(C0838R.id.ai_btn_keypoints);
            if (oListItemGeneral != null) {
                kotlin.s.c.l.e(oListItemGeneral, "findViewById<OListItemGe…l>(R.id.ai_btn_keypoints)");
                oListItemGeneral.setOnClickListener(aiPanelView);
                oListItemGeneral.l().setMinHeight(0);
            }
            OListItemGeneral oListItemGeneral2 = (OListItemGeneral) linearLayout.findViewById(C0838R.id.ai_btn_list);
            if (oListItemGeneral2 != null) {
                kotlin.s.c.l.e(oListItemGeneral2, "findViewById<OListItemGeneral>(R.id.ai_btn_list)");
                oListItemGeneral2.setOnClickListener(aiPanelView);
                oListItemGeneral2.l().setMinHeight(0);
            }
        }
        setOrientationLast(getResources().getConfiguration().orientation);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("initPage mMenuPages size = ");
        M.append(this.f2604c.size());
        com.bytedance.android.input.r.j.i(str, M.toString());
        final OTabSegmentedLayout oTabSegmentedLayout = (OTabSegmentedLayout) findViewById(C0838R.id.tab_aipanel);
        this.f2605d = oTabSegmentedLayout;
        if (oTabSegmentedLayout != null) {
            Object[] array = this.b.toArray(new String[0]);
            kotlin.s.c.l.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            oTabSegmentedLayout.setTabTitleAndDrawable((String[]) array, null);
            for (Object obj : oTabSegmentedLayout.i()) {
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.g.b0();
                    throw null;
                }
                View view = (View) obj;
                com.bytedance.android.input.r.j.i(this.a, "setMenuTabName setOnClickListener = " + view);
                view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        MenuView.g(OTabSegmentedLayout.this, this, view2);
                    }
                });
                i = i2;
            }
            oTabSegmentedLayout.requestLayout();
        }
        this.f2606e = (OTextView) findViewById(C0838R.id.tab_aipanel_common);
        C0601v.a.h().observeForever(new b(new W(this)));
        OButton oButton = (OButton) findViewById(C0838R.id.btn_close_aipanel);
        if (oButton != null) {
            oButton.setOnClickListener(aiPanelView);
        }
        X x = X.a;
        X.a().observeForever(new b(new a()));
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration != null) {
            setOrientationLast(configuration.orientation);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (!kotlin.s.c.l.a(view, this)) {
            AiPanelView aiPanelView = this.h;
            if (aiPanelView == null) {
                kotlin.s.c.l.l("mAiPanel");
                throw null;
            }
            if (!kotlin.s.c.l.a(view, aiPanelView)) {
                return;
            }
        }
        com.bytedance.android.input.r.j.m(this.a, "onVisibilityChanged = " + view + ", visibility = " + i);
    }

    public final void setOrientationLast(int i) {
        e.a.a.a.a.C0(e.a.a.a.a.N("setOrientationLast, orientation = ", i, ", mOrientationLast = "), this.f2607f, this.a);
        if (this.f2607f != i) {
            this.f2607f = i;
            int i2 = 4;
            LinearLayout linearLayout = this.f2604c.get(1);
            if (linearLayout != null) {
                i2 = linearLayout.getVisibility();
                RelativeLayout relativeLayout = this.f2608g;
                if (relativeLayout == null) {
                    kotlin.s.c.l.l("mMenuContainner");
                    throw null;
                }
                relativeLayout.removeView(linearLayout);
            }
            this.f2604c.remove(1);
            if (this.f2607f == 2) {
                h(C0838R.layout.layout_aipanel_menu_page_scene_land);
            } else {
                h(C0838R.layout.layout_aipanel_menu_page_scene);
            }
            LinearLayout linearLayout2 = this.f2604c.get(1);
            if (linearLayout2 == null) {
                return;
            }
            linearLayout2.setVisibility(i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "AIWriting-MenuView";
        this.b = kotlin.collections.g.K("通用写作", "场景写作");
        this.f2604c = new LinkedHashMap();
        FrameLayout.inflate(context, C0838R.layout.layout_aipanel_menu_tab, this);
    }
}
