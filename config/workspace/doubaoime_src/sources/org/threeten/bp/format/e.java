package org.threeten.bp.format;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class e {
    private static final AtomicReference<e> a = new AtomicReference<>();
    public static final /* synthetic */ int b = 0;

    static class a {
        static final e a;

        static {
            e.a.compareAndSet(null, new g());
            a = (e) e.a.get();
        }
    }

    public abstract String b(org.threeten.bp.temporal.e eVar, long j, TextStyle textStyle, Locale locale);
}
