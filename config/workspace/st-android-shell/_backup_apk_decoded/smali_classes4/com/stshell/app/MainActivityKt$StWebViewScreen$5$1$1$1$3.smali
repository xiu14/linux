.class public final Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;
.super Landroid/webkit/WebViewClient;
.source "MainActivity.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stshell/app/MainActivityKt;->StWebViewScreen(Ljava/lang/String;Lcom/stshell/app/HttpAuthCredentialsStore;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,840:1\n1#2:841\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000K\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016J\u001c\u0010\n\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J,\u0010\u000b\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0010\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J&\u0010\u0015\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\"\u0010\u0018\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u001aH\u0016\u00a8\u0006\u001b"
    }
    d2 = {
        "com/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3",
        "Landroid/webkit/WebViewClient;",
        "onPageStarted",
        "",
        "view",
        "Landroid/webkit/WebView;",
        "loadedUrl",
        "",
        "favicon",
        "Landroid/graphics/Bitmap;",
        "onPageFinished",
        "onReceivedHttpAuthRequest",
        "handler",
        "Landroid/webkit/HttpAuthHandler;",
        "host",
        "realm",
        "onReceivedError",
        "request",
        "Landroid/webkit/WebResourceRequest;",
        "error",
        "Landroid/webkit/WebResourceError;",
        "onReceivedHttpError",
        "errorResponse",
        "Landroid/webkit/WebResourceResponse;",
        "onReceivedSslError",
        "Landroid/webkit/SslErrorHandler;",
        "Landroid/net/http/SslError;",
        "app_debug"
    }
    k = 0x1
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

