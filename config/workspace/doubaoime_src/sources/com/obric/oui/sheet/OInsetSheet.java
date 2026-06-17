package com.obric.oui.sheet;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import com.bytedance.android.doubaoime.C0838R;
import com.obric.oui.dialog.alert.view.RadiusLayout;
import kotlin.s.c.g;
import kotlin.s.c.l;

@RequiresApi(30)
/* loaded from: classes2.dex */
public class OInsetSheet extends Dialog {

    /* renamed from: g, reason: collision with root package name */
    public static final a f8009g = new a(null);
    public FrameLayout a;
    public FrameLayout b;

    /* renamed from: c, reason: collision with root package name */
    public FrameLayout f8010c;

    /* renamed from: d, reason: collision with root package name */
    public RadiusLayout f8011d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8012e;

    /* renamed from: f, reason: collision with root package name */
    private PanelWidth f8013f;

    public enum PanelWidth {
        NARROW_WIDTH,
        BOARD_WIDTH
    }

    public static final class a {
        public a(g gVar) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OInsetSheet(Context context) {
        super(context);
        l.f(context, "context");
        this.f8013f = PanelWidth.BOARD_WIDTH;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        setContentView(C0838R.layout.o_inset_sheet_container);
        View findViewById = findViewById(C0838R.id.root_constraint);
        l.e(findViewById, "findViewById(R.id.root_constraint)");
        RadiusLayout radiusLayout = (RadiusLayout) findViewById;
        this.f8011d = radiusLayout;
        radiusLayout.setMeasureHeightUnspecified(true);
        View findViewById2 = findViewById(C0838R.id.header_container);
        l.e(findViewById2, "findViewById(R.id.header_container)");
        this.a = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(C0838R.id.content_container);
        l.e(findViewById3, "findViewById(R.id.content_container)");
        this.f8010c = (FrameLayout) findViewById3;
        View findViewById4 = findViewById(C0838R.id.foot_container);
        l.e(findViewById4, "findViewById(R.id.foot_container)");
        this.b = (FrameLayout) findViewById4;
        RadiusLayout radiusLayout2 = this.f8011d;
        if (radiusLayout2 != null) {
            radiusLayout2.setOnApplyWindowInsetsListener(new c(this));
        } else {
            l.l("rootContainer");
            throw null;
        }
    }

    public static final boolean a(OInsetSheet oInsetSheet) {
        return !oInsetSheet.f8012e;
    }

    public final RadiusLayout b() {
        RadiusLayout radiusLayout = this.f8011d;
        if (radiusLayout != null) {
            return radiusLayout;
        }
        l.l("rootContainer");
        throw null;
    }

    public final PanelWidth c() {
        return this.f8013f;
    }

    public final void d() {
        try {
            super.dismiss();
        } catch (Exception e2) {
            Log.e("OAlertDialog", "origin Dismiss exception!", e2);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        RadiusLayout radiusLayout = this.f8011d;
        if (radiusLayout == null) {
            l.l("rootContainer");
            throw null;
        }
        ObjectAnimator b = e.i.b.b.c.a.b(radiusLayout, getWindow(), !this.f8012e);
        b.addListener(new b(this));
        b.start();
    }

    public final void e(ViewGroup viewGroup, View view) {
        if (view == null) {
            if (viewGroup != null) {
                com.obric.oui.common.util.b.f(viewGroup);
                return;
            }
            return;
        }
        if (viewGroup != null) {
            com.obric.oui.common.util.b.g(viewGroup);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    public final void f(boolean z) {
        this.f8012e = z;
    }

    public final void g(PanelWidth panelWidth) {
        int e0;
        int e02;
        l.f(panelWidth, "width");
        this.f8013f = panelWidth;
        int ordinal = panelWidth.ordinal();
        boolean z = false;
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            Context context = getContext();
            l.e(context, "context");
            Resources resources = context.getResources();
            l.e(resources, "context.resources");
            int i = resources.getDisplayMetrics().widthPixels;
            Context context2 = getContext();
            l.e(context2, "context");
            l.f(context2, "context");
            try {
                Resources resources2 = context2.getResources();
                l.e(resources2, "context.resources");
                if (resources2.getConfiguration().orientation == 2) {
                    z = true;
                }
            } catch (Exception e2) {
                e.i.b.f.e.b.c("ResourceUtils", "isLandscape error", e2);
            }
            if (z && i > (e02 = e.a.a.a.a.e0("Resources.getSystem()", 1, 440))) {
                i = e02;
            }
            RadiusLayout radiusLayout = this.f8011d;
            if (radiusLayout == null) {
                l.l("rootContainer");
                throw null;
            }
            e.i.a.b.a.i(radiusLayout, i);
            Context context3 = getContext();
            l.e(context3, "context");
            float dimension = context3.getResources().getDimension(C0838R.dimen.oui_r_l3);
            RadiusLayout radiusLayout2 = this.f8011d;
            if (radiusLayout2 != null) {
                radiusLayout2.setRadius(dimension, dimension, 0.0f, 0.0f);
                return;
            } else {
                l.l("rootContainer");
                throw null;
            }
        }
        Context context4 = getContext();
        l.e(context4, "context");
        Resources resources3 = context4.getResources();
        l.e(resources3, "context.resources");
        int i2 = resources3.getDisplayMetrics().widthPixels;
        Context context5 = getContext();
        l.e(context5, "context");
        int dimensionPixelSize = i2 - (context5.getResources().getDimensionPixelSize(C0838R.dimen.oui_dialog_narrow_layout_margin) * 2);
        Context context6 = getContext();
        l.e(context6, "context");
        l.f(context6, "context");
        try {
            Resources resources4 = context6.getResources();
            l.e(resources4, "context.resources");
            if (resources4.getConfiguration().orientation == 2) {
                z = true;
            }
        } catch (Exception e3) {
            e.i.b.f.e.b.c("ResourceUtils", "isLandscape error", e3);
        }
        if (z && dimensionPixelSize > (e0 = e.a.a.a.a.e0("Resources.getSystem()", 1, 440))) {
            dimensionPixelSize = e0;
        }
        RadiusLayout radiusLayout3 = this.f8011d;
        if (radiusLayout3 == null) {
            l.l("rootContainer");
            throw null;
        }
        e.i.a.b.a.i(radiusLayout3, dimensionPixelSize);
        RadiusLayout radiusLayout4 = this.f8011d;
        if (radiusLayout4 == null) {
            l.l("rootContainer");
            throw null;
        }
        Context context7 = getContext();
        l.e(context7, "context");
        radiusLayout4.setRadius(context7.getResources().getDimension(C0838R.dimen.oui_r_l2));
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        RadiusLayout radiusLayout = this.f8011d;
        if (radiusLayout != null) {
            radiusLayout.post(new com.obric.oui.sheet.a(this));
        } else {
            l.l("rootContainer");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0033 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Dialog
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void show() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obric.oui.sheet.OInsetSheet.show():void");
    }
}
