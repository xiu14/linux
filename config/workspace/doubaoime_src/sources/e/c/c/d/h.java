package e.c.c.d;

import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;
import java.util.Objects;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: classes2.dex */
public final class h {

    public static final class b {
        private final String a;
        private final a b;

        /* renamed from: c, reason: collision with root package name */
        private a f9752c;

        private static final class a {
            String a;
            Object b;

            /* renamed from: c, reason: collision with root package name */
            a f9753c;

            a(a aVar) {
            }
        }

        b(String str, a aVar) {
            a aVar2 = new a(null);
            this.b = aVar2;
            this.f9752c = aVar2;
            this.a = str;
        }

        private b d(String str, Object obj) {
            a aVar = new a(null);
            this.f9752c.f9753c = aVar;
            this.f9752c = aVar;
            aVar.b = obj;
            Objects.requireNonNull(str);
            aVar.a = str;
            return this;
        }

        public b a(String str, int i) {
            d(str, String.valueOf(i));
            return this;
        }

        public b b(String str, Object obj) {
            d(str, obj);
            return this;
        }

        public b c(String str, boolean z) {
            d(str, String.valueOf(z));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            a aVar = this.b.f9753c;
            String str = "";
            while (aVar != null) {
                Object obj = aVar.b;
                sb.append(str);
                String str2 = aVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                }
                aVar = aVar.f9753c;
                str = ", ";
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(i(str, objArr));
        }
    }

    public static int d(int i, int i2) {
        String i3;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            i3 = i("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(e.a.a.a.a.j("negative size: ", i2));
            }
            i3 = i("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(i3);
    }

    public static <T> T e(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static String i(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf("%s", i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void j(Throwable th) {
        if (Error.class.isInstance(th)) {
            throw ((Throwable) Error.class.cast(th));
        }
        if (RuntimeException.class.isInstance(th)) {
            throw ((Throwable) RuntimeException.class.cast(th));
        }
    }

    public static b k(Object obj) {
        return new b(obj.getClass().getSimpleName(), null);
    }
}
