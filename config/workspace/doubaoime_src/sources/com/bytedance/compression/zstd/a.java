package com.bytedance.compression.zstd;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
abstract class a implements Closeable {
    private static final int SHARED_LOCK_CLOSED = -1;
    private static final AtomicIntegerFieldUpdater<a> SHARED_LOCK_UPDATER = AtomicIntegerFieldUpdater.newUpdater(a.class, "sharedLock");
    private volatile int sharedLock;

    a() {
    }

    void acquireSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i == Integer.MAX_VALUE) {
                throw new IllegalStateException("Shared lock overflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i + 1));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.sharedLock == -1) {
                return;
            }
            if (!SHARED_LOCK_UPDATER.compareAndSet(this, 0, -1)) {
                throw new IllegalStateException("Attempt to close while in use");
            }
            doClose();
        }
    }

    abstract void doClose();

    void releaseSharedLock() {
        int i;
        do {
            i = this.sharedLock;
            if (i < 0) {
                throw new IllegalStateException("Closed");
            }
            if (i == 0) {
                throw new IllegalStateException("Shared lock underflow");
            }
        } while (!SHARED_LOCK_UPDATER.compareAndSet(this, i, i - 1));
    }

    void storeFence() {
        this.sharedLock = 0;
    }
}
