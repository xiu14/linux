.class public final Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;
.super Ljava/lang/Object;
.source "GenerationLiveUpdateService.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stshell/app/status/GenerationLiveUpdateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005J \u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;",
        "",
        "<init>",
        "()V",
        "ACTION_START",
        "",
        "ACTION_HEARTBEAT",
        "ACTION_COMPLETE",
        "ACTION_STOP",
        "EXTRA_TEXT",
        "LIVE_CHANNEL_ID",
        "FALLBACK_CHANNEL_ID",
        "LIVE_NOTIFICATION_ID",
        "",
        "DEFAULT_DISMISS_DELAY_MS",
        "",
        "COMPLETED_DISPLAY_MS",
        "DISMISS_PROPAGATION_MS",
        "STOP_TOKEN",
        "start",
        "",
        "context",
        "Landroid/content/Context;",
        "text",
        "heartbeat",
        "complete",
        "stop",
        "startService",
        "action",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 290
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;-><init>()V

    return-void
.end method

.method private final startService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "action"    # Ljava/lang/String;
    .param p3, "text"    # Ljava/lang/String;

    .line 321
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/stshell/app/status/GenerationLiveUpdateService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v0

    .local v1, "$this$startService_u24lambda_u240\\1":Landroid/content/Intent;
    const/4 v2, 0x0

    .line 322
    .local v2, "$i$a$-apply-GenerationLiveUpdateService$Companion$startService$intent$1\\1\\321\\0":I
    invoke-virtual {v1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 323
    const-string v3, "extra_text"

    invoke-virtual {v1, v3, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 324
    nop

    .line 321
    .end local v1    # "$this$startService_u24lambda_u240\\1":Landroid/content/Intent;
    .end local v2    # "$i$a$-apply-GenerationLiveUpdateService$Companion$startService$intent$1\\1\\321\\0":I
    nop

    .line 325
    .local v0, "intent":Landroid/content/Intent;
    invoke-static {p1, v0}, Landroidx/core/content/ContextCompat;->startForegroundService(Landroid/content/Context;Landroid/content/Intent;)V

    .line 326
    return-void
.end method


# virtual methods
.method public final complete(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "text"    # Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 313
    const-string v0, "com.stshell.app.action.LIVE_COMPLETE"

    invoke-direct {p0, p1, v0, p2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->startService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    return-void
.end method

.method public final heartbeat(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "text"    # Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 309
    const-string v0, "com.stshell.app.action.LIVE_HEARTBEAT"

    invoke-direct {p0, p1, v0, p2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->startService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    return-void
.end method

.method public final start(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "text"    # Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 305
    const-string v0, "com.stshell.app.action.LIVE_START"

    invoke-direct {p0, p1, v0, p2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->startService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    return-void
.end method

.method public final stop(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "text"    # Ljava/lang/String;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 317
    const-string v0, "com.stshell.app.action.LIVE_STOP"

    invoke-direct {p0, p1, v0, p2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->startService(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 318
    return-void
.end method
