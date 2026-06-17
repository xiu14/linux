package e.c.h;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    static Integer f9846d;
    private final WeakReference<View> a;
    private final List<b> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private ViewTreeObserverOnPreDrawListenerC0450a f9847c;

    /* renamed from: e.c.h.a$a, reason: collision with other inner class name */
    private static final class ViewTreeObserverOnPreDrawListenerC0450a implements ViewTreeObserver.OnPreDrawListener {
        private final WeakReference<a> a;

        ViewTreeObserverOnPreDrawListenerC0450a(@NonNull a aVar) {
            this.a = new WeakReference<>(aVar);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (Log.isLoggable("SizeDeterminer", 2)) {
                Log.v("SizeDeterminer", "OnGlobalLayoutListener called attachStateListener=" + this);
            }
            a aVar = this.a.get();
            if (aVar == null) {
                return true;
            }
            aVar.a();
            return true;
        }
    }

    public a(@NonNull View view) {
        this.a = new WeakReference<>(view);
    }

    private int d(int i, int i2, int i3, View view) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (view.isLayoutRequested() || i2 != -2) {
            return 0;
        }
        if (Log.isLoggable("SizeDeterminer", 4)) {
            Log.i("SizeDeterminer", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
        }
        Context context = view.getContext();
        if (f9846d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            Objects.requireNonNull(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f9846d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f9846d.intValue();
    }

    private int e(View view) {
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return d(view.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom, view);
    }

    private int f(View view) {
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return d(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight, view);
    }

    private boolean h(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            return i2 > 0 || i2 == Integer.MIN_VALUE;
        }
        return false;
    }

    void a() {
        View g2;
        if (this.b.isEmpty() || (g2 = g()) == null) {
            return;
        }
        int f2 = f(g2);
        int e2 = e(g2);
        if (h(f2, e2)) {
            Iterator it2 = new ArrayList(this.b).iterator();
            while (it2.hasNext()) {
                ((b) it2.next()).b(f2, e2);
            }
            b();
        }
    }

    public void b() {
        View g2 = g();
        if (g2 != null) {
            ViewTreeObserver viewTreeObserver = g2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f9847c);
            }
        }
        this.f9847c = null;
        this.b.clear();
    }

    public void c(@NonNull b bVar) {
        View g2 = g();
        if (g2 == null) {
            return;
        }
        int f2 = f(g2);
        int e2 = e(g2);
        if (h(f2, e2)) {
            bVar.b(f2, e2);
            return;
        }
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
        if (this.f9847c == null) {
            ViewTreeObserver viewTreeObserver = g2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC0450a viewTreeObserverOnPreDrawListenerC0450a = new ViewTreeObserverOnPreDrawListenerC0450a(this);
            this.f9847c = viewTreeObserverOnPreDrawListenerC0450a;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0450a);
        }
    }

    @Nullable
    public View g() {
        return this.a.get();
    }
}
