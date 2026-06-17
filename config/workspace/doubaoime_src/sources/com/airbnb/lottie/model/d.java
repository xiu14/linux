package com.airbnb.lottie.model;

import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1338c = new d("COMPOSITION");
    private final List<String> a;

    @Nullable
    private e b;

    public d(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    private boolean b() {
        return this.a.get(r0.size() - 1).equals("**");
    }

    @CheckResult
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d a(String str) {
        d dVar = new d(this);
        dVar.a.add(str);
        return dVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean c(String str, int i) {
        if (i >= this.a.size()) {
            return false;
        }
        boolean z = i == this.a.size() - 1;
        String str2 = this.a.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.a.get(i + 1).equals(str)) {
            return i == this.a.size() + (-2) || (i == this.a.size() + (-3) && b());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.a.size() - 1) {
            return false;
        }
        return this.a.get(i2).equals(str);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public e d() {
        return this.b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public int e(String str, int i) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (this.a.get(i).equals("**")) {
            return (i != this.a.size() - 1 && this.a.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean f(String str, int i) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i >= this.a.size()) {
            return false;
        }
        return this.a.get(i).equals(str) || this.a.get(i).equals("**") || this.a.get(i).equals("*");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean g(String str, int i) {
        return "__container".equals(str) || i < this.a.size() - 1 || this.a.get(i).equals("**");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public d h(e eVar) {
        d dVar = new d(this);
        dVar.b = eVar;
        return dVar;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("KeyPath{keys=");
        M.append(this.a);
        M.append(",resolved=");
        return e.a.a.a.a.L(M, this.b != null, '}');
    }

    private d(d dVar) {
        this.a = new ArrayList(dVar.a);
        this.b = dVar.b;
    }
}
