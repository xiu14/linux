package com.bytedance.crash.dumper;

import android.os.Debug;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
class MemoryInfo$DevMemoryInfo implements Serializable {
    private static final String FILE_NAME = "dev_memory.inf";
    private static final long KB = 1024;
    private static final long serialVersionUID = 1;
    private final long mDalvikPrivateDirty;
    private final long mDalvikPss;
    private final long mDalvikSharedDirty;
    private final long mNativePrivateDirty;
    private final long mNativePss;
    private final long mNativeSharedDirty;
    private final long mOtherPrivateDirty;
    private final long mOtherPss;
    private final long mOtherSharedDirty;
    private final long mSummaryGraphics;
    private final long mTotalPrivateClean;
    private final long mTotalPrivateDirty;
    private final long mTotalPss;
    private final long mTotalSharedClean;
    private final long mTotalSharedDirty;
    private final long mTotalSwappablePss;

    MemoryInfo$DevMemoryInfo() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        this.mDalvikPss = memoryInfo.dalvikPss * 1024;
        this.mDalvikSharedDirty = memoryInfo.dalvikSharedDirty * 1024;
        this.mDalvikPrivateDirty = memoryInfo.dalvikPrivateDirty * 1024;
        this.mNativePss = memoryInfo.nativePss * 1024;
        this.mNativeSharedDirty = memoryInfo.nativeSharedDirty * 1024;
        this.mNativePrivateDirty = memoryInfo.nativePrivateDirty * 1024;
        this.mOtherPss = memoryInfo.otherPss * 1024;
        this.mOtherSharedDirty = memoryInfo.otherSharedDirty * 1024;
        this.mOtherPrivateDirty = memoryInfo.otherPrivateDirty * 1024;
        this.mTotalPss = memoryInfo.getTotalPss() * 1024;
        this.mTotalSharedClean = memoryInfo.getTotalSharedClean() * 1024;
        this.mTotalPrivateClean = memoryInfo.getTotalPrivateClean() * 1024;
        this.mTotalSwappablePss = memoryInfo.getTotalSwappablePss() * 1024;
        this.mTotalSharedDirty = memoryInfo.getTotalSharedDirty() * 1024;
        this.mTotalPrivateDirty = memoryInfo.getTotalPrivateDirty() * 1024;
        this.mSummaryGraphics = getSummaryGraphics(memoryInfo);
    }

    public static void dump(File file) {
        com.bytedance.crash.util.a.w(new File(file, FILE_NAME), new MemoryInfo$DevMemoryInfo());
    }

    private static long getSummaryGraphics(Debug.MemoryInfo memoryInfo) {
        try {
            return Integer.parseInt(memoryInfo.getMemoryStat("summary.graphics")) * 1024;
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static MemoryInfo$DevMemoryInfo load(File file) {
        return (MemoryInfo$DevMemoryInfo) com.bytedance.crash.util.a.n(new File(file, FILE_NAME));
    }

    public void pushTo(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("dalvikPss", this.mDalvikPss);
            jSONObject2.put("dalvikSharedDirty", this.mDalvikSharedDirty);
            jSONObject2.put("dalvikPrivateDirty", this.mDalvikPrivateDirty);
            jSONObject2.put("nativePss", this.mNativePss);
            jSONObject2.put("nativeSharedDirty", this.mNativeSharedDirty);
            jSONObject2.put("nativePrivateDirty", this.mNativePrivateDirty);
            jSONObject2.put("otherPss", this.mOtherPss);
            jSONObject2.put("otherSharedDirty", this.mOtherSharedDirty);
            jSONObject2.put("otherPrivateDirty", this.mOtherPrivateDirty);
            jSONObject2.put("totalPss", this.mTotalPss);
            jSONObject2.put("totalPrivateClean", this.mTotalPrivateClean);
            jSONObject2.put("totalSharedClean", this.mTotalSharedClean);
            jSONObject2.put("totalSwappablePss", this.mTotalSwappablePss);
            jSONObject2.put("totalSharedDirty", this.mTotalSharedDirty);
            jSONObject2.put("totalPrivateDirty", this.mTotalPrivateDirty);
            jSONObject2.put("summary.graphics", this.mSummaryGraphics);
            jSONObject.put("memory_info", jSONObject2);
        } catch (JSONException unused) {
        }
    }
}
