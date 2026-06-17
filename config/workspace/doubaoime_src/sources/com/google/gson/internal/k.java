package com.google.gson.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes2.dex */
class k<T> implements w<T> {
    final /* synthetic */ Class a;

    k(l lVar, Class cls) {
        this.a = cls;
    }

    @Override // com.google.gson.internal.w
    public T a() {
        try {
            return (T) G.a.b(this.a);
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Unable to create instance of ");
            M.append(this.a);
            M.append(". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.");
            throw new RuntimeException(M.toString(), e2);
        }
    }
}
