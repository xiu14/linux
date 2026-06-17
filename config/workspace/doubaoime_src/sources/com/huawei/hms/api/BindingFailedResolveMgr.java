package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class BindingFailedResolveMgr {
    static final BindingFailedResolveMgr b = new BindingFailedResolveMgr();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7210c = new Object();
    List<Activity> a = new ArrayList(1);

    BindingFailedResolveMgr() {
    }

    void a(Activity activity) {
        synchronized (f7210c) {
            for (Activity activity2 : this.a) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.a.add(activity);
        }
    }

    void b(Activity activity) {
        synchronized (f7210c) {
            this.a.remove(activity);
        }
    }
}
