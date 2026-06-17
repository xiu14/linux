package com.ttnet.org.chromium.net.impl;

import java.time.Duration;

/* loaded from: classes2.dex */
public abstract class CronetLogger {

    public enum CronetSource {
        CRONET_SOURCE_UNSPECIFIED,
        CRONET_SOURCE_STATICALLY_LINKED,
        CRONET_SOURCE_PLAY_SERVICES,
        CRONET_SOURCE_FALLBACK
    }

    public static class a {
        public a(CronetEngineBuilderImpl cronetEngineBuilderImpl) {
            cronetEngineBuilderImpl.G0();
        }
    }

    public static class b {
        public b(long j, long j2, long j3, long j4, int i, Duration duration, Duration duration2, String str, boolean z, boolean z2) {
        }
    }

    public static class c {
        private final int a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8666c;

        /* renamed from: d, reason: collision with root package name */
        private final int f8667d;

        public c(String str) {
            String[] split = str.split("\\.");
            this.a = Integer.parseInt(split[0]);
            this.b = Integer.parseInt(split[1]);
            this.f8666c = Integer.parseInt(split[2]);
            this.f8667d = Integer.parseInt(split[3]);
        }

        public String toString() {
            StringBuilder M = e.a.a.a.a.M("");
            M.append(this.a);
            M.append(".");
            M.append(this.b);
            M.append(".");
            M.append(this.f8666c);
            M.append(".");
            M.append(this.f8667d);
            return M.toString();
        }
    }

    public abstract void a(int i, a aVar, c cVar, CronetSource cronetSource);

    public abstract void b(int i, b bVar);
}
