package com.heytap.mcssdk.liquid;

import com.heytap.mcssdk.liquid.LiquidConstants;

/* loaded from: classes2.dex */
public class SettingChangeBean {

    @LiquidConstants.b
    private int changeType;
    private int switchStatus;

    public int getChangeType() {
        return this.changeType;
    }

    public int getSwitchStatus() {
        return this.switchStatus;
    }

    public void setChangeType(int i) {
        this.changeType = i;
    }

    public void setSwitchStatus(int i) {
        this.switchStatus = i;
    }

    public String toString() {
        StringBuilder S = e.a.a.a.a.S("SettingChangeBean{", "changeType=");
        S.append(this.changeType);
        S.append(", switchStatus=");
        return e.a.a.a.a.C(S, this.switchStatus, '}');
    }
}
