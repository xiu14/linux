package e.i.b.e;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import kotlin.s.c.l;

/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();

    private a() {
    }

    private final Bitmap b(Context context, Drawable drawable, Float f2, Float f3) {
        int intrinsicWidth;
        int i;
        if ((drawable instanceof BitmapDrawable) && f2 == null && f3 == null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            l.e(bitmap, "drawable.bitmap");
            return bitmap;
        }
        Resources resources = context.getResources();
        l.e(resources, "context.resources");
        float f4 = resources.getDisplayMetrics().density;
        if (f2 != null) {
            intrinsicWidth = (int) (f2.floatValue() * f4);
        } else {
            intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth < 1) {
                intrinsicWidth = 1;
            }
        }
        if (f3 != null) {
            i = (int) (f3.floatValue() * f4);
        } else {
            int intrinsicHeight = drawable.getIntrinsicHeight();
            i = intrinsicHeight >= 1 ? intrinsicHeight : 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        l.e(createBitmap, "bitmap");
        return createBitmap;
    }

    public final Drawable a(Context context, Drawable drawable, float f2, float f3, float f4, int i) {
        l.f(context, "context");
        l.f(drawable, "drawable");
        Resources resources = context.getResources();
        l.e(resources, "context.resources");
        int i2 = (int) (f4 * resources.getDisplayMetrics().density);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(i2, i);
        gradientDrawable.setColor(0);
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(context.getResources(), (f2 <= 0.0f || f3 <= 0.0f) ? b(context, drawable, null, null) : b(context, drawable, Float.valueOf(f2), Float.valueOf(f3)));
        create.setCircular(true);
        l.e(create, "RoundedBitmapDrawableFac…ular = true\n            }");
        return new LayerDrawable(new Drawable[]{create, gradientDrawable});
    }
}
