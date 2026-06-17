package kotlinx.coroutines;

import java.util.concurrent.CancellationException;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<kotlinx.coroutines.n0>] */
/* loaded from: classes2.dex */
public final class n0 extends CancellationException {
    public final transient InterfaceC0817m0 a;

    public n0(String str, Throwable th, InterfaceC0817m0 interfaceC0817m0) {
        super(str);
        this.a = interfaceC0817m0;
        if (th != null) {
            initCause(th);
        }
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof n0) {
                n0 n0Var = (n0) obj;
                if (!kotlin.s.c.l.a(n0Var.getMessage(), getMessage()) || !kotlin.s.c.l.a(n0Var.a, this.a) || !kotlin.s.c.l.a(n0Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.s.c.l.c(message);
        int hashCode = (this.a.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
