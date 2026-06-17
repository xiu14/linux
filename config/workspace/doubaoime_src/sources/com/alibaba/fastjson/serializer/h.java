package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.parser.Feature;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h implements t, com.alibaba.fastjson.parser.o.f {
    public static final h a = new h();

    private h() {
    }

    @Override // com.alibaba.fastjson.parser.o.f
    public <T> T a(com.alibaba.fastjson.parser.b bVar, Type type, Object obj) {
        return (T) c(bVar, type, obj, null);
    }

    @Override // com.alibaba.fastjson.serializer.t
    public void b(m mVar, Object obj, Object obj2, Type type) throws IOException {
        char[] charArray;
        y yVar = mVar.b;
        if (obj == null) {
            yVar.write("null");
            return;
        }
        if ((yVar.f1531c & SerializerFeature.WriteClassName.mask) != 0 && obj.getClass() != type) {
            if (obj.getClass() == Date.class) {
                yVar.write("new Date(");
                yVar.r(((Date) obj).getTime());
                yVar.write(41);
                return;
            }
            yVar.write(123);
            yVar.o("@type", false);
            mVar.g(obj.getClass().getName());
            yVar.write(44);
            yVar.o("val", false);
            yVar.r(((Date) obj).getTime());
            yVar.write(125);
            return;
        }
        Date time = obj instanceof Calendar ? ((Calendar) obj).getTime() : (Date) obj;
        if ((yVar.f1531c & SerializerFeature.WriteDateUseDateFormat.mask) != 0) {
            DateFormat b = mVar.b();
            if (b == null) {
                b = new SimpleDateFormat(com.alibaba.fastjson.a.f1465d, mVar.o);
                b.setTimeZone(mVar.n);
            }
            yVar.w(b.format(time));
            return;
        }
        long time2 = time.getTime();
        int i = yVar.f1531c;
        if ((SerializerFeature.UseISO8601DateFormat.mask & i) == 0) {
            yVar.r(time2);
            return;
        }
        SerializerFeature serializerFeature = SerializerFeature.UseSingleQuotes;
        if ((i & serializerFeature.mask) != 0) {
            yVar.write(39);
        } else {
            yVar.write(34);
        }
        Calendar calendar = Calendar.getInstance(mVar.n, mVar.o);
        calendar.setTimeInMillis(time2);
        int i2 = calendar.get(1);
        int i3 = calendar.get(2) + 1;
        int i4 = calendar.get(5);
        int i5 = calendar.get(11);
        int i6 = calendar.get(12);
        int i7 = calendar.get(13);
        int i8 = calendar.get(14);
        if (i8 != 0) {
            charArray = "0000-00-00T00:00:00.000".toCharArray();
            y.l(i8, 23, charArray);
            y.l(i7, 19, charArray);
            y.l(i6, 16, charArray);
            y.l(i5, 13, charArray);
            y.l(i4, 10, charArray);
            y.l(i3, 7, charArray);
            y.l(i2, 4, charArray);
        } else if (i7 == 0 && i6 == 0 && i5 == 0) {
            charArray = "0000-00-00".toCharArray();
            y.l(i4, 10, charArray);
            y.l(i3, 7, charArray);
            y.l(i2, 4, charArray);
        } else {
            charArray = "0000-00-00T00:00:00".toCharArray();
            y.l(i7, 19, charArray);
            y.l(i6, 16, charArray);
            y.l(i5, 13, charArray);
            y.l(i4, 10, charArray);
            y.l(i3, 7, charArray);
            y.l(i2, 4, charArray);
        }
        yVar.write(charArray);
        if ((yVar.f1531c & serializerFeature.mask) != 0) {
            yVar.write(39);
        } else {
            yVar.write(34);
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, java.util.Calendar] */
    /* JADX WARN: Type inference failed for: r11v8, types: [T, java.util.Calendar] */
    public <T> T c(com.alibaba.fastjson.parser.b bVar, Type type, Object obj, String str) {
        Object obj2;
        Object obj3;
        Date date;
        com.alibaba.fastjson.parser.d dVar = bVar.f1481e;
        int Y = dVar.Y();
        if (Y == 2) {
            Object obj4 = (T) Long.valueOf(dVar.n());
            dVar.s(16);
            obj2 = obj4;
        } else if (Y == 4) {
            String V = dVar.V();
            dVar.s(16);
            obj2 = V;
            if ((dVar.f1486c & Feature.AllowISO8601DateFormat.mask) != 0) {
                com.alibaba.fastjson.parser.d dVar2 = new com.alibaba.fastjson.parser.d(V, com.alibaba.fastjson.a.f1464c);
                Object obj5 = V;
                if (dVar2.I(true)) {
                    ?? r0 = (T) dVar2.n;
                    if (type == Calendar.class) {
                        return r0;
                    }
                    obj5 = r0.getTime();
                }
            }
        } else if (Y == 8) {
            dVar.r();
            obj2 = null;
        } else if (Y == 12) {
            dVar.r();
            if (dVar.Y() != 4) {
                throw new com.alibaba.fastjson.d("syntax error");
            }
            if ("@type".equals(dVar.V())) {
                dVar.r();
                bVar.a(17);
                String V2 = dVar.V();
                Objects.requireNonNull(bVar.b);
                Class<?> x = com.alibaba.fastjson.h.d.x(V2, null);
                if (x != null) {
                    type = x;
                }
                bVar.a(4);
                bVar.a(16);
            }
            dVar.t(':');
            int Y2 = dVar.Y();
            if (Y2 != 2) {
                StringBuilder M = e.a.a.a.a.M("syntax error : ");
                M.append(d.a.b.a.k(Y2));
                throw new com.alibaba.fastjson.d(M.toString());
            }
            long n = dVar.n();
            dVar.r();
            Long valueOf = Long.valueOf(n);
            bVar.a(13);
            obj2 = valueOf;
        } else if (bVar.j == 2) {
            bVar.j = 0;
            bVar.a(16);
            if (dVar.Y() != 4) {
                throw new com.alibaba.fastjson.d("syntax error");
            }
            if (!"val".equals(dVar.V())) {
                throw new com.alibaba.fastjson.d("syntax error");
            }
            dVar.r();
            bVar.a(17);
            Object s = bVar.s();
            bVar.a(13);
            obj2 = s;
        } else {
            obj2 = bVar.s();
        }
        if (obj2 != null) {
            boolean z = obj2 instanceof Date;
            obj3 = obj2;
            if (!z) {
                if (obj2 instanceof Number) {
                    date = new Date(((Number) obj2).longValue());
                } else {
                    if (!(obj2 instanceof String)) {
                        throw new com.alibaba.fastjson.d("parse error");
                    }
                    String str2 = (String) obj2;
                    if (str2.length() != 0) {
                        com.alibaba.fastjson.parser.d dVar3 = new com.alibaba.fastjson.parser.d(str2, com.alibaba.fastjson.a.f1464c);
                        try {
                            if (dVar3.I(false)) {
                                Calendar calendar = dVar3.n;
                                Date date2 = calendar;
                                if (type != Calendar.class) {
                                    date2 = calendar.getTime();
                                }
                            } else {
                                try {
                                    obj3 = (T) (str != null ? new SimpleDateFormat(str) : bVar.o()).parse(str2);
                                } catch (ParseException unused) {
                                    date = new Date(Long.parseLong(str2));
                                }
                            }
                        } finally {
                            dVar3.e();
                        }
                    }
                }
                obj3 = (T) date;
            }
            if (type != Calendar.class && !(obj3 instanceof Calendar)) {
                Date date3 = (Date) obj3;
                if (date3 == null) {
                    return null;
                }
                ?? r11 = (T) Calendar.getInstance(dVar.l, dVar.m);
                r11.setTime(date3);
                return r11;
            }
        }
        obj3 = (T) null;
        return type != Calendar.class ? (T) obj3 : (T) obj3;
    }
}
