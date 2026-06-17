package com.bytedance.crash;

import com.bytedance.crash.D;
import com.bytedance.crash.ensure.EnsureApi;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class C implements Runnable {
    C(D.a aVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bytedance.crash.upload.h.o();
        com.bytedance.android.input.k.b.a.W("initAsyncForCrash");
        com.bytedance.android.input.k.b.a.W("initAsyncForEvent");
        com.bytedance.crash.Q.b.d();
        com.bytedance.crash.general.a.h();
        EnsureApi.a();
        com.bytedance.crash.a0.g.a();
        NativeBridge.W();
        NativeBridge.o();
        try {
            com.bytedance.crash.M.a.a();
        } catch (Throwable unused) {
        }
        try {
            com.bytedance.apm.z.a.d(new y());
            com.bytedance.apm.z.a.c(new z());
        } catch (Throwable unused2) {
        }
        try {
            int i = com.bytedance.crash.K.a.f4392c;
        } catch (Throwable unused3) {
        }
        try {
            int i2 = I.f4386d;
            if (C0652g.g() != null) {
                I.i(new File(C0652g.k(), "custom_tags"));
                I.i(new File(C0652g.k(), "tags"));
            }
        } catch (Throwable unused4) {
        }
        com.bytedance.crash.W.a.c();
        com.bytedance.android.input.k.b.a.W("LaunchScanner start");
        if (com.bytedance.crash.util.a.k()) {
            com.bytedance.crash.runtime.b.f(new com.bytedance.crash.upload.f(), 0L);
        }
        com.bytedance.news.common.service.manager.c.d(IFdCheck.class, new IFdCheck() { // from class: com.bytedance.crash.NpthCore$1
            @Override // com.bytedance.services.apm.api.IFdCheck
            public List<String> getFdList() {
                return new ArrayList();
            }
        });
    }
}
