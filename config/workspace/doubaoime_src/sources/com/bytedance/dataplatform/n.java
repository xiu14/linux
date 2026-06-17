package com.bytedance.dataplatform;

import android.app.Application;
import androidx.annotation.NonNull;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes.dex */
public final class n {
    private static a a;

    public interface a {
        void a(Application application, r rVar, q qVar, j jVar);

        <T> T b(@NonNull String str, @NonNull Type type);

        void c(@NonNull String str, Set<Object> set);

        void d(boolean z);
    }

    public static void a(@NonNull String str, Set<Object> set) {
        a aVar = a;
        if (aVar == null) {
            return;
        }
        aVar.c(str, set);
    }

    public static void b(boolean z) {
        a aVar = a;
        if (aVar == null) {
            return;
        }
        aVar.d(z);
    }

    static <T> T c(@NonNull String str, @NonNull Type type) {
        a aVar = a;
        if (aVar == null) {
            return null;
        }
        return (T) aVar.b(str, type);
    }

    static void d(Application application, r rVar, q qVar, j jVar) {
        a aVar = a;
        if (aVar == null) {
            return;
        }
        aVar.a(application, rVar, qVar, jVar);
    }

    static void e(a aVar) {
        a = aVar;
    }
}
