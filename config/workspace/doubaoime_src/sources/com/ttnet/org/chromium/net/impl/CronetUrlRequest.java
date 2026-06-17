package com.ttnet.org.chromium.net.impl;

import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.net.AbstractC0760h;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.impl.CronetLogger;
import com.ttnet.org.chromium.net.u;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

@VisibleForTesting
/* loaded from: classes2.dex */
public final class CronetUrlRequest extends H {
    private CronetUploadDataStream A;
    private J B;
    private int C;
    private AbstractC0760h D;
    private C0766f E;
    private boolean F;
    private boolean G;
    private String H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private int f8673J;
    private int K;
    private int L;
    private int M;
    private long N;
    private int O;
    private String P;
    private String Q;
    private long R;
    private long S;
    private int T;
    private long U;
    private long V;
    private long W;
    private long X;
    private long Y;
    private long Z;
    private final boolean a;
    private i a0;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8674c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8675d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8676e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f8677f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final CronetUrlRequestContext f8678g;
    private final Executor h;
    private final List<String> i;
    private final Q j;
    private final String k;
    private final int l;
    private final int m;
    private String n;
    private final HeadersList o;
    private final Collection<Object> p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final int t;
    private final boolean u;
    private final int v;
    private final O w;
    private final long x;
    private final int y;
    private final CronetLogger z;

    @VisibleForTesting
    static final class HeadersList extends ArrayList<Map.Entry<String, String>> {
        HeadersList() {
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.A.q();
            synchronized (CronetUrlRequest.this.f8677f) {
                if (CronetUrlRequest.this.R()) {
                    return;
                }
                CronetUrlRequest.this.A.m(CronetUrlRequest.this.b);
                CronetUrlRequest.J(CronetUrlRequest.this);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;

        b(CronetUrlRequest cronetUrlRequest, VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener) {
            this.a = versionSafeCallbacks$UrlRequestStatusListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.onStatus(-1);
        }
    }

    class c implements Runnable {
        final /* synthetic */ J a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8679c;

        c(J j, String str, String str2) {
            this.a = j;
            this.b = str;
            this.f8679c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.M();
            synchronized (CronetUrlRequest.this.f8677f) {
                if (CronetUrlRequest.this.R()) {
                    return;
                }
                CronetUrlRequest.this.f8675d = true;
                try {
                    CronetUrlRequest.this.j.d(CronetUrlRequest.this, this.a, this.b, this.f8679c);
                } catch (Exception e2) {
                    CronetUrlRequest.G(CronetUrlRequest.this, e2);
                }
            }
        }
    }

    class d implements Runnable {
        final /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.M();
            synchronized (CronetUrlRequest.this.f8677f) {
                if (CronetUrlRequest.this.R()) {
                    return;
                }
                CronetUrlRequest.this.f8676e = true;
                try {
                    Q q = CronetUrlRequest.this.j;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    q.e(cronetUrlRequest, cronetUrlRequest.B, this.a);
                } catch (Exception e2) {
                    CronetUrlRequest.G(CronetUrlRequest.this, e2);
                }
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (CronetUrlRequest.this.f8677f) {
                if (CronetUrlRequest.this.R()) {
                    return;
                }
                CronetUrlRequest.this.O(0);
                try {
                    Q q = CronetUrlRequest.this.j;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    q.f(cronetUrlRequest, cronetUrlRequest.B);
                    CronetUrlRequest.A(CronetUrlRequest.this);
                } catch (Exception e2) {
                    int i = CronetUrlRequestContext.Q;
                    com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception in onSucceeded method", e2);
                }
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Q q = CronetUrlRequest.this.j;
                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                q.a(cronetUrlRequest, cronetUrlRequest.B);
                CronetUrlRequest.A(CronetUrlRequest.this);
            } catch (Exception e2) {
                int i = CronetUrlRequestContext.Q;
                com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception in onCanceled method", e2);
            }
        }
    }

    class g implements Runnable {
        final /* synthetic */ VersionSafeCallbacks$UrlRequestStatusListener a;
        final /* synthetic */ int b;

        g(CronetUrlRequest cronetUrlRequest, VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i) {
            this.a = versionSafeCallbacks$UrlRequestStatusListener;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = this.a;
            switch (this.b) {
                case 0:
                    i = 0;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                default:
                    throw new IllegalArgumentException("No request status found.");
                case 6:
                    i = 5;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 7;
                    break;
                case 9:
                    i = 8;
                    break;
                case 10:
                    i = 9;
                    break;
                case 11:
                    i = 10;
                    break;
                case 12:
                    i = 11;
                    break;
                case 13:
                    i = 12;
                    break;
                case 14:
                    i = 13;
                    break;
                case 15:
                    i = 14;
                    break;
            }
            versionSafeCallbacks$UrlRequestStatusListener.onStatus(i);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Q q = CronetUrlRequest.this.j;
                CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                q.b(cronetUrlRequest, cronetUrlRequest.B, CronetUrlRequest.this.D);
                CronetUrlRequest.A(CronetUrlRequest.this);
            } catch (Exception e2) {
                int i = CronetUrlRequestContext.Q;
                com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception in onFailed method", e2);
            }
        }
    }

