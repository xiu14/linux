package com.ttnet.org.chromium.net.impl;

import com.ttnet.org.chromium.net.impl.CronetFrontierClient;

/* loaded from: classes2.dex */
public class TTServiceInfo {
    public int a;
    public ServicePriority b = ServicePriority.Low;

    /* renamed from: c, reason: collision with root package name */
    public CronetFrontierClient.d f8731c;

    public enum ServicePriority {
        Low(0),
        Medium(1),
        High(2);

        final int priority;

        ServicePriority(int i) {
            this.priority = i;
        }

        public int getValue() {
            return this.priority;
        }
    }

    public TTServiceInfo(int i, CronetFrontierClient.d dVar) {
        if (i <= 0) {
            throw new IllegalArgumentException("Service identity must be set greater than 0.");
        }
        this.a = i;
        this.f8731c = dVar;
    }
}
