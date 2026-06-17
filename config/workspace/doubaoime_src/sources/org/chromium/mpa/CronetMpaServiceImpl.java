package org.chromium.mpa;

import com.bytedance.common.utility.reflect.Reflect;
import com.ttnet.org.chromium.net.AbstractC0759g;
import com.ttnet.org.chromium.net.y;
import java.util.List;
import org.chromium.CronetClient;

/* loaded from: classes2.dex */
public class CronetMpaServiceImpl {
    private static final String PRE_CNIT_KETNEL_FUNC = "preInitCronetKernel";
    private static final String TTNET_INIT_CLASS = "com.bytedance.ttnet.TTNetInit";
    private AbstractC0759g mCronetEngine;
    private com.bytedance.frameworks.baselib.network.http.cronet.c.a mOuterAccAddressCallback;
    private com.bytedance.frameworks.baselib.network.http.cronet.c.a mOuterInitCallback;
    private y mTTNetMpaService;
    private y.a mCronetInitCallback = new a();
    private y.a mCronetAccAddressCallback = new b();

    class a implements y.a {
        a() {
        }

        @Override // com.ttnet.org.chromium.net.y.a
        public void a(boolean z, String str) {
            if (CronetMpaServiceImpl.this.mOuterInitCallback != null) {
                CronetMpaServiceImpl.this.mOuterInitCallback.a(z, str);
            }
        }
    }

    class b implements y.a {
        b() {
        }

        @Override // com.ttnet.org.chromium.net.y.a
        public void a(boolean z, String str) {
            synchronized (CronetMpaServiceImpl.class) {
                if (CronetMpaServiceImpl.this.mOuterAccAddressCallback != null) {
                    CronetMpaServiceImpl.this.mOuterAccAddressCallback.a(z, str);
                    CronetMpaServiceImpl.this.mOuterAccAddressCallback = null;
                }
            }
        }
    }

    private boolean createMpaService() {
        if (!loadCronetKernel()) {
            return false;
        }
        if (this.mTTNetMpaService != null) {
            return true;
        }
        this.mTTNetMpaService = this.mCronetEngine.a();
        return true;
    }

    private boolean loadCronetKernel() {
        if (this.mCronetEngine != null) {
            return true;
        }
        try {
            Reflect.on(Class.forName(TTNET_INIT_CLASS).newInstance()).call(PRE_CNIT_KETNEL_FUNC);
            AbstractC0759g cronetEngine = CronetClient.getCronetEngine();
            this.mCronetEngine = cronetEngine;
            return cronetEngine != null;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public void command(String str, String str2) {
        y yVar = this.mTTNetMpaService;
        if (yVar != null) {
            yVar.a(str, str2);
        }
    }

    public void init(com.bytedance.frameworks.baselib.network.http.cronet.c.a aVar) {
        if (!createMpaService()) {
            aVar.a(false, "Create MpaService Failed");
        } else {
            this.mOuterInitCallback = aVar;
            this.mTTNetMpaService.b(this.mCronetInitCallback);
        }
    }

    public void setAccAddress(List<String> list, com.bytedance.frameworks.baselib.network.http.cronet.c.a aVar) {
        if (this.mTTNetMpaService == null) {
            if (aVar != null) {
                aVar.a(false, "TTNetMpaService is null");
                return;
            }
            return;
        }
        synchronized (CronetMpaServiceImpl.class) {
            if (this.mOuterAccAddressCallback != null) {
                if (aVar != null) {
                    aVar.a(false, "setAccAddress is running");
                }
            } else {
                this.mOuterAccAddressCallback = aVar;
                this.mTTNetMpaService.c(list, this.mCronetAccAddressCallback);
            }
        }
    }

    public void start() {
        y yVar = this.mTTNetMpaService;
        if (yVar != null) {
            yVar.d();
        }
    }

    public void stop() {
        y yVar = this.mTTNetMpaService;
        if (yVar != null) {
            yVar.e();
        }
    }
}
