package com.bytedance.article.common.network;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.G;
import com.bytedance.retrofit2.R.InterfaceC0690a;
import com.bytedance.retrofit2.R.InterfaceC0691b;
import com.bytedance.retrofit2.R.InterfaceC0695f;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.R.h;
import com.bytedance.retrofit2.R.l;
import com.bytedance.retrofit2.R.o;
import com.bytedance.retrofit2.R.t;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.i;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface ICommonApi {
    @h
    InterfaceC0701e<String> get(@o int i, @G String str, @l List<b> list, @InterfaceC0690a boolean z);

    @t
    InterfaceC0701e<String> postData(@o int i, @G String str, @InterfaceC0691b i iVar, @l List<b> list, @InterfaceC0690a boolean z);

    @t
    InterfaceC0701e<com.bytedance.retrofit2.mime.h> postDataStream(@o int i, @G String str, @InterfaceC0691b i iVar, @l List<b> list, @InterfaceC0690a boolean z);

    @t
    @InterfaceC0696g
    InterfaceC0701e<String> postForm(@o int i, @G String str, @InterfaceC0695f(encode = true) Map<String, String> map, @l List<b> list, @InterfaceC0690a boolean z);
}
