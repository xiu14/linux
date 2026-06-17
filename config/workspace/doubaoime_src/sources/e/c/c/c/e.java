package e.c.c.c;

import java.io.IOException;

/* loaded from: classes2.dex */
public class e extends IOException {
    public e(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
