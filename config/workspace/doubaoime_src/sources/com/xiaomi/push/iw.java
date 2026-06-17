package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class iw implements jf<iw, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f817a;

    /* renamed from: a, reason: collision with other field name */
    public ij f818a;

    /* renamed from: a, reason: collision with other field name */
    public String f819a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f820a = new BitSet(1);

    /* renamed from: b, reason: collision with other field name */
    public String f821b;

    /* renamed from: c, reason: collision with other field name */
    public String f822c;

    /* renamed from: d, reason: collision with other field name */
    public String f823d;

    /* renamed from: e, reason: collision with other field name */
    public String f824e;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f816a = new ju("XmPushActionSendFeedbackResult");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9250c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9251d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9252e = new jm("", (byte) 10, 6);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9253f = new jm("", (byte) 11, 7);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9254g = new jm("", (byte) 11, 8);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m595a() {
        return this.f819a != null;
    }

    public boolean b() {
        return this.f818a != null;
    }

    public boolean c() {
        return this.f821b != null;
    }

    public boolean d() {
        return this.f822c != null;
    }

    public boolean e() {
        return this.f820a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iw)) {
            return m596a((iw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f823d != null;
    }

    public boolean g() {
        return this.f824e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (m595a()) {
            sb.append("debug:");
            String str = this.f819a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            ij ijVar = this.f818a;
            if (ijVar == null) {
                sb.append("null");
            } else {
                sb.append(ijVar);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f821b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f822c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f817a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f823d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f824e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public void a(boolean z) {
        this.f820a.set(0, z);
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f816a);
        if (this.f819a != null && m595a()) {
            jpVar.a(a);
            jpVar.a(this.f819a);
            jpVar.b();
        }
        if (this.f818a != null && b()) {
            jpVar.a(b);
            this.f818a.b(jpVar);
            jpVar.b();
        }
        if (this.f821b != null) {
            jpVar.a(f9250c);
            jpVar.a(this.f821b);
            jpVar.b();
        }
        if (this.f822c != null) {
            jpVar.a(f9251d);
            jpVar.a(this.f822c);
            jpVar.b();
        }
        jpVar.a(f9252e);
        jpVar.a(this.f817a);
        jpVar.b();
        if (this.f823d != null && f()) {
            jpVar.a(f9253f);
            jpVar.a(this.f823d);
            jpVar.b();
        }
        if (this.f824e != null && g()) {
            jpVar.a(f9254g);
            jpVar.a(this.f824e);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m596a(iw iwVar) {
        if (iwVar == null) {
            return false;
        }
        boolean m595a = m595a();
        boolean m595a2 = iwVar.m595a();
        if ((m595a || m595a2) && !(m595a && m595a2 && this.f819a.equals(iwVar.f819a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = iwVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f818a.m536a(iwVar.f818a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = iwVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f821b.equals(iwVar.f821b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = iwVar.d();
        if (((d2 || d3) && !(d2 && d3 && this.f822c.equals(iwVar.f822c))) || this.f817a != iwVar.f817a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iwVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f823d.equals(iwVar.f823d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iwVar.g();
        if (g2 || g3) {
            return g2 && g3 && this.f824e.equals(iwVar.f824e);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iw iwVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        if (!getClass().equals(iwVar.getClass())) {
            return getClass().getName().compareTo(iwVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m595a()).compareTo(Boolean.valueOf(iwVar.m595a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m595a() && (a8 = jg.a(this.f819a, iwVar.f819a)) != 0) {
            return a8;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iwVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a7 = jg.a(this.f818a, iwVar.f818a)) != 0) {
            return a7;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iwVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a6 = jg.a(this.f821b, iwVar.f821b)) != 0) {
            return a6;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iwVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a5 = jg.a(this.f822c, iwVar.f822c)) != 0) {
            return a5;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iwVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a4 = jg.a(this.f817a, iwVar.f817a)) != 0) {
            return a4;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iwVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a3 = jg.a(this.f823d, iwVar.f823d)) != 0) {
            return a3;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iwVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (!g() || (a2 = jg.a(this.f824e, iwVar.f824e)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jf
    public void a(jp jpVar) {
        jpVar.mo643a();
        while (true) {
            jm mo639a = jpVar.mo639a();
            byte b2 = mo639a.a;
            if (b2 == 0) {
                jpVar.f();
                if (e()) {
                    a();
                    return;
                } else {
                    StringBuilder M = e.a.a.a.a.M("Required field 'errorCode' was not found in serialized data! Struct: ");
                    M.append(toString());
                    throw new jq(M.toString());
                }
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f819a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f818a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f821b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f822c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                default:
                    js.a(jpVar, b2);
                    break;
                case 6:
                    if (b2 == 10) {
                        this.f817a = jpVar.mo638a();
                        a(true);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f823d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 11) {
                        this.f824e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
            }
            jpVar.g();
        }
    }

    public void a() {
        if (this.f821b != null) {
            if (this.f822c != null) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("Required field 'appId' was not present! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
        StringBuilder M2 = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M2.append(toString());
        throw new jq(M2.toString());
    }
}
