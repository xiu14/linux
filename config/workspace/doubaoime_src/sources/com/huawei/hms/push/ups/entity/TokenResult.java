package com.huawei.hms.push.ups.entity;

/* loaded from: classes2.dex */
public class TokenResult extends CodeResult {

    /* renamed from: c, reason: collision with root package name */
    private String f7438c;

    public TokenResult() {
    }

    public String getToken() {
        return this.f7438c;
    }

    public void setToken(String str) {
        this.f7438c = str;
    }

    public TokenResult(int i) {
        super(i);
    }

    public TokenResult(int i, String str) {
        super(i, str);
    }

    public TokenResult(String str) {
        this.f7438c = str;
    }
}
