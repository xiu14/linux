package com.bytedance.push.settings.p.a;

import com.bytedance.common.push.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b extends c {
    public int a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public List<Integer> f5818c;

    public b() {
        this.a = 0;
        this.b = 300000L;
        this.f5818c = new ArrayList();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "delay_start_child_process_mode", this.a);
        add(jSONObject, "delay_start_child_process_timeout_in_mill", this.b);
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it2 = this.f5818c.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        add(jSONObject, "need_disable_channel", jSONArray);
        return jSONObject.toString();
    }

    public b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.a = jSONObject.optInt("delay_start_child_process_mode", 0);
            this.b = jSONObject.optLong("delay_start_child_process_timeout_in_mill", 300000L);
            JSONArray optJSONArray = jSONObject.optJSONArray("need_disable_channel");
            this.f5818c = new ArrayList();
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.f5818c.add((Integer) optJSONArray.get(i));
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
            this.a = 0;
            this.b = 300000L;
            this.f5818c = new ArrayList();
        }
    }
}
