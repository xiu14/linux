package com.heytap.msp.push.service;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class DataMessageReceivingService extends Service {
    private static final String a = "DataMessageReceivingService";
    private static final String b = "com.heytap.msp.push.action.RECEIVE_ENHANCED_DATA_MESSAGE";

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicInteger f6938c = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    private final Object f6939d = new Object();

    private Intent a(Intent intent) {
        try {
            Intent intent2 = new Intent(b);
            intent2.setPackage(getPackageName());
            ResolveInfo resolveService = getPackageManager().resolveService(intent2, 0);
            if (resolveService == null || !getPackageName().equals(resolveService.serviceInfo.packageName)) {
                e.e(a, "No service found to handle action: com.heytap.msp.push.action.RECEIVE_ENHANCED_DATA_MESSAGE");
                return null;
            }
            ServiceInfo serviceInfo = resolveService.serviceInfo;
            intent2.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
            if (intent.getExtras() != null) {
                intent2.putExtras(intent.getExtras());
            }
            return intent2;
        } catch (Exception e2) {
            StringBuilder M = e.a.a.a.a.M("Error creating processing intent: ");
            M.append(e2.getMessage());
            e.e(a, M.toString());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Intent intent, int i) {
        Intent a2;
        synchronized (this.f6939d) {
            try {
                e.b(a, "Forwarding message #" + i + " to processing layer");
                a2 = a(intent);
            } catch (Exception e2) {
                e.e(a, "Error forwarding message #" + i + ": " + e2.getMessage());
            }
            if (a2 == null) {
                e.e(a, "Failed to create processing intent for message #" + i);
                return;
            }
            ComponentName startService = startService(a2);
            if (startService != null) {
                e.b(a, "Successfully started processing service for message #" + i + ", component: " + startService.getClassName());
            } else {
                e.d(a, "Failed to start processing service for message #" + i);
            }
        }
    }

    private boolean b(Intent intent) {
        String str;
        if (intent == null) {
            str = "Intent is null";
        } else {
            if (!TextUtils.isEmpty(intent.getStringExtra(com.heytap.mcssdk.constant.b.f6895c))) {
                e.b(a, "Intent validation passed");
                return true;
            }
            str = "Message ID is empty in intent";
        }
        e.e(a, str);
        return false;
    }

    @Override // android.app.Service
    public IBinder onBind(final Intent intent) {
        if (intent == null) {
            e.e(a, "onBind: intent is null");
            return null;
        }
        final int incrementAndGet = f6938c.incrementAndGet();
        e.b(a, "DataMessageReceivingService onBind called, message #" + incrementAndGet);
        try {
        } catch (Exception e2) {
            StringBuilder N = e.a.a.a.a.N("Error in onBind for message #", incrementAndGet, ": ");
            N.append(e2.getMessage());
            e.e(a, N.toString());
        }
        if (b(intent)) {
            i.a(new Runnable() { // from class: com.heytap.msp.push.service.DataMessageReceivingService.1
                @Override // java.lang.Runnable
                public void run() {
                    DataMessageReceivingService.this.a(intent, incrementAndGet);
                }
            });
            return new Binder();
        }
        e.e(a, "Intent validation failed for message #" + incrementAndGet);
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        StringBuilder M = e.a.a.a.a.M("DataMessageReceivingService onDestroy called, Processed messages: ");
        M.append(f6938c.get());
        e.b(a, M.toString());
        super.onDestroy();
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        e.b(a, "DataMessageReceivingService onUnbind called");
        return super.onUnbind(intent);
    }
}