    private final class i implements Runnable {
        ByteBuffer a;

        i(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetUrlRequest.this.M();
            ByteBuffer byteBuffer = this.a;
            this.a = null;
            try {
                synchronized (CronetUrlRequest.this.f8677f) {
                    if (CronetUrlRequest.this.R()) {
                        return;
                    }
                    CronetUrlRequest.this.f8676e = true;
                    Q q = CronetUrlRequest.this.j;
                    CronetUrlRequest cronetUrlRequest = CronetUrlRequest.this;
                    q.c(cronetUrlRequest, cronetUrlRequest.B, byteBuffer);
                }
            } catch (Exception e2) {
                CronetUrlRequest.G(CronetUrlRequest.this, e2);
            }
        }
    }

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i2, F.b bVar, Executor executor, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i3, boolean z5, int i4, u.a aVar, int i5, long j) {
        int i6;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.o = new HeadersList();
        this.U = 0L;
        this.V = -1L;
        this.W = -1L;
        this.X = -1L;
        this.Y = -1L;
        this.Z = -1L;
        Objects.requireNonNull(str, "URL is required");
        Objects.requireNonNull(bVar, "Listener is required");
        Objects.requireNonNull(executor, "Executor is required");
        this.a = z3;
        this.f8678g = cronetUrlRequestContext;
        this.y = cronetUrlRequestContext.e0();
        this.z = cronetUrlRequestContext.f0();
        this.k = str;
        arrayList.add(str);
        int i7 = 2;
        if (i2 == 0) {
            i6 = 1;
        } else if (i2 == 1) {
            i6 = 2;
        } else if (i2 != 2) {
            i6 = 4;
            if (i2 == 4) {
                i6 = 5;
            }
        } else {
            i6 = 3;
        }
        this.l = i6;
        this.j = new Q(bVar);
        this.h = executor;
        this.p = collection;
        this.q = z;
        this.r = z2;
        this.s = z4;
        this.t = i3;
        this.u = z5;
        this.v = i4;
        this.w = aVar != null ? new O(aVar) : null;
        if (i5 == 1) {
            i7 = 1;
        } else if (i5 != 2) {
            i7 = 0;
        }
        this.m = i7;
        this.x = j;
    }

    static void A(CronetUrlRequest cronetUrlRequest) {
        if (cronetUrlRequest.E != null) {
            try {
                cronetUrlRequest.z.b(cronetUrlRequest.y, cronetUrlRequest.L());
            } catch (RuntimeException e2) {
                int i2 = CronetUrlRequestContext.Q;
                com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Error while trying to log CronetTrafficInfo: ", e2);
            }
            cronetUrlRequest.E.I(cronetUrlRequest.U, cronetUrlRequest.V, cronetUrlRequest.X, cronetUrlRequest.Y, cronetUrlRequest.Z);
            E e3 = new E(cronetUrlRequest.k, cronetUrlRequest.p, cronetUrlRequest.E, cronetUrlRequest.C, cronetUrlRequest.B, cronetUrlRequest.D);
            cronetUrlRequest.f8678g.o0(e3);
            O o = cronetUrlRequest.w;
            if (o != null) {
                try {
                    o.a().execute(new RunnableC0767g(cronetUrlRequest, e3));
                } catch (RejectedExecutionException e4) {
                    int i3 = CronetUrlRequestContext.Q;
                    com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception posting task to executor", e4);
                }
            }
        }
    }

