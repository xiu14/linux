package com.google.gson;

import com.google.gson.internal.v;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class l extends i {
    private final v<String, i> a = new v<>(false);

    public void d(String str, i iVar) {
        v<String, i> vVar = this.a;
        if (iVar == null) {
            iVar = k.a;
        }
        vVar.put(str, iVar);
    }

    public void e(String str, Boolean bool) {
        this.a.put(str, bool == null ? k.a : new o(bool));
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).a.equals(this.a));
    }

    public void f(String str, Number number) {
        this.a.put(str, number == null ? k.a : new o(number));
    }

    public void g(String str, String str2) {
        this.a.put(str, str2 == null ? k.a : new o(str2));
    }

    public Set<Map.Entry<String, i>> h() {
        return this.a.entrySet();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public i i(String str) {
        return this.a.get(str);
    }

    public l j(String str) {
        return (l) this.a.get(str);
    }
}
