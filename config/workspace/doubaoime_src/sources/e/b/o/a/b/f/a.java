package e.b.o.a.b.f;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import e.b.o.a.b.b;

/* loaded from: classes2.dex */
public class a extends b {

    /* renamed from: c, reason: collision with root package name */
    private PowerManager f9737c;

    public a(Context context, e.b.o.a.a.b bVar) {
        super(context, bVar);
        this.f9737c = (PowerManager) context.getSystemService("power");
    }

    public int a() {
        PowerManager powerManager;
        if (Build.VERSION.SDK_INT < 29 || (powerManager = this.f9737c) == null) {
            return -1;
        }
        return powerManager.getCurrentThermalStatus();
    }
}
