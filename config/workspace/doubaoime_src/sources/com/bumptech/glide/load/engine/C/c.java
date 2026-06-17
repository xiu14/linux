package com.bumptech.glide.load.engine.C;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
final class c {
    private final Map<String, a> a = new HashMap();
    private final b b = new b();

    private static class a {
        final Lock a = new ReentrantLock();
        int b;

        a() {
        }
    }

    private static class b {
        private final Queue<a> a = new ArrayDeque();

        b() {
        }

        a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new a() : poll;
        }

        void b(a aVar) {
            synchronized (this.a) {
                if (this.a.size() < 10) {
                    this.a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.a.get(str);
            if (aVar == null) {
                aVar = this.b.a();
                this.a.put(str, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.a.get(str);
            Objects.requireNonNull(aVar2, "Argument must not be null");
            aVar = aVar2;
            int i = aVar.b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.b);
            }
            int i2 = i - 1;
            aVar.b = i2;
            if (i2 == 0) {
                a remove = this.a.remove(str);
                if (!remove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                }
                this.b.b(remove);
            }
        }
        aVar.a.unlock();
    }
}
