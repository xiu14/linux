package com.bytedance.memory.a;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.crash.Npth;
import com.bytedance.memory.b.c;
import com.bytedance.memory.b.e;
import com.bytedance.memory.c.d;

/* loaded from: classes.dex */
public class a {
    private static volatile a i;
    private static volatile long j;
    private Context a;
    private com.bytedance.memory.e.a b;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f5363d;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f5365f;

    /* renamed from: g, reason: collision with root package name */
    private volatile boolean f5366g;
    private String h;

    /* renamed from: c, reason: collision with root package name */
    private long f5362c = 0;

    /* renamed from: e, reason: collision with root package name */
    private com.bytedance.memory.b.a f5364e = new C0267a(this);

    /* renamed from: com.bytedance.memory.a.a$a, reason: collision with other inner class name */
    class C0267a implements com.bytedance.memory.b.a {
        C0267a(a aVar) {
        }

        @Override // com.bytedance.memory.b.a
        public boolean a() {
            return a.j().g();
        }

        @Override // com.bytedance.memory.b.a
        public boolean b() {
            if (!a.j().g()) {
                if (System.currentTimeMillis() - com.bytedance.memory.heap.a.e().g().getLong("lastDumpTime", 0L) < 28800000) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.bytedance.memory.b.a
        public boolean c() {
            return com.bytedance.memory.c.b.c().j();
        }

        @Override // com.bytedance.memory.b.a
        public void d() {
            d.g().d(System.currentTimeMillis());
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.b.n() == 2 && d.g().b()) {
                com.bytedance.memory.g.a.f().h(a.this.b, a.this.f5364e);
            }
            a.this.f(false);
            a.this.f5366g = false;
        }
    }

    private a() {
    }

    public static a j() {
        if (i == null) {
            synchronized (a.class) {
                if (i == null) {
                    i = new a();
                }
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d8, code lost:
    
        r11 = new org.json.JSONObject(new java.lang.String(r0.b())).optBoolean("should_upload");
        com.bytedance.memory.b.c.b("uploadCheck with api: shouldUpload " + r11, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0202, code lost:
    
        if (r11 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0204, code lost:
    
        com.bytedance.feedbackerlib.a.P0("error_forbid_upload");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(boolean r11) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.a.a.f(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g() {
        /*
            r3 = this;
            r0 = 0
            com.bytedance.memory.e.a r1 = r3.b     // Catch: java.lang.Exception -> L1f
            r2 = 1
            if (r1 == 0) goto L29
            boolean r1 = r1.p()     // Catch: java.lang.Exception -> L1f
            if (r1 == 0) goto L29
            android.content.Context r1 = r3.a     // Catch: java.lang.Exception -> L1f
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch: java.lang.Exception -> L1a
            int r1 = r1.flags     // Catch: java.lang.Exception -> L1a
            r1 = r1 & 2
            if (r1 == 0) goto L1a
            r1 = r2
            goto L1b
        L1a:
            r1 = r0
        L1b:
            if (r1 == 0) goto L29
            r0 = r2
            goto L29
        L1f:
            r1 = move-exception
            java.lang.String r1 = android.util.Log.getStackTraceString(r1)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.bytedance.memory.b.c.b(r1, r2)
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.memory.a.a.g():boolean");
    }

    @NonNull
    public Context h() {
        com.bytedance.feedbackerlib.a.j(this.a, "You must call init() first before using !!!");
        return this.a;
    }

    @NonNull
    public com.bytedance.memory.e.a i() {
        com.bytedance.feedbackerlib.a.j(this.b, com.bytedance.memory.e.a.class.getSimpleName() + " mustn't be null");
        return this.b;
    }

    public String k() {
        return this.h;
    }

    @MainThread
    public void l(@NonNull Context context, @NonNull com.bytedance.memory.e.a aVar, @Nullable com.bytedance.memory.g.b bVar) {
        if (this.f5365f) {
            return;
        }
        com.bytedance.feedbackerlib.a.j(context, Context.class.getSimpleName() + " mustn't be null");
        com.bytedance.feedbackerlib.a.j(aVar, com.bytedance.memory.e.a.class.getSimpleName() + " mustn't be null");
        this.a = context;
        this.b = aVar;
        e.a = aVar.p();
        if (aVar.i()) {
            com.bytedance.memory.a.b bVar2 = new com.bytedance.memory.a.b(this);
            try {
                if (Build.VERSION.SDK_INT > 33) {
                    context.getApplicationContext().registerReceiver(bVar2, new IntentFilter("Action_Result_Memory_Client_Analyzer"), 2);
                } else {
                    context.getApplicationContext().registerReceiver(bVar2, new IntentFilter("Action_Result_Memory_Client_Analyzer"));
                }
            } catch (Throwable th) {
                c.b("sendBroadcast catch", new Object[0]);
                th.printStackTrace();
            }
        }
        Npth.registerOOMCallback(new com.bytedance.memory.d.a());
        this.f5365f = true;
    }

    public void m(Context context) {
        this.a = context;
    }

    public void n(String str) {
        this.h = str;
    }

    public void o() {
        if (this.f5366g) {
            return;
        }
        c.b("MemoryApi start", new Object[0]);
        this.f5366g = true;
        if (!this.f5365f) {
            throw new IllegalStateException("You must call init() first before using !!!");
        }
        com.bytedance.memory.b.b.a.a(new b(), "MemoryApi-start");
    }
}
