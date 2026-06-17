package com.bytedance.applog.D;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.applog.B.h;
import com.bytedance.applog.B.j;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b {

    /* renamed from: e, reason: collision with root package name */
    private static final List<String> f3742e = Collections.singletonList("BgSessionTaskModel");
    private final Context a;
    private final com.bytedance.applog.B.b b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.applog.x.c f3743c;

    /* renamed from: d, reason: collision with root package name */
    private final com.bytedance.applog.c f3744d;

    b(com.bytedance.applog.c cVar, com.bytedance.applog.B.b bVar, com.bytedance.applog.x.c cVar2) {
        this.b = bVar;
        this.f3743c = cVar2;
        this.f3744d = cVar;
        this.a = cVar.o();
        f.b().a(new a(this));
    }

    static e a(b bVar) {
        return e.b(bVar.a.getSharedPreferences(bVar.c(), 0).getString("key_task_session", ""));
    }

    private String c() {
        if (this.f3744d.C() != null) {
            return this.f3744d.C().j();
        }
        StringBuilder M = e.a.a.a.a.M("applog_task@");
        M.append(this.f3744d.k());
        return M.toString();
    }

    private void f(String str) {
        if (str == null) {
            str = "";
        }
        try {
            SharedPreferences.Editor edit = this.a.getSharedPreferences(c(), 0).edit();
            edit.putString("key_task_session", str);
            edit.apply();
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.f3744d.I().n(f3742e, "[Task] clear task session sp", new Object[0]);
        f("");
    }

    public void d(e eVar) {
        if (eVar == null) {
            return;
        }
        try {
            j jVar = new j();
            this.f3744d.c(jVar);
            jVar.b = eVar.i();
            jVar.f3732d = eVar.g();
            jVar.C = 1;
            if (eVar.k()) {
                jVar.B = eVar.e();
            }
            if (eVar.j()) {
                jVar.A = eVar.d();
            }
            jVar.w = eVar.c();
            jVar.x = eVar.f();
            jVar.z = Integer.valueOf(eVar.h());
            if (this.f3743c.k()) {
                JSONObject c2 = this.f3743c.c();
                com.bytedance.android.input.k.b.a.M0(c2);
                Objects.requireNonNull(this.f3744d);
                this.f3744d.I().n(f3742e, "[Task] save task session to db : {}", eVar);
                h hVar = new h();
                hVar.L(this.f3744d.k(), c2, null, jVar, null, new JSONArray[]{null, null, null}, new long[]{-1, -1, -1}, null, null, 9);
                this.b.G(hVar, true, null, null);
            }
        } catch (Throwable th) {
            this.f3744d.I().t(f3742e, "[Task] Save task session failed", th, new Object[0]);
        }
    }

    public void e(e eVar) {
        if (eVar == null) {
            return;
        }
        this.f3744d.I().n(f3742e, "[Task] saveTaskSessionToSp : {}", eVar);
        f(eVar.o());
    }
}
