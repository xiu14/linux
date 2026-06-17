package com.bytedance.applog.v;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.applog.h;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class a {
    private final Map<Integer, CopyOnWriteArraySet<h>> a = new ConcurrentHashMap();

    public boolean a(int i) {
        return !this.a.containsKey(Integer.valueOf(i));
    }

    public void b(int i, @NonNull String str, @NonNull String str2, String str3, long j, long j2, String str4) {
        CopyOnWriteArraySet<h> copyOnWriteArraySet;
        if ((!this.a.containsKey(Integer.valueOf(i))) || (copyOnWriteArraySet = this.a.get(Integer.valueOf(i))) == null) {
            return;
        }
        Iterator<h> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().b(str, str2, str3, j, j2, str4);
        }
    }

    public void c(int i, @NonNull String str, @Nullable String str2) {
        CopyOnWriteArraySet<h> copyOnWriteArraySet;
        if ((!this.a.containsKey(Integer.valueOf(i))) || (copyOnWriteArraySet = this.a.get(Integer.valueOf(i))) == null) {
            return;
        }
        Iterator<h> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().c(str, str2);
        }
    }

    public void d(int i, @NonNull String str, @Nullable String str2) {
        CopyOnWriteArraySet<h> copyOnWriteArraySet;
        if ((!this.a.containsKey(Integer.valueOf(i))) || (copyOnWriteArraySet = this.a.get(Integer.valueOf(i))) == null) {
            return;
        }
        Iterator<h> it2 = copyOnWriteArraySet.iterator();
        while (it2.hasNext()) {
            it2.next().a(str, str2);
        }
    }
}
