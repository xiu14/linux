package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.s.c.g;

@Keep
/* loaded from: classes2.dex */
public class RankingDesignerInfoModel {
    private String designer_encrypted_id;
    private String designer_id;
    private Integer effect_count;
    private List<? extends Effect> effects;
    private Integer follow_status;
    private Integer following_count;
    private String name;
    private UrlModel ranking_url;
    private UrlModel small_icon_url;

    public RankingDesignerInfoModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, Integer num, Integer num2, Integer num3, List<? extends Effect> list) {
        this.designer_id = str;
        this.designer_encrypted_id = str2;
        this.name = str3;
        this.small_icon_url = urlModel;
        this.ranking_url = urlModel2;
        this.follow_status = num;
        this.following_count = num2;
        this.effect_count = num3;
        this.effects = list;
    }

    public String getDesigner_encrypted_id() {
        return this.designer_encrypted_id;
    }

    public String getDesigner_id() {
        return this.designer_id;
    }

    public Integer getEffect_count() {
        return this.effect_count;
    }

    public List<Effect> getEffects() {
        return this.effects;
    }

    public Integer getFollow_status() {
        return this.follow_status;
    }

    public Integer getFollowing_count() {
        return this.following_count;
    }

    public String getName() {
        return this.name;
    }

    public UrlModel getRanking_url() {
        return this.ranking_url;
    }

    public UrlModel getSmall_icon_url() {
        return this.small_icon_url;
    }

    public void setDesigner_encrypted_id(String str) {
        this.designer_encrypted_id = str;
    }

    public void setDesigner_id(String str) {
        this.designer_id = str;
    }

    public void setEffect_count(Integer num) {
        this.effect_count = num;
    }

    public void setEffects(List<? extends Effect> list) {
        this.effects = list;
    }

    public void setFollow_status(Integer num) {
        this.follow_status = num;
    }

    public void setFollowing_count(Integer num) {
        this.following_count = num;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRanking_url(UrlModel urlModel) {
        this.ranking_url = urlModel;
    }

    public void setSmall_icon_url(UrlModel urlModel) {
        this.small_icon_url = urlModel;
    }

    public String toString() {
        StringBuilder M = e.a.a.a.a.M("RankingDesignerInfoModel(designer_id=");
        M.append(getDesigner_id());
        M.append(", designer_encrypted_id=");
        M.append(getDesigner_encrypted_id());
        M.append(", name=");
        M.append(getName());
        M.append(", small_icon_url=");
        M.append(getSmall_icon_url());
        M.append(", ranking_url=");
        M.append(getRanking_url());
        M.append(", follow_status=");
        M.append(getFollow_status());
        M.append(", following_count=");
        M.append(getFollowing_count());
        M.append(", effect_count=");
        M.append(getEffect_count());
        M.append(", effects=");
        M.append(getEffects());
        M.append(')');
        return M.toString();
    }

    public /* synthetic */ RankingDesignerInfoModel(String str, String str2, String str3, UrlModel urlModel, UrlModel urlModel2, Integer num, Integer num2, Integer num3, List list, int i, g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel, (i & 16) != 0 ? new UrlModel(null, null, null, null, 15, null) : urlModel2, num, num2, num3, (i & 256) != 0 ? null : list);
    }
}
