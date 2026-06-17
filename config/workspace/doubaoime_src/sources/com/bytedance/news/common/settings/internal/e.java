package com.bytedance.news.common.settings.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.news.common.settings.SettingsConfigProvider;
import com.google.gson.i;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.r;
import com.google.gson.stream.JsonToken;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: g, reason: collision with root package name */
    private static volatile e f5519g;
    private SharedPreferences a;
    private HashMap<String, com.bytedance.news.common.settings.e.d> b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final com.bytedance.news.common.settings.e.d f5520c = new com.bytedance.news.common.settings.e.d(null, null, "", false);

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f5521d;

    /* renamed from: e, reason: collision with root package name */
    private JSONObject f5522e;

    /* renamed from: f, reason: collision with root package name */
    private Context f5523f;

    private e(Context context) {
        this.f5523f = context;
        SettingsConfigProvider settingsConfigProvider = (SettingsConfigProvider) com.bytedance.news.common.service.manager.c.a(SettingsConfigProvider.class);
        if (settingsConfigProvider != null && settingsConfigProvider.getConfig() != null) {
            settingsConfigProvider.getConfig().l(context, "__local_settings_data.sp", 0, false);
            this.a = null;
        }
        if (this.a == null) {
            this.a = context.getSharedPreferences("__local_settings_data.sp", 0);
        }
    }

    private static String a(String str, String str2) {
        return TextUtils.isEmpty(str2) ? str : e.a.a.a.a.t(str, BundleUtil.UNDERLINE_TAG, str2);
    }

    public static e c(Context context) {
        if (f5519g == null) {
            synchronized (e.class) {
                if (f5519g == null) {
                    f5519g = new e(context);
                }
            }
        }
        return f5519g;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g(@androidx.annotation.NonNull com.bytedance.news.common.settings.a r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.news.common.settings.internal.e.g(com.bytedance.news.common.settings.a, boolean):void");
    }

    private void i(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (this.f5522e == null) {
            this.f5522e = new JSONObject();
        }
        this.f5522e.put(str, obj);
        jSONObject.put(str, obj);
    }

    public JSONObject b() {
        try {
            return new JSONObject(this.a.getString("key_safe_mode_fixed_settings", "{}"));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    @Nullable
    public synchronized com.bytedance.news.common.settings.e.d d(String str) {
        com.bytedance.news.common.settings.e.d dVar = this.b.get(str);
        if (dVar != null) {
            if (dVar == this.f5520c) {
                dVar = null;
            }
            return dVar;
        }
        String string = this.a.getString(a("key_local_app_settings_data", str), "");
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                String string2 = this.a.getString(a("key_local_user_settings_data", str), "");
                com.bytedance.news.common.settings.e.d dVar2 = new com.bytedance.news.common.settings.e.d(jSONObject, !TextUtils.isEmpty(string2) ? new JSONObject(string2) : new JSONObject(), this.a.getString(a("key_last_update_token", str), ""), false);
                this.b.put(str, dVar2);
                return dVar2;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        this.b.put(str, this.f5520c);
        return null;
    }

    public boolean e() {
        if (this.a.contains("key_safe_mode_fixing_timestamp") && this.a.contains("key_safe_mode_expiring_time")) {
            r2 = System.currentTimeMillis() - this.a.getLong("key_safe_mode_fixing_timestamp", 0L) <= this.a.getLong("key_safe_mode_expiring_time", 0L);
            if (!r2) {
                f();
            }
        }
        return r2;
    }

    public void f() {
        this.a.edit().remove("key_safe_mode_fixing_timestamp").remove("key_safe_mode_expiring_time").remove("key_safe_mode_fixed_settings").apply();
    }

    public synchronized void h(com.bytedance.news.common.settings.e.d dVar, @NonNull com.bytedance.news.common.settings.a aVar, boolean z) {
        JSONObject a = dVar.a();
        JSONObject c2 = dVar.c();
        com.bytedance.news.common.settings.e.d d2 = d(aVar.d());
        if (d2 != null) {
            JSONObject a2 = d2.a();
            JSONObject c3 = d2.c();
            if (a2 == null) {
                a2 = new JSONObject();
            }
            JSONObject jSONObject = a2;
            if (c3 == null) {
                c3 = new JSONObject();
            }
            if (a != null) {
                Iterator<String> keys = a.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        Object opt = a.opt(next);
                        Object opt2 = jSONObject.opt(next);
                        String valueOf = String.valueOf(opt);
                        String valueOf2 = String.valueOf(opt2);
                        if ((opt instanceof JSONObject) && (opt2 instanceof JSONObject)) {
                            try {
                                try {
                                    com.google.gson.stream.a aVar2 = new com.google.gson.stream.a(new StringReader(valueOf));
                                    i a3 = n.a(aVar2);
                                    Objects.requireNonNull(a3);
                                    if (!(a3 instanceof k) && aVar2.c0() != JsonToken.END_DOCUMENT) {
                                        throw new r("Did not consume the entire document.");
                                    }
                                    l lVar = (l) a3;
                                    try {
                                        com.google.gson.stream.a aVar3 = new com.google.gson.stream.a(new StringReader(valueOf2));
                                        i a4 = n.a(aVar3);
                                        Objects.requireNonNull(a4);
                                        if (!(a4 instanceof k) && aVar3.c0() != JsonToken.END_DOCUMENT) {
                                            throw new r("Did not consume the entire document.");
                                        }
                                        if (!lVar.equals((l) a4)) {
                                            i(jSONObject, next, opt);
                                        }
                                    } catch (com.google.gson.stream.c e2) {
                                        throw new r(e2);
                                    } catch (IOException e3) {
                                        throw new j(e3);
                                    } catch (NumberFormatException e4) {
                                        throw new r(e4);
                                    }
                                } catch (com.google.gson.stream.c e5) {
                                    throw new r(e5);
                                } catch (IOException e6) {
                                    throw new j(e6);
                                } catch (NumberFormatException e7) {
                                    throw new r(e7);
                                }
                            } catch (Exception unused) {
                                if (!TextUtils.equals(valueOf, valueOf2)) {
                                    i(jSONObject, next, opt);
                                }
                            }
                        } else if (!TextUtils.equals(valueOf, valueOf2)) {
                            i(jSONObject, next, opt);
                        }
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
            if (c2 != null) {
                Iterator<String> keys2 = c2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    try {
                        Object opt3 = c2.opt(next2);
                        Object opt4 = c3.opt(next2);
                        String valueOf3 = String.valueOf(opt3);
                        String valueOf4 = String.valueOf(opt4);
                        if ((opt3 instanceof JSONObject) && (opt4 instanceof JSONObject)) {
                            try {
                                try {
                                    com.google.gson.stream.a aVar4 = new com.google.gson.stream.a(new StringReader(valueOf3));
                                    i a5 = n.a(aVar4);
                                    Objects.requireNonNull(a5);
                                    if (!(a5 instanceof k) && aVar4.c0() != JsonToken.END_DOCUMENT) {
                                        throw new r("Did not consume the entire document.");
                                    }
                                    l lVar2 = (l) a5;
                                    try {
                                        com.google.gson.stream.a aVar5 = new com.google.gson.stream.a(new StringReader(valueOf4));
                                        i a6 = n.a(aVar5);
                                        Objects.requireNonNull(a6);
                                        if (!(a6 instanceof k) && aVar5.c0() != JsonToken.END_DOCUMENT) {
                                            throw new r("Did not consume the entire document.");
                                        }
                                        if (!lVar2.equals((l) a6)) {
                                            i(c3, next2, opt3);
                                        }
                                    } catch (com.google.gson.stream.c e9) {
                                        throw new r(e9);
                                    } catch (IOException e10) {
                                        throw new j(e10);
                                    } catch (NumberFormatException e11) {
                                        throw new r(e11);
                                    }
                                } catch (com.google.gson.stream.c e12) {
                                    throw new r(e12);
                                } catch (IOException e13) {
                                    throw new j(e13);
                                } catch (NumberFormatException e14) {
                                    throw new r(e14);
                                }
                            } catch (Exception unused2) {
                                if (!TextUtils.equals(valueOf3, valueOf4)) {
                                    i(c3, next2, opt3);
                                }
                            }
                        } else if (!TextUtils.equals(valueOf3, valueOf4)) {
                            i(c3, next2, opt3);
                        }
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
            }
            this.b.put(aVar.d(), d2);
            SharedPreferences.Editor edit = this.a.edit();
            try {
                edit.putString(a("key_last_update_token", aVar.d()), dVar.b());
            } catch (Exception e16) {
                e16.printStackTrace();
            }
            try {
                edit.putString(a("key_local_app_settings_data", aVar.d()), a != null ? jSONObject.toString() : "");
            } catch (Exception e17) {
                e17.printStackTrace();
            }
            try {
                edit.putString(a("key_local_user_settings_data", aVar.d()), c2 != null ? c3.toString() : "");
            } catch (Exception e18) {
                e18.printStackTrace();
            }
            edit.apply();
            g(aVar, z);
        } else {
            this.b.put(aVar.d(), dVar);
            SharedPreferences.Editor edit2 = this.a.edit();
            try {
                edit2.putString(a("key_last_update_token", aVar.d()), dVar.b());
            } catch (Exception e19) {
                e19.printStackTrace();
            }
            try {
                edit2.putString(a("key_local_app_settings_data", aVar.d()), a != null ? a.toString() : "");
            } catch (Exception e20) {
                e20.printStackTrace();
            }
            try {
                edit2.putString(a("key_local_user_settings_data", aVar.d()), c2 != null ? c2.toString() : "");
            } catch (Exception e21) {
                e21.printStackTrace();
            }
            edit2.apply();
        }
    }
}