    static void G(CronetUrlRequest cronetUrlRequest, Exception exc) {
        Objects.requireNonNull(cronetUrlRequest);
        C0762b c0762b = new C0762b("Exception received from UrlRequest.Callback", exc);
        int i2 = CronetUrlRequestContext.Q;
        com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception in CalledByNative method", exc);
        cronetUrlRequest.P(c0762b);
    }

    static void J(CronetUrlRequest cronetUrlRequest) {
        String str = cronetUrlRequest.H;
        if (str != null) {
            C0768h.a(str, cronetUrlRequest);
        }
        J.N.Mv2a151P(cronetUrlRequest.b, cronetUrlRequest);
    }

    @RequiresApi(26)
    private CronetLogger.b L() {
        Map<String, List<String>> emptyMap;
        int i2;
        String str;
        long j;
        long max;
        long j2;
        long max2;
        J j3 = this.B;
        boolean z = false;
        if (j3 != null) {
            emptyMap = j3.a();
            str = this.B.e();
            i2 = this.B.c();
            z = this.B.g();
        } else {
            emptyMap = Collections.emptyMap();
            i2 = 0;
            str = "";
        }
        long longValue = this.E.C().longValue();
        if (z && longValue == 0) {
            j = 0;
            max = 0;
        } else {
            HeadersList headersList = this.o;
            if (headersList == null) {
                j = 0;
            } else {
                Iterator<Map.Entry<String, String>> it2 = headersList.iterator();
                j = 0;
                while (it2.hasNext()) {
                    Map.Entry<String, String> next = it2.next();
                    if (next.getKey() != null) {
                        j += r11.length();
                    }
                    if (next.getValue() != null) {
                        j += next.getValue().length();
                    }
                }
            }
            max = Math.max(0L, longValue - j);
        }
        long longValue2 = this.E.p().longValue();
        if (z && longValue2 == 0) {
            max2 = 0;
            j2 = 0;
        } else {
            if (emptyMap == null) {
                j2 = 0;
            } else {
                j2 = 0;
                for (Map.Entry<String, List<String>> entry : emptyMap.entrySet()) {
                    if (entry.getKey() != null) {
                        j2 += r7.length();
                    }
                    if (entry.getValue() != null) {
                        while (entry.getValue().iterator().hasNext()) {
                            j2 += r2.next().length();
                        }
                    }
                }
            }
            max2 = Math.max(0L, longValue2 - j2);
        }
        return new CronetLogger.b(j, max, j2, max2, i2, (this.E.u() == null || this.E.x() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.E.x().getTime() - this.E.u().getTime()), (this.E.u() == null || this.E.r() == null) ? Duration.ofSeconds(0L) : Duration.ofMillis(this.E.r().getTime() - this.E.u().getTime()), str, this.F, this.G);
    }

