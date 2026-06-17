package okhttp3.F;

import androidx.core.location.LocationRequestCompat;
import com.xiaomi.mipush.sdk.Constants;
import f.e;
import f.g;
import f.h;
import f.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.s.c.l;
import okhttp3.A;
import okhttp3.D;
import okhttp3.s;
import okhttp3.t;

/* loaded from: classes2.dex */
public final class c {
    public static final byte[] a;
    public static final String[] b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final D f10498c;

    /* renamed from: d, reason: collision with root package name */
    private static final h f10499d;

    /* renamed from: e, reason: collision with root package name */
    private static final h f10500e;

    /* renamed from: f, reason: collision with root package name */
    private static final h f10501f;

    /* renamed from: g, reason: collision with root package name */
    private static final h f10502g;
    private static final h h;
    public static final Charset i;
    public static final Charset j;
    private static final Charset k;
    private static final Charset l;
    private static final Charset m;
    private static final Charset n;
    public static final TimeZone o;
    public static final Comparator<String> p;
    private static final Method q;
    private static final Pattern r;

    static class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    static class b implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ boolean b;

        b(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.a);
            thread.setDaemon(this.b);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        a = bArr;
        Method method = null;
        f10498c = D.l(null, bArr);
        A.d(null, bArr);
        h hVar = h.f10045d;
        l.g("efbbbf", "$receiver");
        f10499d = f.B.a.a("efbbbf");
        l.g("feff", "$receiver");
        f10500e = f.B.a.a("feff");
        l.g("fffe", "$receiver");
        f10501f = f.B.a.a("fffe");
        l.g("0000ffff", "$receiver");
        f10502g = f.B.a.a("0000ffff");
        l.g("ffff0000", "$receiver");
        h = f.B.a.a("ffff0000");
        i = Charset.forName("UTF-8");
        j = Charset.forName("ISO-8859-1");
        k = Charset.forName("UTF-16BE");
        l = Charset.forName("UTF-16LE");
        m = Charset.forName("UTF-32BE");
        n = Charset.forName("UTF-32LE");
        o = TimeZone.getTimeZone("GMT");
        p = new a();
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        q = method;
        r = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private c() {
    }

    public static s A(List<okhttp3.internal.http2.b> list) {
        s.a aVar = new s.a();
        for (okhttp3.internal.http2.b bVar : list) {
            okhttp3.F.a.a.b(aVar, bVar.a.t(), bVar.b.t());
        }
        return aVar.c();
    }

    public static String B(String str, int i2, int i3) {
        int x = x(str, i2, i3);
        return str.substring(x, y(str, x, i3));
    }

