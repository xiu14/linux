package com.bytedance.lego.init.z;

import android.util.Log;
import com.bytedance.lego.init.InitScheduler;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    public static final a a = new a();

    private a() {
    }

    public final void a(String str, String str2) {
        l.g(str, "classname");
        l.g(str2, "message");
        if (InitScheduler.INSTANCE.isDebug$initscheduler_release()) {
            String str3 = str + ' ' + str2;
            int length = str3.length();
            int i = 0;
            int i2 = 3072;
            int i3 = 1;
            while (i3 <= 100) {
                if (length <= i2) {
                    String j = e.a.a.a.a.j("#inittask#", i3);
                    String substring = str3.substring(i, length);
                    l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.d(j, substring);
                    return;
                }
                String j2 = e.a.a.a.a.j("#inittask#", i3);
                String substring2 = str3.substring(i, i2);
                l.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Log.d(j2, substring2);
                i3++;
                i = i2;
                i2 += 3072;
            }
        }
    }

    public final void b(String str, String str2) {
        l.g(str, "classname");
        l.g(str2, "message");
        if (InitScheduler.INSTANCE.isDebug$initscheduler_release()) {
            String str3 = str + ' ' + str2;
            int length = str3.length();
            int i = 0;
            int i2 = 3072;
            int i3 = 1;
            while (i3 <= 100) {
                if (length <= i2) {
                    String j = e.a.a.a.a.j("#inittask#", i3);
                    String substring = str3.substring(i, length);
                    l.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.v(j, substring);
                    return;
                }
                String j2 = e.a.a.a.a.j("#inittask#", i3);
                String substring2 = str3.substring(i, i2);
                l.b(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                Log.v(j2, substring2);
                i3++;
                i = i2;
                i2 += 3072;
            }
        }
    }
}
