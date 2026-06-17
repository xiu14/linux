package com.ss.android.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public class a {
    public static final /* synthetic */ int a = 0;

    /* renamed from: com.ss.android.b.a$a, reason: collision with other inner class name */
    static class HandlerC0370a extends Handler {
        public HandlerC0370a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 2001) {
                int i = a.a;
                throw null;
            }
        }
    }

    static {
        new HandlerC0370a(Looper.getMainLooper());
    }
}
