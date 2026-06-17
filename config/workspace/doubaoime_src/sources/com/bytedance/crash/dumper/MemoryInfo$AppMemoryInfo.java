package com.bytedance.crash.dumper;

import android.app.ActivityManager;
import android.os.Debug;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
class MemoryInfo$AppMemoryInfo implements Serializable {
    private static final String FILE_NAME = "app_memory.inf";
    private static final long serialVersionUID = 1;
    private int mLargeMemoryClass;
    private int mMemoryClass;
    private final long mRuntimeFree;
    private final long mRuntimeMax;
    private final long mRuntimeTotal;
    private final long mNativeHeapSize = Debug.getNativeHeapSize();
    private final long mNativeHeapAllocSize = Debug.getNativeHeapAllocatedSize();
    private final long mNativeHeapFreeSize = Debug.getNativeHeapFreeSize();

    MemoryInfo$AppMemoryInfo(ActivityManager activityManager) {
        Runtime runtime = Runtime.getRuntime();
        this.mRuntimeMax = runtime.maxMemory();
        this.mRuntimeFree = runtime.freeMemory();
        this.mRuntimeTotal = runtime.totalMemory();
        if (activityManager != null) {
            this.mMemoryClass = activityManager.getMemoryClass();
            this.mLargeMemoryClass = activityManager.getLargeMemoryClass();
        }
    }

    public static void dump(File file, ActivityManager activityManager) {
        com.bytedance.crash.util.a.w(new File(file, FILE_NAME), new MemoryInfo$AppMemoryInfo(activityManager));
    }

    public static MemoryInfo$AppMemoryInfo load(File file) {
        return (MemoryInfo$AppMemoryInfo) com.bytedance.crash.util.a.n(new File(file, FILE_NAME));
    }

    void pushTo(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("native_heap_size", this.mNativeHeapSize);
            jSONObject2.put("native_heap_alloc_size", this.mNativeHeapAllocSize);
            jSONObject2.put("native_heap_free_size", this.mNativeHeapFreeSize);
            jSONObject2.put("max_memory", this.mRuntimeMax);
            jSONObject2.put("free_memory", this.mRuntimeFree);
            jSONObject2.put("total_memory", this.mRuntimeTotal);
            jSONObject2.put("memory_class", this.mMemoryClass);
            jSONObject2.put("large_memory_class", this.mLargeMemoryClass);
            jSONObject.put("app_memory_info", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
