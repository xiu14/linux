package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class iy implements jf<iy, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public ij f840a;

    /* renamed from: a, reason: collision with other field name */
    public String f841a;

    /* renamed from: a, reason: collision with other field name */
    public List<String> f842a;

    /* renamed from: b, reason: collision with other field name */
    public String f843b;

    /* renamed from: c, reason: collision with other field name */
    public String f844c;

    /* renamed from: d, reason: collision with other field name */
    public String f845d;

    /* renamed from: e, reason: collision with other field name */
    public String f846e;

    /* renamed from: f, reason: collision with other field name */
    public String f847f;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f839a = new ju("XmPushActionSubscription");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 12, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9260c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9261d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9262e = new jm("", (byte) 11, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9263f = new jm("", (byte) 11, 6);

    /* renamed from: g, reason: collision with root package name */
    private static final jm f9264g = new jm("", (byte) 11, 7);
    private static final jm h = new jm("", (byte) 15, 8);

    /* renamed from: a, reason: collision with other method in class */
    public boolean m606a() {
        return this.f841a != null;
    }

    public boolean b() {
        return this.f840a != null;
    }

    public boolean c() {
        return this.f843b != null;
    }

    public boolean d() {
        return this.f844c != null;
    }

    public boolean e() {
        return this.f845d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iy)) {
            return m607a((iy) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f846e != null;
    }

    public boolean g() {
        return this.f847f != null;
    }

    public boolean h() {
        return this.f842a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (m606a()) {
            sb.append("debug:");
            String str = this.f841a;
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
            ij ijVar = this.f840a;
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
        String str2 = this.f843b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f844c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("topic:");
        String str4 = this.f845d;
        if (str4 == null) {
            sb.append("null");
        } else {
            sb.append(str4);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f846e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f847f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            List<String> list = this.f842a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public iy a(String str) {
        this.f843b = str;
        return this;
    }

    public iy b(String str) {
        this.f844c = str;
        return this;
    }

    public iy c(String str) {
        this.f845d = str;
        return this;
    }

    public iy d(String str) {
        this.f846e = str;
        return this;
    }

    public iy e(String str) {
        this.f847f = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m607a(iy iyVar) {
        if (iyVar == null) {
            return false;
        }
        boolean m606a = m606a();
        boolean m606a2 = iyVar.m606a();
        if ((m606a || m606a2) && !(m606a && m606a2 && this.f841a.equals(iyVar.f841a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = iyVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f840a.m536a(iyVar.f840a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = iyVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f843b.equals(iyVar.f843b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = iyVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f844c.equals(iyVar.f844c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iyVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f845d.equals(iyVar.f845d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iyVar.f();
        if ((f2 || f3) && !(f2 && f3 && this.f846e.equals(iyVar.f846e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iyVar.g();
        if ((g2 || g3) && !(g2 && g3 && this.f847f.equals(iyVar.f847f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iyVar.h();
        if (h2 || h3) {
            return h2 && h3 && this.f842a.equals(iyVar.f842a);
        }
        return true;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f839a);
        if (this.f841a != null && m606a()) {
            jpVar.a(a);
            jpVar.a(this.f841a);
            jpVar.b();
        }
        if (this.f840a != null && b()) {
            jpVar.a(b);
            this.f840a.b(jpVar);
            jpVar.b();
        }
        if (this.f843b != null) {
            jpVar.a(f9260c);
            jpVar.a(this.f843b);
            jpVar.b();
        }
        if (this.f844c != null) {
            jpVar.a(f9261d);
            jpVar.a(this.f844c);
            jpVar.b();
        }
        if (this.f845d != null) {
            jpVar.a(f9262e);
            jpVar.a(this.f845d);
            jpVar.b();
        }
        if (this.f846e != null && f()) {
            jpVar.a(f9263f);
            jpVar.a(this.f846e);
            jpVar.b();
        }
        if (this.f847f != null && g()) {
            jpVar.a(f9264g);
            jpVar.a(this.f847f);
            jpVar.b();
        }
        if (this.f842a != null && h()) {
            jpVar.a(h);
            jpVar.a(new jn((byte) 11, this.f842a.size()));
            Iterator<String> it2 = this.f842a.iterator();
            while (it2.hasNext()) {
                jpVar.a(it2.next());
            }
            jpVar.e();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(iy iyVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        int a8;
        int a9;
        if (!getClass().equals(iyVar.getClass())) {
            return getClass().getName().compareTo(iyVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m606a()).compareTo(Boolean.valueOf(iyVar.m606a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m606a() && (a9 = jg.a(this.f841a, iyVar.f841a)) != 0) {
            return a9;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(iyVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a8 = jg.a(this.f840a, iyVar.f840a)) != 0) {
            return a8;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(iyVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a7 = jg.a(this.f843b, iyVar.f843b)) != 0) {
            return a7;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(iyVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a6 = jg.a(this.f844c, iyVar.f844c)) != 0) {
            return a6;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(iyVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a5 = jg.a(this.f845d, iyVar.f845d)) != 0) {
            return a5;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(iyVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (f() && (a4 = jg.a(this.f846e, iyVar.f846e)) != 0) {
            return a4;
        }
        int compareTo7 = Boolean.valueOf(g()).compareTo(Boolean.valueOf(iyVar.g()));
        if (compareTo7 != 0) {
            return compareTo7;
        }
        if (g() && (a3 = jg.a(this.f847f, iyVar.f847f)) != 0) {
            return a3;
        }
        int compareTo8 = Boolean.valueOf(h()).compareTo(Boolean.valueOf(iyVar.h()));
        if (compareTo8 != 0) {
            return compareTo8;
        }
        if (!h() || (a2 = jg.a(this.f842a, iyVar.f842a)) == 0) {
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
                a();
                return;
            }
            switch (mo639a.f916a) {
                case 1:
                    if (b2 == 11) {
                        this.f841a = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 2:
                    if (b2 == 12) {
                        ij ijVar = new ij();
                        this.f840a = ijVar;
                        ijVar.a(jpVar);
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 3:
                    if (b2 == 11) {
                        this.f843b = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 4:
                    if (b2 == 11) {
                        this.f844c = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 5:
                    if (b2 == 11) {
                        this.f845d = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 6:
                    if (b2 == 11) {
                        this.f846e = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 7:
                    if (b2 == 11) {
                        this.f847f = jpVar.mo644a();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                case 8:
                    if (b2 == 15) {
                        jn mo640a = jpVar.mo640a();
                        this.f842a = new ArrayList(mo640a.f917a);
                        for (int i = 0; i < mo640a.f917a; i++) {
                            this.f842a.add(jpVar.mo644a());
                        }
                        jpVar.i();
                        break;
                    } else {
                        js.a(jpVar, b2);
                        break;
                    }
                default:
                    js.a(jpVar, b2);
                    break;
            }
            jpVar.g();
        }
    }

    public void a() {
        if (this.f843b != null) {
            if (this.f844c != null) {
                if (this.f845d != null) {
                    return;
                }
                StringBuilder M = e.a.a.a.a.M("Required field 'topic' was not present! Struct: ");
                M.append(toString());
                throw new jq(M.toString());
            }
            StringBuilder M2 = e.a.a.a.a.M("Required field 'appId' was not present! Struct: ");
            M2.append(toString());
            throw new jq(M2.toString());
        }
        StringBuilder M3 = e.a.a.a.a.M("Required field 'id' was not present! Struct: ");
        M3.append(toString());
        throw new jq(M3.toString());
    }
}
