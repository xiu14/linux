package com.huawei.devices.utils;

@Deprecated
/* loaded from: classes2.dex */
public enum HapticsKitConstant$GalleryTypeEnum {
    ALBUMS_LONG_PRESS("haptic.gallery.albums_long_press"),
    PHOTOS_LONG_PRESS("haptic.gallery.photos_long_press"),
    UPGLIDE_RELATED("haptic.gallery.upglide_related");

    private final String mType;

    HapticsKitConstant$GalleryTypeEnum(String str) {
        this.mType = str;
    }

    public final String getType() {
        return this.mType;
    }
}
