package com.facebook.cache.disk;

import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.cache.disk.DefaultDiskStorage;
import com.facebook.cache.disk.c;
import com.facebook.common.statfs.StatFsHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class d implements i, e.c.c.a.a {
    private static final long q = TimeUnit.HOURS.toMillis(2);
    private static final long r = TimeUnit.MINUTES.toMillis(30);
    private final long a;
    private final long b;

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f6297c;

    /* renamed from: d, reason: collision with root package name */
    private long f6298d;

    /* renamed from: e, reason: collision with root package name */
    private final com.facebook.cache.common.d f6299e;

    /* renamed from: f, reason: collision with root package name */
    final Set<String> f6300f;

    /* renamed from: g, reason: collision with root package name */
    private long f6301g;
    private final long h;
    private final StatFsHelper i;
    private final com.facebook.cache.disk.c j;
    private final h k;
    private final CacheErrorLogger l;
    private final boolean m;
    private final b n;
    private final com.facebook.common.time.a o;
    private final Object p = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (d.this.p) {
                d.this.o();
            }
            Objects.requireNonNull(d.this);
            d.this.f6297c.countDown();
        }
    }

    static class b {
        private boolean a = false;
        private long b = -1;

        /* renamed from: c, reason: collision with root package name */
        private long f6302c = -1;

        b() {
        }

        public synchronized long a() {
            return this.f6302c;
        }

        public synchronized long b() {
            return this.b;
        }

        public synchronized void c(long j, long j2) {
            if (this.a) {
                this.b += j;
                this.f6302c += j2;
            }
        }

        public synchronized boolean d() {
            return this.a;
        }

        public synchronized void e() {
            this.a = false;
            this.f6302c = -1L;
            this.b = -1L;
        }

        public synchronized void f(long j, long j2) {
            this.f6302c = j2;
            this.b = j;
            this.a = true;
        }
    }

    public static class c {
        public final long a;
        public final long b;

        /* renamed from: c, reason: collision with root package name */
        public final long f6303c;

        public c(long j, long j2, long j3) {
            this.a = j;
            this.b = j2;
            this.f6303c = j3;
        }
    }

    public d(com.facebook.cache.disk.c cVar, h hVar, c cVar2, CacheEventListener cacheEventListener, CacheErrorLogger cacheErrorLogger, e.c.c.a.b bVar, Executor executor, boolean z) {
        this.a = cVar2.b;
        long j = cVar2.f6303c;
        this.b = j;
        this.f6298d = j;
        this.i = StatFsHelper.b();
        this.j = cVar;
        this.k = hVar;
        this.f6301g = -1L;
        com.facebook.cache.common.d dVar = new com.facebook.cache.common.d();
        this.f6299e = dVar;
        dVar.i(cacheEventListener);
        this.h = cVar2.a;
        this.l = cacheErrorLogger;
        this.n = new b();
        this.o = com.facebook.common.time.c.a();
        this.m = z;
        this.f6300f = new HashSet();
        if (!z) {
            this.f6297c = new CountDownLatch(0);
        } else {
            this.f6297c = new CountDownLatch(1);
            executor.execute(new a());
        }
    }

    private void m(long j, CacheEventListener.EvictionReason evictionReason) throws IOException {
        try {
            Collection<c.a> n = n(this.j.j());
            long b2 = this.n.b() - j;
            int i = 0;
            Iterator it2 = ((ArrayList) n).iterator();
            long j2 = 0;
            while (it2.hasNext()) {
                c.a aVar = (c.a) it2.next();
                if (j2 > b2) {
                    break;
                }
                long l = this.j.l(aVar);
                this.f6300f.remove(aVar.getId());
                this.j.b(aVar.getId());
                if (l > 0) {
                    i++;
                    j2 += l;
                    j a2 = j.a();
                    aVar.getId();
                    this.f6299e.b(a2);
                    a2.b();
                }
            }
            this.n.c(-j2, -i);
            this.j.c();
        } catch (IOException e2) {
            CacheErrorLogger cacheErrorLogger = this.l;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
            e2.getMessage();
            Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            throw e2;
        }
    }

    private Collection<c.a> n(Collection<c.a> collection) {
        Objects.requireNonNull((com.facebook.common.time.c) this.o);
        long currentTimeMillis = System.currentTimeMillis() + q;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (c.a aVar : collection) {
            if (aVar.b() > currentTimeMillis) {
                arrayList.add(aVar);
            } else {
                arrayList2.add(aVar);
            }
        }
        Collections.sort(arrayList2, this.k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean o() {
        Set<String> set;
        long j;
        Objects.requireNonNull((com.facebook.common.time.c) this.o);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        if (this.n.d()) {
            long j3 = this.f6301g;
            if (j3 != -1 && currentTimeMillis - j3 <= r) {
                return false;
            }
        }
        Objects.requireNonNull((com.facebook.common.time.c) this.o);
        long currentTimeMillis2 = System.currentTimeMillis();
        long j4 = q + currentTimeMillis2;
        Set<String> hashSet = (this.m && this.f6300f.isEmpty()) ? this.f6300f : this.m ? new HashSet<>() : null;
        try {
            long j5 = 0;
            boolean z = false;
            int i = 0;
            for (c.a aVar : this.j.j()) {
                i++;
                j5 += aVar.a();
                if (aVar.b() > j4) {
                    aVar.a();
                    j = j4;
                    j2 = Math.max(aVar.b() - currentTimeMillis2, j2);
                    z = true;
                } else {
                    j = j4;
                    if (this.m) {
                        hashSet.add(aVar.getId());
                    }
                }
                j4 = j;
            }
            if (z) {
                CacheErrorLogger cacheErrorLogger = this.l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.READ_INVALID_ENTRY;
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            }
            long j6 = i;
            if (this.n.a() != j6 || this.n.b() != j5) {
                if (this.m && (set = this.f6300f) != hashSet) {
                    set.clear();
                    this.f6300f.addAll(hashSet);
                }
                this.n.f(j5, j6);
            }
            s();
            this.f6301g = currentTimeMillis2;
            return true;
        } catch (IOException e2) {
            CacheErrorLogger cacheErrorLogger2 = this.l;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory2 = CacheErrorLogger.CacheErrorCategory.GENERIC_IO;
            e2.getMessage();
            Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger2);
            return false;
        }
    }

    private void p(String str, Collection<c.a> collection) throws IOException {
        Iterator<c.a> it2 = collection.iterator();
        while (it2.hasNext()) {
            if (str.equals(it2.next().getId())) {
                return;
            }
        }
        try {
            this.j.b(str);
        } catch (IOException e2) {
            throw e2;
        }
    }

    private c.b q(String str, com.facebook.cache.common.b bVar) throws IOException {
        synchronized (this.p) {
            boolean o = o();
            if (this.i.c(this.j.isExternal() ? StatFsHelper.StorageType.EXTERNAL : StatFsHelper.StorageType.INTERNAL, this.b - this.n.b())) {
                this.f6298d = this.a;
            } else {
                this.f6298d = this.b;
            }
            long b2 = this.n.b();
            if (b2 > this.f6298d && !o) {
                this.n.e();
                o();
            }
            long j = this.f6298d;
            if (b2 > j) {
                m((j * 9) / 10, CacheEventListener.EvictionReason.CACHE_FULL);
            }
        }
        return this.j.d(str, bVar);
    }

    private void r(double d2) {
        synchronized (this.p) {
            try {
                this.n.e();
                o();
                long b2 = this.n.b();
                m(b2 - ((long) (d2 * b2)), CacheEventListener.EvictionReason.CACHE_MANAGER_TRIMMED);
            } catch (IOException e2) {
                CacheErrorLogger cacheErrorLogger = this.l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
                e2.getMessage();
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            }
        }
    }

    private void s() {
        synchronized (this.p) {
            try {
                Collection<c.a> f2 = this.j.f();
                List<c.a> k = this.j.k();
                if (f2.size() > k.size()) {
                    Iterator<c.a> it2 = f2.iterator();
                    while (it2.hasNext()) {
                        p(it2.next().getId(), k);
                    }
                }
            } catch (IOException unused) {
                e.c.c.e.a.e(d.class, "remove config file failed");
            }
        }
    }

    @Override // com.facebook.cache.disk.i
    public long a() {
        return this.n.b();
    }

    @Override // com.facebook.cache.disk.i
    public boolean b(com.facebook.cache.common.b bVar) {
        try {
            synchronized (this.p) {
                List<String> b2 = com.facebook.cache.common.c.b(bVar);
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) b2;
                    if (i >= arrayList.size()) {
                        return false;
                    }
                    String str = (String) arrayList.get(i);
                    if (this.j.e(str, bVar)) {
                        this.f6300f.add(str);
                        return true;
                    }
                    i++;
                }
            }
        } catch (IOException unused) {
            j a2 = j.a();
            a2.c(bVar);
            this.f6299e.g(a2);
            a2.b();
            return false;
        }
    }

    @Override // com.facebook.cache.disk.i
    public Map<String, String> c(com.facebook.cache.common.b bVar) throws IOException {
        List<String> b2 = com.facebook.cache.common.c.b(bVar);
        Map<String, String> map = null;
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) b2;
            if (i >= arrayList.size()) {
                break;
            }
            map = this.j.h((String) arrayList.get(i), bVar);
            if (map != null) {
                break;
            }
            i++;
        }
        return map;
    }

    @Override // com.facebook.cache.disk.i
    public e.c.a.a d(com.facebook.cache.common.b bVar) {
        e.c.a.a aVar;
        j a2 = j.a();
        a2.c(bVar);
        try {
            synchronized (this.p) {
                List<String> b2 = com.facebook.cache.common.c.b(bVar);
                int i = 0;
                String str = null;
                aVar = null;
                while (true) {
                    ArrayList arrayList = (ArrayList) b2;
                    if (i >= arrayList.size() || (aVar = this.j.i((str = (String) arrayList.get(i)), bVar)) != null) {
                        break;
                    }
                    i++;
                }
                if (aVar == null) {
                    this.f6299e.a(a2);
                    this.f6300f.remove(str);
                } else {
                    this.f6299e.e(a2);
                    this.f6300f.add(str);
                }
            }
            return aVar;
        } catch (IOException unused) {
            CacheErrorLogger cacheErrorLogger = this.l;
            CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.GENERIC_IO;
            Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            this.f6299e.g(a2);
            return null;
        } finally {
            a2.b();
        }
    }

    @Override // e.c.c.a.a
    public void e() {
        synchronized (this.p) {
            try {
                this.j.a();
                this.f6300f.clear();
                this.f6299e.c();
            } catch (IOException | NullPointerException e2) {
                CacheErrorLogger cacheErrorLogger = this.l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.EVICTION;
                e2.getMessage();
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            }
            this.n.e();
        }
    }

    @Override // e.c.c.a.a
    public void f() {
        synchronized (this.p) {
            o();
            long b2 = this.n.b();
            long j = this.h;
            if (j > 0 && b2 > 0 && b2 >= j) {
                double d2 = 1.0d - (j / b2);
                if (d2 > 0.02d) {
                    r(d2);
                }
            }
        }
    }

    @Override // com.facebook.cache.disk.i
    public void g(com.facebook.cache.common.b bVar) {
        synchronized (this.p) {
            try {
                List<String> b2 = com.facebook.cache.common.c.b(bVar);
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) b2;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    String str = (String) arrayList.get(i);
                    this.j.remove(str);
                    this.f6300f.remove(str);
                    this.j.b(str);
                    i++;
                }
            } catch (IOException e2) {
                CacheErrorLogger cacheErrorLogger = this.l;
                CacheErrorLogger.CacheErrorCategory cacheErrorCategory = CacheErrorLogger.CacheErrorCategory.DELETE_FILE;
                e2.getMessage();
                Objects.requireNonNull((com.facebook.cache.common.f) cacheErrorLogger);
            }
        }
    }

    @Override // com.facebook.cache.disk.i
    public long getCount() {
        return this.n.a();
    }

    @Override // com.facebook.cache.disk.i
    public boolean h(com.facebook.cache.common.b bVar) {
        boolean z;
        synchronized (this.p) {
            synchronized (this.p) {
                List<String> b2 = com.facebook.cache.common.c.b(bVar);
                int i = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) b2;
                    if (i >= arrayList.size()) {
                        z = false;
                        break;
                    }
                    if (this.f6300f.contains((String) arrayList.get(i))) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (z) {
                return true;
            }
            try {
                List<String> b3 = com.facebook.cache.common.c.b(bVar);
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) b3;
                    if (i2 >= arrayList2.size()) {
                        return false;
                    }
                    String str = (String) arrayList2.get(i2);
                    if (this.j.g(str, bVar)) {
                        this.f6300f.add(str);
                        return true;
                    }
                    i2++;
                }
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // com.facebook.cache.disk.i
    public e.c.a.a i(com.facebook.cache.common.b bVar, com.facebook.cache.common.i iVar) throws IOException {
        String a2;
        e.c.a.a b2;
        j a3 = j.a();
        a3.c(bVar);
        this.f6299e.h(a3);
        synchronized (this.p) {
            a2 = com.facebook.cache.common.c.a(bVar);
            try {
            } finally {
                a3.b();
            }
        }
        try {
            c.b q2 = q(a2, bVar);
            try {
                DefaultDiskStorage.g gVar = (DefaultDiskStorage.g) q2;
                gVar.c(iVar, bVar);
                synchronized (this.p) {
                    b2 = gVar.b(bVar);
                    this.f6300f.add(a2);
                    this.n.c(b2.d(), 1L);
                }
                b2.d();
                this.n.b();
                this.f6299e.f(a3);
                if (!gVar.a()) {
                    e.c.c.e.a.e(d.class, "Failed to delete temp file");
                }
                return b2;
            } catch (Throwable th) {
                if (!((DefaultDiskStorage.g) q2).a()) {
                    e.c.c.e.a.e(d.class, "Failed to delete temp file");
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f6299e.d(a3);
            e.c.c.e.a.f(d.class, "Failed inserting a file into the cache", e2);
            throw e2;
        }
    }
}
