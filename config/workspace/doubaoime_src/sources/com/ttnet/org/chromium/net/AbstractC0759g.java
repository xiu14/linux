package com.ttnet.org.chromium.net;

import android.content.Context;
import android.util.Log;
import com.ttnet.org.chromium.net.B;
import com.ttnet.org.chromium.net.F;
import com.ttnet.org.chromium.net.z;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0759g {
    public abstract y a();

    public abstract z.a b(z.b bVar, Executor executor);

    public abstract F.a c(String str, F.b bVar, Executor executor);

    public abstract B.a d(B.b bVar, Executor executor);

    public abstract URLConnection e(URL url, Proxy proxy, boolean z) throws IOException;

    /* renamed from: com.ttnet.org.chromium.net.g$a */
    public static class a {
        protected final m a;

        /* renamed from: com.ttnet.org.chromium.net.g$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0400a {
            public abstract void loadLibrary(String str);
        }

        public a(m mVar) {
            this.a = mVar;
        }

        public a a(boolean z) {
            this.a.d(z);
            return this;
        }

        public a b(String str) {
            this.a.s(str);
            return this;
        }

        public a(Context context, boolean z) {
            ArrayList arrayList = new ArrayList(i.b(context));
            if (arrayList.size() != 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!((i) it2.next()).e()) {
                        it2.remove();
                    }
                }
                if (arrayList.size() != 0) {
                    Collections.sort(arrayList, new C0758f());
                    i iVar = (i) arrayList.get(0);
                    if (Log.isLoggable("CronetEngine.Builder", 3)) {
                        Log.d("CronetEngine.Builder", String.format("Using '%s' provider for creating CronetEngine.Builder.", iVar));
                    }
                    this.a = iVar.a(z).a;
                    return;
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }
    }
}
