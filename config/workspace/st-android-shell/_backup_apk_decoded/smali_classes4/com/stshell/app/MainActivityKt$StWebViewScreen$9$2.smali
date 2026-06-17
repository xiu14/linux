.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;
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
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$9$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,840:1\n1225#2,6:841\n1#3:847\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$9$2\n*L\n648#1:841,6\n*E\n"
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

.field final synthetic $authRequest$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/HttpAuthRequestState;",
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

.field final synthetic $context:Landroid/content/Context;

.field final synthetic $credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

.field final synthetic $pageState$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $request:Lcom/stshell/app/HttpAuthRequestState;

.field final synthetic $url:Ljava/lang/String;

.field final synthetic $webView$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Landroid/webkit/WebView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static synthetic $r8$lambda$YiA37_eEjai0A5oQM9sVXuX3NkY(Lcom/stshell/app/HttpAuthCredentialsStore;Lcom/stshell/app/HttpAuthRequestState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->invoke$lambda$2$lambda$1(Lcom/stshell/app/HttpAuthCredentialsStore;Lcom/stshell/app/HttpAuthRequestState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/stshell/app/HttpAuthCredentialsStore;Lcom/stshell/app/HttpAuthRequestState;Ljava/lang/String;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/stshell/app/HttpAuthCredentialsStore;",
            "Lcom/stshell/app/HttpAuthRequestState;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroid/webkit/WebView;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/HttpAuthRequestState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iput-object p4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$request:Lcom/stshell/app/HttpAuthRequestState;

    iput-object p5, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$url:Ljava/lang/String;

    iput-object p6, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$context:Landroid/content/Context;

    iput-object p7, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p9, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authRequest$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static final invoke$lambda$2$lambda$1(Lcom/stshell/app/HttpAuthCredentialsStore;Lcom/stshell/app/HttpAuthRequestState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;)Lkotlin/Unit;
    .locals 4
    .param p0, "$credentialsStore"    # Lcom/stshell/app/HttpAuthCredentialsStore;
    .param p1, "$request"    # Lcom/stshell/app/HttpAuthRequestState;
    .param p2, "$context"    # Landroid/content/Context;
    .param p3, "$authUsername$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p4, "$authPassword$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$webView$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p6, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p7, "$url"    # Ljava/lang/String;
    .param p8, "$authRequest$delegate"    # Landroidx/compose/runtime/MutableState;

    .line 649
    new-instance v0, Lcom/stshell/app/HttpAuthCredentials;

    invoke-static {p3}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$15(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p4}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$19(Landroidx/compose/runtime/MutableState;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/stshell/app/HttpAuthCredentials;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    .local v0, "credentials":Lcom/stshell/app/HttpAuthCredentials;
    invoke-virtual {p1}, Lcom/stshell/app/HttpAuthRequestState;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/stshell/app/HttpAuthRequestState;->getRealm()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lcom/stshell/app/HttpAuthCredentialsStore;->put(Ljava/lang/String;Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentials;)V

    .line 651
    invoke-virtual {p1}, Lcom/stshell/app/HttpAuthRequestState;->getHandler()Landroid/webkit/HttpAuthHandler;

    move-result-object v1

    invoke-virtual {v0}, Lcom/stshell/app/HttpAuthCredentials;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/stshell/app/HttpAuthCredentials;->getPassword()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/webkit/HttpAuthHandler;->proceed(Ljava/lang/String;Ljava/lang/String;)V

    .line 652
    invoke-static {p5}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$2(Landroidx/compose/runtime/MutableState;)Landroid/webkit/WebView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {p6}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 847
    const/4 v2, 0x0

    .line 652
    .local v2, "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$9$2$1$1$1\\1\\652\\0":I
    move-object v2, p7

    .end local v2    # "$i$a$-ifBlank-MainActivityKt$StWebViewScreen$9$2$1$1$1\\1\\652\\0":I
    :cond_0
    check-cast v2, Ljava/lang/String;

    invoke-static {v1, v2, v0}, Lcom/stshell/app/MainActivityKt;->access$loadUrlWithHttpAuth(Landroid/webkit/WebView;Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentials;)V

    .line 653
    :cond_1
    const-string v1, "\u5df2\u4fdd\u5b58\u7ad9\u70b9\u767b\u5f55\u4fe1\u606f"

    check-cast v1, Ljava/lang/CharSequence;

    const/4 v2, 0x0

    invoke-static {p2, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 654
    const/4 v1, 0x0

    invoke-static {p8, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$6(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/HttpAuthRequestState;)V

    .line 655
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .param p1, "p1"    # Ljava/lang/Object;
    .param p2, "p2"    # Ljava/lang/Object;

    .line 646
    move-object v0, p1

    check-cast v0, Landroidx/compose/runtime/Composer;

    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .param p1, "$composer"    # Landroidx/compose/runtime/Composer;
    .param p2, "$changed"    # I

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    move/from16 v14, p2

    const-string v1, "C647@25868L524,646@25830L632:MainActivity.kt#r5p2a3"

    invoke-static {v11, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    .line 647
    and-int/lit8 v1, v14, 0x3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->getSkipping()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 658
    :cond_0
    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    goto/16 :goto_3

    .line 647
    :cond_1
    :goto_0
    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stshell.app.StWebViewScreen.<anonymous>.<anonymous> (MainActivity.kt:646)"

    const v3, 0x1d17b64a

    invoke-static {v3, v14, v1, v2}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    :cond_2
    const v1, 0x590da175

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v1, "CC(remember):MainActivity.kt#9igjgp"

    invoke-static {v11, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {v11, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$request:Lcom/stshell/app/HttpAuthRequestState;

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$url:Ljava/lang/String;

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    iget-object v2, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$context:Landroid/content/Context;

    invoke-interface {v11, v2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    .line 648
    iget-object v2, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iget-object v3, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$request:Lcom/stshell/app/HttpAuthRequestState;

    iget-object v4, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$context:Landroid/content/Context;

    iget-object v5, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v8, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v9, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$url:Ljava/lang/String;

    iget-object v10, v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2;->$authRequest$delegate:Landroidx/compose/runtime/MutableState;

    move-object/from16 v12, p1

    .local v1, "invalid\\1":Z
    .local v12, "$this$cache\\1":Landroidx/compose/runtime/Composer;
    const/4 v13, 0x0

    .line 841
    .local v13, "$i$f$cache\\1\\648":I
    invoke-interface {v12}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v15

    .local v15, "it\\1":Ljava/lang/Object;
    const/16 v25, 0x0

    .line 842
    .local v25, "$i$a$-let-ComposerKt$cache$1\\2\\841\\1":I
    if-nez v1, :cond_4

    sget-object v16, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual/range {v16 .. v16}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v0

    if-ne v15, v0, :cond_3

    goto :goto_1

    .line 846
    :cond_3
    move-object v2, v15

    goto :goto_2

    .line 843
    :cond_4
    :goto_1
    const/4 v0, 0x0

    .line 648
    .local v0, "$i$a$-cache-MainActivityKt$StWebViewScreen$9$2$1\\3\\843\\0":I
    move-object/from16 v16, v15

    .end local v15    # "it\\1":Ljava/lang/Object;
    .local v16, "it\\1":Ljava/lang/Object;
    new-instance v15, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2$$ExternalSyntheticLambda0;

    move-object/from16 v17, v16

    move-object/from16 v16, v2

    move-object/from16 v2, v17

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move-object/from16 v20, v6

    move-object/from16 v21, v7

    move-object/from16 v22, v8

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    .end local v16    # "it\\1":Ljava/lang/Object;
    .local v2, "it\\1":Ljava/lang/Object;
    invoke-direct/range {v15 .. v24}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$9$2$$ExternalSyntheticLambda0;-><init>(Lcom/stshell/app/HttpAuthCredentialsStore;Lcom/stshell/app/HttpAuthRequestState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Ljava/lang/String;Landroidx/compose/runtime/MutableState;)V

    .line 843
    .end local v0    # "$i$a$-cache-MainActivityKt$StWebViewScreen$9$2$1\\3\\843\\0":I
    nop

    .line 844
    .local v15, "value\\2":Ljava/lang/Object;
    invoke-interface {v12, v15}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 845
    nop

    .line 842
    .end local v15    # "value\\2":Ljava/lang/Object;
    :goto_2
    nop

    .line 841
    .end local v2    # "it\\1":Ljava/lang/Object;
    .end local v25    # "$i$a$-let-ComposerKt$cache$1\\2\\841\\1":I
    nop

    .line 648
    .end local v1    # "invalid\\1":Z
    .end local v12    # "$this$cache\\1":Landroidx/compose/runtime/Composer;
    .end local v13    # "$i$f$cache\\1\\648":I
    move-object v1, v15

    check-cast v1, Lkotlin/jvm/functions/Function0;

    invoke-interface {v11}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    sget-object v0, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->INSTANCE:Lcom/stshell/app/ComposableSingletons$MainActivityKt;

    invoke-virtual {v0}, Lcom/stshell/app/ComposableSingletons$MainActivityKt;->getLambda-9$app_debug()Lkotlin/jvm/functions/Function3;

    move-result-object v10

    .line 647
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/high16 v12, 0x30000000

    const/16 v13, 0x1fe

    invoke-static/range {v1 .. v13}, Landroidx/compose/material3/ButtonKt;->Button(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/ButtonColors;Landroidx/compose/material3/ButtonElevation;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    .line 659
    :cond_5
    :goto_3
    return-void
.end method
