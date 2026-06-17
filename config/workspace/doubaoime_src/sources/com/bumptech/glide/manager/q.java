package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.util.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
final class q {

    /* renamed from: d, reason: collision with root package name */
    private static volatile q f1806d;
    private final c a;

    @GuardedBy("this")
    final Set<b.a> b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f1807c;

    class a implements e.b<ConnectivityManager> {
        final /* synthetic */ Context a;

        a(q qVar, Context context) {
            this.a = context;
        }

        @Override // com.bumptech.glide.util.e.b
        public ConnectivityManager get() {
            return (ConnectivityManager) this.a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z) {
            ArrayList arrayList;
            com.bumptech.glide.util.j.a();
            synchronized (q.this) {
                arrayList = new ArrayList(q.this.b);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((b.a) it2.next()).a(z);
            }
        }
    }

    private interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi(24)
    static final class d implements c {
        boolean a;
        final b.a b;

        /* renamed from: c, reason: collision with root package name */
        private final e.b<ConnectivityManager> f1808c;

        /* renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f1809d = new a();

        class a extends ConnectivityManager.NetworkCallback {
            a() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@NonNull Network network) {
                com.bumptech.glide.util.j.k(new r(this, true));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@NonNull Network network) {
                com.bumptech.glide.util.j.k(new r(this, false));
            }
        }

        d(e.b<ConnectivityManager> bVar, b.a aVar) {
            this.f1808c = bVar;
            this.b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        public boolean a() {
            this.a = this.f1808c.get().getActiveNetwork() != null;
            try {
                this.f1808c.get().registerDefaultNetworkCallback(this.f1809d);
                return true;
            } catch (RuntimeException e2) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e2);
                }
                return false;
            }
        }

        public void b() {
            this.f1808c.get().unregisterNetworkCallback(this.f1809d);
        }
    }

    private q(@NonNull Context context) {
        this.a = new d(com.bumptech.glide.util.e.a(new a(this, context)), new b());
    }

    static q a(@NonNull Context context) {
        if (f1806d == null) {
            synchronized (q.class) {
                if (f1806d == null) {
                    f1806d = new q(context.getApplicationContext());
                }
            }
        }
        return f1806d;
    }

    synchronized void b(b.a aVar) {
        this.b.add(aVar);
        if (!this.f1807c && !this.b.isEmpty()) {
            this.f1807c = ((d) this.a).a();
        }
    }

    synchronized void c(b.a aVar) {
        this.b.remove(aVar);
        if (this.f1807c && this.b.isEmpty()) {
            ((d) this.a).b();
            this.f1807c = false;
        }
    }
}
