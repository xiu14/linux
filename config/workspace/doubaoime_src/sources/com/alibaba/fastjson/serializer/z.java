package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class z implements t, com.alibaba.fastjson.parser.o.f {
    public static z a = new z();

    private z() {
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        return (T) bVar.H();
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        String str = (String) obj;
        y yVar = mVar.b;
        if (str == null) {
            yVar.write("null");
        } else {
            yVar.w(str);
        }
    }
}
