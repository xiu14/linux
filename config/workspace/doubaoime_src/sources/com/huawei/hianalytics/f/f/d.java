package com.huawei.hianalytics.f.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;

/* loaded from: classes2.dex */
public class d implements g {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7092c;

    /* renamed from: d, reason: collision with root package name */
    private long f7093d;

    /* renamed from: e, reason: collision with root package name */
    private String f7094e;

    /* renamed from: f, reason: collision with root package name */
    private Context f7095f;

    /* renamed from: g, reason: collision with root package name */
    private String f7096g;
    private Boolean h;

    public d(Context context, String str, int i, String str2, String str3, long j) {
        String str4;
        this.f7092c = "oper";
        this.f7095f = context;
        this.f7094e = str;
        this.a = str2;
        this.b = str3;
        if (i == 1) {
            str4 = "maint";
        } else if (i == 2) {
            str4 = "preins";
        } else {
            if (i != 3) {
                this.f7092c = "oper";
                if (com.huawei.hianalytics.a.a.e(str, "oper")) {
                    com.huawei.hianalytics.f.e.b a = com.huawei.hianalytics.f.e.a.a().a(str, j);
                    this.f7096g = a.a();
                    this.h = Boolean.valueOf(a.b());
                }
                this.f7093d = j;
            }
            str4 = "diffprivacy";
        }
        this.f7092c = str4;
        this.f7093d = j;
    }

    public d(Context context, String str, String str2, String str3, long j) {
        this.f7092c = "oper";
        this.f7095f = context;
        this.f7094e = str;
        this.a = str2;
        this.b = str3;
        this.f7092c = "oper";
        this.f7093d = j;
        if (com.huawei.hianalytics.a.a.e(str, "oper")) {
            com.huawei.hianalytics.f.e.b a = com.huawei.hianalytics.f.e.a.a().a(str, j);
            this.f7096g = a.a();
            this.h = Boolean.valueOf(a.b());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String sb;
        int l = com.huawei.hianalytics.a.b.l();
        int h = com.huawei.hianalytics.a.c.h(this.f7094e, this.f7092c);
        if (com.huawei.hianalytics.f.g.g.a(this.f7095f, "stat_v2_1", l * 1048576)) {
            com.huawei.hianalytics.g.b.b("HiAnalytics/event", "stat sp file reach max limited size, discard new event");
            h.a().a("", "");
            return;
        }
        SharedPreferences d2 = com.huawei.hianalytics.f.g.g.d(this.f7095f, "stat_v2_1");
        if (d2 == null) {
            com.huawei.hianalytics.g.b.c("EventRecordTask", "event sp is null");
            return;
        }
        com.huawei.hianalytics.f.b.e eVar = new com.huawei.hianalytics.f.b.e();
        eVar.d(this.a);
        eVar.f(com.huawei.hianalytics.f.g.c.b(this.b, this.f7095f));
        eVar.g(this.f7094e);
        eVar.e(this.f7092c);
        eVar.c(String.valueOf(this.f7093d));
        eVar.a(this.f7096g);
        if (this.h == null) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.h);
            sb = sb2.toString();
        }
        eVar.b(sb);
        long a = eVar.a(d2);
        if (a > h * DownloadConstants.KB) {
            com.huawei.hianalytics.g.b.b("EventRecordTask", "begin autoReport..eventLength: " + a);
            h.a().a(this.f7094e, this.f7092c);
        }
    }
}
