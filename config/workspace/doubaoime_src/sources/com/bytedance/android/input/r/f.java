package com.bytedance.android.input.r;

import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.memory.e.a;
import com.bytedance.tailor.Tailor;
import java.io.File;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements a.b {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    public final boolean a(File file) {
        j jVar = j.f3013f;
        try {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            aVar.j("AlogHelper", "[MemoryAnalysis] path:${resultFile!!.absolutePath}");
            Tailor.dumpHprofData(file.getAbsolutePath(), true);
            return true;
        } catch (Exception e2) {
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            StringBuilder sb = new StringBuilder();
            sb.append("[MemoryAnalysis] ex: ");
            e.a.a.a.a.d0(e2, sb, aVar2, "AlogHelper");
            return false;
        }
    }
}
