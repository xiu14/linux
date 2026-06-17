package org.threeten.bp.chrono;

import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class l extends h implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final l f10784c = new l();

    private l() {
    }

    @Override // org.threeten.bp.chrono.h
    public b b(org.threeten.bp.temporal.b bVar) {
        return org.threeten.bp.e.r(bVar);
    }

    @Override // org.threeten.bp.chrono.h
    public b c(long j) {
        return org.threeten.bp.e.J(j);
    }

    @Override // org.threeten.bp.chrono.h
    public i g(int i) {
        return IsoEra.of(i);
    }

    @Override // org.threeten.bp.chrono.h
    public String i() {
        return "iso8601";
    }

    @Override // org.threeten.bp.chrono.h
    public String j() {
        return ExifInterface.TAG_RW2_ISO;
    }

    @Override // org.threeten.bp.chrono.h
    public c k(org.threeten.bp.temporal.b bVar) {
        return org.threeten.bp.f.r(bVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f n(org.threeten.bp.d dVar, org.threeten.bp.k kVar) {
        return org.threeten.bp.n.v(dVar, kVar);
    }

    @Override // org.threeten.bp.chrono.h
    public f o(org.threeten.bp.temporal.b bVar) {
        return org.threeten.bp.n.t(bVar);
    }

    public boolean p(long j) {
        return (3 & j) == 0 && (j % 100 != 0 || j % 400 == 0);
    }
}
