package com.bytedance.monitor.collector.n;

import android.os.Message;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class a {
    private static Set<Integer> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(114);
        a.add(115);
        a.add(116);
        a.add(121);
        a.add(122);
        a.add(123);
    }

    public static boolean a(Message message) {
        return a.contains(Integer.valueOf(message.what));
    }
}
