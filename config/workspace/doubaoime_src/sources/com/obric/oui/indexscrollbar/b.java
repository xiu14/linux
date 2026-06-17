package com.obric.oui.indexscrollbar;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    private static b f7814d = b("#");

    /* renamed from: e, reason: collision with root package name */
    public static final b f7815e = null;
    private final int a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap[] f7816c;

    public b(int i, String str, Bitmap[] bitmapArr, kotlin.s.c.g gVar) {
        this.a = i;
        this.b = str;
        this.f7816c = bitmapArr;
        if (i == 2) {
            if (!((bitmapArr != null ? bitmapArr.length : 0) == 3)) {
                throw new IllegalStateException("symbol must have 3 bitmaps!".toString());
            }
            this.f7816c = bitmapArr;
        }
    }

    public static final b b(String str) {
        kotlin.s.c.l.f(str, "letter");
        return new b(0, str, null, null);
    }

    public final String c() {
        return this.b;
    }

    public final Bitmap[] d() {
        return this.f7816c;
    }

    public final int e() {
        return this.a;
    }
}
