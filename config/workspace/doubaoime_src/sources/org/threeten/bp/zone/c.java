package org.threeten.bp.zone;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.l;

/* loaded from: classes2.dex */
public final class c extends h {

    /* renamed from: c, reason: collision with root package name */
    private List<String> f10886c;

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentNavigableMap<String, a> f10887d = new ConcurrentSkipListMap();

    static class a {
        private final String a;
        private final String[] b;

        /* renamed from: c, reason: collision with root package name */
        private final short[] f10888c;

        /* renamed from: d, reason: collision with root package name */
        private final AtomicReferenceArray<Object> f10889d;

        a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f10889d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.f10888c = sArr;
        }

        e b(short s) throws Exception {
            Object obj = this.f10889d.get(s);
            if (obj instanceof byte[]) {
                DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
                byte readByte = dataInputStream.readByte();
                if (readByte == 1) {
                    obj = b.j(dataInputStream);
                } else if (readByte == 2) {
                    long a = org.threeten.bp.zone.a.a(dataInputStream);
                    l b = org.threeten.bp.zone.a.b(dataInputStream);
                    l b2 = org.threeten.bp.zone.a.b(dataInputStream);
                    if (b.equals(b2)) {
                        throw new IllegalArgumentException("Offsets must not be equal");
                    }
                    obj = new d(a, b, b2);
                } else {
                    if (readByte != 3) {
                        throw new StreamCorruptedException("Unknown serialized type");
                    }
                    obj = ZoneOffsetTransitionRule.b(dataInputStream);
                }
                this.f10889d.set(s, obj);
            }
            return (e) obj;
        }

        e c(String str) {
            int binarySearch = Arrays.binarySearch(this.b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                return b(this.f10888c[binarySearch]);
            } catch (Exception e2) {
                StringBuilder U = e.a.a.a.a.U("Invalid binary time-zone data: TZDB:", str, ", version: ");
                U.append(this.a);
                throw new f(U.toString(), e2);
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public c(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            e(inputStream);
        } catch (Exception e2) {
            throw new f("Unable to load TZDB time-zone rules", e2);
        }
    }

    private boolean e(InputStream inputStream) throws IOException, StreamCorruptedException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        }
        if (!"TZDB".equals(dataInputStream.readUTF())) {
            throw new StreamCorruptedException("File format not recognised");
        }
        int readShort = dataInputStream.readShort();
        String[] strArr = new String[readShort];
        boolean z = false;
        for (int i = 0; i < readShort; i++) {
            strArr[i] = dataInputStream.readUTF();
        }
        int readShort2 = dataInputStream.readShort();
        String[] strArr2 = new String[readShort2];
        for (int i2 = 0; i2 < readShort2; i2++) {
            strArr2[i2] = dataInputStream.readUTF();
        }
        this.f10886c = Arrays.asList(strArr2);
        int readShort3 = dataInputStream.readShort();
        Object[] objArr = new Object[readShort3];
        for (int i3 = 0; i3 < readShort3; i3++) {
            byte[] bArr = new byte[dataInputStream.readShort()];
            dataInputStream.readFully(bArr);
            objArr[i3] = bArr;
        }
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
        HashSet hashSet = new HashSet(readShort);
        for (int i4 = 0; i4 < readShort; i4++) {
            int readShort4 = dataInputStream.readShort();
            String[] strArr3 = new String[readShort4];
            short[] sArr = new short[readShort4];
            for (int i5 = 0; i5 < readShort4; i5++) {
                strArr3[i5] = strArr2[dataInputStream.readShort()];
                sArr[i5] = dataInputStream.readShort();
            }
            hashSet.add(new a(strArr[i4], strArr3, sArr, atomicReferenceArray));
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            a putIfAbsent = this.f10887d.putIfAbsent(aVar.a, aVar);
            if (putIfAbsent != null && !putIfAbsent.a.equals(aVar.a)) {
                StringBuilder M = e.a.a.a.a.M("Data already loaded for TZDB time-zone rules version: ");
                M.append(aVar.a);
                throw new f(M.toString());
            }
            z = true;
        }
        return z;
    }

    @Override // org.threeten.bp.zone.h
    protected e b(String str, boolean z) {
        org.apache.http.conn.ssl.d.k(str, "zoneId");
        e c2 = this.f10887d.lastEntry().getValue().c(str);
        if (c2 != null) {
            return c2;
        }
        throw new f(e.a.a.a.a.s("Unknown time-zone ID: ", str));
    }

    @Override // org.threeten.bp.zone.h
    protected Set<String> c() {
        return new HashSet(this.f10886c);
    }

    public String toString() {
        return "TZDB";
    }
}
