package com.bytedance.bdinstall;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: com.bytedance.bdinstall.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0622b implements Cloneable {
    private boolean a;
    private T b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3966c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3967d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bytedance.bdinstall.util.p<SharedPreferences> f3968e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final com.bytedance.bdinstall.util.h<SharedPreferences> f3969f = new C0154b();

    /* renamed from: com.bytedance.bdinstall.b$a */
    class a extends com.bytedance.bdinstall.util.p<SharedPreferences> {
        a() {
        }

        @Override // com.bytedance.bdinstall.util.p
        protected SharedPreferences a(Object[] objArr) {
            SharedPreferences b;
            String f2 = com.bytedance.bdinstall.util.g.f(AbstractC0622b.this);
            if (!TextUtils.equals(f2, "ug_install_settings_pref")) {
                return ((Context) objArr[0]).getSharedPreferences(f2, 0);
            }
            b = com.bytedance.bdinstall.util.a.b((Context) objArr[0]);
            return b;
        }
    }

    /* renamed from: com.bytedance.bdinstall.b$b, reason: collision with other inner class name */
    class C0154b extends com.bytedance.bdinstall.util.h<SharedPreferences> {
        C0154b() {
        }

        @Override // com.bytedance.bdinstall.util.h
        protected SharedPreferences a(String str, Object[] objArr) {
            SharedPreferences a;
            String g2 = com.bytedance.bdinstall.util.g.g(AbstractC0622b.this, str);
            if (!TextUtils.equals(g2, "ug_install_settings_pref_" + str)) {
                return ((Context) objArr[0]).getSharedPreferences(g2, 0);
            }
            a = com.bytedance.bdinstall.util.a.a((Context) objArr[0], str);
            return a;
        }
    }

    AbstractC0622b(T t, boolean z, boolean z2, boolean z3) {
        this.b = t;
        this.f3966c = z;
        this.f3967d = z2;
        this.a = z3;
    }

    public T a() {
        return this.b;
    }

    public SharedPreferences b(Q q) {
        if (q.O) {
            return this.f3968e.b(q.q());
        }
        Context q2 = q.q();
        return this.f3969f.b(String.valueOf(q.h()), q2);
    }

    public boolean c() {
        return this.f3967d;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean d() {
        return this.a;
    }

    public boolean e() {
        return this.f3966c;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0622b)) {
            return false;
        }
        AbstractC0622b abstractC0622b = (AbstractC0622b) obj;
        return this.b.equals(abstractC0622b.b) && this.f3967d == abstractC0622b.f3967d && this.f3966c == abstractC0622b.f3966c && this.a == abstractC0622b.a;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("AbsEnv{isChildMode=");
        M.append(this.a);
        M.append(", config=");
        M.append(this.b);
        M.append(", isI18n=");
        M.append(this.f3966c);
        M.append(", isBoe=");
        return e.a.a.a.a.L(M, this.f3967d, '}');
    }
}
