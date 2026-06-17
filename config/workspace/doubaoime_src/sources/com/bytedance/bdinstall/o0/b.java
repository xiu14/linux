package com.bytedance.bdinstall.o0;

import android.content.Context;
import com.bytedance.bdinstall.C0641v;
import com.bytedance.bdinstall.P;
import com.bytedance.bdinstall.Q;
import com.bytedance.bdinstall.V;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface b {
    void a(C0641v c0641v);

    void b(Context context, Map<String, Object> map);

    boolean c();

    void d(Context context, Map<String, String> map, boolean z, boolean z2);

    void e(P p);

    P f();

    void g(Context context, C0641v c0641v, long j, V v);

    String getDid();

    boolean h(JSONObject jSONObject);

    void i(Q q, C0641v c0641v);

    void start();
}
