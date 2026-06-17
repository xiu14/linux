package com.ttnet.org.chromium.net.urlconnection;

import com.ttnet.org.chromium.base.annotations.UsedByReflection;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class SegmentPool {
    static long byteCount = 0;
    static Segment next = null;
    private static long sMaxPoolSize = 262144;
    private static long sMinIdleSizeSinceLastCheck = 0;
    private static long sMinPoolSize = 131072;
    private static boolean sSizesSet = false;
    private static final AtomicLong segmentAllocateTimes = new AtomicLong(0);
    private static final AtomicLong segmentReuseTimes = new AtomicLong(0);
    private static final AtomicLong segmentRequestTimes = new AtomicLong(0);

    @UsedByReflection
    public static boolean checkAndReleaseIdleSegments() {
        synchronized (SegmentPool.class) {
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a("SegmentPool", "sMinIdleSizeSinceLastCheck before reset " + (sMinIdleSizeSinceLastCheck / Segment.getSize()) + ", byteCount: " + (byteCount / Segment.getSize()));
            }
            long j = byteCount;
            long j2 = sMinPoolSize;
            if (j <= j2) {
                if (com.ttnet.org.chromium.base.e.b()) {
                    com.ttnet.org.chromium.base.e.a("SegmentPool", "will not shrink 1");
                }
                sMinIdleSizeSinceLastCheck = byteCount;
                return false;
            }
            long max = Math.max(j2, j - sMinIdleSizeSinceLastCheck);
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a("SegmentPool", "segment count want save targetByteCount " + (max / Segment.getSize()));
            }
            long j3 = byteCount;
            if (j3 <= max) {
                sMinIdleSizeSinceLastCheck = j3;
                if (com.ttnet.org.chromium.base.e.b()) {
                    com.ttnet.org.chromium.base.e.a("SegmentPool", "will not shrink 2");
                }
                return false;
            }
            releaseSegmentsToTarget(max);
            sMinIdleSizeSinceLastCheck = byteCount;
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a("SegmentPool", "segment count has been reset to " + (sMinIdleSizeSinceLastCheck / Segment.getSize()));
            }
            return true;
        }
    }

    static boolean recycle(Segment segment) {
        if (segment.next != null || segment.prev != null) {
            throw new IllegalArgumentException("Segment is still in use");
        }
        synchronized (SegmentPool.class) {
            long size = Segment.getSize();
            long j = byteCount;
            if (j + size > sMaxPoolSize) {
                if (com.ttnet.org.chromium.base.e.b()) {
                    com.ttnet.org.chromium.base.e.a("SegmentPool", "full, will not recycle this segment");
                }
                return false;
            }
            byteCount = j + size;
            segment.next = next;
            next = segment;
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a("SegmentPool", "after recycle state:当前pool中segment数量: " + (byteCount / Segment.getSize()));
            }
            return true;
        }
    }

    private static void releaseSegmentsToTarget(long j) {
        if (byteCount <= j) {
            return;
        }
        int ceil = (int) Math.ceil((byteCount - j) / Segment.getSize());
        if (com.ttnet.org.chromium.base.e.b()) {
            com.ttnet.org.chromium.base.e.a("SegmentPool", "releaseSegmentsToTarget, targetByteCount: " + j + ", segmentsToRelease: " + ceil);
        }
        for (int i = 0; i < ceil; i++) {
            take(true);
        }
    }

    public static void setSizes(long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Minimum pool size cannot be negative");
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException("Max pool size cannot be negative");
        }
        if (j > j2) {
            throw new IllegalArgumentException("Minimum pool size cannot be greater than maximum pool size");
        }
        synchronized (SegmentPool.class) {
            if (sSizesSet) {
                return;
            }
            sMinPoolSize = j;
            sMaxPoolSize = j2;
            sSizesSet = true;
            releaseSegmentsToTarget(j2);
        }
    }

    static Segment take() {
        Segment take = take(false);
        if (com.ttnet.org.chromium.base.e.b()) {
            StringBuilder M = e.a.a.a.a.M("after take state:当前pool中segment数量: ");
            M.append(byteCount / Segment.getSize());
            M.append(" 请求次数: ");
            M.append(segmentRequestTimes.get());
            M.append(" 不复用次数: ");
            M.append(segmentAllocateTimes.get());
            M.append(" 复用次数: ");
            M.append(segmentReuseTimes.get());
            M.append(" 复用率: ");
            M.append(r3.get() / r2.get());
            com.ttnet.org.chromium.base.e.a("SegmentPool", M.toString());
        }
        return take;
    }

    static Segment take(boolean z) {
        synchronized (SegmentPool.class) {
            if (com.ttnet.org.chromium.base.e.b() && !z) {
                segmentRequestTimes.incrementAndGet();
            }
            if (next == null) {
                if (z) {
                    return null;
                }
                if (com.ttnet.org.chromium.base.e.b()) {
                    segmentAllocateTimes.incrementAndGet();
                }
                return new Segment();
            }
            if (com.ttnet.org.chromium.base.e.b() && !z) {
                segmentReuseTimes.incrementAndGet();
            }
            Segment segment = next;
            next = segment.next;
            segment.next = null;
            byteCount -= Segment.getSize();
            if (com.ttnet.org.chromium.base.e.b()) {
                com.ttnet.org.chromium.base.e.a("SegmentPool", "sMinIdleSizeSinceLastCheck check if decreased, current is " + (sMinIdleSizeSinceLastCheck / Segment.getSize()));
            }
            long j = byteCount;
            if (j < sMinIdleSizeSinceLastCheck && !z) {
                sMinIdleSizeSinceLastCheck = j;
                if (com.ttnet.org.chromium.base.e.b()) {
                    com.ttnet.org.chromium.base.e.a("SegmentPool", "segment count decreased to " + (sMinIdleSizeSinceLastCheck / Segment.getSize()));
                }
            }
            return segment;
        }
    }
}
