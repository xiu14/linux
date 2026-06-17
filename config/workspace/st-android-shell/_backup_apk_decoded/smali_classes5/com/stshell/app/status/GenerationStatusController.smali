.class public final Lcom/stshell/app/status/GenerationStatusController;
.super Ljava/lang/Object;
.source "GenerationStatusController.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationStatusController;",
        "",
        "presenter",
        "Lcom/stshell/app/status/StatusPresenter;",
        "<init>",
        "(Lcom/stshell/app/status/StatusPresenter;)V",
        "activeSession",
        "Lcom/stshell/app/status/GenerationSession;",
        "handle",
        "",
        "event",
        "Lcom/stshell/app/status/GenerationStatusEvent;",
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
.field private activeSession:Lcom/stshell/app/status/GenerationSession;

.field private final presenter:Lcom/stshell/app/status/StatusPresenter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/stshell/app/status/GenerationStatusController;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/stshell/app/status/StatusPresenter;)V
    .locals 1
    .param p1, "presenter"    # Lcom/stshell/app/status/StatusPresenter;

    const-string v0, "presenter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lcom/stshell/app/status/GenerationStatusController;->presenter:Lcom/stshell/app/status/StatusPresenter;

    .line 12
    return-void
.end method


# virtual methods
.method public final handle(Lcom/stshell/app/status/GenerationStatusEvent;)V
    .locals 14
    .param p1, "event"    # Lcom/stshell/app/status/GenerationStatusEvent;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    nop

    .line 19
    instance-of v0, p1, Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusController;->presenter:Lcom/stshell/app/status/StatusPresenter;

    move-object v1, p1

    check-cast v1, Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;

    invoke-interface {v0, v1}, Lcom/stshell/app/status/StatusPresenter;->onBridgeReady(Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;)V

    goto/16 :goto_1

    .line 20
    :cond_0
    instance-of v0, p1, Lcom/stshell/app/status/GenerationStatusEvent$Started;

    if-eqz v0, :cond_1

    .line 21
    new-instance v1, Lcom/stshell/app/status/GenerationSession;

    .line 22
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Started;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Started;->getAt()J

    move-result-wide v2

    .line 23
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Started;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Started;->getHref()Ljava/lang/String;

    move-result-object v4

    .line 24
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Started;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Started;->getType()Ljava/lang/String;

    move-result-object v5

    .line 21
    const/16 v10, 0x38

    const/4 v11, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/stshell/app/status/GenerationSession;-><init>(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 26
    .local v1, "session":Lcom/stshell/app/status/GenerationSession;
    iput-object v1, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    .line 27
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusController;->presenter:Lcom/stshell/app/status/StatusPresenter;

    invoke-interface {v0, v1}, Lcom/stshell/app/status/StatusPresenter;->onGenerationStarted(Lcom/stshell/app/status/GenerationSession;)V

    .end local v1    # "session":Lcom/stshell/app/status/GenerationSession;
    goto/16 :goto_1

    .line 30
    :cond_1
    instance-of v0, p1, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    if-eqz v0, :cond_5

    .line 31
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    if-nez v0, :cond_2

    return-void

    :cond_2
    move-object v1, v0

    .line 32
    .local v1, "current":Lcom/stshell/app/status/GenerationSession;
    nop

    .line 33
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->getAt()J

    move-result-wide v6

    .line 34
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->getPreview()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Lcom/stshell/app/status/GenerationSession;->getLastPreview()Ljava/lang/String;

    move-result-object v0

    :cond_3
    move-object v8, v0

    .line 35
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Streaming;->getLength()Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual {v1}, Lcom/stshell/app/status/GenerationSession;->getOutputLength()Ljava/lang/Integer;

    move-result-object v0

    :cond_4
    move-object v9, v0

    .line 32
    const/4 v10, 0x7

    const/4 v11, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v11}, Lcom/stshell/app/status/GenerationSession;->copy$default(Lcom/stshell/app/status/GenerationSession;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stshell/app/status/GenerationSession;

    move-result-object v0

    .line 37
    .local v0, "updated":Lcom/stshell/app/status/GenerationSession;
    iput-object v0, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    .line 38
    iget-object v2, p0, Lcom/stshell/app/status/GenerationStatusController;->presenter:Lcom/stshell/app/status/StatusPresenter;

    invoke-interface {v2, v0}, Lcom/stshell/app/status/StatusPresenter;->onGenerationHeartbeat(Lcom/stshell/app/status/GenerationSession;)V

    .end local v0    # "updated":Lcom/stshell/app/status/GenerationSession;
    .end local v1    # "current":Lcom/stshell/app/status/GenerationSession;
    goto :goto_1

    .line 41
    :cond_5
    instance-of v0, p1, Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    .line 42
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    if-nez v0, :cond_6

    new-instance v2, Lcom/stshell/app/status/GenerationSession;

    .line 43
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Ended;->getAt()J

    move-result-wide v3

    .line 44
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Ended;->getHref()Ljava/lang/String;

    move-result-object v5

    .line 45
    nop

    .line 42
    const/16 v11, 0x38

    const/4 v12, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/stshell/app/status/GenerationSession;-><init>(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v2

    goto :goto_0

    :cond_6
    move-object v3, v0

    .line 46
    :goto_0
    move-object v0, p1

    check-cast v0, Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    invoke-virtual {v0}, Lcom/stshell/app/status/GenerationStatusEvent$Ended;->getAt()J

    move-result-wide v8

    const/16 v12, 0x37

    const/4 v13, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v3 .. v13}, Lcom/stshell/app/status/GenerationSession;->copy$default(Lcom/stshell/app/status/GenerationSession;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;ILjava/lang/Object;)Lcom/stshell/app/status/GenerationSession;

    move-result-object v0

    .line 42
    nop

    .line 47
    .local v0, "session":Lcom/stshell/app/status/GenerationSession;
    iput-object v1, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    .line 48
    iget-object v1, p0, Lcom/stshell/app/status/GenerationStatusController;->presenter:Lcom/stshell/app/status/StatusPresenter;

    move-object v2, p1

    check-cast v2, Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    invoke-interface {v1, v0, v2}, Lcom/stshell/app/status/StatusPresenter;->onGenerationCompleted(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Ended;)V

    .end local v0    # "session":Lcom/stshell/app/status/GenerationSession;
    goto :goto_1

    .line 51
    :cond_7
    instance-of v0, p1, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    if-eqz v0, :cond_9

    .line 52
    iget-object v0, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    if-nez v0, :cond_8

    return-void

    .line 53
    .restart local v0    # "session":Lcom/stshell/app/status/GenerationSession;
    :cond_8
    iput-object v1, p0, Lcom/stshell/app/status/GenerationStatusController;->activeSession:Lcom/stshell/app/status/GenerationSession;

    .line 54
    iget-object v1, p0, Lcom/stshell/app/status/GenerationStatusController;->presenter:Lcom/stshell/app/status/StatusPresenter;

    move-object v2, p1

    check-cast v2, Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    invoke-interface {v1, v0, v2}, Lcom/stshell/app/status/StatusPresenter;->onGenerationStopped(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Stopped;)V

    .line 57
    .end local v0    # "session":Lcom/stshell/app/status/GenerationSession;
    :goto_1
    return-void

    .line 18
    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
