package com.bytedance.android.input.common.t.a;

import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.common.asr.api.IAsr;
import com.bytedance.android.input.common.asr.sdkImp.e;
import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreWebSocketConnectionEvent;
import com.prolificinteractive.materialcalendarview.r;
import kotlin.h;
import kotlin.o;
import kotlin.s.c.l;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b implements SAMICoreCallBackListener {
    private final e a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f2213c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2214d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2215e;

    public b(e eVar) {
        l.f(eVar, "listener");
        this.a = eVar;
    }

    private final String b() {
        Thread currentThread = Thread.currentThread();
        StringBuilder M = e.a.a.a.a.M("---currentThreadName = ");
        M.append(currentThread.getName());
        M.append("---currentThreadId = ");
        M.append(currentThread.getId());
        M.append("---isMainThread ? ");
        M.append(l.a(Looper.getMainLooper(), Looper.myLooper()));
        return M.toString();
    }

    private final long c(JSONObject jSONObject) {
        long j = 0;
        if (!this.f2214d) {
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            long optLong = optJSONObject != null ? optJSONObject.optLong("speech_start_to_first_character_duration", 0L) : 0L;
            if (optLong > 0) {
                long uptimeMillis = SystemClock.uptimeMillis();
                StringBuilder Q = e.a.a.a.a.Q("timeNow = ", uptimeMillis, ", startTime = ");
                Q.append(optLong);
                Q.append(", ");
                long j2 = uptimeMillis - optLong;
                Q.append(j2);
                i(Q.toString());
                j = j2;
            } else {
                j = optLong;
            }
            this.f2214d = true;
        }
        return j;
    }

    private final SAMICoreServerEvent d(SAMICoreBlock sAMICoreBlock) {
        Object obj = sAMICoreBlock.audioData[0];
        l.d(obj, "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreServerEvent");
        return (SAMICoreServerEvent) obj;
    }

    private final void e(SAMICoreBlock sAMICoreBlock) {
        SAMICoreServerEvent d2 = d(sAMICoreBlock);
        if (d2.statusCode == 40200001) {
            j("odin auth failed");
        } else {
            j("server error");
        }
        k(d2);
        this.f2213c = true;
        int i = d2.statusCode;
        if (i == 40200001) {
            e eVar = this.a;
            IAsr.ErrorType errorType = IAsr.ErrorType.ODIN_AUTH_FAILED;
            String str = d2.taskId;
            l.e(str, "data.taskId");
            eVar.d(errorType, i, str);
            return;
        }
        e eVar2 = this.a;
        IAsr.ErrorType errorType2 = IAsr.ErrorType.SERVER_ERROR;
        String str2 = d2.taskId;
        l.e(str2, "data.taskId");
        eVar2.d(errorType2, i, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053 A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:3:0x0007, B:5:0x0031, B:7:0x003c, B:9:0x004b, B:11:0x0053, B:13:0x006a, B:17:0x0077, B:21:0x0084, B:22:0x008c, B:24:0x00ce, B:26:0x00d6, B:30:0x00ec, B:31:0x00f1, B:33:0x00f9, B:35:0x0101, B:38:0x010b, B:41:0x0119, B:52:0x012f), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #0 {all -> 0x0135, blocks: (B:3:0x0007, B:5:0x0031, B:7:0x003c, B:9:0x004b, B:11:0x0053, B:13:0x006a, B:17:0x0077, B:21:0x0084, B:22:0x008c, B:24:0x00ce, B:26:0x00d6, B:30:0x00ec, B:31:0x00f1, B:33:0x00f9, B:35:0x0101, B:38:0x010b, B:41:0x0119, B:52:0x012f), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004b A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:3:0x0007, B:5:0x0031, B:7:0x003c, B:9:0x004b, B:11:0x0053, B:13:0x006a, B:17:0x0077, B:21:0x0084, B:22:0x008c, B:24:0x00ce, B:26:0x00d6, B:30:0x00ec, B:31:0x00f1, B:33:0x00f9, B:35:0x0101, B:38:0x010b, B:41:0x0119, B:52:0x012f), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void f(com.mammon.audiosdk.structures.SAMICoreBlock r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.input.common.t.a.b.f(com.mammon.audiosdk.structures.SAMICoreBlock):void");
    }

    private final void g(SAMICoreBlock sAMICoreBlock) {
        Object obj = sAMICoreBlock.audioData[0];
        l.d(obj, "null cannot be cast to non-null type com.mammon.audiosdk.structures.SAMICoreWebSocketConnectionEvent");
        SAMICoreWebSocketConnectionEvent sAMICoreWebSocketConnectionEvent = (SAMICoreWebSocketConnectionEvent) obj;
        StringBuilder M = e.a.a.a.a.M("ASR_WebSocketStateChanged ");
        M.append(sAMICoreWebSocketConnectionEvent.state);
        M.append(", this = ");
        M.append(this);
        M.append(", textMsg = ");
        M.append(sAMICoreWebSocketConnectionEvent.textMsg);
        j(M.toString());
        int i = sAMICoreWebSocketConnectionEvent.state;
        if (i == 3 && !this.f2213c) {
            j("ERR_NET_CONNECT_CLOSED");
            this.f2213c = true;
            this.a.d(IAsr.ErrorType.NET_ERROR, sAMICoreWebSocketConnectionEvent.state, "");
        } else if (i == 5) {
            j("switch network from wifi to cell");
            this.a.d(IAsr.ErrorType.NET_SWITCH, sAMICoreWebSocketConnectionEvent.state, "");
        } else if (i == 6) {
            j("switch network to offline");
        }
    }

    private final boolean h(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("extra");
        i("isSendAction extra = " + optJSONObject);
        boolean z = false;
        if (optJSONObject != null && optJSONObject.optBoolean("s2a_send_trigger", false)) {
            z = true;
        }
        if (z && !this.f2215e) {
            e.a.a.a.a.q0("type", optJSONObject != null ? optJSONObject.optString("s2a_send_trigger_text") : null, IAppLog.a, "speech_action_do_send");
            this.f2215e = true;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(String str) {
        IAppGlobals.a.j("Asr-Flow-SdkResultCallback", str);
    }

    private final void j(String str) {
        IAppGlobals.a.x("Asr-Flow-SdkResultCallback", str);
    }

    private final void k(SAMICoreServerEvent sAMICoreServerEvent) {
        StringBuilder M = e.a.a.a.a.M("event = ");
        M.append(sAMICoreServerEvent.event);
        M.append("---this = ");
        M.append(this);
        M.append("---status_code = ");
        M.append(sAMICoreServerEvent.statusCode);
        M.append("---status_text = ");
        M.append(sAMICoreServerEvent.statusText);
        M.append("---task_id = ");
        M.append(sAMICoreServerEvent.taskId);
        M.append("---message_id = ");
        M.append(sAMICoreServerEvent.messageId);
        j(M.toString());
        String str = sAMICoreServerEvent.textMsg;
        if (str != null) {
            l.e(str, "serverEvent.textMsg");
            if (str.length() > 0) {
                StringBuilder M2 = e.a.a.a.a.M("SdkEventMsg#textMsg = ");
                M2.append(sAMICoreServerEvent.textMsg);
                i(M2.toString());
            }
        }
    }

    @Override // com.mammon.audiosdk.SAMICoreCallBackListener
    public void onMessageReceived(SAMICoreCallBackEventType sAMICoreCallBackEventType, SAMICoreBlock sAMICoreBlock) {
        Object J2;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            i("onMessageReceived start: type = " + sAMICoreCallBackEventType + ", " + b());
            J2 = null;
            if (sAMICoreCallBackEventType != null && sAMICoreBlock != null) {
                if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.ASR_Started) {
                    SAMICoreServerEvent d2 = d(sAMICoreBlock);
                    k(d2);
                    e eVar = this.a;
                    String str = d2.taskId;
                    l.e(str, "data.taskId");
                    eVar.a(false, str);
                    if (this.b) {
                        j("handleNewSessionStart");
                    } else {
                        this.b = true;
                    }
                } else if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.ASR_GetResulted) {
                    f(sAMICoreBlock);
                } else if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.ASR_Finished) {
                    SAMICoreServerEvent d3 = d(sAMICoreBlock);
                    k(d3);
                    e eVar2 = this.a;
                    String str2 = d3.taskId;
                    l.e(str2, "data.taskId");
                    eVar2.b(str2);
                    this.f2213c = true;
                } else if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.ASR_Failed) {
                    e(sAMICoreBlock);
                } else if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.ASR_WebSocketStateChanged) {
                    g(sAMICoreBlock);
                }
                J2 = o.a;
            }
        } catch (Throwable th) {
            J2 = r.J(th);
        }
        Throwable b = h.b(J2);
        if (b != null) {
            IAppGlobals.a.e("Asr-Flow-SdkResultCallback", "onMessageReceived exception");
            i("onMessageReceived exception = " + b);
        }
        StringBuilder M = e.a.a.a.a.M("onMessageReceived end： type = null？");
        M.append(sAMICoreCallBackEventType == null);
        M.append(" -- data = null？");
        M.append(sAMICoreBlock == null);
        M.append(" ---cost time = ");
        M.append(System.currentTimeMillis() - currentTimeMillis);
        i(M.toString());
    }
}
