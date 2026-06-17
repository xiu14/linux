package com.facebook.datasource;

import java.util.Objects;

/* loaded from: classes2.dex */
public class h<T> extends AbstractDataSource<T> {
    private h() {
    }

    public static <T> h<T> p() {
        return new h<>();
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean k(Throwable th) {
        Objects.requireNonNull(th);
        return l(th, null);
    }
}
