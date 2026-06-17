package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class DeleteCmd {
    private List<String> busi_key_list;
    private List<String> resource_key_list;

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteCmd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public DeleteCmd(List<String> list, List<String> list2) {
        this.busi_key_list = list;
        this.resource_key_list = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeleteCmd copy$default(DeleteCmd deleteCmd, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = deleteCmd.busi_key_list;
        }
        if ((i & 2) != 0) {
            list2 = deleteCmd.resource_key_list;
        }
        return deleteCmd.copy(list, list2);
    }

    public final List<String> component1() {
        return this.busi_key_list;
    }

    public final List<String> component2() {
        return this.resource_key_list;
    }

    public final DeleteCmd copy(List<String> list, List<String> list2) {
        return new DeleteCmd(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteCmd)) {
            return false;
        }
        DeleteCmd deleteCmd = (DeleteCmd) obj;
        return l.a(this.busi_key_list, deleteCmd.busi_key_list) && l.a(this.resource_key_list, deleteCmd.resource_key_list);
    }

    public final List<String> getBusi_key_list() {
        return this.busi_key_list;
    }

    public final List<String> getResource_key_list() {
        return this.resource_key_list;
    }

    public int hashCode() {
        List<String> list = this.busi_key_list;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.resource_key_list;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setBusi_key_list(List<String> list) {
        this.busi_key_list = list;
    }

    public final void setResource_key_list(List<String> list) {
        this.resource_key_list = list;
    }

    public String toString() {
        StringBuilder M = a.M("DeleteCmd(busi_key_list=");
        M.append(this.busi_key_list);
        M.append(", resource_key_list=");
        M.append(this.resource_key_list);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ DeleteCmd(List list, List list2, int i, g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }
}
