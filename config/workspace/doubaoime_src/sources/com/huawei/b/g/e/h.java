package com.huawei.b.g.e;

import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h implements com.huawei.b.g.b {
    private final Context a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private com.huawei.b.g.d f6972c;

    public h(Context context, String str) {
        Log.d("AGC_FlexibleDecrypt", "init");
        this.a = context;
        this.b = str;
    }

    @Override // com.huawei.b.g.b
    public String a(String str, String str2) {
        f fVar;
        if (this.f6972c == null) {
            String b = j.b(this.a, this.b, "agc_plugin_", "crypto_component");
            if (b != null) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(a.a(b), "utf-8"));
                    fVar = new f(new d(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
                } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e2) {
                    StringBuilder M = e.a.a.a.a.M("FlexibleDecrypt exception: ");
                    M.append(e2.getMessage());
                    Log.e("AGC_FlexibleDecrypt", M.toString());
                }
                this.f6972c = fVar;
            }
            fVar = null;
            this.f6972c = fVar;
        }
        if (this.f6972c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f6972c = new g(this.a, this.b).b();
        }
        return this.f6972c.a(j.b(this.a, this.b, "agc_plugin_", str), str2);
    }
}
