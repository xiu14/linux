package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public interface d {
    public static final Charset a = Charset.forName("UTF-8");

    void a(@NonNull MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
