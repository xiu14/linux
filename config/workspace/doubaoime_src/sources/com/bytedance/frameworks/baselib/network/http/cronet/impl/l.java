package com.bytedance.frameworks.baselib.network.http.cronet.impl;

import com.ss.android.socialbase.downloader.constants.MonitorConstants;
import java.util.HashMap;
import java.util.Observable;

/* loaded from: classes.dex */
public class l extends Observable {
    private static volatile l a;

    public static l a() {
        if (a == null) {
            synchronized (l.class) {
                if (a == null) {
                    a = new l();
                }
            }
        }
        return a;
    }

    public void b(String str, long j, long j2, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("sent_bytes", Long.valueOf(j));
        hashMap.put("received_bytes", Long.valueOf(j2));
        hashMap.put(MonitorConstants.EXTRA_CONTENT_TYPE, str2);
        hashMap.put(MonitorConstants.REQUEST_LOG, str3);
        setChanged();
        notifyObservers(hashMap);
    }
}
