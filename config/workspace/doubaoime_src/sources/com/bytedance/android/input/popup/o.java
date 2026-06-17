package com.bytedance.android.input.popup;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public class o extends j {
    private final Handler a;
    private final Runnable b;

    /* renamed from: c, reason: collision with root package name */
    private int f2913c;

    /* renamed from: d, reason: collision with root package name */
    private int f2914d;

    /* renamed from: e, reason: collision with root package name */
    private WindowId f2915e;

    /* renamed from: f, reason: collision with root package name */
    private int f2916f;

    /* renamed from: g, reason: collision with root package name */
    private b f2917g;
    protected Context h;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.android.input.r.j.i("InputBasePopupWindow", "dismiss popup window");
            if (o.this.f2917g != null) {
                ((com.bytedance.android.doubaoime.g) o.this.f2917g).a();
            }
            o.this.dismiss();
        }
    }

    public interface b {
    }

    public o(Context context, WindowId windowId, int i) {
        super(context);
        this.a = new Handler(Looper.getMainLooper());
        this.h = context;
        setClippingEnabled(false);
        this.f2915e = windowId;
        this.f2916f = i;
        this.b = new a();
    }

    public int b() {
        return this.f2916f;
    }

    public Context c() {
        return this.h;
    }

    public int d() {
        return this.f2913c;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        this.a.removeCallbacks(this.b);
        super.dismiss();
    }

    public int e() {
        return this.f2914d;
    }

    public WindowId f() {
        return this.f2915e;
    }

    public void g(p pVar) {
        int i = pVar.f2918c + this.f2913c;
        int i2 = pVar.f2919d + this.f2914d;
        e.a.a.a.a.m0("onAnchorLocationUpdate = location.x = ", i, ", y = ", i2, "InputPopupWindowManage");
        update(i, i2, pVar.f2920e, pVar.f2921f);
    }

    public void h(int i, int i2) {
        this.f2913c = i;
        this.f2914d = i2;
    }

    public void i(b bVar) {
        this.f2917g = bVar;
    }

    public void j() {
        this.a.postDelayed(this.b, com.heytap.mcssdk.constant.a.r);
    }
}
