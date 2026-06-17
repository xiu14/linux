package com.bytedance.applog.monitor;

import com.bytedance.applog.j;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class a {
    private final CopyOnWriteArraySet<j> a = new CopyOnWriteArraySet<>();

    public void a(String str, String str2) {
        if (this.a.isEmpty()) {
            return;
        }
        Iterator<j> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(str, str2);
        }
    }

    public void b(String str, Throwable th) {
        if (this.a.isEmpty()) {
            return;
        }
        String th2 = th.toString();
        Iterator<j> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().b(str, th2);
        }
    }

    public void c(String str, String str2) {
        Iterator<j> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().a(str, str2);
        }
    }
}
