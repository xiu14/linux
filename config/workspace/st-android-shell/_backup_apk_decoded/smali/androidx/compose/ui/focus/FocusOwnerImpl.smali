.class public final Landroidx/compose/ui/focus/FocusOwnerImpl;
.super Ljava/lang/Object;
.source "FocusOwnerImpl.kt"

# interfaces
.implements Landroidx/compose/ui/focus/FocusOwner;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFocusOwnerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n+ 2 FocusTransactionManager.kt\nandroidx/compose/ui/focus/FocusTransactionManager\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 12 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,419:1\n360#1:446\n361#1:463\n363#1:509\n349#1:580\n350#1:652\n351#1:659\n352#1,2:706\n354#1:754\n355#1:761\n360#1:763\n361#1:780\n363#1:826\n349#1:828\n350#1:900\n351#1:907\n352#1,2:954\n354#1:1002\n355#1:1009\n360#1:1011\n361#1:1028\n363#1:1074\n349#1:1076\n350#1:1148\n351#1:1155\n352#1,2:1202\n354#1:1250\n355#1:1257\n59#2,5:420\n64#2,6:428\n43#2,4:434\n47#2,4:441\n1#3:425\n1#3:438\n1#3:449\n1#3:518\n1#3:589\n1#3:766\n1#3:837\n1#3:1014\n1#3:1085\n1#3:1266\n1#3:1429\n1#3:1527\n728#4,2:426\n728#4,2:439\n102#5:445\n102#5:510\n102#5:579\n110#5:762\n110#5:827\n104#5:1010\n104#5:1075\n96#5,7:1488\n96#5:1521\n255#6:447\n62#6:448\n63#6,8:450\n432#6,5:458\n437#6:464\n442#6,2:466\n444#6,8:471\n452#6,9:482\n461#6,8:494\n72#6,7:502\n283#6:511\n251#6,5:512\n62#6:517\n63#6,8:519\n432#6,5:527\n284#6:532\n437#6:533\n442#6,2:535\n444#6,8:540\n452#6,9:551\n461#6,8:563\n72#6,7:571\n286#6:578\n274#6,2:581\n251#6,5:583\n62#6:588\n63#6,8:590\n432#6,5:598\n276#6,3:603\n437#6:606\n442#6,2:608\n444#6,8:613\n452#6,9:624\n461#6,8:636\n72#6,7:644\n279#6:651\n432#6,12:660\n444#6,8:675\n452#6,9:686\n461#6,8:698\n432#6,12:708\n444#6,8:723\n452#6,9:734\n461#6,8:746\n255#6:764\n62#6:765\n63#6,8:767\n432#6,5:775\n437#6:781\n442#6,2:783\n444#6,8:788\n452#6,9:799\n461#6,8:811\n72#6,7:819\n274#6,2:829\n251#6,5:831\n62#6:836\n63#6,8:838\n432#6,5:846\n276#6,3:851\n437#6:854\n442#6,2:856\n444#6,8:861\n452#6,9:872\n461#6,8:884\n72#6,7:892\n279#6:899\n432#6,12:908\n444#6,8:923\n452#6,9:934\n461#6,8:946\n432#6,12:956\n444#6,8:971\n452#6,9:982\n461#6,8:994\n255#6:1012\n62#6:1013\n63#6,8:1015\n432#6,5:1023\n437#6:1029\n442#6,2:1031\n444#6,8:1036\n452#6,9:1047\n461#6,8:1059\n72#6,7:1067\n274#6,2:1077\n251#6,5:1079\n62#6:1084\n63#6,8:1086\n432#6,5:1094\n276#6,3:1099\n437#6:1102\n442#6,2:1104\n444#6,8:1109\n452#6,9:1120\n461#6,8:1132\n72#6,7:1140\n279#6:1147\n432#6,12:1156\n444#6,8:1171\n452#6,9:1182\n461#6,8:1194\n432#6,12:1204\n444#6,8:1219\n452#6,9:1230\n461#6,8:1242\n274#6,2:1258\n251#6,5:1260\n62#6:1265\n63#6,8:1267\n432#6,5:1275\n276#6,3:1280\n437#6:1283\n442#6,2:1285\n444#6,8:1290\n452#6,9:1301\n461#6,8:1313\n72#6,7:1321\n279#6:1328\n432#6,6:1335\n442#6,2:1342\n444#6,8:1347\n452#6,9:1358\n461#6,8:1370\n432#6,6:1378\n442#6,2:1385\n444#6,8:1390\n452#6,9:1401\n461#6,8:1413\n255#6:1427\n62#6:1428\n63#6,8:1430\n432#6,6:1438\n442#6,2:1445\n444#6,8:1450\n452#6,9:1461\n461#6,8:1473\n72#6,7:1481\n193#6,12:1496\n205#6,6:1515\n212#6,3:1523\n197#6:1526\n249#7:465\n249#7:534\n249#7:607\n249#7:782\n249#7:855\n249#7:1030\n249#7:1103\n249#7:1284\n249#7:1341\n249#7:1384\n249#7:1444\n249#7:1522\n245#8,3:468\n248#8,3:491\n245#8,3:537\n248#8,3:560\n245#8,3:610\n248#8,3:633\n245#8,3:672\n248#8,3:695\n245#8,3:720\n248#8,3:743\n245#8,3:785\n248#8,3:808\n245#8,3:858\n248#8,3:881\n245#8,3:920\n248#8,3:943\n245#8,3:968\n248#8,3:991\n245#8,3:1033\n248#8,3:1056\n245#8,3:1106\n248#8,3:1129\n245#8,3:1168\n248#8,3:1191\n245#8,3:1216\n248#8,3:1239\n245#8,3:1287\n248#8,3:1310\n245#8,3:1344\n248#8,3:1367\n245#8,3:1387\n248#8,3:1410\n245#8,3:1447\n248#8,3:1470\n1208#9:479\n1187#9,2:480\n1208#9:548\n1187#9,2:549\n1208#9:621\n1187#9,2:622\n1208#9:683\n1187#9,2:684\n1208#9:731\n1187#9,2:732\n1208#9:796\n1187#9,2:797\n1208#9:869\n1187#9,2:870\n1208#9:931\n1187#9,2:932\n1208#9:979\n1187#9,2:980\n1208#9:1044\n1187#9,2:1045\n1208#9:1117\n1187#9,2:1118\n1208#9:1179\n1187#9,2:1180\n1208#9:1227\n1187#9,2:1228\n1208#9:1298\n1187#9,2:1299\n1208#9:1355\n1187#9,2:1356\n1208#9:1398\n1187#9,2:1399\n1208#9:1458\n1187#9,2:1459\n51#10,6:653\n33#10,6:755\n51#10,6:901\n33#10,6:1003\n51#10,6:1149\n33#10,6:1251\n51#10,6:1329\n33#10,6:1421\n53#11:1495\n42#12,7:1508\n*S KotlinDebug\n*F\n+ 1 FocusOwnerImpl.kt\nandroidx/compose/ui/focus/FocusOwnerImpl\n*L\n268#1:446\n268#1:463\n268#1:509\n271#1:580\n271#1:652\n271#1:659\n271#1:706,2\n271#1:754\n271#1:761\n287#1:763\n287#1:780\n287#1:826\n289#1:828\n289#1:900\n289#1:907\n289#1:954,2\n289#1:1002\n289#1:1009\n307#1:1011\n307#1:1028\n307#1:1074\n309#1:1076\n309#1:1148\n309#1:1155\n309#1:1202,2\n309#1:1250\n309#1:1257\n148#1:420,5\n148#1:428,6\n177#1:434,4\n177#1:441,4\n148#1:425\n177#1:438\n268#1:449\n269#1:518\n271#1:589\n287#1:766\n289#1:837\n307#1:1014\n309#1:1085\n349#1:1266\n360#1:1429\n148#1:426,2\n177#1:439,2\n268#1:445\n269#1:510\n272#1:579\n287#1:762\n290#1:827\n307#1:1010\n310#1:1075\n378#1:1488,7\n379#1:1521\n268#1:447\n268#1:448\n268#1:450,8\n268#1:458,5\n268#1:464\n268#1:466,2\n268#1:471,8\n268#1:482,9\n268#1:494,8\n268#1:502,7\n269#1:511\n269#1:512,5\n269#1:517\n269#1:519,8\n269#1:527,5\n269#1:532\n269#1:533\n269#1:535,2\n269#1:540,8\n269#1:551,9\n269#1:563,8\n269#1:571,7\n269#1:578\n271#1:581,2\n271#1:583,5\n271#1:588\n271#1:590,8\n271#1:598,5\n271#1:603,3\n271#1:606\n271#1:608,2\n271#1:613,8\n271#1:624,9\n271#1:636,8\n271#1:644,7\n271#1:651\n271#1:660,12\n271#1:675,8\n271#1:686,9\n271#1:698,8\n271#1:708,12\n271#1:723,8\n271#1:734,9\n271#1:746,8\n287#1:764\n287#1:765\n287#1:767,8\n287#1:775,5\n287#1:781\n287#1:783,2\n287#1:788,8\n287#1:799,9\n287#1:811,8\n287#1:819,7\n289#1:829,2\n289#1:831,5\n289#1:836\n289#1:838,8\n289#1:846,5\n289#1:851,3\n289#1:854\n289#1:856,2\n289#1:861,8\n289#1:872,9\n289#1:884,8\n289#1:892,7\n289#1:899\n289#1:908,12\n289#1:923,8\n289#1:934,9\n289#1:946,8\n289#1:956,12\n289#1:971,8\n289#1:982,9\n289#1:994,8\n307#1:1012\n307#1:1013\n307#1:1015,8\n307#1:1023,5\n307#1:1029\n307#1:1031,2\n307#1:1036,8\n307#1:1047,9\n307#1:1059,8\n307#1:1067,7\n309#1:1077,2\n309#1:1079,5\n309#1:1084\n309#1:1086,8\n309#1:1094,5\n309#1:1099,3\n309#1:1102\n309#1:1104,2\n309#1:1109,8\n309#1:1120,9\n309#1:1132,8\n309#1:1140,7\n309#1:1147\n309#1:1156,12\n309#1:1171,8\n309#1:1182,9\n309#1:1194,8\n309#1:1204,12\n309#1:1219,8\n309#1:1230,9\n309#1:1242,8\n349#1:1258,2\n349#1:1260,5\n349#1:1265\n349#1:1267,8\n349#1:1275,5\n349#1:1280,3\n349#1:1283\n349#1:1285,2\n349#1:1290,8\n349#1:1301,9\n349#1:1313,8\n349#1:1321,7\n349#1:1328\n351#1:1335,6\n351#1:1342,2\n351#1:1347,8\n351#1:1358,9\n351#1:1370,8\n353#1:1378,6\n353#1:1385,2\n353#1:1390,8\n353#1:1401,9\n353#1:1413,8\n360#1:1427\n360#1:1428\n360#1:1430,8\n360#1:1438,6\n360#1:1445,2\n360#1:1450,8\n360#1:1461,9\n360#1:1473,8\n360#1:1481,7\n378#1:1496,12\n378#1:1515,6\n378#1:1523,3\n378#1:1526\n268#1:465\n269#1:534\n271#1:607\n287#1:782\n289#1:855\n307#1:1030\n309#1:1103\n349#1:1284\n351#1:1341\n353#1:1384\n360#1:1444\n379#1:1522\n268#1:468,3\n268#1:491,3\n269#1:537,3\n269#1:560,3\n271#1:610,3\n271#1:633,3\n271#1:672,3\n271#1:695,3\n271#1:720,3\n271#1:743,3\n287#1:785,3\n287#1:808,3\n289#1:858,3\n289#1:881,3\n289#1:920,3\n289#1:943,3\n289#1:968,3\n289#1:991,3\n307#1:1033,3\n307#1:1056,3\n309#1:1106,3\n309#1:1129,3\n309#1:1168,3\n309#1:1191,3\n309#1:1216,3\n309#1:1239,3\n349#1:1287,3\n349#1:1310,3\n351#1:1344,3\n351#1:1367,3\n353#1:1387,3\n353#1:1410,3\n360#1:1447,3\n360#1:1470,3\n268#1:479\n268#1:480,2\n269#1:548\n269#1:549,2\n271#1:621\n271#1:622,2\n271#1:683\n271#1:684,2\n271#1:731\n271#1:732,2\n287#1:796\n287#1:797,2\n289#1:869\n289#1:870,2\n289#1:931\n289#1:932,2\n289#1:979\n289#1:980,2\n307#1:1044\n307#1:1045,2\n309#1:1117\n309#1:1118,2\n309#1:1179\n309#1:1180,2\n309#1:1227\n309#1:1228,2\n349#1:1298\n349#1:1299,2\n351#1:1355\n351#1:1356,2\n353#1:1398\n353#1:1399,2\n360#1:1458\n360#1:1459,2\n271#1:653,6\n271#1:755,6\n289#1:901,6\n289#1:1003,6\n309#1:1149,6\n309#1:1251,6\n350#1:1329,6\n354#1:1421,6\n378#1:1495\n378#1:1508,7\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u00aa\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012:\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\u0007\u0012!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0004\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u000eH\u0016J2\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u00084\u00105J(\u00106\u001a\u00020\u000e2\u0006\u00102\u001a\u0002032\u000c\u00107\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u0004H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u00088\u00109J\u0010\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020<H\u0016J:\u0010=\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0010>\u001a\u0004\u0018\u00010\u000c2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u000e0\u0003H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008@\u0010AJ\n\u0010B\u001a\u0004\u0018\u00010\u000cH\u0016J\u0008\u0010C\u001a\u00020\u0005H\u0002J\u001a\u0010D\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0008H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008E\u0010FJ\u0008\u0010G\u001a\u00020\u0005H\u0016J$\u0010H\u001a\u00020\u000e2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0002\u0008IJ\u0010\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020MH\u0016J\u0010\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\"H\u0016J$\u0010N\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00082\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008O\u0010PJ\u001a\u0010Q\u001a\u00020\u000e2\u0006\u00102\u001a\u000203H\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008R\u00105J\u000e\u0010S\u001a\u0004\u0018\u00010T*\u00020UH\u0002J3\u0010V\u001a\u0004\u0018\u0001HW\"\n\u0008\u0000\u0010W\u0018\u0001*\u00020X*\u00020U2\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u0002HW0ZH\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008[\u0010\\Jg\u0010]\u001a\u00020\u0005\"\n\u0008\u0000\u0010W\u0018\u0001*\u00020U*\u00020U2\u000c\u0010Y\u001a\u0008\u0012\u0004\u0012\u0002HW0Z2\u0012\u0010^\u001a\u000e\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020\u00050\u00032\u000c\u0010_\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020\u00050\u0003H\u0082\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008a\u0010bR\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u001eX\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000e0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0008\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\u000b\u0012\u0015\u0012\u0013\u0018\u00010\u000c\u00a2\u0006\u000c\u0008\t\u0012\u0008\u0008\n\u0012\u0004\u0008\u0008(\r\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010&R\u0014\u0010\'\u001a\u00020(8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010*\u0082\u0002\u0007\n\u0005\u0008\u00a1\u001e0\u0001\u00a8\u0006c"
    }
    d2 = {
        "Landroidx/compose/ui/focus/FocusOwnerImpl;",
        "Landroidx/compose/ui/focus/FocusOwner;",
        "onRequestApplyChangesListener",
        "Lkotlin/Function1;",
        "Lkotlin/Function0;",
        "",
        "onRequestFocusForOwner",
        "Lkotlin/Function2;",
        "Landroidx/compose/ui/focus/FocusDirection;",
        "Lkotlin/ParameterName;",
        "name",
        "focusDirection",
        "Landroidx/compose/ui/geometry/Rect;",
        "previouslyFocusedRect",
        "",
        "onMoveFocusInterop",
        "onClearFocusForOwner",
        "onFocusRectInterop",
        "onLayoutDirection",
        "Landroidx/compose/ui/unit/LayoutDirection;",
        "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V",
        "focusInvalidationManager",
        "Landroidx/compose/ui/focus/FocusInvalidationManager;",
        "focusTransactionManager",
        "Landroidx/compose/ui/focus/FocusTransactionManager;",
        "getFocusTransactionManager",
        "()Landroidx/compose/ui/focus/FocusTransactionManager;",
        "keysCurrentlyDown",
        "Landroidx/collection/MutableLongSet;",
        "modifier",
        "Landroidx/compose/ui/Modifier;",
        "getModifier",
        "()Landroidx/compose/ui/Modifier;",
        "rootFocusNode",
        "Landroidx/compose/ui/focus/FocusTargetNode;",
        "getRootFocusNode$ui_release",
        "()Landroidx/compose/ui/focus/FocusTargetNode;",
        "setRootFocusNode$ui_release",
        "(Landroidx/compose/ui/focus/FocusTargetNode;)V",
        "rootState",
        "Landroidx/compose/ui/focus/FocusState;",
        "getRootState",
        "()Landroidx/compose/ui/focus/FocusState;",
        "clearFocus",
        "force",
        "refreshFocusEvents",
        "clearOwnerFocus",
        "clearFocus-I7lrPNg",
        "(ZZZI)Z",
        "dispatchInterceptedSoftKeyboardEvent",
        "keyEvent",
        "Landroidx/compose/ui/input/key/KeyEvent;",
        "dispatchInterceptedSoftKeyboardEvent-ZmokQxo",
        "(Landroid/view/KeyEvent;)Z",
        "dispatchKeyEvent",
        "onFocusedItem",
        "dispatchKeyEvent-YhN2O0w",
        "(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z",
        "dispatchRotaryEvent",
        "event",
        "Landroidx/compose/ui/input/rotary/RotaryScrollEvent;",
        "focusSearch",
        "focusedRect",
        "onFound",
        "focusSearch-ULY8qGw",
        "(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;",
        "getFocusRect",
        "invalidateOwnerFocusState",
        "moveFocus",
        "moveFocus-3ESFkO8",
        "(I)Z",
        "releaseFocus",
        "requestFocusForOwner",
        "requestFocusForOwner-7o62pno",
        "scheduleInvalidation",
        "node",
        "Landroidx/compose/ui/focus/FocusEventModifierNode;",
        "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;",
        "takeFocus",
        "takeFocus-aToIllA",
        "(ILandroidx/compose/ui/geometry/Rect;)Z",
        "validateKeyEvent",
        "validateKeyEvent-ZmokQxo",
        "lastLocalKeyInputNode",
        "Landroidx/compose/ui/Modifier$Node;",
        "Landroidx/compose/ui/node/DelegatableNode;",
        "nearestAncestorIncludingSelf",
        "T",
        "",
        "type",
        "Landroidx/compose/ui/node/NodeKind;",
        "nearestAncestorIncludingSelf-64DMado",
        "(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;",
        "traverseAncestorsIncludingSelf",
        "onPreVisit",
        "onVisit",
        "onPostVisit",
        "traverseAncestorsIncludingSelf-QFhIj7k",
        "(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V",
        "ui_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

.field private final focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

.field private keysCurrentlyDown:Landroidx/collection/MutableLongSet;

.field private final modifier:Landroidx/compose/ui/Modifier;

.field private final onClearFocusForOwner:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final onFocusRectInterop:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;"
        }
    .end annotation
.end field

.field private final onLayoutDirection:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            ">;"
        }
    .end annotation
.end field

