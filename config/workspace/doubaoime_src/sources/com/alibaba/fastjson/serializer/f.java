package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public final class f implements t, com.alibaba.fastjson.parser.o.f {
    public static final f a = new f();

    private f() {
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        com.alibaba.fastjson.parser.d dVar = bVar.f1481e;
        int Y = dVar.Y();
        if (Y == 6) {
            dVar.s(16);
            return (T) Boolean.TRUE;
        }
        if (Y == 7) {
            dVar.s(16);
            return (T) Boolean.FALSE;
        }
        if (Y == 2) {
            int j = dVar.j();
            dVar.s(16);
            return j == 1 ? (T) Boolean.TRUE : (T) Boolean.FALSE;
        }
        Object s = bVar.s();
        if (s == null) {
            return null;
        }
        return (T) com.alibaba.fastjson.h.d.e(s);
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            if ((yVar.f1531c & SerializerFeature.WriteNullBooleanAsFalse.mask) != 0) {
                yVar.write("false");
                return;
            } else {
                yVar.write("null");
                return;
            }
        }
        if (bool.booleanValue()) {
            yVar.write("true");
        } else {
            yVar.write("false");
        }
    }
}
