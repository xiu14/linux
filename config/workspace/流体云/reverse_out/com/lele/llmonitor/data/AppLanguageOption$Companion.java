package com.lele.llmonitor.data;
public final class AppLanguageOption$Companion {

    private AppLanguageOption$Companion()
    {
        return;
    }

    public synthetic AppLanguageOption$Companion(ic0 p1)
    {
        return;
    }

    public final com.lele.llmonitor.data.AppLanguageOption fromPreferenceValue(String p4)
    {
        java.util.Iterator v0_1 = com.lele.llmonitor.data.AppLanguageOption.getEntries().iterator();
        while (v0_1.hasNext()) {
            com.lele.llmonitor.data.AppLanguageOption v1_2 = v0_1.next();
            if (ni1.o(((com.lele.llmonitor.data.AppLanguageOption) v1_2).getPreferenceValue(), p4)) {
            }
            com.lele.llmonitor.data.AppLanguageOption v1_0 = ((com.lele.llmonitor.data.AppLanguageOption) v1_2);
            if (v1_0 != null) {
                return v1_0;
            } else {
                return this.getDefault();
            }
        }
        v1_2 = 0;
    }

    public final com.lele.llmonitor.data.AppLanguageOption getDefault()
    {
        return com.lele.llmonitor.data.AppLanguageOption.access$getDefault$cp();
    }
}
