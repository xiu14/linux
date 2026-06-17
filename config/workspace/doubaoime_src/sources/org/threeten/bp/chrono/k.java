package org.threeten.bp.chrono;

import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.text.ParseException;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.temporal.ChronoField;

/* loaded from: classes2.dex */
public final class k extends a<k> implements Serializable {
    private static final Integer[] A;
    private static final Integer[] B;
    private static final Integer[] C;
    private static final Integer[] D;
    public static final /* synthetic */ int E = 0;
    private static final int[] h;
    private static final int[] i = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
    private static final int[] j = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 29};
    private static final int[] k = {30, 29, 30, 29, 30, 29, 30, 29, 30, 29, 30, 30};
    private static final int[] l = {0, 1, 0, 1, 0, 1, 1};
    private static final int[] m = {1, 9999, 11, 51, 5, 29, 354};
    private static final int[] n = {1, 9999, 11, 52, 6, 30, 355};
    private static final int[] o = {0, 354, 709, DownloadErrorCode.ERROR_FILE_NOT_FOUND, 1417, 1772, 2126, 2481, 2835, 3189, 3544, 3898, 4252, 4607, 4961, 5315, 5670, 6024, 6379, 6733, 7087, 7442, 7796, 8150, 8505, 8859, 9214, 9568, 9922, 10277};
    private static final char p;
    private static final String q;
    private static final String r;
    private static final HashMap<Integer, Integer[]> s;
    private static final HashMap<Integer, Integer[]> t;
    private static final HashMap<Integer, Integer[]> u;
    private static final Long[] v;
    private static final Integer[] w;
    private static final Integer[] x;
    private static final Integer[] y;
    private static final Integer[] z;
    private final transient HijrahEra a;
    private final transient int b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f10779c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f10780d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f10781e;

    /* renamed from: f, reason: collision with root package name */
    private final transient DayOfWeek f10782f;

    /* renamed from: g, reason: collision with root package name */
    private final long f10783g;

    static {
        int[] iArr = {0, 30, 59, 89, 118, 148, 177, 207, 236, 266, 295, 325};
        h = iArr;
        char c2 = File.separatorChar;
        p = c2;
        q = File.pathSeparator;
        r = "org" + c2 + "threeten" + c2 + "bp" + c2 + "chrono";
        s = new HashMap<>();
        t = new HashMap<>();
        u = new HashMap<>();
        z = new Integer[iArr.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr2 = h;
            if (i3 >= iArr2.length) {
                break;
            }
            z[i3] = new Integer(iArr2[i3]);
            i3++;
        }
        A = new Integer[i.length];
        int i4 = 0;
        while (true) {
            int[] iArr3 = i;
            if (i4 >= iArr3.length) {
                break;
            }
            A[i4] = new Integer(iArr3[i4]);
            i4++;
        }
        B = new Integer[j.length];
        int i5 = 0;
        while (true) {
            int[] iArr4 = j;
            if (i5 >= iArr4.length) {
                break;
            }
            B[i5] = new Integer(iArr4[i5]);
            i5++;
        }
        C = new Integer[k.length];
        int i6 = 0;
        while (true) {
            int[] iArr5 = k;
            if (i6 >= iArr5.length) {
                break;
            }
            C[i6] = new Integer(iArr5[i6]);
            i6++;
        }
        D = new Integer[o.length];
        int i7 = 0;
        while (true) {
            int[] iArr6 = o;
            if (i7 >= iArr6.length) {
                break;
            }
            D[i7] = new Integer(iArr6[i7]);
            i7++;
        }
        v = new Long[334];
        int i8 = 0;
        while (true) {
            Long[] lArr = v;
            if (i8 >= lArr.length) {
                break;
            }
            lArr[i8] = new Long(i8 * 10631);
            i8++;
        }
        w = new Integer[l.length];
        int i9 = 0;
        while (true) {
            int[] iArr7 = l;
            if (i9 >= iArr7.length) {
                break;
            }
            w[i9] = new Integer(iArr7[i9]);
            i9++;
        }
        x = new Integer[m.length];
        int i10 = 0;
        while (true) {
            int[] iArr8 = m;
            if (i10 >= iArr8.length) {
                break;
            }
            x[i10] = new Integer(iArr8[i10]);
            i10++;
        }
        y = new Integer[n.length];
        while (true) {
            int[] iArr9 = n;
            if (i2 >= iArr9.length) {
                try {
                    H();
                    return;
                } catch (IOException | ParseException unused) {
                    return;
                }
            } else {
                y[i2] = new Integer(iArr9[i2]);
                i2++;
            }
        }
    }

    private k(long j2) {
        int i2;
        int i3;
        int y2;
        int v2;
        int value;
        int i4;
        int i5;
        Long l2;
        long j3 = j2 - (-492148);
        if (j3 >= 0) {
            Long[] lArr = v;
            for (int i6 = 0; i6 < lArr.length; i6++) {
                try {
                    if (j3 < lArr[i6].longValue()) {
                        i5 = i6 - 1;
                        break;
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    i4 = ((int) j3) / 10631;
                }
            }
            i4 = ((int) j3) / 10631;
            i5 = i4;
            try {
                l2 = v[i5];
            } catch (ArrayIndexOutOfBoundsException unused2) {
                l2 = null;
            }
            int longValue = (int) (j3 - (l2 == null ? new Long(i5 * 10631) : l2).longValue());
            int z2 = z(i5, longValue);
            i3 = w(i5, longValue, z2);
            i2 = (i5 * 30) + z2 + 1;
            y2 = y(i3, i2);
            v2 = v(i3, y2, i2) + 1;
            value = HijrahEra.AH.getValue();
        } else {
            int i7 = (int) j3;
            int i8 = i7 / 10631;
            int i9 = i7 % 10631;
            if (i9 == 0) {
                i9 = -10631;
                i8++;
            }
            int z3 = z(i8, i9);
            int w2 = w(i8, i9, z3);
            i2 = 1 - ((i8 * 30) - z3);
            i3 = A((long) i2) ? w2 + 355 : w2 + 354;
            y2 = y(i3, i2);
            v2 = v(i3, y2, i2) + 1;
            value = HijrahEra.BEFORE_AH.getValue();
        }
        int i10 = (int) ((j3 + 5) % 7);
        int[] iArr = {value, i2, y2 + 1, v2, i3 + 1, i10 + (i10 <= 0 ? 7 : 0)};
        int i11 = iArr[1];
        if (i11 < 1 || i11 > 9999) {
            throw new org.threeten.bp.b("Invalid year of Hijrah Era");
        }
        int i12 = iArr[2];
        if (i12 < 1 || i12 > 12) {
            throw new org.threeten.bp.b("Invalid month of Hijrah date");
        }
        s(iArr[3]);
        int i13 = iArr[4];
        if (i13 < 1 || i13 > y[6].intValue()) {
            throw new org.threeten.bp.b("Invalid day of year of Hijrah date");
        }
        this.a = HijrahEra.of(iArr[0]);
        int i14 = iArr[1];
        this.b = i14;
        this.f10779c = iArr[2];
        this.f10780d = iArr[3];
        this.f10781e = iArr[4];
        this.f10782f = DayOfWeek.of(iArr[5]);
        this.f10783g = j2;
        A(i14);
    }

    static boolean A(long j2) {
        if (j2 <= 0) {
            j2 = -j2;
        }
        return ((j2 * 11) + 14) % 30 < 11;
    }

    public static k B(int i2, int i3, int i4) {
        return i2 >= 1 ? D(HijrahEra.AH, i2, i3, i4) : D(HijrahEra.BEFORE_AH, 1 - i2, i3, i4);
    }

    static k C(org.threeten.bp.e eVar) {
        return new k(eVar.l());
    }

    static k D(HijrahEra hijrahEra, int i2, int i3, int i4) {
        org.apache.http.conn.ssl.d.k(hijrahEra, "era");
        if (i2 < 1 || i2 > 9999) {
            throw new org.threeten.bp.b("Invalid year of Hijrah Era");
        }
        if (i3 < 1 || i3 > 12) {
            throw new org.threeten.bp.b("Invalid month of Hijrah date");
        }
        s(i4);
        return new k(x(hijrahEra.prolepticYear(i2), i3, i4));
    }

    static k E(long j2) {
        return new k(j2);
    }

    private static void F(String str, int i2) throws ParseException {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(58);
            if (indexOf == -1) {
                throw new ParseException(e.a.a.a.a.k("Offset has incorrect format at line ", i2, "."), i2);
            }
            try {
                int parseInt = Integer.parseInt(nextToken.substring(indexOf + 1, nextToken.length()));
                int indexOf2 = nextToken.indexOf(45);
                if (indexOf2 == -1) {
                    throw new ParseException(e.a.a.a.a.k("Start and end year/month has incorrect format at line ", i2, "."), i2);
                }
                String substring = nextToken.substring(0, indexOf2);
                String substring2 = nextToken.substring(indexOf2 + 1, indexOf);
                int indexOf3 = substring.indexOf(47);
                int indexOf4 = substring2.indexOf(47);
                if (indexOf3 == -1) {
                    throw new ParseException(e.a.a.a.a.k("Start year/month has incorrect format at line ", i2, "."), i2);
                }
                String substring3 = substring.substring(0, indexOf3);
                String substring4 = substring.substring(indexOf3 + 1, substring.length());
                try {
                    int parseInt2 = Integer.parseInt(substring3);
                    try {
                        int parseInt3 = Integer.parseInt(substring4);
                        if (indexOf4 == -1) {
                            throw new ParseException(e.a.a.a.a.k("End year/month has incorrect format at line ", i2, "."), i2);
                        }
                        String substring5 = substring2.substring(0, indexOf4);
                        String substring6 = substring2.substring(indexOf4 + 1, substring2.length());
                        try {
                            int parseInt4 = Integer.parseInt(substring5);
                            try {
                                int parseInt5 = Integer.parseInt(substring6);
                                if (parseInt2 == -1 || parseInt3 == -1 || parseInt4 == -1 || parseInt5 == -1) {
                                    throw new ParseException(e.a.a.a.a.k("Unknown error at line ", i2, "."), i2);
                                }
                                if (parseInt2 < 1) {
                                    throw new IllegalArgumentException("startYear < 1");
                                }
                                if (parseInt4 < 1) {
                                    throw new IllegalArgumentException("endYear < 1");
                                }
                                if (parseInt3 < 0 || parseInt3 > 11) {
                                    throw new IllegalArgumentException("startMonth < 0 || startMonth > 11");
                                }
                                if (parseInt5 < 0 || parseInt5 > 11) {
                                    throw new IllegalArgumentException("endMonth < 0 || endMonth > 11");
                                }
                                if (parseInt4 > 9999) {
                                    throw new IllegalArgumentException("endYear > 9999");
                                }
                                if (parseInt4 < parseInt2) {
                                    throw new IllegalArgumentException("startYear > endYear");
                                }
                                if (parseInt4 == parseInt2 && parseInt5 < parseInt3) {
                                    throw new IllegalArgumentException("startYear == endYear && endMonth < startMonth");
                                }
                                boolean A2 = A(parseInt2);
                                Integer[] numArr = (Integer[]) e.a.a.a.a.A0(parseInt2, s);
                                if (numArr == null) {
                                    if (!A2) {
                                        numArr = new Integer[h.length];
                                        int i3 = 0;
                                        while (true) {
                                            int[] iArr = h;
                                            if (i3 >= iArr.length) {
                                                break;
                                            }
                                            numArr[i3] = new Integer(iArr[i3]);
                                            i3++;
                                        }
                                    } else {
                                        numArr = new Integer[i.length];
                                        int i4 = 0;
                                        while (true) {
                                            int[] iArr2 = i;
                                            if (i4 >= iArr2.length) {
                                                break;
                                            }
                                            numArr[i4] = new Integer(iArr2[i4]);
                                            i4++;
                                        }
                                    }
                                }
                                Integer[] numArr2 = new Integer[numArr.length];
                                for (int i5 = 0; i5 < 12; i5++) {
                                    if (i5 > parseInt3) {
                                        numArr2[i5] = new Integer(numArr[i5].intValue() - parseInt);
                                    } else {
                                        numArr2[i5] = new Integer(numArr[i5].intValue());
                                    }
                                }
                                s.put(new Integer(parseInt2), numArr2);
                                Integer[] numArr3 = (Integer[]) e.a.a.a.a.A0(parseInt2, t);
                                if (numArr3 == null) {
                                    if (!A2) {
                                        numArr3 = new Integer[j.length];
                                        int i6 = 0;
                                        while (true) {
                                            int[] iArr3 = j;
                                            if (i6 >= iArr3.length) {
                                                break;
                                            }
                                            numArr3[i6] = new Integer(iArr3[i6]);
                                            i6++;
                                        }
                                    } else {
                                        numArr3 = new Integer[k.length];
                                        int i7 = 0;
                                        while (true) {
                                            int[] iArr4 = k;
                                            if (i7 >= iArr4.length) {
                                                break;
                                            }
                                            numArr3[i7] = new Integer(iArr4[i7]);
                                            i7++;
                                        }
                                    }
                                }
                                Integer[] numArr4 = new Integer[numArr3.length];
                                for (int i8 = 0; i8 < 12; i8++) {
                                    if (i8 == parseInt3) {
                                        numArr4[i8] = new Integer(numArr3[i8].intValue() - parseInt);
                                    } else {
                                        numArr4[i8] = new Integer(numArr3[i8].intValue());
                                    }
                                }
                                t.put(new Integer(parseInt2), numArr4);
                                if (parseInt2 != parseInt4) {
                                    int i9 = parseInt2 - 1;
                                    int i10 = i9 / 30;
                                    int i11 = i9 % 30;
                                    Integer[] numArr5 = (Integer[]) e.a.a.a.a.A0(i10, u);
                                    if (numArr5 == null) {
                                        int length = o.length;
                                        Integer[] numArr6 = new Integer[length];
                                        for (int i12 = 0; i12 < length; i12++) {
                                            numArr6[i12] = new Integer(o[i12]);
                                        }
                                        numArr5 = numArr6;
                                    }
                                    for (int i13 = i11 + 1; i13 < o.length; i13++) {
                                        numArr5[i13] = new Integer(numArr5[i13].intValue() - parseInt);
                                    }
                                    u.put(new Integer(i10), numArr5);
                                    int i14 = parseInt4 - 1;
                                    int i15 = i14 / 30;
                                    if (i10 != i15) {
                                        while (true) {
                                            i10++;
                                            Long[] lArr = v;
                                            if (i10 >= lArr.length) {
                                                break;
                                            } else {
                                                lArr[i10] = new Long(lArr[i10].longValue() - parseInt);
                                            }
                                        }
                                        int i16 = i15 + 1;
                                        while (true) {
                                            Long[] lArr2 = v;
                                            if (i16 >= lArr2.length) {
                                                break;
                                            }
                                            lArr2[i16] = new Long(lArr2[i16].longValue() + parseInt);
                                            i16++;
                                        }
                                    }
                                    int i17 = i14 % 30;
                                    Integer[] numArr7 = (Integer[]) e.a.a.a.a.A0(i15, u);
                                    if (numArr7 == null) {
                                        int length2 = o.length;
                                        Integer[] numArr8 = new Integer[length2];
                                        for (int i18 = 0; i18 < length2; i18++) {
                                            numArr8[i18] = new Integer(o[i18]);
                                        }
                                        numArr7 = numArr8;
                                    }
                                    while (true) {
                                        i17++;
                                        if (i17 >= o.length) {
                                            break;
                                        } else {
                                            numArr7[i17] = new Integer(numArr7[i17].intValue() + parseInt);
                                        }
                                    }
                                    u.put(new Integer(i15), numArr7);
                                }
                                boolean A3 = A(parseInt4);
                                Integer[] numArr9 = (Integer[]) e.a.a.a.a.A0(parseInt4, s);
                                if (numArr9 == null) {
                                    if (!A3) {
                                        numArr9 = new Integer[h.length];
                                        int i19 = 0;
                                        while (true) {
                                            int[] iArr5 = h;
                                            if (i19 >= iArr5.length) {
                                                break;
                                            }
                                            numArr9[i19] = new Integer(iArr5[i19]);
                                            i19++;
                                        }
                                    } else {
                                        numArr9 = new Integer[i.length];
                                        int i20 = 0;
                                        while (true) {
                                            int[] iArr6 = i;
                                            if (i20 >= iArr6.length) {
                                                break;
                                            }
                                            numArr9[i20] = new Integer(iArr6[i20]);
                                            i20++;
                                        }
                                    }
                                }
                                Integer[] numArr10 = new Integer[numArr9.length];
                                int i21 = 0;
                                for (int i22 = 12; i21 < i22; i22 = 12) {
                                    if (i21 > parseInt5) {
                                        numArr10[i21] = new Integer(numArr9[i21].intValue() + parseInt);
                                    } else {
                                        numArr10[i21] = new Integer(numArr9[i21].intValue());
                                    }
                                    i21++;
                                }
                                s.put(new Integer(parseInt4), numArr10);
                                Integer[] numArr11 = (Integer[]) e.a.a.a.a.A0(parseInt4, t);
                                if (numArr11 == null) {
                                    if (!A3) {
                                        numArr11 = new Integer[j.length];
                                        int i23 = 0;
                                        while (true) {
                                            int[] iArr7 = j;
                                            if (i23 >= iArr7.length) {
                                                break;
                                            }
                                            numArr11[i23] = new Integer(iArr7[i23]);
                                            i23++;
                                        }
                                    } else {
                                        numArr11 = new Integer[k.length];
                                        int i24 = 0;
                                        while (true) {
                                            int[] iArr8 = k;
                                            if (i24 >= iArr8.length) {
                                                break;
                                            }
                                            numArr11[i24] = new Integer(iArr8[i24]);
                                            i24++;
                                        }
                                    }
                                }
                                Integer[] numArr12 = new Integer[numArr11.length];
                                for (int i25 = 0; i25 < 12; i25++) {
                                    if (i25 == parseInt5) {
                                        numArr12[i25] = new Integer(numArr11[i25].intValue() + parseInt);
                                    } else {
                                        numArr12[i25] = new Integer(numArr11[i25].intValue());
                                    }
                                }
                                HashMap<Integer, Integer[]> hashMap = t;
                                hashMap.put(new Integer(parseInt4), numArr12);
                                Integer[] numArr13 = (Integer[]) e.a.a.a.a.A0(parseInt2, hashMap);
                                Integer[] numArr14 = (Integer[]) e.a.a.a.a.A0(parseInt4, hashMap);
                                HashMap<Integer, Integer[]> hashMap2 = s;
                                Integer[] numArr15 = (Integer[]) e.a.a.a.a.A0(parseInt2, hashMap2);
                                Integer[] numArr16 = (Integer[]) e.a.a.a.a.A0(parseInt4, hashMap2);
                                int intValue = numArr13[parseInt3].intValue();
                                int intValue2 = numArr14[parseInt5].intValue();
                                int intValue3 = numArr13[11].intValue() + numArr15[11].intValue();
                                int intValue4 = numArr14[11].intValue() + numArr16[11].intValue();
                                Integer[] numArr17 = y;
                                int intValue5 = numArr17[5].intValue();
                                Integer[] numArr18 = x;
                                int intValue6 = numArr18[5].intValue();
                                if (intValue5 < intValue) {
                                    intValue5 = intValue;
                                }
                                if (intValue5 < intValue2) {
                                    intValue5 = intValue2;
                                }
                                numArr17[5] = new Integer(intValue5);
                                if (intValue6 <= intValue) {
                                    intValue = intValue6;
                                }
                                if (intValue <= intValue2) {
                                    intValue2 = intValue;
                                }
                                numArr18[5] = new Integer(intValue2);
                                int intValue7 = numArr17[6].intValue();
                                int intValue8 = numArr18[6].intValue();
                                if (intValue7 < intValue3) {
                                    intValue7 = intValue3;
                                }
                                if (intValue7 < intValue4) {
                                    intValue7 = intValue4;
                                }
                                numArr17[6] = new Integer(intValue7);
                                if (intValue8 <= intValue3) {
                                    intValue3 = intValue8;
                                }
                                if (intValue3 <= intValue4) {
                                    intValue4 = intValue3;
                                }
                                numArr18[6] = new Integer(intValue4);
                            } catch (NumberFormatException unused) {
                                throw new ParseException(e.a.a.a.a.k("End month is not properly set at line ", i2, "."), i2);
                            }
                        } catch (NumberFormatException unused2) {
                            throw new ParseException(e.a.a.a.a.k("End year is not properly set at line ", i2, "."), i2);
                        }
                    } catch (NumberFormatException unused3) {
                        throw new ParseException(e.a.a.a.a.k("Start month is not properly set at line ", i2, "."), i2);
                    }
                } catch (NumberFormatException unused4) {
                    throw new ParseException(e.a.a.a.a.k("Start year is not properly set at line ", i2, "."), i2);
                }
            } catch (NumberFormatException unused5) {
                throw new ParseException(e.a.a.a.a.k("Offset is not properly set at line ", i2, "."), i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x012d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void H() throws java.io.IOException, java.text.ParseException {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.threeten.bp.chrono.k.H():void");
    }

    private static k I(int i2, int i3, int i4) {
        int intValue = u(i2)[i3 - 1].intValue();
        if (i4 > intValue) {
            i4 = intValue;
        }
        return B(i2, i3, i4);
    }

    private static void s(int i2) {
        if (i2 < 1 || i2 > y[5].intValue()) {
            StringBuilder N = e.a.a.a.a.N("Invalid day of month of Hijrah date, day ", i2, " greater than ");
            N.append(y[5].intValue());
            N.append(" or less than 1");
            throw new org.threeten.bp.b(N.toString());
        }
    }

    private static Integer[] t(int i2) {
        Integer[] numArr;
        try {
            numArr = u.get(new Integer(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? D : numArr;
    }

    private static Integer[] u(int i2) {
        Integer[] numArr;
        try {
            numArr = s.get(new Integer(i2));
        } catch (ArrayIndexOutOfBoundsException unused) {
            numArr = null;
        }
        return numArr == null ? A((long) i2) ? A : z : numArr;
    }

    private static int v(int i2, int i3, int i4) {
        int intValue;
        Integer[] u2 = u(i4);
        if (i2 < 0) {
            i2 = A((long) i4) ? i2 + 355 : i2 + 354;
            if (i3 <= 0) {
                return i2;
            }
            intValue = u2[i3].intValue();
        } else {
            if (i3 <= 0) {
                return i2;
            }
            intValue = u2[i3].intValue();
        }
        return i2 - intValue;
    }

    private static int w(int i2, int i3, int i4) {
        Integer[] t2 = t(i2);
        return i3 > 0 ? i3 - t2[i4].intValue() : t2[i4].intValue() + i3;
    }

    private static long x(int i2, int i3, int i4) {
        Long l2;
        int i5 = i2 - 1;
        int i6 = i5 / 30;
        int i7 = i5 % 30;
        int intValue = t(i6)[Math.abs(i7)].intValue();
        if (i7 < 0) {
            intValue = -intValue;
        }
        try {
            l2 = v[i6];
        } catch (ArrayIndexOutOfBoundsException unused) {
            l2 = null;
        }
        if (l2 == null) {
            l2 = new Long(i6 * 10631);
        }
        return (((l2.longValue() + intValue) - 492148) - 1) + u(i2)[i3 - 1].intValue() + i4;
    }

    private static int y(int i2, int i3) {
        Integer[] u2 = u(i3);
        int i4 = 0;
        if (i2 >= 0) {
            while (i4 < u2.length) {
                if (i2 < u2[i4].intValue()) {
                    return i4 - 1;
                }
                i4++;
            }
            return 11;
        }
        int i5 = A((long) i3) ? i2 + 355 : i2 + 354;
        while (i4 < u2.length) {
            if (i5 < u2[i4].intValue()) {
                return i4 - 1;
            }
            i4++;
        }
        return 11;
    }

    private static int z(int i2, long j2) {
        Integer[] t2 = t(i2);
        int i3 = 0;
        if (j2 == 0) {
            return 0;
        }
        if (j2 > 0) {
            while (i3 < t2.length) {
                if (j2 < t2[i3].intValue()) {
                    return i3 - 1;
                }
                i3++;
            }
            return 29;
        }
        long j3 = -j2;
        while (i3 < t2.length) {
            if (j3 <= t2[i3].intValue()) {
                return i3 - 1;
            }
            i3++;
        }
        return 29;
    }

    k G(long j2) {
        return new k(this.f10783g + j2);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public k a(org.threeten.bp.temporal.e eVar, long j2) {
        if (!(eVar instanceof ChronoField)) {
            return (k) eVar.adjustInto(this, j2);
        }
        ChronoField chronoField = (ChronoField) eVar;
        chronoField.checkValidValue(j2);
        int i2 = (int) j2;
        switch (chronoField.ordinal()) {
            case 15:
                return G(j2 - this.f10782f.getValue());
            case 16:
                return G(j2 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 17:
                return G(j2 - getLong(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 18:
                return I(this.b, this.f10779c, i2);
            case 19:
                int i3 = i2 - 1;
                return I(this.b, (i3 / 30) + 1, (i3 % 30) + 1);
            case 20:
                return new k(i2);
            case 21:
                return G((j2 - getLong(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 22:
                return G((j2 - getLong(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 23:
                return I(this.b, i2, this.f10780d);
            case 24:
            default:
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
            case 25:
                if (this.b < 1) {
                    i2 = 1 - i2;
                }
                return I(i2, this.f10779c, this.f10780d);
            case 26:
                return I(i2, this.f10779c, this.f10780d);
            case 27:
                return I(1 - this.b, this.f10779c, this.f10780d);
        }
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a b(org.threeten.bp.temporal.c cVar) {
        return (k) j.f10775c.d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.b, org.threeten.bp.o.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a c(long j2, org.threeten.bp.temporal.h hVar) {
        return (k) super.c(j2, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b, org.threeten.bp.temporal.a
    public org.threeten.bp.temporal.a d(long j2, org.threeten.bp.temporal.h hVar) {
        return (k) super.d(j2, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b
    public final c<k> f(org.threeten.bp.g gVar) {
        return d.q(this, gVar);
    }

    @Override // org.threeten.bp.temporal.b
    public long getLong(org.threeten.bp.temporal.e eVar) {
        int value;
        int i2;
        if (!(eVar instanceof ChronoField)) {
            return eVar.getFrom(this);
        }
        switch (((ChronoField) eVar).ordinal()) {
            case 15:
                value = this.f10782f.getValue();
                return value;
            case 16:
                i2 = (this.f10780d - 1) % 7;
                value = i2 + 1;
                return value;
            case 17:
                i2 = (this.f10781e - 1) % 7;
                value = i2 + 1;
                return value;
            case 18:
                value = this.f10780d;
                return value;
            case 19:
                value = this.f10781e;
                return value;
            case 20:
                return l();
            case 21:
                i2 = (this.f10780d - 1) / 7;
                value = i2 + 1;
                return value;
            case 22:
                i2 = (this.f10781e - 1) / 7;
                value = i2 + 1;
                return value;
            case 23:
                value = this.f10779c;
                return value;
            case 24:
            default:
                throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
            case 25:
                value = this.b;
                return value;
            case 26:
                value = this.b;
                return value;
            case 27:
                value = this.a.getValue();
                return value;
        }
    }

    @Override // org.threeten.bp.chrono.b
    public h h() {
        return j.f10775c;
    }

    @Override // org.threeten.bp.chrono.b
    public i i() {
        return this.a;
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: j */
    public b c(long j2, org.threeten.bp.temporal.h hVar) {
        return (k) super.c(j2, hVar);
    }

    @Override // org.threeten.bp.chrono.a, org.threeten.bp.chrono.b
    /* renamed from: k */
    public b d(long j2, org.threeten.bp.temporal.h hVar) {
        return (k) super.d(j2, hVar);
    }

    @Override // org.threeten.bp.chrono.b
    public long l() {
        return x(this.b, this.f10779c, this.f10780d);
    }

    @Override // org.threeten.bp.chrono.b
    /* renamed from: m */
    public b b(org.threeten.bp.temporal.c cVar) {
        return (k) j.f10775c.d(cVar.adjustInto(this));
    }

    @Override // org.threeten.bp.chrono.a
    /* renamed from: o */
    public a<k> d(long j2, org.threeten.bp.temporal.h hVar) {
        return (k) super.d(j2, hVar);
    }

    @Override // org.threeten.bp.chrono.a
    a<k> p(long j2) {
        return new k(this.f10783g + j2);
    }

    @Override // org.threeten.bp.chrono.a
    a<k> q(long j2) {
        if (j2 == 0) {
            return this;
        }
        int i2 = (this.f10779c - 1) + ((int) j2);
        int i3 = i2 / 12;
        int i4 = i2 % 12;
        while (i4 < 0) {
            i4 += 12;
            int i5 = i3 - 1;
            if ((i3 ^ i5) < 0 && (i3 ^ 1) < 0) {
                throw new ArithmeticException(e.a.a.a.a.l("Subtraction overflows an int: ", i3, " - ", 1));
            }
            i3 = i5;
        }
        return D(this.a, org.apache.http.conn.ssl.d.l(this.b, i3), i4 + 1, this.f10780d);
    }

    @Override // org.threeten.bp.chrono.a
    a<k> r(long j2) {
        if (j2 == 0) {
            return this;
        }
        return D(this.a, org.apache.http.conn.ssl.d.l(this.b, (int) j2), this.f10779c, this.f10780d);
    }

    @Override // org.threeten.bp.o.c, org.threeten.bp.temporal.b
    public org.threeten.bp.temporal.j range(org.threeten.bp.temporal.e eVar) {
        int i2;
        if (!(eVar instanceof ChronoField)) {
            return eVar.rangeRefinedBy(this);
        }
        if (!isSupported(eVar)) {
            throw new org.threeten.bp.temporal.i(e.a.a.a.a.z("Unsupported field: ", eVar));
        }
        ChronoField chronoField = (ChronoField) eVar;
        int ordinal = chronoField.ordinal();
        Integer[] numArr = null;
        if (ordinal == 18) {
            int i3 = this.f10779c - 1;
            int i4 = this.b;
            try {
                numArr = t.get(new Integer(i4));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (numArr == null) {
                numArr = A((long) i4) ? C : B;
            }
            return org.threeten.bp.temporal.j.g(1L, numArr[i3].intValue());
        }
        if (ordinal != 19) {
            if (ordinal == 21) {
                return org.threeten.bp.temporal.j.g(1L, 5L);
            }
            if (ordinal == 25) {
                return org.threeten.bp.temporal.j.g(1L, 1000L);
            }
            j jVar = j.f10775c;
            return chronoField.range();
        }
        int i5 = this.b;
        int i6 = i5 - 1;
        int i7 = i6 / 30;
        try {
            numArr = u.get(Integer.valueOf(i7));
        } catch (ArrayIndexOutOfBoundsException unused2) {
        }
        if (numArr != null) {
            int i8 = i6 % 30;
            if (i8 == 29) {
                Long[] lArr = v;
                i2 = (lArr[i7 + 1].intValue() - lArr[i7].intValue()) - numArr[i8].intValue();
            } else {
                i2 = numArr[i8 + 1].intValue() - numArr[i8].intValue();
            }
        } else {
            i2 = A((long) i5) ? 355 : 354;
        }
        return org.threeten.bp.temporal.j.g(1L, i2);
    }
}
