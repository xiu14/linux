package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class fz implements jf<fz, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public String f453a;

    /* renamed from: a, reason: collision with other field name */
    public List<fy> f454a;

    /* renamed from: b, reason: collision with other field name */
    public String f455b;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f452a = new ju("StatsEvents");
    private static final jm a = new jm("", (byte) 11, 1);
    private static final jm b = new jm("", (byte) 11, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9103c = new jm("", (byte) 15, 3);

    public fz() {
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m401a() {
        return this.f453a != null;
    }

    public boolean b() {
        return this.f455b != null;
    }

    public boolean c() {
        return this.f454a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof fz)) {
            return m402a((fz) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("StatsEvents(", "uuid:");
        String str = this.f453a;
        if (str == null) {
            R.append("null");
        } else {
            R.append(str);
        }
        if (b()) {
            R.append(", ");
            R.append("operator:");
            String str2 = this.f455b;
            if (str2 == null) {
                R.append("null");
            } else {
                R.append(str2);
            }
        }
        R.append(", ");
        R.append("events:");
        List<fy> list = this.f454a;
        if (list == null) {
            R.append("null");
        } else {
            R.append(list);
        }
        R.append(")");
        return R.toString();
    }

    public fz(String str, List<fy> list) {
        this();
        this.f453a = str;
        this.f454a = list;
    }

    public fz a(String str) {
        this.f455b = str;
        return this;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f452a);
        if (this.f453a != null) {
            jpVar.a(a);
            jpVar.a(this.f453a);
            jpVar.b();
        }
        if (this.f455b != null && b()) {
            jpVar.a(b);
            jpVar.a(this.f455b);
            jpVar.b();
        }
        if (this.f454a != null) {
            jpVar.a(f9103c);
            jpVar.a(new jn((byte) 12, this.f454a.size()));
            Iterator<fy> it2 = this.f454a.iterator();
            while (it2.hasNext()) {
                it2.next().b(jpVar);
            }
            jpVar.e();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m402a(fz fzVar) {
        if (fzVar == null) {
            return false;
        }
        boolean m401a = m401a();
        boolean m401a2 = fzVar.m401a();
        if ((m401a || m401a2) && !(m401a && m401a2 && this.f453a.equals(fzVar.f453a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = fzVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f455b.equals(fzVar.f455b))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = fzVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f454a.equals(fzVar.f454a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(fz fzVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(fzVar.getClass())) {
            return getClass().getName().compareTo(fzVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m401a()).compareTo(Boolean.valueOf(fzVar.m401a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m401a() && (a4 = jg.a(this.f453a, fzVar.f453a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(fzVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jg.a(this.f455b, fzVar.f455b)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(fzVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = jg.a(this.f454a, fzVar.f454a)) == 0) {
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
            short s = mo639a.f916a;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        js.a(jpVar, b2);
                    } else if (b2 == 15) {
                        jn mo640a = jpVar.mo640a();
                        this.f454a = new ArrayList(mo640a.f917a);
                        for (int i = 0; i < mo640a.f917a; i++) {
                            fy fyVar = new fy();
                            fyVar.a(jpVar);
                            this.f454a.add(fyVar);
                        }
                        jpVar.i();
                    } else {
                        js.a(jpVar, b2);
                    }
                } else if (b2 == 11) {
                    this.f455b = jpVar.mo644a();
                } else {
                    js.a(jpVar, b2);
                }
            } else if (b2 == 11) {
                this.f453a = jpVar.mo644a();
            } else {
                js.a(jpVar, b2);
            }
            jpVar.g();
        }
    }

    public void a() {
        if (this.f453a != null) {
            if (this.f454a != null) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("Required field 'events' was not present! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
        StringBuilder M2 = e.a.a.a.a.M("Required field 'uuid' was not present! Struct: ");
        M2.append(toString());
        throw new jq(M2.toString());
    }
}