.field final synthetic $sslRequest$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/SslRequestState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_apply:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Landroidx/compose/runtime/MutableState;Landroid/webkit/WebView;Lcom/stshell/app/HttpAuthCredentialsStore;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V
    .locals 0
    .param p1, "$pageState$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p2, "$receiver"    # Landroid/webkit/WebView;
    .param p3, "$credentialsStore"    # Lcom/stshell/app/HttpAuthCredentialsStore;
    .param p4, "$authUsername$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p5, "$authPassword$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p6, "$authRequest$delegate"    # Landroidx/compose/runtime/MutableState;
    .param p7, "$sslRequest$delegate"    # Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/PageState;",
            ">;",
            "Landroid/webkit/WebView;",
            "Lcom/stshell/app/HttpAuthCredentialsStore;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/HttpAuthRequestState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/stshell/app/SslRequestState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$this_apply:Landroid/webkit/WebView;

    iput-object p3, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    iput-object p4, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p5, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p6, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$authRequest$delegate:Landroidx/compose/runtime/MutableState;

    iput-object p7, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$sslRequest$delegate:Landroidx/compose/runtime/MutableState;

    .line 359
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 9
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "loadedUrl"    # Ljava/lang/String;

    .line 370
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v2

    .line 371
    nop

    .line 372
    if-nez p2, :cond_0

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v1

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, p2

    .line 370
    :goto_0
    nop

    .line 373
    nop

    .line 370
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x64

    invoke-static/range {v2 .. v8}, Lcom/stshell/app/PageState;->copy$default(Lcom/stshell/app/PageState;ZLjava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/stshell/app/PageState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 375
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$this_apply:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/stshell/app/MainActivityKt;->access$injectNativeHelper(Landroid/webkit/WebView;)V

    .line 376
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$this_apply:Landroid/webkit/WebView;

    invoke-static {v0}, Lcom/stshell/app/MainActivityKt;->access$attachSillyTavernGenerationHooks(Landroid/webkit/WebView;)V

    .line 377
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 6
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "loadedUrl"    # Ljava/lang/String;
    .param p3, "favicon"    # Landroid/graphics/Bitmap;

    .line 361
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v1

    .line 362
    nop

    .line 363
    if-nez p2, :cond_0

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stshell/app/PageState;->getLastUrl()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, p2

    .line 364
    :goto_0
    nop

    .line 365
    nop

    .line 361
    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v1, v3, v2, v4, v5}, Lcom/stshell/app/PageState;->copy(ZLjava/lang/String;Ljava/lang/String;I)Lcom/stshell/app/PageState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 367
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V
    .locals 12
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "request"    # Landroid/webkit/WebResourceRequest;
    .param p3, "error"    # Landroid/webkit/WebResourceError;

    .line 400
    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-nez v2, :cond_1

    return-void

    .line 401
    :cond_1
    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v2

    .line 402
    nop

    .line 403
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 404
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object v6, v5

    .local v6, "$this$onReceivedError_u24lambda_u243\\1":Ljava/lang/StringBuilder;
    const/4 v7, 0x0

    .line 405
    .local v7, "$i$a$-buildString-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedError$1\\1\\404\\0":I
    const-string v8, "\u9875\u9762\u52a0\u8f7d\u5931\u8d25"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 406
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/webkit/WebResourceError;->getDescription()Ljava/lang/CharSequence;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    move-object v9, v8

    .line 841
    .local v9, "it\\2":Ljava/lang/String;
    const/4 v10, 0x0

    .line 406
    .local v10, "$i$a$-takeIf-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedError$1$1\\2\\406\\1":I
    move-object v11, v9

    check-cast v11, Ljava/lang/CharSequence;

    invoke-static {v11}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v11

    .end local v9    # "it\\2":Ljava/lang/String;
    .end local v10    # "$i$a$-takeIf-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedError$1$1\\2\\406\\1":I
    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_3

    .local v8, "it\\3":Ljava/lang/String;
    const/4 v9, 0x0

    .line 407
    .local v9, "$i$a$-let-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedError$1$2\\3\\406\\1":I
    const-string v10, ": "

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 408
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    nop

    .line 406
    .end local v8    # "it\\3":Ljava/lang/String;
    .end local v9    # "$i$a$-let-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedError$1$2\\3\\406\\1":I
    :cond_3
    nop

    .line 410
    nop

    .end local v6    # "$this$onReceivedError_u24lambda_u243\\1":Ljava/lang/StringBuilder;
    .end local v7    # "$i$a$-buildString-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedError$1\\1\\404\\0":I
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 404
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 411
    nop

    .line 401
    invoke-virtual {v2, v0, v3, v5, v0}, Lcom/stshell/app/PageState;->copy(ZLjava/lang/String;Ljava/lang/String;I)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 413
    return-void
.end method

.method public onReceivedHttpAuthRequest(Landroid/webkit/WebView;Landroid/webkit/HttpAuthHandler;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/HttpAuthHandler;
    .param p3, "host"    # Ljava/lang/String;
    .param p4, "realm"    # Ljava/lang/String;

    .line 385
    const-string v0, "handler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "host"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$credentialsStore:Lcom/stshell/app/HttpAuthCredentialsStore;

    invoke-virtual {v0, p3, p4}, Lcom/stshell/app/HttpAuthCredentialsStore;->get(Ljava/lang/String;Ljava/lang/String;)Lcom/stshell/app/HttpAuthCredentials;

    move-result-object v0

    if-eqz v0, :cond_0

    .local v0, "credentials\\1":Lcom/stshell/app/HttpAuthCredentials;
    const/4 v1, 0x0

    .line 386
    .local v1, "$i$a$-let-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedHttpAuthRequest$1\\1\\385\\0":I
    invoke-virtual {v0}, Lcom/stshell/app/HttpAuthCredentials;->getUsername()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/stshell/app/HttpAuthCredentials;->getPassword()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v2, v3}, Landroid/webkit/HttpAuthHandler;->proceed(Ljava/lang/String;Ljava/lang/String;)V

    .line 387
    return-void

    .line 390
    .end local v0    # "credentials\\1":Lcom/stshell/app/HttpAuthCredentials;
    .end local v1    # "$i$a$-let-MainActivityKt$StWebViewScreen$5$1$1$1$3$onReceivedHttpAuthRequest$1\\1\\385\\0":I
    :cond_0
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$authUsername$delegate:Landroidx/compose/runtime/MutableState;

    const-string v1, ""

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$16(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 391
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$authPassword$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$20(Landroidx/compose/runtime/MutableState;Ljava/lang/String;)V

    .line 392
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$authRequest$delegate:Landroidx/compose/runtime/MutableState;

    new-instance v1, Lcom/stshell/app/HttpAuthRequestState;

    invoke-direct {v1, p3, p4, p2}, Lcom/stshell/app/HttpAuthRequestState;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/HttpAuthHandler;)V

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$6(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/HttpAuthRequestState;)V

    .line 393
    return-void
