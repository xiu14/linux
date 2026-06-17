package com.bytedance.android.input.basic.network;

import com.bytedance.news.common.service.manager.IService;
import com.bytedance.rpc.transport.h;
import com.bytedance.rpc.transport.k;
import e.b.l.p.b;
import e.b.l.p.c;
import java.util.List;

/* loaded from: classes.dex */
public interface NetInterceptorService extends IService {
    List<b> getRpcInterceptors();

    List<c> getRpcInvokeInterceptors();

    List<h> getTransportReqInterceptors();

    List<k> getTransportResultInterceptors();
}
