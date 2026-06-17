package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import androidx.annotation.RequiresApi;
import java.util.Collection;
import kotlin.s.c.l;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class PathKt {
    @RequiresApi(19)
    public static final Path and(Path path, Path path2) {
        l.f(path, "<this>");
        l.f(path2, "p");
        Path path3 = new Path();
        path3.op(path, path2, Path.Op.INTERSECT);
        return path3;
    }

    @RequiresApi(26)
    public static final Iterable<PathSegment> flatten(Path path, float f2) {
        l.f(path, "<this>");
        Collection<PathSegment> flatten = PathUtils.flatten(path, f2);
        l.e(flatten, "flatten(this, error)");
        return flatten;
    }

    public static /* synthetic */ Iterable flatten$default(Path path, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.5f;
        }
        return flatten(path, f2);
    }

    @RequiresApi(19)
    public static final Path minus(Path path, Path path2) {
        l.f(path, "<this>");
        l.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.DIFFERENCE);
        return path3;
    }

    @RequiresApi(19)
    public static final Path or(Path path, Path path2) {
        l.f(path, "<this>");
        l.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @RequiresApi(19)
    public static final Path plus(Path path, Path path2) {
        l.f(path, "<this>");
        l.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.UNION);
        return path3;
    }

    @RequiresApi(19)
    public static final Path xor(Path path, Path path2) {
        l.f(path, "<this>");
        l.f(path2, "p");
        Path path3 = new Path(path);
        path3.op(path2, Path.Op.XOR);
        return path3;
    }
}
