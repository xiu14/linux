.class final Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
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
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.stshell.app.MainActivityKt$StWebViewScreen$4$1"
    f = "MainActivity.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
.end annotation


# instance fields
.field final synthetic $credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

.field final synthetic $hasLoadedInitialUrl$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $initialHost:Ljava/lang/String;

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

.field label:I


# direct methods
.method constructor <init>(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stshell/app/HttpAuthCredentialsStore;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/MutableState<",
            "Landroid/webkit/WebView;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/Boolean;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PreemptiveAuthRequestState;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$initialHost:Ljava/lang/String;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$url:Ljava/lang/String;

    iput-object p4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$hasLoadedInitialUrl$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v0, 0x2

    invoke-direct {p0, v0, p8}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$initialHost:Ljava/lang/String;

    iget-object v3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$url:Ljava/lang/String;

    iget-object v4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v5, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$hasLoadedInitialUrl$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;-><init>(Lcom/stshell/app/HttpAuthCredentialsStore;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v0

    check-cast v0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {v0, v1}, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 279
    iget v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->label:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 280
    .local p1, "$result":Ljava/lang/Object;
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$webView$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$2(Landroidx/compose/runtime/MutableState;)Landroid/webkit/WebView;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    .line 281
    .local v0, "currentView":Landroid/webkit/WebView;
    :cond_0
    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$hasLoadedInitialUrl$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$23(Landroidx/compose/runtime/MutableState;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    .line 283
    :cond_1
    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$initialHost:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/stshell/app/HttpAuthCredentialsStore;->get(Ljava/lang/String;Ljava/lang/String;)Lcom/stshell/app/HttpAuthCredentials;

    move-result-object v1

    .line 284
    .local v1, "storedCredentials":Lcom/stshell/app/HttpAuthCredentials;
    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 285
    iget-object v4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$hasLoadedInitialUrl$delegate:Landroidx/compose/runtime/MutableState;

    const/4 v5, 0x1

    invoke-static {v4, v5}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$24(Landroidx/compose/runtime/MutableState;Z)V

    .line 286
    iget-object v4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v6, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v6}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v6

    .line 287
    nop

    .line 288
    iget-object v7, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$url:Ljava/lang/String;

    .line 289
    nop

    .line 290
    nop

    .line 286
    invoke-virtual {v6, v5, v7, v3, v2}, Lcom/stshell/app/PageState;->copy(ZLjava/lang/String;Ljava/lang/String;I)Lcom/stshell/app/PageState;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 292
    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$url:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Lcom/stshell/app/MainActivityKt;->access$loadUrlWithHttpAuth(Landroid/webkit/WebView;Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentials;)V

    goto :goto_0

    .line 294
    .end local v0    # "currentView":Landroid/webkit/WebView;
    .end local v1    # "storedCredentials":Lcom/stshell/app/HttpAuthCredentials;
    :cond_2
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v1

    .line 295
    nop

    .line 296
    iget-object v4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$url:Ljava/lang/String;

    .line 297
    nop

    .line 298
    nop

    .line 294
    invoke-virtual {v1, v2, v4, v3, v2}, Lcom/stshell/app/PageState;->copy(ZLjava/lang/String;Ljava/lang/String;I)Lcom/stshell/app/PageState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 300
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$startupAuthRequest$delegate:Landroidx/compose/runtime/MutableState;

    new-instance v1, Lcom/stshell/app/PreemptiveAuthRequestState;

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$initialHost:Ljava/lang/String;

    iget-object v3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$4$1;->$url:Ljava/lang/String;

    invoke-direct {v1, v2, v3}, Lcom/stshell/app/PreemptiveAuthRequestState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$9(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PreemptiveAuthRequestState;)V

    .line 302
    :goto_0
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
