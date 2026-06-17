package com.ss.ugc.effectplatform.task;

import androidx.annotation.Keep;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
final class FetchCategoryPagingEffectTask$CategoryVersion {
    private final int cursor;
    private final int sorting_position;
    private final String version;

    public FetchCategoryPagingEffectTask$CategoryVersion(String str, int i, int i2) {
        l.g(str, "version");
        this.version = str;
        this.cursor = i;
        this.sorting_position = i2;
    }

    public static /* synthetic */ FetchCategoryPagingEffectTask$CategoryVersion copy$default(FetchCategoryPagingEffectTask$CategoryVersion fetchCategoryPagingEffectTask$CategoryVersion, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = fetchCategoryPagingEffectTask$CategoryVersion.version;
        }
        if ((i3 & 2) != 0) {
            i = fetchCategoryPagingEffectTask$CategoryVersion.cursor;
        }
        if ((i3 & 4) != 0) {
            i2 = fetchCategoryPagingEffectTask$CategoryVersion.sorting_position;
        }
        return fetchCategoryPagingEffectTask$CategoryVersion.copy(str, i, i2);
    }

    public final String component1() {
        return this.version;
    }

    public final int component2() {
        return this.cursor;
    }

    public final int component3() {
        return this.sorting_position;
    }

    public final FetchCategoryPagingEffectTask$CategoryVersion copy(String str, int i, int i2) {
        l.g(str, "version");
        return new FetchCategoryPagingEffectTask$CategoryVersion(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchCategoryPagingEffectTask$CategoryVersion)) {
            return false;
        }
        FetchCategoryPagingEffectTask$CategoryVersion fetchCategoryPagingEffectTask$CategoryVersion = (FetchCategoryPagingEffectTask$CategoryVersion) obj;
        return l.a(this.version, fetchCategoryPagingEffectTask$CategoryVersion.version) && this.cursor == fetchCategoryPagingEffectTask$CategoryVersion.cursor && this.sorting_position == fetchCategoryPagingEffectTask$CategoryVersion.sorting_position;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int getSorting_position() {
        return this.sorting_position;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.cursor) * 31) + this.sorting_position;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("CategoryVersion(version=");
        M.append(this.version);
        M.append(", cursor=");
        M.append(this.cursor);
        M.append(", sorting_position=");
        return e.a.a.a.a.D(M, this.sorting_position, ")");
    }
}
