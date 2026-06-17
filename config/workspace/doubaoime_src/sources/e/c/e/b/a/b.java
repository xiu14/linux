package e.c.e.b.a;

import android.content.Context;
import com.facebook.drawee.view.SimpleDraweeView;
import e.c.h.g.j;
import e.c.h.g.l;
import e.c.h.g.m;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public class b {
    private static com.facebook.common.util.b<f> a = new a();
    private static com.facebook.drawee.controller.g b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f9767c = false;

    static class a extends com.facebook.common.util.b<f> {
        a() {
        }

        @Override // com.facebook.common.util.b
        protected f b() {
            if (b.b != null) {
                return (f) ((c) b.b).a();
            }
            return null;
        }
    }

    private b() {
    }

    public static boolean b() {
        return f9767c;
    }

    public static void c(Context context, j jVar) {
        e.c.h.m.b.b();
        if (f9767c) {
            e.c.c.e.a.e(b.class, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f9767c = true;
        }
        m.b(true);
        if (!com.facebook.soloader.r.a.b()) {
            e.c.h.m.b.b();
            try {
                try {
                    try {
                        try {
                            try {
                                try {
                                    Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
                                } catch (IllegalStateException e2) {
                                    e2.printStackTrace();
                                }
                            } catch (IllegalStateException e3) {
                                e3.printStackTrace();
                            }
                        } catch (IllegalStateException e4) {
                            e4.printStackTrace();
                        }
                    } catch (IllegalStateException e5) {
                        e5.printStackTrace();
                    }
                } finally {
                    e.c.h.m.b.b();
                }
            } catch (ClassNotFoundException unused) {
                com.facebook.soloader.r.a.a(new com.facebook.soloader.r.c());
            } catch (IllegalAccessException unused2) {
                com.facebook.soloader.r.a.a(new com.facebook.soloader.r.c());
            } catch (NoSuchMethodException unused3) {
                com.facebook.soloader.r.a.a(new com.facebook.soloader.r.c());
            } catch (InvocationTargetException unused4) {
                com.facebook.soloader.r.a.a(new com.facebook.soloader.r.c());
            }
            e.c.h.m.b.b();
        }
        Context applicationContext = context.getApplicationContext();
        l.q(jVar);
        e.c.h.m.b.b();
        c cVar = new c(applicationContext);
        b = cVar;
        SimpleDraweeView.s(cVar);
        e.c.h.m.b.b();
    }

    public static e d() {
        return a.a().get();
    }
}
