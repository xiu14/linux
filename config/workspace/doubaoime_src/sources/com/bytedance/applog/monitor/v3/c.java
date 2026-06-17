package com.bytedance.applog.monitor.v3;

import android.content.Context;
import com.bytedance.bdinstall.G;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class c {
    private final Context a;
    private final com.bytedance.applog.monitor.v3.b b;

    /* renamed from: c, reason: collision with root package name */
    private long f3819c;

    /* renamed from: d, reason: collision with root package name */
    private final G f3820d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f3821e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3822f;

    public static final class b {
        private Context a;
        private com.bytedance.applog.monitor.v3.b b;

        /* renamed from: c, reason: collision with root package name */
        private long f3823c;

        /* renamed from: d, reason: collision with root package name */
        private G f3824d;

        /* renamed from: e, reason: collision with root package name */
        private String f3825e;

        /* renamed from: f, reason: collision with root package name */
        private ExecutorService f3826f;

        public b g(com.bytedance.applog.monitor.v3.b bVar) {
            this.b = bVar;
            return this;
        }

        public c h() {
            return new c(this, null);
        }

        public b i(Context context) {
            this.a = context;
            return this;
        }

        public b j(long j) {
            this.f3823c = j;
            return this;
        }

        public b k(ExecutorService executorService) {
            this.f3826f = executorService;
            return this;
        }

        public b l(G g2) {
            this.f3824d = g2;
            return this;
        }

        public b m(String str) {
            this.f3825e = str;
            return this;
        }
    }

    c(b bVar, a aVar) {
        this.f3819c = com.heytap.mcssdk.constant.a.f6886d;
        this.a = bVar.a;
        this.b = bVar.b;
        this.f3819c = bVar.f3823c;
        this.f3820d = bVar.f3824d;
        this.f3822f = bVar.f3825e;
        this.f3821e = bVar.f3826f;
    }

    public com.bytedance.applog.monitor.v3.b a() {
        return this.b;
    }

    public Context b() {
        return this.a;
    }

    public long c() {
        return this.f3819c;
    }

    public ExecutorService d() {
        return this.f3821e;
    }

    public G e() {
        return this.f3820d;
    }

    public String f() {
        return this.f3822f;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("MonitorV3Config{context=");
        M.append(this.a);
        M.append(", appLogConfig=");
        M.append(this.b);
        M.append(", eventReportInterval=");
        M.append(this.f3819c);
        M.append(", networkClient=");
        M.append(this.f3820d);
        M.append(", executor=");
        M.append(this.f3821e);
        M.append(", reportUrl='");
        return e.a.a.a.a.H(M, this.f3822f, '\'', '}');
    }
}
