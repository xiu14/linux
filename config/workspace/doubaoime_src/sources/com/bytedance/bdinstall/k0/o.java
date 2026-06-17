package com.bytedance.bdinstall.k0;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.bdinstall.C0640u;
import com.bytedance.crash.general.HardwareInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class o extends d {

    /* renamed from: e, reason: collision with root package name */
    private final Context f4036e;

    o(Context context) {
        super(true, false);
        this.f4036e = context;
    }

    @Override // com.bytedance.bdinstall.k0.d
    protected boolean a(JSONObject jSONObject) throws JSONException {
        Throwable th;
        int i;
        int i2;
        String str = "mdpi";
        DisplayMetrics displayMetrics = this.f4036e.getResources().getDisplayMetrics();
        try {
            int i3 = displayMetrics.densityDpi;
            String str2 = i3 != 120 ? i3 != 240 ? i3 != 320 ? "mdpi" : "xhdpi" : "hdpi" : "ldpi";
            jSONObject.put(HardwareInfo.KEY_HW_DENSITY_DPI, i3);
            jSONObject.put(HardwareInfo.KEY_HW_DISPLAY_DENSITY, str2);
            jSONObject.put("resolution", displayMetrics.heightPixels + "x" + displayMetrics.widthPixels);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        int i4 = displayMetrics.densityDpi;
        if (i4 <= 120) {
            str = "ldpi";
        } else if (i4 > 160) {
            str = i4 <= 240 ? "hdpi" : i4 <= 320 ? "xhdpi" : i4 <= 480 ? "xxhdpi" : i4 <= 640 ? "xxxhdpi" : "xxxxhdpi";
        }
        jSONObject.put("display_density_v2", str);
        try {
            WindowManager windowManager = (WindowManager) this.f4036e.getSystemService("window");
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
            i = displayMetrics2.widthPixels;
            try {
                i2 = displayMetrics2.heightPixels;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                i2 = 0;
                int[] iArr = {i, i2};
                jSONObject.put("resolution_v2", iArr[1] + "x" + iArr[0]);
                int i5 = C0640u.a;
                return true;
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
        }
        int[] iArr2 = {i, i2};
        jSONObject.put("resolution_v2", iArr2[1] + "x" + iArr2[0]);
        int i52 = C0640u.a;
        return true;
    }
}
