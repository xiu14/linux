package com.vivo.push.restructure.a.a;

import com.vivo.push.util.t;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
abstract class a<T> {
    protected T a;
    private String b;

    /* renamed from: e, reason: collision with root package name */
    private i f8866e;

    /* renamed from: g, reason: collision with root package name */
    private a f8868g;

    /* renamed from: c, reason: collision with root package name */
    private long f8864c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f8865d = -1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8867f = false;

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Lcom/vivo/push/restructure/a/a/i;)V */
    /* JADX WARN: Multi-variable type inference failed */
    public a(String str, com.vivo.push.restructure.a.a aVar, j jVar) {
        this.b = str;
        this.a = aVar;
        this.f8866e = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f8865d = a((a<T>) this.a);
        this.f8864c = System.currentTimeMillis() - currentTimeMillis;
        int i = this.f8865d;
        if (i != 0) {
            i iVar = this.f8866e;
            if (iVar != null) {
                iVar.a(this, this.a, i);
                return;
            }
            return;
        }
        a aVar = this.f8868g;
        if (aVar != null) {
            aVar.a();
            return;
        }
        i iVar2 = this.f8866e;
        if (iVar2 != null) {
            iVar2.a((i) this.a);
        }
    }

    protected abstract int a(T t);

    public final void a(a aVar) {
        if (this != aVar) {
            this.f8868g = aVar;
        }
    }

    public final JSONArray c() {
        JSONArray jSONArray = new JSONArray();
        for (a<T> aVar = this; aVar != null; aVar = aVar.f8868g) {
            try {
                jSONArray.put(aVar.b());
            } catch (Exception e2) {
                t.a("AbstractMessageNodeMoni", e2);
            }
        }
        return jSONArray;
    }

    public final void a(long j) {
        this.f8864c = j;
    }

    public synchronized String b() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.b);
            jSONObject.put("code", this.f8865d);
            jSONObject.put("cost", this.f8864c);
        } catch (Exception e2) {
            t.a("AbstractMessageNodeMoni", e2);
        }
        return jSONObject.toString();
    }

    public final void a() {
        if (this.f8867f) {
            com.vivo.push.util.g.a().execute(new b(this));
        } else {
            d();
        }
    }
}