    public static boolean C(String str) {
        try {
            return r.matcher(str).matches();
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    public static void a(Throwable th, Throwable th2) {
        Method method = q;
        if (method != null) {
            try {
                method.invoke(th, th2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public static AssertionError b(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    public static Charset c(g gVar, Charset charset) throws IOException {
        if (gVar.K(0L, f10499d)) {
            gVar.skip(r0.f());
            return i;
        }
        if (gVar.K(0L, f10500e)) {
            gVar.skip(r0.f());
            return k;
        }
        if (gVar.K(0L, f10501f)) {
            gVar.skip(r0.f());
            return l;
        }
        if (gVar.K(0L, f10502g)) {
            gVar.skip(r0.f());
            return m;
        }
        if (!gVar.K(0L, h)) {
            return charset;
        }
        gVar.skip(r0.f());
        return n;
    }

    public static String d(String str) {
        int i2 = -1;
        int i3 = 0;
        if (!str.contains(Constants.COLON_SEPARATOR)) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                for (int i4 = 0; i4 < lowerCase.length(); i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (charAt > 31 && charAt < 127 && " #%/:?@[\\]".indexOf(charAt) == -1) {
                    }
                    i3 = 1;
                }
                if (i3 != 0) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress j2 = (str.startsWith("[") && str.endsWith("]")) ? j(str, 1, str.length() - 1) : j(str, 0, str.length());
        if (j2 == null) {
            return null;
        }
        byte[] address = j2.getAddress();
        if (address.length != 16) {
            throw new AssertionError(e.a.a.a.a.t("Invalid IPv6 address: '", str, "'"));
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        e eVar = new e();
        while (i3 < address.length) {
            if (i3 == i2) {
                eVar.U(58);
                i3 += i6;
                if (i3 == 16) {
                    eVar.U(58);
                }
            } else {
                if (i3 > 0) {
                    eVar.U(58);
                }
                eVar.R(((address[i3] & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return eVar.A();
    }

    public static int e(String str, long j2, TimeUnit timeUnit) {
        if (j2 < 0) {
            throw new IllegalArgumentException(e.a.a.a.a.s(str, " < 0"));
        }
        Objects.requireNonNull(timeUnit, "unit == null");
        long millis = timeUnit.toMillis(j2);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(e.a.a.a.a.s(str, " too large."));
        }
        if (millis != 0 || j2 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(e.a.a.a.a.s(str, " too small."));
    }

    public static void f(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static void h(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e2) {
                if (!u(e2)) {
                    throw e2;
                }
            } catch (RuntimeException e3) {
                if (!"bio == null".equals(e3.getMessage())) {
                    throw e3;
                }
            } catch (Exception unused) {
            }
        }
    }

    public static int i(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                return -1;
            }
        }
        return (c2 - c3) + 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (r7 == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00de, code lost:
    
        if (r8 != (-1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e1, code lost:
    
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f3, code lost:
    
        return java.net.InetAddress.getByAddress(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f9, code lost:
    
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x005d, code lost:
    
        r14 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.net.InetAddress j(java.lang.String r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.F.c.j(java.lang.String, int, int):java.net.InetAddress");
    }

    public static int k(String str, int i2, int i3, char c2) {
        while (i2 < i3) {
            if (str.charAt(i2) == c2) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int l(String str, int i2, int i3, String str2) {
        while (i2 < i3) {
            if (str2.indexOf(str.charAt(i2)) != -1) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean m(z zVar, int i2, TimeUnit timeUnit) {
        try {
            return w(zVar, i2, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean n(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String o(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static String p(t tVar, boolean z) {
        String k2;
        if (tVar.k().contains(Constants.COLON_SEPARATOR)) {
            StringBuilder M = e.a.a.a.a.M("[");
            M.append(tVar.k());
            M.append("]");
            k2 = M.toString();
        } else {
            k2 = tVar.k();
        }
        if (!z && tVar.t() == t.d(tVar.y())) {
            return k2;
        }
        StringBuilder S = e.a.a.a.a.S(k2, Constants.COLON_SEPARATOR);
        S.append(tVar.t());
        return S.toString();
    }

    public static <T> List<T> q(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> r(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static int s(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt <= 31 || charAt >= 127) {
                return i2;
            }
        }
        return -1;
    }

    public static String[] t(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i2++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean u(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean v(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean w(z zVar, int i2, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c2 = zVar.c().e() ? zVar.c().c() - nanoTime : Long.MAX_VALUE;
        zVar.c().d(Math.min(c2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            e eVar = new e();
            while (zVar.b0(eVar, 8192L) != -1) {
                eVar.a();
            }
            if (c2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                zVar.c().a();
            } else {
                zVar.c().d(nanoTime + c2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                zVar.c().a();
            } else {
                zVar.c().d(nanoTime + c2);
            }
            return false;
        } catch (Throwable th) {
            if (c2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                zVar.c().a();
            } else {
                zVar.c().d(nanoTime + c2);
            }
            throw th;
        }
    }

    public static int x(String str, int i2, int i3) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int y(String str, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            char charAt = str.charAt(i4);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i4 + 1;
            }
        }
        return i2;
    }

    public static ThreadFactory z(String str, boolean z) {
        return new b(str, z);
    }
}
