package com.bytedance.crash.dumper.j;

/* loaded from: classes.dex */
public class h {
    private static final char[] b = {'(', 'N', 'a', 't', 'i', 'v', 'e', ' ', 'M', 'e', 't', 'h', 'o', 'd', ')'};

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f4607c = {'(', 'U', 'n', 'k', 'n', 'o', 'w', 'n', ' ', 'S', 'o', 'u', 'r', 'c', 'e', ')'};

    /* renamed from: d, reason: collision with root package name */
    private static final char[] f4608d = {'(', 'U', 'n', 'k', 'n', 'o', 'w', 'n', ' ', 'S', 'o', 'u', 'r', 'c', 'e', ':'};
    private final i a;

    h(i iVar) {
        this.a = iVar;
    }

    h a(char c2) {
        this.a.a(c2);
        return this;
    }

    h b(int i) {
        this.a.b(i);
        return this;
    }

    h c(StackTraceElement stackTraceElement) {
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        int lineNumber = stackTraceElement.getLineNumber();
        boolean isNativeMethod = stackTraceElement.isNativeMethod();
        d(className);
        this.a.a('.');
        d(methodName);
        if (isNativeMethod) {
            f(b);
        } else if (fileName != null) {
            if (stackTraceElement.getLineNumber() >= 0) {
                this.a.a('(');
                d(fileName);
                this.a.a(':');
                this.a.b(lineNumber);
                this.a.a(')');
            } else {
                this.a.a('(');
                d(fileName);
                this.a.a(')');
            }
        } else if (lineNumber >= 0) {
            f(f4608d);
            this.a.b(lineNumber);
            this.a.a(')');
        } else {
            f(f4607c);
        }
        return this;
    }

    h d(String str) {
        if (str.length() != 0) {
            this.a.d(str);
        }
        return this;
    }

    h e(Throwable th) {
        this.a.e(th);
        return this;
    }

    h f(char[] cArr) {
        if (cArr.length != 0) {
            this.a.g(cArr);
        }
        return this;
    }

    h g(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.a.a('\t');
        }
        return this;
    }
}
