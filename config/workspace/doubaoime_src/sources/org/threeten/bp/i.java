package org.threeten.bp;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class i extends org.threeten.bp.chrono.e implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final i f10846d = new i(0, 0, 0);
    private final int a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10847c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    }

    private i(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.f10847c = i3;
    }

    public static i a(int i, int i2, int i3) {
        return ((i | i2) | i3) == 0 ? f10846d : new i(i, i2, i3);
    }

    public long b() {
        return (this.a * 12) + this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.b == iVar.b && this.f10847c == iVar.f10847c;
    }

    public int hashCode() {
        return Integer.rotateLeft(this.f10847c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public String toString() {
        if (this == f10846d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.f10847c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
