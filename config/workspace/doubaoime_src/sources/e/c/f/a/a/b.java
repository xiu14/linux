package e.c.f.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import e.c.f.a.a.a;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes2.dex */
public class b<T extends a> implements a {
    private T a;

    public b(T t) {
        this.a = t;
    }

    @Override // e.c.f.a.a.d
    public int a() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.a();
    }

    @Override // e.c.f.a.a.a
    public boolean b(int i) {
        T t = this.a;
        if (t != null) {
            return t.b(i);
        }
        return false;
    }

    @Override // e.c.f.a.a.d
    public int c() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.c();
    }

    @Override // e.c.f.a.a.a
    public void clear() {
        T t = this.a;
        if (t != null) {
            t.clear();
        }
    }

    public T d() {
        return this.a;
    }

    @Override // e.c.f.a.a.a
    public void e(ColorFilter colorFilter) {
        T t = this.a;
        if (t != null) {
            t.e(colorFilter);
        }
    }

    @Override // e.c.f.a.a.d
    public int f(int i) {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.f(i);
    }

    @Override // e.c.f.a.a.a
    public void g(@IntRange(from = 0, to = 255) int i) {
        T t = this.a;
        if (t != null) {
            t.g(i);
        }
    }

    @Override // e.c.f.a.a.a
    public int h() {
        T t = this.a;
        if (t == null) {
            return -1;
        }
        return t.h();
    }

    @Override // e.c.f.a.a.a
    public void i(Rect rect) {
        T t = this.a;
        if (t != null) {
            t.i(rect);
        }
    }

    @Override // e.c.f.a.a.a
    public int j() {
        T t = this.a;
        if (t == null) {
            return -1;
        }
        return t.j();
    }

    @Override // e.c.f.a.a.a
    public boolean k(Drawable drawable, Canvas canvas, int i) {
        T t = this.a;
        return t != null && t.k(drawable, canvas, i);
    }

    public b(T t, e.c.g.d dVar) {
        this.a = t;
    }
}
