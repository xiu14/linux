package com.bytedance.rpc.serialize;

/* loaded from: classes2.dex */
public abstract class b implements h {
    protected Object a;
    protected SerializeType b;

    public b(Object obj, SerializeType serializeType) {
        this.a = obj;
        this.b = serializeType;
    }

    public static Object c(Object obj, boolean z) {
        if (obj == null || !(obj instanceof Object[])) {
            return obj;
        }
        Object[] objArr = (Object[]) obj;
        if (objArr.length == 0) {
            return null;
        }
        return (z || objArr.length == 1) ? objArr[0] : obj;
    }

    public final c a() throws Exception {
        String contentType = this.b.getContentType();
        Object c2 = c(this.a, false);
        return new c(c2 == null ? null : b(c2, contentType), contentType, null, null);
    }

    public abstract byte[] b(Object obj, String str) throws Exception;
}
