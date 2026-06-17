.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;
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
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$8$3\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,840:1\n1225#2,6:841\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$8$3\n*L\n599#1:841,6\n*E\n"
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
.field final synthetic $pageState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PreemptiveAuthRequestState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$iwwkRab6v9j72lGQwtLKRZVfTY4(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;->invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PreemptiveAuthRequestState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$1$lambda$0(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 8
    .param p0, "$startupAuthRequest$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p1, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 600
    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$9(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PreemptiveAuthRequestState;)V

    .line 601
    invoke-static {p1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v1

    .line 602
    nop

    .line 601
    nop

    .line 603
    nop

    .line 601
    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, "\u5df2\u53d6\u6d88\u7ad9\u70b9\u767b\u5f55\u3002\u91cd\u65b0\u8f93\u5165\u8d26\u53f7\u5bc6\u7801\u540e\u624d\u80fd\u8fde\u63a5 SillyTavern\u3002"

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/stshell/app/PageState;->copy$default(Lcom/stshell/app/PageState;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 605
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 597
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 14
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object v10, p1

    move/from16 v13, p2

    const-string v0, "C598@24013L279,597@23975L387:MainActivity.kt#r5p2a3"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 598
    and-int/lit8 v0, v13, 0x3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 608
    :cond_0
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto :goto_2

    .line 598
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stshell.app.StWebViewScreen.<anonymous>.<anonymous> (MainActivity.kt:597)"

    const v2, -0x2147afd4

    invoke-static {v2, v13, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const v0, 0x590cb8a0

    invoke-interface {p1, v0}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v0, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 599
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    move-object v2, p1

    .local v2, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v3, 0x0

    .local v3, "invalid\\1":Z
    const/4 v4, 0x0

    .line 841
    .local v4, "$i$f$cache\\1\\599":I
    invoke-interface {v2}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    .local v5, "it\\1":Ljava/lang/Object;
    const/4 v6, 0x0

    .line 842
    .local v6, "$i$a$-let-ComposerKt$cache$1\\2\\841\\1":I
    sget-object v7, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v7}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_3

    .line 843
    const/4 v7, 0x0

    .line 599
    .local v7, "$i$a$-cache-MainActivityKt$StWebViewScreen$8$3$1\\3\\843\\0":I
    new-instance v8, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3$$ExternalSyntheticLambda0;

    invoke-direct {v8, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$8$3$$ExternalSyntheticLambda0;-><init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V

    .line 843
    .end local v7    # "$i$a$-cache-MainActivityKt$StWebViewScreen$8$3$1\\3\\843\\0":I
    nop

    .line 844
    .local v8, "value\\2":Ljava/lang/Object;
    invoke-interface {v2, v8}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 845
    nop

    .end local v8    # "value\\2":Ljava/lang/Object;
    goto :goto_1

    .line 846
    :cond_3
    move-object v8, v5

    .line 842
    :goto_1
    nop

    .line 841
    .end local v5    # "it\\1":Ljava/lang/Object;
    .end local v6    # "$i$a$-let-ComposerKt$cache$1\\2\\841\\1":I
    nop

    .line 599
    .end local v2    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v3    # "invalid\\1":Z
    .end local v4    # "$i$f$cache\\1\\599":I
    move-object v0, v8

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v1, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v1}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-6$app_debug()Lkotlin/jvm/functions/Function3;

    move-result-object v9

    .line 598
    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v11, 0x30000006

    const/16 v12, 0x1fe

    invoke-static/range {v0 .. v12}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 609
    :cond_4
    :goto_2
    return-void
.end method
