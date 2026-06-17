package androidx.core.graphics;

import android.graphics.Matrix;
import android.graphics.Shader;
import kotlin.o;
import kotlin.s.b.l;

/* loaded from: classes.dex */
public final class ShaderKt {
    public static final void transform(Shader shader, l<? super Matrix, o> lVar) {
        kotlin.s.c.l.f(shader, "<this>");
        kotlin.s.c.l.f(lVar, "block");
        Matrix matrix = new Matrix();
        shader.getLocalMatrix(matrix);
        lVar.invoke(matrix);
        shader.setLocalMatrix(matrix);
    }
}
