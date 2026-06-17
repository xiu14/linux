package ms.bd.c;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t3 {

    /* renamed from: c, reason: collision with root package name */
    public static t3 f10455c;
    public final Context a;
    public ArrayList b = new ArrayList();

    public t3(Context context) {
        this.a = null;
        this.a = context;
    }

    public static t3 b(Context context) {
        if (f10455c == null) {
            synchronized (t3.class) {
                if (f10455c == null) {
                    f10455c = new t3(context);
                }
            }
        }
        return f10455c;
    }

    public final int a() {
        if (this.a.registerReceiver(null, new IntentFilter((String) y2.a(16777217, 0, 0L, "03fcca", new byte[]{32, 63, 17, 5, 83, Byte.MAX_VALUE, 55, 92, 62, 61, 53, 52, 27, 3, 18, 119, 48, 6, 62, 60, 47, Byte.MAX_VALUE, 55, 54, 104, 66, 22, 32, 14, 12, 2, 25, 52, 57, 123, 83, 23}))) == null) {
            return -1;
        }
        return Math.round(((r0.getIntExtra((String) y2.a(16777217, 0, 0L, "a43c56", new byte[]{124, 51, 86, 18, 6}), -1) / r0.getIntExtra((String) y2.a(16777217, 0, 0L, "35e007", new byte[]{49, 52, 23, 72, 10}), -1)) * 100.0f) * 10.0f) / 10;
    }

    public final int c() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter((String) y2.a(16777217, 0, 0L, "af0be0", new byte[]{113, 106, 71, 4, 85, 46, 102, 9, 104, 60, 100, 97, 77, 2, 20, 38, 97, 83, 104, 61, 126, 42, 97, 55, 110, 19, 71, 117, 88, 13, 83, 76, 98, 56, 125, 2, 70})));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra((String) y2.a(16777217, 0, 0L, "53828f", new byte[]{52, 61, 94, 65, 0, 116, 50}), -1);
    }
}
