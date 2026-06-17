package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1754e;

    /* renamed from: f, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 28)
    public static final boolean f1755f;

    /* renamed from: g, reason: collision with root package name */
    private static final File f1756g;
    private static volatile r h;

    @GuardedBy("this")
    private int b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f1757c = true;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f1758d = new AtomicBoolean(false);
    private final int a = AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH;

    static {
        int i = Build.VERSION.SDK_INT;
        f1754e = i < 29;
        f1755f = i >= 28;
        f1756g = new File("/proc/self/fd");
    }

    @VisibleForTesting
    r() {
    }

    public static r a() {
        if (h == null) {
            synchronized (r.class) {
                if (h == null) {
                    h = new r();
                }
            }
        }
        return h;
    }

    private int b() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it2 = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Build.MODEL.startsWith((String) it2.next())) {
                    z = true;
                    break;
                }
            }
        }
        if (z) {
            return 500;
        }
        return this.a;
    }

    public boolean c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (!z) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f1755f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (f1754e && !this.f1758d.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i < 0 || i2 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        synchronized (this) {
            int i3 = this.b + 1;
            this.b = i3;
            if (i3 >= 50) {
                this.b = 0;
                int length = f1756g.list().length;
                long b = b();
                boolean z4 = ((long) length) < b;
                this.f1757c = z4;
                if (!z4 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + b);
                }
            }
            z3 = this.f1757c;
        }
        if (z3) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    public void d() {
        com.bumptech.glide.util.j.a();
        this.f1758d.set(true);
    }
}
