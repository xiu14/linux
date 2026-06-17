package com.bytedance.apm.A;

import com.bytedance.apm.g;
import e.b.b.n.g.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static volatile a b;
    CopyOnWriteArraySet<com.bytedance.apm.x.a> a = new CopyOnWriteArraySet<>();

    /* renamed from: com.bytedance.apm.A.a$a, reason: collision with other inner class name */
    class RunnableC0104a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ String b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONObject f3225c;

        RunnableC0104a(String str, String str2, JSONObject jSONObject) {
            this.a = str;
            this.b = str2;
            this.f3225c = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator<com.bytedance.apm.x.a> it2 = a.this.a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this.a, this.b, this.f3225c);
            }
        }
    }

    private a() {
    }

    public static a b() {
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    b = new a();
                }
            }
        }
        return b;
    }

    public void a(com.bytedance.apm.x.a aVar) {
        if (aVar != null) {
            try {
                this.a.add(aVar);
            } catch (Throwable unused) {
            }
        }
    }

    public void c(String str, String str2, JSONObject jSONObject) {
        if (g.B()) {
            StringBuilder M = e.a.a.a.a.M("logObserverList:");
            M.append(this.a.size());
            b.a("LogObserver", M.toString());
        }
        if (this.a.size() == 0) {
            return;
        }
        com.bytedance.apm.F.b.e().o(new RunnableC0104a(str, str2, jSONObject));
    }
}
