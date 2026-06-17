package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.xiaomi.push.ih;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class aj {
    private static final boolean a = Log.isLoggable("NCHelper", 3);

    @TargetApi(26)
    private static void a(an anVar, NotificationChannel notificationChannel, String str) {
        int i;
        char c2;
        int i2;
        Context m748a = anVar.m748a();
        String id = notificationChannel.getId();
        String a2 = an.a(id, anVar.m749a());
        boolean z = a;
        if (z) {
            a(e.a.a.a.a.u("appChannelId:", id, " oldChannelId:", a2));
        }
        if (!com.xiaomi.push.k.m655a(m748a) || TextUtils.equals(id, a2)) {
            NotificationChannel m747a = anVar.m747a(id);
            if (z) {
                a("elseLogic getNotificationChannel:" + m747a);
            }
            if (m747a == null) {
                anVar.a(notificationChannel);
            }
            i = 0;
            c2 = 0;
        } else {
            NotificationManager notificationManager = (NotificationManager) m748a.getSystemService(RemoteMessageConst.NOTIFICATION);
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(a2);
            NotificationChannel m747a2 = anVar.m747a(id);
            if (z) {
                a("xmsfChannel:" + notificationChannel2);
                a("appChannel:" + m747a2);
            }
            if (notificationChannel2 != null) {
                NotificationChannel a3 = a(id, notificationChannel2);
                if (z) {
                    a("copyXmsf copyXmsfChannel:" + a3);
                }
                if (m747a2 != null) {
                    i2 = a(m747a2);
                    anVar.a(a3, i2 == 0);
                    c2 = 3;
                } else {
                    i2 = a(notificationChannel2);
                    a(m748a, anVar, a3, i2, notificationChannel2.getId());
                    c2 = 4;
                }
                b(m748a, id);
                notificationManager.deleteNotificationChannel(a2);
            } else if (m747a2 == null) {
                if (z) {
                    a("appHack createNotificationChannel:" + notificationChannel);
                }
                anVar.a(notificationChannel);
                c2 = 1;
                i2 = 0;
            } else if (m736a(m748a, id) || !a(notificationChannel, m747a2)) {
                i2 = 0;
                c2 = 0;
            } else {
                if (z) {
                    a("appHack updateNotificationChannel:" + notificationChannel);
                }
                i2 = a(m747a2);
                anVar.a(notificationChannel, i2 == 0);
                c2 = 2;
            }
            i = i2;
        }
        g.a(anVar.m748a(), anVar.m749a(), id, notificationChannel.getImportance(), str, c2 == 1 || c2 == 4 || c2 == 3, i);
    }

    private static void b(Context context, String str) {
        if (a) {
            a(e.a.a.a.a.s("recordCopiedChannel:", str));
        }
        a(context).edit().putBoolean(str, true).apply();
    }

    private static void c(Context context, String str) {
        try {
            an a2 = an.a(context, str);
            Set<String> keySet = a(context).getAll().keySet();
            ArrayList arrayList = new ArrayList();
            for (String str2 : keySet) {
                if (a2.m752a(str2)) {
                    arrayList.add(str2);
                    if (a) {
                        a("delete channel copy record:" + str2);
                    }
                }
            }
            a(context, arrayList);
        } catch (Exception unused) {
        }
    }

    @TargetApi(26)
    private static boolean a(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        boolean z;
        if (notificationChannel == null || notificationChannel2 == null) {
            return false;
        }
        boolean z2 = true;
        if (TextUtils.equals(notificationChannel.getName(), notificationChannel2.getName())) {
            z = false;
        } else {
            if (a) {
                a("appHack channelConfigLowerCompare:getName");
            }
            z = true;
        }
        if (!TextUtils.equals(notificationChannel.getDescription(), notificationChannel2.getDescription())) {
            if (a) {
                a("appHack channelConfigLowerCompare:getDescription");
            }
            z = true;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            notificationChannel.setImportance(Math.min(notificationChannel.getImportance(), notificationChannel2.getImportance()));
            if (a) {
                StringBuilder M = e.a.a.a.a.M("appHack channelConfigLowerCompare:getImportance  ");
                M.append(notificationChannel.getImportance());
                M.append(" ");
                M.append(notificationChannel2.getImportance());
                a(M.toString());
            }
            z = true;
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            notificationChannel.enableVibration(false);
            if (a) {
                a("appHack channelConfigLowerCompare:enableVibration");
            }
            z = true;
        }
        if (notificationChannel.shouldShowLights() != notificationChannel2.shouldShowLights()) {
            notificationChannel.enableLights(false);
            if (a) {
                a("appHack channelConfigLowerCompare:enableLights");
            }
            z = true;
        }
        if ((notificationChannel.getSound() != null) != (notificationChannel2.getSound() != null)) {
            notificationChannel.setSound(null, null);
            if (a) {
                a("appHack channelConfigLowerCompare:setSound");
            }
        } else {
            z2 = z;
        }
        if (a) {
            a(e.a.a.a.a.A("appHack channelConfigLowerCompare:isDifferent:", z2));
        }
        return z2;
    }

    private static int a(NotificationChannel notificationChannel) {
        int i = 0;
        try {
            i = ((Integer) com.xiaomi.push.bh.b((Object) notificationChannel, "getUserLockedFields", new Object[0])).intValue();
            if (a) {
                a("isUserLockedChannel:" + i + " " + notificationChannel);
            }
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.c.m16a("NCHelper", "is user locked error" + e2);
        }
        return i;
    }

    @TargetApi(26)
    private static NotificationChannel a(String str, NotificationChannel notificationChannel) {
        NotificationChannel notificationChannel2 = new NotificationChannel(str, notificationChannel.getName(), notificationChannel.getImportance());
        notificationChannel2.setDescription(notificationChannel.getDescription());
        notificationChannel2.enableVibration(notificationChannel.shouldVibrate());
        notificationChannel2.enableLights(notificationChannel.shouldShowLights());
        notificationChannel2.setSound(notificationChannel.getSound(), notificationChannel.getAudioAttributes());
        notificationChannel2.setLockscreenVisibility(notificationChannel.getLockscreenVisibility());
        return notificationChannel2;
    }

    /* renamed from: a, reason: collision with other method in class */
    private static boolean m736a(Context context, String str) {
        if (a) {
            StringBuilder U = e.a.a.a.a.U("checkCopeidChannel:newFullChannelId:", str, "  ");
            U.append(a(context).getBoolean(str, false));
            a(U.toString());
        }
        return a(context).getBoolean(str, false);
    }

    private static void a(Context context, List<String> list) {
        if (a) {
            a("deleteCopiedChannelRecord:" + list);
        }
        if (list.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = a(context).edit();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            edit.remove(it2.next());
        }
        edit.apply();
    }

    private static SharedPreferences a(Context context) {
        return context.getSharedPreferences("mipush_channel_copy_sp", 0);
    }

    @TargetApi(26)
    public static String a(an anVar, String str, CharSequence charSequence, String str2, int i, int i2, String str3, String str4) {
        String m750a = anVar.m750a(str);
        boolean z = a;
        if (z) {
            StringBuilder W = e.a.a.a.a.W("createChannel: appChannelId:", m750a, " serverChannelId:", str, " serverChannelName:");
            W.append((Object) charSequence);
            W.append(" serverChannelDesc:");
            W.append(str2);
            W.append(" serverChannelNotifyType:");
            W.append(i);
            W.append(" serverChannelName:");
            W.append((Object) charSequence);
            W.append(" serverChannelImportance:");
            W.append(i2);
            W.append(" channelSoundStr:");
            W.append(str3);
            W.append(" channelPermissions:");
            W.append(str4);
            a(W.toString());
        }
        NotificationChannel notificationChannel = new NotificationChannel(m750a, charSequence, i2);
        notificationChannel.setDescription(str2);
        notificationChannel.enableVibration((i & 2) != 0);
        notificationChannel.enableLights((i & 4) != 0);
        if ((i & 1) != 0) {
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder M = e.a.a.a.a.M("android.resource://");
                M.append(anVar.m749a());
                if (str3.startsWith(M.toString())) {
                    notificationChannel.setSound(Uri.parse(str3), Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
        } else {
            notificationChannel.setSound(null, null);
        }
        if (z) {
            a("create channel:" + notificationChannel);
        }
        a(anVar, notificationChannel, str4);
        return m750a;
    }

    private static void a(String str) {
        com.xiaomi.channel.commonutils.logger.c.m16a("NCHelper", str);
    }

    public static void a(Context context, String str) {
        if (!com.xiaomi.push.k.m655a(context) || TextUtils.isEmpty(str)) {
            return;
        }
        c(context, str);
        g.a(context, str);
    }

    static void a(ih ihVar) {
        Map<String, String> map;
        if (ihVar == null || (map = ihVar.f646a) == null || !map.containsKey("REMOVE_CHANNEL_MARK")) {
            return;
        }
        ihVar.f642a = 0;
        ihVar.f646a.remove(WsConstants.KEY_CHANNEL_ID);
        ihVar.f646a.remove("channel_importance");
        ihVar.f646a.remove("channel_name");
        ihVar.f646a.remove("channel_description");
        ihVar.f646a.remove("channel_perm");
        com.xiaomi.channel.commonutils.logger.c.m15a("delete channel info by:" + ihVar.f646a.get("REMOVE_CHANNEL_MARK"));
        ihVar.f646a.remove("REMOVE_CHANNEL_MARK");
    }

    @SuppressLint({"WrongConstant"})
    @TargetApi(26)
    static void a(Context context, an anVar, NotificationChannel notificationChannel, int i, String str) {
        if (i > 0) {
            int a2 = com.xiaomi.push.s.m668a(context) ? g.a(context.getPackageName(), str) : 0;
            NotificationChannel a3 = a(notificationChannel.getId(), notificationChannel);
            if ((i & 32) != 0) {
                if (notificationChannel.getSound() != null) {
                    a3.setSound(null, null);
                } else {
                    a3.setSound(Settings.System.DEFAULT_NOTIFICATION_URI, Notification.AUDIO_ATTRIBUTES_DEFAULT);
                }
            }
            if ((i & 16) != 0) {
                if (notificationChannel.shouldVibrate()) {
                    a3.enableVibration(false);
                } else {
                    a3.enableVibration(true);
                }
            }
            if ((i & 8) != 0) {
                if (notificationChannel.shouldShowLights()) {
                    a3.enableLights(false);
                } else {
                    a3.enableLights(true);
                }
            }
            if ((i & 4) != 0) {
                int importance = notificationChannel.getImportance() - 1;
                if (importance <= 0) {
                    importance = 2;
                }
                a3.setImportance(importance);
            }
            if ((i & 2) != 0) {
                a3.setLockscreenVisibility(notificationChannel.getLockscreenVisibility() - 1);
            }
            anVar.a(a3);
            anVar.a(notificationChannel, true);
            g.a(anVar.m749a(), notificationChannel.getId(), a2, 0);
            return;
        }
        anVar.a(notificationChannel);
    }
}
