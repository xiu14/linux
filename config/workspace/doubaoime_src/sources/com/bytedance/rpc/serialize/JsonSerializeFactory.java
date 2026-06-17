package com.bytedance.rpc.serialize;

import com.bytedance.rpc.annotation.RpcKeep;
import com.bytedance.rpc.serialize.json.TypeAdapterFactoryContainer;
import com.google.gson.Gson;
import com.google.gson.internal.l;
import com.google.gson.t;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;

@RpcKeep
/* loaded from: classes2.dex */
public class JsonSerializeFactory implements e {
    private com.bytedance.rpc.serialize.json.a mAdapterFactoryFiller;
    private com.bytedance.rpc.serialize.json.c mGsonBuilderFiller;
    private volatile Gson mGson = null;
    private final TypeAdapterFactoryContainer mTypeAdapterFactoryContainer = new TypeAdapterFactoryContainer();

    public static class a {
        private com.bytedance.rpc.serialize.json.c a;

        public JsonSerializeFactory a() {
            JsonSerializeFactory jsonSerializeFactory = new JsonSerializeFactory();
            jsonSerializeFactory.mGsonBuilderFiller = this.a;
            jsonSerializeFactory.mAdapterFactoryFiller = null;
            return jsonSerializeFactory;
        }

        public a b(com.bytedance.rpc.serialize.json.c cVar) {
            this.a = cVar;
            return this;
        }
    }

    private void decorateGsonBuilder(com.google.gson.d dVar) {
        com.bytedance.rpc.serialize.json.c cVar = this.mGsonBuilderFiller;
        if (cVar != null) {
            cVar.a(dVar);
            this.mGsonBuilderFiller = null;
        }
        dVar.b(new com.bytedance.rpc.serialize.json.b(true));
        dVar.a(new com.bytedance.rpc.serialize.json.b(false));
        dVar.e(this.mTypeAdapterFactoryContainer);
    }

    private void fillFactory(l lVar) {
        if (this.mAdapterFactoryFiller != null) {
            ArrayList arrayList = new ArrayList();
            this.mAdapterFactoryFiller.a(lVar, arrayList);
            this.mAdapterFactoryFiller = null;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.mTypeAdapterFactoryContainer.b((t) it2.next());
            }
        }
    }

    @Override // com.bytedance.rpc.serialize.e
    public d getDeserializer(com.bytedance.rpc.transport.e eVar, Type type) {
        return new com.bytedance.rpc.serialize.json.d(getGson(), eVar, type);
    }

    public Gson getGson() {
        if (this.mGson == null) {
            synchronized (g.class) {
                if (this.mGson == null) {
                    com.google.gson.d dVar = new com.google.gson.d();
                    decorateGsonBuilder(dVar);
                    this.mGson = dVar.c();
                    if (this.mAdapterFactoryFiller != null) {
                        try {
                            Field declaredField = this.mGson.getClass().getDeclaredField("constructorConstructor");
                            declaredField.setAccessible(true);
                            fillFactory((l) declaredField.get(this.mGson));
                        } catch (Exception e2) {
                            com.bytedance.rpc.log.b.c(e2);
                        }
                    }
                }
            }
        }
        return this.mGson;
    }

    @Override // com.bytedance.rpc.serialize.e
    public SerializeType getSerializeType() {
        return SerializeType.JSON;
    }

    @Override // com.bytedance.rpc.serialize.e
    public h getSerializer(Object obj, SerializeType serializeType) {
        return new com.bytedance.rpc.serialize.json.e(getGson(), obj, serializeType);
    }

    @Override // com.bytedance.rpc.serialize.e
    public boolean isReflectSupported() {
        return true;
    }
}
