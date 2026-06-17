package com.bytedance.apm.trace.model.cross;

import androidx.annotation.Keep;
import com.bytedance.apm.trace.api.a;
import java.util.HashMap;
import java.util.Map;

@Keep
/* loaded from: classes.dex */
public class NativeSpan {
    private long finishTime;
    private boolean isErrorSpan;
    private boolean isFinish;
    private String parentId;
    private String referenceId;
    private String spanId;
    private String spanName;
    private long startTime;
    private Map<String, String> tags;
    private String threadName;

    public NativeSpan(String str, String str2, String str3, String str4, long j, long j2, String str5, HashMap<String, String> hashMap, boolean z, boolean z2) {
        this.spanName = str;
        this.spanId = str2;
        this.parentId = str3;
        this.referenceId = str4;
        this.startTime = j;
        this.finishTime = j2;
        this.threadName = str5;
        this.tags = hashMap;
        this.isErrorSpan = z;
        this.isFinish = z2;
    }

    public long getFinishTime() {
        return this.finishTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public a parseToSpan(com.bytedance.apm.G.j.a aVar) {
        if (!this.isFinish) {
            return null;
        }
        Long.parseLong(this.spanId);
        throw null;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("NativeSpan{, spanName='");
        e.a.a.a.a.G0(M, this.spanName, '\'', ", spanId=");
        M.append(this.spanId);
        M.append(", parentId=");
        M.append(this.parentId);
        M.append(", referenceId=");
        M.append(this.referenceId);
        M.append(", startTime=");
        M.append(this.startTime);
        M.append(", finishTime=");
        M.append(this.finishTime);
        M.append(", threadName='");
        e.a.a.a.a.G0(M, this.threadName, '\'', ", tags=");
        M.append(this.tags);
        M.append(", isErrorSpan=");
        M.append(this.isErrorSpan);
        M.append(", isFinish=");
        return e.a.a.a.a.L(M, this.isFinish, '}');
    }
}
