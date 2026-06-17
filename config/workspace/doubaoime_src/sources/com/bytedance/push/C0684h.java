package com.bytedance.push;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.push.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0684h implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Context a;
    final /* synthetic */ com.bytedance.push.interfaze.u b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f5717c;

    C0684h(l lVar, Context context, com.bytedance.push.interfaze.u uVar) {
        this.f5717c = lVar;
        this.a = context;
        this.b = uVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f5717c.b = false;
        this.f5717c.f5731c = new WeakReference(activity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r8 == 3) goto L12;
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResumed(@androidx.annotation.NonNull android.app.Activity r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Polling"
            com.bytedance.push.l r1 = r7.f5717c
            java.lang.ref.WeakReference r1 = com.bytedance.push.l.d(r1)
            r2 = 0
            if (r1 == 0) goto L18
            com.bytedance.push.l r1 = r7.f5717c
            java.lang.ref.WeakReference r1 = com.bytedance.push.l.d(r1)
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            goto L19
        L18:
            r1 = r2
        L19:
            if (r1 == 0) goto L1d
            if (r1 != r8) goto L72
        L1d:
            com.bytedance.push.l r8 = r7.f5717c
            com.bytedance.push.l.e(r8, r2)
            int r8 = com.bytedance.push.l.f()
            r1 = 2
            if (r8 == r1) goto L30
            int r8 = com.bytedance.push.l.f()
            r1 = 3
            if (r8 != r1) goto L56
        L30:
            com.bytedance.push.l r8 = r7.f5717c
            boolean r8 = com.bytedance.push.l.g(r8)
            if (r8 != 0) goto L56
            android.content.Context r8 = r7.a
            com.bytedance.push.interfaze.u r1 = r7.b
            com.ss.android.message.e r3 = com.ss.android.message.e.e()     // Catch: java.lang.Exception -> L4b
            com.bytedance.push.j r4 = new com.bytedance.push.j     // Catch: java.lang.Exception -> L4b
            r4.<init>(r1, r8)     // Catch: java.lang.Exception -> L4b
            r5 = 0
            r3.f(r4, r5)     // Catch: java.lang.Exception -> L4b
            goto L51
        L4b:
            r8 = move-exception
            java.lang.String r1 = "performForegroundAction：Failed to report the switch status"
            com.bytedance.push.g0.f.f(r0, r1, r8)
        L51:
            java.lang.String r8 = "report switch status when app go to foreground"
            com.bytedance.push.g0.f.c(r0, r8)
        L56:
            com.bytedance.push.l r8 = r7.f5717c
            r0 = 1
            com.bytedance.push.l.h(r8, r0)
            com.bytedance.push.l r8 = r7.f5717c
            com.bytedance.push.l$a r8 = com.bytedance.push.l.i(r8)
            if (r8 == 0) goto L72
            com.bytedance.push.l r8 = r7.f5717c
            com.bytedance.push.l$a r8 = com.bytedance.push.l.i(r8)
            r8.a(r0)
            com.bytedance.push.l r8 = r7.f5717c
            com.bytedance.push.l.j(r8, r2)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.C0684h.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
    }
}
