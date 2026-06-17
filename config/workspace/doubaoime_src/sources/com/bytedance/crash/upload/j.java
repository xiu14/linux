package com.bytedance.crash.upload;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f4701c;

    /* renamed from: d, reason: collision with root package name */
    private byte[] f4702d;

    /* renamed from: e, reason: collision with root package name */
    private Map<String, List<String>> f4703e;

    public j(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    @Nullable
    public byte[] b() {
        return this.f4702d;
    }

    public JSONObject c() {
        return this.f4701c;
    }

    public boolean d() {
        int i = this.a;
        return (i == 207 || i == 214) ? false : true;
    }

    public int e() {
        return this.b;
    }

    public void f(byte[] bArr) {
        this.f4702d = bArr;
    }

    public void g(int i) {
        this.a = i;
    }

    public void h(Map<String, List<String>> map) {
        this.f4703e = map;
    }

    public void i(int i) {
        this.b = i;
    }

    public void j(JSONObject jSONObject) {
        this.f4701c = jSONObject;
        try {
            String str = "";
            if (this.f4703e != null) {
                new ArrayList();
                Iterator<Map.Entry<String, List<String>>> it2 = this.f4703e.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it2.next();
                    if ("Alog_quota".equalsIgnoreCase(next.getKey())) {
                        List<String> value = next.getValue();
                        if (value.size() > 0) {
                            str = value.get(0);
                            break;
                        }
                    }
                }
            }
            this.f4701c.putOpt("Alog_quota", str);
            String optString = this.f4701c.optString("message");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            if (optString.equals("drop all data") || optString.equals("drop data")) {
                this.a = 213;
            }
        } catch (Throwable unused) {
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Response:mErrorCode=");
        M.append(this.a);
        M.append(", mServerErrorCode=");
        M.append(this.b);
        String sb = M.toString();
        if (this.f4701c == null) {
            return sb;
        }
        StringBuilder S = e.a.a.a.a.S(sb, ", mServerJson=");
        S.append(this.f4701c.toString());
        return S.toString();
    }

    public j(int i, Throwable th) {
        this.a = i;
        th.getMessage();
    }
}
