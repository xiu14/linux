package com.bytedance.feedbackerlib.model;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity;
import com.bytedance.feedbackerlib.service.FloatWindowService;

/* loaded from: classes.dex */
public class g {

    /* renamed from: d, reason: collision with root package name */
    private static volatile g f4946d;
    private Context a;
    private MediaProjection b;

    /* renamed from: c, reason: collision with root package name */
    private MediaProjectionManager f4947c;

    class a implements FloatWindowService.h {
        final /* synthetic */ b a;

        /* renamed from: com.bytedance.feedbackerlib.model.g$a$a, reason: collision with other inner class name */
        class C0243a implements TranslucentOnePixelActivity.c {
            C0243a() {
            }

            @Override // com.bytedance.feedbackerlib.activity.TranslucentOnePixelActivity.c
            @RequiresApi(api = 21)
            public void a(int i, @Nullable Intent intent) {
                if (intent == null) {
                    b bVar = a.this.a;
                    if (bVar != null) {
                        bVar.a(null);
                        return;
                    }
                    return;
                }
                if (g.this.b == null) {
                    synchronized (g.this) {
                        if (g.this.b == null) {
                            try {
                                g gVar = g.this;
                                gVar.b = gVar.f4947c.getMediaProjection(i, intent);
                            } catch (Throwable unused) {
                                g.this.b = null;
                            }
                        }
                    }
                }
                a aVar = a.this;
                b bVar2 = aVar.a;
                if (bVar2 != null) {
                    bVar2.a(g.this.b);
                }
            }
        }

        a(b bVar) {
            this.a = bVar;
        }

        @Override // com.bytedance.feedbackerlib.service.FloatWindowService.h
        public void a() {
            TranslucentOnePixelActivity.m(g.this.a, new C0243a());
        }
    }

    public interface b {
        void a(MediaProjection mediaProjection);
    }

    @RequiresApi(api = 21)
    private g(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.f4947c = (MediaProjectionManager) applicationContext.getSystemService("media_projection");
    }

    @RequiresApi(api = 21)
    public static g e(@NonNull Context context) {
        if (f4946d == null) {
            synchronized (g.class) {
                if (f4946d == null) {
                    f4946d = new g(context);
                }
            }
        }
        return f4946d;
    }

    public MediaProjection f(b bVar) {
        MediaProjection mediaProjection = this.b;
        if (mediaProjection != null) {
            return mediaProjection;
        }
        FloatWindowService.x(this.a, new a(bVar));
        return null;
    }

    public void g() {
        this.b = null;
    }

    public void h() {
        this.b = null;
    }
}
