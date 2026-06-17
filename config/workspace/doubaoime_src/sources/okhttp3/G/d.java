package okhttp3.G;

import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.Request;

/* loaded from: classes2.dex */
public class d {
    private static volatile d b;
    private final CopyOnWriteArrayList<String> a = new CopyOnWriteArrayList<>();

    public static d a() {
        if (b == null) {
            synchronized (d.class) {
                if (b == null) {
                    b = new d();
                }
            }
        }
        return b;
    }

    public void b(Request request, boolean z) {
        if (request == null || request.url() == null || TextUtils.isEmpty(request.url().k())) {
            return;
        }
        String k = request.url().k();
        if (z) {
            this.a.add(k);
        } else {
            this.a.remove(k);
        }
    }
}
