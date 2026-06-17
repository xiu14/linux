package com.bytedance.android.input.popup;

import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.android.doubaoime.C0838R;
import com.bytedance.android.input.basic.IAppGlobals;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public class q {

    /* renamed from: d, reason: collision with root package name */
    private static q f2922d;

    /* renamed from: e, reason: collision with root package name */
    private static final int f2923e;
    private View a;
    private SparseArray<p> b = null;

    /* renamed from: c, reason: collision with root package name */
    private HashMap<WindowId, o> f2924c;

    private static class a implements Runnable {
        private final WeakReference<q> a;

        a(q qVar) {
            this.a = new WeakReference<>(qVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVar = this.a.get();
            if (qVar != null) {
                qVar.b();
            }
        }
    }

    static {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        f2923e = aVar.getContext().getResources().getDimensionPixelSize(C0838R.dimen.guide_popup_window_height);
        Objects.requireNonNull(aVar);
        aVar.getContext().getResources().getDimensionPixelSize(C0838R.dimen.guide_popup_window_width);
    }

    private q() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        com.bytedance.android.input.r.j.i("InputPopupWindowManager", "dismissAllWindows");
        HashMap<WindowId, o> hashMap = this.f2924c;
        if (hashMap == null || hashMap.isEmpty() || (r0 = this.f2924c.values().iterator()) == null) {
            return;
        }
        for (o oVar : this.f2924c.values()) {
            if (oVar != null && oVar.isShowing()) {
                oVar.dismiss();
            }
        }
        this.f2924c.clear();
    }

    private p e(int i) {
        SparseArray<p> sparseArray = this.b;
        if (sparseArray != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    public static q f() {
        if (f2922d == null) {
            synchronized (q.class) {
                if (f2922d == null) {
                    f2922d = new q();
                }
            }
        }
        return f2922d;
    }

    private void g() {
        if (this.b != null) {
            return;
        }
        SparseArray<p> sparseArray = new SparseArray<>(4);
        this.b = sparseArray;
        sparseArray.append(0, new p(0, 0));
        this.b.append(1, new p(C0838R.id.input_view_root, 1));
        this.b.append(2, new p(C0838R.id.input_view_root, 2));
        this.b.append(3, new p(C0838R.id.input_view_root, 3));
    }

    private void n(int i) {
        p e2 = e(i);
        if (e2 != null) {
            int i2 = e2.a;
            View findViewById = i2 == 0 ? this.a : this.a.findViewById(i2);
            if (findViewById != null) {
                int[] iArr = new int[2];
                findViewById.getLocationInWindow(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                e2.f2918c = i3;
                e2.f2919d = i4;
                int i5 = e2.b;
                if (i5 == 2) {
                    int height = this.a.getHeight() - findViewById.getBottom();
                    com.bytedance.android.input.r.j.m("InputPopupWindowManager", "updateAnchor navigationHeight = " + height);
                    int width = findViewById.getWidth();
                    int height2 = findViewById.getHeight() + height;
                    e2.f2920e = width;
                    e2.f2921f = height2;
                } else if (i5 == 3) {
                    StringBuilder M = e.a.a.a.a.M("updateAnchorLocation anchor setParentSize width= ");
                    M.append(findViewById.getWidth());
                    M.append(" height: ");
                    int i6 = f2923e;
                    M.append(i6);
                    com.bytedance.android.input.r.j.i("InputPopupWindowManager", M.toString());
                    e2.f2920e = findViewById.getWidth();
                    e2.f2921f = i6;
                } else {
                    int width2 = findViewById.getWidth();
                    int height3 = findViewById.getHeight();
                    e2.f2920e = width2;
                    e2.f2921f = height3;
                }
                StringBuilder N = e.a.a.a.a.N("updateAnchor id = ", i, ", x = ");
                N.append(iArr[0]);
                N.append(", y = ");
                N.append(iArr[1]);
                N.append(", w = ");
                N.append(findViewById.getWidth());
                N.append(", h = ");
                N.append(findViewById.getHeight());
                N.append(", parentWidth = ");
                N.append(e2.f2920e);
                N.append(", parentHeight = ");
                N.append(e2.f2921f);
                N.append(", location ");
                N.append(e2.f2918c);
                N.append(" ");
                e.a.a.a.a.B0(N, e2.f2919d, "InputPopupWindowManager");
            }
        }
    }

    public void c() {
        b();
    }

    public boolean d(WindowId windowId) {
        o oVar = this.f2924c.get(windowId);
        if (oVar == null) {
            return false;
        }
        if (oVar.isShowing()) {
            oVar.dismiss();
        }
        this.f2924c.remove(windowId);
        return true;
    }

    public void h(View view) {
        this.a = view;
        this.f2924c = new HashMap<>();
        g();
    }

    public void i(View view) {
        this.a = view;
        HashMap<WindowId, o> hashMap = this.f2924c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f2924c = new HashMap<>();
        if (this.b == null) {
            g();
        }
        if (this.b != null) {
            p pVar = new p(0, 0);
            try {
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                WindowManager windowManager = (WindowManager) aVar.getContext().getSystemService("window");
                if (windowManager != null) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    pVar.f2920e = displayMetrics.widthPixels;
                    pVar.f2921f = displayMetrics.heightPixels;
                }
            } catch (Exception e2) {
                e.a.a.a.a.o0("initAncors error ", e2, "InputPopupWindowManager");
            }
            this.b.put(0, pVar);
        }
    }

    public boolean j(WindowId windowId) {
        o oVar = this.f2924c.get(windowId);
        return oVar != null && oVar.isShowing();
    }

    public void k() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            com.bytedance.android.input.r.j.i("InputPopupWindowManager", "release is not main thread");
            new Handler(Looper.getMainLooper()).post(new a(this));
        }
    }

    public void l(o oVar) {
        p e2 = e(oVar.b());
        if (e2 == null) {
            return;
        }
        d(oVar.f());
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showGuideWindow = an.x = " + e2.f2918c + ", y = " + e2.f2919d);
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showGuideWindow = an.w = " + e2.f2920e + ", h = " + e2.f2921f);
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showGuideWindow = window.x = " + oVar.d() + ", y = " + oVar.e());
        int d2 = oVar.d() + e2.f2918c;
        int e3 = oVar.e() + e2.f2919d;
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showGuideWindow = now.x = " + d2 + ", y = " + e3);
        oVar.setWidth(e2.f2920e);
        oVar.setHeight(e2.f2921f);
        if (!this.a.isAttachedToWindow() || this.a.getWindowToken() == null) {
            return;
        }
        try {
            oVar.showAtLocation(this.a, 0, d2, e3);
            this.f2924c.put(oVar.f(), oVar);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public void m(o oVar, int i) {
        p e2;
        if (oVar == null || (e2 = e(oVar.b())) == null) {
            return;
        }
        d(oVar.f());
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow = an.x = " + e2.f2918c + ", y = " + e2.f2919d);
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow = an.w = " + e2.f2920e + ", h = " + e2.f2921f);
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow = window.x = " + oVar.d() + ", y = " + oVar.e());
        int d2 = oVar.d() + e2.f2918c;
        int e3 = oVar.e() + e2.f2919d + i;
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow = now.x = " + d2 + ", y = " + e3);
        if (i != 0) {
            oVar.h(oVar.d(), oVar.e() + i);
        }
        oVar.setWidth(e2.f2920e);
        int i2 = e2.f2921f;
        if (oVar.f() == WindowId.CUSTOM_TOOLBAR_UI) {
            i2 = Math.max(0, e2.f2921f - i);
        }
        oVar.setHeight(i2);
        com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow ---01 ");
        if (!this.a.isAttachedToWindow() || this.a.getWindowToken() == null) {
            com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow ---02 ");
            return;
        }
        try {
            com.bytedance.android.input.r.j.m("InputPopupWindowManager", "showWindow ---03 ");
            oVar.showAtLocation(this.a, 0, d2, e3);
            this.f2924c.put(oVar.f(), oVar);
        } catch (Exception e4) {
            e.a.a.a.a.f0(e4, e.a.a.a.a.M("showWindow ---03 "), "InputPopupWindowManager");
        }
    }

    public void o() {
        if (f2922d == null) {
            return;
        }
        n(0);
        n(1);
        n(2);
        n(3);
        HashMap<WindowId, o> hashMap = this.f2924c;
        if (hashMap != null) {
            Iterator<o> it2 = hashMap.values().iterator();
            while (it2.hasNext()) {
                o next = it2.next();
                if (next != null) {
                    p e2 = e(next.b());
                    if (e2 == null || !next.isShowing()) {
                        next.dismiss();
                        it2.remove();
                    } else {
                        if (next.f() == WindowId.CUSTOM_TOOLBAR_UI) {
                            int d2 = next.d() + e2.f2918c;
                            int e3 = next.e() + e2.f2919d;
                            int max = Math.max(0, e2.f2921f - next.e());
                            next.setWidth(e2.f2920e);
                            next.setHeight(max);
                            next.update(d2, e3, next.getWidth(), next.getHeight());
                        } else {
                            next.g(e2);
                        }
                        StringBuilder M = e.a.a.a.a.M("updateLocation onAnchorLocationUpdate. type: ");
                        M.append(next.b());
                        com.bytedance.android.input.r.j.m("InputPopupWindowManager", M.toString());
                    }
                }
            }
        }
    }
}
