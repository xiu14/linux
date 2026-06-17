package com.ttnet.org.chromium.net.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.net.NetworkChangeNotifier;
import java.io.File;

@VisibleForTesting
/* loaded from: classes2.dex */
public class CronetLibraryLoader {

    /* renamed from: d, reason: collision with root package name */
    private static volatile boolean f8664d;
    private static final Object a = new Object();
    private static final HandlerThread b = new HandlerThread("CronetInit");

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f8663c = false;

    /* renamed from: e, reason: collision with root package name */
    private static final ConditionVariable f8665e = new ConditionVariable();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CronetLibraryLoader.b();
        }
    }

    public static void a(Context context, CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        synchronized (a) {
            if (!f8664d) {
                com.ttnet.org.chromium.base.c.c(context);
                HandlerThread handlerThread = b;
                if (!handlerThread.isAlive()) {
                    handlerThread.start();
                }
                d(new a());
            }
            if (!f8663c) {
                com.prolificinteractive.materialcalendarview.r.a = System.nanoTime();
                c(cronetEngineBuilderImpl);
                com.prolificinteractive.materialcalendarview.r.b = System.nanoTime();
                if (!cronetEngineBuilderImpl.B0()) {
                    if (!"107.0.5273.2".equals(J.N.MVlvYo_c())) {
                        throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", "107.0.5273.2", J.N.MVlvYo_c()));
                    }
                    com.ttnet.org.chromium.base.d.d("CronetLibraryLoader", "Cronet version: %s, arch: %s", "107.0.5273.2", System.getProperty("os.arch"));
                }
                f8663c = true;
                f8665e.open();
            }
        }
    }

    static void b() {
        if (f8664d) {
            return;
        }
        com.prolificinteractive.materialcalendarview.r.f8224c = System.nanoTime();
        NetworkChangeNotifier.init();
        NetworkChangeNotifier.k();
        f8665e.block();
        J.N.MyweRqSS();
        f8664d = true;
        com.prolificinteractive.materialcalendarview.r.f8225d = System.nanoTime();
    }

    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    private static void c(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        String i0 = cronetEngineBuilderImpl.i0();
        if (!TextUtils.isEmpty(i0)) {
            File file = new File(i0);
            if (file.exists() && !file.isDirectory()) {
                com.ttnet.org.chromium.base.d.d("CronetLibraryLoader", "cronet so load: %s", i0);
                System.load(i0);
                return;
            }
        }
        if (cronetEngineBuilderImpl.y0() != null) {
            cronetEngineBuilderImpl.y0().loadLibrary("sscronet");
        } else {
            System.loadLibrary("sscronet");
        }
    }

    public static void d(Runnable runnable) {
        HandlerThread handlerThread = b;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handlerThread.getLooper()).post(runnable);
        }
    }

    @CalledByNative
    private static void ensureInitializedFromNative() {
        synchronized (a) {
            f8663c = true;
            f8665e.open();
        }
        a(com.ttnet.org.chromium.base.c.b(), null);
    }

    @CalledByNative
    private static String getDefaultUserAgent() {
        return K.a(com.ttnet.org.chromium.base.c.b());
    }

    @CalledByNative
    private static void setNetworkThreadPriorityOnNetworkThread(int i) {
        Process.setThreadPriority(i);
    }
}
