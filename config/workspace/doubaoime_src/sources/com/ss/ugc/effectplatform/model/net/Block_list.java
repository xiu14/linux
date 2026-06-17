package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class Block_list {
    private long block_end;
    private long block_start;
    private String uri;

    public Block_list() {
        this(null, 0L, 0L, 7, null);
    }

    public Block_list(String str, long j, long j2) {
        this.uri = str;
        this.block_start = j;
        this.block_end = j2;
    }

    public static /* synthetic */ Block_list copy$default(Block_list block_list, String str, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = block_list.uri;
        }
        if ((i & 2) != 0) {
            j = block_list.block_start;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = block_list.block_end;
        }
        return block_list.copy(str, j3, j2);
    }

    public final String component1() {
        return this.uri;
    }

    public final long component2() {
        return this.block_start;
    }

    public final long component3() {
        return this.block_end;
    }

    public final Block_list copy(String str, long j, long j2) {
        return new Block_list(str, j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Block_list)) {
            return false;
        }
        Block_list block_list = (Block_list) obj;
        return l.a(this.uri, block_list.uri) && this.block_start == block_list.block_start && this.block_end == block_list.block_end;
    }

    public final long getBlock_end() {
        return this.block_end;
    }

    public final long getBlock_start() {
        return this.block_start;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.block_start;
        int i = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.block_end;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final void setBlock_end(long j) {
        this.block_end = j;
    }

    public final void setBlock_start(long j) {
        this.block_start = j;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public String toString() {
        StringBuilder M = a.M("Block_list(uri=");
        M.append(this.uri);
        M.append(", block_start=");
        M.append(this.block_start);
        M.append(", block_end=");
        return a.F(M, this.block_end, ")");
    }

    public /* synthetic */ Block_list(String str, long j, long j2, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}
