.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;
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
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$9$5\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,840:1\n149#2:841\n86#3:842\n84#3,5:843\n89#3:876\n93#3:893\n79#4,6:848\n86#4,4:863\n90#4,2:873\n94#4:892\n368#5,9:854\n377#5:875\n378#5,2:890\n4034#6,6:867\n1#7:877\n1225#8,6:878\n1225#8,6:884\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$9$5\n*L\n623#1:841\n621#1:842\n621#1:843,5\n621#1:876\n621#1:893\n621#1:848,6\n621#1:863,4\n621#1:873,2\n621#1:892\n621#1:854,9\n621#1:875\n621#1:890,2\n621#1:867,6\n631#1:878,6\n638#1:884,6\n*E\n"
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
.field final synthetic $authPassword$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $authUsername$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $request:Lcom/stshell/app/HttpAuthRequestState;


# direct methods
.method public static synthetic $r8$lambda$PZVPO6jFVoTHq6My4vTMHiTmbpQ(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->invoke$lambda$5$lambda$4$lambda$3(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$wcfS2N_uKGSwhYfVWHULAoi2590(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->invoke$lambda$5$lambda$2$lambda$1(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/stshell/app/HttpAuthRequestState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stshell/app/HttpAuthRequestState;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->$request:Lcom/stshell/app/HttpAuthRequestState;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$5$lambda$2$lambda$1(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$authUsername$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 631
    invoke-static {p0, p1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$16(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method private static final invoke$lambda$5$lambda$4$lambda$3(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1
    .param p0, "$authPassword$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "it"    # Ljava/lang/String;

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 638
    invoke-static {p0, p1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 620
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 58
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "C620@24664L1104:MainActivity.kt#r5p2a3"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 621
    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 644
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_9

    .line 621
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stshell.app.StWebViewScreen.<anonymous>.<anonymous> (MainActivity.kt:620)"

    const v5, 0x492dd10f

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 622
    :cond_2
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 623
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    const/16 v8, 0xc

    .local v8, "$this$dp\\1":I
    const/4 v9, 0x0

    .line 841
    .local v9, "$i$f$getDp\\1\\623":I
    int-to-float v10, v8

    invoke-static {v10}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v8

    .line 623
    .end local v8    # "$this$dp\\1":I
    .end local v9    # "$i$f$getDp\\1\\623":I
    invoke-virtual {v7, v8}, Landroidx/compose/foundation/layout/Arrangement;->spacedBy-0680j_4(F)Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v7

    check-cast v7, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 621
    iget-object v8, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->$request:Lcom/stshell/app/HttpAuthRequestState;

    iget-object v9, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v10, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    const/16 v11, 0x36

    .local v3, "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v7, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v11, "$changed\\2":I
    const/4 v12, 0x0

    .line 842
    .local v12, "$i$f$Column\\2\\621":I
    const v13, -0x1cd0f17e

    const-string v14, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo"

    invoke-static {v1, v13, v14}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 843
    sget-object v13, Landroidx/compose/ui/Alignment;->Companion:Landroidx/compose/ui/Alignment$Companion;

    invoke-virtual {v13}, Landroidx/compose/ui/Alignment$Companion;->getStart()Landroidx/compose/ui/Alignment$Horizontal;

    move-result-object v13

    .line 846
    .local v13, "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    shr-int/lit8 v14, v11, 0x3

    and-int/lit8 v14, v14, 0xe

    shr-int/lit8 v15, v11, 0x3

    and-int/lit8 v15, v15, 0x70

    or-int/2addr v14, v15

    invoke-static {v7, v13, v1, v14}, Landroidx/compose/foundation/layout/ColumnKt;->columnMeasurePolicy(Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/layout/MeasurePolicy;

    move-result-object v14

    .local v14, "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    shl-int/lit8 v15, v11, 0x3

    and-int/lit8 v15, v15, 0x70

    .line 847
    nop

    .local v15, "$changed\\3":I
    const/16 v16, 0x0

    .line 848
    .local v16, "$i$f$Layout\\3\\847":I
    const v4, -0x4ee9b9da

    const-string v5, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh"

    invoke-static {v1, v4, v5}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 849
    const/4 v4, 0x0

    invoke-static {v1, v4}, Landroidx/compose/runtime/ComposablesKt;->getCurrentCompositeKeyHash(Landroidx/compose/runtime/Composer;I)I

    move-result v5

    .line 850
    .local v5, "compositeKeyHash\\3":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v4

    .line 851
    .local v4, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v1, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 853
    .local v6, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v20, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v20 .. v20}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v20

    shl-int/lit8 v0, v15, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    .line 852
    move-object/from16 v21, v20

    .local v0, "$changed\\4":I
    .local v21, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v20, 0x0

    .line 854
    .local v20, "$i$f$ReusableComposeNode\\4\\852":I
    move/from16 v22, v0

    .end local v0    # "$changed\\4":I
    .local v22, "$changed\\4":I
    const v0, -0x2942ffcf

    const-string v2, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp"

    invoke-static {v1, v0, v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 855
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getApplier()Landroidx/compose/runtime/Applier;

    move-result-object v0

    instance-of v0, v0, Landroidx/compose/runtime/Applier;

    if-nez v0, :cond_3

    invoke-static {}, Landroidx/compose/runtime/ComposablesKt;->invalidApplier()V

    .line 856
    :cond_3
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->startReusableNode()V

    .line 857
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 858
    move-object/from16 v0, v21

    .end local v21    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v0, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 860
    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v21    # "factory\\4":Lkotlin/jvm/functions/Function0;
    :cond_4
    move-object/from16 v0, v21

    .end local v21    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 862
    :goto_1
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .local v2, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 863
    .local v21, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\862\\3":I
    sget-object v23, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v24, v0

    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v24, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v23 .. v23}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 864
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v4, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 866
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v23, 0x0

    .line 867
    .local v23, "$i$f$set-impl\\6\\866":I
    move-object/from16 v25, v2

    .local v25, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v26, 0x0

    .line 868
    .local v26, "$i$a$-with-Updater$set$1\\7\\867\\6":I
    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v27

    if-nez v27, :cond_6

    invoke-interface/range {v25 .. v25}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v27, v3

    .end local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v27, "modifier\\2":Landroidx/compose/ui/Modifier;
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v3, v25

    goto :goto_3

    .end local v27    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .restart local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    :cond_6
    move-object/from16 v27, v3

    .line 869
    .end local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .restart local v27    # "modifier\\2":Landroidx/compose/ui/Modifier;
    :goto_2
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v3, v25

    .end local v25    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 870
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 872
    :goto_3
    nop

    .line 867
    .end local v3    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v26    # "$i$a$-with-Updater$set$1\\7\\867\\6":I
    nop

    .line 872
    nop

    .line 873
    .end local v0    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v23    # "$i$f$set-impl\\6\\866":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 874
    nop

    .line 862
    .end local v2    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\862\\3":I
    nop

    .line 875
    shr-int/lit8 v0, v22, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\8":I
    move-object/from16 v1, p1

    .local v1, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 876
    .local v2, "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    const v3, -0x16ef5699

    move/from16 v21, v0

    .end local v0    # "$changed\\8":I
    .local v21, "$changed\\8":I
    const-string v0, "C88@4444L9:Column.kt#2w3rfo"

    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shr-int/lit8 v3, v11, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    .local v3, "$changed\\9":I
    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .local v0, "$this$invoke_u24lambda_u245\\9":Landroidx/compose/foundation/layout/ColumnScope;
    move-object/from16 v49, v1

    .local v49, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v23, 0x0

    .line 625
    .local v23, "$i$a$-Column-MainActivityKt$StWebViewScreen$9$5$1\\9\\876\\0":I
    move-object/from16 v25, v0

    .end local v0    # "$this$invoke_u24lambda_u245\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .local v25, "$this$invoke_u24lambda_u245\\9":Landroidx/compose/foundation/layout/ColumnScope;
    const v0, 0x62d60c0c

    move-object/from16 v26, v1

    .end local v1    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v26, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v1, "C626@24984L10,624@24839L189,630@25154L21,628@25049L301,637@25476L21,635@25371L379:MainActivity.kt#r5p2a3"

    move/from16 v56, v2

    move-object/from16 v2, v49

    .end local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v56, "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    .line 626
    invoke-virtual {v8}, Lcom/stshell/app/HttpAuthRequestState;->getRealm()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    move-object v1, v0

    .line 877
    .local v1, "it\\10":Ljava/lang/String;
    const/4 v8, 0x0

    .line 626
    .local v8, "$i$a$-takeIf-MainActivityKt$StWebViewScreen$9$5$1$1\\10\\626\\9":I
    move-object/from16 v28, v1

    check-cast v28, Ljava/lang/CharSequence;

    invoke-static/range {v28 .. v28}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v28

    .end local v1    # "it\\10":Ljava/lang/String;
    .end local v8    # "$i$a$-takeIf-MainActivityKt$StWebViewScreen$9$5$1$1\\10\\626\\9":I
    if-nez v28, :cond_7

    goto :goto_4

    :cond_7
    const/4 v0, 0x0

    :goto_4
    if-nez v0, :cond_9

    :cond_8
    const-string v0, "\u8fd9\u4e2a\u7ad9\u70b9\u9700\u8981\u7528\u6237\u540d\u548c\u5bc6\u7801\u3002"

    :cond_9
    move-object/from16 v28, v0

    .line 627
    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getBodyMedium()Landroidx/compose/ui/text/TextStyle;

    move-result-object v48

    .line 625
    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const-wide/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-wide/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const v52, 0xfffe

    move-object/from16 v49, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v28 .. v52}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 630
    .end local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static {v9}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$15(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v28

    .line 634
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    move/from16 v57, v3

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v8, 0x1

    .end local v3    # "$changed\\9":I
    .local v57, "$changed\\9":I
    invoke-static {v0, v1, v8, v3}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v30

    .line 630
    const v0, -0x2e5c0d43

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    .line 631
    nop

    .local v1, "invalid\\11":Z
    move-object v3, v2

    .local v3, "$this$cache\\11":Landroidx/compose/runtime/Composer;
    const/4 v8, 0x0

    .line 878
    .local v8, "$i$f$cache\\11\\631":I
    move/from16 v29, v1

    .end local v1    # "invalid\\11":Z
    .local v29, "invalid\\11":Z
    invoke-interface {v3}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    .local v1, "it\\11":Ljava/lang/Object;
    const/16 v31, 0x0

    .line 879
    .local v31, "$i$a$-let-ComposerKt$cache$1\\12\\878\\11":I
    if-nez v29, :cond_b

    sget-object v32, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v49, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v32 .. v32}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_a

    goto :goto_5

    .line 883
    :cond_a
    move-object/from16 v32, v1

    goto :goto_6

    .line 879
    .end local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    :cond_b
    move-object/from16 v49, v2

    .line 880
    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    :goto_5
    const/4 v2, 0x0

    .line 631
    .local v2, "$i$a$-cache-MainActivityKt$StWebViewScreen$9$5$1$2\\13\\880\\9":I
    move-object/from16 v32, v1

    .end local v1    # "it\\11":Ljava/lang/Object;
    .local v32, "it\\11":Ljava/lang/Object;
    new-instance v1, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5$$ExternalSyntheticLambda0;

    invoke-direct {v1, v9}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 880
    .end local v2    # "$i$a$-cache-MainActivityKt$StWebViewScreen$9$5$1$2\\13\\880\\9":I
    nop

    .line 881
    .local v1, "value\\12":Ljava/lang/Object;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 882
    nop

    .line 879
    .end local v1    # "value\\12":Ljava/lang/Object;
    :goto_6
    nop

    .line 878
    .end local v31    # "$i$a$-let-ComposerKt$cache$1\\12\\878\\11":I
    .end local v32    # "it\\11":Ljava/lang/Object;
    nop

    .line 631
    .end local v3    # "$this$cache\\11":Landroidx/compose/runtime/Composer;
    .end local v8    # "$i$f$cache\\11\\631":I
    .end local v29    # "invalid\\11":Z
    move-object/from16 v29, v1

    check-cast v29, Lkotlin/jvm/functions/Function1;

    invoke-interface/range {v49 .. v49}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 634
    sget-object v1, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v1}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-11$app_debug()Lkotlin/jvm/functions/Function2;

    move-result-object v34

    .line 633
    nop

    .line 629
    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x1

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    move-object/from16 v2, v49

    .end local v49    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v49, 0x0

    const/16 v50, 0x0

    const v52, 0x180180

    const/high16 v53, 0xc00000

    const/16 v54, 0x0

    const v55, 0x7dffb8

    move-object/from16 v51, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v51, "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v28 .. v55}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V

    .line 637
    .end local v51    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static {v10}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$19(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v28

    .line 641
    new-instance v1, Landroidx/compose/ui/text/input/PasswordVisualTransformation;

    const/4 v3, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    invoke-direct {v1, v3, v8, v9}, Landroidx/compose/ui/text/input/PasswordVisualTransformation;-><init>(CILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 642
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    move-object/from16 v18, v1

    const/4 v1, 0x0

    invoke-static {v3, v1, v8, v9}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v30

    .line 637
    const v1, -0x2e5be503

    invoke-interface {v2, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v2, v10}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    .line 638
    move-object v1, v2

    .local v0, "invalid\\14":Z
    .local v1, "$this$cache\\14":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 884
    .local v3, "$i$f$cache\\14\\638":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v8

    .local v8, "it\\14":Ljava/lang/Object;
    const/4 v9, 0x0

    .line 885
    .local v9, "$i$a$-let-ComposerKt$cache$1\\15\\884\\14":I
    if-nez v0, :cond_d

    sget-object v17, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move/from16 v19, v0

    .end local v0    # "invalid\\14":Z
    .local v19, "invalid\\14":Z
    invoke-virtual/range {v17 .. v17}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v8, v0, :cond_c

    goto :goto_7

    .line 889
    :cond_c
    move-object v0, v8

    goto :goto_8

    .line 885
    .end local v19    # "invalid\\14":Z
    .restart local v0    # "invalid\\14":Z
    :cond_d
    move/from16 v19, v0

    .line 886
    .end local v0    # "invalid\\14":Z
    .restart local v19    # "invalid\\14":Z
    :goto_7
    const/4 v0, 0x0

    .line 638
    .local v0, "$i$a$-cache-MainActivityKt$StWebViewScreen$9$5$1$3\\16\\886\\9":I
    move/from16 v17, v0

    .end local v0    # "$i$a$-cache-MainActivityKt$StWebViewScreen$9$5$1$3\\16\\886\\9":I
    .local v17, "$i$a$-cache-MainActivityKt$StWebViewScreen$9$5$1$3\\16\\886\\9":I
    new-instance v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5$$ExternalSyntheticLambda1;

    invoke-direct {v0, v10}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$5$$ExternalSyntheticLambda1;-><init>(Landroidx/compose/runtime/MutableState;)V

    .line 886
    .end local v17    # "$i$a$-cache-MainActivityKt$StWebViewScreen$9$5$1$3\\16\\886\\9":I
    nop

    .line 887
    .local v0, "value\\15":Ljava/lang/Object;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 888
    nop

    .line 885
    .end local v0    # "value\\15":Ljava/lang/Object;
    :goto_8
    nop

    .line 884
    .end local v8    # "it\\14":Ljava/lang/Object;
    .end local v9    # "$i$a$-let-ComposerKt$cache$1\\15\\884\\14":I
    nop

    .line 638
    .end local v1    # "$this$cache\\14":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\14\\638":I
    .end local v19    # "invalid\\14":Z
    move-object/from16 v29, v0

    check-cast v29, Lkotlin/jvm/functions/Function1;

    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 642
    sget-object v0, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-12$app_debug()Lkotlin/jvm/functions/Function2;

    move-result-object v34

    .line 641
    move-object/from16 v42, v18

    check-cast v42, Landroidx/compose/ui/text/input/VisualTransformation;

    .line 640
    nop

    .line 636
    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x1

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const v52, 0x180180

    const/high16 v53, 0xc00000

    const/16 v54, 0x0

    const v55, 0x7dbfb8

    move-object/from16 v51, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v51    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v28 .. v55}, Landroidx/compose/material3/OutlinedTextFieldKt;->OutlinedTextField(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/ui/text/input/VisualTransformation;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;IIII)V

    .line 625
    .end local v51    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 644
    nop

    .line 876
    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v23    # "$i$a$-Column-MainActivityKt$StWebViewScreen$9$5$1\\9\\876\\0":I
    .end local v25    # "$this$invoke_u24lambda_u245\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .end local v57    # "$changed\\9":I
    invoke-static/range {v26 .. v26}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 875
    .end local v21    # "$changed\\8":I
    .end local v26    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v56    # "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    nop

    .line 890
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 854
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 891
    nop

    .line 848
    .end local v20    # "$i$f$ReusableComposeNode\\4\\852":I
    .end local v22    # "$changed\\4":I
    .end local v24    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 892
    nop

    .line 842
    .end local v4    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v5    # "compositeKeyHash\\3":I
    .end local v6    # "materialized\\3":Landroidx/compose/ui/Modifier;
    .end local v15    # "$changed\\3":I
    .end local v16    # "$i$f$Layout\\3\\847":I
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 893
    nop

    .end local v7    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v11    # "$changed\\2":I
    .end local v12    # "$i$f$Column\\2\\621":I
    .end local v13    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v14    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v27    # "modifier\\2":Landroidx/compose/ui/Modifier;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 645
    :cond_e
    :goto_9
    return-void
.end method
