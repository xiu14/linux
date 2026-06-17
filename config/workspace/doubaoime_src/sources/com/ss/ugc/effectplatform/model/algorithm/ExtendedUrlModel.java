package com.ss.ugc.effectplatform.model.algorithm;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.f;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class ExtendedUrlModel {
    private String uri;
    private List<String> url_list;
    private List<String> zip_url_list;

    public ExtendedUrlModel() {
        this(null, null, null, 7, null);
    }

    public ExtendedUrlModel(List<String> list, String str, List<String> list2) {
        l.g(list, "url_list");
        l.g(list2, "zip_url_list");
        this.url_list = list;
        this.uri = str;
        this.zip_url_list = list2;
    }

    public String getUri() {
        return this.uri;
    }

    public final List<String> getUrl(FetchModelType fetchModelType) {
        l.g(fetchModelType, "type");
        int ordinal = fetchModelType.ordinal();
        if (ordinal == 0) {
            return getUrl_list();
        }
        if (ordinal == 1) {
            return getZip_url_list();
        }
        throw new f();
    }

    public List<String> getUrl_list() {
        return this.url_list;
    }

    public List<String> getZip_url_list() {
        return this.zip_url_list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrl_list(List<String> list) {
        l.g(list, "<set-?>");
        this.url_list = list;
    }

    public void setZip_url_list(List<String> list) {
        l.g(list, "<set-?>");
        this.zip_url_list = list;
    }

    public /* synthetic */ ExtendedUrlModel(List list, String str, List list2, int i, g gVar) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? new ArrayList() : list2);
    }
}
