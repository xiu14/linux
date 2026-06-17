package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b {
    public static final b b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7223c = new Object();
    private final List<Activity> a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f7223c) {
            for (Activity activity2 : this.a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.a.add(activity);
        }
    }

    public void b(Activity activity) {
        synchronized (f7223c) {
            this.a.remove(activity);
        }
    }
}
