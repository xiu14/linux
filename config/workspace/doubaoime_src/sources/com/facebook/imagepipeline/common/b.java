package com.facebook.imagepipeline.common;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public abstract class b {
    public static b a;
    private static b b;

    static class a extends b {
        a() {
        }

        @Override // com.facebook.imagepipeline.common.b
        public Bitmap.Config a(boolean z, e.c.g.d dVar) {
            return Bitmap.Config.ARGB_8888;
        }
    }

    static {
        a aVar = new a();
        a = aVar;
        b = aVar;
    }

    public static b b() {
        return b;
    }

    public abstract Bitmap.Config a(boolean z, e.c.g.d dVar);
}
