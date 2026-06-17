package org.chromium.wschannel;

import java.util.HashMap;
import java.util.Observable;

/* loaded from: classes2.dex */
public class d extends Observable {
    private static volatile d a;

    public static d a() {
        if (a == null) {
            synchronized (d.class) {
                if (a == null) {
                    a = new d();
                }
            }
        }
        return a;
    }

    public void b(String str, long j, long j2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j));
        hashMap.put("received_bytes", Long.valueOf(j2));
        hashMap.put("is_heartbeat_frame", Boolean.valueOf(z));
        setChanged();
        notifyObservers(hashMap);
    }
}
