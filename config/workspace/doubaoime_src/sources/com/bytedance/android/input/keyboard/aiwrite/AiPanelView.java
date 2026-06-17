package com.bytedance.android.input.keyboard.aiwrite;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.IntentCompat;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.aiwrite.C0601v;
import com.obric.oui.layout.OUIFrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlinx.coroutines.C0795d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AiPanelView extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int m = 0;
    private final String a;
    private final ArrayList<FrameLayout> b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<FrameLayout> f2544c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f2545d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2546e;

    /* renamed from: f, reason: collision with root package name */
    private final int f2547f;

    /* renamed from: g, reason: collision with root package name */
    private final int f2548g;
    private boolean h;
    private int i;
    private int j;
    private boolean k;
    private int l;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        a() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            int f2 = C0601v.a.f();
            if (num2 != null && num2.intValue() == f2) {
                AiPanelView.a(AiPanelView.this);
            }
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

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        final /* synthetic */ OUIFrameLayout b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(OUIFrameLayout oUIFrameLayout) {
            super(1);
            this.b = oUIFrameLayout;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.bytedance.android.input.r.j.i(AiPanelView.this.a, "[model] DetailViewState.streamEnd = " + bool2 + ", to setDetailBottomBtn enable");
            OUIFrameLayout oUIFrameLayout = this.b;
            if (oUIFrameLayout != null) {
                kotlin.s.c.l.e(bool2, "end");
                oUIFrameLayout.setEnabled(bool2.booleanValue());
            }
            return kotlin.o.a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiPanelView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void a(AiPanelView aiPanelView) {
        if (aiPanelView.i == 1 && aiPanelView.g()) {
            C0601v c0601v = C0601v.a;
            Integer value = U.a.g().getValue();
            kotlin.s.c.l.c(value);
            if (c0601v.d(value.intValue())) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = aiPanelView.getLayoutParams();
            com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
            layoutParams.height = com.bytedance.android.input.keyboard.areacontrol.k.B();
            aiPanelView.requestLayout();
        }
    }

    private final void f() {
        com.bytedance.android.input.r.j.i(this.a, "replace");
        C0601v.a.r();
        IAppLog.a aVar = IAppLog.a;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
        jSONObject.put("actionname", "replace");
        aVar.t("AI_tabcontentchange", jSONObject);
    }

    private final void k(int i) {
        if (this.i != i) {
            this.i = i;
            boolean z = i == 2;
            if (z) {
                int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.ai_panel_paddingHorizontal);
                setPadding(dimensionPixelSize, 0, dimensionPixelSize, this.j);
                C0601v.a.y(0);
            } else {
                setPadding(0, 0, 0, this.j);
            }
            if (getLayoutParams() == null) {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                setLayoutParams(new ViewGroup.LayoutParams(-1, com.bytedance.android.input.keyboard.areacontrol.k.q()));
            } else {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
                layoutParams.height = com.bytedance.android.input.keyboard.areacontrol.k.q();
            }
            com.bytedance.android.input.r.j.m(this.a, "setOrientationLast orientation = " + i + " padding = " + z + ", height = " + getLayoutParams().height);
            requestLayout();
            FrameLayout frameLayout = this.k ? this.f2544c.get(0) : this.b.get(0);
            kotlin.s.c.l.e(frameLayout, "if (mCurrentIsDart) {\n  …iews[0]\n                }");
            if (frameLayout instanceof MenuView) {
                ((MenuView) frameLayout).setOrientationLast(i);
            }
        }
    }

    private final void n(int i) {
        if (IAppGlobals.a.F()) {
            U u = U.a;
            u.u(i);
            u.v(1);
            q(this.f2547f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(int r6) {
        /*
            r5 = this;
            r5.l = r6
            boolean r0 = r5.k
            if (r0 == 0) goto L9
            java.util.ArrayList<android.widget.FrameLayout> r0 = r5.f2544c
            goto Lb
        L9:
            java.util.ArrayList<android.widget.FrameLayout> r0 = r5.b
        Lb:
            java.lang.String r1 = r5.a
            java.lang.String r2 = "showPage, pageType = "
            java.lang.String r3 = ", mCurrentPage = "
            java.lang.StringBuilder r2 = e.a.a.a.a.N(r2, r6, r3)
            int r3 = r5.l
            r2.append(r3)
            java.lang.String r3 = ", viewList size = "
            r2.append(r3)
            int r3 = r0.size()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.android.input.r.j.i(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L33:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L52
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            if (r2 != r6) goto L49
            r3.setVisibility(r1)
            goto L4d
        L49:
            r2 = 4
            r3.setVisibility(r2)
        L4d:
            r5.requestLayout()
            r2 = r4
            goto L33
        L52:
            kotlin.collections.g.b0()
            r6 = 0
            throw r6
        L57:
            int r6 = r5.i
            r0 = 1
            if (r6 != r0) goto Lc5
            boolean r6 = r5.g()
            if (r6 == 0) goto L90
            com.bytedance.android.input.keyboard.aiwrite.v r6 = com.bytedance.android.input.keyboard.aiwrite.C0601v.a
            com.bytedance.android.input.keyboard.aiwrite.U r0 = com.bytedance.android.input.keyboard.aiwrite.U.a
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r0 = r0.getValue()
            kotlin.s.c.l.c(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = r6.d(r0)
            if (r0 == 0) goto L90
            int r0 = r6.g()
            r6.y(r0)
            com.bytedance.android.input.keyboard.areacontrol.k r6 = com.bytedance.android.input.keyboard.areacontrol.k.a
            int r6 = com.bytedance.android.input.keyboard.areacontrol.k.q()
            int r0 = com.bytedance.android.input.keyboard.areacontrol.k.v()
            int r6 = r6 - r0
            goto L96
        L90:
            com.bytedance.android.input.keyboard.areacontrol.k r6 = com.bytedance.android.input.keyboard.areacontrol.k.a
            int r6 = com.bytedance.android.input.keyboard.areacontrol.k.q()
        L96:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            if (r0 != 0) goto La6
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r0.<init>(r1, r6)
            r5.setLayoutParams(r0)
            goto Lac
        La6:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r0.height = r6
        Lac:
            java.lang.String r0 = r5.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "changeViewHeight current = "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.bytedance.android.input.r.j.m(r0, r6)
            r5.requestLayout()
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.AiPanelView.q(int):void");
    }

    public final void c() {
        boolean z = this.k;
        IAppGlobals.a aVar = IAppGlobals.a;
        if (z == aVar.b()) {
            return;
        }
        boolean b2 = aVar.b();
        this.k = b2;
        if (b2 && this.f2544c.isEmpty()) {
            String str = this.a;
            StringBuilder M = e.a.a.a.a.M("checkUiMode, mMainViewsDark add uimode = ");
            M.append(getContext().getResources().getConfiguration().uiMode);
            com.bytedance.android.input.r.j.m(str, M.toString());
            Configuration configuration = getContext().getResources().getConfiguration();
            configuration.uiMode = 32;
            Context createConfigurationContext = getContext().createConfigurationContext(configuration);
            kotlin.s.c.l.e(createConfigurationContext, "themedContext");
            MenuView menuView = new MenuView(createConfigurationContext, null);
            menuView.f(this);
            this.f2544c.add(menuView);
            DetailView detailView = new DetailView(createConfigurationContext, null);
            detailView.d(this);
            this.f2544c.add(detailView);
            CheckView checkView = new CheckView(createConfigurationContext, null);
            checkView.f(this);
            this.f2544c.add(checkView);
        } else if (!this.k && this.b.isEmpty()) {
            String str2 = this.a;
            StringBuilder M2 = e.a.a.a.a.M("checkUiMode, mMainViews add uimode = ");
            M2.append(getContext().getResources().getConfiguration().uiMode);
            com.bytedance.android.input.r.j.i(str2, M2.toString());
            Configuration configuration2 = getContext().getResources().getConfiguration();
            configuration2.uiMode = 17;
            Context createConfigurationContext2 = getContext().createConfigurationContext(configuration2);
            kotlin.s.c.l.e(createConfigurationContext2, "themedContext");
            MenuView menuView2 = new MenuView(createConfigurationContext2, null);
            menuView2.f(this);
            this.b.add(menuView2);
            DetailView detailView2 = new DetailView(createConfigurationContext2, null);
            detailView2.d(this);
            this.b.add(detailView2);
            CheckView checkView2 = new CheckView(createConfigurationContext2, null);
            checkView2.f(this);
            this.b.add(checkView2);
        }
        String str3 = this.a;
        StringBuilder M3 = e.a.a.a.a.M("initChildView, before add childs = ");
        M3.append(getChildCount());
        com.bytedance.android.input.r.j.i(str3, M3.toString());
        removeAllViews();
        if (this.k) {
            Iterator<T> it2 = this.f2544c.iterator();
            while (it2.hasNext()) {
                addView((FrameLayout) it2.next(), -1, new ViewGroup.LayoutParams(-1, -1));
            }
            setBackground(getContext().getDrawable(C0838R.drawable.ai_writing_bg_night));
        } else {
            Iterator<T> it3 = this.b.iterator();
            while (it3.hasNext()) {
                addView((FrameLayout) it3.next(), -1, new ViewGroup.LayoutParams(-1, -1));
            }
            setBackground(getContext().getDrawable(C0838R.drawable.ai_writing_bg));
        }
        q(this.l);
        String str4 = this.a;
        StringBuilder M4 = e.a.a.a.a.M("checkUiMode, after add childs = ");
        M4.append(getChildCount());
        com.bytedance.android.input.r.j.i(str4, M4.toString());
    }

    public final void d(int i) {
        String string = getResources().getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "resources.getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        e.a.a.a.a.m0("doClickAiFunction, inputMode = ", intValue, ", scene = ", i, this.a);
        if (intValue == 1) {
            KeyboardJni.showOpenFullInputModeAlert(i);
            return;
        }
        C0601v.a.e(i, true);
        if (((Boolean) C0795d.p(null, new C0600u(i, this, null), 1, null)).booleanValue()) {
            return;
        }
        n(i);
        this.f2546e = false;
    }

    public final void e(int i) {
        String string = getResources().getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "resources.getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) f2).intValue();
        e.a.a.a.a.m0("doClickCheck, inputMode = ", intValue, ", scene = ", i, this.a);
        if (intValue == 1) {
            KeyboardJni.showOpenFullInputModeAlert(i);
            return;
        }
        C0601v.a.e(i, true);
        if (((Boolean) C0795d.p(null, new C0600u(C0838R.id.ai_btn_check, this, null), 1, null)).booleanValue()) {
            return;
        }
        m(false);
    }

    public final boolean g() {
        int i = this.l;
        return i == this.f2547f || i == this.f2548g;
    }

    public final void h() {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("aipanel onCreateInputView, initialized = ");
        M.append(this.h);
        com.bytedance.android.input.r.j.m(str, M.toString());
        if (this.h) {
            return;
        }
        this.k = !IAppGlobals.a.b();
        c();
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        k(com.bytedance.android.input.keyboard.areacontrol.k.m());
        C0601v.a.m().observeForever(new b(new a()));
        this.h = true;
    }

    public final void i() {
        com.bytedance.android.input.r.j.i(this.a, "restartLastPage");
        if (g()) {
            U.a.t();
        }
    }

    public final OUIFrameLayout j(ConstraintLayout constraintLayout, int i, int i2, int i3) {
        ImageView imageView;
        OUIFrameLayout oUIFrameLayout = (OUIFrameLayout) constraintLayout.findViewById(i2);
        TextView textView = oUIFrameLayout != null ? (TextView) oUIFrameLayout.findViewById(C0838R.id.ai_btn_rewrite_menu_item_text) : null;
        if (textView != null) {
            textView.setText(getResources().getString(i));
        }
        if (oUIFrameLayout != null && (imageView = (ImageView) oUIFrameLayout.findViewById(C0838R.id.ai_btn_rewrite_menu_item_icon)) != null) {
            imageView.setImageResource(i3);
        }
        if (oUIFrameLayout != null) {
            oUIFrameLayout.setOnClickListener(this);
        }
        if (i != C0838R.string.ai_btn_next) {
            U.a.n().observeForever(new b(new c(oUIFrameLayout)));
        }
        return oUIFrameLayout;
    }

    public final OUIFrameLayout l(LinearLayout linearLayout, int i, int i2, int i3) {
        ImageView imageView;
        OUIFrameLayout oUIFrameLayout = (OUIFrameLayout) linearLayout.findViewById(i2);
        TextView textView = oUIFrameLayout != null ? (TextView) oUIFrameLayout.findViewById(C0838R.id.ai_btn_rewrite_menu_item_text) : null;
        if (textView != null) {
            textView.setText(getResources().getString(i));
        }
        if (oUIFrameLayout != null && (imageView = (ImageView) oUIFrameLayout.findViewById(C0838R.id.ai_btn_rewrite_menu_item_icon)) != null) {
            imageView.setImageResource(i3);
        }
        if (oUIFrameLayout != null) {
            oUIFrameLayout.setOnClickListener(this);
        }
        return oUIFrameLayout;
    }

    public final void m(boolean z) {
        if (IAppGlobals.a.F()) {
            this.f2546e = z;
            U.a.u(C0838R.id.ai_btn_check);
            CheckViewModel.a.w(1);
            q(this.f2548g);
        }
    }

    public final void o() {
        com.bytedance.android.input.r.j.i(this.a, "show menu page");
        U.a.u(0);
        q(0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        Integer value;
        String str2 = this.a;
        StringBuilder M = e.a.a.a.a.M("button ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        M.append(" is click");
        com.bytedance.android.input.r.j.i(str2, M.toString());
        if (view != null) {
            int id = view.getId();
            boolean z = false;
            str = "check";
            switch (id) {
                case C0838R.id.ai_btn_check /* 2131361926 */:
                    e(id);
                    e.a.a.a.a.q0("tabname", "check", IAppLog.a, "AI_tabselect");
                    break;
                case C0838R.id.ai_btn_copy /* 2131361934 */:
                    com.bytedance.android.input.r.j.i(this.a, "copy");
                    Object systemService = getContext().getSystemService("clipboard");
                    kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    U u = U.a;
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newHtmlText("ai content", u.o().getValue(), u.p().getValue()));
                    String string = IAppGlobals.a.getContext().getResources().getString(C0838R.string.tip_copy);
                    kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(resId)");
                    C0603x.d(new C0603x(string, z.a), C0838R.drawable.ai_writing_icon_toast_ok, 0, 0, 0, 0, 0L, 62);
                    IAppLog.a aVar = IAppLog.a;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
                    jSONObject.put("actionname", "copy");
                    aVar.t("AI_tabcontentchange", jSONObject);
                    break;
                case C0838R.id.ai_btn_next /* 2131361938 */:
                    com.bytedance.android.input.r.j.i(this.a, "showNextResult");
                    U.a.s();
                    IAppLog.a aVar2 = IAppLog.a;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
                    jSONObject2.put("actionname", "nextone");
                    aVar2.t("AI_tabcontentchange", jSONObject2);
                    break;
                case C0838R.id.ai_btn_pre /* 2131361939 */:
                    com.bytedance.android.input.r.j.i(this.a, "showNextResult");
                    U.a.f();
                    IAppLog.a aVar3 = IAppLog.a;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
                    jSONObject3.put("actionname", "lastone");
                    aVar3.t("AI_tabcontentchange", jSONObject3);
                    break;
                case C0838R.id.ai_btn_replace /* 2131361940 */:
                    f();
                    break;
                case C0838R.id.ai_btn_retry /* 2131361941 */:
                case C0838R.id.ai_btn_retry_now /* 2131361947 */:
                    com.bytedance.android.input.r.j.i(this.a, "retry");
                    C0601v c0601v = C0601v.a;
                    c0601v.s(true);
                    U u2 = U.a;
                    Integer value2 = u2.g().getValue();
                    if (value2 != null && c0601v.p(value2.intValue())) {
                        z = true;
                    }
                    if (z) {
                        Integer value3 = u2.g().getValue();
                        kotlin.s.c.l.c(value3);
                        V.l(true, null, 0, c0601v.d(value3.intValue()), 2);
                    }
                    u2.v(1);
                    C0601v.a value4 = c0601v.l().getValue();
                    if (value4 != null) {
                        com.bytedance.android.input.q.z.a.u(value4.d(), value4.c(), value4.b(), true, true);
                    }
                    IAppLog.a aVar4 = IAppLog.a;
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
                    jSONObject4.put("actionname", "retry");
                    aVar4.t("AI_tabcontentchange", jSONObject4);
                    break;
                case C0838R.id.ai_btn_share /* 2131361954 */:
                    com.bytedance.android.input.r.j.i(this.a, "share");
                    IAppLog.a aVar5 = IAppLog.a;
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
                    jSONObject5.put("actionname", "share");
                    aVar5.t("AI_tabcontentchange", jSONObject5);
                    IAppGlobals.a aVar6 = IAppGlobals.a;
                    Objects.requireNonNull(aVar6);
                    final Application application = aVar6.getApplication();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setAction("android.intent.action.SEND");
                    U u3 = U.a;
                    String value5 = u3.p().getValue();
                    if (value5 != null) {
                        if (value5.length() > 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        intent.putExtra(IntentCompat.EXTRA_HTML_TEXT, u3.p().getValue());
                        intent.putExtra("android.intent.extra.TEXT", u3.o().getValue());
                        intent.setType("text/html");
                    } else {
                        intent.putExtra("android.intent.extra.TEXT", u3.o().getValue());
                        intent.setType("text/plain");
                    }
                    final Intent createChooser = Intent.createChooser(intent, "分享到");
                    createChooser.addFlags(268435456);
                    this.f2545d.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = application;
                            Intent intent2 = createChooser;
                            int i = AiPanelView.m;
                            kotlin.s.c.l.f(context, "$context");
                            context.startActivity(intent2);
                        }
                    });
                    break;
                case C0838R.id.btn_aiwrite_back /* 2131362090 */:
                    com.bytedance.android.input.r.j.i(this.a, "back");
                    Integer value6 = U.a.g().getValue();
                    e.a.a.a.a.q0("tabname", (value6 == null || value6.intValue() != C0838R.id.ai_btn_check) ? com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()) : "check", IAppLog.a, "AI_tabclickback");
                    C0601v.a.s(false);
                    if (!this.f2546e) {
                        q(0);
                        break;
                    } else {
                        V.c(true);
                        InputView inputView = ImeService.x;
                        if (inputView != null) {
                            Boolean bool = Boolean.FALSE;
                            inputView.O(bool, bool);
                            break;
                        }
                    }
                    break;
                case C0838R.id.btn_aiwrite_check_finish /* 2131362091 */:
                case C0838R.id.btn_aiwrite_finish /* 2131362092 */:
                    C0601v c0601v2 = C0601v.a;
                    if (kotlin.s.c.l.a(c0601v2.h().getValue(), Boolean.TRUE) && ((value = U.a.g().getValue()) == null || value.intValue() != C0838R.id.ai_btn_check)) {
                        f();
                    }
                    c0601v2.v(true);
                    com.bytedance.android.input.r.j.i(this.a, "finish");
                    V.c(true);
                    break;
                case C0838R.id.btn_close_aipanel /* 2131362106 */:
                    com.bytedance.android.input.r.j.i(this.a, "close");
                    InputView inputView2 = ImeService.x;
                    if (inputView2 != null) {
                        inputView2.O(Boolean.FALSE, Boolean.TRUE);
                        break;
                    }
                    break;
                default:
                    d(id);
                    IAppLog.a aVar7 = IAppLog.a;
                    JSONObject jSONObject6 = new JSONObject();
                    Objects.requireNonNull(com.bytedance.android.input.q.C.k.h);
                    if (id == C0838R.id.ai_btn_rewrite) {
                        str = "rewrite";
                    } else if (id == C0838R.id.ai_btn_summary) {
                        str = "summarize";
                    } else if (id != C0838R.id.chat_page) {
                        switch (id) {
                            case C0838R.id.ai_btn_check /* 2131361926 */:
                                break;
                            case C0838R.id.ai_btn_common_blessing /* 2131361927 */:
                                str = "blessings";
                                break;
                            case C0838R.id.ai_btn_common_circle /* 2131361928 */:
                                str = "highlylikedupdates";
                                break;
                            case C0838R.id.ai_btn_common_dianping /* 2131361929 */:
                                str = "reviews";
                                break;
                            case C0838R.id.ai_btn_common_introduction /* 2131361930 */:
                                str = "self-introduction";
                                break;
                            case C0838R.id.ai_btn_common_invitation /* 2131361931 */:
                                str = "banquetinvitation";
                                break;
                            case C0838R.id.ai_btn_common_mail /* 2131361932 */:
                                str = NotificationCompat.CATEGORY_EMAIL;
                                break;
                            case C0838R.id.ai_btn_common_popular /* 2131361933 */:
                                str = "popularcopywriting";
                                break;
                            default:
                                switch (id) {
                                    case C0838R.id.ai_btn_keypoints /* 2131361936 */:
                                        str = "keypoints";
                                        break;
                                    case C0838R.id.ai_btn_list /* 2131361937 */:
                                        str = "list";
                                        break;
                                    default:
                                        str = "";
                                        break;
                                }
                        }
                    } else {
                        str = "smartreply";
                    }
                    jSONObject6.put("tabname", str);
                    aVar7.t("AI_tabselect", jSONObject6);
                    break;
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.bytedance.android.input.r.j.m(this.a, "onConfigurationChanged = " + configuration);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (kotlin.s.c.l.a(view, this)) {
            if (i != 0) {
                U.a.b();
            } else if (IAppGlobals.a.b()) {
                KeyboardJni.getService().n(getContext().getColor(C0838R.color.aiwriting_bk_navigation_night));
            } else {
                KeyboardJni.getService().n(getContext().getColor(C0838R.color.aiwriting_bk_navigation));
            }
        }
    }

    public final void p() {
        com.bytedance.android.input.r.j.i(this.a, "show menu page first");
        X x = X.a;
        X.b(0);
        q(0);
    }

    public final void r(boolean z) {
        this.f2546e = z;
        n(C0838R.id.ai_btn_rewrite);
    }

    public final void s(boolean z) {
        this.f2546e = z;
        n(C0838R.id.ai_btn_summary);
    }

    public final void setKeyboardState(int i) {
        if (i == 1) {
            k(2);
        } else {
            k(1);
        }
    }

    public final void setWindowBottomInsetPadding(int i) {
        this.j = i;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiPanelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "AIWriting-AiPanelView";
        this.b = new ArrayList<>();
        this.f2544c = new ArrayList<>();
        this.f2545d = new Handler(Looper.getMainLooper());
        this.f2547f = 1;
        this.f2548g = 2;
        this.l = 0;
    }
}
