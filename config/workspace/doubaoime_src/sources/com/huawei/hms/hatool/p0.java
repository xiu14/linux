package com.huawei.hms.hatool;

import com.huawei.hms.framework.common.BundleUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Calendar;
import java.util.UUID;

/* loaded from: classes2.dex */
public class p0 {
    private long a = 1800000;
    private volatile boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    private a f7386c = null;

    private class a {
        String a = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        boolean b;

        /* renamed from: c, reason: collision with root package name */
        private long f7387c;

        a(long j) {
            this.a += BundleUtil.UNDERLINE_TAG + j;
            this.f7387c = j;
            this.b = true;
            p0.this.b = false;
        }

        private boolean a(long j, long j2) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j2);
            return (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) ? false : true;
        }

        private void b(long j) {
            v.c("hmsSdk", "getNewSession() session is flush!");
            String uuid = UUID.randomUUID().toString();
            this.a = uuid;
            this.a = uuid.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            this.a += BundleUtil.UNDERLINE_TAG + j;
            this.f7387c = j;
            this.b = true;
        }

        private boolean b(long j, long j2) {
            return j2 - j >= p0.this.a;
        }

        void a(long j) {
            if (p0.this.b) {
                p0.this.b = false;
                b(j);
            } else if (b(this.f7387c, j) || a(this.f7387c, j)) {
                b(j);
            } else {
                this.f7387c = j;
                this.b = false;
            }
        }
    }

    public String a() {
        a aVar = this.f7386c;
        if (aVar != null) {
            return aVar.a;
        }
        v.f("hmsSdk", "getSessionName(): session not prepared. onEvent() must be called first.");
        return "";
    }

    void a(long j) {
        a aVar = this.f7386c;
        if (aVar != null) {
            aVar.a(j);
        } else {
            v.c("hmsSdk", "Session is first flush");
            this.f7386c = new a(j);
        }
    }

    public boolean b() {
        a aVar = this.f7386c;
        if (aVar != null) {
            return aVar.b;
        }
        v.f("hmsSdk", "isFirstEvent(): session not prepared. onEvent() must be called first.");
        return false;
    }
}
