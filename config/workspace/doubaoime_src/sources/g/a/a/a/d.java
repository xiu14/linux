package g.a.a.a;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
final class d implements PrivilegedAction {
    private final /* synthetic */ String a;
    private final /* synthetic */ ClassLoader b;

    d(String str, ClassLoader classLoader) {
        this.a = str;
        this.b = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return i.c(this.a, this.b);
    }
}
