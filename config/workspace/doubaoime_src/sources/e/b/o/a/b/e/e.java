package e.b.o.a.b.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e implements e.b.o.a.c.b {

    /* renamed from: e, reason: collision with root package name */
    private List<Integer> f9734e;
    private List<LinkedHashMap<Long, Long>> a = new ArrayList();
    private List<LinkedHashMap<Long, Long>> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private List<LinkedHashMap<Long, Long>> f9732c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private boolean f9733d = false;

    /* renamed from: f, reason: collision with root package name */
    private long f9735f = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f9736g = 0;
    private long h = 0;

    private long a(List<LinkedHashMap<Long, Long>> list) {
        int size;
        if (!this.f9733d) {
            this.f9734e = e.b.o.a.d.a.a();
            this.f9733d = true;
        }
        long j = 0;
        if (list != null && !list.isEmpty() && (size = list.size()) == this.f9734e.size()) {
            for (int i = 0; i < size; i++) {
                Iterator<Map.Entry<Long, Long>> it2 = list.get(i).entrySet().iterator();
                while (it2.hasNext()) {
                    j += it2.next().getValue().longValue();
                }
            }
        }
        return j;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("ProcTimeInStateInfo{freqTimeMapList=");
        M.append(this.a);
        M.append(", freqDeltaTimeMapList=");
        M.append(this.b);
        M.append(", totalCpuTime=");
        if (this.f9735f == 0) {
            this.f9735f = a(this.a);
        }
        M.append(this.f9735f);
        M.append(", totalDeltaCpuTime=");
        if (this.f9736g == 0) {
            this.f9736g = a(this.b);
        }
        M.append(this.f9736g);
        M.append(", totalMergeCpuTime=");
        if (this.h == 0) {
            this.h = a(this.f9732c);
        }
        return e.a.a.a.a.E(M, this.h, '}');
    }
}
