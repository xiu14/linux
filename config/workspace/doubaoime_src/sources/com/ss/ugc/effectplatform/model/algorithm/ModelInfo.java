package com.ss.ugc.effectplatform.model.algorithm;

import androidx.annotation.Keep;
import kotlin.s.c.g;
import kotlin.s.c.l;
import kotlin.text.a;

@Keep
/* loaded from: classes2.dex */
public class ModelInfo {
    private String _name;
    private ExtendedUrlModel file_url;
    private String name;
    private String name_sec;
    private int status;
    private long totalSize;
    private int type;
    private String version;

    public ModelInfo() {
        this(null, null, null, null, 0L, 0, 0, 127, null);
    }

    public ModelInfo(String str, String str2, String str3, ExtendedUrlModel extendedUrlModel, long j, int i, int i2) {
        l.g(str, "_name");
        l.g(str2, "name_sec");
        l.g(str3, "version");
        this._name = str;
        this.name_sec = str2;
        this.version = str3;
        this.file_url = extendedUrlModel;
        this.totalSize = j;
        this.type = i;
        this.status = i2;
        this.name = "";
    }

    public ExtendedUrlModel getFile_url() {
        return this.file_url;
    }

    public String getName() {
        if (a.s(this._name) && (!a.s(getName_sec()))) {
            this._name = "";
        }
        return a.s(this._name) ? this.name : this._name;
    }

    public String getName_sec() {
        return this.name_sec;
    }

    public int getStatus() {
        return this.status;
    }

    public long getTotalSize() {
        return this.totalSize;
    }

    public int getType() {
        return this.type;
    }

    public String getVersion() {
        return this.version;
    }

    public void setFile_url(ExtendedUrlModel extendedUrlModel) {
        this.file_url = extendedUrlModel;
    }

    public void setName(String str) {
        l.g(str, "<set-?>");
        this.name = str;
    }

    public void setName_sec(String str) {
        l.g(str, "<set-?>");
        this.name_sec = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setTotalSize(long j) {
        this.totalSize = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersion(String str) {
        l.g(str, "<set-?>");
        this.version = str;
    }

    public /* synthetic */ ModelInfo(String str, String str2, String str3, ExtendedUrlModel extendedUrlModel, long j, int i, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) == 0 ? str3 : "", (i3 & 8) != 0 ? null : extendedUrlModel, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 1 : i2);
    }
}
