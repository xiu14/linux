package com.huawei.hms.framework.common.hianalytics;

import com.vivo.push.PushClient;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public class LinkedHashMapPack {
    private LinkedHashMap<String, String> map = new LinkedHashMap<>();

    public LinkedHashMap<String, String> getAll() {
        return this.map;
    }

    public LinkedHashMapPack put(String str, String str2) {
        if (str != null && str2 != null) {
            this.map.put(str, str2);
        }
        return this;
    }

    public LinkedHashMapPack putIfNotDefault(String str, long j, long j2) {
        return j == j2 ? this : put(str, j);
    }

    public LinkedHashMapPack put(String str, boolean z) {
        if (str != null) {
            if (z) {
                this.map.put(str, PushClient.DEFAULT_REQUEST_ID);
            } else {
                this.map.put(str, "0");
            }
        }
        return this;
    }

    public LinkedHashMapPack put(String str, long j) {
        if (str != null) {
            this.map.put(str, "" + j);
        }
        return this;
    }
}
