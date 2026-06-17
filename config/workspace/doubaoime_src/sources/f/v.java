package f;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;

/* loaded from: classes2.dex */
public final class v {
    public static u a;
    public static long b;

    /* renamed from: c, reason: collision with root package name */
    public static final v f10066c = new v();

    private v() {
    }

    public static final void a(u uVar) {
        kotlin.s.c.l.g(uVar, MonitorConstants.SEGMENT);
        if (!(uVar.f10064f == null && uVar.f10065g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (uVar.f10062d) {
            return;
        }
        synchronized (f10066c) {
            long j = b + 8192;
            if (j > 65536) {
                return;
            }
            b = j;
            uVar.f10064f = a;
            uVar.f10061c = 0;
            uVar.b = 0;
            a = uVar;
        }
    }

    public static final u b() {
        synchronized (f10066c) {
            u uVar = a;
            if (uVar == null) {
                return new u();
            }
            a = uVar.f10064f;
            uVar.f10064f = null;
            b -= 8192;
            return uVar;
        }
    }
}
