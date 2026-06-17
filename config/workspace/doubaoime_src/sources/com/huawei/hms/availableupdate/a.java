package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7221c = new a();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f7222d = new Object();
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final List<Activity> b = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f7222d) {
            for (Activity activity2 : this.b) {
                if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                    activity2.finish();
                }
            }
            this.b.add(activity);
        }
    }

    public void b(Activity activity) {
        synchronized (f7222d) {
            this.b.remove(activity);
        }
    }

    public void a(boolean z) {
        this.a.set(z);
    }

    public AtomicBoolean a() {
        return this.a;
    }
}
