package com.bytedance.android.input.keyboard.clipboardcommonphrase;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryClearView;
import com.bytedance.android.input.keyboard.ClipboardHistory.ClipboardHistoryView;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.android.input.keyboard.areacontrol.k;
import com.bytedance.android.input.keyboard.commonphrase.CommonPhraseView;
import com.bytedance.android.input.keyboard.component.SegmentedBar;
import com.bytedance.android.input.keyboard.word_segmentation.n;
import com.bytedance.android.input.r.j;
import com.ss.android.message.log.PushLog;
import kotlin.collections.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class ClipboardCommonPhraseContainer extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    private InputViewRoot a;
    private View b;

    /* renamed from: c, reason: collision with root package name */
    private SegmentedBar f2652c;

    /* renamed from: d, reason: collision with root package name */
    private ClipboardHistoryView f2653d;

    /* renamed from: e, reason: collision with root package name */
    private CommonPhraseView f2654e;

    /* renamed from: f, reason: collision with root package name */
    private ClipboardHistoryClearView f2655f;

    /* renamed from: g, reason: collision with root package name */
    private View f2656g;
    private View h;
    private View i;
    private View j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;

    public static final class a implements SegmentedBar.a {
        a() {
        }

        @Override // com.bytedance.android.input.keyboard.component.SegmentedBar.a
        public boolean a(int i) {
            return false;
        }

        @Override // com.bytedance.android.input.keyboard.component.SegmentedBar.a
        public void b(int i, String str) {
            l.f(str, PushLog.KEY_LABEL);
            if (i == 0) {
                e.a.a.a.a.q0("click_target", "clipboard_tab", IAppLog.a, "tab_switch_click");
            } else {
                e.a.a.a.a.q0("click_target", "phrase_tab", IAppLog.a, "tab_switch_click");
            }
            ClipboardCommonPhraseContainer.l(ClipboardCommonPhraseContainer.this, i, false, 2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ClipboardCommonPhraseContainer(Context context) {
        this(context, null);
        l.f(context, "context");
    }

    private final void a() {
        if (IAppGlobals.a.K() && !KeyboardJni.isFloatingMode()) {
            View view = this.b;
            if (view == null) {
                l.l("toolbar");
                throw null;
            }
            view.setBackgroundResource(C0838R.color.transparent);
            View view2 = this.f2656g;
            if (view2 == null) {
                l.l("btnClose");
                throw null;
            }
            view2.setBackgroundResource(C0838R.drawable.bg_toolbar_btn_transparent);
            View view3 = this.h;
            if (view3 == null) {
                l.l("btnAddCommonPhrase");
                throw null;
            }
            view3.setBackgroundResource(C0838R.drawable.bg_toolbar_btn_transparent);
            View view4 = this.j;
            if (view4 != null) {
                view4.setBackgroundResource(C0838R.drawable.bg_toolbar_btn_transparent);
            } else {
                l.l("btnDeleteClipboardBtn");
                throw null;
            }
        }
    }

    private final Context c() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Configuration configuration = new Configuration(aVar.getContext().getResources().getConfiguration());
        if (this.l == 2) {
            configuration.densityDpi = (int) (aVar.getContext().getResources().getDisplayMetrics().densityDpi * 0.8f);
            configuration.orientation = 1;
        }
        configuration.uiMode = aVar.b() ? 32 : 17;
        Context createConfigurationContext = aVar.getContext().createConfigurationContext(configuration);
        l.e(createConfigurationContext, "IAppGlobals.context.crea…figurationContext(config)");
        return createConfigurationContext;
    }

    public static void f(ClipboardCommonPhraseContainer clipboardCommonPhraseContainer, View view) {
        l.f(clipboardCommonPhraseContainer, "this$0");
        k kVar = k.a;
        if (k.S()) {
            j.j("ClipboardCommonPhraseContainer", "doAddPhrase, isLandscape, not support");
            C0603x.f2629e.a(C0838R.string.common_phrase_cannot_add_toast);
            return;
        }
        InputViewRoot inputViewRoot = clipboardCommonPhraseContainer.a;
        if (inputViewRoot == null) {
            l.l("mInputViewRoot");
            throw null;
        }
        inputViewRoot.setCommonPhraseEditViewEnabled(true, new String[0]);
        InputViewRoot inputViewRoot2 = clipboardCommonPhraseContainer.a;
        if (inputViewRoot2 != null) {
            inputViewRoot2.x0(false);
        } else {
            l.l("mInputViewRoot");
            throw null;
        }
    }

    public static void g(ClipboardCommonPhraseContainer clipboardCommonPhraseContainer, Context context, View view) {
        l.f(clipboardCommonPhraseContainer, "this$0");
        l.f(context, "$inflateContext");
        clipboardCommonPhraseContainer.j(true);
        ClipboardHistoryClearView clipboardHistoryClearView = new ClipboardHistoryClearView(context, null);
        clipboardCommonPhraseContainer.f2655f = clipboardHistoryClearView;
        clipboardCommonPhraseContainer.addView(clipboardHistoryClearView, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void i() {
        InputViewRoot inputViewRoot = this.a;
        if (inputViewRoot == null) {
            return;
        }
        if (inputViewRoot != null) {
            d(inputViewRoot, this.k);
        } else {
            l.l("mInputViewRoot");
            throw null;
        }
    }

    public static void l(ClipboardCommonPhraseContainer clipboardCommonPhraseContainer, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (clipboardCommonPhraseContainer.k != i || z) {
            clipboardCommonPhraseContainer.k = i;
            clipboardCommonPhraseContainer.o();
        }
    }

    private final void n(Resources resources) {
        int dimensionPixelSize = this.l == 1 ? resources.getDimensionPixelSize(C0838R.dimen.clipboard_common_phrase_toolbar_padding_horizontal_landscape) : resources.getDimensionPixelSize(C0838R.dimen.clipboard_common_phrase_toolbar_padding_horizontal_portrait);
        View view = this.b;
        if (view != null) {
            view.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            l.l("toolbar");
            throw null;
        }
    }

    private final void o() {
        e.a.a.a.a.C0(e.a.a.a.a.M("updateView currentTab="), this.k, "ClipboardCommonPhraseContainer");
        SegmentedBar segmentedBar = this.f2652c;
        if (segmentedBar == null) {
            l.l("segmentedBar");
            throw null;
        }
        int a2 = segmentedBar.a();
        int i = this.k;
        if (a2 != i) {
            SegmentedBar segmentedBar2 = this.f2652c;
            if (segmentedBar2 == null) {
                l.l("segmentedBar");
                throw null;
            }
            segmentedBar2.setSelectedIndex(i, false);
        }
        removeView(this.f2653d);
        removeView(this.f2654e);
        int i2 = this.k;
        if (i2 == 0) {
            View view = this.i;
            if (view == null) {
                l.l("btnDeleteClipboardContainer");
                throw null;
            }
            view.setVisibility(0);
            View view2 = this.h;
            if (view2 == null) {
                l.l("btnAddCommonPhrase");
                throw null;
            }
            view2.setVisibility(8);
            ClipboardHistoryView clipboardHistoryView = this.f2653d;
            if (clipboardHistoryView.getParent() != null) {
                ViewParent parent = clipboardHistoryView.getParent();
                l.d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(clipboardHistoryView);
            }
            addView(clipboardHistoryView, new FrameLayout.LayoutParams(-1, -1));
            clipboardHistoryView.m(false);
            return;
        }
        if (i2 != 1) {
            return;
        }
        View view3 = this.i;
        if (view3 == null) {
            l.l("btnDeleteClipboardContainer");
            throw null;
        }
        view3.setVisibility(8);
        View view4 = this.h;
        if (view4 == null) {
            l.l("btnAddCommonPhrase");
            throw null;
        }
        view4.setVisibility(0);
        CommonPhraseView commonPhraseView = this.f2654e;
        if (commonPhraseView.getParent() != null) {
            ViewParent parent2 = commonPhraseView.getParent();
            l.d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent2).removeView(commonPhraseView);
        }
        addView(commonPhraseView, new FrameLayout.LayoutParams(-1, -1));
        commonPhraseView.j();
    }

    public final void b(boolean z) {
        View view = this.b;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        } else {
            l.l("toolbar");
            throw null;
        }
    }

    public final void d(final InputViewRoot inputViewRoot, int i) {
        l.f(inputViewRoot, "inputViewRoot");
        this.a = inputViewRoot;
        k kVar = k.a;
        this.l = k.m();
        this.k = i;
        removeAllViews();
        final Context c2 = c();
        View inflate = LayoutInflater.from(c2).inflate(C0838R.layout.clipboard_common_phrase_toolbar, (ViewGroup) this, true);
        View findViewById = inflate.findViewById(C0838R.id.clipboard_common_phrase_toolbar);
        l.e(findViewById, "toolbarLayout.findViewBy…rd_common_phrase_toolbar)");
        this.b = findViewById;
        View findViewById2 = inflate.findViewById(C0838R.id.btn_close_clipboard_common_phrase);
        l.e(findViewById2, "toolbarLayout.findViewBy…_clipboard_common_phrase)");
        this.f2656g = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.clipboardcommonphrase.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InputViewRoot inputViewRoot2 = InputViewRoot.this;
                int i2 = ClipboardCommonPhraseContainer.o;
                l.f(inputViewRoot2, "$inputViewRoot");
                UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.KEY_FUNCTION, false);
                inputViewRoot2.w0(false);
            }
        });
        View findViewById3 = inflate.findViewById(C0838R.id.segmented_bar);
        l.e(findViewById3, "toolbarLayout.findViewById(R.id.segmented_bar)");
        SegmentedBar segmentedBar = (SegmentedBar) findViewById3;
        this.f2652c = segmentedBar;
        segmentedBar.setItems(g.G(c2.getString(C0838R.string.clipboard_title), c2.getString(C0838R.string.common_phrase_title)));
        SegmentedBar segmentedBar2 = this.f2652c;
        if (segmentedBar2 == null) {
            l.l("segmentedBar");
            throw null;
        }
        segmentedBar2.setSelectedIndex(i, false);
        SegmentedBar segmentedBar3 = this.f2652c;
        if (segmentedBar3 == null) {
            l.l("segmentedBar");
            throw null;
        }
        segmentedBar3.setOnItemSelectedListener(new a());
        View findViewById4 = inflate.findViewById(C0838R.id.btn_delete_clipboard_container);
        l.e(findViewById4, "toolbarLayout.findViewBy…lete_clipboard_container)");
        this.i = findViewById4;
        View findViewById5 = inflate.findViewById(C0838R.id.btn_delete_clipboard);
        l.e(findViewById5, "toolbarLayout.findViewBy….id.btn_delete_clipboard)");
        this.j = findViewById5;
        findViewById5.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.clipboardcommonphrase.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClipboardCommonPhraseContainer.g(ClipboardCommonPhraseContainer.this, c2, view);
            }
        });
        View findViewById6 = inflate.findViewById(C0838R.id.btn_add_common_phrase);
        l.e(findViewById6, "toolbarLayout.findViewBy…id.btn_add_common_phrase)");
        this.h = findViewById6;
        findViewById6.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.clipboardcommonphrase.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClipboardCommonPhraseContainer.f(ClipboardCommonPhraseContainer.this, view);
            }
        });
        this.f2655f = null;
        this.f2653d = new ClipboardHistoryView(c2, null);
        this.f2654e = new CommonPhraseView(c2, null);
        a();
        ClipboardHistoryView clipboardHistoryView = this.f2653d;
        InputViewRoot inputViewRoot2 = this.a;
        if (inputViewRoot2 == null) {
            l.l("mInputViewRoot");
            throw null;
        }
        View view = this.j;
        if (view == null) {
            l.l("btnDeleteClipboardBtn");
            throw null;
        }
        clipboardHistoryView.h(inputViewRoot2, view);
        CommonPhraseView commonPhraseView = this.f2654e;
        InputViewRoot inputViewRoot3 = this.a;
        if (inputViewRoot3 == null) {
            l.l("mInputViewRoot");
            throw null;
        }
        commonPhraseView.d(inputViewRoot3);
        o();
        Resources resources = c2.getResources();
        l.e(resources, "inflateContext.resources");
        n(resources);
    }

    public final void e(String str, String str2) {
        l.f(str, "phrase");
        l.f(str2, "code");
        this.f2654e.e(str, str2);
    }

    public final void h() {
        n.b(this);
        ClipboardHistoryClearView clipboardHistoryClearView = this.f2655f;
        if (clipboardHistoryClearView != null) {
            removeView(clipboardHistoryClearView);
            j(false);
        }
        this.f2653d.j();
        this.f2654e.h();
    }

    public final void j(boolean z) {
        View view = this.b;
        if (view == null) {
            l.l("toolbar");
            throw null;
        }
        view.setVisibility(z ? 8 : 0);
        this.f2653d.setVisibility(z ? 8 : 0);
        this.f2654e.setVisibility(z ? 8 : 0);
    }

    public final void k(int i, boolean z) {
        if (this.k != i || z) {
            this.k = i;
            o();
        }
    }

    public final void m(String str, String str2) {
        l.f(str, "phrase");
        l.f(str2, "code");
        this.f2654e.k(str, str2);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Resources resources = c().getResources();
        l.e(resources, "getInflateContext().resources");
        n(resources);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        l.f(view, "changedView");
        super.onVisibilityChanged(view, i);
        if (l.a(view, this)) {
            boolean z = i == 0;
            this.m = z;
            if (z && this.n) {
                this.n = false;
                i();
            } else if (z) {
                a();
            }
        }
    }

    public final void setKeyboardState(int i) {
        if (this.l != i) {
            this.l = i;
            if (this.m) {
                i();
            } else {
                this.n = true;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardCommonPhraseContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.f(context, "context");
        this.f2653d = new ClipboardHistoryView(context, null);
        this.f2654e = new CommonPhraseView(context, null);
        k kVar = k.a;
        this.l = k.m();
    }
}
