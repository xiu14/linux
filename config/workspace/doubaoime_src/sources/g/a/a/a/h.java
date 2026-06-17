package g.a.a.a;

import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
final class h implements PrivilegedAction {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;

    h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        return System.getProperty(this.a, this.b);
    }
}
