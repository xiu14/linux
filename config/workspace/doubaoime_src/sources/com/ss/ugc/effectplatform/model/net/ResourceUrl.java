package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class ResourceUrl {
    private String backup_url;
    private String main_url;
    private String oid;
    private Long url_expire;

    public ResourceUrl() {
        this(null, null, null, null, 15, null);
    }

    public ResourceUrl(String str, String str2, String str3, Long l) {
        this.oid = str;
        this.main_url = str2;
        this.backup_url = str3;
        this.url_expire = l;
    }

    public String getBackup_url() {
        return this.backup_url;
    }

    public String getMain_url() {
        return this.main_url;
    }

    public String getOid() {
        return this.oid;
    }

    public Long getUrl_expire() {
        return this.url_expire;
    }

    public void setBackup_url(String str) {
        this.backup_url = str;
    }

    public void setMain_url(String str) {
        this.main_url = str;
    }

    public void setOid(String str) {
        this.oid = str;
    }

    public void setUrl_expire(Long l) {
        this.url_expire = l;
    }

    public /* synthetic */ ResourceUrl(String str, String str2, String str3, Long l, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l);
    }
}
