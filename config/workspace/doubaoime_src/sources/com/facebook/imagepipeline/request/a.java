package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import e.c.h.g.m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class a implements c {
    public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
    private static Method b;

    @Override // com.facebook.imagepipeline.request.c
    public e.c.c.g.a<Bitmap> b(Bitmap bitmap, e.c.h.d.b bVar) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == null) {
            config = a;
        }
        e.c.c.g.a<Bitmap> a2 = bVar.a(width, height, config);
        try {
            d(a2.r(), bitmap);
            e.c.c.g.a<Bitmap> h = e.c.c.g.a.h(a2);
            a2.close();
            return h;
        } catch (Throwable th) {
            int i = e.c.c.g.a.h;
            if (a2 != null) {
                a2.close();
            }
            throw th;
        }
    }

    @Override // com.facebook.imagepipeline.request.c
    public com.facebook.cache.common.b c() {
        return null;
    }

    public void d(Bitmap bitmap, Bitmap bitmap2) {
        if (!m.a() || bitmap.getConfig() != bitmap2.getConfig()) {
            new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            return;
        }
        try {
            if (b == null) {
                b = Class.forName("com.facebook.imagepipeline.nativecode.Bitmaps").getDeclaredMethod("copyBitmap", Bitmap.class, Bitmap.class);
            }
            b.invoke(null, bitmap, bitmap2);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Wrong Native code setup, reflection failed.", e5);
        }
    }

    @Override // com.facebook.imagepipeline.request.c
    public String getName() {
        return "Unknown postprocessor";
    }
}
