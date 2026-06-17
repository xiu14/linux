package com.ss.android.agilelogger.utils;

import android.content.Intent;
import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class FormatUtils {
    private static ConcurrentHashMap<TYPE, com.ss.android.c.g.b> a;

    public enum TYPE {
        MSG,
        JSON,
        BUNDLE,
        INTENT,
        THROWABLE,
        BORDER,
        STACKTRACE,
        THREAD,
        STACKTRACE_STR
    }

    static {
        ConcurrentHashMap<TYPE, com.ss.android.c.g.b> concurrentHashMap = new ConcurrentHashMap<>();
        a = concurrentHashMap;
        concurrentHashMap.put(TYPE.MSG, new com.ss.android.c.g.d.a());
        a.put(TYPE.JSON, new com.ss.android.c.g.d.b.a());
        a.put(TYPE.BUNDLE, new com.ss.android.c.g.d.c.a());
        a.put(TYPE.INTENT, new com.ss.android.c.g.d.c.b());
        a.put(TYPE.BORDER, new com.ss.android.c.g.c.a());
        a.put(TYPE.STACKTRACE, new com.ss.android.c.g.e.a());
        a.put(TYPE.THREAD, new com.ss.android.c.g.f.a());
        a.put(TYPE.THROWABLE, new com.ss.android.c.g.d.d.a());
    }

    public static String a(TYPE type, Intent intent) {
        Objects.requireNonNull((com.ss.android.c.g.d.c.b) a.get(type));
        return a.e(intent);
    }

    public static String b(TYPE type, Bundle bundle) {
        Objects.requireNonNull((com.ss.android.c.g.d.c.a) a.get(type));
        return a.b(bundle);
    }

    public static String c(TYPE type, String str) {
        com.ss.android.c.g.b bVar = a.get(type);
        return bVar != null ? type == TYPE.BORDER ? bVar.a(new String[]{str}) : bVar.a(str) : str;
    }

    public static String d(TYPE type, Thread thread) {
        return a.get(type).a(thread);
    }

    public static String e(TYPE type, Throwable th) {
        return a.get(type).a(th);
    }

    public static String f(TYPE type, StackTraceElement[] stackTraceElementArr) {
        return a.get(type).a(stackTraceElementArr);
    }
}
