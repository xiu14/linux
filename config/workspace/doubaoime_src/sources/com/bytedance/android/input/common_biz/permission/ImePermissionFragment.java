package com.bytedance.android.input.common_biz.permission;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.input.basic.IAppGlobals;
import com.huawei.hms.push.AttributionReporter;
import kotlin.o;
import kotlin.s.b.p;
import kotlin.s.c.l;
import kotlin.s.c.m;

/* loaded from: classes.dex */
public final class ImePermissionFragment extends Fragment {
    private p<? super String[], ? super int[], o> a;
    private Runnable b;

    static final class a extends m implements kotlin.s.b.a<o> {
        final /* synthetic */ String[] b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr) {
            super(0);
            this.b = strArr;
        }

        @Override // kotlin.s.b.a
        public o invoke() {
            ImePermissionFragment.this.requestPermissions(this.b, 2000);
            return o.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(kotlin.s.b.a r2, com.bytedance.android.input.common_biz.permission.ImePermissionFragment r3, java.lang.String[] r4) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.s.c.l.f(r3, r0)
            java.lang.String r0 = "$permission"
            kotlin.s.c.l.f(r4, r0)
            com.bytedance.android.input.common_biz.permission.ImePermissionFragment$a r0 = new com.bytedance.android.input.common_biz.permission.ImePermissionFragment$a
            r0.<init>(r4)
            java.lang.String r4 = "tryExtensions"
            java.lang.String r1 = "normalLogic"
            kotlin.s.c.l.f(r0, r1)
            java.lang.String r1 = "catchTag"
            kotlin.s.c.l.f(r4, r1)
            r0.invoke()     // Catch: java.lang.Throwable -> L1f
            goto L25
        L1f:
            r0 = move-exception
            com.bytedance.android.input.basic.IAppGlobals$a r1 = com.bytedance.android.input.basic.IAppGlobals.a     // Catch: java.lang.Throwable -> L2e
            r1.J(r4, r0)     // Catch: java.lang.Throwable -> L2e
        L25:
            if (r2 == 0) goto L2a
            r2.invoke()
        L2a:
            r2 = 0
            r3.b = r2
            return
        L2e:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common_biz.permission.ImePermissionFragment.l(kotlin.s.b.a, com.bytedance.android.input.common_biz.permission.ImePermissionFragment, java.lang.String[]):void");
    }

    public final void m(final String[] strArr, final kotlin.s.b.a<o> aVar) {
        Runnable runnable;
        l.f(strArr, AttributionReporter.SYSTEM_PERMISSION);
        try {
            IAppGlobals.a.j("ImePermission", "requestPermissionWithPop");
            this.b = new Runnable() { // from class: com.bytedance.android.input.common_biz.permission.a
                @Override // java.lang.Runnable
                public final void run() {
                    ImePermissionFragment.l(kotlin.s.b.a.this, this, strArr);
                }
            };
            if (!isAdded() || (runnable = this.b) == null) {
                return;
            }
            runnable.run();
        } catch (Exception e2) {
            this.b = null;
            IAppGlobals.a.e("ImePermission", "requestPermissionWithPop：" + e2);
        }
    }

    public final void n(p<? super String[], ? super int[], o> pVar) {
        this.a = pVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        l.f(context, "context");
        super.onAttach(context);
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        p<? super String[], ? super int[], o> pVar = this.a;
        if (pVar != null) {
            pVar.invoke(strArr, iArr);
        }
    }
}
