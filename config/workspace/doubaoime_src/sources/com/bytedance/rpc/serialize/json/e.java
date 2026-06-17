package com.bytedance.rpc.serialize.json;

import com.bytedance.rpc.serialize.SerializeType;
import com.bytedance.rpc.serialize.g;
import com.google.gson.Gson;
import com.google.gson.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends com.bytedance.rpc.serialize.b {

    /* renamed from: c, reason: collision with root package name */
    private Gson f6057c;

    public e(Gson gson, Object obj, SerializeType serializeType) {
        super(obj, serializeType);
        this.f6057c = gson;
    }

    @Override // com.bytedance.rpc.serialize.b
    public byte[] b(Object obj, String str) throws Exception {
        String j = e.b.l.q.c.c(str) ? g.j(str, "UTF-8") : "UTF-8";
        return ((obj instanceof JSONObject) || (obj instanceof i)) ? obj.toString().getBytes(j) : this.f6057c.j(obj).getBytes(j);
    }
}
