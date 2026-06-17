package com.bytedance.frameworks.baselib.network.e;

import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.b;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e extends b.AbstractC0248b {

    /* renamed from: d, reason: collision with root package name */
    private static volatile e f5070d;

    /* renamed from: c, reason: collision with root package name */
    public AtomicBoolean f5071c;

    public e(int i) {
        super(i);
        this.f5071c = new AtomicBoolean(false);
    }

    public static e f() {
        if (f5070d == null) {
            synchronized (e.class) {
                if (f5070d == null) {
                    f5070d = new e(30000);
                }
            }
        }
        return f5070d;
    }

    @Override // com.bytedance.frameworks.baselib.network.b.AbstractC0248b
    public void c() {
        this.f5071c.set(true);
        if (Logger.debug()) {
            Logger.d("QueryFilterStateListener", "onEnterToBackground");
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.b.AbstractC0248b
    public void d() {
        this.f5071c.set(false);
        if (Logger.debug()) {
            Logger.d("QueryFilterStateListener", "onEnterToForeground");
        }
    }
}
