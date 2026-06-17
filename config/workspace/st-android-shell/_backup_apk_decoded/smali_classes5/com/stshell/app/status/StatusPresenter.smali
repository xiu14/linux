.class public interface abstract Lcom/stshell/app/status/StatusPresenter;
.super Ljava/lang/Object;
.source "StatusPresenter.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0008H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u000bH&J\u0018\u0010\u000c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\rH&\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/stshell/app/status/StatusPresenter;",
        "",
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


# virtual methods
.method public abstract onBridgeReady(Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;)V
.end method

.method public abstract onGenerationCompleted(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Ended;)V
.end method

.method public abstract onGenerationHeartbeat(Lcom/stshell/app/status/GenerationSession;)V
.end method

.method public abstract onGenerationStarted(Lcom/stshell/app/status/GenerationSession;)V
.end method

.method public abstract onGenerationStopped(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Stopped;)V
.end method
