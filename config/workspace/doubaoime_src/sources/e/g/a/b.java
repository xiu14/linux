package e.g.a;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.c;
import org.threeten.bp.zone.g;
import org.threeten.bp.zone.h;

/* loaded from: classes2.dex */
final class b extends g {

    /* renamed from: c, reason: collision with root package name */
    private final Context f9938c;

    b(Context context) {
        this.f9938c = context;
    }

    @Override // org.threeten.bp.zone.g
    protected void b() {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f9938c.getAssets().open("org/threeten/bp/TZDB.dat");
                c cVar = new c(inputStream);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                h.d(cVar);
            } catch (IOException e2) {
                throw new IllegalStateException("TZDB.dat missing from assets.", e2);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
