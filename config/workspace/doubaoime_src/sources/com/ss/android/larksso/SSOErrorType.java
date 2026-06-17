package com.ss.android.larksso;

/* loaded from: classes2.dex */
public enum SSOErrorType {
    BAD_STATE("-1"),
    NO_VALID_CODE("-2"),
    CANCELLED("-3"),
    CAN_NOT_JUMP_TO_LARK("-4"),
    AUTH_FAILED("-5"),
    PARAMETER_ERROR("-6");

    public String a;

    SSOErrorType(String str) {
        this.a = str;
    }
}
