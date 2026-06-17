package com.bytedance.frameworks.baselib.network.h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class a {
    private static HashMap<String, HandlerThread> a;

    /* renamed from: com.bytedance.frameworks.baselib.network.h.a$a, reason: collision with other inner class name */
    public static class HandlerThreadC0253a extends HandlerThread {
        private volatile boolean a;

        public HandlerThreadC0253a(String str, int i) {
            super(str, i);
            this.a = false;
        }

        @Override // java.lang.Thread
        public synchronized void start() {
            if (this.a) {
                return;
            }
            this.a = true;
            super.start();
        }
    }

    static {
        new Handler(Looper.getMainLooper());
        a = new HashMap<>();
        Arrays.asList("NpthHandlerThread", "NewVideo-HandlerThread", "trace_time_update_thread");
        Arrays.asList("DBHelper-AsyncOp-New");
        new HashMap();
    }

    public static HandlerThread a(String str) {
        Iterator<Map.Entry<String, HandlerThread>> it2 = a.entrySet().iterator();
        while (it2.hasNext()) {
            if (!it2.next().getValue().isAlive()) {
                it2.remove();
            }
        }
        HandlerThread handlerThread = a.get(str);
        if (handlerThread != null) {
            return handlerThread;
        }
        HandlerThreadC0253a handlerThreadC0253a = new HandlerThreadC0253a(str, 0);
        handlerThreadC0253a.start();
        a.put(str, handlerThreadC0253a);
        return handlerThreadC0253a;
    }
}
