package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Currency;
import java.util.Enumeration;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q implements t, com.alibaba.fastjson.parser.o.f {
    public static final q a = new q();

    private q() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x015f, code lost:
    
        return (T) new java.lang.StackTraceElement(r2, r10, r11, r12);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, java.text.SimpleDateFormat] */
    @Override // com.alibaba.fastjson.parser.o.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> T a(com.alibaba.fastjson.parser.b r17, java.lang.reflect.Type r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.q.a(com.alibaba.fastjson.parser.b, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        if (obj == null) {
            if (type == Character.TYPE || type == Character.class) {
                mVar.g("");
                return;
            } else if ((yVar.f1531c & SerializerFeature.WriteNullListAsEmpty.mask) == 0 || !Enumeration.class.isAssignableFrom(com.alibaba.fastjson.h.d.p(type))) {
                yVar.write("null");
                return;
            } else {
                yVar.write("[]");
                return;
            }
        }
        if (obj instanceof Pattern) {
            mVar.g(((Pattern) obj).pattern());
            return;
        }
        if (obj instanceof TimeZone) {
            mVar.g(((TimeZone) obj).getID());
            return;
        }
        if (obj instanceof Currency) {
            mVar.g(((Currency) obj).getCurrencyCode());
            return;
        }
        if (obj instanceof Class) {
            mVar.g(((Class) obj).getName());
            return;
        }
        if (obj instanceof Character) {
            Character ch = (Character) obj;
            if (ch.charValue() == 0) {
                mVar.g("\u0000");
                return;
            } else {
                mVar.g(ch.toString());
                return;
            }
        }
        int i = 0;
        if (obj instanceof SimpleDateFormat) {
            String pattern = ((SimpleDateFormat) obj).toPattern();
            if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) == 0 || obj.getClass() == type) {
                yVar.w(pattern);
                return;
            }
            yVar.write(123);
            yVar.o("@type", false);
            mVar.g(obj.getClass().getName());
            yVar.write(44);
            yVar.o("val", false);
            yVar.w(pattern);
            yVar.write(125);
            return;
        }
        if (obj instanceof com.alibaba.fastjson.f) {
            ((com.alibaba.fastjson.f) obj).a(yVar);
            return;
        }
        if (obj instanceof com.alibaba.fastjson.c) {
            yVar.write(((com.alibaba.fastjson.c) obj).b());
            return;
        }
        if (obj instanceof l) {
            ((l) obj).a(mVar, obj2, type);
            return;
        }
        if (!(obj instanceof Enumeration)) {
            mVar.g(obj.toString());
            return;
        }
        Type type2 = null;
        if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0 && (type instanceof ParameterizedType)) {
            type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        }
        Enumeration enumeration = (Enumeration) obj;
        w wVar = mVar.m;
        mVar.e(wVar, obj, obj2, 0);
        try {
            yVar.write(91);
            while (enumeration.hasMoreElements()) {
                Object nextElement = enumeration.nextElement();
                int i2 = i + 1;
                if (i != 0) {
                    yVar.write(44);
                }
                if (nextElement == null) {
                    yVar.write("null");
                } else {
                    mVar.a.a(nextElement.getClass()).b(mVar, nextElement, Integer.valueOf(i2 - 1), type2);
                }
                i = i2;
            }
            yVar.write(93);
        } finally {
            mVar.m = wVar;
        }
    }
}
