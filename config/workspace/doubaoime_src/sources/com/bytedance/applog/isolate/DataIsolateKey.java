package com.bytedance.applog.isolate;

/* loaded from: classes.dex */
public enum DataIsolateKey {
    USER_ID("user_id");

    private final String key;

    DataIsolateKey(String str) {
        this.key = str;
    }

    public static DataIsolateKey fromKey(String str) {
        DataIsolateKey[] values = values();
        for (int i = 0; i < 1; i++) {
            DataIsolateKey dataIsolateKey = values[i];
            if (dataIsolateKey.getKey().equals(str)) {
                return dataIsolateKey;
            }
        }
        return null;
    }

    public String getKey() {
        return this.key;
    }
}
