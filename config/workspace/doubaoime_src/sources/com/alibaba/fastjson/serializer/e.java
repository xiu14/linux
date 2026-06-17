package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes.dex */
public class e implements t, com.alibaba.fastjson.parser.o.f {
    public static final e a = new e();

    private e() {
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T, java.math.BigDecimal] */
    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        com.alibaba.fastjson.parser.d dVar = bVar.f1481e;
        int Y = dVar.Y();
        if (Y == 2) {
            if (type == BigInteger.class) {
                String u = dVar.u();
                dVar.s(16);
                return (T) new BigInteger(u, 10);
            }
            T t = (T) dVar.g();
            dVar.s(16);
            return t;
        }
        if (Y == 3) {
            ?? r4 = (T) dVar.g();
            dVar.s(16);
            return type == BigInteger.class ? (T) r4.toBigInteger() : r4;
        }
        Object s = bVar.s();
        if (s == null) {
            return null;
        }
        return type == BigInteger.class ? (T) com.alibaba.fastjson.h.d.d(s) : (T) com.alibaba.fastjson.h.d.c(s);
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
        if (obj instanceof BigInteger) {
            yVar.write(((BigInteger) obj).toString());
            return;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        yVar.write(bigDecimal.toString());
        if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) == 0 || type == BigDecimal.class || bigDecimal.scale() != 0) {
            return;
        }
        yVar.write(46);
    }
}
