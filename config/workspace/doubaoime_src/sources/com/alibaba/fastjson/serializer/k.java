package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public final class k implements t, com.alibaba.fastjson.parser.o.f {
    public static k a = new k();

    private k() {
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        T t;
        com.alibaba.fastjson.parser.d dVar = bVar.f1481e;
        int Y = dVar.Y();
        if (Y == 8) {
            dVar.s(16);
            return null;
        }
        if (Y == 2) {
            if (type == Long.TYPE || type == Long.class) {
                t = (T) Long.valueOf(dVar.n());
            } else {
                try {
                    t = (T) Integer.valueOf(dVar.j());
                } catch (NumberFormatException e2) {
                    throw new com.alibaba.fastjson.d(e.a.a.a.a.q("int value overflow, field : ", obj), e2);
                }
            }
            dVar.s(16);
            return t;
        }
        if (Y == 3) {
            BigDecimal g2 = dVar.g();
            dVar.s(16);
            return (type == Long.TYPE || type == Long.class) ? (T) Long.valueOf(g2.longValue()) : (T) Integer.valueOf(g2.intValue());
        }
        T t2 = (T) bVar.s();
        try {
            if (type != Long.TYPE && type != Long.class) {
                t2 = (T) com.alibaba.fastjson.h.d.j(t2);
                return t2;
            }
            t2 = (T) com.alibaba.fastjson.h.d.l(t2);
            return t2;
        } catch (Exception e3) {
            throw new com.alibaba.fastjson.d("cast error, field : " + obj + ", value " + t2, e3);
        }
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        Number number = (Number) obj;
        if (number == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullNumberAsZero.mask) != 0) {
                yVar.write(48);
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        if (obj instanceof Long) {
            yVar.r(number.longValue());
        } else {
            yVar.p(number.intValue());
        }
        if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0) {
            Class<?> cls = number.getClass();
            if (cls == Byte.class) {
                yVar.write(66);
                return;
            }
            if (cls == Short.class) {
                yVar.write(83);
                return;
            }
            if (cls == Long.class) {
                long longValue = number.longValue();
                if (longValue > 2147483647L || longValue < -2147483648L || type == Long.class) {
                    return;
                }
                yVar.write(76);
            }
        }
    }
}
