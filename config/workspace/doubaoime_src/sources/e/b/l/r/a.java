package e.b.l.r;

import androidx.annotation.NonNull;
import com.bytedance.rpc.annotation.f;
import com.bytedance.rpc.annotation.i;
import e.b.l.o;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e.b.l.r.a$a, reason: collision with other inner class name */
    private interface InterfaceC0442a {
        @f("$GET {url}")
        Object a(@i("url") String str, Object obj, @NonNull Class<?> cls);
    }

    public static <T> T a(@NonNull String str, Object obj, @NonNull Class<T> cls) {
        return (T) ((InterfaceC0442a) o.f(InterfaceC0442a.class)).a(str, null, cls);
    }
}
