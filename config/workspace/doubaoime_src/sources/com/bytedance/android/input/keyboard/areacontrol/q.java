package com.bytedance.android.input.keyboard.areacontrol;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.ImeService;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.keyboard.InputView;

/* loaded from: classes.dex */
public final class q implements View.OnClickListener {
    private LinearLayout a;
    private LinearLayout b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2651c = true;

    public final void a(Context context, ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        kotlin.s.c.l.f(context, "contextParent");
        kotlin.s.c.l.f(viewGroup, "boardView");
        k kVar = k.a;
        if (!(k.U() && (!k.Q() || k.T()))) {
            LinearLayout linearLayout = this.a;
            if (linearLayout != null) {
                kotlin.s.c.l.c(linearLayout);
                linearLayout.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.b;
            if (linearLayout2 != null) {
                kotlin.s.c.l.c(linearLayout2);
                linearLayout2.setVisibility(8);
                return;
            }
            return;
        }
        if (this.a == null) {
            LinearLayout linearLayout3 = (LinearLayout) View.inflate(context, C0838R.layout.ime_onehand_left, null);
            this.a = linearLayout3;
            if (linearLayout3 != null && (findViewById4 = linearLayout3.findViewById(C0838R.id.btn_one_hand_left)) != null) {
                findViewById4.setOnClickListener(this);
            }
            LinearLayout linearLayout4 = this.a;
            if (linearLayout4 != null && (findViewById3 = linearLayout4.findViewById(C0838R.id.btn_one_hand_back)) != null) {
                findViewById3.setOnClickListener(this);
            }
            viewGroup.addView(this.a, 0, new ViewGroup.LayoutParams(k.A(), -1));
        }
        if (this.b == null) {
            LinearLayout linearLayout5 = (LinearLayout) View.inflate(context, C0838R.layout.ime_onehand_right, null);
            this.b = linearLayout5;
            if (linearLayout5 != null && (findViewById2 = linearLayout5.findViewById(C0838R.id.btn_one_hand_right)) != null) {
                findViewById2.setOnClickListener(this);
            }
            LinearLayout linearLayout6 = this.b;
            if (linearLayout6 != null && (findViewById = linearLayout6.findViewById(C0838R.id.btn_one_hand_back)) != null) {
                findViewById.setOnClickListener(this);
            }
            viewGroup.addView(this.b, 2, new ViewGroup.LayoutParams(k.A(), -1));
        }
        LinearLayout linearLayout7 = this.a;
        if (linearLayout7 != null) {
            kotlin.s.c.l.c(linearLayout7);
            linearLayout7.setVisibility(k.W() ? 0 : 8);
        }
        LinearLayout linearLayout8 = this.b;
        if (linearLayout8 != null) {
            kotlin.s.c.l.c(linearLayout8);
            linearLayout8.setVisibility(k.W() ? 8 : 0);
        }
    }

    public final void b() {
        LinearLayout linearLayout = this.a;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        LinearLayout linearLayout2 = this.b;
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    public final void c(boolean z) {
        this.f2651c = z;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f2651c && view != null) {
            switch (view.getId()) {
                case C0838R.id.btn_one_hand_back /* 2131362122 */:
                    com.bytedance.android.input.r.j.i("OneHandInputView", "[StretchView] doResetToWholeView");
                    SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.FALSE);
                    LinearLayout linearLayout = this.a;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = this.b;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                    InputView inputView = ImeService.x;
                    if (inputView == null) {
                        com.bytedance.android.input.r.j.j("OneHandInputView", "[StretchView] doResetToWholeView inputView is null");
                        break;
                    } else {
                        inputView.L();
                        break;
                    }
                case C0838R.id.btn_one_hand_left /* 2131362123 */:
                    k kVar = k.a;
                    k.g0(false);
                    LinearLayout linearLayout3 = this.a;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    LinearLayout linearLayout4 = this.b;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                        break;
                    }
                    break;
                case C0838R.id.btn_one_hand_right /* 2131362124 */:
                    k kVar2 = k.a;
                    k.g0(true);
                    LinearLayout linearLayout5 = this.a;
                    if (linearLayout5 != null) {
                        linearLayout5.setVisibility(0);
                    }
                    LinearLayout linearLayout6 = this.b;
                    if (linearLayout6 != null) {
                        linearLayout6.setVisibility(8);
                        break;
                    }
                    break;
            }
        }
    }
}
