package com.bytedance.push.g0;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {
    public List<b> a = new ArrayList();
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public String f5696c;

    /* renamed from: d, reason: collision with root package name */
    public String f5697d;

    /* renamed from: e, reason: collision with root package name */
    public String f5698e;

    /* renamed from: com.bytedance.push.g0.a$a, reason: collision with other inner class name */
    public static class C0301a {
        private a a;

        public C0301a(String str) {
            this.a = new a(str);
        }

        public C0301a a(b bVar) {
            this.a.a.add(bVar);
            return this;
        }

        public a b() {
            return this.a;
        }

        public C0301a c(String str) {
            this.a.f5698e = str;
            return this;
        }

        public C0301a d(String str) {
            this.a.f5697d = str;
            return this;
        }

        public C0301a e(String str) {
            this.a.f5696c = str;
            return this;
        }
    }

    public static class b {
        List<String> a;
        List<String> b = null;

        public b(List<String> list) {
            this.a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            List<String> list = this.a;
            if (list == null ? bVar.a != null : !list.equals(bVar.a)) {
                return false;
            }
            List<String> list2 = this.b;
            if (list2 == null ? bVar.b != null : !list2.equals(bVar.b)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            Objects.requireNonNull(bVar);
            return true;
        }

        public int hashCode() {
            List<String> list = this.a;
            int hashCode = (list != null ? list.hashCode() : 0) * 31;
            List<String> list2 = this.b;
            return ((((hashCode + (list2 != null ? list2.hashCode() : 0)) * 31) + 0) * 31) + 0;
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("IntentFilter{actions=");
            M.append(this.a);
            M.append(", categories=");
            M.append(this.b);
            M.append(", data=");
            M.append((Object) null);
            M.append(", mimetype=");
            return e.a.a.a.a.G(M, null, '}');
        }
    }

    public a(String str) {
        this.b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        List<b> list = this.a;
        if (list == null ? aVar.a != null : !list.equals(aVar.a)) {
            return false;
        }
        String str = this.b;
        if (str == null ? aVar.b != null : !str.equals(aVar.b)) {
            return false;
        }
        String str2 = this.f5696c;
        if (str2 == null ? aVar.f5696c != null : !str2.equals(aVar.f5696c)) {
            return false;
        }
        String str3 = this.f5697d;
        if (str3 == null ? aVar.f5697d != null : !str3.equals(aVar.f5697d)) {
            return false;
        }
        String str4 = this.f5698e;
        String str5 = aVar.f5698e;
        return str4 == null ? str5 == null : str4.equals(str5);
    }

    public int hashCode() {
        List<b> list = this.a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5696c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5697d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f5698e;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Component{name='");
        e.a.a.a.a.G0(M, this.b, '\'', ", intentFilter=");
        M.append(this.a);
        M.append(", processName='");
        e.a.a.a.a.G0(M, this.f5696c, '\'', ", permission='");
        e.a.a.a.a.G0(M, this.f5697d, '\'', ", authorities='");
        return e.a.a.a.a.H(M, this.f5698e, '\'', '}');
    }
}
