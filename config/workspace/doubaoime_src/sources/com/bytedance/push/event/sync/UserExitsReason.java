package com.bytedance.push.event.sync;

/* loaded from: classes2.dex */
public enum UserExitsReason {
    BACK("back"),
    HOME("home");

    public String exitsReasonStr;

    UserExitsReason(String str) {
        this.exitsReasonStr = str;
    }
}
