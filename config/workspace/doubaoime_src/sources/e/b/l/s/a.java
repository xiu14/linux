package e.b.l.s;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
class a implements h {
    private Method k;
    private Method l;

    a(Class<?> cls) {
        try {
            this.k = cls.getMethod("getValue", new Class[0]);
            try {
                this.l = cls.getMethod("findByValue", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                this.l = cls.getMethod("fromValue", Integer.TYPE);
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    @Override // e.b.l.s.h
    public byte a() {
        return (byte) 8;
    }

    @Override // e.b.l.s.h
    public void b(Object obj, g.a.c.c.e eVar) throws g.a.c.b {
        try {
            eVar.p(((Integer) this.k.invoke(obj, new Object[0])).intValue());
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // e.b.l.s.h
    public Object c(g.a.c.c.e eVar) throws g.a.c.b {
        try {
            return this.l.invoke(null, Integer.valueOf(eVar.f()));
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
