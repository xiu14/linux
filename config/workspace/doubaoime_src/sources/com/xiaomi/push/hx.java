package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class hx implements jf<hx, Object>, Serializable, Cloneable {

    /* renamed from: a, reason: collision with other field name */
    public List<hy> f580a;

    /* renamed from: a, reason: collision with other field name */
    private static final ju f579a = new ju("ClientUploadData");
    private static final jm a = new jm("", (byte) 15, 1);

    public int a() {
        List<hy> list = this.f580a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.xiaomi.push.jf
    public void b(jp jpVar) {
        m489a();
        jpVar.a(f579a);
        if (this.f580a != null) {
            jpVar.a(a);
            jpVar.a(new jn((byte) 12, this.f580a.size()));
            Iterator<hy> it2 = this.f580a.iterator();
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
        if (obj != null && (obj instanceof hx)) {
            return m491a((hx) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder R = e.a.a.a.a.R("ClientUploadData(", "uploadDataItems:");
        List<hy> list = this.f580a;
        if (list == null) {
            R.append("null");
        } else {
            R.append(list);
        }
        R.append(")");
        return R.toString();
    }

    public void a(hy hyVar) {
        if (this.f580a == null) {
            this.f580a = new ArrayList();
        }
        this.f580a.add(hyVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m490a() {
        return this.f580a != null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m491a(hx hxVar) {
        if (hxVar == null) {
            return false;
        }
        boolean m490a = m490a();
        boolean m490a2 = hxVar.m490a();
        if (m490a || m490a2) {
            return m490a && m490a2 && this.f580a.equals(hxVar.f580a);
        }
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(hx hxVar) {
        int a2;
        if (!getClass().equals(hxVar.getClass())) {
            return getClass().getName().compareTo(hxVar.getClass().getName());
        }
        int compareTo = Boolean.valueOf(m490a()).compareTo(Boolean.valueOf(hxVar.m490a()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!m490a() || (a2 = jg.a(this.f580a, hxVar.f580a)) == 0) {
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
                m489a();
                return;
            }
            if (mo639a.f916a != 1) {
                js.a(jpVar, b);
            } else if (b == 15) {
                jn mo640a = jpVar.mo640a();
                this.f580a = new ArrayList(mo640a.f917a);
                for (int i = 0; i < mo640a.f917a; i++) {
                    hy hyVar = new hy();
                    hyVar.a(jpVar);
                    this.f580a.add(hyVar);
                }
                jpVar.i();
            } else {
                js.a(jpVar, b);
            }
            jpVar.g();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m489a() {
        if (this.f580a != null) {
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Required field 'uploadDataItems' was not present! Struct: ");
        M.append(toString());
        throw new jq(M.toString());
    }
}
