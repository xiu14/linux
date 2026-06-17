package com.airbnb.lottie.y;

import android.util.Log;
import com.airbnb.lottie.l;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements l {
    private static final Set<String> a = new HashSet();

    public void a(String str) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        set.add(str);
    }

    public void b(String str, Throwable th) {
        Set<String> set = a;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }
}
