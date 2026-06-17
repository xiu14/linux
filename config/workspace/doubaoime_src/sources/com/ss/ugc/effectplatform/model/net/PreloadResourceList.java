package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import e.a.a.a.a;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public final class PreloadResourceList {
    private String block_file_type;
    private List<Block_list> block_list;
    private List<String> cdn_prefix_list;
    private String download_type;
    private String key;
    private String level;
    private String name;
    private String type;
    private String uri;
    private String version;

    public PreloadResourceList(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, List<Block_list> list2) {
        l.g(str, "key");
        l.g(str2, "name");
        l.g(str5, "type");
        l.g(str6, "uri");
        l.g(list, "cdn_prefix_list");
        l.g(str7, "download_type");
        l.g(str8, "block_file_type");
        this.key = str;
        this.name = str2;
        this.version = str3;
        this.level = str4;
        this.type = str5;
        this.uri = str6;
        this.cdn_prefix_list = list;
        this.download_type = str7;
        this.block_file_type = str8;
        this.block_list = list2;
    }

    public final String component1() {
        return this.key;
    }

    public final List<Block_list> component10() {
        return this.block_list;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.version;
    }

    public final String component4() {
        return this.level;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.uri;
    }

    public final List<String> component7() {
        return this.cdn_prefix_list;
    }

    public final String component8() {
        return this.download_type;
    }

    public final String component9() {
        return this.block_file_type;
    }

    public final PreloadResourceList copy(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, String str7, String str8, List<Block_list> list2) {
        l.g(str, "key");
        l.g(str2, "name");
        l.g(str5, "type");
        l.g(str6, "uri");
        l.g(list, "cdn_prefix_list");
        l.g(str7, "download_type");
        l.g(str8, "block_file_type");
        return new PreloadResourceList(str, str2, str3, str4, str5, str6, list, str7, str8, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreloadResourceList)) {
            return false;
        }
        PreloadResourceList preloadResourceList = (PreloadResourceList) obj;
        return l.a(this.key, preloadResourceList.key) && l.a(this.name, preloadResourceList.name) && l.a(this.version, preloadResourceList.version) && l.a(this.level, preloadResourceList.level) && l.a(this.type, preloadResourceList.type) && l.a(this.uri, preloadResourceList.uri) && l.a(this.cdn_prefix_list, preloadResourceList.cdn_prefix_list) && l.a(this.download_type, preloadResourceList.download_type) && l.a(this.block_file_type, preloadResourceList.block_file_type) && l.a(this.block_list, preloadResourceList.block_list);
    }

    public final String getBlock_file_type() {
        return this.block_file_type;
    }

    public final List<Block_list> getBlock_list() {
        return this.block_list;
    }

    public final List<String> getCdn_prefix_list() {
        return this.cdn_prefix_list;
    }

    public final String getDownload_type() {
        return this.download_type;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLevel() {
        return this.level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.key;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.version;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.level;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.type;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.uri;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        List<String> list = this.cdn_prefix_list;
        int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
        String str7 = this.download_type;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.block_file_type;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        List<Block_list> list2 = this.block_list;
        return hashCode9 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setBlock_file_type(String str) {
        l.g(str, "<set-?>");
        this.block_file_type = str;
    }

    public final void setBlock_list(List<Block_list> list) {
        this.block_list = list;
    }

    public final void setCdn_prefix_list(List<String> list) {
        l.g(list, "<set-?>");
        this.cdn_prefix_list = list;
    }

    public final void setDownload_type(String str) {
        l.g(str, "<set-?>");
        this.download_type = str;
    }

    public final void setKey(String str) {
        l.g(str, "<set-?>");
        this.key = str;
    }

    public final void setLevel(String str) {
        this.level = str;
    }

    public final void setName(String str) {
        l.g(str, "<set-?>");
        this.name = str;
    }

    public final void setType(String str) {
        l.g(str, "<set-?>");
        this.type = str;
    }

    public final void setUri(String str) {
        l.g(str, "<set-?>");
        this.uri = str;
    }

    public final void setVersion(String str) {
        this.version = str;
    }

    public String toString() {
        StringBuilder M = a.M("PreloadResourceList(key=");
        M.append(this.key);
        M.append(", name=");
        M.append(this.name);
        M.append(", version=");
        M.append(this.version);
        M.append(", level=");
        M.append(this.level);
        M.append(", type=");
        M.append(this.type);
        M.append(", uri=");
        M.append(this.uri);
        M.append(", cdn_prefix_list=");
        M.append(this.cdn_prefix_list);
        M.append(", download_type=");
        M.append(this.download_type);
        M.append(", block_file_type=");
        M.append(this.block_file_type);
        M.append(", block_list=");
        M.append(this.block_list);
        M.append(")");
        return M.toString();
    }

    public /* synthetic */ PreloadResourceList(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, List list2, int i, g gVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, str6, list, str7, str8, (i & 512) != 0 ? null : list2);
    }
}
