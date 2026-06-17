package com.bumptech.glide.load;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e<T> {

    /* renamed from: e, reason: collision with root package name */
    private static final b<Object> f1579e = new a();
    private final T a;
    private final b<T> b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1580c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f1581d;

    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.e.b
        public void a(@NonNull byte[] bArr, @NonNull Object obj, @NonNull MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(@NonNull byte[] bArr, @NonNull T t, @NonNull MessageDigest messageDigest);
    }

    private e(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f1580c = str;
        this.a = t;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.b = bVar;
    }

    @NonNull
    public static <T> e<T> a(@NonNull String str, @Nullable T t, @NonNull b<T> bVar) {
        return new e<>(str, t, bVar);
    }

    @NonNull
    public static <T> e<T> c(@NonNull String str) {
        return new e<>(str, null, f1579e);
    }

    @NonNull
    public static <T> e<T> d(@NonNull String str, @NonNull T t) {
        return new e<>(str, t, f1579e);
    }

    @Nullable
    public T b() {
        return this.a;
    }

    public void e(@NonNull T t, @NonNull MessageDigest messageDigest) {
        b<T> bVar = this.b;
        if (this.f1581d == null) {
            this.f1581d = this.f1580c.getBytes(d.a);
        }
        bVar.a(this.f1581d, t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f1580c.equals(((e) obj).f1580c);
        }
        return false;
    }

    public int hashCode() {
        return this.f1580c.hashCode();
    }

    public String toString() {
        return e.a.a.a.a.H(e.a.a.a.a.M("Option{key='"), this.f1580c, '\'', '}');
    }
}
