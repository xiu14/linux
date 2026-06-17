package com.bytedance.ttnet;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.A;
import com.bytedance.retrofit2.R.E;
import com.bytedance.retrofit2.R.G;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.InterfaceC0693d;
import com.bytedance.retrofit2.R.InterfaceC0695f;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.R.h;
import com.bytedance.retrofit2.R.l;
import com.bytedance.retrofit2.R.o;
import com.bytedance.retrofit2.R.q;
import com.bytedance.retrofit2.R.t;
import com.bytedance.retrofit2.R.w;
import com.bytedance.retrofit2.mime.i;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface INetworkApi {
    @h
    InterfaceC0701e<String> doGet(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);

    @h
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> doGetBytes(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);

    @t
    @InterfaceC0696g
    InterfaceC0701e<String> doPost(@o int i, @G String str, @A Map<String, String> map, @InterfaceC0695f(encode = true) Map<String, String> map2, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);

    @h
    @E
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> downloadFile(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map);

    @h
    @E
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> downloadFile(@InterfaceC0690a boolean z, @o int i, @G String str, @A(encode = true) Map<String, String> map, @l List<com.bytedance.retrofit2.client.b> list, @InterfaceC0693d Object obj);

    @t
    InterfaceC0701e<String> postBody(@o int i, @G String str, @A(encode = true) Map<String, String> map, @InterfaceC0691b i iVar, @l List<com.bytedance.retrofit2.client.b> list);

    @t
    @q
    InterfaceC0701e<String> postMultiPart(@o int i, @G String str, @A(encode = true) Map<String, String> map, @w Map<String, i> map2, @l List<com.bytedance.retrofit2.client.b> list);
}
