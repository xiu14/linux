package com.bytedance.lego.init.config;

import android.content.Context;
import android.util.Log;
import com.bytedance.lego.init.IdleTaskConfig;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.s.c.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class TaskConfig {
    private boolean agreePrivacyPopupWindow;
    private final long applicationStartTime;
    private final Context base;
    private final boolean catchException;
    private final int coreThreadNum;
    private final ThreadPoolExecutor executor;
    private final IdleTaskConfig idleTaskConfig;
    private final boolean isDebug;
    private final boolean isMainProcess;
    private final ProcessMatchMode mode;
    private final String processName;
    private ThreadPoolExecutor taskExecutor;
    private final ThreadFactory threadFactory;
    private final int timeout;

    public static final class Builder {
        private boolean agreePrivacyPopupWindow;
        private long applicationStartTime;
        private final Context base;
        private boolean catchException;
        private int coreThreadNum;
        private ThreadPoolExecutor executor;
        private IdleTaskConfig idleTaskConfig;
        private boolean isDebug;
        private final boolean isMainProcess;
        private ProcessMatchMode processMatchMode;
        private final String processName;
        private ThreadFactory threadFactory;
        private int timeout;

        public Builder(Context context, boolean z, String str) {
            IdleTaskConfig idleTaskConfig;
            l.g(context, "base");
            l.g(str, "processName");
            this.base = context;
            this.isMainProcess = z;
            this.processName = str;
            this.processMatchMode = ProcessMatchMode.CONTAIN;
            this.coreThreadNum = Runtime.getRuntime().availableProcessors();
            this.timeout = JosStatusCodes.RTN_CODE_COMMON_ERROR;
            Objects.requireNonNull(IdleTaskConfig.Companion);
            idleTaskConfig = IdleTaskConfig.DEFAULT_IDLETASK_CONFIG;
            this.idleTaskConfig = idleTaskConfig;
            this.applicationStartTime = System.currentTimeMillis();
            this.agreePrivacyPopupWindow = true;
        }

        public final Builder agreePrivacyPopupWindow(boolean z) {
            this.agreePrivacyPopupWindow = z;
            return this;
        }

        public final TaskConfig build() {
            boolean z = this.isDebug;
            Context context = this.base;
            ThreadPoolExecutor threadPoolExecutor = this.executor;
            return new TaskConfig(z, context, this.processMatchMode, threadPoolExecutor, this.threadFactory, this.coreThreadNum, this.isMainProcess, this.processName, this.timeout, this.catchException, this.applicationStartTime, this.idleTaskConfig, this.agreePrivacyPopupWindow, null);
        }

        public final Builder enableCatchException(boolean z) {
            this.catchException = z;
            return this;
        }

        public final Builder isDebug(boolean z) {
            this.isDebug = z;
            return this;
        }

        public final Builder setApplicationStartTime(long j) {
            this.applicationStartTime = j;
            return this;
        }

        public final Builder setCoreThreadNum(int i) {
            this.coreThreadNum = i;
            return this;
        }

        public final Builder setExecutorService(ThreadPoolExecutor threadPoolExecutor) {
            l.g(threadPoolExecutor, "executor");
            this.executor = threadPoolExecutor;
            return this;
        }

        public final Builder setIdleTaskConfig(IdleTaskConfig idleTaskConfig) {
            l.g(idleTaskConfig, "idleTaskConfig");
            this.idleTaskConfig = idleTaskConfig;
            return this;
        }

        public final Builder setProcessMatchMode(ProcessMatchMode processMatchMode) {
            l.g(processMatchMode, "mode");
            this.processMatchMode = processMatchMode;
            return this;
        }

        public final Builder setThreadFactory(ThreadFactory threadFactory) {
            l.g(threadFactory, "threadFactory");
            this.threadFactory = threadFactory;
            return this;
        }

        public final Builder setTimeOut(int i) {
            if (i < 3000) {
                l.g("", "classname");
                l.g("TaskConfig.timeout must not be less than 3*1000", "message");
                Log.e("#inittask#", " TaskConfig.timeout must not be less than 3*1000");
                this.timeout = 3000;
            } else {
                this.timeout = i;
            }
            return this;
        }
    }

    public static final class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            l.g(runnable, DownloadFileUtils.MODE_READ);
            StringBuilder M = e.a.a.a.a.M("AA InitThread#");
            M.append(this.a.getAndIncrement());
            return new Thread(runnable, M.toString());
        }
    }

    private TaskConfig(boolean z, Context context, ProcessMatchMode processMatchMode, ThreadPoolExecutor threadPoolExecutor, ThreadFactory threadFactory, int i, boolean z2, String str, int i2, boolean z3, long j, IdleTaskConfig idleTaskConfig, boolean z4) {
        this.isDebug = z;
        this.base = context;
        this.mode = processMatchMode;
        this.executor = threadPoolExecutor;
        this.threadFactory = threadFactory;
        this.coreThreadNum = i;
        this.isMainProcess = z2;
        this.processName = str;
        this.timeout = i2;
        this.catchException = z3;
        this.applicationStartTime = j;
        this.idleTaskConfig = idleTaskConfig;
        this.agreePrivacyPopupWindow = z4;
    }

    private final ThreadPoolExecutor getDefaultExecutor() {
        int i = this.coreThreadNum;
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), getThreadFactory());
    }

    private final ThreadFactory getDefaultThreadFactory() {
        return new a();
    }

    private final ThreadFactory getThreadFactory() {
        ThreadFactory threadFactory = this.threadFactory;
        return threadFactory != null ? threadFactory : getDefaultThreadFactory();
    }

    public final boolean getAgreePrivacyPopupWindow() {
        return this.agreePrivacyPopupWindow;
    }

    public final long getApplicationStartTime() {
        return this.applicationStartTime;
    }

    public final Context getBase() {
        return this.base;
    }

    public final boolean getCatchException() {
        return this.catchException;
    }

    public final IdleTaskConfig getIdleTaskConfig() {
        return this.idleTaskConfig;
    }

    public final ProcessMatchMode getMode() {
        return this.mode;
    }

    public final String getProcessName() {
        return this.processName;
    }

    public final ThreadPoolExecutor getTaskExecutor() {
        ThreadPoolExecutor threadPoolExecutor = this.taskExecutor;
        if (threadPoolExecutor == null) {
            threadPoolExecutor = this.executor;
        }
        return threadPoolExecutor != null ? threadPoolExecutor : getDefaultExecutor();
    }

    public final int getTimeout() {
        return this.timeout;
    }

    public final boolean isDebug() {
        return this.isDebug;
    }

    public final boolean isMainProcess() {
        return this.isMainProcess;
    }

    public final void setAgreePrivacyPopupWindow(boolean z) {
        this.agreePrivacyPopupWindow = z;
    }

    public final void setTaskExecutor(ThreadPoolExecutor threadPoolExecutor) {
        this.taskExecutor = threadPoolExecutor;
    }

    public /* synthetic */ TaskConfig(boolean z, Context context, ProcessMatchMode processMatchMode, ThreadPoolExecutor threadPoolExecutor, ThreadFactory threadFactory, int i, boolean z2, String str, int i2, boolean z3, long j, IdleTaskConfig idleTaskConfig, boolean z4, g gVar) {
        this(z, context, processMatchMode, threadPoolExecutor, threadFactory, i, z2, str, i2, z3, j, idleTaskConfig, z4);
    }

    /* synthetic */ TaskConfig(boolean z, Context context, ProcessMatchMode processMatchMode, ThreadPoolExecutor threadPoolExecutor, ThreadFactory threadFactory, int i, boolean z2, String str, int i2, boolean z3, long j, IdleTaskConfig idleTaskConfig, boolean z4, int i3, g gVar) {
        this(z, context, processMatchMode, (i3 & 8) != 0 ? null : threadPoolExecutor, (i3 & 16) != 0 ? null : threadFactory, i, z2, str, i2, z3, j, idleTaskConfig, z4);
    }
}
