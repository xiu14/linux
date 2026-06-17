package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class CanvasKt {
    public static final void withClip(Canvas canvas, Rect rect, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(rect, "clipRect");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withMatrix(Canvas canvas, Matrix matrix, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(matrix, "matrix");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withMatrix$default(Canvas canvas, Matrix matrix, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(matrix, "matrix");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withRotation(Canvas canvas, float f2, float f3, float f4, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withRotation$default(Canvas canvas, float f2, float f3, float f4, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.rotate(f2, f3, f4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSave(Canvas canvas, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withScale(Canvas canvas, float f2, float f3, float f4, float f5, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.scale(f2, f3, f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withScale$default(Canvas canvas, float f2, float f3, float f4, float f5, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i & 2) != 0) {
            f3 = 1.0f;
        }
        if ((i & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i & 8) != 0) {
            f5 = 0.0f;
        }
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.scale(f2, f3, f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withSkew(Canvas canvas, float f2, float f3, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.skew(f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withSkew$default(Canvas canvas, float f2, float f3, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.skew(f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withTranslation(Canvas canvas, float f2, float f3, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.translate(f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static void withTranslation$default(Canvas canvas, float f2, float f3, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.translate(f2, f3);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, RectF rectF, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(rectF, "clipRect");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, int i, int i2, int i3, int i4, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, float f2, float f3, float f4, float f5, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.clipRect(f2, f3, f4, f5);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public static final void withClip(Canvas canvas, Path path, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(canvas, "<this>");
        kotlin.s.c.l.f(path, "clipPath");
        kotlin.s.c.l.f(lVar, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            lVar.invoke(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
