package com.bytedance.rpc.serialize.json;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class TypeAdapterFactoryContainer implements t {
    private final List<t> a = new ArrayList();

    @Override // com.google.gson.t
    public <T> TypeAdapter<T> a(Gson gson, com.google.gson.u.a<T> aVar) {
        Iterator<t> it2 = this.a.iterator();
        while (it2.hasNext()) {
            TypeAdapter<T> a = it2.next().a(gson, aVar);
            if (a != null) {
                return a;
            }
        }
        return null;
    }

    public void b(t tVar) {
        this.a.add(tVar);
    }
}
