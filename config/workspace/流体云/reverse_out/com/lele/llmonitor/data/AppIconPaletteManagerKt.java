package com.lele.llmonitor.data;
public final class AppIconPaletteManagerKt {

    public static final synthetic com.lele.llmonitor.data.AppIconPalette access$toAppIconPalette(com.lele.llmonitor.ui.theme.ThemePalettePreset p0)
    {
        return com.lele.llmonitor.data.AppIconPaletteManagerKt.toAppIconPalette(p0);
    }

    private static final void applyAppIconPalette(android.content.Context p10, com.lele.llmonitor.data.AppIconPalette p11, boolean p12, java.util.Set p13, boolean p14)
    {
        android.content.pm.PackageManager v0 = p10.getPackageManager();
        String v11_1 = p11.resolveAliasClassName(p12);
        java.util.Iterator v12_2 = com.lele.llmonitor.data.AppIconPalette.getEntries().iterator();
        while (v12_2.hasNext()) {
            java.util.ArrayList v1_1 = ((com.lele.llmonitor.data.AppIconPalette) v12_2.next());
            java.util.ArrayList v1_4 = wh.f0(new String[] {v1_1.getAliasClassName(), v1_1.getDarkAliasClassName()}));
            int v2_1 = v1_4.size();
            int v3 = 0;
            while (v3 < v2_1) {
                boolean v4_0 = v1_4.get(v3);
                v3++;
                boolean v4_1 = ((String) v4_0);
                if ((p14) || (ni1.o(v4_1, v11_1))) {
                    int v5_2;
                    if (!ni1.o(v4_1, v11_1)) {
                        v5_2 = 2;
                    } else {
                        v5_2 = 1;
                    }
                    android.content.ComponentName v8_1 = new android.content.ComponentName(p10, v4_1);
                    if ((v0.getComponentEnabledSetting(v8_1) != v5_2) && ((v5_2 != 2) || (!p13.contains(v4_1)))) {
                        v0.setComponentEnabledSetting(v8_1, v5_2, 1);
                    }
                }
            }
        }
        return;
    }

    public static synthetic void applyAppIconPalette$default(android.content.Context p0, com.lele.llmonitor.data.AppIconPalette p1, boolean p2, java.util.Set p3, boolean p4, int p5, Object p6)
    {
        if ((p5 & 8) != 0) {
            p3 = zo0.d;
        }
        if ((p5 & 16) != 0) {
            p4 = 1;
        }
        com.lele.llmonitor.data.AppIconPaletteManagerKt.applyAppIconPalette(p0, p1, p2, p3, p4);
        return;
    }

    private static final com.lele.llmonitor.data.AppIconPalette toAppIconPalette(com.lele.llmonitor.ui.theme.ThemePalettePreset p1)
    {
        switch (com.lele.llmonitor.data.AppIconPaletteManagerKt$WhenMappings.$EnumSwitchMapping$0[p1.ordinal()]) {
            case 1:
                return com.lele.llmonitor.data.AppIconPalette.DYNAMIC;
            case 2:
                return com.lele.llmonitor.data.AppIconPalette.OCEAN;
            case 3:
                return com.lele.llmonitor.data.AppIconPalette.FOREST;
            case 4:
                return com.lele.llmonitor.data.AppIconPalette.SUNSET;
            case 5:
                return com.lele.llmonitor.data.AppIconPalette.BLOSSOM;
            case 6:
                return com.lele.llmonitor.data.AppIconPalette.JIZI;
            default:
                h.b();
                return 0;
        }
    }
}
