package com.bytedance.apm.data.pipeline;

import com.bytedance.apm.g;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.apm.v.a<com.bytedance.apm.v.c> {

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f3422g;

    /* renamed from: f, reason: collision with root package name */
    private b f3423f;

    private a() {
    }

    public static a k() {
        if (f3422g == null) {
            synchronized (a.class) {
                if (f3422g == null) {
                    f3422g = new a();
                }
            }
        }
        return f3422g;
    }

    @Override // com.bytedance.apm.v.a
    protected void e(com.bytedance.apm.v.c cVar) {
        JSONObject c2 = cVar.c();
        boolean b = cVar.b(c2);
        if (g.B()) {
            try {
                com.bytedance.apm.y.d.e("<monitor><flow>", "logType: " + cVar.e() + ", subType: " + cVar.a() + "data: " + c2, " ,sample: " + b);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (b || cVar.d()) {
            h(cVar.e(), cVar.a(), c2, b, false);
            b bVar = this.f3423f;
            if (bVar != null) {
                bVar.a(cVar.e(), cVar.a(), c2);
            }
        }
    }

    public void l(b bVar) {
        this.f3423f = bVar;
    }
}
