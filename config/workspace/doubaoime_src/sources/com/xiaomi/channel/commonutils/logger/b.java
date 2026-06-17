package com.xiaomi.channel.commonutils.logger;

/* loaded from: classes2.dex */
class b implements AdvancedLoggerInterface {
    private final LoggerInterface a;

    public b(LoggerInterface loggerInterface) {
        this.a = loggerInterface;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface == null) {
            return;
        }
        loggerInterface.log(str);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface == null) {
            return;
        }
        loggerInterface.setTag(str);
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface == null) {
            return;
        }
        loggerInterface.log(str, th);
    }

    @Override // com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface
    public void log(int i, String str) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface == null) {
            return;
        }
        loggerInterface.log(str);
    }

    @Override // com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface
    public void log(int i, String str, Throwable th) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface == null) {
            return;
        }
        loggerInterface.log(str, th);
    }
}
