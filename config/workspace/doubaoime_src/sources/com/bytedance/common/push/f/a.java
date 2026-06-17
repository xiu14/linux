package com.bytedance.common.push.f;

import com.ss.android.ug.bus.UgCallbackCenter;
import com.ss.android.ug.bus.b;
import com.ss.android.ug.bus.c.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class a implements com.bytedance.common.push.e.a {

    /* renamed from: com.bytedance.common.push.f.a$a, reason: collision with other inner class name */
    class C0174a implements a.InterfaceC0385a {
        C0174a(a aVar, List list, CountDownLatch countDownLatch) {
        }
    }

    @Override // com.bytedance.common.push.e.a
    public String a() {
        com.ss.android.ug.bus.c.a aVar = (com.ss.android.ug.bus.c.a) b.a(com.ss.android.ug.bus.c.a.class);
        if (aVar == null) {
            return null;
        }
        return aVar.a();
    }

    @Override // com.bytedance.common.push.e.a
    public void d(UgCallbackCenter.b<Object> bVar) {
        UgCallbackCenter.b(null, bVar);
    }

    @Override // com.bytedance.common.push.e.a
    public List<String> e() {
        com.ss.android.ug.bus.c.a aVar = (com.ss.android.ug.bus.c.a) b.a(com.ss.android.ug.bus.c.a.class);
        if (aVar == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        ArrayList arrayList = new ArrayList();
        aVar.p(new C0174a(this, arrayList, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return arrayList;
    }

    @Override // com.bytedance.common.push.e.a
    public void j(UgCallbackCenter.b<Object> bVar) {
        UgCallbackCenter.b(null, bVar);
    }

    @Override // com.bytedance.common.push.e.a
    public void s(UgCallbackCenter.b<Object> bVar) {
        UgCallbackCenter.b(null, bVar);
    }
}
