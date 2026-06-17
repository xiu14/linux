package com.bytedance.rpc.serialize.json;

/* loaded from: classes2.dex */
public class b implements com.google.gson.a {
    boolean a;

    public b(boolean z) {
        this.a = z;
    }

    @Override // com.google.gson.a
    public boolean a(com.google.gson.b bVar) {
        if (this.a) {
            if (bVar.a(com.bytedance.rpc.annotation.e.class) != null) {
                return true;
            }
        } else if (bVar.a(com.bytedance.rpc.annotation.c.class) != null) {
            return true;
        }
        return bVar.a(com.bytedance.rpc.annotation.b.class) != null;
    }

    @Override // com.google.gson.a
    public boolean b(Class<?> cls) {
        return false;
    }
}
