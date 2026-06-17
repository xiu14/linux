package com.facebook.imagepipeline.common;

/* loaded from: classes2.dex */
public enum Priority {
    LOW,
    MEDIUM,
    HIGH,
    IMMEDIATE;

    public static Priority getHigherPriority(Priority priority, Priority priority2) {
        return priority == null ? priority2 : (priority2 != null && priority.ordinal() <= priority2.ordinal()) ? priority2 : priority;
    }

    public static int getIntPriorityValue(Priority priority) {
        int ordinal = priority.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 2;
        if (ordinal != 2) {
            i = 3;
            if (ordinal != 3) {
                return 1;
            }
        }
        return i;
    }

    public static Priority getLowerPriority(Priority priority, Priority priority2) {
        return priority == null ? priority2 : (priority2 != null && priority.ordinal() >= priority2.ordinal()) ? priority2 : priority;
    }
}
