package com.ss.android.g;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class d {
    public static final Set<Integer> a;

    static {
        HashSet hashSet = new HashSet();
        a = hashSet;
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
    }

    public static String a() {
        return a.a("/service/1/update_token/");
    }

    public static String b() {
        return a.a("/cloudpush/update_sender/");
    }
}
