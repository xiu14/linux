package com.bytedance.android.input.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.PreferenceManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.doubaoime.KeyboardJni;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SettingsConfigNext implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static final SettingsConfigNext a;
    private static final Map<String, String> b;

    /* renamed from: c, reason: collision with root package name */
    private static final kotlin.e f2160c;

    /* renamed from: d, reason: collision with root package name */
    private static SharedPreferences f2161d;

    /* renamed from: e, reason: collision with root package name */
    private static final SharedPreferences.Editor f2162e;

    /* renamed from: f, reason: collision with root package name */
    private static final HashMap<String, PreferenceInfo> f2163f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f2164g;
    private static boolean h;
    private static final ArrayList<b> i;

    private static final class PreferenceInfo {
        private final String a;
        private final Type b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f2165c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f2166d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f2167e;

        /* renamed from: f, reason: collision with root package name */
        private final Object f2168f;

        public enum Type {
            BOOLEAN("BooleanPreference"),
            INT("IntPreference"),
            STRING("StringPreference"),
            LONG("LongPreference");

            private final String value;

            Type(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        public PreferenceInfo(XmlResourceParser xmlResourceParser, Type type) {
            Object valueOf;
            Object valueOf2;
            Object valueOf3;
            kotlin.s.c.l.f(xmlResourceParser, "xrp");
            kotlin.s.c.l.f(type, "preferenceType");
            Context context = IAppGlobals.a.getContext();
            String string = context.getString(xmlResourceParser.getAttributeResourceValue("http://schemas.app.com/apk/res-auto", "key", -1));
            kotlin.s.c.l.e(string, "getString(xrp.getAttribu…ourceValue(APP, KEY, -1))");
            this.a = string;
            this.b = type;
            this.f2165c = xmlResourceParser.getAttributeBooleanValue("http://schemas.app.com/apk/res-auto", "notifyReload", true);
            int ordinal = type.ordinal();
            int i = 0;
            if (ordinal == 0) {
                valueOf = Boolean.valueOf(xmlResourceParser.getAttributeBooleanValue("http://schemas.app.com/apk/res-auto", "defaultValue", false));
            } else if (ordinal == 1) {
                valueOf = Integer.valueOf(xmlResourceParser.getAttributeIntValue("http://schemas.app.com/apk/res-auto", "defaultValue", 0));
            } else if (ordinal == 2) {
                valueOf = xmlResourceParser.getAttributeValue("http://schemas.app.com/apk/res-auto", "defaultValue");
            } else {
                if (ordinal != 3) {
                    throw new kotlin.f();
                }
                i = xmlResourceParser.getAttributeIntValue("http://schemas.app.com/apk/res-auto", "defaultValue", 0);
                valueOf = Long.valueOf(i);
            }
            kotlin.s.c.l.e(valueOf, "when (preferenceType) {\n…      }\n                }");
            this.f2166d = valueOf;
            int ordinal2 = type.ordinal();
            if (ordinal2 == 0) {
                kotlin.s.c.l.d(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
                valueOf2 = Boolean.valueOf(xmlResourceParser.getAttributeBooleanValue("http://schemas.app.com/apk/res-auto", "defaultValuePacific", ((Boolean) valueOf).booleanValue()));
            } else if (ordinal2 == 1) {
                kotlin.s.c.l.d(valueOf, "null cannot be cast to non-null type kotlin.Int");
                valueOf2 = Integer.valueOf(xmlResourceParser.getAttributeIntValue("http://schemas.app.com/apk/res-auto", "defaultValuePacific", ((Integer) valueOf).intValue()));
            } else if (ordinal2 == 2) {
                valueOf2 = xmlResourceParser.getAttributeValue("http://schemas.app.com/apk/res-auto", "defaultValuePacific");
                if (valueOf2 == null) {
                    kotlin.s.c.l.d(valueOf, "null cannot be cast to non-null type kotlin.String");
                    valueOf2 = (String) valueOf;
                } else {
                    kotlin.s.c.l.e(valueOf2, "xrp.getAttributeValue(AP… (defaultValue as String)");
                }
            } else {
                if (ordinal2 != 3) {
                    throw new kotlin.f();
                }
                valueOf2 = Long.valueOf(xmlResourceParser.getAttributeIntValue("http://schemas.app.com/apk/res-auto", "defaultValuePacific", i));
            }
            this.f2167e = valueOf2;
            int ordinal3 = type.ordinal();
            if (ordinal3 == 0) {
                kotlin.s.c.l.d(valueOf, "null cannot be cast to non-null type kotlin.Boolean");
                valueOf3 = Boolean.valueOf(xmlResourceParser.getAttributeBooleanValue("http://schemas.app.com/apk/res-auto", "defaultValueThirdVersion", ((Boolean) valueOf).booleanValue()));
            } else if (ordinal3 == 1) {
                kotlin.s.c.l.d(valueOf, "null cannot be cast to non-null type kotlin.Int");
                valueOf3 = Integer.valueOf(xmlResourceParser.getAttributeIntValue("http://schemas.app.com/apk/res-auto", "defaultValueThirdVersion", ((Integer) valueOf).intValue()));
            } else if (ordinal3 == 2) {
                valueOf3 = xmlResourceParser.getAttributeValue("http://schemas.app.com/apk/res-auto", "defaultValueThirdVersion");
                if (valueOf3 == null) {
                    kotlin.s.c.l.d(valueOf, "null cannot be cast to non-null type kotlin.String");
                    valueOf3 = (String) valueOf;
                } else {
                    kotlin.s.c.l.e(valueOf3, "xrp.getAttributeValue(AP… (defaultValue as String)");
                }
            } else {
                if (ordinal3 != 3) {
                    throw new kotlin.f();
                }
                valueOf3 = Long.valueOf(xmlResourceParser.getAttributeIntValue("http://schemas.app.com/apk/res-auto", "defaultValueThirdVersion", i));
            }
            this.f2168f = valueOf3;
            int attributeResourceValue = xmlResourceParser.getAttributeResourceValue("http://schemas.app.com/apk/res-auto", "trackParams", -1);
            if (attributeResourceValue == -1) {
                return;
            }
            context.getString(attributeResourceValue);
        }

        public final Object a() {
            return this.f2166d;
        }

        public final Object b() {
            return this.f2167e;
        }

        public final Object c() {
            return this.f2168f;
        }

        public final String d() {
            return this.a;
        }

        public final boolean e() {
            return this.f2165c;
        }

        public final Type f() {
            return this.b;
        }
    }

    public static final class a implements com.bytedance.android.input.basic.settings.api.b {
        a() {
        }

        @Override // com.bytedance.android.input.basic.settings.api.b
        public void onSettingsUpdate() {
            IInputSettings.a aVar = IInputSettings.a;
            com.bytedance.android.input.r.j.i("settings_up", String.valueOf(aVar.d().q()));
            Iterator<T> it2 = aVar.d().q().iterator();
            String str = "";
            while (it2.hasNext()) {
                str = str + ((String) it2.next()) + ',';
            }
            String C = kotlin.text.a.C(str, Constants.ACCEPT_TIME_SEPARATOR_SP);
            String p = IInputSettings.a.d().p();
            IAppGlobals.a aVar2 = IAppGlobals.a;
            String e2 = e.a.a.a.a.e(aVar2, C0838R.string.voice_input_action_send_list, "IAppGlobals.context.getS…e_input_action_send_list)");
            String e3 = e.a.a.a.a.e(aVar2, C0838R.string.voice_input_action_send_default, "IAppGlobals.context.getS…nput_action_send_default)");
            Object f2 = SettingsConfigNext.f(e2);
            kotlin.s.c.l.d(f2, "null cannot be cast to non-null type kotlin.String");
            Object f3 = SettingsConfigNext.f(e3);
            kotlin.s.c.l.d(f3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) f3;
            if (kotlin.s.c.l.a((String) f2, C) && kotlin.s.c.l.a(str2, p)) {
                return;
            }
            SettingsConfigNext.o(e2, C);
            KeyboardJni.updateProviderStringValue(e2, C);
            SettingsConfigNext.o(e3, p);
            KeyboardJni.updateProviderStringValue(e3, p);
        }
    }

    public static abstract class b {
        public abstract void onReset();

        public abstract <T> void onSettingsConfigChanged(String str, T t);
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            PreferenceInfo.Type.values();
            int[] iArr = new int[4];
            try {
                PreferenceInfo.Type type = PreferenceInfo.Type.BOOLEAN;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PreferenceInfo.Type type2 = PreferenceInfo.Type.INT;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PreferenceInfo.Type type3 = PreferenceInfo.Type.STRING;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PreferenceInfo.Type type4 = PreferenceInfo.Type.LONG;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    static final class d extends kotlin.s.c.m implements kotlin.s.b.a<LinkedHashSet<String>> {
        public static final d a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.s.b.a
        public LinkedHashSet<String> invoke() {
            Context context = IAppGlobals.a.getContext();
            String[] strArr = {context.getString(C0838R.string.full_base_input_mode), context.getString(C0838R.string.privacy_statement_pop_has_shown), context.getString(C0838R.string.asr_offline_download_way), context.getString(C0838R.string.asr_offline_model_path), context.getString(C0838R.string.asr_offline_model_download_status)};
            kotlin.s.c.l.f(strArr, "elements");
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(kotlin.collections.g.H(5));
            kotlin.collections.g.d0(strArr, linkedHashSet);
            return linkedHashSet;
        }
    }

    static final class e extends kotlin.s.c.m implements kotlin.s.b.l<b, Boolean> {
        final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(1);
            this.a = bVar;
        }

        @Override // kotlin.s.b.l
        public Boolean invoke(b bVar) {
            b bVar2 = bVar;
            kotlin.s.c.l.f(bVar2, "it");
            return Boolean.valueOf(kotlin.s.c.l.a(bVar2, this.a));
        }
    }

    static {
        PreferenceInfo.Type type;
        SettingsConfigNext settingsConfigNext = new SettingsConfigNext();
        a = settingsConfigNext;
        b = kotlin.collections.g.J(new kotlin.g("btn_speech_bar_two", "asr_big"), new kotlin.g("btn_speech_bar_single", "asr_small"), new kotlin.g("btn_toolbar_common_phrase", "phrase"), new kotlin.g("btn_toolbar_translate", "translation"), new kotlin.g("btn_toolbar_emoji", "expression"), new kotlin.g("btn_toolbar_select_board", "keyboardclear"), new kotlin.g("btn_toolbar_clipboard", "clipboard"), new kotlin.g("btn_toolbar_hans_hant", "tradition"), new kotlin.g("btn_toolbar_one_hand", "onehand"));
        f2160c = kotlin.a.c(d.a);
        IInputSettings.a.i(new a());
        f2163f = new HashMap<>();
        i = new ArrayList<>();
        Context context = IAppGlobals.a.getContext();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        kotlin.s.c.l.e(defaultSharedPreferences, "getDefaultSharedPreferences(this)");
        f2161d = defaultSharedPreferences;
        i.a(f2161d);
        SharedPreferences.Editor edit = f2161d.edit();
        kotlin.s.c.l.e(edit, "mSharedPreferences.edit()");
        f2162e = edit;
        f2161d.registerOnSharedPreferenceChangeListener(settingsConfigNext);
        com.bytedance.android.input.r.j.m("SettingsConfigNext", "PreferenceManager get = " + f2161d);
        XmlResourceParser xml = context.getResources().getXml(C0838R.xml.settings_preferences);
        kotlin.s.c.l.e(xml, "resources.getXml(R.xml.settings_preferences)");
        xml.next();
        for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
            if (eventType == 2) {
                PreferenceInfo.Type[] values = PreferenceInfo.Type.values();
                int i2 = 0;
                while (true) {
                    if (i2 >= 4) {
                        type = null;
                        break;
                    }
                    type = values[i2];
                    if (kotlin.text.a.i(type.getValue(), xml.getName(), true)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (type != null) {
                    StringBuilder M = e.a.a.a.a.M("attributeCount: ");
                    M.append(xml.getAttributeCount());
                    com.bytedance.android.input.r.j.i("SettingsConfigNext", M.toString());
                    PreferenceInfo preferenceInfo = new PreferenceInfo(xml, type);
                    f2163f.put(preferenceInfo.d(), preferenceInfo);
                }
            }
        }
        SettingsConfigNext settingsConfigNext2 = a;
        IAppGlobals.a aVar = IAppGlobals.a;
        f2164g = aVar.F();
        h = aVar.h();
        StringBuilder M2 = e.a.a.a.a.M("isObricSystem: ");
        M2.append(f2164g);
        M2.append(", mIsThirdVersion: ");
        M2.append(h);
        com.bytedance.android.input.r.j.m("SettingsConfigNext", M2.toString());
        f2161d.registerOnSharedPreferenceChangeListener(settingsConfigNext2);
    }

    private SettingsConfigNext() {
    }

    private final String b(int i2) {
        String string = IAppGlobals.a.getContext().getResources().getString(i2);
        kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(resId)");
        return string;
    }

    private final LinkedHashSet<String> d() {
        return (LinkedHashSet) f2160c.getValue();
    }

    public static final Object e(int i2) {
        String string = IAppGlobals.a.getContext().getResources().getString(i2);
        kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(keyId)");
        return f(string);
    }

    public static final Object f(String str) {
        Object valueOf;
        kotlin.s.c.l.f(str, "key");
        HashMap<String, PreferenceInfo> hashMap = f2163f;
        PreferenceInfo preferenceInfo = hashMap.get(str);
        PreferenceInfo.Type f2 = preferenceInfo != null ? preferenceInfo.f() : null;
        int i2 = f2 == null ? -1 : c.a[f2.ordinal()];
        if (i2 == 1) {
            SharedPreferences sharedPreferences = f2161d;
            PreferenceInfo preferenceInfo2 = hashMap.get(str);
            r2 = preferenceInfo2 != null ? preferenceInfo2.a() : null;
            kotlin.s.c.l.d(r2, "null cannot be cast to non-null type kotlin.Boolean");
            valueOf = Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) r2).booleanValue()));
        } else if (i2 == 2) {
            if (f2164g) {
                PreferenceInfo preferenceInfo3 = hashMap.get(str);
                if (preferenceInfo3 != null) {
                    r2 = preferenceInfo3.b();
                }
            } else if (h) {
                PreferenceInfo preferenceInfo4 = hashMap.get(str);
                if (preferenceInfo4 != null) {
                    r2 = preferenceInfo4.c();
                }
            } else {
                PreferenceInfo preferenceInfo5 = hashMap.get(str);
                if (preferenceInfo5 != null) {
                    r2 = preferenceInfo5.a();
                }
            }
            SharedPreferences sharedPreferences2 = f2161d;
            kotlin.s.c.l.d(r2, "null cannot be cast to non-null type kotlin.Int");
            valueOf = Integer.valueOf(sharedPreferences2.getInt(str, ((Integer) r2).intValue()));
        } else if (i2 == 3) {
            SharedPreferences sharedPreferences3 = f2161d;
            PreferenceInfo preferenceInfo6 = hashMap.get(str);
            r2 = preferenceInfo6 != null ? preferenceInfo6.a() : null;
            kotlin.s.c.l.d(r2, "null cannot be cast to non-null type kotlin.String");
            valueOf = sharedPreferences3.getString(str, (String) r2);
            if (valueOf == null) {
                valueOf = "";
            }
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException(e.a.a.a.a.s("Invalid key: ", str));
            }
            SharedPreferences sharedPreferences4 = f2161d;
            PreferenceInfo preferenceInfo7 = hashMap.get(str);
            r2 = preferenceInfo7 != null ? preferenceInfo7.a() : null;
            kotlin.s.c.l.d(r2, "null cannot be cast to non-null type kotlin.Long");
            valueOf = Long.valueOf(sharedPreferences4.getLong(str, ((Long) r2).longValue()));
        }
        SettingsConfigNext settingsConfigNext = a;
        if (settingsConfigNext.d().contains(str) && !f2161d.contains(str)) {
            com.bytedance.android.input.common_biz.performance.k.b("getValue_missing", f2161d, settingsConfigNext.d(), str, valueOf);
        }
        return valueOf;
    }

    public static final Object g(String str, Object obj) {
        Object valueOf;
        kotlin.s.c.l.f(str, "key");
        kotlin.s.c.l.f(obj, DownloadSettingKeys.BugFix.DEFAULT);
        PreferenceInfo preferenceInfo = f2163f.get(str);
        PreferenceInfo.Type f2 = preferenceInfo != null ? preferenceInfo.f() : null;
        int i2 = f2 == null ? -1 : c.a[f2.ordinal()];
        if (i2 == 1) {
            valueOf = Boolean.valueOf(f2161d.getBoolean(str, ((Boolean) obj).booleanValue()));
        } else if (i2 == 2) {
            valueOf = Integer.valueOf(f2161d.getInt(str, ((Integer) obj).intValue()));
        } else if (i2 == 3) {
            valueOf = f2161d.getString(str, (String) obj);
            if (valueOf == null) {
                valueOf = "";
            }
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException(e.a.a.a.a.s("Invalid key: ", str));
            }
            valueOf = Long.valueOf(f2161d.getLong(str, ((Long) obj).longValue()));
        }
        SettingsConfigNext settingsConfigNext = a;
        if (settingsConfigNext.d().contains(str) && !f2161d.contains(str)) {
            com.bytedance.android.input.common_biz.performance.k.b("getValueWithDefault_missing", f2161d, settingsConfigNext.d(), str, valueOf);
        }
        return valueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:321:0x06ba, code lost:
    
        if (r0 == null) goto L260;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:304:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0660  */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.android.input.basic.applog.api.IAppLog$a] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i() {
        /*
            Method dump skipped, instructions count: 1819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.SettingsConfigNext.i():void");
    }

    public static final void k(int i2, Object obj) {
        kotlin.s.c.l.f(obj, PushLog.KEY_VALUE);
        String string = IAppGlobals.a.getContext().getResources().getString(i2);
        kotlin.s.c.l.e(string, "IAppGlobals.context.resources.getString(keyId)");
        l(string, obj);
    }

    public static final void l(String str, Object obj) {
        kotlin.s.c.l.f(str, "key");
        kotlin.s.c.l.f(obj, PushLog.KEY_VALUE);
        if (kotlin.s.c.l.a(f(str), obj)) {
            return;
        }
        o(str, obj);
    }

    public static final void o(String str, Object obj) {
        kotlin.s.c.l.f(str, "key");
        kotlin.s.c.l.f(obj, PushLog.KEY_VALUE);
        IAppGlobals.a.getContext();
        String e2 = d.a.b.a.e();
        StringBuilder sb = new StringBuilder();
        sb.append("setValueForce: ");
        sb.append(str);
        sb.append(", value: ");
        sb.append(obj);
        sb.append(", processName: ");
        e.a.a.a.a.H0(sb, e2, "SettingsConfigNext");
        PreferenceInfo preferenceInfo = f2163f.get(str);
        PreferenceInfo.Type f2 = preferenceInfo != null ? preferenceInfo.f() : null;
        int i2 = f2 == null ? -1 : c.a[f2.ordinal()];
        if (i2 == 1) {
            f2162e.putBoolean(str, ((Boolean) obj).booleanValue()).apply();
            return;
        }
        if (i2 == 2) {
            f2162e.putInt(str, ((Integer) obj).intValue()).apply();
        } else if (i2 == 3) {
            f2162e.putString(str, (String) obj).apply();
        } else {
            if (i2 != 4) {
                return;
            }
            f2162e.putLong(str, ((Long) obj).longValue()).apply();
        }
    }

    public final String a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        Map<String, ?> all = f2161d.getAll();
        for (Map.Entry<String, PreferenceInfo> entry : f2163f.entrySet()) {
            String key = entry.getKey();
            PreferenceInfo value = entry.getValue();
            kotlin.s.c.l.f(key, "key");
            IAppGlobals.a.getContext();
            String e2 = d.a.b.a.e();
            boolean z2 = !f2161d.contains(key);
            StringBuilder sb = new StringBuilder();
            sb.append("isDefaultValue: ");
            sb.append(key);
            sb.append(", isdefault: ");
            sb.append(z2);
            sb.append(", processName: ");
            e.a.a.a.a.H0(sb, e2, "SettingsConfigNext");
            if (!z2) {
                jSONObject.put(key, all.get(key));
            } else if (z) {
                jSONObject.put(key, value.a());
            }
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.s.c.l.e(jSONObject2, "JSONObject().apply {\n   …   }\n        }.toString()");
        return jSONObject2;
    }

    public final SharedPreferences c() {
        return f2161d;
    }

    public final boolean h(String str) {
        kotlin.s.c.l.f(str, "key");
        IAppGlobals.a.getContext();
        String e2 = d.a.b.a.e();
        boolean z = !f2161d.contains(str);
        StringBuilder sb = new StringBuilder();
        sb.append("isDefaultValue: ");
        sb.append(str);
        sb.append(", isdefault: ");
        sb.append(z);
        sb.append(", processName: ");
        e.a.a.a.a.H0(sb, e2, "SettingsConfigNext");
        return z;
    }

    public final void j(b bVar) {
        kotlin.s.c.l.f(bVar, "listener");
        com.bytedance.android.input.r.j.m("SettingsConfigNext", "registerListener");
        ArrayList<b> arrayList = i;
        if (arrayList.contains(bVar)) {
            return;
        }
        arrayList.add(bVar);
    }

    public final void m(String str, String str2) {
        kotlin.s.c.l.f(str, "key");
        kotlin.s.c.l.f(str2, PushLog.KEY_VALUE);
        PreferenceInfo preferenceInfo = f2163f.get(str);
        PreferenceInfo.Type f2 = preferenceInfo != null ? preferenceInfo.f() : null;
        int i2 = f2 == null ? -1 : c.a[f2.ordinal()];
        if (i2 == 1) {
            f2162e.putBoolean(str, kotlin.text.a.R(str2)).apply();
            return;
        }
        if (i2 == 2) {
            f2162e.putInt(str, Integer.parseInt(str2)).apply();
        } else if (i2 == 3) {
            f2162e.putString(str, str2).apply();
        } else {
            if (i2 != 4) {
                return;
            }
            f2162e.putLong(str, Long.parseLong(str2)).apply();
        }
    }

    public final void n(String str, String str2) {
        kotlin.s.c.l.f(str, "key");
        kotlin.s.c.l.f(str2, PushLog.KEY_VALUE);
        com.bytedance.android.input.r.j.i("SettingsConfigNext", "setValue: " + str + ", value: " + str2);
        PreferenceInfo preferenceInfo = f2163f.get(str);
        PreferenceInfo.Type f2 = preferenceInfo != null ? preferenceInfo.f() : null;
        int i2 = f2 == null ? -1 : c.a[f2.ordinal()];
        if (i2 == 1) {
            f2162e.putBoolean(str, kotlin.text.a.R(str2)).commit();
            return;
        }
        if (i2 == 2) {
            f2162e.putInt(str, Integer.parseInt(str2)).commit();
        } else if (i2 == 3) {
            f2162e.putString(str, str2).commit();
        } else {
            if (i2 != 4) {
                return;
            }
            f2162e.putLong(str, Long.parseLong(str2)).commit();
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        kotlin.s.c.l.f(sharedPreferences, "sharedPreferences");
        if (str == null) {
            Iterator it2 = new ArrayList(i).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).onReset();
            }
            return;
        }
        StringBuilder U = e.a.a.a.a.U("onSharedPreferenceChanged: ", str, ". notifyReload: ");
        HashMap<String, PreferenceInfo> hashMap = f2163f;
        PreferenceInfo preferenceInfo = hashMap.get(str);
        U.append(preferenceInfo != null ? Boolean.valueOf(preferenceInfo.e()) : null);
        com.bytedance.android.input.r.j.m("SettingsConfigNext", U.toString());
        PreferenceInfo preferenceInfo2 = hashMap.get(str);
        boolean z = false;
        if (preferenceInfo2 != null && !preferenceInfo2.e()) {
            z = true;
        }
        if (z) {
            return;
        }
        if (hashMap.containsKey(str)) {
            Iterator it3 = new ArrayList(i).iterator();
            while (it3.hasNext()) {
                ((b) it3.next()).onSettingsConfigChanged(str, f(str));
            }
        } else {
            com.bytedance.android.input.r.j.m("SettingsConfigNext", "onSharedPreferenceChanged: unknown key=" + str + ", ignore");
        }
    }

    public final void p(b bVar) {
        kotlin.s.c.l.f(bVar, "listener");
        com.bytedance.android.input.r.j.m("SettingsConfigNext", "unRegisterListener");
        kotlin.collections.g.S(i, new e(bVar));
    }

    public final void q(SharedPreferences sharedPreferences) {
        kotlin.s.c.l.f(sharedPreferences, "sharedPreference");
        f2161d = sharedPreferences;
        i.a(f2161d);
    }
}
