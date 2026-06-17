package com.bytedance.praisedialoglib.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import e.b.k.c.f;
import e.b.k.c.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private e.b.k.c.e a;
    private e.b.k.c.a b;

    /* renamed from: c, reason: collision with root package name */
    private g f5524c;

    /* renamed from: d, reason: collision with root package name */
    private f f5525d;

    /* renamed from: e, reason: collision with root package name */
    private e.b.k.c.d f5526e;

    /* renamed from: f, reason: collision with root package name */
    private e.b.k.c.b f5527f;

    /* renamed from: g, reason: collision with root package name */
    private String f5528g = "";
    private String h = "";
    private String i = "";
    private String j = "";
    private e.b.k.b.b k;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {
        private static a a = new a(null);
    }

    a(C0283a c0283a) {
    }

    public static a j() {
        return b.a;
    }

    public String A() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.l())) {
            return null;
        }
        return this.f5524c.l();
    }

    public int B() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.k();
        }
        return -1;
    }

    public Activity C() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.b();
        }
        return null;
    }

    public void D(Context context) {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            aVar.c(context, this.h);
        }
    }

    public boolean E() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.d();
        }
        return false;
    }

    public void F(e.b.k.c.c cVar) {
        if (cVar != null) {
            this.a = cVar.c();
            this.b = cVar.f();
            this.f5524c = cVar.b();
            this.f5526e = cVar.d();
            this.f5527f = cVar.e();
            this.f5525d = cVar.a();
        }
    }

    public boolean G() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.g();
        }
        return false;
    }

    public void H(String str, JSONObject jSONObject) {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }

    public void I(JSONObject jSONObject) {
        Log.d("PraiseDialogCfgManager", "appData is " + jSONObject);
        this.f5528g = jSONObject.optString("app_market_order", "");
        jSONObject.optInt("market_feedback_dialog_enable", 0);
        this.h = jSONObject.optString("market_feedback_url", "");
        this.i = jSONObject.optString("guide_style_1_market_list", "");
        this.j = jSONObject.optString("guide_style_2_market_list", "");
        jSONObject.optString("guide_style_3_market_list", "");
    }

    public void J(e.b.k.b.b bVar) {
        this.k = bVar;
    }

    public void K(Context context, Intent intent) {
        f fVar = this.f5525d;
        if (fVar != null) {
            fVar.b(context, intent);
        } else {
            context.startActivity(intent);
        }
    }

    public void L(Activity activity, Intent intent) {
        f fVar = this.f5525d;
        if (fVar != null) {
            fVar.a(activity, intent, 100);
        } else {
            activity.startActivityForResult(intent, 100);
        }
    }

    public String a(int i, String str, Map<String, String> map) throws Exception {
        e.b.k.c.e eVar = this.a;
        if (eVar != null) {
            return eVar.a(i, str, map);
        }
        return null;
    }

    public void b(Runnable runnable) {
        e.b.k.c.b bVar = this.f5527f;
        if (bVar != null) {
            bVar.execute(runnable);
        } else {
            e.b.k.a.c.a(runnable);
        }
    }

    public String c() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.getAppId();
        }
        return null;
    }

    public int d() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.d();
        }
        return -1;
    }

    public ArrayList<String> e() {
        if (TextUtils.isEmpty(this.i)) {
            Log.d("PraiseDialogCfgManager", "initMarketOrder is called, but mMarketOrder is empty");
            return null;
        }
        String[] split = this.i.split("\\|");
        if (split.length <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, split);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public ArrayList<String> f() {
        if (TextUtils.isEmpty(this.j)) {
            Log.d("PraiseDialogCfgManager", "initMarketOrder is called, but mMarketOrder is empty");
            return null;
        }
        String[] split = this.j.split("\\|");
        if (split.length <= 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, split);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public String g() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.f();
        }
        return null;
    }

    public String h() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.e();
        }
        return null;
    }

    public e.b.k.b.b i() {
        return this.k;
    }

    public String k() {
        return this.f5528g;
    }

    public int l() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.q();
        }
        return -1;
    }

    public int m() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.p();
        }
        return -1;
    }

    public String n() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.g())) {
            return null;
        }
        return this.f5524c.g();
    }

    public int o() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.f();
        }
        return -1;
    }

    public int p() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.c();
        }
        return -1;
    }

    public String q() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.m())) {
            return null;
        }
        return this.f5524c.m();
    }

    public String r() {
        e.b.k.c.a aVar = this.b;
        if (aVar != null) {
            return aVar.getPackageName();
        }
        return null;
    }

    public String s() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.i())) {
            return null;
        }
        return this.f5524c.i();
    }

    public int t() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.b();
        }
        return -1;
    }

    public int u() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.h();
        }
        return -1;
    }

    public String v() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.j())) {
            return null;
        }
        return this.f5524c.j();
    }

    public String w() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.n())) {
            return null;
        }
        return this.f5524c.n();
    }

    public String x() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.e())) {
            return null;
        }
        return this.f5524c.e();
    }

    public int y() {
        g gVar = this.f5524c;
        if (gVar != null) {
            return gVar.o();
        }
        return -1;
    }

    public String z() {
        g gVar = this.f5524c;
        if (gVar == null || TextUtils.isEmpty(gVar.a())) {
            return null;
        }
        return this.f5524c.a();
    }
}
