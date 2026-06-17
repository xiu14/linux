package com.obric.oui.indexscrollbar;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class a {
    private static final String[] a = {ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", ".>"};
    private static final String[] b = {"ㄱ", "ㄴ", "ㄷ", "ㄹ", "ㅁ", "ㅂ", "ㅅ", "ㅇ", "ㅈ", "ㅊ", "ㅋ", "ㅌ", "ㅍ", "ㅎ", ".~", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", ".>"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f7812c = {"あ", "い", "う", "え", "お", "か", "き", "く", "け", "こ", "さ", "し", "す", "せ", "そ", "た", "ち", "つ", "て", "と", "な", "に", "ぬ", "ね", "の", "は", "ひ", "ふ", "へ", "ほ", "ま", "み", "む", "め", "も", "や", "*い", "ゆ", "*え", "よ", "ら", "り", "る", "れ", "ろ", "わ", "*い", "*う", "*え", "を", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", ".~", ".~", ".~", ".>"};

    /* renamed from: d, reason: collision with root package name */
    private static String[] f7813d = {"А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Ъ", "Ы", "Ь", "Э", "Ю", "Я", ".~", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, ExifInterface.GPS_DIRECTION_TRUE, "U", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, ExifInterface.LONGITUDE_WEST, "X", "Y", "Z", ".>"};

    public static final String[] a(String str) {
        kotlin.s.c.l.f(str, "language");
        return e.a.a.a.a.T0(Locale.KOREA, "Locale.KOREA", str) ? b : e.a.a.a.a.T0(Locale.JAPAN, "Locale.JAPAN", str) ? f7812c : kotlin.s.c.l.a("ru", str) ? f7813d : a;
    }

    public static final boolean b(String str) {
        kotlin.s.c.l.f(str, "alphabet");
        String[] strArr = (String[]) Arrays.copyOfRange(f7813d, 0, 32);
        return Arrays.asList((String[]) Arrays.copyOf(strArr, strArr.length)).contains(str);
    }

    public static final boolean c(String str, String str2) {
        kotlin.s.c.l.f(str, "language");
        kotlin.s.c.l.f(str2, "alphabet");
        if (!e.a.a.a.a.T0(Locale.CHINESE, "Locale.CHINESE", str) && !e.a.a.a.a.T0(Locale.ENGLISH, "Locale.ENGLISH", str)) {
            if (e.a.a.a.a.T0(Locale.KOREA, "Locale.KOREA", str)) {
                String[] strArr = (String[]) Arrays.copyOfRange(b, 0, 14);
                if (!Arrays.asList((String[]) Arrays.copyOf(strArr, strArr.length)).contains(str2)) {
                    return false;
                }
            } else if (e.a.a.a.a.T0(Locale.JAPAN, "Locale.JAPAN", str)) {
                kotlin.s.c.l.f(str2, "alphabet");
                String[] strArr2 = (String[]) Arrays.copyOfRange(f7812c, 0, 50);
                if (!Arrays.asList((String[]) Arrays.copyOf(strArr2, strArr2.length)).contains(str2)) {
                    return false;
                }
            } else if (!kotlin.s.c.l.a("ru", str) || !b(str2)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean d(String str) {
        kotlin.s.c.l.f(str, "alphabet");
        return kotlin.s.c.l.a(".>", str);
    }
}
