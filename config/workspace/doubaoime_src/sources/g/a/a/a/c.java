package g.a.a.a;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
final class c implements PrivilegedAction {
    c() {
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
