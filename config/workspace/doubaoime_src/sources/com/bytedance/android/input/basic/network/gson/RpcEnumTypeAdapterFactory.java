package com.bytedance.android.input.basic.network.gson;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.input.basic.network.gson.RpcEnumTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.b;
import com.google.gson.t;
import com.ss.android.message.log.PushLog;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.f;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class RpcEnumTypeAdapterFactory implements t {

    public enum BasicType {
        INT("int"),
        STRING("java.lang.String"),
        LONG("long"),
        DOUBLE("double"),
        BOOLEAN(TypedValues.Custom.S_BOOLEAN);

        public static final a Companion = new a(null);
        private String value;

        public static final class a {
            public a(g gVar) {
            }
        }

        BasicType(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }

        public final void setValue(String str) {
            l.f(str, "<set-?>");
            this.value = str;
        }
    }

    public static final class a {
        private Object a;
        private BasicType b;

        public a(Object obj, BasicType basicType) {
            l.f(obj, PushLog.KEY_VALUE);
            l.f(basicType, "type");
            this.a = obj;
            this.b = basicType;
        }

        public final BasicType a() {
            return this.b;
        }

        public final Object b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.a, aVar.a) && this.b == aVar.b;
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("ValueType(value=");
            M.append(this.a);
            M.append(", type=");
            M.append(this.b);
            M.append(')');
            return M.toString();
        }
    }

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
        Field field;
        Object valueOf;
        boolean z;
        l.f(gson, "gson");
        l.f(aVar, "type");
        if (!aVar.d().isEnum()) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object[] enumConstants = aVar.d().getEnumConstants();
        l.e(enumConstants, "type.rawType.enumConstants");
        for (T t : kotlin.collections.g.r(enumConstants)) {
            l.d(t, "null cannot be cast to non-null type T of com.bytedance.android.input.basic.network.gson.RpcEnumTypeAdapterFactory.create$lambda$1");
            Field[] declaredFields = t.getClass().getDeclaredFields();
            l.e(declaredFields, "tt.javaClass.declaredFields");
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    field = null;
                    break;
                }
                field = declaredFields[i];
                BasicType.a aVar2 = BasicType.Companion;
                String name = field.getType().getName();
                l.e(name, "it2.type.name");
                Objects.requireNonNull(aVar2);
                l.f(name, "name");
                BasicType[] values = BasicType.values();
                int i2 = 0;
                while (true) {
                    if (i2 >= 5) {
                        z = false;
                        break;
                    }
                    if (l.a(values[i2].getValue(), name)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (z) {
                    break;
                }
                i++;
            }
            if (field != null) {
                field.setAccessible(true);
                BasicType.a aVar3 = BasicType.Companion;
                String name2 = field.getType().getName();
                l.e(name2, "field.type.name");
                Objects.requireNonNull(aVar3);
                l.f(name2, "name");
                BasicType[] values2 = BasicType.values();
                for (int i3 = 0; i3 < 5; i3++) {
                    BasicType basicType = values2[i3];
                    if (l.a(basicType.getValue(), name2)) {
                        int ordinal = basicType.ordinal();
                        if (ordinal == 0) {
                            valueOf = Integer.valueOf(field.getInt(t));
                        } else if (ordinal == 1) {
                            Object obj = field.get(t);
                            l.d(obj, "null cannot be cast to non-null type kotlin.String");
                            valueOf = (String) obj;
                        } else if (ordinal == 2) {
                            valueOf = Long.valueOf(field.getLong(t));
                        } else if (ordinal == 3) {
                            valueOf = Double.valueOf(field.getDouble(t));
                        } else {
                            if (ordinal != 4) {
                                throw new f();
                            }
                            valueOf = Boolean.valueOf(field.getBoolean(t));
                        }
                        linkedHashMap.put(t, new a(valueOf, basicType));
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            SerializedName serializedName = (SerializedName) t.getClass().getField(t.toString()).getAnnotation(SerializedName.class);
            if (serializedName != null) {
                linkedHashMap.put(t, new a(serializedName.value(), BasicType.STRING));
            } else {
                linkedHashMap.put(t, new a(t.toString(), BasicType.STRING));
            }
        }
        return new TypeAdapter<T>() { // from class: com.bytedance.android.input.basic.network.gson.RpcEnumTypeAdapterFactory$create$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.gson.TypeAdapter
            public T b(com.google.gson.stream.a aVar4) {
                l.f(aVar4, "reader");
                T t2 = null;
                if (aVar4.c0() == JsonToken.NULL) {
                    aVar4.S();
                    return null;
                }
                String Y = aVar4.Y();
                Iterator<T> it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Object key = entry.getKey();
                    if (l.a(((RpcEnumTypeAdapterFactory.a) entry.getValue()).b().toString(), Y)) {
                        t2 = key;
                    }
                }
                return t2 == null ? (T) kotlin.collections.g.s(linkedHashMap.keySet()) : t2;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(b bVar, T t2) {
                l.f(bVar, "out");
                if (t2 == null) {
                    bVar.D();
                    return;
                }
                RpcEnumTypeAdapterFactory.a aVar4 = linkedHashMap.get(t2);
                l.c(aVar4);
                RpcEnumTypeAdapterFactory.a aVar5 = aVar4;
                int ordinal2 = aVar5.a().ordinal();
                if (ordinal2 == 0) {
                    Object b = aVar5.b();
                    l.d(b, "null cannot be cast to non-null type kotlin.Int");
                    bVar.c0((Integer) b);
                    return;
                }
                if (ordinal2 == 1) {
                    Object b2 = aVar5.b();
                    l.d(b2, "null cannot be cast to non-null type kotlin.String");
                    bVar.e0((String) b2);
                    return;
                }
                if (ordinal2 == 2) {
                    Object b3 = aVar5.b();
                    l.d(b3, "null cannot be cast to non-null type kotlin.Long");
                    bVar.Y(((Long) b3).longValue());
                } else if (ordinal2 == 3) {
                    Object b4 = aVar5.b();
                    l.d(b4, "null cannot be cast to non-null type kotlin.Double");
                    bVar.U(((Double) b4).doubleValue());
                } else {
                    if (ordinal2 != 4) {
                        return;
                    }
                    Object b5 = aVar5.b();
                    l.d(b5, "null cannot be cast to non-null type kotlin.Boolean");
                    bVar.f0(((Boolean) b5).booleanValue());
                }
            }
        };
    }
}
