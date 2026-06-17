package com.bytedance.rpc.transport.ttnet;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.A;
import com.bytedance.retrofit2.R.E;
import com.bytedance.retrofit2.R.G;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.InterfaceC0693d;
import com.bytedance.retrofit2.R.InterfaceC0695f;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.R.l;
import com.bytedance.retrofit2.R.t;
import com.bytedance.retrofit2.mime.h;
import com.bytedance.retrofit2.mime.i;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
interface RetrofitApi {
    @t
    @InterfaceC0696g
    @E
    InterfaceC0701e<h> form(@InterfaceC0690a boolean z, @G String str, @A Map<String, String> map, @InterfaceC0695f(encode = true) Map<String, String> map2, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);

    @com.bytedance.retrofit2.R.h
    @E
    InterfaceC0701e<h> get(@InterfaceC0690a boolean z, @G String str, @A(encode = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);

    @t
    @E
    InterfaceC0701e<h> post(@InterfaceC0690a boolean z, @G String str, @A Map<String, String> map, @InterfaceC0691b i iVar, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);
}
