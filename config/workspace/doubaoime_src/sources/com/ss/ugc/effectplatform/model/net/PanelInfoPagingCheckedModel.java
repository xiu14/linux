package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class PanelInfoPagingCheckedModel {
    private CategoryEffectListResponse categoryEffectsResponse;
    private PanelInfoCheckedResponse panelInfoResponse;

    public PanelInfoPagingCheckedModel(PanelInfoCheckedResponse panelInfoCheckedResponse, CategoryEffectListResponse categoryEffectListResponse) {
        CategoryPageModel data;
        CategoryPageModel.Extra extra;
        String rec_id;
        PanelInfoModel data2;
        CategoryPageModel data3;
        List<String> url_prefix;
        PanelInfoCheckedResponse panelInfoCheckedResponse2;
        PanelInfoModel data4;
        PanelInfoModel data5;
        CategoryPageModel data6;
        this.panelInfoResponse = panelInfoCheckedResponse;
        this.categoryEffectsResponse = categoryEffectListResponse;
        if (panelInfoCheckedResponse != null && (data5 = panelInfoCheckedResponse.getData()) != null) {
            CategoryEffectListResponse categoryEffectListResponse2 = this.categoryEffectsResponse;
            data5.setCategory_effects((categoryEffectListResponse2 == null || (data6 = categoryEffectListResponse2.getData()) == null) ? null : data6.getCategory_effects());
        }
        CategoryEffectListResponse categoryEffectListResponse3 = this.categoryEffectsResponse;
        if (categoryEffectListResponse3 != null && (data3 = categoryEffectListResponse3.getData()) != null && (url_prefix = data3.getUrl_prefix()) != null && (panelInfoCheckedResponse2 = this.panelInfoResponse) != null && (data4 = panelInfoCheckedResponse2.getData()) != null) {
            data4.setUrl_prefix(url_prefix);
        }
        CategoryEffectListResponse categoryEffectListResponse4 = this.categoryEffectsResponse;
        if (categoryEffectListResponse4 == null || (data = categoryEffectListResponse4.getData()) == null || (extra = data.getExtra()) == null || (rec_id = extra.getRec_id()) == null) {
            return;
        }
        PanelInfoModel.Extra extra2 = new PanelInfoModel.Extra();
        extra2.setRec_id(rec_id);
        PanelInfoCheckedResponse panelInfoCheckedResponse3 = this.panelInfoResponse;
        if (panelInfoCheckedResponse3 == null || (data2 = panelInfoCheckedResponse3.getData()) == null) {
            return;
        }
        data2.setExtra(extra2);
    }

    public final CategoryEffectListResponse getCategoryEffectsResponse() {
        return this.categoryEffectsResponse;
    }

    public final PanelInfoModel getPanelInfo() {
        PanelInfoCheckedResponse panelInfoCheckedResponse = this.panelInfoResponse;
        if (panelInfoCheckedResponse != null) {
            return panelInfoCheckedResponse.getData();
        }
        return null;
    }

    public final PanelInfoCheckedResponse getPanelInfoResponse() {
        return this.panelInfoResponse;
    }

    public final void setCategoryEffectsResponse(CategoryEffectListResponse categoryEffectListResponse) {
        this.categoryEffectsResponse = categoryEffectListResponse;
    }

    public final void setPanelInfoResponse(PanelInfoCheckedResponse panelInfoCheckedResponse) {
        this.panelInfoResponse = panelInfoCheckedResponse;
    }
}
