package g.a.a.a;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.security.PrivilegedAction;

/* loaded from: classes2.dex */
final class f implements PrivilegedAction {
    private final /* synthetic */ ClassLoader a;
    private final /* synthetic */ String b;

    f(ClassLoader classLoader, String str) {
        this.a = classLoader;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public Object run() {
        try {
            ClassLoader classLoader = this.a;
            return classLoader != null ? classLoader.getResources(this.b) : ClassLoader.getSystemResources(this.b);
        } catch (IOException e2) {
            if (i.i()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Exception while trying to find configuration file ");
                stringBuffer.append(this.b);
                stringBuffer.append(Constants.COLON_SEPARATOR);
                stringBuffer.append(e2.getMessage());
                i.j(stringBuffer.toString());
            }
            return null;
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }
}
