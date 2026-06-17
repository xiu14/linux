package com.facebook.imageutils;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class c {
    private static volatile Class a;
    private static Class b;

    /* renamed from: c, reason: collision with root package name */
    private static e.c.g.d f6688c;

    /* renamed from: d, reason: collision with root package name */
    private static e.c.g.d f6689d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f6690e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f6691f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6692g = 0;

    static {
        try {
            b = Class.forName("com.bytedance.fresco.heif.HeifDecoder");
        } catch (ClassNotFoundException e2) {
            e.c.c.e.a.j("HeifFormatUtil", "Heif init ", e2);
        }
    }

    private static synchronized Class a() {
        Class cls;
        synchronized (c.class) {
            if (a == null) {
                try {
                    a = Class.forName("com.bytedance.fresco.nativeheif.Heif");
                } catch (ClassNotFoundException e2) {
                    e.c.c.e.a.j("HeifFormatUtil", "Heif init ", e2);
                }
            }
            cls = a;
        }
        return cls;
    }

    @Nullable
    public static e.c.g.d b() {
        e.c.g.d dVar = f6688c;
        if (dVar != null) {
            return dVar;
        }
        Class cls = b;
        if (cls == null) {
            return null;
        }
        try {
            f6688c = (e.c.g.d) cls.getDeclaredField("HEIF_FORMAT").get(null);
        } catch (IllegalAccessException e2) {
            e.c.c.e.a.j("HeifFormatUtil", "HeifFormat init ", e2);
        } catch (NoSuchFieldException e3) {
            e.c.c.e.a.j("HeifFormatUtil", "HeifFormat init ", e3);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return f6688c;
    }

    public static e.c.g.d c() {
        e.c.g.d dVar = f6689d;
        if (dVar != null) {
            return dVar;
        }
        Class cls = b;
        if (cls == null) {
            return null;
        }
        try {
            f6689d = (e.c.g.d) cls.getDeclaredField("HEIF_FORMAT_ANIMATED").get(null);
        } catch (IllegalAccessException e2) {
            e.c.c.e.a.j("HeifFormatUtil", "HEIF_FORMAT_ANIMATED init ", e2);
        } catch (NoSuchFieldException e3) {
            e.c.c.e.a.j("HeifFormatUtil", "HEIF_FORMAT_ANIMATED init ", e3);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        return f6689d;
    }

    public static int[] d(InputStream inputStream) throws IOException {
        Class a2;
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        inputStream.reset();
        if (inputStream.read(bArr, 0, available) == -1 || (a2 = a()) == null) {
            return null;
        }
        try {
            if (f6690e == null) {
                f6690e = a2.getDeclaredMethod("parseSimpleMeta", byte[].class, Integer.TYPE);
            }
            Method method = f6690e;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return (int[]) f6690e.invoke(null, bArr, Integer.valueOf(available));
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static int[] e(InputStream inputStream) throws IOException {
        Class a2;
        if (inputStream == null) {
            return null;
        }
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        inputStream.reset();
        if (inputStream.read(bArr, 0, available) == -1 || (a2 = a()) == null) {
            return null;
        }
        try {
            if (f6691f == null) {
                f6691f = a2.getDeclaredMethod("parseThumbMeta", byte[].class, Integer.TYPE);
            }
            Method method = f6691f;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return (int[]) f6691f.invoke(null, bArr, Integer.valueOf(available));
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return null;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
