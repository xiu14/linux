package com.ttnet.org.chromium.base.k;

import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
final class a implements c {
    private final ReentrantReadWriteLock a = new ReentrantReadWriteLock(false);
    private Map<String, C0398a> b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private AtomicInteger f8577c = new AtomicInteger();

    @VisibleForTesting
    /* renamed from: com.ttnet.org.chromium.base.k.a$a, reason: collision with other inner class name */
    static class C0398a {
        private final int a;
        private final String b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8578c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8579d;

        /* renamed from: e, reason: collision with root package name */
        private final int f8580e;

        /* renamed from: f, reason: collision with root package name */
        private final List<Integer> f8581f = new ArrayList(1);

        C0398a(int i, String str, int i2, int i3, int i4) {
            this.a = i;
            this.b = str;
            this.f8578c = i2;
            this.f8579d = i3;
            this.f8580e = i4;
        }

        synchronized boolean a(int i, String str, int i2, int i3, int i4, int i5) {
            if (this.f8581f.size() >= 256) {
                return false;
            }
            this.f8581f.add(Integer.valueOf(i2));
            return true;
        }
    }

    a() {
        new ArrayList();
    }

    private void a(int i, String str, int i2, int i3, int i4, int i5) {
        boolean z;
        this.a.readLock().lock();
        try {
            C0398a c0398a = this.b.get(str);
            if (c0398a == null) {
                z = false;
            } else {
                if (!c0398a.a(i, str, i2, i3, i4, i5)) {
                    this.f8577c.incrementAndGet();
                }
                z = true;
            }
            if (z) {
                return;
            }
            this.a.writeLock().lock();
            try {
                C0398a c0398a2 = this.b.get(str);
                if (c0398a2 == null) {
                    if (this.b.size() >= 256) {
                        this.f8577c.incrementAndGet();
                        this.a.writeLock().unlock();
                    } else {
                        C0398a c0398a3 = new C0398a(i, str, i3, i4, i5);
                        this.b.put(str, c0398a3);
                        c0398a2 = c0398a3;
                    }
                }
                if (!c0398a2.a(i, str, i2, i3, i4, i5)) {
                    this.f8577c.incrementAndGet();
                }
                this.a.writeLock().unlock();
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        } finally {
            this.a.readLock().unlock();
        }
    }

    public void b(String str, boolean z) {
        a(1, str, z ? 1 : 0, 0, 0, 0);
    }

    public void c(String str, int i, int i2, int i3, int i4) {
        a(2, str, i, i2, i3, i4);
    }
}
