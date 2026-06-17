package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import com.ss.ugc.effectplatform.model.e;
import e.a.a.a.a;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class ResourceListResponse extends e<ResourceListModel> {
    private ResourceListModel data;
    private String message;
    private int status_code;

    public ResourceListResponse() {
        this(null, null, 0, 7, null);
    }

    public ResourceListResponse(ResourceListModel resourceListModel, String str, int i) {
        this.data = resourceListModel;
        this.message = str;
        this.status_code = i;
    }

    private final ResourceListModel component1() {
        return this.data;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ ResourceListResponse copy$default(ResourceListResponse resourceListResponse, ResourceListModel resourceListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceListModel = resourceListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = resourceListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = resourceListResponse.status_code;
        }
        return resourceListResponse.copy(resourceListModel, str, i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        ResourceListModel resourceListModel = this.data;
        return (resourceListModel == null || resourceListModel.getResource_list() == null) ? false : true;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ResourceListResponse copy(ResourceListModel resourceListModel, String str, int i) {
        return new ResourceListResponse(resourceListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceListResponse)) {
            return false;
        }
        ResourceListResponse resourceListResponse = (ResourceListResponse) obj;
        return l.a(this.data, resourceListResponse.data) && l.a(this.message, resourceListResponse.message) && this.status_code == resourceListResponse.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public int hashCode() {
        ResourceListModel resourceListModel = this.data;
        int hashCode = (resourceListModel != null ? resourceListModel.hashCode() : 0) * 31;
        String str = this.message;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public String toString() {
        StringBuilder M = a.M("ResourceListResponse(data=");
        M.append(this.data);
        M.append(", message=");
        M.append(this.message);
        M.append(", status_code=");
        return a.D(M, this.status_code, ")");
    }

    public /* synthetic */ ResourceListResponse(ResourceListModel resourceListModel, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : resourceListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public ResourceListModel getResponseData() {
        return this.data;
    }
}
