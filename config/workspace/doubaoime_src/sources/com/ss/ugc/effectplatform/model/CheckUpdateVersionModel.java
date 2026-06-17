package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class CheckUpdateVersionModel {
    private String cursor;
    private String sorting_position;
    private String version;

    public CheckUpdateVersionModel() {
        this(null, null, null, 7, null);
    }

    public CheckUpdateVersionModel(String str, String str2, String str3) {
        this.version = str;
        this.cursor = str2;
        this.sorting_position = str3;
    }

    public String getCursor() {
        return this.cursor;
    }

    public String getSorting_position() {
        return this.sorting_position;
    }

    public String getVersion() {
        return this.version;
    }

    public void setCursor(String str) {
        this.cursor = str;
    }

    public void setSorting_position(String str) {
        this.sorting_position = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public /* synthetic */ CheckUpdateVersionModel(String str, String str2, String str3, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
