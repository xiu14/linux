package com.bytedance.ug.sdk.pangolin;

import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {
    public static b<ByteBuffer, Long> a(FileChannel fileChannel) throws IOException, c {
        long size = fileChannel.size();
        if (size < 22) {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
        long j = size - 22;
        long min = Math.min(j, 65535L);
        int i = 0;
        while (true) {
            long j2 = i;
            if (j2 > min) {
                throw new IOException("ZIP End of Central Directory (EOCD) record not found");
            }
            long j3 = j - j2;
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel.position(j3);
            fileChannel.read(allocate);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            if (allocate.getInt(0) == 101010256) {
                ByteBuffer allocate2 = ByteBuffer.allocate(2);
                fileChannel.position(j3 + 20);
                fileChannel.read(allocate2);
                allocate2.order(byteOrder);
                short s = allocate2.getShort(0);
                if (s == i) {
                    ByteBuffer allocate3 = ByteBuffer.allocate(4);
                    allocate3.order(byteOrder);
                    fileChannel.position((fileChannel.size() - s) - 6);
                    fileChannel.read(allocate3);
                    long j4 = allocate3.getInt(0);
                    if (j4 < 0) {
                        fileChannel.read(allocate3);
                        byte[] bArr = new byte[8];
                        for (int i2 = 4; i2 < 8; i2++) {
                            bArr[i2] = allocate3.get((8 - i2) - 1);
                        }
                        j4 = ByteBuffer.wrap(bArr).getLong();
                    }
                    if (j4 < 32) {
                        throw new c(e.a.a.a.a.n("APK too small for APK Signing Block. ZIP Central Directory offset: ", j4));
                    }
                    fileChannel.position(j4 - 24);
                    ByteBuffer allocate4 = ByteBuffer.allocate(24);
                    fileChannel.read(allocate4);
                    ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                    allocate4.order(byteOrder2);
                    if (allocate4.getLong(8) != 2334950737559900225L || allocate4.getLong(16) != 3617552046287187010L) {
                        throw new c("No APK Signing Block before ZIP Central Directory");
                    }
                    long j5 = allocate4.getLong(0);
                    if (j5 < allocate4.capacity() || j5 > 2147483639) {
                        throw new c(e.a.a.a.a.n("APK Signing Block size out of range: ", j5));
                    }
                    int i3 = (int) (8 + j5);
                    long j6 = j4 - i3;
                    if (j6 < 0) {
                        throw new c(e.a.a.a.a.n("APK Signing Block offset out of range: ", j6));
                    }
                    fileChannel.position(j6);
                    ByteBuffer allocate5 = ByteBuffer.allocate(i3);
                    fileChannel.read(allocate5);
                    allocate5.order(byteOrder2);
                    long j7 = allocate5.getLong(0);
                    if (j7 == j5) {
                        return b.b(allocate5, Long.valueOf(j6));
                    }
                    StringBuilder Q = e.a.a.a.a.Q("APK Signing Block sizes in header and footer do not match: ", j7, " vs ");
                    Q.append(j5);
                    throw new c(Q.toString());
                }
            }
            i++;
        }
    }

    public static Map<Integer, ByteBuffer> b(ByteBuffer byteBuffer) throws c {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        int capacity = byteBuffer.capacity() - 24;
        if (capacity < 8) {
            throw new IllegalArgumentException(e.a.a.a.a.l("end < start: ", capacity, " < ", 8));
        }
        int capacity2 = byteBuffer.capacity();
        if (capacity > byteBuffer.capacity()) {
            throw new IllegalArgumentException(e.a.a.a.a.l("end > capacity: ", capacity, " > ", capacity2));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i = 0;
        try {
            byteBuffer.position(0);
            byteBuffer.limit(capacity);
            byteBuffer.position(8);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (slice.hasRemaining()) {
                i++;
                if (slice.remaining() < 8) {
                    throw new c(e.a.a.a.a.j("Insufficient data to read size of APK Signing Block entry #", i));
                }
                long j = slice.getLong();
                if (j < 4 || j > 2147483647L) {
                    throw new c("APK Signing Block entry #" + i + " size out of range: " + j);
                }
                int i2 = (int) j;
                int position2 = slice.position() + i2;
                if (i2 > slice.remaining()) {
                    StringBuilder O = e.a.a.a.a.O("APK Signing Block entry #", i, " size out of range: ", i2, ", available: ");
                    O.append(slice.remaining());
                    throw new c(O.toString());
                }
                Integer valueOf = Integer.valueOf(slice.getInt());
                int i3 = i2 - 4;
                if (i3 < 0) {
                    throw new IllegalArgumentException(e.a.a.a.a.j("size: ", i3));
                }
                int limit2 = slice.limit();
                int position3 = slice.position();
                int i4 = i3 + position3;
                if (i4 < position3 || i4 > limit2) {
                    throw new BufferUnderflowException();
                }
                slice.limit(i4);
                try {
                    ByteBuffer slice2 = slice.slice();
                    slice2.order(slice.order());
                    slice.position(i4);
                    slice.limit(limit2);
                    linkedHashMap.put(valueOf, slice2);
                    slice.position(position2);
                } catch (Throwable th) {
                    slice.limit(limit2);
                    throw th;
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
            throw th2;
        }
    }
}
