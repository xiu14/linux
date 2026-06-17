package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class is implements jf<is, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<id> f743a;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f742a = new ju("XmPushActionNormalConfig");
    private static final jm a = new jm("", (byte) 15, 1);

    public List<id> a() {
        return this.f743a;
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m570a();
        jpVar.a(f742a);
        if (this.f743a != null) {
            jpVar.a(a);
            jpVar.a(new jn((byte) 12, this.f743a.size()));
            Iterator<id> it2 = this.f743a.iterator();
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
        if (obj != null && (obj instanceof is)) {
            return m572a((is) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("XmPushActionNormalConfig(", "normalConfigs:");
        List<id> list = this.f743a;
        if (list == null) {
            R.append("null");
        } else {
            R.append(list);
        }
        R.append(")");
        return R.toString();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m571a() {
        return this.f743a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m572a(is isVar) {
        if (isVar == null) {
            return false;
        }
        boolean m571a = m571a();
        boolean m571a2 = isVar.m571a();
        if (m571a || m571a2) {
            return m571a && m571a2 && this.f743a.equals(isVar.f743a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(is isVar) {
        int a2;
        if (!getClass().equals(isVar.getClass())) {
            return getClass().getName().compareTo(isVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m571a()).compareTo(Boolean.valueOf(isVar.m571a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m571a() || (a2 = jg.a(this.f743a, isVar.f743a)) == 0) {
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
                m570a();
                return;
            }
            if (mo639a.f916a != 1) {
                js.a(jpVar, b);
            } else if (b == 15) {
                jn mo640a = jpVar.mo640a();
                this.f743a = new ArrayList(mo640a.f917a);
                for (int i = 0; i < mo640a.f917a; i++) {
                    id idVar = new id();
                    idVar.a(jpVar);
                    this.f743a.add(idVar);
                }
                jpVar.i();
            } else {
                js.a(jpVar, b);
            }
            jpVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m570a() {
        if (this.f743a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'normalConfigs' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
