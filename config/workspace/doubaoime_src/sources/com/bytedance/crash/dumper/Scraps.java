package com.bytedance.crash.dumper;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.bytedance.crash.D;
import java.io.File;
import java.io.Serializable;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class Scraps implements Serializable {
    public static final String BATTERY = "battery";
    private static final String FILE_NAME = "scraps.inf";
    public static final String INNER_FREE = "inner_free";
    private static final String INNER_FREE_REAL = "inner_free_realUnit";
    public static final String INNER_TOTAL = "inner_total";
    private static final String INNER_TOTAL_REAL = "inner_total_realUnit";
    public static final String INNER_UNIT = "unit";
    public static final String SDCARD_FREE = "sdcard_free";
    private static final String SDCARD_TOTAL = "sdcard_total";
    public static final String STORAGE = "storage";
    private static final long serialVersionUID = 1;
    private int mBatteryLevel;
    private boolean mIsMiniApp;
    private int mMiniAppId;
    private String mMiniAppVersion;
    private long mSdcardFreeSize;
    private long mSdcardTotalSize;
    private long mStorageFreeSize;
    private long mStorageTotalSize;

    public static void dump(File file) {
        Scraps scraps = new Scraps();
        scraps.dumpMiniApp();
        scraps.dumpStorage();
        scraps.dumpBattery();
        com.bytedance.crash.util.a.w(new File(file, FILE_NAME), scraps);
    }

    private void dumpBattery() {
        this.mBatteryLevel = com.bytedance.crash.a0.e.b();
    }

    private void dumpMiniApp() {
        if (!D.f()) {
            this.mIsMiniApp = false;
            return;
        }
        this.mIsMiniApp = true;
        this.mMiniAppId = D.b();
        this.mMiniAppVersion = D.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(11:3|4|5|6|7|8|9|(5:16|17|18|19|20)(1:11)|12|13|14)|29|6|7|8|9|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0029, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void dumpStorage() {
        /*
            r8 = this;
            android.content.Context r0 = com.bytedance.crash.C0652g.g()
            r1 = 0
            if (r0 != 0) goto L9
            goto L1b
        L9:
            java.io.File r0 = r0.getFilesDir()
            android.os.StatFs r3 = new android.os.StatFs     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L1b
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            long r3 = r3.getTotalBytes()     // Catch: java.lang.Throwable -> L1b
            goto L1c
        L1b:
            r3 = r1
        L1c:
            r8.mStorageTotalSize = r3
            long r3 = com.bytedance.crash.dumper.a.y()
            r8.mStorageFreeSize = r3
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Throwable -> L29
            goto L2a
        L29:
            r0 = 0
        L2a:
            java.lang.String r3 = "mounted"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L50
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Throwable -> L4e
            android.os.StatFs r3 = new android.os.StatFs     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L4e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4e
            long r4 = r3.getAvailableBytes()     // Catch: java.lang.Throwable -> L4e
            long r6 = r3.getBlockSizeLong()     // Catch: java.lang.Throwable -> L53
            long r0 = r3.getBlockCountLong()     // Catch: java.lang.Throwable -> L53
            long r6 = r6 * r0
            r1 = r4
            goto L51
        L4e:
            r4 = r1
            goto L53
        L50:
            r6 = r1
        L51:
            r4 = r1
            r1 = r6
        L53:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r0.<init>(r1, r2)
            java.lang.Object r1 = r0.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r8.mSdcardTotalSize = r1
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r8.mSdcardFreeSize = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.dumper.Scraps.dumpStorage():void");
    }

    private void loadBattery(@NonNull JSONObject jSONObject) {
        try {
            jSONObject.put(BATTERY, this.mBatteryLevel);
        } catch (Throwable unused) {
        }
    }

    private void loadStorage(@NonNull JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(SDCARD_TOTAL, this.mSdcardTotalSize / 52428800);
            jSONObject2.put(SDCARD_FREE, this.mSdcardFreeSize / 52428800);
            jSONObject2.put(INNER_FREE, a.i(this.mStorageFreeSize));
            jSONObject2.put(INNER_TOTAL, a.i(this.mStorageTotalSize));
            jSONObject2.put(INNER_FREE_REAL, this.mStorageFreeSize / 52428800);
            jSONObject2.put(INNER_TOTAL_REAL, this.mStorageTotalSize / 52428800);
            jSONObject2.put(INNER_UNIT, 52428800);
            jSONObject.put(STORAGE, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static void pushTo(@NonNull JSONObject jSONObject, File file) {
        Scraps scraps = file != null ? (Scraps) com.bytedance.crash.util.a.n(new File(file, FILE_NAME)) : null;
        if (scraps == null) {
            scraps = new Scraps();
            scraps.dumpMiniApp();
            scraps.dumpStorage();
            scraps.dumpBattery();
        }
        scraps.loadMiniApp(jSONObject);
        scraps.loadStorage(jSONObject);
        scraps.loadBattery(jSONObject);
    }

    public void loadMiniApp(@NonNull JSONObject jSONObject) {
        try {
            if (this.mIsMiniApp) {
                jSONObject.put("is_mp", 1);
                jSONObject.put("miniapp_id", this.mMiniAppId);
                jSONObject.put("miniapp_version", this.mMiniAppVersion);
            } else {
                jSONObject.put("miniapp_id", 0);
            }
        } catch (Throwable unused) {
        }
    }

    public static void pushTo(@NonNull JSONObject jSONObject) {
        pushTo(jSONObject, null);
    }
}
