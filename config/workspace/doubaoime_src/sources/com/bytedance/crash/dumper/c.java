package com.bytedance.crash.dumper;

import com.bytedance.crash.C0648c;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.monitor.l;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c {
    private static volatile boolean a = true;
    private static int b = 1048576;

    public static void a(File file, CrashType crashType) {
        com.bytedance.crash.monitor.a e2 = l.e();
        if (e2 == null || !a) {
            return;
        }
        try {
            Iterator<C0648c> it2 = e2.j().v(crashType).iterator();
            int i = 0;
            while (it2.hasNext()) {
                File[] a2 = it2.next().a(crashType);
                if (a2 != null) {
                    for (File file2 : a2) {
                        File file3 = new File(file, file2.getName());
                        if (!file3.exists()) {
                            i = (int) (i + file2.length());
                            if (i > b) {
                                break;
                            } else {
                                com.bytedance.crash.util.a.a(file2, file3, Integer.MAX_VALUE, false);
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void b(boolean z, int i) {
        a = z;
        if (i > 0) {
            b = i;
        }
    }
}
