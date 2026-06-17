package com.bytedance.android.input.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.preference.PreferenceManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.h.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class j implements SharedPreferences.OnSharedPreferenceChangeListener {
    private static j j;
    public static final List<String> k = Arrays.asList("kMicrosoft", "kZhiNengABC", "kZiRanMa", "kGuoBiao", "kSogou", "kPinYinJiaJia", "kXiaoHe", "kZiGuang");
    public static HashMap<String, Integer> l = new HashMap<>();
    public static final List<String> m = Arrays.asList("kZEqualToZh", "kCEqualToCh", "kSEqualToSh", "kAnEqualToAng", "kEnEqualToEng", "kInEqualToIng");
    private Context a;
    private SharedPreferences b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences.Editor f2196c;

    /* renamed from: d, reason: collision with root package name */
    private com.bytedance.android.input.h.c f2197d;

    /* renamed from: e, reason: collision with root package name */
    private b f2198e = new b(null);

    /* renamed from: f, reason: collision with root package name */
    private boolean f2199f = false;

    /* renamed from: g, reason: collision with root package name */
    private Integer f2200g = 4;
    private Integer h = 0;
    private boolean i;

    private final class b implements ServiceConnection {
        private int a = 0;

        b(a aVar) {
        }

        public void a(int i) {
            this.a = i | this.a;
        }

        public void b(boolean z) {
            if (z && j.this.f2197d != null && (this.a & 1) != 0) {
                j jVar = j.this;
                jVar.c(jVar.b);
            }
            this.a = 0;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            j.this.f2197d = c.a.d(iBinder);
            b(true);
            j.this.i = false;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            j.this.f2197d = null;
            b(false);
            j.this.i = false;
        }
    }

    private j(Context context) {
        new Handler(Looper.getMainLooper());
        this.i = false;
        this.a = context;
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        StringBuilder M = e.a.a.a.a.M("PreferenceManager get = ");
        M.append(this.b.toString());
        com.bytedance.android.input.r.j.m("SettingsConfig", M.toString());
        this.f2196c = this.b.edit();
        a(0);
        l.put("kZEqualToZh", 0);
        l.put("kCEqualToCh", 1);
        l.put("kSEqualToSh", 2);
        l.put("kLEqualToN", 3);
        l.put("kFEqualToH", 4);
        l.put("kREqualToL", 5);
        l.put("kAnEqualToAng", 6);
        l.put("kEnEqualToEng", 7);
        l.put("kInEqualToIng", 8);
        l.put("kIanEqualToIang", 9);
        l.put("kUanEqualToUang", 10);
        l.put("kUnEqualToOng", 11);
        l.put("kHuiEqualToFei", 12);
        l.put("kHuangEqualToWang", 13);
    }

    private void a(int i) {
        this.f2198e.a(i);
        if (this.i) {
            return;
        }
        String packageName = this.a.getPackageName();
        Intent intent = new Intent(e.a.a.a.a.s(packageName, ".TaskService"));
        intent.setPackage(packageName);
        this.a.bindService(intent, this.f2198e, 1);
        this.i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(SharedPreferences sharedPreferences) {
        if (this.f2197d == null) {
            Objects.requireNonNull(this.f2198e);
            a(1);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : sharedPreferences.getAll().keySet()) {
            Object obj = sharedPreferences.getAll().get(str);
            if (!l.keySet().contains(str)) {
                List<String> list = k;
                if (!list.contains(str)) {
                    try {
                        if (obj instanceof Boolean) {
                            jSONObject.put(str, obj);
                        }
                        if (obj instanceof Integer) {
                            jSONObject.put(str, obj);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                } else if (((Boolean) obj).booleanValue()) {
                    this.f2200g = Integer.valueOf(list.indexOf(str));
                }
            } else if (((Boolean) obj).booleanValue()) {
                this.h = Integer.valueOf((1 << l.get(str).intValue()) | this.h.intValue());
            } else {
                this.h = Integer.valueOf((~(1 << l.get(str).intValue())) & this.h.intValue());
            }
        }
        try {
            jSONObject.put(this.a.getString(C0838R.string.fuzzy_type), this.h);
            jSONObject.put(this.a.getString(C0838R.string.shuangpin_scheme), this.f2200g);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        jSONObject.toString();
    }

    public static j l(Context context) {
        if (j == null) {
            synchronized (j.class) {
                if (j == null) {
                    j = new j(context);
                }
            }
        }
        return j;
    }

    public void b() {
        if (this.f2197d == null) {
            Objects.requireNonNull(this.f2198e);
            a(2);
        }
    }

    public void d() {
        if (this.f2197d == null) {
            Objects.requireNonNull(this.f2198e);
            a(4);
        }
    }

    public void e() {
        com.bytedance.android.input.r.j.m("SettingsConfig", "RegisterListener");
        this.b.registerOnSharedPreferenceChangeListener(this);
    }

    public void f() {
        com.bytedance.android.input.r.j.m("SettingsConfig", "UnRegisterListener");
        this.b.unregisterOnSharedPreferenceChangeListener(this);
    }

    public void m() {
        n(this.a.getString(C0838R.string.enable_fuzzy), false, false);
        n(this.a.getString(C0838R.string.enable_cloud), true, false);
        n(this.a.getString(C0838R.string.enable_correct), true, false);
        n(this.a.getString(C0838R.string.enable_key_sound), false, false);
        n(this.a.getString(C0838R.string.enable_key_vibrate), false, false);
        n(this.a.getString(C0838R.string.enable_key_bubbles), false, false);
        n(this.a.getString(C0838R.string.enable_key_fusiyin), false, false);
        n(this.a.getString(C0838R.string.enable_bot_correct), true, false);
        n(this.a.getString(C0838R.string.enable_first_letter_capitalization), false, false);
        n(this.a.getString(C0838R.string.enable_auto_smart_recommend), false, false);
        n(this.a.getString(C0838R.string.enable_auto_write_recommend), false, false);
        n(this.a.getString(C0838R.string.enable_update_contacts), false, false);
        n(this.a.getString(C0838R.string.enable_offline_asr), false, false);
        n(this.a.getString(C0838R.string.enable_double_click_space), false, false);
        o(this.a.getString(C0838R.string.enable_ai_chat_assistant_all), -1, false);
        o(this.a.getString(C0838R.string.candidate_delay_refresh), 50, false);
        n(this.a.getString(C0838R.string.enable_ai_chat_assistant_wechat), false, false);
        n(this.a.getString(C0838R.string.enable_ai_chat_assistant_qq), false, false);
        o(this.a.getString(C0838R.string.key_feedback_repose_mode), 0, false);
        for (String str : l.keySet()) {
            n(str, m.contains(str), false);
        }
        for (String str2 : k) {
            if (str2.equals("kSogou")) {
                this.f2196c.putBoolean(str2, str2.equals("kSogou"));
            }
        }
        this.f2199f = true;
        this.f2196c.apply();
        this.f2199f = false;
        c(this.b);
    }

    public void n(String str, boolean z, boolean z2) {
        this.f2196c.putBoolean(str, z);
        if (z2) {
            this.f2196c.apply();
        }
    }

    public void o(String str, int i, boolean z) {
        this.f2196c.putInt(str, i);
        if (z) {
            this.f2196c.apply();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str.equals(this.a.getString(C0838R.string.input_mode)) || str.equals(this.a.getString(C0838R.string.enable_global_context)) || str.equals(this.a.getString(C0838R.string.enable_download_test_env_asr_mode)) || this.f2199f) {
            return;
        }
        if (!k.contains(str)) {
            c(sharedPreferences);
        } else if (sharedPreferences.getBoolean(str, false)) {
            c(sharedPreferences);
        }
    }
}
