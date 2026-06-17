package com.bytedance.apm.v;

import android.text.TextUtils;
import com.bytedance.apm.g;
import com.bytedance.apm.n;
import com.bytedance.apm.v.c;
import com.bytedance.apm.y.d;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class a<T extends c> implements com.bytedance.services.slardar.config.a {

    /* renamed from: d, reason: collision with root package name */
    private static int f3592d = 1000;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f3593e;
    private volatile boolean b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f3594c = false;
    private final LinkedList<T> a = new LinkedList<>();

    /* renamed from: com.bytedance.apm.v.a$a, reason: collision with other inner class name */
    class RunnableC0130a implements Runnable {
        final /* synthetic */ c a;

        RunnableC0130a(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f(this.a);
        }
    }

    protected a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(T t) {
        if (c(t)) {
            g(t);
            if (this.b) {
                e(t);
                return;
            }
            if (t == null) {
                return;
            }
            synchronized (this.a) {
                if (this.a.size() > f3592d) {
                    T poll = this.a.poll();
                    if (f3593e && !this.f3594c) {
                        n.e().c("apm_cache_buffer_full");
                        this.f3594c = true;
                    }
                    try {
                        com.bytedance.apm.y.a.b("apm_debug", "apm_cache_buffer_full:" + poll.c().toString());
                    } catch (Exception unused) {
                    }
                }
                this.a.add(t);
            }
        }
    }

    public static void i(int i) {
        f3592d = i;
    }

    public static void j(boolean z) {
        f3593e = z;
    }

    protected boolean c(T t) {
        return true;
    }

    public final void d(T t) {
        if (com.bytedance.apm.F.b.e().f()) {
            f(t);
        } else {
            com.bytedance.apm.F.b.e().h(new RunnableC0130a(t));
        }
    }

    protected abstract void e(T t);

    protected void g(T t) {
    }

    protected void h(String str, String str2, JSONObject jSONObject, boolean z, boolean z2) {
        JSONArray optJSONArray;
        if (g.B()) {
            d.b("BaseDataPipeline", "type:" + str + " isSaveUnSampleLog:" + z2 + "isSampled:" + z + " log:" + jSONObject);
        }
        if (z) {
            JSONObject r = com.bytedance.android.input.k.b.a.r(jSONObject);
            if (TextUtils.equals(str, "tracing")) {
                JSONArray jSONArray = null;
                e.b.n.a.b bVar = new e.b.n.a.b(r, null, false, str2);
                if ("batch_tracing".equals(bVar.a())) {
                    JSONObject c2 = bVar.c();
                    if (c2 != null && (optJSONArray = c2.optJSONArray("wrapper_array_data")) != null) {
                        jSONArray = optJSONArray;
                    }
                    e.b.b.d.a.i(new e.b.b.d.c.d(jSONArray));
                } else {
                    e.b.b.d.a.i(new e.b.b.d.c.d(bVar.c()));
                }
            } else if (TextUtils.equals(str, "common_log")) {
                e.b.b.d.a.h(new e.b.b.d.c.c(str2, r));
            } else {
                e.b.b.d.a.h(new e.b.b.d.c.c(str, r));
            }
        } else {
            if (g.B()) {
                com.bytedance.apm.doctor.a.b(str, jSONObject, false);
            }
            if (z2 && com.bytedance.apm.y.a.c()) {
                try {
                    com.bytedance.apm.y.a.d(str, jSONObject.toString());
                } catch (Exception e2) {
                    com.bytedance.services.apm.api.a.e(e2, "apm_unsampled_log_error");
                }
            }
        }
        com.bytedance.apm.A.a.b().c(str, str2, jSONObject);
        if (TextUtils.equals(str, "ui_action")) {
            com.bytedance.apm.v.e.a.b().a(jSONObject);
        }
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onReady() {
        this.b = true;
        com.bytedance.apm.F.b.e().h(new b(this));
    }

    @Override // com.bytedance.services.slardar.config.a
    public void onRefresh(JSONObject jSONObject, boolean z) {
    }
}
