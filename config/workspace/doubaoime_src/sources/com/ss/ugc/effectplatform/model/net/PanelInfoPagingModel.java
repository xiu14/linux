package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class PanelInfoPagingModel {
    private CategoryEffectListResponse categoryEffectsResponse;
    private PanelInfoResponse panelInfoResponse;

    public PanelInfoPagingModel(PanelInfoResponse panelInfoResponse, CategoryEffectListResponse categoryEffectListResponse) {
        CategoryPageModel data;
        CategoryPageModel.Extra extra;
        String rec_id;
        PanelInfoModel data2;
        CategoryPageModel data3;
        List<String> url_prefix;
        PanelInfoResponse panelInfoResponse2;
        PanelInfoModel data4;
        PanelInfoModel data5;
        CategoryPageModel data6;
        this.panelInfoResponse = panelInfoResponse;
        this.categoryEffectsResponse = categoryEffectListResponse;
        if (panelInfoResponse != null && (data5 = panelInfoResponse.getData()) != null) {
            CategoryEffectListResponse categoryEffectListResponse2 = this.categoryEffectsResponse;
            data5.setCategory_effects((categoryEffectListResponse2 == null || (data6 = categoryEffectListResponse2.getData()) == null) ? null : data6.getCategory_effects());
        }
        CategoryEffectListResponse categoryEffectListResponse3 = this.categoryEffectsResponse;
        if (categoryEffectListResponse3 != null && (data3 = categoryEffectListResponse3.getData()) != null && (url_prefix = data3.getUrl_prefix()) != null && (panelInfoResponse2 = this.panelInfoResponse) != null && (data4 = panelInfoResponse2.getData()) != null) {
            data4.setUrl_prefix(url_prefix);
        }
        CategoryEffectListResponse categoryEffectListResponse4 = this.categoryEffectsResponse;
        if (categoryEffectListResponse4 == null || (data = categoryEffectListResponse4.getData()) == null || (extra = data.getExtra()) == null || (rec_id = extra.getRec_id()) == null) {
            return;
        }
        PanelInfoModel.Extra extra2 = new PanelInfoModel.Extra();
        extra2.setRec_id(rec_id);
        PanelInfoResponse panelInfoResponse3 = this.panelInfoResponse;
        if (panelInfoResponse3 == null || (data2 = panelInfoResponse3.getData()) == null) {
            return;
        }
        data2.setExtra(extra2);
    }

    public final CategoryEffectListResponse getCategoryEffectsResponse() {
        return this.categoryEffectsResponse;
    }

    public final PanelInfoModel getPanelInfo() {
        PanelInfoResponse panelInfoResponse = this.panelInfoResponse;
        if (panelInfoResponse != null) {
            return panelInfoResponse.getData();
        }
        return null;
    }

    public final PanelInfoResponse getPanelInfoResponse() {
        return this.panelInfoResponse;
    }

    public final void setCategoryEffectsResponse(CategoryEffectListResponse categoryEffectListResponse) {
        this.categoryEffectsResponse = categoryEffectListResponse;
    }

    public final void setPanelInfoResponse(PanelInfoResponse panelInfoResponse) {
        this.panelInfoResponse = panelInfoResponse;
    }
}
