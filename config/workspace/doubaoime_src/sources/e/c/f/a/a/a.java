package e.c.f.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;

/* loaded from: classes2.dex */
public interface a extends d {
    boolean b(int i);

    void clear();

    void e(ColorFilter colorFilter);

    void g(@IntRange(from = 0, to = 255) int i);

    int h();

    void i(Rect rect);

    int j();

    boolean k(Drawable drawable, Canvas canvas, int i);
}
