package com.heytap.mcssdk.liquid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.heytap.mcssdk.utils.e;

/* loaded from: classes2.dex */
public class LiquidSettingChangeObserver extends BroadcastReceiver {
    public static final String a = LiquidSettingChangeObserver.class.getSimpleName();
    private final Context b;

    /* renamed from: c, reason: collision with root package name */
    private final OnLiquidSettingChangeListener f6910c;

    public LiquidSettingChangeObserver(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        this.b = context;
        this.f6910c = onLiquidSettingChangeListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            if (r9 != 0) goto L12
            boolean r9 = com.heytap.mcssdk.utils.e.g()
            if (r9 == 0) goto L11
            java.lang.String r9 = com.heytap.mcssdk.liquid.LiquidSettingChangeObserver.a
            java.lang.String r0 = "parseContent() extras is null ."
            com.heytap.mcssdk.utils.e.b(r9, r0)
        L11:
            return
        L12:
            r1 = -2
            r2 = -1
            java.lang.String r3 = "liquidSettingType"
            int r3 = r9.getInt(r3)     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = "liquid_package_name"
            java.lang.String r4 = r9.getString(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "liquidSwitchStatusValue"
            int r1 = r9.getInt(r5)     // Catch: java.lang.Exception -> L27
            goto L4b
        L27:
            r9 = move-exception
            goto L2f
        L29:
            r9 = move-exception
            r4 = r0
            goto L2f
        L2c:
            r9 = move-exception
            r4 = r0
            r3 = r2
        L2f:
            boolean r5 = com.heytap.mcssdk.utils.e.g()
            if (r5 == 0) goto L4b
            java.lang.String r5 = com.heytap.mcssdk.liquid.LiquidSettingChangeObserver.a
            java.lang.String r6 = "Error happened in parseContent:"
            java.lang.StringBuilder r6 = e.a.a.a.a.M(r6)
            java.lang.String r9 = r9.toString()
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            com.heytap.mcssdk.utils.e.b(r5, r9)
        L4b:
            boolean r9 = com.heytap.mcssdk.utils.e.g()
            if (r9 == 0) goto L67
            java.lang.String r9 = com.heytap.mcssdk.liquid.LiquidSettingChangeObserver.a
            java.lang.String r5 = "parseContent() : changeType:"
            java.lang.String r6 = " packageName: "
            java.lang.String r7 = " isOpen:"
            java.lang.StringBuilder r5 = e.a.a.a.a.P(r5, r3, r6, r4, r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.heytap.mcssdk.utils.e.b(r9, r5)
        L67:
            if (r3 != r2) goto L6a
            return
        L6a:
            com.heytap.mcssdk.liquid.SettingChangeBean r9 = new com.heytap.mcssdk.liquid.SettingChangeBean
            r9.<init>()
            r9.setChangeType(r3)
            r9.setSwitchStatus(r1)
            boolean r1 = com.heytap.mcssdk.utils.e.g()
            if (r1 == 0) goto L91
            java.lang.String r1 = com.heytap.mcssdk.liquid.LiquidSettingChangeObserver.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "parseContent SettingChangeBean is :"
            r2.append(r5)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.heytap.mcssdk.utils.e.b(r1, r2)
        L91:
            r1 = 0
            r2 = 1
            if (r3 != r2) goto L96
            goto Lae
        L96:
            r5 = 2
            if (r3 != r5) goto Laf
            android.content.Context r3 = r8.b
            if (r3 != 0) goto L9e
            goto La2
        L9e:
            java.lang.String r0 = r3.getPackageName()
        La2:
            boolean r3 = android.text.TextUtils.equals(r0, r4)
            if (r3 == 0) goto Laf
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Laf
        Lae:
            r1 = r2
        Laf:
            if (r1 != 0) goto Lb2
            return
        Lb2:
            com.heytap.mcssdk.liquid.OnLiquidSettingChangeListener r0 = r8.f6910c
            if (r0 == 0) goto Lb9
            r0.onSettingChange(r9)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.mcssdk.liquid.LiquidSettingChangeObserver.a(android.os.Bundle):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (e.g()) {
            e.b(a, "onReceive() :" + this);
        }
        if (intent == null) {
            if (e.g()) {
                e.b(a, "parseContent() intent is null ");
                return;
            }
            return;
        }
        String action = intent.getAction();
        if (e.g()) {
            e.b(a, "parseContent() action :" + action + " -- " + this);
        }
        if (TextUtils.equals(action, LiquidConstants.liquidSwitchChangeThirdAppReceiverAction)) {
            a(intent.getExtras());
        }
    }
}
