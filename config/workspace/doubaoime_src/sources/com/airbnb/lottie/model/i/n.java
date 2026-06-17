package com.airbnb.lottie.model.i;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {
    final List<com.airbnb.lottie.z.a<V>> a;

    n(V v) {
        this.a = Collections.singletonList(new com.airbnb.lottie.z.a(v));
    }

    @Override // com.airbnb.lottie.model.i.m
    public boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).h());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }

    n(List<com.airbnb.lottie.z.a<V>> list) {
        this.a = list;
    }
}
