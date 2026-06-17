package e.b.j.b;

import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.t.d;
import com.bytedance.apm.t.l.e;
import com.bytedance.apm.t.l.g;
import com.bytedance.monitor.collector.e;
import com.bytedance.monitor.collector.j;
import com.bytedance.monitor.collector.m;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.LinkedList;
import java.util.ListIterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a extends com.bytedance.apm.t.a implements d {
    private static a i = null;
    private static e.b.j.b.b j = null;
    private static long k = 0;
    public static boolean l = false;
    public static boolean m = false;
    private static volatile boolean n = false;
    private e.C0129e b;

    /* renamed from: c, reason: collision with root package name */
    private e.C0129e f9569c;

    /* renamed from: d, reason: collision with root package name */
    private volatile String f9570d;

    /* renamed from: e, reason: collision with root package name */
    private long[] f9571e = new long[3];

    /* renamed from: f, reason: collision with root package name */
    private volatile long f9572f = 0;

    /* renamed from: g, reason: collision with root package name */
    private c f9573g = null;
    private boolean h = false;

    /* renamed from: e.b.j.b.a$a, reason: collision with other inner class name */
    class RunnableC0439a implements Runnable {
        RunnableC0439a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.apm.t.l.d.i().m(a.this);
        }
    }

    static class b implements Runnable {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("evil_method_section", this.a);
                com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.b("evil_method_tracing", 0, null, jSONObject, null, null));
            } catch (JSONException unused) {
            }
        }
    }

    private class c implements Runnable {
        private boolean a;
        private boolean b;

        /* renamed from: c, reason: collision with root package name */
        long[] f9574c;

        /* renamed from: d, reason: collision with root package name */
        long f9575d;

        /* renamed from: e, reason: collision with root package name */
        long f9576e;

        /* renamed from: f, reason: collision with root package name */
        long f9577f;

        /* renamed from: g, reason: collision with root package name */
        String f9578g;
        String h;
        long i;
        e.g j;

        c(a aVar, boolean z, String str, long[] jArr, long[] jArr2, long j, long j2, long j3, String str2, long j4, String str3, e.g gVar) {
            this.f9578g = str;
            this.f9576e = j2;
            this.f9575d = j;
            this.f9574c = jArr;
            this.f9577f = j3;
            this.h = str2;
            this.i = j4;
            this.j = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                LinkedList linkedList = new LinkedList();
                long[] jArr = this.f9574c;
                if (jArr.length > 0) {
                    e.b.j.a.a.f(jArr, linkedList, true, this.f9577f);
                    int size = linkedList.size();
                    int i = 1;
                    loop0: while (size > 30) {
                        ListIterator listIterator = linkedList.listIterator(linkedList.size());
                        while (listIterator.hasPrevious()) {
                            if (((long) ((g) listIterator.previous()).b) < ((long) (i * 5))) {
                                listIterator.remove();
                                size--;
                                if (size <= 30) {
                                    break loop0;
                                }
                            }
                        }
                        size = linkedList.size();
                        i++;
                        if (60 < i) {
                            break;
                        }
                    }
                    int size2 = linkedList.size();
                    if (size2 > 30) {
                        if (com.bytedance.apm.g.B()) {
                            com.bytedance.apm.y.e.c("EvilMethodTracer", "[fallback] size:%s targetSize:%s stack:%s", Integer.valueOf(size2), 30, linkedList);
                        }
                        ListIterator listIterator2 = linkedList.listIterator(Math.min(size2, 30));
                        while (listIterator2.hasNext()) {
                            listIterator2.next();
                            listIterator2.remove();
                        }
                    }
                }
                if (linkedList.size() <= 2) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                long max = Math.max(this.f9576e, e.b.j.a.a.e(linkedList, sb));
                String c2 = e.b.j.a.a.c(linkedList, max);
                JSONObject jSONObject = new JSONObject();
                String sb2 = sb.toString();
                e.g gVar = this.j;
                if (gVar != null) {
                    gVar.c("uuid", null, null, sb2);
                }
                jSONObject.put("stack", sb2);
                jSONObject.put("stack_key", c2);
                jSONObject.put("scene", this.f9578g);
                jSONObject.put(HiAnalyticsConstant.BI_KEY_COST_TIME, max);
                jSONObject.put("cpu_cost", this.f9575d);
                jSONObject.put("method_time", max);
                j h = j.h();
                long j = this.f9577f;
                JSONObject d2 = h.d(j - this.f9576e, j);
                com.bytedance.apm.t.l.e y = com.bytedance.apm.t.l.e.y();
                long j2 = this.f9577f;
                d2.put("evil_method", y.x(j2 - this.f9576e, j2));
                jSONObject.put(MonitorConstants.CUSTOM, d2);
                jSONObject.put("message", m.a(this.h));
                jSONObject.put("timestamp", this.f9577f);
                jSONObject.put("event_type", "lag_drop_frame");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("crash_section", com.bytedance.apm.g.A(this.i));
                jSONObject2.put("block_frame", String.valueOf(this.b));
                jSONObject2.put("block_input", String.valueOf(this.a));
                jSONObject2.put("trace_type", "message");
                jSONObject.put("filters", jSONObject2);
                com.bytedance.apm.data.pipeline.a.k().d(new com.bytedance.apm.v.d.c("drop_frame_stack", jSONObject));
                a.j("evil_method_end");
            } catch (Exception unused) {
                a.j("evil_method_analyse_exception");
            }
        }
    }

    public a(boolean z, boolean z2) {
        if (!z2 && !n) {
            com.bytedance.apm.t.e.a(this);
            n = true;
        }
        if (i == null) {
            i = this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(String str) {
        com.bytedance.apm.F.b.e().h(new b(str));
    }

    public static void k(e.b.j.b.b bVar) {
        j = bVar;
    }

    public static void l(long j2) {
        if (j2 < 70) {
            j2 = 1000;
        }
        k = j2;
    }

    @Override // com.bytedance.apm.t.d
    public void a(boolean z, long j2) {
        l(j2);
        m = z;
        if (z) {
            return;
        }
        e.b.b.n.d.a(new RunnableC0439a());
        com.bytedance.apm.t.l.e.y().E();
    }

    @Override // com.bytedance.apm.t.a
    public void c(String str) {
        super.c(str);
        com.bytedance.apm.t.l.e.z(1048574, com.bytedance.monitor.collector.a.b);
        if (com.bytedance.monitor.collector.a.b - this.f9572f > 300) {
            this.f9569c = this.b;
            this.f9572f = com.bytedance.monitor.collector.a.b;
            this.b = com.bytedance.apm.t.l.e.B("EvilMethodTracer#dispatchBegin", 0L);
        }
        this.f9570d = str;
    }

    @Override // com.bytedance.apm.t.a
    public void d(long j2, long j3, long j4, long j5, boolean z) {
        String sb;
        super.d(j2, j3, j4, j5, z);
        com.bytedance.apm.t.l.e.C(1048574, com.bytedance.monitor.collector.a.b);
        c cVar = this.f9573g;
        if (cVar != null) {
            cVar.b = z;
            this.f9573g.a = com.bytedance.apm.t.l.d.i().b.b();
            com.bytedance.apm.F.b.e().h(this.f9573g);
            this.f9573g = null;
        }
        if (com.bytedance.apm.t.l.e.y().A()) {
            long j6 = j4 - j2;
            if (j6 >= k) {
                e.b.j.b.b bVar = j;
                if (bVar != null) {
                    bVar.a(j6, z);
                }
                j("evil_method_begin");
                long[] u = com.bytedance.apm.t.l.e.y().u(this.b);
                if (u == null || u.length == 0) {
                    j("evil_method_data_null");
                    return;
                }
                long[] jArr = new long[3];
                System.arraycopy(this.f9571e, 0, jArr, 0, 3);
                String b2 = com.bytedance.apm.t.g.b();
                if (TextUtils.isEmpty(b2)) {
                    sb = ActivityLifeObserver.getInstance().getTopActivityClassName();
                } else {
                    StringBuilder S = e.a.a.a.a.S(b2, Constants.ACCEPT_TIME_SEPARATOR_SP);
                    S.append(ActivityLifeObserver.getInstance().getTopActivityClassName());
                    sb = S.toString();
                }
                String str = this.f9570d;
                this.f9573g = new c(this, ActivityLifeObserver.getInstance().isForeground(), sb, u, jArr, j5 - j3, j6, j4, str, System.currentTimeMillis(), "uuid", j.h().i());
            }
        }
    }

    public void i() {
        if (n) {
            return;
        }
        com.bytedance.apm.t.e.a(this);
        n = true;
    }

    public synchronized void m() {
        if (this.h) {
            return;
        }
        if (m && l) {
            com.bytedance.apm.t.l.d.i().h(this);
        }
        this.h = true;
    }
}
