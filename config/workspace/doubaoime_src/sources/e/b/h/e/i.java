package e.b.h.e;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class i implements Closeable {
    private final FileChannel a;

    public i(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.a = new FileInputStream(file).getChannel();
    }

    public List<String> a() throws IOException {
        d hVar;
        long j;
        c a;
        long j2;
        this.a.position(0L);
        ArrayList arrayList = new ArrayList();
        this.a.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        allocate.order(byteOrder);
        if (h(allocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        d(allocate, 4L, 1);
        short s = (short) (allocate.get() & 255);
        d(allocate, 5L, 1);
        int i = 0;
        boolean z = ((short) (allocate.get() & 255)) == 2;
        if (s == 1) {
            hVar = new g(z, this);
        } else {
            if (s != 2) {
                throw new IllegalStateException("Invalid class type!");
            }
            hVar = new h(z, this);
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(8);
        if (hVar.a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        allocate2.order(byteOrder);
        long j3 = hVar.f9556e;
        if (j3 == 65535) {
            j3 = hVar.c(0).a;
        }
        long j4 = 0;
        while (true) {
            if (j4 >= j3) {
                j = 0;
                break;
            }
            e b = hVar.b(j4);
            if (b.a == 2) {
                j = b.b;
                break;
            }
            j4++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j5 = 0;
        do {
            a = hVar.a(j, i);
            long j6 = a.a;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a.b));
            } else if (j6 == 5) {
                j5 = a.b;
            }
            i++;
        } while (a.a != 0);
        if (j5 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long j7 = 0;
        while (j7 < j3) {
            e b2 = hVar.b(j7);
            if (b2.a == 1) {
                long j8 = b2.f9558c;
                if (j8 <= j5) {
                    j2 = j3;
                    if (j5 <= b2.f9559d + j8) {
                        long j9 = (j5 - j8) + b2.b;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            long longValue = ((Long) it2.next()).longValue() + j9;
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                long j10 = longValue + 1;
                                d(allocate2, longValue, 1);
                                short s2 = (short) (allocate2.get() & 255);
                                if (s2 != 0) {
                                    sb.append((char) s2);
                                    longValue = j10;
                                }
                            }
                            arrayList.add(sb.toString());
                        }
                        return arrayList;
                    }
                    j7++;
                    j3 = j2;
                }
            }
            j2 = j3;
            j7++;
            j3 = j2;
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    protected void d(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.a.read(byteBuffer, j + j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 += read;
        }
        byteBuffer.position(0);
    }

    protected long h(ByteBuffer byteBuffer, long j) throws IOException {
        d(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
