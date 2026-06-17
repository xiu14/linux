package com.bytedance.tools.codelocator.processer;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import e.b.m.a.a.b;
import e.b.m.a.a.c;
import e.b.m.a.a.d;
import e.b.m.a.a.e;
import e.b.m.a.a.f;
import e.b.m.a.b.a;
import java.io.File;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface ICodeLocatorProcessor {
    void processActivity(c cVar, Context context);

    void processApplication(d dVar, Context context);

    void processFile(e eVar, File file);

    @Nullable
    a processIntentAction(Context context, b bVar, String str);

    void processView(f fVar, View view);

    @Nullable
    List<String> providerRegisterAction();
}
