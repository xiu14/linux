package e.b.g.a.b;

import android.content.Context;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class f extends Thread {
    private final Context a;
    private final Object b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f9541c;

    /* renamed from: d, reason: collision with root package name */
    private final e f9542d;

    /* renamed from: e, reason: collision with root package name */
    private long f9543e;

    /* renamed from: f, reason: collision with root package name */
    private long f9544f;

    /* renamed from: g, reason: collision with root package name */
    private long f9545g;
    private d h;
    private final LinkedList<b> i;

    f(Context context, d dVar, LinkedList<b> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.b = new Object();
        this.f9543e = -1L;
        this.f9544f = 0L;
        this.f9545g = 120000L;
        this.h = dVar;
        this.a = context;
        this.i = linkedList;
        this.f9541c = atomicBoolean;
        this.f9542d = e.c(context);
    }

    private boolean b() {
        return this.f9541c.get();
    }

    private boolean c(a aVar, String str, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 0 || TextUtils.isEmpty(str)) {
            return false;
        }
        return aVar.f(str, bArr);
    }

    void a() {
        synchronized (this.b) {
            this.b.notify();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0307 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.b.g.a.b.f.run():void");
    }
}
