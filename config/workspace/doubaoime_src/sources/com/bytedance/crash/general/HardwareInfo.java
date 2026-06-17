package com.bytedance.crash.general;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.io.Serializable;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class HardwareInfo implements Serializable {
    private static final String FILE_NAME = "hardware.inf";
    public static final String KEY_HW_CPU_ABI = "cpu_abi";
    public static final String KEY_HW_CPU_HARDWARE = "hardware";
    public static final String KEY_HW_CPU_MODEL = "cpu_model";
    public static final String KEY_HW_DENSITY_DPI = "density_dpi";
    public static final String KEY_HW_DISPLAY_DENSITY = "display_density";
    public static final String KEY_HW_DISPLAY_RESOLUTION = "resolution";
    public static final String KEY_HW_RAM_SIZE = "ram_size";
    public static final String KEY_HW_VENDOR_BRAND = "device_brand";
    public static final String KEY_HW_VENDOR_MANUFACTURER = "device_manufacturer";
    public static final String KEY_HW_VENDOR_MODEL = "device_model";
    private static final long serialVersionUID = 20241001154124L;
    private String mCpuAbi;
    private String mCpuHardware;
    private String mCpuModel;
    private String mDisplayDensity;
    private int mDisplayDensityDpi;
    private String mDisplayResolution;
    private long mJiffies;
    private String mRamSize;
    private String mVendorBrand;
    private String mVendorManufacturer;
    private String mVendorModel;

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00bc, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00e0, code lost:
    
        if (r9 != 0) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fc A[Catch: IOException -> 0x01f8, TRY_LEAVE, TryCatch #1 {IOException -> 0x01f8, blocks: (B:137:0x01f4, B:128:0x01fc), top: B:136:0x01f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3  */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v23, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.BufferedReader] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.bytedance.crash.general.HardwareInfo get(@androidx.annotation.NonNull android.content.Context r31, @androidx.annotation.NonNull java.io.File r32) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.general.HardwareInfo.get(android.content.Context, java.io.File):com.bytedance.crash.general.HardwareInfo");
    }

    long getJiffy() {
        return this.mJiffies;
    }

    void putTo(@NonNull JSONObject jSONObject) {
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_VENDOR_BRAND, this.mVendorBrand);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_VENDOR_MODEL, this.mVendorModel);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_VENDOR_MANUFACTURER, this.mVendorManufacturer);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_DENSITY_DPI, Integer.valueOf(this.mDisplayDensityDpi));
        com.bytedance.android.input.k.b.a.y0(jSONObject, "resolution", this.mDisplayResolution);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_DISPLAY_DENSITY, this.mDisplayDensity);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_CPU_ABI, this.mCpuAbi);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_CPU_HARDWARE, this.mCpuHardware);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_CPU_MODEL, this.mCpuModel);
        com.bytedance.android.input.k.b.a.y0(jSONObject, KEY_HW_RAM_SIZE, this.mRamSize);
    }
}
