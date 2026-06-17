package com.bytedance.ttnet.j;

import com.bytedance.android.input.ttnet.d;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.k;
import com.bytedance.ttnet.TTNetInit;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public class b {
    private String a;
    private int b;

    /* renamed from: d, reason: collision with root package name */
    private Map<String, String> f6224d;

    /* renamed from: f, reason: collision with root package name */
    private c f6226f;

    /* renamed from: c, reason: collision with root package name */
    private String f6223c = UUID.randomUUID().toString();

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f6225e = new CountDownLatch(1);

    b(String str, int i, Map<String, String> map) {
        this.a = str;
        this.b = i;
        this.f6224d = map;
    }

    public void a() throws InterruptedException {
        this.f6225e.await();
    }

    public void b() throws Exception {
        k.r(((d) TTNetInit.getTTNetDepend()).c()).W(this.a, this.b, this.f6223c, this.f6224d);
    }

    public c c() {
        return this.f6226f;
    }

    public void d() {
        this.f6225e.countDown();
    }

    public void e(c cVar) {
        this.f6226f = cVar;
    }

    public String f() {
        return this.f6223c;
    }
}
