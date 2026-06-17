package com.bytedance.push.Y;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.push.PushBody;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class b implements a {
    private final Map<Long, Pair<PushBody, Integer>> a = new ConcurrentHashMap();

    @Override // com.bytedance.push.Y.a
    public PushBody r(long j) {
        Pair<PushBody, Integer> pair = this.a.get(Long.valueOf(j));
        if (pair != null) {
            return (PushBody) pair.first;
        }
        return null;
    }

    @Override // com.bytedance.push.Y.a
    public int t(PushBody pushBody) {
        Pair<PushBody, Integer> pair;
        if (pushBody == null || (pair = this.a.get(Long.valueOf(pushBody.b))) == null) {
            return 0;
        }
        return ((Integer) pair.second).intValue();
    }

    @Override // com.bytedance.push.Y.a
    public boolean v(String str) {
        Object obj;
        Iterator<Map.Entry<Long, Pair<PushBody, Integer>>> it2 = this.a.entrySet().iterator();
        while (it2.hasNext()) {
            Pair<PushBody, Integer> value = it2.next().getValue();
            if (value != null && (obj = value.first) != null && TextUtils.equals(((PushBody) obj).k.toString(), str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.push.Y.a
    public void w(PushBody pushBody, int i) {
        this.a.put(Long.valueOf(pushBody.b), new Pair<>(pushBody, Integer.valueOf(i)));
    }
}
