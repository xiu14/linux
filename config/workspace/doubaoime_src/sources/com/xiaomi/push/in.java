package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class in implements jf<in, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<ic> f705a;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f704a = new ju("XmPushActionCollectData");
    private static final jm a = new jm("", (byte) 15, 1);

    public in a(List<ic> list) {
        this.f705a = list;
        return this;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        a();
        jpVar.a(f704a);
        if (this.f705a != null) {
            jpVar.a(a);
            jpVar.a(new jn((byte) 12, this.f705a.size()));
            Iterator<ic> it2 = this.f705a.iterator();
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
        if (obj != null && (obj instanceof in)) {
            return m547a((in) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("XmPushActionCollectData(", "dataCollectionItems:");
        List<ic> list = this.f705a;
        if (list == null) {
            R.append("null");
        } else {
            R.append(list);
        }
        R.append(")");
        return R.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m546a() {
        return this.f705a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m547a(in inVar) {
        if (inVar == null) {
            return false;
        }
        boolean m546a = m546a();
        boolean m546a2 = inVar.m546a();
        if (m546a || m546a2) {
            return m546a && m546a2 && this.f705a.equals(inVar.f705a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(in inVar) {
        int a2;
        if (!getClass().equals(inVar.getClass())) {
            return getClass().getName().compareTo(inVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m546a()).compareTo(Boolean.valueOf(inVar.m546a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m546a() || (a2 = jg.a(this.f705a, inVar.f705a)) == 0) {
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
                a();
                return;
            }
            if (mo639a.f916a != 1) {
                js.a(jpVar, b);
            } else if (b == 15) {
                jn mo640a = jpVar.mo640a();
                this.f705a = new ArrayList(mo640a.f917a);
                for (int i = 0; i < mo640a.f917a; i++) {
                    ic icVar = new ic();
                    icVar.a(jpVar);
                    this.f705a.add(icVar);
                }
                jpVar.i();
            } else {
                js.a(jpVar, b);
            }
            jpVar.g();
        }
    }

    public void a() {
        if (this.f705a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'dataCollectionItems' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
