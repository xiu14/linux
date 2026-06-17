package androidx.core.graphics;

import android.graphics.Canvas;
import android.graphics.Picture;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class PictureKt {
    public static final Picture record(Picture picture, int i, int i2, l<? super Canvas, o> lVar) {
        kotlin.s.c.l.f(picture, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        kotlin.s.c.l.e(beginRecording, "beginRecording(width, height)");
        try {
            lVar.invoke(beginRecording);
            return picture;
        } finally {
            picture.endRecording();
        }
    }
}
