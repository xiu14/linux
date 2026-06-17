package com.lele.llmonitor.i18n;
public final class TextI18nKt {
    private static final java.util.Map enMap;
    private static final yt2 patternComponents;
    private static final yt2 patternCpuOffline;
    private static final yt2 patternForComponents;
    private static final yt2 patternLicenseGroups;
    private static final yt2 patternLicenseSummary;
    private static final yt2 patternLicenseTypes;
    private static final yt2 patternMinutes;
    private static final yt2 patternOnline;
    private static final yt2 patternSeconds;
    private static final yt2 patternSource;
    private static final yt2 patternStatus;
    private static final yt2 patternStatusWithRemaining;
    private static final java.util.Map zhHantMap;
    private static final java.util.Map zhHkMap;
    private static final java.util.Map zhHkOverrides;
    private static final java.util.Map zhTwMap;
    private static final java.util.Map zhTwOverrides;

    static TextI18nKt()
    {
        yt2 v0_361 = new qh2("\u5f00\u6e90\u8bb8\u53ef", "\u958b\u6e90\u6388\u6b0a");
        String v1_38 = new qh2("\u5f00\u6e90\u8bb8\u53ef\u6682\u4e0d\u53ef\u7528", "\u958b\u6e90\u6388\u6b0a\u66ab\u4e0d\u53ef\u7528");
        qh2 v2_0 = new qh2("\u6b63\u5728\u8bfb\u53d6\u5f53\u524d\u7248\u672c\u9644\u5e26\u7684\u8bb8\u53ef\u6750\u6599\u2026", "\u6b63\u5728\u8b80\u53d6\u7576\u524d\u7248\u672c\u9644\u5e36\u7684\u6388\u6b0a\u6750\u6599\u2026");
        qh2 v3_4 = new qh2("\u9002\u7528\u7ec4\u4ef6", "\u9069\u7528\u7d44\u4ef6");
        qh2 v5_5 = new qh2("\u8bb8\u53ef\u6807\u8bc6\u4e0e\u94fe\u63a5", "\u6388\u6b0a\u6a19\u8b58\u8207\u9023\u7d50");
        qh2 v6_4 = new qh2("\u8bb8\u53ef\u8bc1", "\u6388\u6b0a\u689d\u6b3e");
        qh2 v7_271 = new qh2("\u672a\u58f0\u660e", "\u672a\u8072\u660e");
        qh2 v8_8 = new qh2("\u94fe\u63a5", "\u9023\u7d50");
        qh2 v9_14 = new qh2("\u8fd4\u56de", "\u8fd4\u56de");
        qh2 v11_6 = new qh2("\u8bb8\u53ef\u8be6\u60c5", "\u6388\u6b0a\u8a73\u60c5");
        qh2 v12_5 = new qh2("\u672a\u627e\u5230\u5bf9\u5e94\u7684\u8bb8\u53ef\u4fe1\u606f\u3002", "\u672a\u627e\u5230\u5c0d\u61c9\u7684\u6388\u6b0a\u8cc7\u8a0a\u3002");
        qh2 v13_5 = new qh2("\u8bb8\u53ef\u8bc1\u5168\u6587", "\u6388\u6b0a\u689d\u6b3e\u5168\u6587");
        qh2 v14_99 = new qh2("NOTICE \u58f0\u660e", "NOTICE \u8072\u660e");
        qh2 v10_55 = new qh2("\u663e\u793a\u672c\u6b21\u5173\u95ed\u6309\u94ae", "\u986f\u793a\u672c\u6b21\u95dc\u9589\u6309\u9215");
        qh2 v4_156 = qc1.S("\u5220\u9664\u6240\u6709\u5df2\u5b58\u50a8\u7684\u5145\u7535\u529f\u7387\u8bb0\u5f55", "\u522a\u9664\u6240\u6709\u5df2\u5132\u5b58\u7684\u5145\u96fb\u529f\u7387\u7d00\u9304");
        qh2 v108_1 = qc1.S("\u6e05\u9664", "\u6e05\u9664");
        qh2 v110_1 = v4_156;
        qh2 v4_160 = qc1.S("\u6d45\u8272\u6a21\u5f0f", "\u6dfa\u8272\u6a21\u5f0f");
        qh2 v112_1 = qc1.S("\u6df1\u8272\u6a21\u5f0f", "\u6df1\u8272\u6a21\u5f0f");
        qh2 v114_1 = v4_160;
        qh2 v4_162 = qc1.S("\u7b80\u4f53\u4e2d\u6587\uff08\u4e2d\u56fd\uff09", "\u7c21\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\uff09");
        qh2 v115_1 = qc1.S("\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u9999\u6e2f\uff09", "\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u9999\u6e2f\uff09");
        qh2 v117_1 = qc1.S("\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u53f0\u7063\uff09", "\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u53f0\u7063\uff09");
        qh2 v119_1 = v4_162;
        qh2 v4_185 = qc1.S("\u6ca7\u84dd", "\u6ec4\u85cd");
        qh2 v132_1 = qc1.S("\u677e\u9752", "\u677e\u9752");
        qh2 v134_1 = qc1.S("\u66db\u6a59", "\u66db\u6a59");
        qh2 v136_1 = v4_185;
        qh2 v4_195 = qc1.S("\u6dfb\u52a0\u58c1\u7eb8", "\u65b0\u589e\u684c\u5e03");
        qh2 v143_1 = qc1.S("\u900f\u660e\u5ea6", "\u900f\u660e\u5ea6");
        qh2 v145_1 = qc1.S("\u6a21\u7cca\u5ea6", "\u6a21\u7cca\u5ea6");
        qh2 v147_1 = v4_195;
        qh2[] v15_258 = qc1.S("\u5e94\u7528\u540d\u79f0", "\u61c9\u7528\u7a0b\u5f0f\u540d\u7a31");
        qh2 v153_1 = qc1.S("\u4f5c\u8005", "\u4f5c\u8005");
        qh2 v155_1 = qc1.S("\u7248\u672c", "\u7248\u672c");
        qh2 v157_1 = v15_258;
        qh2 v4_216 = qc1.S("\u4fdd\u5b58", "\u5132\u5b58");
        qh2 v165_1 = qc1.S("\u89d2\u5ea6", "\u89d2\u5ea6");
        qh2 v167_1 = v4_216;
        qh2 v4_218 = qc1.S("\u91cd\u7f6e", "\u91cd\u8a2d");
        qh2 v168_1 = qc1.S("90\u5ea6", "90\u5ea6");
        qh2 v170_1 = v4_218;
        qh2 v4_231 = qc1.S("\u5185\u5b58\u5360\u7528", "\u8a18\u61b6\u9ad4\u4f7f\u7528");
        qh2 v177_1 = qc1.S("\u53d7\u9650", "\u53d7\u9650");
        qh2 v179_1 = v4_231;
        qh2[] v15_288 = qc1.S("\u672a\u53d1\u73b0\u53ef\u8bfb\u4e14\u4e0e SoC \u76f8\u5173\u7684 thermal_zone \u8282\u70b9\u3002", "\u672a\u767c\u73fe\u53ef\u8b80\u4e14\u8207 SoC \u76f8\u95dc\u7684 thermal_zone \u7bc0\u9ede\u3002");
        qh2 v190_1 = qc1.S("\u672a\u5206\u7c07", "\u672a\u5206\u7c07");
        qh2 v192_1 = v15_288;
        qh2 v4_254 = qc1.S("\u5141\u8bb8\u901a\u77e5", "\u5141\u8a31\u901a\u77e5");
        qh2 v201_1 = qc1.S("\u4e0d\u518d\u63d0\u9192", "\u4e0d\u518d\u63d0\u9192");
        qh2 v203_1 = v4_254;
        qh2 v4_290 = qc1.S("1. \u6b64\u5904\u5bb9\u91cf\u4e0e\u767e\u5206\u6bd4\u57fa\u4e8e\u7cfb\u7edf\u63d0\u4f9b\u7684\u7535\u6c60\u5bb9\u91cf\u6570\u636e\u8ba1\u7b97\uff0c\u5e76\u975e\u7cfb\u7edf\u72b6\u6001\u680f\u767e\u5206\u6bd4\u3002\n2. \u90e8\u5206\u5382\u5546\u5b58\u5728\u9501\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73b0\u7cfb\u7edf\u663e\u793a\u5df2\u5145\u6ee1\uff0c\u4f46\u5b9e\u9645\u7535\u6c60\u5bb9\u91cf\u5c1a\u672a\u8fbe\u5230\u6ee1\u503c\u7684\u60c5\u51b5\u3002", "1. \u6b64\u8655\u5bb9\u91cf\u8207\u767e\u5206\u6bd4\u662f\u6839\u64da\u7cfb\u7d71\u63d0\u4f9b\u7684\u96fb\u6c60\u5bb9\u91cf\u8cc7\u6599\u8a08\u7b97\uff0c\u4e26\u975e\u7cfb\u7d71\u72c0\u614b\u5217\u767e\u5206\u6bd4\u3002\n2. \u90e8\u5206\u5ee0\u5546\u53ef\u80fd\u6709\u9396\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73fe\u7cfb\u7d71\u986f\u793a\u5df2\u5145\u6eff\uff0c\u4f46\u5be6\u969b\u96fb\u6c60\u5bb9\u91cf\u5c1a\u672a\u9054\u5230\u6eff\u503c\u7684\u60c5\u6cc1\u3002");
        qh2 v228 = qc1.S("\u77e5\u9053\u4e86", "\u77e5\u9053\u4e86");
        qh2 v230 = qc1.S("\u672a\u77e5", "\u672a\u77e5");
        qh2 v232 = v4_290;
        qh2 v4_303 = qc1.S("\u7535\u6c60\u4f9b\u7535", "\u96fb\u6c60\u4f9b\u96fb");
        qh2 v238 = qc1.S("\u826f\u597d", "\u826f\u597d");
        qh2 v240 = v4_303;
        qh2 v4_310 = qc1.S("\u8fc7\u538b", "\u904e\u58d3");
        qh2 v243 = qc1.S("\u6545\u969c", "\u6545\u969c");
        qh2 v245 = v4_310;
        qh2[] v15_6 = qc1.S("\u540e\u53f0\u76d1\u6d4b\u4e2d", "\u80cc\u666f\u76e3\u6e2c\u4e2d");
        qh2 v4_13 = new qh2[204];
        v4_13[0] = v0_361;
        v4_13[1] = v1_38;
        v4_13[2] = v2_0;
        v4_13[3] = v3_4;
        v4_13[4] = v5_5;
        v4_13[5] = v6_4;
        v4_13[6] = v7_271;
        v4_13[7] = v8_8;
        v4_13[8] = v9_14;
        v4_13[9] = v11_6;
        v4_13[10] = v12_5;
        v4_13[11] = v13_5;
        v4_13[12] = v14_99;
        v4_13[13] = new qh2("\u8bb8\u53ef\u6750\u6599", "\u6388\u6b0a\u6750\u6599");
        v4_13[14] = new qh2("\u6682\u65e0\u53ef\u5c55\u793a\u7684\u8bb8\u53ef\u6587\u672c\u3002", "\u66ab\u7121\u53ef\u5c55\u793a\u7684\u6388\u6b0a\u6587\u672c\u3002");
        v4_13[15] = new qh2("\u88c1\u5207\u58c1\u7eb8", "\u88c1\u5207\u684c\u5e03");
        v4_13[16] = new qh2("\u5916\u89c2\u8bbe\u7f6e", "\u5916\u89c0\u8a2d\u5b9a");
        v4_13[17] = new qh2("\u91cd\u8981\u63d0\u793a", "\u91cd\u8981\u63d0\u793a");
        v4_13[18] = new qh2("\u540e\u53f0\u5e38\u9a7b\u4e0e\u5b9e\u65f6\u901a\u77e5\u8bf4\u660e", "\u5f8c\u53f0\u5e38\u99d0\u8207\u5373\u6642\u901a\u77e5\u8aaa\u660e");
        v4_13[19] = new qh2("\u5e38\u9a7b\u540e\u53f0", "\u5e38\u99d0\u5f8c\u53f0");
        v4_13[20] = new qh2("\u5b9e\u65f6\u901a\u77e5", "\u5373\u6642\u901a\u77e5");
        v4_13[21] = new qh2("\u573a\u666f\u8bbe\u7f6e", "\u5834\u666f\u8a2d\u5b9a");
        v4_13[22] = new qh2("\u786c\u4ef6\u4fee\u6b63", "\u786c\u9ad4\u4fee\u6b63");
        v4_13[23] = new qh2("\u7cfb\u7edf\u4e0e\u8bca\u65ad", "\u7cfb\u7d71\u8207\u8a3a\u65b7");
        v4_13[24] = new qh2("\u6570\u636e\u7ba1\u7406", "\u8cc7\u6599\u7ba1\u7406");
        v4_13[25] = new qh2("\u5173\u4e8e", "\u95dc\u65bc");
        v4_13[26] = new qh2("\u8bbe\u7f6e", "\u8a2d\u5b9a");
        v4_13[27] = new qh2("1. \u5148\u653e\u5f00\u540e\u53f0", "1. \u5148\u653e\u958b\u5f8c\u53f0");
        v4_13[28] = new qh2("\u989d\u5916\u5141\u8bb8\u5b8c\u5168\u540e\u53f0", "\u984d\u5916\u5141\u8a31\u5b8c\u6574\u5f8c\u53f0");
        v4_13[29] = new qh2("\u9664\u5173\u95ed\u7535\u6c60\u4f18\u5316\u5916\uff0c\u8fd8\u8bf7\u5728\u5e94\u7528\u8017\u7535\u7ba1\u7406\u4e2d\u9009\u62e9\u5b8c\u5168\u5141\u8bb8\u540e\u53f0\u884c\u4e3a\uff0c\u907f\u514d\u5b9e\u65f6\u901a\u77e5\u5ef6\u540e\u3002\u6b64\u5e94\u7528\u6309\u5e38\u9a7b\u540e\u53f0\u573a\u666f\u4f18\u5316\uff0c\u6b63\u5e38\u8017\u7535\u5c5e\u9884\u671f\u3002", "\u9664\u4e86\u95dc\u9589\u96fb\u6c60\u6700\u4f73\u5316\u5916\uff0c\u9084\u8acb\u5728\u61c9\u7528\u8017\u96fb\u7ba1\u7406\u4e2d\u9078\u64c7\u5b8c\u5168\u5141\u8a31\u80cc\u666f\u884c\u70ba\uff0c\u907f\u514d\u5373\u6642\u901a\u77e5\u5ef6\u5f8c\u3002\u6b64\u61c9\u7528\u6309\u5e38\u99d0\u80cc\u666f\u5834\u666f\u512a\u5316\uff0c\u6b63\u5e38\u8017\u96fb\u5c6c\u9810\u671f\u3002");
        v4_13[30] = new qh2("2. \u6253\u5f00\u5b9e\u65f6\u901a\u77e5", "2. \u958b\u555f\u5373\u6642\u901a\u77e5");
        v4_13[31] = new qh2("\u6309\u5382\u5546\u624b\u52a8\u5f00\u542f", "\u4f9d\u5ee0\u5546\u624b\u52d5\u958b\u555f");
        v4_13[32] = new qh2("\u82e5\u8981\u4f7f\u7528\u5b9e\u65f6\u901a\u77e5\uff08\u7075\u52a8\u5c9b\uff09\uff0c\u8bf7\u5728\u5e94\u7528\u901a\u77e5\u7ba1\u7406\u91cc\u624b\u52a8\u6253\u5f00\u201c\u6d41\u4f53\u4e91\u663e\u793a\u5b9e\u65f6\u6d3b\u52a8\u201d\uff08OPPO\uff09\u6216\u201c\u5b9e\u65f6\u52a8\u6001\u201d\uff08\u5c0f\u7c73\uff09\u3002\u4e0d\u540c\u5382\u5546\u5165\u53e3\u4e0d\u540c\uff0c\u8bf7\u4ee5\u7cfb\u7edf\u8bbe\u7f6e\u4e3a\u51c6\u3002", "\u82e5\u8981\u4f7f\u7528\u5373\u6642\u901a\u77e5\uff08\u9748\u52d5\u5cf6\uff09\uff0c\u8acb\u5728\u61c9\u7528\u901a\u77e5\u7ba1\u7406\u88e1\u624b\u52d5\u958b\u555f\u300c\u6d41\u9ad4\u96f2\u986f\u793a\u5373\u6642\u6d3b\u52d5\u300d\uff08OPPO\uff09\u6216\u300c\u5373\u6642\u52d5\u614b\u300d\uff08\u5c0f\u7c73\uff09\u3002\u4e0d\u540c\u5ee0\u5546\u5165\u53e3\u4e0d\u540c\uff0c\u8acb\u4ee5\u7cfb\u7d71\u8a2d\u5b9a\u70ba\u6e96\u3002");
        v4_13[33] = new qh2("3. \u4ec5\u90e8\u5206\u673a\u578b\u652f\u6301", "3. \u50c5\u90e8\u5206\u6a5f\u578b\u652f\u63f4");
        v4_13[34] = new qh2("Android 16 \u4ee5\u4e0a\u53ef\u89c1", "Android 16 \u4ee5\u4e0a\u53ef\u898b");
        v4_13[35] = new qh2("\u5b9e\u65f6\u901a\u77e5\u53ea\u652f\u6301\u90e8\u5206 Android 16 \u673a\u578b\uff0c\u53d6\u51b3\u4e8e\u5382\u5546\u662f\u5426\u63a5\u5165\u539f\u751f\u5b9e\u65f6\u6d3b\u52a8\u3002Android 16 \u4ee5\u4e0b\u673a\u578b\u5df2\u9690\u85cf\u8be5\u9009\u9879\u3002", "\u5373\u6642\u901a\u77e5\u50c5\u652f\u63f4\u90e8\u5206 Android 16 \u6a5f\u578b\uff0c\u53d6\u6c7a\u65bc\u5ee0\u5546\u662f\u5426\u63a5\u5165\u539f\u751f\u5373\u6642\u6d3b\u52d5\u3002Android 16 \u4ee5\u4e0b\u6a5f\u578b\u5df2\u96b1\u85cf\u8a72\u9078\u9805\u3002");
        v4_13[36] = new qh2("\u6e05\u9664\u8bb0\u5f55", "\u6e05\u9664\u7d00\u9304");
        v4_13[37] = new qh2("\u786e\u5b9a\u8981\u6e05\u7a7a\u6240\u6709\u5145\u7535\u5386\u53f2\u6570\u636e\u5417\uff1f\n\u6b64\u64cd\u4f5c\u4e0d\u53ef\u64a4\u9500\uff0c\u56fe\u8868\u5c06\u88ab\u91cd\u7f6e\u3002", "\u78ba\u5b9a\u8981\u6e05\u7a7a\u6240\u6709\u5145\u96fb\u6b77\u53f2\u8cc7\u6599\u55ce\uff1f\n\u6b64\u64cd\u4f5c\u4e0d\u53ef\u5fa9\u539f\uff0c\u5716\u8868\u5c07\u88ab\u91cd\u8a2d\u3002");
        v4_13[38] = new qh2("\u5220\u9664", "\u522a\u9664");
        v4_13[39] = new qh2("\u53d6\u6d88", "\u53d6\u6d88");
        v4_13[40] = new qh2("\u786e\u8ba4\u5207\u6362\u663e\u793a\u6a21\u5f0f", "\u78ba\u8a8d\u5207\u63db\u986f\u793a\u6a21\u5f0f");
        v4_13[41] = new qh2("\u5207\u6362\u663e\u793a\u6a21\u5f0f\u540e\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\u4ee5\u5237\u65b0\u542f\u52a8\u56fe\u6807\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "\u5207\u63db\u986f\u793a\u6a21\u5f0f\u5f8c\uff0c\u61c9\u7528\u7a0b\u5f0f\u5c07\u5617\u8a66\u81ea\u52d5\u91cd\u65b0\u555f\u52d5\u4ee5\u5237\u65b0\u555f\u52d5\u5716\u793a\uff1b\u82e5\u91cd\u65b0\u555f\u52d5\u5931\u6557\uff0c\u8acb\u624b\u52d5\u91cd\u65b0\u958b\u555f\u61c9\u7528\u7a0b\u5f0f\u3002\u662f\u5426\u7e7c\u7e8c\uff1f");
        v4_13[42] = new qh2("\u786e\u8ba4\u5e76\u91cd\u542f", "\u78ba\u8a8d\u4e26\u91cd\u65b0\u555f\u52d5");
        v4_13[43] = new qh2("\u786e\u8ba4\u5207\u6362\u542f\u52a8\u56fe\u6807", "\u78ba\u8a8d\u5207\u63db\u555f\u52d5\u5716\u793a");
        v4_13[44] = new qh2("\u5207\u6362\u542f\u52a8\u56fe\u6807\u6837\u5f0f\u9700\u8981\u5237\u65b0\u684c\u9762\u5165\u53e3\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "\u5207\u63db\u555f\u52d5\u5716\u793a\u6a23\u5f0f\u9700\u8981\u5237\u65b0\u684c\u9762\u5165\u53e3\uff0c\u61c9\u7528\u7a0b\u5f0f\u5c07\u5617\u8a66\u81ea\u52d5\u91cd\u65b0\u555f\u52d5\uff1b\u82e5\u91cd\u65b0\u555f\u52d5\u5931\u6557\uff0c\u8acb\u624b\u52d5\u91cd\u65b0\u958b\u555f\u61c9\u7528\u7a0b\u5f0f\u3002\u662f\u5426\u7e7c\u7e8c\uff1f");
        v4_13[45] = new qh2("\u786e\u8ba4\u5207\u6362\u4e3b\u9898\u914d\u8272", "\u78ba\u8a8d\u5207\u63db\u4e3b\u984c\u914d\u8272");
        v4_13[46] = new qh2("\u5207\u6362\u4e3b\u9898\u914d\u8272\u4f1a\u540c\u6b65\u66f4\u65b0\u5e94\u7528\u56fe\u6807\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "\u5207\u63db\u4e3b\u984c\u914d\u8272\u6703\u540c\u6b65\u66f4\u65b0\u61c9\u7528\u7a0b\u5f0f\u5716\u793a\uff0c\u61c9\u7528\u7a0b\u5f0f\u5c07\u5617\u8a66\u81ea\u52d5\u91cd\u65b0\u555f\u52d5\uff1b\u82e5\u91cd\u65b0\u555f\u52d5\u5931\u6557\uff0c\u8acb\u624b\u52d5\u91cd\u65b0\u958b\u555f\u61c9\u7528\u7a0b\u5f0f\u3002\u662f\u5426\u7e7c\u7e8c\uff1f");
        v4_13[47] = new qh2("\u786e\u8ba4\u5207\u6362\u8bed\u8a00", "\u78ba\u8a8d\u5207\u63db\u8a9e\u8a00");
        v4_13[48] = new qh2("\u5207\u6362\u8bed\u8a00\u540e\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\u4ee5\u5e94\u7528\u65b0\u7684\u754c\u9762\u8bed\u8a00\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "\u5207\u63db\u8a9e\u8a00\u5f8c\uff0c\u61c9\u7528\u7a0b\u5f0f\u5c07\u5617\u8a66\u81ea\u52d5\u91cd\u65b0\u555f\u52d5\u4ee5\u5957\u7528\u65b0\u7684\u4ecb\u9762\u8a9e\u8a00\uff1b\u82e5\u91cd\u65b0\u555f\u52d5\u5931\u6557\uff0c\u8acb\u624b\u52d5\u91cd\u65b0\u958b\u555f\u61c9\u7528\u7a0b\u5f0f\u3002\u662f\u5426\u7e7c\u7e8c\uff1f");
        v4_13[49] = new qh2("\u5173\u4e8e LLMonitor", "\u95dc\u65bc LLMonitor");
        v4_13[50] = new qh2("\u5145\u7535/\u672a\u5145\u7535\u901a\u77e5\u4e0e\u5237\u65b0\u9891\u7387", "\u5145\u96fb\uff0f\u672a\u5145\u96fb\u901a\u77e5\u8207\u66f4\u65b0\u983b\u7387");
        v4_13[51] = new qh2("\u5145\u7535\u65f6", "\u5145\u96fb\u6642");
        v4_13[52] = new qh2("\u672a\u5145\u7535\u65f6", "\u672a\u5145\u96fb\u6642");
        v4_13[53] = new qh2("\u901a\u77e5", "\u901a\u77e5");
        v4_13[54] = new qh2("\u5728\u901a\u77e5\u680f\u663e\u793a\u5b9e\u65f6\u529f\u7387\u4fe1\u606f", "\u5728\u901a\u77e5\u6b04\u986f\u793a\u5373\u6642\u529f\u7387\u8cc7\u8a0a");
        v4_13[55] = new qh2("\u5b9e\u65f6\u6d3b\u52a8", "\u5373\u6642\u6d3b\u52d5");
        v4_13[56] = new qh2("\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u5b9e\u51b5\u901a\u77e5", "\u986f\u793a\u9748\u52d5\u5cf6\u98a8\u683c\u7684\u5373\u6642\u901a\u77e5");
        v4_13[57] = v10_55;
        v4_13[58] = qc1.S("\u5728\u5b9e\u65f6\u6d3b\u52a8\u4e2d\u663e\u793a\u201c\u672c\u6b21\u5173\u95ed\u201d\u6309\u94ae", "\u5728\u5373\u6642\u6d3b\u52d5\u4e2d\u986f\u793a\u300c\u672c\u6b21\u95dc\u9589\u300d\u6309\u9215");
        v4_13[59] = qc1.S("\u901a\u77e5\u663e\u793a\u6570\u636e", "\u901a\u77e5\u986f\u793a\u8cc7\u6599");
        v4_13[60] = qc1.S("\u9009\u62e9\u901a\u77e5\u6b63\u6587\u4e2d\u663e\u793a\u7684\u6570\u636e", "\u9078\u64c7\u901a\u77e5\u6b63\u6587\u4e2d\u986f\u793a\u7684\u8cc7\u6599");
        v4_13[61] = qc1.S("\u7535\u91cf\u767e\u5206\u6bd4", "\u96fb\u91cf\u767e\u5206\u6bd4");
        v4_13[62] = qc1.S("\u4f9b\u7535\u65b9\u5f0f", "\u4f9b\u96fb\u65b9\u5f0f");
        v4_13[63] = qc1.S("\u5e94\u7528\u754c\u9762\u66f4\u65b0\u7387", "\u61c9\u7528\u7a0b\u5f0f\u4ecb\u9762\u66f4\u65b0\u7387");
        v4_13[64] = qc1.S("\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387", "\u901a\u77e5\uff0f\u7d44\u4ef6\u66f4\u65b0\u7387");
        v4_13[65] = qc1.S("\u7184\u5c4f\u4e0b\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387", "\u7184\u5c4f\u6642\u901a\u77e5\uff0f\u7d44\u4ef6\u66f4\u65b0\u7387");
        v4_13[66] = qc1.S("\u4fdd\u7559\u901a\u77e5\u680f\u5e38\u9a7b\u663e\u793a", "\u4fdd\u7559\u901a\u77e5\u6b04\u5e38\u99d0\u986f\u793a");
        v4_13[67] = qc1.S("\u517c\u5bb9\u4e0d\u540c\u8bbe\u5907\u7684\u7535\u6c60\u8bfb\u6570", "\u76f8\u5bb9\u4e0d\u540c\u88dd\u7f6e\u7684\u96fb\u6c60\u8b80\u6578");
        v4_13[68] = qc1.S("\u53cd\u8f6c\u7535\u6d41\u6b63\u8d1f", "\u53cd\u8f49\u96fb\u6d41\u6b63\u8ca0");
        v4_13[69] = qc1.S("\u5982\u679c\u5145\u7535\u65f6\u7535\u6d41\u663e\u793a\u4e3a\u8d1f\uff0c\u8bf7\u5f00\u542f\u6b64\u9879", "\u5982\u679c\u5145\u96fb\u6642\u96fb\u6d41\u986f\u793a\u70ba\u8ca0\uff0c\u8acb\u958b\u555f\u6b64\u9805");
        v4_13[70] = qc1.S("\u53cc\u82af\u7535\u6c60\u4fee\u6b63", "\u96d9\u82af\u96fb\u6c60\u4fee\u6b63");
        v4_13[71] = qc1.S("\u5982\u679c\u4f7f\u7528\u53cc\u82af\u7535\u6c60\uff0c\u8bf7\u5f00\u542f\u6b64\u9879", "\u5982\u679c\u4f7f\u7528\u96d9\u82af\u96fb\u6c60\uff0c\u8acb\u958b\u555f\u6b64\u9805");
        v4_13[72] = qc1.S("\u865a\u62df\u7535\u538b", "\u865b\u64ec\u96fb\u58d3");
        v4_13[73] = qc1.S("\u82e5\u8bbe\u5907\u65e0\u6cd5\u8bfb\u53d6\u7535\u538b\uff0c\u5c1d\u8bd5\u4f7f\u7528\u4f30\u7b97\u7535\u538b", "\u82e5\u88dd\u7f6e\u7121\u6cd5\u8b80\u53d6\u96fb\u58d3\uff0c\u8acb\u5617\u8a66\u4f7f\u7528\u4f30\u7b97\u96fb\u58d3");
        v4_13[74] = qc1.S("\u540e\u53f0\u4fdd\u6d3b\u4e0e\u8c03\u8bd5\u9009\u9879", "\u80cc\u666f\u4fdd\u6d3b\u8207\u5075\u932f\u9078\u9805");
        v4_13[75] = qc1.S("\u7981\u7528\u7535\u6c60\u4f18\u5316", "\u505c\u7528\u96fb\u6c60\u6700\u4f73\u5316");
        v4_13[76] = qc1.S("\u7535\u6c60\u4f18\u5316\u5df2\u7981\u7528", "\u96fb\u6c60\u6700\u4f73\u5316\u5df2\u505c\u7528");
        v4_13[77] = qc1.S("\u70b9\u51fb\u7981\u7528\uff0c\u786e\u4fdd\u540e\u53f0\u5b9e\u65f6\u66f4\u65b0\u4e0d\u4e2d\u65ad", "\u9ede\u64ca\u505c\u7528\uff0c\u78ba\u4fdd\u80cc\u666f\u5373\u6642\u66f4\u65b0\u4e0d\u4e2d\u65b7");
        v4_13[78] = qc1.S("\u540e\u53f0\u66f4\u65b0\u4e0d\u53d7\u9650\u5236", "\u80cc\u666f\u66f4\u65b0\u4e0d\u53d7\u9650\u5236");
        v4_13[79] = qc1.S("\u7535\u6c60\u4f18\u5316", "\u96fb\u6c60\u6700\u4f73\u5316");
        v4_13[80] = qc1.S("\u524d\u5f80\u8bbe\u7f6e", "\u524d\u5f80\u8a2d\u5b9a");
        v4_13[81] = qc1.S("\u8c03\u8bd5\u6a21\u5f0f", "\u5075\u932f\u6a21\u5f0f");
        v4_13[82] = qc1.S("\u663e\u793a\u5404\u6307\u6807\u53ef\u7528\u6570\u636e\u6765\u6e90\uff08\u4ec5\u7528\u4e8e\u8bca\u65ad\uff09", "\u986f\u793a\u5404\u6307\u6a19\u53ef\u7528\u8cc7\u6599\u4f86\u6e90\uff08\u50c5\u7528\u65bc\u8a3a\u65b7\uff09");
        v4_13[83] = qc1.S("\u5386\u53f2\u8bb0\u5f55\u7ef4\u62a4", "\u6b77\u53f2\u7d00\u9304\u7dad\u8b77");
        v4_13[84] = qc1.S("\u6e05\u9664\u5386\u53f2\u6570\u636e", "\u6e05\u9664\u6b77\u53f2\u8cc7\u6599");
        v4_13[85] = v110_1;
        v4_13[86] = v108_1;
        v4_13[87] = qc1.S("\u8ddf\u968f\u7cfb\u7edf", "\u8ddf\u96a8\u7cfb\u7d71");
        v4_13[88] = v114_1;
        v4_13[89] = v112_1;
        v4_13[90] = v119_1;
        v4_13[91] = v115_1;
        v4_13[92] = v117_1;
        v4_13[93] = qc1.S("\u786e\u8ba4\u5220\u9664\u5386\u53f2\u58c1\u7eb8", "\u78ba\u8a8d\u522a\u9664\u6b77\u53f2\u684c\u5e03");
        v4_13[94] = qc1.S("\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d\uff0c\u8fd9\u5f20\u5386\u53f2\u58c1\u7eb8\u5c06\u4ece\u5217\u8868\u4e2d\u79fb\u9664\u3002", "\u522a\u9664\u5f8c\u7121\u6cd5\u5fa9\u539f\uff0c\u9019\u5f35\u6b77\u53f2\u684c\u5e03\u5c07\u5f9e\u6e05\u55ae\u4e2d\u79fb\u9664\u3002");
        v4_13[95] = qc1.S("\u786e\u8ba4\u5220\u9664", "\u78ba\u8a8d\u522a\u9664");
        v4_13[96] = qc1.S("\u663e\u793a\u6a21\u5f0f", "\u986f\u793a\u6a21\u5f0f");
        v4_13[97] = qc1.S("\u542f\u52a8\u56fe\u6807\u6837\u5f0f", "\u555f\u52d5\u5716\u793a\u6a23\u5f0f");
        v4_13[98] = qc1.S("\u6d45\u8272\u56fe\u6807", "\u6dfa\u8272\u5716\u793a");
        v4_13[99] = qc1.S("\u6df1\u8272\u56fe\u6807", "\u6df1\u8272\u5716\u793a");
        v4_13[100] = qc1.S("\u8bed\u8a00", "\u8a9e\u8a00");
        v4_13[101] = qc1.S("\u5e94\u7528\u8bed\u8a00", "\u61c9\u7528\u7a0b\u5f0f\u8a9e\u8a00");
        v4_13[102] = qc1.S("\u4e3b\u9898\u914d\u8272", "\u4e3b\u984c\u914d\u8272");
        v4_13[103] = qc1.S("\u52a8\u6001\u591a\u5f69", "\u52d5\u614b\u591a\u5f69");
        v4_13[104] = v136_1;
        v4_13[105] = v132_1;
        v4_13[106] = v134_1;
        v4_13[107] = qc1.S("\u6a31\u972d", "\u6afb\u9744");
        v4_13[108] = qc1.S("\u9701\u7d2b", "\u973d\u7d2b");
        v4_13[109] = qc1.S("\u4e3b\u9875\u5361\u7247\u900f\u660e\u5ea6", "\u4e3b\u9801\u5361\u7247\u900f\u660e\u5ea6");
        v4_13[110] = qc1.S("\u4e3b\u754c\u9762\u58c1\u7eb8", "\u4e3b\u4ecb\u9762\u684c\u5e03");
        v4_13[111] = v147_1;
        v4_13[112] = v143_1;
        v4_13[113] = v145_1;
        v4_13[114] = qc1.S("\u5220\u9664\u5386\u53f2\u58c1\u7eb8", "\u522a\u9664\u6b77\u53f2\u684c\u5e03");
        v4_13[115] = qc1.S("\u672a\u8986\u76d6\u8bed\u8a00\u5c06\u81ea\u52a8\u4f7f\u7528\u82f1\u8bed", "\u672a\u6db5\u84cb\u8a9e\u8a00\u5c07\u81ea\u52d5\u4f7f\u7528\u82f1\u8a9e");
        v4_13[116] = qc1.S("\u98ce\u5728\u8033\u8fb9", "\u98a8\u5728\u8033\u908a");
        v4_13[117] = qc1.S("\u57fa\u672c\u4fe1\u606f", "\u57fa\u672c\u8cc7\u8a0a");
        v4_13[118] = v157_1;
        v4_13[119] = v153_1;
        v4_13[120] = v155_1;
        v4_13[121] = qc1.S("\u5f00\u6e90\u8bb8\u53ef\u4fe1\u606f\u52a0\u8f7d\u5931\u8d25", "\u958b\u6e90\u6388\u6b0a\u8cc7\u8a0a\u8f09\u5165\u5931\u6557");
        v4_13[122] = qc1.S("LLMonitor \u5f53\u524d\u7248\u672c\u4f7f\u7528\u7684\u7b2c\u4e09\u65b9\u7ec4\u4ef6\u53ca\u5176\u8bb8\u53ef\u4fe1\u606f", "LLMonitor \u76ee\u524d\u7248\u672c\u4f7f\u7528\u7684\u7b2c\u4e09\u65b9\u7d44\u4ef6\u53ca\u5176\u6388\u6b0a\u8cc7\u8a0a");
        v4_13[123] = qc1.S("\u4fdd\u5b58\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5", "\u5132\u5b58\u5931\u6557\uff0c\u8acb\u91cd\u8a66");
        v4_13[124] = qc1.S("\u58c1\u7eb8\u5bfc\u5165\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5", "\u684c\u5e03\u532f\u5165\u5931\u6557\uff0c\u8acb\u91cd\u8a66");
        v4_13[125] = v167_1;
        v4_13[126] = v165_1;
        v4_13[127] = v170_1;
        v4_13[128] = v168_1;
        v4_13[129] = qc1.S("\u56fe\u7247\u52a0\u8f7d\u5931\u8d25", "\u5716\u7247\u8f09\u5165\u5931\u6557");
        v4_13[130] = qc1.S("\u8fd4\u56de\u91cd\u9009", "\u8fd4\u56de\u91cd\u9078");
        v4_13[131] = qc1.S("\u6b63\u5728\u8bfb\u53d6 SoC \u6307\u6807\u2026", "\u6b63\u5728\u8b80\u53d6 SoC \u6307\u6a19\u2026");
        v4_13[132] = qc1.S("SoC \u91c7\u96c6\u4e0d\u53ef\u7528", "SoC \u63a1\u96c6\u4e0d\u53ef\u7528");
        v4_13[133] = qc1.S("CPU \u5360\u7528", "CPU \u4f54\u7528");
        v4_13[134] = v179_1;
        v4_13[135] = v177_1;
        v4_13[136] = qc1.S("SoC \u6e29\u5ea6", "SoC \u6eab\u5ea6");
        v4_13[137] = qc1.S("\u5728\u7ebfCPU\u6838\u5fc3", "\u5728\u7dda CPU \u6838\u5fc3");
        v4_13[138] = qc1.S("\u7cfb\u7edf1min\u8d1f\u8f7d", "\u7cfb\u7d71 1min \u8ca0\u8f09");
        v4_13[139] = qc1.S("CPU \u578b\u53f7", "CPU \u578b\u865f");
        v4_13[140] = qc1.S("\u5f53\u524d\u8bbe\u5907\u672a\u66b4\u9732\u53ef\u7528\u7684 CPU \u9891\u7387\u8282\u70b9\uff0cCPU \u9891\u7387\u4fe1\u606f\u4e0d\u53ef\u7528\u3002", "\u76ee\u524d\u88dd\u7f6e\u672a\u66b4\u9732\u53ef\u7528\u7684 CPU \u983b\u7387\u7bc0\u9ede\uff0cCPU \u983b\u7387\u8cc7\u8a0a\u4e0d\u53ef\u7528\u3002");
        v4_13[141] = qc1.S("SoC \u76f8\u5173 Thermal Zones", "SoC \u76f8\u95dc Thermal Zones");
        v4_13[142] = v192_1;
        v4_13[143] = v190_1;
        v4_13[144] = qc1.S("\u5360\u6bd4", "\u4f54\u6bd4");
        v4_13[145] = qc1.S("CPU10 \u79bb\u7ebf", "CPU10 \u96e2\u7dda");
        v4_13[146] = qc1.S("\u91c7\u96c6\u5931\u8d25", "\u63a1\u96c6\u5931\u6557");
        v4_13[147] = qc1.S("\u5b9e\u65f6\u901a\u77e5\u53d7\u9650", "\u5373\u6642\u901a\u77e5\u53d7\u9650");
        v4_13[148] = qc1.S("\u4e3a\u4e86\u5728\u901a\u77e5\u680f\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff0c\u9700\u8981\u6388\u4e88\u901a\u77e5\u6743\u9650\u3002", "\u70ba\u4e86\u5728\u901a\u77e5\u6b04\u986f\u793a\u5373\u6642\u5145\u96fb\u529f\u7387\uff0c\u9700\u8981\u6388\u4e88\u901a\u77e5\u6b0a\u9650\u3002");
        v4_13[149] = v203_1;
        v4_13[150] = v201_1;
        v4_13[151] = qc1.S("\u540e\u53f0\u4fdd\u6d3b\u53d7\u9650", "\u80cc\u666f\u4fdd\u6d3b\u53d7\u9650");
        v4_13[152] = qc1.S("\u4e3a\u4e86\u4fdd\u8bc1\u684c\u9762\u5c0f\u7ec4\u4ef6\u5b9e\u65f6\u5237\u65b0\uff0c\u8bf7\u5c06\u672c\u5e94\u7528\u52a0\u5165\u7535\u6c60\u4f18\u5316\u767d\u540d\u5355\u3002", "\u70ba\u4e86\u78ba\u4fdd\u684c\u9762\u5c0f\u7d44\u4ef6\u5373\u6642\u66f4\u65b0\uff0c\u8acb\u5c07\u672c\u61c9\u7528\u7a0b\u5f0f\u52a0\u5165\u96fb\u6c60\u6700\u4f73\u5316\u767d\u540d\u55ae\u3002");
        v4_13[153] = qc1.S("\u7acb\u5373\u5f00\u542f", "\u7acb\u5373\u958b\u555f");
        v4_13[154] = qc1.S("\u68c0\u6d4b\u5230\u7535\u538b\u8bfb\u6570\u5f02\u5e38", "\u5075\u6e2c\u5230\u96fb\u58d3\u8b80\u6578\u7570\u5e38");
        v4_13[155] = qc1.S("\u8bbe\u5907\u4f3c\u4e4e\u65e0\u6cd5\u8bfb\u53d6\u5b9e\u65f6\u7535\u538b\u3002\u5efa\u8bae\u5f00\u542f\u201c\u865a\u62df\u7535\u538b\u201d\u529f\u80fd\u4ee5\u83b7\u5f97\u4f30\u7b97\u6570\u636e\u3002", "\u88dd\u7f6e\u4f3c\u4e4e\u7121\u6cd5\u8b80\u53d6\u5373\u6642\u96fb\u58d3\u3002\u5efa\u8b70\u958b\u555f\u300c\u865b\u64ec\u96fb\u58d3\u300d\u529f\u80fd\u4ee5\u53d6\u5f97\u4f30\u7b97\u8cc7\u6599\u3002");
        v4_13[156] = qc1.S("\u5f00\u542f\u865a\u62df\u7535\u538b", "\u958b\u555f\u865b\u64ec\u96fb\u58d3");
        v4_13[157] = qc1.S("\u77ac\u65f6\u529f\u7387", "\u77ac\u6642\u529f\u7387");
        v4_13[158] = qc1.S("\u7535\u6c60\u6e29\u5ea6", "\u96fb\u6c60\u6eab\u5ea6");
        v4_13[159] = qc1.S("\u7535\u6c60\u7535\u538b", "\u96fb\u6c60\u96fb\u58d3");
        v4_13[160] = qc1.S("\u7535\u6c60\u7535\u6d41", "\u96fb\u6c60\u96fb\u6d41");
        v4_13[161] = qc1.S("\u4f9b\u7535\u72b6\u6001", "\u4f9b\u96fb\u72c0\u614b");
        v4_13[162] = qc1.S("\u7535\u6c60\u72b6\u6001", "\u96fb\u6c60\u72c0\u614b");
        v4_13[163] = qc1.S("\u5f53\u524d\u5269\u4f59\u7535\u91cf / \u603b\u5bb9\u91cf", "\u76ee\u524d\u5269\u9918\u96fb\u91cf\uff0f\u7e3d\u5bb9\u91cf");
        v4_13[164] = qc1.S("\u7cfb\u7edf\u5269\u4f59\u5bb9\u91cf / \u603b\u5bb9\u91cf", "\u7cfb\u7d71\u5269\u9918\u5bb9\u91cf\uff0f\u7e3d\u5bb9\u91cf");
        v4_13[165] = qc1.S("\u5bb9\u91cf\u8ba1\u7b97\u8bf4\u660e", "\u5bb9\u91cf\u8a08\u7b97\u8aaa\u660e");
        v4_13[166] = qc1.S("\u6b64\u5904\u5bb9\u91cf\u4e0e\u767e\u5206\u6bd4\u57fa\u4e8e\u7cfb\u7edf\u63d0\u4f9b\u7684\u7535\u6c60\u5bb9\u91cf\u6570\u636e\u8ba1\u7b97\uff0c\u5e76\u975e\u7cfb\u7edf\u72b6\u6001\u680f\u767e\u5206\u6bd4\u3002", "\u6b64\u8655\u5bb9\u91cf\u8207\u767e\u5206\u6bd4\u662f\u6839\u64da\u7cfb\u7d71\u63d0\u4f9b\u7684\u96fb\u6c60\u5bb9\u91cf\u8cc7\u6599\u8a08\u7b97\uff0c\u4e26\u975e\u7cfb\u7d71\u72c0\u614b\u5217\u767e\u5206\u6bd4\u3002");
        v4_13[167] = qc1.S("\u90e8\u5206\u5382\u5546\u5b58\u5728\u9501\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73b0\u7cfb\u7edf\u663e\u793a\u5df2\u5145\u6ee1\uff0c\u4f46\u5b9e\u9645\u7535\u6c60\u5bb9\u91cf\u5c1a\u672a\u8fbe\u5230\u6ee1\u503c\u7684\u60c5\u51b5\u3002", "\u90e8\u5206\u5ee0\u5546\u53ef\u80fd\u6709\u9396\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73fe\u7cfb\u7d71\u986f\u793a\u5df2\u5145\u6eff\uff0c\u4f46\u5be6\u969b\u96fb\u6c60\u5bb9\u91cf\u5c1a\u672a\u9054\u5230\u6eff\u503c\u7684\u60c5\u6cc1\u3002");
        v4_13[168] = qc1.S("\u6b64\u5904\u5bb9\u91cf\u4e0e\u767e\u5206\u6bd4\u57fa\u4e8e\u7cfb\u7edf\u63d0\u4f9b\u7684\u7535\u6c60\u5bb9\u91cf\u6570\u636e\u8ba1\u7b97\uff0c\u5e76\u975e\u7cfb\u7edf\u72b6\u6001\u680f\u767e\u5206\u6bd4\u3002\u90e8\u5206\u5382\u5546\u5b58\u5728\u9501\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73b0\u7cfb\u7edf\u663e\u793a\u5df2\u5145\u6ee1\uff0c\u4f46\u5b9e\u9645\u7535\u6c60\u5bb9\u91cf\u5c1a\u672a\u8fbe\u5230\u6ee1\u503c\u7684\u60c5\u51b5\u3002", "\u6b64\u8655\u5bb9\u91cf\u8207\u767e\u5206\u6bd4\u662f\u6839\u64da\u7cfb\u7d71\u63d0\u4f9b\u7684\u96fb\u6c60\u5bb9\u91cf\u8cc7\u6599\u8a08\u7b97\uff0c\u4e26\u975e\u7cfb\u7d71\u72c0\u614b\u5217\u767e\u5206\u6bd4\u3002\u90e8\u5206\u5ee0\u5546\u53ef\u80fd\u6709\u9396\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73fe\u7cfb\u7d71\u986f\u793a\u5df2\u5145\u6eff\uff0c\u4f46\u5be6\u969b\u96fb\u6c60\u5bb9\u91cf\u5c1a\u672a\u9054\u5230\u6eff\u503c\u7684\u60c5\u6cc1\u3002");
        v4_13[169] = v232;
        v4_13[170] = v228;
        v4_13[171] = v230;
        v4_13[172] = qc1.S("\u68c0\u6d4b\u4e2d", "\u5075\u6e2c\u4e2d");
        v4_13[173] = qc1.S("\u7535\u6e90\u9002\u914d\u5668", "\u96fb\u6e90\u8f49\u63a5\u5668");
        v4_13[174] = qc1.S("\u7535\u8111 (USB)", "\u96fb\u8166\uff08USB\uff09");
        v4_13[175] = qc1.S("\u65e0\u7ebf\u5145\u7535", "\u7121\u7dda\u5145\u96fb");
        v4_13[176] = qc1.S("\u5e95\u5ea7\u4f9b\u7535", "\u5e95\u5ea7\u4f9b\u96fb");
        v4_13[177] = v240;
        v4_13[178] = v238;
        v4_13[179] = qc1.S("\u8fc7\u70ed", "\u904e\u71b1");
        v4_13[180] = qc1.S("\u635f\u574f", "\u640d\u58de");
        v4_13[181] = v245;
        v4_13[182] = v243;
        v4_13[183] = qc1.S("\u8fc7\u51b7", "\u904e\u51b7");
        v4_13[184] = qc1.S("\u72b6\u6001\u672a\u77e5", "\u72c0\u614b\u672a\u77e5");
        v4_13[185] = qc1.S("\u5145\u7535\u4e2d", "\u5145\u96fb\u4e2d");
        v4_13[186] = qc1.S("\u653e\u7535\u4e2d", "\u653e\u96fb\u4e2d");
        v4_13[187] = qc1.S("\u5df2\u63a5\u7535\u6e90(\u672a\u5145\u7535)", "\u5df2\u63a5\u96fb\u6e90\uff08\u672a\u5145\u96fb\uff09");
        v4_13[188] = qc1.S("\u672a\u5145\u7535", "\u672a\u5145\u96fb");
        v4_13[189] = qc1.S("\u5df2\u5145\u6ee1", "\u5df2\u5145\u6eff");
        v4_13[190] = qc1.S("\u72b6\u6001\u5f02\u5e38", "\u72c0\u614b\u7570\u5e38");
        v4_13[191] = qc1.S("\u6559\u5ba4\u8bfe\u8868\u67e5\u8be2", "\u6559\u5ba4\u8ab2\u8868\u67e5\u8a62");
        v4_13[192] = qc1.S("\u8bfe\u8868\u9009\u62e9", "\u8ab2\u8868\u9078\u64c7");
        v4_13[193] = qc1.S("\u8ddf\u968f\u6700\u65b0", "\u8ddf\u96a8\u6700\u65b0");
        v4_13[194] = qc1.S("\u5b9e\u65f6\u529f\u7387\u66f2\u7ebf", "\u5373\u6642\u529f\u7387\u66f2\u7dda");
        v4_13[195] = qc1.S("\u5b9e\u65f6\u6e29\u5ea6\u66f2\u7ebf", "\u5373\u6642\u6eab\u5ea6\u66f2\u7dda");
        v4_13[196] = qc1.S("\u5145\u7535\u65f6\u666e\u901a\u901a\u77e5", "\u5145\u96fb\u6642\u4e00\u822c\u901a\u77e5");
        v4_13[197] = qc1.S("\u672a\u5145\u7535\u65f6\u666e\u901a\u901a\u77e5", "\u672a\u5145\u96fb\u6642\u4e00\u822c\u901a\u77e5");
        v4_13[198] = qc1.S("\u672c\u6b21\u5173\u95ed", "\u672c\u6b21\u95dc\u9589");
        v4_13[199] = qc1.S("\u7535\u6c60\u76d1\u63a7\u540e\u53f0\u670d\u52a1", "\u96fb\u6c60\u76e3\u63a7\u80cc\u666f\u670d\u52d9");
        v4_13[200] = qc1.S("\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff08\u9759\u9ed8\u901a\u77e5\uff0c\u4e0d\u4f1a\u6253\u6270\uff09", "\u986f\u793a\u5373\u6642\u5145\u96fb\u529f\u7387\uff08\u975c\u9ed8\u901a\u77e5\uff0c\u4e0d\u6703\u6253\u64fe\uff09");
        v4_13[201] = qc1.S("\u5b9e\u65f6\u6d3b\u52a8 (\u7075\u52a8\u5c9b)", "\u5373\u6642\u6d3b\u52d5\uff08\u9748\u52d5\u5cf6\uff09");
        v4_13[202] = qc1.S("\u5145\u7535\u65f6\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u7684\u5b9e\u51b5\u901a\u77e5", "\u5145\u96fb\u6642\u986f\u793a\u9748\u52d5\u5cf6\u98a8\u683c\u7684\u5373\u6642\u901a\u77e5");
        v4_13[203] = v15_6;
        yt2 v0_204 = b02.M(v4_13);
        com.lele.llmonitor.i18n.TextI18nKt.zhHantMap = v0_204;
        qh2 v3_1 = qc1.S("\u6570\u636e\u7ba1\u7406", "\u6578\u64da\u7ba1\u7406");
        qc1.S("\u6e05\u9664\u5386\u53f2\u6570\u636e", "\u6e05\u9664\u6b77\u53f2\u6578\u64da");
        qc1.S("\u5220\u9664\u6240\u6709\u5df2\u5b58\u50a8\u7684\u5145\u7535\u529f\u7387\u8bb0\u5f55", "\u522a\u9664\u6240\u6709\u5df2\u5132\u5b58\u7684\u5145\u96fb\u529f\u7387\u6578\u64da");
        qc1.S("\u6559\u5ba4\u8bfe\u8868\u67e5\u8be2", "\u8ab2\u5ba4\u6642\u9593\u8868\u67e5\u8a62");
        qc1.S("\u8bfe\u8868\u9009\u62e9", "\u6642\u9593\u8868\u9078\u64c7");
        String v1_20 = b02.M(new qh2[] {v3_1, qc1.S("\u540e\u53f0\u76d1\u6d4b\u4e2d", "\u80cc\u666f\u76e3\u63a7\u4e2d")}));
        com.lele.llmonitor.i18n.TextI18nKt.zhHkOverrides = v1_20;
        qh2 v3_3 = qc1.S("\u9002\u7528\u7ec4\u4ef6", "\u9069\u7528\u5143\u4ef6");
        qc1.S("\u5728\u901a\u77e5\u680f\u663e\u793a\u5b9e\u65f6\u529f\u7387\u4fe1\u606f", "\u5728\u901a\u77e5\u5217\u986f\u793a\u5373\u6642\u529f\u7387\u8cc7\u8a0a");
        qh2 v7_1 = qc1.S("\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387", "\u901a\u77e5\uff0f\u5143\u4ef6\u66f4\u65b0\u7387");
        qh2 v14_1 = qc1.S("\u4fdd\u7559\u901a\u77e5\u680f\u5e38\u9a7b\u663e\u793a", "\u4fdd\u7559\u901a\u77e5\u5217\u5e38\u99d0\u986f\u793a");
        qh2 v272 = v3_3;
        qc1.S("\u517c\u5bb9\u4e0d\u540c\u8bbe\u5907\u7684\u7535\u6c60\u8bfb\u6570", "\u76f8\u5bb9\u4e0d\u540c\u88dd\u7f6e\u7684\u96fb\u6c60\u8b80\u503c");
        qh2 v274 = v7_1;
        qc1.S("\u53cc\u82af\u7535\u6c60\u4fee\u6b63", "\u96d9\u82af\u96fb\u6c60\u6821\u6b63");
        qh2 v275 = v14_1;
        qc1.S("\u82e5\u8bbe\u5907\u65e0\u6cd5\u8bfb\u53d6\u7535\u538b\uff0c\u5c1d\u8bd5\u4f7f\u7528\u4f30\u7b97\u7535\u538b", "\u82e5\u88dd\u7f6e\u7121\u6cd5\u8b80\u53d6\u96fb\u58d3\uff0c\u8acb\u6539\u7528\u4f30\u7b97\u96fb\u58d3");
        qc1.S("\u5b9e\u65f6\u6d3b\u52a8", "\u5373\u6642\u52d5\u614b");
        qc1.S("\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u5b9e\u51b5\u901a\u77e5", "\u986f\u793a\u9748\u52d5\u5cf6\u98a8\u683c\u7684\u5373\u6642\u52d5\u614b\u901a\u77e5");
        qc1.S("\u5728\u5b9e\u65f6\u6d3b\u52a8\u4e2d\u663e\u793a\u201c\u672c\u6b21\u5173\u95ed\u201d\u6309\u94ae", "\u5728\u5373\u6642\u52d5\u614b\u4e2d\u986f\u793a\u300c\u672c\u6b21\u95dc\u9589\u300d\u6309\u9215");
        qc1.S("\u540e\u53f0\u4fdd\u6d3b\u4e0e\u8c03\u8bd5\u9009\u9879", "\u80cc\u666f\u5e38\u99d0\u8207\u5075\u932f\u9078\u9805");
        qc1.S("\u540e\u53f0\u4fdd\u6d3b\u53d7\u9650", "\u80cc\u666f\u5e38\u99d0\u53d7\u9650");
        qc1.S("\u8c03\u8bd5\u6a21\u5f0f", "\u5075\u932f\u6a21\u5f0f");
        qc1.S("\u663e\u793a\u5404\u6307\u6807\u53ef\u7528\u6570\u636e\u6765\u6e90\uff08\u4ec5\u7528\u4e8e\u8bca\u65ad\uff09", "\u986f\u793a\u5404\u6307\u6a19\u53ef\u7528\u8cc7\u6599\u4f86\u6e90\uff08\u50c5\u4f9b\u8a3a\u65b7\uff09");
        qc1.S("\u5220\u9664\u6240\u6709\u5df2\u5b58\u50a8\u7684\u5145\u7535\u529f\u7387\u8bb0\u5f55", "\u522a\u9664\u6240\u6709\u5df2\u5132\u5b58\u7684\u5145\u96fb\u529f\u7387\u8cc7\u6599");
        qc1.S("\u4e3b\u754c\u9762\u58c1\u7eb8", "\u4e3b\u756b\u9762\u684c\u5e03");
        qc1.S("\u5e94\u7528\u8bed\u8a00", "\u61c9\u7528\u7a0b\u5f0f\u8a9e\u8a00");
        qc1.S("\u4e3b\u9875\u5361\u7247\u900f\u660e\u5ea6", "\u4e3b\u756b\u9762\u5361\u7247\u900f\u660e\u5ea6");
        qc1.S("\u5e94\u7528\u754c\u9762\u66f4\u65b0\u7387", "\u61c9\u7528\u7a0b\u5f0f\u756b\u9762\u66f4\u65b0\u7387");
        qc1.S("\u5e94\u7528\u540d\u79f0", "\u61c9\u7528\u7a0b\u5f0f\u540d\u7a31");
        qc1.S("\u4fdd\u5b58\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5", "\u5132\u5b58\u5931\u6557\uff0c\u8acb\u518d\u8a66\u4e00\u6b21");
        qc1.S("\u58c1\u7eb8\u5bfc\u5165\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5", "\u684c\u5e03\u532f\u5165\u5931\u6557\uff0c\u8acb\u518d\u8a66\u4e00\u6b21");
        qc1.S("SoC \u91c7\u96c6\u4e0d\u53ef\u7528", "SoC \u63a1\u96c6\u4e0d\u53ef\u7528");
        qc1.S("\u5728\u7ebfCPU\u6838\u5fc3", "\u7dda\u4e0a CPU \u6838\u5fc3");
        qc1.S("\u7cfb\u7edf1min\u8d1f\u8f7d", "\u7cfb\u7d71 1 \u5206\u9418\u8ca0\u8f09");
        qc1.S("\u5f53\u524d\u8bbe\u5907\u672a\u66b4\u9732\u53ef\u7528\u7684 CPU \u9891\u7387\u8282\u70b9\uff0cCPU \u9891\u7387\u4fe1\u606f\u4e0d\u53ef\u7528\u3002", "\u76ee\u524d\u88dd\u7f6e\u672a\u63d0\u4f9b\u53ef\u7528\u7684 CPU \u983b\u7387\u7bc0\u9ede\uff0cCPU \u983b\u7387\u8cc7\u8a0a\u4e0d\u53ef\u7528\u3002");
        qc1.S("\u672a\u53d1\u73b0\u53ef\u8bfb\u4e14\u4e0e SoC \u76f8\u5173\u7684 thermal_zone \u8282\u70b9\u3002", "\u672a\u627e\u5230\u53ef\u8b80\u4e14\u8207 SoC \u76f8\u95dc\u7684 thermal_zone \u7bc0\u9ede\u3002");
        qc1.S("\u91c7\u96c6\u5931\u8d25", "\u63a1\u96c6\u5931\u6557");
        qc1.S("\u4e3a\u4e86\u5728\u901a\u77e5\u680f\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff0c\u9700\u8981\u6388\u4e88\u901a\u77e5\u6743\u9650\u3002", "\u70ba\u4e86\u5728\u901a\u77e5\u5217\u986f\u793a\u5373\u6642\u5145\u96fb\u529f\u7387\uff0c\u9700\u8981\u6388\u4e88\u901a\u77e5\u6b0a\u9650\u3002");
        qc1.S("\u5b9e\u65f6\u901a\u77e5\u53d7\u9650", "\u5373\u6642\u901a\u77e5\u53d7\u9650");
        qc1.S("\u4e3a\u4e86\u4fdd\u8bc1\u684c\u9762\u5c0f\u7ec4\u4ef6\u5b9e\u65f6\u5237\u65b0\uff0c\u8bf7\u5c06\u672c\u5e94\u7528\u52a0\u5165\u7535\u6c60\u4f18\u5316\u767d\u540d\u5355\u3002", "\u70ba\u4e86\u78ba\u4fdd\u4e3b\u756b\u9762\u5c0f\u5de5\u5177\u5373\u6642\u66f4\u65b0\uff0c\u8acb\u5c07\u672c App \u52a0\u5165\u96fb\u6c60\u6700\u4f73\u5316\u767d\u540d\u55ae\u3002");
        qc1.S("\u4f9b\u7535\u72b6\u6001", "\u96fb\u6e90\u72c0\u614b");
        qc1.S("\u68c0\u6d4b\u5230\u7535\u538b\u8bfb\u6570\u5f02\u5e38", "\u5075\u6e2c\u5230\u96fb\u58d3\u8b80\u503c\u7570\u5e38");
        qc1.S("\u8bbe\u5907\u4f3c\u4e4e\u65e0\u6cd5\u8bfb\u53d6\u5b9e\u65f6\u7535\u538b\u3002\u5efa\u8bae\u5f00\u542f\u201c\u865a\u62df\u7535\u538b\u201d\u529f\u80fd\u4ee5\u83b7\u5f97\u4f30\u7b97\u6570\u636e\u3002", "\u88dd\u7f6e\u4f3c\u4e4e\u7121\u6cd5\u8b80\u53d6\u5373\u6642\u96fb\u58d3\uff0c\u5efa\u8b70\u555f\u7528\u300c\u865b\u64ec\u96fb\u58d3\u300d\u4ee5\u53d6\u5f97\u4f30\u7b97\u8cc7\u6599\u3002");
        qc1.S("\u77ac\u65f6\u529f\u7387", "\u5373\u6642\u529f\u7387");
        qc1.S("\u5df2\u63a5\u7535\u6e90(\u672a\u5145\u7535)", "\u5df2\u63a5\u4e0a\u96fb\u6e90\uff08\u5c1a\u672a\u5145\u96fb\uff09");
        qc1.S("LLMonitor \u5f53\u524d\u7248\u672c\u4f7f\u7528\u7684\u7b2c\u4e09\u65b9\u7ec4\u4ef6\u53ca\u5176\u8bb8\u53ef\u4fe1\u606f", "LLMonitor \u76ee\u524d\u7248\u672c\u4f7f\u7528\u7684\u7b2c\u4e09\u65b9\u5143\u4ef6\u53ca\u5176\u6388\u6b0a\u8cc7\u8a0a");
        qc1.S("\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff08\u9759\u9ed8\u901a\u77e5\uff0c\u4e0d\u4f1a\u6253\u6270\uff09", "\u986f\u793a\u5373\u6642\u5145\u96fb\u529f\u7387\uff08\u975c\u9ed8\u901a\u77e5\uff0c\u4e0d\u6703\u6253\u64fe\uff09");
        qc1.S("\u5b9e\u65f6\u6d3b\u52a8 (\u7075\u52a8\u5c9b)", "\u5373\u6642\u52d5\u614b\uff08\u9748\u52d5\u5cf6\uff09");
        qc1.S("\u5145\u7535\u65f6\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u7684\u5b9e\u51b5\u901a\u77e5", "\u5145\u96fb\u6642\u986f\u793a\u9748\u52d5\u5cf6\u98a8\u683c\u7684\u5373\u6642\u52d5\u614b\u901a\u77e5");
        qh2 v3_78 = b02.M(new qh2[] {v272, qc1.S("\u540e\u53f0\u76d1\u6d4b\u4e2d", "\u80cc\u666f\u76e3\u6e2c\u4e2d")}));
        com.lele.llmonitor.i18n.TextI18nKt.zhTwOverrides = v3_78;
        com.lele.llmonitor.i18n.TextI18nKt.zhHkMap = b02.N(v0_204, v1_20);
        com.lele.llmonitor.i18n.TextI18nKt.zhTwMap = b02.N(v0_204, v3_78);
        yt2 v0_207 = qc1.S("\u5f00\u6e90\u8bb8\u53ef", "Open Source Licenses");
        String v1_24 = qc1.S("\u5f00\u6e90\u8bb8\u53ef\u6682\u4e0d\u53ef\u7528", "Open source licenses are currently unavailable");
        qh2 v3_81 = qc1.S("\u6b63\u5728\u8bfb\u53d6\u5f53\u524d\u7248\u672c\u9644\u5e26\u7684\u8bb8\u53ef\u6750\u6599\u2026", "Loading license materials bundled with this version...");
        qh2 v4_79 = qc1.S("\u7cfb\u7edf\u4e0e\u8bca\u65ad", "System & Diagnostics");
        qh2 v2_60 = qc1.S("\u901a\u77e5", "Notification");
        qh2 v6_2 = qc1.S("\u5728\u901a\u77e5\u680f\u663e\u793a\u5b9e\u65f6\u529f\u7387\u4fe1\u606f", "Show real-time power info in notifications");
        qh2 v12_2 = qc1.S("\u5b9e\u65f6\u6d3b\u52a8", "Live Activity");
        qh2 v11_4 = qc1.S("\u663e\u793a\u672c\u6b21\u5173\u95ed\u6309\u94ae", "Show Close Once button");
        qh2 v9_10 = qc1.S("\u4f9b\u7535\u65b9\u5f0f", "Power Source Type");
        qh2 v10_33 = qc1.S("\u5e94\u7528\u754c\u9762\u66f4\u65b0\u7387", "App UI Update Rate");
        qh2 v8_4 = qc1.S("\u7184\u5c4f\u4e0b\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387", "Screen-off Notification/Widget Update Rate");
        qh2 v14_95 = qc1.S("\u4fdd\u7559\u901a\u77e5\u680f\u5e38\u9a7b\u663e\u793a", "Keep persistent notification visible");
        qh2 v5_10 = qc1.S("\u5982\u679c\u5145\u7535\u65f6\u7535\u6d41\u663e\u793a\u4e3a\u8d1f\uff0c\u8bf7\u5f00\u542f\u6b64\u9879", "Enable this if charging current appears negative");
        qh2 v7_270 = qc1.S("\u5145\u7535\u65f6\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u7684\u5b9e\u51b5\u901a\u77e5", "Shows Dynamic Island-style live notification while charging");
        qh2 v13_1 = qc1.S("\u540e\u53f0\u76d1\u6d4b\u4e2d", "Monitoring in Background");
        qh2[] v15_182 = new qh2[204];
        v15_182[0] = v0_207;
        v15_182[1] = v1_24;
        v15_182[2] = v3_81;
        v15_182[3] = qc1.S("\u9002\u7528\u7ec4\u4ef6", "Applicable Components");
        v15_182[4] = qc1.S("\u8bb8\u53ef\u6807\u8bc6\u4e0e\u94fe\u63a5", "License IDs & Links");
        v15_182[5] = qc1.S("\u8bb8\u53ef\u8bc1", "License");
        v15_182[6] = qc1.S("\u672a\u58f0\u660e", "Not declared");
        v15_182[7] = qc1.S("\u94fe\u63a5", "Link");
        v15_182[8] = qc1.S("\u8fd4\u56de", "Back");
        v15_182[9] = qc1.S("\u8bb8\u53ef\u8be6\u60c5", "License Details");
        v15_182[10] = qc1.S("\u672a\u627e\u5230\u5bf9\u5e94\u7684\u8bb8\u53ef\u4fe1\u606f\u3002", "No matching license information found.");
        v15_182[11] = qc1.S("\u8bb8\u53ef\u8bc1\u5168\u6587", "Full License Text");
        v15_182[12] = qc1.S("NOTICE \u58f0\u660e", "NOTICE Statement");
        v15_182[13] = qc1.S("\u8bb8\u53ef\u6750\u6599", "License Materials");
        v15_182[14] = qc1.S("\u6682\u65e0\u53ef\u5c55\u793a\u7684\u8bb8\u53ef\u6587\u672c\u3002", "No license text available.");
        v15_182[15] = qc1.S("\u88c1\u5207\u58c1\u7eb8", "Crop Wallpaper");
        v15_182[16] = qc1.S("\u5916\u89c2\u8bbe\u7f6e", "Appearance");
        v15_182[17] = qc1.S("\u91cd\u8981\u63d0\u793a", "Important Notice");
        v15_182[18] = qc1.S("\u540e\u53f0\u5e38\u9a7b\u4e0e\u5b9e\u65f6\u901a\u77e5\u8bf4\u660e", "Persistent background and live notification notes");
        v15_182[19] = qc1.S("\u5e38\u9a7b\u540e\u53f0", "Persistent Background");
        v15_182[20] = qc1.S("\u5b9e\u65f6\u901a\u77e5", "Live Notifications");
        v15_182[21] = qc1.S("\u573a\u666f\u8bbe\u7f6e", "Scenarios");
        v15_182[22] = qc1.S("\u786c\u4ef6\u4fee\u6b63", "Hardware Adjustments");
        v15_182[23] = v4_79;
        v15_182[24] = qc1.S("\u6570\u636e\u7ba1\u7406", "Data Management");
        v15_182[25] = qc1.S("\u5173\u4e8e", "About");
        v15_182[26] = qc1.S("\u8bbe\u7f6e", "Settings");
        v15_182[27] = qc1.S("1. \u5148\u653e\u5f00\u540e\u53f0", "1. Allow background first");
        v15_182[28] = qc1.S("\u989d\u5916\u5141\u8bb8\u5b8c\u5168\u540e\u53f0", "Also allow full background access");
        v15_182[29] = qc1.S("\u9664\u5173\u95ed\u7535\u6c60\u4f18\u5316\u5916\uff0c\u8fd8\u8bf7\u5728\u5e94\u7528\u8017\u7535\u7ba1\u7406\u4e2d\u9009\u62e9\u5b8c\u5168\u5141\u8bb8\u540e\u53f0\u884c\u4e3a\uff0c\u907f\u514d\u5b9e\u65f6\u901a\u77e5\u5ef6\u540e\u3002\u6b64\u5e94\u7528\u6309\u5e38\u9a7b\u540e\u53f0\u573a\u666f\u4f18\u5316\uff0c\u6b63\u5e38\u8017\u7535\u5c5e\u9884\u671f\u3002", "In addition to turning off battery optimization, please allow full background behavior in app power management to avoid delayed live notifications. This app is optimized for always-on background use, so normal power draw is expected.");
        v15_182[30] = qc1.S("2. \u6253\u5f00\u5b9e\u65f6\u901a\u77e5", "2. Enable live notifications");
        v15_182[31] = qc1.S("\u6309\u5382\u5546\u624b\u52a8\u5f00\u542f", "Enable it manually per OEM");
        v15_182[32] = qc1.S("\u82e5\u8981\u4f7f\u7528\u5b9e\u65f6\u901a\u77e5\uff08\u7075\u52a8\u5c9b\uff09\uff0c\u8bf7\u5728\u5e94\u7528\u901a\u77e5\u7ba1\u7406\u91cc\u624b\u52a8\u6253\u5f00\u201c\u6d41\u4f53\u4e91\u663e\u793a\u5b9e\u65f6\u6d3b\u52a8\u201d\uff08OPPO\uff09\u6216\u201c\u5b9e\u65f6\u52a8\u6001\u201d\uff08\u5c0f\u7c73\uff09\u3002\u4e0d\u540c\u5382\u5546\u5165\u53e3\u4e0d\u540c\uff0c\u8bf7\u4ee5\u7cfb\u7edf\u8bbe\u7f6e\u4e3a\u51c6\u3002", "To use live notifications (Dynamic Island), manually enable \"Fluid Cloud shows live activity\" (OPPO) or \"Live Dynamic\" (Xiaomi) in app notification settings. OEM entry points differ, so follow your system settings.");
        v15_182[33] = qc1.S("3. \u4ec5\u90e8\u5206\u673a\u578b\u652f\u6301", "3. Only some models are supported");
        v15_182[34] = qc1.S("Android 16 \u4ee5\u4e0a\u53ef\u89c1", "Visible on Android 16+");
        v15_182[35] = qc1.S("\u5b9e\u65f6\u901a\u77e5\u53ea\u652f\u6301\u90e8\u5206 Android 16 \u673a\u578b\uff0c\u53d6\u51b3\u4e8e\u5382\u5546\u662f\u5426\u63a5\u5165\u539f\u751f\u5b9e\u65f6\u6d3b\u52a8\u3002Android 16 \u4ee5\u4e0b\u673a\u578b\u5df2\u9690\u85cf\u8be5\u9009\u9879\u3002", "Live notifications are supported only on some Android 16 devices, depending on whether the OEM has integrated native live activities. The option is hidden on Android 16 and below.");
        v15_182[36] = qc1.S("\u6e05\u9664\u8bb0\u5f55", "Clear Records");
        v15_182[37] = qc1.S("\u786e\u5b9a\u8981\u6e05\u7a7a\u6240\u6709\u5145\u7535\u5386\u53f2\u6570\u636e\u5417\uff1f\n\u6b64\u64cd\u4f5c\u4e0d\u53ef\u64a4\u9500\uff0c\u56fe\u8868\u5c06\u88ab\u91cd\u7f6e\u3002", "Clear all charging history data?\nThis action cannot be undone, and charts will be reset.");
        v15_182[38] = qc1.S("\u5220\u9664", "Delete");
        v15_182[39] = qc1.S("\u53d6\u6d88", "Cancel");
        v15_182[40] = qc1.S("\u786e\u8ba4\u5207\u6362\u663e\u793a\u6a21\u5f0f", "Confirm Display Mode Change");
        v15_182[41] = qc1.S("\u5207\u6362\u663e\u793a\u6a21\u5f0f\u540e\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\u4ee5\u5237\u65b0\u542f\u52a8\u56fe\u6807\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "After switching display mode, the app will try to restart to refresh the launcher icon. If restart fails, reopen the app manually. Continue?");
        v15_182[42] = qc1.S("\u786e\u8ba4\u5e76\u91cd\u542f", "Confirm and Restart");
        v15_182[43] = qc1.S("\u786e\u8ba4\u5207\u6362\u542f\u52a8\u56fe\u6807", "Confirm Launcher Icon Change");
        v15_182[44] = qc1.S("\u5207\u6362\u542f\u52a8\u56fe\u6807\u6837\u5f0f\u9700\u8981\u5237\u65b0\u684c\u9762\u5165\u53e3\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "Changing launcher icon style requires refreshing the home screen shortcut. The app will try to restart automatically. If restart fails, reopen the app manually. Continue?");
        v15_182[45] = qc1.S("\u786e\u8ba4\u5207\u6362\u4e3b\u9898\u914d\u8272", "Confirm Theme Palette Change");
        v15_182[46] = qc1.S("\u5207\u6362\u4e3b\u9898\u914d\u8272\u4f1a\u540c\u6b65\u66f4\u65b0\u5e94\u7528\u56fe\u6807\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "Changing theme palette also updates the app icon. The app will try to restart automatically. If restart fails, reopen the app manually. Continue?");
        v15_182[47] = qc1.S("\u786e\u8ba4\u5207\u6362\u8bed\u8a00", "Confirm Language Change");
        v15_182[48] = qc1.S("\u5207\u6362\u8bed\u8a00\u540e\uff0c\u5e94\u7528\u5c06\u5c1d\u8bd5\u81ea\u52a8\u91cd\u542f\u4ee5\u5e94\u7528\u65b0\u7684\u754c\u9762\u8bed\u8a00\uff1b\u82e5\u91cd\u542f\u5931\u8d25\uff0c\u8bf7\u624b\u52a8\u91cd\u65b0\u6253\u5f00\u5e94\u7528\u3002\u662f\u5426\u7ee7\u7eed\uff1f", "After changing language, the app will try to restart to apply the new UI language. If restart fails, reopen the app manually. Continue?");
        v15_182[49] = qc1.S("\u5173\u4e8e LLMonitor", "About LLMonitor");
        v15_182[50] = qc1.S("\u5145\u7535/\u672a\u5145\u7535\u901a\u77e5\u4e0e\u5237\u65b0\u9891\u7387", "Notification and refresh rates for charging/non-charging");
        v15_182[51] = qc1.S("\u5145\u7535\u65f6", "While charging");
        v15_182[52] = qc1.S("\u672a\u5145\u7535\u65f6", "Not charging");
        v15_182[53] = v2_60;
        v15_182[54] = v6_2;
        v15_182[55] = v12_2;
        v15_182[56] = qc1.S("\u663e\u793a\u7075\u52a8\u5c9b\u98ce\u683c\u5b9e\u51b5\u901a\u77e5", "Show Dynamic Island-style live notification");
        v15_182[57] = v11_4;
        v15_182[58] = qc1.S("\u5728\u5b9e\u65f6\u6d3b\u52a8\u4e2d\u663e\u793a\u201c\u672c\u6b21\u5173\u95ed\u201d\u6309\u94ae", "Show the \"Close Once\" button in Live Activity");
        v15_182[59] = qc1.S("\u901a\u77e5\u663e\u793a\u6570\u636e", "Notification Display Data");
        v15_182[60] = qc1.S("\u9009\u62e9\u901a\u77e5\u6b63\u6587\u4e2d\u663e\u793a\u7684\u6570\u636e", "Choose which data appears in notification body text");
        v15_182[61] = qc1.S("\u7535\u91cf\u767e\u5206\u6bd4", "Battery Percentage");
        v15_182[62] = v9_10;
        v15_182[63] = v10_33;
        v15_182[64] = qc1.S("\u901a\u77e5/\u7ec4\u4ef6\u66f4\u65b0\u7387", "Notification/Widget Update Rate");
        v15_182[65] = v8_4;
        v15_182[66] = v14_95;
        v15_182[67] = qc1.S("\u517c\u5bb9\u4e0d\u540c\u8bbe\u5907\u7684\u7535\u6c60\u8bfb\u6570", "Improve compatibility for battery readings on different devices");
        v15_182[68] = qc1.S("\u53cd\u8f6c\u7535\u6d41\u6b63\u8d1f", "Invert Current Sign");
        v15_182[69] = v5_10;
        v15_182[70] = qc1.S("\u53cc\u82af\u7535\u6c60\u4fee\u6b63", "Dual-Cell Battery Correction");
        v15_182[71] = qc1.S("\u5982\u679c\u4f7f\u7528\u53cc\u82af\u7535\u6c60\uff0c\u8bf7\u5f00\u542f\u6b64\u9879", "Enable this if your device uses a dual-cell battery");
        v15_182[72] = qc1.S("\u865a\u62df\u7535\u538b", "Virtual Voltage");
        v15_182[73] = qc1.S("\u82e5\u8bbe\u5907\u65e0\u6cd5\u8bfb\u53d6\u7535\u538b\uff0c\u5c1d\u8bd5\u4f7f\u7528\u4f30\u7b97\u7535\u538b", "If voltage cannot be read, try estimated voltage");
        v15_182[74] = qc1.S("\u540e\u53f0\u4fdd\u6d3b\u4e0e\u8c03\u8bd5\u9009\u9879", "Background keep-alive and debug options");
        v15_182[75] = qc1.S("\u7981\u7528\u7535\u6c60\u4f18\u5316", "Disable Battery Optimization");
        v15_182[76] = qc1.S("\u7535\u6c60\u4f18\u5316\u5df2\u7981\u7528", "Battery Optimization Disabled");
        v15_182[77] = qc1.S("\u70b9\u51fb\u7981\u7528\uff0c\u786e\u4fdd\u540e\u53f0\u5b9e\u65f6\u66f4\u65b0\u4e0d\u4e2d\u65ad", "Tap to disable and keep background real-time updates uninterrupted");
        v15_182[78] = qc1.S("\u540e\u53f0\u66f4\u65b0\u4e0d\u53d7\u9650\u5236", "Background updates are unrestricted");
        v15_182[79] = qc1.S("\u7535\u6c60\u4f18\u5316", "Battery Optimization");
        v15_182[80] = qc1.S("\u524d\u5f80\u8bbe\u7f6e", "Open Settings");
        v15_182[81] = qc1.S("\u8c03\u8bd5\u6a21\u5f0f", "Debug Mode");
        v15_182[82] = qc1.S("\u663e\u793a\u5404\u6307\u6807\u53ef\u7528\u6570\u636e\u6765\u6e90\uff08\u4ec5\u7528\u4e8e\u8bca\u65ad\uff09", "Show available data sources for each metric (diagnostics only)");
        v15_182[83] = qc1.S("\u5386\u53f2\u8bb0\u5f55\u7ef4\u62a4", "History Maintenance");
        v15_182[84] = qc1.S("\u6e05\u9664\u5386\u53f2\u6570\u636e", "Clear History");
        v15_182[85] = qc1.S("\u5220\u9664\u6240\u6709\u5df2\u5b58\u50a8\u7684\u5145\u7535\u529f\u7387\u8bb0\u5f55", "Delete all stored charging power records");
        v15_182[86] = qc1.S("\u6e05\u9664", "Clear");
        v15_182[87] = qc1.S("\u8ddf\u968f\u7cfb\u7edf", "Follow System");
        v15_182[88] = qc1.S("\u6d45\u8272\u6a21\u5f0f", "Light Mode");
        v15_182[89] = qc1.S("\u6df1\u8272\u6a21\u5f0f", "Dark Mode");
        v15_182[90] = qc1.S("\u7b80\u4f53\u4e2d\u6587\uff08\u4e2d\u56fd\uff09", "Simplified Chinese (China)");
        v15_182[91] = qc1.S("\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u9999\u6e2f\uff09", "Traditional Chinese (Hong Kong, China)");
        v15_182[92] = qc1.S("\u7e41\u9ad4\u4e2d\u6587\uff08\u4e2d\u570b\u53f0\u7063\uff09", "Traditional Chinese (Taiwan, China)");
        v15_182[93] = qc1.S("\u786e\u8ba4\u5220\u9664\u5386\u53f2\u58c1\u7eb8", "Confirm Deleting Wallpaper History");
        v15_182[94] = qc1.S("\u5220\u9664\u540e\u65e0\u6cd5\u6062\u590d\uff0c\u8fd9\u5f20\u5386\u53f2\u58c1\u7eb8\u5c06\u4ece\u5217\u8868\u4e2d\u79fb\u9664\u3002", "This action cannot be undone. The selected wallpaper will be removed from history.");
        v15_182[95] = qc1.S("\u786e\u8ba4\u5220\u9664", "Confirm Delete");
        v15_182[96] = qc1.S("\u663e\u793a\u6a21\u5f0f", "Display Mode");
        v15_182[97] = qc1.S("\u542f\u52a8\u56fe\u6807\u6837\u5f0f", "Launcher Icon Style");
        v15_182[98] = qc1.S("\u6d45\u8272\u56fe\u6807", "Light Icon");
        v15_182[99] = qc1.S("\u6df1\u8272\u56fe\u6807", "Dark Icon");
        v15_182[100] = qc1.S("\u8bed\u8a00", "Language");
        v15_182[101] = qc1.S("\u5e94\u7528\u8bed\u8a00", "App Language");
        v15_182[102] = qc1.S("\u4e3b\u9898\u914d\u8272", "Theme Palette");
        v15_182[103] = qc1.S("\u52a8\u6001\u591a\u5f69", "Dynamic Spectrum");
        v15_182[104] = qc1.S("\u6ca7\u84dd", "Ocean Blue");
        v15_182[105] = qc1.S("\u677e\u9752", "Forest Green");
        v15_182[106] = qc1.S("\u66db\u6a59", "Sunset Amber");
        v15_182[107] = qc1.S("\u6a31\u972d", "Blossom Pink");
        v15_182[108] = qc1.S("\u9701\u7d2b", "Misty Violet");
        v15_182[109] = qc1.S("\u4e3b\u9875\u5361\u7247\u900f\u660e\u5ea6", "Home Card Transparency");
        v15_182[110] = qc1.S("\u4e3b\u754c\u9762\u58c1\u7eb8", "Main Screen Wallpaper");
        v15_182[111] = qc1.S("\u6dfb\u52a0\u58c1\u7eb8", "Add Wallpaper");
        v15_182[112] = qc1.S("\u900f\u660e\u5ea6", "Opacity");
        v15_182[113] = qc1.S("\u6a21\u7cca\u5ea6", "Blur");
        v15_182[114] = qc1.S("\u5220\u9664\u5386\u53f2\u58c1\u7eb8", "Delete History Wallpaper");
        v15_182[115] = qc1.S("\u672a\u8986\u76d6\u8bed\u8a00\u5c06\u81ea\u52a8\u4f7f\u7528\u82f1\u8bed", "Unsupported languages will fall back to English");
        v15_182[116] = qc1.S("\u98ce\u5728\u8033\u8fb9", "Wind by your ear.");
        v15_182[117] = qc1.S("\u57fa\u672c\u4fe1\u606f", "Basic Information");
        v15_182[118] = qc1.S("\u5e94\u7528\u540d\u79f0", "App Name");
        v15_182[119] = qc1.S("\u4f5c\u8005", "Author");
        v15_182[120] = qc1.S("\u7248\u672c", "Version");
        v15_182[121] = qc1.S("\u5f00\u6e90\u8bb8\u53ef\u4fe1\u606f\u52a0\u8f7d\u5931\u8d25", "Failed to load open-source license information");
        v15_182[122] = qc1.S("LLMonitor \u5f53\u524d\u7248\u672c\u4f7f\u7528\u7684\u7b2c\u4e09\u65b9\u7ec4\u4ef6\u53ca\u5176\u8bb8\u53ef\u4fe1\u606f", "Third-party components and license information used by this version of LLMonitor");
        v15_182[123] = qc1.S("\u4fdd\u5b58\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5", "Save failed, please try again");
        v15_182[124] = qc1.S("\u58c1\u7eb8\u5bfc\u5165\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5", "Wallpaper import failed, please try again");
        v15_182[125] = qc1.S("\u4fdd\u5b58", "Save");
        v15_182[126] = qc1.S("\u89d2\u5ea6", "Angle");
        v15_182[127] = qc1.S("\u91cd\u7f6e", "Reset");
        v15_182[128] = qc1.S("90\u5ea6", "90\u00b0");
        v15_182[129] = qc1.S("\u56fe\u7247\u52a0\u8f7d\u5931\u8d25", "Failed to load image");
        v15_182[130] = qc1.S("\u8fd4\u56de\u91cd\u9009", "Back and reselect");
        v15_182[131] = qc1.S("\u6b63\u5728\u8bfb\u53d6 SoC \u6307\u6807\u2026", "Reading SoC metrics...");
        v15_182[132] = qc1.S("SoC \u91c7\u96c6\u4e0d\u53ef\u7528", "SoC collection unavailable");
        v15_182[133] = qc1.S("CPU \u5360\u7528", "CPU Usage");
        v15_182[134] = qc1.S("\u5185\u5b58\u5360\u7528", "Memory Usage");
        v15_182[135] = qc1.S("\u53d7\u9650", "Limited");
        v15_182[136] = qc1.S("SoC \u6e29\u5ea6", "SoC Temperature");
        v15_182[137] = qc1.S("\u5728\u7ebfCPU\u6838\u5fc3", "Online CPU Cores");
        v15_182[138] = qc1.S("\u7cfb\u7edf1min\u8d1f\u8f7d", "System 1-min Load");
        v15_182[139] = qc1.S("CPU \u578b\u53f7", "CPU Model");
        v15_182[140] = qc1.S("\u5f53\u524d\u8bbe\u5907\u672a\u66b4\u9732\u53ef\u7528\u7684 CPU \u9891\u7387\u8282\u70b9\uff0cCPU \u9891\u7387\u4fe1\u606f\u4e0d\u53ef\u7528\u3002", "This device does not expose readable CPU frequency nodes, so CPU frequency info is unavailable.");
        v15_182[141] = qc1.S("SoC \u76f8\u5173 Thermal Zones", "SoC-related Thermal Zones");
        v15_182[142] = qc1.S("\u672a\u53d1\u73b0\u53ef\u8bfb\u4e14\u4e0e SoC \u76f8\u5173\u7684 thermal_zone \u8282\u70b9\u3002", "No readable thermal_zone nodes related to SoC were found.");
        v15_182[143] = qc1.S("\u672a\u5206\u7c07", "Unclustered");
        v15_182[144] = qc1.S("\u5360\u6bd4", "Share");
        v15_182[145] = qc1.S("CPU10 \u79bb\u7ebf", "CPU10 Offline");
        v15_182[146] = qc1.S("\u91c7\u96c6\u5931\u8d25", "Collection failed");
        v15_182[147] = qc1.S("\u5b9e\u65f6\u901a\u77e5\u53d7\u9650", "Live notification restricted");
        v15_182[148] = qc1.S("\u4e3a\u4e86\u5728\u901a\u77e5\u680f\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff0c\u9700\u8981\u6388\u4e88\u901a\u77e5\u6743\u9650\u3002", "Notification permission is required to show real-time charging power in notifications.");
        v15_182[149] = qc1.S("\u5141\u8bb8\u901a\u77e5", "Allow Notifications");
        v15_182[150] = qc1.S("\u4e0d\u518d\u63d0\u9192", "Don\'t remind again");
        v15_182[151] = qc1.S("\u540e\u53f0\u4fdd\u6d3b\u53d7\u9650", "Background keep-alive restricted");
        v15_182[152] = qc1.S("\u4e3a\u4e86\u4fdd\u8bc1\u684c\u9762\u5c0f\u7ec4\u4ef6\u5b9e\u65f6\u5237\u65b0\uff0c\u8bf7\u5c06\u672c\u5e94\u7528\u52a0\u5165\u7535\u6c60\u4f18\u5316\u767d\u540d\u5355\u3002", "To keep widgets refreshing in real time, add this app to the battery optimization whitelist.");
        v15_182[153] = qc1.S("\u7acb\u5373\u5f00\u542f", "Enable Now");
        v15_182[154] = qc1.S("\u68c0\u6d4b\u5230\u7535\u538b\u8bfb\u6570\u5f02\u5e38", "Abnormal voltage reading detected");
        v15_182[155] = qc1.S("\u8bbe\u5907\u4f3c\u4e4e\u65e0\u6cd5\u8bfb\u53d6\u5b9e\u65f6\u7535\u538b\u3002\u5efa\u8bae\u5f00\u542f\u201c\u865a\u62df\u7535\u538b\u201d\u529f\u80fd\u4ee5\u83b7\u5f97\u4f30\u7b97\u6570\u636e\u3002", "This device seems unable to read real-time voltage. Enable \"Virtual Voltage\" for estimated values.");
        v15_182[156] = qc1.S("\u5f00\u542f\u865a\u62df\u7535\u538b", "Enable Virtual Voltage");
        v15_182[157] = qc1.S("\u77ac\u65f6\u529f\u7387", "Instant Power");
        v15_182[158] = qc1.S("\u7535\u6c60\u6e29\u5ea6", "Battery Temperature");
        v15_182[159] = qc1.S("\u7535\u6c60\u7535\u538b", "Battery Voltage");
        v15_182[160] = qc1.S("\u7535\u6c60\u7535\u6d41", "Battery Current");
        v15_182[161] = qc1.S("\u4f9b\u7535\u72b6\u6001", "Power Source");
        v15_182[162] = qc1.S("\u7535\u6c60\u72b6\u6001", "Battery Status");
        v15_182[163] = qc1.S("\u5f53\u524d\u5269\u4f59\u7535\u91cf / \u603b\u5bb9\u91cf", "Current Remaining Charge / Total Capacity");
        v15_182[164] = qc1.S("\u7cfb\u7edf\u5269\u4f59\u5bb9\u91cf / \u603b\u5bb9\u91cf", "System Remaining Capacity / Total Capacity");
        v15_182[165] = qc1.S("\u5bb9\u91cf\u8ba1\u7b97\u8bf4\u660e", "Capacity Calculation Notes");
        v15_182[166] = qc1.S("\u6b64\u5904\u5bb9\u91cf\u4e0e\u767e\u5206\u6bd4\u57fa\u4e8e\u7cfb\u7edf\u63d0\u4f9b\u7684\u7535\u6c60\u5bb9\u91cf\u6570\u636e\u8ba1\u7b97\uff0c\u5e76\u975e\u7cfb\u7edf\u72b6\u6001\u680f\u767e\u5206\u6bd4\u3002", "The capacity and percentage here are calculated from system-provided battery capacity data, not the status-bar percentage.");
        v15_182[167] = qc1.S("\u90e8\u5206\u5382\u5546\u5b58\u5728\u9501\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73b0\u7cfb\u7edf\u663e\u793a\u5df2\u5145\u6ee1\uff0c\u4f46\u5b9e\u9645\u7535\u6c60\u5bb9\u91cf\u5c1a\u672a\u8fbe\u5230\u6ee1\u503c\u7684\u60c5\u51b5\u3002", "Some vendors apply capacity locks, so the system may show fully charged while actual battery capacity is still below full.");
        v15_182[168] = qc1.S("\u6b64\u5904\u5bb9\u91cf\u4e0e\u767e\u5206\u6bd4\u57fa\u4e8e\u7cfb\u7edf\u63d0\u4f9b\u7684\u7535\u6c60\u5bb9\u91cf\u6570\u636e\u8ba1\u7b97\uff0c\u5e76\u975e\u7cfb\u7edf\u72b6\u6001\u680f\u767e\u5206\u6bd4\u3002\u90e8\u5206\u5382\u5546\u5b58\u5728\u9501\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73b0\u7cfb\u7edf\u663e\u793a\u5df2\u5145\u6ee1\uff0c\u4f46\u5b9e\u9645\u7535\u6c60\u5bb9\u91cf\u5c1a\u672a\u8fbe\u5230\u6ee1\u503c\u7684\u60c5\u51b5\u3002", "The capacity and percentage here are calculated from system-provided battery capacity data, not the status-bar percentage. Some vendors apply capacity locks, so the system may show fully charged while actual battery capacity is still below full.");
        v15_182[169] = qc1.S("1. \u6b64\u5904\u5bb9\u91cf\u4e0e\u767e\u5206\u6bd4\u57fa\u4e8e\u7cfb\u7edf\u63d0\u4f9b\u7684\u7535\u6c60\u5bb9\u91cf\u6570\u636e\u8ba1\u7b97\uff0c\u5e76\u975e\u7cfb\u7edf\u72b6\u6001\u680f\u767e\u5206\u6bd4\u3002\n2. \u90e8\u5206\u5382\u5546\u5b58\u5728\u9501\u5bb9\u7b56\u7565\uff0c\u53ef\u80fd\u51fa\u73b0\u7cfb\u7edf\u663e\u793a\u5df2\u5145\u6ee1\uff0c\u4f46\u5b9e\u9645\u7535\u6c60\u5bb9\u91cf\u5c1a\u672a\u8fbe\u5230\u6ee1\u503c\u7684\u60c5\u51b5\u3002", "1. The capacity and percentage here are calculated from system-provided battery capacity data, not the status-bar percentage.\n2. Some vendors apply capacity locks, so the system may show fully charged while actual battery capacity is still below full.");
        v15_182[170] = qc1.S("\u77e5\u9053\u4e86", "Got it");
        v15_182[171] = qc1.S("\u672a\u77e5", "Unknown");
        v15_182[172] = qc1.S("\u68c0\u6d4b\u4e2d", "Detecting");
        v15_182[173] = qc1.S("\u7535\u6e90\u9002\u914d\u5668", "AC Adapter");
        v15_182[174] = qc1.S("\u7535\u8111 (USB)", "Computer (USB)");
        v15_182[175] = qc1.S("\u65e0\u7ebf\u5145\u7535", "Wireless Charging");
        v15_182[176] = qc1.S("\u5e95\u5ea7\u4f9b\u7535", "Dock Power");
        v15_182[177] = qc1.S("\u7535\u6c60\u4f9b\u7535", "Battery Power");
        v15_182[178] = qc1.S("\u826f\u597d", "Good");
        v15_182[179] = qc1.S("\u8fc7\u70ed", "Overheat");
        v15_182[180] = qc1.S("\u635f\u574f", "Damaged");
        v15_182[181] = qc1.S("\u8fc7\u538b", "Over-voltage");
        v15_182[182] = qc1.S("\u6545\u969c", "Failure");
        v15_182[183] = qc1.S("\u8fc7\u51b7", "Too Cold");
        v15_182[184] = qc1.S("\u72b6\u6001\u672a\u77e5", "Status Unknown");
        v15_182[185] = qc1.S("\u5145\u7535\u4e2d", "Charging");
        v15_182[186] = qc1.S("\u653e\u7535\u4e2d", "Discharging");
        v15_182[187] = qc1.S("\u5df2\u63a5\u7535\u6e90(\u672a\u5145\u7535)", "Plugged in (Not Charging)");
        v15_182[188] = qc1.S("\u672a\u5145\u7535", "Not Charging");
        v15_182[189] = qc1.S("\u5df2\u5145\u6ee1", "Fully Charged");
        v15_182[190] = qc1.S("\u72b6\u6001\u5f02\u5e38", "Abnormal Status");
        v15_182[191] = qc1.S("\u6559\u5ba4\u8bfe\u8868\u67e5\u8be2", "Classroom Schedule Query");
        v15_182[192] = qc1.S("\u8bfe\u8868\u9009\u62e9", "Schedule Selection");
        v15_182[193] = qc1.S("\u8ddf\u968f\u6700\u65b0", "Follow Latest");
        v15_182[194] = qc1.S("\u5b9e\u65f6\u529f\u7387\u66f2\u7ebf", "Real-time Power Curve");
        v15_182[195] = qc1.S("\u5b9e\u65f6\u6e29\u5ea6\u66f2\u7ebf", "Real-time Temperature Curve");
        v15_182[196] = qc1.S("\u5145\u7535\u65f6\u666e\u901a\u901a\u77e5", "Standard notification while charging");
        v15_182[197] = qc1.S("\u672a\u5145\u7535\u65f6\u666e\u901a\u901a\u77e5", "Standard notification while not charging");
        v15_182[198] = qc1.S("\u672c\u6b21\u5173\u95ed", "Close Once");
        v15_182[199] = qc1.S("\u7535\u6c60\u76d1\u63a7\u540e\u53f0\u670d\u52a1", "Battery Monitor Background Service");
        v15_182[200] = qc1.S("\u663e\u793a\u5b9e\u65f6\u5145\u7535\u529f\u7387\uff08\u9759\u9ed8\u901a\u77e5\uff0c\u4e0d\u4f1a\u6253\u6270\uff09", "Shows real-time charging power (silent notification, no interruption)");
        v15_182[201] = qc1.S("\u5b9e\u65f6\u6d3b\u52a8 (\u7075\u52a8\u5c9b)", "Live Activity (Dynamic Island)");
        v15_182[202] = v7_270;
        v15_182[203] = v13_1;
        com.lele.llmonitor.i18n.TextI18nKt.enMap = b02.M(v15_182);
        com.lele.llmonitor.i18n.TextI18nKt.patternStatusWithRemaining = new yt2("^\u72b6\u6001\uff1a(.+) \\(\u4f59 (.+)\\)$");
        com.lele.llmonitor.i18n.TextI18nKt.patternStatus = new yt2("^\u72b6\u6001\uff1a(.+)$");
        com.lele.llmonitor.i18n.TextI18nKt.patternSeconds = new yt2("^(\\d+)\u79d2$");
        com.lele.llmonitor.i18n.TextI18nKt.patternMinutes = new yt2("^(\\d+)\u5206\u949f$");
        com.lele.llmonitor.i18n.TextI18nKt.patternComponents = new yt2("^(\\d+) \u4e2a\u7ec4\u4ef6$");
        com.lele.llmonitor.i18n.TextI18nKt.patternLicenseGroups = new yt2("^(\\d+) \u7ec4\u8bb8\u53ef$");
        com.lele.llmonitor.i18n.TextI18nKt.patternLicenseTypes = new yt2("^(\\d+) \u7c7b\u8bb8\u53ef$");
        com.lele.llmonitor.i18n.TextI18nKt.patternForComponents = new yt2("^\u9002\u7528\u4e8e (\\d+) \u4e2a\u7ec4\u4ef6$");
        com.lele.llmonitor.i18n.TextI18nKt.patternLicenseSummary = new yt2("^(.*) \u00b7 (.*) \u7b49 (\\d+) \u7c7b\u8bb8\u53ef$");
        com.lele.llmonitor.i18n.TextI18nKt.patternOnline = new yt2("^\u5728\u7ebf (\\d+) / (\\d+)$");
        com.lele.llmonitor.i18n.TextI18nKt.patternCpuOffline = new yt2("^CPU(\\d+) \u79bb\u7ebf$");
        com.lele.llmonitor.i18n.TextI18nKt.patternSource = new yt2("^\u5f53\u524d\u6765\u6e90: (.+)$");
        return;
    }

    public static final String l10n(String p2)
    {
        p2.getClass();
        com.lele.llmonitor.i18n.AppTextLocale v0_1 = com.lele.llmonitor.i18n.TextI18nKt.resolveAppTextLocale(com.lele.llmonitor.data.AppLocaleSupportKt.resolveCurrentAppLanguageOption());
        String v1 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic(p2, v0_1);
        if (v1 == null) {
            return com.lele.llmonitor.i18n.TextI18nKt.translateStatic(p2, v0_1);
        } else {
            return v1;
        }
    }

    public static final String l10n(String p1, com.lele.llmonitor.data.AppLanguageOption p2)
    {
        p1.getClass();
        p2.getClass();
        com.lele.llmonitor.i18n.AppTextLocale v2_1 = com.lele.llmonitor.i18n.TextI18nKt.resolveAppTextLocale(p2);
        String v0 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic(p1, v2_1);
        if (v0 == null) {
            return com.lele.llmonitor.i18n.TextI18nKt.translateStatic(p1, v2_1);
        } else {
            return v0;
        }
    }

    private static final com.lele.llmonitor.i18n.AppTextLocale resolveAppTextLocale(com.lele.llmonitor.data.AppLanguageOption p1)
    {
        int v1_7 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$1[p1.ordinal()];
        if (v1_7 == 1) {
            return com.lele.llmonitor.i18n.AppTextLocale.EN;
        } else {
            if (v1_7 == 2) {
                return com.lele.llmonitor.i18n.AppTextLocale.ZH_CN;
            } else {
                if (v1_7 == 3) {
                    return com.lele.llmonitor.i18n.AppTextLocale.ZH_HK;
                } else {
                    if (v1_7 == 4) {
                        return com.lele.llmonitor.i18n.AppTextLocale.ZH_TW;
                    } else {
                        if (v1_7 != 5) {
                            h.b();
                            return 0;
                        } else {
                            return com.lele.llmonitor.i18n.TextI18nKt.resolveSystemTextLocale();
                        }
                    }
                }
            }
        }
    }

    private static final com.lele.llmonitor.i18n.AppTextLocale resolveSystemTextLocale()
    {
        int v0_7 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$1[com.lele.llmonitor.data.AppLocaleSupportKt.resolveSupportedSystemLanguageOption().ordinal()];
        if (v0_7 != 1) {
            if (v0_7 == 2) {
                return com.lele.llmonitor.i18n.AppTextLocale.ZH_CN;
            } else {
                if (v0_7 == 3) {
                    return com.lele.llmonitor.i18n.AppTextLocale.ZH_HK;
                } else {
                    if (v0_7 == 4) {
                        return com.lele.llmonitor.i18n.AppTextLocale.ZH_TW;
                    } else {
                        if (v0_7 != 5) {
                            h.b();
                            return 0;
                        }
                    }
                }
            }
        }
        return com.lele.llmonitor.i18n.AppTextLocale.EN;
    }

    private static final String translateDynamic(String p11, com.lele.llmonitor.i18n.AppTextLocale p12)
    {
        int[] v0_14 = com.lele.llmonitor.i18n.TextI18nKt.patternStatusWithRemaining.a(p11);
        if (v0_14 == null) {
            int[] v0_6 = com.lele.llmonitor.i18n.TextI18nKt.patternStatus.a(p11);
            if (v0_6 == null) {
                int[] v0_9 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternSeconds);
                if (v0_9 == null) {
                    int[] v0_15 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternMinutes);
                    if (v0_15 == null) {
                        int[] v0_17 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternComponents);
                        if (v0_17 == null) {
                            int[] v0_19 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternLicenseGroups);
                            if (v0_19 == null) {
                                int[] v0_26 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternLicenseTypes);
                                if (v0_26 == null) {
                                    int[] v0_33 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternForComponents);
                                    if (v0_33 == null) {
                                        int[] v0_35 = com.lele.llmonitor.i18n.TextI18nKt.patternLicenseSummary.a(p11);
                                        if (v0_35 == null) {
                                            int[] v0_37 = com.lele.llmonitor.i18n.TextI18nKt.patternOnline.a(p11);
                                            if (v0_37 == null) {
                                                int[] v0_39 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternCpuOffline);
                                                if (v0_39 == null) {
                                                    int[] v0_41 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic$group1(p11, com.lele.llmonitor.i18n.TextI18nKt.patternSource);
                                                    if (v0_41 == null) {
                                                        return 0;
                                                    } else {
                                                        String v2_11 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic(v0_41, p12);
                                                        if (v2_11 == null) {
                                                            v2_11 = com.lele.llmonitor.i18n.TextI18nKt.translateStatic(v0_41, p12);
                                                        }
                                                        String v12_33 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                                        if (v12_33 != 1) {
                                                            if (v12_33 == 2) {
                                                                p11 = s42.h("\u7576\u524d\u4f86\u6e90: ", v2_11);
                                                            } else {
                                                                if (v12_33 == 3) {
                                                                    return s42.h("\u76ee\u524d\u4f86\u6e90: ", v2_11);
                                                                } else {
                                                                    if (v12_33 != 4) {
                                                                        h.b();
                                                                        return 0;
                                                                    } else {
                                                                        return s42.h("Current source: ", v2_11);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    String v12_35 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                                    if (v12_35 != 1) {
                                                        if ((v12_35 == 2) || (v12_35 == 3)) {
                                                            return ve2.o("CPU", v0_39, " \u96e2\u7dda");
                                                        } else {
                                                            if (v12_35 != 4) {
                                                                h.b();
                                                                return 0;
                                                            } else {
                                                                return ve2.o("CPU", v0_39, " offline");
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                String v2_3 = ((String) ((e02) v0_37.a()).get(1));
                                                int[] v0_5 = ((String) ((e02) v0_37.a()).get(2));
                                                String v12_3 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                                if (v12_3 != 1) {
                                                    if (v12_3 == 2) {
                                                        String v12_5 = new StringBuilder("\u5728\u7dda ");
                                                        v12_5.append(v2_3);
                                                        v12_5.append(" / ");
                                                        v12_5.append(v0_5);
                                                        return v12_5.toString();
                                                    } else {
                                                        if (v12_3 == 3) {
                                                            String v12_7 = new StringBuilder("\u7dda\u4e0a ");
                                                            v12_7.append(v2_3);
                                                            v12_7.append(" / ");
                                                            v12_7.append(v0_5);
                                                            return v12_7.toString();
                                                        } else {
                                                            if (v12_3 != 4) {
                                                                h.b();
                                                                return 0;
                                                            } else {
                                                                String v12_9 = new StringBuilder("Online ");
                                                                v12_9.append(v2_3);
                                                                v12_9.append(" / ");
                                                                v12_9.append(v0_5);
                                                                return v12_9.toString();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            String v2_7 = ((String) ((e02) v0_35.a()).get(1));
                                            int[] v3_4 = ((String) ((e02) v0_35.a()).get(2));
                                            int[] v0_12 = ((String) ((e02) v0_35.a()).get(3));
                                            String v8_0 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic(v2_7, p12);
                                            if (v8_0 == null) {
                                                v8_0 = com.lele.llmonitor.i18n.TextI18nKt.translateStatic(v2_7, p12);
                                            }
                                            String v2_8 = com.lele.llmonitor.i18n.TextI18nKt.translateStatic(v3_4, p12);
                                            String v12_11 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                            if (v12_11 != 1) {
                                                if ((v12_11 == 2) || (v12_11 == 3)) {
                                                    String v12_13 = new StringBuilder();
                                                    v12_13.append(v8_0);
                                                    v12_13.append(" \u00b7 ");
                                                    v12_13.append(v2_8);
                                                    v12_13.append(" \u7b49 ");
                                                    v12_13.append(v0_12);
                                                    v12_13.append(" \u985e\u6388\u6b0a");
                                                    return v12_13.toString();
                                                } else {
                                                    if (v12_11 != 4) {
                                                        h.b();
                                                        return 0;
                                                    } else {
                                                        String v12_15 = new StringBuilder();
                                                        v12_15.append(v8_0);
                                                        v12_15.append(" \u00b7 ");
                                                        v12_15.append(v2_8);
                                                        v12_15.append(" and ");
                                                        v12_15.append(v0_12);
                                                        v12_15.append(" more license types");
                                                        return v12_15.toString();
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        String v11_13 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                        if (v11_13 == 1) {
                                            return ve2.o("\u9002\u7528\u4e8e ", v0_33, " \u4e2a\u7ec4\u4ef6");
                                        } else {
                                            if (v11_13 == 2) {
                                                return ve2.o("\u9069\u7528\u65bc ", v0_33, " \u500b\u7d44\u4ef6");
                                            } else {
                                                if (v11_13 == 3) {
                                                    return ve2.o("\u9069\u7528\u65bc ", v0_33, " \u500b\u5143\u4ef6");
                                                } else {
                                                    if (v11_13 != 4) {
                                                        h.b();
                                                        return 0;
                                                    } else {
                                                        return ve2.o("Applies to ", v0_33, " components");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    String v11_21 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                    if (v11_21 == 1) {
                                        return v0_26.concat(" \u7c7b\u8bb8\u53ef");
                                    } else {
                                        if ((v11_21 == 2) || (v11_21 == 3)) {
                                            return v0_26.concat(" \u985e\u6388\u6b0a");
                                        } else {
                                            if (v11_21 != 4) {
                                                h.b();
                                                return 0;
                                            } else {
                                                return v0_26.concat(" license types");
                                            }
                                        }
                                    }
                                }
                            } else {
                                String v11_28 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                                if (v11_28 == 1) {
                                    return v0_19.concat(" \u7ec4\u8bb8\u53ef");
                                } else {
                                    if ((v11_28 == 2) || (v11_28 == 3)) {
                                        return v0_19.concat(" \u7d44\u6388\u6b0a");
                                    } else {
                                        if (v11_28 != 4) {
                                            h.b();
                                            return 0;
                                        } else {
                                            return v0_19.concat(" license groups");
                                        }
                                    }
                                }
                            }
                        } else {
                            String v11_36 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                            if (v11_36 == 1) {
                                return v0_17.concat(" \u4e2a\u7ec4\u4ef6");
                            } else {
                                if (v11_36 == 2) {
                                    return v0_17.concat(" \u500b\u7d44\u4ef6");
                                } else {
                                    if (v11_36 == 3) {
                                        return v0_17.concat(" \u500b\u5143\u4ef6");
                                    } else {
                                        if (v11_36 != 4) {
                                            h.b();
                                            return 0;
                                        } else {
                                            return v0_17.concat(" components");
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        String v11_42 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                        if (v11_42 == 1) {
                            return v0_15.concat("\u5206\u949f");
                        } else {
                            if ((v11_42 == 2) || (v11_42 == 3)) {
                                return v0_15.concat("\u5206\u9418");
                            } else {
                                if (v11_42 != 4) {
                                    h.b();
                                    return 0;
                                } else {
                                    return v0_15.concat(" min");
                                }
                            }
                        }
                    }
                } else {
                    String v11_50 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                    if (v11_50 == 1) {
                        return v0_9.concat("\u79d2");
                    } else {
                        if ((v11_50 == 2) || (v11_50 == 3)) {
                            return v0_9.concat("\u79d2");
                        } else {
                            if (v11_50 != 4) {
                                h.b();
                                return 0;
                            } else {
                                return v0_9.concat(" sec");
                            }
                        }
                    }
                }
            } else {
                int[] v0_25 = com.lele.llmonitor.i18n.TextI18nKt.translateStatic(((String) ((e02) v0_6.a()).get(1)), p12);
                String v12_25 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
                if (v12_25 != 1) {
                    if ((v12_25 == 2) || (v12_25 == 3)) {
                        return s42.h("\u72c0\u614b\uff1a", v0_25);
                    } else {
                        if (v12_25 != 4) {
                            h.b();
                            return 0;
                        } else {
                            return s42.h("Status: ", v0_25);
                        }
                    }
                }
            }
        } else {
            int[] v0_30 = ((String) ((e02) v0_14.a()).get(2));
            String v8_7 = com.lele.llmonitor.i18n.TextI18nKt.translateStatic(((String) ((e02) v0_14.a()).get(1)), p12);
            String v9_1 = com.lele.llmonitor.i18n.TextI18nKt.translateDynamic(v0_30, p12);
            if (v9_1 == null) {
                v9_1 = com.lele.llmonitor.i18n.TextI18nKt.translateStatic(v0_30, p12);
            }
            String v12_27 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p12.ordinal()];
            if (v12_27 != 1) {
                if ((v12_27 == 2) || (v12_27 == 3)) {
                    String v11_58 = new StringBuilder("\u72c0\u614b\uff1a");
                    v11_58.append(v8_7);
                    v11_58.append("\uff08\u9918 ");
                    v11_58.append(v9_1);
                    v11_58.append("\uff09");
                    return v11_58.toString();
                } else {
                    if (v12_27 != 4) {
                        h.b();
                        return 0;
                    } else {
                        String v11_61 = new StringBuilder("Status: ");
                        v11_61.append(v8_7);
                        v11_61.append(" (");
                        v11_61.append(v9_1);
                        v11_61.append(" left)");
                        return v11_61.toString();
                    }
                }
            }
        }
        return p11;
    }

    private static final String translateDynamic$group1(String p0, yt2 p1)
    {
        int v0_1 = p1.a(p0);
        if (v0_1 == 0) {
            return 0;
        } else {
            return ((String) ((e02) v0_1.a()).get(1));
        }
    }

    private static final String translateStatic(String p1, com.lele.llmonitor.i18n.AppTextLocale p2)
    {
        String v2_9 = com.lele.llmonitor.i18n.TextI18nKt$WhenMappings.$EnumSwitchMapping$0[p2.ordinal()];
        if (v2_9 != 1) {
            if (v2_9 == 2) {
                String v2_2 = ((String) com.lele.llmonitor.i18n.TextI18nKt.zhHkMap.get(p1));
                if (v2_2 != null) {
                    return v2_2;
                }
            } else {
                if (v2_9 == 3) {
                    String v2_5 = ((String) com.lele.llmonitor.i18n.TextI18nKt.zhTwMap.get(p1));
                    if (v2_5 != null) {
                        return v2_5;
                    }
                } else {
                    if (v2_9 != 4) {
                        h.b();
                        return 0;
                    } else {
                        String v2_10 = ((String) com.lele.llmonitor.i18n.TextI18nKt.enMap.get(p1));
                        if (v2_10 != null) {
                            return v2_10;
                        }
                    }
                }
            }
        }
        return p1;
    }
}
