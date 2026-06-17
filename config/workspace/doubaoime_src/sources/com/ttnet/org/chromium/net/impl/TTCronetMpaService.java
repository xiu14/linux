package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.net.y;
import java.util.List;

/* loaded from: classes2.dex */
public final class TTCronetMpaService extends com.ttnet.org.chromium.net.y {
    private CronetUrlRequestContext a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8720c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private y.a f8721d;

    /* renamed from: e, reason: collision with root package name */
    private y.a f8722e;

    class a implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        a(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TTCronetMpaService.this.f8721d.a(this.a, this.b);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("TTCronetMpaService", "Exception in callback: ", e2);
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ boolean a;
        final /* synthetic */ String b;

        b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                TTCronetMpaService.this.f8722e.a(this.a, this.b);
            } catch (Exception e2) {
                com.ttnet.org.chromium.base.d.a("TTCronetMpaService", "Exception in callback: ", e2);
            }
        }
    }

    public TTCronetMpaService(CronetUrlRequestContext cronetUrlRequestContext) {
        this.a = cronetUrlRequestContext;
    }

    private native void nativeCommand(long j, String str, String str2);

    private native long nativeCreateMpaServiceAdapter(long j);

    private native void nativeInit(long j);

    private native void nativeSetAccAddress(long j, String[] strArr);

    private native void nativeStart(long j);

    private native void nativeStop(long j);

    @CalledByNative
    private void onInitFinish(boolean z, String str) {
        Thread thread = new Thread(new a(z, str));
        thread.setName("TTCronetMpaService_Thread");
        thread.start();
    }

    @CalledByNative
    private void onSetAccAddressFinish(boolean z, String str) {
        Thread thread = new Thread(new b(z, str));
        thread.setName("TTCronetMpaService_Thread");
        thread.start();
    }

    @Override // com.ttnet.org.chromium.net.y
    public void a(String str, String str2) {
        synchronized (this.f8720c) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            nativeCommand(j, str, str2);
        }
    }

    @Override // com.ttnet.org.chromium.net.y
    public void b(y.a aVar) {
        synchronized (this.f8720c) {
            if (this.b == 0) {
                this.b = nativeCreateMpaServiceAdapter(this.a.h0());
            }
            this.f8721d = aVar;
            nativeInit(this.b);
        }
    }

    @Override // com.ttnet.org.chromium.net.y
    public void c(List<String> list, y.a aVar) {
        synchronized (this.f8720c) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            this.f8722e = aVar;
            nativeSetAccAddress(j, (String[]) list.toArray(new String[list.size()]));
        }
    }

    @Override // com.ttnet.org.chromium.net.y
    public void d() {
        synchronized (this.f8720c) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            nativeStart(j);
        }
    }

    @Override // com.ttnet.org.chromium.net.y
    public void e() {
        synchronized (this.f8720c) {
            long j = this.b;
            if (j == 0) {
                return;
            }
            nativeStop(j);
        }
    }
}
