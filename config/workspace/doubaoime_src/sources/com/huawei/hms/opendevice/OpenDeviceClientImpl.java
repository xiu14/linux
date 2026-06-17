package com.huawei.hms.opendevice;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.api.entity.opendevice.HuaweiOpendeviceNaming;
import com.huawei.hms.support.api.opendevice.OdidResult;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.JsonUtil;

/* loaded from: classes2.dex */
public class OpenDeviceClientImpl extends HuaweiApi<OpenDeviceOptions> implements OpenDeviceClient {
    private static final OpenDeviceHmsClientBuilder a = new OpenDeviceHmsClientBuilder();
    private static final Api<OpenDeviceOptions> b = new Api<>(HuaweiApiAvailability.HMS_API_NAME_OD);

    /* renamed from: c, reason: collision with root package name */
    private static OpenDeviceOptions f7406c = new OpenDeviceOptions();

    OpenDeviceClientImpl(Context context) {
        super(context, b, f7406c, a);
        super.setKitSdkVersion(61300300);
    }

    @Override // com.huawei.hms.opendevice.OpenDeviceClient
    public com.huawei.d.a.f<OdidResult> getOdid() {
        return doWrite(new OpenDeviceTaskApiCall(HuaweiOpendeviceNaming.GET_ODID, JsonUtil.createJsonString(null), HiAnalyticsClient.reportEntry(getContext(), HuaweiOpendeviceNaming.GET_ODID, 61300300)));
    }
}
