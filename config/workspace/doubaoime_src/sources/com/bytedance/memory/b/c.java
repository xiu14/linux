package com.bytedance.memory.b;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class c {
    private static volatile b a = new a();

    private static class a implements b {
        a() {
        }
    }

    public interface b {
    }

    public static void a(@Nullable Throwable th, @NonNull String str, @NonNull Object... objArr) {
        String str2 = String.format(str, objArr) + '\n' + Log.getStackTraceString(th);
        Object[] objArr2 = new Object[0];
        if (e.a) {
            String format = String.format(str2, objArr2);
            if (format.length() < 4000) {
                Log.d("memory", format);
                return;
            }
            for (String str3 : format.split("\n", -1)) {
                Log.d("memory", str3);
            }
        }
    }

    public static void b(@NonNull String str, @NonNull Object... objArr) {
        if (e.a) {
            String format = String.format(str, objArr);
            if (format.length() < 4000) {
                Log.d("memory", format);
                return;
            }
            for (String str2 : format.split("\n", -1)) {
                Log.d("memory", str2);
            }
        }
    }
}
