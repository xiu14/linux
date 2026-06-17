package com.bytedance.crash.crash;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.bytedance.crash.A;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICrashCallback;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.crash.monitor.l;
import com.bytedance.crash.r;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f {
    public static volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f4581c;
    private final a a;

    f(@NonNull Context context, @NonNull a aVar) {
        this.a = aVar;
        try {
            try {
                System.loadLibrary("npth");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            int i = A.b;
            e.b.h.a.a("npth", C0652g.g());
        }
        NativeBridge.X(context, aVar.d());
    }

    void a(long j, int i) {
        if (j > 0) {
            try {
                com.bytedance.crash.monitor.a e2 = l.e();
                if (e2 != null) {
                    Iterator<r> it2 = e2.j().B(CrashType.NATIVE).iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().a(CrashType.NATIVE, j);
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
        }
        this.a.c(j, false, b, f4581c, i);
        if (j > 0) {
            File d2 = this.a.d();
            com.bytedance.crash.S.a.b(d2);
            String H = NativeBridge.H(d2.getAbsolutePath());
            if (TextUtils.isEmpty(H)) {
                return;
            }
            for (com.bytedance.crash.monitor.f fVar : l.h()) {
                if (fVar != null) {
                    Iterator<ICrashCallback> it3 = fVar.j().u(CrashType.NATIVE).iterator();
                    while (it3.hasNext()) {
                        try {
                            it3.next().onCrash(CrashType.NATIVE, H, null);
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
