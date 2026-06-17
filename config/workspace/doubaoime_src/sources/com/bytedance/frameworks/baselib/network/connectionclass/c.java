package com.bytedance.frameworks.baselib.network.connectionclass;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    private AtomicReference<ConnectionQuality> f5031d;

    /* renamed from: f, reason: collision with root package name */
    private int f5033f;
    private e a = new e(0.05d);
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private AtomicReference<ConnectionQuality> f5030c = new AtomicReference<>(ConnectionQuality.UNKNOWN);

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<b> f5032e = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    static class a {
        public static final c a = new c();
    }

    public interface b {
        void h(ConnectionQuality connectionQuality);
    }

    protected c() {
    }

    public static c c() {
        return a.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[Catch: all -> 0x0118, TRY_LEAVE, TryCatch #1 {all -> 0x0118, blocks: (B:7:0x0018, B:9:0x001e, B:10:0x0044, B:12:0x004e, B:14:0x0060, B:15:0x0064, B:17:0x006d, B:21:0x00ca, B:30:0x00fa, B:54:0x00c4, B:58:0x00ff, B:60:0x010b, B:32:0x0073, B:35:0x00a5, B:44:0x008d, B:47:0x0094, B:50:0x0099, B:23:0x00db, B:25:0x00e3), top: B:6:0x0018, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(long r9, long r11) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.connectionclass.c.a(long, long):void");
    }

    public synchronized ConnectionQuality b() {
        e eVar = this.a;
        if (eVar == null) {
            return ConnectionQuality.UNKNOWN;
        }
        try {
            double b2 = eVar.b();
            return b2 < 0.0d ? ConnectionQuality.UNKNOWN : b2 < 28.0d ? ConnectionQuality.POOR : b2 < 112.0d ? ConnectionQuality.MODERATE : b2 < 560.0d ? ConnectionQuality.GOOD : ConnectionQuality.EXCELLENT;
        } catch (Throwable th) {
            th.printStackTrace();
            return ConnectionQuality.UNKNOWN;
        }
    }

    public ConnectionQuality d(b bVar) {
        if (bVar != null) {
            this.f5032e.add(bVar);
        }
        return this.f5030c.get();
    }
}
