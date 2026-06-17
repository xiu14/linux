package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;

/* loaded from: classes2.dex */
public class AnimatedImageCompositor {
    private final com.facebook.imagepipeline.animated.base.a a;
    private final a b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f6444c;

    private enum FrameNeededResult {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public interface a {
        void a(int i, Bitmap bitmap);

        e.c.c.g.a<Bitmap> b(int i);
    }

    public AnimatedImageCompositor(com.facebook.imagepipeline.animated.base.a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
        Paint paint = new Paint();
        this.f6444c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        canvas.drawRect(animatedDrawableFrameInfo.a, animatedDrawableFrameInfo.b, r0 + animatedDrawableFrameInfo.f6437c, r1 + animatedDrawableFrameInfo.f6438d, this.f6444c);
    }

    private boolean b(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        return animatedDrawableFrameInfo.a == 0 && animatedDrawableFrameInfo.b == 0 && animatedDrawableFrameInfo.f6437c == ((com.facebook.imagepipeline.animated.impl.a) this.a).j() && animatedDrawableFrameInfo.f6438d == ((com.facebook.imagepipeline.animated.impl.a) this.a).i();
    }

    private boolean c(int i) {
        if (i == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo f2 = ((com.facebook.imagepipeline.animated.impl.a) this.a).f(i);
        AnimatedDrawableFrameInfo f3 = ((com.facebook.imagepipeline.animated.impl.a) this.a).f(i - 1);
        if (f2.f6439e == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && b(f2)) {
            return true;
        }
        return f3.f6440f == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND && b(f3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0084, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r8, android.graphics.Bitmap r9) {
        /*
            r7 = this;
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r9)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            r2 = 0
            r0.drawColor(r2, r1)
            boolean r1 = r7.c(r8)
            if (r1 != 0) goto L89
            int r1 = r8 + (-1)
        L13:
            if (r1 < 0) goto L8a
            com.facebook.imagepipeline.animated.base.a r3 = r7.a
            com.facebook.imagepipeline.animated.impl.a r3 = (com.facebook.imagepipeline.animated.impl.a) r3
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo r3 = r3.f(r1)
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r4 = r3.f6440f
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r5 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT
            if (r4 != r5) goto L26
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r3 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.REQUIRED
            goto L3f
        L26:
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r5 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND
            if (r4 != r5) goto L36
            boolean r3 = r7.b(r3)
            if (r3 == 0) goto L33
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r3 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.NOT_REQUIRED
            goto L3f
        L33:
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r3 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.REQUIRED
            goto L3f
        L36:
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r3 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS
            if (r4 != r3) goto L3d
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r3 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.SKIP
            goto L3f
        L3d:
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$FrameNeededResult r3 = com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.FrameNeededResult.ABORT
        L3f:
            int r3 = r3.ordinal()
            if (r3 == 0) goto L4f
            r4 = 1
            if (r3 == r4) goto L4c
            r4 = 3
            if (r3 == r4) goto L84
            goto L86
        L4c:
            int r2 = r1 + 1
            goto L8a
        L4f:
            com.facebook.imagepipeline.animated.base.a r3 = r7.a
            com.facebook.imagepipeline.animated.impl.a r3 = (com.facebook.imagepipeline.animated.impl.a) r3
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo r3 = r3.f(r1)
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a r4 = r7.b
            e.c.c.g.a r4 = r4.b(r1)
            if (r4 == 0) goto L7e
            java.lang.Object r2 = r4.r()     // Catch: java.lang.Throwable -> L79
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch: java.lang.Throwable -> L79
            r5 = 0
            r6 = 0
            r0.drawBitmap(r2, r6, r6, r5)     // Catch: java.lang.Throwable -> L79
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r2 = r3.f6440f     // Catch: java.lang.Throwable -> L79
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r5 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND     // Catch: java.lang.Throwable -> L79
            if (r2 != r5) goto L73
            r7.a(r0, r3)     // Catch: java.lang.Throwable -> L79
        L73:
            int r2 = r1 + 1
            r4.close()
            goto L8a
        L79:
            r8 = move-exception
            r4.close()
            throw r8
        L7e:
            boolean r3 = r7.c(r1)
            if (r3 == 0) goto L86
        L84:
            r2 = r1
            goto L8a
        L86:
            int r1 = r1 + (-1)
            goto L13
        L89:
            r2 = r8
        L8a:
            if (r2 >= r8) goto Lba
            com.facebook.imagepipeline.animated.base.a r1 = r7.a
            com.facebook.imagepipeline.animated.impl.a r1 = (com.facebook.imagepipeline.animated.impl.a) r1
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo r1 = r1.f(r2)
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r3 = r1.f6440f
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r4 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS
            if (r3 != r4) goto L9b
            goto Lb7
        L9b:
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation r4 = r1.f6439e
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation r5 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND
            if (r4 != r5) goto La4
            r7.a(r0, r1)
        La4:
            com.facebook.imagepipeline.animated.base.a r4 = r7.a
            com.facebook.imagepipeline.animated.impl.a r4 = (com.facebook.imagepipeline.animated.impl.a) r4
            r4.n(r2, r0)
            com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a r4 = r7.b
            r4.a(r2, r9)
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$DisposalMethod r4 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND
            if (r3 != r4) goto Lb7
            r7.a(r0, r1)
        Lb7:
            int r2 = r2 + 1
            goto L8a
        Lba:
            com.facebook.imagepipeline.animated.base.a r9 = r7.a
            com.facebook.imagepipeline.animated.impl.a r9 = (com.facebook.imagepipeline.animated.impl.a) r9
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo r9 = r9.f(r8)
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation r1 = r9.f6439e
            com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo$BlendOperation r2 = com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND
            if (r1 != r2) goto Lcb
            r7.a(r0, r9)
        Lcb:
            com.facebook.imagepipeline.animated.base.a r9 = r7.a
            com.facebook.imagepipeline.animated.impl.a r9 = (com.facebook.imagepipeline.animated.impl.a) r9
            r9.n(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.d(int, android.graphics.Bitmap):void");
    }
}
