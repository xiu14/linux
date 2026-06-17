package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
class y {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).recycle();
            return true;
        }
    }

    y() {
    }

    synchronized void a(v<?> vVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            vVar.recycle();
            this.a = false;
        }
        this.b.obtainMessage(1, vVar).sendToTarget();
    }
}
