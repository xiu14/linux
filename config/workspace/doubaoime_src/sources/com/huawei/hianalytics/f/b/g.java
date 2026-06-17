package com.huawei.hianalytics.f.b;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.io.UnsupportedEncodingException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class g {
    private String a;
    private h b;

    /* renamed from: c, reason: collision with root package name */
    private i f7064c;

    /* renamed from: d, reason: collision with root package name */
    private b f7065d;

    /* renamed from: e, reason: collision with root package name */
    private a[] f7066e;

    /* renamed from: f, reason: collision with root package name */
    private String f7067f;

    /* renamed from: g, reason: collision with root package name */
    private String f7068g;

    public g() {
    }

    public g(String str, String str2, String str3) {
        this.a = str;
        this.f7067f = str2;
        this.f7068g = str3;
    }

    public h a() {
        return this.b;
    }

    public void a(b bVar) {
        this.f7065d = bVar;
    }

    public void a(h hVar) {
        this.b = hVar;
    }

    public void a(i iVar) {
        this.f7064c = iVar;
    }

    public void a(List<a> list) {
        this.f7066e = list == null ? null : (a[]) list.toArray(new a[list.size()]);
    }

    public a[] b() {
        a[] aVarArr = this.f7066e;
        if (aVarArr == null) {
            return new a[0];
        }
        a[] aVarArr2 = new a[aVarArr.length];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        return aVarArr2;
    }

    public JSONObject c() {
        String str;
        b bVar;
        if (this.f7066e == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            h hVar = this.b;
            if (hVar != null) {
                jSONObject.put("header", hVar.b());
            }
            if (this.f7064c != null && (bVar = this.f7065d) != null) {
                JSONObject a = bVar.a();
                a.put("properties", this.f7064c.a());
                String f2 = com.huawei.hianalytics.a.c.f(this.f7067f, this.f7068g);
                if (TextUtils.isEmpty(f2)) {
                    a.put("events_global_properties", "");
                } else {
                    a.put("events_global_properties", new JSONObject(f2));
                }
                jSONObject2.put("events_common", a);
            }
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                a[] aVarArr = this.f7066e;
                if (i >= aVarArr.length) {
                    break;
                }
                JSONObject b = aVarArr[i].b();
                if (b != null) {
                    jSONArray.put(b);
                }
                i++;
            }
            jSONObject2.put("events", jSONArray);
            byte[] a2 = com.huawei.hianalytics.f.g.h.a(jSONObject2.toString().getBytes("UTF-8"));
            byte[] a3 = com.huawei.hianalytics.f.g.c.a();
            jSONObject.put(NotificationCompat.CATEGORY_EVENT, com.huawei.hianalytics.f.g.c.a(a3, com.huawei.hianalytics.f.g.c.a(this.a, a3, a2)));
        } catch (UnsupportedEncodingException unused) {
            str = "getBitZip(): Unsupported coding : utf-8";
            com.huawei.hianalytics.g.b.c("UploadData", str);
            return jSONObject;
        } catch (JSONException unused2) {
            str = "event upload data - toJsonObj(): JSON Exception has happen";
            com.huawei.hianalytics.g.b.c("UploadData", str);
            return jSONObject;
        }
        return jSONObject;
    }
}
