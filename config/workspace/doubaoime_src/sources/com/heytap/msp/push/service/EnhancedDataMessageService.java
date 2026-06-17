package com.heytap.msp.push.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.heytap.mcssdk.constant.MessageConstant;
import com.heytap.mcssdk.d.d;
import com.heytap.mcssdk.utils.Utils;
import com.heytap.mcssdk.utils.e;
import com.heytap.mcssdk.utils.i;
import com.heytap.msp.push.callback.ICallkitDataMessageCallback;
import com.heytap.msp.push.mode.BaseMode;
import com.heytap.msp.push.mode.CallkitDataMessage;
import com.heytap.msp.push.mode.EnhanceDataMessage;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class EnhancedDataMessageService extends Service implements ICallkitDataMessageCallback {
    private static final String TAG = EnhancedDataMessageService.class.getSimpleName();
    private static final AtomicInteger sHandledMessageCount = new AtomicInteger(0);
    private static final AtomicLong sLastHandleTime = new AtomicLong(0);
    private final Object mProcessingLock = new Object();
    private final b mParserFactory = b.a();

    private static String getHandleStats() {
        StringBuilder M = e.a.a.a.a.M("Handled messages: ");
        M.append(sHandledMessageCount.get());
        M.append(", Last handle time: ");
        M.append(sLastHandleTime.get());
        return M.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CallkitDataMessage parseCallkitMessage(Intent intent, int i) {
        if (intent == null) {
            e.d(TAG, "Intent is null, cannot parse CallkitDataMessage");
            return null;
        }
        try {
            com.heytap.mcssdk.d.e a = this.mParserFactory.a(i);
            if (a != null) {
                BaseMode a2 = a.a(getBaseContext(), i, intent);
                if (a2 instanceof CallkitDataMessage) {
                    return (CallkitDataMessage) a2;
                }
                e.d(TAG, "Parsed message is not CallkitDataMessage type");
                return null;
            }
        } catch (Exception e2) {
            String str = TAG;
            StringBuilder M = e.a.a.a.a.M("Error parsing CallkitDataMessage: ");
            M.append(e2.getMessage());
            e.e(str, M.toString());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public EnhanceDataMessage parseMessage(Intent intent) {
        if (intent == null) {
            e.d(TAG, "Intent is null, cannot parse message");
            return null;
        }
        try {
            com.heytap.mcssdk.d.e a = this.mParserFactory.a(MessageConstant.MessageType.MESSAGE_SPT_ENHANCED_DATA);
            if (a != null) {
                BaseMode a2 = a.a(getBaseContext(), MessageConstant.MessageType.MESSAGE_SPT_ENHANCED_DATA, intent);
                if (a2 instanceof EnhanceDataMessage) {
                    return (EnhanceDataMessage) a2;
                }
                e.d(TAG, "Parsed message is not EnhanceDataMessage type");
                return null;
            }
        } catch (Exception e2) {
            String str = TAG;
            StringBuilder M = e.a.a.a.a.M("Error parsing message: ");
            M.append(e2.getMessage());
            e.e(str, M.toString());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCallkitMessage(CallkitDataMessage callkitDataMessage) {
        if (callkitDataMessage == null) {
            e.d(TAG, "Received null CallkitDataMessage");
            return;
        }
        int incrementAndGet = sHandledMessageCount.incrementAndGet();
        sLastHandleTime.set(System.currentTimeMillis());
        try {
            onCallkitMessageReceived(callkitDataMessage);
            e.b(TAG, "Successfully processed CallkitDataMessage #" + incrementAndGet + ", ID: " + callkitDataMessage.getMessageID());
        } catch (Exception e2) {
            String str = TAG;
            StringBuilder N = e.a.a.a.a.N("Error processing CallkitDataMessage #", incrementAndGet, ": ");
            N.append(e2.getMessage());
            e.e(str, N.toString());
        }
    }

    private void processIncomingMessage(final Intent intent, int i) {
        e.b(TAG, "Processing incoming message, startId: " + i);
        try {
            i.a(new Runnable() { // from class: com.heytap.msp.push.service.EnhancedDataMessageService.1
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    String str2;
                    synchronized (EnhancedDataMessageService.this.mProcessingLock) {
                        if (EnhancedDataMessageService.this.validateParams(intent)) {
                            int a = d.a(intent);
                            if (a == 4117) {
                                EnhanceDataMessage parseMessage = EnhancedDataMessageService.this.parseMessage(intent);
                                if (parseMessage != null) {
                                    EnhancedDataMessageService.this.processMessage(parseMessage);
                                } else {
                                    str = EnhancedDataMessageService.TAG;
                                    str2 = "Failed to parse EnhanceDataMessage from intent";
                                    e.d(str, str2);
                                }
                            } else if (a == 4120) {
                                CallkitDataMessage parseCallkitMessage = EnhancedDataMessageService.this.parseCallkitMessage(intent, a);
                                if (parseCallkitMessage != null) {
                                    EnhancedDataMessageService.this.processCallkitMessage(parseCallkitMessage);
                                } else {
                                    str = EnhancedDataMessageService.TAG;
                                    str2 = "Failed to parse CallkitDataMessage from intent";
                                    e.d(str, str2);
                                }
                            } else {
                                e.d(EnhancedDataMessageService.TAG, "Unknown message type: " + a);
                            }
                        }
                    }
                }
            });
        } catch (Exception e2) {
            String str = TAG;
            StringBuilder M = e.a.a.a.a.M("Error in processIncomingMessage: ");
            M.append(e2.getMessage());
            e.e(str, M.toString());
            onMessageHandleError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processMessage(EnhanceDataMessage enhanceDataMessage) {
        if (enhanceDataMessage == null) {
            e.d(TAG, "Received null message");
            return;
        }
        int incrementAndGet = sHandledMessageCount.incrementAndGet();
        sLastHandleTime.set(System.currentTimeMillis());
        try {
            onMessageReceived(enhanceDataMessage);
            e.b(TAG, "Successfully processed message #" + incrementAndGet + ", ID: " + enhanceDataMessage.getMessageID());
        } catch (Exception e2) {
            String str = TAG;
            StringBuilder N = e.a.a.a.a.N("Error processing message #", incrementAndGet, ": ");
            N.append(e2.getMessage());
            e.e(str, N.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean validateParams(Intent intent) {
        String str;
        String str2;
        if (getBaseContext() == null) {
            str = TAG;
            str2 = "Context is null";
        } else if (intent == null) {
            str = TAG;
            str2 = "Intent is null";
        } else {
            if (Utils.isSupportPushByClient(getBaseContext())) {
                return true;
            }
            str = TAG;
            str2 = "Push is not supported on this client";
        }
        e.e(str, str2);
        return false;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return new Binder();
    }

    public void onCallkitMessageReceived(CallkitDataMessage callkitDataMessage) {
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("onCallkitMessageReceived() - Message ID: ");
        M.append(callkitDataMessage.getMessageID());
        e.b(str, M.toString());
    }

    @Override // android.app.Service
    public void onCreate() {
        e.b(TAG, "EnhancedDataMessageService created.");
    }

    @Override // android.app.Service
    public void onDestroy() {
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("EnhancedDataMessageService destroyed, ");
        M.append(getHandleStats());
        e.b(str, M.toString());
    }

    protected void onMessageHandleError(Exception exc) {
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("Enhanced data message processing error: ");
        M.append(exc.getMessage());
        e.e(str, M.toString());
    }

    protected void onMessageReceived(EnhanceDataMessage enhanceDataMessage) {
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("onMessageReceived() - Message ID: ");
        M.append(enhanceDataMessage.getMessageID());
        e.b(str, M.toString());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String str = TAG;
        e.b(str, "EnhancedDataMessageService onStartCommand called, startId: " + i2);
        if (intent == null) {
            e.d(str, "Received null intent in onStartCommand");
            return 2;
        }
        processIncomingMessage(intent, i2);
        return 2;
    }
}
