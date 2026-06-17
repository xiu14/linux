package e.b.g.a.a.g;

import android.content.Context;
import e.b.g.a.b.a;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a implements e.b.g.a.a.g.b {
    e.b.g.a.b.a a;
    volatile long b;

    /* renamed from: c, reason: collision with root package name */
    boolean f9520c;

    /* renamed from: d, reason: collision with root package name */
    int f9521d;

    /* renamed from: e.b.g.a.a.g.a$a, reason: collision with other inner class name */
    class C0431a extends a.AbstractC0434a {
        final /* synthetic */ String a;

        C0431a(a aVar, String str) {
            this.a = str;
        }

        @Override // e.b.g.a.b.a.b
        public String a() {
            return e.a.a.a.a.J(new StringBuilder(), this.a, "sdk_monitor");
        }

        @Override // e.b.g.a.b.a.b
        public List<String> b() {
            return e.b.g.a.a.e.c.g(this.a, "sdk_monitor");
        }

        @Override // e.b.g.a.b.a.b
        public int c() {
            return e.b.g.a.a.e.c.d(this.a);
        }

        @Override // e.b.g.a.b.a.b
        public long d() {
            return e.b.g.a.a.e.c.c(this.a);
        }
    }

    class b implements a.c {
        final /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        @Override // e.b.g.a.b.a.c
        public boolean a() {
            return e.b.g.a.a.e.c.a(this.a);
        }

        @Override // e.b.g.a.b.a.c
        public long b() {
            return a.this.b;
        }

        @Override // e.b.g.a.b.a.c
        public boolean c() {
            return a.this.f9520c;
        }

        @Override // e.b.g.a.b.a.c
        public long d() {
            return e.b.g.a.a.e.c.h(this.a);
        }
    }

    class c extends e.b.g.a.b.a {
        final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, a.b bVar, a.c cVar, String str) {
            super(context, bVar, cVar);
            this.h = str;
        }

        @Override // e.b.g.a.b.a
        protected boolean f(String str, byte[] bArr) {
            int i;
            JSONObject jSONObject;
            if (d.a(this.h) != null) {
                e d2 = d.a(this.h).d(str, bArr);
                if (d2 == null || (i = d2.a) <= 0) {
                    a.this.f9520c = true;
                } else {
                    a.this.f9520c = false;
                    if (i == 200 && (jSONObject = d2.b) != null) {
                        if (jSONObject.optInt("is_crash", 0) == 1) {
                            a.this.b = 1800000L;
                            a.this.f9521d = 3;
                            return false;
                        }
                        if (d2.b.opt("message").equals("success")) {
                            a aVar = a.this;
                            aVar.f9521d = 0;
                            aVar.b = 0L;
                            return true;
                        }
                    }
                    int i2 = d2.a;
                    if (500 <= i2 && i2 <= 600) {
                        a aVar2 = a.this;
                        int i3 = aVar2.f9521d;
                        if (i3 == 0) {
                            aVar2.b = 300000L;
                            a.this.f9521d++;
                        } else if (i3 == 1) {
                            aVar2.b = com.heytap.mcssdk.constant.a.h;
                            a.this.f9521d++;
                        } else if (i3 == 2) {
                            aVar2.b = 1800000L;
                            a.this.f9521d++;
                        } else {
                            aVar2.b = 1800000L;
                            a.this.f9521d++;
                        }
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public a(Context context, String str) {
        this.a = new c(context.getApplicationContext(), new C0431a(this, str), new b(str), str);
    }

    @Override // e.b.g.a.a.g.b
    public boolean a(String str) {
        return this.a.a(str);
    }

    @Override // e.b.g.a.a.g.b
    public boolean b() {
        return this.b == 1800000;
    }

    public void c(String str) {
        this.a.h(null);
    }
}
