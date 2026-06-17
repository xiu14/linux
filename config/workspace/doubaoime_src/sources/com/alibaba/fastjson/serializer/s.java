package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class s implements t, com.alibaba.fastjson.parser.o.f {
    public static final s a = new s();

    private s() {
    }

    /* JADX WARN: Type inference failed for: r8v16, types: [T, java.math.BigDecimal] */
    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        com.alibaba.fastjson.parser.d dVar = bVar.f1481e;
        int Y = dVar.Y();
        if (Y == 2) {
            if (type == Double.TYPE || type == Double.class) {
                String u = dVar.u();
                dVar.s(16);
                return (T) Double.valueOf(Double.parseDouble(u));
            }
            if (type == Float.TYPE || type == Float.class) {
                String u2 = dVar.u();
                dVar.s(16);
                return (T) Float.valueOf(Float.parseFloat(u2));
            }
            long n = dVar.n();
            dVar.s(16);
            return (type == Short.TYPE || type == Short.class) ? (T) Short.valueOf((short) n) : (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf((byte) n) : (n < -2147483648L || n > 2147483647L) ? (T) Long.valueOf(n) : (T) Integer.valueOf((int) n);
        }
        if (Y != 3) {
            Object s = bVar.s();
            if (s == null) {
                return null;
            }
            return (type == Double.TYPE || type == Double.class) ? (T) com.alibaba.fastjson.h.d.h(s) : (type == Float.TYPE || type == Float.class) ? (T) com.alibaba.fastjson.h.d.i(s) : (type == Short.TYPE || type == Short.class) ? (T) com.alibaba.fastjson.h.d.m(s) : (type == Byte.TYPE || type == Byte.class) ? (T) com.alibaba.fastjson.h.d.f(s) : (T) com.alibaba.fastjson.h.d.c(s);
        }
        if (type == Double.TYPE || type == Double.class) {
            String u3 = dVar.u();
            dVar.s(16);
            return (T) Double.valueOf(Double.parseDouble(u3));
        }
        if (type == Float.TYPE || type == Float.class) {
            String u4 = dVar.u();
            dVar.s(16);
            return (T) Float.valueOf(Float.parseFloat(u4));
        }
        ?? r8 = (T) dVar.g();
        dVar.s(16);
        return (type == Short.TYPE || type == Short.class) ? (T) Short.valueOf(r8.shortValue()) : (type == Byte.TYPE || type == Byte.class) ? (T) Byte.valueOf(r8.byteValue()) : r8;
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        if (obj == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullNumberAsZero.mask) != 0) {
                yVar.write(48);
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (Float.isNaN(floatValue)) {
                yVar.write("null");
                return;
            }
            if (Float.isInfinite(floatValue)) {
                yVar.write("null");
                return;
            }
            String f2 = Float.toString(floatValue);
            if (f2.endsWith(".0")) {
                f2 = f2.substring(0, f2.length() - 2);
            }
            yVar.write(f2);
            if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0) {
                yVar.write(70);
                return;
            }
            return;
        }
        double doubleValue = ((Double) obj).doubleValue();
        if (Double.isNaN(doubleValue)) {
            yVar.write("null");
            return;
        }
        if (Double.isInfinite(doubleValue)) {
            yVar.write("null");
            return;
        }
        String d2 = Double.toString(doubleValue);
        if (d2.endsWith(".0")) {
            d2 = d2.substring(0, d2.length() - 2);
        }
        yVar.a(d2);
        if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0) {
            yVar.write(68);
        }
    }
}
