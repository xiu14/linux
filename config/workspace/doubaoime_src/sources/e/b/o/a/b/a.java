package e.b.o.a.b;

import android.content.Context;
import android.util.Log;
import e.b.o.a.a.b;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements e.b.o.a.a.b {

    /* renamed from: g, reason: collision with root package name */
    private static volatile a f9704g;
    private Context a;
    private e.b.o.a.b.d.a b;

    /* renamed from: c, reason: collision with root package name */
    private e.b.o.a.b.f.a f9705c;

    /* renamed from: d, reason: collision with root package name */
    private e.b.o.a.b.e.b f9706d;

    /* renamed from: e, reason: collision with root package name */
    private e.b.o.a.b.c.a f9707e;

    /* renamed from: f, reason: collision with root package name */
    private e.b.o.a.a.a f9708f;

    private a(Context context) {
        e.b.o.a.a.a aVar = e.b.o.a.a.a.b;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f9708f = aVar == null ? e.b.o.a.a.a.b : aVar;
        this.b = new e.b.o.a.b.d.a(applicationContext, this);
        this.f9705c = new e.b.o.a.b.f.a(this.a, this);
        this.f9706d = new e.b.o.a.b.e.b(this.a, this);
        this.f9707e = new e.b.o.a.b.c.a(this);
        String str = "new assist obj:" + this + " config : " + aVar;
        int i = e.b.o.a.d.b.b;
        Log.i("watson_assist", str);
    }

    public static a e(Context context) {
        if (f9704g == null) {
            synchronized (a.class) {
                if (f9704g == null) {
                    f9704g = new a(context);
                }
            }
        }
        return f9704g;
    }

    public int a() {
        return this.b.a();
    }

    public float b() {
        return this.b.b();
    }

    public e.b.o.a.a.a c() {
        return this.f9708f;
    }

    public b.a d() {
        b.a aVar = new b.a();
        aVar.a = e.b.o.a.d.a.c();
        aVar.b = this.b.c();
        aVar.f9700c = this.b.a();
        aVar.f9701d = this.f9705c.a();
        aVar.f9702e = this.b.d();
        aVar.f9703f = this.b.b();
        this.f9706d.a();
        return aVar;
    }

    public b.C0445b f() {
        this.f9706d.b();
        return null;
    }

    public boolean g(float f2) {
        return this.f9707e.a(f2);
    }

    public boolean h() {
        return this.f9707e.b();
    }

    public int i() {
        return this.b.d();
    }

    public void j() {
        this.f9706d.c();
    }

    public e.b.o.a.a.b k() {
        e.b.o.a.d.b.a("start, obj:" + this);
        Objects.requireNonNull(this.b);
        Objects.requireNonNull(this.f9705c);
        this.f9706d.d();
        return this;
    }
}
