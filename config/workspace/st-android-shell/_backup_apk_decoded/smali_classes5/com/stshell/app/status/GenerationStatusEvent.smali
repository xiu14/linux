.class public interface abstract Lcom/stshell/app/status/GenerationStatusEvent;
.super Ljava/lang/Object;
.source "GenerationStatusEvent.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;,
        Lcom/stshell/app/status/GenerationStatusEvent$Companion;,
        Lcom/stshell/app/status/GenerationStatusEvent$Ended;,
        Lcom/stshell/app/status/GenerationStatusEvent$Started;,
        Lcom/stshell/app/status/GenerationStatusEvent$Stopped;,
        Lcom/stshell/app/status/GenerationStatusEvent$Streaming;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u0000 \u00072\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\u0008\t\n\u000b\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/stshell/app/status/GenerationStatusEvent;",
        "",
        "BridgeReady",
        "Started",
        "Streaming",
        "Ended",
        "Stopped",
        "Companion",
        "Lcom/stshell/app/status/GenerationStatusEvent$BridgeReady;",
        "Lcom/stshell/app/status/GenerationStatusEvent$Ended;",
        "Lcom/stshell/app/status/GenerationStatusEvent$Started;",
        "Lcom/stshell/app/status/GenerationStatusEvent$Stopped;",
        "Lcom/stshell/app/status/GenerationStatusEvent$Streaming;",
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
.field public static final Companion:Lcom/stshell/app/status/GenerationStatusEvent$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/stshell/app/status/GenerationStatusEvent$Companion;->$$INSTANCE:Lcom/stshell/app/status/GenerationStatusEvent$Companion;

    sput-object v0, Lcom/stshell/app/status/GenerationStatusEvent;->Companion:Lcom/stshell/app/status/GenerationStatusEvent$Companion;

    return-void
.end method
