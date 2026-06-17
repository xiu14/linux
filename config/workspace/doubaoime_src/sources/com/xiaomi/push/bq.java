package com.xiaomi.push;

import org.json.JSONArray;

/* loaded from: classes2.dex */
public class bq extends JSONArray implements bp {
    private int a = 2;

    @Override // com.xiaomi.push.bp
    public int a() {
        return (length() - 1) + this.a;
    }

    @Override // org.json.JSONArray
    public JSONArray put(Object obj) {
        if (obj instanceof bp) {
            this.a = ((bp) obj).a() + this.a;
        }
        return super.put(obj);
    }
}
