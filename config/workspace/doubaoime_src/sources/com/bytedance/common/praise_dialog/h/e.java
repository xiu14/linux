package com.bytedance.common.praise_dialog.h;

import android.util.Pair;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.utility.e;
import com.ss.android.socialbase.downloader.utils.DownloadHelper;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e implements e.b.k.c.e {
    @Override // e.b.k.c.e
    public String a(int i, String str, Map<String, String> map) {
        IAppGlobals.a.j("PraiseDialogNetworkImpl", "executePost: " + str + ", " + map);
        if (str != null && kotlin.text.a.d(str, "v2", false, 2, null)) {
            ArrayList arrayList = new ArrayList();
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    Pair create = Pair.create(entry.getKey(), entry.getValue());
                    l.e(create, "create(key, value)");
                    arrayList.add(create);
                }
            }
            com.bytedance.common.utility.e b = com.bytedance.common.utility.e.b();
            List<Pair<String, String>> e0 = kotlin.collections.g.e0(arrayList);
            Objects.requireNonNull(b);
            e.a aVar = new e.a();
            aVar.a = true;
            String c2 = b.c(str, e0, null, aVar);
            l.e(c2, "getDefault().post(url, list.toList())");
            return c2;
        }
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                jSONObject.put(entry2.getKey(), entry2.getValue());
            }
        }
        String jSONObject2 = jSONObject.toString();
        l.e(jSONObject2, "paramJson.toString()");
        Charset forName = Charset.forName("UTF-8");
        l.e(forName, "forName(charsetName)");
        byte[] bytes = jSONObject2.getBytes(forName);
        l.e(bytes, "this as java.lang.String).getBytes(charset)");
        com.bytedance.common.utility.e b2 = com.bytedance.common.utility.e.b();
        Objects.requireNonNull(b2);
        HashMap hashMap = new HashMap();
        if (!com.bytedance.android.input.k.b.a.Y("application/json")) {
            hashMap.put(DownloadHelper.CONTENT_TYPE, "application/json");
        }
        e.a aVar2 = new e.a();
        aVar2.a = false;
        String d2 = b2.d(str, bytes, hashMap, aVar2);
        l.e(d2, "getDefault().post(\n     …son\", false\n            )");
        return d2;
    }
}
