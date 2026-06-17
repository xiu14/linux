package com.bytedance.push.K;

import com.bytedance.common.model.ProcessEnum;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ a b;

    b(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a);
        list = this.b.b;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            com.bytedance.common.d.a.b.m().j((ProcessEnum) it2.next(), "onAppStatusChanged", arrayList);
        }
    }
}
