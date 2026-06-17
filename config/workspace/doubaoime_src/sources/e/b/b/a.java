package e.b.b;

import android.content.Context;
import android.util.Pair;
import com.bytedance.apm.i;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.util.e;
import com.bytedance.apm6.hub.k;
import com.bytedance.apm6.hub.y;
import com.bytedance.services.apm.api.IHttpService;
import e.b.b.e.a.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static List<com.bytedance.services.slardar.config.b> a;

    /* renamed from: e.b.b.a$a, reason: collision with other inner class name */
    static class C0419a extends y {
        final /* synthetic */ Context a;

        /* renamed from: e.b.b.a$a$a, reason: collision with other inner class name */
        class C0420a implements e.b.b.m.e.a {
            C0420a(C0419a c0419a) {
            }

            @Override // e.b.b.m.e.a
            public String a(String str, List<Pair<String, String>> list) {
                return e.b.f.a.a.a.g(str, list);
            }
        }

        /* renamed from: e.b.b.a$a$b */
        class b implements g {

            /* renamed from: e.b.b.a$a$b$a, reason: collision with other inner class name */
            class RunnableC0421a implements Runnable {
                final /* synthetic */ JSONObject a;

                RunnableC0421a(b bVar, JSONObject jSONObject) {
                    this.a = jSONObject;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.a(this.a);
                }
            }

            b(C0419a c0419a) {
            }

            @Override // e.b.b.e.a.g
            public void a(JSONObject jSONObject) {
                if (com.bytedance.apm.g.F()) {
                    com.bytedance.apm.F.b.e().h(new RunnableC0421a(this, jSONObject));
                }
            }
        }

        /* renamed from: e.b.b.a$a$c */
        class c implements e.b.b.m.d.a {
            c(C0419a c0419a) {
            }

            @Override // e.b.b.m.d.a
            public JSONObject a() {
                JSONObject jSONObject = new JSONObject();
                e.g().a(jSONObject, false);
                return jSONObject;
            }
        }

        C0419a(Context context) {
            this.a = context;
        }

        @Override // com.bytedance.apm6.hub.y
        protected e.b.b.m.d.a a() {
            return new c(this);
        }

        @Override // com.bytedance.apm6.hub.y
        protected e.b.b.m.e.a b() {
            return new C0420a(this);
        }

        @Override // com.bytedance.apm6.hub.y
        protected com.bytedance.services.apm.api.e c() {
            return ApmDelegate.i().h();
        }

        @Override // com.bytedance.apm6.hub.y
        protected IHttpService d() {
            return com.bytedance.apm.g.l();
        }

        @Override // com.bytedance.apm6.hub.y
        protected e.b.b.j.a e() {
            return new e.b.b.b();
        }

        @Override // com.bytedance.apm6.hub.y
        protected e.b.b.j.g.b f() {
            return new e.b.b.c();
        }

        @Override // com.bytedance.apm6.hub.y
        protected g g() {
            return new b(this);
        }

        @Override // com.bytedance.apm6.hub.y
        public int h() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.a();
            }
            return 0;
        }

        @Override // com.bytedance.apm6.hub.y
        public String i() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.b();
            }
            return null;
        }

        @Override // com.bytedance.apm6.hub.y
        public String j() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.c();
            }
            return null;
        }

        @Override // com.bytedance.apm6.hub.y
        public Context k() {
            return this.a;
        }

        @Override // com.bytedance.apm6.hub.y
        public String l() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.d();
            }
            return null;
        }

        @Override // com.bytedance.apm6.hub.y
        public int m() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.e();
            }
            return 0;
        }

        @Override // com.bytedance.apm6.hub.y
        public JSONObject n() {
            JSONObject h;
            i v = com.bytedance.apm.g.v();
            if (v == null || (h = v.h()) == null) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("max_size_mb_today", h.optInt("max_size_mb_today", -1));
                return jSONObject;
            } catch (JSONException unused) {
                return null;
            }
        }

        @Override // com.bytedance.apm6.hub.y
        public Map<String, String> o() {
            return com.bytedance.apm.g.w();
        }

        @Override // com.bytedance.apm6.hub.y
        public String p() {
            return com.bytedance.apm.g.i();
        }

        @Override // com.bytedance.apm6.hub.y
        public String q() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.g();
            }
            return null;
        }

        @Override // com.bytedance.apm6.hub.y
        public String r() {
            if (com.bytedance.apm.g.v() == null || com.bytedance.apm.g.j() == null) {
                return null;
            }
            return com.bytedance.apm.g.j().getSessionId();
        }

        @Override // com.bytedance.apm6.hub.y
        public JSONObject s() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.h();
            }
            return null;
        }

        @Override // com.bytedance.apm6.hub.y
        public long t() {
            if (com.bytedance.apm.g.v() == null || com.bytedance.apm.g.j() == null) {
                return 0L;
            }
            return com.bytedance.apm.g.j().getUid();
        }

        @Override // com.bytedance.apm6.hub.y
        public int u() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.i();
            }
            return 0;
        }

        @Override // com.bytedance.apm6.hub.y
        public int v() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.i();
            }
            return 0;
        }

        @Override // com.bytedance.apm6.hub.y
        public String w() {
            i v = com.bytedance.apm.g.v();
            if (v != null) {
                return v.j();
            }
            return null;
        }
    }

    public static void a(JSONObject jSONObject) {
        List<com.bytedance.services.slardar.config.b> list = a;
        if (list != null) {
            Iterator<com.bytedance.services.slardar.config.b> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().a(jSONObject);
            }
        }
    }

    public static Runnable b(Context context) {
        return k.a(new C0419a(context));
    }

    public static void c(com.bytedance.services.slardar.config.b bVar) {
        if (bVar == null) {
            return;
        }
        if (a == null) {
            a = new CopyOnWriteArrayList();
        }
        if (a.contains(bVar)) {
            return;
        }
        a.add(bVar);
    }

    public static void d(com.bytedance.services.slardar.config.b bVar) {
        List<com.bytedance.services.slardar.config.b> list;
        if (bVar == null || (list = a) == null) {
            return;
        }
        list.remove(bVar);
    }
}
