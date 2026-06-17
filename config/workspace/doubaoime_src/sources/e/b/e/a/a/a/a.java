package e.b.e.a.a.a;

import com.google.gson.Gson;
import com.google.gson.d;
import java.lang.reflect.Type;
import kotlin.s.c.l;

/* loaded from: classes.dex */
public final class a {
    private static final Gson a = new d().c();

    public static final <T> T a(String str, Type type) {
        l.g(str, "json");
        l.g(type, "type");
        try {
            return (T) a.d(str, type);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
