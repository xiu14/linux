package ms.bd.c;

import android.text.TextUtils;
import android.view.Display;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class y3 {
    public static y3 j;
    public long a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f10478c;

    /* renamed from: d, reason: collision with root package name */
    public int f10479d = 1;

    /* renamed from: e, reason: collision with root package name */
    public long f10480e;

    /* renamed from: f, reason: collision with root package name */
    public String f10481f;

    /* renamed from: g, reason: collision with root package name */
    public String f10482g;
    public String h;
    public boolean i;

    public static Object a(Object obj, String str) {
        Field field;
        try {
            Method declaredMethod = Class.class.getDeclaredMethod((String) y2.a(16777217, 0, 0L, "071cdb", new byte[]{38, 48, 86, 51, 94, 118, 63, 23, 114, 54, 37, 19, 75, 18, 87, 113}), String.class);
            if (declaredMethod == null || (field = (Field) declaredMethod.invoke(obj.getClass(), str)) == null) {
                return null;
            }
            field.setAccessible(true);
            return field.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String b(Display[] displayArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (Display display : displayArr) {
                StringBuilder sb2 = new StringBuilder();
                Object a = a(display, (String) y2.a(16777217, 0, 0L, "7c93da", new byte[]{43, 69, 67, 84, 75, 122, 53, 91, 65, 109, 32, 110}));
                sb2.append(a(a, (String) y2.a(16777217, 0, 0L, "8de514", new byte[]{38, 113, 24, 68, 28, 19, 58, 70, 63, 100, 46, 99, 56, 64, 3, 38})));
                sb2.append((String) y2.a(16777217, 0, 0L, "7a9044", new byte[]{106}));
                sb2.append(a(a, (String) y2.a(16777217, 0, 0L, "c7369b", new byte[]{116, 57, 65, 69, 21})));
                sb2.append((String) y2.a(16777217, 0, 0L, "c12ff1", new byte[]{62}));
                sb2.append(a(a, (String) y2.a(16777217, 0, 0L, "4abad7", new byte[]{43, 98, 28, 16})));
                sb2.append((String) y2.a(16777217, 0, 0L, "ebf568", new byte[]{56}));
                sb2.append(a(a, (String) y2.a(16777217, 0, 0L, "f64651", new byte[]{99, 45, 87, 71})));
                if (!sb.toString().contains(sb2.toString())) {
                    if (sb.length() > 0) {
                        sb.append((String) y2.a(16777217, 0, 0L, "17828f", new byte[]{123}));
                    }
                    sb.append((CharSequence) sb2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String d(Display[] displayArr) {
        try {
            StringBuilder sb = new StringBuilder();
            for (Display display : displayArr) {
                Object a = a(display, (String) y2.a(16777217, 0, 0L, "f9a0ce", new byte[]{122, 20, 5, 74, 89, 96, 85, 25, 51, 107, 118, 60, 23, 106, 93, Byte.MAX_VALUE, 96}));
                if (a != null && !sb.toString().contains(a.toString())) {
                    sb.append(a);
                    sb.append((String) y2.a(16777217, 0, 0L, "cdf52c", new byte[]{41}));
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((String) y2.a(16777217, 0, 0L, "3dd351", new byte[]{35, 114}), this.a);
            jSONObject.put((String) y2.a(16777217, 0, 0L, "c18d4f", new byte[]{96, 39}), this.b);
            jSONObject.put((String) y2.a(16777217, 0, 0L, "b543ea", new byte[]{119, 58}), this.f10479d);
            jSONObject.put((String) y2.a(16777217, 0, 0L, "067950", new byte[]{37, 32}), this.f10480e);
            jSONObject.put((String) y2.a(16777217, 0, 0L, "268de0", new byte[]{32, 53, 79}), this.i ? 1 : 0);
            jSONObject.put((String) y2.a(16777217, 0, 0L, "ae244a", new byte[]{125, 99}), this.f10481f);
            if (!TextUtils.isEmpty(this.f10482g)) {
                jSONObject.put((String) y2.a(16777217, 0, 0L, "a1ac90", new byte[]{96, 56}), this.f10482g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put((String) y2.a(16777217, 0, 0L, "61e6da", new byte[]{35, 58}), this.h);
            }
            this.f10478c = System.currentTimeMillis();
            jSONObject.put((String) y2.a(16777217, 0, 0L, "1adf0c", new byte[]{35, 119}), this.f10478c / 1000);
            if (jSONObject.length() > 0) {
                return jSONObject;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
