package com.heytap.mcssdk.e;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.IDataMessageCallBackService;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.statis.StatisticUtils;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class b implements c {
    private static final int a = 1;

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, DataMessage dataMessage) {
        if (context == null) {
            e.b("context is null");
            return;
        }
        StringBuilder M = e.a.a.a.a.M("Receive revokeMessage  extra : ");
        M.append(dataMessage.getStatisticsExtra());
        M.append("notifyId :");
        M.append(dataMessage.getNotifyID());
        M.append("messageId : ");
        M.append(dataMessage.getTaskID());
        e.b(M.toString());
        ((NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION)).cancel(dataMessage.getNotifyID());
        b(context, dataMessage);
    }

    private void b(Context context, DataMessage dataMessage) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(dataMessage);
        hashMap.put(dataMessage.getEventId(), arrayList);
        StatisticUtils.statisticEvent(context, hashMap);
    }

    @Override // com.heytap.mcssdk.e.c
    public void a(final Context context, Intent intent, BaseMode baseMode, final IDataMessageCallBackService iDataMessageCallBackService) {
        if (baseMode != null && baseMode.getType() == 4103) {
            final DataMessage dataMessage = (DataMessage) baseMode;
            if (iDataMessageCallBackService != null) {
                i.b(new Runnable() { // from class: com.heytap.mcssdk.e.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (dataMessage.getMsgCommand() == 1) {
                            b.this.a(context, dataMessage);
                        } else {
                            iDataMessageCallBackService.processMessage(context, dataMessage);
                        }
                    }
                });
            }
        }
    }
}
