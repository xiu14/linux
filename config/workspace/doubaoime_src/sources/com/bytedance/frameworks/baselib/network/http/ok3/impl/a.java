package com.bytedance.frameworks.baselib.network.http.ok3.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    private final List<String> a = new CopyOnWriteArrayList();

    private a() {
    }

    public static a b() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public List<String> a() {
        return this.a;
    }

    public void c(JSONObject jSONObject) {
        okhttp3.G.a.n(jSONObject, "log_header_rm_list", this.a);
    }
}
