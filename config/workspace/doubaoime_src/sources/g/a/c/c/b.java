package g.a.c.c;

/* loaded from: classes2.dex */
public class b {
    public final String a;
    public final byte b;

    /* renamed from: c, reason: collision with root package name */
    public final short f10076c;

    public b() {
        this.a = "";
        this.b = (byte) 0;
        this.f10076c = (short) 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.f10076c == bVar.f10076c;
    }

    public int hashCode() {
        int i = (this.f10076c + 31) * 31;
        String str = this.a;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + this.b;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("<TField name:'");
        M.append(this.a);
        M.append("' type:");
        M.append((int) this.b);
        M.append(" field-id:");
        return e.a.a.a.a.D(M, this.f10076c, ">");
    }

    public b(String str, byte b, short s) {
        this.a = str;
        this.b = b;
        this.f10076c = s;
    }
}
