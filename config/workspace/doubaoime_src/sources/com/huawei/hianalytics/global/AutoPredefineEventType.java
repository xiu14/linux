package com.huawei.hianalytics.global;

/* loaded from: classes2.dex */
public enum AutoPredefineEventType {
    HA_APP_CLEAR_DATE("$HA_APP_CLEAR_DATE,"),
    HA_APP_EXCEPTION("$HA_APP_EXCEPTION,"),
    HA_APP_REMOVE("$HA_APP_REMOVE,"),
    HA_APP_UPDATE("$HA_APP_UPDATE,"),
    HA_FIRST_OPEN("$HA_FIRST_OPEN,"),
    HA_SCREEN_VIEW("$HA_SCREEN_VIEW,"),
    HA_SESSION_START("$HA_SESSION_START");

    private String eventName;

    AutoPredefineEventType(String str) {
        this.eventName = str;
    }

    public final String getEventName() {
        return this.eventName;
    }
}
