package com.ttnet.org.chromium.net.urlconnection;

import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public final class Segment {
    private static int sSize = 32768;
    private static boolean sSizeInited = false;
    private static final ReentrantReadWriteLock sSizeLock = new ReentrantReadWriteLock();
    private ByteBuffer bb;
    private boolean bufferFlipped = false;
    Segment next;
    Segment prev;

    Segment() {
        getInnerBuffer();
    }

    public static int getSize() {
        ReentrantReadWriteLock reentrantReadWriteLock = sSizeLock;
        reentrantReadWriteLock.readLock().lock();
        try {
            sSizeInited = true;
            int i = sSize;
            reentrantReadWriteLock.readLock().unlock();
            return i;
        } catch (Throwable th) {
            sSizeLock.readLock().unlock();
            throw th;
        }
    }

    public static void setSize(int i) {
        if (sSizeInited) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sSizeLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!sSizeInited) {
                sSizeInited = true;
                sSize = i;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sSizeLock.writeLock().unlock();
            throw th;
        }
    }

    public void completeRead() {
        this.bb.flip();
        this.bufferFlipped = true;
    }

    public ByteBuffer getInnerBuffer() {
        if (this.bb == null) {
            this.bb = ByteBuffer.allocateDirect(getSize());
        }
        return this.bb;
    }

    public int getInnerBufferTo(byte[] bArr, int i, int i2) {
        if (!this.bufferFlipped) {
            return -1;
        }
        int min = Math.min(this.bb.remaining(), i2);
        this.bb.get(bArr, i, min);
        return min;
    }

    public boolean isWritable() {
        return !this.bufferFlipped && this.bb.hasRemaining();
    }

    public Segment pop() {
        Segment segment = this.next;
        Segment segment2 = segment != this ? segment : null;
        Segment segment3 = this.prev;
        segment3.next = segment;
        this.next.prev = segment3;
        this.next = null;
        this.prev = null;
        return segment2;
    }

    public Segment push(Segment segment) {
        segment.prev = this;
        segment.next = this.next;
        this.next.prev = segment;
        this.next = segment;
        return segment;
    }

    public Segment release() {
        this.bb.clear();
        this.bufferFlipped = false;
        Segment pop = pop();
        if (!SegmentPool.recycle(this)) {
            this.bb = null;
        }
        return pop;
    }
}
