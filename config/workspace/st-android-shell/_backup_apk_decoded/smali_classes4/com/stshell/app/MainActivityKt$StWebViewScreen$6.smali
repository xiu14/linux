.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;
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
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,840:1\n149#2:841\n149#2:877\n149#2:878\n149#2:879\n149#2:881\n86#3:842\n84#3,5:843\n89#3:876\n93#3:891\n79#4,6:848\n86#4,4:863\n90#4,2:873\n94#4:890\n368#5,9:854\n377#5:875\n378#5,2:888\n4034#6,6:867\n1#7:880\n1225#8,6:882\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$6\n*L\n462#1:841\n466#1:877\n468#1:878\n470#1:879\n472#1:881\n459#1:842\n459#1:843,5\n459#1:876\n459#1:891\n459#1:848,6\n459#1:863,4\n459#1:873,2\n459#1:890\n459#1:854,9\n459#1:875\n459#1:888,2\n459#1:867,6\n474#1:882,6\n*E\n"
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
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $pageState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $url:Ljava/lang/String;


# direct methods
.method public static synthetic $r8$lambda$T1LPXCFn-UQ63MSEvNw2FehdRnY(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->invoke$lambda$4$lambda$3$lambda$2(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$4$lambda$3$lambda$2(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)Lkotlin/Unit;
    .locals 4
    .param p0, "$context"    # Landroid/content/Context;
    .param p1, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p2, "$url"    # Ljava/lang/String;

    .line 475
    invoke-static {p1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 880
    const/4 v0, 0x0

    .line 475
    .local v0, "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$6$1$2$1$target$1\\1\\475\\0":I
    move-object v0, p2

    .end local v0    # "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$6$1$2$1$target$1\\1\\475\\0":I
    :cond_0
    check-cast v0, Ljava/lang/String;

    .line 476
    .local v0, "target":Ljava/lang/String;
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 477
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 458
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 53
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    const-string v3, "C458@18029L1044:MainActivity.kt#r5p2a3"

    invoke-static {v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 459
    and-int/lit8 v3, v2, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    .line 482
    :cond_0
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_6

    .line 459
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.stshell.app.StWebViewScreen.<anonymous> (MainActivity.kt:458)"

    const v5, 0x616445d

    invoke-static {v5, v2, v3, v4}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 460
    :cond_2
    sget-object v3, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v3, Landroidx/compose/ui/Modifier;

    .line 461
    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxSize$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 462
    const/16 v7, 0x18

    .local v7, "$this$dp\\1":I
    const/4 v8, 0x0

    .line 841
    .local v8, "$i$f$getDp\\1\\462":I
    int-to-float v9, v7

    invoke-static {v9}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v7

    .line 462
    .end local v7    # "$this$dp\\1":I
    .end local v8    # "$i$f$getDp\\1\\462":I
    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/PaddingKt;->padding-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    .line 463
    sget-object v7, Landroidx/compose/foundation/layout/Arrangement;->INSTANCE:Landroidx/compose/foundation/layout/Arrangement;

    invoke-virtual {v7}, Landroidx/compose/foundation/layout/Arrangement;->getCenter()Landroidx/compose/foundation/layout/Arrangement$HorizontalOrVertical;

    move-result-object v7

    check-cast v7, Landroidx/compose/foundation/layout/Arrangement$Vertical;

    .line 459
    iget-object v8, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->$url:Ljava/lang/String;

    iget-object v9, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->$context:Landroid/content/Context;

    iget-object v10, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    const/16 v11, 0x36

    .local v3, "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v7, "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .local v11, "$changed\\2":I
    const/4 v12, 0x0

    .line 842
    .local v12, "$i$f$Column\\2\\459":I
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

    move-result v4

    .line 850
    .local v4, "compositeKeyHash\\3":I
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->getCurrentCompositionLocalMap()Landroidx/compose/runtime/CompositionLocalMap;

    move-result-object v5

    .line 851
    .local v5, "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    invoke-static {v1, v3}, Landroidx/compose/ui/ComposedModifierKt;->materializeModifier(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    .line 853
    .local v6, "materialized\\3":Landroidx/compose/ui/Modifier;
    sget-object v17, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual/range {v17 .. v17}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getConstructor()Lkotlin/jvm/functions/Function0;

    move-result-object v17

    shl-int/lit8 v0, v15, 0x6

    and-int/lit16 v0, v0, 0x380

    move/from16 v18, v0

    const/4 v0, 0x6

    or-int/lit8 v18, v18, 0x6

    .line 852
    move-object/from16 v19, v17

    .local v18, "$changed\\4":I
    .local v19, "factory\\4":Lkotlin/jvm/functions/Function0;
    const/16 v17, 0x0

    .line 854
    .local v17, "$i$f$ReusableComposeNode\\4\\852":I
    move/from16 v20, v0

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
    move-object/from16 v0, v19

    .end local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v0, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->createNode(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    .line 860
    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    :cond_4
    move-object/from16 v0, v19

    .end local v19    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .restart local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->useNode()V

    .line 862
    :goto_1
    invoke-static {v1}, Landroidx/compose/runtime/Updater;->constructor-impl(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;

    move-result-object v2

    .local v2, "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    const/16 v19, 0x0

    .line 863
    .local v19, "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\862\\3":I
    sget-object v21, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    move-object/from16 v22, v0

    .end local v0    # "factory\\4":Lkotlin/jvm/functions/Function0;
    .local v22, "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-virtual/range {v21 .. v21}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetMeasurePolicy()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v14, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 864
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetResolvedCompositionLocals()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v5, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 866
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetCompositeKeyHash()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    .local v0, "block\\6":Lkotlin/jvm/functions/Function2;
    const/16 v21, 0x0

    .line 867
    .local v21, "$i$f$set-impl\\6\\866":I
    move-object/from16 v23, v2

    .local v23, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    const/16 v24, 0x0

    .line 868
    .local v24, "$i$a$-with-Updater$set$1\\7\\867\\6":I
    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->getInserting()Z

    move-result v25

    if-nez v25, :cond_6

    invoke-interface/range {v23 .. v23}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v25, v3

    .end local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .local v25, "modifier\\2":Landroidx/compose/ui/Modifier;
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_2

    :cond_5
    move-object/from16 v3, v23

    goto :goto_3

    .end local v25    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .restart local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    :cond_6
    move-object/from16 v25, v3

    .line 869
    .end local v3    # "modifier\\2":Landroidx/compose/ui/Modifier;
    .restart local v25    # "modifier\\2":Landroidx/compose/ui/Modifier;
    :goto_2
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v3, v23

    .end local v23    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .local v3, "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    invoke-interface {v3, v1}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 870
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v1, v0}, Landroidx/compose/runtime/Composer;->apply(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 872
    :goto_3
    nop

    .line 867
    .end local v3    # "$this$set_impl_u24lambda_u240\\6":Landroidx/compose/runtime/Composer;
    .end local v24    # "$i$a$-with-Updater$set$1\\7\\867\\6":I
    nop

    .line 872
    nop

    .line 873
    .end local v0    # "block\\6":Lkotlin/jvm/functions/Function2;
    .end local v21    # "$i$f$set-impl\\6\\866":I
    sget-object v0, Landroidx/compose/ui/node/ComposeUiNode;->Companion:Landroidx/compose/ui/node/ComposeUiNode$Companion;

    invoke-virtual {v0}, Landroidx/compose/ui/node/ComposeUiNode$Companion;->getSetModifier()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    invoke-static {v2, v6, v0}, Landroidx/compose/runtime/Updater;->set-impl(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 874
    nop

    .line 862
    .end local v2    # "$this$Layout_u24lambda_u240\\5":Landroidx/compose/runtime/Composer;
    .end local v19    # "$i$a$-ReusableComposeNode-LayoutKt$Layout$1\\5\\862\\3":I
    nop

    .line 875
    shr-int/lit8 v0, v18, 0x6

    and-int/lit8 v0, v0, 0xe

    .local v0, "$changed\\8":I
    move-object/from16 v1, p1

    .local v1, "$composer\\8":Landroidx/compose/runtime/Composer;
    const/4 v2, 0x0

    .line 876
    .local v2, "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    const v3, -0x16ef5699

    move/from16 v19, v0

    .end local v0    # "$changed\\8":I
    .local v19, "$changed\\8":I
    const-string v0, "C88@4444L9:Column.kt#2w3rfo"

    invoke-static {v1, v3, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    sget-object v0, Landroidx/compose/foundation/layout/ColumnScopeInstance;->INSTANCE:Landroidx/compose/foundation/layout/ColumnScopeInstance;

    shr-int/lit8 v3, v11, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/lit8 v3, v3, 0x6

    .local v3, "$changed\\9":I
    check-cast v0, Landroidx/compose/foundation/layout/ColumnScope;

    .local v0, "$this$invoke_u24lambda_u244\\9":Landroidx/compose/foundation/layout/ColumnScope;
    move-object/from16 v33, v1

    .local v33, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v21, 0x0

    .line 465
    .local v21, "$i$a$-Column-MainActivityKt$StWebViewScreen$6$1\\9\\876\\0":I
    move-object/from16 v23, v0

    .end local v0    # "$this$invoke_u24lambda_u244\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .local v23, "$this$invoke_u24lambda_u244\\9":Landroidx/compose/foundation/layout/ColumnScope;
    const v0, -0x37ccd85e

    move-object/from16 v24, v1

    .end local v1    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .local v24, "$composer\\8":Landroidx/compose/runtime/Composer;
    const-string v1, "C464@18235L27,465@18279L41,466@18337L25,467@18379L40,468@18436L33,469@18486L40,470@18605L10,470@18543L83,471@18643L41,473@18739L187,472@18701L358:MainActivity.kt#r5p2a3"

    move/from16 v51, v2

    move-object/from16 v2, v33

    .end local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v51, "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    invoke-static {v2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    const/16 v34, 0x0

    const/16 v35, 0x1f

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v26 .. v35}, Landroidx/compose/material3/ProgressIndicatorKt;->CircularProgressIndicator-LxG7B9w(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    .line 466
    .end local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x10

    .local v1, "$this$dp\\10":I
    const/16 v26, 0x0

    .line 877
    .local v26, "$i$f$getDp\\10\\466":I
    move/from16 v52, v3

    .end local v3    # "$changed\\9":I
    .local v52, "$changed\\9":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 466
    .end local v1    # "$this$dp\\10":I
    .end local v26    # "$i$f$getDp\\10\\466":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move/from16 v1, v20

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 467
    const/16 v49, 0x0

    const v50, 0x1fffe

    const-string v26, "\u6b63\u5728\u8fde\u63a5 SillyTavern\u2026"

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v48, 0x6

    move-object/from16 v47, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v47, "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v26 .. v50}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 468
    .end local v47    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x8

    .local v1, "$this$dp\\11":I
    const/4 v3, 0x0

    .line 878
    .local v3, "$i$f$getDp\\11\\468":I
    move/from16 v26, v3

    .end local v3    # "$i$f$getDp\\11\\468":I
    .local v26, "$i$f$getDp\\11\\468":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 468
    .end local v1    # "$this$dp\\11":I
    .end local v26    # "$i$f$getDp\\11\\468":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 469
    invoke-static {v10}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stshell/app/PageState;->getProgress()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u8fdb\u5ea6 "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    const/16 v48, 0x0

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v47    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v26 .. v50}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 470
    .end local v47    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x8

    .local v1, "$this$dp\\12":I
    const/4 v3, 0x0

    .line 879
    .local v3, "$i$f$getDp\\12\\470":I
    move/from16 v26, v3

    .end local v3    # "$i$f$getDp\\12\\470":I
    .local v26, "$i$f$getDp\\12\\470":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 470
    .end local v1    # "$this$dp\\12":I
    .end local v26    # "$i$f$getDp\\12\\470":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 471
    invoke-static {v10}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 880
    const/4 v0, 0x0

    .line 471
    .local v0, "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$6$1$1\\13\\471\\9":I
    move-object v0, v8

    .end local v0    # "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$6$1$1\\13\\471\\9":I
    :cond_7
    move-object/from16 v26, v0

    check-cast v26, Ljava/lang/String;

    sget-object v0, Landroidx/compose/material3/MaterialTheme;->INSTANCE:Landroidx/compose/material3/MaterialTheme;

    sget v1, Landroidx/compose/material3/MaterialTheme;->$stable:I

    invoke-virtual {v0, v2, v1}, Landroidx/compose/material3/MaterialTheme;->getTypography(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/Typography;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/material3/Typography;->getBodySmall()Landroidx/compose/ui/text/TextStyle;

    move-result-object v46

    const/16 v49, 0x0

    const v50, 0xfffe

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const-wide/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const-wide/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v48, 0x0

    move-object/from16 v47, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v47    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v26 .. v50}, Landroidx/compose/material3/TextKt;->Text--4IGK_g(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/text/style/TextAlign;JIZIILkotlin/jvm/functions/Function1;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/runtime/Composer;III)V

    .line 472
    .end local v47    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/16 v1, 0x14

    .local v1, "$this$dp\\14":I
    const/4 v3, 0x0

    .line 881
    .local v3, "$i$f$getDp\\14\\472":I
    move/from16 v26, v3

    .end local v3    # "$i$f$getDp\\14\\472":I
    .local v26, "$i$f$getDp\\14\\472":I
    int-to-float v3, v1

    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 472
    .end local v1    # "$this$dp\\14":I
    .end local v26    # "$i$f$getDp\\14\\472":I
    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/SizeKt;->height-3ABfNKs(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v0, v2, v1}, Landroidx/compose/foundation/layout/SpacerKt;->Spacer(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const v0, 0x590a2504

    invoke-interface {v2, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {v2, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v2, v9}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    .line 474
    nop

    .local v0, "invalid\\15":Z
    move-object v1, v2

    .local v1, "$this$cache\\15":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .line 882
    .local v3, "$i$f$cache\\15\\474":I
    move/from16 v20, v0

    .end local v0    # "invalid\\15":Z
    .local v20, "invalid\\15":Z
    invoke-interface {v1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v0

    .local v0, "it\\15":Ljava/lang/Object;
    const/16 v26, 0x0

    .line 883
    .local v26, "$i$a$-let-ComposerKt$cache$1\\16\\882\\15":I
    if-nez v20, :cond_9

    sget-object v27, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    move-object/from16 v33, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-virtual/range {v27 .. v27}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_8

    goto :goto_4

    .line 887
    :cond_8
    move-object/from16 v27, v0

    goto :goto_5

    .line 883
    .end local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    :cond_9
    move-object/from16 v33, v2

    .line 884
    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    :goto_4
    const/4 v2, 0x0

    .line 474
    .local v2, "$i$a$-cache-MainActivityKt$StWebViewScreen$6$1$2\\17\\884\\9":I
    move-object/from16 v27, v0

    .end local v0    # "it\\15":Ljava/lang/Object;
    .local v27, "it\\15":Ljava/lang/Object;
    new-instance v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6$$ExternalSyntheticLambda0;

    invoke-direct {v0, v9, v10, v8}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$6$$ExternalSyntheticLambda0;-><init>(Landroid/content/Context;Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 884
    .end local v2    # "$i$a$-cache-MainActivityKt$StWebViewScreen$6$1$2\\17\\884\\9":I
    nop

    .line 885
    .local v0, "value\\16":Ljava/lang/Object;
    invoke-interface {v1, v0}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 886
    nop

    .line 883
    .end local v0    # "value\\16":Ljava/lang/Object;
    :goto_5
    nop

    .line 882
    .end local v26    # "$i$a$-let-ComposerKt$cache$1\\16\\882\\15":I
    .end local v27    # "it\\15":Ljava/lang/Object;
    nop

    .line 474
    .end local v1    # "$this$cache\\15":Landroidx/compose/runtime/Composer;
    .end local v3    # "$i$f$cache\\15\\474":I
    .end local v20    # "invalid\\15":Z
    move-object/from16 v26, v0

    check-cast v26, Lkotlin/jvm/functions/Function0;

    invoke-interface/range {v33 .. v33}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 478
    sget-object v0, Landroidx/compose/ui/Modifier;->Companion:Landroidx/compose/ui/Modifier$Companion;

    check-cast v0, Landroidx/compose/ui/Modifier;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v3, v2, v1}, Landroidx/compose/foundation/layout/SizeKt;->fillMaxWidth$default(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v27

    sget-object v0, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-1$app_debug()Lkotlin/jvm/functions/Function3;

    move-result-object v35

    .line 473
    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v2, v33

    .end local v33    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v2, "$composer\\9":Landroidx/compose/runtime/Composer;
    const/16 v33, 0x0

    const/16 v34, 0x0

    const v37, 0x30000030

    const/16 v38, 0x1fc

    move-object/from16 v36, v2

    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .local v36, "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static/range {v26 .. v38}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    .line 465
    .end local v36    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .restart local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    invoke-static {v2}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 482
    nop

    .line 876
    .end local v2    # "$composer\\9":Landroidx/compose/runtime/Composer;
    .end local v21    # "$i$a$-Column-MainActivityKt$StWebViewScreen$6$1\\9\\876\\0":I
    .end local v23    # "$this$invoke_u24lambda_u244\\9":Landroidx/compose/foundation/layout/ColumnScope;
    .end local v52    # "$changed\\9":I
    invoke-static/range {v24 .. v24}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 875
    .end local v19    # "$changed\\8":I
    .end local v24    # "$composer\\8":Landroidx/compose/runtime/Composer;
    .end local v51    # "$i$a$-Layout-ColumnKt$Column$1\\8\\875\\2":I
    nop

    .line 888
    invoke-interface/range {p1 .. p1}, Landroidx/compose/runtime/Composer;->endNode()V

    .line 854
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 889
    nop

    .line 848
    .end local v17    # "$i$f$ReusableComposeNode\\4\\852":I
    .end local v18    # "$changed\\4":I
    .end local v22    # "factory\\4":Lkotlin/jvm/functions/Function0;
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 890
    nop

    .line 842
    .end local v4    # "compositeKeyHash\\3":I
    .end local v5    # "localMap\\3":Landroidx/compose/runtime/CompositionLocalMap;
    .end local v6    # "materialized\\3":Landroidx/compose/ui/Modifier;
    .end local v15    # "$changed\\3":I
    .end local v16    # "$i$f$Layout\\3\\847":I
    invoke-static/range {p1 .. p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 891
    nop

    .end local v7    # "verticalArrangement\\2":Landroidx/compose/foundation/layout/Arrangement$Vertical;
    .end local v11    # "$changed\\2":I
    .end local v12    # "$i$f$Column\\2\\459":I
    .end local v13    # "horizontalAlignment\\2":Landroidx/compose/ui/Alignment$Horizontal;
    .end local v14    # "measurePolicy\\2":Landroidx/compose/ui/layout/MeasurePolicy;
    .end local v25    # "modifier\\2":Landroidx/compose/ui/Modifier;
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 483
    :cond_a
    :goto_6
    return-void
.end method
