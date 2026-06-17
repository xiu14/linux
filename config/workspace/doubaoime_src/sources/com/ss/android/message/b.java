package com.ss.android.message;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public interface b extends c {

    public interface a {
    }

    void a(a aVar);

    void b(Context context, JSONObject jSONObject);

    void c(Context context, Map<String, String> map);

    void g(Context context, com.ss.android.g.b bVar);

    void onStart();
}
