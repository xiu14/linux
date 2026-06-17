package com.bytedance.android.input.keyboard.vibrate.entity;

import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private boolean a;
    private VibrateIntensity b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2805c;

    public a() {
        this(false, null, false, 7);
    }

    public a(boolean z, VibrateIntensity vibrateIntensity, boolean z2) {
        l.f(vibrateIntensity, "vibrateIntensity");
        this.a = z;
        this.b = vibrateIntensity;
        this.f2805c = z2;
    }

    public final boolean a() {
        return this.f2805c;
    }

    public final boolean b() {
        return this.a;
    }

    public final VibrateIntensity c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.f2805c == aVar.f2805c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.b.hashCode() + (r0 * 31)) * 31;
        boolean z2 = this.f2805c;
        return hashCode + (z2 ? 1 : z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("VibrateParams(openVibrate=");
        M.append(this.a);
        M.append(", vibrateIntensity=");
        M.append(this.b);
        M.append(", forceTriggerVibrate=");
        return e.a.a.a.a.L(M, this.f2805c, ')');
    }

    public a(boolean z, VibrateIntensity vibrateIntensity, boolean z2, int i) {
        z = (i & 1) != 0 ? true : z;
        vibrateIntensity = (i & 2) != 0 ? VibrateIntensity.WEAK : vibrateIntensity;
        z2 = (i & 4) != 0 ? false : z2;
        l.f(vibrateIntensity, "vibrateIntensity");
        this.a = z;
        this.b = vibrateIntensity;
        this.f2805c = z2;
    }
}
