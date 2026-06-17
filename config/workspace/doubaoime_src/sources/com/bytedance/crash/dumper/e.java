package com.bytedance.crash.dumper;

import androidx.annotation.NonNull;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.ICommonParams;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {
    private ICommonParams a;

    public e(ICommonParams iCommonParams) {
        this.a = iCommonParams;
    }

    private void b(File file) {
        try {
            List<String> patchInfo = this.a.getPatchInfo();
            if (patchInfo == null) {
                return;
            }
            com.bytedance.crash.dumper.j.f fVar = new com.bytedance.crash.dumper.j.f(new File(file, "patch_info.json").getAbsolutePath());
            fVar.a('[');
            boolean z = false;
            for (String str : patchInfo) {
                if (z) {
                    fVar.a(',');
                }
                fVar.d(str);
                z = true;
            }
            fVar.a(']');
            fVar.h();
        } catch (Throwable unused) {
        }
    }

    public void a(@NonNull File file) {
        try {
            b(file);
            b.a(new File(file, "bytest.json"));
        } catch (Exception unused) {
        }
    }

    public JSONObject c(CrashType crashType) {
        List<String> patchInfo;
        if (crashType != CrashType.ENSURE) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            ICommonParams iCommonParams = this.a;
            if (iCommonParams != null && (patchInfo = iCommonParams.getPatchInfo()) != null && !patchInfo.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = patchInfo.iterator();
                while (it2.hasNext()) {
                    jSONArray.put(it2.next());
                }
                jSONObject.put("patch_info", jSONArray);
            }
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        b.b(jSONObject2);
        com.bytedance.android.input.k.b.a.y0(jSONObject, "filters", jSONObject2);
        return jSONObject;
    }

    public void d(@NonNull JSONObject jSONObject, @NonNull JSONObject jSONObject2, @NonNull File file) {
        try {
            String C0 = com.bytedance.android.input.k.b.a.C0(new File(file, "patch_info.json"));
            if (C0 != null) {
                com.bytedance.android.input.k.b.a.y0(jSONObject, "patch_info", new JSONArray(C0));
            }
        } catch (Exception e2) {
            com.bytedance.android.input.k.b.a.W(e2);
        }
        File file2 = new File(file, "bytest.json");
        JSONObject jSONObject3 = null;
        try {
            if (file2.isFile() && file2.exists()) {
                JSONObject jSONObject4 = new JSONObject(com.bytedance.crash.util.a.p(file2));
                JSONObject optJSONObject = jSONObject4.optJSONObject("slardar_filter");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("filters");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                    jSONObject.put("filters", optJSONObject2);
                }
                if (optJSONObject != null && optJSONObject.length() != 0) {
                    if ("true".equals(optJSONObject.optString("core_dump_switch"))) {
                        optJSONObject2.put("coredump_bytest", true);
                    }
                    com.bytedance.android.input.k.b.a.j(optJSONObject2, optJSONObject);
                    jSONObject3 = jSONObject4;
                }
                optJSONObject2.put("coredump_bytest", false);
                jSONObject3 = jSONObject4;
            }
        } catch (Exception unused) {
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("header");
        if (optJSONObject3 == null) {
            b.f(jSONObject3, jSONObject2);
        } else {
            b.f(jSONObject3, optJSONObject3);
        }
    }
}
