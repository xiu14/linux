package com.huawei.hianalytics.abtesting.b;

import android.content.Context;
import com.huawei.hianalytics.f.g.c;
import com.huawei.hianalytics.util.e;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class a implements Runnable {
    private Context a;

    public a(Context context) {
        this.a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.huawei.hianalytics.g.b.b("ABTest/ReadCacheDataTask", "read cache task running");
        try {
            com.huawei.hianalytics.abtesting.a.b.a().a(c.a((String) e.b(e.a(this.a, "abtest"), "exp_data", ""), this.a));
        } catch (JSONException unused) {
            com.huawei.hianalytics.g.b.c("ABTest/ReadCacheDataTask", "experiment data error");
        }
        com.huawei.hianalytics.abtesting.a.b.a().a(true);
        com.huawei.hianalytics.abtesting.a.b.a().b(false);
    }
}
