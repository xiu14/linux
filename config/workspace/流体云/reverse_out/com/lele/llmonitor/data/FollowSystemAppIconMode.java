package com.lele.llmonitor.data;
public final enum class FollowSystemAppIconMode extends java.lang.Enum {
    private static final synthetic dq0 $ENTRIES;
    private static final synthetic com.lele.llmonitor.data.FollowSystemAppIconMode[] $VALUES;
    public static final com.lele.llmonitor.data.FollowSystemAppIconMode$Companion Companion;
    public static final enum com.lele.llmonitor.data.FollowSystemAppIconMode DARK;
    public static final enum com.lele.llmonitor.data.FollowSystemAppIconMode LIGHT;
    private static final com.lele.llmonitor.data.FollowSystemAppIconMode default;
    private final int preferenceValue;

    private static final synthetic com.lele.llmonitor.data.FollowSystemAppIconMode[] $values()
    {
        return new com.lele.llmonitor.data.FollowSystemAppIconMode[] {com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT, com.lele.llmonitor.data.FollowSystemAppIconMode.DARK});
    }

    static FollowSystemAppIconMode()
    {
        com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT = new com.lele.llmonitor.data.FollowSystemAppIconMode("LIGHT", 0, 1);
        com.lele.llmonitor.data.FollowSystemAppIconMode v0_3 = new com.lele.llmonitor.data.FollowSystemAppIconMode("DARK", 1, 2);
        com.lele.llmonitor.data.FollowSystemAppIconMode.DARK = v0_3;
        com.lele.llmonitor.data.FollowSystemAppIconMode$Companion v1_1 = com.lele.llmonitor.data.FollowSystemAppIconMode.$values();
        com.lele.llmonitor.data.FollowSystemAppIconMode.$VALUES = v1_1;
        com.lele.llmonitor.data.FollowSystemAppIconMode.$ENTRIES = wm1.Y(v1_1);
        com.lele.llmonitor.data.FollowSystemAppIconMode.Companion = new com.lele.llmonitor.data.FollowSystemAppIconMode$Companion(0);
        com.lele.llmonitor.data.FollowSystemAppIconMode.default = v0_3;
        return;
    }

    private FollowSystemAppIconMode(String p1, int p2, int p3)
    {
        super(p1, p2);
        super.preferenceValue = p3;
        return;
    }

    public static final synthetic com.lele.llmonitor.data.FollowSystemAppIconMode access$getDefault$cp()
    {
        return com.lele.llmonitor.data.FollowSystemAppIconMode.default;
    }

    public static dq0 getEntries()
    {
        return com.lele.llmonitor.data.FollowSystemAppIconMode.$ENTRIES;
    }

    public static com.lele.llmonitor.data.FollowSystemAppIconMode valueOf(String p1)
    {
        return ((com.lele.llmonitor.data.FollowSystemAppIconMode) Enum.valueOf(com.lele.llmonitor.data.FollowSystemAppIconMode, p1));
    }

    public static com.lele.llmonitor.data.FollowSystemAppIconMode[] values()
    {
        return ((com.lele.llmonitor.data.FollowSystemAppIconMode[]) com.lele.llmonitor.data.FollowSystemAppIconMode.$VALUES.clone());
    }

    public final int getPreferenceValue()
    {
        return this.preferenceValue;
    }
}
