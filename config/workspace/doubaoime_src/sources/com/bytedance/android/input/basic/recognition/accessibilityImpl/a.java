package com.bytedance.android.input.basic.recognition.accessibilityImpl;

import com.bytedance.android.input.basic.recognition.api.IRecognizer;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    public static final a a = null;
    private static final ConcurrentHashMap<String, IRecognizer.a> b = new ConcurrentHashMap<>();

    public static final IRecognizer.a a(String str) {
        l.f(str, "requestCode");
        return b.remove(str);
    }
}
