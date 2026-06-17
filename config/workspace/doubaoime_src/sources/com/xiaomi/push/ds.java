package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface;
import com.xiaomi.channel.commonutils.logger.LoggerInterface;

/* loaded from: classes2.dex */
public class ds implements AdvancedLoggerInterface {
    private LoggerInterface a;
    private LoggerInterface b;

    public ds(LoggerInterface loggerInterface, LoggerInterface loggerInterface2) {
        this.a = null;
        this.b = null;
        this.a = loggerInterface;
        this.b = loggerInterface2;
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface != null) {
            loggerInterface.log(str);
        }
        LoggerInterface loggerInterface2 = this.b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void setTag(String str) {
    }

    @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
    public void log(String str, Throwable th) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface != null) {
            loggerInterface.log(str, th);
        }
        LoggerInterface loggerInterface2 = this.b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str, th);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface
    public void log(int i, String str) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface != null) {
            if (loggerInterface instanceof AdvancedLoggerInterface) {
                ((AdvancedLoggerInterface) loggerInterface).log(i, str);
            } else {
                loggerInterface.log(str);
            }
        }
        LoggerInterface loggerInterface2 = this.b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str);
        }
    }

    @Override // com.xiaomi.channel.commonutils.logger.AdvancedLoggerInterface
    public void log(int i, String str, Throwable th) {
        LoggerInterface loggerInterface = this.a;
        if (loggerInterface != null) {
            if (loggerInterface instanceof AdvancedLoggerInterface) {
                ((AdvancedLoggerInterface) loggerInterface).log(i, str, th);
            } else {
                loggerInterface.log(str, th);
            }
        }
        LoggerInterface loggerInterface2 = this.b;
        if (loggerInterface2 != null) {
            loggerInterface2.log(str, th);
        }
    }
}
