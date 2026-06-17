package com.bytedance.android.input.network.utils;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.A;
import com.bytedance.retrofit2.R.E;
import com.bytedance.retrofit2.R.G;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.InterfaceC0695f;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.R.h;
import com.bytedance.retrofit2.R.l;
import com.bytedance.retrofit2.R.o;
import com.bytedance.retrofit2.R.t;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface INetworkProxyApi {
    @h
    @E
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> get(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @InterfaceC0696g
    @E
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> postByForm(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map, @InterfaceC0695f Map<String, ? extends Object> map2, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @E
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> postByJson(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map, @InterfaceC0691b Map<String, ? extends Object> map2, @l List<com.bytedance.retrofit2.client.b> list);
}
