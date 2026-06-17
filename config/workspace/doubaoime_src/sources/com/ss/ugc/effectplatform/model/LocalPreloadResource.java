package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class LocalPreloadResource {
    private final String key;
    private final String uri;

    public LocalPreloadResource(String str, String str2) {
        l.g(str, "key");
        l.g(str2, "uri");
        this.key = str;
        this.uri = str2;
    }

    public static /* synthetic */ LocalPreloadResource copy$default(LocalPreloadResource localPreloadResource, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localPreloadResource.key;
        }
        if ((i & 2) != 0) {
            str2 = localPreloadResource.uri;
        }
        return localPreloadResource.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.uri;
    }

    public final LocalPreloadResource copy(String str, String str2) {
        l.g(str, "key");
        l.g(str2, "uri");
        return new LocalPreloadResource(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalPreloadResource)) {
            return false;
        }
        LocalPreloadResource localPreloadResource = (LocalPreloadResource) obj;
        return l.a(this.key, localPreloadResource.key) && l.a(this.uri, localPreloadResource.uri);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.uri;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("LocalPreloadResource(key=");
        M.append(this.key);
        M.append(", uri=");
        return e.a.a.a.a.J(M, this.uri, ")");
    }
}
