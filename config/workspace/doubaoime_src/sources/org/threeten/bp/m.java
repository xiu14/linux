package org.threeten.bp;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
final class m extends k implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f10853d = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final transient org.threeten.bp.zone.e f10854c;

    m(String str, org.threeten.bp.zone.e eVar) {
        this.b = str;
        this.f10854c = eVar;
    }

    static m i(String str, boolean z) {
        org.apache.http.conn.ssl.d.k(str, "zoneId");
        if (str.length() < 2 || !f10853d.matcher(str).matches()) {
            throw new b(e.a.a.a.a.s("Invalid ID for region-based ZoneId, invalid format: ", str));
        }
        org.threeten.bp.zone.e eVar = null;
        try {
            eVar = org.threeten.bp.zone.h.a(str, true);
        } catch (org.threeten.bp.zone.f e2) {
            if (str.equals("GMT0")) {
                l lVar = l.f10850f;
                Objects.requireNonNull(lVar);
                eVar = org.threeten.bp.zone.e.g(lVar);
            } else if (z) {
                throw e2;
            }
        }
        return new m(str, eVar);
    }

    @Override // org.threeten.bp.k
    public String g() {
        return this.b;
    }

    @Override // org.threeten.bp.k
    public org.threeten.bp.zone.e h() {
        org.threeten.bp.zone.e eVar = this.f10854c;
        return eVar != null ? eVar : org.threeten.bp.zone.h.a(this.b, false);
    }
}