.field private final onMoveFocusInterop:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final onRequestFocusForOwner:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "Landroidx/compose/ui/geometry/Rect;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->$stable:I

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1, "onRequestApplyChangesListener"    # Lkotlin/jvm/functions/Function1;
    .param p2, "onRequestFocusForOwner"    # Lkotlin/jvm/functions/Function2;
    .param p3, "onMoveFocusInterop"    # Lkotlin/jvm/functions/Function1;
    .param p4, "onClearFocusForOwner"    # Lkotlin/jvm/functions/Function0;
    .param p5, "onFocusRectInterop"    # Lkotlin/jvm/functions/Function0;
    .param p6, "onLayoutDirection"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "-",
            "Landroidx/compose/ui/geometry/Rect;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusDirection;",
            "Ljava/lang/Boolean;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Landroidx/compose/ui/geometry/Rect;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "+",
            "Landroidx/compose/ui/unit/LayoutDirection;",
            ">;)V"
        }
    .end annotation

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onRequestFocusForOwner:Lkotlin/jvm/functions/Function2;

    .line 60
    iput-object p3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lkotlin/jvm/functions/Function1;

    .line 61
    iput-object p4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lkotlin/jvm/functions/Function0;

    .line 62
    iput-object p5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onFocusRectInterop:Lkotlin/jvm/functions/Function0;

    .line 63
    iput-object p6, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lkotlin/jvm/functions/Function0;

    .line 66
    new-instance v0, Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTargetNode;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    .line 68
    new-instance v0, Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 69
    nop

    .line 70
    new-instance v1, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$1;

    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusInvalidationManager$1;-><init>(Ljava/lang/Object;)V

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 68
    invoke-direct {v0, p1, v1}, Landroidx/compose/ui/focus/FocusInvalidationManager;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    .line 73
    new-instance v0, Landroidx/compose/ui/focus/FocusTransactionManager;

    invoke-direct {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;-><init>()V

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    .line 86
    nop

    .line 80
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    .line 85
    sget-object v1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;->INSTANCE:Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$1;

    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/focus/FocusPropertiesKt;->focusProperties(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    .line 87
    new-instance v1, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;

    invoke-direct {v1, p0}, Landroidx/compose/ui/focus/FocusOwnerImpl$modifier$2;-><init>(Landroidx/compose/ui/focus/FocusOwnerImpl;)V

    check-cast v1, Landroidx/compose/ui/Modifier;

    .line 86
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->then(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    .line 56
    return-void
.end method

.method public static final synthetic access$invalidateOwnerFocusState(Landroidx/compose/ui/focus/FocusOwnerImpl;)V
    .locals 0
    .param p0, "$this"    # Landroidx/compose/ui/focus/FocusOwnerImpl;

    .line 56
    invoke-direct {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->invalidateOwnerFocusState()V

    return-void
.end method

.method private final invalidateOwnerFocusState()V
    .locals 2

    .line 338
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    sget-object v1, Landroidx/compose/ui/focus/FocusStateImpl;->Inactive:Landroidx/compose/ui/focus/FocusStateImpl;

    if-ne v0, v1, :cond_0

    .line 339
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 341
    :cond_0
    return-void
.end method

.method private final lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;
    .locals 17
    .param p1, "$this$lastLocalKeyInputNode"    # Landroidx/compose/ui/node/DelegatableNode;

    .line 377
    const/4 v0, 0x0

    .line 378
    .local v0, "focusedKeyInputNode":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 1488
    .local v1, "$i$f$getFocusTarget-OLwlOKw":I
    const/16 v2, 0x400

    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v1

    .line 378
    .end local v1    # "$i$f$getFocusTarget-OLwlOKw":I
    const/4 v3, 0x0

    .line 1494
    .local v3, "$i$f$getKeyInput-OLwlOKw":I
    const/16 v4, 0x2000

    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v3

    .line 378
    .end local v3    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v1, "arg0$iv":I
    .local v3, "other$iv":I
    const/4 v4, 0x0

    .line 1495
    .local v4, "$i$f$or-H91voCI":I
    or-int/2addr v1, v3

    .line 378
    .end local v1    # "arg0$iv":I
    .end local v3    # "other$iv":I
    .end local v4    # "$i$f$or-H91voCI":I
    nop

    .local v1, "mask$iv":I
    move-object/from16 v3, p1

    .local v3, "$this$visitLocalDescendants$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v4, 0x0

    .line 1496
    .local v4, "$i$f$visitLocalDescendants":I
    nop

    .line 1498
    nop

    .line 1496
    move-object v5, v3

    .local v5, "$this$visitLocalDescendants$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v6, 0x0

    move v7, v6

    .local v7, "includeSelf$iv$iv":Z
    const/4 v8, 0x0

    .line 1507
    .local v8, "$i$f$visitLocalDescendants":I
    invoke-interface {v5}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v9

    .local v9, "value$iv$iv$iv":Z
    const/4 v10, 0x0

    .line 1508
    .local v10, "$i$f$checkPrecondition":I
    nop

    .line 1511
    if-nez v9, :cond_0

    .line 1512
    const/4 v11, 0x0

    .line 1507
    .local v11, "$i$a$-checkPrecondition-DelegatableNodeKt$visitLocalDescendants$1$iv$iv":I
    nop

    .line 1512
    .end local v11    # "$i$a$-checkPrecondition-DelegatableNodeKt$visitLocalDescendants$1$iv$iv":I
    const-string/jumbo v11, "visitLocalDescendants called on an unattached node"

    invoke-static {v11}, Landroidx/compose/ui/internal/InlineClassHelperKt;->throwIllegalStateException(Ljava/lang/String;)V

    .line 1514
    :cond_0
    nop

    .line 1515
    .end local v9    # "value$iv$iv$iv":Z
    .end local v10    # "$i$f$checkPrecondition":I
    invoke-interface {v5}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    .line 1516
    .local v9, "self$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v10

    and-int/2addr v10, v1

    if-eqz v10, :cond_5

    .line 1517
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 1518
    .local v10, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_0
    if-eqz v10, :cond_4

    .line 1519
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v1

    if-eqz v11, :cond_3

    .line 1520
    move-object v11, v10

    .local v11, "modifierNode":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 379
    .local v12, "$i$a$-visitLocalDescendants-FocusOwnerImpl$lastLocalKeyInputNode$1":I
    const/4 v13, 0x0

    .line 1521
    .local v13, "$i$f$getFocusTarget-OLwlOKw":I
    invoke-static {v2}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v13

    .line 379
    .end local v13    # "$i$f$getFocusTarget-OLwlOKw":I
    nop

    .local v13, "kind$iv":I
    move-object v14, v11

    .local v14, "this_$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v15, 0x0

    .line 1522
    .local v15, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v16

    and-int v16, v16, v13

    if-eqz v16, :cond_1

    const/16 v16, 0x1

    goto :goto_1

    :cond_1
    move/from16 v16, v6

    .line 379
    .end local v13    # "kind$iv":I
    .end local v14    # "this_$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1
    if-eqz v16, :cond_2

    return-object v0

    .line 381
    :cond_2
    move-object v0, v11

    .line 382
    nop

    .line 1520
    .end local v11    # "modifierNode":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-visitLocalDescendants-FocusOwnerImpl$lastLocalKeyInputNode$1":I
    nop

    .line 1523
    :cond_3
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    goto :goto_0

    .line 1525
    :cond_4
    nop

    .line 1526
    .end local v5    # "$this$visitLocalDescendants$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v7    # "includeSelf$iv$iv":Z
    .end local v8    # "$i$f$visitLocalDescendants":I
    .end local v9    # "self$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v10    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_5
    nop

    .line 383
    .end local v1    # "mask$iv":I
    .end local v3    # "$this$visitLocalDescendants$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$visitLocalDescendants":I
    return-object v0
.end method

.method private final synthetic nearestAncestorIncludingSelf-64DMado(Landroidx/compose/ui/node/DelegatableNode;I)Ljava/lang/Object;
    .locals 29
    .param p1, "$this$nearestAncestorIncludingSelf_u2d64DMado"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p2, "type"    # I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 360
    .local v0, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v1, 0x1

    .local v1, "includeSelf$iv":Z
    move-object/from16 v2, p1

    .local v2, "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v3, 0x0

    .line 1427
    .local v3, "$i$f$visitAncestors-Y-YKmho":I
    move/from16 v4, p2

    .local v4, "mask$iv$iv":I
    move-object v5, v2

    .local v5, "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v6, 0x0

    .line 1428
    .local v6, "$i$f$visitAncestors":I
    invoke-interface {v5}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v7

    if-eqz v7, :cond_12

    .line 1430
    invoke-interface {v5}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    .line 1431
    .local v7, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v5}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v8

    .line 1432
    .local v8, "layout$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v8, :cond_11

    .line 1433
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 1434
    .local v10, "head$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v4

    if-eqz v11, :cond_f

    .line 1435
    :goto_1
    if-eqz v7, :cond_e

    .line 1436
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int/2addr v11, v4

    if-eqz v11, :cond_d

    .line 1437
    move-object v11, v7

    check-cast v11, Landroidx/compose/ui/Modifier$Node;

    .local v11, "it$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 1427
    .local v12, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv":I
    move-object v13, v11

    .local v13, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1438
    .local v14, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v15, 0x0

    .line 1439
    .local v15, "stack$iv$iv":Ljava/lang/Object;
    const/16 v16, 0x0

    .local v16, "node$iv$iv":Ljava/lang/Object;
    move-object/from16 v16, v13

    move-object/from16 v9, v16

    const/16 v16, 0x0

    .line 1440
    .end local v16    # "node$iv$iv":Ljava/lang/Object;
    .local v9, "node$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v9, :cond_c

    .line 1441
    move/from16 v17, v0

    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .local v17, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v0, 0x3

    move/from16 v18, v1

    .end local v1    # "includeSelf$iv":Z
    .local v18, "includeSelf$iv":Z
    const-string v1, "T"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v0, v9, Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1442
    move-object v0, v9

    .local v0, "it":Ljava/lang/Object;
    const/4 v1, 0x0

    .line 361
    .local v1, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1":I
    return-object v0

    .line 1443
    .end local v0    # "it":Ljava/lang/Object;
    .end local v1    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1":I
    :cond_0
    move-object v0, v9

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .local v0, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v1, 0x0

    .line 1444
    .local v1, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v19

    and-int v19, v19, p2

    move-object/from16 v20, v0

    .end local v0    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v20, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v19, :cond_1

    const/4 v1, 0x1

    goto :goto_3

    :cond_1
    const/4 v1, 0x0

    .line 1443
    .end local v1    # "$i$f$isKind-H91voCI$ui_release":I
    .end local v20    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_3
    if-eqz v1, :cond_a

    instance-of v1, v9, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v1, :cond_a

    .line 1445
    const/4 v1, 0x0

    .line 1446
    .local v1, "count$iv$iv":I
    move-object/from16 v19, v9

    check-cast v19, Landroidx/compose/ui/node/DelegatingNode;

    .local v19, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v20, 0x0

    .line 1447
    .local v20, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    .line 1448
    .local v21, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v21, :cond_9

    .line 1449
    move-object/from16 v0, v21

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .local v0, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 1450
    .local v22, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object/from16 v23, v0

    .local v23, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v24, 0x0

    .line 1444
    .local v24, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v25

    and-int v25, v25, p2

    if-eqz v25, :cond_2

    const/16 v23, 0x1

    goto :goto_5

    :cond_2
    const/16 v23, 0x0

    .line 1450
    .end local v23    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v23, :cond_8

    .line 1451
    add-int/lit8 v1, v1, 0x1

    .line 1452
    move-object/from16 v23, v2

    const/4 v2, 0x1

    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v23, "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    if-ne v1, v2, :cond_3

    .line 1453
    move-object v9, v0

    move/from16 v27, v3

    move/from16 v28, v4

    const/4 v4, 0x0

    goto :goto_7

    .line 1457
    :cond_3
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    .line 1458
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 1459
    move/from16 v24, v1

    .end local v1    # "count$iv$iv":I
    .local v24, "count$iv$iv":I
    const/16 v1, 0x10

    .local v1, "capacity$iv$iv$iv$iv":I
    const/16 v25, 0x0

    .line 1460
    .local v25, "$i$f$MutableVector":I
    move/from16 v26, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v26, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v27, v3

    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .local v27, "$i$f$visitAncestors-Y-YKmho":I
    new-array v3, v1, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v28, v4

    const/4 v4, 0x0

    .end local v4    # "mask$iv$iv":I
    .local v28, "mask$iv$iv":I
    invoke-direct {v2, v3, v4}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1458
    .end local v1    # "capacity$iv$iv$iv$iv":I
    .end local v25    # "$i$f$MutableVector":I
    nop

    .end local v26    # "$i$f$mutableVectorOf":I
    move-object v1, v2

    check-cast v1, Landroidx/compose/runtime/collection/MutableVector;

    goto :goto_6

    .line 1457
    .end local v24    # "count$iv$iv":I
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .local v1, "count$iv$iv":I
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_4
    move/from16 v24, v1

    move/from16 v27, v3

    move/from16 v28, v4

    const/4 v4, 0x0

    .end local v1    # "count$iv$iv":I
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v24    # "count$iv$iv":I
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_6
    move-object v15, v2

    .line 1461
    move-object v1, v9

    check-cast v1, Landroidx/compose/ui/Modifier$Node;

    .line 1462
    .local v1, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v1, :cond_6

    .line 1463
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_5

    invoke-virtual {v2, v1}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1464
    :cond_5
    const/4 v2, 0x0

    move-object v9, v2

    .line 1466
    :cond_6
    move-object v2, v15

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_7

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1469
    .end local v1    # "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_7
    move/from16 v1, v24

    goto :goto_7

    .line 1450
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v24    # "count$iv$iv":I
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .local v1, "count$iv$iv":I
    .local v2, "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_8
    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/4 v4, 0x0

    .line 1469
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_7
    nop

    .line 1449
    .end local v0    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1470
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v21

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto :goto_4

    .line 1472
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_9
    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    .line 1473
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .end local v19    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v20    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v21    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    const/4 v2, 0x1

    if-ne v1, v2, :cond_b

    .line 1475
    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto/16 :goto_2

    .line 1443
    .end local v1    # "count$iv$iv":I
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_a
    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    .line 1478
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :cond_b
    move-object v0, v15

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto/16 :goto_2

    .line 1480
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .local v0, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .local v1, "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_c
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    .line 1427
    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .end local v9    # "node$iv$iv":Ljava/lang/Object;
    .end local v13    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v15    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    nop

    .line 1437
    .end local v11    # "it$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv":I
    goto :goto_8

    .line 1436
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_d
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/16 v16, 0x0

    .line 1481
    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_8
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v7

    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    goto/16 :goto_1

    .line 1435
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_e
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/16 v16, 0x0

    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    goto :goto_9

    .line 1434
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_f
    move/from16 v17, v0

    move/from16 v18, v1

    move-object/from16 v23, v2

    move/from16 v27, v3

    move/from16 v28, v4

    const/16 v16, 0x0

    .line 1484
    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v4    # "mask$iv$iv":I
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    .restart local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v28    # "mask$iv$iv":I
    :goto_9
    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v8

    .line 1485
    if-eqz v8, :cond_10

    invoke-virtual {v8}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    goto :goto_a

    :cond_10
    move-object/from16 v9, v16

    :goto_a
    move-object v7, v9

    move/from16 v0, v17

    move/from16 v1, v18

    move-object/from16 v2, v23

    move/from16 v3, v27

    move/from16 v4, v28

    .end local v10    # "head$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1487
    .end local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v18    # "includeSelf$iv":Z
    .end local v23    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v27    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v28    # "mask$iv$iv":I
    .restart local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    :cond_11
    const/16 v16, 0x0

    .line 1427
    .end local v4    # "mask$iv$iv":I
    .end local v5    # "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v6    # "$i$f$visitAncestors":I
    .end local v7    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "layout$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    nop

    .line 363
    .end local v1    # "includeSelf$iv":Z
    .end local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "$i$f$visitAncestors-Y-YKmho":I
    return-object v16

    .line 1429
    .restart local v1    # "includeSelf$iv":Z
    .restart local v2    # "$this$visitAncestors_u2dY_u2dYKmho$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v4    # "mask$iv$iv":I
    .restart local v5    # "$this$visitAncestors$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v6    # "$i$f$visitAncestors":I
    :cond_12
    move/from16 v17, v0

    move/from16 v18, v1

    .end local v0    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v1    # "includeSelf$iv":Z
    .restart local v17    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v18    # "includeSelf$iv":Z
    const/4 v0, 0x0

    .line 1428
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v1, "visitAncestors called on an unattached node"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final synthetic traverseAncestorsIncludingSelf-QFhIj7k(Landroidx/compose/ui/node/DelegatableNode;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 35
    .param p1, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k"    # Landroidx/compose/ui/node/DelegatableNode;
    .param p2, "type"    # I
    .param p3, "onPreVisit"    # Lkotlin/jvm/functions/Function1;
    .param p4, "onVisit"    # Lkotlin/jvm/functions/Function0;
    .param p5, "onPostVisit"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Landroidx/compose/ui/node/DelegatableNode;",
            ">(",
            "Landroidx/compose/ui/node/DelegatableNode;",
            "I",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p5

    const/4 v2, 0x0

    .line 349
    .local v2, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object/from16 v3, p1

    .local v3, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v4, 0x0

    .line 1258
    .local v4, "$i$f$ancestors-64DMado":I
    const/4 v5, 0x0

    .line 1259
    .local v5, "result$iv":Ljava/lang/Object;
    move-object v6, v3

    .line 1260
    .local v6, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1262
    const/4 v7, 0x0

    .line 1260
    .local v7, "includeSelf$iv$iv":Z
    const/4 v8, 0x0

    .line 1264
    .local v8, "$i$f$visitAncestors-Y-YKmho":I
    move/from16 v9, p2

    .local v9, "mask$iv$iv$iv":I
    move-object v10, v6

    .local v10, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v11, 0x0

    .line 1265
    .local v11, "$i$f$visitAncestors":I
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v12

    if-eqz v12, :cond_32

    .line 1267
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1268
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 1269
    .local v13, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    const-string v14, "T"

    if-eqz v13, :cond_12

    .line 1270
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v16

    .line 1271
    .local v16, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v9

    if-eqz v17, :cond_10

    .line 1272
    :goto_1
    if-eqz v12, :cond_f

    .line 1273
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v9

    if-eqz v17, :cond_e

    .line 1274
    move-object/from16 v17, v12

    check-cast v17, Landroidx/compose/ui/Modifier$Node;

    .local v17, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v18, 0x0

    .line 1264
    .local v18, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v19, v17

    .local v19, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 1275
    .local v20, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v21, 0x0

    .line 1276
    .local v21, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v22, 0x0

    .local v22, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v22, v19

    move-object/from16 v15, v22

    .line 1277
    .end local v22    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v15, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v15, :cond_d

    .line 1278
    move/from16 v23, v2

    const/4 v2, 0x3

    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v23, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    invoke-static {v2, v14}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v2, v15, Ljava/lang/Object;

    if-eqz v2, :cond_1

    .line 1279
    move-object v2, v15

    .local v2, "it$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .line 1280
    .local v24, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv":I
    if-nez v5, :cond_0

    new-instance v25, Ljava/util/ArrayList;

    invoke-direct/range {v25 .. v25}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v5, v25

    check-cast v5, Ljava/util/List;

    .line 1281
    :cond_0
    move-object/from16 v25, v3

    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v25, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object v3, v5

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1282
    nop

    .line 1279
    .end local v2    # "it$iv":Ljava/lang/Object;
    .end local v24    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv":I
    move/from16 v29, v4

    goto/16 :goto_8

    .line 1283
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_1
    move-object/from16 v25, v3

    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object v2, v15

    check-cast v2, Landroidx/compose/ui/Modifier$Node;

    .local v2, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v3, 0x0

    .line 1284
    .local v3, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v24

    and-int v24, v24, p2

    if-eqz v24, :cond_2

    const/4 v2, 0x1

    goto :goto_3

    :cond_2
    const/4 v2, 0x0

    .line 1283
    .end local v2    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v3    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_3
    if-eqz v2, :cond_c

    instance-of v2, v15, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v2, :cond_c

    .line 1285
    const/4 v2, 0x0

    .line 1286
    .local v2, "count$iv$iv$iv":I
    move-object v3, v15

    check-cast v3, Landroidx/compose/ui/node/DelegatingNode;

    .local v3, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v24, 0x0

    .line 1287
    .local v24, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v3}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v26

    .line 1288
    .local v26, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v26, :cond_a

    .line 1289
    move-object/from16 v27, v3

    .end local v3    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .local v27, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    move-object/from16 v3, v26

    check-cast v3, Landroidx/compose/ui/Modifier$Node;

    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v28, 0x0

    .line 1290
    .local v28, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v29, v3

    .local v29, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1284
    .local v30, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v31

    and-int v31, v31, p2

    if-eqz v31, :cond_3

    const/16 v29, 0x1

    goto :goto_5

    :cond_3
    const/16 v29, 0x0

    .line 1290
    .end local v29    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v29, :cond_9

    .line 1291
    add-int/lit8 v2, v2, 0x1

    .line 1292
    move/from16 v29, v4

    const/4 v4, 0x1

    .end local v4    # "$i$f$ancestors-64DMado":I
    .local v29, "$i$f$ancestors-64DMado":I
    if-ne v2, v4, :cond_4

    .line 1293
    move-object v15, v3

    move-object/from16 v33, v5

    goto :goto_7

    .line 1297
    :cond_4
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v4, :cond_5

    const/4 v4, 0x0

    .line 1298
    .local v4, "$i$f$mutableVectorOf":I
    nop

    .line 1299
    move/from16 v30, v2

    .end local v2    # "count$iv$iv$iv":I
    .local v30, "count$iv$iv$iv":I
    const/16 v2, 0x10

    .local v2, "capacity$iv$iv$iv$iv$iv":I
    const/16 v31, 0x0

    .line 1300
    .local v31, "$i$f$MutableVector":I
    move/from16 v32, v4

    .end local v4    # "$i$f$mutableVectorOf":I
    .local v32, "$i$f$mutableVectorOf":I
    new-instance v4, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v33, v5

    .end local v5    # "result$iv":Ljava/lang/Object;
    .local v33, "result$iv":Ljava/lang/Object;
    new-array v5, v2, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v34, v2

    const/4 v2, 0x0

    .end local v2    # "capacity$iv$iv$iv$iv$iv":I
    .local v34, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v4, v5, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1298
    .end local v31    # "$i$f$MutableVector":I
    .end local v34    # "capacity$iv$iv$iv$iv$iv":I
    nop

    .end local v32    # "$i$f$mutableVectorOf":I
    move-object v2, v4

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    goto :goto_6

    .line 1297
    .end local v30    # "count$iv$iv$iv":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv$iv":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_5
    move/from16 v30, v2

    move-object/from16 v33, v5

    .end local v2    # "count$iv$iv$iv":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .restart local v30    # "count$iv$iv$iv":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    :goto_6
    move-object/from16 v21, v4

    .line 1301
    move-object v2, v15

    check-cast v2, Landroidx/compose/ui/Modifier$Node;

    .line 1302
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_7

    .line 1303
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v4, :cond_6

    invoke-virtual {v4, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1304
    :cond_6
    const/4 v4, 0x0

    move-object v15, v4

    .line 1306
    :cond_7
    move-object/from16 v4, v21

    check-cast v4, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v4, :cond_8

    invoke-virtual {v4, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1309
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move/from16 v2, v30

    goto :goto_7

    .line 1290
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v30    # "count$iv$iv$iv":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv$iv":I
    .local v4, "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_9
    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1309
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    :goto_7
    nop

    .line 1289
    .end local v3    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 1310
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v26

    move-object/from16 v3, v27

    move/from16 v4, v29

    move-object/from16 v5, v33

    goto :goto_4

    .line 1312
    .end local v27    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .local v3, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_a
    move-object/from16 v27, v3

    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1313
    .end local v3    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .end local v24    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v26    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    const/4 v4, 0x1

    if-ne v2, v4, :cond_b

    .line 1315
    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    move-object/from16 v5, v33

    goto/16 :goto_2

    .line 1313
    :cond_b
    move-object/from16 v5, v33

    goto :goto_8

    .line 1283
    .end local v2    # "count$iv$iv$iv":I
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_c
    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1318
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    move-object/from16 v5, v33

    .end local v33    # "result$iv":Ljava/lang/Object;
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :goto_8
    move-object/from16 v2, v21

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v2}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    goto/16 :goto_2

    .line 1320
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .local v2, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v3, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_d
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    move-object/from16 v33, v5

    .line 1264
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v5    # "result$iv":Ljava/lang/Object;
    .end local v15    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v19    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v21    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    .restart local v33    # "result$iv":Ljava/lang/Object;
    nop

    .line 1274
    .end local v17    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_9

    .line 1273
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .end local v33    # "result$iv":Ljava/lang/Object;
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    .restart local v5    # "result$iv":Ljava/lang/Object;
    :cond_e
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .line 1321
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    :goto_9
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    goto/16 :goto_1

    .line 1272
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_f
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    goto :goto_a

    .line 1271
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_10
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .line 1324
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    :goto_a
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 1325
    if-eqz v13, :cond_11

    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    goto :goto_b

    :cond_11
    const/4 v2, 0x0

    :goto_b
    move-object v12, v2

    move/from16 v2, v23

    move-object/from16 v3, v25

    move/from16 v4, v29

    .end local v16    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1327
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    .restart local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v4    # "$i$f$ancestors-64DMado":I
    :cond_12
    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v29, v4

    .line 1264
    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v3    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "$i$f$ancestors-64DMado":I
    .end local v9    # "mask$iv$iv$iv":I
    .end local v10    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v11    # "$i$f$visitAncestors":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v29    # "$i$f$ancestors-64DMado":I
    nop

    .line 1328
    .end local v6    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v7    # "includeSelf$iv$iv":Z
    .end local v8    # "$i$f$visitAncestors-Y-YKmho":I
    move-object v2, v5

    check-cast v2, Ljava/util/List;

    .line 349
    .end local v5    # "result$iv":Ljava/lang/Object;
    .end local v25    # "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "$i$f$ancestors-64DMado":I
    nop

    .line 350
    .local v2, "ancestors":Ljava/util/List;
    if-eqz v2, :cond_15

    move-object v3, v2

    .local v3, "$this$fastForEachReversed$iv":Ljava/util/List;
    const/4 v4, 0x0

    .line 1329
    .local v4, "$i$f$fastForEachReversed":I
    nop

    .line 1330
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    if-ltz v5, :cond_14

    :cond_13
    move v6, v5

    .local v6, "index$iv":I
    add-int/lit8 v5, v5, -0x1

    .line 1331
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 1332
    .local v7, "item$iv":Ljava/lang/Object;
    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1330
    .end local v7    # "item$iv":Ljava/lang/Object;
    if-gez v5, :cond_13

    .line 1334
    .end local v6    # "index$iv":I
    :cond_14
    nop

    .line 351
    .end local v3    # "$this$fastForEachReversed$iv":Ljava/util/List;
    .end local v4    # "$i$f$fastForEachReversed":I
    :cond_15
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    .local v3, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v4, 0x0

    .line 1335
    .local v4, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v5, 0x0

    .line 1336
    .local v5, "stack$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .local v6, "node$iv":Ljava/lang/Object;
    move-object v6, v3

    .line 1337
    :goto_c
    if-eqz v6, :cond_22

    .line 1338
    const/4 v7, 0x3

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v7, v6, Ljava/lang/Object;

    if-eqz v7, :cond_16

    .line 1339
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    goto/16 :goto_12

    .line 1340
    :cond_16
    move-object v7, v6

    check-cast v7, Landroidx/compose/ui/Modifier$Node;

    .local v7, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v8, 0x0

    .line 1341
    .local v8, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v7}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v9

    and-int v9, v9, p2

    if-eqz v9, :cond_17

    const/4 v7, 0x1

    goto :goto_d

    :cond_17
    const/4 v7, 0x0

    .line 1340
    .end local v7    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_d
    if-eqz v7, :cond_20

    instance-of v7, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v7, :cond_20

    .line 1342
    const/4 v7, 0x0

    .line 1343
    .local v7, "count$iv":I
    move-object v8, v6

    check-cast v8, Landroidx/compose/ui/node/DelegatingNode;

    .local v8, "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v9, 0x0

    .line 1344
    .local v9, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    .line 1345
    .local v10, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_e
    if-eqz v10, :cond_1f

    .line 1346
    move-object v11, v10

    check-cast v11, Landroidx/compose/ui/Modifier$Node;

    .local v11, "next$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v12, 0x0

    .line 1347
    .local v12, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    move-object v13, v11

    .local v13, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v15, 0x0

    .line 1341
    .local v15, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v13}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v16

    and-int v16, v16, p2

    if-eqz v16, :cond_18

    const/4 v13, 0x1

    goto :goto_f

    :cond_18
    const/4 v13, 0x0

    .line 1347
    .end local v13    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_f
    if-eqz v13, :cond_1d

    .line 1348
    add-int/lit8 v7, v7, 0x1

    .line 1349
    const/4 v13, 0x1

    if-ne v7, v13, :cond_19

    .line 1350
    move-object v6, v11

    move-object/from16 v17, v2

    move-object/from16 v18, v3

    goto :goto_11

    .line 1354
    :cond_19
    move-object v13, v5

    check-cast v13, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v13, :cond_1a

    const/4 v13, 0x0

    .line 1355
    .local v13, "$i$f$mutableVectorOf":I
    nop

    .line 1356
    const/16 v15, 0x10

    .local v15, "capacity$iv$iv$iv":I
    const/16 v16, 0x0

    .line 1357
    .local v16, "$i$f$MutableVector":I
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v17, v2

    .end local v2    # "ancestors":Ljava/util/List;
    .local v17, "ancestors":Ljava/util/List;
    new-array v2, v15, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v18, v3

    const/4 v3, 0x0

    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .local v18, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-direct {v0, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1355
    .end local v15    # "capacity$iv$iv$iv":I
    .end local v16    # "$i$f$MutableVector":I
    nop

    .end local v13    # "$i$f$mutableVectorOf":I
    move-object v2, v0

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object v13, v0

    goto :goto_10

    .line 1354
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1a
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_10
    move-object v5, v13

    .line 1358
    move-object v0, v6

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .line 1359
    .local v0, "theNode$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_1c

    .line 1360
    move-object v2, v5

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_1b

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1361
    :cond_1b
    const/4 v2, 0x0

    move-object v6, v2

    .line 1363
    :cond_1c
    move-object v2, v5

    check-cast v2, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v2, :cond_1e

    invoke-virtual {v2, v11}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_11

    .line 1347
    .end local v0    # "theNode$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1d
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 1366
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1e
    :goto_11
    nop

    .line 1346
    .end local v11    # "next$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v12    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    nop

    .line 1367
    invoke-virtual {v10}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v10

    move-object/from16 v0, p3

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto :goto_e

    .line 1369
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 1370
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v8    # "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v9    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v10    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v13, 0x1

    if-ne v7, v13, :cond_21

    .line 1372
    move-object/from16 v0, p3

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto/16 :goto_c

    .line 1340
    .end local v7    # "count$iv":I
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_20
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 1375
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "ancestors":Ljava/util/List;
    .restart local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_21
    :goto_12
    move-object v0, v5

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, p3

    move-object/from16 v2, v17

    move-object/from16 v3, v18

    goto/16 :goto_c

    .line 1377
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v18    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "ancestors":Ljava/util/List;
    .restart local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_22
    move-object/from16 v17, v2

    move-object/from16 v18, v3

    .line 352
    .end local v2    # "ancestors":Ljava/util/List;
    .end local v3    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v4    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v5    # "stack$iv":Ljava/lang/Object;
    .end local v6    # "node$iv":Ljava/lang/Object;
    .restart local v17    # "ancestors":Ljava/util/List;
    invoke-interface/range {p4 .. p4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 353
    invoke-interface/range {p1 .. p1}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1378
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1379
    .local v3, "stack$iv":Ljava/lang/Object;
    const/4 v4, 0x0

    .local v4, "node$iv":Ljava/lang/Object;
    move-object v4, v0

    .line 1380
    :goto_13
    if-eqz v4, :cond_2f

    .line 1381
    const/4 v7, 0x3

    invoke-static {v7, v14}, Lkotlin/jvm/internal/Intrinsics;->reifiedOperationMarker(ILjava/lang/String;)V

    instance-of v5, v4, Ljava/lang/Object;

    if-eqz v5, :cond_23

    .line 1382
    invoke-interface {v1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    const/4 v13, 0x1

    goto/16 :goto_19

    .line 1383
    :cond_23
    move-object v5, v4

    check-cast v5, Landroidx/compose/ui/Modifier$Node;

    .local v5, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v6, 0x0

    .line 1384
    .local v6, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v8

    and-int v8, v8, p2

    if-eqz v8, :cond_24

    const/4 v5, 0x1

    goto :goto_14

    :cond_24
    const/4 v5, 0x0

    .line 1383
    .end local v5    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v6    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_14
    if-eqz v5, :cond_2d

    instance-of v5, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v5, :cond_2d

    .line 1385
    const/4 v5, 0x0

    .line 1386
    .local v5, "count$iv":I
    move-object v6, v4

    check-cast v6, Landroidx/compose/ui/node/DelegatingNode;

    .local v6, "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v8, 0x0

    .line 1387
    .local v8, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    .line 1388
    .local v9, "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_15
    if-eqz v9, :cond_2c

    .line 1389
    move-object v10, v9

    check-cast v10, Landroidx/compose/ui/Modifier$Node;

    .local v10, "next$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v11, 0x0

    .line 1390
    .local v11, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    move-object v12, v10

    .local v12, "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v13, 0x0

    .line 1384
    .local v13, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v15

    and-int v15, v15, p2

    if-eqz v15, :cond_25

    const/4 v12, 0x1

    goto :goto_16

    :cond_25
    const/4 v12, 0x0

    .line 1390
    .end local v12    # "this_$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_16
    if-eqz v12, :cond_2a

    .line 1391
    add-int/lit8 v5, v5, 0x1

    .line 1392
    const/4 v13, 0x1

    if-ne v5, v13, :cond_26

    .line 1393
    move-object v4, v10

    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    goto :goto_18

    .line 1397
    :cond_26
    move-object v12, v3

    check-cast v12, Landroidx/compose/runtime/collection/MutableVector;

    if-nez v12, :cond_27

    const/4 v12, 0x0

    .line 1398
    .local v12, "$i$f$mutableVectorOf":I
    nop

    .line 1399
    const/16 v13, 0x10

    .local v13, "capacity$iv$iv$iv":I
    const/4 v15, 0x0

    .line 1400
    .local v15, "$i$f$MutableVector":I
    new-instance v7, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    new-array v0, v13, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v18, v2

    const/4 v2, 0x0

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    invoke-direct {v7, v0, v2}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1398
    .end local v13    # "capacity$iv$iv$iv":I
    .end local v15    # "$i$f$MutableVector":I
    nop

    .end local v12    # "$i$f$mutableVectorOf":I
    move-object v0, v7

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object v12, v7

    goto :goto_17

    .line 1397
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_27
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_17
    move-object v3, v12

    .line 1401
    move-object v0, v4

    check-cast v0, Landroidx/compose/ui/Modifier$Node;

    .line 1402
    .local v0, "theNode$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_29

    .line 1403
    move-object v7, v3

    check-cast v7, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v7, :cond_28

    invoke-virtual {v7, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1404
    :cond_28
    const/4 v4, 0x0

    .line 1406
    :cond_29
    move-object v7, v3

    check-cast v7, Landroidx/compose/runtime/collection/MutableVector;

    if-eqz v7, :cond_2b

    invoke-virtual {v7, v10}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_18

    .line 1390
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2a
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    .line 1409
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2b
    :goto_18
    nop

    .line 1389
    .end local v10    # "next$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v11    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv":I
    nop

    .line 1410
    invoke-virtual {v9}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v9

    move-object/from16 v0, v16

    move/from16 v2, v18

    const/4 v7, 0x3

    goto :goto_15

    .line 1412
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2c
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    .line 1413
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v6    # "this_$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v8    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v9    # "node$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v13, 0x1

    if-ne v5, v13, :cond_2e

    .line 1415
    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_13

    .line 1383
    .end local v5    # "count$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2d
    move-object/from16 v16, v0

    move/from16 v18, v2

    const/4 v2, 0x0

    const/4 v13, 0x1

    .line 1418
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2e
    :goto_19
    move-object v0, v3

    check-cast v0, Landroidx/compose/runtime/collection/MutableVector;

    invoke-static {v0}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_13

    .line 1420
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_2f
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 354
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv":Ljava/lang/Object;
    .end local v4    # "node$iv":Ljava/lang/Object;
    if-eqz v17, :cond_31

    move-object/from16 v0, v17

    .local v0, "$this$fastForEach$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1421
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1422
    const/4 v3, 0x0

    .local v3, "index$iv":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    :goto_1a
    if-ge v3, v4, :cond_30

    .line 1423
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    .line 1424
    .local v5, "item$iv":Ljava/lang/Object;
    invoke-interface {v1, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1422
    .end local v5    # "item$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_1a

    .line 1426
    .end local v3    # "index$iv":I
    :cond_30
    nop

    .line 355
    .end local v0    # "$this$fastForEach$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :cond_31
    return-void

    .line 1266
    .end local v17    # "ancestors":Ljava/util/List;
    .end local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v2, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v3, "$this$ancestors_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v4, "$i$f$ancestors-64DMado":I
    .local v5, "result$iv":Ljava/lang/Object;
    .local v6, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v7, "includeSelf$iv$iv":Z
    .local v8, "$i$f$visitAncestors-Y-YKmho":I
    .local v9, "mask$iv$iv$iv":I
    .local v10, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v11, "$i$f$visitAncestors":I
    :cond_32
    move/from16 v23, v2

    .end local v2    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .restart local v23    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    const/4 v0, 0x0

    .line 1265
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string/jumbo v2, "visitAncestors called on an unattached node"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 6
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;

    .line 388
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getKey-ZmokQxo(Landroid/view/KeyEvent;)J

    move-result-wide v0

    .line 389
    .local v0, "keyCode":J
    invoke-static {p1}, Landroidx/compose/ui/input/key/KeyEvent_androidKt;->getType-ZmokQxo(Landroid/view/KeyEvent;)I

    move-result v2

    .line 390
    sget-object v3, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyDown-CS__XNY()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    .line 392
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    if-nez v2, :cond_0

    new-instance v2, Landroidx/collection/MutableLongSet;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Landroidx/collection/MutableLongSet;-><init>(I)V

    .line 393
    move-object v3, v2

    .line 1527
    .local v3, "it":Landroidx/collection/MutableLongSet;
    const/4 v5, 0x0

    .line 393
    .local v5, "$i$a$-also-FocusOwnerImpl$validateKeyEvent$keysCurrentlyDown$1":I
    iput-object v3, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    .line 392
    .end local v3    # "it":Landroidx/collection/MutableLongSet;
    .end local v5    # "$i$a$-also-FocusOwnerImpl$validateKeyEvent$keysCurrentlyDown$1":I
    :cond_0
    nop

    .line 394
    .local v2, "keysCurrentlyDown":Landroidx/collection/MutableLongSet;
    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongSet;->plusAssign(J)V

    .end local v2    # "keysCurrentlyDown":Landroidx/collection/MutableLongSet;
    goto :goto_1

    .line 397
    :cond_1
    sget-object v3, Landroidx/compose/ui/input/key/KeyEventType;->Companion:Landroidx/compose/ui/input/key/KeyEventType$Companion;

    invoke-virtual {v3}, Landroidx/compose/ui/input/key/KeyEventType$Companion;->getKeyUp-CS__XNY()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/input/key/KeyEventType;->equals-impl0(II)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 398
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongSet;->contains(J)Z

    move-result v2

    if-ne v2, v4, :cond_2

    move v2, v4

    goto :goto_0

    :cond_2
    move v2, v3

    :goto_0
    if-nez v2, :cond_3

    .line 400
    return v3

    .line 402
    :cond_3
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->keysCurrentlyDown:Landroidx/collection/MutableLongSet;

    if-eqz v2, :cond_4

    invoke-virtual {v2, v0, v1}, Landroidx/collection/MutableLongSet;->remove(J)Z

    .line 406
    :cond_4
    :goto_1
    return v4
.end method


# virtual methods
.method public clearFocus(Z)V
    .locals 2
    .param p1, "force"    # Z

    .line 163
    nop

    .line 164
    nop

    .line 165
    nop

    .line 166
    nop

    .line 167
    sget-object v0, Landroidx/compose/ui/focus/FocusDirection;->Companion:Landroidx/compose/ui/focus/FocusDirection$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusDirection$Companion;->getExit-dhqQ-8s()I

    move-result v0

    .line 163
    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1, v1, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus-I7lrPNg(ZZZI)Z

    .line 169
    return-void
.end method

.method public clearFocus-I7lrPNg(ZZZI)Z
    .locals 7
    .param p1, "force"    # Z
    .param p2, "refreshFocusEvents"    # Z
    .param p3, "clearOwnerFocus"    # Z
    .param p4, "focusDirection"    # I

    .line 177
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    .local v0, "this_$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    sget-object v1, Landroidx/compose/ui/focus/FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1;->INSTANCE:Landroidx/compose/ui/focus/FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$1;

    check-cast v1, Lkotlin/jvm/functions/Function0;

    .local v1, "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    const/4 v2, 0x0

    .line 434
    .local v2, "$i$f$withNewTransaction":I
    nop

    .line 435
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getOngoingTransaction$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$cancelTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 436
    :cond_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 437
    if-eqz v1, :cond_1

    move-object v3, v1

    .line 438
    .local v3, "it$iv":Lkotlin/jvm/functions/Function0;
    const/4 v4, 0x0

    .line 437
    .local v4, "$i$a$-let-FocusTransactionManager$withNewTransaction$1$iv":I
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getCancellationListener$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Landroidx/compose/runtime/collection/MutableVector;

    move-result-object v5

    .local v5, "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    const/4 v6, 0x0

    .line 439
    .local v6, "$i$f$plusAssign":I
    invoke-virtual {v5, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 440
    nop

    .line 437
    .end local v5    # "this_$iv$iv":Landroidx/compose/runtime/collection/MutableVector;
    .end local v6    # "$i$f$plusAssign":I
    nop

    .line 441
    .end local v3    # "it$iv":Lkotlin/jvm/functions/Function0;
    .end local v4    # "$i$a$-let-FocusTransactionManager$withNewTransaction$1$iv":I
    :cond_1
    const/4 v3, 0x0

    .line 180
    .local v3, "$i$a$-withNewTransaction-FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$2":I
    if-nez p1, :cond_2

    .line 182
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v4, p4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->performCustomClearFocus-Mxy_nc0(Landroidx/compose/ui/focus/FocusTargetNode;I)Landroidx/compose/ui/focus/CustomDestinationResult;

    move-result-object v4

    sget-object v5, Landroidx/compose/ui/focus/FocusOwnerImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v4}, Landroidx/compose/ui/focus/CustomDestinationResult;->ordinal()I

    move-result v4

    aget v4, v5, v4

    packed-switch v4, :pswitch_data_0

    goto :goto_0

    .line 183
    :pswitch_0
    const/4 v4, 0x0

    goto :goto_1

    .line 187
    :cond_2
    :goto_0
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v4, p1, p2}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 441
    .end local v3    # "$i$a$-withNewTransaction-FocusOwnerImpl$clearFocus$clearedFocusSuccessfully$2":I
    :goto_1
    nop

    .line 443
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 444
    nop

    .line 177
    .end local v0    # "this_$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .end local v1    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v2    # "$i$f$withNewTransaction":I
    nop

    .line 190
    .local v4, "clearedFocusSuccessfully":Z
    if-eqz v4, :cond_3

    if-eqz p3, :cond_3

    .line 191
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onClearFocusForOwner:Lkotlin/jvm/functions/Function0;

    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 193
    :cond_3
    return v4

    .line 443
    .end local v4    # "clearedFocusSuccessfully":Z
    .restart local v0    # "this_$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .restart local v1    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "$i$f$withNewTransaction":I
    :catchall_0
    move-exception v3

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw v3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public dispatchInterceptedSoftKeyboardEvent-ZmokQxo(Landroid/view/KeyEvent;)Z
    .locals 39
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;

    .line 282
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    move-result v2

    if-nez v2, :cond_4c

    .line 287
    nop

    .line 286
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v2}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v2

    .line 287
    const-string/jumbo v3, "visitAncestors called on an unattached node"

    const/high16 v4, 0x20000

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_13

    .line 286
    check-cast v2, Landroidx/compose/ui/node/DelegatableNode;

    .line 287
    const/4 v8, 0x0

    .line 762
    .local v8, "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v8

    .line 287
    .end local v8    # "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    nop

    .local v8, "type$iv":I
    move-object/from16 v9, p0

    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v9, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v10, 0x0

    .line 763
    .local v10, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v11, 0x1

    .local v11, "includeSelf$iv$iv":Z
    move-object v12, v2

    .local v12, "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v13, 0x0

    .line 764
    .local v13, "$i$f$visitAncestors-Y-YKmho":I
    move v14, v8

    .local v14, "mask$iv$iv$iv":I
    move-object v15, v12

    .local v15, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 765
    .local v16, "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    if-eqz v17, :cond_12

    .line 767
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    .line 768
    .local v17, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 769
    .local v18, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v18, :cond_11

    .line 770
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    .line 771
    .local v19, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_f

    .line 772
    :goto_1
    if-eqz v17, :cond_e

    .line 773
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_d

    .line 774
    move-object/from16 v20, v17

    .local v20, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 764
    .local v21, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 775
    .local v23, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v24, 0x0

    .line 776
    .local v24, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .local v25, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v25, v22

    move-object/from16 v38, v25

    move/from16 v25, v4

    move-object/from16 v4, v38

    .line 777
    .end local v25    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v4, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v4, :cond_c

    .line 778
    instance-of v5, v4, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v5, :cond_0

    .line 779
    move-object v5, v4

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 780
    .local v26, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    goto/16 :goto_c

    .line 781
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    :cond_0
    move-object v5, v4

    .local v5, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 782
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v8

    if-eqz v27, :cond_1

    move v5, v7

    goto :goto_3

    :cond_1
    move v5, v6

    .line 781
    .end local v5    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_3
    if-eqz v5, :cond_a

    instance-of v5, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v5, :cond_a

    .line 783
    const/4 v5, 0x0

    .line 784
    .local v5, "count$iv$iv$iv":I
    move-object/from16 v26, v4

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 785
    .local v27, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 786
    .local v28, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v28, :cond_9

    .line 787
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 788
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v32, 0x0

    .line 782
    .local v32, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v33

    and-int v33, v33, v8

    if-eqz v33, :cond_2

    move/from16 v31, v7

    goto :goto_5

    :cond_2
    move/from16 v31, v6

    .line 788
    .end local v31    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v32    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v31, :cond_8

    .line 789
    add-int/lit8 v5, v5, 0x1

    .line 790
    if-ne v5, v7, :cond_3

    .line 791
    move-object/from16 v4, v29

    move-object/from16 v34, v2

    move-object/from16 v7, v29

    goto :goto_8

    .line 795
    :cond_3
    if-nez v24, :cond_4

    const/16 v31, 0x0

    .line 796
    .local v31, "$i$f$mutableVectorOf":I
    nop

    .line 797
    const/16 v7, 0x10

    .local v7, "capacity$iv$iv$iv$iv$iv":I
    const/16 v33, 0x0

    .line 798
    .local v33, "$i$f$MutableVector":I
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v34, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    new-array v2, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v0, v2, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 796
    .end local v7    # "capacity$iv$iv$iv$iv$iv":I
    .end local v33    # "$i$f$MutableVector":I
    goto :goto_6

    .line 795
    .end local v31    # "$i$f$mutableVectorOf":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_4
    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v0, v24

    :goto_6
    nop

    .line 799
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v0, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v2, v4

    .line 800
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_6

    .line 801
    if-eqz v0, :cond_5

    invoke-virtual {v0, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 802
    :cond_5
    const/4 v4, 0x0

    .line 804
    :cond_6
    if-eqz v0, :cond_7

    move-object/from16 v7, v29

    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v7, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_7
    move-object/from16 v7, v29

    .line 807
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_7
    move-object/from16 v24, v0

    goto :goto_8

    .line 788
    .end local v0    # "stack$iv$iv$iv":Ljava/lang/Object;
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move-object/from16 v34, v2

    move-object/from16 v7, v29

    .line 807
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_8
    nop

    .line 787
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 808
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto :goto_4

    .line 810
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_9
    move-object/from16 v34, v2

    .line 811
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v0, 0x1

    if-ne v5, v0, :cond_b

    .line 813
    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 781
    .end local v5    # "count$iv$iv$iv":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_a
    move-object/from16 v34, v2

    .line 816
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_b
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 818
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_c
    move-object/from16 v34, v2

    .line 764
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 774
    .end local v20    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_9

    .line 773
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_d
    move-object/from16 v34, v2

    move/from16 v25, v4

    .line 819
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_9
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v4, v25

    move-object/from16 v2, v34

    goto/16 :goto_1

    .line 772
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_e
    move-object/from16 v34, v2

    move/from16 v25, v4

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    goto :goto_a

    .line 771
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_f
    move-object/from16 v34, v2

    move/from16 v25, v4

    .line 822
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_a
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 823
    if-eqz v18, :cond_10

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_b

    :cond_10
    const/4 v0, 0x0

    :goto_b
    move-object/from16 v17, v0

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v4, v25

    move-object/from16 v2, v34

    .end local v19    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 825
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_11
    move-object/from16 v34, v2

    move/from16 v25, v4

    .line 764
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "mask$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 826
    .end local v11    # "includeSelf$iv$iv":Z
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v5, 0x0

    .end local v8    # "type$iv":I
    .end local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_c
    check-cast v5, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    goto :goto_d

    .line 766
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v8    # "type$iv":I
    .restart local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v11    # "includeSelf$iv$iv":Z
    .restart local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v13    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v14    # "mask$iv$iv$iv":I
    .restart local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v16    # "$i$f$visitAncestors":I
    :cond_12
    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v0, 0x0

    .line 765
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 287
    .end local v8    # "type$iv":I
    .end local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v11    # "includeSelf$iv$iv":Z
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v14    # "mask$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_13
    move/from16 v25, v4

    const/4 v5, 0x0

    .line 286
    :goto_d
    nop

    .line 289
    .local v5, "focusedSoftKeyboardInterceptionNode":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    if-eqz v5, :cond_4b

    move-object v0, v5

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    .line 290
    const/4 v2, 0x0

    .line 827
    .local v2, "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v2

    .line 289
    .end local v2    # "$i$f$getSoftKeyboardKeyInput-OLwlOKw":I
    nop

    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v4, p0

    .local v2, "type$iv":I
    .local v4, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v7, 0x0

    .line 828
    .local v7, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object v8, v0

    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v9, 0x0

    .line 829
    .local v9, "$i$f$ancestors-64DMado":I
    const/4 v10, 0x0

    .line 830
    .local v10, "result$iv$iv":Ljava/lang/Object;
    move-object v11, v8

    .line 831
    .local v11, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 833
    const/4 v12, 0x0

    .line 831
    .local v12, "includeSelf$iv$iv$iv":Z
    const/4 v13, 0x0

    .line 835
    .restart local v13    # "$i$f$visitAncestors-Y-YKmho":I
    move v14, v2

    .local v14, "mask$iv$iv$iv$iv":I
    move-object v15, v11

    .local v15, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 836
    .restart local v16    # "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    if-eqz v17, :cond_4a

    .line 838
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    .line 839
    .local v3, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 840
    .local v17, "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_e
    if-eqz v17, :cond_26

    .line 841
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    .line 842
    .local v18, "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_24

    .line 843
    :goto_f
    if-eqz v3, :cond_23

    .line 844
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_22

    .line 845
    move-object/from16 v19, v3

    .local v19, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 835
    .local v20, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    move-object/from16 v21, v19

    .local v21, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 846
    .local v22, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v23, 0x0

    .line 847
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .local v24, "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v21

    move-object/from16 v6, v24

    .line 848
    .end local v24    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v6, "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_10
    if-eqz v6, :cond_21

    .line 849
    move-object/from16 v25, v0

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v25, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    instance-of v0, v6, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v0, :cond_15

    .line 850
    move-object v0, v6

    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 851
    .local v26, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    if-nez v10, :cond_14

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v10, v27

    check-cast v10, Ljava/util/List;

    .line 852
    :cond_14
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 853
    nop

    .line 850
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    move/from16 v31, v2

    move-object/from16 v36, v3

    goto/16 :goto_17

    .line 854
    :cond_15
    move-object v0, v6

    .local v0, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 855
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v2

    if-eqz v27, :cond_16

    const/4 v0, 0x1

    goto :goto_11

    :cond_16
    const/4 v0, 0x0

    .line 854
    .end local v0    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_11
    if-eqz v0, :cond_1f

    instance-of v0, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v0, :cond_1f

    .line 856
    const/4 v0, 0x0

    .line 857
    .local v0, "count$iv$iv$iv$iv":I
    move-object/from16 v26, v6

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 858
    .restart local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 859
    .local v28, "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_12
    if-eqz v28, :cond_1e

    .line 860
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 861
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v33, 0x0

    .line 855
    .local v33, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v2

    if-eqz v34, :cond_17

    const/16 v31, 0x1

    goto :goto_13

    :cond_17
    const/16 v31, 0x0

    .line 861
    .end local v31    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_13
    if-eqz v31, :cond_1d

    .line 862
    add-int/lit8 v0, v0, 0x1

    .line 863
    move/from16 v31, v2

    const/4 v2, 0x1

    .end local v2    # "type$iv":I
    .local v31, "type$iv":I
    if-ne v0, v2, :cond_18

    .line 864
    move-object/from16 v6, v29

    move-object/from16 v36, v3

    move-object/from16 v3, v29

    goto :goto_16

    .line 868
    :cond_18
    if-nez v23, :cond_19

    const/4 v2, 0x0

    .line 869
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 870
    move/from16 v33, v0

    .end local v0    # "count$iv$iv$iv$iv":I
    .local v33, "count$iv$iv$iv$iv":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 871
    .local v34, "$i$f$MutableVector":I
    move/from16 v35, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v35, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v36, v3

    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v36, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v37, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv$iv":I
    .local v37, "capacity$iv$iv$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 869
    .end local v34    # "$i$f$MutableVector":I
    .end local v37    # "capacity$iv$iv$iv$iv$iv$iv":I
    goto :goto_14

    .line 868
    .end local v33    # "count$iv$iv$iv$iv":I
    .end local v35    # "$i$f$mutableVectorOf":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "count$iv$iv$iv$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_19
    move/from16 v33, v0

    move-object/from16 v36, v3

    .end local v0    # "count$iv$iv$iv$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "count$iv$iv$iv$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    move-object/from16 v2, v23

    :goto_14
    nop

    .line 872
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    move-object v0, v6

    .line 873
    .local v0, "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_1b

    .line 874
    if-eqz v2, :cond_1a

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 875
    :cond_1a
    const/4 v3, 0x0

    move-object v6, v3

    .line 877
    :cond_1b
    if-eqz v2, :cond_1c

    move-object/from16 v3, v29

    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1c
    move-object/from16 v3, v29

    .line 880
    .end local v0    # "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_15
    move-object/from16 v23, v2

    move/from16 v0, v33

    goto :goto_16

    .line 861
    .end local v31    # "type$iv":I
    .end local v33    # "count$iv$iv$iv$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "count$iv$iv$iv$iv":I
    .local v2, "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1d
    move/from16 v31, v2

    move-object/from16 v36, v3

    move-object/from16 v3, v29

    .line 880
    .end local v2    # "type$iv":I
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_16
    nop

    .line 860
    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    nop

    .line 881
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto :goto_12

    .line 883
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1e
    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 884
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x1

    if-ne v0, v2, :cond_20

    .line 886
    move-object/from16 v0, v25

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto/16 :goto_10

    .line 854
    .end local v0    # "count$iv$iv$iv$iv":I
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 889
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_20
    :goto_17
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, v25

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto/16 :goto_10

    .line 891
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_21
    move-object/from16 v25, v0

    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 835
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v6    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v21    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    nop

    .line 845
    .end local v19    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    goto :goto_18

    .line 844
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_22
    move-object/from16 v25, v0

    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 892
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_18
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move-object/from16 v0, v25

    move/from16 v2, v31

    const/4 v6, 0x0

    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_f

    .line 843
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_23
    move-object/from16 v25, v0

    move/from16 v31, v2

    move-object/from16 v36, v3

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto :goto_19

    .line 842
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_24
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 895
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    :goto_19
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 896
    if-eqz v17, :cond_25

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_1a

    :cond_25
    const/4 v0, 0x0

    :goto_1a
    move-object v3, v0

    move-object/from16 v0, v25

    move/from16 v2, v31

    const/4 v6, 0x0

    .end local v18    # "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_e

    .line 898
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_26
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 835
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "mask$iv$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    nop

    .line 899
    .end local v11    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "includeSelf$iv$iv$iv":Z
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    nop

    .line 828
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    nop

    .line 900
    .local v10, "ancestors$iv":Ljava/util/List;
    if-eqz v10, :cond_2a

    move-object v0, v10

    .local v0, "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 901
    .local v2, "$i$f$fastForEachReversed":I
    nop

    .line 902
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_29

    :cond_27
    move v6, v3

    .local v6, "index$iv$iv":I
    add-int/lit8 v3, v3, -0x1

    .line 903
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 904
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v11, 0x0

    .line 291
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$2":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v12

    if-eqz v12, :cond_28

    const/16 v32, 0x1

    return v32

    .line 904
    .end local v9    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$2":I
    :cond_28
    nop

    .line 902
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    if-gez v3, :cond_27

    .line 906
    .end local v6    # "index$iv$iv":I
    :cond_29
    nop

    .line 907
    .end local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEachReversed":I
    :cond_2a
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 908
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 909
    .local v3, "stack$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .local v6, "node$iv$iv":Ljava/lang/Object;
    move-object v6, v0

    .line 910
    :goto_1b
    if-eqz v6, :cond_38

    .line 911
    instance-of v8, v6, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v8, :cond_2c

    .line 912
    move-object v8, v6

    check-cast v8, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v9, 0x0

    .line 291
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$2":I
    invoke-interface {v8, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onPreInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v11

    if-eqz v11, :cond_2b

    const/16 v32, 0x1

    return v32

    .line 912
    .end local v8    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$2":I
    :cond_2b
    move-object/from16 v16, v0

    move/from16 v18, v2

    goto/16 :goto_21

    .line 913
    :cond_2c
    move-object v8, v6

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 855
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_2d

    const/4 v8, 0x1

    goto :goto_1c

    :cond_2d
    const/4 v8, 0x0

    .line 913
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1c
    if-eqz v8, :cond_37

    instance-of v8, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_37

    .line 918
    const/4 v8, 0x0

    .line 919
    .local v8, "count$iv$iv":I
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 920
    .local v11, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 921
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_1d
    if-eqz v12, :cond_35

    .line 922
    move-object v13, v12

    .local v13, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 923
    .local v14, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 855
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_2e

    const/4 v15, 0x1

    goto :goto_1e

    :cond_2e
    const/4 v15, 0x0

    .line 923
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1e
    if-eqz v15, :cond_33

    .line 924
    add-int/lit8 v8, v8, 0x1

    .line 925
    const/4 v15, 0x1

    if-ne v8, v15, :cond_2f

    .line 926
    move-object v6, v13

    move-object/from16 v16, v0

    move/from16 v18, v2

    goto :goto_20

    .line 930
    :cond_2f
    if-nez v3, :cond_30

    const/4 v15, 0x0

    .line 931
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 932
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 933
    .local v17, "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .local v19, "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .local v20, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 931
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_1f

    .line 930
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_30
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_1f
    move-object v3, v2

    .line 934
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v6

    .line 935
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_32

    .line 936
    if-eqz v3, :cond_31

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 937
    :cond_31
    const/4 v2, 0x0

    move-object v6, v2

    .line 939
    :cond_32
    if-eqz v3, :cond_34

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 923
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_33
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 942
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_34
    :goto_20
    nop

    .line 922
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 943
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto :goto_1d

    .line 945
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_35
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 946
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_36

    .line 948
    move-object/from16 v0, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_1b

    .line 946
    :cond_36
    move-object/from16 v3, v19

    goto :goto_21

    .line 913
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_37
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 951
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_21
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_1b

    .line 953
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_38
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 954
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v6    # "node$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 292
    .local v0, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$3":I
    nop

    .line 954
    .end local v0    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$3":I
    nop

    .line 955
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 956
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 957
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .restart local v6    # "node$iv$iv":Ljava/lang/Object;
    move-object v6, v0

    .line 958
    :goto_22
    if-eqz v6, :cond_46

    .line 959
    instance-of v8, v6, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    if-eqz v8, :cond_3a

    .line 960
    move-object v8, v6

    check-cast v8, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v9, 0x0

    .line 293
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$4":I
    invoke-interface {v8, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v11

    if-eqz v11, :cond_39

    const/16 v32, 0x1

    return v32

    .line 960
    .end local v8    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$4":I
    :cond_39
    move-object/from16 v16, v0

    move/from16 v18, v2

    goto/16 :goto_28

    .line 961
    :cond_3a
    move-object v8, v6

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 855
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_3b

    const/4 v8, 0x1

    goto :goto_23

    :cond_3b
    const/4 v8, 0x0

    .line 961
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_23
    if-eqz v8, :cond_45

    instance-of v8, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_45

    .line 966
    const/4 v8, 0x0

    .line 967
    .local v8, "count$iv$iv":I
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 968
    .restart local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 969
    .restart local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_24
    if-eqz v12, :cond_43

    .line 970
    move-object v13, v12

    .restart local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 971
    .restart local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 855
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_3c

    const/4 v15, 0x1

    goto :goto_25

    :cond_3c
    const/4 v15, 0x0

    .line 971
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_25
    if-eqz v15, :cond_41

    .line 972
    add-int/lit8 v8, v8, 0x1

    .line 973
    const/4 v15, 0x1

    if-ne v8, v15, :cond_3d

    .line 974
    move-object v6, v13

    move-object/from16 v16, v0

    move/from16 v18, v2

    goto :goto_27

    .line 978
    :cond_3d
    if-nez v3, :cond_3e

    const/4 v15, 0x0

    .line 979
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 980
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 981
    .restart local v17    # "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .restart local v20    # "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 979
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_26

    .line 978
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_3e
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_26
    move-object v3, v2

    .line 982
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v6

    .line 983
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_40

    .line 984
    if-eqz v3, :cond_3f

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 985
    :cond_3f
    const/4 v2, 0x0

    move-object v6, v2

    .line 987
    :cond_40
    if-eqz v3, :cond_42

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_27

    .line 971
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_41
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 990
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_42
    :goto_27
    nop

    .line 970
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 991
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto :goto_24

    .line 993
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_43
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 994
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_44

    .line 996
    move-object/from16 v0, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_22

    .line 994
    :cond_44
    move-object/from16 v3, v19

    goto :goto_28

    .line 961
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_45
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 999
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_28
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_22

    .line 1001
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_46
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1002
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v6    # "node$iv$iv":Ljava/lang/Object;
    if-eqz v10, :cond_49

    move-object v0, v10

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1003
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1004
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    :goto_29
    if-ge v3, v6, :cond_48

    .line 1005
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1006
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    const/4 v11, 0x0

    .line 293
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$4":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;->onInterceptKeyBeforeSoftKeyboard-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v12

    if-eqz v12, :cond_47

    const/16 v32, 0x1

    return v32

    :cond_47
    const/16 v32, 0x1

    .line 1006
    .end local v9    # "it":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$4":I
    nop

    .line 1004
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_29

    .line 1008
    .end local v3    # "index$iv$iv":I
    :cond_48
    nop

    .line 1009
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :cond_49
    nop

    .end local v4    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    goto :goto_2a

    .line 837
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "type$iv":I
    .restart local v4    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v9, "$i$f$ancestors-64DMado":I
    .local v10, "result$iv$iv":Ljava/lang/Object;
    .local v11, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v12, "includeSelf$iv$iv$iv":Z
    .local v13, "$i$f$visitAncestors-Y-YKmho":I
    .local v14, "mask$iv$iv$iv$iv":I
    .local v15, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v16, "$i$f$visitAncestors":I
    :cond_4a
    move-object/from16 v25, v0

    move/from16 v31, v2

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    const/4 v0, 0x0

    .line 836
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 295
    .end local v4    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    .end local v11    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "includeSelf$iv$iv$iv":Z
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v14    # "mask$iv$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    :cond_4b
    :goto_2a
    const/16 v24, 0x0

    return v24

    .line 282
    .end local v5    # "focusedSoftKeyboardInterceptionNode":Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;
    :cond_4c
    const/4 v0, 0x0

    .line 283
    .local v0, "$i$a$-check-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$1":I
    nop

    .line 282
    .end local v0    # "$i$a$-check-FocusOwnerImpl$dispatchInterceptedSoftKeyboardEvent$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Dispatching intercepted soft keyboard event while focus system is invalidated."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispatchKeyEvent-YhN2O0w(Landroid/view/KeyEvent;Lkotlin/jvm/functions/Function0;)Z
    .locals 40
    .param p1, "keyEvent"    # Landroid/view/KeyEvent;
    .param p2, "onFocusedItem"    # Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/KeyEvent;",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    .line 260
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    move-result v2

    if-nez v2, :cond_65

    .line 264
    invoke-direct/range {p0 .. p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->validateKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    .line 266
    :cond_0
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v2}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v2

    .line 267
    .local v2, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const-string/jumbo v4, "visitAncestors called on an unattached node"

    const/16 v5, 0x2000

    const/4 v7, 0x1

    if-eqz v2, :cond_2

    move-object v8, v2

    check-cast v8, Landroidx/compose/ui/node/DelegatableNode;

    invoke-direct {v0, v8}, Landroidx/compose/ui/focus/FocusOwnerImpl;->lastLocalKeyInputNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    if-nez v8, :cond_1

    goto :goto_0

    :cond_1
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move/from16 v26, v5

    goto/16 :goto_1d

    .line 268
    :cond_2
    :goto_0
    if-eqz v2, :cond_16

    move-object v8, v2

    check-cast v8, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v9, 0x0

    .line 445
    .local v9, "$i$f$getKeyInput-OLwlOKw":I
    invoke-static {v5}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v9

    .line 268
    .end local v9    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v8, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v9, "type$iv":I
    move-object/from16 v10, p0

    .local v10, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v11, 0x0

    .line 446
    .local v11, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v12, 0x1

    .local v12, "includeSelf$iv$iv":Z
    move-object v13, v8

    .local v13, "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v14, 0x0

    .line 447
    .local v14, "$i$f$visitAncestors-Y-YKmho":I
    move v15, v9

    .local v15, "mask$iv$iv$iv":I
    move-object/from16 v16, v13

    .local v16, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v17, 0x0

    .line 448
    .local v17, "$i$f$visitAncestors":I
    invoke-interface/range {v16 .. v16}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v18

    if-eqz v18, :cond_15

    .line 450
    invoke-interface/range {v16 .. v16}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    .line 451
    .local v18, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v19

    .line 452
    .local v19, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_1
    if-eqz v19, :cond_14

    .line 453
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v20

    .line 454
    .local v20, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v21

    and-int v21, v21, v15

    if-eqz v21, :cond_12

    .line 455
    :goto_2
    if-eqz v18, :cond_11

    .line 456
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v21

    and-int v21, v21, v15

    if-eqz v21, :cond_10

    .line 457
    move-object/from16 v21, v18

    .local v21, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 447
    .local v22, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v23, v21

    .local v23, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v24, 0x0

    .line 458
    .local v24, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v25, 0x0

    .line 459
    .local v25, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .local v26, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v26, v23

    move-object/from16 v39, v26

    move/from16 v26, v5

    move-object/from16 v5, v39

    .line 460
    .end local v26    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v5, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_3
    if-eqz v5, :cond_f

    .line 461
    instance-of v6, v5, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v6, :cond_3

    .line 462
    move-object v6, v5

    .local v6, "it$iv":Ljava/lang/Object;
    const/16 v27, 0x0

    .line 463
    .local v27, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    goto/16 :goto_d

    .line 464
    .end local v6    # "it$iv":Ljava/lang/Object;
    .end local v27    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    :cond_3
    move-object v6, v5

    .local v6, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v27, 0x0

    .line 465
    .local v27, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v28

    and-int v28, v28, v9

    if-eqz v28, :cond_4

    move v6, v7

    goto :goto_4

    :cond_4
    move v6, v3

    .line 464
    .end local v6    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v27    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_4
    if-eqz v6, :cond_d

    instance-of v6, v5, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_d

    .line 466
    const/4 v6, 0x0

    .line 467
    .local v6, "count$iv$iv$iv":I
    move-object/from16 v27, v5

    check-cast v27, Landroidx/compose/ui/node/DelegatingNode;

    .local v27, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v28, 0x0

    .line 468
    .local v28, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v29

    .line 469
    .local v29, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_5
    if-eqz v29, :cond_c

    .line 470
    move-object/from16 v30, v29

    .local v30, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v31, 0x0

    .line 471
    .local v31, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v32, v30

    .local v32, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v33, 0x0

    .line 465
    .local v33, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v9

    if-eqz v34, :cond_5

    move/from16 v32, v7

    goto :goto_6

    :cond_5
    move/from16 v32, v3

    .line 471
    .end local v32    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_6
    if-eqz v32, :cond_b

    .line 472
    add-int/lit8 v6, v6, 0x1

    .line 473
    if-ne v6, v7, :cond_6

    .line 474
    move-object/from16 v5, v30

    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move-object/from16 v7, v30

    goto :goto_9

    .line 478
    :cond_6
    if-nez v25, :cond_7

    const/16 v32, 0x0

    .line 479
    .local v32, "$i$f$mutableVectorOf":I
    nop

    .line 480
    const/16 v7, 0x10

    .local v7, "capacity$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 481
    .local v34, "$i$f$MutableVector":I
    move-object/from16 v35, v2

    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v35, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v36, v4

    new-array v4, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v2, v4, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 479
    .end local v7    # "capacity$iv$iv$iv$iv$iv":I
    .end local v34    # "$i$f$MutableVector":I
    goto :goto_7

    .line 478
    .end local v32    # "$i$f$mutableVectorOf":I
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_7
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    move-object/from16 v2, v25

    :goto_7
    nop

    .line 482
    .end local v25    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v4, v5

    .line 483
    .local v4, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v4, :cond_9

    .line 484
    if-eqz v2, :cond_8

    invoke-virtual {v2, v4}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 485
    :cond_8
    const/4 v5, 0x0

    .line 487
    :cond_9
    if-eqz v2, :cond_a

    move-object/from16 v7, v30

    .end local v30    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v7, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v25

    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_8

    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v30    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_a
    move-object/from16 v7, v30

    .end local v30    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_8
    move-object/from16 v25, v2

    goto :goto_9

    .line 471
    .end local v4    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v2, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v25    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v30    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_b
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move-object/from16 v7, v30

    .line 490
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v30    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_9
    nop

    .line 470
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v31    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 491
    invoke-virtual/range {v29 .. v29}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v29

    move-object/from16 v2, v35

    move-object/from16 v4, v36

    const/4 v7, 0x1

    goto :goto_5

    .line 493
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_c
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    .line 494
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v27    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v28    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v29    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v2, 0x1

    if-ne v6, v2, :cond_e

    .line 496
    move-object/from16 v2, v35

    move-object/from16 v4, v36

    const/4 v7, 0x1

    goto/16 :goto_3

    .line 464
    .end local v6    # "count$iv$iv$iv":I
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_d
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    .line 499
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_e
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    move-object/from16 v2, v35

    move-object/from16 v4, v36

    const/4 v7, 0x1

    goto/16 :goto_3

    .line 501
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_f
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    .line 447
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v5    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v23    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v24    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v25    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    nop

    .line 457
    .end local v21    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_a

    .line 456
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_10
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move/from16 v26, v5

    .line 502
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_a
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    move/from16 v5, v26

    move-object/from16 v2, v35

    move-object/from16 v4, v36

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 455
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_11
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move/from16 v26, v5

    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    goto :goto_b

    .line 454
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_12
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move/from16 v26, v5

    .line 505
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_b
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v19

    .line 506
    if-eqz v19, :cond_13

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v2

    goto :goto_c

    :cond_13
    const/4 v2, 0x0

    :goto_c
    move-object/from16 v18, v2

    move/from16 v5, v26

    move-object/from16 v2, v35

    move-object/from16 v4, v36

    const/4 v7, 0x1

    .end local v20    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_1

    .line 508
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_14
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move/from16 v26, v5

    .line 447
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v15    # "mask$iv$iv$iv":I
    .end local v16    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v17    # "$i$f$visitAncestors":I
    .end local v18    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    nop

    .line 509
    .end local v12    # "includeSelf$iv$iv":Z
    .end local v13    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v6, 0x0

    .line 268
    .end local v8    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "type$iv":I
    .end local v10    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v11    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    :goto_d
    check-cast v6, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v6, :cond_17

    invoke-interface {v6}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    goto/16 :goto_1d

    .line 449
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v8    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v9    # "type$iv":I
    .restart local v10    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v11    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v12    # "includeSelf$iv$iv":Z
    .restart local v13    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v14    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v15    # "mask$iv$iv$iv":I
    .restart local v16    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v17    # "$i$f$visitAncestors":I
    :cond_15
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v2, 0x0

    .line 448
    .local v2, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .end local v2    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 268
    .end local v8    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "type$iv":I
    .end local v10    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v11    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v12    # "includeSelf$iv$iv":Z
    .end local v13    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v15    # "mask$iv$iv$iv":I
    .end local v16    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v17    # "$i$f$visitAncestors":I
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .local v2, "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_16
    move-object/from16 v35, v2

    move-object/from16 v36, v4

    move/from16 v26, v5

    .line 267
    .end local v2    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    .restart local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_17
    nop

    .line 269
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    check-cast v2, Landroidx/compose/ui/node/DelegatableNode;

    const/4 v4, 0x0

    .line 510
    .local v4, "$i$f$getKeyInput-OLwlOKw":I
    invoke-static/range {v26 .. v26}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v4

    .line 269
    .end local v4    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v2, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v4, "type$iv":I
    const/4 v5, 0x0

    .line 511
    .local v5, "$i$f$nearestAncestor-64DMado":I
    move-object v6, v2

    .line 512
    .local v6, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 514
    const/4 v7, 0x0

    .line 512
    .local v7, "includeSelf$iv$iv":Z
    const/4 v8, 0x0

    .line 516
    .local v8, "$i$f$visitAncestors-Y-YKmho":I
    move v9, v4

    .local v9, "mask$iv$iv$iv":I
    move-object v10, v6

    .local v10, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v11, 0x0

    .line 517
    .local v11, "$i$f$visitAncestors":I
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v12

    if-eqz v12, :cond_64

    .line 519
    invoke-interface {v10}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 520
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v10}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 521
    .local v13, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_e
    if-eqz v13, :cond_29

    .line 522
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v14

    invoke-virtual {v14}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v14

    .line 523
    .local v14, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v15

    and-int/2addr v15, v9

    if-eqz v15, :cond_27

    .line 524
    :goto_f
    if-eqz v12, :cond_26

    .line 525
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v15

    and-int/2addr v15, v9

    if-eqz v15, :cond_25

    .line 526
    move-object v15, v12

    .local v15, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 516
    .local v16, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v17, v15

    .local v17, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v18, 0x0

    .line 527
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v19, 0x0

    .line 528
    .local v19, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v20, 0x0

    .local v20, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v20, v17

    move-object/from16 v3, v20

    .line 529
    .end local v20    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_10
    if-eqz v3, :cond_24

    .line 530
    instance-of v0, v3, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v0, :cond_18

    .line 531
    move-object v0, v3

    .local v0, "it$iv":Ljava/lang/Object;
    const/16 v21, 0x0

    .line 532
    .local v21, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$nearestAncestor$2$iv":I
    goto/16 :goto_1c

    .line 533
    .end local v0    # "it$iv":Ljava/lang/Object;
    .end local v21    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$nearestAncestor$2$iv":I
    :cond_18
    move-object v0, v3

    .local v0, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 534
    .local v21, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v22

    and-int v22, v22, v4

    if-eqz v22, :cond_19

    const/4 v0, 0x1

    goto :goto_11

    :cond_19
    const/4 v0, 0x0

    .line 533
    .end local v0    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_11
    if-eqz v0, :cond_23

    instance-of v0, v3, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v0, :cond_23

    .line 535
    const/4 v0, 0x0

    .line 536
    .local v0, "count$iv$iv$iv":I
    move-object/from16 v21, v3

    check-cast v21, Landroidx/compose/ui/node/DelegatingNode;

    .local v21, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v22, 0x0

    .line 537
    .local v22, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    .line 538
    .local v23, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_12
    if-eqz v23, :cond_21

    .line 539
    move-object/from16 v24, v23

    .local v24, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v25, 0x0

    .line 540
    .local v25, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v27, v24

    .local v27, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v28, 0x0

    .line 534
    .local v28, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v29

    and-int v29, v29, v4

    if-eqz v29, :cond_1a

    const/16 v27, 0x1

    goto :goto_13

    :cond_1a
    const/16 v27, 0x0

    .line 540
    .end local v27    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v28    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_13
    if-eqz v27, :cond_20

    .line 541
    add-int/lit8 v0, v0, 0x1

    .line 542
    move-object/from16 v27, v2

    const/4 v2, 0x1

    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v27, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    if-ne v0, v2, :cond_1b

    .line 543
    move-object/from16 v3, v24

    move-object/from16 v31, v3

    goto :goto_17

    .line 547
    :cond_1b
    if-nez v19, :cond_1c

    const/4 v2, 0x0

    .line 548
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 549
    move/from16 v28, v0

    .end local v0    # "count$iv$iv$iv":I
    .local v28, "count$iv$iv$iv":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv":I
    const/16 v29, 0x0

    .line 550
    .local v29, "$i$f$MutableVector":I
    move/from16 v30, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v30, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v31, v3

    .end local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v31, "node$iv$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v32, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv":I
    .local v32, "capacity$iv$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 548
    .end local v29    # "$i$f$MutableVector":I
    .end local v32    # "capacity$iv$iv$iv$iv$iv":I
    goto :goto_14

    .line 547
    .end local v28    # "count$iv$iv$iv":I
    .end local v30    # "$i$f$mutableVectorOf":I
    .end local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v0, "count$iv$iv$iv":I
    .restart local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_1c
    move/from16 v28, v0

    move-object/from16 v31, v3

    .end local v0    # "count$iv$iv$iv":I
    .end local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v28    # "count$iv$iv$iv":I
    .restart local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_14
    nop

    .line 551
    .end local v19    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v31

    .line 552
    .local v0, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_1e

    .line 553
    if-eqz v2, :cond_1d

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 554
    :cond_1d
    const/4 v3, 0x0

    .end local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    goto :goto_15

    .line 552
    .end local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_1e
    move-object/from16 v3, v31

    .line 556
    .end local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    :goto_15
    if-eqz v2, :cond_1f

    move-object/from16 v19, v3

    move-object/from16 v3, v24

    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v19, "node$iv$iv$iv":Ljava/lang/Object;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v24

    invoke-static/range {v24 .. v24}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_16

    .end local v19    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v3, "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    move-object/from16 v19, v3

    move-object/from16 v3, v24

    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v19    # "node$iv$iv$iv":Ljava/lang/Object;
    :goto_16
    move-object/from16 v31, v19

    move/from16 v0, v28

    move-object/from16 v19, v2

    goto :goto_17

    .line 540
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v28    # "count$iv$iv$iv":I
    .local v0, "count$iv$iv$iv":I
    .local v2, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v3, "node$iv$iv$iv":Ljava/lang/Object;
    .local v19, "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_20
    move-object/from16 v27, v2

    move-object/from16 v31, v3

    move-object/from16 v3, v24

    .line 559
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v24    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    :goto_17
    nop

    .line 539
    .end local v3    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v25    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 560
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v23

    move-object/from16 v2, v27

    move-object/from16 v3, v31

    goto :goto_12

    .line 562
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v3, "node$iv$iv$iv":Ljava/lang/Object;
    :cond_21
    move-object/from16 v27, v2

    move-object/from16 v31, v3

    .line 563
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v21    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v22    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v23    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v0, v2, :cond_22

    .line 565
    move-object/from16 v0, p0

    move-object/from16 v2, v27

    move-object/from16 v3, v31

    goto/16 :goto_10

    .line 563
    :cond_22
    move-object/from16 v3, v31

    goto :goto_18

    .line 533
    .end local v0    # "count$iv$iv$iv":I
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "node$iv$iv$iv":Ljava/lang/Object;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    :cond_23
    move-object/from16 v27, v2

    .line 568
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_18
    invoke-static/range {v19 .. v19}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move-object/from16 v0, p0

    move-object/from16 v2, v27

    goto/16 :goto_10

    .line 570
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_24
    move-object/from16 v27, v2

    .line 516
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v3    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 526
    .end local v15    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_19

    .line 525
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_25
    move-object/from16 v27, v2

    .line 571
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_19
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, p0

    move-object/from16 v2, v27

    const/4 v3, 0x0

    goto/16 :goto_f

    .line 524
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_26
    move-object/from16 v27, v2

    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    goto :goto_1a

    .line 523
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_27
    move-object/from16 v27, v2

    .line 574
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_1a
    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v13

    .line 575
    if-eqz v13, :cond_28

    invoke-virtual {v13}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_28

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_1b

    :cond_28
    const/4 v0, 0x0

    :goto_1b
    move-object v12, v0

    move-object/from16 v0, p0

    move-object/from16 v2, v27

    const/4 v3, 0x0

    .end local v14    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_e

    .line 577
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_29
    move-object/from16 v27, v2

    .line 516
    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "mask$iv$iv$iv":I
    .end local v10    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v11    # "$i$f$visitAncestors":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 578
    .end local v6    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v7    # "includeSelf$iv$iv":Z
    .end local v8    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v0, 0x0

    .line 269
    .end local v4    # "type$iv":I
    .end local v5    # "$i$f$nearestAncestor-64DMado":I
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_1c
    check-cast v0, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v0, :cond_2a

    invoke-interface {v0}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v8

    goto :goto_1d

    :cond_2a
    const/4 v8, 0x0

    .line 267
    :goto_1d
    nop

    .line 271
    .local v8, "focusedKeyInputNode":Landroidx/compose/ui/Modifier$Node;
    if-eqz v8, :cond_63

    move-object v0, v8

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    .line 272
    const/4 v2, 0x0

    .line 579
    .local v2, "$i$f$getKeyInput-OLwlOKw":I
    invoke-static/range {v26 .. v26}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v2

    .line 271
    .end local v2    # "$i$f$getKeyInput-OLwlOKw":I
    nop

    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "type$iv":I
    move-object/from16 v3, p0

    .local v3, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v4, 0x0

    .line 580
    .local v4, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object v5, v0

    .local v5, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v6, 0x0

    .line 581
    .local v6, "$i$f$ancestors-64DMado":I
    const/4 v7, 0x0

    .line 582
    .local v7, "result$iv$iv":Ljava/lang/Object;
    move-object v9, v5

    .line 583
    .local v9, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 585
    const/4 v10, 0x0

    .line 583
    .local v10, "includeSelf$iv$iv$iv":Z
    const/4 v11, 0x0

    .line 587
    .local v11, "$i$f$visitAncestors-Y-YKmho":I
    move v12, v2

    .local v12, "mask$iv$iv$iv$iv":I
    move-object v13, v9

    .local v13, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v14, 0x0

    .line 588
    .local v14, "$i$f$visitAncestors":I
    invoke-interface {v13}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v15

    if-eqz v15, :cond_62

    .line 590
    invoke-interface {v13}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    .line 591
    .local v15, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v13}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v16

    .line 592
    .local v16, "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_1e
    if-eqz v16, :cond_3d

    .line 593
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    .line 594
    .local v17, "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v18

    and-int v18, v18, v12

    if-eqz v18, :cond_3b

    .line 595
    :goto_1f
    if-eqz v15, :cond_3a

    .line 596
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v18

    and-int v18, v18, v12

    if-eqz v18, :cond_39

    .line 597
    move-object/from16 v18, v15

    .local v18, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v19, 0x0

    .line 587
    .local v19, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    move-object/from16 v21, v18

    .local v21, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 598
    .local v22, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v23, 0x0

    .line 599
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .local v24, "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v21

    move-object/from16 v39, v24

    move-object/from16 v24, v0

    move-object/from16 v0, v39

    .line 600
    .local v0, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v24, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_20
    if-eqz v0, :cond_38

    .line 601
    move/from16 v25, v2

    .end local v2    # "type$iv":I
    .local v25, "type$iv":I
    instance-of v2, v0, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v2, :cond_2c

    .line 602
    move-object v2, v0

    .local v2, "it$iv$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 603
    .local v26, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    if-nez v7, :cond_2b

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v7, v27

    check-cast v7, Ljava/util/List;

    .line 604
    :cond_2b
    invoke-interface {v7, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 605
    nop

    .line 602
    .end local v2    # "it$iv$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    move-object/from16 v37, v3

    goto/16 :goto_27

    .line 606
    :cond_2c
    move-object v2, v0

    .local v2, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 607
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v2}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v25

    if-eqz v27, :cond_2d

    const/4 v2, 0x1

    goto :goto_21

    :cond_2d
    const/4 v2, 0x0

    .line 606
    .end local v2    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_21
    if-eqz v2, :cond_37

    instance-of v2, v0, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v2, :cond_37

    .line 608
    const/4 v2, 0x0

    .line 609
    .local v2, "count$iv$iv$iv$iv":I
    move-object/from16 v26, v0

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 610
    .local v27, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 611
    .local v28, "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_22
    if-eqz v28, :cond_35

    .line 612
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 613
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v32, 0x0

    .line 607
    .local v32, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v25

    if-eqz v34, :cond_2e

    const/16 v31, 0x1

    goto :goto_23

    :cond_2e
    const/16 v31, 0x0

    .line 613
    .end local v31    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v32    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_23
    if-eqz v31, :cond_34

    .line 614
    add-int/lit8 v2, v2, 0x1

    .line 615
    move-object/from16 v31, v0

    const/4 v0, 0x1

    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v31, "node$iv$iv$iv$iv":Ljava/lang/Object;
    if-ne v2, v0, :cond_2f

    .line 616
    move-object/from16 v0, v29

    move-object/from16 v37, v3

    move-object/from16 v3, v29

    .end local v31    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    goto :goto_26

    .line 620
    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v31    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    :cond_2f
    if-nez v23, :cond_30

    const/4 v0, 0x0

    .line 621
    .local v0, "$i$f$mutableVectorOf":I
    nop

    .line 622
    move/from16 v32, v0

    .end local v0    # "$i$f$mutableVectorOf":I
    .local v32, "$i$f$mutableVectorOf":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 623
    .restart local v34    # "$i$f$MutableVector":I
    move/from16 v36, v2

    .end local v2    # "count$iv$iv$iv$iv":I
    .local v36, "count$iv$iv$iv$iv":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v37, v3

    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .local v37, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v38, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv$iv":I
    .local v38, "capacity$iv$iv$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 621
    .end local v34    # "$i$f$MutableVector":I
    .end local v38    # "capacity$iv$iv$iv$iv$iv$iv":I
    goto :goto_24

    .line 620
    .end local v32    # "$i$f$mutableVectorOf":I
    .end local v36    # "count$iv$iv$iv$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v2    # "count$iv$iv$iv$iv":I
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_30
    move/from16 v36, v2

    move-object/from16 v37, v3

    .end local v2    # "count$iv$iv$iv$iv":I
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v36    # "count$iv$iv$iv$iv":I
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    move-object/from16 v2, v23

    :goto_24
    nop

    .line 624
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v31

    .line 625
    .local v0, "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_32

    .line 626
    if-eqz v2, :cond_31

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 627
    :cond_31
    const/4 v3, 0x0

    move-object/from16 v31, v3

    .line 629
    :cond_32
    if-eqz v2, :cond_33

    move-object/from16 v3, v29

    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v23

    invoke-static/range {v23 .. v23}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_25

    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_33
    move-object/from16 v3, v29

    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_25
    move-object/from16 v23, v2

    move-object/from16 v0, v31

    move/from16 v2, v36

    goto :goto_26

    .line 613
    .end local v31    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v36    # "count$iv$iv$iv$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .local v0, "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "count$iv$iv$iv$iv":I
    .local v3, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_34
    move-object/from16 v31, v0

    move-object/from16 v37, v3

    move-object/from16 v3, v29

    .line 632
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :goto_26
    nop

    .line 612
    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    nop

    .line 633
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move-object/from16 v3, v37

    goto :goto_22

    .line 635
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .local v3, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_35
    move-object/from16 v31, v0

    move-object/from16 v37, v3

    .line 636
    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v26    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v0, 0x1

    if-ne v2, v0, :cond_36

    .line 638
    move/from16 v2, v25

    move-object/from16 v0, v31

    move-object/from16 v3, v37

    goto/16 :goto_20

    .line 636
    :cond_36
    move-object/from16 v0, v31

    goto :goto_27

    .line 606
    .end local v2    # "count$iv$iv$iv$iv":I
    .end local v31    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_37
    move-object/from16 v37, v3

    .line 641
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :goto_27
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    move/from16 v2, v25

    move-object/from16 v3, v37

    goto/16 :goto_20

    .line 643
    .end local v25    # "type$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .local v2, "type$iv":I
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_38
    move/from16 v25, v2

    move-object/from16 v37, v3

    .line 587
    .end local v0    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v2    # "type$iv":I
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v21    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v25    # "type$iv":I
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    nop

    .line 597
    .end local v18    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v19    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    goto :goto_28

    .line 596
    .end local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v25    # "type$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_39
    move-object/from16 v24, v0

    move/from16 v25, v2

    move-object/from16 v37, v3

    .line 644
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "type$iv":I
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :goto_28
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v15

    move-object/from16 v0, v24

    move/from16 v2, v25

    move-object/from16 v3, v37

    goto/16 :goto_1f

    .line 595
    .end local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v25    # "type$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_3a
    move-object/from16 v24, v0

    move/from16 v25, v2

    move-object/from16 v37, v3

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "type$iv":I
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    goto :goto_29

    .line 594
    .end local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v25    # "type$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_3b
    move-object/from16 v24, v0

    move/from16 v25, v2

    move-object/from16 v37, v3

    .line 647
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "type$iv":I
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :goto_29
    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v16

    .line 648
    if-eqz v16, :cond_3c

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_3c

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_2a

    :cond_3c
    const/4 v0, 0x0

    :goto_2a
    move-object v15, v0

    move-object/from16 v0, v24

    move/from16 v2, v25

    move-object/from16 v3, v37

    .end local v17    # "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_1e

    .line 650
    .end local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v25    # "type$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    :cond_3d
    move-object/from16 v24, v0

    move/from16 v25, v2

    move-object/from16 v37, v3

    .line 587
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v12    # "mask$iv$iv$iv$iv":I
    .end local v13    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "$i$f$visitAncestors":I
    .end local v15    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "type$iv":I
    .restart local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    nop

    .line 651
    .end local v9    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v10    # "includeSelf$iv$iv$iv":Z
    .end local v11    # "$i$f$visitAncestors-Y-YKmho":I
    nop

    .line 580
    .end local v5    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v6    # "$i$f$ancestors-64DMado":I
    .end local v7    # "result$iv$iv":Ljava/lang/Object;
    nop

    .line 652
    .local v7, "ancestors$iv":Ljava/util/List;
    if-eqz v7, :cond_41

    move-object v0, v7

    .local v0, "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 653
    .local v2, "$i$f$fastForEachReversed":I
    nop

    .line 654
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_40

    :cond_3e
    move v5, v3

    .local v5, "index$iv$iv":I
    add-int/lit8 v3, v3, -0x1

    .line 655
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 656
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v10, 0x0

    .line 273
    .local v10, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$2":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v11

    if-eqz v11, :cond_3f

    const/16 v33, 0x1

    return v33

    .line 656
    .end local v9    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v10    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$2":I
    :cond_3f
    nop

    .line 654
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    if-gez v3, :cond_3e

    .line 658
    .end local v5    # "index$iv$iv":I
    :cond_40
    nop

    .end local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEachReversed":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 659
    :cond_41
    invoke-interface/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 660
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 661
    .local v3, "stack$iv$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .local v5, "node$iv$iv":Ljava/lang/Object;
    move-object v5, v0

    .line 662
    :goto_2b
    if-eqz v5, :cond_4f

    .line 663
    instance-of v6, v5, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v6, :cond_43

    .line 664
    move-object v6, v5

    check-cast v6, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v6, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v9, 0x0

    .line 273
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$2":I
    invoke-interface {v6, v1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onPreKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v10

    if-eqz v10, :cond_42

    const/16 v33, 0x1

    return v33

    .line 664
    .end local v6    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$2":I
    :cond_42
    move-object/from16 v17, v0

    move/from16 v18, v2

    goto/16 :goto_31

    .line 665
    :cond_43
    move-object v6, v5

    .local v6, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 607
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int v10, v10, v25

    if-eqz v10, :cond_44

    const/4 v6, 0x1

    goto :goto_2c

    :cond_44
    const/4 v6, 0x0

    .line 665
    .end local v6    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_2c
    if-eqz v6, :cond_4e

    instance-of v6, v5, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_4e

    .line 670
    const/4 v6, 0x0

    .line 671
    .local v6, "count$iv$iv":I
    move-object v9, v5

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v10, 0x0

    .line 672
    .local v10, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    .line 673
    .local v11, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_2d
    if-eqz v11, :cond_4c

    .line 674
    move-object v12, v11

    .local v12, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v13, 0x0

    .line 675
    .local v13, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v14, v12

    .local v14, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v15, 0x0

    .line 607
    .local v15, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v16

    and-int v16, v16, v25

    if-eqz v16, :cond_45

    const/4 v14, 0x1

    goto :goto_2e

    :cond_45
    const/4 v14, 0x0

    .line 675
    .end local v14    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_2e
    if-eqz v14, :cond_4a

    .line 676
    add-int/lit8 v6, v6, 0x1

    .line 677
    const/4 v14, 0x1

    if-ne v6, v14, :cond_46

    .line 678
    move-object v5, v12

    move-object/from16 v17, v0

    move/from16 v18, v2

    goto :goto_30

    .line 682
    :cond_46
    if-nez v3, :cond_47

    const/4 v14, 0x0

    .line 683
    .local v14, "$i$f$mutableVectorOf":I
    nop

    .line 684
    const/16 v15, 0x10

    .local v15, "capacity$iv$iv$iv$iv":I
    const/16 v16, 0x0

    .line 685
    .local v16, "$i$f$MutableVector":I
    move-object/from16 v17, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v17, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    new-array v2, v15, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v19, v3

    const/4 v3, 0x0

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .local v19, "stack$iv$iv":Ljava/lang/Object;
    invoke-direct {v0, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 683
    .end local v15    # "capacity$iv$iv$iv$iv":I
    .end local v16    # "$i$f$MutableVector":I
    goto :goto_2f

    .line 682
    .end local v14    # "$i$f$mutableVectorOf":I
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_47
    move-object/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v19

    :goto_2f
    move-object v3, v0

    .line 686
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v5

    .line 687
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_49

    .line 688
    if-eqz v3, :cond_48

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 689
    :cond_48
    const/4 v2, 0x0

    move-object v5, v2

    .line 691
    :cond_49
    if-eqz v3, :cond_4b

    invoke-virtual {v3, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_30

    .line 675
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_4a
    move-object/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 694
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_4b
    :goto_30
    nop

    .line 674
    .end local v12    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 695
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    move-object/from16 v0, v17

    move/from16 v2, v18

    goto :goto_2d

    .line 697
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_4c
    move-object/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 698
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v10    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v11    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v6, v2, :cond_4d

    .line 700
    move-object/from16 v0, v17

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_2b

    .line 698
    :cond_4d
    move-object/from16 v3, v19

    goto :goto_31

    .line 665
    .end local v6    # "count$iv$iv":I
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_4e
    move-object/from16 v17, v0

    move/from16 v18, v2

    .line 703
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_31
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    move-object/from16 v0, v17

    move/from16 v2, v18

    goto/16 :goto_2b

    .line 705
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_4f
    move-object/from16 v17, v0

    move/from16 v18, v2

    .line 706
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v5    # "node$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 274
    .local v0, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$3":I
    invoke-interface/range {p2 .. p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_50

    const/16 v33, 0x1

    return v33

    .line 706
    .end local v0    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$3":I
    :cond_50
    nop

    .line 707
    invoke-interface/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 708
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 709
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v5, 0x0

    .restart local v5    # "node$iv$iv":Ljava/lang/Object;
    move-object v5, v0

    .line 710
    :goto_32
    if-eqz v5, :cond_5e

    .line 711
    instance-of v6, v5, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    if-eqz v6, :cond_52

    .line 712
    move-object v6, v5

    check-cast v6, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v6, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v9, 0x0

    .line 275
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$4":I
    invoke-interface {v6, v1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v10

    if-eqz v10, :cond_51

    const/16 v33, 0x1

    return v33

    .line 712
    .end local v6    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$4":I
    :cond_51
    move-object/from16 v17, v0

    move/from16 v18, v2

    goto/16 :goto_38

    .line 713
    :cond_52
    move-object v6, v5

    .local v6, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 607
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v6}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v10

    and-int v10, v10, v25

    if-eqz v10, :cond_53

    const/4 v6, 0x1

    goto :goto_33

    :cond_53
    const/4 v6, 0x0

    .line 713
    .end local v6    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_33
    if-eqz v6, :cond_5d

    instance-of v6, v5, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v6, :cond_5d

    .line 718
    const/4 v6, 0x0

    .line 719
    .local v6, "count$iv$iv":I
    move-object v9, v5

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v10, 0x0

    .line 720
    .restart local v10    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    .line 721
    .restart local v11    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_34
    if-eqz v11, :cond_5b

    .line 722
    move-object v12, v11

    .restart local v12    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v13, 0x0

    .line 723
    .restart local v13    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v14, v12

    .local v14, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v15, 0x0

    .line 607
    .local v15, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v14}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v16

    and-int v16, v16, v25

    if-eqz v16, :cond_54

    const/4 v14, 0x1

    goto :goto_35

    :cond_54
    const/4 v14, 0x0

    .line 723
    .end local v14    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v15    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_35
    if-eqz v14, :cond_59

    .line 724
    add-int/lit8 v6, v6, 0x1

    .line 725
    const/4 v14, 0x1

    if-ne v6, v14, :cond_55

    .line 726
    move-object v5, v12

    move-object/from16 v17, v0

    move/from16 v18, v2

    goto :goto_37

    .line 730
    :cond_55
    if-nez v3, :cond_56

    const/4 v14, 0x0

    .line 731
    .local v14, "$i$f$mutableVectorOf":I
    nop

    .line 732
    const/16 v15, 0x10

    .local v15, "capacity$iv$iv$iv$iv":I
    const/16 v16, 0x0

    .line 733
    .restart local v16    # "$i$f$MutableVector":I
    move-object/from16 v17, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    new-array v2, v15, [Landroidx/compose/ui/Modifier$Node;

    move-object/from16 v19, v3

    const/4 v3, 0x0

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    invoke-direct {v0, v2, v3}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 731
    .end local v15    # "capacity$iv$iv$iv$iv":I
    .end local v16    # "$i$f$MutableVector":I
    goto :goto_36

    .line 730
    .end local v14    # "$i$f$mutableVectorOf":I
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_56
    move-object/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v0, v19

    :goto_36
    move-object v3, v0

    .line 734
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v5

    .line 735
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_58

    .line 736
    if-eqz v3, :cond_57

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 737
    :cond_57
    const/4 v2, 0x0

    move-object v5, v2

    .line 739
    :cond_58
    if-eqz v3, :cond_5a

    invoke-virtual {v3, v12}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    goto :goto_37

    .line 723
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_59
    move-object/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 742
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_5a
    :goto_37
    nop

    .line 722
    .end local v12    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v13    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 743
    invoke-virtual {v11}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v11

    move-object/from16 v0, v17

    move/from16 v2, v18

    goto :goto_34

    .line 745
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_5b
    move-object/from16 v17, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 746
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v10    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v11    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v6, v2, :cond_5c

    .line 748
    move-object/from16 v0, v17

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_32

    .line 746
    :cond_5c
    move-object/from16 v3, v19

    goto :goto_38

    .line 713
    .end local v6    # "count$iv$iv":I
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_5d
    move-object/from16 v17, v0

    move/from16 v18, v2

    .line 751
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_38
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v5

    move-object/from16 v0, v17

    move/from16 v2, v18

    goto/16 :goto_32

    .line 753
    .end local v17    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_5e
    move-object/from16 v17, v0

    move/from16 v18, v2

    .line 754
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v5    # "node$iv$iv":Ljava/lang/Object;
    if-eqz v7, :cond_61

    move-object v0, v7

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 755
    .local v2, "$i$f$fastForEach":I
    nop

    .line 756
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    :goto_39
    if-ge v3, v5, :cond_60

    .line 757
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    .line 758
    .local v6, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/input/key/KeyInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    const/4 v10, 0x0

    .line 275
    .local v10, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$4":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/key/KeyInputModifierNode;->onKeyEvent-ZmokQxo(Landroid/view/KeyEvent;)Z

    move-result v11

    if-eqz v11, :cond_5f

    const/16 v33, 0x1

    return v33

    :cond_5f
    const/16 v33, 0x1

    .line 758
    .end local v9    # "it":Landroidx/compose/ui/input/key/KeyInputModifierNode;
    .end local v10    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchKeyEvent$4":I
    nop

    .line 756
    .end local v6    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_39

    .line 760
    .end local v3    # "index$iv$iv":I
    :cond_60
    nop

    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 761
    :cond_61
    nop

    .end local v4    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v7    # "ancestors$iv":Ljava/util/List;
    .end local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v25    # "type$iv":I
    .end local v37    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_3a

    .line 589
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "type$iv":I
    .local v3, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v4    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v5, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v6, "$i$f$ancestors-64DMado":I
    .local v7, "result$iv$iv":Ljava/lang/Object;
    .local v9, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v10, "includeSelf$iv$iv$iv":Z
    .local v11, "$i$f$visitAncestors-Y-YKmho":I
    .local v12, "mask$iv$iv$iv$iv":I
    .local v13, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v14, "$i$f$visitAncestors":I
    :cond_62
    move-object/from16 v24, v0

    move/from16 v25, v2

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v25    # "type$iv":I
    const/4 v0, 0x0

    .line 588
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 277
    .end local v3    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v4    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v5    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v6    # "$i$f$ancestors-64DMado":I
    .end local v7    # "result$iv$iv":Ljava/lang/Object;
    .end local v9    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v10    # "includeSelf$iv$iv$iv":Z
    .end local v11    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v12    # "mask$iv$iv$iv$iv":I
    .end local v13    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "$i$f$visitAncestors":I
    .end local v24    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v25    # "type$iv":I
    :cond_63
    :goto_3a
    const/16 v20, 0x0

    return v20

    .line 518
    .local v2, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v4, "type$iv":I
    .local v5, "$i$f$nearestAncestor-64DMado":I
    .local v6, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v7, "includeSelf$iv$iv":Z
    .local v8, "$i$f$visitAncestors-Y-YKmho":I
    .local v9, "mask$iv$iv$iv":I
    .local v10, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v11, "$i$f$visitAncestors":I
    :cond_64
    move-object/from16 v27, v2

    .end local v2    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v27, "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v0, 0x0

    .line 517
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual/range {v36 .. v36}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 260
    .end local v4    # "type$iv":I
    .end local v5    # "$i$f$nearestAncestor-64DMado":I
    .end local v6    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v7    # "includeSelf$iv$iv":Z
    .end local v8    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v9    # "mask$iv$iv$iv":I
    .end local v10    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v11    # "$i$f$visitAncestors":I
    .end local v27    # "$this$nearestAncestor_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v35    # "activeFocusTarget":Landroidx/compose/ui/focus/FocusTargetNode;
    :cond_65
    const/4 v0, 0x0

    .line 261
    .local v0, "$i$a$-check-FocusOwnerImpl$dispatchKeyEvent$1":I
    nop

    .line 260
    .end local v0    # "$i$a$-check-FocusOwnerImpl$dispatchKeyEvent$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Dispatching key event while focus system is invalidated."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public dispatchRotaryEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z
    .locals 39
    .param p1, "event"    # Landroidx/compose/ui/input/rotary/RotaryScrollEvent;

    .line 302
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v2}, Landroidx/compose/ui/focus/FocusInvalidationManager;->hasPendingInvalidation()Z

    move-result v2

    if-nez v2, :cond_4c

    .line 307
    nop

    .line 306
    iget-object v2, v0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v2}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v2

    .line 307
    const-string/jumbo v3, "visitAncestors called on an unattached node"

    const/16 v4, 0x4000

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_13

    .line 306
    check-cast v2, Landroidx/compose/ui/node/DelegatableNode;

    .line 307
    const/4 v8, 0x0

    .line 1010
    .local v8, "$i$f$getRotaryInput-OLwlOKw":I
    invoke-static {v4}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v8

    .line 307
    .end local v8    # "$i$f$getRotaryInput-OLwlOKw":I
    nop

    .local v8, "type$iv":I
    move-object/from16 v9, p0

    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v9, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v10, 0x0

    .line 1011
    .local v10, "$i$f$nearestAncestorIncludingSelf-64DMado":I
    const/4 v11, 0x1

    .local v11, "includeSelf$iv$iv":Z
    move-object v12, v2

    .local v12, "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v13, 0x0

    .line 1012
    .local v13, "$i$f$visitAncestors-Y-YKmho":I
    move v14, v8

    .local v14, "mask$iv$iv$iv":I
    move-object v15, v12

    .local v15, "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 1013
    .local v16, "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    if-eqz v17, :cond_12

    .line 1015
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    .line 1016
    .local v17, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 1017
    .local v18, "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_0
    if-eqz v18, :cond_11

    .line 1018
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v19

    .line 1019
    .local v19, "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_f

    .line 1020
    :goto_1
    if-eqz v17, :cond_e

    .line 1021
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v20

    and-int v20, v20, v14

    if-eqz v20, :cond_d

    .line 1022
    move-object/from16 v20, v17

    .local v20, "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v21, 0x0

    .line 1012
    .local v21, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    move-object/from16 v22, v20

    .local v22, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v23, 0x0

    .line 1023
    .local v23, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v24, 0x0

    .line 1024
    .local v24, "stack$iv$iv$iv":Ljava/lang/Object;
    const/16 v25, 0x0

    .local v25, "node$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v25, v22

    move-object/from16 v38, v25

    move/from16 v25, v4

    move-object/from16 v4, v38

    .line 1025
    .end local v25    # "node$iv$iv$iv":Ljava/lang/Object;
    .local v4, "node$iv$iv$iv":Ljava/lang/Object;
    :goto_2
    if-eqz v4, :cond_c

    .line 1026
    instance-of v5, v4, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v5, :cond_0

    .line 1027
    move-object v5, v4

    .local v5, "it$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 1028
    .local v26, "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    goto/16 :goto_c

    .line 1029
    .end local v5    # "it$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho-FocusOwnerImpl$nearestAncestorIncludingSelf$1$iv":I
    :cond_0
    move-object v5, v4

    .local v5, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 1030
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v5}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v8

    if-eqz v27, :cond_1

    move v5, v7

    goto :goto_3

    :cond_1
    move v5, v6

    .line 1029
    .end local v5    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_3
    if-eqz v5, :cond_a

    instance-of v5, v4, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v5, :cond_a

    .line 1031
    const/4 v5, 0x0

    .line 1032
    .local v5, "count$iv$iv$iv":I
    move-object/from16 v26, v4

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 1033
    .local v27, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 1034
    .local v28, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_4
    if-eqz v28, :cond_9

    .line 1035
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1036
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v32, 0x0

    .line 1030
    .local v32, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v33

    and-int v33, v33, v8

    if-eqz v33, :cond_2

    move/from16 v31, v7

    goto :goto_5

    :cond_2
    move/from16 v31, v6

    .line 1036
    .end local v31    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v32    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_5
    if-eqz v31, :cond_8

    .line 1037
    add-int/lit8 v5, v5, 0x1

    .line 1038
    if-ne v5, v7, :cond_3

    .line 1039
    move-object/from16 v4, v29

    move-object/from16 v34, v2

    move-object/from16 v7, v29

    goto :goto_8

    .line 1043
    :cond_3
    if-nez v24, :cond_4

    const/16 v31, 0x0

    .line 1044
    .local v31, "$i$f$mutableVectorOf":I
    nop

    .line 1045
    const/16 v7, 0x10

    .local v7, "capacity$iv$iv$iv$iv$iv":I
    const/16 v33, 0x0

    .line 1046
    .local v33, "$i$f$MutableVector":I
    new-instance v0, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v34, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    new-array v2, v7, [Landroidx/compose/ui/Modifier$Node;

    invoke-direct {v0, v2, v6}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1044
    .end local v7    # "capacity$iv$iv$iv$iv$iv":I
    .end local v33    # "$i$f$MutableVector":I
    goto :goto_6

    .line 1043
    .end local v31    # "$i$f$mutableVectorOf":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_4
    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v0, v24

    :goto_6
    nop

    .line 1047
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .local v0, "stack$iv$iv$iv":Ljava/lang/Object;
    move-object v2, v4

    .line 1048
    .local v2, "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v2, :cond_6

    .line 1049
    if-eqz v0, :cond_5

    invoke-virtual {v0, v2}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1050
    :cond_5
    const/4 v4, 0x0

    .line 1052
    :cond_6
    if-eqz v0, :cond_7

    move-object/from16 v7, v29

    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v7, "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v0, v7}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_7
    move-object/from16 v7, v29

    .line 1055
    .end local v2    # "theNode$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_7
    move-object/from16 v24, v0

    goto :goto_8

    .line 1036
    .end local v0    # "stack$iv$iv$iv":Ljava/lang/Object;
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_8
    move-object/from16 v34, v2

    move-object/from16 v7, v29

    .line 1055
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v29    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_8
    nop

    .line 1035
    .end local v7    # "next$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv":I
    nop

    .line 1056
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto :goto_4

    .line 1058
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_9
    move-object/from16 v34, v2

    .line 1059
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v26    # "this_$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v0, 0x1

    if-ne v5, v0, :cond_b

    .line 1061
    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 1029
    .end local v5    # "count$iv$iv$iv":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_a
    move-object/from16 v34, v2

    .line 1064
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_b
    invoke-static/range {v24 .. v24}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v4

    move-object/from16 v0, p0

    move-object/from16 v2, v34

    const/4 v7, 0x1

    goto/16 :goto_2

    .line 1066
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_c
    move-object/from16 v34, v2

    .line 1012
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v4    # "node$iv$iv$iv":Ljava/lang/Object;
    .end local v22    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v23    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v24    # "stack$iv$iv$iv":Ljava/lang/Object;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1022
    .end local v20    # "it$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v21    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv":I
    goto :goto_9

    .line 1021
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_d
    move-object/from16 v34, v2

    move/from16 v25, v4

    .line 1067
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_9
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v4, v25

    move-object/from16 v2, v34

    goto/16 :goto_1

    .line 1020
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_e
    move-object/from16 v34, v2

    move/from16 v25, v4

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    goto :goto_a

    .line 1019
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_f
    move-object/from16 v34, v2

    move/from16 v25, v4

    .line 1070
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_a
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v18

    .line 1071
    if-eqz v18, :cond_10

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_b

    :cond_10
    const/4 v0, 0x0

    :goto_b
    move-object/from16 v17, v0

    const/4 v7, 0x1

    move-object/from16 v0, p0

    move/from16 v4, v25

    move-object/from16 v2, v34

    .end local v19    # "head$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_0

    .line 1073
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_11
    move-object/from16 v34, v2

    move/from16 v25, v4

    .line 1012
    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v14    # "mask$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "layout$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1074
    .end local v11    # "includeSelf$iv$iv":Z
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    const/4 v5, 0x0

    .end local v8    # "type$iv":I
    .end local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :goto_c
    check-cast v5, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    goto :goto_d

    .line 1014
    .restart local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v8    # "type$iv":I
    .restart local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .restart local v11    # "includeSelf$iv$iv":Z
    .restart local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v13    # "$i$f$visitAncestors-Y-YKmho":I
    .restart local v14    # "mask$iv$iv$iv":I
    .restart local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v16    # "$i$f$visitAncestors":I
    :cond_12
    move-object/from16 v34, v2

    .end local v2    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v0, 0x0

    .line 1013
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 307
    .end local v8    # "type$iv":I
    .end local v9    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v10    # "$i$f$nearestAncestorIncludingSelf-64DMado":I
    .end local v11    # "includeSelf$iv$iv":Z
    .end local v12    # "$this$visitAncestors_u2dY_u2dYKmho$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v14    # "mask$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v34    # "$this$nearestAncestorIncludingSelf_u2d64DMado$iv":Landroidx/compose/ui/node/DelegatableNode;
    :cond_13
    move/from16 v25, v4

    const/4 v5, 0x0

    .line 306
    :goto_d
    nop

    .line 309
    .local v5, "focusedRotaryInputNode":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    if-eqz v5, :cond_4b

    move-object v0, v5

    check-cast v0, Landroidx/compose/ui/node/DelegatableNode;

    .line 310
    const/4 v2, 0x0

    .line 1075
    .local v2, "$i$f$getRotaryInput-OLwlOKw":I
    invoke-static/range {v25 .. v25}, Landroidx/compose/ui/node/NodeKind;->constructor-impl(I)I

    move-result v2

    .line 309
    .end local v2    # "$i$f$getRotaryInput-OLwlOKw":I
    nop

    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    move-object/from16 v4, p0

    .local v2, "type$iv":I
    .local v4, "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    const/4 v7, 0x0

    .line 1076
    .local v7, "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    move-object v8, v0

    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/4 v9, 0x0

    .line 1077
    .local v9, "$i$f$ancestors-64DMado":I
    const/4 v10, 0x0

    .line 1078
    .local v10, "result$iv$iv":Ljava/lang/Object;
    move-object v11, v8

    .line 1079
    .local v11, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    nop

    .line 1081
    const/4 v12, 0x0

    .line 1079
    .local v12, "includeSelf$iv$iv$iv":Z
    const/4 v13, 0x0

    .line 1083
    .restart local v13    # "$i$f$visitAncestors-Y-YKmho":I
    move v14, v2

    .local v14, "mask$iv$iv$iv$iv":I
    move-object v15, v11

    .local v15, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    const/16 v16, 0x0

    .line 1084
    .restart local v16    # "$i$f$visitAncestors":I
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/Modifier$Node;->isAttached()Z

    move-result v17

    if-eqz v17, :cond_4a

    .line 1086
    invoke-interface {v15}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    .line 1087
    .local v3, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-static {v15}, Landroidx/compose/ui/node/DelegatableNodeKt;->requireLayoutNode(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 1088
    .local v17, "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    :goto_e
    if-eqz v17, :cond_26

    .line 1089
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/node/NodeChain;->getHead$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v18

    .line 1090
    .local v18, "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual/range {v18 .. v18}, Landroidx/compose/ui/Modifier$Node;->getAggregateChildKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_24

    .line 1091
    :goto_f
    if-eqz v3, :cond_23

    .line 1092
    invoke-virtual {v3}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v19

    and-int v19, v19, v14

    if-eqz v19, :cond_22

    .line 1093
    move-object/from16 v19, v3

    .local v19, "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v20, 0x0

    .line 1083
    .local v20, "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    move-object/from16 v21, v19

    .local v21, "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v22, 0x0

    .line 1094
    .local v22, "$i$f$dispatchForKind-6rFNWt0":I
    const/16 v23, 0x0

    .line 1095
    .local v23, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    const/16 v24, 0x0

    .local v24, "node$iv$iv$iv$iv":Ljava/lang/Object;
    move-object/from16 v24, v21

    move-object/from16 v6, v24

    .line 1096
    .end local v24    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .local v6, "node$iv$iv$iv$iv":Ljava/lang/Object;
    :goto_10
    if-eqz v6, :cond_21

    .line 1097
    move-object/from16 v25, v0

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v25, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    instance-of v0, v6, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v0, :cond_15

    .line 1098
    move-object v0, v6

    .local v0, "it$iv$iv":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 1099
    .local v26, "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    if-nez v10, :cond_14

    new-instance v27, Ljava/util/ArrayList;

    invoke-direct/range {v27 .. v27}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v10, v27

    check-cast v10, Ljava/util/List;

    .line 1100
    :cond_14
    invoke-interface {v10, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1101
    nop

    .line 1098
    .end local v0    # "it$iv$iv":Ljava/lang/Object;
    .end local v26    # "$i$a$-visitAncestors-Y-YKmho$default-DelegatableNodeKt$ancestors$1$iv$iv":I
    move/from16 v31, v2

    move-object/from16 v36, v3

    goto/16 :goto_17

    .line 1102
    :cond_15
    move-object v0, v6

    .local v0, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v26, 0x0

    .line 1103
    .local v26, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v0}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v27

    and-int v27, v27, v2

    if-eqz v27, :cond_16

    const/4 v0, 0x1

    goto :goto_11

    :cond_16
    const/4 v0, 0x0

    .line 1102
    .end local v0    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_11
    if-eqz v0, :cond_1f

    instance-of v0, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v0, :cond_1f

    .line 1104
    const/4 v0, 0x0

    .line 1105
    .local v0, "count$iv$iv$iv$iv":I
    move-object/from16 v26, v6

    check-cast v26, Landroidx/compose/ui/node/DelegatingNode;

    .local v26, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/16 v27, 0x0

    .line 1106
    .restart local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual/range {v26 .. v26}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    .line 1107
    .local v28, "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_12
    if-eqz v28, :cond_1e

    .line 1108
    move-object/from16 v29, v28

    .local v29, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v30, 0x0

    .line 1109
    .local v30, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    move-object/from16 v31, v29

    .local v31, "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v33, 0x0

    .line 1103
    .local v33, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual/range {v31 .. v31}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v34

    and-int v34, v34, v2

    if-eqz v34, :cond_17

    const/16 v31, 0x1

    goto :goto_13

    :cond_17
    const/16 v31, 0x0

    .line 1109
    .end local v31    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v33    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_13
    if-eqz v31, :cond_1d

    .line 1110
    add-int/lit8 v0, v0, 0x1

    .line 1111
    move/from16 v31, v2

    const/4 v2, 0x1

    .end local v2    # "type$iv":I
    .local v31, "type$iv":I
    if-ne v0, v2, :cond_18

    .line 1112
    move-object/from16 v6, v29

    move-object/from16 v36, v3

    move-object/from16 v3, v29

    goto :goto_16

    .line 1116
    :cond_18
    if-nez v23, :cond_19

    const/4 v2, 0x0

    .line 1117
    .local v2, "$i$f$mutableVectorOf":I
    nop

    .line 1118
    move/from16 v33, v0

    .end local v0    # "count$iv$iv$iv$iv":I
    .local v33, "count$iv$iv$iv$iv":I
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv$iv$iv":I
    const/16 v34, 0x0

    .line 1119
    .local v34, "$i$f$MutableVector":I
    move/from16 v35, v2

    .end local v2    # "$i$f$mutableVectorOf":I
    .local v35, "$i$f$mutableVectorOf":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v36, v3

    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v36, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v37, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv$iv$iv":I
    .local v37, "capacity$iv$iv$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1117
    .end local v34    # "$i$f$MutableVector":I
    .end local v37    # "capacity$iv$iv$iv$iv$iv$iv":I
    goto :goto_14

    .line 1116
    .end local v33    # "count$iv$iv$iv$iv":I
    .end local v35    # "$i$f$mutableVectorOf":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "count$iv$iv$iv$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_19
    move/from16 v33, v0

    move-object/from16 v36, v3

    .end local v0    # "count$iv$iv$iv$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v33    # "count$iv$iv$iv$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    move-object/from16 v2, v23

    :goto_14
    nop

    .line 1120
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .local v2, "stack$iv$iv$iv$iv":Ljava/lang/Object;
    move-object v0, v6

    .line 1121
    .local v0, "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_1b

    .line 1122
    if-eqz v2, :cond_1a

    invoke-virtual {v2, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1123
    :cond_1a
    const/4 v3, 0x0

    move-object v6, v3

    .line 1125
    :cond_1b
    if-eqz v2, :cond_1c

    move-object/from16 v3, v29

    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    invoke-virtual {v2, v3}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_15

    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1c
    move-object/from16 v3, v29

    .line 1128
    .end local v0    # "theNode$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_15
    move-object/from16 v23, v2

    move/from16 v0, v33

    goto :goto_16

    .line 1109
    .end local v31    # "type$iv":I
    .end local v33    # "count$iv$iv$iv$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "count$iv$iv$iv$iv":I
    .local v2, "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1d
    move/from16 v31, v2

    move-object/from16 v36, v3

    move-object/from16 v3, v29

    .line 1128
    .end local v2    # "type$iv":I
    .end local v29    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v3, "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_16
    nop

    .line 1108
    .end local v3    # "next$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v30    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv$iv$iv":I
    nop

    .line 1129
    invoke-virtual/range {v28 .. v28}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v28

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto :goto_12

    .line 1131
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "type$iv":I
    .local v3, "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1e
    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 1132
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v26    # "this_$iv$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v27    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v28    # "node$iv$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x1

    if-ne v0, v2, :cond_20

    .line 1134
    move-object/from16 v0, v25

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto/16 :goto_10

    .line 1102
    .end local v0    # "count$iv$iv$iv$iv":I
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_1f
    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 1137
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_20
    :goto_17
    invoke-static/range {v23 .. v23}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, v25

    move/from16 v2, v31

    move-object/from16 v3, v36

    goto/16 :goto_10

    .line 1139
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_21
    move-object/from16 v25, v0

    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 1083
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v6    # "node$iv$iv$iv$iv":Ljava/lang/Object;
    .end local v21    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v22    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v23    # "stack$iv$iv$iv$iv":Ljava/lang/Object;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    nop

    .line 1093
    .end local v19    # "it$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v20    # "$i$a$-visitAncestors-DelegatableNodeKt$visitAncestors$2$iv$iv$iv":I
    goto :goto_18

    .line 1092
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_22
    move-object/from16 v25, v0

    move/from16 v31, v2

    move-object/from16 v36, v3

    .line 1140
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_18
    invoke-virtual/range {v36 .. v36}, Landroidx/compose/ui/Modifier$Node;->getParent$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v3

    move-object/from16 v0, v25

    move/from16 v2, v31

    const/4 v6, 0x0

    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_f

    .line 1091
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_23
    move-object/from16 v25, v0

    move/from16 v31, v2

    move-object/from16 v36, v3

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    .restart local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto :goto_19

    .line 1090
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .end local v36    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    .restart local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :cond_24
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 1143
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    :goto_19
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getParent$ui_release()Landroidx/compose/ui/node/LayoutNode;

    move-result-object v17

    .line 1144
    if-eqz v17, :cond_25

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/LayoutNode;->getNodes$ui_release()Landroidx/compose/ui/node/NodeChain;

    move-result-object v0

    if-eqz v0, :cond_25

    invoke-virtual {v0}, Landroidx/compose/ui/node/NodeChain;->getTail$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    goto :goto_1a

    :cond_25
    const/4 v0, 0x0

    :goto_1a
    move-object v3, v0

    move-object/from16 v0, v25

    move/from16 v2, v31

    const/4 v6, 0x0

    .end local v18    # "head$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    goto/16 :goto_e

    .line 1146
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    .restart local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v2    # "type$iv":I
    :cond_26
    move-object/from16 v25, v0

    move/from16 v31, v2

    .line 1083
    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .end local v3    # "node$iv$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "mask$iv$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v17    # "layout$iv$iv$iv$iv":Landroidx/compose/ui/node/LayoutNode;
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    nop

    .line 1147
    .end local v11    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "includeSelf$iv$iv$iv":Z
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    nop

    .line 1076
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    nop

    .line 1148
    .local v10, "ancestors$iv":Ljava/util/List;
    if-eqz v10, :cond_2a

    move-object v0, v10

    .local v0, "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1149
    .local v2, "$i$f$fastForEachReversed":I
    nop

    .line 1150
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-ltz v3, :cond_29

    :cond_27
    move v6, v3

    .local v6, "index$iv$iv":I
    add-int/lit8 v3, v3, -0x1

    .line 1151
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1152
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v11, 0x0

    .line 311
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$2":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v12

    if-eqz v12, :cond_28

    const/16 v32, 0x1

    return v32

    .line 1152
    .end local v9    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$2":I
    :cond_28
    nop

    .line 1150
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    if-gez v3, :cond_27

    .line 1154
    .end local v6    # "index$iv$iv":I
    :cond_29
    nop

    .line 1155
    .end local v0    # "$this$fastForEachReversed$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEachReversed":I
    :cond_2a
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1156
    .local v2, "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1157
    .local v3, "stack$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .local v6, "node$iv$iv":Ljava/lang/Object;
    move-object v6, v0

    .line 1158
    :goto_1b
    if-eqz v6, :cond_38

    .line 1159
    instance-of v8, v6, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v8, :cond_2c

    .line 1160
    move-object v8, v6

    check-cast v8, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v9, 0x0

    .line 311
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$2":I
    invoke-interface {v8, v1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onPreRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v11

    if-eqz v11, :cond_2b

    const/16 v32, 0x1

    return v32

    .line 1160
    .end local v8    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$2":I
    :cond_2b
    move-object/from16 v16, v0

    move/from16 v18, v2

    goto/16 :goto_21

    .line 1161
    :cond_2c
    move-object v8, v6

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 1103
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_2d

    const/4 v8, 0x1

    goto :goto_1c

    :cond_2d
    const/4 v8, 0x0

    .line 1161
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1c
    if-eqz v8, :cond_37

    instance-of v8, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_37

    .line 1166
    const/4 v8, 0x0

    .line 1167
    .local v8, "count$iv$iv":I
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 1168
    .local v11, "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1169
    .local v12, "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_1d
    if-eqz v12, :cond_35

    .line 1170
    move-object v13, v12

    .local v13, "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1171
    .local v14, "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 1103
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_2e

    const/4 v15, 0x1

    goto :goto_1e

    :cond_2e
    const/4 v15, 0x0

    .line 1171
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_1e
    if-eqz v15, :cond_33

    .line 1172
    add-int/lit8 v8, v8, 0x1

    .line 1173
    const/4 v15, 0x1

    if-ne v8, v15, :cond_2f

    .line 1174
    move-object v6, v13

    move-object/from16 v16, v0

    move/from16 v18, v2

    goto :goto_20

    .line 1178
    :cond_2f
    if-nez v3, :cond_30

    const/4 v15, 0x0

    .line 1179
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 1180
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 1181
    .local v17, "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v18, "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .local v19, "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .local v20, "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1179
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_1f

    .line 1178
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_30
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_1f
    move-object v3, v2

    .line 1182
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v6

    .line 1183
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_32

    .line 1184
    if-eqz v3, :cond_31

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1185
    :cond_31
    const/4 v2, 0x0

    move-object v6, v2

    .line 1187
    :cond_32
    if-eqz v3, :cond_34

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_20

    .line 1171
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_33
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1190
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_34
    :goto_20
    nop

    .line 1170
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1191
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto :goto_1d

    .line 1193
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_35
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1194
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_36

    .line 1196
    move-object/from16 v0, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_1b

    .line 1194
    :cond_36
    move-object/from16 v3, v19

    goto :goto_21

    .line 1161
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_37
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1199
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_21
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_1b

    .line 1201
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_38
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1202
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v6    # "node$iv$iv":Ljava/lang/Object;
    const/4 v0, 0x0

    .line 312
    .local v0, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$3":I
    nop

    .line 1202
    .end local v0    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$3":I
    nop

    .line 1203
    invoke-interface/range {v25 .. v25}, Landroidx/compose/ui/node/DelegatableNode;->getNode()Landroidx/compose/ui/Modifier$Node;

    move-result-object v0

    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v2, 0x0

    .line 1204
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    const/4 v3, 0x0

    .line 1205
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v6, 0x0

    .restart local v6    # "node$iv$iv":Ljava/lang/Object;
    move-object v6, v0

    .line 1206
    :goto_22
    if-eqz v6, :cond_46

    .line 1207
    instance-of v8, v6, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    if-eqz v8, :cond_3a

    .line 1208
    move-object v8, v6

    check-cast v8, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v8, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v9, 0x0

    .line 313
    .local v9, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$4":I
    invoke-interface {v8, v1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v11

    if-eqz v11, :cond_39

    const/16 v32, 0x1

    return v32

    .line 1208
    .end local v8    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v9    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$4":I
    :cond_39
    move-object/from16 v16, v0

    move/from16 v18, v2

    goto/16 :goto_28

    .line 1209
    :cond_3a
    move-object v8, v6

    .local v8, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v9, 0x0

    .line 1103
    .local v9, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v8}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v11

    and-int v11, v11, v31

    if-eqz v11, :cond_3b

    const/4 v8, 0x1

    goto :goto_23

    :cond_3b
    const/4 v8, 0x0

    .line 1209
    .end local v8    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v9    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_23
    if-eqz v8, :cond_45

    instance-of v8, v6, Landroidx/compose/ui/node/DelegatingNode;

    if-eqz v8, :cond_45

    .line 1214
    const/4 v8, 0x0

    .line 1215
    .local v8, "count$iv$iv":I
    move-object v9, v6

    check-cast v9, Landroidx/compose/ui/node/DelegatingNode;

    .local v9, "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    const/4 v11, 0x0

    .line 1216
    .restart local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    invoke-virtual {v9}, Landroidx/compose/ui/node/DelegatingNode;->getDelegate$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    .line 1217
    .restart local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    :goto_24
    if-eqz v12, :cond_43

    .line 1218
    move-object v13, v12

    .restart local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/4 v14, 0x0

    .line 1219
    .restart local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    move-object v15, v13

    .local v15, "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v16, 0x0

    .line 1103
    .local v16, "$i$f$isKind-H91voCI$ui_release":I
    invoke-virtual {v15}, Landroidx/compose/ui/Modifier$Node;->getKindSet$ui_release()I

    move-result v17

    and-int v17, v17, v31

    if-eqz v17, :cond_3c

    const/4 v15, 0x1

    goto :goto_25

    :cond_3c
    const/4 v15, 0x0

    .line 1219
    .end local v15    # "this_$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v16    # "$i$f$isKind-H91voCI$ui_release":I
    :goto_25
    if-eqz v15, :cond_41

    .line 1220
    add-int/lit8 v8, v8, 0x1

    .line 1221
    const/4 v15, 0x1

    if-ne v8, v15, :cond_3d

    .line 1222
    move-object v6, v13

    move-object/from16 v16, v0

    move/from16 v18, v2

    goto :goto_27

    .line 1226
    :cond_3d
    if-nez v3, :cond_3e

    const/4 v15, 0x0

    .line 1227
    .local v15, "$i$f$mutableVectorOf":I
    nop

    .line 1228
    move-object/from16 v16, v0

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .local v16, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    const/16 v0, 0x10

    .local v0, "capacity$iv$iv$iv$iv":I
    const/16 v17, 0x0

    .line 1229
    .restart local v17    # "$i$f$MutableVector":I
    move/from16 v18, v2

    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    new-instance v2, Landroidx/compose/runtime/collection/MutableVector;

    move-object/from16 v19, v3

    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    new-array v3, v0, [Landroidx/compose/ui/Modifier$Node;

    move/from16 v20, v0

    const/4 v0, 0x0

    .end local v0    # "capacity$iv$iv$iv$iv":I
    .restart local v20    # "capacity$iv$iv$iv$iv":I
    invoke-direct {v2, v3, v0}, Landroidx/compose/runtime/collection/MutableVector;-><init>([Ljava/lang/Object;I)V

    .line 1227
    .end local v17    # "$i$f$MutableVector":I
    .end local v20    # "capacity$iv$iv$iv$iv":I
    goto :goto_26

    .line 1226
    .end local v15    # "$i$f$mutableVectorOf":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_3e
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    move-object/from16 v2, v19

    :goto_26
    move-object v3, v2

    .line 1230
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    move-object v0, v6

    .line 1231
    .local v0, "theNode$iv$iv":Landroidx/compose/ui/Modifier$Node;
    if-eqz v0, :cond_40

    .line 1232
    if-eqz v3, :cond_3f

    invoke-virtual {v3, v0}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    .line 1233
    :cond_3f
    const/4 v2, 0x0

    move-object v6, v2

    .line 1235
    :cond_40
    if-eqz v3, :cond_42

    invoke-virtual {v3, v13}, Landroidx/compose/runtime/collection/MutableVector;->add(Ljava/lang/Object;)Z

    goto :goto_27

    .line 1219
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .local v0, "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_41
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1238
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_42
    :goto_27
    nop

    .line 1218
    .end local v13    # "next$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v14    # "$i$a$-forEachImmediateDelegate$ui_release-DelegatableNodeKt$dispatchForKind$1$iv$iv":I
    nop

    .line 1239
    invoke-virtual {v12}, Landroidx/compose/ui/Modifier$Node;->getChild$ui_release()Landroidx/compose/ui/Modifier$Node;

    move-result-object v12

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto :goto_24

    .line 1241
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_43
    move-object/from16 v16, v0

    move/from16 v18, v2

    move-object/from16 v19, v3

    .line 1242
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v9    # "this_$iv$iv$iv":Landroidx/compose/ui/node/DelegatingNode;
    .end local v11    # "$i$f$forEachImmediateDelegate$ui_release":I
    .end local v12    # "node$iv$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v19    # "stack$iv$iv":Ljava/lang/Object;
    const/4 v2, 0x1

    if-ne v8, v2, :cond_44

    .line 1244
    move-object/from16 v0, v16

    move/from16 v2, v18

    move-object/from16 v3, v19

    goto/16 :goto_22

    .line 1242
    :cond_44
    move-object/from16 v3, v19

    goto :goto_28

    .line 1209
    .end local v8    # "count$iv$iv":I
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v19    # "stack$iv$iv":Ljava/lang/Object;
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v3    # "stack$iv$iv":Ljava/lang/Object;
    :cond_45
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1247
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    :goto_28
    invoke-static {v3}, Landroidx/compose/ui/node/DelegatableNodeKt;->access$pop(Landroidx/compose/runtime/collection/MutableVector;)Landroidx/compose/ui/Modifier$Node;

    move-result-object v6

    move-object/from16 v0, v16

    move/from16 v2, v18

    goto/16 :goto_22

    .line 1249
    .end local v16    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v18    # "$i$f$dispatchForKind-6rFNWt0":I
    .restart local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .restart local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    :cond_46
    move-object/from16 v16, v0

    move/from16 v18, v2

    .line 1250
    .end local v0    # "$this$dispatchForKind_u2d6rFNWt0$iv$iv":Landroidx/compose/ui/Modifier$Node;
    .end local v2    # "$i$f$dispatchForKind-6rFNWt0":I
    .end local v3    # "stack$iv$iv":Ljava/lang/Object;
    .end local v6    # "node$iv$iv":Ljava/lang/Object;
    if-eqz v10, :cond_49

    move-object v0, v10

    .local v0, "$this$fastForEach$iv$iv":Ljava/util/List;
    const/4 v2, 0x0

    .line 1251
    .local v2, "$i$f$fastForEach":I
    nop

    .line 1252
    const/4 v3, 0x0

    .local v3, "index$iv$iv":I
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    :goto_29
    if-ge v3, v6, :cond_48

    .line 1253
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    .line 1254
    .local v8, "item$iv$iv":Ljava/lang/Object;
    move-object v9, v8

    check-cast v9, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;

    .local v9, "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    const/4 v11, 0x0

    .line 313
    .local v11, "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$4":I
    invoke-interface {v9, v1}, Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;->onRotaryScrollEvent(Landroidx/compose/ui/input/rotary/RotaryScrollEvent;)Z

    move-result v12

    if-eqz v12, :cond_47

    const/16 v32, 0x1

    return v32

    :cond_47
    const/16 v32, 0x1

    .line 1254
    .end local v9    # "it":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    .end local v11    # "$i$a$-traverseAncestorsIncludingSelf-QFhIj7k-FocusOwnerImpl$dispatchRotaryEvent$4":I
    nop

    .line 1252
    .end local v8    # "item$iv$iv":Ljava/lang/Object;
    add-int/lit8 v3, v3, 0x1

    goto :goto_29

    .line 1256
    .end local v3    # "index$iv$iv":I
    :cond_48
    nop

    .line 1257
    .end local v0    # "$this$fastForEach$iv$iv":Ljava/util/List;
    .end local v2    # "$i$f$fastForEach":I
    :cond_49
    nop

    .end local v4    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v10    # "ancestors$iv":Ljava/util/List;
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    goto :goto_2a

    .line 1085
    .local v0, "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v2, "type$iv":I
    .restart local v4    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .restart local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .local v8, "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v9, "$i$f$ancestors-64DMado":I
    .local v10, "result$iv$iv":Ljava/lang/Object;
    .local v11, "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v12, "includeSelf$iv$iv$iv":Z
    .local v13, "$i$f$visitAncestors-Y-YKmho":I
    .local v14, "mask$iv$iv$iv$iv":I
    .local v15, "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .local v16, "$i$f$visitAncestors":I
    :cond_4a
    move-object/from16 v25, v0

    move/from16 v31, v2

    .end local v0    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v2    # "type$iv":I
    .restart local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .restart local v31    # "type$iv":I
    const/4 v0, 0x0

    .line 1084
    .local v0, "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    nop

    .end local v0    # "$i$a$-check-DelegatableNodeKt$visitAncestors$1$iv$iv$iv$iv":I
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 316
    .end local v4    # "this_$iv":Landroidx/compose/ui/focus/FocusOwnerImpl;
    .end local v7    # "$i$f$traverseAncestorsIncludingSelf-QFhIj7k":I
    .end local v8    # "$this$ancestors_u2d64DMado$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v9    # "$i$f$ancestors-64DMado":I
    .end local v10    # "result$iv$iv":Ljava/lang/Object;
    .end local v11    # "$this$visitAncestors_u2dY_u2dYKmho_u24default$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v12    # "includeSelf$iv$iv$iv":Z
    .end local v13    # "$i$f$visitAncestors-Y-YKmho":I
    .end local v14    # "mask$iv$iv$iv$iv":I
    .end local v15    # "$this$visitAncestors$iv$iv$iv$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v16    # "$i$f$visitAncestors":I
    .end local v25    # "$this$traverseAncestorsIncludingSelf_u2dQFhIj7k$iv":Landroidx/compose/ui/node/DelegatableNode;
    .end local v31    # "type$iv":I
    :cond_4b
    :goto_2a
    const/16 v24, 0x0

    return v24

    .line 302
    .end local v5    # "focusedRotaryInputNode":Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;
    :cond_4c
    const/4 v0, 0x0

    .line 303
    .local v0, "$i$a$-check-FocusOwnerImpl$dispatchRotaryEvent$1":I
    nop

    .line 302
    .end local v0    # "$i$a$-check-FocusOwnerImpl$dispatchRotaryEvent$1":I
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Dispatching rotary event while focus system is invalidated."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;
    .locals 6
    .param p1, "focusDirection"    # I
    .param p2, "focusedRect"    # Landroidx/compose/ui/geometry/Rect;
    .param p3, "onFound"    # Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/compose/ui/geometry/Rect;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/compose/ui/focus/FocusTargetNode;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    .line 237
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    move-object v2, v0

    .local v2, "it":Landroidx/compose/ui/focus/FocusTargetNode;
    const/4 v3, 0x0

    .line 239
    .local v3, "$i$a$-also-FocusOwnerImpl$focusSearch$source$1":I
    iget-object v4, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lkotlin/jvm/functions/Function0;

    invoke-interface {v4}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/compose/ui/unit/LayoutDirection;

    invoke-static {v2, p1, v4}, Landroidx/compose/ui/focus/FocusTraversalKt;->customFocusSearch--OM-vw8(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v4

    .line 240
    .local v4, "customDest":Landroidx/compose/ui/focus/FocusRequester;
    nop

    .line 241
    sget-object v5, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v5}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getCancel()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    return-object v1

    .line 242
    :cond_0
    sget-object v1, Landroidx/compose/ui/focus/FocusRequester;->Companion:Landroidx/compose/ui/focus/FocusRequester$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/focus/FocusRequester$Companion;->getDefault()Landroidx/compose/ui/focus/FocusRequester;

    move-result-object v1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 243
    invoke-virtual {v4, p3}, Landroidx/compose/ui/focus/FocusRequester;->findFocusTargetNode$ui_release(Lkotlin/jvm/functions/Function1;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 245
    .end local v4    # "customDest":Landroidx/compose/ui/focus/FocusRequester;
    :cond_1
    nop

    .line 237
    .end local v2    # "it":Landroidx/compose/ui/focus/FocusTargetNode;
    .end local v3    # "$i$a$-also-FocusOwnerImpl$focusSearch$source$1":I
    goto :goto_0

    :cond_2
    move-object v0, v1

    .line 247
    .local v0, "source":Landroidx/compose/ui/focus/FocusTargetNode;
    :goto_0
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onLayoutDirection:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/unit/LayoutDirection;

    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$focusSearch$1;

    invoke-direct {v3, v0, p0, p3}, Landroidx/compose/ui/focus/FocusOwnerImpl$focusSearch$1;-><init>(Landroidx/compose/ui/focus/FocusTargetNode;Landroidx/compose/ui/focus/FocusOwnerImpl;Lkotlin/jvm/functions/Function1;)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, p1, v2, p2, v3}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusSearch-0X8WOeE(Landroidx/compose/ui/focus/FocusTargetNode;ILandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v1

    return-object v1
.end method

.method public getFocusRect()Landroidx/compose/ui/geometry/Rect;
    .locals 1

    .line 370
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->findActiveFocusNode(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/focus/FocusTargetNode;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTraversalKt;->focusRect(Landroidx/compose/ui/focus/FocusTargetNode;)Landroidx/compose/ui/geometry/Rect;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;
    .locals 1

    .line 73
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusTransactionManager:Landroidx/compose/ui/focus/FocusTransactionManager;

    return-object v0
.end method

.method public getModifier()Landroidx/compose/ui/Modifier;
    .locals 1

    .line 80
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->modifier:Landroidx/compose/ui/Modifier;

    return-object v0
.end method

.method public final getRootFocusNode$ui_release()Landroidx/compose/ui/focus/FocusTargetNode;
    .locals 1

    .line 66
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-object v0
.end method

.method public getRootState()Landroidx/compose/ui/focus/FocusState;
    .locals 1

    .line 374
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-virtual {v0}, Landroidx/compose/ui/focus/FocusTargetNode;->getFocusState()Landroidx/compose/ui/focus/FocusStateImpl;

    move-result-object v0

    check-cast v0, Landroidx/compose/ui/focus/FocusState;

    return-object v0
.end method

.method public moveFocus-3ESFkO8(I)Z
    .locals 6
    .param p1, "focusDirection"    # I

    .line 202
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .local v0, "requestFocusSuccess":Lkotlin/jvm/internal/Ref$ObjectRef;
    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iput-object v2, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 203
    iget-object v2, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onFocusRectInterop:Lkotlin/jvm/functions/Function0;

    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/geometry/Rect;

    new-instance v3, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$focusSearchSuccess$1;

    invoke-direct {v3, v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$moveFocus$focusSearchSuccess$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;I)V

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1, v2, v3}, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v2

    .line 210
    .local v2, "focusSearchSuccess":Ljava/lang/Boolean;
    if-eqz v2, :cond_4

    iget-object v3, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    if-nez v3, :cond_0

    goto :goto_0

    .line 213
    :cond_0
    const/4 v3, 0x1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    return v3

    .line 216
    :cond_1
    invoke-static {p1}, Landroidx/compose/ui/focus/FocusOwnerImplKt;->is1dFocusSearch-3ESFkO8(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 217
    nop

    .line 218
    nop

    .line 219
    nop

    .line 220
    nop

    .line 221
    nop

    .line 217
    invoke-virtual {p0, v1, v3, v1, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl;->clearFocus-I7lrPNg(ZZZI)Z

    move-result v4

    .line 223
    .local v4, "clearFocus":Z
    if-eqz v4, :cond_2

    const/4 v5, 0x0

    invoke-virtual {p0, p1, v5}, Landroidx/compose/ui/focus/FocusOwnerImpl;->takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v1, v3

    :cond_2
    return v1

    .line 229
    .end local v4    # "clearFocus":Z
    :cond_3
    iget-object v1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onMoveFocusInterop:Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Landroidx/compose/ui/focus/FocusDirection;->box-impl(I)Landroidx/compose/ui/focus/FocusDirection;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    return v1

    .line 210
    :cond_4
    :goto_0
    return v1
.end method

.method public releaseFocus()V
    .locals 6

    .line 148
    invoke-virtual {p0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->getFocusTransactionManager()Landroidx/compose/ui/focus/FocusTransactionManager;

    move-result-object v0

    .line 420
    .local v0, "$this$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    nop

    .line 421
    const/4 v1, 0x0

    .line 420
    .local v1, "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    const/4 v2, 0x0

    .line 424
    .local v2, "$i$f$withExistingTransaction":I
    nop

    .line 428
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$getOngoingTransaction$p(Landroidx/compose/ui/focus/FocusTransactionManager;)Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    .line 149
    .local v3, "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v5, v4, v4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z

    .line 428
    .end local v3    # "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    goto :goto_0

    .line 429
    :cond_0
    :try_start_0
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$beginTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 430
    const/4 v3, 0x0

    .line 149
    .restart local v3    # "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    iget-object v5, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    invoke-static {v5, v4, v4}, Landroidx/compose/ui/focus/FocusTransactionsKt;->clearFocus(Landroidx/compose/ui/focus/FocusTargetNode;ZZ)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 430
    .end local v3    # "$i$a$-withExistingTransaction$default-FocusOwnerImpl$releaseFocus$1":I
    nop

    .line 432
    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    .line 433
    nop

    .line 428
    :goto_0
    nop

    .line 151
    .end local v0    # "$this$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .end local v1    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .end local v2    # "$i$f$withExistingTransaction":I
    return-void

    .line 432
    .restart local v0    # "$this$iv":Landroidx/compose/ui/focus/FocusTransactionManager;
    .restart local v1    # "onCancelled$iv":Lkotlin/jvm/functions/Function0;
    .restart local v2    # "$i$f$withExistingTransaction":I
    :catchall_0
    move-exception v3

    invoke-static {v0}, Landroidx/compose/ui/focus/FocusTransactionManager;->access$commitTransaction(Landroidx/compose/ui/focus/FocusTransactionManager;)V

    throw v3
.end method

.method public requestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z
    .locals 1
    .param p1, "focusDirection"    # Landroidx/compose/ui/focus/FocusDirection;
    .param p2, "previouslyFocusedRect"    # Landroidx/compose/ui/geometry/Rect;

    .line 111
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->onRequestFocusForOwner:Lkotlin/jvm/functions/Function2;

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusEventModifierNode;

    .line 324
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusEventModifierNode;)V

    .line 325
    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusPropertiesModifierNode;

    .line 328
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V

    .line 329
    return-void
.end method

.method public scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 1
    .param p1, "node"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 320
    iget-object v0, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusInvalidationManager:Landroidx/compose/ui/focus/FocusInvalidationManager;

    invoke-virtual {v0, p1}, Landroidx/compose/ui/focus/FocusInvalidationManager;->scheduleInvalidation(Landroidx/compose/ui/focus/FocusTargetNode;)V

    .line 321
    return-void
.end method

.method public final setRootFocusNode$ui_release(Landroidx/compose/ui/focus/FocusTargetNode;)V
    .locals 0
    .param p1, "<set-?>"    # Landroidx/compose/ui/focus/FocusTargetNode;

    .line 66
    iput-object p1, p0, Landroidx/compose/ui/focus/FocusOwnerImpl;->rootFocusNode:Landroidx/compose/ui/focus/FocusTargetNode;

    return-void
.end method

.method public takeFocus-aToIllA(ILandroidx/compose/ui/geometry/Rect;)Z
    .locals 1
    .param p1, "focusDirection"    # I
    .param p2, "previouslyFocusedRect"    # Landroidx/compose/ui/geometry/Rect;

    .line 136
    new-instance v0, Landroidx/compose/ui/focus/FocusOwnerImpl$takeFocus$1;

    invoke-direct {v0, p1}, Landroidx/compose/ui/focus/FocusOwnerImpl$takeFocus$1;-><init>(I)V

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0, p1, p2, v0}, Landroidx/compose/ui/focus/FocusOwnerImpl;->focusSearch-ULY8qGw(ILandroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function1;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    .line 138
    :cond_0
    const/4 v0, 0x0

    .line 136
    :goto_0
    return v0
.end method
