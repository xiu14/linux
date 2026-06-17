package com.ttnet.org.chromium.net;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ttnet.org.chromium.base.TraceEvent;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.UsedByReflection;
import com.ttnet.org.chromium.net.ProxyChangeListener;

@UsedByReflection
/* loaded from: classes2.dex */
public class ProxyChangeListener {
    private final Looper a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private long f8626c;

    /* renamed from: d, reason: collision with root package name */
    private ProxyReceiver f8627d;

    /* renamed from: e, reason: collision with root package name */
    private BroadcastReceiver f8628e;

    @UsedByReflection
    private class ProxyReceiver extends BroadcastReceiver {
        ProxyReceiver(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        @UsedByReflection
        public void onReceive(Context context, final Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.b.postDelayed(new Runnable() { // from class: com.ttnet.org.chromium.net.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProxyChangeListener.b d2;
                        ProxyChangeListener.ProxyReceiver proxyReceiver = ProxyChangeListener.ProxyReceiver.this;
                        Intent intent2 = intent;
                        ProxyChangeListener proxyChangeListener = ProxyChangeListener.this;
                        d2 = ProxyChangeListener.d(intent2);
                        proxyChangeListener.f(d2);
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: e, reason: collision with root package name */
        public static final b f8629e = new b("", 0, "", new String[0]);
        public final String a;
        public final int b;

        /* renamed from: c, reason: collision with root package name */
        public final String f8630c;

        /* renamed from: d, reason: collision with root package name */
        public final String[] f8631d;

        public b(String str, int i, String str2, String[] strArr) {
            this.a = str;
            this.b = i;
            this.f8630c = str2;
            this.f8631d = strArr;
        }

        static b a(ProxyInfo proxyInfo) {
            if (proxyInfo == null) {
                return null;
            }
            String host = proxyInfo.getHost();
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            if (host == null) {
                host = "";
            }
            return new b(host, proxyInfo.getPort(), Uri.EMPTY.equals(pacFileUrl) ? null : pacFileUrl.toString(), proxyInfo.getExclusionList());
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.a = myLooper;
        this.b = new Handler(myLooper);
    }

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b d(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return null;
        }
        return b.a((ProxyInfo) extras.get("android.intent.extra.PROXY_INFO"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(b bVar) {
        long j = this.f8626c;
        if (j == 0) {
            return;
        }
        if (bVar != null) {
            N.MtXZ30qk(j, this, bVar.a, bVar.b, bVar.f8630c, bVar.f8631d);
        } else {
            N.MKwsFZ4t(j, this);
        }
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PROXY_CHANGE");
        this.f8627d = new ProxyReceiver(null);
        com.ttnet.org.chromium.base.c.d(com.ttnet.org.chromium.base.c.b(), this.f8627d, new IntentFilter());
        this.f8628e = new q(this);
        com.ttnet.org.chromium.base.c.d(com.ttnet.org.chromium.base.c.b(), this.f8628e, intentFilter);
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public void e(Intent intent) {
        ProxyInfo defaultProxy = ((ConnectivityManager) com.ttnet.org.chromium.base.c.b().getSystemService("connectivity")).getDefaultProxy();
        f(defaultProxy == null ? b.f8629e : (Build.VERSION.SDK_INT >= 29 && "localhost".equals(defaultProxy.getHost()) && defaultProxy.getPort() == -1) ? d(intent) : b.a(defaultProxy));
    }

    void h(final Intent intent) {
        this.b.postDelayed(new Runnable() { // from class: com.ttnet.org.chromium.net.c
            @Override // java.lang.Runnable
            public final void run() {
                ProxyChangeListener.this.e(intent);
            }
        }, 1000L);
    }

    @CalledByNative
    public void start(long j) {
        TraceEvent r = TraceEvent.r("ProxyChangeListener.start");
        try {
            this.f8626c = j;
            g();
            if (r != null) {
                r.close();
            }
        } catch (Throwable th) {
            if (r != null) {
                try {
                    r.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CalledByNative
    public void stop() {
        this.f8626c = 0L;
        com.ttnet.org.chromium.base.c.b().unregisterReceiver(this.f8627d);
        if (this.f8628e != null) {
            com.ttnet.org.chromium.base.c.b().unregisterReceiver(this.f8628e);
        }
        this.f8627d = null;
        this.f8628e = null;
    }
}
