package com.huawei.hianalytics.log.g;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hianalytics.log.b.a;
import java.io.File;
import java.security.Key;

/* loaded from: classes2.dex */
public class g implements e {
    private Context a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7146c;

    /* renamed from: d, reason: collision with root package name */
    private String f7147d;

    /* renamed from: e, reason: collision with root package name */
    private String f7148e;

    public g(Context context, String str, String str2) {
        this.a = context;
        this.f7148e = str;
        StringBuilder M = e.a.a.a.a.M(str2);
        M.append(a.C0347a.f7126c);
        this.b = M.toString();
        StringBuilder M2 = e.a.a.a.a.M(str2);
        M2.append(a.C0347a.f7127d);
        this.f7146c = M2.toString();
        StringBuilder M3 = e.a.a.a.a.M(str2);
        M3.append(a.C0347a.a);
        this.f7147d = M3.toString();
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z;
        com.huawei.hianalytics.log.f.b bVar = new com.huawei.hianalytics.log.f.b();
        com.huawei.hianalytics.log.e.a.a(this.b);
        com.huawei.hianalytics.log.f.a.a(this.b, com.huawei.hianalytics.a.d.g());
        if (!com.huawei.hianalytics.log.e.f.a(this.f7146c)) {
            com.huawei.hianalytics.g.b.d("uploadTask", "create bigzip file fail");
            return;
        }
        String a = com.huawei.hianalytics.log.e.d.a(this.a);
        boolean z2 = false;
        if (TextUtils.isEmpty(a) || "2G".equals(a)) {
            com.huawei.hianalytics.g.b.b("HiAnalytics/logServer", "The network is bad.");
            z = false;
        } else {
            com.huawei.hianalytics.log.e.a.a(new File(this.f7146c));
            z = bVar.a(this.b, this.f7148e, this.f7147d);
        }
        if (z) {
            Key b = com.huawei.hianalytics.log.e.b.b();
            com.huawei.hianalytics.log.f.b bVar2 = new com.huawei.hianalytics.log.f.b();
            bVar2.a(this.f7147d + this.f7148e, this.f7146c + this.f7148e, b);
            File file = new File(this.f7146c);
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                if (listFiles.length != 1 || listFiles[0].length() >= 1887436.8d) {
                    com.huawei.hianalytics.g.b.c("uploadTask", "BigZip file size anomaly, delete files");
                    com.huawei.hianalytics.log.e.a.a(file);
                } else {
                    com.huawei.hianalytics.g.b.b("uploadTask", "File size validation through,can be reported");
                    z2 = true;
                }
            }
            if (!z2) {
                com.huawei.hianalytics.log.e.f.b(this.f7147d + this.f7148e);
                return;
            }
            boolean a2 = bVar.a(this.f7146c, com.huawei.hianalytics.log.e.b.a(b), this.a);
            com.huawei.hianalytics.log.e.a.a(new File(this.f7146c));
            if (a2) {
                com.huawei.hianalytics.log.e.f.b(this.f7147d + this.f7148e);
                return;
            }
            bVar2.a(this.b, this.f7147d + this.f7148e);
        }
    }
}
