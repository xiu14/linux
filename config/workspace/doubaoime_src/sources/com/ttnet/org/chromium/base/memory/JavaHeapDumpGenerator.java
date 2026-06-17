package com.ttnet.org.chromium.base.memory;

import android.os.Debug;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.d;
import e.a.a.a.a;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    @CalledByNative
    public static boolean generateHprof(String str) {
        try {
            Debug.dumpHprofData(str);
            return true;
        } catch (IOException e2) {
            StringBuilder U = a.U("Error writing to file ", str, ". Error: ");
            U.append(e2.getMessage());
            d.d("JavaHprofGenerator", U.toString(), new Object[0]);
            return false;
        }
    }
}
