package com.bytedance.apm.s.l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a {
    private static List<b> a = new ArrayList();
    private static boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3524c;

    /* renamed from: d, reason: collision with root package name */
    private static c f3525d;

    public interface b {
        void a(boolean z);
    }

    private static class c extends BroadcastReceiver {
        c(C0125a c0125a) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
                boolean unused = a.f3524c = true;
                Iterator it2 = a.a.iterator();
                while (it2.hasNext()) {
                    ((b) it2.next()).a(a.f3524c);
                }
                return;
            }
            if ("android.intent.action.ACTION_POWER_DISCONNECTED".equals(action)) {
                boolean unused2 = a.f3524c = false;
                Iterator it3 = a.a.iterator();
                while (it3.hasNext()) {
                    ((b) it3.next()).a(a.f3524c);
                }
            }
        }
    }

    public static boolean d(Context context, b bVar) {
        a.add(bVar);
        if (!b) {
            try {
                IntentFilter intentFilter = new IntentFilter("android.intent.action.ACTION_POWER_CONNECTED");
                intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
                c cVar = new c(null);
                f3525d = cVar;
                context.registerReceiver(cVar, intentFilter);
                f3524c = e(context);
            } catch (Throwable unused) {
                f3524c = true;
            }
            b = true;
        }
        return f3524c;
    }

    public static boolean e(Context context) {
        int intExtra;
        if (b) {
            return f3524c;
        }
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return registerReceiver == null || (intExtra = registerReceiver.getIntExtra("status", -1)) == 2 || intExtra == 5;
    }

    public static void f(Context context, b bVar) {
        a.remove(bVar);
        if (a.isEmpty()) {
            try {
                context.unregisterReceiver(f3525d);
            } catch (Throwable unused) {
            }
            b = false;
        }
    }
}
