package com.obric.common.upgrade.n;

import android.content.Context;
import java.io.File;
import kotlin.s.c.m;

/* loaded from: classes2.dex */
final class b extends m implements kotlin.s.b.a<File> {
    final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(a aVar) {
        super(0);
        this.a = aVar;
    }

    @Override // kotlin.s.b.a
    public File invoke() {
        Context context;
        context = this.a.a;
        File file = new File(context.getFilesDir(), "upgrade");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
