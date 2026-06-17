package org.threeten.bp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class l extends k implements org.threeten.bp.temporal.b, org.threeten.bp.temporal.c, Comparable<l>, Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<Integer, l> f10848d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentMap<String, l> f10849e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f, reason: collision with root package name */
    public static final l f10850f = n(0);

    /* renamed from: g, reason: collision with root package name */
    public static final l f10851g = n(-64800);
    public static final l h = n(64800);
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f10852c;

    private l(int i) {
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb2.append(i < 0 ? Constants.ACCEPT_TIME_SEPARATOR_SERVER : "+");
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            sb2.append(i3 < 10 ? ":0" : Constants.COLON_SEPARATOR);
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 >= 10 ? Constants.COLON_SEPARATOR : ":0");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.f10852c = sb;
    }

    public static l j(org.threeten.bp.temporal.b bVar) {
        l lVar = (l) bVar.query(org.threeten.bp.temporal.f.d());
        if (lVar != null) {
            return lVar;
        }
        throw new b("Unable to obtain ZoneOffset from TemporalAccessor: " + bVar + ", type " + bVar.getClass().getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.threeten.bp.l l(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            org.apache.http.conn.ssl.d.k(r7, r0)
            java.util.concurrent.ConcurrentMap<java.lang.String, org.threeten.bp.l> r0 = org.threeten.bp.l.f10849e
            java.lang.Object r0 = r0.get(r7)
            org.threeten.bp.l r0 = (org.threeten.bp.l) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L59
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = o(r7, r2, r3)
            int r1 = o(r7, r6, r2)
            int r2 = o(r7, r5, r2)
            goto L85
        L37:
            org.threeten.bp.b r0 = new org.threeten.bp.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = e.a.a.a.a.s(r1, r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = o(r7, r2, r3)
            int r1 = o(r7, r1, r3)
            int r2 = o(r7, r4, r3)
            goto L85
        L50:
            int r0 = o(r7, r2, r3)
            int r1 = o(r7, r6, r2)
            goto L61
        L59:
            int r0 = o(r7, r2, r3)
            int r1 = o(r7, r1, r3)
        L61:
            r2 = r3
            goto L85
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r1 = r7.charAt(r3)
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            char r7 = r7.charAt(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L7f:
            int r0 = o(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            org.threeten.bp.b r0 = new org.threeten.bp.b
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = e.a.a.a.a.s(r1, r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            org.threeten.bp.l r7 = m(r7, r0, r1)
            return r7
        La8:
            org.threeten.bp.l r7 = m(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.l.l(java.lang.String):org.threeten.bp.l");
    }

    public static l m(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new b(e.a.a.a.a.k("Zone offset hours not in valid range: value ", i, " is not in the range -18 to 18"));
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i2) > 59) {
            StringBuilder M = e.a.a.a.a.M("Zone offset minutes not in valid range: abs(value) ");
            M.append(Math.abs(i2));
            M.append(" is not in the range 0 to 59");
            throw new b(M.toString());
        }
        if (Math.abs(i3) > 59) {
            StringBuilder M2 = e.a.a.a.a.M("Zone offset seconds not in valid range: abs(value) ");
            M2.append(Math.abs(i3));
            M2.append(" is not in the range 0 to 59");
            throw new b(M2.toString());
        }
        if (Math.abs(i) == 18 && (Math.abs(i2) > 0 || Math.abs(i3) > 0)) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return n((i2 * 60) + (i * 3600) + i3);
    }

    public static l n(int i) {
        if (Math.abs(i) > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % TypedValues.Custom.TYPE_INT != 0) {
            return new l(i);
        }
        Integer valueOf = Integer.valueOf(i);
        ConcurrentMap<Integer, l> concurrentMap = f10848d;
        l lVar = concurrentMap.get(valueOf);
        if (lVar != null) {
            return lVar;
        }
        concurrentMap.putIfAbsent(valueOf, new l(i));
        l lVar2 = concurrentMap.get(valueOf);
        f10849e.putIfAbsent(lVar2.f10852c, lVar2);
        return lVar2;
    }

    private static int o(CharSequence charSequence, int i, boolean z) {
        if (z && charSequence.charAt(i - 1) != ':') {
            throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) charSequence));
        }
        char charAt = charSequence.charAt(i);
        char charAt2 = charSequence.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) charSequence));
    }

    @Override // org.threeten.bp.temporal.c
    public org.threeten.bp.temporal.a adjustInto(org.threeten.bp.temporal.a aVar) {
        return aVar.a(ChronoField.OFFSET_SECONDS, this.b);
    }

    @Override // java.lang.Comparable
    public int compareTo(l lVar) {
        return lVar.b - this.b;
    }

    @Override // org.threeten.bp.k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.b == ((l) obj).b;
    }

    @Override // org.threeten.bp.k
    public String g() {
        return this.f10852c;
    }

    @Override // org.threeten.bp.temporal.b
    public int get(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return range(eVar).a(getLong(eVar), eVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.OFFSET_SECONDS) {
            return this.b;
        }
        if (eVar instanceof ChronoField) {
            throw new b(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.getFrom(this);
    }

    @Override // org.threeten.bp.k
    public org.threeten.bp.zone.e h() {
        return org.threeten.bp.zone.e.g(this);
    }

    @Override // org.threeten.bp.k
    public int hashCode() {
        return this.b;
    }

    public int i(l lVar) {
        return lVar.b - this.b;
    }

    @Override // org.threeten.bp.temporal.b
    public boolean isSupported(org.threeten.bp.temporal.e eVar) {
        return eVar instanceof ChronoField ? eVar == ChronoField.OFFSET_SECONDS : eVar != null && eVar.isSupportedBy(this);
    }

    public int k() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.threeten.bp.temporal.b
    public <R> R query(org.threeten.bp.temporal.g<R> gVar) {
        if (gVar == org.threeten.bp.temporal.f.d() || gVar == org.threeten.bp.temporal.f.f()) {
            return this;
        }
        if (gVar == org.threeten.bp.temporal.f.b() || gVar == org.threeten.bp.temporal.f.c() || gVar == org.threeten.bp.temporal.f.e() || gVar == org.threeten.bp.temporal.f.a() || gVar == org.threeten.bp.temporal.f.g()) {
            return null;
        }
        return gVar.a(this);
    }

    @Override // org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        if (eVar == ChronoField.OFFSET_SECONDS) {
            return eVar.range();
        }
        if (eVar instanceof ChronoField) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        return eVar.rangeRefinedBy(this);
    }

    @Override // org.threeten.bp.k
    public String toString() {
        return this.f10852c;
    }
}
