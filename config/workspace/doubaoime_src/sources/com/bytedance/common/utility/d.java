package com.bytedance.common.utility;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    private static a a;
    private static boolean b;

    /* renamed from: c, reason: collision with root package name */
    private static Printer f4168c;

    static class a implements Printer {
        List<Printer> a = new ArrayList();
        List<Printer> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        List<Printer> f4169c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        boolean f4170d = false;

        /* renamed from: e, reason: collision with root package name */
        boolean f4171e = false;

        a() {
        }

        @Override // android.util.Printer
        public void println(String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.charAt(0) == '>' && this.f4171e) {
                for (Printer printer : this.f4169c) {
                    if (!this.a.contains(printer)) {
                        this.a.add(printer);
                    }
                }
                this.f4169c.clear();
                this.f4171e = false;
            }
            if (this.a.size() > 5) {
                Log.e("LooperPrinterUtils", "wrapper contains too many printer,please check if the useless printer have been removed");
            }
            for (Printer printer2 : this.a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.charAt(0) == '<' && this.f4170d) {
                for (Printer printer3 : this.b) {
                    this.a.remove(printer3);
                    this.f4169c.remove(printer3);
                }
                this.b.clear();
                this.f4170d = false;
            }
        }
    }

    public static void a(Printer printer) {
        if (printer == null || a.f4169c.contains(printer)) {
            return;
        }
        a.f4169c.add(printer);
        a.f4171e = true;
    }

    public static List<Printer> b() {
        a aVar = a;
        if (aVar != null) {
            return aVar.a;
        }
        return null;
    }

    public static void c() {
        Printer printer;
        if (b) {
            return;
        }
        b = true;
        a = new a();
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            printer = (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            printer = null;
        }
        f4168c = printer;
        if (printer != null) {
            a.a.add(printer);
        }
        Looper.getMainLooper().setMessageLogging(a);
    }

    public static void d(Printer printer) {
        if (printer == null || a.b.contains(printer)) {
            return;
        }
        a.b.add(printer);
        a.f4170d = true;
    }
}
