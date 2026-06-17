package com.bytedance.android.input.keyboard.commonphrase;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.areacontrol.InputViewRoot;

/* loaded from: classes.dex */
public final class CommonPhraseEmptyView extends FrameLayout implements View.OnClickListener {
    private final String a;
    private InputViewRoot b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f2657c;

    /* renamed from: d, reason: collision with root package name */
    private LinearLayout f2658d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f2659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonPhraseEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
        this.a = "CommonPhraseEmptyView";
        FrameLayout.inflate(context, C0838R.layout.common_phrase_empty_view, this);
    }

    private final void b() {
        LinearLayout linearLayout = this.f2658d;
        if (linearLayout == null) {
            return;
        }
        if (!IAppGlobals.a.K() || KeyboardJni.isFloatingMode()) {
            linearLayout.setBackgroundResource(C0838R.drawable.bg_common_phrase_empty);
        } else {
            linearLayout.setBackgroundResource(C0838R.drawable.bg_common_phrase_empty_transparent);
        }
    }

    private final void c(Configuration configuration) {
        Configuration configuration2;
        if (configuration != null) {
            configuration2 = new Configuration(configuration);
            int orientation = KeyboardJni.getOrientation();
            if (KeyboardJni.isFloatingMode()) {
                com.bytedance.android.input.r.j.i(this.a, "mClipboardHistoryView is floating, make it ORIENTATION_PORTRAIT");
                configuration2.orientation = 1;
            } else if (orientation != 0) {
                configuration2.orientation = orientation;
            }
        } else {
            configuration2 = null;
        }
        float f2 = 1.0f;
        if (configuration2 != null && configuration2.orientation == 1) {
            if (KeyboardJni.isFloatingMode()) {
                f2 = 0.9f;
            } else {
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                if ((com.bytedance.android.input.keyboard.areacontrol.k.U() || com.bytedance.android.input.keyboard.areacontrol.k.M()) && !com.bytedance.android.input.keyboard.areacontrol.k.O()) {
                    f2 = 0.8f;
                }
            }
        }
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onVisibilityChanged KeyboardJni.isFloatingMode()=");
        M.append(KeyboardJni.isFloatingMode());
        M.append(" InputViewModel.isOneHandMode()=");
        com.bytedance.android.input.keyboard.areacontrol.k kVar2 = com.bytedance.android.input.keyboard.areacontrol.k.a;
        M.append(com.bytedance.android.input.keyboard.areacontrol.k.U());
        M.append(" InputViewModel.horizontalAdjustKeyboardMargin()=");
        M.append(com.bytedance.android.input.keyboard.areacontrol.k.M());
        M.append(" InputViewModel.isExceedDefaultHeight()=");
        M.append(com.bytedance.android.input.keyboard.areacontrol.k.O());
        M.append(" updatedConfiguration?.orientation=");
        M.append(configuration2 != null ? Integer.valueOf(configuration2.orientation) : null);
        M.append(" scale=");
        M.append(f2);
        com.bytedance.android.input.r.j.i(str, M.toString());
        RelativeLayout relativeLayout = this.f2657c;
        if (relativeLayout != null) {
            relativeLayout.setScaleX(f2);
        }
        RelativeLayout relativeLayout2 = this.f2657c;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setScaleY(f2);
    }

    public final void a(InputViewRoot inputViewRoot) {
        kotlin.s.c.l.f(inputViewRoot, "inputViewRoot");
        this.b = inputViewRoot;
        TextView textView = (TextView) findViewById(C0838R.id.btn_bottom_add_phrase);
        this.f2659e = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        this.f2657c = (RelativeLayout) findViewById(C0838R.id.phrase_empty_view_container);
        this.f2658d = (LinearLayout) findViewById(C0838R.id.common_phrase_empty);
        b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onClick, v id: ");
        M.append(view != null ? Integer.valueOf(view.getId()) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        if (view != null) {
            int id = view.getId();
            if (id == C0838R.id.btn_add_common_phrase || id == C0838R.id.btn_bottom_add_phrase) {
                com.bytedance.android.input.r.j.i(this.a, "doAddPhraseView");
                com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
                if (com.bytedance.android.input.keyboard.areacontrol.k.S()) {
                    com.bytedance.android.input.r.j.j(this.a, "doAddPhraseView, isLandscape, not support");
                    C0603x.f2629e.a(C0838R.string.common_phrase_cannot_add_toast);
                    return;
                }
                InputViewRoot inputViewRoot = this.b;
                if (inputViewRoot != null) {
                    inputViewRoot.setCommonPhraseEditViewEnabled(true, new String[0]);
                }
                InputViewRoot inputViewRoot2 = this.b;
                if (inputViewRoot2 != null) {
                    inputViewRoot2.x0(false);
                }
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        String str = this.a;
        StringBuilder M = e.a.a.a.a.M("onConfigurationChanged, orientation: ");
        M.append(configuration != null ? Integer.valueOf(configuration.orientation) : null);
        com.bytedance.android.input.r.j.i(str, M.toString());
        kotlin.s.c.l.e(getContext(), "context");
        c(configuration);
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
            c(getResources().getConfiguration());
        }
    }
}
