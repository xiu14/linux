package ms.bd.c;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class u2 {
    public static Object a(int i, int i2, long j, String str, Object obj) {
        Object obj2;
        int i3;
        if (i <= 268435456 || i >= 268435475) {
            q4 q4Var = x2.a;
            if ((i > 65536 && i < 65545) || ((i > 196608 && i < 196614) || (i > 131072 && i < 131075))) {
                return x2.a(i, i2, j, str, obj);
            }
            s4 s4Var = s2.a;
            if ((i <= 16777216 || i >= 16777284) && (i <= 33554432 || i >= 33554435)) {
                return null;
            }
            return s2.c(i, i2, j, str, obj);
        }
        switch (i) {
            case 268435457:
                try {
                    Display defaultDisplay = ((WindowManager) m2.b.a.getSystemService("window")).getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    com.prolificinteractive.materialcalendarview.r.j = point.x;
                    com.prolificinteractive.materialcalendarview.r.k = point.y;
                } catch (Throwable unused) {
                }
                obj2 = com.prolificinteractive.materialcalendarview.r.j + "*" + com.prolificinteractive.materialcalendarview.r.k;
                break;
            case 268435458:
            case 268435459:
                obj2 = "np";
                break;
            case 268435460:
                obj2 = n4.a("");
                break;
            case 268435461:
                int i4 = n4.a;
                obj2 = "";
                break;
            case 268435462:
                String str2 = w.a;
                JSONObject jSONObject = new JSONObject();
                try {
                    HashMap c2 = w.c();
                    String str3 = w.i;
                    try {
                        i3 = new File((String) y2.a(16777217, 0, 0L, "7e73e7", new byte[]{105, 116, 93, 84, 21, 36, 49, 82, 111, 96, 35, 116, 11, 84, 67, 51, 32, 65, 107, 44, 37, 119, 81, 8})).listFiles(w.j).length;
                    } catch (Throwable unused2) {
                        i3 = -1;
                    }
                    jSONObject.put(str3, i3);
                    jSONObject.put(w.f10466d, w.b(c2, w.a));
                    jSONObject.put(w.f10467e, w.b(c2, w.b));
                    jSONObject.put(w.f10469g, w.a((String) y2.a(16777217, 0, 0L, "db9ed5", new byte[]{58, 115, 83, 2, 20, 38, 98, 85, 97, 54, 112, 115, 5, 2, 66, 49, 115, 70, 101, 122, 118, 112, 95, 94, 88, 50, 114, 19, 39, 54, 101, 117, 76, 3, 94, 51, 40, 64, 120, 32, 124, 110, 76, 30, 100, 47, 102, 91, 87, 51, 103, 101, 91})));
                    jSONObject.put(w.h, w.a((String) y2.a(16777217, 0, 0L, "4d1bf2", new byte[]{106, 117, 91, 5, 22, 33, 50, 83, 105, 49, 32, 117, 13, 5, 64, 54, 35, 64, 109, 125, 38, 118, 87, 89, 90, 53, 34, 21, 47, 49, 53, 115, 68, 4, 92, 52, 120, 70, 112, 39, 44, 104, 68, 25, 102, 40, 62, 75, 95, 52, 55, 99, 83})));
                    jSONObject.put(w.f10468f, w.b(c2, w.f10465c));
                } catch (Throwable unused3) {
                }
                String jSONObject2 = jSONObject.toString();
                if (!TextUtils.isEmpty(jSONObject2)) {
                    obj2 = jSONObject2.trim();
                    break;
                } else {
                    obj2 = (String) y2.a(16777217, 0, 0L, "9b1ecf", new byte[]{51, 125});
                    break;
                }
            case 268435463:
                Context context = m2.b.a;
                JSONArray jSONArray = new JSONArray();
                if (context != null) {
                    try {
                        if (com.prolificinteractive.materialcalendarview.r.s()) {
                            obj2 = jSONArray.toString();
                            break;
                        }
                    } catch (Throwable unused4) {
                    }
                    obj2 = "[]";
                    break;
                } else {
                    obj2 = jSONArray.toString();
                    break;
                }
            case 268435464:
                try {
                    com.prolificinteractive.materialcalendarview.r.s();
                    int i5 = n4.a;
                } catch (Throwable unused5) {
                    int i6 = n4.a;
                }
                obj2 = "null[<!>]null[<!>]0[<!>]";
                break;
            case 268435465:
                Context context2 = m2.b.a;
                if (context2 == null) {
                    return null;
                }
                StringBuilder sb = new StringBuilder(com.prolificinteractive.materialcalendarview.r.t(context2));
                try {
                    Iterator<InputMethodInfo> it2 = ((InputMethodManager) context2.getSystemService("input_method")).getInputMethodList().iterator();
                    while (it2.hasNext()) {
                        String packageName = it2.next().getPackageName();
                        if (!TextUtils.isEmpty(packageName) && sb.indexOf(packageName) < 0) {
                            sb.append("[<!>]");
                            sb.append(packageName);
                        }
                    }
                } catch (Throwable unused6) {
                }
                return sb.toString();
            case 268435466:
            default:
                return null;
            case 268435467:
                k1.a(m2.b.a);
                return null;
            case 268435468:
                obj2 = k1.a(m2.b.a).a;
                break;
            case 268435469:
                Context context3 = m2.b.a;
                if (context3 != null) {
                    obj2 = new StringBuilder(com.prolificinteractive.materialcalendarview.r.t(context3)).toString();
                    break;
                } else {
                    return null;
                }
            case 268435470:
                obj2 = 2L;
                break;
            case 268435471:
                obj2 = 0L;
                break;
            case 268435472:
                obj2 = k1.a(m2.b.a).b;
                break;
            case 268435473:
                k1.a(m2.b.a).getClass();
                return null;
            case 268435474:
                obj2 = k1.a(m2.b.a).f10403c;
                break;
        }
        return obj2;
    }
}
