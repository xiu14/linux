package e.b.o.a.b.c;

import android.os.SystemClock;
import android.util.Log;
import e.b.o.a.a.b;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {
    private b a;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private long f9709c;

    public a(b bVar) {
        this.a = bVar;
    }

    public boolean a(float f2) {
        if (!b()) {
            int i = e.b.o.a.d.b.b;
            Log.i("watson_assist", "isAbnormalProcess false, cpuSpeed " + f2 + ", not sample environment");
            return false;
        }
        if (((e.b.o.a.b.a) this.a).c().a() == null) {
            int i2 = e.b.o.a.d.b.b;
            Log.i("watson_assist", "isAbnormalProcess true, cpuSpeed " + f2 + ", configSpeed:null");
            return true;
        }
        if (f2 < 0.0f) {
            return false;
        }
        if (0.0f > 0.0d) {
            ((e.b.o.a.b.a) this.a).f();
        }
        int i3 = e.b.o.a.d.b.b;
        Log.i("watson_assist", "isAbnormalProcess true, cpuSpeed " + f2 + ", configSpeed:0.0");
        return true;
    }

    public boolean b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f9709c;
        if (j == 0 || elapsedRealtime - j >= com.heytap.mcssdk.constant.a.r) {
            this.f9709c = elapsedRealtime;
            float b = ((e.b.o.a.b.a) this.a).b();
            int a = ((e.b.o.a.b.a) this.a).a();
            int i = ((e.b.o.a.b.a) this.a).i();
            Objects.requireNonNull(((e.b.o.a.b.a) this.a).c());
            boolean z = b <= ((float) 37);
            Objects.requireNonNull(((e.b.o.a.b.a) this.a).c());
            if (a < 30) {
                z = false;
            }
            boolean z2 = i != 1 ? z : false;
            String str = "updateCpuSampleEnvironment:" + z2 + ", temp:" + b + ", level:" + a + ", powerSave:" + i;
            int i2 = e.b.o.a.d.b.b;
            Log.i("watson_assist", str);
            this.b = z2;
        }
        return this.b;
    }
}
