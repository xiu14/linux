package com.bytedance.apm.G;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d implements com.bytedance.services.apm.api.d {
    private String b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f3298c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f3299d;

    /* renamed from: f, reason: collision with root package name */
    private long f3301f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3302g;
    private long a = -1;

    /* renamed from: e, reason: collision with root package name */
    private Handler f3300e = new Handler(Looper.getMainLooper());

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ WeakReference a;
        final /* synthetic */ Integer b;

        a(WeakReference weakReference, Integer num) {
            this.a = weakReference;
            this.b = num;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View findViewById;
            if (this.a.get() != null && (findViewById = ((View) this.a.get()).findViewById(this.b.intValue())) != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                ViewTreeObserver viewTreeObserver = ((View) this.a.get()).getViewTreeObserver();
                if (viewTreeObserver.isAlive() && d.this.f3298c != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(d.this.f3298c);
                }
                if (d.this.f3299d != null) {
                    d.this.f3300e.removeCallbacks(d.this.f3299d);
                    d.d(d.this, null);
                }
                d.b(d.this, null);
                if (d.this.a > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = currentTimeMillis - d.this.a;
                    d.this.a = 0L;
                    if (j >= d.this.f3301f || j <= 0) {
                        return;
                    }
                    AutoPageTraceHelper.b(currentTimeMillis, d.this.b);
                    com.bytedance.apm.q.b.a.d(d.this.b, "activityOnCreateToViewShow", j);
                }
            }
        }
    }

    class b implements Runnable {
        final /* synthetic */ WeakReference a;

        b(WeakReference weakReference) {
            this.a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f3298c == null || this.a.get() == null) {
                return;
            }
            ((View) this.a.get()).getViewTreeObserver().removeOnGlobalLayoutListener(d.this.f3298c);
        }
    }

    static /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b(d dVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        dVar.f3298c = null;
        return null;
    }

    static /* synthetic */ Runnable d(d dVar, Runnable runnable) {
        dVar.f3299d = null;
        return null;
    }

    @TargetApi(16)
    private void j(Activity activity) {
        this.a = System.currentTimeMillis();
        String canonicalName = activity.getClass().getCanonicalName();
        this.b = canonicalName;
        Integer a2 = com.bytedance.apm.G.i.a.a(canonicalName);
        if (a2 == null) {
            return;
        }
        WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
        this.f3298c = new a(weakReference, a2);
        ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f3298c);
        b bVar = new b(weakReference);
        this.f3299d = bVar;
        this.f3300e.postDelayed(bVar, this.f3301f);
    }

    public void k(long j, boolean z) {
        this.f3301f = j;
        this.f3302g = z;
        ActivityLifeObserver.getInstance().register(this);
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f3302g) {
            try {
                j(activity);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.services.apm.api.d
    @TargetApi(16)
    public void onActivityPause(Activity activity) {
        this.a = 0L;
        try {
            if (this.f3298c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f3298c);
                this.f3298c = null;
            }
            Runnable runnable = this.f3299d;
            if (runnable != null) {
                this.f3300e.removeCallbacks(runnable);
                this.f3299d = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityResume(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onBackground(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onChange(Activity activity, Fragment fragment) {
    }

    @Override // com.bytedance.services.apm.api.d
    public void onFront(Activity activity) {
    }
}
