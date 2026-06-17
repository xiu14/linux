package com.ss.ttuploader.net;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.ttuploader.TTUploadLog;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class TTUploadHostProcessor {
    private static final int BACKUP_DNS = 1;
    private static final int MAIN_DNS = 0;
    public static final int MSG_IS_BACUP_PARSE = 1;
    public static final int MSG_IS_MAIN_PARSE = 0;
    public static final int STATE_IS_IDLE = 0;
    public static final int STATE_IS_PARSE_END_ERROR = 2;
    public static final int STATE_IS_PARSE_END_SUC = 3;
    public static final int STATE_IS_WAIT_RESULT = 1;
    private static final String TAG = "TTUploadHostProcessor";
    private int mBackUpDelayedTime;
    private int mBackUpType;
    private Handler mHandler;
    public String mHost;
    public HashMap<TTUploadDNSParserListener, Integer> mListeners;
    private int mMainType;
    private int[] mStates = new int[2];
    private BaseDNS[] mParsers = new BaseDNS[2];

    public TTUploadHostProcessor(String str, Handler handler, int i, int i2, int i3) {
        this.mMainType = i;
        this.mBackUpType = i2;
        this.mHandler = handler;
        this.mHost = str;
        this.mBackUpDelayedTime = i3;
        for (int i4 = 0; i4 < 2; i4++) {
            this.mParsers[i4] = null;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            this.mStates[i5] = 0;
        }
        this.mListeners = new HashMap<>();
    }

    private BaseDNS createDNSParser(String str, int i, int i2) {
        if (i == 1 || i == 2 || i == 3) {
            TTUploadLog.d(TAG, String.format("create http dns parser for host:%s type:%d", str, Integer.valueOf(i)));
            return new HTTPDNS(str, null, i, this.mHandler);
        }
        TTUploadLog.d(TAG, String.format("create local dns parser for host:%s type:%d", str, Integer.valueOf(i)));
        return new LocalDNS(str, this.mHandler);
    }

    private void doParseInternal(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        TTUploadLog.d(TAG, String.format("----do parse internal what:%d info:%s", Integer.valueOf(i), tTUploadDNSInfo));
        if (tTUploadDNSInfo == null) {
            return;
        }
        if (i == 0 && this.mParsers[0] == null) {
            TTUploadLog.d(TAG, String.format("create main dns type:%d host:%s", Integer.valueOf(this.mMainType), tTUploadDNSInfo.mHost));
            this.mStates[0] = 1;
            this.mParsers[0] = createDNSParser(tTUploadDNSInfo.mHost, this.mMainType, 0);
            this.mParsers[0].start();
            Message message = new Message();
            message.what = 1;
            message.obj = tTUploadDNSInfo;
            if (this.mBackUpDelayedTime > 0) {
                TTUploadLog.d(TAG, String.format("BackUpDelayedTime:%d send backup delay first", Integer.valueOf(this.mMainType)));
                this.mHandler.sendMessageDelayed(message, this.mBackUpDelayedTime * 1000);
            }
        } else if (i == 1 && this.mParsers[1] == null) {
            TTUploadLog.d(TAG, String.format("create backup dns type:%d host:%s", Integer.valueOf(this.mMainType), tTUploadDNSInfo.mHost));
            this.mStates[1] = 1;
            this.mParsers[1] = createDNSParser(tTUploadDNSInfo.mHost, this.mBackUpType, 1);
            this.mParsers[1].start();
        }
        TTUploadLog.d(TAG, String.format("****do parse internal end", new Object[0]));
    }

    public boolean isEnd() {
        for (int i = 0; i < 2; i++) {
            if (this.mParsers[i] != null) {
                int[] iArr = this.mStates;
                if (iArr[i] != 3 && iArr[i] != 2) {
                    return false;
                }
            }
        }
        TTUploadLog.d(TAG, "all dns parse is end");
        return true;
    }

    public boolean isValidSourceId(String str) {
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.d(TAG, String.format("id: %s is empty", str));
            return false;
        }
        for (int i = 0; i < 2; i++) {
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i] != null && str.equals(baseDNSArr[i].mId)) {
                TTUploadLog.d(TAG, String.format("id: %s is valid index: %d", str, Integer.valueOf(i)));
                return true;
            }
        }
        TTUploadLog.d(TAG, String.format("id: %s is valid", str));
        return false;
    }

    public void processMsg(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        TTUploadLog.d(TAG, String.format("----processor pro msg what:%d host:%s info:%s", Integer.valueOf(i), tTUploadDNSInfo.mHost, tTUploadDNSInfo));
        if (i != 0) {
            if (i == 1) {
                int[] iArr = this.mStates;
                if ((iArr[0] == 1 || iArr[0] == 2 || iArr[0] == 3) && iArr[1] == 0) {
                    TTUploadLog.d(TAG, String.format("main dns is not end and backup dns is idle call backup dns", new Object[0]));
                    doParseInternal(i, tTUploadDNSInfo);
                }
            }
        } else if (this.mStates[0] == 0) {
            TTUploadLog.d(TAG, String.format("main dns is idle call main dns", new Object[0]));
            doParseInternal(i, tTUploadDNSInfo);
        }
        TTUploadLog.d(TAG, String.format("****end processor pro msg what:%d host:%s info:%s", Integer.valueOf(i), tTUploadDNSInfo.mHost, tTUploadDNSInfo));
    }

    public void processResult(int i, TTUploadDNSInfo tTUploadDNSInfo) {
        TTUploadLog.d(TAG, String.format("----process result what:%d id:%s host:%s", Integer.valueOf(i), tTUploadDNSInfo.mId, tTUploadDNSInfo.mHost));
        String str = (i == 2 || i == 3) ? tTUploadDNSInfo.mId : null;
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.d(TAG, String.format("****process result err id is empty", new Object[0]));
            return;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                break;
            }
            BaseDNS[] baseDNSArr = this.mParsers;
            if (baseDNSArr[i2] == null || !str.equals(baseDNSArr[i2].mId)) {
                i2++;
            } else {
                this.mParsers[i2].close();
                this.mParsers[i2] = null;
                if (i == 3) {
                    this.mStates[i2] = 3;
                } else if (i == 2) {
                    this.mStates[i2] = 2;
                }
                TTUploadLog.d(TAG, String.format("****process result parser index:%d is end, be close", Integer.valueOf(i2)));
            }
        }
        if (i2 == 0 && i == 2) {
            TTUploadLog.d(TAG, String.format("mian dns parse error, try back up dns", new Object[0]));
            processMsg(1, new TTUploadDNSInfo(TTUploadDNSParser.mGlobalBackType, tTUploadDNSInfo.mHost, null, 0L, null));
        }
        TTUploadLog.d(TAG, String.format("****end process result what:%d id:%s host:%s", Integer.valueOf(i), tTUploadDNSInfo.mId, tTUploadDNSInfo.mHost));
    }
}
