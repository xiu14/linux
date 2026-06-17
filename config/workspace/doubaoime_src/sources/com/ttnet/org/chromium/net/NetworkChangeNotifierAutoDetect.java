package com.ttnet.org.chromium.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.ttnet.org.chromium.base.TraceEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint({"NewApi"})
/* loaded from: classes2.dex */
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    private static final String o = NetworkChangeNotifierAutoDetect.class.getSimpleName();
    private final Looper a;
    private final Handler b;

    /* renamed from: c, reason: collision with root package name */
    private final NetworkConnectivityIntentFilter f8610c;

    /* renamed from: d, reason: collision with root package name */
    private final g f8611d;

    /* renamed from: e, reason: collision with root package name */
    private final h f8612e;

    /* renamed from: f, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f8613f;

    /* renamed from: g, reason: collision with root package name */
    private c f8614g;
    private e h;
    private NetworkRequest i;
    private boolean j;
    private f k;
    private boolean l;
    private boolean m;
    private boolean n;

    private static class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (NetworkChangeNotifierAutoDetect.this.l) {
                NetworkChangeNotifierAutoDetect.this.l = false;
            } else {
                NetworkChangeNotifierAutoDetect.this.k();
            }
        }
    }

    @RequiresApi(28)
    private class b extends ConnectivityManager.NetworkCallback {
        LinkProperties a;
        NetworkCapabilities b;

        b(a aVar) {
        }

        private f a(Network network) {
            int i;
            int i2;
            int i3;
            int i4 = -1;
            if (this.b.hasTransport(1) || this.b.hasTransport(5)) {
                i = 1;
            } else {
                i = 0;
                if (this.b.hasTransport(0)) {
                    NetworkInfo g2 = NetworkChangeNotifierAutoDetect.this.f8614g.g(network);
                    if (g2 != null) {
                        i4 = g2.getSubtype();
                    }
                } else if (this.b.hasTransport(3)) {
                    i = 9;
                } else if (this.b.hasTransport(2)) {
                    i = 7;
                } else {
                    if (!this.b.hasTransport(4)) {
                        i3 = -1;
                        i2 = -1;
                        return new f(true, i3, i2, !this.b.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.t(network)), null, this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
                    }
                    NetworkInfo e2 = NetworkChangeNotifierAutoDetect.this.f8614g.e(network);
                    i = e2 != null ? e2.getType() : 17;
                }
            }
            i2 = i4;
            i3 = i;
            return new f(true, i3, i2, !this.b.hasCapability(11), String.valueOf(NetworkChangeNotifierAutoDetect.t(network)), null, this.a.isPrivateDnsActive(), this.a.getPrivateDnsServerName());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            this.a = null;
            this.b = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            this.b = networkCapabilities;
            if (!NetworkChangeNotifierAutoDetect.this.j || this.a == null || this.b == null) {
                return;
            }
            NetworkChangeNotifierAutoDetect.this.l(a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            this.a = linkProperties;
            if (!NetworkChangeNotifierAutoDetect.this.j || this.a == null || this.b == null) {
                return;
            }
            NetworkChangeNotifierAutoDetect.this.l(a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            this.a = null;
            this.b = null;
            if (NetworkChangeNotifierAutoDetect.this.j) {
                NetworkChangeNotifierAutoDetect.this.l(new f(false, -1, -1, false, null, null, false, ""));
            }
        }
    }

    static class c {
        private final ConnectivityManager a;

        c(Context context) {
            this.a = (ConnectivityManager) context.getSystemService("connectivity");
        }

        @VisibleForTesting
        protected Network[] a() {
            Network[] networkArr;
            try {
                networkArr = this.a.getAllNetworks();
            } catch (Throwable unused) {
                networkArr = null;
            }
            return networkArr == null ? new Network[0] : networkArr;
        }

        int b(Network network) {
            NetworkInfo e2 = e(network);
            if (e2 == null || !e2.isConnected()) {
                return 6;
            }
            return NetworkChangeNotifierAutoDetect.a(e2.getType(), e2.getSubtype());
        }

        Network c() {
            Network network;
            try {
                network = this.a.getActiveNetwork();
            } catch (Throwable unused) {
                network = null;
            }
            if (network != null) {
                return network;
            }
            try {
                NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    return null;
                }
                for (Network network2 : NetworkChangeNotifierAutoDetect.n(this, null)) {
                    NetworkInfo g2 = g(network2);
                    if (g2 != null && (g2.getType() == activeNetworkInfo.getType() || g2.getType() == 17)) {
                        if (network != null && Build.VERSION.SDK_INT >= 29) {
                            if (g2.getDetailedState() != NetworkInfo.DetailedState.CONNECTING) {
                                NetworkInfo g3 = g(network);
                                if (g3 != null && g3.getDetailedState() == NetworkInfo.DetailedState.CONNECTING) {
                                    network = null;
                                }
                            }
                        }
                        if (network != null) {
                            com.ttnet.org.chromium.base.d.a(NetworkChangeNotifierAutoDetect.o, "defaultNetwork != null", new Object[0]);
                        }
                        network = network2;
                    }
                }
                return network;
            } catch (Throwable unused2) {
                return null;
            }
        }

        @VisibleForTesting
        protected NetworkCapabilities d(Network network) {
            for (int i = 0; i < 2; i++) {
                try {
                    return this.a.getNetworkCapabilities(network);
                } catch (Throwable unused) {
                }
            }
            return null;
        }

        NetworkInfo e(Network network) {
            NetworkInfo g2 = g(network);
            if (g2 == null || g2.getType() != 17) {
                return g2;
            }
            try {
                return this.a.getActiveNetworkInfo();
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.f f(com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.i r14) {
            /*
                r13 = this;
                r14 = 0
                android.net.Network r0 = r13.c()     // Catch: java.lang.Throwable -> L1a
                android.net.NetworkInfo r1 = r13.e(r0)     // Catch: java.lang.Throwable -> L1b
                if (r1 == 0) goto L1c
                int r2 = r1.getType()     // Catch: java.lang.Throwable -> L1b
                r3 = 17
                if (r2 != r3) goto L1c
                android.net.ConnectivityManager r1 = r13.a     // Catch: java.lang.Throwable -> L1b
                android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L1b
                goto L1c
            L1a:
                r0 = r14
            L1b:
                r1 = r14
            L1c:
                r2 = 1
                if (r1 != 0) goto L20
                goto L37
            L20:
                boolean r3 = r1.isConnected()
                if (r3 == 0) goto L28
            L26:
                r14 = r1
                goto L37
            L28:
                android.net.NetworkInfo$DetailedState r3 = r1.getDetailedState()
                android.net.NetworkInfo$DetailedState r4 = android.net.NetworkInfo.DetailedState.BLOCKED
                if (r3 == r4) goto L31
                goto L37
            L31:
                int r3 = com.ttnet.org.chromium.base.ApplicationStatus.getStateForApplication()
                if (r3 == r2) goto L26
            L37:
                if (r14 != 0) goto L49
                com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f r14 = new com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f
                r4 = 0
                r5 = -1
                r6 = -1
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                java.lang.String r11 = ""
                r3 = r14
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r14
            L49:
                if (r0 == 0) goto Lb7
                android.net.NetworkCapabilities r1 = r13.d(r0)
                r3 = 0
                if (r1 == 0) goto L5c
                r4 = 11
                boolean r1 = r1.hasCapability(r4)
                if (r1 != 0) goto L5c
                r8 = r2
                goto L5d
            L5c:
                r8 = r3
            L5d:
                com.ttnet.org.chromium.net.DnsStatus r1 = com.ttnet.org.chromium.net.AndroidNetworkLibrary.b(r0)
                if (r1 != 0) goto L7f
                com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f r1 = new com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f
                r5 = 1
                int r6 = r14.getType()
                int r7 = r14.getSubtype()
                long r2 = com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.t(r0)
                java.lang.String r9 = java.lang.String.valueOf(r2)
                r10 = 0
                r11 = 0
                java.lang.String r12 = ""
                r4 = r1
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return r1
            L7f:
                java.util.ArrayList r10 = new java.util.ArrayList
                r10.<init>()
                byte[][] r2 = r1.getDnsServers()     // Catch: java.net.UnknownHostException -> L97
                int r4 = r2.length     // Catch: java.net.UnknownHostException -> L97
            L89:
                if (r3 >= r4) goto L97
                r5 = r2[r3]     // Catch: java.net.UnknownHostException -> L97
                java.net.InetAddress r5 = java.net.InetAddress.getByAddress(r5)     // Catch: java.net.UnknownHostException -> L97
                r10.add(r5)     // Catch: java.net.UnknownHostException -> L97
                int r3 = r3 + 1
                goto L89
            L97:
                com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f r2 = new com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f
                r5 = 1
                int r6 = r14.getType()
                int r7 = r14.getSubtype()
                long r3 = com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.t(r0)
                java.lang.String r9 = java.lang.String.valueOf(r3)
                boolean r11 = r1.getPrivateDnsActive()
                java.lang.String r12 = r1.getPrivateDnsServerName()
                r4 = r2
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                return r2
            Lb7:
                int r0 = r14.getType()
                com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f r0 = new com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f
                r4 = 1
                int r5 = r14.getType()
                int r6 = r14.getSubtype()
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                java.lang.String r11 = ""
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect.c.f(com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$i):com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$f");
        }

        NetworkInfo g(Network network) {
            try {
                try {
                    return this.a.getNetworkInfo(network);
                } catch (Throwable unused) {
                    return this.a.getNetworkInfo(network);
                }
            } catch (Throwable unused2) {
                return null;
            }
        }

        @RequiresApi(28)
        void h(ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            try {
                this.a.registerDefaultNetworkCallback(networkCallback, handler);
            } catch (Throwable unused) {
            }
        }

        void i(NetworkRequest networkRequest, ConnectivityManager.NetworkCallback networkCallback, Handler handler) {
            try {
                this.a.registerNetworkCallback(networkRequest, networkCallback, handler);
            } catch (Throwable unused) {
            }
        }

        void j(ConnectivityManager.NetworkCallback networkCallback) {
            try {
                this.a.unregisterNetworkCallback(networkCallback);
            } catch (Throwable unused) {
            }
        }

        @VisibleForTesting
        protected boolean k(Network network) {
            Socket socket = new Socket();
            try {
                com.ttnet.org.chromium.base.h a = com.ttnet.org.chromium.base.h.a();
                try {
                    network.bindSocket(socket);
                    a.close();
                    try {
                        socket.close();
                        return true;
                    } catch (IOException unused) {
                        return true;
                    }
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                try {
                    socket.close();
                } catch (IOException unused3) {
                }
                return false;
            } catch (Throwable th3) {
                try {
                    socket.close();
                } catch (IOException unused4) {
                }
                throw th3;
            }
        }
    }

    private class d extends ConnectivityManager.NetworkCallback {
        d(a aVar) {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (NetworkChangeNotifierAutoDetect.this.j) {
                NetworkChangeNotifierAutoDetect.this.k();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            onAvailable(null);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            onAvailable(null);
        }
    }

    private class e extends ConnectivityManager.NetworkCallback {
        private Network a;

        class a implements Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f8616c;

            a(long j, int i, boolean z) {
                this.a = j;
                this.b = i;
                this.f8616c = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                NetworkChangeNotifier.this.g(this.a, this.b, this.f8616c);
                if (this.f8616c) {
                    NetworkChangeNotifier.a(NetworkChangeNotifier.this, this.b);
                    NetworkChangeNotifier.this.j(new long[]{this.a});
                }
            }
        }

        class b implements Runnable {
            final /* synthetic */ long a;
            final /* synthetic */ int b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f8618c;

            b(long j, int i, boolean z) {
                this.a = j;
                this.b = i;
                this.f8618c = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = NetworkChangeNotifierAutoDetect.this.f8611d;
                NetworkChangeNotifier.this.g(this.a, this.b, this.f8618c);
            }
        }

        class c implements Runnable {
            final /* synthetic */ long a;

            c(long j) {
                this.a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = NetworkChangeNotifierAutoDetect.this.f8611d;
                NetworkChangeNotifier.this.i(this.a);
            }
        }

        class d implements Runnable {
            final /* synthetic */ Network a;
            final /* synthetic */ boolean b;

            d(Network network, boolean z) {
                this.a = network;
                this.b = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = NetworkChangeNotifierAutoDetect.this.f8611d;
                NetworkChangeNotifier.this.h(NetworkChangeNotifierAutoDetect.t(this.a), this.b);
            }
        }

        /* renamed from: com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect$e$e, reason: collision with other inner class name */
        class RunnableC0399e implements Runnable {
            final /* synthetic */ int a;

            RunnableC0399e(int i) {
                this.a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = NetworkChangeNotifierAutoDetect.this.f8611d;
                NetworkChangeNotifier.a(NetworkChangeNotifier.this, this.a);
            }
        }

        e(a aVar) {
        }

        private boolean b(Network network, NetworkCapabilities networkCapabilities) {
            Network network2 = this.a;
            if ((network2 == null || network2.equals(network)) ? false : true) {
                return true;
            }
            if (networkCapabilities == null) {
                networkCapabilities = NetworkChangeNotifierAutoDetect.this.f8614g.d(network);
            }
            return networkCapabilities == null || (networkCapabilities.hasTransport(4) && !NetworkChangeNotifierAutoDetect.this.f8614g.k(network));
        }

        public long a() {
            Network network = this.a;
            if (network == null) {
                return -1L;
            }
            return NetworkChangeNotifierAutoDetect.t(network);
        }

        void c() {
            NetworkCapabilities d2;
            Network[] n = NetworkChangeNotifierAutoDetect.n(NetworkChangeNotifierAutoDetect.this.f8614g, null);
            this.a = null;
            if (n.length == 1 && (d2 = NetworkChangeNotifierAutoDetect.this.f8614g.d(n[0])) != null && d2.hasTransport(4)) {
                this.a = n[0];
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            Network network2;
            TraceEvent r = TraceEvent.r("NetworkChangeNotifierCallback::onAvailable");
            try {
                NetworkCapabilities d2 = NetworkChangeNotifierAutoDetect.this.f8614g.d(network);
                if (b(network, d2)) {
                    if (r != null) {
                        r.close();
                        return;
                    }
                    return;
                }
                boolean z = false;
                if (d2 != null && d2.hasTransport(4) && ((network2 = this.a) == null || !network.equals(network2))) {
                    z = true;
                }
                boolean z2 = z;
                if (z2) {
                    this.a = network;
                }
                NetworkChangeNotifierAutoDetect.this.w(new a(NetworkChangeNotifierAutoDetect.t(network), NetworkChangeNotifierAutoDetect.this.f8614g.b(network), z2));
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            TraceEvent r = TraceEvent.r("NetworkChangeNotifierCallback::onCapabilitiesChanged");
            try {
                if (b(network, networkCapabilities)) {
                    if (r != null) {
                        r.close();
                        return;
                    }
                    return;
                }
                long t = NetworkChangeNotifierAutoDetect.t(network);
                int b2 = NetworkChangeNotifierAutoDetect.this.f8614g.b(network);
                Network network2 = this.a;
                NetworkChangeNotifierAutoDetect.this.w(new b(t, b2, network2 != null && network2.equals(network)));
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i) {
            TraceEvent r = TraceEvent.r("NetworkChangeNotifierCallback::onLosing");
            try {
                if (b(network, null)) {
                    if (r != null) {
                        r.close();
                    }
                } else {
                    NetworkChangeNotifierAutoDetect.this.w(new c(NetworkChangeNotifierAutoDetect.t(network)));
                    if (r != null) {
                        r.close();
                    }
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

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            TraceEvent r = TraceEvent.r("NetworkChangeNotifierCallback::onLost");
            try {
                Network network2 = this.a;
                boolean z = true;
                if ((network2 == null || network2.equals(network)) ? false : true) {
                    if (r != null) {
                        r.close();
                        return;
                    }
                    return;
                }
                Network network3 = this.a;
                if (network3 == null || !network3.equals(network)) {
                    z = false;
                }
                NetworkChangeNotifierAutoDetect.this.w(new d(network, z));
                if (this.a != null) {
                    this.a = null;
                    for (Network network4 : NetworkChangeNotifierAutoDetect.n(NetworkChangeNotifierAutoDetect.this.f8614g, network)) {
                        onAvailable(network4);
                    }
                    NetworkChangeNotifierAutoDetect.this.w(new RunnableC0399e(NetworkChangeNotifierAutoDetect.this.o().c()));
                }
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
    }

    public static class f {
        private final boolean a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8621c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8622d;

        /* renamed from: e, reason: collision with root package name */
        private final String f8623e;

        /* renamed from: f, reason: collision with root package name */
        private final List<InetAddress> f8624f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f8625g;
        private final String h;

        public f(boolean z, int i, int i2, boolean z2, String str, List<InetAddress> list, boolean z3, String str2) {
            this.a = z;
            this.b = i;
            this.f8621c = i2;
            this.f8622d = z2;
            this.f8623e = str == null ? "" : str;
            this.f8624f = list == null ? new ArrayList<>() : list;
            this.f8625g = z3;
            this.h = str2 == null ? "" : str2;
        }

        public int a() {
            return this.f8622d ? 2 : 1;
        }

        public int b() {
            if (!this.a) {
                return 1;
            }
            int i = this.b;
            if (i != 0 && i != 4 && i != 5) {
                return 0;
            }
            switch (this.f8621c) {
            }
            return 0;
        }

        public int c() {
            if (this.a) {
                return NetworkChangeNotifierAutoDetect.a(this.b, this.f8621c);
            }
            return 6;
        }

        public List<InetAddress> d() {
            return this.f8624f;
        }

        public String e() {
            return this.f8623e;
        }

        public String f() {
            return this.h;
        }

        public boolean g() {
            return this.f8625g;
        }
    }

    public interface g {
    }

    public static abstract class h {
        private NetworkChangeNotifierAutoDetect a;

        protected abstract void a();

        protected void b(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
            this.a = networkChangeNotifierAutoDetect;
        }

        protected final void c() {
            this.a.u();
        }

        protected final void d() {
            this.a.x();
        }
    }

    static class i {
    }

    public NetworkChangeNotifierAutoDetect(g gVar, h hVar) {
        Looper myLooper = Looper.myLooper();
        this.a = myLooper;
        this.b = new Handler(myLooper);
        this.f8611d = gVar;
        this.f8614g = new c(com.ttnet.org.chromium.base.c.b());
        int i2 = Build.VERSION.SDK_INT;
        this.h = new e(null);
        this.i = new NetworkRequest.Builder().addCapability(12).removeCapability(15).build();
        if (i2 >= 30) {
            this.f8613f = new b(null);
        } else {
            this.f8613f = i2 >= 28 ? new d(null) : null;
        }
        this.k = o();
        this.f8610c = new NetworkConnectivityIntentFilter();
        this.l = false;
        this.m = false;
        this.f8612e = hVar;
        hVar.b(this);
        this.m = true;
    }

    static int a(int i2, int i3) {
        if (i2 != 0) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 != 4 && i2 != 5) {
                if (i2 != 6) {
                    if (i2 != 7) {
                        return i2 != 9 ? 0 : 1;
                    }
                    return 7;
                }
                return 5;
            }
        }
        if (i3 == 20) {
            return 8;
        }
        switch (i3) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 3;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 4;
            case 13:
                return 5;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        l(o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(f fVar) {
        if (fVar.c() != this.k.c() || !fVar.e().equals(this.k.e()) || !fVar.d().equals(this.k.d()) || fVar.g() != this.k.g() || !fVar.f().equals(this.k.f())) {
            g gVar = this.f8611d;
            NetworkChangeNotifier.a(NetworkChangeNotifier.this, fVar.c());
        }
        if (fVar.c() != this.k.c() || fVar.b() != this.k.b()) {
            g gVar2 = this.f8611d;
            NetworkChangeNotifier.this.d(fVar.b());
        }
        if (fVar.a() != this.k.a()) {
            g gVar3 = this.f8611d;
            NetworkChangeNotifier.this.c(fVar.a());
        }
        this.k = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Network[] n(c cVar, Network network) {
        NetworkCapabilities d2;
        Network[] a2 = cVar.a();
        int i2 = 0;
        for (Network network2 : a2) {
            if (network2 != null && !network2.equals(network) && (d2 = cVar.d(network2)) != null && d2.hasCapability(12)) {
                if (!d2.hasTransport(4)) {
                    a2[i2] = network2;
                    i2++;
                } else if (cVar.k(network2)) {
                    return new Network[]{network2};
                }
            }
        }
        return (Network[]) Arrays.copyOf(a2, i2);
    }

    public static long t(Network network) {
        if (network == null) {
            return 0L;
        }
        return network.getNetworkHandle();
    }

    public void m() {
        this.f8612e.a();
        x();
    }

    public f o() {
        return this.f8614g.f(null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        w(new a());
    }

    public long p() {
        Network c2 = this.f8614g.c();
        if (c2 == null) {
            return -1L;
        }
        return t(c2);
    }

    public long[] q() {
        Network[] n = n(this.f8614g, null);
        long[] jArr = new long[n.length * 2];
        int i2 = 0;
        for (Network network : n) {
            int i3 = i2 + 1;
            jArr[i2] = t(network);
            i2 = i3 + 1;
            jArr[i3] = this.f8614g.b(r5);
        }
        return jArr;
    }

    public long r() {
        e eVar = this.h;
        if (eVar == null) {
            return -1L;
        }
        return eVar.a();
    }

    public /* synthetic */ void s(Runnable runnable) {
        if (this.j) {
            runnable.run();
        }
    }

    public void u() {
        if (this.j) {
            k();
            return;
        }
        if (this.m) {
            k();
        }
        ConnectivityManager.NetworkCallback networkCallback = this.f8613f;
        if (networkCallback != null) {
            try {
                this.f8614g.h(networkCallback, this.b);
            } catch (RuntimeException unused) {
                this.f8613f = null;
            }
        }
        if (this.f8613f == null) {
            try {
                this.l = com.ttnet.org.chromium.base.c.b().registerReceiver(this, this.f8610c) != null;
            } catch (RuntimeException unused2) {
                this.l = false;
            }
        }
        this.j = true;
        e eVar = this.h;
        if (eVar != null) {
            eVar.c();
            try {
                this.f8614g.i(this.i, this.h, this.b);
            } catch (RuntimeException unused3) {
                this.n = true;
                this.h = null;
            }
            if (this.n || !this.m) {
                return;
            }
            Network[] n = n(this.f8614g, null);
            long[] jArr = new long[n.length];
            for (int i2 = 0; i2 < n.length; i2++) {
                jArr[i2] = t(n[i2]);
            }
            NetworkChangeNotifier.this.j(jArr);
        }
    }

    public boolean v() {
        return this.n;
    }

    public void w(final Runnable runnable) {
        if (this.a == Looper.myLooper()) {
            runnable.run();
        } else {
            this.b.post(new Runnable() { // from class: com.ttnet.org.chromium.net.a
                @Override // java.lang.Runnable
                public final void run() {
                    NetworkChangeNotifierAutoDetect.this.s(runnable);
                }
            });
        }
    }

    public void x() {
        if (this.j) {
            this.j = false;
            e eVar = this.h;
            if (eVar != null) {
                this.f8614g.j(eVar);
            }
            ConnectivityManager.NetworkCallback networkCallback = this.f8613f;
            if (networkCallback != null) {
                this.f8614g.j(networkCallback);
            } else {
                com.ttnet.org.chromium.base.c.b().unregisterReceiver(this);
            }
        }
    }
}
