package com.ss.android.socialbase.downloader.utils;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.BuildConfig;
import com.ss.android.socialbase.downloader.constants.DBDefinition;
import com.ss.android.socialbase.downloader.constants.DownloadConstants;
import com.ss.android.socialbase.downloader.constants.DownloadErrorCode;
import com.ss.android.socialbase.downloader.constants.DownloadInnerConstants;
import com.ss.android.socialbase.downloader.constants.ListenerType;
import com.ss.android.socialbase.downloader.depend.IDownloadThreadCheckListener;
import com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback;
import com.ss.android.socialbase.downloader.downloader.DownloadComponentManager;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.exception.DownloadHttpException;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.file.DownloadFile;
import com.ss.android.socialbase.downloader.file.DownloadFileUtils;
import com.ss.android.socialbase.downloader.impls.DownloadProxy;
import com.ss.android.socialbase.downloader.logger.Logger;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.model.RandomAccessOutputStream;
import com.ss.android.socialbase.downloader.network.AbsDownloadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHeadHttpConnection;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.ss.android.socialbase.downloader.setting.DownloadSetting;
import com.ss.android.socialbase.downloader.setting.DownloadSettingKeys;
import com.xiaomi.mipush.sdk.Constants;
import e.a.a.a.a;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.internal.http2.p;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class DownloadHelper {
    public static final String ACCEPT_ENCODING = "Accept-Encoding";
    public static final String ACCEPT_RANGES = "Accept-Ranges";
    public static final String CACHE_CONTROL = "Cache-Control";
    public static final String CONTENT_ENCODING = "Content-Encoding";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String ETAG = "Etag";
    private static final long FILE_COPY_BUFFER_SIZE = 31457280;
    public static final String GZIP = "gzip";
    public static final String IDENTITY = "identity";
    public static final String IF_MATCH = "If-Match";
    public static final String IF_MODIFIED_SINCE = "if-modified-since";
    public static final String IF_NONE_MATCH = "If-None-Match";
    public static final String LAST_MODIFIED = "last-modified";
    public static final String LAST_MODIFIED_CASE = "Last-Modified";
    private static final long ONE_KB = 1024;
    private static final long ONE_MB = 1048576;
    private static final String TAG = "DownloadHelper";
    public static final String TRANSFER_ENCODING = "Transfer-Encoding";
    public static final String TTNET_PROTO_TYPE = "x-ttnet-http-proto-type";
    public static final String VALUE_CHUNKED = "chunked";
    public static final String X_CACHE = "X-Cache";
    public static final String X_CONTENT_LENGTH = "X-Content-Length";
    private static Boolean sIsDownloaderProcess;
    private static Boolean sIsMainProcess;
    private static volatile SparseArray<Boolean> saveTempFileStatusMap = new SparseArray<>();
    private static volatile SparseArray<List<ITempFileSaveCompleteCallback>> saveTempFileListeners = new SparseArray<>();

    public static List<HttpHeader> addRangeHeader(List<HttpHeader> list, String str, long j, long j2) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (HttpHeader httpHeader : list) {
                if (httpHeader != null && (!ACCEPT_ENCODING.equalsIgnoreCase(httpHeader.getName()) || !GZIP.equalsIgnoreCase(httpHeader.getValue()))) {
                    arrayList.add(httpHeader);
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new HttpHeader(IF_MATCH, str));
        }
        arrayList.add(new HttpHeader(ACCEPT_ENCODING, IDENTITY));
        String format = j2 <= 0 ? String.format(Locale.US, "bytes=%d-", Long.valueOf(j)) : String.format(Locale.US, "bytes=%d-%d", Long.valueOf(j), Long.valueOf(j2));
        arrayList.add(new HttpHeader("Range", format));
        if (Logger.debug()) {
            String str2 = TAG;
            StringBuilder Q = a.Q("CurrentOffset:", j, " EndOffset:");
            Q.append(j2);
            Q.append(", range = ");
            Q.append(format);
            Logger.globalDebug(str2, "addRangeHeader", Q.toString());
        }
        return arrayList;
    }

    public static void addTTNetParam(DownloadSetting downloadSetting, List<HttpHeader> list, DownloadInfo downloadInfo) {
        long throttleNetSpeed = downloadInfo.getThrottleNetSpeed();
        if (throttleNetSpeed > 0) {
            list.add(new HttpHeader(DownloadConstants.EXTRA_THROTTLE_NET_SPEED, String.valueOf(throttleNetSpeed)));
        }
        long ttnetProtectTimeout = downloadInfo.getTtnetProtectTimeout();
        if (ttnetProtectTimeout > 300) {
            list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_PROTECT_TIMEOUT, String.valueOf(ttnetProtectTimeout)));
        }
        if (downloadInfo.isAddTTNetCommonParam()) {
            list.add(new HttpHeader(DownloadConstants.EXTRA_TTNET_TTNET_COMMON_PARAMS, "true"));
        }
        if (downloadSetting.optInt(DownloadSettingKeys.ENABLE_DOWNLOAD_NETWORK_TAG, 0) > 0) {
            list.add(new HttpHeader(DownloadInnerConstants.TTNET_BIZ_ID_HEADER_NAME, "dl"));
            list.add(new HttpHeader(DownloadInnerConstants.TTNET_BIZ_VERSION_HEADER_NAME, BuildConfig.VERSION_NAME));
        }
        int optInt = downloadSetting.optInt(DownloadSettingKeys.TTNET_ERROR_PROTO_TYPE, 0);
        if (optInt > 0) {
            list.add(new HttpHeader(TTNET_PROTO_TYPE, String.valueOf(optInt)));
        }
    }

    public static boolean canAcceptPartial(int i, String str) {
        if (i >= 400) {
            return false;
        }
        return i == 206 || i == 1 || "bytes".equals(str);
    }

    public static boolean checkPermission(Context context, String str) {
        return (context == null || TextUtils.isEmpty(str) || context.checkCallingOrSelfPermission(str) != 0) ? false : true;
    }

    public static void checkWorkerThread(String str) {
        if (Logger.debug() && DownloadUtils.isMainThread()) {
            Logger.globalError(TAG, "checkWorkerThread", "This method:" + str + " cannot be executed on the main thread");
            IDownloadThreadCheckListener downloadThreadCheckListener = DownloadComponentManager.getDownloadThreadCheckListener();
            if (downloadThreadCheckListener != null) {
                downloadThreadCheckListener.onError(str);
            }
        }
    }

    public static ListenerType convertListenerType(int i) {
        ListenerType listenerType = ListenerType.MAIN;
        ListenerType listenerType2 = ListenerType.SUB;
        if (i != 1) {
            listenerType2 = ListenerType.NOTIFICATION;
            if (i != 2) {
                return listenerType;
            }
        }
        return listenerType2;
    }

    public static boolean copyFile(File file, File file2) throws BaseException {
        return copyFile(file, file2, true);
    }

    public static void copyFileFromExistFileWithSameName(DownloadInfo downloadInfo, String str, String str2) throws BaseException {
        if (downloadInfo == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || str2.equals(downloadInfo.getName())) {
            return;
        }
        DownloadFile downloadFile = new DownloadFile(downloadInfo.getSavePath(), str2);
        DownloadFile downloadFile2 = new DownloadFile(downloadInfo.getSavePath(), downloadInfo.getName());
        if (Logger.debug()) {
            String str3 = TAG;
            int id = downloadInfo.getId();
            StringBuilder M = a.M("ExistFile:");
            M.append(downloadFile.getPath());
            M.append(" targetFile:");
            M.append(downloadFile2.getPath());
            Logger.taskDebug(str3, id, "copyFileFromExistFileWithSameName", M.toString());
        }
        if (downloadFile2.exists() && !downloadFile2.canWrite()) {
            throw new BaseException(1001, "targetPath file exists but read-only");
        }
        if (!copyFile(downloadFile, downloadFile2, true)) {
            throw new BaseException(1001, String.format("Can't copy the exist file(%s/%s) to the target file(%s/%s)", downloadInfo.getSavePath(), str2, downloadInfo.getSavePath(), downloadInfo.getName()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.io.Closeable[]] */
    public static void copyFileToExternal(Context context, String str, Uri uri) {
        OutputStream outputStream;
        OutputStream outputStream2;
        ContentResolver contentResolver = context.getContentResolver();
        OutputStream outputStream3 = null;
        try {
            ?? fileInputStream = new FileInputStream(new File(str));
            if (uri != null) {
                try {
                    outputStream3 = contentResolver.openOutputStream(uri);
                } catch (IOException unused) {
                    outputStream2 = outputStream3;
                    outputStream3 = fileInputStream;
                    DownloadUtils.safeClose(outputStream3);
                    DownloadUtils.safeClose(outputStream2);
                    return;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream3;
                    outputStream3 = fileInputStream;
                    DownloadUtils.safeClose(outputStream3);
                    DownloadUtils.safeClose(outputStream);
                    throw th;
                }
            }
            if (outputStream3 != null) {
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream3.write(bArr, 0, read);
                    }
                }
            }
            DownloadUtils.safeClose((Closeable[]) new Closeable[]{fileInputStream});
            DownloadUtils.safeClose(outputStream3);
        } catch (IOException unused2) {
            outputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
    }

    public static <K, V> void copyMap(Map<K, V> map, Map<K, V> map2) {
        if (map == null || map2 == null) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static RandomAccessOutputStream createOutputStream(DownloadInfo downloadInfo, String str, String str2, int i, boolean z) throws BaseException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new BaseException(1021, new IOException("path must be not empty"));
        }
        File file = new File(str, str2);
        boolean z2 = false;
        if (file.exists() && file.isDirectory()) {
            throw new BaseException(DownloadErrorCode.ERROR_TEMP_FILE_IS_DIRECTORY, new IOException(String.format("path is :%s, path is directory:%B:", str, Boolean.valueOf(file.isDirectory()))));
        }
        if (!file.exists()) {
            try {
                File file2 = new File(str);
                if (!file2.exists() || !file2.isDirectory()) {
                    if (file2.exists()) {
                        file2.delete();
                        if (file2.mkdirs() || file2.exists()) {
                            throw new BaseException(DownloadErrorCode.ERROR_SAVE_PATH_NOT_DIRECTORY, "download savePath is not directory:" + str);
                        }
                        throw new BaseException(DownloadErrorCode.ERROR_SAVE_PATH_NOT_DIRECTORY, "download savePath is not directory:path=" + str);
                    }
                    if (!file2.mkdirs() && !file2.exists()) {
                        if (DownloadSetting.obtain(downloadInfo).optInt(DownloadSettingKeys.OPT_MKDIR_FAILED, 0) != 1) {
                            throw new BaseException(DownloadErrorCode.ERROR_SAVE_PATH_CREATE_FAILED, "download savePath directory can not created:" + str);
                        }
                        int i2 = 0;
                        while (!z2) {
                            int i3 = i2 + 1;
                            if (i2 >= 3) {
                                break;
                            }
                            try {
                                Thread.sleep(10L);
                                z2 = file2.mkdirs();
                                i2 = i3;
                            } catch (InterruptedException unused) {
                            }
                        }
                        if (!z2) {
                            if (DownloadUtils.getAvailableSpaceBytes(downloadInfo.getSavePath()) < DownloadConstants.MK_DIR_MIN_SPACE) {
                                throw new BaseException(1006, "download savePath directory can not created:" + str);
                            }
                            throw new BaseException(DownloadErrorCode.ERROR_SAVE_PATH_CREATE_FAILED, "download savePath directory can not created:" + str);
                        }
                    }
                }
                file.createNewFile();
            } catch (IOException e2) {
                throw new BaseException(DownloadErrorCode.ERROR_TEMP_FILE_CREATE_FAILED, e2);
            }
        }
        return new RandomAccessOutputStream(file, i, z);
    }

    @TargetApi(19)
    private static void doCopyFile(DownloadFile downloadFile, DownloadFile downloadFile2, boolean z) throws IOException {
        if (downloadFile2.exists() && downloadFile2.isDirectory()) {
            throw new IOException("Destination '" + downloadFile2 + "' exists but is a directory");
        }
        if (Build.VERSION.SDK_INT >= 29 && DownloadFileUtils.isFilePathInExternalPublicDir(downloadFile2.getPath())) {
            Uri uriFromFilePath = DownloadFileUtils.getUriFromFilePath(downloadFile2.getPath());
            if (uriFromFilePath != null) {
                copyFileToExternal(DownloadComponentManager.getAppContext(), downloadFile.getPath(), uriFromFilePath);
                return;
            }
            throw new IOException("Destination " + downloadFile2 + "exists but contentUri is null");
        }
        FileInputStream obtainInputStream = downloadFile.obtainInputStream();
        try {
            FileChannel channel = obtainInputStream.getChannel();
            try {
                FileOutputStream obtainOutputStream = downloadFile2.obtainOutputStream();
                try {
                    FileChannel channel2 = obtainOutputStream.getChannel();
                    try {
                        long size = channel.size();
                        long j = 0;
                        while (j < size) {
                            long j2 = size - j;
                            long transferFrom = channel2.transferFrom(channel, j, j2 > FILE_COPY_BUFFER_SIZE ? 31457280L : j2);
                            if (transferFrom == 0) {
                                break;
                            } else {
                                j += transferFrom;
                            }
                        }
                        if (channel2 != null) {
                            channel2.close();
                        }
                        obtainOutputStream.close();
                        channel.close();
                        obtainInputStream.close();
                        long length = downloadFile.length();
                        long length2 = downloadFile2.length();
                        if (length == length2) {
                            if (z) {
                                downloadFile2.setLastModified(downloadFile.lastModified());
                                return;
                            }
                            return;
                        }
                        throw new IOException("Failed to copy full contents from '" + downloadFile + "' to '" + downloadFile2 + "' Expected length: " + length + " Actual: " + length2);
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static long getCurByte(DownloadInfo downloadInfo) {
        if (downloadInfo != null && isBreakpointAvailable(downloadInfo)) {
            return downloadInfo.getCurBytes();
        }
        return 0L;
    }

    public static long getFirstOffset(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return -1L;
        }
        return downloadInfo.getCurBytes();
    }

    public static String getFixLengthString(String str, int i) {
        return i == 0 ? "" : (TextUtils.isEmpty(str) || str.length() <= i) ? str : str.substring(0, i);
    }

    public static DownloadTTNetException getTTNetException(Throwable th, String str) {
        DownloadTTNetException translateTTNetException = DownloadComponentManager.getTTNetHandler().translateTTNetException(th, null);
        if (translateTTNetException == null) {
            translateTTNetException = DownloadComponentManager.getTTNetHandler().translateTTNetException(th.getCause(), null);
        }
        if (translateTTNetException == null) {
            return null;
        }
        return new DownloadTTNetException(translateTTNetException.getErrorCode(), DownloadUtils.getErrorMsgWithTagPrefix(translateTTNetException, str)).setRequestLog(translateTTNetException.getRequestLog()).setRemoteIp(translateTTNetException.getRemoteIp());
    }

    private static void handleTempSaveCallback(int i, boolean z, BaseException baseException) {
        synchronized (saveTempFileStatusMap) {
            List<ITempFileSaveCompleteCallback> list = saveTempFileListeners.get(i);
            if (list != null) {
                for (ITempFileSaveCompleteCallback iTempFileSaveCompleteCallback : list) {
                    if (iTempFileSaveCompleteCallback != null) {
                        if (z) {
                            iTempFileSaveCompleteCallback.onSuccess();
                        } else {
                            iTempFileSaveCompleteCallback.onFailed(baseException);
                        }
                    }
                }
            }
            if (Logger.debug()) {
                Logger.taskDebug(TAG, i, "handleTempSaveCallback", "Run");
            }
            saveTempFileStatusMap.remove(i);
        }
    }

    public static void injectRemoteIp(IDownloadHttpConnection iDownloadHttpConnection, BaseException baseException) {
        if (iDownloadHttpConnection == null || !(iDownloadHttpConnection instanceof AbsDownloadHttpConnection) || baseException == null || !(baseException instanceof DownloadTTNetException)) {
            return;
        }
        String hostIp = ((AbsDownloadHttpConnection) iDownloadHttpConnection).getHostIp();
        if (!TextUtils.isEmpty(hostIp)) {
            ((DownloadTTNetException) baseException).setRemoteIp(hostIp);
        }
        ((DownloadTTNetException) baseException).parseRemoteIp();
    }

    public static boolean isBreakpointAvailable(DownloadInfo downloadInfo) {
        return downloadInfo.isFileDataValid();
    }

    public static boolean isCdnCacheHit(List<Pair<String, String>> list) {
        if (list == null) {
            return false;
        }
        for (Pair<String, String> pair : list) {
            if (!TextUtils.isEmpty((CharSequence) pair.second) && ((String) pair.second).toLowerCase().contains("hit")) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChunkedTask(IDownloadHeadHttpConnection iDownloadHeadHttpConnection) {
        if (iDownloadHeadHttpConnection == null) {
            return false;
        }
        return VALUE_CHUNKED.equals(iDownloadHeadHttpConnection.getResponseHeaderField(TRANSFER_ENCODING)) || DownloadUtils.getContentLength(iDownloadHeadHttpConnection) == -1;
    }

    public static boolean isConnectionException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = DownloadUtils.getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Exception in connect");
    }

    public static boolean isDownloaderProcess() {
        Boolean bool = sIsDownloaderProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (DownloadComponentManager.getAppContext() == null) {
            return false;
        }
        String curProcessName = DownloadUtils.getCurProcessName(DownloadComponentManager.getAppContext());
        if (curProcessName != null) {
            if (curProcessName.equals(DownloadComponentManager.getAppContext().getPackageName() + ":downloader")) {
                sIsDownloaderProcess = Boolean.TRUE;
                return sIsDownloaderProcess.booleanValue();
            }
        }
        sIsDownloaderProcess = Boolean.FALSE;
        return sIsDownloaderProcess.booleanValue();
    }

    public static boolean isForbiddenException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = DownloadUtils.getThrowableMsg(th);
        if (!(th instanceof DownloadHttpException) || (((DownloadHttpException) th).getHttpStatusCode() != 403 && (TextUtils.isEmpty(throwableMsg) || !throwableMsg.contains("403")))) {
            return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Forbidden");
        }
        return true;
    }

    public static boolean isHttpDataDirtyError(BaseException baseException) {
        return baseException != null && baseException.getErrorCode() == 1051;
    }

    public static boolean isHttpsError(BaseException baseException) {
        if (baseException == null) {
            return false;
        }
        return baseException.getErrorCode() == 1011 || (baseException.getCause() != null && (baseException.getCause() instanceof SSLHandshakeException));
    }

    public static boolean isInterceptError(Throwable th) {
        return th != null && (th instanceof BaseException) && ((BaseException) th).getErrorCode() == 1083;
    }

    public static boolean isMainProcess() {
        Boolean bool = sIsMainProcess;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (DownloadSetting.obtainGlobal().optInt(DownloadSettingKeys.FORCE_INDEPENDENT_PROCESS) > 0) {
            Boolean bool2 = Boolean.FALSE;
            sIsMainProcess = bool2;
            return bool2.booleanValue();
        }
        if (DownloadComponentManager.getAppContext() == null) {
            return true;
        }
        String curProcessName = DownloadUtils.getCurProcessName(DownloadComponentManager.getAppContext());
        if (curProcessName == null || !curProcessName.contains(Constants.COLON_SEPARATOR)) {
            sIsMainProcess = Boolean.valueOf(curProcessName != null && curProcessName.equals(DownloadComponentManager.getAppContext().getPackageName()));
        } else {
            sIsMainProcess = Boolean.FALSE;
        }
        return sIsMainProcess.booleanValue();
    }

    public static boolean isNetNotAvailableException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = DownloadUtils.getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("network not available");
    }

    public static boolean isResponseCode412Error(Throwable th) {
        if (th == null) {
            return false;
        }
        if (DownloadComponentManager.getTTNetHandler().getResponseCode(th) == 412) {
            return true;
        }
        String throwableMsg = DownloadUtils.getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Precondition Failed");
    }

    public static boolean isResponseCode416Error(Throwable th) {
        if (th == null) {
            return false;
        }
        if (DownloadComponentManager.getTTNetHandler().getResponseCode(th) == 416) {
            return true;
        }
        String throwableMsg = DownloadUtils.getThrowableMsg(th);
        return !TextUtils.isEmpty(throwableMsg) && throwableMsg.contains("Requested Range Not Satisfiable");
    }

    public static boolean isResponseCodeError(BaseException baseException) {
        if (baseException instanceof DownloadHttpException) {
            DownloadHttpException downloadHttpException = (DownloadHttpException) baseException;
            if (downloadHttpException.getHttpStatusCode() == 412 || downloadHttpException.getHttpStatusCode() == 416) {
                return true;
            }
        }
        return false;
    }

    public static boolean isResponseDataFromBegin(int i) {
        return i == 200 || i == 201 || i == 0;
    }

    public static boolean isTimeOutException(Throwable th) {
        if (th == null) {
            return false;
        }
        String throwableMsg = DownloadUtils.getThrowableMsg(th);
        if (!(th instanceof SocketTimeoutException)) {
            if (TextUtils.isEmpty(throwableMsg)) {
                return false;
            }
            if (!throwableMsg.contains("time out") && !throwableMsg.contains("Time-out")) {
                return false;
            }
        }
        return true;
    }

    public static HashMap<String, Integer> jsonObjectToHashMap(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (next != null) {
                hashMap.put(next, Integer.valueOf(jSONObject.optInt(next, 0)));
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static Map<Integer, DownloadInfo> listConvertToMap(List<DownloadInfo> list) {
        if (list == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (DownloadInfo downloadInfo : list) {
            if (downloadInfo.getId() != 0) {
                hashMap.put(Integer.valueOf(downloadInfo.getId()), downloadInfo);
            }
        }
        return hashMap;
    }

    public static <K, V> void mapConvertToList(Map<K, V> map, List<V> list) {
        if (map == null || list == null) {
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                list.add(entry.getValue());
            }
        }
    }

    public static boolean moveFile(DownloadFile downloadFile, DownloadFile downloadFile2) throws BaseException {
        if (Logger.debug()) {
            String str = TAG;
            StringBuilder M = a.M("DownloadFile Src:");
            M.append(downloadFile.getPath());
            M.append(" Dest:");
            M.append(downloadFile2.getPath());
            Logger.globalDebug(str, "moveFile", M.toString());
        }
        boolean renameTo = (DownloadFileUtils.isScopedStorage() && !DownloadFileUtils.isFilePathInExternalPublicDir(downloadFile.getAbsolutePath()) && DownloadFileUtils.isFilePathInExternalPublicDir(downloadFile2.getAbsolutePath())) ? false : downloadFile.renameTo(downloadFile2);
        if (!renameTo) {
            renameTo = copyFile(downloadFile, downloadFile2, true);
            try {
                if (Logger.debug()) {
                    Logger.globalDebug(TAG, "moveFile", "Copy DownloadFile Src:" + downloadFile.getPath() + " Dest:" + downloadFile2.getPath());
                }
                downloadFile.delete();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return renameTo;
    }

    public static boolean needNotifyDownloaderProcess() {
        return !isDownloaderProcess() && DownloadComponentManager.isDownloadInMultiProcess() && DownloadProxy.get(true).isServiceAlive();
    }

    public static long parseContentRangeOfInstanceLength(String str) {
        if (str == null) {
            return -1L;
        }
        String[] split = str.split("/");
        if (split.length >= 2) {
            try {
                return Long.parseLong(split[1]);
            } catch (NumberFormatException e2) {
                Logger.globalError(TAG, "parseContentRangeOfInstanceLength", "Exception:" + e2);
            }
        }
        return -1L;
    }

    public static DownloadInfo parseDownloadInfo(Cursor cursor) {
        if (cursor == null) {
            return new DownloadInfo();
        }
        DownloadInfo.RawBuilder rawBuilder = new DownloadInfo.RawBuilder();
        try {
            int columnIndex = cursor.getColumnIndex(DBDefinition.ID);
            if (columnIndex != -1) {
                rawBuilder.id = cursor.getInt(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("name");
            if (columnIndex2 != -1) {
                rawBuilder.name(cursor.getString(columnIndex2));
            }
            int columnIndex3 = cursor.getColumnIndex("title");
            if (columnIndex3 != -1) {
                rawBuilder.title(cursor.getString(columnIndex3));
            }
            int columnIndex4 = cursor.getColumnIndex("url");
            if (columnIndex4 != -1) {
                rawBuilder.url(cursor.getString(columnIndex4));
            }
            int columnIndex5 = cursor.getColumnIndex(DBDefinition.SAVE_PATH);
            if (columnIndex5 != -1) {
                rawBuilder.savePath(cursor.getString(columnIndex5));
            }
            int columnIndex6 = cursor.getColumnIndex(DBDefinition.TEMP_PATH);
            if (columnIndex6 != -1) {
                rawBuilder.tempPath(cursor.getString(columnIndex6));
            }
            int columnIndex7 = cursor.getColumnIndex(DBDefinition.CHUNK_COUNT);
            if (columnIndex7 != -1) {
                rawBuilder.chunkCount = cursor.getInt(columnIndex7);
            }
            int columnIndex8 = cursor.getColumnIndex("status");
            if (columnIndex8 != -1) {
                rawBuilder.status = cursor.getInt(columnIndex8);
            } else {
                rawBuilder.status = 0;
            }
            int columnIndex9 = cursor.getColumnIndex(DBDefinition.CUR_BYTES);
            if (columnIndex9 != -1) {
                rawBuilder.curBytes = cursor.getLong(columnIndex9);
            } else {
                rawBuilder.curBytes = 0L;
            }
            int columnIndex10 = cursor.getColumnIndex(DBDefinition.TOTAL_BYTES);
            if (columnIndex10 != -1) {
                rawBuilder.totalBytes = cursor.getLong(columnIndex10);
            }
            int columnIndex11 = cursor.getColumnIndex(DBDefinition.ETAG);
            if (columnIndex11 != -1) {
                rawBuilder.etag = cursor.getString(columnIndex11);
            }
            int columnIndex12 = cursor.getColumnIndex(DBDefinition.ONLY_WIFI);
            if (columnIndex12 != -1) {
                rawBuilder.onlyWifi(cursor.getInt(columnIndex12) != 0);
            }
            int columnIndex13 = cursor.getColumnIndex(DBDefinition.FORCE);
            if (columnIndex13 != -1) {
                rawBuilder.force(cursor.getInt(columnIndex13) != 0);
            }
            int columnIndex14 = cursor.getColumnIndex(DBDefinition.RETRY_COUNT);
            if (columnIndex14 != -1) {
                rawBuilder.retryCount(cursor.getInt(columnIndex14));
            }
            int columnIndex15 = cursor.getColumnIndex("extra");
            if (columnIndex15 != -1) {
                rawBuilder.extra(cursor.getString(columnIndex15));
            }
            int columnIndex16 = cursor.getColumnIndex(DBDefinition.MIME_TYPE);
            if (columnIndex16 != -1) {
                rawBuilder.mimeType(cursor.getString(columnIndex16));
            }
            int columnIndex17 = cursor.getColumnIndex(DBDefinition.NOTIFICATION_ENABLE);
            if (columnIndex17 != -1) {
                rawBuilder.showNotification(cursor.getInt(columnIndex17) != 0);
            }
            int columnIndex18 = cursor.getColumnIndex(DBDefinition.NOTIFICATION_VISIBILITY);
            if (columnIndex18 != -1) {
                rawBuilder.notificationVisibility = cursor.getInt(columnIndex18);
            }
            int columnIndex19 = cursor.getColumnIndex(DBDefinition.FIRST_DOWNLOAD);
            if (columnIndex19 != -1) {
                rawBuilder.isFirstDownload = cursor.getInt(columnIndex19) == 1;
            }
            int columnIndex20 = cursor.getColumnIndex(DBDefinition.FIRST_SUCCESS);
            if (columnIndex20 != -1) {
                rawBuilder.isFirstSuccess = cursor.getInt(columnIndex20) == 1;
            }
            int columnIndex21 = cursor.getColumnIndex(DBDefinition.NEED_HTTPS_TO_HTTP_RETRY);
            if (columnIndex21 != -1) {
                rawBuilder.needHttpsToHttpRetry(cursor.getInt(columnIndex21) == 1);
            }
            int columnIndex22 = cursor.getColumnIndex(DBDefinition.DOWNLOAD_TIME);
            if (columnIndex22 != -1) {
                rawBuilder.downloadTime = cursor.getLong(columnIndex22);
            }
            int columnIndex23 = cursor.getColumnIndex(DBDefinition.PACKAGE_NAME);
            if (columnIndex23 != -1) {
                rawBuilder.packageName(cursor.getString(columnIndex23));
            }
            int columnIndex24 = cursor.getColumnIndex("md5");
            if (columnIndex24 != -1) {
                rawBuilder.md5(cursor.getString(columnIndex24));
            }
            int columnIndex25 = cursor.getColumnIndex(DBDefinition.CUR_RETRY_TIME);
            if (columnIndex25 != -1) {
                rawBuilder.curRetryTime = cursor.getInt(columnIndex25);
            }
            int columnIndex26 = cursor.getColumnIndex(DBDefinition.DEFAULT_HTTP_SERVICE_BACKUP);
            if (columnIndex26 != -1) {
                rawBuilder.needDefaultHttpServiceBackUp(cursor.getInt(columnIndex26) == 1);
            }
            int columnIndex27 = cursor.getColumnIndex(DBDefinition.BACKUP_URLS_STR);
            if (columnIndex27 != -1) {
                rawBuilder.backUpUrlsStr = cursor.getString(columnIndex27);
            }
            int columnIndex28 = cursor.getColumnIndex(DBDefinition.BACKUP_URL_RETRY_COUNT);
            if (columnIndex28 != -1) {
                rawBuilder.backUpUrlRetryCount(cursor.getInt(columnIndex28));
            }
            int columnIndex29 = cursor.getColumnIndex(DBDefinition.REAL_DOWNLOAD_TIME);
            if (columnIndex29 != -1) {
                rawBuilder.realDownloadTime = cursor.getLong(columnIndex29);
            }
            int columnIndex30 = cursor.getColumnIndex(DBDefinition.INDEPENDENT_PROCESS);
            if (columnIndex30 != -1) {
                rawBuilder.needIndependentProcess(cursor.getInt(columnIndex30) == 1);
            }
            int columnIndex31 = cursor.getColumnIndex(DBDefinition.AUXILIARY_JSONOBJECT_STRING);
            if (columnIndex31 != -1) {
                rawBuilder.dbJsonDataString = cursor.getString(columnIndex31);
            }
            int columnIndex32 = cursor.getColumnIndex(DBDefinition.ICON_URL);
            if (columnIndex32 != -1) {
                rawBuilder.iconUrl(cursor.getString(columnIndex32));
            }
            int columnIndex33 = cursor.getColumnIndex(DBDefinition.APP_VERSION_CODE);
            if (columnIndex33 != -1) {
                rawBuilder.appVersionCode(cursor.getInt(columnIndex33));
            }
            int columnIndex34 = cursor.getColumnIndex(DBDefinition.DOWNLOAD_START_TIMESTAMP);
            if (columnIndex34 != -1) {
                rawBuilder.downloadStartTimeStamp = cursor.getLong(columnIndex34);
            }
            int columnIndex35 = cursor.getColumnIndex(DBDefinition.DOWNLOAD_FINISH_TIMESTAMP);
            if (columnIndex35 != -1) {
                rawBuilder.downloadFinishTimeStamp = cursor.getLong(columnIndex35);
            }
            int columnIndex36 = cursor.getColumnIndex(DBDefinition.INSTALLED_TIMESTAMP);
            if (columnIndex36 != -1) {
                rawBuilder.installedTimeStamp = cursor.getLong(columnIndex36);
            }
            int columnIndex37 = cursor.getColumnIndex(DBDefinition.CACHE_LIFE_TIME_MAX);
            if (columnIndex37 != -1) {
                rawBuilder.cacheLifeTimeMax(cursor.getLong(columnIndex37));
            }
            int columnIndex38 = cursor.getColumnIndex(DBDefinition.HAS_DO_INSTALLATION);
            if (columnIndex38 != -1) {
                rawBuilder.hasDoInstallation = cursor.getInt(columnIndex38) == 1;
            }
            int columnIndex39 = cursor.getColumnIndex(DBDefinition.PCDN_URLS_STR);
            if (columnIndex39 != -1) {
                rawBuilder.pcdnUrlsStr = cursor.getString(columnIndex39);
            }
            int columnIndex40 = cursor.getColumnIndex(DBDefinition.CDN_URLS_STR);
            if (columnIndex40 != -1) {
                rawBuilder.cdnUrlsStr = cursor.getString(columnIndex40);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return rawBuilder.build();
    }

    public static void parseException(Throwable th, String str) throws BaseException {
        String str2 = !TextUtils.isEmpty(str) ? str : "";
        if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            StringBuilder S = a.S(str2, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            S.append(baseException.getErrorMessage());
            baseException.setErrorMsg(S.toString());
            throw baseException;
        }
        if (th instanceof SSLHandshakeException) {
            throw new BaseException(1011, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (isTimeOutException(th)) {
            throw new BaseException(DownloadErrorCode.ERROR_TIME_OUT, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (isResponseCode412Error(th)) {
            throw new DownloadHttpException(1004, DownloadConstants.HTTP_PRECON_FAILED, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (isResponseCode416Error(th)) {
            throw new DownloadHttpException(1004, 416, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (isForbiddenException(th)) {
            throw new BaseException(DownloadErrorCode.ERROR_DOWNLOAD_FORBIDDEN, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (isNetNotAvailableException(th)) {
            throw new BaseException(DownloadErrorCode.ERROR_NETWORK_NOT_AVAILABLE, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (isConnectionException(th)) {
            throw new BaseException(DownloadErrorCode.ERROR_NETWORK_CONNECTION_IO, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        if (!(th instanceof IOException)) {
            throw new BaseException(1000, DownloadUtils.getErrorMsgWithTagPrefix(th, str2));
        }
        parseTTNetException(th, str);
        parseIOException((IOException) th, str);
    }

    public static void parseIOException(IOException iOException, String str) throws BaseException {
        if (str == null) {
            str = "";
        }
        String errorMsgWithTagPrefix = DownloadUtils.getErrorMsgWithTagPrefix(iOException, str);
        if (iOException instanceof ConnectException) {
            throw new BaseException(DownloadErrorCode.ERROR_NETWORK_CONNECTION_IO, errorMsgWithTagPrefix);
        }
        if (iOException instanceof UnknownHostException) {
            throw new BaseException(DownloadErrorCode.ERROR_UNKNOWN_HOST, errorMsgWithTagPrefix);
        }
        if (iOException instanceof NoRouteToHostException) {
            throw new BaseException(DownloadErrorCode.ERROR_NO_ROUTE_TO_HOST, errorMsgWithTagPrefix);
        }
        if (iOException instanceof UnknownServiceException) {
            throw new BaseException(DownloadErrorCode.ERROR_UNKNOWN_SERVICE, errorMsgWithTagPrefix);
        }
        if (iOException instanceof PortUnreachableException) {
            throw new BaseException(DownloadErrorCode.ERROR_PORT_UNREACHABLE, errorMsgWithTagPrefix);
        }
        if (iOException instanceof SocketTimeoutException) {
            throw new BaseException(DownloadErrorCode.ERROR_TIME_OUT, errorMsgWithTagPrefix);
        }
        if (iOException instanceof SocketException) {
            throw new BaseException(DownloadErrorCode.ERROR_SOCKET, errorMsgWithTagPrefix);
        }
        if (iOException instanceof HttpRetryException) {
            throw new BaseException(DownloadErrorCode.ERROR_HTTP_RETRY, errorMsgWithTagPrefix);
        }
        if (iOException instanceof ProtocolException) {
            throw new BaseException(DownloadErrorCode.ERROR_PROTOCOL, errorMsgWithTagPrefix);
        }
        if (iOException instanceof MalformedURLException) {
            throw new BaseException(DownloadErrorCode.ERROR_MALFORMED_URL, errorMsgWithTagPrefix);
        }
        if (iOException instanceof FileNotFoundException) {
            throw new BaseException(DownloadErrorCode.ERROR_FILE_NOT_FOUND, errorMsgWithTagPrefix);
        }
        if (iOException instanceof InterruptedIOException) {
            throw new BaseException(DownloadErrorCode.ERROR_INTERRUPTED_IO, errorMsgWithTagPrefix);
        }
        if (iOException instanceof UnsupportedEncodingException) {
            throw new BaseException(DownloadErrorCode.ERROR_UNSUPPORTED_ENCODING, errorMsgWithTagPrefix);
        }
        if (iOException instanceof EOFException) {
            throw new BaseException(DownloadErrorCode.ERROR_EOF, errorMsgWithTagPrefix);
        }
        if (iOException instanceof p) {
            throw new BaseException(DownloadErrorCode.ERROR_STREAM_RESET, errorMsgWithTagPrefix);
        }
        if (iOException instanceof SSLException) {
            throw new BaseException(1011, errorMsgWithTagPrefix);
        }
        if (!DownloadUtils.isInsufficientSpaceError(iOException)) {
            throw new BaseException(DownloadErrorCode.ERROR_IO, errorMsgWithTagPrefix);
        }
        throw new BaseException(1006, errorMsgWithTagPrefix);
    }

    private static void parseTTNetException(Throwable th, String str) throws DownloadTTNetException {
        DownloadTTNetException tTNetException = getTTNetException(th, str);
        if (tTNetException != null) {
            throw tTNetException;
        }
    }

    public static long parserMaxAge(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        Matcher matcher = Pattern.compile("max-age=([0-9]+)").matcher(str);
        if (!matcher.find()) {
            return 0L;
        }
        try {
            return Long.parseLong(matcher.group(1));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0L;
        }
    }

    public static void removeHeaderKey(List<HttpHeader> list, String str) {
        if (list == null || str == null) {
            return;
        }
        Iterator<HttpHeader> it2 = list.iterator();
        while (it2.hasNext()) {
            HttpHeader next = it2.next();
            if (next != null && !TextUtils.isEmpty(next.getName()) && next.getName().contains(str)) {
                it2.remove();
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void saveFileAsTargetName(com.ss.android.socialbase.downloader.model.DownloadInfo r17, com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r18, com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback r19) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.utils.DownloadHelper.saveFileAsTargetName(com.ss.android.socialbase.downloader.model.DownloadInfo, com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend, com.ss.android.socialbase.downloader.depend.ITempFileSaveCompleteCallback):void");
    }

    public static <K> void sparseArrayPutAll(SparseArray<K> sparseArray, Map<Integer, K> map) {
        if (map == null || sparseArray == null) {
            return;
        }
        for (Map.Entry<Integer, K> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                sparseArray.put(entry.getKey().intValue(), entry.getValue());
            }
        }
    }

    public static <K> HashMap<Integer, K> sparseArrayToHashMap(SparseArray<K> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        HashMap<Integer, K> hashMap = new HashMap<>();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            hashMap.put(Integer.valueOf(keyAt), sparseArray.valueAt(i));
        }
        return hashMap;
    }

    public static ContentValues toContentValues(DownloadInfo downloadInfo) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DBDefinition.ID, Integer.valueOf(downloadInfo.getRawId()));
        contentValues.put("url", downloadInfo.getUrl());
        contentValues.put(DBDefinition.SAVE_PATH, downloadInfo.getSavePath());
        contentValues.put(DBDefinition.TEMP_PATH, downloadInfo.getRawTempPath());
        contentValues.put("name", downloadInfo.getName());
        contentValues.put(DBDefinition.CHUNK_COUNT, Integer.valueOf(downloadInfo.getChunkCount()));
        contentValues.put("status", Integer.valueOf(downloadInfo.getStatus()));
        contentValues.put(DBDefinition.CUR_BYTES, Long.valueOf(downloadInfo.getCurBytes()));
        contentValues.put(DBDefinition.TOTAL_BYTES, Long.valueOf(downloadInfo.getTotalBytes()));
        contentValues.put(DBDefinition.ETAG, downloadInfo.geteTag());
        contentValues.put(DBDefinition.ONLY_WIFI, Integer.valueOf(downloadInfo.isOnlyWifi() ? 1 : 0));
        contentValues.put(DBDefinition.FORCE, Integer.valueOf(downloadInfo.isForce() ? 1 : 0));
        contentValues.put(DBDefinition.RETRY_COUNT, Integer.valueOf(downloadInfo.getRetryCount()));
        contentValues.put("extra", downloadInfo.getExtra());
        contentValues.put(DBDefinition.MIME_TYPE, downloadInfo.getMimeType());
        contentValues.put("title", downloadInfo.getRawTitle());
        contentValues.put(DBDefinition.NOTIFICATION_ENABLE, Integer.valueOf(downloadInfo.isShowNotification() ? 1 : 0));
        contentValues.put(DBDefinition.NOTIFICATION_VISIBILITY, Integer.valueOf(downloadInfo.getNotificationVisibility()));
        contentValues.put(DBDefinition.FIRST_DOWNLOAD, Integer.valueOf(downloadInfo.getIsFirstDownload() ? 1 : 0));
        contentValues.put(DBDefinition.FIRST_SUCCESS, Integer.valueOf(downloadInfo.isFirstSuccess() ? 1 : 0));
        contentValues.put(DBDefinition.NEED_HTTPS_TO_HTTP_RETRY, Integer.valueOf(downloadInfo.isNeedHttpsToHttpRetry() ? 1 : 0));
        contentValues.put(DBDefinition.DOWNLOAD_TIME, Long.valueOf(downloadInfo.getDownloadTime()));
        contentValues.put(DBDefinition.PACKAGE_NAME, downloadInfo.getPackageName());
        contentValues.put("md5", downloadInfo.getMd5());
        contentValues.put(DBDefinition.CUR_RETRY_TIME, Integer.valueOf(downloadInfo.getCurRetryTime()));
        contentValues.put(DBDefinition.DEFAULT_HTTP_SERVICE_BACKUP, Integer.valueOf(downloadInfo.isNeedDefaultHttpServiceBackUp() ? 1 : 0));
        contentValues.put(DBDefinition.CHUNK_RUNNABLE_REUSE, (Integer) 0);
        contentValues.put(DBDefinition.CHUNK_DOWNGRADE_RETRY, (Integer) 0);
        contentValues.put(DBDefinition.BACKUP_URLS_STR, downloadInfo.getBackUpUrlsStr());
        contentValues.put(DBDefinition.BACKUP_URL_RETRY_COUNT, Integer.valueOf(downloadInfo.getBackUpUrlRetryCount()));
        contentValues.put(DBDefinition.REAL_DOWNLOAD_TIME, Long.valueOf(downloadInfo.getRawRealDownloadTime()));
        contentValues.put(DBDefinition.INDEPENDENT_PROCESS, Integer.valueOf(downloadInfo.isNeedIndependentProcess() ? 1 : 0));
        contentValues.put(DBDefinition.AUXILIARY_JSONOBJECT_STRING, downloadInfo.getDBJsonDataString());
        contentValues.put(DBDefinition.ICON_URL, downloadInfo.getIconUrl());
        contentValues.put(DBDefinition.APP_VERSION_CODE, Integer.valueOf(downloadInfo.getAppVersionCode()));
        contentValues.put(DBDefinition.TASK_ID, (String) null);
        contentValues.put(DBDefinition.DOWNLOAD_START_TIMESTAMP, Long.valueOf(downloadInfo.getDownloadStartTimeStamp()));
        contentValues.put(DBDefinition.DOWNLOAD_FINISH_TIMESTAMP, Long.valueOf(downloadInfo.getDownloadFinishTimeStamp()));
        contentValues.put(DBDefinition.INSTALLED_TIMESTAMP, Long.valueOf(downloadInfo.getInstalledTimeStamp()));
        contentValues.put(DBDefinition.HAS_DO_INSTALLATION, Integer.valueOf(downloadInfo.isHasDoInstallation() ? 1 : 0));
        contentValues.put(DBDefinition.CACHE_LIFE_TIME_MAX, Long.valueOf(downloadInfo.getCacheLifeTimeMax()));
        contentValues.put(DBDefinition.PCDN_URLS_STR, downloadInfo.getPcdnUrlsStr());
        contentValues.put(DBDefinition.CDN_URLS_STR, downloadInfo.getCdnUrlsStr());
        return contentValues;
    }

    public static boolean copyFile(File file, File file2, boolean z) throws BaseException {
        return copyFile(new DownloadFile(file), new DownloadFile(file2), z);
    }

    public static boolean copyFile(DownloadFile downloadFile, DownloadFile downloadFile2, boolean z) throws BaseException {
        File parentFile;
        if (downloadFile != null && downloadFile2 != null) {
            try {
                if (downloadFile.exists() && !downloadFile.isDirectory() && !downloadFile.getAbsolutePath().equals(downloadFile2.getAbsolutePath())) {
                    if (downloadFile2.isTypeFile() && (parentFile = downloadFile2.getParentFile()) != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                        throw new BaseException(DownloadErrorCode.ERROR_TARGET_DIR_MKDIR_FAILED, "Destination '" + parentFile + "' directory cannot be created");
                    }
                    if (Logger.debug()) {
                        Logger.globalDebug(TAG, "copyFile", "SrcFile:" + downloadFile.getPath() + " DestFile:" + downloadFile2.getPath());
                    }
                    if (downloadFile2.exists() && !downloadFile2.canWrite()) {
                        throw new IOException("Destination '" + downloadFile2.getAbsolutePath() + "' exists but is read-only");
                    }
                    doCopyFile(downloadFile, downloadFile2, z);
                    return true;
                }
            } catch (BaseException e2) {
                throw e2;
            } catch (Throwable th) {
                parseException(th, "CopyFile");
                return false;
            }
        }
        return false;
    }
}
