package com.bytedance.android.input.common_biz.init.task;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.network.a;
import com.bytedance.lego.init.model.d;

/* loaded from: classes.dex */
public final class ImeTTNetInitializer extends d {
    @Override // java.lang.Runnable
    public void run() {
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.j("init_task", "ImeTTNetInitializer [init]");
        a aVar2 = a.a;
        aVar.j("ImeNetworkConst", "ImeRpcServiceHelper init");
    }
}
