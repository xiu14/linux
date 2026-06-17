package com.bytedance.memory.b;

import androidx.annotation.NonNull;
import java.io.File;
import java.math.BigDecimal;

/* loaded from: classes.dex */
public class d {
    private static long a = -1;

    public static void a(@NonNull File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    file2.delete();
                } else if (file.isDirectory()) {
                    a(file2);
                }
            }
        }
        file.delete();
    }

    public static float b() {
        BigDecimal bigDecimal = new BigDecimal(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        long j = a;
        if (j == -1) {
            j = Runtime.getRuntime().maxMemory();
            a = j;
        }
        float doubleValue = ((float) bigDecimal.divide(new BigDecimal(j), 4, 4).doubleValue()) * 100.0f;
        c.b("currentRate %f", Float.valueOf(doubleValue));
        return doubleValue;
    }
}
