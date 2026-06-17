package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.e;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class ConvertOidToUrlResponse extends e<ConvertOidToUrlResponse> {
    private int status_code;
    private String status_msg;
    private List<? extends ResourceUrl> url_list;

    public ConvertOidToUrlResponse() {
        this(null, 0, null, 7, null);
    }

    public /* synthetic */ ConvertOidToUrlResponse(List list, int i, String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public ConvertOidToUrlResponse getResponseData() {
        return this;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return getStatus_msg();
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return getStatus_code();
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public String getStatus_msg() {
        return this.status_msg;
    }

    public List<ResourceUrl> getUrl_list() {
        return this.url_list;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setStatus_msg(String str) {
        this.status_msg = str;
    }

    public void setUrl_list(List<? extends ResourceUrl> list) {
        this.url_list = list;
    }

    public ConvertOidToUrlResponse(List<? extends ResourceUrl> list, int i, String str) {
        this.url_list = list;
        this.status_code = i;
        this.status_msg = str;
    }
}
