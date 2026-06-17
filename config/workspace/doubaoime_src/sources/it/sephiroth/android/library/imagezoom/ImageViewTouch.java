package it.sephiroth.android.library.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ImageViewTouch extends ImageViewTouchBase {
    protected float A;
    protected int B;
    protected GestureDetector.OnGestureListener C;
    protected ScaleGestureDetector.OnScaleGestureListener D;
    protected boolean E;

    /* renamed from: J, reason: collision with root package name */
    protected boolean f10078J;
    protected boolean K;
    private b L;
    private c M;
    protected ScaleGestureDetector y;
    protected GestureDetector z;

    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            StringBuilder M = e.a.a.a.a.M("onDoubleTap. double tap enabled? ");
            M.append(ImageViewTouch.this.E);
            Log.i("ImageViewTouchBase", M.toString());
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.E) {
                imageViewTouch.f10083g = true;
                float i = imageViewTouch.i();
                ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                float g2 = imageViewTouch2.g();
                if (imageViewTouch2.B == 1) {
                    float f2 = imageViewTouch2.A;
                    if ((2.0f * f2) + i <= g2) {
                        g2 = i + f2;
                    } else {
                        imageViewTouch2.B = -1;
                    }
                } else {
                    imageViewTouch2.B = 1;
                    g2 = 1.0f;
                }
                ImageViewTouch.this.t(Math.min(ImageViewTouch.this.g(), Math.max(g2, ImageViewTouch.this.h())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            if (ImageViewTouch.this.L != null) {
                ImageViewTouch.this.L.onDoubleTap();
            }
            return super.onDoubleTap(motionEvent);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return ImageViewTouch.this.w();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (!ImageViewTouch.this.K || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || ImageViewTouch.this.y.isInProgress() || ImageViewTouch.this.i() == 1.0f) {
                return false;
            }
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            Objects.requireNonNull(imageViewTouch);
            float x = motionEvent2.getX() - motionEvent.getX();
            float y = motionEvent2.getY() - motionEvent.getY();
            if (Math.abs(f2) <= 800.0f && Math.abs(f3) <= 800.0f) {
                return false;
            }
            imageViewTouch.f10083g = true;
            imageViewTouch.f10081e.post(new it.sephiroth.android.library.imagezoom.a(imageViewTouch, 300.0d, System.currentTimeMillis(), x / 2.0f, y / 2.0f));
            imageViewTouch.invalidate();
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (!ImageViewTouch.this.isLongClickable() || ImageViewTouch.this.y.isInProgress()) {
                return;
            }
            ImageViewTouch.this.setPressed(true);
            ImageViewTouch.this.performLongClick();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
            if (ImageViewTouch.this.K && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.y.isInProgress()) {
                return ImageViewTouch.this.x(f2, f3);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.M != null) {
                ImageViewTouch.this.M.a();
            }
            return ImageViewTouch.this.y();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return ImageViewTouch.this.z();
        }
    }

    public interface b {
        void onDoubleTap();
    }

    public interface c {
        void a();
    }

    public class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        protected boolean a = false;

        public d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scaleFactor = scaleGestureDetector.getScaleFactor() * ImageViewTouch.this.i();
            ImageViewTouch imageViewTouch = ImageViewTouch.this;
            if (imageViewTouch.f10078J) {
                boolean z = this.a;
                if (z && currentSpan != 0.0f) {
                    imageViewTouch.f10083g = true;
                    ImageViewTouch.this.s(Math.min(imageViewTouch.g(), Math.max(scaleFactor, ImageViewTouch.this.h() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch imageViewTouch2 = ImageViewTouch.this;
                    imageViewTouch2.B = 1;
                    imageViewTouch2.invalidate();
                    return true;
                }
                if (!z) {
                    this.a = true;
                }
            }
            return true;
        }
    }

    public ImageViewTouch(Context context) {
        super(context);
        this.E = true;
        this.f10078J = true;
        this.K = true;
    }

    public boolean A() {
        if (i() >= h()) {
            return true;
        }
        r(h(), 50.0f);
        return true;
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    protected void a(Drawable drawable, Matrix matrix, float f2, float f3) {
        super.a(drawable, matrix, f2, f3);
        this.A = g() / 3.0f;
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    protected void k(Context context, AttributeSet attributeSet, int i) {
        setScaleType(ImageView.ScaleType.MATRIX);
        ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.C = new a();
        this.D = new d();
        this.y = new ScaleGestureDetector(getContext(), this.D);
        this.z = new GestureDetector(getContext(), this.C, null, true);
        this.B = 1;
    }

    @Override // it.sephiroth.android.library.imagezoom.ImageViewTouchBase
    protected void m(float f2) {
        if (f2 < h()) {
            r(h(), 50.0f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.y.onTouchEvent(motionEvent);
        if (!this.y.isInProgress()) {
            this.z.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & 255) != 1) {
            return true;
        }
        return A();
    }

    public void setDoubleTapEnabled(boolean z) {
        this.E = z;
    }

    public void setDoubleTapListener(b bVar) {
        this.L = bVar;
    }

    public void setScaleEnabled(boolean z) {
        this.f10078J = z;
    }

    public void setScrollEnabled(boolean z) {
        this.K = z;
    }

    public void setSingleTapListener(c cVar) {
        this.M = cVar;
    }

    public boolean w() {
        return true;
    }

    public boolean x(float f2, float f3) {
        if (i() == 1.0f) {
            return false;
        }
        this.f10083g = true;
        n(-f2, -f3);
        invalidate();
        return true;
    }

    public boolean y() {
        return true;
    }

    public boolean z() {
        return true;
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.E = true;
        this.f10078J = true;
        this.K = true;
    }
}
