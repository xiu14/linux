package com.ttnet.org.chromium.net.urlconnection;

import java.io.EOFException;

/* loaded from: classes2.dex */
public final class h {
    private Segment a = null;
    public int b = 0;

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3)));
        }
    }

    private int d(byte[] bArr, int i, int i2) {
        a(bArr.length, i, i2);
        Segment segment = this.a;
        if (segment == null) {
            return -1;
        }
        int innerBufferTo = segment.getInnerBufferTo(bArr, i, i2);
        if (com.ttnet.org.chromium.base.e.b()) {
            com.ttnet.org.chromium.base.e.a("TTBuffer", "head curReadLength is " + innerBufferTo);
        }
        this.b -= innerBufferTo;
        if (!segment.getInnerBuffer().hasRemaining()) {
            this.a = segment.release();
        }
        return innerBufferTo;
    }

    public byte b() {
        if (this.b <= 0) {
            return (byte) 0;
        }
        byte[] bArr = new byte[1];
        d(bArr, 0, 1);
        return bArr[0];
    }

    Segment c() {
        Segment segment = this.a;
        if (segment != null) {
            Segment segment2 = segment.prev;
            if (!segment2.isWritable()) {
                segment2.push(SegmentPool.take());
            }
            return this.a.prev;
        }
        Segment take = SegmentPool.take();
        this.a = take;
        take.prev = take;
        take.next = take;
        return take;
    }

    public int e(byte[] bArr, int i, int i2) throws EOFException {
        a(bArr.length, i, i2);
        int min = Math.min(this.b, i2);
        if (com.ttnet.org.chromium.base.e.b()) {
            StringBuilder M = e.a.a.a.a.M("start get buffer, size is ");
            M.append(this.b);
            M.append(" byteCount is ");
            M.append(i2);
            com.ttnet.org.chromium.base.e.a("TTBuffer", M.toString());
        }
        int i3 = i;
        while (min > 0) {
            int d2 = d(bArr, i3, min);
            if (d2 == -1) {
                throw new EOFException();
            }
            i3 += d2;
            min -= d2;
            if (com.ttnet.org.chromium.base.e.b()) {
                StringBuilder O = e.a.a.a.a.O("get segment buffer, n is ", d2, " offset is ", i3, " bytesRead is ");
                O.append(min);
                com.ttnet.org.chromium.base.e.a("TTBuffer", O.toString());
            }
        }
        return i3 - i;
    }

    public void f() {
        while (true) {
            Segment segment = this.a;
            if (segment == null) {
                return;
            } else {
                this.a = segment.release();
            }
        }
    }
}
