package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.message.log.PushLog;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class FetchHotEffectResponse extends e<FetchHotEffectResponse> {
    private Data data;
    private boolean isFromCache;
    private String message;
    private int status_code;

    @Keep
    public static class Data {
        private final CategoryEffectModel category_effects;
        private final Extra extra;
        private List<String> url_prefix;

        public Data() {
            this(null, null, null, 7, null);
        }

        public Data(CategoryEffectModel categoryEffectModel, Extra extra, List<String> list) {
            l.g(categoryEffectModel, "category_effects");
            l.g(list, "url_prefix");
            this.category_effects = categoryEffectModel;
            this.extra = extra;
            this.url_prefix = list;
        }

        public List<Effect> getCollection() {
            return this.category_effects.getCollection();
        }

        public List<Effect> getEffects() {
            return this.category_effects.getCategory_effects();
        }

        public String getRecId() {
            Extra extra = this.extra;
            if (extra != null) {
                return extra.getRec_id();
            }
            return null;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setCollection(List<? extends Effect> list) {
            l.g(list, PushLog.KEY_VALUE);
            this.category_effects.setCollection(list);
        }

        public void setEffects(List<? extends Effect> list) {
            l.g(list, PushLog.KEY_VALUE);
            this.category_effects.setCategory_effects(list);
        }

        public void setRecId(String str) {
            Extra extra = this.extra;
            if (extra != null) {
                extra.setRec_id(str);
            }
        }

        public void setUrl_prefix(List<String> list) {
            l.g(list, "<set-?>");
            this.url_prefix = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ Data(CategoryEffectModel categoryEffectModel, Extra extra, List list, int i, g gVar) {
            this((i & 1) != 0 ? new CategoryEffectModel(null, null, false, 0, 0, null, null, null, 255, null) : categoryEffectModel, (i & 2) != 0 ? new Extra(null, 1, 0 == true ? 1 : 0) : extra, (i & 4) != 0 ? new ArrayList() : list);
        }
    }

    @Keep
    public static class Extra {
        private String rec_id;

        /* JADX WARN: Multi-variable type inference failed */
        public Extra() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public Extra(String str) {
            this.rec_id = str;
        }

        public String getRec_id() {
            return this.rec_id;
        }

        public void setRec_id(String str) {
            this.rec_id = str;
        }

        public /* synthetic */ Extra(String str, int i, g gVar) {
            this((i & 1) != 0 ? null : str);
        }
    }

    public FetchHotEffectResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ FetchHotEffectResponse(Data data, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? new Data(null, null, null, 7, null) : data, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        List<Effect> effect_list = getEffect_list();
        return effect_list != null && (effect_list.isEmpty() ^ true);
    }

    public final List<Effect> getCollection_list() {
        return getData().getCollection();
    }

    public Data getData() {
        return this.data;
    }

    public final List<Effect> getEffect_list() {
        return getData().getEffects();
    }

    public String getMessage() {
        return this.message;
    }

    public String getRecId() {
        Data data = getData();
        if (data != null) {
            return data.getRecId();
        }
        return null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public FetchHotEffectResponse getResponseData() {
        return this;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public int getStatusCode() {
        return getStatus_code();
    }

    public int getStatus_code() {
        return this.status_code;
    }

    public List<String> getUrlPrefix() {
        return getData().getUrl_prefix();
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    public final void setCollection_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        getData().setCollection(list);
    }

    public void setData(Data data) {
        l.g(data, "<set-?>");
        this.data = data;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        getData().setEffects(list);
    }

    public final void setFromCache(boolean z) {
        this.isFromCache = z;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setRecId(String str) {
        Data data = getData();
        if (data != null) {
            data.setRecId(str);
        }
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setUrlPrefix(List<String> list) {
        l.g(list, PushLog.KEY_VALUE);
        Data data = getData();
        if (data != null) {
            data.setUrl_prefix(list);
        }
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<Effect> effects;
        List<Effect> collection;
        Data data = getData();
        if (data != null && (collection = data.getCollection()) != null) {
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!r.o0((Effect) it2.next())) {
                    return false;
                }
            }
        }
        Data data2 = getData();
        if (data2 == null || (effects = data2.getEffects()) == null) {
            return true;
        }
        Iterator<T> it3 = effects.iterator();
        while (it3.hasNext()) {
            if (!r.o0((Effect) it3.next())) {
                return false;
            }
        }
        return true;
    }

    public FetchHotEffectResponse(Data data, String str, int i) {
        l.g(data, RemoteMessageConst.DATA);
        this.data = data;
        this.message = str;
        this.status_code = i;
    }
}
