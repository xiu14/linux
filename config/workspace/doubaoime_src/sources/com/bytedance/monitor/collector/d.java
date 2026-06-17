package com.bytedance.monitor.collector;

import android.util.Pair;

/* loaded from: classes.dex */
public class d extends c {
    public d(int i) {
        super(i, "atrace_event");
    }

    @Override // com.bytedance.monitor.collector.c
    Pair<String, ?> a() {
        try {
            if (j.l) {
                return new Pair<>(this.a, !j.l ? null : MonitorJni.doDumpAtrace());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    Pair<String, ?> b(long j, long j2) {
        try {
            if (j.l) {
                return new Pair<>(this.a, !j.l ? null : MonitorJni.doDumpAtraceRange(j, j2));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.monitor.collector.c
    protected void d(int i) {
    }
}
