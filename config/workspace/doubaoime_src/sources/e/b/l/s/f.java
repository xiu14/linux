package e.b.l.s;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f {
    private static final e.b.l.q.a<Type, h<?>> a = new e.b.l.q.a<>(16);
    private static final e.b.l.q.a<Type, h<?>> b = new e.b.l.q.a<>(32, 64);

    /* renamed from: c, reason: collision with root package name */
    private static final e.b.l.q.a<Type, h<?>> f9656c = new e.b.l.q.a<>(8, 16);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f9657d = 0;

    public static synchronized h<?> a(Type type) {
        synchronized (f.class) {
            if (type != null && type != Void.class) {
                if (type != Void.TYPE) {
                    Type f2 = e.b.l.q.e.f(type);
                    h<?> hVar = a.get(f2);
                    if (hVar != null) {
                        return hVar;
                    }
                    h<?> hVar2 = b.get(f2);
                    if (hVar2 != null) {
                        return hVar2;
                    }
                    h<?> hVar3 = f9656c.get(f2);
                    if (hVar3 != null) {
                        return hVar3;
                    }
                    h<?> b2 = b(f2);
                    if (b2 == null && com.bytedance.rpc.log.b.f()) {
                        com.bytedance.rpc.log.b.j(String.format("can't create adapter with type %s", f2));
                    }
                    return b2;
                }
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static h<?> b(Type type) {
        h<?> hVar = null;
        h hVar2 = type == String.class ? h.h : (type == Integer.class || type == Integer.TYPE) ? h.f9660d : (type == Boolean.class || type == Boolean.TYPE) ? h.a : (type == Long.class || type == Long.TYPE) ? h.f9661e : (type == Float.class || type == Float.TYPE) ? h.f9663g : (type == Double.class || type == Double.TYPE) ? h.f9662f : (type == Short.class || type == Short.TYPE) ? h.f9659c : (type == Byte.class || type == Byte.TYPE) ? h.b : type == ByteBuffer.class ? h.i : type == byte[].class ? h.j : null;
        if (hVar2 != null) {
            a.put(type, hVar2);
            return hVar2;
        }
        Class<?> d2 = e.b.l.q.e.d(type);
        if (d2 == null) {
            return hVar2;
        }
        Class<?> d3 = e.b.l.q.e.d(d2);
        if (!(d3 != null && (Collection.class.isAssignableFrom(d3) || Map.class.isAssignableFrom(d3)))) {
            h<?> aVar = Enum.class.isAssignableFrom(d2) ? new a(d2) : new e(d2);
            b.put(type, aVar);
            return aVar;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Class<?> d4 = e.b.l.q.e.d(parameterizedType.getRawType());
            int length = actualTypeArguments == null ? 0 : actualTypeArguments.length;
            h[] hVarArr = new h[length];
            for (int i = 0; i < length; i++) {
                hVarArr[i] = b(actualTypeArguments[i]);
            }
            if (List.class.isAssignableFrom(d4)) {
                if (length > 0 && hVarArr[0] != null) {
                    hVar = new b(hVarArr[0]);
                }
            } else if (Map.class.isAssignableFrom(d4)) {
                if (actualTypeArguments.length == 2 && hVarArr[0] != null && hVarArr[1] != null) {
                    hVar = new c(hVarArr[0], hVarArr[1]);
                }
            } else if (Set.class.isAssignableFrom(d4) && length > 0 && hVarArr[0] != null) {
                hVar = new d(hVarArr[0]);
            }
        }
        if (hVar != null) {
            f9656c.put(type, hVar);
        }
        return hVar;
    }
}
