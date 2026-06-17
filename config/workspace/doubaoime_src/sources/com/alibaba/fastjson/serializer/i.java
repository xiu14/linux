package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
class i implements t {
    i() {
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        y yVar = mVar.b;
        if ((yVar.f1531c & SerializerFeature.WriteEnumUsingToString.mask) == 0) {
            yVar.p(((Enum) obj).ordinal());
            return;
        }
        String str = ((Enum) obj).toString();
        if ((yVar.f1531c & SerializerFeature.UseSingleQuotes.mask) != 0) {
            yVar.z(str);
        } else {
            yVar.x(str, (char) 0, false);
        }
    }
}
