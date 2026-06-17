package com.bytedance.android.input.basic.network;

import com.bytedance.news.common.service.manager.IService;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public interface NetHostParamService extends IService {
    void addShareConfigHost(List<String> list);

    List<String> boePassHost();

    List<String> boePassPath();

    HashMap<String, Object> getCommonHeaders();

    HashMap<String, String> getCommonUrlParm();

    List<String> getShareTokenList();
}
