package com.bytedance.bdinstall.k0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import com.bytedance.crash.general.HardwareInfo;
import com.bytedance.crash.general.RomInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class e extends d {
    e(Context context) {
        super(true, false);
    }

    @Override // com.bytedance.bdinstall.k0.d
    @SuppressLint({"MissingPermission"})
    protected boolean a(JSONObject jSONObject) throws JSONException, SecurityException {
        jSONObject.put(RomInfo.KEY_OS_TYPE, "Android");
        jSONObject.put(RomInfo.KEY_ROM_OS_VERSION, Build.VERSION.RELEASE);
        jSONObject.put(RomInfo.KEY_ROM_OS_API, Build.VERSION.SDK_INT);
        String str = Build.BRAND;
        jSONObject.put(HardwareInfo.KEY_HW_VENDOR_MODEL, str.equals("Pico") ? com.bytedance.bdinstall.util.n.b() : Build.MODEL);
        jSONObject.put(HardwareInfo.KEY_HW_VENDOR_BRAND, str);
        jSONObject.put(HardwareInfo.KEY_HW_VENDOR_MANUFACTURER, Build.MANUFACTURER);
        jSONObject.put(HardwareInfo.KEY_HW_CPU_ABI, Build.CPU_ABI);
        return true;
    }
}
