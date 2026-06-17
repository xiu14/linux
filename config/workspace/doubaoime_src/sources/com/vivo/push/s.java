package com.vivo.push;

import android.content.Context;

/* loaded from: classes2.dex */
public abstract class s implements Runnable {
    protected Context a;
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private v f8891c;

    public s(v vVar) {
        this.b = -1;
        this.f8891c = vVar;
        int b = vVar.b();
        this.b = b;
        if (b < 0) {
            throw new IllegalArgumentException("PushTask need a > 0 task id.");
        }
        this.a = m.a().h();
    }

    public final int a() {
        return this.b;
    }

    protected abstract void a(v vVar);

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        if (context != null && !(this.f8891c instanceof com.vivo.push.b.n)) {
            com.vivo.push.util.t.a(context, "[执行指令]" + this.f8891c);
        }
        a(this.f8891c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        v vVar = this.f8891c;
        return e.a.a.a.a.J(sb, vVar == null ? "[null]" : vVar.toString(), "}");
    }
}
