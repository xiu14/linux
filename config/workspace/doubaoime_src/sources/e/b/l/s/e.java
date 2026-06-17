package e.b.l.s;

import com.bytedance.rpc.annotation.RpcFieldTag;
import g.a.c.c.i;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
class e implements h {
    private final Map<Short, a> k;
    private final List<a> l;
    private final Class<?> m;
    private final i n;

    static class a {
        final short a;
        final boolean b;

        /* renamed from: c, reason: collision with root package name */
        final Field f9654c;

        /* renamed from: d, reason: collision with root package name */
        final h f9655d;

        public a(short s, boolean z, Field field, h hVar) {
            this.a = s;
            this.b = z;
            this.f9654c = field;
            this.f9655d = hVar;
        }
    }

    e(Class<?> cls) {
        this.m = cls;
        Field[] fields = cls.getFields();
        this.k = new HashMap(fields.length);
        this.l = new ArrayList(fields.length);
        this.n = new i(cls.getSimpleName());
        for (Field field : fields) {
            if (!Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers())) {
                RpcFieldTag rpcFieldTag = (RpcFieldTag) field.getAnnotation(RpcFieldTag.class);
                if (rpcFieldTag == null) {
                    StringBuilder M = e.a.a.a.a.M("field ");
                    M.append(field.getName());
                    M.append(" of struct ");
                    M.append(cls.getSimpleName());
                    M.append(" should be annotated with @Field");
                    throw new IllegalArgumentException(M.toString());
                }
                short id = (short) rpcFieldTag.id();
                a aVar = new a(id, rpcFieldTag.tag() == RpcFieldTag.Tag.REQUIRED, field, f.a(field.getGenericType()));
                this.k.put(Short.valueOf(id), aVar);
                this.l.add(aVar);
            }
        }
    }

    @Override // e.b.l.s.h
    public byte a() {
        return (byte) 12;
    }

    @Override // e.b.l.s.h
    public void b(Object obj, g.a.c.c.e eVar) throws g.a.c.b {
        g.a.c.c.a aVar = (g.a.c.c.a) eVar;
        Objects.requireNonNull(aVar);
        for (a aVar2 : this.l) {
            try {
                Object obj2 = aVar2.f9654c.get(obj);
                if (obj2 != null) {
                    aVar2.f9654c.getName();
                    byte a2 = aVar2.f9655d.a();
                    short s = aVar2.a;
                    aVar.n(a2);
                    aVar.o(s);
                    aVar2.f9655d.b(obj2, eVar);
                } else if (aVar2.b) {
                    StringBuilder M = e.a.a.a.a.M("Required field '");
                    M.append(aVar2.f9654c.getName());
                    M.append("' was not present! Struct: ");
                    M.append(this.m.getSimpleName());
                    throw new g.a.c.c.f(M.toString());
                }
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException(e2);
            }
        }
        aVar.n((byte) 0);
    }

    @Override // e.b.l.s.h
    public Object c(g.a.c.c.e eVar) throws g.a.c.b {
        eVar.l();
        try {
            Object newInstance = this.m.newInstance();
            while (true) {
                g.a.c.c.b d2 = eVar.d();
                if (d2.b == 0) {
                    try {
                        break;
                    } catch (IllegalAccessException e2) {
                        throw new IllegalStateException(e2);
                    }
                }
                a aVar = this.k.get(Short.valueOf(d2.f10076c));
                if (aVar == null || d2.b != aVar.f9655d.a()) {
                    g.a.c.c.g.a(eVar, d2.b, Integer.MAX_VALUE);
                } else {
                    try {
                        aVar.f9654c.set(newInstance, aVar.f9655d.c(eVar));
                    } catch (IllegalAccessException e3) {
                        throw new IllegalStateException(e3);
                    }
                }
            }
            for (a aVar2 : this.l) {
                if (aVar2.f9654c.get(newInstance) == null && aVar2.b) {
                    throw new g.a.c.c.f("Required field '" + aVar2.f9654c.getName() + "' was not present! Struct: " + this.m.getSimpleName());
                }
            }
            int i = f.f9657d;
            return newInstance;
        } catch (IllegalAccessException | InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }
}
