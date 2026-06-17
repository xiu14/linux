package com.bytedance.bdinstall;

import com.bytedance.bdinstall.K;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class O implements Runnable {
    final /* synthetic */ K.d a;

    O(K.d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        Set set;
        set = this.a.a;
        Iterator it2 = new ArrayList(set).iterator();
        while (it2.hasNext()) {
            K.d.a aVar = (K.d.a) ((WeakReference) it2.next()).get();
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
