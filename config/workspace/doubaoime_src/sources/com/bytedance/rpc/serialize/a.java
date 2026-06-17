package com.bytedance.rpc.serialize;

import java.lang.reflect.Type;

/* loaded from: classes2.dex */
public abstract class a implements d {
    protected Type a;
    protected com.bytedance.rpc.transport.e b;

    public a(com.bytedance.rpc.transport.e eVar, Type type) {
        this.a = type;
        this.b = eVar;
    }

    public final Object a() throws Exception {
        return b(this.b, this.a);
    }

    protected abstract Object b(com.bytedance.rpc.transport.e eVar, Type type) throws Exception;
}
