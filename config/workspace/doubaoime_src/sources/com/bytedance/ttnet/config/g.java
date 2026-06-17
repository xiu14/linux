package com.bytedance.ttnet.config;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.network.http.cronet.TTNetThreadConfig;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class g implements k.c {
    private static volatile g m;
    private final boolean a;

    /* renamed from: g, reason: collision with root package name */
    private Keva f6160g;
    private String h;
    private Context k;
    private boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6156c = true;

    /* renamed from: d, reason: collision with root package name */
    private volatile int f6157d = -1;

    /* renamed from: e, reason: collision with root package name */
    private long f6158e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f6159f = 10800;
    private boolean i = false;
    private boolean j = false;
    private TTNetThreadConfig.ThreadStackInitReason l = TTNetThreadConfig.ThreadStackInitReason.TNC_DISABLED;

    private g(Context context) {
        KevaBuilder.getInstance().setContext(context);
        this.a = com.bytedance.frameworks.baselib.network.http.p.i.c(context);
        this.f6160g = Keva.getRepo("tt_stack_config", 1);
        this.k = context;
    }

    private String a(String str) {
        return e.a.a.a.a.K(new StringBuilder(), this.h, BundleUtil.UNDERLINE_TAG, str);
    }

    public static g c(Context context) {
        if (m == null) {
            synchronized (g.class) {
                if (m == null) {
                    m = new g(context);
                }
            }
        }
        return m;
    }

    public String b() {
        return this.l.toString();
    }

    public boolean d() {
        try {
            if (this.i) {
                this.l = TTNetThreadConfig.ThreadStackInitReason.CALLED_MULIT_TIMES;
                return false;
            }
            String a = com.bytedance.frameworks.baselib.network.http.p.i.a(this.k);
            this.h = a;
            if (TextUtils.isEmpty(a)) {
                this.l = TTNetThreadConfig.ThreadStackInitReason.PROCESS_NAME_NULL;
                return false;
            }
            this.i = true;
            this.b = this.f6160g.getBoolean("enable_stack_opt", false);
            this.f6156c = this.f6160g.getBoolean("enable_stack_opt_fallback_fix", true);
            this.f6159f = this.f6160g.getLong("stack_opt_fallback_fix_interval_s", 10800L);
            this.f6157d = this.f6160g.getInt(a("stack_opt_failures"), 0);
            this.f6158e = this.f6160g.getLong(a("stack_opt_failure_timestamp"), 0L);
            if (this.f6156c && this.f6157d > 0 && System.currentTimeMillis() - this.f6158e > TimeUnit.SECONDS.toMillis(this.f6159f)) {
                this.l = TTNetThreadConfig.ThreadStackInitReason.FALLBACK_FIX;
                this.f6157d = 0;
            }
            if (!this.b || this.f6157d != 0) {
                if (this.b) {
                    this.l = TTNetThreadConfig.ThreadStackInitReason.CRASH_HAPPENED;
                } else {
                    this.l = TTNetThreadConfig.ThreadStackInitReason.TNC_DISABLED;
                }
                return false;
            }
            this.f6160g.storeInt(a("stack_opt_failures"), this.f6157d + 1);
            this.f6160g.storeLong(a("stack_opt_failure_timestamp"), System.currentTimeMillis());
            this.j = true;
            if (this.l != TTNetThreadConfig.ThreadStackInitReason.FALLBACK_FIX) {
                this.l = TTNetThreadConfig.ThreadStackInitReason.OPT_EFFECTIVE;
            }
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            this.l = TTNetThreadConfig.ThreadStackInitReason.HAS_EXCEPTION;
            return false;
        }
    }

    public void e(boolean z, boolean z2, int i) {
        try {
            if (this.a) {
                this.f6160g.storeBoolean("enable_stack_opt", z);
                this.f6160g.storeBoolean("enable_stack_opt_fallback_fix", z2);
                this.f6160g.storeLong("stack_opt_fallback_fix_interval_s", Long.valueOf(i).longValue());
            }
            if (this.i && this.j) {
                this.f6160g.storeInt(a("stack_opt_failures"), 0);
                this.f6160g.storeLong(a("stack_opt_failure_timestamp"), 0L);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
