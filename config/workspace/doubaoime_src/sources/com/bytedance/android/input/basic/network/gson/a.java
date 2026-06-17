package com.bytedance.android.input.basic.network.gson;

import com.bytedance.rpc.serialize.json.c;
import com.google.gson.d;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a implements c {
    @Override // com.bytedance.rpc.serialize.json.c
    public void a(d dVar) {
        l.f(dVar, "gsonBuilder");
        dVar.e(new RpcEnumTypeAdapterFactory());
    }
}
