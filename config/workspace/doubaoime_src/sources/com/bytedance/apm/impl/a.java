package com.bytedance.apm.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.retrofit2.mime.i;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class a implements i {
    private final String a;

    @Nullable
    private Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3439c;

    public a(String str, @Nullable String str2, @Nullable Map<String, String> map) {
        this.a = str;
        this.b = map;
        if (!TextUtils.isEmpty(str2)) {
            this.f3439c = str2;
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("defaultData", "none commonParams");
        } catch (JSONException unused) {
        }
        this.f3439c = jSONObject.toString();
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String a() {
        return "text/plain";
    }

    @Override // com.bytedance.retrofit2.mime.i
    public void b(OutputStream outputStream) throws IOException {
        outputStream.write(this.f3439c.getBytes());
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String c() {
        String str = this.a;
        Map<String, String> map = this.b;
        StringBuilder R = e.a.a.a.a.R(str, "\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            e.a.a.a.a.M0(R, "; ", entry.getKey(), "=\"", entry.getValue());
            R.append("\"");
        }
        R.deleteCharAt(R.length() - 1);
        return R.toString();
    }

    @Override // com.bytedance.retrofit2.mime.i
    public String e() {
        return null;
    }

    @Override // com.bytedance.retrofit2.mime.i
    public long length() {
        return this.f3439c.getBytes().length;
    }
}
