package e.i.b.c.b;

import android.R;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import org.xmlpull.v1.XmlPullParser;

@RequiresApi(23)
/* loaded from: classes2.dex */
public final class n extends DrawableWrapper implements Animatable {
    private final Paint a;
    private Bitmap b;

    /* renamed from: c, reason: collision with root package name */
    private RectF f10020c;

    /* renamed from: d, reason: collision with root package name */
    private float f10021d;

    /* renamed from: e, reason: collision with root package name */
    private DisplayMetrics f10022e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Drawable drawable, DisplayMetrics displayMetrics) {
        super(drawable);
        kotlin.s.c.l.f(drawable, "bg");
        kotlin.s.c.l.f(displayMetrics, "displayMetrics");
        kotlin.s.c.l.f(drawable, "bg");
        Paint paint = new Paint(1);
        this.a = paint;
        this.f10021d = 16.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f10022e = displayMetrics;
    }

    public final void a(float f2) {
        this.f10021d = f2;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        kotlin.s.c.l.f(canvas, "canvas");
        int saveLayer = canvas.saveLayer(this.f10020c, this.a);
        super.draw(canvas);
        Bitmap bitmap = this.b;
        if (bitmap != null) {
            this.a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
            this.a.setXfermode(null);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        kotlin.s.c.l.f(resources, DownloadFileUtils.MODE_READ);
        kotlin.s.c.l.f(xmlPullParser, "parser");
        kotlin.s.c.l.f(attributeSet, "attrs");
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int depth = xmlPullParser.getDepth();
        this.f10022e = resources.getDisplayMetrics();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            }
            if (next == 2) {
                if (kotlin.s.c.l.a(xmlPullParser.getName(), "corners")) {
                    int[] iArr = {R.attr.radius};
                    this.f10021d = (theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0)).getDimensionPixelSize(0, (int) this.f10021d);
                } else {
                    drawable = DrawableWrapper.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            return ((AnimationDrawable) drawable).isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        RectF rectF = new RectF(i, i2, i3, i4);
        if (!kotlin.s.c.l.a(rectF, this.f10020c)) {
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                bitmap.recycle();
            }
            Bitmap createBitmap = Bitmap.createBitmap(this.f10022e, i3 - i, i4 - i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float f2 = this.f10021d;
            canvas.drawRoundRect(rectF, f2, f2, this.a);
            this.f10020c = rectF;
            this.b = createBitmap;
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
    }
}
