package e.c.c.c;

import java.io.IOException;

/* loaded from: classes2.dex */
public class b extends IOException {
    public b(String str) {
        super(str);
    }

    public b(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
