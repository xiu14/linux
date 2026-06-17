package e.h.a;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
class b implements Runnable {
    b(a aVar) {
    }

    @Override // java.lang.Runnable
    public void run() {
        Context context;
        try {
            context = a.f9939f;
            com.monitor.cloudmessage.utils.a.g(context.getApplicationInfo().dataDir + File.separator + "dbFiles");
        } catch (Throwable unused) {
        }
    }
}
