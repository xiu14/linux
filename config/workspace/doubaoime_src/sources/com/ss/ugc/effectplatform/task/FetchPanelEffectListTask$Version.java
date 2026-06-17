package com.ss.ugc.effectplatform.task;

import androidx.annotation.Keep;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class FetchPanelEffectListTask$Version {
    private String version;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchPanelEffectListTask$Version() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public FetchPanelEffectListTask$Version(String str) {
        this.version = str;
    }

    public static /* synthetic */ FetchPanelEffectListTask$Version copy$default(FetchPanelEffectListTask$Version fetchPanelEffectListTask$Version, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fetchPanelEffectListTask$Version.version;
        }
        return fetchPanelEffectListTask$Version.copy(str);
    }

    public final String component1() {
        return this.version;
    }

    public final FetchPanelEffectListTask$Version copy(String str) {
        return new FetchPanelEffectListTask$Version(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FetchPanelEffectListTask$Version) && l.a(this.version, ((FetchPanelEffectListTask$Version) obj).version);
        }
        return true;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.version;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        return e.a.a.a.a.J(e.a.a.a.a.M("Version(version="), this.version, ")");
    }

    public /* synthetic */ FetchPanelEffectListTask$Version(String str, int i, kotlin.s.c.g gVar) {
        this((i & 1) != 0 ? "0" : str);
    }
}
