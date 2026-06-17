package com.alibaba.fastjson.serializer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class x {
    public static final x b = new x();
    private final com.alibaba.fastjson.h.b<t> a;

    public x() {
        com.alibaba.fastjson.h.b<t> bVar = new com.alibaba.fastjson.h.b<>(1024);
        this.a = bVar;
        bVar.b(Boolean.class, f.a);
        q qVar = q.a;
        bVar.b(Character.class, qVar);
        bVar.b(Byte.class, k.a);
        bVar.b(Short.class, k.a);
        bVar.b(Integer.class, k.a);
        bVar.b(Long.class, k.a);
        s sVar = s.a;
        bVar.b(Float.class, sVar);
        bVar.b(Double.class, sVar);
        bVar.b(Number.class, sVar);
        e eVar = e.a;
        bVar.b(BigDecimal.class, eVar);
        bVar.b(BigInteger.class, eVar);
        bVar.b(String.class, z.a);
        bVar.b(Object[].class, b.a);
        bVar.b(Class.class, qVar);
        bVar.b(SimpleDateFormat.class, qVar);
        bVar.b(Locale.class, qVar);
        bVar.b(Currency.class, qVar);
        bVar.b(TimeZone.class, qVar);
        bVar.b(UUID.class, qVar);
        bVar.b(URI.class, qVar);
        bVar.b(URL.class, qVar);
        bVar.b(Pattern.class, qVar);
        bVar.b(Charset.class, qVar);
    }

    public t a(Class<?> cls) {
        Class<? super Object> superclass;
        boolean z;
        t a = this.a.a(cls);
        if (a != null) {
            return a;
        }
        if (Map.class.isAssignableFrom(cls)) {
            this.a.b(cls, new p());
        } else if (List.class.isAssignableFrom(cls)) {
            this.a.b(cls, new o());
        } else if (Collection.class.isAssignableFrom(cls)) {
            this.a.b(cls, g.a);
        } else if (Date.class.isAssignableFrom(cls)) {
            this.a.b(cls, h.a);
        } else if (com.alibaba.fastjson.c.class.isAssignableFrom(cls)) {
            this.a.b(cls, q.a);
        } else if (l.class.isAssignableFrom(cls)) {
            this.a.b(cls, q.a);
        } else if (com.alibaba.fastjson.f.class.isAssignableFrom(cls)) {
            this.a.b(cls, q.a);
        } else if (cls.isEnum() || !((superclass = cls.getSuperclass()) == null || superclass == Object.class || !superclass.isEnum())) {
            this.a.b(cls, new i());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            this.a.b(cls, new c(componentType, a(componentType)));
        } else if (Throwable.class.isAssignableFrom(cls)) {
            n nVar = new n(cls, null);
            nVar.f1523c |= SerializerFeature.WriteClassName.mask;
            this.a.b(cls, nVar);
        } else if (TimeZone.class.isAssignableFrom(cls)) {
            this.a.b(cls, q.a);
        } else if (Charset.class.isAssignableFrom(cls)) {
            this.a.b(cls, q.a);
        } else if (Enumeration.class.isAssignableFrom(cls)) {
            this.a.b(cls, q.a);
        } else if (Calendar.class.isAssignableFrom(cls)) {
            this.a.b(cls, h.a);
        } else {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            boolean z2 = false;
            int i = 0;
            while (true) {
                z = true;
                if (i >= length) {
                    z = false;
                    break;
                }
                Class<?> cls2 = interfaces[i];
                if (cls2.getName().equals("net.sf.cglib.proxy.Factory") || cls2.getName().equals("org.springframework.cglib.proxy.Factory")) {
                    break;
                }
                if (cls2.getName().equals("javassist.util.proxy.ProxyObject")) {
                    break;
                }
                i++;
            }
            z = false;
            z2 = true;
            if (z2 || z) {
                t a2 = a(cls.getSuperclass());
                this.a.b(cls, a2);
                return a2;
            }
            if (cls.getName().startsWith("android.net.Uri$")) {
                this.a.b(cls, q.a);
            } else {
                this.a.b(cls, new n(cls, null));
            }
        }
        return this.a.a(cls);
    }
}
