package okhttp3.F.e;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class e extends RuntimeException {
    private IOException a;
    private IOException b;

    public e(IOException iOException) {
        super(iOException);
        this.a = iOException;
        this.b = iOException;
    }

    public void a(IOException iOException) {
        okhttp3.F.c.a(this.a, iOException);
        this.b = iOException;
    }

    public IOException b() {
        return this.a;
    }

    public IOException c() {
        return this.b;
    }
}
