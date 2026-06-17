package com.bytedance.frameworks.baselib.network.http.parser;

import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes.dex */
public enum CacheControlParser$Directive {
    MAXAGE,
    MAXSTALE,
    MINFRESH,
    NOCACHE,
    NOSTORE,
    NOTRANSFORM,
    ONLYIFCACHED,
    MUSTREVALIDATE,
    PRIVATE,
    PROXYREVALIDATE,
    PUBLIC,
    SMAXAGE,
    UNKNOWN;

    public static CacheControlParser$Directive select(String str) {
        try {
            return valueOf(str.toUpperCase().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }
}
