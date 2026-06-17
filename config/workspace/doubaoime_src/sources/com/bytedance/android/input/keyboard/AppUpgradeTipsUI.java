package com.bytedance.android.input.keyboard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.common.upgrade.UserOperation;
import com.obric.common.upgrade.VersionCheckResponse;
import com.obric.oui.button.OButton;

/* loaded from: classes.dex */
public final class AppUpgradeTipsUI extends ConstraintLayout implements View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f2460e = 0;
    private TextView a;
    private TextView b;

    /* renamed from: c, reason: collision with root package name */
    private OButton f2461c;

    /* renamed from: d, reason: collision with root package name */
    private OButton f2462d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppUpgradeTipsUI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.s.c.l.f(context, "context");
    }

    public final void g(VersionCheckResponse versionCheckResponse, final kotlin.s.b.l<? super UserOperation, kotlin.o> lVar) {
        kotlin.s.c.l.f(versionCheckResponse, "response");
        kotlin.s.c.l.f(lVar, "block");
        TextView textView = (TextView) findViewById(C0838R.id.title_textview);
        this.a = textView;
        if (textView != null) {
            StringBuilder M = e.a.a.a.a.M("发现新版本 ");
            M.append(versionCheckResponse.m());
            textView.setText(M.toString());
        }
        TextView textView2 = (TextView) findViewById(C0838R.id.content_textview);
        this.b = textView2;
        if (textView2 != null) {
            textView2.setText(versionCheckResponse.i());
        }
        OButton oButton = (OButton) findViewById(C0838R.id.upgrade_btn);
        this.f2461c = oButton;
        if (oButton != null) {
            oButton.setText("升级");
            oButton.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kotlin.s.b.l lVar2 = kotlin.s.b.l.this;
                    int i = AppUpgradeTipsUI.f2460e;
                    kotlin.s.c.l.f(lVar2, "$block");
                    lVar2.invoke(UserOperation.CONFIRM_UPGRADE);
                }
            });
        }
        OButton oButton2 = (OButton) findViewById(C0838R.id.ignore_version);
        this.f2462d = oButton2;
        if (oButton2 != null) {
            oButton2.setText("忽略");
            oButton2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.input.keyboard.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    kotlin.s.b.l lVar2 = kotlin.s.b.l.this;
                    int i = AppUpgradeTipsUI.f2460e;
                    kotlin.s.c.l.f(lVar2, "$block");
                    lVar2.invoke(UserOperation.DISMISS_DIALOG);
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
