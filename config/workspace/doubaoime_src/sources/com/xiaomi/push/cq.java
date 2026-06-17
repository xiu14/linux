package com.xiaomi.push;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class cq {
    private String a;

    /* renamed from: a, reason: collision with other field name */
    private final ArrayList<cp> f194a = new ArrayList<>();

    public cq(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("the host is empty");
        }
        this.a = str;
    }

    public synchronized void a(cp cpVar) {
        int i = 0;
        while (true) {
            if (i >= this.f194a.size()) {
                break;
            }
            if (this.f194a.get(i).a(cpVar)) {
                this.f194a.set(i, cpVar);
                break;
            }
            i++;
        }
        if (i >= this.f194a.size()) {
            this.f194a.add(cpVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("\n");
        Iterator<cp> it2 = this.f194a.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
        }
        return sb.toString();
    }

    public cq() {
    }

    public synchronized cp a() {
        for (int size = this.f194a.size() - 1; size >= 0; size--) {
            cp cpVar = this.f194a.get(size);
            if (cpVar.m170a()) {
                ct.a().m181a(cpVar.a());
                return cpVar;
            }
        }
        return null;
    }

    /* renamed from: a, reason: collision with other method in class */
    public ArrayList<cp> m172a() {
        return this.f194a;
    }

    public synchronized void a(boolean z) {
        for (int size = this.f194a.size() - 1; size >= 0; size--) {
            cp cpVar = this.f194a.get(size);
            if (z) {
                if (cpVar.c()) {
                    this.f194a.remove(size);
                }
            } else if (!cpVar.b()) {
                this.f194a.remove(size);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m171a() {
        return this.a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public synchronized JSONObject m173a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("host", this.a);
        JSONArray jSONArray = new JSONArray();
        Iterator<cp> it2 = this.f194a.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().m168a());
        }
        jSONObject.put("fbs", jSONArray);
        return jSONObject;
    }

    public synchronized cq a(JSONObject jSONObject) {
        this.a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("fbs");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f194a.add(new cp(this.a).a(jSONArray.getJSONObject(i)));
        }
        return this;
    }
}
