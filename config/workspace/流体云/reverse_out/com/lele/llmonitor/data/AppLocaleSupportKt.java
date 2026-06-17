package com.lele.llmonitor.data;
public final class AppLocaleSupportKt {
    public static final String APP_LANGUAGE_OPTION_KEY = "app_language_option";
    private static final String LANGUAGE_TAG_EN = "en";
    private static final String LANGUAGE_TAG_ZH_CN = "zh-CN";
    private static final String LANGUAGE_TAG_ZH_HK = "zh-HK";
    private static final String LANGUAGE_TAG_ZH_TW = "zh-TW";
    private static final String SETTINGS_PREF_NAME = "llmonitor_settings";
    private static volatile com.lele.llmonitor.data.AppLanguageOption currentAppLanguageOption;

    static AppLocaleSupportKt()
    {
        com.lele.llmonitor.data.AppLocaleSupportKt.currentAppLanguageOption = com.lele.llmonitor.data.AppLanguageOption.Companion.getDefault();
        return;
    }

    public static final void applySupportedAppLocale(android.content.Context p3, com.lele.llmonitor.data.AppLanguageOption p4)
    {
        p3.getClass();
        if (p4 == null) {
            p4 = com.lele.llmonitor.data.AppLocaleSupportKt.resolveStoredAppLanguageOption(p3);
        }
        com.lele.llmonitor.data.AppLocaleSupportKt.currentAppLanguageOption = p4;
        ClassCastException v3_5 = com.lele.llmonitor.data.AppLanguageOption.FOLLOW_SYSTEM;
        if (p4 == v3_5) {
            p4 = com.lele.llmonitor.data.AppLocaleSupportKt.resolveSupportedSystemLanguageOption();
        }
        ClassCastException v3_2;
        if (p4 != v3_5) {
            ClassCastException v3_1 = p4.getExplicitLanguageTag();
            if (v3_1 == null) {
                v3_1 = "en";
            }
            v3_2 = zw1.a(v3_1);
        } else {
            v3_2 = zw1.a("en");
        }
        boolean v1_0;
        v3_2.getClass();
        Object v4_1 = android.os.Build$VERSION.SDK_INT;
        if (v4_1 < 33) {
            v1_0 = jf.b;
            if (!v1_0) {
                v1_0 = zw1.b;
            }
        } else {
            jf.a();
        }
        if (!ni1.o(v1_0.a.a.toLanguageTags(), v3_2.a.a.toLanguageTags())) {
            if (v4_1 < 33) {
                if (!v3_2.equals(jf.b)) {
                    try {
                        jf.b = v3_2;
                        ClassCastException v3_4 = jf.c;
                        v3_4.getClass();
                        ph v0_2 = new ph(v3_4);
                    } catch (ClassCastException v3_12) {
                        throw v3_12;
                    }
                    while (v0_2.hasNext()) {
                        if (((ref.WeakReference) v0_2.next()).get() != null) {
                            throw new ClassCastException();
                        } else {
                        }
                    }
                    return;
                }
            } else {
                jf.a();
                return;
            }
        }
        return;
    }

    public static synthetic void applySupportedAppLocale$default(android.content.Context p0, com.lele.llmonitor.data.AppLanguageOption p1, int p2, Object p3)
    {
        if ((p2 & 2) != 0) {
            p1 = 0;
        }
        com.lele.llmonitor.data.AppLocaleSupportKt.applySupportedAppLocale(p0, p1);
        return;
    }

    public static final com.lele.llmonitor.data.AppLanguageOption resolveCurrentAppLanguageOption()
    {
        return com.lele.llmonitor.data.AppLocaleSupportKt.currentAppLanguageOption;
    }

    public static final com.lele.llmonitor.data.AppLanguageOption resolveStoredAppLanguageOption(android.content.Context p2)
    {
        p2.getClass();
        com.lele.llmonitor.data.AppLanguageOption v2_1 = p2.getSharedPreferences("llmonitor_settings", 0);
        v2_1.getClass();
        return com.lele.llmonitor.data.AppLocaleSupportKt.resolveStoredAppLanguageOption(v2_1);
    }

    public static final com.lele.llmonitor.data.AppLanguageOption resolveStoredAppLanguageOption(android.content.SharedPreferences p3)
    {
        p3.getClass();
        com.lele.llmonitor.data.AppLanguageOption$Companion v0 = com.lele.llmonitor.data.AppLanguageOption.Companion;
        return v0.fromPreferenceValue(p3.getString("app_language_option", v0.getDefault().getPreferenceValue()));
    }

    public static final com.lele.llmonitor.data.AppLanguageOption resolveSupportedSystemLanguageOption()
    {
        com.lele.llmonitor.data.AppLanguageOption v0_1 = android.content.res.Resources.getSystem().getConfiguration().getLocales().get(0);
        if (v0_1 == null) {
            v0_1 = java.util.Locale.getDefault();
        }
        String v1_0 = v0_1.getLanguage();
        v1_0.getClass();
        int v2_0 = java.util.Locale.US;
        v2_0.getClass();
        String v1_1 = v1_0.toLowerCase(v2_0);
        v1_1.getClass();
        if (!v1_1.equals("en")) {
            if (v1_1.equals("zh")) {
                com.lele.llmonitor.data.AppLanguageOption v0_2 = v0_1.getCountry();
                v0_2.getClass();
                v2_0.getClass();
                com.lele.llmonitor.data.AppLanguageOption v0_4 = v0_2.toUpperCase(v2_0);
                v0_4.getClass();
                String v1_3 = v0_4.hashCode();
                if (v1_3 == 2155) {
                    if (v0_4.equals("CN")) {
                        return com.lele.llmonitor.data.AppLanguageOption.CHINESE_SIMPLIFIED_CHINA;
                    }
                } else {
                    if (v1_3 == 2307) {
                        if (v0_4.equals("HK")) {
                            return com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_HONG_KONG;
                        }
                    } else {
                        if ((v1_3 == 2691) && (v0_4.equals("TW"))) {
                            return com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_TAIWAN;
                        }
                    }
                }
                return com.lele.llmonitor.data.AppLanguageOption.ENGLISH;
            } else {
                return com.lele.llmonitor.data.AppLanguageOption.ENGLISH;
            }
        } else {
            return com.lele.llmonitor.data.AppLanguageOption.ENGLISH;
        }
    }
}
