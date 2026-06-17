package com.huawei.hianalytics.log.g;

import android.os.Handler;
import com.huawei.hianalytics.log.b.a;
import com.huawei.hianalytics.log.f.a;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class b implements e {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7141c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f7142d;

    public b(String str, Handler handler, String str2) {
        this.a = str;
        this.f7142d = handler;
        StringBuilder M = e.a.a.a.a.M(str2);
        M.append(a.C0347a.b);
        this.b = M.toString();
        StringBuilder M2 = e.a.a.a.a.M(str2);
        M2.append(a.C0347a.f7126c);
        this.f7141c = M2.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.huawei.hianalytics.log.e.f.a(this.f7141c)) {
            com.huawei.hianalytics.g.b.d("CreateFirstZip", "file create fail");
            return;
        }
        com.huawei.hianalytics.log.f.b bVar = new com.huawei.hianalytics.log.f.b();
        com.huawei.hianalytics.log.f.a.a(this.b, com.huawei.hianalytics.a.d.f() + 1);
        if (!bVar.a(this.b, this.a, this.f7141c)) {
            com.huawei.hianalytics.g.b.d("CreateFirstZip", "log create zip fail");
        }
        File[] a = com.huawei.hianalytics.log.f.a.a(this.f7141c);
        if (a == null) {
            com.huawei.hianalytics.g.b.b("CreateFirstZip", "get zipFiles(): zipFiles is null");
            return;
        }
        int length = a.length;
        if (length == 0) {
            com.huawei.hianalytics.g.b.c("CreateFirstZip", "There is no file in zips, do not carry out the report");
            return;
        }
        if (length > com.huawei.hianalytics.a.d.g() && com.huawei.hianalytics.log.e.f.b(a) > com.huawei.hianalytics.a.d.g()) {
            File[] a2 = com.huawei.hianalytics.log.f.a.a(this.f7141c);
            Arrays.sort(a2, new a.C0348a());
            com.huawei.hianalytics.log.f.a.a(a2, com.huawei.hianalytics.a.d.g());
        }
        this.f7142d.sendEmptyMessageDelayed(6, 2000L);
    }
}
