package com.xiaomi.channel.commonutils.logger;

/* loaded from: classes2.dex */
public interface AdvancedLoggerInterface extends LoggerInterface {
    public static final int DEBUG = 1;
    public static final int ERROR = 4;
    public static final int FATAL = 5;
    public static final int INFO = 0;
    public static final int WARN = 2;

    void log(int i, String str);

    void log(int i, String str, Throwable th);
}
