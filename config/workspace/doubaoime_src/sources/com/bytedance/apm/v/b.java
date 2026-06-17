package com.bytedance.apm.v;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
class b implements Runnable {
    final /* synthetic */ a a;

    b(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        LinkedList linkedList;
        LinkedList linkedList2;
        LinkedList linkedList3;
        LinkedList linkedList4;
        linkedList = this.a.a;
        synchronized (linkedList) {
            linkedList3 = this.a.a;
            linkedList2 = new LinkedList(linkedList3);
            linkedList4 = this.a.a;
            linkedList4.clear();
        }
        Iterator it2 = linkedList2.iterator();
        while (it2.hasNext()) {
            this.a.e((c) it2.next());
        }
    }
}
