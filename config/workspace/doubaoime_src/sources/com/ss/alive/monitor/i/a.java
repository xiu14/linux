package com.ss.alive.monitor.i;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.push.W.d;
import com.bytedance.push.W.f;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class a extends com.bytedance.push.W.a {
    private static volatile a b;
    private com.ss.alive.monitor.a a;

    private a() {
    }

    public static a c(Context context) {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    @Override // com.bytedance.push.W.a
    public f a(Object obj, Method method, Object[] objArr) {
        if (TextUtils.equals(method.getName(), "handleMessage")) {
            this.a.h((Message) objArr[0]);
        }
        return new f();
    }

    public void b(com.ss.alive.monitor.a aVar) {
        this.a = aVar;
        d.f().a(this);
    }
}
