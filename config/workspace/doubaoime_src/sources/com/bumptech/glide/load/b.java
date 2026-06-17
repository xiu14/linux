package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class b extends IOException {
    public b(String str, int i, @Nullable Throwable th) {
        super(str + ", status code: " + i, th);
    }
}
