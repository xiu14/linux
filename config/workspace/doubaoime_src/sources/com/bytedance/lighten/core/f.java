package com.bytedance.lighten.core;

import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface f extends d {
    void init(@NonNull h hVar);

    j load(@DrawableRes int i);

    j load(@NonNull Uri uri);
}
