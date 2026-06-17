package e.b.o.a.b.e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class c implements e.b.o.a.c.b {
    private List<LinkedHashMap<Long, Long>> a = new ArrayList();
    private List<LinkedHashMap<Long, Long>> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private long f9723c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f9724d = 0;

    /* renamed from: e, reason: collision with root package name */
    private long f9725e = 0;

    /* renamed from: f, reason: collision with root package name */
    private double f9726f = 0.0d;

    public long a() {
        if (this.f9723c == 0 && !this.a.isEmpty()) {
            Iterator<LinkedHashMap<Long, Long>> it2 = this.a.iterator();
            while (it2.hasNext()) {
                Iterator<Map.Entry<Long, Long>> it3 = it2.next().entrySet().iterator();
                while (it3.hasNext()) {
                    Long value = it3.next().getValue();
                    this.f9723c = value.longValue() + this.f9723c;
                }
            }
        }
        return this.f9723c;
    }

    public String toString() {
        StringBuilder S = e.a.a.a.a.S("cputime:{", "deltaTime:");
        S.append(this.f9724d);
        S.append(" usage:");
        S.append(this.f9726f);
        S.append(" totaltime:");
        S.append(a());
        S.append("}");
        return S.toString();
    }
}
