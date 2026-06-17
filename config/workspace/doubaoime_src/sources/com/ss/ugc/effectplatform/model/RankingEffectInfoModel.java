package com.ss.ugc.effectplatform.model;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class RankingEffectInfoModel {
    private String designer_name;
    private Effect effect;
    private RankingEffectModel ranking_info;
    private SimpleVideoInfo[] simple_video_info;

    public RankingEffectInfoModel() {
        this(null, null, null, null, 15, null);
    }

    public RankingEffectInfoModel(Effect effect, SimpleVideoInfo[] simpleVideoInfoArr, String str, RankingEffectModel rankingEffectModel) {
        l.g(str, "designer_name");
        this.effect = effect;
        this.simple_video_info = simpleVideoInfoArr;
        this.designer_name = str;
        this.ranking_info = rankingEffectModel;
    }

    public String getDesigner_name() {
        return this.designer_name;
    }

    public Effect getEffect() {
        return this.effect;
    }

    public RankingEffectModel getRanking_info() {
        return this.ranking_info;
    }

    public SimpleVideoInfo[] getSimple_video_info() {
        return this.simple_video_info;
    }

    public void setDesigner_name(String str) {
        l.g(str, "<set-?>");
        this.designer_name = str;
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setRanking_info(RankingEffectModel rankingEffectModel) {
        this.ranking_info = rankingEffectModel;
    }

    public void setSimple_video_info(SimpleVideoInfo[] simpleVideoInfoArr) {
        this.simple_video_info = simpleVideoInfoArr;
    }

    public String toString() {
        String str;
        StringBuilder M = e.a.a.a.a.M("RankingEffectInfoModel(effect=");
        M.append(getEffect());
        M.append(", simple_video_info=");
        SimpleVideoInfo[] simple_video_info = getSimple_video_info();
        if (simple_video_info != null) {
            str = Arrays.toString(simple_video_info);
            l.b(str, "java.util.Arrays.toString(this)");
        } else {
            str = null;
        }
        M.append(str);
        M.append(", designer_name='");
        M.append(getDesigner_name());
        M.append("', ranking_info=");
        M.append(getRanking_info());
        M.append(')');
        return M.toString();
    }

    public /* synthetic */ RankingEffectInfoModel(Effect effect, SimpleVideoInfo[] simpleVideoInfoArr, String str, RankingEffectModel rankingEffectModel, int i, g gVar) {
        this((i & 1) != 0 ? null : effect, (i & 2) != 0 ? null : simpleVideoInfoArr, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? null : rankingEffectModel);
    }
}
