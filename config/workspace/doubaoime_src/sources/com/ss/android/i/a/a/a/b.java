package com.ss.android.i.a.a.a;

/* loaded from: classes2.dex */
public final class b {
    private static final Double a = Double.valueOf(0.0d);
    private static final Float b = Float.valueOf(0.0f);

    public static <T> T a(Class<T> cls) {
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) b;
        }
        if (cls == Double.TYPE) {
            return (T) a;
        }
        return null;
    }
}
