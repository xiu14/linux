package com.huawei.hianalytics.util;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    public static List<String> a(Context context) {
        String str;
        if (context != null) {
            try {
                try {
                    InputStream open = context.getResources().getAssets().open("hianalytics_config");
                    JSONArray jSONArray = new JSONObject(f.a(open, 2048)).getJSONArray("base_uri");
                    if (jSONArray == null) {
                        com.huawei.hianalytics.g.b.c("HiAnalytics/event", "not found base_uri");
                        ArrayList arrayList = new ArrayList();
                        f.a(7, open);
                        return arrayList;
                    }
                    int length = jSONArray.length();
                    if (length != 0 && length <= 13) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < length; i++) {
                            String optString = jSONArray.optString(i, "");
                            if (h.a(optString)) {
                                arrayList2.add(optString);
                            }
                        }
                        f.a(7, open);
                        return arrayList2;
                    }
                    com.huawei.hianalytics.g.b.c("HiAnalytics/event", "preBaseUri config is error,Number error of URI");
                    ArrayList arrayList3 = new ArrayList();
                    f.a(7, open);
                    return arrayList3;
                } finally {
                    f.a(7, (Closeable) null);
                }
            } catch (IOException unused) {
                str = "read preBaseUri error,the file is corrupted";
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", str);
                return new ArrayList();
            } catch (JSONException unused2) {
                str = "preBaseUri config is no json";
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", str);
                return new ArrayList();
            } catch (Exception unused3) {
                str = "preBaseUri config other exception";
                com.huawei.hianalytics.g.b.c("HiAnalytics/event", str);
                return new ArrayList();
            }
        }
        return new ArrayList();
    }
}