    private void N() {
        synchronized (this.f8677f) {
            if (this.f8674c || R()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(int i2) {
        this.C = i2;
        if (this.b == 0) {
            return;
        }
        this.f8678g.l0();
        J.N.MIb9tt7_(this.b, this, i2 == 2);
        this.b = 0L;
    }

    private void P(AbstractC0760h abstractC0760h) {
        synchronized (this.f8677f) {
            if (R()) {
                return;
            }
            this.D = abstractC0760h;
            O(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean R() {
        return this.f8674c && this.b == 0;
    }

    private void T(Runnable runnable) {
        try {
            this.h.execute(runnable);
        } catch (RejectedExecutionException e2) {
            int i2 = CronetUrlRequestContext.Q;
            com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception posting task to executor", e2);
            P(new C0764d("Exception posting task to executor", e2));
        }
    }

    private J U(int i2, String str, String[] strArr, boolean z, String str2, String str3, long j) {
        HeadersList headersList = new HeadersList();
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            headersList.add(new AbstractMap.SimpleImmutableEntry(strArr[i3], strArr[i3 + 1]));
        }
        return new J(new ArrayList(this.i), i2, str, headersList, z, str2, str3, j);
    }

    @CalledByNative
    private String[] addSecurityFactor(String str, String[] strArr) {
        HashMap hashMap = new HashMap();
        int i2 = 0;
        for (int i3 = 0; i3 < strArr.length; i3 += 2) {
            hashMap.put(strArr[i3].toLowerCase(Locale.US), strArr[i3 + 1]);
        }
        Map<String, String> k0 = this.f8678g.k0(str, hashMap);
        if (k0 == null) {
            return null;
        }
        String[] strArr2 = new String[k0.size() * 2];
        for (Map.Entry<String, String> entry : k0.entrySet()) {
            strArr2[i2] = entry.getKey();
            strArr2[i2 + 1] = entry.getValue();
            i2 += 2;
        }
        return strArr2;
    }

    @CalledByNative
    private void onCanceled() {
        C0768h.c(this.H);
        f fVar = new f();
        w();
        T(fVar);
    }

    @CalledByNative
    private void onError(int i2, int i3, int i4, String str, long j) {
        J j2 = this.B;
        if (j2 != null) {
            j2.f(j);
        }
        C0768h.c(this.H);
        if (i2 == 10 || i2 == 3) {
            P(new D(e.a.a.a.a.s("Exception in CronetUrlRequest: ", str), i2, i3, i4));
            return;
        }
        switch (i2) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            case 5:
                i2 = 5;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 9;
                break;
            case 10:
                i2 = 10;
                break;
            case 11:
                i2 = 11;
                break;
            default:
                int i5 = CronetUrlRequestContext.Q;
                com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", e.a.a.a.a.j("Unknown error code: ", i2), new Object[0]);
                break;
        }
        P(new NetworkExceptionImpl(e.a.a.a.a.s("Exception in CronetUrlRequest: ", str), i2, i3));
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15, String str, long j16, long j17, String str2, String str3, String str4, String str5, boolean z2, boolean z3, int i2, boolean z4, boolean z5) {
        synchronized (this.f8677f) {
            if (this.E != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            C0766f c0766f = new C0766f(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, z, j14, j15, str, j16, j17, str2, str3, this.R, this.S, this.T, z2, z3, i2);
            this.E = c0766f;
            c0766f.J(str5);
            this.F = z4;
            this.G = z5;
        }
    }

    @CalledByNative
    private void onNativeAdapterDestroyed() {
        synchronized (this.f8677f) {
            if (this.D == null) {
                return;
            }
            h hVar = new h();
            try {
                w();
                this.h.execute(hVar);
            } catch (RejectedExecutionException e2) {
                int i2 = CronetUrlRequestContext.Q;
                com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception posting task to executor", e2);
            }
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i2, int i3, int i4, long j) {
        this.B.f(j);
        if (byteBuffer.position() != i3 || byteBuffer.limit() != i4) {
            P(new C0764d("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.a0 == null) {
            this.a0 = new i(null);
        }
        byteBuffer.position(i3 + i2);
        this.a0.a = byteBuffer;
        w();
        T(this.a0);
    }

    @CalledByNative
    private void onRedirectReceived(String str, int i2, String str2, String[] strArr, boolean z, String str3, String str4, long j, String str5) {
        J U = U(i2, str2, strArr, z, str3, str4, j);
        this.B = U;
        this.i.add(str);
        T(new c(U, str, str5));
    }

    @CalledByNative
    private void onResponseStarted(int i2, String str, String[] strArr, boolean z, String str2, String str3, long j, String str4) {
        this.B = U(i2, str, strArr, z, str2, str3, j);
        T(new d(str4));
    }

    @CalledByNative
    private void onStatus(VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener, int i2) {
        T(new g(this, versionSafeCallbacks$UrlRequestStatusListener, i2));
    }

    @CalledByNative
    private void onSucceeded(long j) {
        this.B.f(j);
        C0768h.c(this.H);
        e eVar = new e();
        w();
        T(eVar);
    }

    private void w() {
        if (this.W != -1) {
            long nanoTime = System.nanoTime();
            this.X = nanoTime;
            if (this.Y == -1) {
                this.Y = 0L;
            }
            this.Y = (nanoTime - this.W) + this.Y;
            this.W = -1L;
        }
    }

    void M() {
        if (!this.a && this.f8678g.j0(Thread.currentThread())) {
            throw new com.ttnet.org.chromium.net.n();
        }
    }

    public void Q(F.c cVar) {
        VersionSafeCallbacks$UrlRequestStatusListener versionSafeCallbacks$UrlRequestStatusListener = new VersionSafeCallbacks$UrlRequestStatusListener(cVar);
        synchronized (this.f8677f) {
            long j = this.b;
            if (j != 0) {
                J.N.MmSvKAJE(j, this, versionSafeCallbacks$UrlRequestStatusListener);
            } else {
                T(new b(this, versionSafeCallbacks$UrlRequestStatusListener));
            }
        }
    }

    void S(Throwable th) {
        int i2 = CronetUrlRequestContext.Q;
        com.ttnet.org.chromium.base.d.a("CronetUrlRequestContext", "Exception in upload method", th);
        synchronized (this.f8677f) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            J.N.MzKjGz9N(j, this);
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void a(String str, String str2) {
        synchronized (this.f8677f) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            J.N.M2jrbUOP(j, this, str, str2);
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void b() {
        synchronized (this.f8677f) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            J.N.MjbEhTZs(j, this);
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void c() {
        C0768h.c(this.H);
        synchronized (this.f8677f) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            J.N.M3xsE8SK(j, this);
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void d() {
        synchronized (this.f8677f) {
            if (!R() && this.f8674c) {
                O(2);
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void e(String str, Throwable th) {
        P(new C0764d(str, th));
    }

    @Override // com.ttnet.org.chromium.net.F
    public void f() {
        synchronized (this.f8677f) {
            if (!this.f8675d) {
                throw new IllegalStateException("No redirect to follow.");
            }
            this.f8675d = false;
            if (R()) {
                return;
            }
            J.N.MhCyx70S(this.b, this);
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void g(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        synchronized (this.f8677f) {
            if (!this.f8676e) {
                throw new IllegalStateException("Unexpected read attempt.");
            }
            this.f8676e = false;
            if (R()) {
                return;
            }
            this.U++;
            long nanoTime = System.nanoTime();
            this.W = nanoTime;
            if (this.V == -1) {
                this.V = nanoTime;
            }
            long j = this.X;
            if (j != -1) {
                if (this.Z == -1) {
                    this.Z = 0L;
                }
                this.Z = (nanoTime - j) + this.Z;
            }
            if (J.N.MJbYA4in(this.b, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.f8676e = true;
            w();
            throw new IllegalArgumentException("Unable to call native read");
        }
    }

    @Override // com.ttnet.org.chromium.net.F
    public void h(long j) {
        this.R = j;
    }

    @Override // com.ttnet.org.chromium.net.F
    public void i(String str, String str2) {
        this.P = str;
        this.Q = str2;
    }

    @Override // com.ttnet.org.chromium.net.F
    public void j(int i2) {
        this.T = i2;
    }

    @Override // com.ttnet.org.chromium.net.F
    public void k(int i2) {
        this.I = i2;
    }

    @Override // com.ttnet.org.chromium.net.F
    public void l(int i2) {
        this.O = i2 | this.O;
    }

    @Override // com.ttnet.org.chromium.net.F
    public void m(long j) {
        this.S = j;
    }

    @Override // com.ttnet.org.chromium.net.F
    public void n(long j) {
        synchronized (this.f8677f) {
            this.N = j;
            long j2 = this.b;
            if (j2 != 0) {
                J.N.ML2WrLQ6(j2, this, j);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ttnet.org.chromium.net.F
    public void o() {
        Object obj;
        CronetUrlRequest cronetUrlRequest;
        int i2;
        Object obj2 = this.f8677f;
        synchronized (obj2) {
            try {
                try {
                    N();
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
            }
            try {
                obj = obj2;
                try {
                    cronetUrlRequest = this;
                    try {
                        cronetUrlRequest.b = J.N.MnXVOzVo(this, this.f8678g.h0(), this.k, this.l, this.I, this.q, this.r, this.s, this.t, this.u, this.v, this.m, this.x);
                        cronetUrlRequest.f8678g.m0();
                        String str = cronetUrlRequest.n;
                        if (str != null && !J.N.MfdvbiJC(cronetUrlRequest.b, cronetUrlRequest, str)) {
                            throw new IllegalArgumentException("Invalid http method " + cronetUrlRequest.n);
                        }
                        Iterator<Map.Entry<String, String>> it2 = cronetUrlRequest.o.iterator();
                        boolean z = false;
                        while (it2.hasNext()) {
                            Map.Entry<String, String> next = it2.next();
                            if (next.getKey().equalsIgnoreCase(DownloadHelper.CONTENT_TYPE) && !next.getValue().isEmpty()) {
                                z = true;
                            }
                            if (next.getKey().equalsIgnoreCase("Tt-Map-Key") && !next.getValue().isEmpty()) {
                                cronetUrlRequest.H = next.getValue();
                            }
                            if (!J.N.MtJFji5x(cronetUrlRequest.b, cronetUrlRequest, next.getKey(), next.getValue())) {
                                throw new IllegalArgumentException("Invalid header " + next.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + next.getValue());
                            }
                        }
                        long j = cronetUrlRequest.b;
                        J.N.M4C6WZaz(j, this, cronetUrlRequest.f8673J, cronetUrlRequest.K, cronetUrlRequest.L);
                        J.N.MaFGwSbC(cronetUrlRequest.b, cronetUrlRequest, cronetUrlRequest.M);
                        long j2 = cronetUrlRequest.N;
                        if (j2 > 0) {
                            J.N.ML2WrLQ6(cronetUrlRequest.b, cronetUrlRequest, j2);
                        }
                        int i3 = cronetUrlRequest.O;
                        int i4 = j;
                        if (i3 > 0) {
                            long j3 = cronetUrlRequest.b;
                            J.N.MC7pScOk(j3, cronetUrlRequest, i3);
                            i4 = j3;
                        }
                        String str2 = cronetUrlRequest.P;
                        i2 = i4;
                        if (str2 != null) {
                            String str3 = cronetUrlRequest.Q;
                            i2 = str3;
                            if (str3 != 0) {
                                J.N.Mor7A21H(cronetUrlRequest.b, cronetUrlRequest, str2, str3);
                                i2 = str3;
                            }
                        }
                        CronetUploadDataStream cronetUploadDataStream = cronetUrlRequest.A;
                        if (cronetUploadDataStream == null) {
                            cronetUrlRequest.f8674c = true;
                            String str4 = cronetUrlRequest.H;
                            if (str4 != null) {
                                C0768h.a(str4, cronetUrlRequest);
                            }
                            J.N.Mv2a151P(cronetUrlRequest.b, cronetUrlRequest);
                            return;
                        }
                        try {
                            if (!z) {
                                throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                            }
                            cronetUrlRequest.f8674c = true;
                            cronetUploadDataStream.s(cronetUrlRequest.new a());
                        } catch (RuntimeException e2) {
                            e = e2;
                            cronetUrlRequest.O(i2);
                            throw e;
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        i2 = 1;
                        cronetUrlRequest.O(i2);
                        throw e;
                    }
                } catch (RuntimeException e4) {
                    e = e4;
                    i2 = 1;
                    cronetUrlRequest = this;
                } catch (Throwable th3) {
                    th = th3;
                    while (true) {
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (RuntimeException e5) {
                e = e5;
                cronetUrlRequest = this;
            }
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void p(String str, String str2) {
        N();
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.o.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void q(String str) {
        N();
        Objects.requireNonNull(str, "Method is required.");
        this.n = str;
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void r(int i2) {
        this.M = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void s(int i2) {
        this.f8673J = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void t(int i2) {
        this.K = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void u(int i2) {
        this.L = i2;
    }

    @Override // com.ttnet.org.chromium.net.impl.H
    public void v(com.ttnet.org.chromium.net.D d2, Executor executor) {
        Objects.requireNonNull(d2, "Invalid UploadDataProvider.");
        if (this.n == null) {
            this.n = "POST";
        }
        this.A = new CronetUploadDataStream(d2, executor, this);
    }
}
