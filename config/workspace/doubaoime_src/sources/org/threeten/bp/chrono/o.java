package org.threeten.bp.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class o extends org.threeten.bp.o.a implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final o f10792d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f10793e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f10794f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f10795g;
    private static final AtomicReference<o[]> h;
    private final int a;
    private final transient org.threeten.bp.e b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f10796c;

    static {
        o oVar = new o(-1, org.threeten.bp.e.H(1868, 9, 8), "Meiji");
        f10792d = oVar;
        o oVar2 = new o(0, org.threeten.bp.e.H(1912, 7, 30), "Taisho");
        f10793e = oVar2;
        o oVar3 = new o(1, org.threeten.bp.e.H(1926, 12, 25), "Showa");
        f10794f = oVar3;
        o oVar4 = new o(2, org.threeten.bp.e.H(1989, 1, 8), "Heisei");
        f10795g = oVar4;
        h = new AtomicReference<>(new o[]{oVar, oVar2, oVar3, oVar4});
    }

    private o(int i, org.threeten.bp.e eVar, String str) {
        this.a = i;
        this.b = eVar;
        this.f10796c = str;
    }

    static o g(org.threeten.bp.e eVar) {
        o oVar;
        if (eVar.A(f10792d.b)) {
            throw new org.threeten.bp.b("Date too early: " + eVar);
        }
        o[] oVarArr = h.get();
        int length = oVarArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            oVar = oVarArr[length];
        } while (eVar.compareTo(oVar.b) < 0);
        return oVar;
    }

    public static o i(int i) {
        o[] oVarArr = h.get();
        if (i < f10792d.a || i > oVarArr[oVarArr.length - 1].a) {
            throw new org.threeten.bp.b("japaneseEra is invalid");
        }
        return oVarArr[i + 1];
    }

    public static o[] k() {
        o[] oVarArr = h.get();
        return (o[]) Arrays.copyOf(oVarArr, oVarArr.length);
    }

    org.threeten.bp.e f() {
        int i = this.a + 1;
        o[] k = k();
        return i >= k.length + (-1) ? org.threeten.bp.e.f10804e : k[i + 1].b.E(1L);
    }

    public int h() {
        return this.a;
    }

    org.threeten.bp.e j() {
        return this.b;
    }

    void l(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.a);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        ChronoField chronoField = ChronoField.ERA;
        return eVar == chronoField ? m.f10786d.p(chronoField) : super.range(eVar);
    }

    public String toString() {
        return this.f10796c;
    }
}
