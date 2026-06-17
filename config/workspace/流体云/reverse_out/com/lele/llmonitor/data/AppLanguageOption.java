package com.lele.llmonitor.data;
public final enum class AppLanguageOption extends java.lang.Enum {
    private static final synthetic dq0 $ENTRIES;
    private static final synthetic com.lele.llmonitor.data.AppLanguageOption[] $VALUES;
    public static final enum com.lele.llmonitor.data.AppLanguageOption CHINESE_SIMPLIFIED_CHINA;
    public static final enum com.lele.llmonitor.data.AppLanguageOption CHINESE_TRADITIONAL_HONG_KONG;
    public static final enum com.lele.llmonitor.data.AppLanguageOption CHINESE_TRADITIONAL_TAIWAN;
    public static final com.lele.llmonitor.data.AppLanguageOption$Companion Companion;
    public static final enum com.lele.llmonitor.data.AppLanguageOption ENGLISH;
    public static final enum com.lele.llmonitor.data.AppLanguageOption FOLLOW_SYSTEM;
    private static final com.lele.llmonitor.data.AppLanguageOption default;
    private final String explicitLanguageTag;
    private final String preferenceValue;

    private static final synthetic com.lele.llmonitor.data.AppLanguageOption[] $values()
    {
        return new com.lele.llmonitor.data.AppLanguageOption[] {com.lele.llmonitor.data.AppLanguageOption.FOLLOW_SYSTEM, com.lele.llmonitor.data.AppLanguageOption.ENGLISH, com.lele.llmonitor.data.AppLanguageOption.CHINESE_SIMPLIFIED_CHINA, com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_HONG_KONG, com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_TAIWAN});
    }

    static AppLanguageOption()
    {
        com.lele.llmonitor.data.AppLanguageOption v0_1 = new com.lele.llmonitor.data.AppLanguageOption("FOLLOW_SYSTEM", 0, "system", 0);
        com.lele.llmonitor.data.AppLanguageOption.FOLLOW_SYSTEM = v0_1;
        com.lele.llmonitor.data.AppLanguageOption.ENGLISH = new com.lele.llmonitor.data.AppLanguageOption("ENGLISH", 1, "en", "en");
        com.lele.llmonitor.data.AppLanguageOption.CHINESE_SIMPLIFIED_CHINA = new com.lele.llmonitor.data.AppLanguageOption("CHINESE_SIMPLIFIED_CHINA", 2, "zh-CN", "zh-CN");
        com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_HONG_KONG = new com.lele.llmonitor.data.AppLanguageOption("CHINESE_TRADITIONAL_HONG_KONG", 3, "zh-HK", "zh-HK");
        com.lele.llmonitor.data.AppLanguageOption.CHINESE_TRADITIONAL_TAIWAN = new com.lele.llmonitor.data.AppLanguageOption("CHINESE_TRADITIONAL_TAIWAN", 4, "zh-TW", "zh-TW");
        com.lele.llmonitor.data.AppLanguageOption$Companion v1_8 = com.lele.llmonitor.data.AppLanguageOption.$values();
        com.lele.llmonitor.data.AppLanguageOption.$VALUES = v1_8;
        com.lele.llmonitor.data.AppLanguageOption.$ENTRIES = wm1.Y(v1_8);
        com.lele.llmonitor.data.AppLanguageOption.Companion = new com.lele.llmonitor.data.AppLanguageOption$Companion(0);
        com.lele.llmonitor.data.AppLanguageOption.default = v0_1;
        return;
    }

    private AppLanguageOption(String p1, int p2, String p3, String p4)
    {
        super(p1, p2);
        super.preferenceValue = p3;
        super.explicitLanguageTag = p4;
        return;
    }

    public static final synthetic com.lele.llmonitor.data.AppLanguageOption access$getDefault$cp()
    {
        return com.lele.llmonitor.data.AppLanguageOption.default;
    }

    public static dq0 getEntries()
    {
        return com.lele.llmonitor.data.AppLanguageOption.$ENTRIES;
    }

    public static com.lele.llmonitor.data.AppLanguageOption valueOf(String p1)
    {
        return ((com.lele.llmonitor.data.AppLanguageOption) Enum.valueOf(com.lele.llmonitor.data.AppLanguageOption, p1));
    }

    public static com.lele.llmonitor.data.AppLanguageOption[] values()
    {
        return ((com.lele.llmonitor.data.AppLanguageOption[]) com.lele.llmonitor.data.AppLanguageOption.$VALUES.clone());
    }

    public final String getExplicitLanguageTag()
    {
        return this.explicitLanguageTag;
    }

    public final String getPreferenceValue()
    {
        return this.preferenceValue;
    }
}
