package com.bumptech.glide.request.k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bytedance.android.doubaoime.C0838R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes.dex */
public abstract class i<T extends View, Z> extends com.bumptech.glide.request.k.a<Z> {
    protected final T a;
    private final a b;

    @VisibleForTesting
    static final class a {

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        @VisibleForTesting
        static Integer f1855d;
        private final View a;
        private final List<g> b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        private ViewTreeObserverOnPreDrawListenerC0044a f1856c;

        /* renamed from: com.bumptech.glide.request.k.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0044a implements ViewTreeObserver.OnPreDrawListener {
            private final WeakReference<a> a;

            ViewTreeObserverOnPreDrawListenerC0044a(@NonNull a aVar) {
                this.a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.a.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(@NonNull View view) {
            this.a = view;
        }

        private int d(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.a.getContext();
            if (f1855d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Objects.requireNonNull(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f1855d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f1855d.intValue();
        }

        private int e() {
            int paddingBottom = this.a.getPaddingBottom() + this.a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return d(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        private int f() {
            int paddingRight = this.a.getPaddingRight() + this.a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return d(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        private boolean g(int i, int i2) {
            if (i > 0 || i == Integer.MIN_VALUE) {
                return i2 > 0 || i2 == Integer.MIN_VALUE;
            }
            return false;
        }

        void a() {
            if (this.b.isEmpty()) {
                return;
            }
            int f2 = f();
            int e2 = e();
            if (g(f2, e2)) {
                Iterator it2 = new ArrayList(this.b).iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).b(f2, e2);
                }
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f1856c);
            }
            this.f1856c = null;
            this.b.clear();
        }

        void c(@NonNull g gVar) {
            int f2 = f();
            int e2 = e();
            if (g(f2, e2)) {
                gVar.b(f2, e2);
                return;
            }
            if (!this.b.contains(gVar)) {
                this.b.add(gVar);
            }
            if (this.f1856c == null) {
                ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0044a viewTreeObserverOnPreDrawListenerC0044a = new ViewTreeObserverOnPreDrawListenerC0044a(this);
                this.f1856c = viewTreeObserverOnPreDrawListenerC0044a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0044a);
            }
        }

        void h(@NonNull g gVar) {
            this.b.remove(gVar);
        }
    }

    public i(@NonNull T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.a = t;
        this.b = new a(t);
    }

    @Override // com.bumptech.glide.request.k.h
    @CallSuper
    public void a(@NonNull g gVar) {
        this.b.h(gVar);
    }

    @Override // com.bumptech.glide.request.k.h
    public void c(@Nullable com.bumptech.glide.request.e eVar) {
        this.a.setTag(C0838R.id.glide_custom_view_target_tag, eVar);
    }

    @Override // com.bumptech.glide.request.k.h
    @CallSuper
    public void h(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.k.h
    @Nullable
    public com.bumptech.glide.request.e i() {
        Object tag = this.a.getTag(C0838R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof com.bumptech.glide.request.e) {
            return (com.bumptech.glide.request.e) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.k.h
    @CallSuper
    public void j(@Nullable Drawable drawable) {
        this.b.b();
    }

    @Override // com.bumptech.glide.request.k.h
    @CallSuper
    public void k(@NonNull g gVar) {
        this.b.c(gVar);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Target for: ");
        M.append(this.a);
        return M.toString();
    }
}