.end method

.method public onReceivedHttpError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceResponse;)V
    .locals 7
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "request"    # Landroid/webkit/WebResourceRequest;
    .param p3, "errorResponse"    # Landroid/webkit/WebResourceResponse;

    .line 420
    const/4 v0, 0x0

    if-eqz p2, :cond_0

    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->isForMainFrame()Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-nez v2, :cond_1

    return-void

    .line 421
    :cond_1
    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v2, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v2}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v2

    .line 422
    nop

    .line 423
    invoke-interface {p2}, Landroid/webkit/WebResourceRequest;->getUrl()Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "toString(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 424
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/webkit/WebResourceResponse;->getStatusCode()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :cond_2
    const-string v4, "?"

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "\u670d\u52a1\u5668\u8fd4\u56de HTTP "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 425
    nop

    .line 421
    invoke-virtual {v2, v0, v3, v4, v0}, Lcom/stshell/app/PageState;->copy(ZLjava/lang/String;Ljava/lang/String;I)Lcom/stshell/app/PageState;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 427
    return-void
.end method

.method public onReceivedSslError(Landroid/webkit/WebView;Landroid/webkit/SslErrorHandler;Landroid/net/http/SslError;)V
    .locals 5
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "handler"    # Landroid/webkit/SslErrorHandler;
    .param p3, "error"    # Landroid/net/http/SslError;

    const-string v0, "handler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 434
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$sslRequest$delegate:Landroidx/compose/runtime/MutableState;

    new-instance v1, Lcom/stshell/app/SslRequestState;

    .line 435
    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getUrl(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 436
    invoke-static {p3}, Lcom/stshell/app/MainActivityKt;->access$describeSslError(Landroid/net/http/SslError;)Ljava/lang/String;

    move-result-object v4

    .line 437
    nop

    .line 434
    invoke-direct {v1, v2, v4, p2}, Lcom/stshell/app/SslRequestState;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/webkit/SslErrorHandler;)V

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$12(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/SslRequestState;)V

    .line 439
    iget-object v0, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    iget-object v1, p0, Lcom/stshell/app/MainActivityKt$StWebViewScreen$5$1$1$1$3;->$pageState$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$26(Landroidx/compose/runtime/MutableState;)Lcom/stshell/app/PageState;

    move-result-object v1

    .line 440
    nop

    .line 441
    invoke-virtual {p3}, Landroid/net/http/SslError;->getUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 442
    nop

    .line 443
    nop

    .line 439
    const/4 v3, 0x0

    const-string v4, "SSL/TLS \u6821\u9a8c\u5931\u8d25"

    invoke-virtual {v1, v3, v2, v4, v3}, Lcom/stshell/app/PageState;->copy(ZLjava/lang/String;Ljava/lang/String;I)Lcom/stshell/app/PageState;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stshell/app/MainActivityKt;->access$StWebViewScreen$lambda$27(Landroidx/compose/runtime/MutableState;Lcom/stshell/app/PageState;)V

    .line 445
    return-void
.end method
