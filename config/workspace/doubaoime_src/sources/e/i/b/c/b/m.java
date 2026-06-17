package e.i.b.c.b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes2.dex */
public class m {
    private final i a;
    private final g b;

    /* renamed from: c, reason: collision with root package name */
    private h f10019c;

    static {
        new e.i.b.c.a();
    }

    public m(Context context, AttributeSet attributeSet, int i, int i2) {
        kotlin.s.c.l.f(context, "context");
        this.a = new i(context, attributeSet, i, i2);
        this.b = new g(context, attributeSet, i, i2);
    }

    public e a() {
        return this.b;
    }

    public h b() {
        h hVar = this.f10019c;
        if (hVar != null) {
            return hVar;
        }
        kotlin.s.c.l.l("mOUIEffectHelper");
        throw null;
    }

    public f c() {
        return this.a;
    }

    public final void d(View view) {
        kotlin.s.c.l.f(view, "owner");
        this.a.E(view);
        this.b.f(view);
        this.f10019c = new h(view);
    }
}
