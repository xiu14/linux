package com.bumptech.glide.q;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.d;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class a implements d {
    private static final a b = new a();

    private a() {
    }

    @NonNull
    public static a c() {
        return b;
    }

    @Override // com.bumptech.glide.load.d
    public void a(@NonNull MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
