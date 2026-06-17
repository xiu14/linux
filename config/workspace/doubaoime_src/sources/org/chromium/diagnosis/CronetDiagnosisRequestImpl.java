package org.chromium.diagnosis;

import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.b.a;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.z;
import java.util.List;
import org.chromium.CronetClient;

/* loaded from: classes2.dex */
public class CronetDiagnosisRequestImpl implements com.bytedance.frameworks.baselib.network.http.cronet.b.a {
    private static final String TAG = "CronetDiagnosisRequestImpl";
    private static final String TTNET_INIT_CLASS = "com.bytedance.ttnet.TTNetInit";
    private static AbstractC0759g sCronetEngine;
    private a.InterfaceC0255a mCallback;
    private a mCronetCallback = new a();
    private z mRequest;

    class a implements z.b {
        a() {
        }

        @Override // com.ttnet.org.chromium.net.z.b
        public void a(z zVar, String str) {
            CronetDiagnosisRequestImpl.this.mCallback.a(str);
        }
    }

    public CronetDiagnosisRequestImpl(a.InterfaceC0255a interfaceC0255a, int i, List<String> list, int i2, int i3, int i4) throws Exception {
        this.mRequest = null;
        this.mCallback = interfaceC0255a;
        if (sCronetEngine == null) {
            sCronetEngine = getCronetEngine();
        }
        AbstractC0759g abstractC0759g = sCronetEngine;
        if (abstractC0759g == null) {
            throw new UnsupportedOperationException("Can not get cronet engine.");
        }
        z.a b = abstractC0759g.b(this.mCronetCallback, null);
        b.d(i);
        b.e(list);
        b.c(i2);
        b.b(i3);
        b.f(i4);
        this.mRequest = b.a();
    }

    private AbstractC0759g getCronetEngine() {
        if (Logger.debug()) {
            Logger.d(TAG, "Init cronet engine");
        }
        try {
            loadCronetKernel();
        } catch (Throwable th) {
            th.printStackTrace();
            if (Logger.debug()) {
                Logger.d(TAG, "TTNet init failed, cronet engine is null.");
            }
        }
        return CronetClient.getCronetEngine();
    }

    private static void loadCronetKernel() throws Exception {
        Reflect.on(Class.forName(TTNET_INIT_CLASS).newInstance()).call("preInitCronetKernel");
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.a
    public void cancel() {
        z zVar = this.mRequest;
        if (zVar != null) {
            zVar.a();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.a
    public void doExtraCommand(String str, String str2) {
        z zVar = this.mRequest;
        if (zVar != null) {
            zVar.b(str, str2);
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.http.cronet.b.a
    public void start() {
        z zVar = this.mRequest;
        if (zVar != null) {
            zVar.c();
        }
    }
}
