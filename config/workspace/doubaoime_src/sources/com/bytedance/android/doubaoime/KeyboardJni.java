package com.bytedance.android.doubaoime;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import androidx.annotation.NonNull;
import com.bytedance.android.doubaoime.activity.FeedbackActivity;
import com.bytedance.android.doubaoime.activity.SettingsActivityNext;
import com.bytedance.android.input.basic.IAppGlobals;
import com.bytedance.android.input.basic.applog.api.IAppLog;
import com.bytedance.android.input.basic.settings.api.IInputSettings;
import com.bytedance.android.input.common.FeedbackAssociateContentShownInUi;
import com.bytedance.android.input.common.FeedbackContentShownInUi;
import com.bytedance.android.input.common.SettingsConfigNext;
import com.bytedance.android.input.common.VibrationController;
import com.bytedance.android.input.common.s.a.a;
import com.bytedance.android.input.editor.SelectionTracker;
import com.bytedance.android.input.fragment.settings.j1;
import com.bytedance.android.input.keyboard.InputView;
import com.bytedance.android.input.keyboard.KeyboardView;
import com.bytedance.android.input.keyboard.UserInteractiveManagerNext;
import com.bytedance.android.input.keyboard.aiwrite.C0603x;
import com.bytedance.android.input.keyboard.aiwrite.V;
import com.bytedance.android.input.keyboard.word_segmentation.data.WordSegmentationData;
import com.bytedance.android.input.llm.LLMRequest;
import com.bytedance.android.input.popup.BackspaceSwipeWindow;
import com.bytedance.android.input.popup.WindowId;
import com.bytedance.android.input.q.v;
import com.bytedance.android.input.q.z;
import com.bytedance.android.input.speech.AsrContext;
import com.bytedance.android.input.speech.AsrConvertInfo;
import com.bytedance.android.input.speech.AsrManager;
import com.bytedance.android.input.speech.view.AsrEditorLayoutView;
import com.bytedance.android.input.speech.x;
import com.bytedance.android.input.speech.y;
import com.bytedance.common.wschannel.WsConstants;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.monitor.cloudmessage.utils.NetworkUtils;
import com.ss.android.message.log.PushLog;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class KeyboardJni {
    public static final int BACKSAPCE_FOR_HANDWRITE = 52;
    private static final int DEFAULT_PRE_EDIT_START_POSITION = -1;
    private static final int FINISH_UPDATE_CONTACTS_EVENT_DELAY = 30;
    public static final int KEY_AIWRITING_CHECK = 23;
    public static final int KEY_AIWRITING_REWRITE = 24;
    public static final int KEY_AIWRITING_SUMMARY = 25;
    public static final int KEY_AI_CHAT_ASSISTANT = 26;
    public static final int KEY_AI_CHAT_TIP_SETTINGS = 28;
    public static final int KEY_BACKSPACE = 1;
    public static final int KEY_BAIKE_TOPIC_ASSISTANT = 27;
    public static final int KEY_CAPS_LOCK = 39;
    public static final int KEY_CLIPBOARD_DATA_CLICK = 42;
    public static final int KEY_CLIPBOARD_HISTORY = 40;
    public static final int KEY_CLOSE_APP_UPGRADE_TIPS = 35;
    public static final int KEY_COMMAND_SPEECH = 15;
    public static final int KEY_COMMON_PHRASE = 29;
    public static final int KEY_CUSTOMIZE_SYMBOL_9_NUMBER = 48;
    public static final int KEY_CUSTOMIZE_SYMBOL_9_PY = 47;
    public static final int KEY_CUSTOMIZE_TOOLBAR = 45;
    public static final int KEY_CUSTOMIZE_TOOLBAR_CONFIRM = 46;
    public static final int KEY_DELETECHAR = 10;
    public static final int KEY_DOUBLE_SPELL = 49;
    public static final int KEY_EMOJI = 22;
    public static final int KEY_ENTER = 2;
    public static final int KEY_ENTER_DOWN = 41;
    public static final int KEY_FEEDBACK = 9;
    public static final int KEY_HIDE_HANDWRITE = 51;
    public static final int KEY_LLM_CAND_RETRY = 43;
    public static final int KEY_LOAD_MORE_RECOMMEND = 13;
    public static final int KEY_OPEN_FEEDBACK = 30;
    public static final int KEY_OPEN_FEEDBACK_VOICE = 31;
    public static final int KEY_OPEN_LOGIN = 20;
    public static final int KEY_OPEN_REPLY_SETTING = 21;
    public static final int KEY_RETRY_RECOMMEND = 12;
    public static final int KEY_SET = 8;
    public static final int KEY_SHOW_APP_UPGRADE_DIALOG = 34;
    public static final int KEY_SHOW_HANDWRITE = 50;
    public static final int KEY_SPACE = 3;
    public static final int KEY_START_RECOMMEND = 11;
    public static final int KEY_START_RECORD = 32;
    public static final int KEY_START_SMART_RECOMMEND = 16;
    public static final int KEY_START_SPEECH = 6;
    public static final int KEY_STOP_RECOMMEND = 14;
    public static final int KEY_STOP_RECORD = 33;
    public static final int KEY_STOP_SPEECH = 7;
    public static final int KEY_STOP_SPEECH_ERROR_SHOW = 44;
    public static final int KEY_STOP_SPEECH_WAIT = 36;
    public static final int KEY_SWIPE_DOWN_WITHDRAW_GUIDE = 38;
    public static final int KEY_SWIPE_UP_GUIDE = 37;
    public static final int K_HANS_2_HANT = 2;
    public static final int K_HANT_2_HANS = 1;
    private static final int LLM_REQUEST_DELAY = 0;
    private static final int LLM_RETRY_REQUEST_DELAY = 0;
    private static int MAX_DELETE_OR_SELECT_TEXT_LENGTH = 0;
    private static String PROVIDER_SETTINGS = "content://com.bytedance.android.doubaoime.settings.provider";
    public static String TAG = "KeyboardJni";
    private static final int UPDATE_SELECTION_EVENT_DELAY = 35;
    private static final AtomicBoolean asrLongPresNeedTriggerVibrate;
    private static int context_max_length = 0;
    public static boolean isAsrInput = false;
    public static Boolean isLastBackPress = null;
    public static Boolean isLastReplace = null;
    private static boolean isSupportSystemFontCache = false;
    private static final int kFullContextMaxLength = 65536;
    public static final int kRunnableCommitTaskWaitMillSecond = 100;
    private static long lastInputStateChangeTime = 0;
    private static long lastUpdateConfigTime = 0;
    private static int mCandidatesEnd = 0;
    private static int mCandidatesStart = 0;
    private static String mCompStrLLMRequest = null;
    private static String mCompStrShow = null;
    private static String mCompStrShowLeftContext = null;
    private static String mCurrentAppSearchEditCanPreedit = null;
    private static int mCurrentEditboxAction = 0;
    private static int mCurrentEditboxAppAction = 0;
    public static Boolean mCurrentEditboxIsPasswordType = null;
    private static EnterActionType mCurrentEnterType = null;
    private static String mHalfCandidateLLMRequest = null;
    private static String mHalfCandidateShow = null;
    private static final Handler mHandler;
    private static String mImeMode = null;
    private static ImeService mImeService = null;
    public static Boolean mIsFromBox = null;
    private static Boolean mIsNumberInputBox = null;
    private static final KeyboardJni mKbdJni;
    private static int mNewSelEnd = 0;
    private static int mNewSelStart = 0;
    private static String mRawCompUnconvertLLMRequest = null;
    private static int preEditStartPosition = 0;
    private static volatile boolean sCommonPhraseEditorFocused = false;
    private static volatile boolean sSwitchToEnglishFromHandWriteFlag = false;
    private static final ExecutorService singleThreadExecutor;
    private static int updateSelectType = -1;
    private int mOldSelEnd;
    private int mOldSelStart;
    private SelectionTracker.ActionType mActionFlag = SelectionTracker.ActionType.INNER_NORMAL;
    private final Runnable mPostUpdateSelectionEvent = new Runnable() { // from class: com.bytedance.android.doubaoime.KeyboardJni.1
        /* JADX WARN: Code restructure failed: missing block: B:146:0x04ba, code lost:
        
            if (r5 == null) goto L193;
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x04e8, code lost:
        
            if (android.text.TextUtils.isEmpty(r4) == false) goto L208;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x031b  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x03d6  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x03fd  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x0422  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x042e  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x0491  */
        /* JADX WARN: Removed duplicated region for block: B:160:0x052d  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0536  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x05f6  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0539  */
        /* JADX WARN: Removed duplicated region for block: B:212:0x0530  */
        /* JADX WARN: Removed duplicated region for block: B:219:0x0417  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x040e  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x03dc  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x030d  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1753
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.doubaoime.KeyboardJni.AnonymousClass1.run():void");
        }
    };
    private long mLastHandwriteCommitTime = 0;

    /* renamed from: com.bytedance.android.doubaoime.KeyboardJni$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$bytedance$android$input$popup$WindowId;

        static {
            WindowId.values();
            int[] iArr = new int[24];
            $SwitchMap$com$bytedance$android$input$popup$WindowId = iArr;
            try {
                WindowId windowId = WindowId.FUSIYIN_SWIPE_UP_TIPS_UI;
                iArr[8] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = $SwitchMap$com$bytedance$android$input$popup$WindowId;
                WindowId windowId2 = WindowId.CAPS_LOCK_TIPS_UI;
                iArr2[9] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = $SwitchMap$com$bytedance$android$input$popup$WindowId;
                WindowId windowId3 = WindowId.SWIPE_DOWN_WITHDRAW_TIPS_UI;
                iArr3[10] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = $SwitchMap$com$bytedance$android$input$popup$WindowId;
                WindowId windowId4 = WindowId.SMS_READ_VERIFICATION_PERMISSION_TIPS;
                iArr4[12] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                int[] iArr5 = $SwitchMap$com$bytedance$android$input$popup$WindowId;
                WindowId windowId5 = WindowId.APP_UPGRADE_TIPS_UI;
                iArr5[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                int[] iArr6 = $SwitchMap$com$bytedance$android$input$popup$WindowId;
                WindowId windowId6 = WindowId.ASR_PUNCT_SETTINGS_TIPS_UI;
                iArr6[11] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                int[] iArr7 = $SwitchMap$com$bytedance$android$input$popup$WindowId;
                WindowId windowId7 = WindowId.ASR_SWITCH_CELL_SETTINGS_TIPS_UI;
                iArr7[13] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private enum AppLimitRuler {
        kNone,
        kInLimitLevel1,
        kInAssistant,
        kInBootWizard
    }

    public static final class ChatHistory {
        public String mAppName;
        public String mText;
        public int mTextCursorPosition;
        public long mTimestamp;
        public String mType;

        public String getAppName() {
            return this.mAppName;
        }

        public String getText() {
            return this.mText;
        }

        public int getTextCursorPosition() {
            return this.mTextCursorPosition;
        }

        public long getTimestamp() {
            return this.mTimestamp;
        }

        public String getType() {
            return this.mType;
        }
    }

    public enum CommitType {
        DEFAULT,
        UNDO_CLEAR
    }

    public enum EnterActionType {
        kUnknow,
        kIME_ACTION_NONE,
        kIME_ACTION_GO,
        kIME_ACTION_SEARCH,
        kIME_ACTION_SEND,
        kIME_ACTION_NEXT,
        kIME_ACTION_DONE,
        kIME_ACTION_PREVIOUS,
        kIME_ACTION_SEND_EXPRESSION
    }

    public enum InputBoardType {
        kPinyin26,
        kPinyin9,
        kEnglish26,
        kSymbol,
        kMoreSymbol,
        kNumber,
        kHandwrite,
        kWubi,
        kNumberSymbolEn,
        kNumberSymbolZhCn,
        kNumberFrom26,
        kBoardSwitch,
        kMoreCand,
        kSettings
    }

    private enum InputBoxTextType {
        kUnknown,
        kEnglish,
        kNumber,
        kUri,
        kSymbolNotSwitchBoard
    }

    static class RunnableCommitTask implements Runnable {
        private String commit_text_;

        RunnableCommitTask(String str) {
            this.commit_text_ = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (KeyboardJni.mImeService == null) {
                    com.bytedance.android.input.r.j.m(KeyboardJni.TAG, "mImeService is null");
                    return;
                }
                Thread.sleep(100L);
                com.bytedance.android.input.editor.a q = KeyboardJni.mImeService.q();
                if (q != null) {
                    q.commitText(this.commit_text_, 1);
                }
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public static class SelectionUpdatedParams {
        public String context_after;
        public String context_befor;
        public String delete_text_for_asso_disable;
        public String dstModifyText;
        public boolean enable_correct;
        public boolean has_preedit;
        public boolean has_selected_text;
        public boolean in_asr;
        public boolean is_cursor_change_tag_for_association_disabled;
        public boolean is_cursor_change_tag_for_normal;
        public boolean is_show_idle_input;
        public String[] nbest;
        public boolean need_association;
        public String pre_edit_text;
        public String replace_delete_text;
        public String selected_text;
        public String srcModifyText;
        public int updateSelectType;
    }

    public static class StartInputViewParams {
        public int app_limit_ruler;
        public int association_delay_refresh_ms;
        public int candidate_delay_refresh_ms;
        public boolean caps_mode;
        public int cloud_timeout;
        public String cursorAfter;
        public String cursorBefore;
        public int enter_type;
        public boolean form_box;
        public boolean ime_flag_force_ascii;
        public int input_mode;
        public boolean is_associate_enabled;
        public boolean is_need_switch_send;
        public boolean is_support_association_opt;
        public boolean is_support_emoticons;
        public boolean is_support_pinyin_in_editor;
        public boolean is_sys_emoji_enabled;
        public boolean is_sys_kaomoji_enabled;
        public boolean is_throttle_llm;
        public int keyboard_type;
        public boolean number_box;
        public boolean password_box;
        public int refresh_mode;
        public boolean restarting;
        public boolean single_line;
        public boolean switchBoard;
        public String target_app_name;
        public int three_refresh_timeout;
        public int two_refresh_timeout_for_timer;
        public boolean verification_box;
    }

    public enum ToolbarState {
        kToolbar,
        kCandList,
        kQuickinput,
        kTip,
        kAiWriting
    }

    static {
        String myProcessName = Build.VERSION.SDK_INT >= 33 ? Process.myProcessName() : "";
        com.bytedance.android.input.r.j.m(TAG, "processName is " + myProcessName);
        try {
            System.loadLibrary("ime_ui_android_platform");
        } catch (UnsatisfiedLinkError e2) {
            StringBuilder M = e.a.a.a.a.M("Failed to load native ui library: ");
            M.append(e2.getMessage());
            com.bytedance.android.input.r.j.j("JNI", M.toString());
        }
        try {
            System.loadLibrary(SettingsActivityNext.SETTINGS_SOURCE_KEYBOARD);
        } catch (UnsatisfiedLinkError e3) {
            StringBuilder M2 = e.a.a.a.a.M("Failed to load native keyboard library: ");
            M2.append(e3.getMessage());
            com.bytedance.android.input.r.j.j("JNI", M2.toString());
        }
        try {
            System.loadLibrary("track");
        } catch (UnsatisfiedLinkError e4) {
            StringBuilder M3 = e.a.a.a.a.M("Failed to load native keyboard library: ");
            M3.append(e4.getMessage());
            com.bytedance.android.input.r.j.j("JNI", M3.toString());
        }
        mKbdJni = new KeyboardJni();
        mImeService = null;
        context_max_length = 128;
        mCurrentEditboxAction = 0;
        mCurrentEnterType = EnterActionType.kUnknow;
        mCurrentEditboxAppAction = 0;
        Boolean bool = Boolean.FALSE;
        mCurrentEditboxIsPasswordType = bool;
        mIsFromBox = bool;
        mIsNumberInputBox = bool;
        mHandler = new Handler(Looper.getMainLooper());
        isLastReplace = bool;
        isLastBackPress = bool;
        mCompStrLLMRequest = "";
        mRawCompUnconvertLLMRequest = "";
        mHalfCandidateLLMRequest = "";
        mImeMode = "ime";
        mCompStrShow = "";
        mHalfCandidateShow = "";
        mCompStrShowLeftContext = "";
        mCurrentAppSearchEditCanPreedit = "";
        isSupportSystemFontCache = false;
        isAsrInput = false;
        singleThreadExecutor = Executors.newSingleThreadExecutor();
        preEditStartPosition = -1;
        MAX_DELETE_OR_SELECT_TEXT_LENGTH = 10;
        asrLongPresNeedTriggerVibrate = new AtomicBoolean(true);
        sCommonPhraseEditorFocused = false;
        sSwitchToEnglishFromHandWriteFlag = false;
    }

    private KeyboardJni() {
    }

    public static void BaikeTopicRequest(String str) {
        com.bytedance.android.input.r.j.m(TAG, "BaikeTopicRequest query:" + str);
        Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
        ImeService.x.S(str, Boolean.FALSE);
    }

    public static void CacheMemoryClickHistory(String str) {
        com.bytedance.android.input.q.C.r.a(str);
    }

    public static String ClearText() {
        String str;
        CharSequence charSequence;
        com.bytedance.android.input.r.j.i(TAG, "ClearText");
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return "";
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            return "";
        }
        ExtractedText extractedText = q.getExtractedText(new ExtractedTextRequest(), 0);
        if (extractedText == null || (charSequence = extractedText.text) == null) {
            str = "";
        } else {
            str = charSequence.toString();
            if (str.length() == 0) {
                return "";
            }
        }
        q.beginBatchEdit();
        q.finishComposingText();
        q.setSelection(0, str.length());
        q.commitText("", 1);
        q.deleteSurroundingText(Integer.MAX_VALUE, Integer.MAX_VALUE);
        com.bytedance.android.input.speech.view.l.a.b();
        q.endBatchEdit();
        return str;
    }

    public static void ClearTextBeforeCommit(String str) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        q.beginBatchEdit();
        q.finishComposingText();
        q.commitText("", 1);
        q.deleteSurroundingText(Integer.MAX_VALUE, Integer.MAX_VALUE);
        q.commitText(str, 1);
        q.endBatchEdit();
    }

    public static String ClearTextBeforeCursor() {
        com.bytedance.android.input.r.j.i(TAG, "ClearTextBeforeCursor");
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return "";
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            return "";
        }
        String h = com.bytedance.android.input.m.a.h(Integer.MAX_VALUE);
        if (h.isEmpty()) {
            h = com.bytedance.android.input.m.a.g(Integer.MAX_VALUE);
            if (h.isEmpty()) {
                return "";
            }
            q.beginBatchEdit();
            q.finishComposingText();
            q.setSelection(0, h.length());
            q.commitText("", 1);
            q.deleteSurroundingText(0, Integer.MAX_VALUE);
            com.bytedance.android.input.speech.view.l.a.b();
            q.endBatchEdit();
            getKeyboardJni().setTextAfterCursor("");
        } else {
            q.beginBatchEdit();
            q.finishComposingText();
            q.setSelection(0, h.length());
            q.commitText("", 1);
            q.deleteSurroundingText(Integer.MAX_VALUE, 0);
            com.bytedance.android.input.speech.view.l.a.b();
            q.endBatchEdit();
        }
        return h;
    }

    public static void CompChangeToRequestLLM(String str, String str2, String str3, int i, String str4) {
        String str5 = TAG;
        StringBuilder P = e.a.a.a.a.P("llm-run requestTimeOut=", i, ",ime_mode=", str3, ",mCompStrLLMRequest=");
        e.a.a.a.a.M0(P, mCompStrLLMRequest, ",comp_unconvert=", str2, ",mRawCompUnconvertLLMRequest=");
        e.a.a.a.a.M0(P, mRawCompUnconvertLLMRequest, ",raw_comp_unconvert=", str4, ",mHalfCandidateLLMRequest=");
        P.append(mHalfCandidateLLMRequest);
        P.append(",half=");
        P.append(str);
        com.bytedance.android.input.r.j.i(str5, P.toString());
        if (TextUtils.equals(mCompStrLLMRequest, str2) && TextUtils.equals(mRawCompUnconvertLLMRequest, str4) && TextUtils.equals(mHalfCandidateLLMRequest, str)) {
            com.bytedance.android.input.r.j.i(TAG, "llm-run --------- llm update, but comp str is same, return");
            return;
        }
        com.bytedance.android.input.common_biz.performance.j.o("[android][request][llm] attempt start request LLM");
        mHalfCandidateLLMRequest = str;
        mCompStrLLMRequest = str2;
        mRawCompUnconvertLLMRequest = str4;
        if (str3.isEmpty()) {
            mImeMode = "ime";
        } else {
            mImeMode = str3;
        }
        if (i == -1) {
            i = com.bytedance.android.input.l.c.b();
        }
        e.a.a.a.a.t0("CompChangeToRequestLLM llm-run --- comp_unconvert = ", str2, ", half = ", str, TAG);
        performLLMRequest(i);
    }

    public static void DoCommit(String str, int i) {
        e.a.a.a.a.N0(e.a.a.a.a.V("[DoCommit] DoCommit commit_str: ", str, ", type: ", i, ", isAsrInput:"), isAsrInput, TAG);
        if (mImeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "[DoCommit] mImeService is null");
            return;
        }
        AsrManager.a.p0(true, "commit");
        clearCompStr();
        com.bytedance.android.input.editor.a q = mImeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "[DoCommit] InputConnection is null");
            return;
        }
        com.bytedance.android.input.j.d b = com.bytedance.android.input.j.b.b(new com.bytedance.android.input.j.c(str, i));
        String a = b.a();
        int e2 = b.e();
        String d2 = b.d();
        int b2 = b.b();
        String str2 = TAG;
        StringBuilder V = e.a.a.a.a.V("[DoCommit] after interceptors commit_str: ", a, ", type: ", e2, ", intercepted: ");
        V.append(b.c());
        V.append(", trailingText: '");
        V.append(d2);
        V.append("', deleteBeforeLength: ");
        V.append(b2);
        com.bytedance.android.input.r.j.i(str2, V.toString());
        com.bytedance.android.input.common.o.b();
        com.bytedance.android.input.common.o.a(a.length());
        int length = a.length();
        boolean z = length > 0;
        boolean z2 = length <= 5;
        CommitType commitType = CommitType.UNDO_CLEAR;
        if (e2 == 1) {
            q.a(a, 1);
        } else {
            q.beginBatchEdit();
            if (optTextPreEdit() && preEditStartPosition != -1) {
                q.setComposingRegion(preEditStartPosition, com.bytedance.android.input.common.u.c.a(q));
            }
            if (b2 > 0) {
                q.deleteSurroundingText(b2, 0);
            }
            q.commitText(a, 1);
            if (d2 != null && !d2.isEmpty()) {
                q.commitText(d2, 0);
            }
            q.endBatchEdit();
            com.bytedance.android.input.speech.modifypair.d.a.v(a, "commit", AsrManager.C());
        }
        resetPreEditStartPosition();
        String str3 = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("[DoCommit] validCommit: ");
        sb.append(z);
        sb.append("  commit_len：");
        sb.append(length);
        sb.append(" AsrContext.getInstance().getDeleteCounts(): ");
        AsrContext asrContext = AsrContext.a;
        AsrContext asrContext2 = AsrContext.a;
        sb.append(asrContext2.u());
        com.bytedance.android.input.r.j.i(str3, sb.toString());
        if (z) {
            asrContext2.W(true);
            String str4 = TAG;
            StringBuilder M = e.a.a.a.a.M("[DoCommit] addAsrModifyPairInfo: ");
            M.append(asrContext2.v());
            M.append(" -> ");
            M.append(a);
            com.bytedance.android.input.r.j.i(str4, M.toString());
            if (z2 && length == asrContext2.u()) {
                KeyboardJni keyboardJni = getKeyboardJni();
                String v = asrContext2.v();
                IAppGlobals.a aVar = IAppGlobals.a;
                Objects.requireNonNull(aVar);
                keyboardJni.addAsrModifyPairInfo(v, a, aVar.H());
                e.a.a.a.a.N0(e.a.a.a.a.M("[DoCommit] isAsrInput:"), isAsrInput, TAG);
            }
            com.bytedance.android.input.r.j.i(TAG, "[DoCommit] is not associateEnabledConfig");
            com.bytedance.android.input.r.j.i(TAG, "[delete]: clearDeleteText   03");
            asrContext2.p();
            InputView inputView = ImeService.x;
            if (inputView != null) {
                inputView.h();
            }
        }
    }

    public static void DoFunctionKey(int i) {
        e.a.a.a.a.k0("mImeService type is ", i, TAG);
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        if (i == 1) {
            backspaceClickEvent();
            return;
        }
        if (i == 2) {
            doSendAction();
            return;
        }
        if (i == 41) {
            com.bytedance.android.input.r.j.m(TAG, "StopAsr send down");
            AsrManager.a.p0(true, "send");
            return;
        }
        if (i == 32) {
            com.bytedance.android.input.r.j.m(TAG, "StartRecord");
            AsrManager.a.o0();
            return;
        }
        if (i == 33) {
            com.bytedance.android.input.r.j.m(TAG, "StopRecord");
            AsrManager.a.s0();
            return;
        }
        if (i == 6) {
            com.bytedance.android.input.r.j.m(TAG, "StartAsr from toolbar key down");
            if (AsrManager.a.n0("tool")) {
                InputView inputView = ImeService.x;
                Objects.requireNonNull(inputView);
                inputView.R(true);
                return;
            }
            return;
        }
        if (i == 7) {
            com.bytedance.android.input.r.j.m(TAG, "StopAsr from toolbar key up");
            AsrManager asrManager = AsrManager.a;
            asrManager.P(0);
            asrManager.p0(true, "keyUp");
            return;
        }
        if (i == 36) {
            com.bytedance.android.input.r.j.m(TAG, "StopAsr from function button up");
            AsrManager.a.p0(false, "keyUp");
            return;
        }
        if (i == 44) {
            com.bytedance.android.input.r.j.m(TAG, "StopSpeechErrorShow");
            AsrManager asrManager2 = AsrManager.a;
            if (asrManager2.F()) {
                asrManager2.P(0);
            }
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            if (aVar.d().c()) {
                updateSpeechStyleForHandWriting(false);
            }
            InputView inputView2 = ImeService.x;
            Objects.requireNonNull(inputView2);
            inputView2.R(false);
            return;
        }
        if (i == 35) {
            com.bytedance.android.input.r.j.m(TAG, "点击升级tips bar上的x按钮，需要java层忽略该版本的升级");
            mImeService.B();
            return;
        }
        if (i == 11) {
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            if (!aVar2.F()) {
                C0603x.f2629e.b("本版本暂不支持，敬请期待");
                return;
            } else {
                if (getService().p() == null) {
                    return;
                }
                Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
                V.g();
                ImeService.x.m().p();
                ImeService.A = true;
                return;
            }
        }
        if (i == 16) {
            com.bytedance.android.input.r.j.m(TAG, "ai chat click toolbar smart reply");
            Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
            ImeService.x.Z();
            return;
        }
        if (i == 12) {
            return;
        }
        if (i == 13) {
            z.h();
            return;
        }
        if (i == 14) {
            z.H();
            return;
        }
        if (i == 8) {
            IAppGlobals.a aVar3 = IAppGlobals.a;
            Objects.requireNonNull(aVar3);
            Intent intent = new Intent(aVar3.getContext(), (Class<?>) SettingsActivityNext.class);
            intent.addFlags(268468224);
            intent.putExtra(SettingsActivityNext.SHOW_MAIN_FRAGMENT_BACK_BUTTON, true);
            intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_KEYBOARD);
            aVar3.getContext().startActivity(intent);
            ImeService imeService2 = mImeService;
            if (imeService2 != null) {
                imeService2.requestHideSelf(0);
                return;
            }
            return;
        }
        if (i == 30 || i == 31) {
            showFeedbackActivity(i, false);
            return;
        }
        if (i == 9) {
            com.bytedance.android.input.r.j.f3013f.p(null);
            return;
        }
        if (i == 10) {
            com.bytedance.android.input.editor.a q = imeService.q();
            if (q != null) {
                q.deleteSurroundingText(1, 0);
                return;
            }
            return;
        }
        if (i == 15) {
            AsrManager.a.X();
            return;
        }
        if (i == 20) {
            a.C0063a c0063a = com.bytedance.android.input.common.s.a.a.a;
            Objects.requireNonNull(c0063a);
            IAppGlobals.a aVar4 = IAppGlobals.a;
            Objects.requireNonNull(aVar4);
            c0063a.c(aVar4.getApplication(), null);
            return;
        }
        if (i == 34) {
            imeService.A();
            return;
        }
        if (i == 21) {
            v.o();
            return;
        }
        if (i == 22) {
            ImeService.x.V(true, null, null);
            return;
        }
        if (i == 23 || i == 24 || i == 25) {
            Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
            if (needToast(i)) {
                C0603x.f2629e.a(C0838R.string.ai_toast_text);
                return;
            } else {
                ImeService.z = i;
                V.g();
                return;
            }
        }
        if (i == 26) {
            com.bytedance.android.input.r.j.m(TAG, "ai chat settings menu process begin");
            IAppGlobals.a aVar5 = IAppGlobals.a;
            Objects.requireNonNull(aVar5);
            String string = aVar5.getContext().getString(C0838R.string.is_click_ai_chat_icon);
            SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            if (!((Boolean) SettingsConfigNext.f(string)).booleanValue()) {
                com.bytedance.android.input.r.j.m(TAG, "ai chat icon clicked. update settings config");
                updateSettingsBooleanValue(string, true);
            }
            Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
            InputView inputView3 = ImeService.x;
            Objects.requireNonNull(inputView3);
            inputView3.Z();
            return;
        }
        if (i == 27) {
            com.bytedance.android.input.r.j.m(TAG, "baike topic assistant request");
            Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
            return;
        }
        if (i == 28) {
            Objects.requireNonNull(com.bytedance.android.input.common.s.a.a.a);
            InputView inputView4 = ImeService.x;
            Objects.requireNonNull(inputView4);
            inputView4.Z();
            return;
        }
        if (i == 29) {
            com.bytedance.android.input.r.j.i(TAG, "open common phrase view");
            mImeService.I(true);
            return;
        }
        if (i == 37) {
            com.bytedance.android.input.r.j.i(TAG, "show fusiyin swipe up guide tip");
            IAppGlobals.a aVar6 = IAppGlobals.a;
            Objects.requireNonNull(aVar6);
            showGuideTips(aVar6.getContext().getString(C0838R.string.keyboard_fusiyin_swipe_up_guide_text), aVar6.getContext().getString(C0838R.string.guide_popup_open_action_text), WindowId.FUSIYIN_SWIPE_UP_TIPS_UI);
            return;
        }
        if (i == 39) {
            com.bytedance.android.input.r.j.i(TAG, "show first letter capitalize guide tip");
            IAppGlobals.a aVar7 = IAppGlobals.a;
            Objects.requireNonNull(aVar7);
            showGuideTips(aVar7.getContext().getString(C0838R.string.caps_lock_guide_text), "", WindowId.CAPS_LOCK_TIPS_UI);
            return;
        }
        if (i == 38) {
            com.bytedance.android.input.r.j.i(TAG, "show swipe down withdraw guide tip");
            IAppGlobals.a aVar8 = IAppGlobals.a;
            Objects.requireNonNull(aVar8);
            showGuideTips(aVar8.getContext().getString(C0838R.string.keyboard_swipe_down_withdraw_guide_text), "", WindowId.SWIPE_DOWN_WITHDRAW_TIPS_UI);
            return;
        }
        if (i == 40) {
            com.bytedance.android.input.r.j.i(TAG, "open clipboard history view");
            mImeService.H(true);
            com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
            IAppLog.a.i("clipboard_entrance_click");
            return;
        }
        if (i == 42) {
            com.bytedance.android.input.r.j.i(TAG, "clipboard data click");
            com.bytedance.android.input.i.c cVar2 = com.bytedance.android.input.i.c.a;
            com.bytedance.android.input.i.c.d();
            return;
        }
        if (i == 43) {
            com.bytedance.android.input.r.j.i(TAG, "llm cand retry");
            retryDelayLLMRequest();
            return;
        }
        if (i == 45) {
            com.bytedance.android.input.r.j.i(TAG, "customize toolbar");
            InputView inputView5 = ImeService.x;
            if (inputView5 != null) {
                inputView5.s();
            }
            com.bytedance.android.input.keyboard.CustomToolbar.b.a();
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.android.input.keyboard.CustomToolbar.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.b();
                }
            });
            return;
        }
        if (i == 46) {
            com.bytedance.android.input.r.j.i(TAG, "customize toolbar confirm");
            com.bytedance.android.input.keyboard.CustomToolbar.b.a();
            return;
        }
        if (i == 47) {
            com.bytedance.android.input.r.j.i(TAG, "[custom_symbol] key click 9 py");
            com.bytedance.android.input.fragment.custom_symbol.o.a.d();
            SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.CUSTOM_SYMBOL;
            OpenCustomSymbolPage(18, i);
            return;
        }
        if (i == 48) {
            com.bytedance.android.input.r.j.i(TAG, "[custom_symbol] key click 9 number");
            com.bytedance.android.input.fragment.custom_symbol.o.a.c();
            SettingsActivityNext.FragmentType fragmentType2 = SettingsActivityNext.FragmentType.CUSTOM_SYMBOL;
            OpenCustomSymbolPage(18, i);
            return;
        }
        if (i == 49) {
            com.bytedance.android.input.r.j.i(TAG, "KeyboardInputType select DoubleSpell");
            SettingsActivityNext.FragmentType fragmentType3 = SettingsActivityNext.FragmentType.MULTIPLE_INPUT_TYPE;
            OpenSettings(19);
        } else if (i == 50) {
            com.bytedance.android.input.r.j.i(TAG, "[hand_write] KeyboardInputType select Handwrite");
            mImeService.J(true);
        } else if (i == 51) {
            com.bytedance.android.input.r.j.i(TAG, "hide handwrite");
            mImeService.J(false);
        } else if (i == 52) {
            com.bytedance.android.input.r.j.i(TAG, "backspace for handwrite");
            if (ImeService.x != null) {
                ImeService.x.h();
            }
            getKeyboardJni().handleJavaBackspaceClickEvent();
        }
    }

    private static String ExecutePost(String str, String str2, int i) {
        com.bytedance.android.input.r.j.i(TAG, "ExecutePost url = " + str + ", jsonBody = " + str2);
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            if (str.equals("/api/v1/translate")) {
                String g2 = LLMRequest.a.g(str2);
                com.bytedance.android.input.r.j.i(TAG, "ExecutePost, response is " + g2);
                return g2;
            }
        } catch (Exception e2) {
            e.a.a.a.a.f0(e2, e.a.a.a.a.M("ExecutePost, e = "), TAG);
        }
        return "";
    }

    public static String ExecuteQUICPost(String str, String str2, int i) {
        com.bytedance.android.input.r.j.i(TAG, "ExecuteQUICPost url = " + str + ", timeout_ms = " + i);
        String str3 = "";
        if (TextUtils.isEmpty(str2)) {
            com.bytedance.android.input.r.j.i(TAG, "ExecuteQUICPost error: jsonBody is empty");
            return "";
        }
        if (str.equals("/api/v1/translate")) {
            return ExecutePost(str, str2, i);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            String optString = new JSONObject(str2).optString("Data");
            if (TextUtils.isEmpty(optString)) {
                com.bytedance.android.input.r.j.j(TAG, "ExecuteQUICPost error: data is empty");
                return "";
            }
            com.google.gson.l lVar = new com.google.gson.l();
            String str4 = "ime-cloud";
            if (str.equals("/obric/ime/cloud/wordasso")) {
                str4 = "ime-cloud-word_association";
                IInputSettings.a aVar = IInputSettings.a;
                Objects.requireNonNull(aVar);
                i = aVar.g().b();
                com.bytedance.android.input.r.j.i("RefreshConfig", "[refreshTime] getAssociationSecondRefresh " + i);
            } else if (str.equals("/obric/ime/cloud/prefetch_ctx_regulator")) {
                str4 = "ime-cloud-prefetch_ctx_regulator";
            }
            lVar.g(WsConstants.KEY_APP_ID, str4);
            lVar.g("version", SystemClock.elapsedRealtime() + "");
            lVar.g(RemoteMessageConst.DATA, optString);
            IAppLog.a aVar2 = IAppLog.a;
            Objects.requireNonNull(aVar2);
            lVar.g("did", aVar2.getDeviceId());
            lVar.g("app_version", "1.3.9");
            IAppGlobals.a aVar3 = IAppGlobals.a;
            Objects.requireNonNull(aVar3);
            lVar.g("app_id", "401734");
            lVar.g("os_type", "Android");
            Objects.requireNonNull(aVar3);
            String str5 = (String) SettingsConfigNext.f(aVar3.getContext().getString(C0838R.string.cloud_ppe_set));
            if (!str5.isEmpty()) {
                lVar.g("xttenv", str5);
            }
            com.bytedance.android.input.r.j.i(TAG, "ExecuteQUICPost url = " + str + ", request body = " + lVar);
            int b = com.bytedance.android.input.l.c.b();
            int i2 = i == 0 ? b : i;
            com.bytedance.android.input.r.j.i(TAG, "[time] ExecuteQUICPost, quic timeout_ms setting is " + i2 + "  timeOutSettins=" + b + "  timeout_ms = " + i);
            if (str.contains("convert")) {
                com.bytedance.android.input.common_biz.performance.j.o("[tag:" + uptimeMillis + "][android][request][cloud] start");
            }
            if (str.contains("obric/ime/cloud/wordasso")) {
                com.bytedance.android.input.common_biz.performance.j.o("[android][associate] CloudWordAssociation start");
            }
            com.bytedance.android.input.quic.b bVar = com.bytedance.android.input.quic.b.a;
            kotlin.g<String, String> a = com.bytedance.android.input.quic.b.a(lVar.toString(), i2);
            if (str.contains("convert")) {
                com.bytedance.android.input.common_biz.performance.j.o("[tag:" + uptimeMillis + "][android][request][cloud] finish");
            }
            if (str.contains("obric/ime/cloud/wordasso")) {
                com.bytedance.android.input.common_biz.performance.j.o("[android][associate] CloudWordAssociation finish");
            }
            String c2 = a.c();
            try {
                String d2 = a.d();
                com.bytedance.android.input.r.j.i(TAG, "ExecuteQUICPost url = " + str + ", ret = " + c2 + ", msg = " + d2);
                return c2;
            } catch (Exception e2) {
                e = e2;
                str3 = c2;
                e.a.a.a.a.f0(e, e.a.a.a.a.M("ExecuteQUICPost error: "), TAG);
                return str3;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public static int GetContextMaxLength() {
        return context_max_length;
    }

    public static String GetContextStr(int i) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return "";
        }
        if (imeService.q() == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return "";
        }
        if (i > context_max_length) {
            context_max_length = i;
        }
        int i2 = mNewSelEnd;
        int i3 = mCandidatesEnd;
        int i4 = i2 == i3 ? i3 - mCandidatesStart : 0;
        String h = com.bytedance.android.input.m.a.h(i4 + 128);
        if (h.isEmpty()) {
            return "";
        }
        int length = h.length() - i4;
        if (length < 0) {
            length = h.length();
        }
        return h.substring(0, length);
    }

    private static kotlin.g<String, Integer> GetCurrentSentence(String str, String str2, int i) {
        return mImeService.q() == null ? new kotlin.g<>("", 0) : getTextAndPosition(str, str2, i);
    }

    public static String GetHansOrHant(int i, String str) {
        return TextUtils.isEmpty(str) ? "" : getKeyboardJni().getHansOrHant(i, str);
    }

    public static String GetLatestSentence() {
        mImeService.q();
        String m = com.bytedance.android.input.m.a.m(true);
        int length = mHalfCandidateShow.length() + mCompStrShow.length();
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("llm-run GetLatestSentence mCompStrShow ");
        M.append(mCompStrShow);
        M.append(", mHalfCandidateShow = ");
        M.append(mHalfCandidateShow);
        M.append(", context = ");
        M.append(m);
        com.bytedance.android.input.r.j.i(str, M.toString());
        return (length > m.length() || length <= 0) ? m : m.substring(0, m.length() - length);
    }

    public static void HandwritingCommit(String str) {
        com.bytedance.android.input.p.a aVar = com.bytedance.android.input.p.a.a;
        com.bytedance.android.input.p.a.b(str);
    }

    public static void NotifyUpdateAssociations() {
        AsrEditorLayoutView n = ImeService.x.n();
        if (n == null || n.getVisibility() != 0) {
            return;
        }
        com.bytedance.android.input.r.j.i(TAG, "NotifyUpdateAssociations, update cloud associations");
        com.bytedance.android.input.editor.a q = mImeService.q();
        if (q != null) {
            boolean z = false;
            CharSequence selectedText = q.getSelectedText(0);
            if (selectedText != null && selectedText.length() > 0) {
                z = true;
            }
            e.a.a.a.a.y0("NotifyUpdateAssociations, hasSelectedText = ", z, TAG);
            if (z) {
                return;
            }
            n.u(getKeyboardJni().getAssociations(), true);
        }
    }

    public static void OnBackspaceTouchEvent(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
        BackspaceSwipeWindow.j().r(i, i2, i3, i4, i5, i6, i7, i8);
    }

    public static void OnPageChange(int i, boolean z, String str) {
    }

    public static void OpenCustomSymbolPage(int i, int i2) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Intent intent = new Intent(aVar.getContext(), (Class<?>) SettingsActivityNext.class);
        intent.addFlags(268468224);
        intent.putExtra(SettingsActivityNext.EXTRA_FRAGMENT_TYPE, SettingsActivityNext.FragmentType.values()[i].name());
        intent.putExtra(SettingsActivityNext.SHOW_MAIN_FRAGMENT_BACK_BUTTON, true);
        intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_KEYBOARD);
        if (i2 == 47) {
            intent.putExtra(SettingsActivityNext.EXTRA_KEY_CUSTOM_SYMBOL, SettingsActivityNext.CUSTOM_SYMBOL_PY9);
        } else if (i2 == 48) {
            intent.putExtra(SettingsActivityNext.EXTRA_KEY_CUSTOM_SYMBOL, SettingsActivityNext.CUSTOM_SYMBOL_NUMBER9);
        }
        Objects.requireNonNull(aVar);
        aVar.getContext().startActivity(intent);
        ImeService imeService = mImeService;
        if (imeService != null) {
            imeService.requestHideSelf(0);
        }
    }

    public static void OpenSettings(int i) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Intent intent = new Intent(aVar.getContext(), (Class<?>) SettingsActivityNext.class);
        intent.addFlags(268468224);
        intent.putExtra(SettingsActivityNext.EXTRA_FRAGMENT_TYPE, SettingsActivityNext.FragmentType.values()[i].name());
        intent.putExtra(SettingsActivityNext.SHOW_MAIN_FRAGMENT_BACK_BUTTON, true);
        intent.putExtra(SettingsActivityNext.EXTRA_SETTINGS_SOURCE, SettingsActivityNext.SETTINGS_SOURCE_KEYBOARD);
        Objects.requireNonNull(aVar);
        aVar.getContext().startActivity(intent);
        ImeService imeService = mImeService;
        if (imeService != null) {
            imeService.requestHideSelf(0);
        }
    }

    public static void PlayKeyClick(int i, int i2) {
        VibrationController.VibrationType vibrationType = VibrationController.VibrationType.NONE;
        UserInteractiveManagerNext.KeyVibrate keyVibrate = UserInteractiveManagerNext.KeyVibrate.STANDARD;
        if (i2 == 1) {
            vibrationType = VibrationController.VibrationType.KEY_TYPING;
        } else {
            UserInteractiveManagerNext.KeyVibrate keyVibrate2 = UserInteractiveManagerNext.KeyVibrate.FUNCTION;
            if (i2 == 2) {
                vibrationType = VibrationController.VibrationType.KEY_FUNCTION;
            } else {
                UserInteractiveManagerNext.KeyVibrate keyVibrate3 = UserInteractiveManagerNext.KeyVibrate.NONE;
                if (i2 != 0) {
                    UserInteractiveManagerNext.KeyVibrate keyVibrate4 = UserInteractiveManagerNext.KeyVibrate.LONG_PRESS;
                    if (i2 == 3) {
                        vibrationType = VibrationController.VibrationType.LONG_PRESS;
                    } else {
                        UserInteractiveManagerNext.KeyVibrate keyVibrate5 = UserInteractiveManagerNext.KeyVibrate.CONFIRM;
                        if (i2 == 4) {
                            vibrationType = VibrationController.VibrationType.CONFIRM;
                        }
                    }
                }
            }
        }
        UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.values()[i], UserInteractiveManagerNext.KeyVibrate.values()[i2], vibrationType, false);
    }

    public static void PostEvent(String str) {
        boolean z;
        z = ImeService.B;
        if (z) {
            IAppLog.a aVar = IAppLog.a;
            Objects.requireNonNull(aVar);
            aVar.i(str);
        }
    }

    public static void PostUserImprovementData(String str, String str2) {
        boolean z;
        z = ImeService.B;
        if (z) {
            AsrContext asrContext = AsrContext.a;
            AsrContext.a.P(str2);
        }
    }

    public static void PreviewImages(LinkedHashMap<String, Boolean> linkedHashMap, int i) {
        z.A(linkedHashMap, i);
    }

    public static void ReplaceText(String str) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        q.beginBatchEdit();
        q.performContextMenuAction(R.id.selectAll);
        q.commitText(str, 1);
        q.endBatchEdit();
    }

    public static void ReplaceTextByCursorOffset(int i, String str, String str2) {
        e.a.a.a.a.H0(e.a.a.a.a.P("[CorrectionManager] ReplaceTextByCursorOffset cursorOffset = ", i, " source = ", str, " replace = "), str2, TAG);
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "[CorrectionManager] ReplaceTextByCursorOffset mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "[CorrectionManager] ReplaceTextByCursorOffset InputConnection is null");
            return;
        }
        q.beginBatchEdit();
        if (mCandidatesEnd - mCandidatesStart > 0) {
            q.setComposingText("", 1);
        }
        int d2 = q.d();
        int max = i < 0 ? Math.max(0, d2 - str.length()) : d2 + i;
        com.bytedance.android.input.r.j.i(TAG, "[CorrectionManager] ReplaceTextByCursorOffset cursorPosition = " + d2);
        q.setSelection(max, str.length() + max);
        q.commitText(str2, 1);
        int max2 = i < 0 ? Math.max(0, (str2.length() + d2) - str.length()) : str2.length() + max;
        e.a.a.a.a.m0("[CorrectionManager] ReplaceTextByCursorOffset: before cursor = ", d2, " new cursor = ", max2, TAG);
        q.setSelection(max2, max2);
        q.endBatchEdit();
        com.bytedance.android.input.r.j.i(TAG, "[CorrectionManager] ReplaceTextByCursorOffset: end batch edit");
        handleReportPair(str2, str, isAsrInput);
    }

    public static void SMSCodeCommit(String str) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        if (!com.bytedance.android.input.common.g.b().equals("com.obric.account")) {
            q.beginBatchEdit();
            q.setSelection(Integer.MAX_VALUE, Integer.MAX_VALUE);
            for (int i = 0; i < str.length(); i++) {
                mImeService.sendDownUpKeyEvents(67);
            }
            q.endBatchEdit();
        }
        new Thread(new RunnableCommitTask(str)).start();
    }

    public static void SetImeService(ImeService imeService) {
        mImeService = imeService;
    }

    public static void SetPreeditRange(int i, int i2) {
        com.bytedance.android.input.r.j.i(TAG, "[Preedit] SetPreeditRange 01");
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        e.a.a.a.a.m0("SetPreeditRange befor = ", i, "---after = ", i2, TAG);
        if (i == i2) {
            q.finishComposingText();
            return;
        }
        com.bytedance.android.input.r.j.i(TAG, "[Preedit] SetPreeditRange 02");
        int d2 = q.d();
        int i3 = d2 - i;
        if (i3 < 0) {
            i3 = 0;
        }
        int i4 = d2 + i2;
        if (optTextPreEdit()) {
            preEditStartPosition = i3;
            int a = com.bytedance.android.input.common.u.c.a(q);
            String str = TAG;
            StringBuilder M = e.a.a.a.a.M("SetPreeditRange preEditStartPosition = ");
            e.a.a.a.a.F0(M, preEditStartPosition, "---nowCursor = ", a, "---start = ");
            M.append(i3);
            M.append("---end = ");
            M.append(i4);
            com.bytedance.android.input.r.j.i(str, M.toString());
        }
        q.setComposingRegion(i3, i4);
    }

    public static void ShareImages(List<String> list) {
        z.F(list);
    }

    public static void ShiftCursor(int i) {
        com.bytedance.android.input.r.j.i(TAG, "mImeService is null");
        if (mImeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        if (i != 0) {
            String f2 = com.bytedance.android.input.m.a.f();
            String e2 = com.bytedance.android.input.m.a.e();
            if (i < 0 && !f2.isEmpty()) {
                mImeService.sendDownUpKeyEvents(21);
            }
            if (i <= 0 || e2.isEmpty()) {
                return;
            }
            mImeService.sendDownUpKeyEvents(22);
        }
    }

    public static boolean ShouldShowCandidateInfo() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (!d.a.b.a.h(aVar)) {
            return false;
        }
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        return ((Boolean) SettingsConfigNext.f(context.getString(C0838R.string.enable_open_candidate_Info))).booleanValue();
    }

    public static boolean ShouldShowLlmCornerBadge() {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (!d.a.b.a.h(aVar)) {
            return false;
        }
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        return ((Boolean) SettingsConfigNext.f(context.getString(C0838R.string.enable_llm_color))).booleanValue();
    }

    public static void StartAsrOnSpaceLPress(int i, int i2) {
        asrLongPresNeedTriggerVibrate.set(true);
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        if (!getKeyboardJni().isDeviceSetupComplete(context)) {
            com.bytedance.android.input.r.j.m(TAG, "device setup is incomplete, don't do asr");
            triggerLongPressVibrate();
            showToast(context.getString(C0838R.string.device_setup_is_incomplete));
            return;
        }
        com.bytedance.android.input.speech.L.b bVar = new com.bytedance.android.input.speech.L.b() { // from class: com.bytedance.android.doubaoime.KeyboardJni.3
            @Override // com.bytedance.android.input.speech.L.b
            public void onStartRecord() {
                com.bytedance.android.input.r.j.i(KeyboardJni.TAG, "onStartRecord");
                KeyboardJni.triggerLongPressVibrate();
            }
        };
        AsrManager asrManager = AsrManager.a;
        asrManager.j(bVar);
        if (!asrManager.n0("space")) {
            com.bytedance.android.input.r.j.j(TAG, "removeAudioRecordCallback");
            return;
        }
        InputView inputView = ImeService.x;
        if (inputView == null) {
            com.bytedance.android.input.r.j.j(TAG, "inputView is null");
            return;
        }
        inputView.Q(true);
        triggerLongPressVibrate();
        com.bytedance.android.input.r.j.j(TAG, "showAsrLongPressView true");
    }

    public static void UpdateCompStr(String str, String str2) {
        String replace = str2.replace('\'', ' ');
        String replace2 = str.replace('\'', ' ');
        if (TextUtils.equals(mCompStrShow, replace) && TextUtils.equals(replace2, mHalfCandidateShow)) {
            return;
        }
        com.bytedance.android.input.common.h hVar = com.bytedance.android.input.common.h.a;
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (hVar.a(aVar.getContext()) == 1 && isSupportPinyinInEditor()) {
            cacheCompStrAndPreedit(replace2, replace);
            return;
        }
        int d2 = com.bytedance.android.input.speech.view.o.e().d();
        EnterActionType enterActionType = EnterActionType.kIME_ACTION_SEARCH;
        if (d2 == 3 && isSupportPinyinInEditor()) {
            cacheCompStrAndPreedit(replace2, replace);
        } else {
            clearCompStr();
        }
    }

    public static void UpdateGuideConfig(String str, String str2, String str3, boolean z) {
        kotlin.s.c.l.f(str, "fusiyinVersionCode");
        kotlin.s.c.l.f(str2, "firstLetterCapitalizationVersionCode");
        kotlin.s.c.l.f(str3, "swipeDownWithdrawTip");
        com.bytedance.android.input.r.j.m("GuideConfig", "fusiyinVersionCode: " + str);
        com.bytedance.android.input.r.j.m("GuideConfig", "firstLetterCapitalizationVersionCode: " + str2);
        com.bytedance.android.input.r.j.m("GuideConfig", "canShowRestoreDefaultKeyboardTip: " + z);
        com.bytedance.android.input.r.j.m("GuideConfig", "swipeDownWithdrawTipVersionCode: " + str3);
        IAppGlobals.a.o().edit().putString("fusiyin_guide_version_code", str).putString("first_letter_capitalization_version_code", str2).putString("swipe_down_withdraw_tip", str3).putBoolean("keyboard_show_floating_mode_tip", z).apply();
    }

    public static void UpdateNames(List<String> list) {
        x xVar = x.a;
        x xVar2 = x.a;
        x.g(false, false, null, list);
    }

    public static void UpdatePreedit(String str) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        SelectionTracker s = mImeService.s();
        if (s != null) {
            int j = s.j();
            String str2 = TAG;
            StringBuilder N = e.a.a.a.a.N("UpdatePreedit compositionLen = ", j, "---tracker = ");
            N.append(s.l());
            com.bytedance.android.input.r.j.i(str2, N.toString());
            if (j == 0) {
                resetPreEditStartPosition();
            }
            if (str.isEmpty() && j == 0) {
                return;
            }
        }
        q.beginBatchEdit();
        long currentTimeMillis = System.currentTimeMillis();
        boolean optTextPreEdit = optTextPreEdit();
        if (optTextPreEdit) {
            int a = com.bytedance.android.input.common.u.c.a(q);
            if (preEditStartPosition == -1 && a >= 0) {
                if (com.bytedance.android.input.common.r.e()) {
                    preEditStartPosition = 0;
                } else {
                    preEditStartPosition = a;
                }
            }
            int i = preEditStartPosition;
            if (i != -1) {
                q.setComposingRegion(i, a);
            }
            String str3 = TAG;
            StringBuilder M = e.a.a.a.a.M("UpdatePreedit preEditStartPosition = ");
            e.a.a.a.a.F0(M, preEditStartPosition, "---nowCursor = ", a, "---preedit_str = ");
            e.a.a.a.a.H0(M, str, str3);
        }
        q.setComposingText(str, 1);
        q.endBatchEdit();
        String str4 = TAG;
        StringBuilder X = e.a.a.a.a.X("UpdatePreedit enablePreEditOpt = ", optTextPreEdit, "cost time = ");
        X.append(System.currentTimeMillis() - currentTimeMillis);
        com.bytedance.android.input.r.j.i(str4, X.toString());
    }

    public static void UpdateTraditionalConfig(boolean z) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        updateSettingsBooleanValue(aVar.getContext().getString(C0838R.string.is_hant_enabled), z);
        if (z) {
            Objects.requireNonNull(aVar);
            String string = aVar.getContext().getString(C0838R.string.hant_toast_shown);
            SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
            if (((Boolean) SettingsConfigNext.f(string)).booleanValue()) {
                return;
            }
            C0603x.f2629e.d("已启用繁体输入");
            updateSettingsBooleanValue(string, true);
            return;
        }
        Objects.requireNonNull(aVar);
        String string2 = aVar.getContext().getString(C0838R.string.hans_toast_shown);
        SettingsConfigNext settingsConfigNext2 = SettingsConfigNext.a;
        if (((Boolean) SettingsConfigNext.f(string2)).booleanValue()) {
            return;
        }
        C0603x.f2629e.d("已启用简体输入");
        updateSettingsBooleanValue(string2, true);
    }

    public static void UpdateWindowStatus(int i, int i2, int i3, int i4) {
        BackspaceSwipeWindow backspaceSwipeWindow = BackspaceSwipeWindow.w;
        BackspaceSwipeWindow.j().w(i, i2, i3, i4);
    }

    static /* synthetic */ void a(com.bytedance.android.input.popup.i iVar, View view) {
        com.bytedance.android.input.popup.q.f().d(iVar.f());
        mImeService.q().commitText(iVar.n(), 1);
    }

    static void b(com.bytedance.android.input.popup.m mVar, WindowId windowId, View view) {
        com.bytedance.android.input.popup.q.f().d(mVar.f());
        int ordinal = windowId.ordinal();
        if (ordinal == 7) {
            com.bytedance.android.input.r.j.i(TAG, "app upgrade tips action button clicked.");
            mImeService.A();
            return;
        }
        if (ordinal == 8) {
            com.bytedance.android.input.r.j.i(TAG, "fusiyin swipe up tips action button clicked");
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            updateSettingsBooleanValue(aVar.getContext().getString(C0838R.string.enable_key_fusiyin), true);
            return;
        }
        if (ordinal == 11) {
            com.bytedance.android.input.r.j.i(TAG, "asr punct settings tips action button clicked");
            SettingsActivityNext.FragmentType fragmentType = SettingsActivityNext.FragmentType.VOICE_INPUT;
            OpenSettings(2);
        } else {
            if (ordinal != 12) {
                return;
            }
            com.bytedance.android.input.r.j.i(TAG, "sms verification tips action button clicked.");
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            updateSettingsBooleanValue(aVar2.getContext().getString(C0838R.string.sms_verification_enabled), true);
            j1.a();
        }
    }

    public static boolean backspaceClickEvent() {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return false;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.r(TAG, "InputConnection is null");
            return false;
        }
        CharSequence selectedText = q.getSelectedText(0);
        if (selectedText != null && selectedText.length() > 0) {
            int d2 = q.d();
            AsrContext asrContext = AsrContext.a;
            AsrContext asrContext2 = AsrContext.a;
            asrContext2.X(d2 - selectedText.length(), d2);
            asrContext2.h(selectedText.toString());
            asrContext2.g(selectedText.length());
            q.commitText("", 1);
            return true;
        }
        com.bytedance.android.input.r.j.i(TAG, "[delete]  inputconnection");
        if (mImeService.u(q)) {
            q.sendKeyEvent(new KeyEvent(0, 67));
            com.bytedance.android.input.r.j.m(TAG, "backspaceClickEvent is common phrase ic, return");
            return true;
        }
        AsrManager.a.p0(true, "backspace");
        String i = com.bytedance.android.input.m.a.i(1);
        com.bytedance.android.input.r.j.i(TAG, "[delete] inputconnection textBefore: " + i);
        if (!i.isEmpty()) {
            int d3 = q.d();
            AsrContext asrContext3 = AsrContext.a;
            AsrContext asrContext4 = AsrContext.a;
            asrContext4.X(d3 - 1, d3);
            asrContext4.h(i);
            asrContext4.g(1);
            com.bytedance.android.input.m.a.q(i);
        }
        mImeService.sendDownUpKeyEvents(67);
        return true;
    }

    static /* synthetic */ void c(com.bytedance.android.input.popup.m mVar, WindowId windowId, View view) {
        com.bytedance.android.input.r.j.i(TAG, "showGuideTips right close button clicked");
        com.bytedance.android.input.popup.q.f().d(mVar.f());
        if (windowId == WindowId.APP_UPGRADE_TIPS_UI) {
            mImeService.B();
        }
    }

    private static void cacheCompStrAndPreedit(String str, String str2) {
        if (mCompStrShow.isEmpty()) {
            mCompStrShowLeftContext = com.bytedance.android.input.m.a.m(true);
        }
        UpdatePreedit(str + str2);
        mHalfCandidateShow = str;
        mCompStrShow = str2;
        e.a.a.a.a.H0(e.a.a.a.a.W("UpdateCompStr half ", str, ", comp_unconvert = ", str2, ", leftcontext = "), mCompStrShowLeftContext, TAG);
    }

    private kotlin.g<EnterActionType, Integer> checkEnterType(EditorInfo editorInfo) {
        EnterActionType enterActionType = EnterActionType.kUnknow;
        if (mImeService == null) {
            return new kotlin.g<>(enterActionType, 0);
        }
        mCurrentEditboxAppAction = editorInfo == null ? 1 : editorInfo.imeOptions;
        mCurrentEditboxAction = editorInfo != null ? editorInfo.imeOptions & 1073742079 : 1;
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("[Editor] eneteraction=");
        M.append(Integer.toHexString(mCurrentEditboxAction));
        M.append(", eidt action = ");
        M.append(Integer.toHexString(mCurrentEditboxAppAction));
        com.bytedance.android.input.r.j.i(str, M.toString());
        switch (mCurrentEditboxAction) {
            case 1:
                enterActionType = EnterActionType.kIME_ACTION_NONE;
                break;
            case 2:
                enterActionType = EnterActionType.kIME_ACTION_GO;
                break;
            case 3:
                enterActionType = EnterActionType.kIME_ACTION_SEARCH;
                break;
            case 4:
                enterActionType = com.bytedance.android.input.common.r.a(mImeService.getApplicationContext(), editorInfo) ? EnterActionType.kIME_ACTION_SEND_EXPRESSION : EnterActionType.kIME_ACTION_SEND;
                com.bytedance.android.input.r.j.i(TAG, "[Editor] is IME_ACTION_SEND");
                break;
            case 5:
                enterActionType = EnterActionType.kIME_ACTION_NEXT;
                break;
            case 6:
                enterActionType = EnterActionType.kIME_ACTION_DONE;
                break;
            case 7:
                enterActionType = EnterActionType.kIME_ACTION_PREVIOUS;
                break;
        }
        mCurrentEnterType = enterActionType;
        return new kotlin.g<>(enterActionType, Integer.valueOf(enterActionType.ordinal()));
    }

    private int checkInputBoxTextType(EditorInfo editorInfo) {
        int i = editorInfo == null ? 0 : editorInfo.inputType & 15;
        if (editorInfo != null && editorInfo.inputType == 16) {
            InputBoxTextType inputBoxTextType = InputBoxTextType.kUri;
            return 3;
        }
        if (editorInfo != null && TextUtils.equals("private_option_ime_symbol_keyboard", editorInfo.privateImeOptions)) {
            InputBoxTextType inputBoxTextType2 = InputBoxTextType.kSymbolNotSwitchBoard;
            return 4;
        }
        InputBoxTextType inputBoxTextType3 = InputBoxTextType.kUnknown;
        if (i == 1) {
            int i2 = editorInfo.inputType & 4080;
            if (i2 == 32 || i2 == 128 || i2 == 144 || i2 == 224) {
                inputBoxTextType3 = InputBoxTextType.kEnglish;
            } else if (i2 == 16) {
                inputBoxTextType3 = InputBoxTextType.kUri;
            }
        } else if (i == 2 || i == 3 || i == 4) {
            inputBoxTextType3 = InputBoxTextType.kNumber;
        }
        return inputBoxTextType3.ordinal();
    }

    private boolean checkPassword(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return false;
        }
        int i = editorInfo.inputType;
        int i2 = i & 4080;
        return i2 == 128 || i2 == 224 || i2 == 144 || ((i & 2) != 0 && i2 == 16);
    }

    private boolean checkSigleLine(EditorInfo editorInfo) {
        return editorInfo == null || ((editorInfo.inputType & 16773120) & 131072) == 0;
    }

    private boolean checkVerification(EditorInfo editorInfo) {
        int i = editorInfo == null ? 0 : editorInfo.inputType & 15;
        return i == 2 || i == 3;
    }

    private static void clearCompStr() {
        mCompStrShow = "";
        mHalfCandidateShow = "";
        mCompStrShowLeftContext = "";
    }

    private static void clearLLmCache() {
        mCompStrLLMRequest = "";
        mRawCompUnconvertLLMRequest = "";
        mHalfCandidateLLMRequest = "";
    }

    static /* synthetic */ void d(WindowId windowId) {
        if (windowId == WindowId.APP_UPGRADE_TIPS_UI) {
            com.bytedance.android.input.r.j.i(TAG, "showGuideTips auto dismissed");
            mImeService.B();
        }
    }

    public static void doSendAction() {
        e.a.a.a.a.B0(e.a.a.a.a.M("[Editor] doSendAction mCurrentEditboxAction:"), mCurrentEditboxAction, TAG);
        switch (mCurrentEditboxAction) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                com.bytedance.android.input.r.j.i(TAG, "[Editor] doSendAction mCurrentEditboxAction 01");
                com.bytedance.android.input.editor.a q = mImeService.q();
                com.bytedance.android.input.j.b.c();
                if (q == null || !q.performEditorAction(mCurrentEditboxAction)) {
                    mImeService.sendDownUpKeyEvents(66);
                }
                int i = mCurrentEditboxAction;
                if (i == 5 || i == 7) {
                    com.bytedance.android.input.speech.modifypair.d.a.s();
                    break;
                }
                break;
            default:
                com.bytedance.android.input.r.j.i(TAG, "[Editor] doSendAction mCurrentEditboxAction 02");
                com.bytedance.android.input.editor.a q2 = mImeService.q();
                if (q2 != null && mImeService.u(q2)) {
                    String str = TAG;
                    StringBuilder M = e.a.a.a.a.M("mCurrentExidboxAction:");
                    M.append(mCurrentEditboxAction);
                    M.append("current ic is common phrase edit view. sendKeyEvent enter");
                    com.bytedance.android.input.r.j.i(str, M.toString());
                    q2.sendKeyEvent(new KeyEvent(0, 66));
                    break;
                } else {
                    AsrManager.a.p0(true, "send");
                    com.bytedance.android.input.j.b.c();
                    mImeService.sendDownUpKeyEvents(66);
                    break;
                }
                break;
        }
    }

    private static String findSubSentenceFromLast(String str, char[] cArr) {
        HashSet hashSet = new HashSet();
        for (char c2 : cArr) {
            hashSet.add(Character.valueOf(c2));
        }
        if (str.length() < 2) {
            return str;
        }
        for (int length = str.length() - 2; length >= 0; length--) {
            if (hashSet.contains(Character.valueOf(str.charAt(length)))) {
                return str.substring(length + 1);
            }
        }
        return str;
    }

    public static void finishPreedit(boolean z) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        if (!z) {
            q.setComposingText("", 1);
        }
        com.bytedance.android.input.r.j.i(TAG, "finishPreedit commit_preedit = " + z);
        q.finishComposingText();
        clearCompStr();
    }

    public static void forceUpdateProviderValue(String str, int i) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Uri parse = Uri.parse(PROVIDER_SETTINGS);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(str, i);
            bundle.putBoolean("forceUpdate", true);
            context.getContentResolver().call(parse, "updateValues", str, bundle);
        } catch (Exception unused) {
        }
    }

    public static String getActionTypeName(int i) {
        EnterActionType enterActionType = EnterActionType.kIME_ACTION_GO;
        if (i == 2) {
            return "go";
        }
        EnterActionType enterActionType2 = EnterActionType.kIME_ACTION_SEARCH;
        if (i == 3) {
            return "search";
        }
        EnterActionType enterActionType3 = EnterActionType.kIME_ACTION_SEND;
        if (i == 4) {
            return "send";
        }
        EnterActionType enterActionType4 = EnterActionType.kIME_ACTION_SEND_EXPRESSION;
        if (i == 8) {
            return "send";
        }
        EnterActionType enterActionType5 = EnterActionType.kIME_ACTION_NEXT;
        if (i == 5) {
            return "continue";
        }
        EnterActionType enterActionType6 = EnterActionType.kIME_ACTION_DONE;
        if (i == 6) {
            return "done";
        }
        EnterActionType enterActionType7 = EnterActionType.kIME_ACTION_PREVIOUS;
        return i == 7 ? "previous" : "enter";
    }

    public static List<ChatHistory> getChatHistory() throws JSONException {
        ArrayList arrayList = new ArrayList();
        kotlin.s.c.l.f("LLM联想", "from");
        Boolean bool = (Boolean) e.a.a.a.a.L0(IAppGlobals.a, C0838R.string.enable_cloud_use_partial_input, "IAppGlobals.context.getS…_cloud_use_partial_input)", "null cannot be cast to non-null type kotlin.Boolean");
        com.bytedance.android.input.r.j.i("CloudConfig", "isSupportCoundUsePartialInput, from=LLM联想 state: " + bool.booleanValue());
        if (bool.booleanValue()) {
            AsrContext asrContext = AsrContext.a;
            List<JSONObject> s = AsrContext.a.s();
            if (s != null) {
                int i = 0;
                for (JSONObject jSONObject : s) {
                    ChatHistory chatHistory = new ChatHistory();
                    chatHistory.mAppName = jSONObject.optString("app_apk_name");
                    chatHistory.mType = jSONObject.optString("type");
                    chatHistory.mTimestamp = jSONObject.optLong(CrashHianalyticsData.TIME);
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(RemoteMessageConst.DATA));
                    chatHistory.mText = jSONObject2.optString("text");
                    chatHistory.mTextCursorPosition = jSONObject2.optInt("cursor_position");
                    arrayList.add(chatHistory);
                    i++;
                    if (i >= 3) {
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    public static EnterActionType getCurrentEnterType() {
        return mCurrentEnterType;
    }

    public static String getForecastBeforeText(String str, long j) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (str == null) {
            str = "";
        }
        try {
            CommitType commitType = CommitType.DEFAULT;
            com.bytedance.android.input.j.d b = com.bytedance.android.input.j.b.b(new com.bytedance.android.input.j.c(str, 0));
            String textBeforeCursorStrippingComposing = getTextBeforeCursorStrippingComposing();
            String a = b.a();
            int b2 = b.b();
            if (b2 > 0 && !textBeforeCursorStrippingComposing.isEmpty()) {
                int min = Math.min(b2, textBeforeCursorStrippingComposing.length());
                Objects.requireNonNull(aVar);
                textBeforeCursorStrippingComposing = textBeforeCursorStrippingComposing.substring(0, textBeforeCursorStrippingComposing.length() - min);
            }
            if (!a.isEmpty()) {
                String d2 = b.d();
                if (!d2.isEmpty() && a.endsWith(d2)) {
                    a = a.substring(0, a.length() - d2.length());
                }
                int length = a.length();
                while (length > 0 && Character.isWhitespace(a.charAt(length - 1))) {
                    length--;
                }
                if (length < a.length()) {
                    a = a.substring(0, length);
                }
            }
            str = textBeforeCursorStrippingComposing + a;
        } catch (Throwable th) {
            e.a.a.a.a.v0("[ImeCommitInterceptor] getForecastBeforeText error, fallback to raw commitStr, err=", th, TAG);
        }
        if (j > 0) {
            Objects.requireNonNull(IAppGlobals.a);
        } else {
            Objects.requireNonNull(IAppGlobals.a);
        }
        return str;
    }

    public static String getHttpProxyHost() {
        String property = System.getProperty("http.proxyHost", "");
        e.a.a.a.a.r0("host:", property, TAG);
        return property;
    }

    public static String getHttpProxyPort() {
        String property = System.getProperty("http.proxyPort", "");
        e.a.a.a.a.r0("port:", property, TAG);
        return property;
    }

    private static String getInputboxContent(@NonNull InputConnection inputConnection, int i) {
        String s = e.a.a.a.a.s(com.bytedance.android.input.m.a.l(), com.bytedance.android.input.m.a.j());
        e.a.a.a.a.r0("text:", s, "memoryReport");
        return s;
    }

    public static KeyboardJni getKeyboardJni() {
        return mKbdJni;
    }

    public static int getOrientation() {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return 0;
        }
        int i = imeService.getResources().getConfiguration().orientation;
        e.a.a.a.a.j0("orientation: ", i, "ImeService");
        return i;
    }

    public static int getPreeditComposingLength() {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return 0;
        }
        SelectionTracker s = imeService.s();
        if (s == null) {
            com.bytedance.android.input.r.j.m(TAG, "SelectionTracker is null");
            return 0;
        }
        int j = s.j();
        e.a.a.a.a.j0("SelectionTracker composingLength=", j, TAG);
        return j;
    }

    public static String getPreeditText() {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return "";
        }
        SelectionTracker s = imeService.s();
        if (s != null) {
            return s.k();
        }
        com.bytedance.android.input.r.j.m(TAG, "SelectionTracker is null");
        return "";
    }

    public static int getProviderIntValue(String str, int i) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Uri parse = Uri.parse(PROVIDER_SETTINGS);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("defaultValue", i);
            Bundle call = context.getContentResolver().call(parse, "getIntValue", str, bundle);
            if (call != null && call.getBoolean("result", false)) {
                return call.getInt(PushLog.KEY_VALUE, i);
            }
        } catch (Exception e2) {
            e.a.a.a.a.f0(e2, e.a.a.a.a.M("getProviderIntValue"), TAG);
        }
        return i;
    }

    public static ImeService getService() {
        return mImeService;
    }

    private static kotlin.g<String, Integer> getTextAndPosition(String str, String str2, int i) {
        String str3;
        char[] cArr = {'.', 12290, '?', 65311, '!', 65281, ' ', '\n'};
        String findSubSentenceFromLast = findSubSentenceFromLast(str, cArr);
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 8; i2++) {
            hashSet.add(Character.valueOf(cArr[i2]));
        }
        int i3 = 0;
        while (true) {
            if (i3 >= str2.length()) {
                str3 = "";
                break;
            }
            if (hashSet.contains(Character.valueOf(str2.charAt(i3)))) {
                str3 = str2.substring(0, i3 + 1);
                break;
            }
            i3++;
        }
        if (!str3.isEmpty()) {
            str2 = str3;
        }
        return new kotlin.g<>(e.a.a.a.a.s(findSubSentenceFromLast, str2), Integer.valueOf(findSubSentenceFromLast.codePointCount(0, findSubSentenceFromLast.length()) - i));
    }

    public static String getTextBeforeCursorStrippingComposing() {
        String l = com.bytedance.android.input.m.a.l();
        try {
            int preeditComposingLength = getPreeditComposingLength();
            if (preeditComposingLength <= 0) {
                return l;
            }
            if (preeditComposingLength >= l.length()) {
                com.bytedance.android.input.r.j.i(TAG, "[ImeCommitInterceptor] before context fully covered by composing, raw='" + l + "', composingLen=" + preeditComposingLength);
                return "";
            }
            String substring = l.substring(0, l.length() - preeditComposingLength);
            com.bytedance.android.input.r.j.i(TAG, "[ImeCommitInterceptor] strip composing from before, raw='" + l + "', composingLen=" + preeditComposingLength + ", stripped='" + substring + "'");
            return substring;
        } catch (Exception e2) {
            e.a.a.a.a.o0("getTextBeforeCursorStrippingComposing exception = ", e2, TAG);
            return l;
        }
    }

    public static int getTextLengthAfterCursor(int i) {
        return com.bytedance.android.input.m.a.k(true).length();
    }

    public static int getTextLengthBeforeCursor(int i) {
        return com.bytedance.android.input.m.a.m(true).length();
    }

    public static String getValidTextBeforeCursor() {
        return com.bytedance.android.input.m.a.l();
    }

    public static void handleReportPair(String str, String str2, boolean z) {
        e.a.a.a.a.N0(e.a.a.a.a.W("[handleReportPair] commit_str: ", str, ", delete_str: ", str2, ", is_asr: "), z, TAG);
        if (z) {
            ImeService imeService = mImeService;
            if (imeService == null) {
                com.bytedance.android.input.r.j.m(TAG, "[handleReportPair] mImeService is null");
                return;
            }
            if (imeService.q() == null) {
                com.bytedance.android.input.r.j.m(TAG, "[handleReportPair] InputConnection is null");
                return;
            }
            isLastReplace = Boolean.TRUE;
            String n = com.bytedance.android.input.m.a.n();
            String j = com.bytedance.android.input.m.a.j();
            AsrContext asrContext = AsrContext.a;
            AsrContext.a.W(true);
            String str3 = TAG;
            StringBuilder W = e.a.a.a.a.W("[handleReportPair] addAsrModifyPairInfo: ", str2, " -> ", str, ", unSubmitStrBefore: ");
            W.append(n);
            W.append(", unSubmitStrAfter: ");
            W.append(j);
            com.bytedance.android.input.r.j.i(str3, W.toString());
            com.bytedance.android.input.speech.modifypair.d.a.u(str, str2, n, j);
        }
    }

    public static boolean hasPreedit() {
        return getPreeditComposingLength() > 0;
    }

    public static void hideFusiyinSingleBubble() {
        KeyboardView.hideFusiyinSingleBubble();
    }

    public static void hideToast() {
        mImeService.t();
    }

    public static void inputStateChange() {
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] inputStateChange 01");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.d0(false);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastInputStateChangeTime < 10) {
            return;
        }
        lastInputStateChangeTime = currentTimeMillis;
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] inputStateChange 02");
        if (com.bytedance.android.input.keyboard.areacontrol.k.Q()) {
            int intValue = ((Integer) SettingsConfigNext.e(C0838R.string.last_one_hand_input_state)).intValue();
            e.a.a.a.a.j0("[hand_write] inputStateChange 03 lastOneHandMode:", intValue, TAG);
            if (intValue == -1) {
                boolean booleanValue = ((Boolean) SettingsConfigNext.e(C0838R.string.enable_one_hand_input_mode)).booleanValue();
                com.bytedance.android.input.r.j.i(TAG, "[hand_write] inputStateChange 03 newLastOneHandInputState:" + (booleanValue ? 1 : 0) + " oneHandMode:" + booleanValue);
                SettingsConfigNext.k(C0838R.string.last_one_hand_input_state, Integer.valueOf(booleanValue ? 1 : 0));
                if (booleanValue) {
                    SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.FALSE);
                }
            }
            updateEnterTextForHandWrite();
        } else {
            int intValue2 = ((Integer) SettingsConfigNext.e(C0838R.string.last_one_hand_input_state)).intValue();
            if (intValue2 == 1) {
                SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.TRUE);
            } else if (intValue2 == 0) {
                SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.FALSE);
            }
            SettingsConfigNext.k(C0838R.string.last_one_hand_input_state, -1);
            e.a.a.a.a.j0("[hand_write] inputStateChange 04 lastOneHandMode:", intValue2, TAG);
        }
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.o0(false);
        }
    }

    public static boolean isFloatingMode() {
        ImeService imeService = mImeService;
        if (imeService != null) {
            return imeService.v();
        }
        com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
        return false;
    }

    public static boolean isFromNumberSpecialBoard() {
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] isFromNumberSpecialBoard");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        return com.bytedance.android.input.keyboard.areacontrol.k.T();
    }

    public static boolean isNetworkAvailable() {
        try {
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            if (!aVar.a().w()) {
                return true;
            }
            IAppGlobals.a aVar2 = IAppGlobals.a;
            Objects.requireNonNull(aVar2);
            return NetworkUtils.g(aVar2.getContext());
        } catch (Exception e2) {
            com.bytedance.android.input.r.j.k(TAG, "isNetworkAvailable exception", e2);
            return true;
        }
    }

    private static boolean isNotHitInterceptorApp() {
        kotlin.g gVar;
        com.bytedance.android.input.basic.settings.api.c.f fVar;
        try {
            com.bytedance.android.input.r.j.i(TAG, "[Preedit] isNotHitInterceptorApp");
            IInputSettings.a aVar = IInputSettings.a;
            Objects.requireNonNull(aVar);
            if (aVar.f().b()) {
                Objects.requireNonNull(aVar);
                List<com.bytedance.android.input.basic.settings.api.c.f> a = aVar.f().a();
                com.bytedance.android.input.r.j.i(TAG, "isNotHitInterceptorApp disDisplayedConfigs=" + a);
                if (!a.isEmpty()) {
                    Iterator<com.bytedance.android.input.basic.settings.api.c.f> it2 = a.iterator();
                    while (true) {
                        gVar = null;
                        if (!it2.hasNext()) {
                            fVar = null;
                            break;
                        }
                        fVar = it2.next();
                        com.bytedance.android.input.r.j.i(TAG, "isNotHitInterceptorApp getPkg " + fVar.b() + ", minVer = " + fVar.a() + ", specVer = " + fVar.c());
                        String b = fVar.b();
                        IAppGlobals.a aVar2 = IAppGlobals.a;
                        Objects.requireNonNull(aVar2);
                        if (TextUtils.equals(b, aVar2.H())) {
                            break;
                        }
                    }
                    if (fVar != null) {
                        long a2 = fVar.a();
                        String c2 = fVar.c();
                        IAppGlobals.a aVar3 = IAppGlobals.a;
                        Objects.requireNonNull(aVar3);
                        Context context = aVar3.getContext();
                        String b2 = fVar.b();
                        kotlin.s.c.l.f(context, "context");
                        kotlin.s.c.l.f(b2, DBDefinition.PACKAGE_NAME);
                        try {
                            PackageManager packageManager = context.getPackageManager();
                            int i = Build.VERSION.SDK_INT;
                            PackageInfo packageInfo = i >= 28 ? packageManager.getPackageInfo(b2, 128) : packageManager.getPackageInfo(b2, 0);
                            gVar = new kotlin.g(packageInfo.versionName, Long.valueOf(i >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode));
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                        if (gVar == null) {
                            return true;
                        }
                        Long l = (Long) gVar.d();
                        com.bytedance.android.input.r.j.i(TAG, "isNotHitInterceptorApp versionName " + ((String) gVar.c()) + ", versionCode = " + l);
                        if (l == null) {
                            return true;
                        }
                        if (!c2.isEmpty() && c2.contains(l.toString())) {
                            return false;
                        }
                        if (l.longValue() >= a2 && a2 > 0) {
                            return false;
                        }
                    }
                }
            }
            com.bytedance.android.input.r.j.i(TAG, "isNotHitInterceptorApp finish~");
            return true;
        } catch (Exception e2) {
            e.a.a.a.a.o0("isNotHitInterceptorApp ex=", e2, TAG);
            return true;
        }
    }

    public static boolean isPhraseInputCodeViewFocused() {
        return mImeService.w();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (android.text.TextUtils.equals(r0, r2.H()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean isSupportPinyinInEditor() {
        /*
            boolean r0 = com.bytedance.android.doubaoime.KeyboardJni.sCommonPhraseEditorFocused
            r1 = 1
            if (r0 != 0) goto L26
            boolean r0 = isNotHitInterceptorApp()
            if (r0 == 0) goto L26
            java.lang.String r0 = com.bytedance.android.doubaoime.KeyboardJni.mCurrentAppSearchEditCanPreedit
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L24
            java.lang.String r0 = com.bytedance.android.doubaoime.KeyboardJni.mCurrentAppSearchEditCanPreedit
            com.bytedance.android.input.basic.IAppGlobals$a r2 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r2)
            java.lang.String r2 = r2.H()
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L26
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = 0
        L27:
            com.bytedance.android.input.common.h r2 = com.bytedance.android.input.common.h.a
            com.bytedance.android.input.basic.IAppGlobals$a r3 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r3)
            android.content.Context r4 = r3.getContext()
            int r2 = r2.a(r4)
            if (r2 != r1) goto L6f
            if (r0 != 0) goto L6f
            java.lang.String r1 = com.bytedance.android.doubaoime.KeyboardJni.TAG
            java.lang.String r2 = "isSupportPinyinInEditor "
            java.lang.StringBuilder r2 = e.a.a.a.a.M(r2)
            boolean r4 = com.bytedance.android.doubaoime.KeyboardJni.sCommonPhraseEditorFocused
            r2.append(r4)
            java.lang.String r4 = ", "
            r2.append(r4)
            boolean r5 = isNotHitInterceptorApp()
            r2.append(r5)
            r2.append(r4)
            java.lang.String r5 = com.bytedance.android.doubaoime.KeyboardJni.mCurrentAppSearchEditCanPreedit
            r2.append(r5)
            r2.append(r4)
            java.util.Objects.requireNonNull(r3)
            java.lang.String r3 = r3.H()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.android.input.r.j.i(r1, r2)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.doubaoime.KeyboardJni.isSupportPinyinInEditor():boolean");
    }

    public static boolean isSupportSystemFont() {
        e.a.a.a.a.N0(e.a.a.a.a.M("[initialize] isSupportSystemFont isSupportSystemFontCache="), isSupportSystemFontCache, TAG);
        return isSupportSystemFontCache;
    }

    private void markAppNotSupportPinyinInEditor() {
        if (!mCurrentAppSearchEditCanPreedit.isEmpty()) {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            if (aVar.H().equals(mCurrentAppSearchEditCanPreedit)) {
                return;
            }
        }
        com.bytedance.android.input.editor.a q = mImeService.q();
        if (q != null) {
            q.beginBatchEdit();
            q.deleteSurroundingText(mHalfCandidateShow.length() + mCompStrShow.length(), 0);
            q.endBatchEdit();
        }
        e.a.a.a.a.H0(e.a.a.a.a.M("pinyin-loc mark mCompStrShow = "), mCompStrShow, TAG);
        com.bytedance.android.input.common.h hVar = com.bytedance.android.input.common.h.a;
        IAppGlobals.a aVar2 = IAppGlobals.a;
        Objects.requireNonNull(aVar2);
        if (hVar.a(aVar2.getContext()) == 0) {
            clearCompStr();
        }
        Objects.requireNonNull(aVar2);
        mCurrentAppSearchEditCanPreedit = aVar2.H();
        updateIsSupportPinyinInEditor(isSupportPinyinInEditor());
        InputView inputView = ImeService.x;
        Objects.requireNonNull(inputView);
        inputView.k();
    }

    public static void markSwitchToEnglishFromHandWrite() {
        sSwitchToEnglishFromHandWriteFlag = true;
    }

    public static void moveFusiyinSingleBubble(int i, int i2) {
        ImeService imeService = mImeService;
        if (imeService == null || imeService.isInputViewShown()) {
            KeyboardView.moveFusiyinSingleBubble(i, i2);
        } else {
            com.bytedance.android.input.r.j.m(TAG, "Input method is not visible.");
        }
    }

    private static boolean needToast(int i) {
        String charSequence = com.bytedance.android.input.common.g.c().toString();
        if (charSequence.isEmpty() || i == 16) {
            charSequence = com.bytedance.android.input.common.g.a();
        }
        return charSequence.length() < (i == 25 ? 10 : 2);
    }

    public static void notifyKeyboardChangeForHandWrite() {
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] notifyKeyboardChangeForHandWrite");
        inputStateChange();
    }

    public static void onFinishInput() {
        resetPreEditStartPosition();
    }

    public static void onFinishInputView() {
        hideFusiyinSingleBubble();
        getKeyboardJni().finishInputView();
        clearCompStr();
    }

    public static void onWindowShown() {
    }

    public static void onlySetOneHandInputMode(boolean z) {
        e.a.a.a.a.y0("[StretchView] onlySetOneHandInputMode switchOn:", z, TAG);
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.valueOf(z));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(3:3|(1:5)(1:25)|(6:7|8|9|(2:11|(2:13|(1:19)(2:16|17)))|22|(1:19)(1:20)))|26|8|9|(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        com.bytedance.android.input.r.j.k("preEditInput", com.bytedance.common.wschannel.WsConstants.KEY_CONNECTION_ERROR, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003e A[Catch: Exception -> 0x004f, TRY_LEAVE, TryCatch #0 {Exception -> 0x004f, blocks: (B:9:0x0031, B:11:0x003e), top: B:8:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean optTextPreEdit() {
        /*
            com.bytedance.android.input.basic.settings.api.IInputSettings$a r0 = com.bytedance.android.input.basic.settings.api.IInputSettings.a
            java.util.Objects.requireNonNull(r0)
            com.bytedance.android.input.basic.settings.api.c.e r1 = r0.a()
            boolean r1 = r1.n()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            com.bytedance.android.input.basic.settings.api.IInputSettings$a r1 = com.bytedance.android.input.basic.settings.api.IInputSettings.a
            com.bytedance.android.input.basic.settings.api.c.e r1 = r1.a()
            java.util.List r1 = r1.m()
            if (r1 == 0) goto L2b
            com.bytedance.android.input.basic.IAppGlobals$a r4 = com.bytedance.android.input.basic.IAppGlobals.a
            java.util.Objects.requireNonNull(r4)
            java.lang.String r4 = r4.H()
            boolean r1 = r1.contains(r4)
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r1 != 0) goto L30
            r1 = r2
            goto L31
        L30:
            r1 = r3
        L31:
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L4f
            com.bytedance.android.input.basic.settings.api.c.e r0 = r0.a()     // Catch: java.lang.Exception -> L4f
            java.util.List r0 = r0.o()     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L57
            com.bytedance.android.input.basic.IAppGlobals$a r4 = com.bytedance.android.input.basic.IAppGlobals.a     // Catch: java.lang.Exception -> L4f
            java.util.Objects.requireNonNull(r4)     // Catch: java.lang.Exception -> L4f
            java.lang.String r4 = r4.H()     // Catch: java.lang.Exception -> L4f
            boolean r0 = r0.contains(r4)     // Catch: java.lang.Exception -> L4f
            if (r0 == 0) goto L57
            r0 = r2
            goto L58
        L4f:
            r0 = move-exception
            java.lang.String r4 = "preEditInput"
            java.lang.String r5 = "error"
            com.bytedance.android.input.r.j.k(r4, r5, r0)
        L57:
            r0 = r3
        L58:
            if (r1 != 0) goto L5e
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r2 = r3
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.doubaoime.KeyboardJni.optTextPreEdit():boolean");
    }

    private static void performLLMRequest(int i) {
        kotlin.e eVar;
        com.bytedance.android.input.llm.a aVar = com.bytedance.android.input.llm.a.b;
        eVar = com.bytedance.android.input.llm.a.f2851c;
        com.bytedance.android.input.llm.a aVar2 = (com.bytedance.android.input.llm.a) eVar.getValue();
        mImeService.q();
        int length = mHalfCandidateShow.length() + mCompStrShow.length();
        String str = TAG;
        StringBuilder M = e.a.a.a.a.M("llm-run --------- llm mCompStrShow ");
        M.append(mCompStrShow);
        M.append(", mHalfCandidateShow = ");
        M.append(mHalfCandidateShow);
        M.append(", context = ");
        M.append(0);
        com.bytedance.android.input.r.j.i(str, M.toString());
        StringBuilder M2 = e.a.a.a.a.M(length > 0 ? mCompStrShowLeftContext : com.bytedance.android.input.m.a.m(true));
        M2.append(mHalfCandidateLLMRequest);
        String sb = M2.toString();
        String k = com.bytedance.android.input.m.a.k(true);
        String str2 = TAG;
        StringBuilder M3 = e.a.a.a.a.M("[UpdateCandidate] llm-run --------- llm handle begin--- ");
        M3.append(mCompStrLLMRequest);
        M3.append(", timeoutMs = ");
        M3.append(i);
        M3.append(", leftContext = ");
        M3.append(sb);
        M3.append(", rightContext = ");
        M3.append(k);
        com.bytedance.android.input.r.j.i(str2, M3.toString());
        aVar2.c(mCompStrLLMRequest, sb, k, mImeMode, i, mRawCompUnconvertLLMRequest);
    }

    private static void prepareConfig() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        aVar.a().n();
        Objects.requireNonNull(aVar);
        aVar.d().l();
        Objects.requireNonNull(aVar);
        aVar.a().m();
    }

    public static void quitStretchMode() {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
        } else {
            imeService.C();
        }
    }

    public static void reloadRecommend(String str, String str2, String str3) {
        z.C(str, str2, str3);
    }

    public static void replaceSelectedTextOrAllText(String str) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        String charSequence = q.getSelectedText(0) != null ? q.getSelectedText(0).toString() : "";
        q.beginBatchEdit();
        if (charSequence.isEmpty()) {
            q.performContextMenuAction(R.id.selectAll);
        }
        q.commitText(str, 1);
        q.endBatchEdit();
    }

    public static void resetPreEditStartPosition() {
        preEditStartPosition = -1;
        com.bytedance.android.input.r.j.i(TAG, "resetPreEditStartPosition");
    }

    private static void retryDelayLLMRequest() {
        performLLMRequest(com.bytedance.android.input.l.c.b());
    }

    public static void setCommonPhraseEditorFocused(boolean z) {
        sCommonPhraseEditorFocused = z;
        e.a.a.a.a.y0("sCommonPhraseEditorFocused = ", z, TAG);
    }

    public static void setCurrentEditboxActionType(int i) {
        mCurrentEditboxAction = i;
    }

    public static void setFloatingWindow(boolean z) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
        } else {
            imeService.G(z);
            mImeService.updateInputViewShown();
        }
    }

    public static void setOneHandInputModeOn(boolean z, boolean z2) {
        com.bytedance.android.input.r.j.i(TAG, "[StretchView] setOneHandInputModeOn switchOn:" + z + " isLastHandWrite:" + z2);
        onlySetOneHandInputMode(z);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.L();
        } else {
            com.bytedance.android.input.r.j.j(TAG, "[StretchView] setOneHandInputModeOn inputView is null");
        }
    }

    public static void setUpdateSelectType(int i) {
        updateSelectType = i;
    }

    public static void showCheatAlert(String str) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        final com.bytedance.android.input.popup.i iVar = new com.bytedance.android.input.popup.i(aVar.getContext(), WindowId.CONFIRM_SPEECH_PERMISSION, 0);
        iVar.v(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                com.bytedance.android.input.popup.i iVar2 = com.bytedance.android.input.popup.i.this;
                String str2 = KeyboardJni.TAG;
                com.bytedance.android.input.popup.q.f().d(iVar2.f());
            }
        });
        iVar.y(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyboardJni.a(com.bytedance.android.input.popup.i.this, view);
            }
        });
        iVar.t(str);
        iVar.B(C0838R.string.cheat_tip_title);
        iVar.w(C0838R.string.cheat_tip_left_btn);
        iVar.z(C0838R.string.cheat_tip_right_btn);
        com.bytedance.android.input.popup.q.f().m(iVar, 0);
    }

    public static void showEmojiView(boolean z, String str, String str2) {
        if ("cand".equals(str2)) {
            IAppGlobals.a aVar = IAppGlobals.a;
            Objects.requireNonNull(aVar);
            if (!aVar.C()) {
                Objects.requireNonNull(aVar);
                aVar.o().edit().putBoolean(String.valueOf(C0838R.string.base_input_show_emoticons), false).apply();
            }
        }
        ImeService.x.V(z, str, str2);
    }

    public static void showFeedbackActivity(int i, boolean z) {
        com.bytedance.android.input.r.j.i(TAG, "[Feedback] showFeedbackActivity type = " + i + " isFromApp = " + z);
        List<FeedbackContentShownInUi> feedbackItemsForUi = getKeyboardJni().getFeedbackItemsForUi();
        List<FeedbackAssociateContentShownInUi> associateFeedbackItemsForUi = getKeyboardJni().getAssociateFeedbackItemsForUi();
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Intent intent = new Intent(aVar.getContext(), (Class<?>) FeedbackActivity.class);
        intent.addFlags(268468224);
        intent.putExtra("feedback_items", new ArrayList(feedbackItemsForUi));
        intent.putExtra("associate_feedback_items", new ArrayList(associateFeedbackItemsForUi));
        intent.putExtra("selected", i == 30 ? 0 : 1);
        intent.putExtra("isFromApp", z);
        Objects.requireNonNull(aVar);
        aVar.getContext().startActivity(intent);
    }

    public static void showFusiyinSingleBubble(String str, int i, int i2) {
        ImeService imeService = mImeService;
        if (imeService == null || imeService.isInputViewShown()) {
            KeyboardView.showFusiyinSingleBubble(str, i, i2);
        } else {
            com.bytedance.android.input.r.j.m(TAG, "Input method is not visible.");
        }
    }

    public static boolean showGuideTips(String str, String str2, final WindowId windowId) {
        String str3 = TAG;
        StringBuilder M = e.a.a.a.a.M("showGuideTips id= ");
        M.append(windowId.ordinal());
        com.bytedance.android.input.r.j.m(str3, M.toString());
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.w() == 2) {
            com.bytedance.android.input.r.j.m(TAG, "landscape not show tips");
            return false;
        }
        Objects.requireNonNull(aVar);
        final com.bytedance.android.input.popup.m mVar = new com.bytedance.android.input.popup.m(aVar.getContext(), windowId, 3);
        mVar.k(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyboardJni.b(com.bytedance.android.input.popup.m.this, windowId, view);
            }
        });
        mVar.q(new View.OnClickListener() { // from class: com.bytedance.android.doubaoime.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeyboardJni.c(com.bytedance.android.input.popup.m.this, windowId, view);
            }
        });
        mVar.i(new g(windowId));
        switch (windowId.ordinal()) {
            case 7:
                mVar.p(C0838R.drawable.oic_arrow_up_circle_fill);
                mVar.o(false);
                break;
            case 8:
            case 9:
            case 10:
            case 12:
                mVar.o(true);
                break;
            case 11:
            case 13:
                mVar.p(C0838R.drawable.asr_punct_settings_guide_image);
                mVar.o(false);
                break;
        }
        mVar.m(str);
        if (TextUtils.isEmpty(str2)) {
            mVar.n(true);
        } else {
            mVar.l(str2);
        }
        mVar.j();
        com.bytedance.android.input.popup.q.f().k();
        com.bytedance.android.input.popup.q.f().l(mVar);
        return true;
    }

    public static void showOpenFullInputModeAlert(int i) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        com.bytedance.android.input.keyboard.q.b(aVar.getContext(), -1, true);
    }

    public static void showStretchView() {
        ImeService.x.a0(true);
    }

    public static void showToast(String str) {
        mImeService.K(str);
    }

    public static void trackLog(String str) {
        if (!str.contains("[asr]")) {
            com.bytedance.android.input.common_biz.performance.j.o(str);
        } else {
            y yVar = y.a;
            y.b(str);
        }
    }

    public static void trackLogForPostFrame(String str) {
        com.bytedance.android.input.common_biz.performance.j.p(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void triggerLongPressVibrate() {
        AtomicBoolean atomicBoolean = asrLongPresNeedTriggerVibrate;
        if (!atomicBoolean.get()) {
            com.bytedance.android.input.r.j.j(TAG, "asrLongPresNeedTriggerVibrate = false");
            return;
        }
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (aVar.F()) {
            UserInteractiveManagerNext.a.g(UserInteractiveManagerNext.KeySound.KEYBOARD, UserInteractiveManagerNext.KeyVibrate.STANDARD, VibrationController.VibrationType.LONG_PRESS, true);
        } else {
            UserInteractiveManagerNext.a.b();
        }
        atomicBoolean.set(false);
    }

    public static void updateConfig(final int i, final int i2) {
        com.bytedance.android.input.r.j.i("KeyboardInputType", "updateConfig 01");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastUpdateConfigTime < 10) {
            return;
        }
        lastUpdateConfigTime = currentTimeMillis;
        com.bytedance.android.input.r.j.i("KeyboardInputType", "updateConfig 02");
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        final Context context = aVar.getContext();
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        SettingsConfigNext.l(context.getString(C0838R.string.input_mode), Integer.valueOf(i));
        SettingsConfigNext.l(context.getString(C0838R.string.last_chinese_input_mode), Integer.valueOf(i2));
        Objects.requireNonNull(aVar);
        SharedPreferences.Editor edit = aVar.o().edit();
        edit.putInt(context.getString(C0838R.string.input_mode), i);
        edit.putInt(context.getString(C0838R.string.last_chinese_input_mode), i2);
        edit.apply();
        com.bytedance.android.input.r.j.i("KeyboardInputType", "inputMode = " + i + "---lastChineseInputMode = " + i2);
        singleThreadExecutor.execute(new Runnable() { // from class: com.bytedance.android.doubaoime.j
            @Override // java.lang.Runnable
            public final void run() {
                Context context2 = context;
                int i3 = i;
                int i4 = i2;
                String str = KeyboardJni.TAG;
                KeyboardJni.updateSettingsValueForce(context2.getString(C0838R.string.input_mode), i3);
                KeyboardJni.updateSettingsValueForce(context2.getString(C0838R.string.last_chinese_input_mode), i4);
            }
        });
    }

    public static void updateEngineModulesState(boolean z) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Objects.requireNonNull(aVar);
        SharedPreferences.Editor edit = aVar.o().edit();
        edit.putBoolean(context.getString(C0838R.string.enable_gpt2), z);
        edit.apply();
    }

    public static void updateEnterOkTextForSpeech(boolean z, String str) {
        if (!z) {
            updateSpeechStyleForHandWriting(false);
        } else if (!"space".equals(str)) {
            updateSpeechStyleForHandWriting(true);
        }
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] updateEnterOkText isSpeeching:" + z);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            if (z) {
                inputView.k0(true, str);
            } else {
                inputView.l0();
            }
        }
    }

    public static void updateEnterTextForHandWrite() {
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] updateEnterTextForHandWrite ");
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.l0();
        }
    }

    public static void updateInputViewShown() {
        if (mImeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.r.j.m(TAG, "updateInputViewShown from Native");
        mImeService.updateInputViewShown();
        KeyboardJni keyboardJni = getKeyboardJni();
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        keyboardJni.updateSettingsConfig(aVar.a().e());
    }

    public static void updateInputViewShownForNumberKeyboard() {
        int intValue = ((Integer) SettingsConfigNext.e(C0838R.string.last_one_hand_input_state)).intValue();
        if (intValue == 1) {
            SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.TRUE);
        } else if (intValue == 0) {
            SettingsConfigNext.k(C0838R.string.enable_one_hand_input_mode, Boolean.FALSE);
        }
        SettingsConfigNext.k(C0838R.string.last_one_hand_input_state, -1);
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] updateInputViewShownForNumberKeyboard lastOneHandMode:" + intValue);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.o0(false);
        }
    }

    public static void updateIsSupportSystemFont() {
        IInputSettings.a aVar = IInputSettings.a;
        Objects.requireNonNull(aVar);
        isSupportSystemFontCache = aVar.a().G();
        e.a.a.a.a.N0(e.a.a.a.a.M("[initialize] updateIsSupportSystemFont isSupportSystemFontCache="), isSupportSystemFontCache, TAG);
    }

    public static void updateNumberSpecialBoardState() {
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] updateNumberSpecialBoardState");
        com.bytedance.android.input.keyboard.areacontrol.k kVar = com.bytedance.android.input.keyboard.areacontrol.k.a;
        com.bytedance.android.input.keyboard.areacontrol.k.d0(false);
    }

    public static void updateProviderLongValue(String str, Long l) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Uri parse = Uri.parse(PROVIDER_SETTINGS);
        try {
            Bundle bundle = new Bundle();
            bundle.putLong(str, l.longValue());
            context.getContentResolver().call(parse, "updateLongValues", str, bundle);
        } catch (Exception unused) {
        }
    }

    public static void updateProviderStringValue(String str, String str2) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Uri parse = Uri.parse(PROVIDER_SETTINGS);
        try {
            Bundle bundle = new Bundle();
            bundle.putString(str, str2);
            context.getContentResolver().call(parse, "updateStringValues", str, bundle);
        } catch (Exception unused) {
        }
    }

    public static void updateProviderValue(String str, int i) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        Uri parse = Uri.parse(PROVIDER_SETTINGS);
        try {
            Bundle bundle = new Bundle();
            bundle.putInt(str, i);
            context.getContentResolver().call(parse, "updateValues", str, bundle);
        } catch (Exception unused) {
        }
    }

    public static void updateSettingsBooleanValue(String str, boolean z) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        Context context = aVar.getContext();
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        SettingsConfigNext.l(str, Boolean.valueOf(z));
        Uri parse = Uri.parse(PROVIDER_SETTINGS);
        try {
            Bundle bundle = new Bundle();
            bundle.putBoolean(str, z);
            context.getContentResolver().call(parse, "updateBoolValues", str, bundle);
        } catch (Exception unused) {
        }
    }

    public static void updateSettingsStringValue(String str, String str2) {
        SettingsConfigNext.a.m(str, str2);
        updateProviderStringValue(str, str2);
    }

    public static void updateSettingsValue(String str, int i) {
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        SettingsConfigNext.l(str, Integer.valueOf(i));
        updateProviderValue(str, i);
    }

    public static void updateSettingsValueForce(String str, int i) {
        SettingsConfigNext settingsConfigNext = SettingsConfigNext.a;
        SettingsConfigNext.o(str, Integer.valueOf(i));
        forceUpdateProviderValue(str, i);
    }

    public static void updateSpeechStyleForHandWriting(boolean z) {
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] updateSpeechStyleForHandWriting showText:" + z);
        InputView inputView = ImeService.x;
        if (inputView != null) {
            inputView.n0(z);
        }
    }

    public static void updateTypingChange(boolean z) {
        boolean E = AsrManager.a.E();
        com.bytedance.android.input.r.j.i(TAG, "[hand_write] updateTypingChange isTyping:" + z + ", speechState:" + E);
        InputView inputView = ImeService.x;
        if (inputView == null || !z) {
            return;
        }
        inputView.k0(false, "typing");
    }

    public native void ClearUsrDicts();

    public native boolean IsEnglishKeyboard();

    public native void LoadGuideConfig(String str, String str2, String str3, boolean z);

    public native void ReloadConfig(String str);

    public native void SetAndroidID(String str, long j, long j2, String str2, String str3);

    public native void SetDefaultPage(int i);

    public native void UpdateQUICConfig(int i);

    public native boolean addAsrModifyPairInfo(String str, String str2, String str3);

    public native void addModifyPairNerResponse(String str);

    public native void addNerResponse(String str);

    public boolean checkForm(EditorInfo editorInfo, int i) {
        EnterActionType enterActionType = EnterActionType.kIME_ACTION_NONE;
        if (i != 1) {
            EnterActionType enterActionType2 = EnterActionType.kUnknow;
            if (i != 0) {
                EnterActionType enterActionType3 = EnterActionType.kIME_ACTION_SEND;
                if (i != 4) {
                    EnterActionType enterActionType4 = EnterActionType.kIME_ACTION_SEND_EXPRESSION;
                    if (i != 8) {
                        return true;
                    }
                }
            }
        }
        int i2 = editorInfo == null ? 0 : editorInfo.inputType & 4080;
        return i2 == 16 || i2 == 32 || i2 == 208;
    }

    public boolean checkHasImeFlagForceAscii(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.imeOptions & Integer.MIN_VALUE) == 0) ? false : true;
    }

    public boolean checkIsInitialCapsMode(EditorInfo editorInfo) {
        return (editorInfo == null || (editorInfo.initialCapsMode & 4096) == 0) ? false : true;
    }

    public boolean checkIsNumberInputBox(EditorInfo editorInfo) {
        if (editorInfo == null) {
            return false;
        }
        int i = editorInfo.inputType & 15;
        return i == 2 || i == 4 || i == 3;
    }

    public native int clearClipboardHistory();

    public native void clearHandWritingPoints();

    public native void commitForEnter(boolean z, boolean z2, boolean z3, boolean z4);

    public native boolean commitForSpace();

    public native void commitForSpaceDoubleClick(boolean z, boolean z2);

    public native void commitString(String str, boolean z);

    public native void commitSymbol(String str, boolean z);

    public native void contactDictBatchClear();

    public native void createCloudDictUpdateTask(int i);

    public native void customizeToolbarButton(boolean z, String str);

    public native int deleteClipboardHistory(String str);

    public native int deleteCommonPhrase(String str, String str2);

    public native void directCommitCandByEngine(int i);

    public native String[] doAssociations();

    public native void doFullInputModeAction(int i);

    public native void doUpClearAction(int i);

    public native String encodeEncrpty(String str);

    public native void exitCustomizeToolbar();

    public native void finishInputView();

    public native void finishPreeditNative(boolean z);

    public native void finishUpdateContactsData();

    public void finishUpdateContactsUIEvent() {
        mHandler.postDelayed(new Runnable() { // from class: com.bytedance.android.doubaoime.KeyboardJni.2
            @Override // java.lang.Runnable
            public void run() {
                KeyboardJni.this.finishUpdateContactsData();
            }
        }, 30L);
    }

    public native String getAsrGlobalContext(long j, long j2);

    public native String getAsrModifyPairInfo();

    public native String getAsrUsrDictInfo();

    public native String getAssociateFeedbackBugDescByIndex(int i, String str, boolean z, boolean z2);

    public native List<FeedbackAssociateContentShownInUi> getAssociateFeedbackItemsForUi();

    public native String[] getAssociations();

    public native String getCandlist();

    public native int getClipboardHistoryCount();

    public native String getClipboardHistoryItem(int i, int i2);

    public native String getCommitOriginalString(int i);

    public native int getCommonPhraseCount();

    public native String getCommonPhraseItem(int i, int i2);

    public native AsrConvertInfo getConvertResult(String str, String[] strArr, boolean z);

    public native int getCurrentKbdType();

    public native String getEnterkeyText();

    public native List<FeedbackContentShownInUi> getFeedbackItemsForUi();

    public native String getHandWritingResult(int[] iArr, long j, long j2);

    public native String getHansOrHant(int i, String str);

    public native String getKeyboardType();

    public native String getLLMCompOrg();

    public native String getLLMFeedbackBugDesc(String str, boolean z);

    public native String getLLMFeedbackBugDescByIndex(int i, String str, boolean z);

    public native double getLastEngineConvertTime();

    public native double getLastKeyProcessTime();

    public native String getSmsCodeNumber();

    public native String getTextBeforeCursorNative();

    public native String getToolbarConfig();

    public native int getToolbarHeight();

    public native String getUntranslatedText();

    public native int getUpClearCondition();

    public native void handleJavaBackspaceClickEvent();

    public native void handleJavaBackspaceForDoubleClick();

    public native void hideTopExternView(boolean z);

    public native boolean initKeyboard(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

    public native int insertClipboardHistory(String str, boolean z, boolean z2);

    public native int insertCommonPhrase(String str, String str2);

    public native void insertUsrClause(String str);

    public native boolean isAssociate();

    public boolean isDeviceSetupComplete(Context context) {
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        return !aVar.F() || Settings.Secure.getInt(context.getContentResolver(), "user_setup_complete", 0) == 1;
    }

    public boolean isEmptyInputConnection() {
        if (mImeService == null) {
            return true;
        }
        if (com.bytedance.android.input.m.a.m(true).isEmpty()) {
            return com.bytedance.android.input.m.a.k(true).isEmpty();
        }
        return false;
    }

    public native boolean isHandwritingMode();

    public native boolean isKbdContinuousDeleting();

    public native boolean isSettingsOpen();

    public native boolean isTypingInput();

    public native boolean loadAsrModifyPairDict(String str, String str2);

    public native void malloptPurge();

    public native boolean onAsrCommitPreeditText();

    public native boolean onAsrSetPreedit(String str);

    public native void onImeServiceDestory();

    public native void onSelectionUpdated(SelectionUpdatedParams selectionUpdatedParams);

    public void onUpdateSelection(int i, int i2, int i3, int i4, int i5, int i6) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        this.mOldSelStart = i;
        this.mOldSelEnd = i2;
        mNewSelStart = i3;
        mNewSelEnd = i4;
        mCandidatesStart = i5;
        mCandidatesEnd = i6;
        SelectionTracker s = imeService.s();
        com.bytedance.android.input.r.j.i(TAG, "[UpdateSelection] onUpdateSelection");
        if (s != null) {
            this.mActionFlag = s.l();
            String str = TAG;
            StringBuilder M = e.a.a.a.a.M("[UpdateSelection] onUpdateSelection update mActionFlag=");
            M.append(this.mActionFlag);
            com.bytedance.android.input.r.j.i(str, M.toString());
        }
        SelectionTracker.ActionType actionType = this.mActionFlag;
        SelectionTracker.ActionType actionType2 = SelectionTracker.ActionType.NOT_INNER;
        if (actionType == actionType2 || actionType == SelectionTracker.ActionType.INNER_DELETE || actionType == SelectionTracker.ActionType.INNER_NORMAL) {
            com.bytedance.android.input.common_biz.performance.j.o("[android][key] clear onTouchEvent ACTION_UP");
        }
        if (this.mActionFlag == actionType2) {
            com.bytedance.android.input.j.b.a();
        }
        if (this.mActionFlag == actionType2 && ((!mHalfCandidateShow.isEmpty() || !mCompStrShow.isEmpty()) && i6 == -1 && mCandidatesEnd == -1)) {
            markAppNotSupportPinyinInEditor();
        }
        ImeService.x.a0(false);
        String str2 = TAG;
        StringBuilder O = e.a.a.a.a.O("onUpdateSelection: old ", i, ", ", i2, " new ");
        e.a.a.a.a.F0(O, i3, ", ", i4, " cands ");
        e.a.a.a.a.F0(O, i5, ", ", i6, ", isinner = ");
        O.append(this.mActionFlag);
        O.append(", mCompStrShow = ");
        O.append(mCompStrShow.length());
        com.bytedance.android.input.r.j.m(str2, O.toString());
        com.bytedance.android.input.i.c cVar = com.bytedance.android.input.i.c.a;
        com.bytedance.android.input.i.c.h(this.mActionFlag);
        AsrManager.a.V((mCandidatesStart == -1 || mCandidatesEnd == -1) ? false : true, i, i2, i3, i4, this.mActionFlag);
        com.bytedance.android.input.keyboard.handwriting.o.a(i5, i6, this.mActionFlag);
        SelectionTracker.ActionType actionType3 = this.mActionFlag;
        kotlin.s.c.l.f(actionType3, "action");
        if (actionType3 == actionType2) {
            com.bytedance.android.input.r.j.i("WordSegmentationLayoutNew", "onUpdateSelection prepare close page...");
            com.bytedance.android.input.keyboard.word_segmentation.n.a();
        }
        if (!mImeService.isInputViewShown()) {
            com.bytedance.android.input.r.j.m(TAG, "Input method is not visible.");
            return;
        }
        int i7 = mCandidatesEnd;
        if (i7 != -1 && mCandidatesStart != -1 && ((mNewSelEnd != i7 || mNewSelStart != i7) && !mCompStrShow.isEmpty() && this.mActionFlag != SelectionTracker.ActionType.INNER_VOICE_PREEDIT)) {
            com.bytedance.android.input.editor.a q = mImeService.q();
            e.a.a.a.a.H0(e.a.a.a.a.M("[UpdateSelection] real post onSelectionUpdated finishComposingText mCompStrShow = "), mCompStrShow, TAG);
            String replace = mCompStrShow.replace(" ", "");
            r12 = replace.length() != mCompStrShow.length();
            q.beginBatchEdit();
            q.setComposingText(mHalfCandidateShow + replace, 1);
            q.finishComposingText();
            int i8 = mCandidatesEnd;
            q.setSelection(i8, i8);
            q.endBatchEdit();
            stopInputAndCommitPinyin();
            clearCompStr();
        }
        if ((this.mActionFlag != SelectionTracker.ActionType.INNER_CLEAR || mCompStrShow.isEmpty()) && !r12) {
            com.bytedance.android.input.r.j.i(TAG, "onUpdateSelection：postPostUpdateSelectionEvent");
            postPostUpdateSelectionEvent();
        }
    }

    public native void onUserClickedEditor();

    public void postPostUpdateSelectionEvent() {
        AsrManager.a.l0(false);
        Handler handler = mHandler;
        handler.removeCallbacks(this.mPostUpdateSelectionEvent);
        handler.postDelayed(this.mPostUpdateSelectionEvent, 35L);
    }

    public native void recoverInputMode();

    public native void reloadFeedbackInfo();

    public native int saveClipboardHistoryToDict();

    public native int saveCommonPhraseToDict();

    public native void saveFeedbackContent(String str);

    public native int saveUsrDicts(boolean z);

    public native void selectCand(int i);

    public native void selectLLMCand(String str);

    public native void setAiTabLoadingFlag(boolean z);

    public native void setAssociateFeedbackItemSubmitted(int i);

    public native void setAssociationEnabled(boolean z);

    public native void setChineseBoard(int i);

    public native void setCurrentName(String str);

    public native void setDeviceSetupComplete(boolean z);

    public native void setEnableRecommend(int i);

    public native void setExternalPackage(boolean z);

    public native void setHandWritingAreaSize(int i, int i2);

    public native void setInputMode(int i);

    public native void setIpInfo(String str, String str2, String str3, String str4);

    public native void setLLMFeedbackItemSubmitted(int i);

    public native void setQuickInputData(String str, int i);

    public native void setRecommendScene(int i);

    public native void setTextAfterCursor(String str);

    public native void setTextBeforeCursor(String str);

    public native void setThirdSystem(boolean z);

    public native void setToolbarAlignment(int i);

    public native void setToolbarState(int i);

    public native void setToolbarToastMode(boolean z);

    public native void setTrackEnable(boolean z);

    public native void setTransparent(boolean z);

    public native boolean showAiChatAssistantGuideTip();

    public native void showAppUpgradeTip();

    public native boolean showLoginGuideTip();

    public native boolean showQuickReplyGuideTip();

    public native void showToolbar(boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:181:0x0223, code lost:
    
        if (r0 == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0125, code lost:
    
        if (r0.isEmpty() == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x02a5, code lost:
    
        if (r5.contains("听到") == false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x056a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void startInputView(android.view.inputmethod.EditorInfo r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.doubaoime.KeyboardJni.startInputView(android.view.inputmethod.EditorInfo, boolean):void");
    }

    public native void startInputView(StartInputViewParams startInputViewParams);

    public native void stopInputAndCommitPinyin();

    public native void switchKeyboard(int i);

    public native boolean syncUpdateContactsData(String str);

    public native String transformSelectedWordSegmentationByIndex(String str, int[] iArr);

    public native boolean tryShowReply(String[] strArr, String str, String str2, boolean z);

    public native int updateAdditionalDict(String str);

    public native void updateColorSchemeConf(String str);

    public native String updateCommonPhrase(String str, String str2, String str3, String str4);

    public native void updateFeedbackActivityVisible(boolean z);

    public void updateInputViewActionType() {
        startInputView(mImeService.getCurrentInputEditorInfo(), false);
    }

    public native void updateIsSupportPinyinInEditor(boolean z);

    public native void updateLLMCand(String str, String str2, String str3, String str4, String str5, String str6);

    public native void updateRatioAdaptiveConf(String str);

    public native void updateRecommend(boolean z, String str, int i, int i2);

    public native void updateRecommendSelected(Map<String, Boolean> map);

    public native void updateRemoteServerConfig(int i, boolean z, int i2, int i3);

    public native void updateScreenOn(boolean z);

    public native void updateScreenSize(int i, int i2, int i3, int i4);

    public native void updateSettingsConfig(int i);

    public native void updateSpeechTip(int i, String str);

    public native void updateWindowState(int i);

    public native void voiceHaveCommit(boolean z);

    public native WordSegmentationData wordSegmentation(String str);

    public static void PostEvent(String str, String str2) {
        boolean z;
        z = ImeService.B;
        if (z) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                IAppLog.a aVar = IAppLog.a;
                Objects.requireNonNull(aVar);
                aVar.t(str, jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void ReplaceText(int i, String str, String str2) {
        ImeService imeService = mImeService;
        if (imeService == null) {
            com.bytedance.android.input.r.j.m(TAG, "mImeService is null");
            return;
        }
        com.bytedance.android.input.editor.a q = imeService.q();
        if (q == null) {
            com.bytedance.android.input.r.j.m(TAG, "InputConnection is null");
            return;
        }
        String str3 = TAG;
        StringBuilder P = e.a.a.a.a.P("ReplaceText: start cursor offset = ", i, " source = ", str, " replace = ");
        P.append(str2);
        com.bytedance.android.input.r.j.i(str3, P.toString());
        q.beginBatchEdit();
        if (mCandidatesEnd - mCandidatesStart > 0) {
            q.setComposingText("", 1);
        }
        int d2 = q.d();
        int max = Math.max(0, d2 + i);
        q.setSelection(max, str.length() + max);
        q.commitText(str2, 1);
        e.a.a.a.a.j0("ReplaceText: before cursor = ", d2, TAG);
        if (i < 0) {
            d2 = Math.max(0, (str2.length() + d2) - str.length());
        }
        q.setSelection(d2, d2);
        q.endBatchEdit();
        IAppGlobals.a aVar = IAppGlobals.a;
        Objects.requireNonNull(aVar);
        if (d.a.b.a.h(aVar)) {
            e.a.a.a.a.r0("[o.ime.keyboard] ReplaceText: getTextBeforeCursor = ", com.bytedance.android.input.m.a.n(), TAG);
        }
        e.a.a.a.a.j0("ReplaceText: end cursor = ", d2, TAG);
    }
}
