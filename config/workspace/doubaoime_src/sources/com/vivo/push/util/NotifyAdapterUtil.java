package com.vivo.push.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.vivo.push.h.u;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public class NotifyAdapterUtil {
    private static final String EXTRA_VPUSH_TYPE = "extra_vpush_type";
    private static final int HIDE_TITLE = 1;
    public static final int NOTIFY_MULTITERM_STYLE = 1;
    public static final int NOTIFY_SINGLE_STYLE = 0;
    public static final String PRIMARY_CHANNEL = "vivo_push_channel";
    private static final String PUSH_EN = "PUSH";
    private static final String PUSH_ID = "pushId";
    private static final String PUSH_ZH = "推送通知";
    private static final String TAG = "NotifyManager";
    private static final String USER_ID = "sysUserId";
    private static NotificationManager sNotificationManager = null;
    private static int sNotifyId = 20000000;

    private static boolean cancelNotify(Context context, int i) {
        initAdapter(context);
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager == null) {
            return false;
        }
        notificationManager.cancel(i);
        return true;
    }

    private static synchronized void initAdapter(Context context) {
        synchronized (NotifyAdapterUtil.class) {
            if (sNotificationManager == null) {
                sNotificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            }
            NotificationManager notificationManager = sNotificationManager;
            if (notificationManager != null) {
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel(DownloadSettingKeys.BugFix.DEFAULT);
                if (notificationChannel != null) {
                    CharSequence name = notificationChannel.getName();
                    if (PUSH_ZH.equals(name) || PUSH_EN.equals(name)) {
                        sNotificationManager.deleteNotificationChannel(DownloadSettingKeys.BugFix.DEFAULT);
                    }
                }
                NotificationChannel notificationChannel2 = sNotificationManager.getNotificationChannel(PRIMARY_CHANNEL);
                StringBuilder sb = new StringBuilder("initAdapter PRIMARY_CHANNEL yi exist ？= ");
                sb.append(notificationChannel2 == null);
                sb.append(" 是否支持创建推送通知渠道= ");
                sb.append(com.vivo.push.restructure.a.a().g().e());
                t.c(TAG, sb.toString());
                if (!com.vivo.push.restructure.a.a().g().e() || notificationChannel2 == null) {
                    NotificationChannel notificationChannel3 = new NotificationChannel(PRIMARY_CHANNEL, isZh(context) ? PUSH_ZH : PUSH_EN, 4);
                    notificationChannel3.setLightColor(-16711936);
                    notificationChannel3.enableVibration(true);
                    notificationChannel3.setLockscreenVisibility(1);
                    sNotificationManager.createNotificationChannel(notificationChannel3);
                }
            }
        }
    }

    private static boolean isPullService() {
        return m.a ? Build.VERSION.SDK_INT < 31 : Build.VERSION.SDK_INT < 28;
    }

    private static boolean isZh(Context context) {
        return context.getResources().getConfiguration().locale.getLanguage().endsWith("zh");
    }

    public static void pushNotification(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, NotifyArriveCallbackByUser notifyArriveCallbackByUser, u.a aVar) {
        t.d(TAG, "pushNotification");
        initAdapter(context);
        int notifyMode = NotifyUtil.getNotifyDataAdapter(context).getNotifyMode(insideNotificationItem);
        if (!TextUtils.isEmpty(insideNotificationItem.getPurePicUrl()) && list != null && list.size() > 1 && list.get(1) != null) {
            notifyMode = 1;
        }
        if (notifyMode == 2) {
            pushNotificationBySystem(context, list, insideNotificationItem, j, i, notifyArriveCallbackByUser, aVar);
        } else if (notifyMode == 1) {
            pushNotificationByCustom(context, list, insideNotificationItem, j, notifyArriveCallbackByUser, aVar);
        }
    }

    private static void pushNotificationByCustom(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, NotifyArriveCallbackByUser notifyArriveCallbackByUser, u.a aVar) {
        Bitmap bitmap;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        int i = context.getApplicationInfo().icon;
        Bundle bundle = new Bundle();
        bundle.putLong(PUSH_ID, j);
        if (com.vivo.push.restructure.a.a().e().m().isOpenMultiUser()) {
            bundle.putInt(USER_ID, v.a());
        }
        bundle.putInt(EXTRA_VPUSH_TYPE, 1);
        Notification.Builder builder = new Notification.Builder(context, PRIMARY_CHANNEL);
        if (defaultNotifyIcon > 0) {
            bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
        }
        builder.setExtras(bundle);
        Notification build = builder.build();
        build.priority = 2;
        build.flags = 16;
        build.tickerText = title;
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId <= 0) {
            defaultSmallIconId = i;
        }
        build.icon = defaultSmallIconId;
        RemoteViews remoteViews = new RemoteViews(packageName, NotifyUtil.getNotifyLayoutAdapter(context).getNotificationLayout());
        remoteViews.setTextViewText(resources.getIdentifier("notify_title", "id", packageName), title);
        remoteViews.setTextColor(resources.getIdentifier("notify_title", "id", packageName), NotifyUtil.getNotifyLayoutAdapter(context).getTitleColor());
        remoteViews.setTextViewText(resources.getIdentifier("notify_msg", "id", packageName), insideNotificationItem.getContent());
        if (insideNotificationItem.isShowTime()) {
            remoteViews.setTextViewText(resources.getIdentifier("notify_when", "id", packageName), new SimpleDateFormat("HH:mm", Locale.CHINA).format(new Date()));
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 0);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_when", "id", packageName), 8);
        }
        int suitIconId = NotifyUtil.getNotifyLayoutAdapter(context).getSuitIconId();
        remoteViews.setViewVisibility(suitIconId, 0);
        if (list == null || list.isEmpty() || (bitmap = list.get(0)) == null) {
            if (defaultNotifyIcon <= 0) {
                defaultNotifyIcon = i;
            }
            remoteViews.setImageViewResource(suitIconId, defaultNotifyIcon);
        } else {
            remoteViews.setImageViewBitmap(suitIconId, bitmap);
        }
        Bitmap bitmap2 = null;
        if (list != null && list.size() > 1) {
            bitmap2 = list.get(1);
        }
        if (bitmap2 == null) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
        } else if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_cover", "id", packageName), bitmap2);
        } else {
            remoteViews.setViewVisibility(resources.getIdentifier("notify_content", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_cover", "id", packageName), 8);
            remoteViews.setViewVisibility(resources.getIdentifier("notify_pure_cover", "id", packageName), 0);
            remoteViews.setImageViewBitmap(resources.getIdentifier("notify_pure_cover", "id", packageName), bitmap2);
        }
        build.contentView = remoteViews;
        if (TextUtils.isEmpty(insideNotificationItem.getPurePicUrl())) {
            build.bigContentView = remoteViews;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int ringerMode = audioManager.getRingerMode();
        int vibrateSetting = audioManager.getVibrateSetting(0);
        t.d(TAG, "ringMode=" + ringerMode + " callVibrateSetting=" + vibrateSetting);
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        build.defaults = 1;
                    }
                    if (vibrateSetting == 1) {
                        build.defaults |= 2;
                        build.vibrate = new long[]{0, 100, 200, 300};
                    }
                }
            } else if (vibrateSetting == 1) {
                build.defaults = 2;
                build.vibrate = new long[]{0, 100, 200, 300};
            }
        } else if (ringerMode == 2) {
            build.defaults = 1;
        }
        i iVar = new i();
        Intent a = iVar.a(context, packageName, j, insideNotificationItem, notifyArriveCallbackByUser);
        if (a == null) {
            t.a(TAG, "make notify intent error  ");
            return;
        }
        if (isPullService()) {
            build.contentIntent = PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), b.a(context, packageName, j, a, insideNotificationItem), 201326592);
        } else {
            new com.vivo.push.b.p(packageName, j, insideNotificationItem).b(a);
            build.contentIntent = iVar.a(context, a);
        }
        if (sNotificationManager != null) {
            int j2 = com.vivo.push.m.a().j();
            try {
                if (j2 == 0) {
                    sNotificationManager.notify(sNotifyId, build);
                    if (aVar != null) {
                        aVar.a();
                        return;
                    }
                    return;
                }
                if (j2 != 1) {
                    t.a(TAG, "unknow notify style ".concat(String.valueOf(j2)));
                    return;
                }
                sNotificationManager.notify((int) j, build);
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Exception e2) {
                t.a(TAG, e2);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    private static void pushNotificationBySystem(Context context, List<Bitmap> list, InsideNotificationItem insideNotificationItem, long j, int i, NotifyArriveCallbackByUser notifyArriveCallbackByUser, u.a aVar) {
        Bitmap bitmap;
        int i2;
        int i3;
        Bitmap bitmap2;
        Bitmap decodeResource;
        String packageName = context.getPackageName();
        String title = insideNotificationItem.getTitle();
        String content = insideNotificationItem.getContent();
        int i4 = context.getApplicationInfo().icon;
        boolean isShowTime = insideNotificationItem.isShowTime();
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int defaultNotifyIcon = NotifyUtil.getNotifyDataAdapter(context).getDefaultNotifyIcon();
        if (list == null || list.isEmpty()) {
            bitmap = null;
        } else {
            bitmap = list.get(0);
            if (bitmap != null && defaultNotifyIcon > 0 && (decodeResource = BitmapFactory.decodeResource(context.getResources(), defaultNotifyIcon)) != null) {
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                decodeResource.recycle();
                bitmap = d.a(bitmap, width, height);
            }
        }
        Bundle bundle = new Bundle();
        Notification.Builder builder = new Notification.Builder(context, PRIMARY_CHANNEL);
        if (defaultNotifyIcon > 0) {
            bundle.putInt("vivo.summaryIconRes", defaultNotifyIcon);
        }
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        if (com.vivo.push.restructure.a.a().e().m().isOpenMultiUser()) {
            bundle.putInt(USER_ID, v.a());
        }
        bundle.putInt(EXTRA_VPUSH_TYPE, 1);
        bundle.putLong(PUSH_ID, j);
        builder.setExtras(bundle);
        int defaultSmallIconId = NotifyUtil.getNotifyDataAdapter(context).getDefaultSmallIconId();
        if (defaultSmallIconId > 0) {
            i4 = defaultSmallIconId;
        }
        builder.setSmallIcon(i4);
        if (insideNotificationItem.getCompatibleType() != 1) {
            builder.setContentTitle(title);
        }
        builder.setPriority(2);
        builder.setContentText(content);
        builder.setWhen(isShowTime ? System.currentTimeMillis() : 0L);
        builder.setShowWhen(isShowTime);
        builder.setTicker(title);
        int ringerMode = audioManager.getRingerMode();
        int notifyType = insideNotificationItem.getNotifyType();
        if (notifyType != 2) {
            if (notifyType != 3) {
                if (notifyType == 4) {
                    if (ringerMode == 2) {
                        builder.setDefaults(3);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    } else if (ringerMode == 1) {
                        builder.setDefaults(2);
                        builder.setVibrate(new long[]{0, 100, 200, 300});
                    } else {
                        i2 = 1;
                    }
                }
            } else if (ringerMode == 2) {
                builder.setDefaults(2);
                builder.setVibrate(new long[]{0, 100, 200, 300});
            }
            i2 = 1;
        } else {
            if (ringerMode == 2) {
                i2 = 1;
                builder.setDefaults(1);
            }
            i2 = 1;
        }
        if (list == null || list.size() <= i2) {
            i3 = i;
            bitmap2 = null;
        } else {
            bitmap2 = list.get(i2);
            i3 = i;
        }
        if (i3 != i2) {
            Notification.BigTextStyle bigTextStyle = new Notification.BigTextStyle();
            bigTextStyle.setBigContentTitle(title);
            bigTextStyle.bigText(content);
            builder.setStyle(bigTextStyle);
        }
        if (bitmap2 != null) {
            Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle();
            bigPictureStyle.setBigContentTitle(title);
            bigPictureStyle.setSummaryText(content);
            bigPictureStyle.bigPicture(bitmap2);
            builder.setStyle(bigPictureStyle);
        }
        builder.setAutoCancel(true);
        i iVar = new i();
        Intent a = iVar.a(context, packageName, j, insideNotificationItem, notifyArriveCallbackByUser);
        if (a == null) {
            t.a(TAG, "make notify intent error  ");
            return;
        }
        if (isPullService()) {
            builder.setContentIntent(PendingIntent.getService(context, (int) SystemClock.uptimeMillis(), b.a(context, packageName, j, a, insideNotificationItem), 201326592));
        } else {
            new com.vivo.push.b.p(packageName, j, insideNotificationItem).b(a);
            builder.setContentIntent(iVar.a(context, a));
        }
        Notification build = builder.build();
        int j2 = com.vivo.push.m.a().j();
        NotificationManager notificationManager = sNotificationManager;
        if (notificationManager != null) {
            try {
                if (j2 == 0) {
                    notificationManager.notify(sNotifyId, build);
                    if (aVar != null) {
                        aVar.a();
                        return;
                    }
                    return;
                }
                if (j2 != 1) {
                    t.a(TAG, "unknow notify style ".concat(String.valueOf(j2)));
                    return;
                }
                notificationManager.notify((int) j, build);
                if (aVar != null) {
                    aVar.a();
                }
            } catch (Exception e2) {
                t.a(TAG, e2);
                if (aVar != null) {
                    aVar.b();
                }
            }
        }
    }

    public static boolean repealNotifyById(Context context, long j) {
        int j2 = com.vivo.push.m.a().j();
        if (j2 != 0) {
            if (j2 == 1) {
                return cancelNotify(context, (int) j);
            }
            t.a(TAG, "unknow cancle notify style ".concat(String.valueOf(j2)));
            return false;
        }
        long b = ad.c().b("com.vivo.push.notify_key", -1L);
        if (b == j) {
            t.d(TAG, "undo showed message ".concat(String.valueOf(j)));
            t.a(context, "回收已展示的通知： ".concat(String.valueOf(j)));
            return cancelNotify(context, sNotifyId);
        }
        t.d(TAG, "current showing message id " + b + " not match " + j);
        t.a(context, "与已展示的通知" + b + "与待回收的通知" + j + "不匹配");
        return false;
    }

    public static void setNotifyId(int i) {
        sNotifyId = i;
    }

    public static void cancelNotify(Context context) {
        cancelNotify(context, sNotifyId);
    }
}
