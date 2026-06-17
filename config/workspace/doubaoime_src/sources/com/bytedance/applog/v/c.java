package com.bytedance.applog.v;

import com.bytedance.applog.k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c implements k {
    private final CopyOnWriteArraySet<k> a = new CopyOnWriteArraySet<>();

    @Override // com.bytedance.applog.k
    public void a(long j, String str, JSONObject jSONObject) {
        Iterator<k> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(j, str, jSONObject);
        }
    }

    @Override // com.bytedance.applog.k
    public void b(long j, String str) {
        Iterator<k> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(j, str);
        }
    }

    @Override // com.bytedance.applog.k
    public void c(long j, String str, JSONObject jSONObject) {
        Iterator<k> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().c(j, str, jSONObject);
        }
    }
}
