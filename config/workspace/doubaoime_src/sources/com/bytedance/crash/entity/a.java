package com.bytedance.crash.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private JSONObject a = new JSONObject();
    private Header b = new Header();

    @NonNull
    public Header a() {
        return this.b;
    }

    public JSONObject b() {
        return this.a.optJSONObject("header");
    }

    @NonNull
    public JSONObject c() {
        return this.a;
    }

    public void d(@NonNull String str, @Nullable Object obj) {
        com.bytedance.android.input.k.b.a.y0(this.a, str, obj);
    }

    public a e(Header header) {
        com.bytedance.android.input.k.b.a.y0(this.a, "header", header.e());
        this.b = header;
        return this;
    }

    public void f(JSONObject jSONObject) {
        this.a = jSONObject;
    }
}
