package com.ss.ugc.effectplatform.model;

/* loaded from: classes2.dex */
public abstract class e<T> {
    public final boolean checkStatusCode() {
        return getStatusCode() == 0;
    }

    public boolean checkValue() {
        return getResponseData() != null;
    }

    public abstract T getResponseData();

    public abstract String getResponseMessage();

    public abstract int getStatusCode();

    public boolean verifySign() {
        return true;
    }
}
