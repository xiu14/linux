package com.obric.oui.dialog.alert;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.button.OButton;
import com.obric.oui.dialog.base.AbstractDialog;
import com.obric.oui.text.OTextView;
import java.util.Objects;
import kotlin.s.c.l;

@RequiresApi(30)
/* loaded from: classes2.dex */
public class b extends AbstractDialog {
    private final String m;
    private FrameLayout n;
    private g o;
    private TextView p;
    private TextView q;
    private FrameLayout r;
    private g s;
    private FrameLayout t;
    private g u;
    private boolean v;

    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Layout layout;
            TextView textView = b.this.q;
            if (textView != null && (layout = textView.getLayout()) != null) {
                layout.getLineCount();
            }
            TextView textView2 = b.this.q;
            if (textView2 != null) {
                textView2.getMaxLines();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, boolean z, boolean z2) {
        super(context, z, z2);
        l.f(context, "context");
        this.m = "OAlertDialog";
        this.v = true;
        this.n = (FrameLayout) findViewById(C0838R.id.iconPanel);
        TextView textView = (TextView) findViewById(C0838R.id.textTitle);
        if (textView != null) {
            OTextView oTextView = (OTextView) (!(textView instanceof OTextView) ? null : textView);
            if (oTextView != null) {
                oTextView.setEnableAutoAlignLeft(true);
            }
        } else {
            textView = null;
        }
        this.p = textView;
        TextView textView2 = (TextView) findViewById(C0838R.id.textSubTitle);
        OTextView oTextView2 = (OTextView) (textView2 instanceof OTextView ? textView2 : null);
        if (oTextView2 != null) {
            oTextView2.setEnableAutoAlignLeft(true);
        }
        this.q = textView2;
        this.r = (FrameLayout) findViewById(C0838R.id.button_container);
        this.t = (FrameLayout) findViewById(C0838R.id.body_container);
    }

