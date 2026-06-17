package com.bytedance.android.input.keyboard.commonphrase;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.aiwrite.U;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.o;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class CommonPhraseView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    private final String a;
    private final ArrayList<FrameLayout> b;

    /* renamed from: c, reason: collision with root package name */
    private InputViewRoot f2679c;

    /* renamed from: d, reason: collision with root package name */
    private View f2680d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2681e;

    /* renamed from: f, reason: collision with root package name */
    private int f2682f;

    /* renamed from: g, reason: collision with root package name */
    private String f2683g;
    private String h;
    private final boolean i;

    static final class a extends m implements kotlin.s.b.l<Integer, o> {
        final /* synthetic */ CommonPhraseListView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(CommonPhraseListView commonPhraseListView) {
            super(1);
            this.b = commonPhraseListView;
        }

        @Override // kotlin.s.b.l
        public o invoke(Integer num) {
            Integer num2 = num;
            if (num2 == null || num2.intValue() != 0) {
                com.bytedance.android.input.r.j.i(CommonPhraseView.this.a, "DetailViewModel listchange: " + num2 + ", requestLayout");
                this.b.requestLayout();
            }
            return o.a;
        }
    }

    static final class b extends m implements kotlin.s.b.l<Boolean, o> {
        final /* synthetic */ CommonPhraseListView b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InputViewRoot f2684c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CommonPhraseListView commonPhraseListView, InputViewRoot inputViewRoot) {
            super(1);
            this.b = commonPhraseListView;
            this.f2684c = inputViewRoot;
        }

        @Override // kotlin.s.b.l
        public o invoke(Boolean bool) {
            Boolean bool2 = bool;
            kotlin.s.c.l.e(bool2, "closed");
            if (bool2.booleanValue() && CommonPhraseView.this.getVisibility() == 0) {
                com.bytedance.android.input.r.j.i(CommonPhraseView.this.a, "InputViewModel getOneHandModeClosed true, listView new init");
                this.b.k(this.f2684c, CommonPhraseView.this);
            }
            return o.a;
        }
    }

    static final class c implements Observer, kotlin.s.c.h {
        private final /* synthetic */ kotlin.s.b.l a;

        c(kotlin.s.b.l lVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPhraseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "CommonPhraseView";
        this.b = new ArrayList<>();
        this.f2681e = 1;
        this.f2683g = "";
        this.h = "";
        this.i = KeyboardJni.isFloatingMode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.input.keyboard.commonphrase.CommonPhraseView, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static void g(CommonPhraseView commonPhraseView, View view) {
        kotlin.s.c.l.f(commonPhraseView, "this$0");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        if (com.bytedance.android.input.keyboard.areacontrol.k.S()) {
            com.bytedance.android.input.r.j.j(((CommonPhraseView) commonPhraseView).a, "doAddPhrase, isLandscape, not support");
            C0603x.f2629e.a(C0838R.string.common_phrase_cannot_add_toast);
            return;
        }
        while (true) {
            if (commonPhraseView == 0) {
                commonPhraseView = 0;
                break;
            } else {
                if (commonPhraseView instanceof InputViewRoot) {
                    break;
                }
                Object parent = commonPhraseView.getParent();
                commonPhraseView = parent instanceof View ? (View) parent : 0;
            }
        }
        InputViewRoot inputViewRoot = (InputViewRoot) commonPhraseView;
        if (inputViewRoot != null) {
            inputViewRoot.setCommonPhraseEditViewEnabled(true, new String[0]);
            inputViewRoot.x0(false);
        }
    }

    private final void i(int i) {
        ArrayList<FrameLayout> arrayList = this.b;
        e.a.a.a.a.j0("showPage pageType: ", i, this.a);
        int i2 = this.f2681e;
        if (i == i2) {
            FrameLayout frameLayout = this.b.get(i2);
            if (frameLayout instanceof CommonPhraseListView) {
                ((CommonPhraseListView) frameLayout).m();
            }
        }
        int i3 = 0;
        for (Object obj : arrayList) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            FrameLayout frameLayout2 = (FrameLayout) obj;
            if (i3 == i) {
                frameLayout2.setVisibility(0);
            } else {
                frameLayout2.setVisibility(4);
            }
            requestLayout();
            i3 = i4;
        }
    }

    public final void b(String str, String str2) {
        kotlin.s.c.l.f(str, "phrase");
        kotlin.s.c.l.f(str2, "input");
        e.a.a.a.a.t0("deleteCommonPhrase phrase: ", str, ", input: ", str2, this.a);
        j jVar = j.a;
        j c2 = j.c();
        Objects.requireNonNull(c2);
        kotlin.s.c.l.f(str, "phrase");
        kotlin.s.c.l.f(str2, "code");
        com.bytedance.android.input.r.j.i("commonPhrase", "deleteCommonPhrase phrase: " + str + ", code: " + str2);
        int deleteCommonPhrase = KeyboardJni.getKeyboardJni().deleteCommonPhrase(str2, str);
        StringBuilder sb = new StringBuilder();
        sb.append("deleteCommonPhrase status: ");
        sb.append(deleteCommonPhrase);
        com.bytedance.android.input.r.j.i("commonPhrase", sb.toString());
        c2.f();
        com.bytedance.android.input.r.j.i(this.a, "deleteCommonPhrase phrase: " + str + " save to dict");
        j.c().f();
    }

    public final void c(String str, String str2) {
        kotlin.s.c.l.f(str, "phraseOld");
        kotlin.s.c.l.f(str2, "inputOld");
        com.bytedance.android.input.r.j.i(this.a, "doEditPhrase phrase_old: " + str + ", input_old: " + str2 + ',');
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        if (com.bytedance.android.input.keyboard.areacontrol.k.S()) {
            com.bytedance.android.input.r.j.j(this.a, "doEditPhrase, isLandscape, not support edit");
            C0603x.f2629e.a(C0838R.string.common_phrase_cannot_add_toast);
            return;
        }
        this.f2683g = str;
        this.h = str2;
        InputViewRoot inputViewRoot = this.f2679c;
        if (inputViewRoot != null) {
            inputViewRoot.setCommonPhraseEditViewEnabled(true, str, str2);
        }
        InputViewRoot inputViewRoot2 = this.f2679c;
        if (inputViewRoot2 != null) {
            inputViewRoot2.x0(false);
        }
    }

    public final void d(final InputViewRoot inputViewRoot) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        com.bytedance.android.input.r.j.m(this.a, "initView");
        this.f2679c = inputViewRoot;
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        CommonPhraseEmptyView commonPhraseEmptyView = new CommonPhraseEmptyView(context, null);
        commonPhraseEmptyView.a(inputViewRoot);
        this.b.add(commonPhraseEmptyView);
        Context context2 = getContext();
        kotlin.s.c.l.e(context2, "context");
        CommonPhraseListView commonPhraseListView = new CommonPhraseListView(context2, null);
        commonPhraseListView.k(inputViewRoot, this);
        U.a.i().observeForever(new c(new a(commonPhraseListView)));
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.d().observeForever(new c(new b(commonPhraseListView, inputViewRoot)));
        this.b.add(commonPhraseListView);
        removeAllViews();
        FrameLayout.inflate(getContext(), C0838R.layout.common_phrase_toolbar, this);
        View findViewById = findViewById(C0838R.id.common_phrase_toolbar);
        kotlin.s.c.l.e(findViewById, "findViewById(R.id.common_phrase_toolbar)");
        this.f2680d = findViewById;
        findViewById(C0838R.id.btn_close_clipboard_history).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputViewRoot inputViewRoot2 = InputViewRoot.this;
                int i = CommonPhraseView.j;
                kotlin.s.c.l.f(inputViewRoot2, "$inputViewRoot");
                inputViewRoot2.x0(false);
            }
        });
        findViewById(C0838R.id.btn_add_common_phrase).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.commonphrase.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonPhraseView.g(CommonPhraseView.this, view);
            }
        });
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.clipboard_common_phrase_toolbar_height);
        for (View view : this.b) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = dimensionPixelSize;
            addView(view, -1, layoutParams);
        }
        j();
    }

    public final void e(String str, String str2) {
        kotlin.s.c.l.f(str, "phrase");
        kotlin.s.c.l.f(str2, "code");
        e.a.a.a.a.t0("insertCommonPhrase phrase: ", str, ", code: ", str2, this.a);
        j jVar = j.a;
        j.c().e(str, str2);
        com.bytedance.android.input.r.j.i(this.a, e.a.a.a.a.v("insertCommonPhrase phrase: ", str, ", code: ", str2, " save to dict"));
        j.c().f();
    }

    public final boolean f() {
        return this.i;
    }

    public final void h() {
        com.bytedance.android.input.r.j.i(this.a, "onFinishInputView");
        j jVar = j.a;
        j.c().f();
    }

    public final void j() {
        String string = getContext().getString(C0838R.string.full_base_input_mode);
        kotlin.s.c.l.e(string, "context.getString(R.string.full_base_input_mode)");
        Object f2 = SettingsConfigNext.f(string);
        kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.Int");
        boolean z = ((Integer) f2).intValue() == 0;
        Boolean bool = (Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.enable_clipboard_history, "IAppGlobals.context.getS…enable_clipboard_history)", "null cannot be cast to non-null type kotlin.Boolean");
        com.bytedance.android.input.r.j.i("CloudConfig", "isSupportClipboardHistory, state: " + bool.booleanValue());
        boolean booleanValue = bool.booleanValue();
        boolean z2 = z && booleanValue;
        View view = this.f2680d;
        if (view == null) {
            kotlin.s.c.l.l("toolbarView");
            throw null;
        }
        view.setVisibility(z2 ? 8 : 0);
        View view2 = this;
        while (true) {
            if (view2 == null) {
                view2 = null;
                break;
            } else {
                if (view2 instanceof ClipboardCommonPhraseContainer) {
                    break;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
        }
        ClipboardCommonPhraseContainer clipboardCommonPhraseContainer = (ClipboardCommonPhraseContainer) view2;
        if (clipboardCommonPhraseContainer != null) {
            clipboardCommonPhraseContainer.b(z && booleanValue);
        }
        if (!IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) {
            View view3 = this.f2680d;
            if (view3 == null) {
                kotlin.s.c.l.l("toolbarView");
                throw null;
            }
            view3.setBackgroundResource(C0838R.color.navigation_bar_normal);
        } else {
            View view4 = this.f2680d;
            if (view4 == null) {
                kotlin.s.c.l.l("toolbarView");
                throw null;
            }
            view4.setBackgroundResource(C0838R.color.transparent);
        }
        j jVar = j.a;
        j c2 = j.c();
        Context context = getContext();
        kotlin.s.c.l.e(context, "context");
        this.f2682f = c2.d(context);
        e.a.a.a.a.C0(e.a.a.a.a.M("showView mPhraseCount: "), this.f2682f, this.a);
        if (this.f2682f == 0) {
            com.bytedance.android.input.r.j.m(this.a, "initView showpage empty");
            i(0);
        } else {
            com.bytedance.android.input.r.j.m(this.a, "initView showpage list");
            i(this.f2681e);
        }
    }

    public final void k(String str, String str2) {
        kotlin.s.c.l.f(str, "phrase");
        kotlin.s.c.l.f(str2, "code");
        e.a.a.a.a.t0("updateCommonPhrase phrase: ", str, ", code: ", str2, this.a);
        j jVar = j.a;
        j c2 = j.c();
        String str3 = this.f2683g;
        String str4 = this.h;
        Objects.requireNonNull(c2);
        kotlin.s.c.l.f(str3, "phraseOld");
        kotlin.s.c.l.f(str4, "codeOld");
        kotlin.s.c.l.f(str, "phraseNew");
        kotlin.s.c.l.f(str2, "codeNew");
        com.bytedance.android.input.r.j.i("commonPhrase", "updateCommonPhrase phraseOld: " + str3 + ", codeOld: " + str4 + ", phraseNew: " + str + ", codeNew: " + str2);
        e.a.a.a.a.r0("updateCommonPhrase status: ", KeyboardJni.getKeyboardJni().updateCommonPhrase(str4, str3, str2, str), "commonPhrase");
        com.bytedance.android.input.r.j.i(this.a, e.a.a.a.a.v("updateCommonPhrase phrase: ", str, ", code: ", str2, " save to dict"));
        j.c().f();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (kotlin.s.c.l.a(view, this) && i == 0) {
            j();
        }
    }
}
