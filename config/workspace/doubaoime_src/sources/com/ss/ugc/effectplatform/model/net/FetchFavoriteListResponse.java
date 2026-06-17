package com.ss.ugc.effectplatform.model.net;

import androidx.annotation.Keep;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.prolificinteractive.materialcalendarview.r;
import com.ss.android.message.log.PushLog;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.s.c.g;
import kotlin.s.c.l;

@Keep
/* loaded from: classes2.dex */
public class FetchFavoriteListResponse extends e<FetchFavoriteListResponse> {
    private List<? extends Data> data;
    private String message;
    private int status_code;

    @Keep
    public static class Data {
        private List<? extends Effect> bind_effects;
        private List<? extends Effect> collection;
        private List<? extends Effect> effects;
        private String type;
        private List<String> url_prefix;

        public Data() {
            this(null, null, null, null, null, 31, null);
        }

        public Data(String str, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, List<String> list4) {
            l.g(str, "type");
            l.g(list, "effects");
            l.g(list2, "collection");
            l.g(list3, "bind_effects");
            l.g(list4, "url_prefix");
            this.type = str;
            this.effects = list;
            this.collection = list2;
            this.bind_effects = list3;
            this.url_prefix = list4;
        }

        public List<Effect> getBind_effects() {
            return this.bind_effects;
        }

        public List<Effect> getCollection() {
            return this.collection;
        }

        public List<Effect> getEffects() {
            return this.effects;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setBind_effects(List<? extends Effect> list) {
            l.g(list, "<set-?>");
            this.bind_effects = list;
        }

        public void setCollection(List<? extends Effect> list) {
            l.g(list, "<set-?>");
            this.collection = list;
        }

        public void setEffects(List<? extends Effect> list) {
            l.g(list, "<set-?>");
            this.effects = list;
        }

        public void setType(String str) {
            l.g(str, "<set-?>");
            this.type = str;
        }

        public void setUrl_prefix(List<String> list) {
            l.g(list, "<set-?>");
            this.url_prefix = list;
        }

        public /* synthetic */ Data(String str, List list, List list2, List list3, List list4, int i, g gVar) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new ArrayList() : list3, (i & 16) != 0 ? new ArrayList() : list4);
        }
    }

    public FetchFavoriteListResponse() {
        this(null, null, 0, 7, null);
    }

    public /* synthetic */ FetchFavoriteListResponse(List list, String str, int i, int i2, g gVar) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean checkValue() {
        if (getData() != null) {
            return !r0.isEmpty();
        }
        return false;
    }

    public final List<Effect> getCollection_effects() {
        List<Data> data = getData();
        return data != null ? data.get(0).getCollection() : new ArrayList();
    }

    public List<Data> getData() {
        return this.data;
    }

    public final List<Effect> getEffect_list() {
        List<Data> data = getData();
        return data != null ? data.get(0).getEffects() : new ArrayList();
    }

    public String getMessage() {
        return this.message;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ss.ugc.effectplatform.model.e
    public FetchFavoriteListResponse getResponseData() {
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

    public final void setCollection_effects(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        List<Data> data = getData();
        if (data == null || data.isEmpty()) {
            setData(kotlin.collections.g.c(new Data(null, null, null, null, null, 31, null)));
        }
        getData().get(0).setCollection(list);
    }

    public void setData(List<? extends Data> list) {
        l.g(list, "<set-?>");
        this.data = list;
    }

    public final void setEffect_list(List<? extends Effect> list) {
        l.g(list, PushLog.KEY_VALUE);
        List<Data> data = getData();
        if (data == null || data.isEmpty()) {
            setData(kotlin.collections.g.c(new Data(null, null, null, null, null, 31, null)));
        }
        getData().get(0).setEffects(list);
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    @Override // com.ss.ugc.effectplatform.model.e
    public boolean verifySign() {
        List<Data> data = getData();
        if (data == null) {
            return true;
        }
        for (Data data2 : data) {
            List<Effect> bind_effects = data2.getBind_effects();
            if (bind_effects != null) {
                Iterator<T> it2 = bind_effects.iterator();
                while (it2.hasNext()) {
                    if (!r.o0((Effect) it2.next())) {
                        return false;
                    }
                }
            }
            List<Effect> effects = data2.getEffects();
            if (effects != null) {
                Iterator<T> it3 = effects.iterator();
                while (it3.hasNext()) {
                    if (!r.o0((Effect) it3.next())) {
                        return false;
                    }
                }
            }
            List<Effect> collection = data2.getCollection();
            if (collection != null) {
                Iterator<T> it4 = collection.iterator();
                while (it4.hasNext()) {
                    if (!r.o0((Effect) it4.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public FetchFavoriteListResponse(List<? extends Data> list, String str, int i) {
        l.g(list, RemoteMessageConst.DATA);
        this.data = list;
        this.message = str;
        this.status_code = i;
    }
}
