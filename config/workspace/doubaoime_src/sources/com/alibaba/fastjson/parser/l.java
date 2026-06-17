package com.alibaba.fastjson.parser;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class l extends com.alibaba.fastjson.parser.o.d {

    /* renamed from: d, reason: collision with root package name */
    private final int f1506d;

    /* renamed from: e, reason: collision with root package name */
    private final List f1507e;

    /* renamed from: f, reason: collision with root package name */
    private final b f1508f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f1509g;
    private final Map h;
    private final Collection i;

    public l(b bVar, List list, int i) {
        super(null, null);
        this.f1508f = bVar;
        this.f1506d = i;
        this.f1507e = list;
        this.f1509g = null;
        this.h = null;
        this.i = null;
    }

    @Override // com.alibaba.fastjson.parser.o.d
    public void b(b bVar, Object obj, Type type, Map<String, Object> map) {
    }

    @Override // com.alibaba.fastjson.parser.o.d
    public void g(Object obj, Object obj2) {
        com.alibaba.fastjson.b bVar;
        Object f2;
        Map map = this.h;
        if (map != null) {
            map.put(this.f1509g, obj2);
            return;
        }
        Collection collection = this.i;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        this.f1507e.set(this.f1506d, obj2);
        List list = this.f1507e;
        if (!(list instanceof com.alibaba.fastjson.b) || (f2 = (bVar = (com.alibaba.fastjson.b) list).f()) == null || Array.getLength(f2) <= this.f1506d) {
            return;
        }
        if (bVar.e() != null) {
            obj2 = com.alibaba.fastjson.h.d.b(obj2, bVar.e(), this.f1508f.b);
        }
        Array.set(f2, this.f1506d, obj2);
    }

    public l(Map map, Object obj) {
        super(null, null);
        this.f1508f = null;
        this.f1506d = -1;
        this.f1507e = null;
        this.f1509g = obj;
        this.h = map;
        this.i = null;
    }

    public l(Collection collection) {
        super(null, null);
        this.f1508f = null;
        this.f1506d = -1;
        this.f1507e = null;
        this.f1509g = null;
        this.h = null;
        this.i = collection;
    }
}
