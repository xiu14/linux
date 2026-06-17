package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class c {
    private static final String i = "c";
    private static final ExecutorService j = ExecutorsUtils.newSingleThreadExecutor("GrsInit");
    private static long k = 0;
    private GrsBaseInfo a;
    private Context b;

    /* renamed from: c, reason: collision with root package name */
    private g f7275c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f7276d;

    /* renamed from: e, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f7277e;

    /* renamed from: f, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f7278f;

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.a f7279g;
    private FutureTask<Boolean> h;

    class a implements Callable<Boolean> {
        final /* synthetic */ Context a;
        final /* synthetic */ GrsBaseInfo b;

        /* renamed from: com.huawei.hms.framework.network.grs.c$a$a, reason: collision with other inner class name */
        class RunnableC0352a implements Runnable {
            final /* synthetic */ com.huawei.hms.framework.network.grs.f.b a;
            final /* synthetic */ com.huawei.hms.framework.network.grs.e.c b;

            RunnableC0352a(com.huawei.hms.framework.network.grs.f.b bVar, com.huawei.hms.framework.network.grs.e.c cVar) {
                this.a = bVar;
                this.b = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.a.a(a.this.a.getPackageName(), this.b);
            }
        }

        a(Context context, GrsBaseInfo grsBaseInfo) {
            this.a = context;
            this.b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            c.this.f7275c = new g();
            c.this.f7277e = new com.huawei.hms.framework.network.grs.e.c(this.a, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_conf_");
            c.this.f7278f = new com.huawei.hms.framework.network.grs.e.c(this.a, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_services_");
            c cVar = c.this;
            cVar.f7276d = new com.huawei.hms.framework.network.grs.e.a(cVar.f7277e, c.this.f7278f, c.this.f7275c);
            c cVar2 = c.this;
            cVar2.f7279g = new com.huawei.hms.framework.network.grs.a(cVar2.a, c.this.f7276d, c.this.f7275c, c.this.f7278f);
            if (com.huawei.hms.framework.network.grs.f.b.a(this.a.getPackageName()) == null) {
                com.huawei.hms.framework.network.grs.e.c cVar3 = new com.huawei.hms.framework.network.grs.e.c(this.a, GrsApp.getInstance().getBrand(BundleUtil.UNDERLINE_TAG) + "share_pre_grs_local_conf_");
                String a = cVar3.a(this.a.getPackageName() + "#localConfig", "");
                if (TextUtils.isEmpty(a) || !new com.huawei.hms.framework.network.grs.f.b().a(this.a, a)) {
                    c.j.execute(new RunnableC0352a(new com.huawei.hms.framework.network.grs.f.b(this.a, true), cVar3));
                }
            }
            String c2 = new com.huawei.hms.framework.network.grs.g.j.c(this.b, this.a).c();
            Logger.v(c.i, "scan serviceSet is: " + c2);
            String a2 = c.this.f7278f.a("services", "");
            String a3 = h.a(a2, c2);
            if (!TextUtils.isEmpty(a3)) {
                c.this.f7278f.b("services", a3);
                String str = c.i;
                StringBuilder M = e.a.a.a.a.M("postList is:");
                M.append(StringUtils.anonymizeMessage(a3));
                Logger.i(str, M.toString());
                String str2 = c.i;
                StringBuilder M2 = e.a.a.a.a.M("currentServices:");
                M2.append(StringUtils.anonymizeMessage(a2));
                Logger.d(str2, M2.toString());
                if (!a3.equals(a2)) {
                    c.this.f7275c.a(c.this.a.getGrsParasKey(true, true, this.a));
                    c.this.f7275c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.b, this.a), null, null, c.this.f7278f, c.this.a.getQueryTimeout());
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - c.k;
            if (c.k == 0 || TimeUnit.MILLISECONDS.toHours(elapsedRealtime) > 24) {
                Logger.i(c.i, "Try to clear unUsed sp data.");
                long unused = c.k = SystemClock.elapsedRealtime();
                c cVar4 = c.this;
                cVar4.a(cVar4.f7277e.a());
            }
            c.this.f7276d.b(this.b, this.a);
            return Boolean.TRUE;
        }
    }

    c(Context context, GrsBaseInfo grsBaseInfo) {
        this.h = null;
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.b, grsBaseInfo2));
        this.h = futureTask;
        j.execute(futureTask);
        Logger.i(i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    c(GrsBaseInfo grsBaseInfo) {
        this.h = null;
        a(grsBaseInfo);
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.a = grsBaseInfo.m12clone();
        } catch (CloneNotSupportedException e2) {
            Logger.w(i, "GrsClient catch CloneNotSupportedException", e2);
            this.a = grsBaseInfo.copy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(i, "sp's content is empty.");
            return;
        }
        Set<String> keySet = map.keySet();
        for (String str : keySet) {
            if (str.endsWith(this.b.getPackageName() + CrashHianalyticsData.TIME)) {
                String a2 = this.f7277e.a(str, "");
                long j2 = 0;
                if (!TextUtils.isEmpty(a2) && a2.matches("\\d+")) {
                    try {
                        j2 = Long.parseLong(a2);
                    } catch (NumberFormatException e2) {
                        Logger.w(i, "convert expire time from String to Long catch NumberFormatException.", e2);
                    }
                }
                String substring = str.substring(0, str.length() - 4);
                String s = e.a.a.a.a.s(substring, "ETag");
                if (!b(j2) || !keySet.contains(substring) || !keySet.contains(s)) {
                    Logger.i(i, "init interface auto clear some invalid sp's data: " + str);
                    this.f7277e.a(substring);
                    this.f7277e.a(str);
                    this.f7277e.a(s);
                }
            }
        }
    }

    private boolean b(long j2) {
        return System.currentTimeMillis() - j2 <= 604800000;
    }

    private boolean f() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e2) {
            e = e2;
            str = i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e3) {
            e = e3;
            str = i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(i, "init compute task timed out");
            return false;
        } catch (Exception e4) {
            e = e4;
            str = i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    String a(String str, String str2, int i2) {
        if (this.a == null || str == null || str2 == null) {
            Logger.w(i, "invalid para!");
            return null;
        }
        if (f()) {
            return this.f7279g.a(str, str2, this.b, i2);
        }
        return null;
    }

    Map<String, String> a(String str, int i2) {
        if (this.a != null && str != null) {
            return f() ? this.f7279g.a(str, this.b, i2) : new HashMap();
        }
        Logger.w(i, "invalid para!");
        return new HashMap();
    }

    void a() {
        if (f()) {
            String grsParasKey = this.a.getGrsParasKey(true, true, this.b);
            this.f7277e.a(grsParasKey);
            this.f7277e.a(grsParasKey + CrashHianalyticsData.TIME);
            this.f7277e.a(grsParasKey + "ETag");
            this.f7275c.a(grsParasKey);
        }
    }

    void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i2) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (f()) {
            this.f7279g.a(str, iQueryUrlsCallBack, this.b, i2);
        } else {
            Logger.i(i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i2) {
        if (iQueryUrlCallBack == null) {
            Logger.w(i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (f()) {
            this.f7279g.a(str, str2, iQueryUrlCallBack, this.b, i2);
        } else {
            Logger.i(i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && (obj instanceof c)) {
            return this.a.compare(((c) obj).a);
        }
        return false;
    }

    boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!f() || (grsBaseInfo = this.a) == null || (context = this.b) == null) {
            return false;
        }
        this.f7276d.a(grsBaseInfo, context);
        return true;
    }
}
