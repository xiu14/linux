package com.bytedance.android.input.common_biz.init.task;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.common.praise_dialog.g;
import com.bytedance.lego.init.model.d;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ImePraiseDialogInitializer extends d {
    @Override // java.lang.Runnable
    public void run() {
        IAppGlobals.a aVar = IAppGlobals.a;
        aVar.j("init_task", "ImePraiseDialogInitializer [init]");
        g gVar = g.a;
        Objects.requireNonNull(aVar);
        g.a(aVar.getApplication());
    }
}
