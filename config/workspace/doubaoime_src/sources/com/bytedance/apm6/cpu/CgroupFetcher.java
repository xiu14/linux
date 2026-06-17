package com.bytedance.apm6.cpu;

import android.os.Process;
import com.bytedance.monitor.collector.j;

/* loaded from: classes.dex */
public class CgroupFetcher {
    private static final int a = Process.myPid();

    public enum CGROUP_LEVEL {
        UNKNOWN(-1),
        TOP_APP(0),
        FOREGROUND(1),
        BACKGROUND(2);

        private final int value;

        CGROUP_LEVEL(int i) {
            this.value = i;
        }

        public static CGROUP_LEVEL valueOf(int i) {
            return i != -1 ? i != 0 ? i != 1 ? i != 2 ? UNKNOWN : BACKGROUND : FOREGROUND : TOP_APP : UNKNOWN;
        }
    }

    public static CGROUP_LEVEL a() {
        return CGROUP_LEVEL.valueOf(j.h().j(a));
    }
}
