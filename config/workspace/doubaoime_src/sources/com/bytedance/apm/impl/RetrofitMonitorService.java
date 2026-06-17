package com.bytedance.apm.impl;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.A;
import com.bytedance.retrofit2.R.G;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.h;
import com.bytedance.retrofit2.R.l;
import com.bytedance.retrofit2.R.q;
import com.bytedance.retrofit2.R.t;
import com.bytedance.retrofit2.R.w;
import com.bytedance.retrofit2.mime.i;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface RetrofitMonitorService {
    @h
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> fetch(@G String str, @A Map<String, String> map, @InterfaceC0690a boolean z);

    @t
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> report(@G String str, @InterfaceC0691b i iVar, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0690a boolean z);

    @t
    @q
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> uploadFiles(@G String str, @w Map<String, i> map, @l List<com.bytedance.retrofit2.client.b> list);
}
