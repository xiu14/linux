package com.ttnet.org.chromium.base;

import android.app.Activity;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class ApplicationStatus {
    private static final Map<Activity, Object> a = Collections.synchronizedMap(new HashMap());
    private static b b;

    /* renamed from: c, reason: collision with root package name */
    private static g<b> f8544c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f8545d = 0;

    class a implements Runnable {

        /* renamed from: com.ttnet.org.chromium.base.ApplicationStatus$a$a, reason: collision with other inner class name */
        class C0397a implements b {
            C0397a(a aVar) {
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApplicationStatus.b != null) {
                return;
            }
            b unused = ApplicationStatus.b = new C0397a(this);
            ApplicationStatus.d(ApplicationStatus.b);
        }
    }

    public interface b {
    }

    private ApplicationStatus() {
    }

    public static boolean c() {
        synchronized (a) {
        }
        return false;
    }

    @MainThread
    public static void d(b bVar) {
        if (f8544c == null) {
            f8544c = new g<>();
        }
        f8544c.f(bVar);
    }

    @MainThread
    public static void e(b bVar) {
        g<b> gVar = f8544c;
        if (gVar == null) {
            return;
        }
        gVar.h(bVar);
    }

    @AnyThread
    @CalledByNative
    public static int getStateForApplication() {
        synchronized (a) {
        }
        return 0;
    }

    @AnyThread
    @CalledByNative
    public static boolean hasVisibleActivities() {
        int stateForApplication = getStateForApplication();
        return stateForApplication == 1 || stateForApplication == 2;
    }

    @CalledByNative
    private static void registerThreadSafeNativeApplicationStateListener() {
        a aVar = new a();
        if (ThreadUtils.b()) {
            aVar.run();
        } else {
            ThreadUtils.a().post(aVar);
        }
    }
}
