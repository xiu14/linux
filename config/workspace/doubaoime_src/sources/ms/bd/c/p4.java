package ms.bd.c;

import java.util.HashMap;
import okhttp3.q;

/* loaded from: classes2.dex */
public abstract class p4 {
    public static final /* synthetic */ int a = 0;

    static {
    }

    public static String a(okhttp3.A a2) {
        try {
            f.e eVar = new f.e();
            if (a2 != null) {
                a2.e(eVar);
                return eVar.A();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public static okhttp3.A b(okhttp3.A a2, HashMap hashMap) {
        try {
            String a3 = a(a2);
            q.a aVar = new q.a();
            for (String str : hashMap.keySet()) {
                aVar.a(str, ((String) hashMap.get(str)).replaceAll((String) y2.a(16777217, 0, 0L, "41b531", new byte[]{126}), (String) y2.a(16777217, 0, 0L, "16a924", new byte[]{101, 103, 48})));
            }
            okhttp3.q b = aVar.b();
            StringBuilder sb = new StringBuilder(a3);
            if (a3.length() > 0) {
                sb.append((String) y2.a(16777217, 0, 0L, "691d56", new byte[]{97}));
            }
            sb.append(a(b));
            return okhttp3.A.c(a2.b(), sb.toString());
        } catch (Exception unused) {
            return a2;
        }
    }
}
