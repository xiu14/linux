package com.bytedance.lighten.loader;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes.dex */
class d extends com.facebook.drawee.controller.c<com.facebook.imagepipeline.image.h> {
    private com.bytedance.lighten.core.m.b b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f5358c;

    /* renamed from: d, reason: collision with root package name */
    private com.facebook.imagepipeline.image.a f5359d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5360e = false;

    /* renamed from: f, reason: collision with root package name */
    private com.bytedance.lighten.core.i f5361f;

    d() {
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void a(String str, Object obj) {
        com.facebook.imagepipeline.image.h hVar = (com.facebook.imagepipeline.image.h) obj;
        Log.d("Lighten:", "onIntermediateImageSet: id=" + str);
        com.bytedance.lighten.core.m.b bVar = this.b;
        if (bVar != null) {
            if (hVar != null) {
                this.b.a(this.f5358c, new com.bytedance.lighten.core.e(hVar.getWidth(), hVar.getHeight()));
            } else {
                bVar.a(this.f5358c, null);
            }
        }
        this.f5360e = false;
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void b(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        com.facebook.imagepipeline.image.h hVar = (com.facebook.imagepipeline.image.h) obj;
        if (hVar instanceof com.facebook.imagepipeline.image.a) {
            this.f5359d = (com.facebook.imagepipeline.image.a) hVar;
        }
        Log.d("Lighten:", "onFinalImageSet: id=" + str);
        this.f5360e = animatable != null;
        com.bytedance.lighten.core.m.b bVar = this.b;
        if (bVar != null) {
            if (hVar != null) {
                this.b.f(this.f5358c, null, new com.bytedance.lighten.core.e(hVar.getWidth(), hVar.getHeight()), animatable);
            } else {
                bVar.f(this.f5358c, null, null, animatable);
            }
        }
        if (this.f5359d != null && this.f5361f.q()) {
            throw null;
        }
        if (this.f5360e && this.f5361f.r()) {
            throw null;
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void c(String str, Throwable th) {
        Log.d("Lighten:", "onFailure: id=" + str + ", ex=" + th);
        com.bytedance.lighten.core.m.b bVar = this.b;
        if (bVar != null) {
            bVar.d(this.f5358c, null, th);
        }
        this.f5360e = false;
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void d(String str) {
        Log.d("Lighten:", "onRelease: id=" + str);
        com.bytedance.lighten.core.m.b bVar = this.b;
        if (bVar != null) {
            bVar.c(this.f5358c);
        }
        this.f5360e = false;
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void e(String str, Object obj) {
        Log.d("Lighten:", "onSubmit: id=" + str);
        com.bytedance.lighten.core.m.b bVar = this.b;
        if (bVar != null) {
            bVar.b(this.f5358c, null);
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void f(String str, Throwable th) {
        Log.d("Lighten:", "onIntermediateImageFailed: id=" + str);
        com.bytedance.lighten.core.m.b bVar = this.b;
        if (bVar != null) {
            bVar.e(this.f5358c, th);
        }
        this.f5360e = false;
    }

    void m(com.bytedance.lighten.core.i iVar) {
        this.f5361f = iVar;
        Objects.requireNonNull(iVar);
        this.b = iVar.j();
        if (iVar.o() == null || iVar.o().b()) {
            this.f5358c = iVar.n();
        } else {
            this.f5358c = Uri.parse(iVar.o().a().get(0));
        }
    }

    void n(com.bytedance.lighten.core.m.b bVar) {
        this.b = bVar;
    }
}
