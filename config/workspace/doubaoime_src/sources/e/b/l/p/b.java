package e.b.l.p;

import androidx.annotation.NonNull;
import e.b.l.f;
import e.b.l.n;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public interface b {
    boolean a(@NonNull Class cls, @NonNull Method method, Object obj, @NonNull ThreadLocal threadLocal, @NonNull Map<String, String> map, @NonNull String str) throws Exception;

    void b(@NonNull Class cls, @NonNull Method method, @NonNull f fVar, @NonNull String str);

    boolean c(@NonNull Class cls, @NonNull Method method, @NonNull Object[] objArr, @NonNull n nVar, @NonNull String str) throws Exception;
}
