package ms.bd.c;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class j2 {
    protected static String LIBNAME;

    public static synchronized void a(Context context, int i, Map<String, String> map) {
        synchronized (j2.class) {
            com.bytedance.mobsec.metasec.core.e.f5411f.a.set(0);
            com.bytedance.mobsec.metasec.core.e.b(context, LIBNAME);
            ArrayList arrayList = new ArrayList();
            String[] strArr = null;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        arrayList.add(key);
                        arrayList.add(value);
                    }
                }
                strArr = (String[]) arrayList.toArray(new String[0]);
            }
            String[] strArr2 = strArr;
            v2 v2Var = com.bytedance.mobsec.metasec.core.e.f5411f;
            int i2 = (((byte) i) & 15) << 28;
            int i3 = 0;
            for (int i4 = 0; i4 < v2Var.a.size(); i4++) {
                if (v2Var.a.get(i4)) {
                    i3 |= 1 << i4;
                }
            }
            y2.a(83886081, i2 | i3, 0L, null, strArr2);
        }
    }
}
