package com.heytap.mcssdk.c;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.heytap.mcssdk.PushService;
import com.heytap.mcssdk.constant.c;
import com.heytap.mcssdk.constant.d;
import com.heytap.mcssdk.utils.e;
import com.heytap.msp.push.HeytapPushManager;
import com.heytap.msp.push.constant.ConfigConstant;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.NotificationSortMessage;
import com.heytap.msp.push.notification.ISortListener;
import com.heytap.msp.push.notification.PushNotification;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    private int f6880c;

    /* renamed from: d, reason: collision with root package name */
    private int f6881d;

    /* renamed from: f, reason: collision with root package name */
    private int f6883f;

    /* renamed from: g, reason: collision with root package name */
    private int f6884g;
    private StatusBarNotification h;
    private int a = 3;
    private List<NotificationSortMessage> b = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private List<String> f6882e = new ArrayList();

    private static class a {
        private static final b a = new b();

        private a() {
        }
    }

    private int a(List<NotificationSortMessage> list, int i) {
        int size = list == null ? 0 : list.size();
        if (i <= 0 || size == 0) {
            return i;
        }
        if (size < i) {
            int i2 = i - size;
            list.clear();
            return i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            list.remove((size - 1) - i3);
        }
        return 0;
    }

    public static b a() {
        return a.a;
    }

    private DataMessage a(Context context, NotificationSortMessage notificationSortMessage) {
        DataMessage dataMessage = new DataMessage(context.getPackageName(), notificationSortMessage.getMessageId());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(d.b.a, "false");
            String statisticData = notificationSortMessage.getStatisticData();
            if (!TextUtils.isEmpty(statisticData)) {
                jSONObject.put(d.b.b, statisticData);
            }
            dataMessage.setStatisticsExtra(jSONObject.toString());
        } catch (JSONException unused) {
        }
        return dataMessage;
    }

    private void a(int i) {
        if (i == 7) {
            this.f6880c++;
        } else if (i == 5) {
            this.f6881d++;
        }
    }

    private void a(NotificationManager notificationManager, Context context, int i) {
        a(com.heytap.mcssdk.c.a.a(notificationManager, context.getPackageName()), i);
    }

    private void a(Context context, NotificationManager notificationManager, int i) {
        a(this.b, i);
        a(context, notificationManager, this.b);
    }

    private void a(Context context, NotificationManager notificationManager, List<NotificationSortMessage> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        a(context, notificationManager, jSONArray, list, arrayList);
        if (jSONArray.length() != 0) {
            try {
                jSONObject.put(d.b.f6903c, jSONArray);
                HeytapPushManager.cancelNotification(jSONObject);
            } catch (JSONException unused) {
            }
        }
        if (arrayList.size() != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put(c.a.f6901d, arrayList);
            StatisticUtils.statisticEvent(context, hashMap);
        }
    }

    private void a(Context context, NotificationManager notificationManager, JSONArray jSONArray, List<NotificationSortMessage> list, List<DataMessage> list2) {
        for (NotificationSortMessage notificationSortMessage : list) {
            if (notificationSortMessage.isMcs()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("EXTRA_MESSAGE_ID", notificationSortMessage.getMessageId());
                    jSONObject.put(ConfigConstant.NotificationSort.EXTRA_NOTIFY_ID, notificationSortMessage.getNotifyId());
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                list2.add(a(context, notificationSortMessage));
                this.f6882e.add(notificationSortMessage.getMessageId());
            }
            notificationManager.cancel(notificationSortMessage.getNotifyId());
        }
    }

    private void a(NotificationSortMessage notificationSortMessage) {
        if (notificationSortMessage.getAutoDelete() != 1) {
            return;
        }
        if (this.b.size() != 0) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                NotificationSortMessage notificationSortMessage2 = this.b.get(size);
                if (notificationSortMessage.getImportantLevel() >= notificationSortMessage2.getImportantLevel() && notificationSortMessage.getPostTime() >= notificationSortMessage2.getPostTime()) {
                    this.b.add(size + 1, notificationSortMessage2);
                    return;
                }
            }
        }
        this.b.add(0, notificationSortMessage);
    }

    private void a(ISortListener iSortListener, boolean z, PushNotification.Builder builder) {
        if (iSortListener != null) {
            iSortListener.buildCompleted(z, builder, this.f6882e);
        }
    }

    private void a(PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Bundle bundle = new Bundle();
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, notificationSortMessage.getAutoDelete());
        bundle.putInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, notificationSortMessage.getImportantLevel());
        bundle.putString("EXTRA_MESSAGE_ID", notificationSortMessage.getMessageId());
        bundle.putLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, System.currentTimeMillis());
        bundle.putBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, false);
        bundle.putString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA, notificationSortMessage.getStatisticData());
        builder.addExtras(bundle);
        builder.setGroup(notificationSortMessage.getGroup());
    }

    private void a(StatusBarNotification[] statusBarNotificationArr, int i) {
        b();
        if (statusBarNotificationArr != null && statusBarNotificationArr.length != 0) {
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                Bundle bundle = statusBarNotification.getNotification().extras;
                boolean z = bundle.getBoolean(ConfigConstant.NotificationSort.EXTRA_IS_MCS, true);
                long j = bundle.getLong(ConfigConstant.NotificationSort.EXTRA_POST_TIME, statusBarNotification.getPostTime());
                String string = bundle.getString("EXTRA_MESSAGE_ID", "");
                int i2 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_AUTO_DELETE, 1);
                int i3 = bundle.getInt(ConfigConstant.NotificationSort.EXTRA_IMPORTANT_LEVEL, 5);
                String string2 = bundle.getString(ConfigConstant.NotificationSort.EXTRA_STATISTIC_DATA);
                int id = statusBarNotification.getId();
                if (i == id) {
                    this.h = statusBarNotification;
                    return;
                }
                NotificationSortMessage notificationSortMessage = new NotificationSortMessage(string, i3, i2, z, j, id, string2);
                b(i2);
                a(i3);
                a(notificationSortMessage);
            }
        }
        if (e.g()) {
            StringBuilder M = e.a.a.a.a.M("initParams : notDelete:");
            M.append(this.f6884g);
            M.append(" canDelete : ");
            M.append(this.f6883f);
            M.append('\n');
            M.append(" highSize : ");
            M.append(this.f6880c);
            M.append(" normalSize :");
            M.append(this.f6881d);
            M.append('\n');
            e.b(M.toString());
            e.b("canDeleteList size : " + this.b.size());
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                NotificationSortMessage notificationSortMessage2 = this.b.get(i4);
                StringBuilder N = e.a.a.a.a.N("第", i4, "条消息 messageId : ");
                N.append(notificationSortMessage2.getMessageId());
                N.append(" importanceLevel : ");
                N.append(notificationSortMessage2.getImportantLevel());
                N.append(" autoDelete : ");
                N.append(notificationSortMessage2.getAutoDelete());
                N.append(" notifyId: ");
                N.append(notificationSortMessage2.getNotifyId());
                N.append(" postTime:");
                N.append(notificationSortMessage2.getPostTime());
                e.b(N.toString());
            }
        }
    }

    private boolean a(NotificationManager notificationManager, Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        if (e.g()) {
            StringBuilder M = e.a.a.a.a.M("dealCurrentMessage : deleteNumber");
            M.append(this.f6883f + this.f6884g);
            M.append(" keepNumber : ");
            M.append(this.a);
            e.b(M.toString());
        }
        boolean z = true;
        if (this.f6883f + this.f6884g < this.a) {
            StringBuilder M2 = notificationSortMessage.getAutoDelete() == -1 ? e.a.a.a.a.M(d.a.b) : e.a.a.a.a.M(d.a.f6902c);
            M2.append(context.getPackageName());
            notificationSortMessage.setGroup(M2.toString());
        } else if (notificationSortMessage.getAutoDelete() == -1) {
            StringBuilder M3 = e.a.a.a.a.M(d.a.b);
            M3.append(context.getPackageName());
            notificationSortMessage.setGroup(M3.toString());
            int i = this.a - this.f6884g;
            if (e.g()) {
                e.b("dealCurrentMessage : allowDelete :" + i);
            }
            if (i > 0) {
                a(context, notificationManager, i - 1);
            } else {
                Notification a2 = com.heytap.mcssdk.c.a.a(context, notificationSortMessage.getGroup(), builder);
                if (a2 != null) {
                    notificationManager.notify(4096, a2);
                }
            }
        } else {
            z = a(context, notificationManager, notificationSortMessage);
        }
        if (e.g()) {
            e.b("dealCurrentMessage : needPost :" + z);
        }
        if (z) {
            a(builder, notificationSortMessage);
        } else {
            com.heytap.mcssdk.f.a.a(context, c.a.f6900c, a(context, notificationSortMessage));
        }
        return z;
    }

    private boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage) {
        int i = this.f6884g;
        int i2 = this.a;
        boolean z = false;
        if (i >= i2) {
            return false;
        }
        int i3 = i2 - i;
        if (e.g()) {
            e.b("judgeShowCurrentMessage : allowDelete" + i3);
        }
        if (notificationSortMessage.getImportantLevel() == 7 || (notificationSortMessage.getImportantLevel() != 5 ? this.f6880c + this.f6881d < i3 : this.f6880c < i3)) {
            z = true;
        }
        if (z) {
            a(context, notificationManager, i3 - 1);
        }
        return z;
    }

    private boolean a(Context context, PushNotification.Builder builder, NotificationSortMessage notificationSortMessage) {
        Notification notification;
        StringBuilder sb;
        String str;
        int verifyNotifyId = builder.getVerifyNotifyId();
        StatusBarNotification statusBarNotification = this.h;
        if (statusBarNotification == null || verifyNotifyId == -1 || (notification = statusBarNotification.getNotification()) == null) {
            return false;
        }
        if (notificationSortMessage.getAutoDelete() == 1) {
            sb = new StringBuilder();
            str = d.a.f6902c;
        } else {
            sb = new StringBuilder();
            str = d.a.b;
        }
        sb.append(str);
        sb.append(context.getPackageName());
        notificationSortMessage.setGroup(sb.toString());
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("EXTRA_MESSAGE_ID", "");
        a(builder, notificationSortMessage);
        this.f6882e.add(string);
        return true;
    }

    private boolean a(PushNotification.Builder builder, int i, int i2, String str, String str2) {
        Context context = PushService.getInstance().getContext();
        if (builder == null || context == null) {
            return false;
        }
        NotificationManager a2 = com.heytap.mcssdk.c.a.a(context);
        NotificationSortMessage notificationSortMessage = new NotificationSortMessage(str, i2, i, false, System.currentTimeMillis(), str2);
        if (!a(context, a2, notificationSortMessage, builder)) {
            return true;
        }
        a(a2, context, builder.getVerifyNotifyId());
        if (a(context, builder, notificationSortMessage)) {
            return true;
        }
        return a(a2, context, builder, notificationSortMessage);
    }

    private void b() {
        this.f6883f = 0;
        this.f6884g = 0;
        this.f6880c = 0;
        this.f6881d = 0;
        this.b.clear();
        this.f6882e.clear();
        this.h = null;
    }

    private void b(int i) {
        if (i == -1) {
            this.f6884g++;
        } else if (i == 1) {
            this.f6883f++;
        }
    }

    public void a(PushNotification.Builder builder, ISortListener iSortListener) {
        if (builder == null) {
            return;
        }
        a(iSortListener, a(builder, builder.getAutoDelete(), builder.getImportantLevel(), builder.getMessageId(), builder.getStatisticData()), builder);
    }

    public boolean a(Context context, NotificationManager notificationManager, NotificationSortMessage notificationSortMessage, PushNotification.Builder builder) {
        if (notificationSortMessage.getAutoDelete() == 0 || Build.VERSION.SDK_INT >= 30) {
            return false;
        }
        if (!com.heytap.mcssdk.c.a.a(notificationManager, context.getPackageName(), 4096)) {
            return true;
        }
        StringBuilder M = e.a.a.a.a.M(d.a.b);
        M.append(context.getPackageName());
        notificationSortMessage.setGroup(M.toString());
        a(builder, notificationSortMessage);
        return false;
    }
}
