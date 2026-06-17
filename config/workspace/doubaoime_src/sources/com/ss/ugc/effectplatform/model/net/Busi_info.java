package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public final class Busi_info {
    private long net_speed_limit;

    public Busi_info() {
        this(0L, 1, null);
    }

    public Busi_info(long j) {
        this.net_speed_limit = j;
    }

    public static /* synthetic */ Busi_info copy$default(Busi_info busi_info, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = busi_info.net_speed_limit;
        }
        return busi_info.copy(j);
    }

    public final long component1() {
        return this.net_speed_limit;
    }

    public final Busi_info copy(long j) {
        return new Busi_info(j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Busi_info) && this.net_speed_limit == ((Busi_info) obj).net_speed_limit;
        }
        return true;
    }

    public final long getNet_speed_limit() {
        return this.net_speed_limit;
    }

    public int hashCode() {
        long j = this.net_speed_limit;
        return (int) (j ^ (j >>> 32));
    }

    public final void setNet_speed_limit(long j) {
        this.net_speed_limit = j;
    }

    public String toString() {
        return a.F(a.M("Busi_info(net_speed_limit="), this.net_speed_limit, ")");
    }

    public /* synthetic */ Busi_info(long j, int i, g gVar) {
        this((i & 1) != 0 ? 0L : j);
    }
}
