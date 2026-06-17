package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class ir implements jf<ir, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<Cif> f741a;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f740a = new ju("XmPushActionCustomConfig");
    private static final jm a = new jm("", (byte) 15, 1);

    public List<Cif> a() {
        return this.f741a;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m567a();
        jpVar.a(f740a);
        if (this.f741a != null) {
            jpVar.a(a);
            jpVar.a(new jn((byte) 12, this.f741a.size()));
            Iterator<Cif> it2 = this.f741a.iterator();
            while (it2.hasNext()) {
                it2.next().b(jpVar);
            }
            jpVar.e();
            jpVar.b();
        }
        jpVar.c();
        jpVar.mo647a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ir)) {
            return m569a((ir) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("XmPushActionCustomConfig(", "customConfigs:");
        List<Cif> list = this.f741a;
        if (list == null) {
            R.append("null");
        } else {
            R.append(list);
        }
        R.append(")");
        return R.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m568a() {
        return this.f741a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m569a(ir irVar) {
        if (irVar == null) {
            return false;
        }
        boolean m568a = m568a();
        boolean m568a2 = irVar.m568a();
        if (m568a || m568a2) {
            return m568a && m568a2 && this.f741a.equals(irVar.f741a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(ir irVar) {
        int a2;
        if (!getClass().equals(irVar.getClass())) {
            return getClass().getName().compareTo(irVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m568a()).compareTo(Boolean.valueOf(irVar.m568a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m568a() || (a2 = jg.a(this.f741a, irVar.f741a)) == 0) {
            return 0;
        }
        return a2;
    }

    @Override // com.xiaomi.push.jf
    public void a(jp jpVar) {
        jpVar.mo643a();
        while (true) {
            jm mo639a = jpVar.mo639a();
            byte b = mo639a.a;
            if (b == 0) {
                jpVar.f();
                m567a();
                return;
            }
            if (mo639a.f916a != 1) {
                js.a(jpVar, b);
            } else if (b == 15) {
                jn mo640a = jpVar.mo640a();
                this.f741a = new ArrayList(mo640a.f917a);
                for (int i = 0; i < mo640a.f917a; i++) {
                    Cif cif = new Cif();
                    cif.a(jpVar);
                    this.f741a.add(cif);
                }
                jpVar.i();
            } else {
                js.a(jpVar, b);
            }
            jpVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m567a() {
        if (this.f741a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'customConfigs' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
