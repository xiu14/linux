package com.huawei.hms.hatool;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes2.dex */
public class i1 {
    private String a;
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private String f7360c;

    /* renamed from: d, reason: collision with root package name */
    private String f7361d;

    /* renamed from: e, reason: collision with root package name */
    private long f7362e;

    public i1(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.f7360c = str3;
        this.f7361d = str4;
        this.f7362e = j;
    }

    public void a() {
        v.c("StreamEventHandler", "Begin to handle stream events...");
        b1 b1Var = new b1();
        b1Var.b(this.f7360c);
        b1Var.d(this.b);
        b1Var.a(this.f7361d);
        b1Var.c(String.valueOf(this.f7362e));
        if ("oper".equals(this.b) && z.i(this.a, "oper")) {
            p0 a = y.a().a(this.a, this.f7362e);
            String a2 = a.a();
            Boolean valueOf = Boolean.valueOf(a.b());
            b1Var.f(a2);
            b1Var.e(String.valueOf(valueOf));
        }
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(b1Var);
        new l0(this.a, this.b, q0.g(), arrayList, replace).a();
    }
}
