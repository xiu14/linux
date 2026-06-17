package com.vivo.push.restructure.request.a.a;

import com.vivo.push.restructure.request.a.a.c;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class a {
    private int a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f8884c;

    public a() {
        this.a = 0;
        this.f8884c = new JSONArray();
    }

    public final void a(int i) {
        this.f8884c.put(i);
    }

    public final long b() throws JSONException {
        int i = this.a;
        if (i >= this.b) {
            return 0L;
        }
        JSONArray jSONArray = this.f8884c;
        this.a = i + 1;
        return jSONArray.getLong(i);
    }

    public final String c() throws JSONException {
        int i = this.a;
        if (i >= this.b) {
            return null;
        }
        JSONArray jSONArray = this.f8884c;
        this.a = i + 1;
        return jSONArray.getString(i);
    }

    public final boolean d() throws JSONException {
        int i = this.a;
        if (i >= this.b) {
            return false;
        }
        JSONArray jSONArray = this.f8884c;
        this.a = i + 1;
        return jSONArray.getBoolean(i);
    }

    public final String e() {
        JSONArray jSONArray = this.f8884c;
        return jSONArray != null ? jSONArray.toString() : "";
    }

    public final void a(long j) {
        this.f8884c.put(j);
    }

    public final void a(String str) {
        this.f8884c.put(str);
    }

    public a(String str) throws JSONException {
        this.a = 0;
        JSONArray jSONArray = new JSONArray(str);
        this.f8884c = jSONArray;
        this.a = 0;
        this.b = jSONArray.length();
    }

    public final void a(boolean z) {
        this.f8884c.put(z);
    }

    public final <T extends c> void a(List<T> list) {
        if (list != null) {
            this.f8884c.put(list.size());
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                this.f8884c.put(it2.next().a());
            }
            return;
        }
        this.f8884c.put((Object) null);
    }

    public final int a() throws JSONException {
        int i = this.a;
        if (i >= this.b) {
            return 0;
        }
        JSONArray jSONArray = this.f8884c;
        this.a = i + 1;
        return jSONArray.getInt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends c> void a(c.a<T> aVar, List<T> list) throws JSONException {
        c cVar;
        int i = this.a;
        if (i < this.b ? this.f8884c.isNull(i) : true) {
            this.a++;
            return;
        }
        JSONArray jSONArray = this.f8884c;
        int i2 = this.a;
        this.a = i2 + 1;
        int i3 = jSONArray.getInt(i2);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = this.a;
            if (i5 < this.b) {
                JSONArray jSONArray2 = this.f8884c;
                this.a = i5 + 1;
                cVar = aVar.a(jSONArray2.getString(i5));
            } else {
                cVar = null;
            }
            list.add(cVar);
        }
    }
}