    private final int m() {
        int i;
        FrameLayout frameLayout = this.r;
        if (frameLayout == null) {
            return 0;
        }
        l.c(frameLayout);
        frameLayout.measure(0, 0);
        FrameLayout frameLayout2 = this.r;
        l.c(frameLayout2);
        if (frameLayout2.getVisibility() == 0) {
            FrameLayout frameLayout3 = this.r;
            l.c(frameLayout3);
            i = frameLayout3.getMeasuredHeight();
        } else {
            i = 0;
        }
        FrameLayout frameLayout4 = this.r;
        l.c(frameLayout4);
        ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    private final int n() {
        int i;
        FrameLayout frameLayout = this.n;
        if (frameLayout == null) {
            return 0;
        }
        l.c(frameLayout);
        frameLayout.measure(0, 0);
        FrameLayout frameLayout2 = this.n;
        l.c(frameLayout2);
        if (frameLayout2.getVisibility() == 0) {
            FrameLayout frameLayout3 = this.n;
            l.c(frameLayout3);
            i = frameLayout3.getMeasuredHeight();
        } else {
            i = 0;
        }
        FrameLayout frameLayout4 = this.n;
        l.c(frameLayout4);
        ViewGroup.LayoutParams layoutParams = frameLayout4.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    private final int o() {
        int i;
        TextView textView = this.q;
        if (textView == null) {
            return 0;
        }
        l.c(textView);
        textView.measure(0, 0);
        TextView textView2 = this.q;
        l.c(textView2);
        if (textView2.getVisibility() == 0) {
            TextView textView3 = this.q;
            l.c(textView3);
            i = textView3.getMeasuredHeight();
        } else {
            i = 0;
        }
        TextView textView4 = this.q;
        l.c(textView4);
        ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    private final int q() {
        int i;
        TextView textView = this.p;
        if (textView == null) {
            return 0;
        }
        l.c(textView);
        textView.measure(0, 0);
        TextView textView2 = this.p;
        l.c(textView2);
        if (textView2.getVisibility() == 0) {
            TextView textView3 = this.p;
            l.c(textView3);
            i = textView3.getMeasuredHeight();
        } else {
            i = 0;
        }
        TextView textView4 = this.p;
        l.c(textView4);
        ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
        if (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return i + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
    }

    public static void x(b bVar, CharSequence charSequence, boolean z, int i, Object obj) {
        Objects.requireNonNull(bVar);
        l.f(charSequence, "message");
        TextView textView = bVar.q;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(charSequence);
        }
        TextView textView2 = bVar.q;
        if (textView2 != null) {
            textView2.setMaxLines(Integer.MAX_VALUE);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ObjectAnimator b = e.i.b.b.c.a.b(h(), getWindow(), true);
        b.addListener(new d(this));
        b.start();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        if (f()) {
            h().setAlpha(0.0f);
        }
        super.onCreate(bundle);
        g gVar = this.o;
        if (gVar != null) {
            gVar.b(this);
        }
        g gVar2 = this.s;
        if (gVar2 != null) {
            gVar2.b(this);
        }
        g gVar3 = this.u;
        if (gVar3 != null) {
            gVar3.b(this);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        h().post(new c(this));
        g gVar = this.s;
        if (gVar instanceof ButtonStyleController) {
            Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.obric.oui.dialog.alert.ButtonStyleController");
        }
        TextView textView = this.q;
        if (textView != null) {
            textView.postDelayed(new a(), 1000L);
        }
    }

    public final OButton p() {
        g gVar = this.s;
        if (gVar == null || !(gVar instanceof ButtonStyleController)) {
            return null;
        }
        Objects.requireNonNull(gVar, "null cannot be cast to non-null type com.obric.oui.dialog.alert.ButtonStyleController");
        return ((ButtonStyleController) gVar).e();
    }

    public final TextView r() {
        return this.p;
    }

    public final boolean s() {
        return this.v;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:13:0x003c, B:15:0x004c, B:16:0x0079, B:20:0x0084, B:21:0x0098, B:25:0x00c6, B:27:0x00e2, B:28:0x00f8, B:30:0x01a7, B:35:0x00e5, B:36:0x00ad, B:40:0x00be, B:42:0x00c2, B:43:0x00b8), top: B:12:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a7 A[Catch: Exception -> 0x01cf, TRY_LEAVE, TryCatch #0 {Exception -> 0x01cf, blocks: (B:13:0x003c, B:15:0x004c, B:16:0x0079, B:20:0x0084, B:21:0x0098, B:25:0x00c6, B:27:0x00e2, B:28:0x00f8, B:30:0x01a7, B:35:0x00e5, B:36:0x00ad, B:40:0x00be, B:42:0x00c2, B:43:0x00b8), top: B:12:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:13:0x003c, B:15:0x004c, B:16:0x0079, B:20:0x0084, B:21:0x0098, B:25:0x00c6, B:27:0x00e2, B:28:0x00f8, B:30:0x01a7, B:35:0x00e5, B:36:0x00ad, B:40:0x00be, B:42:0x00c2, B:43:0x00b8), top: B:12:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2 A[Catch: Exception -> 0x01cf, TryCatch #0 {Exception -> 0x01cf, blocks: (B:13:0x003c, B:15:0x004c, B:16:0x0079, B:20:0x0084, B:21:0x0098, B:25:0x00c6, B:27:0x00e2, B:28:0x00f8, B:30:0x01a7, B:35:0x00e5, B:36:0x00ad, B:40:0x00be, B:42:0x00c2, B:43:0x00b8), top: B:12:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @Override // com.obric.oui.dialog.base.AbstractDialog, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.dialog.alert.b.show():void");
    }

    public final void t() {
        try {
            super.dismiss();
        } catch (Exception e2) {
            Log.e("OAlertDialog", "origin Dismiss exception!", e2);
        }
    }

    public final void u(boolean z) {
        this.v = z;
    }

    public final void v(g gVar) {
        l.f(gVar, "controller");
        this.u = gVar;
        FrameLayout frameLayout = this.t;
        if (frameLayout != null) {
            if (g()) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                layoutParams.height = 0;
                frameLayout.setLayoutParams(layoutParams);
            }
            frameLayout.setVisibility(0);
            Context context = getContext();
            l.e(context, "context");
            gVar.a(context, frameLayout);
        }
    }

    public final void w(g gVar) {
        l.f(gVar, "controller");
        this.s = gVar;
        FrameLayout frameLayout = this.r;
        if (frameLayout != null) {
            Context context = getContext();
            l.e(context, "context");
            ((ButtonStyleController) gVar).a(context, frameLayout);
        }
    }

    public final void y(CharSequence charSequence) {
        l.f(charSequence, "title");
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            float f2 = 19;
            int e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, f2);
            Resources system = Resources.getSystem();
            l.e(system, "Resources.getSystem()");
            textView.setPadding(0, e0, 0, kotlin.t.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics())));
        }
    }

    public final void z(CharSequence charSequence) {
        l.f(charSequence, "title");
        TextView textView = this.p;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(charSequence);
            textView.setPadding(0, 0, 0, 0);
        }
    }
}
