package e.h.a;

import android.content.Context;
import android.os.AsyncTask;
import e.h.a.d.e;
import e.h.a.f.c.d;
import e.h.a.f.c.f;
import e.h.a.f.c.g;
import e.h.a.f.c.h;
import e.h.a.f.c.i;
import e.h.a.f.c.j;
import e.h.a.f.c.k;
import e.h.a.f.c.l;
import e.h.a.f.c.m;
import e.h.a.f.c.n;
import e.h.a.f.c.o;
import e.h.a.f.c.p;
import e.h.a.f.c.q;
import e.h.a.f.c.r;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static volatile Context f9939f = null;

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f9940g = null;
    private static e.h.a.d.c h = null;
    private static e i = null;
    private static volatile boolean j = false;
    private static volatile String k = "";
    private static String l;
    private List<e.h.a.f.b> b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f9941c;

    /* renamed from: e, reason: collision with root package name */
    private long f9943e;

    /* renamed from: d, reason: collision with root package name */
    private volatile HashMap<String, String> f9942d = new HashMap<>();
    private Vector a = new Vector(10);

    /* renamed from: e.h.a.a$a, reason: collision with other inner class name */
    class RunnableC0459a implements Runnable {
        final /* synthetic */ String a;

        RunnableC0459a(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.a(a.this, e.h.a.e.a.a(this.a));
        }
    }

    private a() {
        ExecutorService executorService = (ExecutorService) AsyncTask.THREAD_POOL_EXECUTOR;
        this.f9941c = executorService;
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new f());
        arrayList.add(new e.h.a.f.c.c());
        arrayList.add(new q());
        arrayList.add(new j());
        arrayList.add(new o());
        arrayList.add(new r());
        arrayList.add(new d());
        arrayList.add(new p());
        arrayList.add(new m());
        arrayList.add(new h());
        arrayList.add(new e.h.a.f.c.b());
        arrayList.add(new e.h.a.f.c.a());
        arrayList.add(new l());
        arrayList.add(new n());
        arrayList.add(new g());
        arrayList.add(new i());
        arrayList.add(new e.h.a.f.c.e());
        arrayList.add(new k());
        this.b = Collections.unmodifiableList(arrayList);
        e.h.a.d.c cVar = h;
        if (cVar != null) {
            k(cVar);
            h = null;
        }
        e eVar = i;
        if (eVar != null) {
            m(eVar);
            i = null;
        }
        executorService.execute(new b(this));
        try {
            StringBuilder sb = new StringBuilder();
            File file = new File(f9939f.getExternalFilesDir(null) + "/monitor");
            if (!file.exists()) {
                file.mkdir();
            }
            sb.append(file.getAbsolutePath());
            sb.append("/dump.hprof");
            k = sb.toString();
        } catch (Exception unused) {
        }
    }

    static void a(a aVar, e.h.a.e.a aVar2) {
        Objects.requireNonNull(aVar);
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.b("cloudmessage", "handleCloudMessageInternal cloudMessage=" + aVar2);
        }
        if (aVar2 == null) {
            return;
        }
        Iterator<e.h.a.f.b> it2 = aVar.b.iterator();
        while (it2.hasNext() && !it2.next().b(aVar2)) {
        }
    }

    public static String f() {
        return k;
    }

    public static a g() {
        if (f9940g == null) {
            synchronized (a.class) {
                if (f9940g == null) {
                    if (!j) {
                        throw new RuntimeException("call CloudMessageManager.init() first");
                    }
                    f9940g = new a();
                }
            }
        }
        return f9940g;
    }

    public static void j(Context context) {
        j = true;
        f9939f = context.getApplicationContext();
        g();
        if (com.bytedance.apm.g.B()) {
            com.bytedance.apm.y.d.b("cloudmessage", "CloudMessageManager Init.");
        }
    }

    private void k(e.h.a.d.c cVar) {
        if (cVar != null) {
            for (e.h.a.f.b bVar : this.b) {
                if (bVar instanceof e.h.a.f.c.b) {
                    ((e.h.a.f.c.b) bVar).k(cVar);
                    return;
                }
            }
        }
    }

    public static void l(e.h.a.d.c cVar) {
        if (j) {
            g().k(cVar);
        } else {
            h = cVar;
        }
    }

    private void m(e eVar) {
        if (eVar != null) {
            for (e.h.a.f.b bVar : this.b) {
                if (bVar instanceof h) {
                    ((h) bVar).k(eVar);
                    return;
                }
            }
        }
    }

    public static void n(e eVar) {
        if (j) {
            g().m(eVar);
        } else {
            i = eVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        r3 = r7.getValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.h.a.a.c():void");
    }

    public HashMap<String, String> d() {
        return this.f9942d;
    }

    public Context e() {
        return f9939f;
    }

    public Enumeration h() {
        return this.a.elements();
    }

    public void i(String str) {
        this.f9941c.execute(new RunnableC0459a(str));
    }
}
