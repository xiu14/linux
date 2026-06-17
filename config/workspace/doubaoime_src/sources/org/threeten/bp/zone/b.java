package org.threeten.bp.zone;

import java.io.DataInput;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.l;
import org.threeten.bp.zone.e;

/* loaded from: classes2.dex */
final class b extends e implements Serializable {
    private final long[] a;
    private final l[] b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f10881c;

    /* renamed from: d, reason: collision with root package name */
    private final org.threeten.bp.f[] f10882d;

    /* renamed from: e, reason: collision with root package name */
    private final l[] f10883e;

    /* renamed from: f, reason: collision with root package name */
    private final ZoneOffsetTransitionRule[] f10884f;

    /* renamed from: g, reason: collision with root package name */
    private final ConcurrentMap<Integer, d[]> f10885g = new ConcurrentHashMap();

    private b(long[] jArr, l[] lVarArr, long[] jArr2, l[] lVarArr2, ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr) {
        this.a = jArr;
        this.b = lVarArr;
        this.f10881c = jArr2;
        this.f10883e = lVarArr2;
        this.f10884f = zoneOffsetTransitionRuleArr;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < jArr2.length) {
            int i2 = i + 1;
            d dVar = new d(jArr2[i], lVarArr2[i], lVarArr2[i2]);
            if (dVar.g()) {
                arrayList.add(dVar.b());
                arrayList.add(dVar.a());
            } else {
                arrayList.add(dVar.a());
                arrayList.add(dVar.b());
            }
            i = i2;
        }
        this.f10882d = (org.threeten.bp.f[]) arrayList.toArray(new org.threeten.bp.f[arrayList.size()]);
    }

    private d[] h(int i) {
        Integer valueOf = Integer.valueOf(i);
        d[] dVarArr = this.f10885g.get(valueOf);
        if (dVarArr != null) {
            return dVarArr;
        }
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = this.f10884f;
        d[] dVarArr2 = new d[zoneOffsetTransitionRuleArr.length];
        for (int i2 = 0; i2 < zoneOffsetTransitionRuleArr.length; i2++) {
            dVarArr2[i2] = zoneOffsetTransitionRuleArr[i2].a(i);
        }
        if (i < 2100) {
            this.f10885g.putIfAbsent(valueOf, dVarArr2);
        }
        return dVarArr2;
    }

    private Object i(org.threeten.bp.f fVar) {
        l e2;
        int i = 0;
        if (this.f10884f.length > 0) {
            if (fVar.v(this.f10882d[r0.length - 1])) {
                d[] h = h(fVar.u());
                l lVar = null;
                int length = h.length;
                while (i < length) {
                    d dVar = h[i];
                    org.threeten.bp.f b = dVar.b();
                    if (dVar.g()) {
                        if (fVar.w(b)) {
                            e2 = dVar.e();
                        } else {
                            if (!fVar.w(dVar.a())) {
                                e2 = dVar.d();
                            }
                            e2 = dVar;
                        }
                    } else if (fVar.w(b)) {
                        if (fVar.w(dVar.a())) {
                            e2 = dVar.e();
                        }
                        e2 = dVar;
                    } else {
                        e2 = dVar.d();
                    }
                    if ((e2 instanceof d) || e2.equals(dVar.e())) {
                        return e2;
                    }
                    i++;
                    lVar = e2;
                }
                return lVar;
            }
        }
        int binarySearch = Arrays.binarySearch(this.f10882d, fVar);
        if (binarySearch == -1) {
            return this.f10883e[0];
        }
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        } else {
            Object[] objArr = this.f10882d;
            if (binarySearch < objArr.length - 1) {
                int i2 = binarySearch + 1;
                if (objArr[binarySearch].equals(objArr[i2])) {
                    binarySearch = i2;
                }
            }
        }
        if ((binarySearch & 1) != 0) {
            return this.f10883e[(binarySearch / 2) + 1];
        }
        org.threeten.bp.f[] fVarArr = this.f10882d;
        org.threeten.bp.f fVar2 = fVarArr[binarySearch];
        org.threeten.bp.f fVar3 = fVarArr[binarySearch + 1];
        l[] lVarArr = this.f10883e;
        int i3 = binarySearch / 2;
        l lVar2 = lVarArr[i3];
        l lVar3 = lVarArr[i3 + 1];
        return lVar3.k() > lVar2.k() ? new d(fVar2, lVar2, lVar3) : new d(fVar3, lVar2, lVar3);
    }

    static b j(DataInput dataInput) throws IOException, ClassNotFoundException {
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        for (int i = 0; i < readInt; i++) {
            jArr[i] = a.a(dataInput);
        }
        int i2 = readInt + 1;
        l[] lVarArr = new l[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            lVarArr[i3] = a.b(dataInput);
        }
        int readInt2 = dataInput.readInt();
        long[] jArr2 = new long[readInt2];
        for (int i4 = 0; i4 < readInt2; i4++) {
            jArr2[i4] = a.a(dataInput);
        }
        int i5 = readInt2 + 1;
        l[] lVarArr2 = new l[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            lVarArr2[i6] = a.b(dataInput);
        }
        int readByte = dataInput.readByte();
        ZoneOffsetTransitionRule[] zoneOffsetTransitionRuleArr = new ZoneOffsetTransitionRule[readByte];
        for (int i7 = 0; i7 < readByte; i7++) {
            zoneOffsetTransitionRuleArr[i7] = ZoneOffsetTransitionRule.b(dataInput);
        }
        return new b(jArr, lVarArr, jArr2, lVarArr2, zoneOffsetTransitionRuleArr);
    }

    @Override // org.threeten.bp.zone.e
    public l a(org.threeten.bp.d dVar) {
        long i = dVar.i();
        if (this.f10884f.length > 0) {
            if (i > this.f10881c[r7.length - 1]) {
                l[] lVarArr = this.f10883e;
                d[] h = h(org.threeten.bp.e.J(org.apache.http.conn.ssl.d.d(lVarArr[lVarArr.length - 1].k() + i, 86400L)).y());
                d dVar2 = null;
                for (int i2 = 0; i2 < h.length; i2++) {
                    dVar2 = h[i2];
                    if (i < dVar2.h()) {
                        return dVar2.e();
                    }
                }
                return dVar2.d();
            }
        }
        int binarySearch = Arrays.binarySearch(this.f10881c, i);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return this.f10883e[binarySearch + 1];
    }

    @Override // org.threeten.bp.zone.e
    public d b(org.threeten.bp.f fVar) {
        Object i = i(fVar);
        if (i instanceof d) {
            return (d) i;
        }
        return null;
    }

    @Override // org.threeten.bp.zone.e
    public List<l> c(org.threeten.bp.f fVar) {
        Object i = i(fVar);
        return i instanceof d ? ((d) i).f() : Collections.singletonList((l) i);
    }

    @Override // org.threeten.bp.zone.e
    public boolean d(org.threeten.bp.d dVar) {
        int binarySearch = Arrays.binarySearch(this.a, dVar.i());
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 2;
        }
        return !this.b[binarySearch + 1].equals(a(dVar));
    }

    @Override // org.threeten.bp.zone.e
    public boolean e() {
        return this.f10881c.length == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return Arrays.equals(this.a, bVar.a) && Arrays.equals(this.b, bVar.b) && Arrays.equals(this.f10881c, bVar.f10881c) && Arrays.equals(this.f10883e, bVar.f10883e) && Arrays.equals(this.f10884f, bVar.f10884f);
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        if (e()) {
            org.threeten.bp.d dVar = org.threeten.bp.d.f10802c;
            if (a(dVar).equals(((e.a) obj).a(dVar))) {
                return true;
            }
        }
        return false;
    }

    @Override // org.threeten.bp.zone.e
    public boolean f(org.threeten.bp.f fVar, l lVar) {
        return c(fVar).contains(lVar);
    }

    public int hashCode() {
        return (((Arrays.hashCode(this.a) ^ Arrays.hashCode(this.b)) ^ Arrays.hashCode(this.f10881c)) ^ Arrays.hashCode(this.f10883e)) ^ Arrays.hashCode(this.f10884f);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("StandardZoneRules[currentStandardOffset=");
        M.append(this.b[r1.length - 1]);
        M.append("]");
        return M.toString();
    }
}
