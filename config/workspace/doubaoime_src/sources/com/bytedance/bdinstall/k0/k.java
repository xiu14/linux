package com.bytedance.bdinstall.k0;

import android.os.Environment;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.bdinstall.Q;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
final class k implements Runnable {
    private final Q a;

    public k(Q q) {
        this.a = q;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(this.a.q().getExternalCacheDir().getParent() + "/" + (this.a.K() ? "device_id" : com.bytedance.bdinstall.util.e.e()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (!this.a.K()) {
            try {
                arrayList.add(Environment.getExternalStorageDirectory().getPath() + com.bytedance.bdinstall.util.e.a("L0FuZHJvaWQvZGF0YS9jb20uc25zc2RrLmFwaS9ieXRlZGFuY2U="));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                arrayList.add(Environment.getExternalStorageDirectory().getPath() + "/" + com.bytedance.bdinstall.util.e.e());
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                com.bytedance.android.input.k.b.a.u((String) it2.next());
                int i = C0640u.a;
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }
}
