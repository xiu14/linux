.class public final Lcom/stshell/app/status/CompositeStatusPresenter;
.super Ljava/lang/Object;
.source "StatusPresenter.kt"

# interfaces
.implements Lcom/stshell/app/status/StatusPresenter;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nStatusPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatusPresenter.kt\ncom/stshell/app/status/CompositeStatusPresenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1863#2,2:45\n1863#2,2:47\n1863#2,2:49\n1863#2,2:51\n1863#2,2:53\n*S KotlinDebug\n*F\n+ 1 StatusPresenter.kt\ncom/stshell/app/status/CompositeStatusPresenter\n*L\n25#1:45,2\n29#1:47,2\n33#1:49,2\n37#1:51,2\n41#1:53,2\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0016J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\u0008\u001a\u00020\u0011H\u0016R\u0014\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/stshell/app/status/CompositeStatusPresenter;",
        "Lcom/stshell/app/status/StatusPresenter;",
        "presenters",
        "",
        "<init>",
        "(Ljava/util/List;)V",
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
.field private final presenters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stshell/app/status/StatusPresenter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    sput v0, Lcom/stshell/app/status/CompositeStatusPresenter;->$stable:I

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1, "presenters"    # Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stshell/app/status/StatusPresenter;",
            ">;)V"
        }
    .end annotation

    const-string v0, "presenters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stshell/app/status/CompositeStatusPresenter;->presenters:Ljava/util/List;

    .line 21
    return-void
.end method


# virtual methods
.method public onBridgeReady(Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;)V
    .locals 6
    .param p1, "event"    # Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/stshell/app/status/CompositeStatusPresenter;->presenters:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 45
    .local v1, "$i$f$forEach\\1\\25":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/stshell/app/status/StatusPresenter;

    .local v4, "it\\2":Lcom/stshell/app/status/StatusPresenter;
    const/4 v5, 0x0

    .line 25
    .local v5, "$i$a$-forEach-CompositeStatusPresenter$onBridgeReady$1\\2\\45\\0":I
    invoke-interface {v4, p1}, Lcom/stshell/app/status/StatusPresenter;->onBridgeReady(Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;)V

    .line 45
    .end local v4    # "it\\2":Lcom/stshell/app/status/StatusPresenter;
    .end local v5    # "$i$a$-forEach-CompositeStatusPresenter$onBridgeReady$1\\2\\45\\0":I
    nop

    .end local v3    # "element\\1":Ljava/lang/Object;
    goto :goto_0

    .line 46
    :cond_0
    nop

    .line 26
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\1\\25":I
    return-void
.end method

.method public onGenerationCompleted(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Ended;)V
    .locals 6
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;
    .param p2, "event"    # Lcom/stshell/app/status/GenerationStatusEvent$Ended;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    iget-object v0, p0, Lcom/stshell/app/status/CompositeStatusPresenter;->presenters:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 51
    .local v1, "$i$f$forEach\\1\\37":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/stshell/app/status/StatusPresenter;

    .local v4, "it\\2":Lcom/stshell/app/status/StatusPresenter;
    const/4 v5, 0x0

    .line 37
    .local v5, "$i$a$-forEach-CompositeStatusPresenter$onGenerationCompleted$1\\2\\51\\0":I
    invoke-interface {v4, p1, p2}, Lcom/stshell/app/status/StatusPresenter;->onGenerationCompleted(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Ended;)V

    .line 51
    .end local v4    # "it\\2":Lcom/stshell/app/status/StatusPresenter;
    .end local v5    # "$i$a$-forEach-CompositeStatusPresenter$onGenerationCompleted$1\\2\\51\\0":I
    nop

    .end local v3    # "element\\1":Ljava/lang/Object;
    goto :goto_0

    .line 52
    :cond_0
    nop

    .line 38
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\1\\37":I
    return-void
.end method

