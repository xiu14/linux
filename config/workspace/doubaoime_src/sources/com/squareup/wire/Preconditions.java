package com.squareup.wire;

import java.util.Objects;

/* loaded from: classes2.dex */
final class Preconditions {
    private Preconditions() {
    }

    static void checkNotNull(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
