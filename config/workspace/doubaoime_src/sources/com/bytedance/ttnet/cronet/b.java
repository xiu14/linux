package com.bytedance.ttnet.cronet;

import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class b extends Observable {

    /* renamed from: c, reason: collision with root package name */
    private static volatile b f6209c;
    private volatile boolean a;
    private CopyOnWriteArrayList<Integer> b = new CopyOnWriteArrayList<>();

    public static b a() {
        if (f6209c == null) {
            synchronized (b.class) {
                if (f6209c == null) {
                    f6209c = new b();
                }
            }
        }
        return f6209c;
    }

    public void b(boolean z, List<Integer> list) {
        this.a = z;
        this.b.clear();
        this.b.addAll(list);
        HashMap hashMap = new HashMap();
        hashMap.put("user_blocked_state", Boolean.valueOf(this.a));
        hashMap.put("drop_reason_list", this.b);
        setChanged();
        notifyObservers(hashMap);
    }
}
