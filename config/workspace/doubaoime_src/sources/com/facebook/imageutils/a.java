package com.facebook.imageutils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a {
    private static Class a;
    private static e.c.g.d b;

    /* renamed from: c, reason: collision with root package name */
    private static e.c.g.d f6686c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f6687d;

    static {
        try {
            a = Class.forName("com.bytedance.fresco.avif.AvifDecoder");
        } catch (Throwable unused) {
            e.c.c.e.a.i("AvifFormatUtil", "No AvifDecoder class");
        }
    }

    public static e.c.g.d a() {
        e.c.g.d dVar = b;
        if (dVar != null) {
            return dVar;
        }
        Class cls = a;
        if (cls == null) {
            return e.c.g.d.b;
        }
        try {
            b = (e.c.g.d) cls.getDeclaredField("AVIF_FORMAT").get(null);
        } catch (IllegalAccessException unused) {
            e.c.c.e.a.i("AvifFormatUtil", "IllegalAccessException happened when invoke getAvifFormat");
        } catch (NoSuchFieldException unused2) {
            e.c.c.e.a.i("AvifFormatUtil", "No AVIF_FORMAT field In AvifDecoder");
        } catch (Throwable unused3) {
            e.c.c.e.a.i("AvifFormatUtil", "Exception happened when invoke getAvifFormat");
        }
        return b;
    }

    public static e.c.g.d b() {
        e.c.g.d dVar = f6686c;
        if (dVar != null) {
            return dVar;
        }
        Class cls = a;
        if (cls == null) {
            return e.c.g.d.b;
        }
        try {
            f6686c = (e.c.g.d) cls.getDeclaredField("AVIF_FORMAT_ANIMATED").get(null);
        } catch (IllegalAccessException unused) {
            e.c.c.e.a.i("AvifFormatUtil", "IllegalAccessException happened when invoke getAvifFormatAnimated");
        } catch (NoSuchFieldException unused2) {
            e.c.c.e.a.i("AvifFormatUtil", "No AVIF_FORMAT_ANIMATED field In AvifDecoder");
        } catch (Throwable unused3) {
            e.c.c.e.a.i("AvifFormatUtil", "Exception happened when invoke getAvifFormatAnimated");
        }
        return f6686c;
    }

    public static int[] c(InputStream inputStream) throws IOException {
        Class cls;
        int available = inputStream.available();
        byte[] bArr = new byte[available];
        inputStream.reset();
        if (inputStream.read(bArr, 0, available) == -1 || (cls = a) == null) {
            return null;
        }
        try {
            if (f6687d == null) {
                f6687d = cls.getDeclaredMethod("parseSimpleMeta", byte[].class, Integer.TYPE);
            }
            Method method = f6687d;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return (int[]) f6687d.invoke(null, bArr, Integer.valueOf(available));
        } catch (IllegalAccessException unused) {
            e.c.c.e.a.i("AvifFormatUtil", "IllegalAccessException happened when invoke parseSimpleMeta");
            return null;
        } catch (NoSuchMethodException unused2) {
            e.c.c.e.a.i("AvifFormatUtil", "No parseSimpleMeta method AvifDecoder");
            return null;
        } catch (InvocationTargetException unused3) {
            e.c.c.e.a.i("AvifFormatUtil", "InvocationTargetException happened when invoke parseSimpleMeta");
            return null;
        } catch (Throwable unused4) {
            e.c.c.e.a.i("AvifFormatUtil", "Exception happened when invoke parseSimpleMeta");
            return null;
        }
    }
}
