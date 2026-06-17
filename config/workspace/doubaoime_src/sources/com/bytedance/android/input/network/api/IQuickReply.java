package com.bytedance.android.input.network.api;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.InterfaceC0694e;
import com.bytedance.retrofit2.R.InterfaceC0696g;
import com.bytedance.retrofit2.R.t;
import java.util.List;

/* loaded from: classes.dex */
public interface IQuickReply {
    @t("/api/v1/quick_reply")
    @InterfaceC0696g
    InterfaceC0701e<String> request(@InterfaceC0694e("context") List<String> list);
}
