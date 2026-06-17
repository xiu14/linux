package com.bytedance.applog.D;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* loaded from: classes.dex */
class c extends Handler {
    final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what != 1) {
            return;
        }
        if (this.a.f3747e != null) {
            Object obj = message.obj;
            if (obj instanceof String) {
                String str = (String) obj;
                boolean equals = Objects.equals(str, this.a.f3747e.g());
                boolean z = this.a.f3745c && this.a.b;
                if (equals && z) {
                    this.a.f3747e.n(System.currentTimeMillis());
                    this.a.f3749g.e(this.a.f3747e);
                    d.p(this.a, str);
                    Objects.requireNonNull(this.a);
                    return;
                }
            }
        }
        this.a.f3749g.b();
        Objects.requireNonNull(this.a);
    }
}
