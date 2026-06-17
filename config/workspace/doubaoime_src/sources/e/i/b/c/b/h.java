package e.i.b.c.b;

import android.content.Context;
import android.media.AudioManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.doubaoime.C0838R;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class h {
    private static boolean A = false;
    private static int B = 0;
    private static boolean C = false;
    private static int D = 0;
    private static HashMap<Integer, Pair<Integer, Integer>> E = null;
    public static boolean F = false;
    private static TypedValue G = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10005f = false;

    /* renamed from: g, reason: collision with root package name */
    private static int f10006g = 177;
    private static int h = 33;
    private static int i = 5;
    private static int j = 127;
    private static int k = 204;
    private static int l = 15;
    private static int m = 355;
    private static int n = 38;
    private static int o = 6;
    private static int p = 255;
    private static int q = 102;
    private static int r = 18;
    private static int s = 88;
    private static int t = 76;
    private static int u = 5;
    private static int v = 63;
    private static int w = 204;
    private static int x = 8;
    public static String y;
    private static boolean z;
    private final WeakReference<View> a;
    private boolean b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10007c = true;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10008d = true;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10009e;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002c, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) != false) goto L5;
     */
    static {
        /*
            java.lang.String r0 = "Phoenix"
            java.lang.String r1 = "ro.pvr.product.name"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r3 = 1
            r4 = 0
            java.lang.String r5 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = "get"
            r7 = 2
            java.lang.Class[] r8 = new java.lang.Class[r7]     // Catch: java.lang.Exception -> L2e
            r8[r4] = r2     // Catch: java.lang.Exception -> L2e
            r8[r3] = r2     // Catch: java.lang.Exception -> L2e
            java.lang.reflect.Method r2 = r5.getMethod(r6, r8)     // Catch: java.lang.Exception -> L2e
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch: java.lang.Exception -> L2e
            r6[r4] = r1     // Catch: java.lang.Exception -> L2e
            r6[r3] = r0     // Catch: java.lang.Exception -> L2e
            java.lang.Object r1 = r2.invoke(r5, r6)     // Catch: java.lang.Exception -> L2e
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2e
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2e
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            e.i.b.c.b.h.y = r1
            boolean r1 = r0.equals(r1)
            e.i.b.c.b.h.z = r1
            java.lang.String r1 = e.i.b.c.b.h.y
            boolean r0 = r0.equals(r1)
            e.i.b.c.b.h.A = r0
            e.i.b.c.b.h.B = r4
            e.i.b.c.b.h.C = r3
            r0 = -1
            e.i.b.c.b.h.D = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            e.i.b.c.b.h.E = r0
            e.i.b.c.b.h.F = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.b.c.b.h.<clinit>():void");
    }

    public h(View view) {
        this.a = new WeakReference<>(view);
        Context context = view.getContext();
        if (G == null) {
            G = new TypedValue();
        }
        context.getTheme().resolveAttribute(C0838R.attr.oui_effect_enabled, G, true);
        this.f10009e = G.data != 0;
    }

    private void a(boolean z2) {
        if (this.a.get() != null) {
            int i2 = !z2 ? 1 : 0;
            if (C && this.f10007c) {
                this.a.get().getContext();
                int i3 = D;
                if (z && i3 >= 100000) {
                    if (F) {
                        Log.i("OUIEffectHelper", "onVibrate: effectType=" + i2 + ", deviceId=" + i3);
                    }
                    if (i3 != 100001) {
                    }
                }
            }
            if (this.f10008d) {
                Context context = this.a.get().getContext();
                int i4 = D;
                if (!A || i4 < 100000) {
                    return;
                }
                Pair<Integer, Integer> pair = E.get(Integer.valueOf(i4));
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (pair == null) {
                    if (F) {
                        Log.i("OUIEffectHelper", "playSoundEffect: pair is empty");
                        return;
                    }
                    return;
                }
                if (F) {
                    Log.i("OUIEffectHelper", "playSoundEffect: effectType=" + i2 + ", deviceId=" + i4);
                }
                int i5 = 10;
                if (i2 == 0) {
                    i5 = ((Integer) pair.first).intValue();
                } else if (i2 == 1) {
                    i5 = ((Integer) pair.second).intValue();
                }
                audioManager.playSoundEffect(i5, 1.0f);
            }
        }
    }

    private static int d(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getInt(str);
        } catch (JSONException unused) {
            return -1;
        }
    }

    private static String e(JSONObject jSONObject, String str) {
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return "";
        }
    }

    private static boolean f(String str) {
        String[] split = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if (split.length > 0) {
            for (String str2 : split) {
                if (y.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b(MotionEvent motionEvent) {
        D = motionEvent.getDeviceId();
    }

    public void c(MotionEvent motionEvent) {
        D = motionEvent.getDeviceId();
    }

    public /* synthetic */ void g() {
        this.b = true;
    }

    public void h(boolean z2) {
        if (this.f10009e && z2 && this.b) {
            a(true);
        }
    }

    public void i(int i2) {
        boolean z2;
        if (i2 != 0) {
            if (F) {
                Log.i("OUIEffectHelper", "onWindowHide: ");
            }
            f10005f = false;
            return;
        }
        View view = this.a.get();
        if (view == null || view.getContext() == null || f10005f) {
            return;
        }
        f10005f = true;
        Context context = view.getContext();
        E.clear();
        B = Settings.Global.getInt(context.getContentResolver(), "controller_vibration_level", 0);
        C = Settings.Global.getInt(context.getContentResolver(), "system_vibration_enabled", 1) == 1;
        String string = Settings.Global.getString(context.getContentResolver(), "pvr_ui_config");
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vibration");
                    f10006g = d(jSONObject2, "def_hover_fre");
                    h = d(jSONObject2, "def_hover_level");
                    i = d(jSONObject2, "def_hover_dur");
                    j = d(jSONObject2, "def_press_fre");
                    k = d(jSONObject2, "def_press_level");
                    l = d(jSONObject2, "def_press_dur");
                    m = d(jSONObject2, "weak_hover_fre");
                    n = d(jSONObject2, "weak_hover_level");
                    o = d(jSONObject2, "weak_hover_dur");
                    p = d(jSONObject2, "weak_press_fre");
                    q = d(jSONObject2, "weak_press_level");
                    r = d(jSONObject2, "weak_press_dur");
                    s = d(jSONObject2, "strong_hover_fre");
                    t = d(jSONObject2, "strong_hover_level");
                    u = d(jSONObject2, "strong_hover_dur");
                    v = d(jSONObject2, "strong_press_fre");
                    w = d(jSONObject2, "strong_press_level");
                    x = d(jSONObject2, "strong_press_dur");
                    String e2 = e(jSONObject2, "device_allowed");
                    try {
                        z2 = jSONObject2.getBoolean(DownloadSettingKeys.DEBUG);
                    } catch (JSONException unused) {
                        z2 = false;
                    }
                    F = z2;
                    if (!TextUtils.isEmpty(e2)) {
                        z = f(e2);
                    }
                } catch (JSONException e3) {
                    if (F) {
                        Log.e("OUIEffectHelper", "onWindowShow: parse vibration error=" + e3);
                    }
                }
                try {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(RemoteMessageConst.Notification.SOUND);
                    String e4 = e(jSONObject3, "device_allowed");
                    if (!TextUtils.isEmpty(e4)) {
                        A = f(e4);
                    }
                    String e5 = e(jSONObject3, "device_id_effect_type");
                    if (!TextUtils.isEmpty(e5)) {
                        String[] split = e5.split(";");
                        if (split.length > 0) {
                            for (String str : split) {
                                String[] split2 = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                if (split2.length == 3) {
                                    try {
                                        E.put(Integer.valueOf(Integer.parseInt(split2[0])), new Pair<>(Integer.valueOf(Integer.parseInt(split2[1])), Integer.valueOf(Integer.parseInt(split2[2]))));
                                    } catch (Exception e6) {
                                        if (F) {
                                            Log.e("OUIEffectHelper", "onWindowShow: parse vibration device_id_effect_type error=" + e6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (JSONException e7) {
                    if (F) {
                        Log.e("OUIEffectHelper", "onWindowShow: parse sound error=" + e7);
                    }
                }
            } catch (JSONException e8) {
                if (F) {
                    Log.e("OUIEffectHelper", "onWindowShow: parse uiConfig error=" + e8);
                }
            }
        }
        if (F) {
            StringBuilder U = e.a.a.a.a.U("updateConfig: ", string, ", sIsDeviceVibrateAllowed=");
            U.append(z);
            U.append(", sIsDeviceSoundAllowed=");
            U.append(A);
            U.append(", sDeviceType=");
            U.append(y);
            Log.i("OUIEffectHelper", U.toString());
        }
        if (F) {
            StringBuilder M = e.a.a.a.a.M("onWindowShow: mAppEffectEnabled=");
            M.append(this.f10009e);
            Log.i("OUIEffectHelper", M.toString());
        }
    }

    public void j(boolean z2) {
        View view;
        if (this.f10009e && (view = this.a.get()) != null && (view.isPressed() ^ z2)) {
            if (!z2) {
                view.postDelayed(new Runnable() { // from class: e.i.b.c.b.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.g();
                    }
                }, 20L);
            } else {
                a(false);
                this.b = false;
            }
        }
    }

    public void k(boolean z2) {
        this.f10008d = z2;
    }

    public void l(boolean z2) {
        this.f10007c = z2;
    }
}
