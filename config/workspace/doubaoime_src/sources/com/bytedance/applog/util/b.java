package com.bytedance.applog.util;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements com.bytedance.applog.g {
    private final CopyOnWriteArraySet<com.bytedance.applog.g> a = new CopyOnWriteArraySet<>();

    @Override // com.bytedance.applog.g
    public void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Iterator<com.bytedance.applog.g> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(z, str, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.bytedance.applog.g
    public void b(String str, String str2, String str3) {
        Iterator<com.bytedance.applog.g> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(str, str2, str3);
        }
    }

    @Override // com.bytedance.applog.g
    public void c(boolean z, JSONObject jSONObject) {
        Iterator<com.bytedance.applog.g> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().c(z, jSONObject);
        }
    }

    public void d(com.bytedance.applog.g gVar) {
        if (gVar != null) {
            this.a.add(gVar);
        }
    }
}
