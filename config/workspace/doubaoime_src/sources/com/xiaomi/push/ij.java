package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class ij implements jf<ij, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public String f660a;

    /* renamed from: d, reason: collision with other field name */
    public String f665d;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f658a = new ju("Target");
    private static final jm a = new jm("", (byte) 10, 1);
    private static final jm b = new jm("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9206c = new jm("", (byte) 11, 3);

    /* renamed from: d, reason: collision with root package name */
    private static final jm f9207d = new jm("", (byte) 11, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final jm f9208e = new jm("", (byte) 2, 5);

    /* renamed from: f, reason: collision with root package name */
    private static final jm f9209f = new jm("", (byte) 11, 7);

    /* renamed from: a, reason: collision with other field name */
    private BitSet f661a = new BitSet(2);

    /* renamed from: a, reason: collision with other field name */
    public long f659a = 5;

    /* renamed from: b, reason: collision with other field name */
    public String f663b = "xiaomi.com";

    /* renamed from: c, reason: collision with other field name */
    public String f664c = "";

    /* renamed from: a, reason: collision with other field name */
    public boolean f662a = false;

    /* renamed from: a, reason: collision with other method in class */
    public boolean m535a() {
        return this.f661a.get(0);
    }

    public boolean b() {
        return this.f660a != null;
    }

    public boolean c() {
        return this.f663b != null;
    }

    public boolean d() {
        return this.f664c != null;
    }

    public boolean e() {
        return this.f661a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ij)) {
            return m536a((ij) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f665d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("Target(", "channelId:");
        R.append(this.f659a);
        R.append(", ");
        R.append("userId:");
        String str = this.f660a;
        if (str == null) {
            R.append("null");
        } else {
            R.append(str);
        }
        if (c()) {
            R.append(", ");
            R.append("server:");
            String str2 = this.f663b;
            if (str2 == null) {
                R.append("null");
            } else {
                R.append(str2);
            }
        }
        if (d()) {
            R.append(", ");
            R.append("resource:");
            String str3 = this.f664c;
            if (str3 == null) {
                R.append("null");
            } else {
                R.append(str3);
            }
        }
        if (e()) {
            R.append(", ");
            R.append("isPreview:");
            R.append(this.f662a);
        }
        if (f()) {
            R.append(", ");
            R.append("token:");
            String str4 = this.f665d;
            if (str4 == null) {
                R.append("null");
            } else {
                R.append(str4);
            }
        }
        R.append(")");
        return R.toString();
    }

    public void a(boolean z) {
        this.f661a.set(0, z);
    }

    public void b(boolean z) {
        this.f661a.set(1, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m536a(ij ijVar) {
        if (ijVar == null || this.f659a != ijVar.f659a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ijVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f660a.equals(ijVar.f660a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ijVar.c();
        if ((c2 || c3) && !(c2 && c3 && this.f663b.equals(ijVar.f663b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ijVar.d();
        if ((d2 || d3) && !(d2 && d3 && this.f664c.equals(ijVar.f664c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ijVar.e();
        if ((e2 || e3) && !(e2 && e3 && this.f662a == ijVar.f662a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ijVar.f();
        if (f2 || f3) {
            return f2 && f3 && this.f665d.equals(ijVar.f665d);
        }
        return true;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f658a);
        jpVar.a(a);
        jpVar.a(this.f659a);
        jpVar.b();
        if (this.f660a != null) {
            jpVar.a(b);
            jpVar.a(this.f660a);
            jpVar.b();
        }
        if (this.f663b != null && c()) {
            jpVar.a(f9206c);
            jpVar.a(this.f663b);
            jpVar.b();
        }
        if (this.f664c != null && d()) {
            jpVar.a(f9207d);
            jpVar.a(this.f664c);
            jpVar.b();
        }
        if (e()) {
            jpVar.a(f9208e);
            jpVar.a(this.f662a);
            jpVar.b();
        }
        if (this.f665d != null && f()) {
            jpVar.a(f9209f);
            jpVar.a(this.f665d);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ij ijVar) {
        int a2;
        int a3;
        int a4;
        int a5;
        int a6;
        int a7;
        if (!getClass().equals(ijVar.getClass())) {
            return getClass().getName().compareTo(ijVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m535a()).compareTo(Boolean.valueOf(ijVar.m535a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m535a() && (a7 = jg.a(this.f659a, ijVar.f659a)) != 0) {
            return a7;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(ijVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a6 = jg.a(this.f660a, ijVar.f660a)) != 0) {
            return a6;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(ijVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (c() && (a5 = jg.a(this.f663b, ijVar.f663b)) != 0) {
            return a5;
        }
        int compareTo4 = Boolean.valueOf(d()).compareTo(Boolean.valueOf(ijVar.d()));
        if (compareTo4 != 0) {
            return compareTo4;
        }
        if (d() && (a4 = jg.a(this.f664c, ijVar.f664c)) != 0) {
            return a4;
        }
        int compareTo5 = Boolean.valueOf(e()).compareTo(Boolean.valueOf(ijVar.e()));
        if (compareTo5 != 0) {
            return compareTo5;
        }
        if (e() && (a3 = jg.a(this.f662a, ijVar.f662a)) != 0) {
            return a3;
        }
        int compareTo6 = Boolean.valueOf(f()).compareTo(Boolean.valueOf(ijVar.f()));
        if (compareTo6 != 0) {
            return compareTo6;
        }
        if (!f() || (a2 = jg.a(this.f665d, ijVar.f665d)) == 0) {
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
                break;
            }
            short s = mo639a.f916a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s != 7) {
                                    js.a(jpVar, b2);
                                } else if (b2 == 11) {
                                    this.f665d = jpVar.mo644a();
                                } else {
                                    js.a(jpVar, b2);
                                }
                            } else if (b2 == 2) {
                                this.f662a = jpVar.mo649a();
                                b(true);
                            } else {
                                js.a(jpVar, b2);
                            }
                        } else if (b2 == 11) {
                            this.f664c = jpVar.mo644a();
                        } else {
                            js.a(jpVar, b2);
                        }
                    } else if (b2 == 11) {
                        this.f663b = jpVar.mo644a();
                    } else {
                        js.a(jpVar, b2);
                    }
                } else if (b2 == 11) {
                    this.f660a = jpVar.mo644a();
                } else {
                    js.a(jpVar, b2);
                }
            } else if (b2 == 10) {
                this.f659a = jpVar.mo638a();
                a(true);
            } else {
                js.a(jpVar, b2);
            }
            jpVar.g();
        }
        jpVar.f();
        if (m535a()) {
            a();
        } else {
            StringBuilder M = e.a.a.a.a.M("Required field 'channelId' was not found in serialized data! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
    }

    public void a() {
        if (this.f660a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'userId' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
