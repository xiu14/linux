package com.obric.oui.segmentedtab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.doubaoime.C0838R;
import kotlin.s.c.l;
import kotlin.w.h;

/* loaded from: classes2.dex */
public final class OSegmentTabView extends OTouchAnimView {
    private static int k;

    /* renamed from: d, reason: collision with root package name */
    private final String f7973d;

    /* renamed from: e, reason: collision with root package name */
    private int f7974e;

    /* renamed from: f, reason: collision with root package name */
    private int f7975f;

    /* renamed from: g, reason: collision with root package name */
    private int f7976g;
    private TextView h;
    private ImageView i;
    private boolean j;

    public OSegmentTabView(Context context) {
        this(context, null, 0);
    }

    @Override // com.obric.oui.segmentedtab.OTouchAnimView
    public boolean c() {
        return !this.j;
    }

    @Override // com.obric.oui.segmentedtab.OTouchAnimView
    public void f(float f2, String str) {
        int i;
        l.f(str, "scene");
        e.i.b.f.e.b.a(this.f7973d, "onTouchAnimUpdate, scene: " + str + ", animFraction: " + f2);
        int hashCode = str.hashCode();
        if (hashCode != -1965932727) {
            if (hashCode == 1870923917 && str.equals("press_anim")) {
                i = this.f7975f;
            }
            i = 0;
        } else {
            if (str.equals("release_anim")) {
                i = this.f7974e;
            }
            i = 0;
        }
        if (i != 0) {
            int i2 = (i >> 24) & 255;
            int f3 = h.f((int) ((1 - (f2 * 0.5f)) * i2), 0, 255);
            int i3 = (i & 255) | (((i >> 16) & 255) << 16) | (f3 << 24) | (((i >> 8) & 255) << 8);
            TextView textView = this.h;
            if (textView == null) {
                l.l("tabTitle");
                throw null;
            }
            textView.setTextColor(i3);
            e.i.b.f.e.b.a(this.f7973d, "updateTextColorOnPress, scene: " + str + ", fraction: " + f2 + ", newTextAlpha: " + f3 + ", originTextAlpha: " + i2);
        }
        int f4 = h.f((int) ((1 - (0.5f * f2)) * this.f7976g), 0, 255);
        ImageView imageView = this.i;
        if (imageView == null) {
            l.l("iconView");
            throw null;
        }
        imageView.setImageAlpha(f4);
        e.i.b.f.e.b.a(this.f7973d, "updateIconAlphaOnPress, scene: " + str + ", fraction: " + f2 + ", alpha: " + f4 + ", originIconAlpha: " + this.f7976g);
    }

    public final void g() {
        View findViewById = findViewById(C0838R.id.tv_tab_title);
        l.e(findViewById, "findViewById(R.id.tv_tab_title)");
        this.h = (TextView) findViewById;
        View findViewById2 = findViewById(C0838R.id.tv_tab_icon);
        l.e(findViewById2, "findViewById(R.id.tv_tab_icon)");
        this.i = (ImageView) findViewById2;
    }

    public final void h(boolean z) {
        e.i.b.f.e.b.a(this.f7973d, "updateSelectState, isSelected: " + z);
        this.j = z;
        if (!z) {
            d();
            TextView textView = this.h;
            if (textView == null) {
                l.l("tabTitle");
                throw null;
            }
            textView.setTextColor(this.f7975f);
        } else if (!e()) {
            TextView textView2 = this.h;
            if (textView2 == null) {
                l.l("tabTitle");
                throw null;
            }
            textView2.setTextColor(this.f7974e);
        }
        if (!z) {
            d();
            ImageView imageView = this.i;
            if (imageView != null) {
                imageView.setImageAlpha(this.f7976g);
                return;
            } else {
                l.l("iconView");
                throw null;
            }
        }
        if (e()) {
            return;
        }
        ImageView imageView2 = this.i;
        if (imageView2 != null) {
            imageView2.setImageAlpha(this.f7976g);
        } else {
            l.l("iconView");
            throw null;
        }
    }

    public final void setOriginIconAlpha(int i) {
        this.f7976g = i;
    }

    public final void setOriginTextColor(int i, int i2) {
        this.f7974e = i;
        this.f7975f = i2;
    }

    public OSegmentTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSegmentTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        StringBuilder M = e.a.a.a.a.M("OSegmentTabView_");
        int i2 = k;
        k = i2 + 1;
        M.append(i2);
        this.f7973d = M.toString();
    }
}
