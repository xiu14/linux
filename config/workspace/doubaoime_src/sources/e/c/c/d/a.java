package e.c.c.d;

import com.facebook.infer.annotation.Nullsafe;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

@Nullsafe(Nullsafe.Mode.STRICT)
/* loaded from: classes2.dex */
public final class a {
    static final Logger a = Logger.getLogger(a.class.getName());

    private a() {
    }

    public static void a(Closeable closeable, boolean z) throws IOException {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e2) {
            if (!z) {
                throw e2;
            }
            a.log(Level.WARNING, "IOException thrown while closing Closeable.", (Throwable) e2);
        }
    }

    public static void b(InputStream inputStream) {
        try {
            a(inputStream, true);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
