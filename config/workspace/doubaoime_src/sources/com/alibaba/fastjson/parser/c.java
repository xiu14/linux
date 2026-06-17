package com.alibaba.fastjson.parser;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class c implements com.alibaba.fastjson.parser.o.f {
    private final Class<?> a;
    protected final Enum[] b;

    public c(Class<?> cls) {
        this.a = cls;
        this.b = (Enum[]) cls.getEnumConstants();
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(b bVar, Type type, Object obj) {
        try {
            d dVar = bVar.f1481e;
            int i = dVar.a;
            if (i == 2) {
                int j = dVar.j();
                dVar.s(16);
                if (j >= 0) {
                    Object[] objArr = this.b;
                    if (j <= objArr.length) {
                        return (T) objArr[j];
                    }
                }
                throw new com.alibaba.fastjson.d("parse enum " + this.a.getName() + " error, value : " + j);
            }
            if (i == 4) {
                String V = dVar.V();
                dVar.s(16);
                if (V.length() == 0) {
                    return null;
                }
                return (T) Enum.valueOf(this.a, V);
            }
            if (i == 8) {
                dVar.s(16);
                return null;
            }
            throw new com.alibaba.fastjson.d("parse enum " + this.a.getName() + " error, value : " + bVar.s());
        } catch (com.alibaba.fastjson.d e2) {
            throw e2;
        } catch (Exception e3) {
            throw new com.alibaba.fastjson.d(e3.getMessage(), e3);
        }
    }
}
