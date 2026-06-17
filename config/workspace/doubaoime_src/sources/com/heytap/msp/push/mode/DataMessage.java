package com.heytap.msp.push.mode;

import com.heytap.mcssdk.constant.MessageConstant;
import e.a.a.a.a;

/* loaded from: classes2.dex */
public class DataMessage extends BaseMode {
    private String mAppId;
    private String mAppPackage;
    private String mBalanceTime;
    private String mContent;
    private String mDataExtra;
    private String mDescription;
    private String mDistinctContent;
    private String mEndDate;
    private String mEventId;
    private String mForcedDelivery;
    private String mGlobalId;
    private String mMessageID;
    private int mMessageType;
    private int mMsgCommand;
    private int mNotifyID;
    private String mRule;
    private String mStartDate;
    private String mStatisticsExtra;
    private String mTimeRanges;
    private String mTitle;
    private String mTaskID = "";
    private String mMiniProgramPkg = "";

    public DataMessage() {
    }

    public DataMessage(String str, String str2) {
        this.mAppPackage = str;
        this.mGlobalId = str2;
    }

    public String getAppId() {
        return this.mAppId;
    }

    public String getAppPackage() {
        return this.mAppPackage;
    }

    public String getBalanceTime() {
        return this.mBalanceTime;
    }

    public String getContent() {
        return this.mContent;
    }

    public String getDataExtra() {
        return this.mDataExtra;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getDistinctContent() {
        return this.mDistinctContent;
    }

    public String getEndDate() {
        return this.mEndDate;
    }

    public String getEventId() {
        return this.mEventId;
    }

    public String getForcedDelivery() {
        return this.mForcedDelivery;
    }

    public String getGlobalId() {
        return this.mGlobalId;
    }

    public String getMessageID() {
        return this.mMessageID;
    }

    public int getMessageType() {
        return this.mMessageType;
    }

    public String getMiniProgramPkg() {
        return this.mMiniProgramPkg;
    }

    public int getMsgCommand() {
        return this.mMsgCommand;
    }

    public int getNotifyID() {
        return this.mNotifyID;
    }

    public String getRule() {
        return this.mRule;
    }

    public String getStartDate() {
        return this.mStartDate;
    }

    public String getStatisticsExtra() {
        return this.mStatisticsExtra;
    }

    public String getTaskID() {
        return this.mTaskID;
    }

    public String getTimeRanges() {
        return this.mTimeRanges;
    }

    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.heytap.msp.push.mode.BaseMode
    public int getType() {
        return MessageConstant.MessageType.MESSAGE_DATA;
    }

    public void setAppId(String str) {
        this.mAppId = str;
    }

    public void setAppPackage(String str) {
        this.mAppPackage = str;
    }

    public void setBalanceTime(String str) {
        this.mBalanceTime = str;
    }

    public void setContent(String str) {
        this.mContent = str;
    }

    public void setDataExtra(String str) {
        this.mDataExtra = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setDistinctContent(String str) {
        this.mDistinctContent = str;
    }

    public void setEndDate(String str) {
        this.mEndDate = str;
    }

    public void setEventId(String str) {
        this.mEventId = str;
    }

    public void setForcedDelivery(String str) {
        this.mForcedDelivery = str;
    }

    public void setGlobalId(String str) {
        this.mGlobalId = str;
    }

    public void setMessageID(String str) {
        this.mMessageID = str;
    }

    public void setMessageType(int i) {
        this.mMessageType = i;
    }

    public void setMiniProgramPkg(String str) {
        this.mMiniProgramPkg = str;
    }

    public void setMsgCommand(int i) {
        this.mMsgCommand = i;
    }

    public void setNotifyID(int i) {
        this.mNotifyID = i;
    }

    public void setRule(String str) {
        this.mRule = str;
    }

    public void setStartDate(String str) {
        this.mStartDate = str;
    }

    public void setStatisticsExtra(String str) {
        this.mStatisticsExtra = str;
    }

    public void setTaskID(int i) {
        this.mTaskID = i + "";
    }

    public void setTaskID(String str) {
        this.mTaskID = str;
    }

    public void setTimeRanges(String str) {
        this.mTimeRanges = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public String toString() {
        StringBuilder M = a.M("DataMessage{mMessageID='");
        a.G0(M, this.mMessageID, '\'', ", mMessageType='");
        M.append(this.mMessageType);
        M.append('\'');
        M.append(", mAppPackage='");
        a.G0(M, this.mAppPackage, '\'', ", mTaskID='");
        a.G0(M, this.mTaskID, '\'', ", mTitle='");
        a.G0(M, this.mTitle, '\'', ", mNotifyID='");
        M.append(this.mNotifyID);
        M.append('\'');
        M.append(", mContent='");
        a.G0(M, this.mContent, '\'', ", mGlobalId='");
        a.G0(M, this.mGlobalId, '\'', ", mBalanceTime='");
        a.G0(M, this.mBalanceTime, '\'', ", mStartDate='");
        a.G0(M, this.mStartDate, '\'', ", mEndDate='");
        a.G0(M, this.mEndDate, '\'', ", mTimeRanges='");
        a.G0(M, this.mTimeRanges, '\'', ", mRule='");
        a.G0(M, this.mRule, '\'', ", mForcedDelivery='");
        a.G0(M, this.mForcedDelivery, '\'', ", mDistinctContent='");
        a.G0(M, this.mDistinctContent, '\'', ", mAppId='");
        return a.H(M, this.mAppId, '\'', '}');
    }
}
