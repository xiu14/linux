package com.bytedance.push.settings.t.a;

import com.bytedance.common.model.c;
import com.bytedance.common.push.e.g;
import com.bytedance.push.g0.f;

/* loaded from: classes2.dex */
public class b {
    public boolean a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public long f5843c;

    public b() {
        g gVar;
        c c2 = com.bytedance.common.g.a.c().e().c();
        this.a = false;
        if (c2 != null && (gVar = c2.o) != null) {
            this.a = gVar.defaultEnableUnDuplicateMessage();
            StringBuilder M = e.a.a.a.a.M("use default UnDuplicateMessage:");
            M.append(this.a);
            f.c("UnDuplicateSettingsModel", M.toString());
        }
        this.b = 200;
        this.f5843c = 24L;
    }
}
