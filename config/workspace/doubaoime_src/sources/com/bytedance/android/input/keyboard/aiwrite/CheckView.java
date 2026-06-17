package com.bytedance.android.input.keyboard.aiwrite;

import android.app.Application;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.CheckViewModel;
import com.obric.oui.button.OButton;
import com.obric.oui.checkbox.OCheckBox;
import com.obric.oui.layout.OUIFrameLayout;
import com.obric.oui.lisitem.OListItemGeneral;
import com.obric.oui.progress.ODownloadProgressView;
import com.obric.oui.text.OTextView;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CheckView extends FrameLayout implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f2556d = 0;
    private final String a;
    private final ArrayList<LinearLayout> b;

    /* renamed from: c, reason: collision with root package name */
    private ODownloadProgressView f2557c;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        final /* synthetic */ LinearLayout b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LinearLayout linearLayout) {
            super(1);
            this.b = linearLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0104, code lost:
        
            return kotlin.o.a;
         */
        @Override // kotlin.s.b.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public kotlin.o invoke(java.lang.Integer r8) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.CheckView.a.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        final /* synthetic */ OCheckBox b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(OCheckBox oCheckBox) {
            super(1);
            this.b = oCheckBox;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            com.bytedance.android.input.r.j.i(CheckView.this.a, "[model] CheckViewState.currentView = " + num2 + ", to clear origin status");
            if (num2 != null && num2.intValue() == 1) {
                this.b.setChecked(false);
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        final /* synthetic */ OListItemGeneral b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(OListItemGeneral oListItemGeneral) {
            super(1);
            this.b = oListItemGeneral;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            Boolean bool2 = bool;
            com.bytedance.android.input.r.j.i(CheckView.this.a, "check isShowOrigin = " + bool2);
            this.b.setEnabled(bool2.booleanValue() ^ true);
            return kotlin.o.a;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.l<CheckViewModel.a, kotlin.o> {
        final /* synthetic */ OTextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(OTextView oTextView) {
            super(1);
            this.b = oTextView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(CheckViewModel.a aVar) {
            String sb;
            CheckViewModel.a aVar2 = aVar;
            if (aVar2.a() == 0) {
                StringBuilder M = e.a.a.a.a.M("共 ");
                M.append(aVar2.b());
                M.append(" 处修改");
                sb = M.toString();
            } else {
                StringBuilder M2 = e.a.a.a.a.M("第 ");
                M2.append(aVar2.a());
                M2.append(" 处修改");
                sb = M2.toString();
            }
            String str = CheckView.this.a;
            StringBuilder M3 = e.a.a.a.a.M("check show index = ");
            M3.append(aVar2.a());
            com.bytedance.android.input.r.j.i(str, M3.toString());
            this.b.setText(sb);
            return kotlin.o.a;
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.l<CheckViewModel.a, kotlin.o> {
        final /* synthetic */ OTextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(OTextView oTextView) {
            super(1);
            this.b = oTextView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(CheckViewModel.a aVar) {
            CheckViewModel.a aVar2 = aVar;
            String str = CheckView.this.a;
            StringBuilder M = e.a.a.a.a.M("check show total = ");
            M.append(aVar2.b());
            com.bytedance.android.input.r.j.i(str, M.toString());
            this.b.setVisibility(aVar2.a() == 0 ? 4 : 0);
            this.b.setText(" (共" + aVar2.b() + "处)");
            return kotlin.o.a;
        }
    }

    static final class f extends kotlin.s.c.m implements kotlin.s.b.l<CheckViewModel.a, kotlin.o> {
        final /* synthetic */ OButton a;
        final /* synthetic */ CheckView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(OButton oButton, CheckView checkView) {
            super(1);
            this.a = oButton;
            this.b = checkView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(CheckViewModel.a aVar) {
            CheckViewModel.a aVar2 = aVar;
            Boolean value = C0601v.a.o().getValue();
            if (value == null) {
                value = Boolean.TRUE;
            }
            this.a.setClickable(aVar2.a() > 1 && !value.booleanValue());
            OButton oButton = this.a;
            oButton.setEnabled(oButton.isClickable());
            String str = this.b.a;
            StringBuilder M = e.a.a.a.a.M("prev btn isClickable = ");
            M.append(this.a.isClickable());
            M.append(" from index = ");
            M.append(aVar2.a());
            com.bytedance.android.input.r.j.i(str, M.toString());
            return kotlin.o.a;
        }
    }

    static final class g extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        final /* synthetic */ OButton a;
        final /* synthetic */ CheckView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(OButton oButton, CheckView checkView) {
            super(1);
            this.a = oButton;
            this.b = checkView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            Boolean bool2 = bool;
            CheckViewModel.a value = CheckViewModel.a.k().getValue();
            this.a.setClickable(!bool2.booleanValue() && (value != null && value.a() > 1));
            String str = this.b.a;
            StringBuilder M = e.a.a.a.a.M("prev isClickable = ");
            M.append(this.a.isClickable());
            M.append(" from isShowOrigin = ");
            M.append(bool2);
            com.bytedance.android.input.r.j.i(str, M.toString());
            return kotlin.o.a;
        }
    }

    static final class h extends kotlin.s.c.m implements kotlin.s.b.l<CheckViewModel.a, kotlin.o> {
        final /* synthetic */ OButton a;
        final /* synthetic */ CheckView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(OButton oButton, CheckView checkView) {
            super(1);
            this.a = oButton;
            this.b = checkView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(CheckViewModel.a aVar) {
            CheckViewModel.a aVar2 = aVar;
            Boolean value = C0601v.a.o().getValue();
            if (value == null) {
                value = Boolean.TRUE;
            }
            this.a.setClickable(aVar2.a() < aVar2.b() && !value.booleanValue());
            OButton oButton = this.a;
            oButton.setEnabled(oButton.isClickable());
            String str = this.b.a;
            StringBuilder M = e.a.a.a.a.M("next btn isClickable = ");
            M.append(this.a.isClickable());
            M.append(" from index = ");
            M.append(aVar2.a());
            com.bytedance.android.input.r.j.i(str, M.toString());
            return kotlin.o.a;
        }
    }

    static final class i extends kotlin.s.c.m implements kotlin.s.b.l<Boolean, kotlin.o> {
        final /* synthetic */ OButton a;
        final /* synthetic */ CheckView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(OButton oButton, CheckView checkView) {
            super(1);
            this.a = oButton;
            this.b = checkView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Boolean bool) {
            Boolean bool2 = bool;
            CheckViewModel.a value = CheckViewModel.a.k().getValue();
            this.a.setClickable(!bool2.booleanValue() && (value != null && value.a() < value.b()));
            OButton oButton = this.a;
            oButton.setEnabled(oButton.isClickable());
            String str = this.b.a;
            StringBuilder M = e.a.a.a.a.M("next btn isClickable = ");
            M.append(this.a.isClickable());
            M.append(" from isShowOrigin = ");
            M.append(bool2);
            com.bytedance.android.input.r.j.i(str, M.toString());
            return kotlin.o.a;
        }
    }

    static final class j extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        j() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            Integer num2 = num;
            if (num2 == null || num2.intValue() != 4) {
                CheckView checkView = CheckView.this;
                int i = CheckView.f2556d;
                TextView textView = (TextView) checkView.findViewById(C0838R.id.page_check_aigc_text);
                if (textView != null) {
                    textView.setVisibility(8);
                }
            }
            return kotlin.o.a;
        }
    }

    static final class k extends kotlin.s.c.m implements kotlin.s.b.l<Integer, kotlin.o> {
        k() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(Integer num) {
            final CheckView checkView = CheckView.this;
            int i = CheckView.f2556d;
            final TextView textView = (TextView) checkView.findViewById(C0838R.id.page_check_aigc_text);
            if (textView != null) {
                boolean z = false;
                if (com.obric.oui.common.util.b.e(checkView)) {
                    CheckViewModel checkViewModel = CheckViewModel.a;
                    Integer value = checkViewModel.l().getValue();
                    if (value != null && value.intValue() == 4) {
                        SpannableString value2 = checkViewModel.n().getValue();
                        if (value2 != null && (kotlin.text.a.s(value2) ^ true)) {
                            z = true;
                        }
                    }
                }
                if (z) {
                    textView.post(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            CheckView.h(CheckView.this, textView);
                        }
                    });
                } else {
                    textView.setVisibility(8);
                }
            }
            return kotlin.o.a;
        }
    }

    static final class l extends kotlin.s.c.m implements kotlin.s.b.l<SpannableString, kotlin.o> {
        final /* synthetic */ OTextView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(OTextView oTextView) {
            super(1);
            this.b = oTextView;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(SpannableString spannableString) {
            SpannableString spannableString2 = spannableString;
            if (com.obric.oui.common.util.b.e(CheckView.this)) {
                com.bytedance.android.input.r.j.i(CheckView.this.a, "Check detailText = " + ((Object) spannableString2) + ", to set show");
                this.b.setText(spannableString2);
                TextView textView = (TextView) CheckView.this.findViewById(C0838R.id.page_check_aigc_text);
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ScrollView e2 = CheckView.this.e(this.b);
                if (e2 != null && e2.getScrollY() > 0 && IAppGlobals.a.w() == 1) {
                    C0601v c0601v = C0601v.a;
                    Integer value = U.a.g().getValue();
                    kotlin.s.c.l.c(value);
                    if (!c0601v.d(value.intValue())) {
                        c0601v.y(c0601v.f());
                    }
                }
            }
            return kotlin.o.a;
        }
    }

    static final class m implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        m(kotlin.s.b.l lVar) {
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
    public CheckView(Context context) {
        this(context, null);
        kotlin.s.c.l.f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScrollView e(View view) {
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof ScrollView) {
                return (ScrollView) parent;
            }
        }
        return null;
    }

    public static void g(OCheckBox oCheckBox, CheckView checkView, View view) {
        kotlin.s.c.l.f(oCheckBox, "$switch");
        kotlin.s.c.l.f(checkView, "this$0");
        oCheckBox.setChecked(!oCheckBox.isChecked());
        CheckViewModel.a.z(oCheckBox.isChecked());
        com.bytedance.android.input.r.j.i(checkView.a, "is isChecked = 点击了");
        if (oCheckBox.isChecked()) {
            IAppLog.a.t("AI_tabcontentchange", e.a.a.a.a.a0("tabname", "check", "actionname", "originaltext"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if ((r0 != null && (kotlin.text.a.s(r0) ^ true)) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(com.bytedance.android.input.keyboard.aiwrite.CheckView r5, android.widget.TextView r6) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.s.c.l.f(r5, r0)
            java.lang.String r0 = "$titleAigcView"
            kotlin.s.c.l.f(r6, r0)
            boolean r0 = com.obric.oui.common.util.b.e(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L41
            com.bytedance.android.input.keyboard.aiwrite.CheckViewModel r0 = com.bytedance.android.input.keyboard.aiwrite.CheckViewModel.a
            androidx.lifecycle.LiveData r3 = r0.l()
            java.lang.Object r3 = r3.getValue()
            java.lang.Integer r3 = (java.lang.Integer) r3
            r4 = 4
            if (r3 != 0) goto L22
            goto L41
        L22:
            int r3 = r3.intValue()
            if (r3 != r4) goto L41
            androidx.lifecycle.LiveData r0 = r0.n()
            java.lang.Object r0 = r0.getValue()
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            if (r0 == 0) goto L3d
            boolean r0 = kotlin.text.a.s(r0)
            r0 = r0 ^ r1
            if (r0 != r1) goto L3d
            r0 = r1
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 == 0) goto L41
            goto L42
        L41:
            r1 = r2
        L42:
            if (r1 == 0) goto L46
            r0 = r2
            goto L48
        L46:
            r0 = 8
        L48:
            r6.setVisibility(r0)
            if (r1 == 0) goto L65
            android.widget.ScrollView r5 = r5.e(r6)
            if (r5 == 0) goto L58
            android.view.View r6 = r5.getChildAt(r2)
            goto L59
        L58:
            r6 = 0
        L59:
            if (r5 == 0) goto L65
            if (r6 == 0) goto L65
            com.bytedance.android.input.keyboard.aiwrite.i r0 = new com.bytedance.android.input.keyboard.aiwrite.i
            r0.<init>()
            r5.post(r0)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.aiwrite.CheckView.h(com.bytedance.android.input.keyboard.aiwrite.CheckView, android.widget.TextView):void");
    }

    public static void i(CheckView checkView, OCheckBox oCheckBox, View view) {
        kotlin.s.c.l.f(checkView, "this$0");
        kotlin.s.c.l.f(oCheckBox, "$this_apply");
        String str = checkView.a;
        StringBuilder M = e.a.a.a.a.M("显示原文 is isChecked = 点击了 ");
        M.append(oCheckBox.isChecked());
        com.bytedance.android.input.r.j.i(str, M.toString());
        CheckViewModel.a.z(oCheckBox.isChecked());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AiPanelView aiPanelView) {
        kotlin.s.c.l.f(aiPanelView, "aiPanel");
        com.bytedance.android.input.r.j.i(this.a, "view inflate " + this);
        LinearLayout linearLayout = (LinearLayout) findViewById(C0838R.id.ai_writing_view_check);
        this.b.add(linearLayout.findViewById(C0838R.id.page_check_success));
        this.b.add(linearLayout.findViewById(C0838R.id.page_check_loading));
        this.b.add(linearLayout.findViewById(C0838R.id.page_check_failed));
        this.b.add(linearLayout.findViewById(C0838R.id.page_check_empty));
        this.b.add(linearLayout.findViewById(C0838R.id.page_check_detail));
        View findViewById = linearLayout.findViewById(C0838R.id.aiwrite_loading_anim);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.aiwrite_loading_anim)");
        ODownloadProgressView oDownloadProgressView = (ODownloadProgressView) findViewById;
        this.f2557c = oDownloadProgressView;
        oDownloadProgressView.setCurrentState(1);
        CheckViewModel checkViewModel = CheckViewModel.a;
        checkViewModel.l().observeForever(new m(new a(linearLayout)));
        OButton oButton = (OButton) linearLayout.findViewById(C0838R.id.btn_aiwrite_back);
        if (oButton != null) {
            oButton.setOnClickListener(aiPanelView);
        }
        OButton oButton2 = (OButton) linearLayout.findViewById(C0838R.id.btn_aiwrite_check_finish);
        if (oButton2 != null) {
            oButton2.setOnClickListener(aiPanelView);
        }
        OListItemGeneral oListItemGeneral = (OListItemGeneral) linearLayout.findViewById(C0838R.id.ai_btn_show_origin);
        if (oListItemGeneral != null) {
            kotlin.s.c.l.e(oListItemGeneral, "findViewById<OListItemGe…(R.id.ai_btn_show_origin)");
            Context context = oListItemGeneral.getContext();
            kotlin.s.c.l.e(context, "context");
            final OCheckBox oCheckBox = new OCheckBox(context);
            oCheckBox.setClickable(true);
            oCheckBox.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckView.i(CheckView.this, oCheckBox, view);
                }
            });
            oListItemGeneral.setTrailingView(oCheckBox);
            oListItemGeneral.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CheckView.g(OCheckBox.this, this, view);
                }
            });
            checkViewModel.l().observeForever(new m(new b(oCheckBox)));
        }
        OListItemGeneral oListItemGeneral2 = (OListItemGeneral) linearLayout.findViewById(C0838R.id.ai_btn_do_action);
        if (oListItemGeneral2 != null) {
            kotlin.s.c.l.e(oListItemGeneral2, "findViewById<OListItemGe…l>(R.id.ai_btn_do_action)");
            C0601v c0601v = C0601v.a;
            c0601v.o().observeForever(new m(new c(oListItemGeneral2)));
            View inflate = FrameLayout.inflate(oListItemGeneral2.getContext(), C0838R.layout.layout_aiwrite_item_check_show, null);
            if (inflate != null) {
                kotlin.s.c.l.e(inflate, "inflate(context, R.layou…te_item_check_show, null)");
                oListItemGeneral2.setLeadingView(inflate);
                OTextView oTextView = (OTextView) inflate.findViewById(C0838R.id.check_item_index);
                if (oTextView != null) {
                    kotlin.s.c.l.e(oTextView, "findViewById<OTextView>(R.id.check_item_index)");
                    checkViewModel.k().observeForever(new m(new d(oTextView)));
                }
                OTextView oTextView2 = (OTextView) inflate.findViewById(C0838R.id.check_item_total);
                if (oTextView2 != null) {
                    kotlin.s.c.l.e(oTextView2, "findViewById<OTextView>(R.id.check_item_total)");
                    checkViewModel.k().observeForever(new m(new e(oTextView2)));
                }
            }
            View inflate2 = FrameLayout.inflate(oListItemGeneral2.getContext(), C0838R.layout.layout_aiwrite_item_check_button, null);
            if (inflate2 != null) {
                kotlin.s.c.l.e(inflate2, "inflate(context, R.layou…_item_check_button, null)");
                oListItemGeneral2.setTrailingView(inflate2);
                OButton oButton3 = (OButton) inflate2.findViewById(C0838R.id.check_item_prev);
                if (oButton3 != null) {
                    kotlin.s.c.l.e(oButton3, "findViewById<OButton>(R.id.check_item_prev)");
                    checkViewModel.k().observeForever(new m(new f(oButton3, this)));
                    c0601v.o().observeForever(new m(new g(oButton3, this)));
                    oButton3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i2 = CheckView.f2556d;
                            CheckViewModel.j(CheckViewModel.a, 0, 1);
                            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
                        }
                    });
                }
                OButton oButton4 = (OButton) inflate2.findViewById(C0838R.id.check_item_next);
                if (oButton4 != null) {
                    kotlin.s.c.l.e(oButton4, "findViewById<OButton>(R.id.check_item_next)");
                    checkViewModel.k().observeForever(new m(new h(oButton4, this)));
                    c0601v.o().observeForever(new m(new i(oButton4, this)));
                    oButton4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.aiwrite.k
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i2 = CheckView.f2556d;
                            CheckViewModel.p(CheckViewModel.a, 0, 1);
                            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
                        }
                    });
                }
            }
        }
        checkViewModel.q();
        LinearLayout linearLayout2 = (LinearLayout) findViewById(C0838R.id.page_check_detail_container);
        if (linearLayout2 != null) {
            j(linearLayout2, C0838R.string.ai_btn_copy, C0838R.id.check_btn_copy, C0838R.drawable.ai_writing_icon_copy);
            j(linearLayout2, C0838R.string.ai_btn_share, C0838R.id.check_btn_share, C0838R.drawable.ai_writing_icon_share);
        }
        OTextView oTextView3 = (OTextView) ((LinearLayout) findViewById(C0838R.id.page_check_detail)).findViewById(C0838R.id.page_check_detail_text);
        if (oTextView3 != null) {
            kotlin.s.c.l.e(oTextView3, "findViewById<OTextView>(…d.page_check_detail_text)");
            checkViewModel.l().observeForever(new m(new j()));
            checkViewModel.m().observeForever(new m(new k()));
            checkViewModel.n().observeForever(new m(new l(oTextView3)));
        }
    }

    public final OUIFrameLayout j(LinearLayout linearLayout, int i2, int i3, int i4) {
        ImageView imageView;
        OUIFrameLayout oUIFrameLayout = (OUIFrameLayout) linearLayout.findViewById(i3);
        TextView textView = oUIFrameLayout != null ? (TextView) oUIFrameLayout.findViewById(C0838R.id.ai_btn_rewrite_menu_item_text) : null;
        if (textView != null) {
            textView.setText(getResources().getString(i2));
        }
        if (oUIFrameLayout != null && (imageView = (ImageView) oUIFrameLayout.findViewById(C0838R.id.ai_btn_rewrite_menu_item_icon)) != null) {
            imageView.setImageResource(i4);
        }
        if (oUIFrameLayout != null) {
            oUIFrameLayout.setOnClickListener(this);
        }
        return oUIFrameLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("button ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        M.append(" is click");
        com.bytedance.android.input.r.j.i(str, M.toString());
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
        if (view != null) {
            switch (view.getId()) {
                case C0838R.id.check_btn_copy /* 2131362171 */:
                    com.bytedance.android.input.r.j.i(this.a, "copy");
                    Object systemService = getContext().getSystemService("clipboard");
                    kotlin.s.c.l.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    CheckViewModel checkViewModel = CheckViewModel.a;
                    ((ClipboardManager) systemService).setPrimaryClip(ClipData.newHtmlText("ai content", checkViewModel.n().getValue(), checkViewModel.n().toString()));
                    String string = IAppGlobals.a.getContext().getResources().getString(C0838R.string.tip_copy);
                    kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(resId)");
                    C0603x.d(new C0603x(string, z.a), C0838R.drawable.ai_writing_icon_toast_ok, 0, 0, 0, 0, 0L, 62);
                    IAppLog.a.t("AI_tabcontentchange", e.a.a.a.a.a0("tabname", "check", "actionname", "copy"));
                    break;
                case C0838R.id.check_btn_share /* 2131362172 */:
                    com.bytedance.android.input.r.j.i(this.a, "share");
                    IAppLog.a.t("AI_tabcontentchange", e.a.a.a.a.a0("tabname", "check", "actionname", "share"));
                    IAppGlobals.a aVar = IAppGlobals.a;
                    Objects.requireNonNull(aVar);
                    final Application application = aVar.getApplication();
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setAction("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", String.valueOf(CheckViewModel.a.n().getValue()));
                    intent.setType("text/plain");
                    final Intent createChooser = Intent.createChooser(intent, "分享到");
                    createChooser.addFlags(268435456);
                    new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.android.input.keyboard.aiwrite.j
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context = application;
                            Intent intent2 = createChooser;
                            int i2 = CheckView.f2556d;
                            kotlin.s.c.l.f(context, "$context");
                            context.startActivity(intent2);
                        }
                    });
                    break;
            }
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        Integer value;
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i2);
        if (kotlin.s.c.l.a(view, this)) {
            com.bytedance.android.input.r.j.i(this.a, "onVisibilityChanged = " + view + ", visibility = " + i2);
            CheckViewModel.a.y(i2 == 0);
            C0601v.a.q(i2 == 0);
        }
        if (kotlin.s.c.l.a(view, this)) {
            if (i2 == 0 && (value = CheckViewModel.a.l().getValue()) != null && value.intValue() == 1) {
                ODownloadProgressView oDownloadProgressView = this.f2557c;
                if (oDownloadProgressView != null) {
                    oDownloadProgressView.setCurrentState(0);
                    return;
                } else {
                    kotlin.s.c.l.l("mLoadingView");
                    throw null;
                }
            }
            ODownloadProgressView oDownloadProgressView2 = this.f2557c;
            if (oDownloadProgressView2 != null) {
                oDownloadProgressView2.setCurrentState(1);
            } else {
                kotlin.s.c.l.l("mLoadingView");
                throw null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "AIWriting-CheckView";
        this.b = new ArrayList<>();
        FrameLayout.inflate(context, C0838R.layout.layout_aiwrite_check, this);
    }
}
