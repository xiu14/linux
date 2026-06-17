package com.bytedance.ttnet.cronet;

import com.bytedance.common.utility.Logger;
import java.util.HashMap;
import java.util.Observable;

/* loaded from: classes2.dex */
public class a extends Observable {
    private static volatile a a;

    public static a a() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = new a();
                }
            }
        }
        return a;
    }

    public void b(String str, String str2, String str3, String str4, String str5, String str6) {
        if (Logger.debug()) {
            StringBuilder W = e.a.a.a.a.W("onStoreIdcChanged idc: ", str, " region: ", str2, " source: ");
            e.a.a.a.a.M0(W, str3, " sec_uid:", str5, " logid:");
            e.a.a.a.a.I0(W, str6, "CronetDataStorageAccess");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("store_idc", str);
        hashMap.put("store_region", str2);
        hashMap.put("region_source", str3);
        hashMap.put("region_legacy_user", str4);
        hashMap.put("sec_uid", str5);
        hashMap.put("logid", str6);
        setChanged();
        notifyObservers(hashMap);
    }
}
