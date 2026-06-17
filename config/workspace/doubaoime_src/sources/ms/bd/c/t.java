package ms.bd.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: f, reason: collision with root package name */
    public static t f10447f;
    public final SharedPreferences a;
    public ArrayList b = new ArrayList(10);

    /* renamed from: c, reason: collision with root package name */
    public static final String f10444c = (String) y2.a(16777217, 0, 0, "5f1820", new byte[]{107, 103, 67, 92, 25, 36, 62, 70, 47, 126, 33, 118, 75, 74, 20});

    /* renamed from: d, reason: collision with root package name */
    public static final String f10445d = (String) y2.a(16777217, 0, 0, "f9d221", new byte[]{56, 43, 22, 85, 30, 54, 106, 10, 33, 45, 122, 52, 21, 79, 1, 35, 42, 21, 58, 96, 126, 55, 18, 121, 14, 39, 119, 28, 10, 110, 120, 60, 30, 72, 66});

    /* renamed from: e, reason: collision with root package name */
    public static final String f10446e = (String) y2.a(16777217, 0, 0, "7ea63f", new byte[]{105, 119, 19, 81, 31, 97, 59, 86, 36, 41, 43, 104, 16, 75, 0, 116, 123, 87, 61, 117, 25, 107, 29, 69, 5, Byte.MAX_VALUE, 123});

    /* renamed from: g, reason: collision with root package name */
    public static final String f10448g = (String) y2.a(16777217, 0, 0, "3e2fb1", new byte[]{48, 98, 70, 23, 69, 25, 61, 75, 103, 51, 29, 107, 72, 1, 73});

    public t(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        this.a = defaultSharedPreferences;
        b(defaultSharedPreferences.getString((String) y2.a(16777217, 0, 0L, "748878", new byte[]{52, 51, 76, 73, 16, 16, 57, 26, 109, 109, 25, 58, 66, 95, 28}), ""), false);
        if (this.b.size() < 1) {
            Object a = y2.a(33554445, 3, 0L, null, null);
            Object a2 = y2.a(33554445, 2, 0L, null, null);
            Object a3 = y2.a(33554445, 1, 0L, null, null);
            if (a != null && ((Integer) a).intValue() != 0) {
                this.b.add(new s((String) y2.a(16777217, 0, 0L, "ba9dc9", new byte[]{60, 96, 75, 0, 72, 45, 105, 65, 39, 34, 118, 113, 67, 22, 69}), (String) y2.a(16777217, 0, 0L, "a41095", new byte[]{99, 47, 76, 71})));
            }
            if (a2 != null && ((Integer) a2).intValue() == 1) {
                this.b.add(new s((String) y2.a(16777217, 0, 0L, "d17e5d", new byte[]{58, 35, 69, 2, 25, 99, 104, 2, 114, 122, 120, 60, 70, 24, 6, 118, 40, 29, 105, 55, 124, 63, 65, 46, 9, 114, 117, 20, 89, 57, 122, 52, 77, 31, 69}), (String) y2.a(16777217, 0, 0L, "6e91d2", new byte[]{52, 126, 68, 70})));
            }
            if (a3 == null || ((Integer) a3).intValue() != 1) {
                return;
            }
            this.b.add(new s((String) y2.a(16777217, 0, 0L, "aac8e5", new byte[]{63, 115, 17, 95, 73, 50, 109, 82, 38, 39, 125, 108, 18, 69, 86, 39, 45, 83, 63, 123, 79, 111, 31, 75, 83, 44, 45}), (String) y2.a(16777217, 0, 0L, "6cfd72", new byte[]{52, 120, 27, 19})));
        }
    }

    public static synchronized t a(Context context) {
        t tVar;
        synchronized (t.class) {
            if (f10447f == null) {
                f10447f = new t(context);
            }
            tVar = f10447f;
        }
        return tVar;
    }

    public final synchronized void b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(20);
        JSONObject jSONObject = new JSONObject(str);
        String string = jSONObject.getString((String) y2.a(16777217, 0, 0L, "c3ca1c", new byte[]{100, 52, 2, 6, 7, 123, 110}));
        String string2 = jSONObject.getString((String) y2.a(16777217, 0, 0L, "7dfb16", new byte[]{52, 115, 25, 19, 29}));
        if (((String) y2.a(16777217, 0, 0L, "1b9555", new byte[]{113})).equals(string) && string2 != null) {
            for (String str2 : string2.split((String) y2.a(16777217, 0, 0L, "2bc177", new byte[]{31, 124}))) {
                String[] split = str2.split((String) y2.a(16777217, 0, 0L, "b04de0", new byte[]{41}));
                if (split != null && split.length >= 2) {
                    arrayList.add(new s(new String(r.b(split[0])), split[1]));
                }
            }
        }
        this.b = arrayList;
        if (z) {
            this.a.edit().putString(f10448g, str).apply();
        }
    }
}
