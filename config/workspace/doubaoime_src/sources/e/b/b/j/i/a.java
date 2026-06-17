package e.b.b.j.i;

import e.b.b.m.c;
import e.b.b.n.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends com.bytedance.apm6.perf.base.model.a {
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private long f9480c;

    /* renamed from: d, reason: collision with root package name */
    private long f9481d;

    /* renamed from: e, reason: collision with root package name */
    private long f9482e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9483f;

    /* renamed from: g, reason: collision with root package name */
    private long f9484g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;
    private double m;
    private boolean n;
    private boolean o;
    private Map<Object, Object> p;

    public a(long j, long j2, long j3, long j4, boolean z, long j5, long j6, long j7, long j8, long j9, long j10, double d2, boolean z2, boolean z3) {
        this.b = j;
        this.f9480c = j2;
        this.f9481d = j3;
        this.f9482e = j4;
        this.f9483f = z;
        this.f9484g = j5;
        this.h = j6;
        this.i = j7;
        this.j = j8;
        this.k = j9;
        this.l = j10;
        this.m = d2;
        this.n = z2;
        this.o = z3;
    }

    @Override // e.b.b.k.c
    public boolean b() {
        return true;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene", e.b.b.l.a.a.a().e());
            jSONObject.put("process_name", e.b.b.h.c.a.k());
            jSONObject.put("is_front", !this.f9483f);
            jSONObject.put("is_main_process", e.b.b.h.c.a.y());
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("gc_count", this.b);
            jSONObject.put("gc_time", this.f9480c);
            jSONObject.put("block_gc_count", this.f9481d);
            jSONObject.put("block_gc_time", this.f9482e);
            if (this.f9483f) {
                jSONObject.put("dalvik_pss_background", this.j);
                jSONObject.put("native_pss_background", this.f9484g);
                jSONObject.put("total_pss_background", this.h);
                jSONObject.put("java_heap_background", this.i);
                jSONObject.put("java_heap_background_used_rate", this.m);
                jSONObject.put("vm_size_background", this.l);
                jSONObject.put("graphics_background", this.k);
            } else {
                jSONObject.put("dalvik_pss_foreground", this.j);
                jSONObject.put("native_pss_foreground", this.f9484g);
                jSONObject.put("total_pss_foreground", this.h);
                jSONObject.put("java_heap_foreground", this.i);
                jSONObject.put("java_heap_foreground_used_rate", this.m);
                jSONObject.put("vm_size_foreground", this.l);
                jSONObject.put("graphics_foreground", this.k);
            }
            if (this.n) {
                jSONObject.put("reach_top_java", 1);
            }
            try {
                Map<Object, Object> map = this.p;
                if (map != null) {
                    for (Map.Entry<Object, Object> entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), Long.parseLong((String) entry.getValue()));
                    }
                }
            } catch (Exception unused) {
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    public JSONObject g() {
        JSONObject b = e.b.b.l.a.a.a().b();
        if (this.o) {
            try {
                b.a(b, e.b.b.l.a.a.a().d());
            } catch (Exception unused) {
            }
        }
        e.b.b.m.d.a aVar = (e.b.b.m.d.a) c.a(e.b.b.m.d.a.class);
        if (aVar != null) {
            try {
                b.a(b, aVar.a());
            } catch (Exception unused2) {
            }
        }
        return b;
    }

    @Override // com.bytedance.apm6.perf.base.model.a
    protected String h() {
        return "memory";
    }

    public double i() {
        return this.m;
    }

    public e.b.b.j.f.a j() {
        e.b.b.j.f.a aVar = new e.b.b.j.f.a();
        aVar.a = this.b;
        aVar.b = this.f9480c;
        aVar.f9471c = this.f9481d;
        aVar.f9472d = this.f9482e;
        aVar.f9473e = this.f9483f;
        aVar.f9474f = this.f9484g;
        aVar.f9475g = this.h;
        aVar.h = this.i;
        aVar.i = this.j;
        aVar.j = this.k;
        aVar.k = this.l;
        aVar.l = this.n;
        return aVar;
    }

    public void k(Map<Object, Object> map) {
        this.p = map;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MemoryPerfMonitorable{gcCount=");
        M.append(this.b);
        M.append(", gcTime=");
        M.append(this.f9480c);
        M.append(", blockingGcCount=");
        M.append(this.f9481d);
        M.append(", blockingGcTime=");
        M.append(this.f9482e);
        M.append(", background=");
        M.append(this.f9483f);
        M.append(", nativePss=");
        M.append(this.f9484g);
        M.append(", totalPss=");
        M.append(this.h);
        M.append(", javaUsedMemory=");
        M.append(this.i);
        M.append(", dalvikUsedSize=");
        M.append(this.j);
        M.append(", graphics=");
        M.append(this.k);
        M.append(", vmSize=");
        M.append(this.l);
        M.append(", javaUsedMemoryRate=");
        M.append(this.m);
        M.append(", isMemoryReachTop=");
        return e.a.a.a.a.L(M, this.n, '}');
    }
}
