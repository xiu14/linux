package com.huawei.agconnect.core.c;

import com.huawei.b.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class a extends com.huawei.b.a {
    private static final List<a.InterfaceC0343a> a = new CopyOnWriteArrayList();

    public static void a() {
        Iterator<a.InterfaceC0343a> it2 = a.iterator();
        while (it2.hasNext()) {
            it2.next().onFinish();
        }
    }
}
