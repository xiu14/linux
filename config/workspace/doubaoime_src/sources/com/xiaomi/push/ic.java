package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class ic implements jf<ic, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public long f601a;

    /* renamed from: a, reason: collision with other field name */
    public hw f602a;

    /* renamed from: a, reason: collision with other field name */
    public String f603a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f604a = new BitSet(1);

    /* renamed from: a, reason: collision with other field name */
    private static final ju f600a = new ju("DataCollectionItem");
    private static final jm a = new jm("", (byte) 10, 1);
    private static final jm b = new jm("", (byte) 8, 2);

    /* renamed from: c, reason: collision with root package name */
    private static final jm f9182c = new jm("", (byte) 11, 3);

    public ic a(long j) {
        this.f601a = j;
        a(true);
        return this;
    }

    public boolean b() {
        return this.f602a != null;
    }

    public boolean c() {
        return this.f603a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ic)) {
            return m504a((ic) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("DataCollectionItem(", "collectedAt:");
        R.append(this.f601a);
        R.append(", ");
        R.append("collectionType:");
        hw hwVar = this.f602a;
        if (hwVar == null) {
            R.append("null");
        } else {
            R.append(hwVar);
        }
        R.append(", ");
        R.append("content:");
        String str = this.f603a;
        if (str == null) {
            R.append("null");
        } else {
            R.append(str);
        }
        R.append(")");
        return R.toString();
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m502a();
        jpVar.a(f600a);
        jpVar.a(a);
        jpVar.a(this.f601a);
        jpVar.b();
        if (this.f602a != null) {
            jpVar.a(b);
            jpVar.mo648a(this.f602a.a());
            jpVar.b();
        }
        if (this.f603a != null) {
            jpVar.a(f9182c);
            jpVar.a(this.f603a);
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m503a() {
        return this.f604a.get(0);
    }

    public void a(boolean z) {
        this.f604a.set(0, z);
    }

    public ic a(hw hwVar) {
        this.f602a = hwVar;
        return this;
    }

    public String a() {
        return this.f603a;
    }

    public ic a(String str) {
        this.f603a = str;
        return this;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m504a(ic icVar) {
        if (icVar == null || this.f601a != icVar.f601a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = icVar.b();
        if ((b2 || b3) && !(b2 && b3 && this.f602a.equals(icVar.f602a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = icVar.c();
        if (c2 || c3) {
            return c2 && c3 && this.f603a.equals(icVar.f603a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ic icVar) {
        int a2;
        int a3;
        int a4;
        if (!getClass().equals(icVar.getClass())) {
            return getClass().getName().compareTo(icVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m503a()).compareTo(Boolean.valueOf(icVar.m503a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m503a() && (a4 = jg.a(this.f601a, icVar.f601a)) != 0) {
            return a4;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(icVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (b() && (a3 = jg.a(this.f602a, icVar.f602a)) != 0) {
            return a3;
        }
        int compareTo3 = Boolean.valueOf(c()).compareTo(Boolean.valueOf(icVar.c()));
        if (compareTo3 != 0) {
            return compareTo3;
        }
        if (!c() || (a2 = jg.a(this.f603a, icVar.f603a)) == 0) {
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
                        js.a(jpVar, b2);
                    } else if (b2 == 11) {
                        this.f603a = jpVar.mo644a();
                    } else {
                        js.a(jpVar, b2);
                    }
                } else if (b2 == 8) {
                    this.f602a = hw.a(jpVar.mo637a());
                } else {
                    js.a(jpVar, b2);
                }
            } else if (b2 == 10) {
                this.f601a = jpVar.mo638a();
                a(true);
            } else {
                js.a(jpVar, b2);
            }
            jpVar.g();
        }
        jpVar.f();
        if (m503a()) {
            m502a();
        } else {
            StringBuilder M = e.a.a.a.a.M("Required field 'collectedAt' was not found in serialized data! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m502a() {
        if (this.f602a != null) {
            if (this.f603a != null) {
                return;
            }
            StringBuilder M = e.a.a.a.a.M("Required field 'content' was not present! Struct: ");
            M.append(toString());
            throw new jq(M.toString());
        }
        StringBuilder M2 = e.a.a.a.a.M("Required field 'collectionType' was not present! Struct: ");
        M2.append(toString());
        throw new jq(M2.toString());
    }
}
