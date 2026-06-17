package ms.bd.c;

import android.content.Context;
import android.os.SystemClock;
import android.provider.Settings;
import android.view.WindowManager;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: classes2.dex */
public final class a2 {
    public final boolean a;
    public final Context b;

    /* renamed from: c, reason: collision with root package name */
    public final WindowManager f10346c;

    /* renamed from: d, reason: collision with root package name */
    public z1 f10347d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10348e = false;

    /* renamed from: g, reason: collision with root package name */
    public final d2 f10350g = new d2();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedBlockingDeque f10349f = new LinkedBlockingDeque();
    public final Object h = new Object();

    static {
    }

    public a2(Context context) {
        boolean canDrawOverlays = Settings.canDrawOverlays(context);
        this.a = canDrawOverlays;
        if (canDrawOverlays) {
            this.b = context;
            this.f10346c = (WindowManager) context.getSystemService((String) y2.a(16777217, 0, 0L, "ca303f", new byte[]{101, 106, 78, 64, 3, 102}));
        }
    }

    public final void a(boolean z) {
        if (this.a) {
            z1 z1Var = this.f10347d;
            if (z1Var != null && this.f10348e) {
                try {
                    this.f10346c.removeView(z1Var);
                } catch (Exception unused) {
                }
                this.f10348e = false;
            }
            if (z) {
                this.f10347d = null;
                d2 d2Var = this.f10350g;
                d2Var.b = 0L;
                d2Var.f10362c = 0L;
                d2Var.a = 0L;
            }
        }
    }

    public final String b() {
        String str;
        if (!this.a) {
            d2 d2Var = this.f10350g;
            d2Var.b = -1L;
            return d2Var.toString();
        }
        if (this.f10349f.isEmpty()) {
            return "";
        }
        synchronized (this.h) {
            int i = 0;
            this.f10349f.size();
            LinkedBlockingDeque linkedBlockingDeque = this.f10349f;
            int i2 = n4.a;
            if (linkedBlockingDeque != null && !linkedBlockingDeque.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator it2 = linkedBlockingDeque.iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next().toString());
                    if (i < linkedBlockingDeque.size() - 1) {
                        sb.append((Object) '|');
                    }
                    i++;
                }
                str = sb.toString();
                this.f10349f.clear();
            }
            str = "";
            this.f10349f.clear();
        }
        return str;
    }

    public final void c() {
        if (this.a) {
            this.f10350g.f10365f = SystemClock.uptimeMillis();
            this.f10350g.a++;
            d2 a = this.f10350g.a();
            synchronized (this.h) {
                if (this.f10349f.size() > 50) {
                    this.f10349f.pop();
                }
                this.f10349f.add(a);
            }
            d2 d2Var = this.f10350g;
            d2Var.b = 0L;
            d2Var.f10362c = 0L;
        }
    }
}
