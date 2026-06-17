package androidx.core.util;

import android.annotation.SuppressLint;
import kotlin.g;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class PairKt {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(Pair<F, S> pair) {
        l.f(pair, "<this>");
        return pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(Pair<F, S> pair) {
        l.f(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(g<? extends F, ? extends S> gVar) {
        l.f(gVar, "<this>");
        return new android.util.Pair<>(gVar.c(), gVar.d());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(g<? extends F, ? extends S> gVar) {
        l.f(gVar, "<this>");
        return new Pair<>(gVar.c(), gVar.d());
    }

    public static final <F, S> g<F, S> toKotlinPair(Pair<F, S> pair) {
        l.f(pair, "<this>");
        return new g<>(pair.first, pair.second);
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        l.f(pair, "<this>");
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        l.f(pair, "<this>");
        return (S) pair.second;
    }

    public static final <F, S> g<F, S> toKotlinPair(android.util.Pair<F, S> pair) {
        l.f(pair, "<this>");
        return new g<>(pair.first, pair.second);
    }
}
