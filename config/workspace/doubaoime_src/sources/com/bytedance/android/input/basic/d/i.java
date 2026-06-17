package com.bytedance.android.input.basic.d;

import com.bytedance.android.input.basic.IAppGlobals;
import com.prolificinteractive.materialcalendarview.r;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class i {
    private static final String a(Date date, String str) {
        String format = new SimpleDateFormat(str, Locale.CHINA).format(date);
        l.e(format, "sdf.format(date)");
        return format;
    }

    public static final String b(long j) {
        if (j <= 1000000000000L) {
            j *= 1000;
        }
        try {
            Date date = new Date(j);
            Date date2 = new Date();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(date2);
            l.e(calendar, "targetCal");
            l.e(calendar2, "nowCal");
            if (c(calendar, calendar2)) {
                return a(date, "HH:mm");
            }
            Calendar calendar3 = Calendar.getInstance();
            calendar3.setTime(calendar2.getTime());
            calendar3.add(6, -1);
            l.e(calendar3, "yesterdayCal");
            if (!c(calendar, calendar3)) {
                return calendar.get(1) == calendar2.get(1) ? a(date, "M月d日 HH:mm") : a(date, "yyyy年M月d日");
            }
            return "昨天 " + a(date, "HH:mm");
        } catch (Throwable th) {
            Throwable b = kotlin.h.b(r.J(th));
            if (b == null) {
                return "";
            }
            IAppGlobals.a aVar = IAppGlobals.a;
            StringBuilder M = e.a.a.a.a.M("formatTimestamp error: ");
            M.append(kotlin.a.d(b));
            aVar.j("TimeFormatUtils", M.toString());
            return "";
        }
    }

    private static final boolean c(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }
}
