package com.bumptech.glide.load.data.o;

import android.net.Uri;

/* loaded from: classes.dex */
public final class b {
    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean b(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }
}
