.class public final Lcom/stshell/app/status/NotificationStatusPresenter;
.super Ljava/lang/Object;
.source "NotificationStatusPresenter.kt"

# interfaces
.implements Lcom/stshell/app/status/StatusPresenter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stshell/app/status/NotificationStatusPresenter;",
        "Lcom/stshell/app/status/StatusPresenter;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "onBridgeReady",
        "",
        "event",
        "Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;",
        "onGenerationStarted",
        "session",
        "Lcom/stshell/app/status/GenerationSession;",
        "onGenerationHeartbeat",
        "onGenerationCompleted",
        "Lcom/stshell/app/status/GenerationStatusEvent$Ended;",
        "onGenerationStopped",
        "Lcom/stshell/app/status/GenerationStatusEvent$Stopped;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/stshell/app/status/NotificationStatusPresenter;->$stable:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/stshell/app/status/NotificationStatusPresenter;->context:Landroid/content/Context;

    .line 5
    return-void
.end method


# virtual methods
.method public onBridgeReady(Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;)V
    .locals 1
    .param p1, "event"    # Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    return-void
.end method

.method public onGenerationCompleted(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Ended;)V
    .locals 3
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;
    .param p2, "event"    # Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    sget-object v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->Companion:Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

    iget-object v1, p0, Lcom/stshell/app/status/NotificationStatusPresenter;->context:Landroid/content/Context;

    const-string v2, "\u5df2\u5b8c\u6210"

    invoke-virtual {v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->complete(Landroid/content/Context;Ljava/lang/String;)V

    .line 23
    return-void
.end method

.method public onGenerationHeartbeat(Lcom/stshell/app/status/GenerationSession;)V
    .locals 3
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    sget-object v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->Companion:Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

    iget-object v1, p0, Lcom/stshell/app/status/NotificationStatusPresenter;->context:Landroid/content/Context;

    const-string v2, "\u751f\u6210\u4e2d"

    invoke-virtual {v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->heartbeat(Landroid/content/Context;Ljava/lang/String;)V

    .line 16
    return-void
.end method

.method public onGenerationStarted(Lcom/stshell/app/status/GenerationSession;)V
    .locals 3
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    sget-object v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->Companion:Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

    iget-object v1, p0, Lcom/stshell/app/status/NotificationStatusPresenter;->context:Landroid/content/Context;

    const-string v2, "\u751f\u6210\u4e2d"

    invoke-virtual {v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->start(Landroid/content/Context;Ljava/lang/String;)V

    .line 12
    return-void
.end method

.method public onGenerationStopped(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Stopped;)V
    .locals 3
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;
    .param p2, "event"    # Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    sget-object v0, Lcom/stshell/app/status/GenerationLiveUpdateService;->Companion:Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;

    iget-object v1, p0, Lcom/stshell/app/status/NotificationStatusPresenter;->context:Landroid/content/Context;

    const-string v2, "\u5df2\u4e2d\u65ad"

    invoke-virtual {v0, v1, v2}, Lcom/stshell/app/status/GenerationLiveUpdateService$Companion;->stop(Landroid/content/Context;Ljava/lang/String;)V

    .line 30
    return-void
.end method
