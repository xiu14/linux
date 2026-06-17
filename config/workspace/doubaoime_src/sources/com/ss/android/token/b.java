package com.ss.android.token;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class b {
    private static Set<String> a = Collections.synchronizedSet(new HashSet());
    public static final /* synthetic */ int b = 0;

    static {
        new ArrayList();
    }

    public static void a(Collection<String> collection) {
        Set<String> set = a;
        if (set != null) {
            set.addAll(collection);
        }
    }
}
