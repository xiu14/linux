package ms.bd.c;

import android.content.Context;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class w4 {
    public final Class a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f10471c;

    public w4(Context context) {
        try {
            Class<?> cls = Class.forName((String) y2.a(16777217, 0, 0L, "1ebfed", new byte[]{35, 104, 28, 92, 91, 125, 54, 86, 60, 63, 36, 41, 24, 22, 20, 122, 63, 84, 63, 120, 9, 99, 33, 0, 85, 101, 59, 64, 54, 36, 9, 106, 1, 30}));
            this.a = cls;
            this.b = cls.newInstance();
        } catch (Exception unused) {
        }
        try {
            this.f10471c = this.a.getMethod((String) y2.a(16777217, 0, 0L, "e9075b", new byte[]{115, 62, 87, 108, 43, 92, 66}), Context.class);
        } catch (Exception unused2) {
        }
    }
}
