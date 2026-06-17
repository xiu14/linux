package org.apache.http.conn.ssl;

import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes2.dex */
public class d {
    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int b(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static long d(long j, long j2) {
        return j >= 0 ? j / j2 : ((j + 1) / j2) - 1;
    }

    public static int e(int i, int i2) {
        return ((i % i2) + i2) % i2;
    }

    public static int f(long j, int i) {
        long j2 = i;
        return (int) (((j % j2) + j2) % j2);
    }

    public static long g(long j, long j2) {
        return ((j % j2) + j2) % j2;
    }

    public static List h(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Class cls2 : h(interfaces[i])) {
                    if (!arrayList.contains(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    public static int i(int i, Object obj) {
        return (i * 37) + (obj != null ? obj.hashCode() : 0);
    }

    public static <T> T j(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(e.a.a.a.a.s(str, " may not be null"));
    }

    public static <T> T k(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(e.a.a.a.a.s(str, " must not be null"));
    }

    public static int l(int i, int i2) {
        int i3 = i + i2;
        if ((i ^ i3) >= 0 || (i ^ i2) < 0) {
            return i3;
        }
        throw new ArithmeticException(e.a.a.a.a.l("Addition overflows an int: ", i, " + ", i2));
    }

    public static long m(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder Q = e.a.a.a.a.Q("Addition overflows a long: ", j, " + ");
        Q.append(j2);
        throw new ArithmeticException(Q.toString());
    }

    public static long n(long j, int i) {
        if (i == -1) {
            if (j != Long.MIN_VALUE) {
                return -j;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
        }
        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return j;
        }
        long j2 = i;
        long j3 = j * j2;
        if (j3 / j2 == j) {
            return j3;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j + " * " + i);
    }

    public static long o(long j, long j2) {
        if (j2 == 1) {
            return j;
        }
        if (j == 1) {
            return j2;
        }
        if (j == 0 || j2 == 0) {
            return 0L;
        }
        long j3 = j * j2;
        if (j3 / j2 == j && ((j != Long.MIN_VALUE || j2 != -1) && (j2 != Long.MIN_VALUE || j != -1))) {
            return j3;
        }
        StringBuilder Q = e.a.a.a.a.Q("Multiplication overflows a long: ", j, " * ");
        Q.append(j2);
        throw new ArithmeticException(Q.toString());
    }

    public static long p(long j, long j2) {
        long j3 = j - j2;
        if ((j ^ j3) >= 0 || (j ^ j2) >= 0) {
            return j3;
        }
        StringBuilder Q = e.a.a.a.a.Q("Subtraction overflows a long: ", j, " - ");
        Q.append(j2);
        throw new ArithmeticException(Q.toString());
    }

    public static int q(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new ArithmeticException(e.a.a.a.a.n("Calculation overflows an int: ", j));
        }
        return (int) j;
    }
}
