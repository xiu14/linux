package com.bytedance.crash.monitor;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.C0651f;
import com.bytedance.crash.C0652g;
import com.bytedance.crash.D;
import com.bytedance.crash.ICommonParams;
import com.bytedance.crash.J;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class l {
    private static com.bytedance.crash.monitor.a a;
    private static com.bytedance.crash.R.d b;

    static class a implements Runnable {
        final /* synthetic */ h a;

        a(h hVar) {
            this.a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            new g(this.a).c();
        }
    }

    public static com.bytedance.crash.monitor.a a(@NonNull Context context, @NonNull String str, @NonNull String str2, long j) {
        C0652g.r(context);
        synchronized (com.bytedance.crash.monitor.a.class) {
            com.bytedance.crash.monitor.a aVar = a;
            if (aVar != null) {
                return aVar;
            }
            com.bytedance.crash.monitor.a aVar2 = new com.bytedance.crash.monitor.a(str, str2, j);
            a = aVar2;
            com.bytedance.crash.R.d dVar = b;
            if (dVar != null) {
                dVar.r(aVar2);
            }
            C0651f.e(context, a);
            return a;
        }
    }

    public static synchronized h b(@NonNull Context context, String str, long j, long j2, String str2) {
        h hVar;
        synchronized (l.class) {
            C0652g.r(context);
            hVar = new h(str, str2, j, j2, 0L);
            D.e();
            com.bytedance.crash.runtime.b.d(new a(hVar));
        }
        return hVar;
    }

    public static com.bytedance.crash.monitor.a c(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        C0652g.r(context);
        synchronized (com.bytedance.crash.monitor.a.class) {
            com.bytedance.crash.monitor.a aVar = a;
            if (aVar != null) {
                return aVar;
            }
            i iVar = new i(iCommonParams);
            a = iVar;
            com.bytedance.crash.R.d dVar = b;
            if (dVar != null) {
                dVar.r(iVar);
            }
            File k = C0652g.k();
            if (k == null) {
                k = com.bytedance.android.input.k.b.a.n(context.getFilesDir(), "npth");
            }
            D.d(context, k);
            return a;
        }
    }

    @NonNull
    public static com.bytedance.crash.R.d d() {
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    b = new com.bytedance.crash.R.d(a);
                }
            }
        }
        return b;
    }

    @Nullable
    public static com.bytedance.crash.monitor.a e() {
        return a;
    }

    @Nullable
    public static String f() {
        com.bytedance.crash.monitor.a aVar = a;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    @NonNull
    public static J g() {
        return com.bytedance.crash.monitor.a.A();
    }

    @NonNull
    public static ArrayList<f> h() {
        return f.u();
    }
}
