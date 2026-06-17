package com.bytedance.apm.B.j;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.bytedance.apm.g;
import java.lang.ref.ReferenceQueue;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
class a extends com.bytedance.apm.B.j.g.c {
    final /* synthetic */ e a;

    a(e eVar) {
        this.a = eVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        Set set;
        ReferenceQueue referenceQueue;
        boolean e2 = com.bytedance.apm.D.c.e("activity_leak_switch");
        if (g.B()) {
            com.bytedance.apm.y.d.d("DetectActivityLeakTask", e.a.a.a.a.A("activity_leak_switch : ", e2));
        }
        if (e2) {
            String uuid = UUID.randomUUID().toString();
            set = this.a.f3261c;
            set.add(uuid);
            referenceQueue = this.a.b;
            com.bytedance.apm.B.j.g.b bVar = new com.bytedance.apm.B.j.g.b(activity, uuid, "", referenceQueue);
            Objects.requireNonNull(this.a);
            String localClassName = activity.getLocalClassName();
            if (g.B()) {
                com.bytedance.apm.y.d.d("DetectActivityLeakTask", e.a.a.a.a.s("Wait Check Leak:", localClassName));
            }
            e.c(this.a, bVar, localClassName);
        }
    }
}
