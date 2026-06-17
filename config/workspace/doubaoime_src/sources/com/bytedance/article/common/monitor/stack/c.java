package com.bytedance.article.common.monitor.stack;

import com.bytedance.apm.g;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
class c implements Runnable {
    final /* synthetic */ d a;

    c(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        LinkedList linkedList;
        LinkedList linkedList2;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        try {
            LinkedList linkedList3 = new LinkedList();
            obj = d.i;
            synchronized (obj) {
                linkedList = this.a.f3939f;
                linkedList3.addAll(linkedList);
                linkedList2 = this.a.f3939f;
                linkedList2.clear();
                this.a.b = 0;
            }
            if (linkedList3.isEmpty()) {
                return;
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            while (!linkedList3.isEmpty()) {
                f fVar = (f) linkedList3.poll();
                if (fVar != null) {
                    jSONArray.put(new JSONObject(fVar.b));
                }
            }
            jSONObject3.put(RemoteMessageConst.DATA, jSONArray);
            jSONObject = this.a.f3938e;
            if (jSONObject == null) {
                this.a.f3938e = g.k();
            }
            jSONObject2 = this.a.f3938e;
            jSONObject3.put("header", jSONObject2);
            d dVar = this.a;
            str = d.h;
            d.g(dVar, str, jSONObject3.toString());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