.method public onGenerationHeartbeat(Lcom/stshell/app/status/GenerationSession;)V
    .locals 6
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    iget-object v0, p0, Lcom/stshell/app/status/CompositeStatusPresenter;->presenters:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 49
    .local v1, "$i$f$forEach\\1\\33":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/stshell/app/status/StatusPresenter;

    .local v4, "it\\2":Lcom/stshell/app/status/StatusPresenter;
    const/4 v5, 0x0

    .line 33
    .local v5, "$i$a$-forEach-CompositeStatusPresenter$onGenerationHeartbeat$1\\2\\49\\0":I
    invoke-interface {v4, p1}, Lcom/stshell/app/status/StatusPresenter;->onGenerationHeartbeat(Lcom/stshell/app/status/GenerationSession;)V

    .line 49
    .end local v4    # "it\\2":Lcom/stshell/app/status/StatusPresenter;
    .end local v5    # "$i$a$-forEach-CompositeStatusPresenter$onGenerationHeartbeat$1\\2\\49\\0":I
    nop

    .end local v3    # "element\\1":Ljava/lang/Object;
    goto :goto_0

    .line 50
    :cond_0
    nop

    .line 34
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\1\\33":I
    return-void
.end method

.method public onGenerationStarted(Lcom/stshell/app/status/GenerationSession;)V
    .locals 6
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    iget-object v0, p0, Lcom/stshell/app/status/CompositeStatusPresenter;->presenters:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 47
    .local v1, "$i$f$forEach\\1\\29":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/stshell/app/status/StatusPresenter;

    .local v4, "it\\2":Lcom/stshell/app/status/StatusPresenter;
    const/4 v5, 0x0

    .line 29
    .local v5, "$i$a$-forEach-CompositeStatusPresenter$onGenerationStarted$1\\2\\47\\0":I
    invoke-interface {v4, p1}, Lcom/stshell/app/status/StatusPresenter;->onGenerationStarted(Lcom/stshell/app/status/GenerationSession;)V

    .line 47
    .end local v4    # "it\\2":Lcom/stshell/app/status/StatusPresenter;
    .end local v5    # "$i$a$-forEach-CompositeStatusPresenter$onGenerationStarted$1\\2\\47\\0":I
    nop

    .end local v3    # "element\\1":Ljava/lang/Object;
    goto :goto_0

    .line 48
    :cond_0
    nop

    .line 30
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\1\\29":I
    return-void
.end method

.method public onGenerationStopped(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Stopped;)V
    .locals 6
    .param p1, "session"    # Lcom/stshell/app/status/GenerationSession;
    .param p2, "event"    # Lcom/stshell/app/status/GenerationStatusEvent$Stopped;

    const-string v0, "session"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    iget-object v0, p0, Lcom/stshell/app/status/CompositeStatusPresenter;->presenters:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .local v0, "$this$forEach\\1":Ljava/lang/Iterable;
    const/4 v1, 0x0

    .line 53
    .local v1, "$i$f$forEach\\1\\41":I
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .local v3, "element\\1":Ljava/lang/Object;
    move-object v4, v3

    check-cast v4, Lcom/stshell/app/status/StatusPresenter;

    .local v4, "it\\2":Lcom/stshell/app/status/StatusPresenter;
    const/4 v5, 0x0

    .line 41
    .local v5, "$i$a$-forEach-CompositeStatusPresenter$onGenerationStopped$1\\2\\53\\0":I
    invoke-interface {v4, p1, p2}, Lcom/stshell/app/status/StatusPresenter;->onGenerationStopped(Lcom/stshell/app/status/GenerationSession;Lcom/stshell/app/status/GenerationStatusEvent$Stopped;)V

    .line 53
    .end local v4    # "it\\2":Lcom/stshell/app/status/StatusPresenter;
    .end local v5    # "$i$a$-forEach-CompositeStatusPresenter$onGenerationStopped$1\\2\\53\\0":I
    nop

    .end local v3    # "element\\1":Ljava/lang/Object;
    goto :goto_0

    .line 54
    :cond_0
    nop

    .line 42
    .end local v0    # "$this$forEach\\1":Ljava/lang/Iterable;
    .end local v1    # "$i$f$forEach\\1\\41":I
    return-void
.end method
