package com.bytedance.android.input.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.input.basic.IAppGlobals;
import java.util.Objects;

/* loaded from: classes.dex */
public class SmsReceiver extends BroadcastReceiver {
    private static SmsReceiver b;

    /* renamed from: c, reason: collision with root package name */
    private static SmsReceiver f2169c;
    private final Context a;

    public SmsReceiver(Context context) {
        this.a = context;
    }

    public static void a(Context context) {
        if (b != null) {
            return;
        }
        com.bytedance.android.input.r.j.i("SmsReceiver", "registerReceiver()");
        b = new SmsReceiver(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
        intentFilter.addAction("android.provider.Telephony.SMS_DELIVER");
        try {
            context.registerReceiver(b, intentFilter);
        } catch (SecurityException e2) {
            com.bytedance.android.input.r.j.k("SmsReceiver", "Failed to register BroadcastReceiver for sms", e2);
            b = null;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F() && f2169c == null) {
            com.bytedance.android.input.r.j.m("SmsReceiver", "registerReceiver() obric verify");
            f2169c = new SmsReceiver(context);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.android.internal.telephony.VERIFY_CODE_SMS_RECEIVED");
            try {
                context.registerReceiver(f2169c, intentFilter2, "com.android.internal.telephony.permission.RECEIVE_VERIFY_CODE_SMS", null);
            } catch (SecurityException e3) {
                com.bytedance.android.input.r.j.k("SmsReceiver", "Failed to register BroadcastReceiver for verify code sms", e3);
                f2169c = null;
            }
        }
    }

    public static void b() {
        if (b != null) {
            com.bytedance.android.input.r.j.m("SmsReceiver", "unregisterReceiver() sms");
            SmsReceiver smsReceiver = b;
            smsReceiver.a.unregisterReceiver(smsReceiver);
            b = null;
        }
        if (f2169c != null) {
            com.bytedance.android.input.r.j.m("SmsReceiver", "unregisterReceiver() Obric verify");
            SmsReceiver smsReceiver2 = f2169c;
            smsReceiver2.a.unregisterReceiver(smsReceiver2);
            f2169c = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        StringBuilder M = e.a.a.a.a.M("onReceive: ");
        M.append(intent.getAction());
        com.bytedance.android.input.r.j.i("SmsReceiver", M.toString());
        if (intent.getAction().equals("com.android.internal.telephony.VERIFY_CODE_SMS_RECEIVED") || intent.getAction().equals("android.provider.Telephony.SMS_RECEIVED")) {
            m.c(context, intent);
        }
    }
}
