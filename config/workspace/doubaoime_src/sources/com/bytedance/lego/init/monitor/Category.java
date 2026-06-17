package com.bytedance.lego.init.monitor;

import com.ss.android.message.log.PushLog;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public enum Category {
    CHECK_PERIOD_EXCEPTION("check_period_exception"),
    ON_PERIOD_TIMEOUT("on_period_timeout"),
    ON_PERIOD_EXCEPTION("on_period_exception"),
    INIT_TASK_IN_MAIN("init_tasks_in_main"),
    INSTANCE_CLASS_EXCEPTION("instance_class_exception"),
    TASK_COUNT_EXCEPTION("task_count_exception"),
    RUN_TAK_EXCEPTION("run_task_exception"),
    PERIOD_TIMEOUT_EXCEPTION("period_timeout_exception"),
    TASK_TIMEOUT_EXCEPTION("task_timeout_exception"),
    TASK_TIMEOUT_EXCEPTION_REAL("task_timeout_exception_real"),
    OTHER_EXCEPTION("other_exception");

    private final String value;

    Category(String str) {
        l.g(str, PushLog.KEY_VALUE);
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
