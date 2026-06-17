package com.vivo.push.restructure.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.vivo.push.PushConfig;
import com.vivo.push.util.aa;
import com.vivo.push.util.g;
import com.vivo.push.util.t;
import com.vivo.push.util.z;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class d implements a {
    private static Map<String, c> a = new ConcurrentHashMap();
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private z f8876c;

    /* renamed from: d, reason: collision with root package name */
    private volatile PushConfig f8877d;

    public d(z zVar) {
        this.f8876c = zVar;
    }

    @Override // com.vivo.push.restructure.b.a
    public final String a(Context context, String str) {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            t.a("PushRelyImpl", "getReceiverClassName() params error, context = " + context + ", action = " + str);
            return "";
        }
        String packageName = context.getPackageName();
        String a2 = a(context, packageName, str);
        this.b = a2;
        if (TextUtils.isEmpty(a2)) {
            t.d("PushRelyImpl", " reflectReceiver error: receiver for: " + str + " not found, package: " + packageName);
        }
        return this.b;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void b() {
        a("");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String c() {
        c cVar = a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar != null) {
            String b = cVar.b();
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
        }
        String d2 = this.f8876c.d();
        if (!TextUtils.isEmpty(d2)) {
            if (cVar == null) {
                cVar = new c();
            }
            cVar.b(d2);
            a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
        }
        return d2;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void d() {
        b("");
    }

    @Override // com.vivo.push.restructure.b.a
    public final void e() {
        this.f8876c.b();
        a.clear();
    }

    @Override // com.vivo.push.restructure.b.a
    public final String f() {
        return this.f8876c.b("APP_TOKEN", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final String g() {
        return this.f8876c.b("APP_TAGS", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void h() {
        this.f8876c.c("APP_TAGS");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String i() {
        return this.f8876c.b("APP_ALIAS", (String) null);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void j() {
        this.f8876c.c("APP_ALIAS");
    }

    @Override // com.vivo.push.restructure.b.a
    public final String k() {
        com.vivo.push.model.a a2 = aa.a(com.vivo.push.restructure.a.a().b(), com.vivo.push.restructure.a.a().f());
        if (a2 == null || a2.c()) {
            return null;
        }
        return a2.a();
    }

    @Override // com.vivo.push.restructure.b.a
    public final int l() {
        return 31;
    }

    @Override // com.vivo.push.restructure.b.a
    public final PushConfig m() {
        if (this.f8877d != null) {
            return this.f8877d;
        }
        int b = this.f8876c.b("PUSH_CLIENT_CONFIG", 1);
        return new PushConfig.Builder().agreePrivacyStatement((b & 1) != 0).openMultiUserMode((b & 2) != 0).build();
    }

    @Override // com.vivo.push.restructure.b.a
    public final void b(String str) {
        this.f8876c.a("APP_APIKEY", str);
        c cVar = a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar == null) {
            cVar = new c();
        }
        cVar.b(str);
        a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void d(String str) {
        this.f8876c.a("APP_TAGS", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void e(String str) {
        this.f8876c.a("APP_ALIAS", str);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void c(String str) {
        this.f8876c.a("APP_TOKEN", str);
    }

    private static String a(Context context, String str, String str2) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 64)) == null || queryBroadcastReceivers.size() <= 0) {
                return null;
            }
            return queryBroadcastReceivers.get(0).activityInfo.name;
        } catch (Exception e2) {
            e.a.a.a.a.h0(e2, new StringBuilder("error  "), "PushRelyImpl");
            return null;
        }
    }

    @Override // com.vivo.push.restructure.b.a
    public final String a() {
        c cVar = a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar != null) {
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
        }
        String c2 = this.f8876c.c();
        if (!TextUtils.isEmpty(c2)) {
            if (cVar == null) {
                cVar = new c();
            }
            cVar.a(c2);
            a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
        }
        return c2;
    }

    @Override // com.vivo.push.restructure.b.a
    public final void a(String str) {
        this.f8876c.a("APP_APPID", str);
        c cVar = a.get(com.vivo.push.restructure.a.a().b().getPackageName());
        if (cVar == null) {
            cVar = new c();
        }
        cVar.a(str);
        a.put(com.vivo.push.restructure.a.a().b().getPackageName(), cVar);
    }

    @Override // com.vivo.push.restructure.b.a
    public final void a(PushConfig pushConfig) {
        if (pushConfig == null) {
            return;
        }
        this.f8877d = pushConfig;
        Context b = com.vivo.push.restructure.a.a().b();
        this.f8876c.a("PUSH_CLIENT_CONFIG", (pushConfig.isAgreePrivacyStatement() ? 1 : 0) | (pushConfig.isOpenMultiUser() ? 2 : 0));
        g.a().execute(new e(this, b, pushConfig));
    }
}
