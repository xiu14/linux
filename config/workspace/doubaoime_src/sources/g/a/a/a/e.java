package g.a.a.a;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
final class e implements PrivilegedAction {
    private final /* synthetic */ ClassLoader a;
    private final /* synthetic */ String b;

    e(ClassLoader classLoader, String str) {
        this.a = classLoader;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        ClassLoader classLoader = this.a;
        return classLoader != null ? classLoader.getResourceAsStream(this.b) : ClassLoader.getSystemResourceAsStream(this.b);
    }
}
