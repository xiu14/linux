package kotlin.s.c;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e implements kotlin.reflect.c<Object>, InterfaceC0784d {
    public static final a b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends kotlin.b<?>>, Integer> f10121c;

    /* renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f10122d;

    /* renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f10123e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f10124f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f10125g;
    private final Class<?> a;

    public static final class a {
        public a(g gVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 0;
        List G = kotlin.collections.g.G(kotlin.s.b.a.class, kotlin.s.b.l.class, kotlin.s.b.p.class, kotlin.s.b.q.class, kotlin.s.b.r.class, kotlin.s.b.s.class, kotlin.s.b.t.class, kotlin.s.b.u.class, kotlin.s.b.v.class, kotlin.s.b.w.class, kotlin.s.b.b.class, kotlin.s.b.c.class, kotlin.s.b.d.class, kotlin.s.b.e.class, kotlin.s.b.f.class, kotlin.s.b.g.class, kotlin.s.b.h.class, kotlin.s.b.i.class, kotlin.s.b.j.class, kotlin.s.b.k.class, kotlin.s.b.m.class, kotlin.s.b.n.class, kotlin.s.b.o.class);
        ArrayList arrayList = new ArrayList(kotlin.collections.g.e(G, 10));
        for (Object obj : G) {
            int i2 = i + 1;
            if (i < 0) {
                kotlin.collections.g.b0();
                throw null;
            }
            arrayList.add(new kotlin.g((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f10121c = kotlin.collections.g.g0(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(TypedValues.Custom.S_BOOLEAN, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put(TypedValues.Custom.S_FLOAT, "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f10122d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f10123e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        l.e(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            l.e(str, "kotlinName");
            sb.append(kotlin.text.a.N(str, '.', str));
            sb.append("CompanionObject");
            kotlin.g gVar = new kotlin.g(sb.toString(), e.a.a.a.a.s(str, ".Companion"));
            hashMap3.put(gVar.c(), gVar.d());
        }
        for (Map.Entry<Class<? extends kotlin.b<?>>, Integer> entry : f10121c.entrySet()) {
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f10124f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.g.H(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, kotlin.text.a.N(str2, '.', str2));
        }
        f10125g = linkedHashMap;
    }

    public e(Class<?> cls) {
        l.f(cls, "jClass");
        this.a = cls;
    }

    @Override // kotlin.s.c.InterfaceC0784d
    public Class<?> a() {
        return this.a;
    }

    public String d() {
        String str;
        Class<?> cls = this.a;
        l.f(cls, "jClass");
        String str2 = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str3 = (String) f10124f.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) f10124f.get(componentType.getName())) != null) {
            str2 = e.a.a.a.a.s(str, "Array");
        }
        return str2 == null ? "kotlin.Array" : str2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && l.a(com.prolificinteractive.materialcalendarview.r.P(this), com.prolificinteractive.materialcalendarview.r.P((kotlin.reflect.c) obj));
    }

    public String f() {
        String str;
        Class<?> cls = this.a;
        l.f(cls, "jClass");
        String str2 = null;
        if (!cls.isAnonymousClass()) {
            if (cls.isLocalClass()) {
                String simpleName = cls.getSimpleName();
                Method enclosingMethod = cls.getEnclosingMethod();
                if (enclosingMethod != null) {
                    l.e(simpleName, "name");
                    return kotlin.text.a.M(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                }
                Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                if (enclosingConstructor != null) {
                    l.e(simpleName, "name");
                    return kotlin.text.a.M(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                l.e(simpleName, "name");
                l.f(simpleName, "<this>");
                l.f(simpleName, "missingDelimiterValue");
                int p = kotlin.text.a.p(simpleName, '$', 0, false, 6, null);
                if (p == -1) {
                    return simpleName;
                }
                String substring = simpleName.substring(p + 1, simpleName.length());
                l.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return substring;
            }
            if (!cls.isArray()) {
                String str3 = (String) f10125g.get(cls.getName());
                return str3 == null ? cls.getSimpleName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) f10125g.get(componentType.getName())) != null) {
                str2 = e.a.a.a.a.s(str, "Array");
            }
            if (str2 == null) {
                return "Array";
            }
        }
        return str2;
    }

    public int hashCode() {
        return com.prolificinteractive.materialcalendarview.r.P(this).hashCode();
    }

    public String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
