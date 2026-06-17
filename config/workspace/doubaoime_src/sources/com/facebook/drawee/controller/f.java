package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.util.Log;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<INFO>] */
/* loaded from: classes2.dex */
public class f<INFO> extends c<INFO> {
    private final List<e<? super INFO>> b = new ArrayList(2);

    private synchronized void o(String str, Throwable th) {
        Log.e("FdingControllerListener", str, th);
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void a(String str, INFO info) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    eVar.a(str, info);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onIntermediateImageSet", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public synchronized void b(String str, INFO info, Animatable animatable) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    eVar.b(str, info, animatable);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onFinalImageSet", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public synchronized void c(String str, Throwable th) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    eVar.c(str, th);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onFailure", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public synchronized void d(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    eVar.d(str);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onRelease", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public synchronized void e(String str, Object obj) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    eVar.e(str, obj);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onSubmit", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c, com.facebook.drawee.controller.e
    public void f(String str, Throwable th) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    eVar.f(str, th);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onIntermediateImageFailed", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public void h(ImageRequest imageRequest, long j) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar instanceof d) {
                    Objects.requireNonNull((d) eVar);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onFinalImageSet", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public synchronized void i(String str, ImageRequest imageRequest, Throwable th) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar instanceof d) {
                    Objects.requireNonNull((d) eVar);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onFailure", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public void j(String str, INFO info, Animatable animatable, ImageRequest imageRequest, Map map) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar != null) {
                    if (eVar instanceof d) {
                    } else {
                        eVar.b(str, info, animatable);
                    }
                }
            } catch (Exception e2) {
                o("InternalListener exception in onFinalImageSet", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public void k(String str, INFO info, Animatable animatable) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar instanceof c) {
                    ((c) eVar).k(str, info, animatable);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onIntermediateImageSet", e2);
            }
        }
    }

    @Override // com.facebook.drawee.controller.c
    public synchronized void l(String str, ImageRequest imageRequest) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            try {
                e<? super INFO> eVar = this.b.get(i);
                if (eVar instanceof d) {
                    Objects.requireNonNull((d) eVar);
                }
            } catch (Exception e2) {
                o("InternalListener exception in onRelease", e2);
            }
        }
    }

    public synchronized void m(e<? super INFO> eVar) {
        this.b.add(eVar);
    }

    public synchronized void n() {
        this.b.clear();
    }
}
