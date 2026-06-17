package com.obric.oui.banner;

/* loaded from: classes2.dex */
public enum BannerStyle {
    FILL(0),
    INDENT(1),
    TRIPTYCH(2);

    private final int style;

    BannerStyle(int i) {
        this.style = i;
    }

    public final int getStyle() {
        return this.style;
    }
}
