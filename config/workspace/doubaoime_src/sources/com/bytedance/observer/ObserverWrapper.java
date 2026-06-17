package com.bytedance.observer;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Keep;
import com.bytedance.apm.t.i;
import java.lang.reflect.InvocationTargetException;

@Keep
/* loaded from: classes.dex */
public class ObserverWrapper extends i.a implements Looper.Observer {
    private Looper.Observer mOriginObserver;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            throw new IllegalStateException("load class error");
        }
    }

    public void dispatchingThrewException(Object obj, Message message, Exception exc) {
        if (i.f3534c != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                observer.dispatchingThrewException(obj, message, exc);
                return;
            }
            try {
                i.f3537f.invoke(i.f3534c, obj, message, exc);
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object messageDispatchStarting() {
        /*
            r3 = this;
            java.lang.Object r0 = com.bytedance.apm.t.i.f3534c
            if (r0 == 0) goto L22
            android.os.Looper$Observer r0 = r3.mOriginObserver
            if (r0 == 0) goto Ld
            java.lang.Object r0 = r0.messageDispatchStarting()
            goto L23
        Ld:
            java.lang.reflect.Method r0 = com.bytedance.apm.t.i.f3535d     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1e
            java.lang.Object r1 = com.bytedance.apm.t.i.f3534c     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1e
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1e
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L19 java.lang.IllegalAccessException -> L1e
            goto L23
        L19:
            r0 = move-exception
            r0.printStackTrace()
            goto L22
        L1e:
            r0 = move-exception
            r0.printStackTrace()
        L22:
            r0 = 0
        L23:
            java.lang.Thread r1 = com.bytedance.apm.t.i.f3538g
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            if (r1 != r2) goto L30
            java.lang.String r1 = ">>>>> Dispatching to Handler (com.bytedance.apm.block.LooperObserverMonitor) {57c1969} com.bytedance.apm.block.LooperObserverMonitor@5caffee: 0"
            r3.messageDispatchStarting(r1)
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.observer.ObserverWrapper.messageDispatchStarting():java.lang.Object");
    }

    public void messageDispatched(Object obj, Message message) {
        if (i.f3534c != null) {
            Looper.Observer observer = this.mOriginObserver;
            if (observer != null) {
                observer.messageDispatched(obj, message);
            } else {
                try {
                    i.f3536e.invoke(i.f3534c, obj, message);
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InvocationTargetException e3) {
                    e3.printStackTrace();
                }
            }
        }
        if (i.f3538g == Thread.currentThread()) {
            messageDispatched("<<<<< Finished to Handler (com.bytedance.apm.block.LooperObserverMonitor) {57c1969} com.bytedance.apm.block.LooperObserverMonitor@5caffee", message);
        }
    }

    @Override // com.bytedance.apm.t.i.a
    protected void setup(Object obj) {
        if (obj != null && (obj instanceof Looper.Observer)) {
            this.mOriginObserver = (Looper.Observer) obj;
        }
    }
}
