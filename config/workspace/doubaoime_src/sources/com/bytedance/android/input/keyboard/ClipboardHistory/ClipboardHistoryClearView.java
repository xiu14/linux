package com.bytedance.android.input.keyboard.ClipboardHistory;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.clipboardcommonphrase.ClipboardCommonPhraseContainer;

/* loaded from: classes.dex */
public final class ClipboardHistoryClearView extends FrameLayout implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f2463f = 0;
    private final String a;
    private RelativeLayout b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f2464c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f2465d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f2466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClipboardHistoryClearView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "ClipboardHistoryClearView";
        FrameLayout.inflate(context, C0838R.layout.clipboard_history_clear_view, this);
        View findViewById = findViewById(C0838R.id.btn_close_clipboard_clear_view);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardHistoryClearView.a(ClipboardHistoryClearView.this, view);
                }
            });
        }
        this.f2466e = (LinearLayout) findViewById(C0838R.id.common_phrase_empty);
        this.b = (RelativeLayout) findViewById(C0838R.id.clipboard_clear_view_container);
        TextView textView = (TextView) findViewById(C0838R.id.btn_clipboard_clear_cancel);
        this.f2464c = textView;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardHistoryClearView clipboardHistoryClearView = ClipboardHistoryClearView.this;
                    int i = ClipboardHistoryClearView.f2463f;
                    kotlin.s.c.l.f(clipboardHistoryClearView, "this$0");
                    View view2 = clipboardHistoryClearView;
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
                        clipboardCommonPhraseContainer.j(false);
                    }
                    ViewParent parent2 = clipboardHistoryClearView.getParent();
                    kotlin.s.c.l.d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent2).removeView(clipboardHistoryClearView);
                }
            });
        }
        TextView textView2 = (TextView) findViewById(C0838R.id.btn_clipboard_clear_confirm);
        this.f2465d = textView2;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.ClipboardHistory.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardHistoryClearView clipboardHistoryClearView = ClipboardHistoryClearView.this;
                    int i = ClipboardHistoryClearView.f2463f;
                    kotlin.s.c.l.f(clipboardHistoryClearView, "this$0");
                    v vVar = v.a;
                    v.d().b();
                    View view2 = clipboardHistoryClearView;
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
                        clipboardCommonPhraseContainer.j(false);
                    }
                    ViewParent parent2 = clipboardHistoryClearView.getParent();
                    kotlin.s.c.l.d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((ViewGroup) parent2).removeView(clipboardHistoryClearView);
                }
            });
        }
        b();
    }

    public static void a(ClipboardHistoryClearView clipboardHistoryClearView, View view) {
        kotlin.s.c.l.f(clipboardHistoryClearView, "this$0");
        com.bytedance.android.input.r.j.m(clipboardHistoryClearView.a, "close ClipboardHistoryClearView");
        View view2 = clipboardHistoryClearView;
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
            clipboardCommonPhraseContainer.j(false);
        }
        ViewParent parent2 = clipboardHistoryClearView.getParent();
        kotlin.s.c.l.d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent2).removeView(clipboardHistoryClearView);
    }

    private final void b() {
        if (this.f2466e == null || !IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) {
            return;
        }
        RelativeLayout relativeLayout = this.b;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(C0838R.drawable.bg_common_phrase_empty_transparent);
        }
        View findViewById = findViewById(C0838R.id.btn_close_clipboard_clear_view);
        if (findViewById != null) {
            findViewById.setBackgroundResource(C0838R.drawable.bg_toolbar_btn_transparent);
        }
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
        kotlin.s.c.l.e(getContext(), "context");
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        kotlin.s.c.l.f(view, "changedView");
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onVisibilityChanged, orientation: ");
        e.a.a.a.a.F0(M, getResources().getConfiguration().orientation, ", visibility = ", i, " , view = ");
        M.append(view);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if ((kotlin.s.c.l.a(view, getParent()) || kotlin.s.c.l.a(view, this)) && i == 0) {
            b();
            kotlin.s.c.l.e(getContext(), "context");
        }
        String str2 = this.a;
        StringBuilder M2 = e.a.a.a.a.M("onVisibilityChanged over, orientation: ");
        e.a.a.a.a.F0(M2, getResources().getConfiguration().orientation, ", visibility = ", i, " , view = ");
        M2.append(view);
        com.bytedance.android.input.r.j.i(str2, M2.toString());
    }
}
