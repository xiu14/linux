package com.bytedance.android.input.basic.d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;

/* loaded from: classes.dex */
public class e {

    public static class b implements ViewTreeObserver.OnGlobalLayoutListener {
        private Context a;
        private View b;

        /* renamed from: c, reason: collision with root package name */
        private int f2052c;

        /* renamed from: d, reason: collision with root package name */
        private int f2053d;

        /* renamed from: e, reason: collision with root package name */
        private Rect f2054e = new Rect();

        /* renamed from: f, reason: collision with root package name */
        private c f2055f;

        b(Context context, Window window, c cVar, a aVar) {
            this.a = context;
            this.f2055f = cVar;
            if (window != null) {
                View decorView = window.getDecorView();
                this.b = decorView;
                decorView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }

        public void a() {
            View view = this.b;
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int i;
            this.b.getWindowVisibleDisplayFrame(this.f2054e);
            int i2 = this.a.getResources().getConfiguration().orientation;
            int height = this.f2054e.height();
            int i3 = this.f2053d;
            if (i3 == 0 || (i = this.f2052c) == 0) {
                this.f2053d = height;
                this.f2052c = i2;
                return;
            }
            if (i3 == height) {
                return;
            }
            if (i != i2) {
                this.f2053d = height;
                this.f2052c = i2;
                return;
            }
            if (i3 - height > 200) {
                c cVar = this.f2055f;
                if (cVar != null) {
                    cVar.b(i3 - height);
                }
                this.f2053d = height;
                return;
            }
            if (height - i3 <= 200) {
                this.f2053d = height;
                return;
            }
            c cVar2 = this.f2055f;
            if (cVar2 != null) {
                cVar2.a(height - i3);
            }
            this.f2053d = height;
        }
    }

    public interface c {
        void a(int i);

        void b(int i);
    }

    public static boolean a(Activity activity) {
        int height = activity.getWindow().getDecorView().getHeight();
        Rect rect = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return height - rect.bottom >= 400;
    }

    public static b b(Activity activity, c cVar) {
        return new b(activity, activity.getWindow(), cVar, null);
    }
}
