package kotlinx.coroutines.scheduling;

import kotlinx.coroutines.I;

/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f10327c;

    public j(Runnable runnable, long j, h hVar) {
        super(j, hVar);
        this.f10327c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f10327c.run();
        } finally {
            this.b.a();
        }
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("Task[");
        M.append(I.a(this.f10327c));
        M.append('@');
        M.append(I.b(this.f10327c));
        M.append(", ");
        M.append(this.a);
        M.append(", ");
        M.append(this.b);
        M.append(']');
        return M.toString();
    }
}
