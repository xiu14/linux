package com.obric.oui.indexscrollbar;

import androidx.exifinterface.media.ExifInterface;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class c {
    private static final String[] a = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", "#"};
    private static final String[] b = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ".B", "D", ".E", "G", ".H", "J", ".K", "M", ".N", "P", ".Q", ExifInterface.LATITUDE_SOUTH, ".T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ".W", "Y", ".Z", "#"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f7817c = {"あ", "か", "さ", "た", "な", "は", "ま", "や", "ら", "わ", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ".B", "D", ".E", "G", ".H", "J", ".K", "M", ".N", "P", ".Q", ExifInterface.LATITUDE_SOUTH, ".T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ".W", "Y", ".Z", "#"};

    /* renamed from: d, reason: collision with root package name */
    private static String[] f7818d = {"А", ".Б", "Г", ".Д", "З", ".И", "К", ".Л", "Н", ".О", "С", ".Т", "Ф", ".Х", "Ч", ".Ш", "ы", ".ь", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, ".B", "D", ".E", "G", ".H", "J", ".K", "M", ".N", "P", ".Q", ExifInterface.LATITUDE_SOUTH, ".T", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ".W", "Y", ".Z", "#"};

    public static final String[] a(String str) {
        kotlin.s.c.l.f(str, "language");
        return e.a.a.a.a.T0(Locale.KOREA, "Locale.KOREA", str) ? b : e.a.a.a.a.T0(Locale.JAPAN, "Locale.JAPAN", str) ? f7817c : kotlin.s.c.l.a("ru", str) ? f7818d : a;
    }
}
