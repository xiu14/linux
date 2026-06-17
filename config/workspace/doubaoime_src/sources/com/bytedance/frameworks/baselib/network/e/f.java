package com.bytedance.frameworks.baselib.network.e;

import com.bytedance.retrofit2.client.Request;
import com.vivo.push.PushClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
class f extends c {
    private List<String> i;
    private List<String> j;
    private boolean k;
    private boolean l;

    public f(int i) {
        super(i);
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = false;
        this.l = false;
    }

    @Override // com.bytedance.frameworks.baselib.network.e.c
    protected boolean b(Request request, Map<String, List<String>> map) {
        if (this.k || !e(request) || map.isEmpty()) {
            return false;
        }
        if (!this.i.isEmpty()) {
            Map<? extends String, ? extends List<String>> linkedHashMap = new LinkedHashMap<>();
            if (map.containsKey("x-tt-encrypt-queries")) {
                linkedHashMap.put("x-tt-encrypt-queries", map.get("x-tt-encrypt-queries"));
            }
            for (String str : this.i) {
                if (map.containsKey(str)) {
                    linkedHashMap.put(str, map.get(str));
                }
            }
            map.clear();
            map.putAll(linkedHashMap);
            return true;
        }
        if (this.j.isEmpty()) {
            return true;
        }
        Iterator<String> it2 = this.j.iterator();
        while (it2.hasNext()) {
            map.remove(it2.next());
        }
        String url = request.getUrl() != null ? request.getUrl() : "";
        if (!this.l || url.contains("bgrm")) {
            return true;
        }
        Iterator<String> it3 = this.j.iterator();
        while (it3.hasNext()) {
            if (url.contains(it3.next())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(PushClient.DEFAULT_REQUEST_ID);
                map.put("bgrm", arrayList);
                return true;
            }
        }
        return true;
    }

    @Override // com.bytedance.frameworks.baselib.network.e.c
    protected void f(JSONObject jSONObject) {
        g(jSONObject);
        d.g(jSONObject.optJSONArray("keep_list"), this.i);
        d.g(jSONObject.optJSONArray("remove_list"), this.j);
        this.f5061c = jSONObject.optInt("protect_background_request", 0) > 0;
        this.l = jSONObject.optInt("add_background_rm_mark", 0) > 0;
        if (this.i.isEmpty() || this.j.isEmpty()) {
            return;
        }
        this.k = true;
    }
}
