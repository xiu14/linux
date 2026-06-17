package com.vivo.push.h;

import com.heytap.msp.push.callback.INotificationPermissionCallback;

/* loaded from: classes2.dex */
public final class ai {
    public static com.vivo.push.s a(com.vivo.push.v vVar) {
        com.vivo.push.s ahVar;
        int b = vVar.b();
        if (b == 20) {
            ahVar = new ah(vVar);
        } else if (b == 100) {
            ahVar = new b(vVar);
        } else if (b != 101) {
            switch (b) {
                case 0:
                    break;
                case 1:
                    ahVar = new ac(vVar);
                    break;
                case 2:
                    ahVar = new l(vVar);
                    break;
                case 3:
                    ahVar = new t(vVar);
                    break;
                case 4:
                    ahVar = new u(vVar);
                    break;
                case 5:
                    ahVar = new x(vVar);
                    break;
                case 6:
                    ahVar = new z(vVar);
                    break;
                case 7:
                    ahVar = new r(vVar);
                    break;
                case 8:
                    ahVar = new p(vVar);
                    break;
                case 9:
                    ahVar = new k(vVar);
                    break;
                case 10:
                    ahVar = new h(vVar);
                    break;
                case 11:
                    ahVar = new af(vVar);
                    break;
                case 12:
                    ahVar = new j(vVar);
                    break;
                default:
                    switch (b) {
                        case 2000:
                        case INotificationPermissionCallback.CODE_NOT_TOP /* 2001 */:
                        case INotificationPermissionCallback.CODE_HAD_PERMISSION /* 2002 */:
                        case INotificationPermissionCallback.CODE_SHOWING /* 2003 */:
                        case INotificationPermissionCallback.CODE_FREQUENT /* 2004 */:
                        case INotificationPermissionCallback.CODE_UNSUPPORT /* 2005 */:
                        case 2008:
                        case 2009:
                        case 2010:
                        case 2011:
                        case 2012:
                        case 2013:
                        case 2014:
                        case 2015:
                            break;
                        case 2006:
                            ahVar = new a(vVar);
                            break;
                        case 2007:
                            ahVar = new ak(vVar);
                            break;
                        default:
                            return null;
                    }
            }
            ahVar = new aj(vVar);
        } else {
            ahVar = new c(vVar);
        }
        return ahVar;
    }

    public static ab b(com.vivo.push.v vVar) {
        ab ahVar;
        int b = vVar.b();
        if (b == 20) {
            ahVar = new ah(vVar);
        } else if (b == 2016) {
            ahVar = new o(vVar);
        } else if (b != 2023) {
            switch (b) {
                case 1:
                    ahVar = new ac(vVar);
                    break;
                case 2:
                    ahVar = new l(vVar);
                    break;
                case 3:
                    ahVar = new t(vVar);
                    break;
                case 4:
                    ahVar = new u(vVar);
                    break;
                case 5:
                    ahVar = new x(vVar);
                    break;
                case 6:
                    ahVar = new z(vVar);
                    break;
                case 7:
                    ahVar = new r(vVar);
                    break;
                case 8:
                    ahVar = new p(vVar);
                    break;
                case 9:
                    ahVar = new k(vVar);
                    break;
                case 10:
                    ahVar = new h(vVar);
                    break;
                case 11:
                    ahVar = new af(vVar);
                    break;
                default:
                    return null;
            }
        } else {
            ahVar = new y(vVar);
        }
        return ahVar;
    }
}
