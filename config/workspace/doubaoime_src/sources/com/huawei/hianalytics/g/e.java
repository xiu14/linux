package com.huawei.hianalytics.g;

import androidx.exifinterface.media.ExifInterface;

/* loaded from: classes2.dex */
public abstract class e {
    public static String a(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? String.valueOf(i) : ExifInterface.LONGITUDE_EAST : ExifInterface.LONGITUDE_WEST : "I" : "D";
    }
}
