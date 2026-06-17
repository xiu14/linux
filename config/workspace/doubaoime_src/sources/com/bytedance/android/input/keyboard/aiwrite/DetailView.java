package com.bytedance.android.input.keyboard.aiwrite;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.U;
import com.obric.oui.button.OButton;
import com.obric.oui.checkbox.OCheckBox;
import com.obric.oui.layout.OUIFrameLayout;
import com.obric.oui.lisitem.OListItemGeneral;
import com.obric.oui.text.OTextView;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DetailView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2563c = 0;
    private final String a;
    private final ArrayList<LinearLayout> b;

    static final class a implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        a(kotlin.s.b.l lVar) {
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
    public DetailView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    public static final void c(TextView textView, DetailView detailView, kotlin.s.c.v vVar, kotlin.s.c.v vVar2, kotlin.s.c.x xVar, kotlin.s.c.v vVar3, kotlin.s.c.v vVar4, kotlin.s.c.v vVar5) {
        boolean z = vVar.a || vVar2.a;
        String str = detailView.a;
        StringBuilder sb = new StringBuilder();
        sb.append("shouldShowAigc ");
        sb.append(z);
        sb.append((char) 65292);
        sb.append(xVar.a);
        sb.append((char) 65292);
        sb.append(vVar3.a);
        sb.append((char) 65292);
        sb.append(vVar4.a);
        sb.append((char) 65292);
        e.a.a.a.a.N0(sb, vVar5.a, str);
        Integer value = U.a.g().getValue();
        if (value == null) {
            value = 0;
        }
        if (!(xVar.a == 0 && (vVar5.a || (vVar3.a && (vVar4.a || C0601v.a.c(value.intValue())))) && z && com.obric.oui.common.util.b.e(detailView))) {
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        final ScrollView scrollView = (ScrollView) detailView.findViewById(C0838R.id.ai_detail_scrollview);
        View childAt = scrollView != null ? scrollView.getChildAt(0) : null;
        if (scrollView == null || childAt == null) {
            return;
        }
        childAt.requestLayout();
        scrollView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.o
            @Override // java.lang.Runnable
            public final void run() {
                final ScrollView scrollView2 = scrollView;
                int i = DetailView.f2563c;
                scrollView2.fullScroll(130);
                scrollView2.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        ScrollView scrollView3 = scrollView2;
                        int i2 = DetailView.f2563c;
                        scrollView3.fullScroll(130);
                    }
                });
            }
        });
    }

    public static void e(OCheckBox oCheckBox, DetailView detailView, View view) {
        kotlin.s.c.l.f(oCheckBox, "$switch");
        kotlin.s.c.l.f(detailView, "this$0");
        oCheckBox.setChecked(!oCheckBox.isChecked());
        U.a.A(oCheckBox.isChecked());
        com.bytedance.android.input.r.j.i(detailView.a, "显示原文 is isChecked = 点击了");
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
        if (oCheckBox.isChecked()) {
            IAppLog.a aVar = IAppLog.a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tabname", com.bytedance.android.input.q.C.k.h.f(com.bytedance.android.input.q.z.a.k()));
            jSONObject.put("actionname", "originaltext");
            aVar.t("AI_tabcontentchange", jSONObject);
        }
    }

    public static void f(AiTextView aiTextView, DetailView detailView, View view) {
        kotlin.s.c.l.f(aiTextView, "$this_apply");
        kotlin.s.c.l.f(detailView, "this$0");
        if (aiTextView.getText() instanceof Spanned) {
            CharSequence text = aiTextView.getText();
            kotlin.s.c.l.d(text, "null cannot be cast to non-null type android.text.Spanned");
            URLSpan[] uRLSpanArr = (URLSpan[]) ((Spanned) text).getSpans(aiTextView.getLayout().getLineStart(aiTextView.getLayout().getLineForOffset(aiTextView.getSelectionStart())), aiTextView.getLayout().getLineEnd(aiTextView.getLayout().getLineForOffset(aiTextView.getSelectionStart())), URLSpan.class);
            kotlin.s.c.l.e(uRLSpanArr, MonitorConstants.URLS);
            if (!(uRLSpanArr.length == 0)) {
                String url = uRLSpanArr[0].getURL();
                com.bytedance.android.input.r.j.i(detailView.a, "click url = " + url);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addFlags(268468224);
                intent.setData(Uri.parse(url));
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                aVar.getContext().startActivity(intent);
            }
        }
    }

    public static void g(DetailView detailView, OCheckBox oCheckBox, View view) {
        kotlin.s.c.l.f(detailView, "this$0");
        kotlin.s.c.l.f(oCheckBox, "$this_apply");
        String str = detailView.a;
        StringBuilder M = e.a.a.a.a.M("显示原文 is isChecked = 点击了 ");
        M.append(oCheckBox.isChecked());
        com.bytedance.android.input.r.j.i(str, M.toString());
        U.a.A(oCheckBox.isChecked());
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, com.bytedance.android.input.keyboard.aiwrite.E] */
    public final void d(AiPanelView aiPanelView) {
        kotlin.s.c.z zVar;
        AiPanelView aiPanelView2;
        kotlin.s.c.l.f(aiPanelView, "aiPanel");
        com.bytedance.android.input.r.j.i(this.a, "view inflate " + this);
        OButton oButton = (OButton) findViewById(C0838R.id.btn_aiwrite_back);
        if (oButton != null) {
            oButton.setOnClickListener(aiPanelView);
        }
        OTextView oTextView = (OTextView) findViewById(C0838R.id.tab_aiwrite_title);
        if (oTextView != null) {
            U.a.q().observeForever(new a(new S(this, oTextView)));
        }
        OButton oButton2 = (OButton) findViewById(C0838R.id.btn_aiwrite_finish);
        if (oButton2 != null) {
            oButton2.setOnClickListener(aiPanelView);
        }
        kotlin.s.c.z zVar2 = new kotlin.s.c.z();
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.page_detail_success);
        final AiTextView aiTextView = (AiTextView) linearLayout.findViewById(C0838R.id.page_detail_success_text);
        if (aiTextView != null) {
            kotlin.s.c.l.e(aiTextView, "findViewById<AiTextView>…page_detail_success_text)");
            TextView textView = (TextView) findViewById(C0838R.id.page_detail_aigc_text);
            kotlin.s.c.v vVar = new kotlin.s.c.v();
            kotlin.s.c.v vVar2 = new kotlin.s.c.v();
            kotlin.s.c.v vVar3 = new kotlin.s.c.v();
            kotlin.s.c.x xVar = new kotlin.s.c.x();
            xVar.a = 3;
            kotlin.s.c.v vVar4 = new kotlin.s.c.v();
            kotlin.s.c.v vVar5 = new kotlin.s.c.v();
            zVar2.a = new E(textView, this, vVar3, vVar2, xVar, vVar, vVar4, vVar5);
            aiTextView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailView.f(AiTextView.this, this, view);
                }
            });
            aiTextView.setOnRenderComplete(new F(vVar4, textView, this, vVar3, vVar2, xVar, vVar, vVar5));
            U u = U.a;
            zVar = zVar2;
            u.r().observeForever(new a(new G(this, vVar5, aiTextView, textView, vVar3, vVar2, xVar, vVar, vVar4)));
            u.n().observeForever(new a(new H(this, aiTextView, vVar, vVar4, textView, vVar3, vVar2, xVar, vVar5)));
            u.o().observeForever(new a(new I(this, aiTextView, vVar2, vVar4, textView, vVar3, xVar, vVar, vVar5)));
            u.p().observeForever(new a(new J(this, aiTextView, vVar3, vVar4, textView, vVar2, xVar, vVar, vVar5)));
            u.h().observeForever(new a(new K(xVar, textView, this, vVar3, vVar2, vVar, vVar4, vVar5)));
            u.g().observeForever(new a(new L(vVar4, vVar5, textView, this, vVar3, vVar2, xVar, vVar)));
        } else {
            zVar = zVar2;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) linearLayout.findViewById(C0838R.id.ai_writing_detail_container);
        if (constraintLayout != null) {
            kotlin.s.c.l.e(constraintLayout, "findViewById<ConstraintL…writing_detail_container)");
            OUIFrameLayout oUIFrameLayout = (OUIFrameLayout) constraintLayout.findViewById(C0838R.id.ai_btn_replace);
            if (oUIFrameLayout != null) {
                kotlin.s.c.l.e(oUIFrameLayout, "findViewById<OUIFrameLayout>(R.id.ai_btn_replace)");
                C0601v.a.h().observeForever(new a(new M(oUIFrameLayout)));
            }
            OUIFrameLayout oUIFrameLayout2 = (OUIFrameLayout) constraintLayout.findViewById(C0838R.id.ai_btn_pre);
            OUIFrameLayout oUIFrameLayout3 = (OUIFrameLayout) constraintLayout.findViewById(C0838R.id.ai_btn_next);
            U u2 = U.a;
            u2.k().observeForever(new a(new N(this, constraintLayout, oUIFrameLayout2, oUIFrameLayout3)));
            u2.m().observeForever(new a(new O(this, oUIFrameLayout2, oUIFrameLayout3, zVar)));
            aiPanelView2 = aiPanelView;
            aiPanelView2.j(constraintLayout, C0838R.string.ai_btn_copy, C0838R.id.ai_btn_copy, C0838R.drawable.ai_writing_icon_copy);
            aiPanelView2.j(constraintLayout, C0838R.string.ai_btn_share, C0838R.id.ai_btn_share, C0838R.drawable.ai_writing_icon_share);
            aiPanelView2.j(constraintLayout, C0838R.string.ai_btn_retry, C0838R.id.ai_btn_retry, C0838R.drawable.ai_writing_icon_retry);
            aiPanelView2.j(constraintLayout, C0838R.string.ai_btn_replace, C0838R.id.ai_btn_replace, C0838R.drawable.ai_writing_icon_replace);
            aiPanelView2.j(constraintLayout, C0838R.string.ai_btn_pre, C0838R.id.ai_btn_pre, C0838R.drawable.ai_writing_icon_detail_small_pre);
            aiPanelView2.j(constraintLayout, C0838R.string.ai_btn_next, C0838R.id.ai_btn_next, C0838R.drawable.ai_writing_icon_detail_small_next);
        } else {
            aiPanelView2 = aiPanelView;
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0838R.id.page_detail_buttons);
        OListItemGeneral oListItemGeneral = (OListItemGeneral) linearLayout2.findViewById(C0838R.id.ai_btn_show_origin);
        if (oListItemGeneral != null) {
            kotlin.s.c.l.e(oListItemGeneral, "findViewById<OListItemGe…(R.id.ai_btn_show_origin)");
            oListItemGeneral.l().setMinHeight(0);
            Context context = oListItemGeneral.getContext();
            kotlin.s.c.l.e(context, "context");
            final OCheckBox oCheckBox = new OCheckBox(context);
            oCheckBox.setClickable(true);
            oCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailView.g(DetailView.this, oCheckBox, view);
                }
            });
            oListItemGeneral.setTrailingView(oCheckBox);
            oListItemGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailView.e(OCheckBox.this, this, view);
                }
            });
            U.a.h().observeForever(new a(new A(this, oCheckBox)));
        }
        OListItemGeneral oListItemGeneral2 = (OListItemGeneral) linearLayout2.findViewById(C0838R.id.ai_btn_retry);
        LinearLayout linearLayout3 = null;
        OButton oButton3 = null;
        if (oListItemGeneral2 != null) {
            kotlin.s.c.l.e(oListItemGeneral2, "findViewById<OListItemGeneral>(R.id.ai_btn_retry)");
            oListItemGeneral2.setOnClickListener(aiPanelView2);
            oListItemGeneral2.l().setMinHeight(0);
        } else {
            oListItemGeneral2 = null;
        }
        LinearLayout linearLayout4 = (LinearLayout) linearLayout2.findViewById(C0838R.id.ai_btn_retry_history);
        if (linearLayout4 != null) {
            kotlin.s.c.l.e(linearLayout4, "findViewById<LinearLayou….id.ai_btn_retry_history)");
            OButton oButton4 = (OButton) linearLayout4.findViewById(C0838R.id.ai_btn_pre);
            if (oButton4 != null) {
                kotlin.s.c.l.e(oButton4, "findViewById<OButton>(R.id.ai_btn_pre)");
                oButton4.setOnClickListener(aiPanelView2);
            } else {
                oButton4 = null;
            }
            OButton oButton5 = (OButton) linearLayout4.findViewById(C0838R.id.ai_btn_next);
            if (oButton5 != null) {
                kotlin.s.c.l.e(oButton5, "findViewById<OButton>(R.id.ai_btn_next)");
                oButton5.setOnClickListener(aiPanelView2);
                oButton3 = oButton5;
            }
            U.a.m().observeForever(new a(new C(oButton4, oButton3)));
            C0601v.a.o().observeForever(new a(new D(oButton4, oButton3)));
            OButton oButton6 = (OButton) linearLayout4.findViewById(C0838R.id.ai_btn_retry_now);
            if (oButton6 != null) {
                kotlin.s.c.l.e(oButton6, "findViewById<OButton>(R.id.ai_btn_retry_now)");
                oButton6.setOnClickListener(aiPanelView2);
            }
            linearLayout3 = linearLayout4;
        }
        U u3 = U.a;
        u3.l().observeForever(new a(new B(this, oListItemGeneral2, linearLayout3)));
        this.b.add(findViewById(C0838R.id.page_detail_success));
        LinearLayout linearLayout5 = (LinearLayout) findViewById(C0838R.id.page_detail_loading);
        this.b.add(linearLayout5);
        View findViewById = linearLayout5.findViewById(C0838R.id.ai_btn_show_origin_loading);
        kotlin.s.c.l.e(findViewById, "it.findViewById<OUIFrame…_btn_show_origin_loading)");
        com.obric.oui.common.util.b.h((ViewGroup) findViewById, false);
        OUIFrameLayout oUIFrameLayout4 = (OUIFrameLayout) linearLayout5.findViewById(C0838R.id.ai_btn_retry_loading);
        kotlin.s.c.l.e(oUIFrameLayout4, "initPageManager$lambda$20$lambda$19");
        com.obric.oui.common.util.b.h(oUIFrameLayout4, false);
        View findViewById2 = linearLayout5.findViewById(C0838R.id.ai_btn_retry_pre_next_loading);
        kotlin.s.c.l.e(findViewById2, "it.findViewById<OUIFrame…n_retry_pre_next_loading)");
        com.obric.oui.common.util.b.h((ViewGroup) findViewById2, false);
        View findViewById3 = linearLayout5.findViewById(C0838R.id.ai_btn_retry2_loading);
        kotlin.s.c.l.e(findViewById3, "it.findViewById<OUIFrame…id.ai_btn_retry2_loading)");
        com.obric.oui.common.util.b.h((ViewGroup) findViewById3, false);
        u3.l().observeForever(new a(new P(this, oUIFrameLayout4, (LinearLayout) findViewById(C0838R.id.ai_btn_retry_history_loading))));
        this.b.add(findViewById(C0838R.id.page_detail_failed));
        this.b.add(findViewById(C0838R.id.page_detail_buttons));
        u3.h().observeForever(new a(new Q(this)));
        C0601v.a.l().observeForever(new U.a(T.a));
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (kotlin.s.c.l.a(view, this)) {
            com.bytedance.android.input.r.j.i(this.a, "onVisibilityChanged = " + view + ", visibility = " + i);
            U.a.x(i == 0);
            C0601v.a.q(i == 0);
            if (i != 0) {
                com.bytedance.android.input.q.z zVar = com.bytedance.android.input.q.z.a;
                com.bytedance.android.input.q.C.m.h.o();
                com.bytedance.android.input.q.C.q.h.o();
                com.bytedance.android.input.q.C.x.h.o();
                com.bytedance.android.input.q.C.n.h.o();
                com.bytedance.android.input.q.C.j.h.o();
                com.bytedance.android.input.q.C.p.h.o();
                com.bytedance.android.input.q.C.o.h.o();
                com.bytedance.android.input.q.C.s.h.o();
                com.bytedance.android.input.q.C.h.h.o();
                com.bytedance.android.input.q.C.i.h.o();
                com.bytedance.android.input.q.C.d.h.o();
                com.bytedance.android.input.q.C.e.h.o();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "AIWriting-DetailView";
        this.b = new ArrayList<>();
        FrameLayout.inflate(context, C0838R.layout.layout_aiwrite_detail, this);
    }
}
