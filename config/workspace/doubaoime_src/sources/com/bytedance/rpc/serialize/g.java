package com.bytedance.rpc.serialize;

import com.google.gson.annotations.SerializedName;
import com.google.gson.i;
import com.google.gson.l;
import com.xiaomi.mipush.sdk.Constants;
import e.b.l.o;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f6054d = Pattern.compile("\\Wcharset=([^\\s;]+)", 2);
    private String a = "";

    /* renamed from: c, reason: collision with root package name */
    private final Map<SerializeType, e> f6055c = new HashMap(2);
    private boolean b = true;

    private static Object a(Object obj) throws NoSuchFieldException {
        if (!(obj instanceof Enum)) {
            return obj;
        }
        SerializedName serializedName = (SerializedName) obj.getClass().getField(String.valueOf(obj)).getAnnotation(SerializedName.class);
        String value = serializedName == null ? null : serializedName.value();
        return (value == null || value.length() <= 0) ? obj : value;
    }

    private static Object b(Type type, String str) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class<?> cls = (Class) type;
        try {
            if (!Integer.class.isAssignableFrom(cls) && !Integer.TYPE.isAssignableFrom(cls)) {
                if (!Long.class.isAssignableFrom(cls) && !Long.TYPE.isAssignableFrom(cls)) {
                    if (!Float.class.isAssignableFrom(cls) && !Float.TYPE.isAssignableFrom(cls)) {
                        if (!Double.class.isAssignableFrom(cls) && !Double.TYPE.isAssignableFrom(cls)) {
                            if (BigDecimal.class.isAssignableFrom(cls)) {
                                return new BigDecimal(str);
                            }
                            return null;
                        }
                        return Double.valueOf(Double.parseDouble(str));
                    }
                    return Float.valueOf(Float.parseFloat(str));
                }
                return Long.valueOf(Long.parseLong(str));
            }
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private e c(String str) {
        Object e2 = e.b.l.q.e.e(str);
        if (e2 instanceof e) {
            return (e) e2;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        r4 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.Object r8, java.util.Map<java.lang.String, java.lang.String> r9, java.util.Map<java.lang.String, java.lang.String> r10, java.util.Map<java.lang.String, java.lang.Object> r11) {
        /*
            if (r8 == 0) goto Lba
            if (r9 != 0) goto La
            if (r10 != 0) goto La
            if (r11 != 0) goto La
            goto Lba
        La:
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            if (r0 == 0) goto Lba
            int r1 = r0.length
            if (r1 <= 0) goto Lba
            int r1 = r0.length
            r2 = 0
        L19:
            if (r2 >= r1) goto Lba
            r3 = r0[r2]
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto Lb6
            java.lang.Class<com.bytedance.rpc.annotation.b> r4 = com.bytedance.rpc.annotation.b.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)
            com.bytedance.rpc.annotation.b r4 = (com.bytedance.rpc.annotation.b) r4
            java.lang.Class<com.bytedance.rpc.annotation.e> r5 = com.bytedance.rpc.annotation.e.class
            java.lang.annotation.Annotation r5 = r3.getAnnotation(r5)
            com.bytedance.rpc.annotation.e r5 = (com.bytedance.rpc.annotation.e) r5
            if (r4 != 0) goto L42
            if (r5 != 0) goto L3d
            r4 = 0
            goto L46
        L3d:
            com.bytedance.rpc.serialize.FieldType r4 = r5.value()
            goto L46
        L42:
            com.bytedance.rpc.serialize.FieldType r4 = r4.value()
        L46:
            if (r4 != 0) goto L4a
            goto Lb6
        L4a:
            r5 = 1
            r3.setAccessible(r5)     // Catch: java.lang.Exception -> Lb2
            java.lang.Object r5 = r3.get(r8)     // Catch: java.lang.Exception -> Lb2
            if (r5 != 0) goto L56
            goto Lb6
        L56:
            com.bytedance.rpc.serialize.FieldType r6 = com.bytedance.rpc.serialize.FieldType.HEADER     // Catch: java.lang.Exception -> Lb2
            if (r4 == r6) goto L81
            com.bytedance.rpc.serialize.FieldType r7 = com.bytedance.rpc.serialize.FieldType.QUERY     // Catch: java.lang.Exception -> Lb2
            if (r4 != r7) goto L5f
            goto L81
        L5f:
            com.bytedance.rpc.serialize.FieldType r6 = com.bytedance.rpc.serialize.FieldType.BODY     // Catch: java.lang.Exception -> Lb2
            if (r4 != r6) goto Lb6
            if (r11 != 0) goto L66
            goto Lb6
        L66:
            java.lang.Class<com.google.gson.annotations.SerializedName> r4 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r4)     // Catch: java.lang.Exception -> Lb2
            com.google.gson.annotations.SerializedName r4 = (com.google.gson.annotations.SerializedName) r4     // Catch: java.lang.Exception -> Lb2
            if (r4 != 0) goto L75
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> Lb2
            goto L79
        L75:
            java.lang.String r3 = r4.value()     // Catch: java.lang.Exception -> Lb2
        L79:
            java.lang.Object r4 = a(r5)     // Catch: java.lang.Exception -> Lb2
            r11.put(r3, r4)     // Catch: java.lang.Exception -> Lb2
            goto Lb6
        L81:
            if (r4 != r6) goto L85
            r4 = r9
            goto L86
        L85:
            r4 = r10
        L86:
            if (r4 != 0) goto L89
            goto Lb6
        L89:
            boolean r6 = r5 instanceof java.util.Map     // Catch: java.lang.Exception -> Lb2
            if (r6 == 0) goto L93
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Exception -> Lb2
            e(r4, r5)     // Catch: java.lang.Exception -> Lb2
            goto Lb6
        L93:
            java.lang.Class<com.google.gson.annotations.SerializedName> r6 = com.google.gson.annotations.SerializedName.class
            java.lang.annotation.Annotation r6 = r3.getAnnotation(r6)     // Catch: java.lang.Exception -> Lb2
            com.google.gson.annotations.SerializedName r6 = (com.google.gson.annotations.SerializedName) r6     // Catch: java.lang.Exception -> Lb2
            if (r6 != 0) goto La2
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> Lb2
            goto La6
        La2:
            java.lang.String r3 = r6.value()     // Catch: java.lang.Exception -> Lb2
        La6:
            java.lang.Object r5 = a(r5)     // Catch: java.lang.Exception -> Lb2
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Exception -> Lb2
            r4.put(r3, r5)     // Catch: java.lang.Exception -> Lb2
            goto Lb6
        Lb2:
            r3 = move-exception
            r3.printStackTrace()
        Lb6:
            int r2 = r2 + 1
            goto L19
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.rpc.serialize.g.d(java.lang.Object, java.util.Map, java.util.Map, java.util.Map):void");
    }

    private static void e(Map<String, String> map, Map<?, ?> map2) {
        if (map2.isEmpty()) {
            return;
        }
        for (Map.Entry<?, ?> entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && value != null) {
                map.put(String.valueOf(key), String.valueOf(value));
            }
        }
    }

    public static Map<String, String> f(Object obj, Map<String, String> map) throws Exception {
        if (map == null) {
            map = new HashMap<>(8);
        }
        for (Object obj2 : obj instanceof Object[] ? (Object[]) obj : new Object[]{obj}) {
            if (obj2 != null) {
                Class<?> cls = obj2.getClass();
                if (Map.class.isAssignableFrom(cls)) {
                    e(map, (Map) obj2);
                } else if (l.class.isAssignableFrom(cls)) {
                    Set<Map.Entry<String, i>> h = ((l) obj2).h();
                    if (h.size() > 0) {
                        for (Map.Entry<String, i> entry : h) {
                            String key = entry.getKey();
                            i value = entry.getValue();
                            if (key != null && value != null) {
                                map.put(key, value.c());
                            }
                        }
                    }
                } else if (JSONObject.class.isAssignableFrom(cls)) {
                    JSONObject jSONObject = (JSONObject) obj2;
                    if (jSONObject.length() != 0) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object opt = jSONObject.opt(next);
                            if (next != null && opt != null) {
                                map.put(next, String.valueOf(opt));
                            }
                        }
                    }
                } else {
                    Field[] declaredFields = obj2.getClass().getDeclaredFields();
                    if (declaredFields != null && declaredFields.length > 0) {
                        for (Field field : declaredFields) {
                            if (!Modifier.isStatic(field.getModifiers()) && field.getAnnotation(com.bytedance.rpc.annotation.e.class) == null && field.getAnnotation(com.bytedance.rpc.annotation.b.class) == null) {
                                field.setAccessible(true);
                                Object obj3 = field.get(obj2);
                                if (obj3 != null) {
                                    if (obj3 instanceof Map) {
                                        e(map, (Map) obj3);
                                    } else if (obj3 instanceof List) {
                                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                                        String name = serializedName == null ? field.getName() : serializedName.value();
                                        StringBuilder sb = new StringBuilder();
                                        for (Object obj4 : (List) obj3) {
                                            if (obj4 != null) {
                                                sb.append(a(obj4).toString());
                                                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                            }
                                        }
                                        String sb2 = sb.toString();
                                        if (sb2.length() > 0) {
                                            sb2 = sb2.substring(0, sb2.length() - 1);
                                        }
                                        map.put(name, sb2);
                                    } else {
                                        SerializedName serializedName2 = (SerializedName) field.getAnnotation(SerializedName.class);
                                        map.put(serializedName2 == null ? field.getName() : serializedName2.value(), String.valueOf(a(obj3)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    public static void g(Object obj, Map<String, String> map) {
        Field[] declaredFields;
        if (obj.getClass().getAnnotation(com.bytedance.rpc.annotation.d.class) == null || (declaredFields = obj.getClass().getDeclaredFields()) == null || declaredFields.length <= 0) {
            return;
        }
        for (Field field : declaredFields) {
            if (!Modifier.isStatic(field.getModifiers())) {
                com.bytedance.rpc.annotation.b bVar = (com.bytedance.rpc.annotation.b) field.getAnnotation(com.bytedance.rpc.annotation.b.class);
                com.bytedance.rpc.annotation.c cVar = (com.bytedance.rpc.annotation.c) field.getAnnotation(com.bytedance.rpc.annotation.c.class);
                FieldType value = bVar == null ? cVar == null ? null : cVar.value() : bVar.value();
                if (value != null && value == FieldType.HEADER) {
                    try {
                        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
                        String str = map.get(serializedName == null ? field.getName() : serializedName.value());
                        if (str != null) {
                            field.setAccessible(true);
                            if (CharSequence.class.isAssignableFrom(field.getType())) {
                                field.set(obj, str);
                            } else {
                                Object b = b(field.getType(), str);
                                if (b != null) {
                                    field.set(obj, b);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    public static String j(String str, String str2) {
        Matcher matcher = f6054d.matcher(str);
        return matcher.find() ? matcher.group(1).replaceAll("[\"\\\\]", "") : str2;
    }

    private void l() {
        if (this.f6055c.get(SerializeType.JSON) == null) {
            k(c("com.bytedance.rpc.serialize.JsonSerializeFactory"));
        }
        if (this.f6055c.get(SerializeType.PB) == null) {
            e c2 = c("com.bytedance.rpc.serialize.PbSerializeFactory");
            e c3 = c("com.bytedance.rpc.serialize.WireSerializeFactory");
            if (c2 == null || c3 == null) {
                k(c2);
                k(c3);
            } else {
                k(new f(c2.getSerializeType(), new e[]{c2, c3}));
            }
        }
        if (this.f6055c.get(SerializeType.THRIFT) == null) {
            k(c("com.bytedance.rpc.serialize.ThriftSerializeFactory"));
        }
        Object e2 = e.b.l.q.e.e("com.bytedance.rpc.rxjava.RxJavaInvokeInterceptor");
        if (e2 instanceof e.b.l.p.c) {
            o.b((e.b.l.p.c) e2);
        }
        this.b = false;
    }

    public String h() {
        if (this.b) {
            synchronized (this.f6055c) {
                if (this.b) {
                    l();
                }
            }
        }
        return this.a;
    }

    public e i(SerializeType serializeType) {
        if (serializeType == null) {
            return null;
        }
        synchronized (this.f6055c) {
            e eVar = this.f6055c.get(serializeType);
            if (eVar != null) {
                return eVar;
            }
            if (!this.b) {
                return null;
            }
            l();
            return this.f6055c.get(serializeType);
        }
    }

    public void k(e eVar) {
        SerializeType serializeType;
        if (eVar == null || (serializeType = eVar.getSerializeType()) == null) {
            return;
        }
        synchronized (this.f6055c) {
            if (this.f6055c.put(serializeType, eVar) == null) {
                String str = this.a;
                if (str != null && str.length() != 0) {
                    this.a = String.format("%s,%s", this.a, serializeType.getContentType());
                }
                this.a = serializeType.getContentType();
            }
        }
    }
}
