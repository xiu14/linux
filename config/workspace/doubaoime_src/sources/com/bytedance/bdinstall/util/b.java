package com.bytedance.bdinstall.util;

import com.bytedance.bdinstall.B;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class b implements B {
    private final CopyOnWriteArraySet<B> a = new CopyOnWriteArraySet<>();

    @Override // com.bytedance.bdinstall.B
    public void a(boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Iterator<B> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(z, str, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.bytedance.bdinstall.B
    public void b(String str, String str2, String str3) {
        Iterator<B> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(str, str2, str3);
        }
    }

    public void c(B b) {
        if (b != null) {
            this.a.add(b);
        }
    }
}
