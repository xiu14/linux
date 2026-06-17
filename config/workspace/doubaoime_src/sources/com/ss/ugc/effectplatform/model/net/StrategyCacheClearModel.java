package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class StrategyCacheClearModel {
    private final List<StrategyCacheClearCmd> management_cmd;

    /* JADX WARN: Multi-variable type inference failed */
    public StrategyCacheClearModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public StrategyCacheClearModel(List<StrategyCacheClearCmd> list) {
        this.management_cmd = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StrategyCacheClearModel copy$default(StrategyCacheClearModel strategyCacheClearModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = strategyCacheClearModel.management_cmd;
        }
        return strategyCacheClearModel.copy(list);
    }

    public final List<StrategyCacheClearCmd> component1() {
        return this.management_cmd;
    }

    public final StrategyCacheClearModel copy(List<StrategyCacheClearCmd> list) {
        return new StrategyCacheClearModel(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StrategyCacheClearModel) && l.a(this.management_cmd, ((StrategyCacheClearModel) obj).management_cmd);
        }
        return true;
    }

    public final List<StrategyCacheClearCmd> getManagement_cmd() {
        return this.management_cmd;
    }

    public int hashCode() {
        List<StrategyCacheClearCmd> list = this.management_cmd;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder M = a.M("StrategyCacheClearModel(management_cmd=");
        M.append(this.management_cmd);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ StrategyCacheClearModel(List list, int i, g gVar) {
        this((i & 1) != 0 ? null : list);
    }
}
