package com.bytedance.android.input.basic.settings.impl;

import com.bytedance.retrofit2.InterfaceC0701e;
import com.bytedance.retrofit2.R.t;

/* loaded from: classes.dex */
public interface IRequest {
    @t("/service/settings/v3/")
    InterfaceC0701e<String> getSettings();
}
