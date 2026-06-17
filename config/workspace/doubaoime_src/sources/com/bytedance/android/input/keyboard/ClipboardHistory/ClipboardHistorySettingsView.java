package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;
import com.bytedance.common_biz.ui.widget.ImeButton;

/* loaded from: classes.dex */
public final class ClipboardHistorySettingsView extends FrameLayout implements View.OnClickListener {
    public static final /* synthetic */ int i = 0;
    private final String a;
    private ImeButton b;

    /* renamed from: c, reason: collision with root package name */
    private ImeButton f2486c;

    /* renamed from: d, reason: collision with root package name */
    private ImeButton f2487d;

    /* renamed from: e, reason: collision with root package name */
    private ImeButton f2488e;

    /* renamed from: f, reason: collision with root package name */
    private ScrollView f2489f;

    /* renamed from: g, reason: collision with root package name */
    private int f2490g;
    private int h;

    static final class a extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        final /* synthetic */ InputViewRoot a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputViewRoot inputViewRoot) {
            super(1);
            this.a = inputViewRoot;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            this.a.w0(false);
            return kotlin.o.a;
        }
    }

    static final class b extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        b() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            com.bytedance.android.input.r.j.i("CloudConfig", "setSupportClipboardHistory, enable: true");
            KeyboardJni.updateSettingsBooleanValue(IAppGlobals.a.getContext().getString(C0838R.string.enable_clipboard_history), true);
            View view2 = ClipboardHistorySettingsView.this;
            while (true) {
                if (view2 == null) {
                    view2 = null;
                    break;
                }
                if (view2 instanceof ClipboardHistoryView) {
                    break;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            ClipboardHistoryView clipboardHistoryView = (ClipboardHistoryView) view2;
            if (clipboardHistoryView != null) {
                int i = ClipboardHistoryView.j;
                clipboardHistoryView.m(false);
            }
            return kotlin.o.a;
        }
    }

    static final class c extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        final /* synthetic */ InputViewRoot a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InputViewRoot inputViewRoot) {
            super(1);
            this.a = inputViewRoot;
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            this.a.w0(false);
            return kotlin.o.a;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.l<View, kotlin.o> {
        d() {
            super(1);
        }

        @Override // kotlin.s.b.l
        public kotlin.o invoke(View view) {
            kotlin.s.c.l.f(view, "it");
            String string = IAppGlobals.a.getContext().getString(C0838R.string.full_base_input_mode);
            com.bytedance.android.input.r.j.i(ClipboardHistorySettingsView.this.a, "onAgree intelligence, setValue: " + string + ", value: 0");
            KeyboardJni.updateSettingsValueForce(string, 0);
            View view2 = ClipboardHistorySettingsView.this;
            while (true) {
                if (view2 == null) {
                    view2 = null;
                    break;
                }
                if (view2 instanceof ClipboardHistoryView) {
                    break;
                }
                Object parent = view2.getParent();
                view2 = parent instanceof View ? (View) parent : null;
            }
            ClipboardHistoryView clipboardHistoryView = (ClipboardHistoryView) view2;
            if (clipboardHistoryView != null) {
                int i = ClipboardHistoryView.j;
                clipboardHistoryView.m(false);
            }
            return kotlin.o.a;
        }
    }

    public static final class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ClipboardHistorySettingsView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClipboardHistorySettingsView.this.g();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardHistorySettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "ClipboardHistorySettingsView";
        this.f2490g = -1;
        this.h = -1;
        FrameLayout.inflate(context, C0838R.layout.clipboard_history_settings_view, this);
    }

    public static void d(ClipboardHistorySettingsView clipboardHistorySettingsView) {
        kotlin.s.c.l.f(clipboardHistorySettingsView, "this$0");
        clipboardHistorySettingsView.g();
    }

    public static void e(ClipboardHistorySettingsView clipboardHistorySettingsView) {
        kotlin.s.c.l.f(clipboardHistorySettingsView, "this$0");
        clipboardHistorySettingsView.g();
    }

    private final void f(ImeButton imeButton, boolean z, int i2) {
        ViewGroup.LayoutParams layoutParams = imeButton.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        if (!z) {
            i2 = 0;
        }
        float f2 = z ? 0.0f : 1.0f;
        if (layoutParams2.width == i2) {
            if (layoutParams2.weight == f2) {
                return;
            }
        }
        layoutParams2.width = i2;
        layoutParams2.weight = f2;
        imeButton.setLayoutParams(layoutParams2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        i(this.b, this.f2486c, false);
        i(this.f2487d, this.f2488e, true);
    }

    private final void h() {
        if (!IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) {
            return;
        }
        setBackgroundResource(C0838R.color.transparent);
        ScrollView scrollView = this.f2489f;
        if (scrollView != null) {
            scrollView.setBackgroundResource(C0838R.drawable.bg_common_phrase_empty_transparent);
        }
    }

    private final void i(ImeButton imeButton, ImeButton imeButton2, boolean z) {
        int width;
        if (imeButton == null || imeButton2 == null) {
            return;
        }
        Object parent = imeButton.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null && (width = (view.getWidth() - view.getPaddingStart()) - view.getPaddingEnd()) > 0) {
            if (width == (z ? this.h : this.f2490g)) {
                return;
            }
            if (z) {
                this.h = width;
            } else {
                this.f2490g = width;
            }
            int dimensionPixelSize = getResources().getDimensionPixelSize(C0838R.dimen.clipboard_settings_button_margin);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0838R.dimen.ime_dp_115);
            int i2 = width - dimensionPixelSize;
            if (i2 <= 0) {
                return;
            }
            boolean z2 = i2 / 2 >= dimensionPixelSize2;
            f(imeButton, z2, dimensionPixelSize2);
            f(imeButton2, z2, dimensionPixelSize2);
        }
    }

    public final void c(final InputViewRoot inputViewRoot, ClipboardHistoryView clipboardHistoryView) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        kotlin.s.c.l.f(clipboardHistoryView, "clipboardHistoryView");
        View findViewById = findViewById(C0838R.id.btn_close_phrase_empty_view);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InputViewRoot inputViewRoot2 = InputViewRoot.this;
                    int i2 = ClipboardHistorySettingsView.i;
                    kotlin.s.c.l.f(inputViewRoot2, "$inputViewRoot");
                    inputViewRoot2.w0(false);
                }
            });
        }
        findViewById(C0838R.id.clipboard_config_content_container);
        this.f2489f = (ScrollView) findViewById(C0838R.id.clipboard_settings_view_scrollview);
        ImeButton imeButton = (ImeButton) findViewById(C0838R.id.clipboard_history_settings_button_cancel);
        this.b = imeButton;
        if (imeButton != null) {
            e.b.d.a.a.e.g(imeButton, new a(inputViewRoot));
        }
        ImeButton imeButton2 = (ImeButton) findViewById(C0838R.id.clipboard_history_settings_button_confirm);
        this.f2486c = imeButton2;
        if (imeButton2 != null) {
            e.b.d.a.a.e.g(imeButton2, new b());
        }
        ImeButton imeButton3 = (ImeButton) findViewById(C0838R.id.clipboard_history_intelligence_button_cancel);
        this.f2487d = imeButton3;
        if (imeButton3 != null) {
            e.b.d.a.a.e.g(imeButton3, new c(inputViewRoot));
        }
        ImeButton imeButton4 = (ImeButton) findViewById(C0838R.id.clipboard_history_intelligence_button_confirm);
        this.f2488e = imeButton4;
        if (imeButton4 != null) {
            e.b.d.a.a.e.g(imeButton4, new d());
        }
        View findViewById2 = findViewById(C0838R.id.clipboard_settings_intelligence_description);
        kotlin.s.c.l.e(findViewById2, "findViewById(R.id.clipbo…intelligence_description)");
        TextView textView = (TextView) findViewById2;
        CharSequence text = textView.getText();
        String obj = text != null ? text.toString() : null;
        if (obj == null) {
            obj = "";
        }
        if (!(obj.length() == 0)) {
            int color = ContextCompat.getColor(getContext(), C0838R.color.privacy_statement_url_link);
            SpannableString spannableString = new SpannableString(obj);
            for (String str : kotlin.collections.g.G("《豆包输入法用户协议》", "《豆包输入法隐私政策》", "《用户服务协议》", "《个人信息保护政策》")) {
                for (int q = kotlin.text.a.q(obj, str, 0, false, 6, null); q != -1; q = kotlin.text.a.q(obj, str, str.length() + q, false, 4, null)) {
                    spannableString.setSpan(new ForegroundColorSpan(color), q, str.length() + q, 33);
                }
            }
            textView.setText(spannableString);
        }
        getViewTreeObserver().addOnPreDrawListener(new e());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onClick, v id: ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged, orientation: ");
        M.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        h();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            post(new Runnable() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.u
                @Override // java.lang.Runnable
                public final void run() {
                    ClipboardHistorySettingsView.e(ClipboardHistorySettingsView.this);
                }
            });
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i2) {
        kotlin.s.c.l.f(view, "changedView");
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onVisibilityChanged, orientation: ");
        e.a.a.a.a.F0(M, getResources().getConfiguration().orientation, ", visibility = ", i2, " , view = ");
        M.append(view);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if ((kotlin.s.c.l.a(view, getParent()) || kotlin.s.c.l.a(view, this)) && i2 == 0) {
            h();
        }
    }
}
