package ms.bd.c;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class y1 {
    public final a2 a;
    public final e2 b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10473c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10474d;

    /* renamed from: e, reason: collision with root package name */
    public w1 f10475e;

    /* renamed from: f, reason: collision with root package name */
    public Handler f10476f;

    /* renamed from: g, reason: collision with root package name */
    public HandlerThread f10477g;
    public final CountDownLatch h;

    static {
    }

    public y1(Context context, String str) {
        a2 a2Var = new a2(context);
        this.f10474d = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        e2 e2Var = new e2();
        this.b = e2Var;
        if (e2Var.f10370e) {
        }
        if (e2Var.f10371f) {
            this.f10473c = str;
            this.a = a2Var;
            this.h = new CountDownLatch(1);
            this.f10474d = true;
        }
    }
}
