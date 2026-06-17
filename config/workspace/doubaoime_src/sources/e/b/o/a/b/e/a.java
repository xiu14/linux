package e.b.o.a.b.e;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a implements e.b.o.a.c.b {
    private List<List<Long>> a = new ArrayList();
    private List<List<Long>> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private long f9715c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f9716d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f9717e = 0;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CpuIdleTimeStatInfo{stateTimeLists=");
        M.append(this.a);
        M.append(", stateDeltaTimeLists=");
        M.append(this.b);
        M.append(", totalCpuIdleTime=");
        M.append(this.f9715c);
        M.append(", deltaCpuIdleTime=");
        M.append(this.f9716d);
        M.append(", mergedDeltaCpuIdleTime=");
        return e.a.a.a.a.E(M, this.f9717e, '}');
    }
}
