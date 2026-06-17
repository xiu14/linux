package com.bytedance.android.input.common_biz.init.task;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.AppDidChange;
import com.bytedance.dataplatform.m;
import com.bytedance.lego.init.model.d;
import com.prolificinteractive.materialcalendarview.r;

/* loaded from: classes.dex */
public final class ImeAbTestInitializer extends d {

    public static final class a implements com.bytedance.android.input.basic.applog.api.a {
        a() {
        }

        @Override // com.bytedance.android.input.basic.applog.api.a
        public void a(String str, String str2, Boolean bool) {
            IAppGlobals.a aVar = IAppGlobals.a;
            StringBuilder W = e.a.a.a.a.W("ImeAbTestInitializer [init] onReceive did:", str, ", iid:", str2, ", isRemote:");
            W.append(bool);
            aVar.j("init_task", W.toString());
            IAppGlobals.a.j("ImeAbTestManager", "[refresh]");
            try {
                m.m();
            } catch (Throwable th) {
                r.J(th);
            }
            AppDidChange.INSTANCE.unregisterDidChangeListener(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            com.bytedance.android.input.basic.IAppGlobals$a r0 = com.bytedance.android.input.basic.IAppGlobals.a
            java.lang.String r1 = "init_task"
            java.lang.String r2 = "ImeAbTestInitializer [init]"
            r0.j(r1, r2)
            java.util.Objects.requireNonNull(r0)
            android.app.Application r0 = r0.getApplication()
            com.bytedance.common.a.d.a(r0)
            java.lang.String r0 = com.bytedance.applog.a.c()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L28
            int r3 = r0.length()
            if (r3 <= 0) goto L23
            r3 = r1
            goto L24
        L23:
            r3 = r2
        L24:
            if (r3 != r1) goto L28
            r3 = r1
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L34
            java.lang.String r3 = "0"
            boolean r0 = kotlin.s.c.l.a(r0, r3)
            if (r0 != 0) goto L34
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 != 0) goto L41
            com.bytedance.android.input.basic.applog.api.AppDidChange r0 = com.bytedance.android.input.basic.applog.api.AppDidChange.INSTANCE
            com.bytedance.android.input.common_biz.init.task.ImeAbTestInitializer$a r1 = new com.bytedance.android.input.common_biz.init.task.ImeAbTestInitializer$a
            r1.<init>()
            r0.registerDidChangeListener(r1)
        L41:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.init.task.ImeAbTestInitializer.run():void");
    }
}
