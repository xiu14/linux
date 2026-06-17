package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DnsResult implements Serializable {
    public List<String> a = new ArrayList();
    public List<String> b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public Source f5162c = Source.HTTPDNS_CACHE;

    public enum Source {
        UNKNOWN,
        HTTPDNS_CACHE,
        HTTPDNS_STALE_CACHE,
        HTTPDNS_REQUEST,
        LOCALDNS_REQUEST,
        LOCALDNS_CACHE,
        HARDCODE_IPS
    }
}
