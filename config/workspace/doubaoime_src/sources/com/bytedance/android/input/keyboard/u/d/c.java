package com.bytedance.android.input.keyboard.u.d;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.keyboard.vibrate.entity.VibrateKeyType;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class c extends com.bytedance.android.input.keyboard.u.b.a {
    private com.huawei.c.a.c a;

    private final com.huawei.c.a.c j() {
        Object J2;
        try {
            if (this.a == null) {
                this.a = new com.huawei.c.a.b(d()).b(1);
                k();
            }
            J2 = o.a;
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            g(e.a.a.a.a.w("getHapticsKitAdapter exception = ", b));
        }
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void k() {
        /*
            r4 = this;
            com.huawei.c.a.c r0 = r4.j()
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.String r2 = "haptic.direction.value"
            java.lang.String r0 = r0.a(r2)
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 == 0) goto L50
            int r2 = r0.hashCode()
            r3 = -142965994(0xfffffffff77a8316, float:-5.080988E33)
            if (r2 == r3) goto L41
            r3 = 88
            if (r2 == r3) goto L32
            r3 = 90
            if (r2 == r3) goto L23
            goto L50
        L23:
            java.lang.String r2 = "Z"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L2c
            goto L50
        L2c:
            java.lang.String r0 = "support Z_AXIS"
            r4.f(r0)
            goto L55
        L32:
            java.lang.String r2 = "X"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            goto L50
        L3b:
            java.lang.String r0 = "support X_AXIS"
            r4.f(r0)
            goto L55
        L41:
            java.lang.String r2 = "unsupport"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L4a
            goto L50
        L4a:
            java.lang.String r0 = "unSupport"
            r4.f(r0)
            goto L55
        L50:
            java.lang.String r0 = "unKnow"
            r4.f(r0)
        L55:
            com.huawei.c.a.c r0 = r4.j()
            if (r0 == 0) goto L61
            java.lang.String r1 = "haptic.grade.value"
            java.lang.String r1 = r0.a(r1)
        L61:
            java.lang.String r0 = "gradeValue = "
            java.lang.String r0 = e.a.a.a.a.s(r0, r1)
            r4.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.keyboard.u.d.c.k():void");
    }

    private final void l(com.huawei.c.a.c cVar, int i) {
        String a;
        String obj;
        try {
            com.huawei.c.a.c j = j();
            int parseInt = (j == null || (a = j.a("haptic.grade.value")) == null || (obj = kotlin.text.a.U(a).toString()) == null) ? 1 : Integer.parseInt(obj);
            if (parseInt > i) {
                cVar.b("haptic.grade.strength" + i);
                return;
            }
            cVar.b("haptic.grade.strength" + parseInt);
        } catch (Throwable th) {
            Throwable b = h.b(r.J(th));
            if (b != null) {
                g(e.a.a.a.a.w("triggerVibrate exception = ", b));
            }
            h(e.a.a.a.a.j("triggerVibrate default currentGrade = ", i));
            cVar.b("haptic.grade.strength" + i);
        }
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean a() {
        try {
            com.huawei.c.a.c j = j();
            String a = j != null ? j.a("haptic.direction.value") : null;
            if (!l.a(a, "X")) {
                if (!l.a(a, "Z")) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            Throwable b = h.b(r.J(th));
            if (b != null) {
                g(e.a.a.a.a.w("isSupport exception = ", b));
            }
            return false;
        }
    }

    @Override // com.bytedance.android.input.keyboard.u.c.a
    public boolean b(VibrateKeyType vibrateKeyType, com.bytedance.android.input.keyboard.vibrate.entity.a aVar, View view) {
        boolean z;
        l.f(vibrateKeyType, "vibrateKeyType");
        l.f(aVar, "vibrateParams");
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!c(vibrateKeyType, aVar)) {
                h("no pass");
                return false;
            }
            com.huawei.c.a.c j = j();
            if (j == null) {
                return false;
            }
            h("start");
            switch (aVar.c()) {
                case WEAK:
                    l(j, 1);
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return true;
                case WEAKER:
                    l(j, 2);
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return true;
                case MODE_RATE:
                    l(j, 3);
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return true;
                case STRONGER:
                    l(j, 4);
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return true;
                case STRONG:
                    l(j, 5);
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return true;
                case NONE:
                    h("NONE");
                    return true;
                case FOLLOW_SYSTEM:
                    if (aVar.a()) {
                        h("FOLLOW_SYSTEM forceTriggerVibrate");
                        l(j, 3);
                    }
                    Context d2 = d();
                    l.f(d2, "appContext");
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis();
                        IAppGlobals.a aVar2 = IAppGlobals.a;
                        aVar2.x("[Vibrate]-Utils", "Fetch System Settings start");
                        z = Settings.System.getInt(d2.getContentResolver(), "haptic_feedback_enabled", 1) == 1;
                        aVar2.x("[Vibrate]-Utils", "Fetch System Settings end, open = " + z + " cost time = " + (System.currentTimeMillis() - currentTimeMillis2));
                    } catch (Throwable th) {
                        Throwable b = h.b(r.J(th));
                        if (b != null) {
                            IAppGlobals.a.e("[Vibrate]-Utils", "System.VIBRATE_ON exception = " + b);
                        }
                        z = true;
                    }
                    if (!z) {
                        h("FOLLOW_SYSTEM system setting page close vibrate");
                        return true;
                    }
                    h("FOLLOW_SYSTEM system setting page open vibrate");
                    l(j, 3);
                    return true;
                default:
                    h("trigger success cost time = " + (System.currentTimeMillis() - currentTimeMillis) + ", vibrateParams.vibrateIntensity = " + aVar.c());
                    return true;
            }
        } catch (Throwable th2) {
            Throwable b2 = h.b(r.J(th2));
            if (b2 != null) {
                g(e.a.a.a.a.w("vibrate exception = ", b2));
            }
            return false;
        }
    }

    @Override // com.bytedance.android.input.keyboard.u.b.a
    protected String i() {
        return "HW-Strategy";
    }
}
