package com.huawei.hianalytics.f.e;

import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes2.dex */
public class b {
    private volatile boolean a = false;
    private volatile long b = 0;

    /* renamed from: c, reason: collision with root package name */
    private a f7081c = null;

    private class a {
        String a = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        private long f7082c;

        a(long j) {
            this.a += BundleUtil.UNDERLINE_TAG + j;
            this.f7082c = j;
            this.b = true;
            b.this.a = false;
        }

        private void b(long j) {
            com.huawei.hianalytics.g.b.b("SessionWrapper", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.a = uuid;
            this.a = uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            this.a += BundleUtil.UNDERLINE_TAG + j;
            this.f7082c = j;
            this.b = true;
        }

        void a(long j) {
            if (b.this.a) {
                b.this.a = false;
                b(j);
                return;
            }
            long j2 = this.f7082c;
            boolean z = true;
            if (!(j - j2 >= 1800000)) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(j);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                    z = false;
                }
                if (!z) {
                    this.f7082c = j;
                    this.b = false;
                    return;
                }
            }
            b(j);
        }
    }

    public String a() {
        a aVar = this.f7081c;
        if (aVar != null) {
            return aVar.a;
        }
        com.huawei.hianalytics.g.b.c("SessionWrapper", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    public synchronized void b(long j) {
        this.a = true;
        this.b = j;
    }

    public boolean b() {
        a aVar = this.f7081c;
        if (aVar != null) {
            return aVar.b;
        }
        com.huawei.hianalytics.g.b.c("SessionWrapper", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }

    public void c() {
        this.f7081c = null;
        this.b = 0L;
        this.a = false;
    }

    public synchronized void c(long j) {
        if (this.b == 0) {
            com.huawei.hianalytics.g.b.c("SessionWrapper", "OnBackground() need to be called before!");
        } else {
            this.a = j - this.b > 30000;
            this.b = 0L;
        }
    }

    void d(long j) {
        a aVar = this.f7081c;
        if (aVar != null) {
            aVar.a(j);
        } else {
            com.huawei.hianalytics.g.b.b("SessionWrapper", "Session is first flush");
            this.f7081c = new a(j);
        }
    }
}
