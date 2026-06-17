package com.bytedance.crash.dumper;

import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
public class f {
    private final StackTraceElement[] a;
    private final String b;

    public f(StackTraceElement[] stackTraceElementArr) {
        System.currentTimeMillis();
        this.a = stackTraceElementArr;
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("  at ");
            sb.append(stackTraceElement.getClassName());
            sb.append(".");
            sb.append(stackTraceElement.getMethodName());
            sb.append("(");
            sb.append(stackTraceElement.getFileName());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(stackTraceElement.getLineNumber());
            sb.append(")\n");
        }
        this.b = sb.toString();
    }

    public String a() {
        return this.b;
    }
}
