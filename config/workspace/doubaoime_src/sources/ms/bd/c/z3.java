package ms.bd.c;

import java.util.function.Consumer;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class z3 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        try {
            c4.f10360e.put(String.valueOf((Integer) obj), System.currentTimeMillis());
        } catch (JSONException unused) {
        }
    }
}
