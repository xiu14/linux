package ms.bd.c;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.ArrayMap;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class n {
    public static volatile int a = -1;
    public static volatile String b = "";

    /* renamed from: c, reason: collision with root package name */
    public static volatile String f10407c;

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f10408d = new HashMap(3);

    /* renamed from: e, reason: collision with root package name */
    public static boolean f10409e = false;

    /* renamed from: f, reason: collision with root package name */
    public static final HandlerThread f10410f = new HandlerThread((String) y2.a(16777217, 0, 0, "e0cdb4", new byte[]{121, 33, 3, 20, 86}));

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicBoolean f10411g = new AtomicBoolean(true);
    public static Handler h = null;

    public static int a() {
        try {
            return c() != null ? 1 : 0;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static void b(int i) {
        String str;
        HashMap hashMap = f10408d;
        if (hashMap == null || hashMap.size() <= 0) {
            str = null;
        } else {
            Iterator it2 = hashMap.entrySet().iterator();
            str = "";
            int i2 = 0;
            while (it2.hasNext()) {
                int a2 = ((com.bytedance.mobsec.metasec.ml.e) ((Map.Entry) it2.next()).getValue()).a();
                if (a2 != 0) {
                    if (i2 > 0) {
                        StringBuilder M = e.a.a.a.a.M(str);
                        M.append((String) y2.a(16777217, 0, 0L, "b6de8c", new byte[]{76}));
                        str = M.toString();
                    }
                    str = e.a.a.a.a.j(str, a2);
                    i2++;
                }
            }
        }
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        y2.a(16777223, i, System.currentTimeMillis(), str2, null);
    }

    public static Activity c() {
        try {
            Class<?> cls = Class.forName((String) y2.a(16777217, 0, 0L, "b67134", new byte[]{114, 58, 64, 87, 3, 42, 101, 89, 103, 113, 99, 122, 101, 70, 24, 42, 119, 30, 114, 120, 71, 60, 86, 64, 13, 39}));
            Object invoke = cls.getMethod((String) y2.a(16777217, 0, 0L, "943f37", new byte[]{43, 35, 82, 0, 9, 46, 46, 52, 97, 34, 33, 32, 73, 6, 21, 20, 50, 7, 103, 55, 44}), null).invoke(null, null);
            Field declaredField = cls.getDeclaredField((String) y2.a(16777217, 0, 0L, "ea8dbc", new byte[]{121, 66, 72, 4, 84, 98, 111, 84, 96, 49, 103}));
            declaredField.setAccessible(true);
            ArrayMap arrayMap = (ArrayMap) declaredField.get(invoke);
            if (arrayMap.size() < 1) {
                return null;
            }
            for (Object obj : arrayMap.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField((String) y2.a(16777217, 0, 0L, "bb2c0c", new byte[]{96, 116, 78, 7, 31, 113, 101}));
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField((String) y2.a(16777217, 0, 0L, "d23e07", new byte[]{116, 51, 84, 24, 25, 41, 115, 10}));
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
