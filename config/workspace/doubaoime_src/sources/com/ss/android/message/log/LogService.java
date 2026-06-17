package com.ss.android.message.log;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.push.g0.f;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.message.e;
import java.util.ArrayList;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class LogService extends Service implements WeakHandler.IHandler {
    private Messenger a;

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        a aVar;
        Messenger messenger;
        long[] longArray;
        try {
            try {
                aVar = a.c(this);
            } catch (Exception e2) {
                e2.printStackTrace();
                aVar = null;
            }
            f.c("PushLog", "handleMsg msg.what = " + message.what);
            int i = message.what;
            if (i != 0) {
                if (i != 1 || (messenger = message.replyTo) == null || (longArray = ((Bundle) message.obj).getLongArray("event_ids")) == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("event_ids = ");
                ArrayList arrayList = new ArrayList();
                for (long j : longArray) {
                    arrayList.add(Long.valueOf(j));
                }
                sb.append(arrayList);
                f.c("PushLog", sb.toString());
                if (aVar == null) {
                    messenger.send(Message.obtain((Handler) null, 2));
                    return;
                }
                for (long j2 : longArray) {
                    aVar.a(j2);
                }
                return;
            }
            Messenger messenger2 = message.replyTo;
            if (messenger2 != null) {
                long j3 = ((Bundle) message.obj).getLong("start_id", 0L);
                if (aVar == null) {
                    messenger2.send(Message.obtain((Handler) null, 2));
                    return;
                }
                JSONArray b = aVar.b(j3, 5);
                if (b == null) {
                    messenger2.send(Message.obtain((Handler) null, 2));
                    return;
                }
                Message obtain = Message.obtain((Handler) null, 0);
                Bundle bundle = new Bundle();
                bundle.putString("events", b.toString());
                if (b.length() >= 5) {
                    bundle.putBoolean("has_more", true);
                } else {
                    bundle.putBoolean("has_more", false);
                }
                f.c("PushLog", "events = " + bundle.get("events") + " has_more = " + bundle.get("has_more"));
                obtain.obj = bundle;
                messenger2.send(obtain);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        f.c("PushLog", "onBind " + this);
        return this.a.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f.c("PushLog", "onCreate " + this);
        try {
            com.ss.android.g.e.a aVar = (com.ss.android.g.e.a) com.ss.android.ug.bus.b.a(com.ss.android.g.e.a.class);
            if (aVar != null) {
                aVar.h(this);
            }
        } catch (Throwable unused) {
        }
        this.a = new Messenger(new WeakHandler(e.e().d(), this));
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int onStartCommand = super.onStartCommand(intent, i, i2);
        com.ss.android.g.e.b R = r.R();
        if (R == null || !R.b()) {
            return onStartCommand;
        }
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        f.c("PushLog", "onUnBind " + this);
        return super.onUnbind(intent);
    }
}
