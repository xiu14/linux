package com.bytedance.android.input.keyboard;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;

/* loaded from: classes.dex */
public class TimerManager {
    private static final HashMap<Integer, b> mActiveTimers = new HashMap<>();
    private static volatile a mHandler;
    private static int mTimerIdCounter;

    private static class a extends Handler {
        public a() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            b bVar;
            int i = message.what;
            synchronized (TimerManager.mActiveTimers) {
                bVar = (b) TimerManager.mActiveTimers.get(Integer.valueOf(i));
            }
            if (bVar != null) {
                e.a.a.a.a.j0("[o.ime.keyboard] handleMessage timerId = ", i, "TimerManager");
                KeyboardView.nativeTimerCallback(bVar.a);
                if (bVar.f2521c) {
                    TimerManager.mHandler.sendMessageDelayed(Message.obtain(TimerManager.mHandler, i), bVar.b);
                } else {
                    synchronized (TimerManager.mActiveTimers) {
                        TimerManager.mActiveTimers.remove(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    private static class b {
        final long a;
        final int b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f2521c;

        b(long j, int i, boolean z) {
            this.a = j;
            this.b = i;
            this.f2521c = z;
        }
    }

    public static void killAllTimers() {
        if (mHandler != null) {
            mHandler.removeCallbacksAndMessages(null);
        }
        HashMap<Integer, b> hashMap = mActiveTimers;
        synchronized (hashMap) {
            hashMap.clear();
        }
    }

    public static void killTimer(int i) {
        if (mHandler != null) {
            HashMap<Integer, b> hashMap = mActiveTimers;
            synchronized (hashMap) {
                if (hashMap.containsKey(Integer.valueOf(i))) {
                    mHandler.removeMessages(i);
                    hashMap.remove(Integer.valueOf(i));
                }
            }
        }
    }

    public static int setTimer(int i, long j, boolean z) {
        int i2;
        if (mHandler == null) {
            synchronized (TimerManager.class) {
                if (mHandler == null) {
                    mHandler = new a();
                }
            }
        }
        HashMap<Integer, b> hashMap = mActiveTimers;
        synchronized (hashMap) {
            int i3 = mTimerIdCounter + 1;
            mTimerIdCounter = i3;
            if (i3 == 0) {
                mTimerIdCounter = i3 + 1;
            }
            i2 = mTimerIdCounter;
            hashMap.put(Integer.valueOf(i2), new b(j, i, z));
        }
        mHandler.sendMessageDelayed(Message.obtain(mHandler, i2), i);
        return i2;
    }
}
