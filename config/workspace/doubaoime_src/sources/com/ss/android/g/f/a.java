package com.ss.android.g.f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.g0.f;
import com.ss.android.message.e;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements WeakHandler.IHandler {

    /* renamed from: g, reason: collision with root package name */
    private static a f8302g;
    private WeakReference<Context> b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f8303c;

    /* renamed from: d, reason: collision with root package name */
    private Messenger f8304d;
    private Messenger a = null;

    /* renamed from: e, reason: collision with root package name */
    private long f8305e = 0;

    /* renamed from: f, reason: collision with root package name */
    private ServiceConnection f8306f = new ServiceConnectionC0374a();

    /* renamed from: com.ss.android.g.f.a$a, reason: collision with other inner class name */
    class ServiceConnectionC0374a implements ServiceConnection {
        ServiceConnectionC0374a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.c("MessageLogClient", "[start]on LogService Connected");
            a.this.a = new Messenger(iBinder);
            a.this.d();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            a.this.a = null;
        }
    }

    private a(Context context) {
        this.b = new WeakReference<>(context.getApplicationContext());
        Looper d2 = e.e().d();
        this.f8303c = new WeakHandler(d2 == null ? Looper.getMainLooper() : d2, this);
        this.f8304d = new Messenger(this.f8303c);
        c();
    }

    private void c() {
        WeakReference<Context> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        try {
            f.c("MessageLogClient", "doBindService");
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(this.b.get(), "com.ss.android.message.log.LogService"));
            this.b.get().bindService(intent, this.f8306f, 1);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            Message obtain = Message.obtain((Handler) null, 0);
            obtain.replyTo = this.f8304d;
            Bundle bundle = new Bundle();
            bundle.putLong("start_id", this.f8305e);
            if (f.d()) {
                f.c("PushLog", "start_id = " + this.f8305e);
            }
            obtain.obj = bundle;
            this.a.send(obtain);
        } catch (Throwable th) {
            th.printStackTrace();
            e();
        }
    }

    private void e() {
        if (f.d()) {
            f.c("PushLog", "hanldeEnd");
        }
        Messenger messenger = this.a;
        if (messenger != null) {
            if (messenger != null) {
                try {
                    if (this.b.get() != null) {
                        this.b.get().unbindService(this.f8306f);
                    }
                } catch (Throwable unused) {
                }
            }
            try {
                this.a = null;
            } catch (Exception unused2) {
            }
        }
    }

    private void f(List<Long> list) {
        if (list.size() <= 0) {
            return;
        }
        try {
            Message obtain = Message.obtain((Handler) null, 1);
            obtain.replyTo = this.f8304d;
            Bundle bundle = new Bundle();
            long[] jArr = new long[list.size()];
            for (int i = 0; i < list.size(); i++) {
                jArr[i] = list.get(i).longValue();
            }
            bundle.putLongArray("event_ids", jArr);
            if (f.d()) {
                f.c("PushLog", "event_ids = " + list);
            }
            obtain.obj = bundle;
            this.a.send(obtain);
        } catch (Throwable th) {
            th.printStackTrace();
            e();
        }
    }

    public static void g(Context context) {
        if (context == null) {
            return;
        }
        f.c("MessageLogClient", "[start]");
        a aVar = f8302g;
        if (aVar == null) {
            f.c("MessageLogClient", "[start]init sMessageLogClient");
            f8302g = new a(context);
        } else if (aVar.a == null) {
            f.c("MessageLogClient", "[start]init sMessageLogClient.mService");
            f8302g.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:3:0x0006, B:6:0x000e, B:7:0x0024, B:14:0x002d, B:16:0x0033, B:17:0x0038, B:19:0x003d, B:21:0x0048, B:23:0x004e, B:25:0x0064, B:26:0x0080, B:28:0x0086, B:30:0x0097, B:34:0x0132, B:35:0x00a1, B:48:0x00cc, B:38:0x00d3, B:40:0x00d9, B:41:0x010a, B:43:0x0129, B:44:0x012b, B:52:0x0138, B:54:0x013e, B:56:0x0143, B:58:0x0147), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:3:0x0006, B:6:0x000e, B:7:0x0024, B:14:0x002d, B:16:0x0033, B:17:0x0038, B:19:0x003d, B:21:0x0048, B:23:0x004e, B:25:0x0064, B:26:0x0080, B:28:0x0086, B:30:0x0097, B:34:0x0132, B:35:0x00a1, B:48:0x00cc, B:38:0x00d3, B:40:0x00d9, B:41:0x010a, B:43:0x0129, B:44:0x012b, B:52:0x0138, B:54:0x013e, B:56:0x0143, B:58:0x0147), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleMsg(android.os.Message r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.g.f.a.handleMsg(android.os.Message):void");
    }
}
