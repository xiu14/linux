package f;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class p extends AbstractList<h> implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public static final a f10054c = new a(null);
    private final h[] a;
    private final int[] b;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }

        private final void a(long j, e eVar, int i, List<? extends h> list, int i2, int i3, List<Integer> list2) {
            int i4;
            int i5;
            int i6;
            int i7;
            e eVar2;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(list.get(i9).f() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            h hVar = list.get(i2);
            h hVar2 = list.get(i3 - 1);
            int i10 = -1;
            if (i8 == hVar.f()) {
                int intValue = list2.get(i2).intValue();
                int i11 = i2 + 1;
                h hVar3 = list.get(i11);
                i4 = i11;
                i5 = intValue;
                hVar = hVar3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (hVar.j(i8) == hVar2.j(i8)) {
                int min = Math.min(hVar.f(), hVar2.f());
                int i12 = 0;
                for (int i13 = i8; i13 < min && hVar.j(i13) == hVar2.j(i13); i13++) {
                    i12++;
                }
                long b = j + b(eVar) + 2 + i12 + 1;
                eVar.c0(-i12);
                eVar.c0(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    eVar.c0(hVar.j(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i14 == list.get(i4).f())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    eVar.c0(list2.get(i4).intValue());
                    return;
                } else {
                    e eVar3 = new e();
                    eVar.c0(((int) (b(eVar3) + b)) * (-1));
                    a(b, eVar3, i14, list, i4, i3, list2);
                    eVar.S(eVar3);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (list.get(i16 - 1).j(i8) != list.get(i16).j(i8)) {
                    i15++;
                }
            }
            long b2 = j + b(eVar) + 2 + (i15 * 2);
            eVar.c0(i15);
            eVar.c0(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                byte j2 = list.get(i17).j(i8);
                if (i17 == i4 || j2 != list.get(i17 - 1).j(i8)) {
                    eVar.c0(j2 & 255);
                }
            }
            e eVar4 = new e();
            while (i4 < i3) {
                byte j3 = list.get(i4).j(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (j3 != list.get(i19).j(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == list.get(i4).f()) {
                    eVar.c0(list2.get(i4).intValue());
                    i7 = i6;
                    eVar2 = eVar4;
                } else {
                    eVar.c0(((int) (b2 + b(eVar4))) * i10);
                    i7 = i6;
                    eVar2 = eVar4;
                    a(b2, eVar4, i8 + 1, list, i4, i6, list2);
                }
                eVar4 = eVar2;
                i4 = i7;
                i10 = -1;
            }
            eVar.S(eVar4);
        }

        private final long b(e eVar) {
            return eVar.I() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:73:0x0164, code lost:
        
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final f.p c(f.h... r17) {
            /*
                Method dump skipped, instructions count: 446
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: f.p.a.c(f.h[]):f.p");
        }
    }

    public p(h[] hVarArr, int[] iArr, kotlin.s.c.g gVar) {
        this.a = hVarArr;
        this.b = iArr;
    }

    public final h[] a() {
        return this.a;
    }

    public final int[] b() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof h : true) {
            return super.contains((h) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        return this.a[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null ? obj instanceof h : true) {
            return super.indexOf((h) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null ? obj instanceof h : true) {
            return super.lastIndexOf((h) obj);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj != null ? obj instanceof h : true) {
            return super.remove((h) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.length;
    }
}
