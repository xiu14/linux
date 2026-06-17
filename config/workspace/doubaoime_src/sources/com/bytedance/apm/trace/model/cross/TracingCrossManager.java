package com.bytedance.apm.trace.model.cross;

import androidx.annotation.Keep;
import com.bytedance.apm.trace.api.b;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Keep
/* loaded from: classes.dex */
public class TracingCrossManager {
    private static Map<Long, b> sCrossTracingContext = new ConcurrentHashMap();

    public static void onPassBackAsChild(String str, String str2, ArrayList<NativeSpan> arrayList) {
        b bVar = sCrossTracingContext.get(Long.valueOf(Long.parseLong(str)));
        if (bVar != null) {
            sCrossTracingContext.remove(Long.valueOf(Long.parseLong(str)));
            synchronized (bVar) {
            }
        }
    }

    @Keep
    public static void onPassBackAsReference(String str, String str2, ArrayList<NativeSpan> arrayList) {
        b bVar = sCrossTracingContext.get(Long.valueOf(Long.parseLong(str)));
        if (bVar != null) {
            sCrossTracingContext.remove(Long.valueOf(Long.parseLong(str)));
            synchronized (bVar) {
            }
        }
    }

    public static void registerCross(long j, b bVar) {
        sCrossTracingContext.put(Long.valueOf(j), bVar);
    }

    public static void unRegisterCross(long j) {
        sCrossTracingContext.remove(Long.valueOf(j));
    }
}
