package com.vivo.push.restructure.request;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.g;
import java.util.Map;

/* loaded from: classes2.dex */
final class e extends Handler {
    final /* synthetic */ d a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(d dVar, Looper looper) {
        super(looper);
        this.a = dVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Map map;
        Map map2;
        int i = message.what;
        map = this.a.a;
        if (map.containsKey(Integer.valueOf(i))) {
            map2 = this.a.a;
            g.a().execute(new f(this, (b) map2.remove(Integer.valueOf(i))));
        }
    }
}
