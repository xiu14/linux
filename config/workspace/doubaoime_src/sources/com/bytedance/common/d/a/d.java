package com.bytedance.common.d.a;

import com.bytedance.common.model.ProcessEnum;
import java.util.List;

/* loaded from: classes.dex */
public interface d {
    String getMethodName();

    String onMethodCall(ProcessEnum processEnum, List list);
}
