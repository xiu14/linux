package com.bytedance.crash.monitor;

import android.os.Build;
import com.bytedance.crash.C0652g;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b extends g {
    private static JSONObject h;
    private static JSONArray i;
    private static boolean j;

    /* renamed from: e, reason: collision with root package name */
    protected com.bytedance.crash.O.a f4630e;

    /* renamed from: f, reason: collision with root package name */
    protected com.bytedance.crash.upload.k f4631f;

    /* renamed from: g, reason: collision with root package name */
    protected com.bytedance.crash.X.b f4632g;

    public b(f fVar) {
        super(fVar);
    }

    public static boolean f() {
        try {
            return "true".equals(com.bytedance.crash.util.a.p(new File(C0652g.f(), "anr_profiler.config")));
        } catch (Throwable unused) {
            return false;
        }
    }

    public static JSONArray g() {
        return i;
    }

    public static boolean h(JSONArray jSONArray) {
        if (jSONArray == null) {
            return false;
        }
        try {
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (jSONArray.toString().contains("none")) {
            return false;
        }
        if (jSONArray.toString().contains("all")) {
            return true;
        }
        if (jSONArray.length() > 0) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                if (Build.VERSION.SDK_INT == Integer.parseInt(jSONArray.optString(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void j(boolean z) {
        j = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01ff  */
    @Override // com.bytedance.crash.monitor.g, com.bytedance.crash.N.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.monitor.b.a(org.json.JSONObject):void");
    }

    protected void i(JSONObject jSONObject) {
        com.bytedance.android.input.k.b.a.X("NPTH_CFG", "SimpleSettings:" + jSONObject);
        this.f4631f = new com.bytedance.crash.upload.k(jSONObject.optInt("crash_limit_issue"), jSONObject.optInt("crash_limit_all"), jSONObject.optInt("crash_limit_exception"), jSONObject.optInt("crash_limit_exception_md5"), jSONObject.optInt("crash_limit_exception_stack"));
    }
}
