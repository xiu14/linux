package com.bytedance.bdinstall.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.bytedance.bdinstall.C0629i;
import com.bytedance.bdinstall.C0632l;
import com.bytedance.bdinstall.E;
import com.bytedance.bdinstall.P;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.V;

/* loaded from: classes.dex */
public class t implements E {
    private final long a;
    private V b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f4117c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private Q f4118d;

    class a implements Runnable {
        final /* synthetic */ P a;

        a(P p) {
            this.a = p;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t.this.b != null) {
                t.this.b.b(this.a);
                t.d(t.this);
            }
            t.c(t.this, null);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (t.this.b != null) {
                t.this.b.a();
                t.d(t.this);
            }
            t.c(t.this, null);
        }
    }

    public t(long j, V v, Q q) {
        this.a = j;
        this.b = v;
        this.f4118d = q;
    }

    static /* synthetic */ V c(t tVar, V v) {
        tVar.b = null;
        return null;
    }

    static void d(t tVar) {
        Q q = tVar.f4118d;
        if (q == null || q.R()) {
            C0629i.h(tVar);
            return;
        }
        String valueOf = String.valueOf(tVar.f4118d.h());
        int i = C0629i.f4007c;
        C0632l.n(valueOf).j.d(tVar);
    }

    @Override // com.bytedance.bdinstall.E
    public void a(@NonNull P p) {
        this.f4117c.post(new a(p));
    }

    public void e() {
        this.f4117c.postDelayed(new b(), this.a);
    }
}
