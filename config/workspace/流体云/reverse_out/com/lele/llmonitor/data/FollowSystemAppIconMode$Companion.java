package com.lele.llmonitor.data;
public final class FollowSystemAppIconMode$Companion {

    private FollowSystemAppIconMode$Companion()
    {
        return;
    }

    public synthetic FollowSystemAppIconMode$Companion(ic0 p1)
    {
        return;
    }

    public final com.lele.llmonitor.data.FollowSystemAppIconMode fromPreferenceValue(Integer p4)
    {
        com.lele.llmonitor.data.FollowSystemAppIconMode v0_0 = com.lele.llmonitor.data.FollowSystemAppIconMode.LIGHT;
        int v1_1 = v0_0.getPreferenceValue();
        if ((p4 == 0) || (p4.intValue() != v1_1)) {
            com.lele.llmonitor.data.FollowSystemAppIconMode v0_1 = com.lele.llmonitor.data.FollowSystemAppIconMode.DARK;
            int v1_0 = v0_1.getPreferenceValue();
            if ((p4 == 0) || (p4.intValue() != v1_0)) {
                return this.getDefault();
            } else {
                return v0_1;
            }
        } else {
            return v0_0;
        }
    }

    public final com.lele.llmonitor.data.FollowSystemAppIconMode getDefault()
    {
        return com.lele.llmonitor.data.FollowSystemAppIconMode.access$getDefault$cp();
    }
}
