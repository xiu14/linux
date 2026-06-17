.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$10$4;
.super Ljava/lang/Object;
.source "MainActivity.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stshell/app/MainActivityKt;->StWebViewScreen(Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentialsStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$10$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,840:1\n149#2:841\n86#3:842\n82#3,7:843\n89#3:878\n93#3:882\n79#4,6:850\n86#4,4:865\n90#4,2:875\n94#4:881\n368#5,9:856\n377#5:877\n378#5,2:879\n4034#6,6:869\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$10$4\n*L\n681#1:841\n681#1:842\n681#1:843,7\n681#1:878\n681#1:882\n681#1:850,6\n681#1:865,4\n681#1:875,2\n681#1:881\n681#1:856,9\n681#1:877\n681#1:879,2\n681#1:869,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $request:Lcom/stshell/app/SslRequestState;


# direct methods
.method constructor <init>(Lcom/stshell/app/SslRequestState;)V
    .locals 0

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$10$4;->$request:Lcom/stshell/app/SslRequestState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 680
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$10$4;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 49
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p1

    move/from16 v1, p2

    const-string v2, "C680@27038L298:MainActivity.kt#r5p2a3"

    invoke-static {v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 681
    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    .line 685
    :cond_0
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_4

    .line 681
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stshell.app.StWebViewScreen.<anonymous>.<anonymous> (MainActivity.kt:680)"

    const v4, -0x6f9c9d44

    invoke-static {v4, v1, v2, v3}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    sget-object v2, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    const/16 v3, 0xc

    .local v3, "$this$dp\\1":I
    const/4 v4, 0x0

    .line 841
    .local v4, "$i$f$getDp\\1\\681":I
    int-to-float v5, v3

    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 681
    .end local v3    # "$this$dp\\1":I
    .end local v4    # "$i$f$getDp\\1\\681":I
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    move-object/from16 v3, p0

    .local v2, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    iget-object v4, v3, Lcom/stshell/app/MainActivityKt$StWebViewScreen$10$4;->$request:Lcom/stshell/app/SslRequestState;

    const/16 v5, 0x30

    .local v5, "$changed\\2":I
    const/4 v6, 0x0

    .line 842
    .local v6, "$i$f$Column\\2\\681":I
    const v7, -0x1cd0f17e

    const-string v8, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    invoke-static {v0, v7, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 843
    sget-object v7, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v7, Landroidx/compose/ui/Modifier;

    .line 845
    .local v7, "modifier\\2":Landroidx/compose/ui/Modifier;
    sget-object v8, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v8}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v8

    .line 848
    .local v8, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    shr-int/lit8 v9, v5, 0x3

    and-int/lit8 v9, v9, 0xe

    shr-int/lit8 v10, v5, 0x3

    and-int/lit8 v10, v10, 0x70

    or-int/2addr v9, v10

    invoke-static {v2, v8, v0, v9}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v9

    .local v9, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v10, v5, 0x3

    and-int/lit8 v10, v10, 0x70

    .line 849
    nop

    .local v10, "$changed\\3":I
    const/4 v11, 0x0

    .line 850
    .local v11, "$i$f$Layout\\3\\849":I
    const v12, -0x4ee9b9da

    const-string v13, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v0, v12, v13}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 851
    const/4 v12, 0x0

    invoke-static {v0, v12}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v12

    .line 852
    .local v12, "compositeKeyHash\\3":I
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v13

    .line 853
    .local v13, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v0, v7}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    .line 855
    .local v14, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v15, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v15}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v15

    shl-int/lit8 v1, v10, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/lit8 v1, v1, 0x6

    .line 854
    nop

    .local v1, "$changed\\4":I
    .local v15, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v16, 0x0

    .line 856
    .local v16, "$i$f$ReusableComposeNode\\4\\854":I
    move/from16 v17, v1

    .end local v1    # "$changed\\4":I
    .local v17, "$changed\\4":I
    const v1, -0x2942ffcf

    move-object/from16 v18, v2

    .end local v2    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v18, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v0, v1, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 857
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v1

    instance-of v1, v1, Landroidx/compose/runtime/Applier;

    if-nez v1, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 858
    :cond_3
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 859
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 860
    invoke-interface {v0, v15}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 862
    :cond_4
    invoke-interface {v0}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 864
    :goto_1
    invoke-static {v0}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v1

    .local v1, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 865
    .local v2, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    sget-object v19, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v19 .. v19}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v9, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 866
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v13, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 868
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v19, 0x0

    .line 869
    .local v19, "$i$f$set-impl\\6\\868":I
    move-object/from16 v20, v1

    .local v20, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 870
    .local v21, "$i$a$-with-Updater$set$1\\7\\869\\6":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v22

    if-nez v22, :cond_6

    move/from16 v22, v2

    .end local v2    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    .local v22, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    invoke-interface/range {v20 .. v20}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v3, v20

    goto :goto_3

    .end local v22    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    .restart local v2    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    :cond_6
    move/from16 v22, v2

    .line 871
    .end local v2    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    .restart local v22    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    :goto_2
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v3, v20

    .end local v20    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v2}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 872
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 874
    :goto_3
    nop

    .line 869
    .end local v3    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-with-Updater$set$1\\7\\869\\6":I
    nop

    .line 874
    nop

    .line 875
    .end local v0    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v19    # "$i$f$set-impl\\6\\868":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v1, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 876
    nop

    .line 864
    .end local v1    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v22    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\864\\3":I
    nop

    .line 877
    shr-int/lit8 v0, v17, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\8":I
    move-object/from16 v1, p1

    .local v1, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 878
    .local v2, "$i$a$-Layout-ColumnKt$Column$1\\8\\877\\2":I
    const v3, -0x16ef5699

    move/from16 v19, v0

    .end local v0    # "$changed\\8":I
    .local v19, "$changed\\8":I
    const-string v0, "C88@4444L9:Column.kt#2w3rfo"

    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shr-int/lit8 v3, v5, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    .local v3, "$changed\\9":I
    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .local v0, "$this$invoke_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    move-object/from16 v41, v1

    .local v41, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v45, 0x0

    .line 682
    .local v45, "$i$a$-Column-MainActivityKt$StWebViewScreen$10$4$1\\9\\878\\0":I
    move-object/from16 v46, v0

    .end local v0    # "$this$invoke_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .local v46, "$this$invoke_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    const v0, 0x62f83513

    move-object/from16 v47, v1

    .end local v1    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v47, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v1, "C681@27118L22,682@27214L10,682@27161L75,683@27297L10,683@27257L61:MainActivity.kt#r5p2a3"

    move/from16 v48, v2

    move-object/from16 v2, v41

    .end local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v48, "$i$a$-Layout-ColumnKt$Column$1\\8\\877\\2":I
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/16 v43, 0x0

    const v44, 0x1fffe

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const-wide/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v42, 0x6

    const-string v20, "\u8fd9\u4e2a\u7ad9\u70b9\u7684\u8bc1\u4e66\u6821\u9a8c\u6ca1\u6709\u901a\u8fc7\u3002"

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v20 .. v44}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 683
    .end local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-virtual {v4}, Lcom/stshell/app/SslRequestState;->getErrorDescription()Ljava/lang/String;

    move-result-object v20

    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getBodyMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v40

    const v44, 0xfffe

    const/16 v42, 0x0

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v20 .. v44}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 684
    .end local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-virtual {v4}, Lcom/stshell/app/SslRequestState;->getUrl()Ljava/lang/String;

    move-result-object v20

    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v40

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v20 .. v44}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 682
    .end local v41    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 685
    nop

    .line 878
    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v3    # "$changed\\9":I
    .end local v45    # "$i$a$-Column-MainActivityKt$StWebViewScreen$10$4$1\\9\\878\\0":I
    .end local v46    # "$this$invoke_u24lambda_u240\\9":Landroidx/compose/foundation/layout/ColumnScope;
    invoke-static/range {v47 .. v47}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 877
    .end local v19    # "$changed\\8":I
    .end local v47    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v48    # "$i$a$-Layout-ColumnKt$Column$1\\8\\877\\2":I
    nop

    .line 879
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 856
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 880
    nop

    .line 850
    .end local v15    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .end local v16    # "$i$f$ReusableComposeNode\\4\\854":I
    .end local v17    # "$changed\\4":I
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 881
    nop

    .line 842
    .end local v10    # "$changed\\3":I
    .end local v11    # "$i$f$Layout\\3\\849":I
    .end local v12    # "compositeKeyHash\\3":I
    .end local v13    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v14    # "materialized\\3":Landroidx/compose/ui/Modifier;
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 882
    nop

    .end local v5    # "$changed\\2":I
    .end local v6    # "$i$f$Column\\2\\681":I
    .end local v7    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .end local v8    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v9    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v18    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 686
    :cond_7
    :goto_4
    return-void
.end method
