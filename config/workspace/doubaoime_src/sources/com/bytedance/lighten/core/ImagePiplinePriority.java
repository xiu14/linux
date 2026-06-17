package com.bytedance.lighten.core;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public enum ImagePiplinePriority {
    LOW,
    MEDIUM,
    HIGH;

    public static ImagePiplinePriority getHigherPriority(@Nullable ImagePiplinePriority imagePiplinePriority, @Nullable ImagePiplinePriority imagePiplinePriority2) {
        return imagePiplinePriority == null ? imagePiplinePriority2 : (imagePiplinePriority2 != null && imagePiplinePriority.ordinal() <= imagePiplinePriority2.ordinal()) ? imagePiplinePriority2 : imagePiplinePriority;
    }
}
