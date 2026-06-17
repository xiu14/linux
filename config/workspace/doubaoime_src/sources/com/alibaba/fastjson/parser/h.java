package com.alibaba.fastjson.parser;

import java.lang.reflect.Type;

/* loaded from: classes.dex */
class h extends com.alibaba.fastjson.parser.o.d {

    /* renamed from: d, reason: collision with root package name */
    private final Type f1500d;

    /* renamed from: e, reason: collision with root package name */
    private com.alibaba.fastjson.parser.o.f f1501e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1502f;

    public h(Class cls, com.alibaba.fastjson.h.a aVar) {
        super(cls, aVar);
        Type type = aVar.h;
        Class<?> cls2 = aVar.f1474g;
        if (cls2.isArray()) {
            this.f1500d = cls2.getComponentType();
            this.f1502f = true;
        } else {
            this.f1500d = com.alibaba.fastjson.h.d.q(type);
            this.f1502f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0165  */
    @Override // com.alibaba.fastjson.parser.o.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.alibaba.fastjson.parser.b r19, java.lang.Object r20, java.lang.reflect.Type r21, java.util.Map<java.lang.String, java.lang.Object> r22) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.h.b(com.alibaba.fastjson.parser.b, java.lang.Object, java.lang.reflect.Type, java.util.Map):void");
    }
}
