package e.b.o.a.b.e;

/* loaded from: classes2.dex */
public class d implements e.b.o.a.c.b {
    protected String a = null;
    protected int b = -1;

    /* renamed from: c, reason: collision with root package name */
    protected long f9727c = 0;

    /* renamed from: d, reason: collision with root package name */
    protected long f9728d = 0;

    /* renamed from: e, reason: collision with root package name */
    protected long f9729e = 0;

    /* renamed from: f, reason: collision with root package name */
    protected double f9730f = 0.0d;

    /* renamed from: g, reason: collision with root package name */
    protected double f9731g = 0.0d;

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("proc_stat:{pid=");
        M.append(this.b);
        M.append(" process_name:");
        M.append(this.a);
        M.append(" delta cpu_time:");
        M.append(this.f9728d);
        M.append(" cpu_usage:");
        M.append(this.f9730f * 100.0d);
        M.append("%");
        M.append(" cpu_rate:");
        M.append(this.f9731g);
        M.append("}");
        return M.toString();
    }
}
