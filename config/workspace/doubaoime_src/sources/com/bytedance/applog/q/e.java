package com.bytedance.applog.q;

import androidx.annotation.NonNull;
import com.bytedance.applog.B.h;
import com.bytedance.applog.w.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: g, reason: collision with root package name */
    private static final List<String> f3879g = Collections.singletonList("ForwardSender");

    /* renamed from: f, reason: collision with root package name */
    private final com.bytedance.applog.t.a f3880f;

    public e(c cVar, @NonNull com.bytedance.applog.t.a aVar) {
        super(cVar);
        this.f3880f = aVar;
    }

    private void i(List<com.bytedance.applog.B.f> list, JSONObject jSONObject, int i) {
        if (this.f3880f == null) {
            return;
        }
        Iterator<com.bytedance.applog.B.f> it2 = list.iterator();
        ArrayList arrayList = new ArrayList();
        new HashSet();
        while (it2.hasNext()) {
            JSONArray jSONArray = new JSONArray();
            h hVar = new h();
            hVar.L(d().k(), jSONObject, null, null, null, new JSONArray[]{null, jSONArray, null}, new long[]{0, 0, 0}, null, null, i);
            while (it2.hasNext()) {
                jSONArray.put(it2.next().x());
                int i2 = j.a;
                if (jSONArray.length() == 200) {
                    break;
                }
            }
            hVar.N();
            arrayList.add(hVar);
        }
        String a = d().j().a(d().o(), this.f3880f.g());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            d().i().l(a, (h) it3.next());
        }
        this.a.h().k();
        int i3 = j.a;
    }

    @Override // com.bytedance.applog.q.a
    public synchronized boolean c(int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        g q = this.a.q();
        com.bytedance.applog.w.e I = d().I();
        List<String> list = f3879g;
        Object[] objArr = new Object[4];
        z = false;
        objArr[0] = "ForwardSender";
        objArr[1] = Long.valueOf(currentTimeMillis);
        objArr[2] = q != null ? q.c() : "null";
        objArr[3] = Integer.valueOf(i);
        I.n(list, "{} start doWork curTs={}, curSid={}, requestFrom={}", objArr);
        com.bytedance.applog.B.b m = this.a.m();
        com.bytedance.applog.x.c n = this.a.n();
        if (n.k() && this.f3880f != null) {
            JSONObject c2 = n.c();
            com.bytedance.android.input.k.b.a.M0(c2);
            Objects.requireNonNull(d());
            List<com.bytedance.applog.B.f> B = m.B();
            if (!((ArrayList) B).isEmpty()) {
                m.i(B);
                i(B, c2, i);
            }
            z = true;
        }
        return z;
    }

    @Override // com.bytedance.applog.q.a
    protected String e() {
        return "ForwardSender";
    }

    @Override // com.bytedance.applog.q.a
    protected long[] f() {
        return a.f3870e;
    }

    @Override // com.bytedance.applog.q.a
    protected boolean g() {
        return true;
    }

    @Override // com.bytedance.applog.q.a
    protected long h() {
        com.bytedance.applog.t.a aVar = this.f3880f;
        return aVar != null ? aVar.d() : this.a.k().n();
    }
}
