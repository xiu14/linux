package com.vv;

import com.bytedance.push.C;
import com.bytedance.push.g0.f;
import com.vv.VvPushAdapter;
import java.util.Objects;

/* loaded from: classes2.dex */
public class c {
    public static c b = new c();
    public a a;

    public void a(int i) {
        a aVar = this.a;
        if (aVar != null) {
            VvPushAdapter.f.a aVar2 = (VvPushAdapter.f.a) aVar;
            Objects.requireNonNull(aVar2);
            com.bytedance.push.Q.b x = C.x();
            String j = e.a.a.a.a.j("onNotifyGuideDialogResult: message = ", i);
            Objects.requireNonNull((com.bytedance.push.Q.c) x);
            f.g("VivoPush", j);
            boolean z = i == 1;
            VvPushAdapter.f fVar = VvPushAdapter.f.this;
            VvPushAdapter.this.onUserClickResult(fVar.a, z, fVar.f8953c);
            this.a = null;
        }
    }
}
