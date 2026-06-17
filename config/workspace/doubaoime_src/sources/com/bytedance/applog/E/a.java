package com.bytedance.applog.E;

import androidx.annotation.NonNull;
import com.bytedance.applog.c;
import com.bytedance.applog.w.e;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private int b;

    /* renamed from: g, reason: collision with root package name */
    private final c f3764g;
    private final com.bytedance.applog.x.b h;
    private long i;
    private int a = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f3760c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f3761d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f3762e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f3763f = 0;

    public a(c cVar, com.bytedance.applog.x.b bVar, long j) {
        this.f3764g = cVar;
        this.h = bVar;
        this.i = j;
    }

    public boolean a(int i) {
        if (this.a > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.f3760c;
            long j2 = this.i;
            if (currentTimeMillis < j + j2) {
                int i2 = this.f3761d;
                if (i2 >= this.b) {
                    return true;
                }
                this.f3761d = i2 + 1;
            } else {
                this.f3760c = (((currentTimeMillis - j) / j2) * j2) + j;
                this.f3761d = 1;
            }
        }
        int i3 = this.a;
        if (i3 >= 10000) {
            return true;
        }
        if (i3 <= 0 || i3 >= 10000 || new Random().nextInt(10000) >= this.a) {
            return (this.f3762e > 0 && 1 == i) || (this.f3763f > 0 && 3 == i);
        }
        return true;
    }

    public void b(@NonNull JSONObject jSONObject, long j, com.bytedance.applog.y.b bVar) {
        int i;
        this.i = j;
        int optInt = jSONObject.optInt("backoff_ratio", 0);
        this.a = optInt;
        if (optInt < 0 || optInt > 10000) {
            this.a = 0;
        }
        int optInt2 = jSONObject.optInt("max_request_frequency", (bVar == null || -1 == bVar.e()) ? 12 : bVar.e() == 0 ? Integer.MAX_VALUE : 60);
        this.b = optInt2;
        if (optInt2 <= 0) {
            this.b = 12;
        }
        int i2 = this.a;
        if (i2 > 0 && this.f3760c == 0) {
            this.f3760c = System.currentTimeMillis();
            this.f3761d = 1;
        } else if (i2 == 0) {
            this.f3760c = 0L;
            this.f3761d = 0;
        }
        this.f3762e = jSONObject.optInt("disable_session_start_request", 0);
        this.f3763f = jSONObject.optInt("disable_session_end_request", 0);
        if (this.a == 0 && (i = this.b) > 0) {
            this.h.W(bVar, i);
        }
        e I = this.f3764g.I();
        List<String> singletonList = Collections.singletonList("BackoffController");
        StringBuilder M = e.a.a.a.a.M("parseBackoffControllerFromResp mEventInterval: ");
        M.append(this.i);
        M.append(", mBackoffRatio: ");
        M.append(this.a);
        M.append(", mMaxRequestFrequency: ");
        M.append(this.b);
        M.append(", mBackoffWindowStartTime: ");
        M.append(this.f3760c);
        M.append(", mBackoffWindowSendCount: ");
        M.append(this.f3761d);
        M.append(", mDisableSessionStartRequest: ");
        M.append(this.f3762e);
        M.append(", mDisableSessionEndRequest: ");
        M.append(this.f3763f);
        I.n(singletonList, M.toString(), new Object[0]);
    }
}
