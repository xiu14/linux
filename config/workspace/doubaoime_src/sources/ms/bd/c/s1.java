package ms.bd.c;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class s1 {
    public final Context a;
    public t1 b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f10442c = new r1(this);

    public s1(Context context) {
        this.a = context;
    }

    public final void a(j1 j1Var) {
        Intent intent = new Intent();
        intent.setClassName((String) y2.a(16777217, 0, 0L, "ef5963", new byte[]{119, 107, 75, 3, 19, 49, 111, 9, 96, 108, 98, 109, 69, 72, 0, 32, 117, 66, 118, Byte.MAX_VALUE, 125, 103, 67}), (String) y2.a(16777217, 0, 0L, "10512a", new byte[]{35, 61, 75, 11, 23, 99, 59, 95, 96, 100, 54, 59, 69, 64, 4, 114, 33, 20, 118, 119, 41, 49, 67, 11, 41, 115, 36, 24, 103, 100, 41, 54, 117, 64, 31, 96, 59, 18, 97}));
        if (this.a.bindService(intent, this.f10442c, 1)) {
            try {
                t1 t1Var = this.b;
                if (t1Var != null) {
                    j1Var.a.a = t1Var.d();
                }
            } catch (Throwable unused) {
            }
            this.a.unbindService(this.f10442c);
        }
    }
}
