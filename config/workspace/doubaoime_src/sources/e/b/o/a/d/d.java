package e.b.o.a.d;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class d {
    private static Method a;

    static {
        try {
            for (Method method : Class.forName("android.os.SystemProperties").getMethods()) {
                String name = method.getName();
                if (name.equals(MonitorConstants.CONNECT_TYPE_GET)) {
                    a = method;
                } else if (!name.equals("set") && !name.equals("getLong")) {
                    name.equals("getInt");
                }
            }
        } catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public static String a(String str, String str2) {
        Method method = a;
        if (method == null) {
            return str2;
        }
        try {
            return (String) method.invoke(null, str, str2);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return str2;
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
            return str2;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return str2;
        }
    }
}
