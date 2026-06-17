package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

/* loaded from: classes2.dex */
public class im implements jf<im, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public int f701a;

    /* renamed from: a, reason: collision with other field name */
    private BitSet f702a = new BitSet(2);

    /* renamed from: b, reason: collision with other field name */
    public int f703b;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f700a = new ju("XmPushActionCheckClientInfo");
    private static final jm a = new jm("", (byte) 8, 1);
    private static final jm b = new jm("", (byte) 8, 2);

    public im a(int i) {
        this.f701a = i;
        a(true);
        return this;
    }

    public void a() {
    }

    public im b(int i) {
        this.f703b = i;
        b(true);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof im)) {
            return m545a((im) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("XmPushActionCheckClientInfo(", "miscConfigVersion:");
        R.append(this.f701a);
        R.append(", ");
        R.append("pluginConfigVersion:");
        return e.a.a.a.a.D(R, this.f703b, ")");
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m544a() {
        return this.f702a.get(0);
    }

    public boolean b() {
        return this.f702a.get(1);
    }

    public void a(boolean z) {
        this.f702a.set(0, z);
    }

    public void b(boolean z) {
        this.f702a.set(1, z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m545a(im imVar) {
        return imVar != null && this.f701a == imVar.f701a && this.f703b == imVar.f703b;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f700a);
        jpVar.a(a);
        jpVar.mo648a(this.f701a);
        jpVar.b();
        jpVar.a(b);
        jpVar.mo648a(this.f703b);
        jpVar.b();
        jpVar.c();
        jpVar.mo647a();
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(im imVar) {
        int a2;
        int a3;
        if (!getClass().equals(imVar.getClass())) {
            return getClass().getName().compareTo(imVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m544a()).compareTo(Boolean.valueOf(imVar.m544a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (m544a() && (a3 = jg.a(this.f701a, imVar.f701a)) != 0) {
            return a3;
        }
        int compareTo2 = Boolean.valueOf(b()).compareTo(Boolean.valueOf(imVar.b()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!b() || (a2 = jg.a(this.f703b, imVar.f703b)) == 0) {
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
                    js.a(jpVar, b2);
                } else if (b2 == 8) {
                    this.f703b = jpVar.mo637a();
                    b(true);
                } else {
                    js.a(jpVar, b2);
                }
            } else if (b2 == 8) {
                this.f701a = jpVar.mo637a();
                a(true);
            } else {
                js.a(jpVar, b2);
            }
            jpVar.g();
        }
        jpVar.f();
        if (m544a()) {
            if (b()) {
                a();
                return;
            } else {
                StringBuilder M = e.a.a.a.a.M("Required field 'pluginConfigVersion' was not found in serialized data! Struct: ");
                M.append(toString());
                throw new jq(M.toString());
            }
        }
        StringBuilder M2 = e.a.a.a.a.M("Required field 'miscConfigVersion' was not found in serialized data! Struct: ");
        M2.append(toString());
        throw new jq(M2.toString());
    }
}
