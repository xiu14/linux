package com.ss.ugc.effectplatform.task;

import androidx.annotation.Keep;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StrategyCacheClearTask$CacheInfo {
    public static final a Companion = new a(null);
    private final String key;
    private final String last_time;

    public static final class a {
        public a(kotlin.s.c.g gVar) {
        }
    }

    public StrategyCacheClearTask$CacheInfo(String str, String str2) {
        l.g(str, "key");
        l.g(str2, "last_time");
        this.key = str;
        this.last_time = str2;
    }

    public static /* synthetic */ StrategyCacheClearTask$CacheInfo copy$default(StrategyCacheClearTask$CacheInfo strategyCacheClearTask$CacheInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = strategyCacheClearTask$CacheInfo.key;
        }
        if ((i & 2) != 0) {
            str2 = strategyCacheClearTask$CacheInfo.last_time;
        }
        return strategyCacheClearTask$CacheInfo.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.last_time;
    }

    public final StrategyCacheClearTask$CacheInfo copy(String str, String str2) {
        l.g(str, "key");
        l.g(str2, "last_time");
        return new StrategyCacheClearTask$CacheInfo(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StrategyCacheClearTask$CacheInfo)) {
            return false;
        }
        StrategyCacheClearTask$CacheInfo strategyCacheClearTask$CacheInfo = (StrategyCacheClearTask$CacheInfo) obj;
        return l.a(this.key, strategyCacheClearTask$CacheInfo.key) && l.a(this.last_time, strategyCacheClearTask$CacheInfo.last_time);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLast_time() {
        return this.last_time;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.last_time;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CacheInfo(key=");
        M.append(this.key);
        M.append(", last_time=");
        return e.a.a.a.a.J(M, this.last_time, ")");
    }
}
