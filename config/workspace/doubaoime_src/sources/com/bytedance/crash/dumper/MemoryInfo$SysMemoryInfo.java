package com.bytedance.crash.dumper;

import android.app.ActivityManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
class MemoryInfo$SysMemoryInfo implements Serializable {
    private static final String FILE_NAME = "sys_memory.inf";
    private static final long UNIT_SIZE = 536870912;
    private static final long serialVersionUID = 1;
    private final long mAvailMem;
    private final boolean mLowMemory;
    private final long mThreshold;
    private final long mTotalMem;

    MemoryInfo$SysMemoryInfo(ActivityManager activityManager) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        this.mLowMemory = memoryInfo.lowMemory;
        this.mThreshold = memoryInfo.threshold;
        this.mAvailMem = memoryInfo.availMem;
        this.mTotalMem = memoryInfo.totalMem;
    }

    static void dump(File file, ActivityManager activityManager) {
        if (activityManager != null) {
            com.bytedance.crash.util.a.w(new File(file, FILE_NAME), new MemoryInfo$SysMemoryInfo(activityManager));
        }
    }

    static MemoryInfo$SysMemoryInfo load(File file) {
        return (MemoryInfo$SysMemoryInfo) com.bytedance.crash.util.a.n(new File(file, FILE_NAME));
    }

    void pushTo(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("lowMemory", this.mLowMemory);
            jSONObject2.put("threshold", this.mThreshold);
            jSONObject2.put("availMemUnit", this.mAvailMem / UNIT_SIZE);
            jSONObject2.put("totalMemUnit", this.mTotalMem / UNIT_SIZE);
            jSONObject.put("sys_memory_info", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
