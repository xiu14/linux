package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.net.B;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class CronetWebsocketConnection extends com.ttnet.org.chromium.net.B {
    private long a;
    private final B.b b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f8687c;

    /* renamed from: d, reason: collision with root package name */
    private List<String> f8688d;

    /* renamed from: e, reason: collision with root package name */
    private int f8689e;

    /* renamed from: f, reason: collision with root package name */
    private String f8690f;

    /* renamed from: g, reason: collision with root package name */
    private long f8691g;
    private int h;
    private long i;
    private String j;
    private int k;
    private String l;
    private Map<String, String> m;
    private Map<String, String> n;
    private boolean o;
    private boolean p;
    private final CronetUrlRequestContext q;
    private final Object r;
    private AtomicInteger s;

    class a implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CronetWebsocketConnection.this.b.b(CronetWebsocketConnection.this, this.a, this.b);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetWebsocketConnection", "Exception in callback: ", e2);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ int a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f8693c;

        b(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.f8693c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CronetWebsocketConnection.this.b.a(CronetWebsocketConnection.this, this.a, this.b, this.f8693c);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetWebsocketConnection", "Exception in callback: ", e2);
            }
        }
    }

    class c implements Runnable {
        final /* synthetic */ ByteBuffer a;
        final /* synthetic */ int b;

        c(ByteBuffer byteBuffer, int i) {
            this.a = byteBuffer;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CronetWebsocketConnection.this.b.d(CronetWebsocketConnection.this, this.a, this.b);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetWebsocketConnection", "Exception in callback: ", e2);
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
            try {
                CronetWebsocketConnection.this.b.c(CronetWebsocketConnection.this, this.a);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetWebsocketConnection", "Exception in callback: ", e2);
            }
        }
    }

    class e implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ long b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f8696c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f8697d;

        e(String str, long j, long j2, boolean z) {
            this.a = str;
            this.b = j;
            this.f8696c = j2;
            this.f8697d = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                CronetWebsocketConnection.this.b.e(CronetWebsocketConnection.this, this.a, this.b, this.f8696c, this.f8697d);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("CronetWebsocketConnection", "Exception in callback: ", e2);
            }
        }
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, B.b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.p = true;
        this.r = new Object();
        this.s = new AtomicInteger(-1);
        this.q = cronetUrlRequestContext;
        this.b = bVar;
        this.f8687c = executor;
        this.f8688d = list;
        this.f8689e = i;
        this.f8690f = str;
        this.f8691g = j;
        this.h = i2;
        this.i = j2;
        this.j = str2;
        this.k = i3;
        this.l = str3;
        this.m = map;
        this.n = map2;
        this.o = z;
    }

    private void h(Runnable runnable) {
        try {
            this.f8687c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            com.ttnet.org.chromium.base.d.a("CronetWebsocketConnection", "Exception posting task to executor", e2);
        }
    }

    @CalledByNative
    private void onConnectionError(int i, String str, String str2) {
        this.s.set(i);
        h(new b(i, str, str2));
    }

    @CalledByNative
    private void onConnectionStateChanged(int i, String str) {
        this.s.set(i);
        h(new a(i, str));
    }

    @CalledByNative
    private void onFeedbackLog(String str) {
        h(new d(str));
    }

    @CalledByNative
    private void onMessageReceived(ByteBuffer byteBuffer, int i) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.capacity());
        byteBuffer.rewind();
        allocate.put(byteBuffer);
        allocate.flip();
        h(new c(allocate, i));
    }

    @CalledByNative
    private void onTrafficChanged(String str, long j, long j2, boolean z) {
        h(new e(str, j, j2, z));
    }

    @Override // com.ttnet.org.chromium.net.B
    public void a(ByteBuffer byteBuffer) {
        synchronized (this.r) {
            long j = this.a;
            if (j == 0) {
                return;
            }
            J.N.MRfZ_7V_(j, this, byteBuffer);
        }
    }

    @Override // com.ttnet.org.chromium.net.B
    public void b(String str) {
        synchronized (this.r) {
            long j = this.a;
            if (j == 0) {
                return;
            }
            J.N.MRnDfpSi(j, this, str);
        }
    }

    @Override // com.ttnet.org.chromium.net.B
    public void c() {
        synchronized (this.r) {
            long j = this.a;
            if (j == 0) {
                return;
            }
            J.N.MCzpxGQD(j, this);
            this.a = 0L;
        }
    }

    @Override // com.ttnet.org.chromium.net.B
    public boolean d() {
        return this.s.get() == 4;
    }

    @Override // com.ttnet.org.chromium.net.B
    public void e() {
        Object obj;
        Object obj2 = this.r;
        synchronized (obj2) {
            try {
                try {
                    if (this.a == 0) {
                        this.a = J.N.MRAGjNeT(this, this.q.h0());
                    }
                    Iterator<String> it2 = this.f8688d.iterator();
                    while (it2.hasNext()) {
                        J.N.MgN9hn8A(this.a, this, it2.next());
                    }
                    Map<String, String> map = this.m;
                    if (map != null) {
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            J.N.Mzisx1kZ(this.a, this, entry.getKey(), entry.getValue());
                        }
                    }
                    Map<String, String> map2 = this.n;
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                            J.N.MKmGe$35(this.a, this, entry2.getKey(), entry2.getValue());
                        }
                    }
                    if (this.p) {
                        obj = obj2;
                        J.N.MWq0tMul(this.a, this, this.f8689e, this.f8690f, this.f8691g, this.h, this.i, this.j, this.k, this.l, this.o);
                    } else {
                        obj = obj2;
                        J.N.MVrBbeuj(this.a, this, this.o);
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        throw th;
    }

    @Override // com.ttnet.org.chromium.net.B
    public void f() {
        synchronized (this.r) {
            long j = this.a;
            if (j == 0) {
                return;
            }
            J.N.M14GZgiH(j, this);
        }
    }

    CronetWebsocketConnection(CronetUrlRequestContext cronetUrlRequestContext, B.b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        this.p = true;
        this.r = new Object();
        this.s = new AtomicInteger(-1);
        this.q = cronetUrlRequestContext;
        this.b = bVar;
        this.f8687c = executor;
        this.f8688d = list;
        this.m = map;
        this.n = map2;
        this.o = z;
        this.p = false;
    }
}
