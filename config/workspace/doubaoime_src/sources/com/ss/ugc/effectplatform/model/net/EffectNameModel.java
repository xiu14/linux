package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class EffectNameModel {
    private String name;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectNameModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public EffectNameModel(String str) {
        this.name = str;
    }

    public static /* synthetic */ EffectNameModel copy$default(EffectNameModel effectNameModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectNameModel.name;
        }
        return effectNameModel.copy(str);
    }

    public final String component1() {
        return this.name;
    }

    public final EffectNameModel copy(String str) {
        return new EffectNameModel(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EffectNameModel) && l.a(this.name, ((EffectNameModel) obj).name);
        }
        return true;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return a.J(a.M("EffectNameModel(name="), this.name, ")");
    }

    public /* synthetic */ EffectNameModel(String str, int i, g gVar) {
        this((i & 1) != 0 ? null : str);
    }
}
