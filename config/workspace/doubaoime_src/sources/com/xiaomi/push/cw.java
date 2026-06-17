package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class cw implements Comparable<cw> {
    protected int a;

    /* renamed from: a, reason: collision with other field name */
    private long f208a;

    /* renamed from: a, reason: collision with other field name */
    String f209a;

    /* renamed from: a, reason: collision with other field name */
    private final LinkedList<co> f210a;

    public cw() {
        this(null, 0);
    }

    protected synchronized void a(co coVar) {
        if (coVar != null) {
            this.f210a.add(coVar);
            int a = coVar.a();
            if (a > 0) {
                this.a += coVar.a();
            } else {
                int i = 0;
                for (int size = this.f210a.size() - 1; size >= 0 && this.f210a.get(size).a() < 0; size--) {
                    i++;
                }
                this.a = (a * i) + this.a;
            }
            if (this.f210a.size() > 30) {
                this.a -= this.f210a.remove().a();
            }
        }
    }

    public String toString() {
        return this.f209a + Constants.COLON_SEPARATOR + this.a;
    }

    public cw(String str) {
        this(str, 0);
    }

    public cw(String str, int i) {
        this.f210a = new LinkedList<>();
        this.f208a = 0L;
        this.f209a = str;
        this.a = i;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(cw cwVar) {
        if (cwVar == null) {
            return 1;
        }
        return cwVar.a - this.a;
    }

    public synchronized JSONObject a() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        jSONObject.put("tt", this.f208a);
        jSONObject.put("wt", this.a);
        jSONObject.put("host", this.f209a);
        JSONArray jSONArray = new JSONArray();
        Iterator<co> it2 = this.f210a.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().m166a());
        }
        jSONObject.put("ah", jSONArray);
        return jSONObject;
    }

    public synchronized cw a(JSONObject jSONObject) {
        this.f208a = jSONObject.getLong("tt");
        this.a = jSONObject.getInt("wt");
        this.f209a = jSONObject.getString("host");
        JSONArray jSONArray = jSONObject.getJSONArray("ah");
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f210a.add(new co().a(jSONArray.getJSONObject(i)));
        }
        return this;
    }
}
