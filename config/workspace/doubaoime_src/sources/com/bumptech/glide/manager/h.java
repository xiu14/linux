package com.bumptech.glide.manager;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@RequiresApi(26)
/* loaded from: classes.dex */
final class h implements i {
    final Set<Activity> a = Collections.newSetFromMap(new WeakHashMap());
    volatile boolean b;

    class a implements ViewTreeObserver.OnDrawListener {
        final /* synthetic */ View a;

        /* renamed from: com.bumptech.glide.manager.h$a$a, reason: collision with other inner class name */
        class RunnableC0041a implements Runnable {
            final /* synthetic */ ViewTreeObserver.OnDrawListener a;

            RunnableC0041a(ViewTreeObserver.OnDrawListener onDrawListener) {
                this.a = onDrawListener;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.bumptech.glide.load.resource.bitmap.r.a().d();
                h.this.b = true;
                View view = a.this.a;
                view.getViewTreeObserver().removeOnDrawListener(this.a);
                h.this.a.clear();
            }
        }

        a(View view) {
            this.a = view;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            com.bumptech.glide.util.j.k(new RunnableC0041a(this));
        }
    }

    h() {
    }

    @Override // com.bumptech.glide.manager.i
    public void a(Activity activity) {
        if (!this.b && this.a.add(activity)) {
            View decorView = activity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new a(decorView));
        }
    }
}
