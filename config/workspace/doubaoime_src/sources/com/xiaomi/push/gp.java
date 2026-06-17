package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.ax;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class gp {
    private static final AtomicInteger a = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    public static boolean f506a;

    /* renamed from: a, reason: collision with other field name */
    protected gq f509a;

    /* renamed from: a, reason: collision with other field name */
    protected XMPushService f511a;

    /* renamed from: a, reason: collision with other field name */
    protected int f507a = 0;

    /* renamed from: a, reason: collision with other field name */
    protected long f508a = -1;

    /* renamed from: b, reason: collision with other field name */
    protected volatile long f517b = 0;

    /* renamed from: c, reason: collision with other field name */
    protected volatile long f520c = 0;

    /* renamed from: a, reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f514a = new LinkedList<>();

    /* renamed from: a, reason: collision with other field name */
    private final Collection<gs> f513a = new CopyOnWriteArraySet();

    /* renamed from: a, reason: collision with other field name */
    protected final Map<gu, a> f515a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with other field name */
    protected final Map<gu, a> f519b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with other field name */
    protected gy f510a = null;

    /* renamed from: a, reason: collision with other field name */
    protected String f512a = "";

    /* renamed from: b, reason: collision with other field name */
    protected String f518b = "";

    /* renamed from: a, reason: collision with other field name */
    protected AtomicBoolean f516a = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private int f9110c = 2;
    protected final int b = a.getAndIncrement();

    /* renamed from: e, reason: collision with root package name */
    private long f9112e = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f9111d = 0;

    static {
        f506a = false;
        try {
            f506a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        gv.m448a();
    }

    protected gp(XMPushService xMPushService, gq gqVar) {
        this.f509a = gqVar;
        this.f511a = xMPushService;
        m441b();
    }

    private String a(int i) {
        return i == 1 ? "connected" : i == 0 ? "connecting" : i == 2 ? "disconnected" : "unknown";
    }

    /* renamed from: a, reason: collision with other method in class */
    public gq m437a() {
        return this.f509a;
    }

    public abstract void a(hd hdVar);

    public abstract void a(ax.b bVar);

    public abstract void a(String str, String str2);

    public abstract void a(gg[] ggVarArr);

    /* renamed from: a */
    public boolean mo431a() {
        return false;
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(gg ggVar);

    public abstract void b(boolean z);

    /* renamed from: b, reason: collision with other method in class */
    public boolean m442b() {
        return this.f516a.compareAndSet(true, false);
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m443c() {
        return this.f9110c == 0;
    }

    /* renamed from: d, reason: collision with other method in class */
    public boolean m444d() {
        return this.f9110c == 1;
    }

    public static class a {
        private gu a;

        /* renamed from: a, reason: collision with other field name */
        private gz f521a;

        public a(gu guVar, gz gzVar) {
            this.a = guVar;
            this.f521a = gzVar;
        }

        public void a(hd hdVar) {
            gz gzVar = this.f521a;
            if (gzVar == null || gzVar.mo226a(hdVar)) {
                this.a.a(hdVar);
            }
        }

        public void a(gg ggVar) {
            this.a.a(ggVar);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String mo438a() {
        return this.f509a.c();
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m440b() {
        return this.f509a.b();
    }

    public synchronized void c() {
        this.f9112e = SystemClock.elapsedRealtime();
    }

    public void d() {
        synchronized (this.f514a) {
            this.f514a.clear();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m436a() {
        return this.f520c;
    }

    public void b(gs gsVar) {
        this.f513a.remove(gsVar);
    }

    public void a(gs gsVar) {
        if (gsVar == null || this.f513a.contains(gsVar)) {
            return;
        }
        this.f513a.add(gsVar);
    }

    public void b(gu guVar, gz gzVar) {
        Objects.requireNonNull(guVar, "Packet listener is null.");
        this.f519b.put(guVar, new a(guVar, gzVar));
    }

    public void a(gu guVar, gz gzVar) {
        Objects.requireNonNull(guVar, "Packet listener is null.");
        this.f515a.put(guVar, new a(guVar, gzVar));
    }

    public void b(gu guVar) {
        this.f519b.remove(guVar);
    }

    /* renamed from: b, reason: collision with other method in class */
    protected void m441b() {
        String str;
        if (this.f509a.m446a() && this.f510a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (cls == null) {
                this.f510a = new go(this);
                return;
            }
            try {
                this.f510a = (gy) cls.getConstructor(gp.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e3) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e3);
            }
        }
    }

    public void a(gu guVar) {
        this.f515a.remove(guVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    protected Map<gu, a> m439a() {
        return this.f515a;
    }

    public int a() {
        return this.f507a;
    }

    public void a(int i, int i2, Exception exc) {
        int i3 = this.f9110c;
        if (i != i3) {
            com.xiaomi.channel.commonutils.logger.c.m15a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(i3), a(i), com.xiaomi.push.service.ay.a(i2)));
        }
        if (ax.m117a((Context) this.f511a)) {
            m435a(i);
        }
        if (i == 1) {
            this.f511a.a(10);
            if (this.f9110c != 0) {
                com.xiaomi.channel.commonutils.logger.c.m15a("try set connected while not connecting.");
            }
            this.f9110c = i;
            Iterator<gs> it2 = this.f513a.iterator();
            while (it2.hasNext()) {
                it2.next().b(this);
            }
            return;
        }
        if (i == 0) {
            if (this.f9110c != 2) {
                com.xiaomi.channel.commonutils.logger.c.m15a("try set connecting while not disconnected.");
            }
            this.f9110c = i;
            Iterator<gs> it3 = this.f513a.iterator();
            while (it3.hasNext()) {
                it3.next().a(this);
            }
            return;
        }
        if (i == 2) {
            this.f511a.a(10);
            int i4 = this.f9110c;
            if (i4 == 0) {
                Iterator<gs> it4 = this.f513a.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                Iterator<gs> it5 = this.f513a.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, i2, exc);
                }
            }
            this.f9110c = i;
        }
    }

    public int b() {
        return this.f9110c;
    }

    public synchronized void a(String str) {
        if (this.f9110c == 0) {
            com.xiaomi.channel.commonutils.logger.c.m15a("setChallenge hash = " + bl.a(str).substring(0, 8));
            this.f512a = str;
            a(1, 0, null);
        } else {
            com.xiaomi.channel.commonutils.logger.c.m15a("ignore setChallenge because connection was disconnected");
        }
    }

    public synchronized boolean a(long j) {
        return this.f9112e >= j;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m435a(int i) {
        synchronized (this.f514a) {
            if (i == 1) {
                this.f514a.clear();
            } else {
                this.f514a.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f514a.size() > 6) {
                    this.f514a.remove(0);
                }
            }
        }
    }
}
