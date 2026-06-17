package ms.bd.c;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class c3 {
    public static final c3 b = new c3();
    public final ArrayList a = new ArrayList();

    public final String a(int i, String str, String str2) {
        synchronized (this.a) {
            if (this.a.size() >= 1 && !TextUtils.isEmpty(str)) {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    Map map = (Map) it2.next();
                    if (map != null && !map.isEmpty() && map.containsKey(str)) {
                        ((com.bytedance.mobsec.metasec.ml.d) map.get(str)).a(i, str, str2);
                        it2.remove();
                    }
                }
                return (String) y2.a(16777217, 0, 0L, "fd2334", new byte[]{39});
            }
            return (String) y2.a(16777217, 0, 0L, "a626ff", new byte[]{32});
        }
    }
}
