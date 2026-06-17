package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PreloadResponseModel {
    private Busi_info busi_info;
    private DeleteCmd delete_cmd;
    private List<PreloadResourceList> preload_resource_list;
    private Long protection_period;

    public PreloadResponseModel() {
        this(null, null, null, null, 15, null);
    }

    public PreloadResponseModel(List<PreloadResourceList> list, DeleteCmd deleteCmd, Busi_info busi_info, Long l) {
        this.preload_resource_list = list;
        this.delete_cmd = deleteCmd;
        this.busi_info = busi_info;
        this.protection_period = l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreloadResponseModel copy$default(PreloadResponseModel preloadResponseModel, List list, DeleteCmd deleteCmd, Busi_info busi_info, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = preloadResponseModel.preload_resource_list;
        }
        if ((i & 2) != 0) {
            deleteCmd = preloadResponseModel.delete_cmd;
        }
        if ((i & 4) != 0) {
            busi_info = preloadResponseModel.busi_info;
        }
        if ((i & 8) != 0) {
            l = preloadResponseModel.protection_period;
        }
        return preloadResponseModel.copy(list, deleteCmd, busi_info, l);
    }

    public final List<PreloadResourceList> component1() {
        return this.preload_resource_list;
    }

    public final DeleteCmd component2() {
        return this.delete_cmd;
    }

    public final Busi_info component3() {
        return this.busi_info;
    }

    public final Long component4() {
        return this.protection_period;
    }

    public final PreloadResponseModel copy(List<PreloadResourceList> list, DeleteCmd deleteCmd, Busi_info busi_info, Long l) {
        return new PreloadResponseModel(list, deleteCmd, busi_info, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadResponseModel)) {
            return false;
        }
        PreloadResponseModel preloadResponseModel = (PreloadResponseModel) obj;
        return l.a(this.preload_resource_list, preloadResponseModel.preload_resource_list) && l.a(this.delete_cmd, preloadResponseModel.delete_cmd) && l.a(this.busi_info, preloadResponseModel.busi_info) && l.a(this.protection_period, preloadResponseModel.protection_period);
    }

    public final Busi_info getBusi_info() {
        return this.busi_info;
    }

    public final DeleteCmd getDelete_cmd() {
        return this.delete_cmd;
    }

    public final List<PreloadResourceList> getPreload_resource_list() {
        return this.preload_resource_list;
    }

    public final Long getProtection_period() {
        return this.protection_period;
    }

    public int hashCode() {
        List<PreloadResourceList> list = this.preload_resource_list;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        DeleteCmd deleteCmd = this.delete_cmd;
        int hashCode2 = (hashCode + (deleteCmd != null ? deleteCmd.hashCode() : 0)) * 31;
        Busi_info busi_info = this.busi_info;
        int hashCode3 = (hashCode2 + (busi_info != null ? busi_info.hashCode() : 0)) * 31;
        Long l = this.protection_period;
        return hashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final void setBusi_info(Busi_info busi_info) {
        this.busi_info = busi_info;
    }

    public final void setDelete_cmd(DeleteCmd deleteCmd) {
        this.delete_cmd = deleteCmd;
    }

    public final void setPreload_resource_list(List<PreloadResourceList> list) {
        this.preload_resource_list = list;
    }

    public final void setProtection_period(Long l) {
        this.protection_period = l;
    }

    public String toString() {
        StringBuilder M = a.M("PreloadResponseModel(preload_resource_list=");
        M.append(this.preload_resource_list);
        M.append(", delete_cmd=");
        M.append(this.delete_cmd);
        M.append(", busi_info=");
        M.append(this.busi_info);
        M.append(", protection_period=");
        M.append(this.protection_period);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ PreloadResponseModel(List list, DeleteCmd deleteCmd, Busi_info busi_info, Long l, int i, g gVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : deleteCmd, (i & 4) != 0 ? null : busi_info, (i & 8) != 0 ? 0L : l);
    }
}
