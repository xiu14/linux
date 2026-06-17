package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d {
    private Excluder a = Excluder.f6778f;
    private LongSerializationPolicy b = LongSerializationPolicy.DEFAULT;

    /* renamed from: c, reason: collision with root package name */
    private c f6771c = FieldNamingPolicy.IDENTITY;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Type, e<?>> f6772d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final List<t> f6773e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List<t> f6774f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private int f6775g;
    private int h;
    private boolean i;
    private boolean j;
    private s k;
    private s l;
    private final LinkedList<ReflectionAccessFilter> m;

    public d() {
        c cVar = Gson.j;
        this.f6775g = 2;
        this.h = 2;
        this.i = true;
        this.j = true;
        this.k = Gson.k;
        this.l = Gson.l;
        this.m = new LinkedList<>();
    }

    public d a(a aVar) {
        this.a = this.a.i(aVar, false, true);
        return this;
    }

    public d b(a aVar) {
        this.a = this.a.i(aVar, true, false);
        return this;
    }

    public Gson c() {
        t tVar;
        ArrayList arrayList = new ArrayList(this.f6774f.size() + this.f6773e.size() + 3);
        arrayList.addAll(this.f6773e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f6774f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i = this.f6775g;
        int i2 = this.h;
        boolean z = com.google.gson.internal.sql.a.a;
        t tVar2 = null;
        if (i != 2 && i2 != 2) {
            t a = DefaultDateTypeAdapter.b.b.a(i, i2);
            if (z) {
                tVar2 = com.google.gson.internal.sql.a.f6823c.a(i, i2);
                tVar = com.google.gson.internal.sql.a.b.a(i, i2);
            } else {
                tVar = null;
            }
            arrayList.add(a);
            if (z) {
                arrayList.add(tVar2);
                arrayList.add(tVar);
            }
        }
        return new Gson(this.a, this.f6771c, new HashMap(this.f6772d), false, false, false, this.i, false, false, false, this.j, this.b, null, this.f6775g, this.h, new ArrayList(this.f6773e), new ArrayList(this.f6774f), arrayList, this.k, this.l, new ArrayList(this.m));
    }

    public d d(Type type, Object obj) {
        boolean z = obj instanceof q;
        if (!z && !(obj instanceof h)) {
            boolean z2 = obj instanceof e;
        }
        com.bytedance.feedbackerlib.a.h(true);
        if (obj instanceof e) {
            this.f6772d.put(type, (e) obj);
        }
        if (z || (obj instanceof h)) {
            this.f6773e.add(TreeTypeAdapter.f(com.google.gson.u.a.b(type), obj));
        }
        this.f6773e.add(TypeAdapters.a(com.google.gson.u.a.b(type), (TypeAdapter) obj));
        return this;
    }

    public d e(t tVar) {
        Objects.requireNonNull(tVar);
        this.f6773e.add(tVar);
        return this;
    }
}
